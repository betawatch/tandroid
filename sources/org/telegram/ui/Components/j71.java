package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class j71 implements j3.y1, i5.t, k3.b, NotificationCenter.NotificationCenterDelegate {
    public static int g0;
    public static final HashSet h0 = new HashSet();
    public static HashMap i0;
    public boolean B;
    public Uri C;
    public boolean D;
    public boolean E;
    public boolean F;
    public g71 G;
    public c71 H;
    public int I;
    public boolean J;
    public ArrayList K;
    public f71 L;
    public ArrayList M;
    public Uri N;
    public Uri O;
    public String P;
    public String Q;
    public boolean R;
    public boolean S;
    public final boolean T;
    public DashMediaSource$Factory U;
    public HlsMediaSource$Factory V;
    public a4.k W;
    public final Handler X;
    public final boolean Y;
    public boolean Z;
    public final int a;
    public int a0;
    public DispatchQueue b;
    public boolean b0;
    public boolean c;
    public long c0;
    public j3.f0 d;
    public long d0;
    public j3.i2 e;
    public org.telegram.ui.tq0 e0;
    public final f5.p f;
    public final ArrayList f0;
    public final ExtendedDefaultDataSourceFactory h;
    public TextureView n;
    public SurfaceView r;
    public Surface s;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    public j71() {
        this(true, false);
    }

    public static void I(MessageObject messageObject, boolean z4) {
        if (messageObject == null) {
            return;
        }
        ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z4).apply();
    }

    public static void J(f71 f71Var, MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (f71Var == null) {
            edit.remove(dialogId + "_" + id2 + "q2");
        } else {
            String str = dialogId + "_" + id2 + "q2";
            StringBuilder sb = new StringBuilder();
            sb.append(f71Var.b);
            sb.append("x");
            sb.append(f71Var.c);
            sb.append(f71Var.a ? "s" : "");
            edit.putString(str, sb.toString());
        }
        edit.apply();
    }

    public static boolean Y(String str) {
        String concat;
        if (str == null) {
            concat = null;
        } else {
            switch (str) {
                case "av1":
                case "av01":
                    concat = "video/av01";
                    break;
                case "avc":
                case "h264":
                    concat = MediaController.VIDEO_MIME_TYPE;
                    break;
                case "vp8":
                    concat = "video/x-vnd.on2.vp8";
                    break;
                case "vp9":
                    concat = "video/x-vnd.on2.vp9";
                    break;
                case "h265":
                case "hevc":
                    concat = "video/hevc";
                    break;
                default:
                    try {
                        concat = "video/".concat(str);
                        break;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return false;
                    }
            }
        }
        if (concat != null) {
            if (i0 == null) {
                i0 = new HashMap();
            }
            Boolean bool = (Boolean) i0.get(concat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!MessagesController.getGlobalMainSettings().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i10 = 0; i10 < codecCount; i10++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                    if (!codecInfoAt.isEncoder() && d4.y.h(codecInfoAt, concat)) {
                        for (String str2 : codecInfoAt.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(concat)) {
                                i0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                    }
                }
                i0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static h71 k(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((f71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                h71 h71Var = (h71) obj2;
                if (h71Var.b()) {
                    return h71Var;
                }
            }
        }
        return null;
    }

    public static ArrayList s(int i10, TLRPC.Document document, ArrayList arrayList, int i11, boolean z4) {
        f71 f71Var;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!MessagesController.getInstance(i10).videoIgnoreAltDocuments && arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        LongSparseArray longSparseArray = new LongSparseArray();
        int i12 = 0;
        while (i12 < arrayList2.size()) {
            TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i12);
            if ("application/x-mpegurl".equalsIgnoreCase(document2.mime_type) && (str = document2.file_name_fixed) != null && str.startsWith("mtproto")) {
                try {
                    longSparseArray.put(Long.parseLong(document2.file_name_fixed.substring(7)), document2);
                    arrayList2.remove(i12);
                    i12--;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            i12++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i13);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    h71 d = h71.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.id), i11, z4);
                    if (d.i > 0 && d.j > 0) {
                        if (document3 == document) {
                            d.b = true;
                        }
                        arrayList3.add(d);
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
            h71 h71Var = (h71) arrayList3.get(i14);
            String str2 = h71Var.m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(h71Var.m) && !"hevc".equals(h71Var.m) && !"h265".equals(h71Var.m) && !"vp9".equals(h71Var.m)) || Y(h71Var.m))) {
                arrayList4.add(h71Var);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4.isEmpty()) {
            arrayList5.addAll(arrayList3);
        } else {
            arrayList5.addAll(arrayList4);
        }
        ArrayList arrayList6 = new ArrayList();
        int size = arrayList5.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList5.get(i15);
            i15++;
            h71 h71Var2 = (h71) obj;
            if (h71Var2.b) {
                arrayList6.add(new f71(h71Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size2) {
                        f71Var = null;
                        break;
                    }
                    Object obj2 = arrayList6.get(i16);
                    i16++;
                    f71Var = (f71) obj2;
                    if (!f71Var.a && f71Var.b == h71Var2.i && f71Var.c == h71Var2.j) {
                        break;
                    }
                }
                if (f71Var == null || SharedConfig.debugVideoQualities) {
                    arrayList6.add(new f71(h71Var2));
                } else {
                    f71Var.d.add(h71Var2);
                }
            }
        }
        return arrayList6;
    }

    public static h71 v(ArrayList arrayList) {
        int i10;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ArrayList arrayList2 = ((f71) obj).d;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                h71 h71Var = (h71) obj2;
                if (h71Var.b && h71Var.b()) {
                    return h71Var;
                }
            }
        }
        int size3 = arrayList.size();
        h71 h71Var2 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            ArrayList arrayList3 = ((f71) obj3).d;
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                h71 h71Var3 = (h71) obj4;
                if (!h71Var3.b && Y(h71Var3.m) && (h71Var2 == null || (i10 = h71Var3.i * h71Var3.j) > (i11 = h71Var2.i * h71Var2.j) || (i10 == i11 && h71Var3.l < h71Var2.l))) {
                    h71Var2 = h71Var3;
                }
            }
        }
        if (h71Var2 == null) {
            int size5 = arrayList.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList.get(i16);
                i16++;
                ArrayList arrayList4 = ((f71) obj5).d;
                int size6 = arrayList4.size();
                int i17 = 0;
                while (i17 < size6) {
                    Object obj6 = arrayList4.get(i17);
                    i17++;
                    h71 h71Var4 = (h71) obj6;
                    if (h71Var2 == null || h71Var2.i * h71Var2.j > h71Var4.i * h71Var4.j || h71Var4.l < h71Var2.l) {
                        h71Var2 = h71Var4;
                    }
                }
            }
        }
        return h71Var2;
    }

    public static h71 w(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((f71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                h71 h71Var = (h71) obj2;
                if (h71Var.b()) {
                    return h71Var;
                }
            }
        }
        int size3 = arrayList.size();
        h71 h71Var2 = null;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ArrayList arrayList3 = ((f71) obj3).d;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                h71 h71Var3 = (h71) obj4;
                if (!h71Var3.b && (h71Var2 == null || h71Var2.i * h71Var2.j > h71Var3.i * h71Var3.j || h71Var3.l < h71Var2.l)) {
                    if (h71Var3.i <= 900 && h71Var3.j <= 900) {
                        h71Var2 = h71Var3;
                    }
                }
            }
        }
        if (h71Var2 == null) {
            int size5 = arrayList.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj5 = arrayList.get(i14);
                i14++;
                ArrayList arrayList4 = ((f71) obj5).d;
                int size6 = arrayList4.size();
                int i15 = 0;
                while (i15 < size6) {
                    Object obj6 = arrayList4.get(i15);
                    i15++;
                    h71 h71Var4 = (h71) obj6;
                    if (h71Var2 == null || h71Var2.i * h71Var2.j > h71Var4.i * h71Var4.j || h71Var4.l < h71Var2.l) {
                        h71Var2 = h71Var4;
                    }
                }
            }
        }
        return h71Var2;
    }

    public final o4.a A(Uri uri, String str, long j10) {
        o3.o oVar;
        j3.y0 y0Var;
        o3.o oVar2;
        ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        j3.s0 s0Var = new j3.s0();
        j3.v0 v0Var = new j3.v0();
        List list = Collections.EMPTY_LIST;
        s8.i0 i0Var = s8.i0.e;
        j3.z0 z0Var = j3.z0.c;
        h5.a.i(v0Var.b == null || v0Var.a != null);
        if (uri != null) {
            j3.w0 w0Var = v0Var.a != null ? new j3.w0(v0Var) : null;
            oVar = null;
            y0Var = new j3.y0(uri, null, w0Var, null, list, null, i0Var, null);
        } else {
            oVar = null;
            y0Var = null;
        }
        j3.c1 c1Var = new j3.c1("", new j3.u0(s0Var), y0Var, new j3.x0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), j3.e1.V, z0Var);
        if (j10 != 0) {
            f3.e eVar = new f3.e(this, j10, 6);
            mh.m5 m5Var = new mh.m5(new r3.i(), 5);
            Object obj = new Object();
            ab.a aVar = new ab.a(7);
            y0Var.getClass();
            c1Var.b.getClass();
            j3.w0 w0Var2 = c1Var.b.c;
            if (w0Var2 == null || h5.d0.a < 18) {
                oVar2 = o3.o.k;
            } else {
                synchronized (obj) {
                    try {
                        oVar2 = !w0Var2.equals(oVar) ? l7.w0.l(w0Var2) : oVar;
                        oVar2.getClass();
                    } finally {
                    }
                }
            }
            return new o4.f0(c1Var, eVar, m5Var, oVar2, aVar, 1048576);
        }
        str.getClass();
        if (str.equals("hls")) {
            if (this.V == null) {
                this.V = new HlsMediaSource$Factory(extendedDefaultDataSourceFactory);
            }
            HlsMediaSource$Factory hlsMediaSource$Factory = this.V;
            oh.h4 h4Var = hlsMediaSource$Factory.a;
            j3.y0 y0Var2 = c1Var.b;
            y0Var2.getClass();
            u4.p pVar = hlsMediaSource$Factory.c;
            List list2 = y0Var2.e;
            if (!list2.isEmpty()) {
                pVar = new q5.c0(10, pVar, list2);
            }
            t4.c cVar = hlsMediaSource$Factory.b;
            z9.d dVar = hlsMediaSource$Factory.e;
            o3.o q10 = hlsMediaSource$Factory.f.q(c1Var);
            ab.a aVar2 = hlsMediaSource$Factory.g;
            hlsMediaSource$Factory.d.getClass();
            return new t4.m(c1Var, h4Var, cVar, dVar, q10, aVar2, new u4.c(h4Var, aVar2, pVar), hlsMediaSource$Factory.j, hlsMediaSource$Factory.h, hlsMediaSource$Factory.i);
        }
        if (!str.equals("dash")) {
            if (this.W == null) {
                this.W = new a4.k(extendedDefaultDataSourceFactory, new r3.i());
            }
            a4.k kVar = this.W;
            kVar.getClass();
            y0Var.getClass();
            return new o4.f0(c1Var, (g5.l) kVar.b, (mh.m5) kVar.c, ((l7.w0) kVar.d).q(c1Var), (ab.a) kVar.e, kVar.a);
        }
        if (this.U == null) {
            this.U = new DashMediaSource$Factory(extendedDefaultDataSourceFactory);
        }
        DashMediaSource$Factory dashMediaSource$Factory = this.U;
        dashMediaSource$Factory.getClass();
        j3.y0 y0Var3 = c1Var.b;
        y0Var3.getClass();
        g5.o0 eVar2 = new s4.e();
        List list3 = y0Var3.e;
        return new r4.g(c1Var, dashMediaSource$Factory.b, !list3.isEmpty() ? new f7.b(29, eVar2, list3) : eVar2, dashMediaSource$Factory.a, dashMediaSource$Factory.d, dashMediaSource$Factory.c.q(c1Var), dashMediaSource$Factory.e, dashMediaSource$Factory.f, dashMediaSource$Factory.g);
    }

    public void B() {
        this.F = false;
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.p(false);
        }
        j3.i2 i2Var = this.e;
        if (i2Var != null) {
            i2Var.p(false);
        }
        if (this.H != null) {
            this.X.removeCallbacksAndMessages(null);
            this.H.onVisualizerUpdate(false, true, null);
        }
    }

    public void C() {
        this.F = true;
        if (!this.x || (this.E && this.D)) {
            j3.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.p(true);
            }
            j3.i2 i2Var = this.e;
            if (i2Var != null) {
                i2Var.p(true);
                return;
            }
            return;
        }
        j3.f0 f0Var2 = this.d;
        if (f0Var2 != null) {
            f0Var2.p(false);
        }
        j3.i2 i2Var2 = this.e;
        if (i2Var2 != null) {
            i2Var2.p(false);
        }
    }

    public final void D(Uri uri, String str) {
        E(uri, str, 0L);
    }

    public final void E(Uri uri, String str, long j10) {
        this.K = null;
        this.L = null;
        this.N = uri;
        this.P = str;
        this.O = null;
        this.Q = null;
        boolean z4 = false;
        this.R = false;
        this.Z = false;
        this.b0 = false;
        this.D = false;
        this.x = false;
        this.C = uri;
        String scheme = uri != null ? uri.getScheme() : null;
        if (scheme != null && !scheme.startsWith("file")) {
            z4 = true;
        }
        this.v = z4;
        i();
        this.d.X(A(uri, str, j10), true);
        this.d.a();
    }

    public final void F(ArrayList arrayList, f71 f71Var) {
        ArrayList arrayList2;
        this.K = arrayList;
        this.L = f71Var;
        this.N = null;
        this.P = "hls";
        this.O = null;
        this.Q = null;
        this.R = false;
        this.Z = false;
        this.D = false;
        this.x = false;
        this.C = null;
        this.v = true;
        i();
        this.b0 = false;
        this.a0 = (f71Var == null || (arrayList2 = this.K) == null) ? -1 : arrayList2.indexOf(f71Var);
        R(true, f71Var);
        if (this.Z) {
            this.a0 = -1;
        }
    }

    public final void G(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        o4.m mVar = null;
        this.K = null;
        this.L = null;
        this.N = uri;
        this.O = uri2;
        this.P = str;
        this.Q = str2;
        this.R = true;
        this.b0 = false;
        this.x = true;
        this.E = false;
        this.D = false;
        i();
        o4.m mVar2 = null;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            o4.m mVar3 = new o4.m(A(uri3, str3, 0L));
            if (i10 == 0) {
                mVar = mVar3;
            } else {
                mVar2 = mVar3;
            }
        }
        this.d.X(mVar, true);
        this.d.a();
        j3.i2 i2Var = this.e;
        i2Var.L();
        i2Var.b.X(mVar2, true);
        this.e.a();
        h0.add(Integer.valueOf(this.a));
    }

    public final void H() {
        h0.remove(Integer.valueOf(this.a));
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.J();
            this.d = null;
        }
        j3.i2 i2Var = this.e;
        if (i2Var != null) {
            i2Var.J();
            this.e = null;
        }
        if (this.T) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    public void K(long j10) {
        L(j10, false);
    }

    public final void L(long j10, boolean z4) {
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.Y(z4 ? j3.h2.d : j3.h2.c);
            j3.f0 f0Var2 = this.d;
            f0Var2.K(f0Var2.x(), 5, j10);
        }
    }

    public final void M(long j10, boolean z4, Runnable runnable) {
        if (this.d != null) {
            if (runnable != null) {
                this.f0.add(runnable);
            }
            this.d.Y(z4 ? j3.h2.d : j3.h2.c);
            j3.f0 f0Var = this.d;
            f0Var.K(f0Var.x(), 5, j10);
        }
    }

    public final void N(boolean z4) {
        if (this.S != z4) {
            this.S = z4;
            j3.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.e(z4 ? 2 : 0);
            }
        }
    }

    public final void O(boolean z4) {
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.d0(z4 ? 0.0f : 1.0f);
        }
        j3.i2 i2Var = this.e;
        if (i2Var != null) {
            i2Var.M(z4 ? 0.0f : 1.0f);
        }
    }

    public void P(boolean z4) {
        this.F = z4;
        if (z4 && this.x && (!this.E || !this.D)) {
            j3.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.p(false);
            }
            j3.i2 i2Var = this.e;
            if (i2Var != null) {
                i2Var.p(false);
                return;
            }
            return;
        }
        this.w = z4;
        j3.f0 f0Var2 = this.d;
        if (f0Var2 != null) {
            f0Var2.p(z4);
        }
        j3.i2 i2Var2 = this.e;
        if (i2Var2 != null) {
            i2Var2.p(z4);
        }
    }

    public void Q(float f10) {
        try {
            j3.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.c(new j3.v1(f10, f10 > 1.0f ? 0.98f : 1.0f));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(boolean z4, f71 f71Var) {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        int i12;
        f5.v vVar;
        int i13;
        f71 f71Var2;
        j3.f0 f0Var = this.d;
        if (f0Var == null) {
            return;
        }
        boolean G = f0Var.G();
        long C = this.d.C();
        if (!z4) {
            this.d0 = C;
            this.c0 = this.d.getDuration();
        }
        this.L = f71Var;
        f5.p pVar = this.f;
        int i14 = 0;
        if (f71Var == null) {
            Uri z12 = z(this.K);
            int i15 = 0;
            while (true) {
                if (i15 >= t()) {
                    f71Var2 = null;
                    break;
                }
                f71 u10 = u(i15);
                if (u10.a) {
                    f71Var2 = u10;
                    break;
                }
                i15++;
            }
            if (f71Var2 != null) {
                ArrayList arrayList = f71Var2.d;
                if (arrayList.size() == 1 && ((h71) arrayList.get(0)).b()) {
                    this.b0 = false;
                    this.Z = true;
                    this.L = f71Var2;
                    this.d.X(A(f71Var2.a().d, "other", 0L), false);
                    i14 = 1;
                    z10 = G;
                }
            }
            if (z12 != null) {
                this.Z = false;
                f5.h e6 = pVar.e();
                e6.getClass();
                f5.g gVar = new f5.g(e6);
                gVar.c();
                pVar.k(new f5.h(gVar));
                if (!this.b0) {
                    this.b0 = true;
                    this.d.X(A(z12, "hls", 0L), false);
                }
                z10 = G;
            } else {
                f71 r10 = r(Boolean.TRUE);
                if (r10 == null) {
                    r10 = r(Boolean.FALSE);
                }
                if (r10 == null || r10.d.isEmpty()) {
                    return;
                }
                this.b0 = false;
                this.L = r10;
                this.Z = r10.a;
                this.d.X(A(r10.a().d, "other", 0L), false);
            }
            i14 = 1;
            z10 = G;
        } else {
            ArrayList arrayList2 = f71Var.d;
            this.Z = false;
            if (arrayList2.isEmpty()) {
                return;
            }
            Uri z13 = arrayList2.size() > 1 ? z(this.K) : null;
            if (z13 == null || arrayList2.size() == 1 || pVar.c == null) {
                z10 = G;
                this.b0 = false;
                this.d.X(A(f71Var.a().d, "other", 0L), false);
                i14 = 1;
            } else {
                if (this.b0) {
                    i10 = 0;
                } else {
                    this.b0 = true;
                    this.d.X(A(z13, "hls", 0L), false);
                    i10 = 1;
                }
                f5.h e10 = pVar.e();
                e10.getClass();
                f5.g gVar2 = new f5.g(e10);
                gVar2.c();
                int size = arrayList2.size();
                int i16 = 0;
                while (i16 < size) {
                    int i17 = i16 + 1;
                    h71 h71Var = (h71) arrayList2.get(i16);
                    try {
                        int indexOf = this.M.indexOf(h71Var);
                        f5.s sVar = pVar.c;
                        int i18 = 0;
                        while (i18 < sVar.a) {
                            o4.t0 t0Var = sVar.c[i18];
                            z11 = G;
                            while (i14 < t0Var.a) {
                                try {
                                    o4.s0 a2 = t0Var.a(i14);
                                    i11 = i10;
                                    i12 = size;
                                    int i19 = 0;
                                    while (i19 < a2.a) {
                                        try {
                                            j3.n0 n0Var = a2.d[i19];
                                            int i20 = i18;
                                            try {
                                                i13 = Integer.parseInt(n0Var.a);
                                            } catch (Exception unused) {
                                                i13 = -1;
                                            }
                                            if (i13 >= 0 && indexOf == i13) {
                                                vVar = new f5.v(a2, i19);
                                                break;
                                            }
                                            int i21 = indexOf;
                                            if (n0Var.H == h71Var.i && n0Var.I == h71Var.j) {
                                                vVar = new f5.v(a2, i19);
                                                break;
                                            } else {
                                                i19++;
                                                i18 = i20;
                                                indexOf = i21;
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            FileLog.e(e);
                                            vVar = null;
                                            if (vVar != null) {
                                            }
                                            i10 = i11;
                                            i16 = i17;
                                            G = z11;
                                            size = i12;
                                            i14 = 0;
                                        }
                                    }
                                    i14++;
                                    i10 = i11;
                                    size = i12;
                                } catch (Exception e12) {
                                    e = e12;
                                    i11 = i10;
                                    i12 = size;
                                    FileLog.e(e);
                                    vVar = null;
                                    if (vVar != null) {
                                    }
                                    i10 = i11;
                                    i16 = i17;
                                    G = z11;
                                    size = i12;
                                    i14 = 0;
                                }
                            }
                            i18++;
                            G = z11;
                            i14 = 0;
                        }
                        z11 = G;
                        i11 = i10;
                        i12 = size;
                    } catch (Exception e13) {
                        e = e13;
                        z11 = G;
                    }
                    vVar = null;
                    if (vVar != null) {
                        gVar2.y.put(vVar.a, vVar);
                    }
                    i10 = i11;
                    i16 = i17;
                    G = z11;
                    size = i12;
                    i14 = 0;
                }
                z10 = G;
                pVar.k(new f5.h(gVar2));
                i14 = i10;
            }
        }
        if (i14 != 0) {
            this.d.a();
            if (!z4) {
                j3.f0 f0Var2 = this.d;
                f0Var2.K(f0Var2.x(), 5, C);
                if (z10) {
                    this.d.p(true);
                }
            }
            org.telegram.ui.tq0 tq0Var = this.e0;
            if (tq0Var != null) {
                AndroidUtilities.runOnUIThread(tq0Var);
            }
            h0.add(Integer.valueOf(this.a));
        }
    }

    public final void S(int i10) {
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.W(new l3.d(0, 0, i10 == 0 ? 2 : 1, 1, 0), false);
        }
        j3.i2 i2Var = this.e;
        if (i2Var != null) {
            l3.d dVar = new l3.d(0, 0, i10 == 0 ? 2 : 1, 1, 0);
            i2Var.L();
            i2Var.b.W(dVar, true);
        }
    }

    public final void T(Surface surface) {
        if (this.s == surface) {
            return;
        }
        this.s = surface;
        j3.f0 f0Var = this.d;
        if (f0Var == null) {
            return;
        }
        f0Var.a0(surface);
    }

    public final void U(SurfaceView surfaceView) {
        if (this.r == surfaceView) {
            return;
        }
        this.r = surfaceView;
        j3.f0 f0Var = this.d;
        if (f0Var == null) {
            return;
        }
        f0Var.b0(surfaceView);
    }

    public final void V(TextureView textureView) {
        if (this.n == textureView) {
            return;
        }
        this.n = textureView;
        j3.f0 f0Var = this.d;
        if (f0Var == null) {
            return;
        }
        f0Var.c0(textureView);
    }

    public final void W(float f10) {
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.d0(f10);
        }
        j3.i2 i2Var = this.e;
        if (i2Var != null) {
            i2Var.M(f10);
        }
    }

    public final void X(DispatchQueue dispatchQueue) {
        this.b = dispatchQueue;
        if (dispatchQueue == null) {
            this.d.i0 = null;
        } else {
            this.d.i0 = new org.telegram.messenger.c1(dispatchQueue);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.playerDidStartPlaying || ((j71) objArr[0]) == this || !y() || this.y) {
            return;
        }
        B();
    }

    @Override // k3.b
    public final void h(k3.a aVar, int i10) {
        if (i10 == 1) {
            g71 g71Var = this.G;
            if (g71Var != null) {
                g71Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.f0;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((Runnable) obj).run();
            }
            arrayList.clear();
        }
    }

    public final void i() {
        g5.q qVar = new g5.q();
        boolean z4 = this.c;
        int i10 = MediaDataController.MAX_STYLE_RUNS_COUNT;
        int i11 = z4 ? MediaDataController.MAX_STYLE_RUNS_COUNT : 100;
        if (!z4) {
            i10 = 5000;
        }
        j3.j.a(i11, 0, "bufferForPlaybackMs", "0");
        j3.j.a(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j3.j.a(50000, i11, "minBufferMs", "bufferForPlaybackMs");
        j3.j.a(50000, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j3.j.a(50000, 50000, "maxBufferMs", "minBufferMs");
        j3.j.a(0, 0, "backBufferDurationMs", "0");
        j3.j jVar = new j3.j(qVar, i11, i10);
        if (this.d == null) {
            j3.l d71Var = this.H != null ? new d71(ApplicationLoader.applicationContext, this) : new j3.l(ApplicationLoader.applicationContext);
            d71Var.c = 2;
            j3.p pVar = new j3.p(ApplicationLoader.applicationContext);
            h5.a.i(!pVar.s);
            pVar.c = new hg.f(d71Var, 8);
            f5.p pVar2 = this.f;
            h5.a.i(!pVar.s);
            pVar2.getClass();
            pVar.e = new hg.f(pVar2, 7);
            h5.a.i(!pVar.s);
            pVar.f = new hg.f(jVar, 6);
            h5.a.i(!pVar.s);
            pVar.s = true;
            j3.f0 f0Var = new j3.f0(pVar, null);
            this.d = f0Var;
            k3.f fVar = f0Var.q;
            fVar.getClass();
            fVar.f.a(this);
            this.d.l.a(this);
            this.d.j0.add(this);
            TextureView textureView = this.n;
            if (textureView != null) {
                this.d.c0(textureView);
            } else {
                Surface surface = this.s;
                if (surface != null) {
                    this.d.a0(surface);
                } else {
                    SurfaceView surfaceView = this.r;
                    if (surfaceView != null) {
                        this.d.b0(surfaceView);
                    }
                }
            }
            this.d.p(this.w);
            this.d.e(this.S ? 2 : 0);
        }
        if (this.x && this.e == null) {
            j3.p pVar3 = new j3.p(ApplicationLoader.applicationContext);
            f5.p pVar4 = this.f;
            h5.a.i(!pVar3.s);
            pVar4.getClass();
            pVar3.e = new hg.f(pVar4, 7);
            h5.a.i(!pVar3.s);
            pVar3.f = new hg.f(jVar, 6);
            h5.a.i(!pVar3.s);
            pVar3.s = true;
            j3.i2 i2Var = new j3.i2(pVar3);
            this.e = i2Var;
            i2Var.n(new b71(this));
            this.e.p(this.w);
        }
    }

    public final long j() {
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            return this.v ? f0Var.s() : f0Var.getDuration();
        }
        return 0L;
    }

    public final bf.h l(String str, String str2, String str3) {
        if (this.K == null) {
            if (this.N == null) {
                return null;
            }
            String k10 = org.telegram.ui.yh.k("/mtproto_", str);
            String queryParameter = this.N.getQueryParameter("mime");
            bf.f fVar = new bf.f(this.N, TextUtils.isEmpty(queryParameter) ? "video/mp4" : queryParameter, k10);
            fVar.e = str2;
            fVar.f = str3;
            return new bf.h(new bf.g(fVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.K;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ArrayList arrayList3 = ((f71) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                h71 h71Var = (h71) obj2;
                StringBuilder sb = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb.append(h71Var.c);
                String sb2 = sb.toString();
                TLRPC.Document document = h71Var.g;
                String str4 = document != null ? document.mime_type : null;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                bf.f fVar2 = new bf.f(h71Var.d, str4, sb2);
                fVar2.e = str2;
                fVar2.f = str3;
                int i12 = h71Var.i;
                int i13 = h71Var.j;
                fVar2.a = i12;
                fVar2.b = i13;
                arrayList.add(new bf.g(fVar2));
                arrayList2 = arrayList4;
            }
        }
        return new bf.h(arrayList);
    }

    public final TLRPC.Document m() {
        ArrayList arrayList;
        j3.f0 f0Var = this.d;
        if (f0Var == null) {
            return null;
        }
        f0Var.j0();
        j3.n0 n0Var = f0Var.N;
        if (n0Var == null || n0Var.w == 0 || (arrayList = this.K) == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((f71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                h71 h71Var = (h71) obj2;
                if (h71Var.c == n0Var.w) {
                    return h71Var.g;
                }
            }
        }
        return null;
    }

    public final long n() {
        long j10 = this.d0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            return f0Var.C();
        }
        return 0L;
    }

    public final int o() {
        if (this.a0 == -1) {
            try {
                if (this.Z) {
                    for (int i10 = 0; i10 < t(); i10++) {
                        if (u(i10).a) {
                            return i10;
                        }
                    }
                }
                j3.f0 f0Var = this.d;
                if (f0Var != null) {
                    f0Var.j0();
                    j3.n0 n0Var = f0Var.N;
                    if (n0Var != null) {
                        for (int i11 = 0; i11 < t(); i11++) {
                            f71 u10 = u(i11);
                            if (!u10.a && n0Var.H == u10.b && n0Var.I == u10.c && n0Var.n == ((int) Math.floor(((h71) u10.d.get(0)).l * 8.0d))) {
                                return i11;
                            }
                        }
                    }
                }
                return -1;
            } catch (Exception e6) {
                FileLog.e(e6);
                return -1;
            }
        }
        return this.a0;
    }

    @Override // j3.y1
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // j3.y1
    public final void onPlayerError(j3.t1 t1Var) {
        AndroidUtilities.runOnUIThread(new q51(2, this, t1Var));
    }

    @Override // j3.y1
    public final void onPlayerStateChanged(boolean z4, int i10) {
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            boolean j10 = f0Var.j();
            int b10 = this.d.b();
            if (this.J != j10 || this.I != b10) {
                this.G.onStateChanged(j10, b10);
                this.J = j10;
                this.I = b10;
            }
        }
        if (z4 && i10 == 3 && !x() && this.T) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.playerDidStartPlaying, this);
        }
        if (!this.D && i10 == 3) {
            this.D = true;
            if (this.E && this.F) {
                C();
            }
        }
        if (i10 != 3) {
            this.X.removeCallbacksAndMessages(null);
            c71 c71Var = this.H;
            if (c71Var != null) {
                c71Var.onVisualizerUpdate(false, true, null);
            }
        }
    }

    @Override // j3.y1
    public final /* synthetic */ void onPositionDiscontinuity(int i10) {
    }

    @Override // k3.b
    public final void onRenderedFirstFrame(k3.a aVar) {
        this.d0 = -9223372036854775807L;
        this.c0 = -9223372036854775807L;
        g71 g71Var = this.G;
        if (g71Var != null) {
            g71Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override // k3.b
    public final void onSeekStarted(k3.a aVar) {
        g71 g71Var = this.G;
        if (g71Var != null) {
            g71Var.onSeekStarted(aVar);
        }
    }

    @Override // j3.y1
    public final void onTracksChanged(j3.q2 q2Var) {
        org.telegram.ui.tq0 tq0Var = this.e0;
        if (tq0Var != null) {
            AndroidUtilities.runOnUIThread(tq0Var);
        }
    }

    @Override // j3.y1
    public final void onVideoSizeChanged(i5.y yVar) {
        if (Objects.equals(yVar, i5.y.e)) {
            return;
        }
        this.G.onVideoSizeChanged(yVar.a, yVar.b, yVar.c, yVar.d);
    }

    public final long p() {
        long j10 = this.c0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            return f0Var.getDuration();
        }
        return 0L;
    }

    public final qh.q6 q(qh.q6 q6Var) {
        if (q6Var == null) {
            q6Var = new qh.q6();
        }
        try {
            j3.f0 f0Var = this.d;
            f0Var.j0();
            MediaFormat mediaFormat = ((d4.r) f0Var.g[0]).X;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    q6Var.b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    q6Var.a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return q6Var;
    }

    public final f71 r(Boolean bool) {
        f71 f71Var = null;
        for (int i10 = 0; i10 < t(); i10++) {
            f71 u10 = u(i10);
            if (u10.a == bool.booleanValue() && (f71Var == null || f71Var.b * f71Var.c < u10.b * u10.c)) {
                f71Var = u10;
            }
        }
        return f71Var;
    }

    public final int t() {
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final f71 u(int i10) {
        ArrayList arrayList = this.K;
        return arrayList == null ? r(Boolean.FALSE) : (i10 < 0 || i10 >= arrayList.size()) ? r(Boolean.FALSE) : (f71) this.K.get(i10);
    }

    public final boolean x() {
        j3.f0 f0Var = this.d;
        if (f0Var == null) {
            return false;
        }
        f0Var.j0();
        return f0Var.Y == 0.0f;
    }

    public final boolean y() {
        if (this.x && this.F) {
            return true;
        }
        j3.f0 f0Var = this.d;
        return f0Var != null && f0Var.j();
    }

    public final Uri z(ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("#EXTM3U\n#EXT-X-VERSION:6\n#EXT-X-INDEPENDENT-SEGMENTS\n\n");
        this.M = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z4 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList3 = ((f71) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                h71 h71Var = (h71) obj2;
                long j10 = h71Var.c;
                Uri uri = h71Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j10, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(h71Var.e, h71Var.f);
                if (h71Var.f != null) {
                    this.M.add(h71Var);
                    StringBuilder sb2 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb2.append((int) Math.floor(h71Var.l * 8.0d));
                    sb2.append(",RESOLUTION=");
                    sb2.append(h71Var.i);
                    sb2.append("x");
                    sb2.append(h71Var.j);
                    String str2 = h71Var.m;
                    if (str2 != null) {
                        switch (str2) {
                            case "av1":
                            case "av01":
                                str = "video/av01";
                                break;
                            case "avc":
                            case "h264":
                                str = MediaController.VIDEO_MIME_TYPE;
                                break;
                            case "vp8":
                                str = "video/x-vnd.on2.vp8";
                                break;
                            case "vp9":
                                str = "video/x-vnd.on2.vp9";
                                break;
                            case "h265":
                            case "hevc":
                                str = "video/hevc";
                                break;
                            default:
                                str = "video/".concat(str2);
                                break;
                        }
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        sb2.append(",MIME=\"");
                        sb2.append(str);
                        sb2.append("\"");
                    }
                    if (h71Var.b() && h71Var.c()) {
                        sb2.append(",CACHED=\"true\"");
                    }
                    sb2.append(",DOCID=\"");
                    sb2.append(h71Var.c);
                    sb2.append("\",ACCOUNT=\"");
                    sb2.append(h71Var.a);
                    sb2.append("\"\n");
                    if (h71Var.c()) {
                        sb2.append(h71Var.f);
                        sb2.append("\n\n");
                    } else {
                        sb2.append("mtproto:");
                        sb2.append(h71Var.e);
                        sb2.append("\n\n");
                    }
                    arrayList2.add(sb2.toString());
                    z4 = true;
                }
            }
        }
        if (!z4) {
            return null;
        }
        Collections.reverse(arrayList2);
        sb.append(TextUtils.join("", arrayList2));
        return Uri.parse("data:application/x-mpegurl;base64," + Base64.encodeToString(sb.toString().getBytes(), 2));
    }

    public j71(boolean z4, boolean z10) {
        int i10 = g0;
        g0 = i10 + 1;
        this.a = i10;
        this.X = new Handler(Looper.getMainLooper());
        this.Z = false;
        this.a0 = -1;
        this.c0 = -9223372036854775807L;
        this.d0 = -9223372036854775807L;
        this.f0 = new ArrayList();
        this.Y = z10;
        this.h = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        f5.p pVar = new f5.p(ApplicationLoader.applicationContext, new db.a(6));
        this.f = pVar;
        if (z10) {
            f5.h e6 = pVar.e();
            e6.getClass();
            f5.g gVar = new f5.g(e6);
            gVar.z.add(1);
            pVar.k(new f5.h(gVar));
        }
        this.I = 1;
        this.T = z4;
        if (z4) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    @Override // j3.y1
    public final /* synthetic */ void onCues(v4.c cVar) {
    }

    @Override // j3.y1
    public final void onPositionDiscontinuity(j3.z1 z1Var, j3.z1 z1Var2, int i10) {
    }

    @Override // j3.y1
    public void onRenderedFirstFrame() {
        this.G.onRenderedFirstFrame();
    }

    @Override // k3.b
    public final /* synthetic */ void b(j3.t1 t1Var) {
    }

    @Override // k3.b
    public final /* synthetic */ void d(n3.f fVar) {
    }

    @Override // k3.b
    public final /* synthetic */ void f(o4.r rVar) {
    }

    @Override // k3.b
    public final /* synthetic */ void g(i5.y yVar) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onAudioAttributesChanged(l3.d dVar) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onAvailableCommandsChanged(j3.w1 w1Var) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onIsLoadingChanged(boolean z4) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onIsPlayingChanged(boolean z4) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onLoadingChanged(boolean z4) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onMediaMetadataChanged(j3.e1 e1Var) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onMetadata(e4.c cVar) {
    }

    @Override // j3.y1
    public final void onPlaybackParametersChanged(j3.v1 v1Var) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPlaybackStateChanged(int i10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPlayerErrorChanged(j3.t1 t1Var) {
    }

    @Override // j3.y1
    public final void onRepeatModeChanged(int i10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z4) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z4) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onVolumeChanged(float f10) {
    }

    @Override // k3.b
    public final /* synthetic */ void a(j3.a2 a2Var, f7.b bVar) {
    }

    @Override // k3.b
    public final /* synthetic */ void c(k3.a aVar, o4.r rVar) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onEvents(j3.a2 a2Var, j3.x1 x1Var) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onMediaItemTransition(j3.c1 c1Var, int i10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z4, int i10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onTimelineChanged(j3.o2 o2Var, int i10) {
    }

    @Override // k3.b
    public final /* synthetic */ void e(k3.a aVar, int i10, long j10) {
    }
}
