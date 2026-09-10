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
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import b2.k0;
import b2.p;
import g2.g;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l2.h;
import l2.i;
import m.e3;
import m2.e;
import n2.n;
import o2.c;
import o2.l;
import og.u0;
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
import org.telegram.ui.js0;
import p2.s;
import rb.a;
import t7.u;
import u2.f0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class t71 implements b2.z0, b2.w1, j2.b, NotificationCenter.NotificationCenterDelegate {
    public static int j0;
    public static final HashSet k0 = new HashSet();
    public static HashMap l0;
    public boolean E;
    public Uri F;
    public boolean G;
    public boolean H;
    public boolean I;
    public q71 J;
    public m71 K;
    public int L;
    public boolean M;
    public ArrayList N;
    public p71 O;
    public ArrayList P;
    public Uri Q;
    public Uri R;
    public String S;
    public String T;
    public boolean U;
    public boolean V;
    public final boolean W;
    public DashMediaSource$Factory X;
    public HlsMediaSource$Factory Y;
    public u2.x0 Z;
    public final int a;
    public final Handler a0;
    public DispatchQueue b;
    public final boolean b0;
    public boolean c;
    public boolean c0;
    public i2.e0 d;
    public int d0;
    public i2.e0 e;
    public boolean e0;
    public final x2.p f;
    public long f0;
    public long g0;
    public final ExtendedDefaultDataSourceFactory h;
    public org.telegram.ui.ir0 h0;
    public final ArrayList i0;
    public TextureView n;
    public SurfaceView r;
    public Surface s;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    public t71() {
        this(true, false);
    }

    public static void I(MessageObject messageObject, boolean z10) {
        if (messageObject == null) {
            return;
        }
        ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z10).apply();
    }

    public static void J(p71 p71Var, MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (p71Var == null) {
            edit.remove(dialogId + "_" + id2 + "q2");
        } else {
            String str = dialogId + "_" + id2 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(p71Var.b);
            sb2.append("x");
            sb2.append(p71Var.c);
            sb2.append(p71Var.a ? "s" : "");
            edit.putString(str, sb2.toString());
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
                    } catch (Exception e) {
                        FileLog.e(e);
                        return false;
                    }
            }
        }
        if (concat != null) {
            if (l0 == null) {
                l0 = new HashMap();
            }
            Boolean bool = (Boolean) l0.get(concat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!MessagesController.getGlobalMainSettings().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i10 = 0; i10 < codecCount; i10++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                    if (!codecInfoAt.isEncoder() && r2.w.h(codecInfoAt, concat)) {
                        for (String str2 : codecInfoAt.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(concat)) {
                                l0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                    }
                }
                l0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static r71 k(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((p71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                r71 r71Var = (r71) obj2;
                if (r71Var.b()) {
                    return r71Var;
                }
            }
        }
        return null;
    }

    public static ArrayList s(int i10, TLRPC.Document document, ArrayList arrayList, int i11, boolean z10) {
        p71 p71Var;
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
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            i12++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i13);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    r71 d = r71.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.id), i11, z10);
                    if (d.i > 0 && d.j > 0) {
                        if (document3 == document) {
                            d.b = true;
                        }
                        arrayList3.add(d);
                    }
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
            r71 r71Var = (r71) arrayList3.get(i14);
            String str2 = r71Var.m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(r71Var.m) && !"hevc".equals(r71Var.m) && !"h265".equals(r71Var.m) && !"vp9".equals(r71Var.m)) || Y(r71Var.m))) {
                arrayList4.add(r71Var);
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
            r71 r71Var2 = (r71) obj;
            if (r71Var2.b) {
                arrayList6.add(new p71(r71Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size2) {
                        p71Var = null;
                        break;
                    }
                    Object obj2 = arrayList6.get(i16);
                    i16++;
                    p71Var = (p71) obj2;
                    if (!p71Var.a && p71Var.b == r71Var2.i && p71Var.c == r71Var2.j) {
                        break;
                    }
                }
                if (p71Var == null || SharedConfig.debugVideoQualities) {
                    arrayList6.add(new p71(r71Var2));
                } else {
                    p71Var.d.add(r71Var2);
                }
            }
        }
        return arrayList6;
    }

    public static r71 v(ArrayList arrayList) {
        int i10;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ArrayList arrayList2 = ((p71) obj).d;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                r71 r71Var = (r71) obj2;
                if (r71Var.b && r71Var.b()) {
                    return r71Var;
                }
            }
        }
        int size3 = arrayList.size();
        r71 r71Var2 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            ArrayList arrayList3 = ((p71) obj3).d;
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                r71 r71Var3 = (r71) obj4;
                if (!r71Var3.b && Y(r71Var3.m) && (r71Var2 == null || (i10 = r71Var3.i * r71Var3.j) > (i11 = r71Var2.i * r71Var2.j) || (i10 == i11 && r71Var3.l < r71Var2.l))) {
                    r71Var2 = r71Var3;
                }
            }
        }
        if (r71Var2 == null) {
            int size5 = arrayList.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList.get(i16);
                i16++;
                ArrayList arrayList4 = ((p71) obj5).d;
                int size6 = arrayList4.size();
                int i17 = 0;
                while (i17 < size6) {
                    Object obj6 = arrayList4.get(i17);
                    i17++;
                    r71 r71Var4 = (r71) obj6;
                    if (r71Var2 == null || r71Var2.i * r71Var2.j > r71Var4.i * r71Var4.j || r71Var4.l < r71Var2.l) {
                        r71Var2 = r71Var4;
                    }
                }
            }
        }
        return r71Var2;
    }

    public static r71 w(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((p71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                r71 r71Var = (r71) obj2;
                if (r71Var.b()) {
                    return r71Var;
                }
            }
        }
        int size3 = arrayList.size();
        r71 r71Var2 = null;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ArrayList arrayList3 = ((p71) obj3).d;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                r71 r71Var3 = (r71) obj4;
                if (!r71Var3.b && (r71Var2 == null || r71Var2.i * r71Var2.j > r71Var3.i * r71Var3.j || r71Var3.l < r71Var2.l)) {
                    if (r71Var3.i <= 900 && r71Var3.j <= 900) {
                        r71Var2 = r71Var3;
                    }
                }
            }
        }
        if (r71Var2 == null) {
            int size5 = arrayList.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj5 = arrayList.get(i14);
                i14++;
                ArrayList arrayList4 = ((p71) obj5).d;
                int size6 = arrayList4.size();
                int i15 = 0;
                while (i15 < size6) {
                    Object obj6 = arrayList4.get(i15);
                    i15++;
                    r71 r71Var4 = (r71) obj6;
                    if (r71Var2 == null || r71Var2.i * r71Var2.j > r71Var4.i * r71Var4.j || r71Var4.l < r71Var2.l) {
                        r71Var2 = r71Var4;
                    }
                }
            }
        }
        return r71Var2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.exoplayer.hls.HlsMediaSource$Factory] */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.media3.exoplayer.dash.DashMediaSource$Factory] */
    public final u2.a A(Uri uri, String str, long j3) {
        ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory;
        b2.d0 d0Var;
        int i10;
        b2.f0 f0Var;
        n2.n x10;
        n2.n nVar;
        ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory2 = this.h;
        b2.y yVar = new b2.y();
        b2.b0 b0Var = new b2.b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.e;
        b2.d0 d0Var2 = new b2.d0();
        b2.g0 g0Var = b2.g0.d;
        e2.d.g(b0Var.b == null || b0Var.a != null);
        if (uri != null) {
            b2.c0 c0Var = b0Var.a != null ? new b2.c0(b0Var) : null;
            extendedDefaultDataSourceFactory = extendedDefaultDataSourceFactory2;
            d0Var = d0Var2;
            i10 = 1;
            f0Var = new b2.f0(uri, null, c0Var, null, list, null, a1Var, -9223372036854775807L);
        } else {
            extendedDefaultDataSourceFactory = extendedDefaultDataSourceFactory2;
            d0Var = d0Var2;
            i10 = 1;
            f0Var = null;
        }
        b2.k0 k0Var = new b2.k0("", new b2.a0(yVar), f0Var, new b2.e0(d0Var), b2.n0.K, g0Var);
        if (j3 == 0) {
            str.getClass();
            if (str.equals("hls")) {
                final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory3 = extendedDefaultDataSourceFactory;
                if (this.Y == null) {
                    this.Y = new u2.f0(extendedDefaultDataSourceFactory3) { // from class: androidx.media3.exoplayer.hls.HlsMediaSource$Factory
                        public final h a;
                        public c b;
                        public a c;
                        public final e3 h = new e3(4);
                        public final u e = new u();
                        public final js0 f = p2.c.E;
                        public final a i = new a(26);
                        public final ob.a g = new ob.a(23);
                        public final int k = 1;
                        public final long l = -9223372036854775807L;
                        public final boolean j = true;
                        public boolean d = true;

                        {
                            this.a = new h(extendedDefaultDataSourceFactory3, 6);
                        }

                        @Override // u2.f0
                        public final f0 b(boolean z10) {
                            this.d = z10;
                            return this;
                        }

                        @Override // u2.f0
                        public final f0 d(a aVar) {
                            this.c = aVar;
                            return this;
                        }

                        @Override // u2.f0
                        /* renamed from: e, reason: merged with bridge method [inline-methods] */
                        public final l a(k0 k0Var2) {
                            k0Var2.b.getClass();
                            if (this.b == null) {
                                c cVar = new c();
                                cVar.a = new a(28);
                                this.b = cVar;
                            }
                            a aVar = this.c;
                            if (aVar != null) {
                                this.b.a = aVar;
                            }
                            c cVar2 = this.b;
                            cVar2.b = this.d;
                            cVar2.getClass();
                            List list2 = k0Var2.b.e;
                            boolean isEmpty = list2.isEmpty();
                            s sVar = this.e;
                            if (!isEmpty) {
                                sVar = new u0(10, sVar, list2);
                            }
                            n z10 = this.h.z(k0Var2);
                            this.f.getClass();
                            h hVar = this.a;
                            a aVar2 = this.i;
                            return new l(k0Var2, hVar, cVar2, this.g, z10, aVar2, new p2.c(hVar, aVar2, sVar), this.l, this.j, this.k);
                        }

                        @Override // u2.f0
                        public final f0 c() {
                            return this;
                        }
                    };
                }
                return a(k0Var);
            }
            if (!str.equals("dash")) {
                if (this.Z == null) {
                    this.Z = new u2.x0(extendedDefaultDataSourceFactory, new c3.m());
                }
                return this.Z.a(k0Var);
            }
            final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory4 = extendedDefaultDataSourceFactory;
            if (this.X == null) {
                this.X = new u2.f0(extendedDefaultDataSourceFactory4) { // from class: androidx.media3.exoplayer.dash.DashMediaSource$Factory
                    public final a5.a a;
                    public final g b;
                    public final e3 c;
                    public final ob.a d;
                    public final a e;
                    public final long f;
                    public final long g;

                    {
                        a5.a aVar = new a5.a(extendedDefaultDataSourceFactory4);
                        this.a = aVar;
                        this.b = extendedDefaultDataSourceFactory4;
                        this.c = new e3(4);
                        this.e = new a(26);
                        this.f = 30000L;
                        this.g = 5000000L;
                        this.d = new ob.a(23);
                        ((p) aVar.d).b = true;
                    }

                    @Override // u2.f0
                    public final u2.a a(k0 k0Var2) {
                        k0Var2.b.getClass();
                        e eVar = new e();
                        List list2 = k0Var2.b.e;
                        return new i(k0Var2, this.b, !list2.isEmpty() ? new u0(16, eVar, list2) : eVar, this.a, this.d, this.c.z(k0Var2), this.e, this.f, this.g);
                    }

                    @Override // u2.f0
                    public final f0 b(boolean z10) {
                        ((p) this.a.d).b = z10;
                        return this;
                    }

                    @Override // u2.f0
                    public final f0 c() {
                        ((p) this.a.d).getClass();
                        return this;
                    }

                    @Override // u2.f0
                    public final f0 d(a aVar) {
                        p pVar = (p) this.a.d;
                        pVar.getClass();
                        pVar.c = aVar;
                        return this;
                    }
                };
            }
            return a(k0Var);
        }
        bi.za zaVar = new bi.za(this, j3, 6);
        th.e eVar = new th.e(new c3.m(), i10);
        Object obj = new Object();
        rb.a aVar = new rb.a(26);
        f0Var.getClass();
        k0Var.b.getClass();
        b2.c0 c0Var2 = k0Var.b.c;
        if (c0Var2 == null) {
            nVar = n2.n.z;
        } else {
            synchronized (obj) {
                try {
                    x10 = !c0Var2.equals(null) ? m.e3.x(c0Var2) : null;
                    x10.getClass();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            nVar = x10;
        }
        return new u2.y0(k0Var, zaVar, eVar, nVar, aVar, 1048576, null);
    }

    public void B() {
        this.I = false;
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            e0Var.X(false);
        }
        i2.e0 e0Var2 = this.e;
        if (e0Var2 != null) {
            e0Var2.X(false);
        }
        if (this.K != null) {
            this.a0.removeCallbacksAndMessages(null);
            this.K.onVisualizerUpdate(false, true, null);
        }
    }

    public void C() {
        this.I = true;
        if (!this.x || (this.H && this.G)) {
            i2.e0 e0Var = this.d;
            if (e0Var != null) {
                e0Var.X(true);
            }
            i2.e0 e0Var2 = this.e;
            if (e0Var2 != null) {
                e0Var2.X(true);
                return;
            }
            return;
        }
        i2.e0 e0Var3 = this.d;
        if (e0Var3 != null) {
            e0Var3.X(false);
        }
        i2.e0 e0Var4 = this.e;
        if (e0Var4 != null) {
            e0Var4.X(false);
        }
    }

    public final void D(Uri uri, String str) {
        E(uri, str, 0L);
    }

    public final void E(Uri uri, String str, long j3) {
        this.N = null;
        this.O = null;
        this.Q = uri;
        this.S = str;
        this.R = null;
        this.T = null;
        boolean z10 = false;
        this.U = false;
        this.c0 = false;
        this.e0 = false;
        this.G = false;
        this.x = false;
        this.F = uri;
        String scheme = uri != null ? uri.getScheme() : null;
        if (scheme != null && !scheme.startsWith("file")) {
            z10 = true;
        }
        this.v = z10;
        i();
        this.d.q1(A(uri, str, j3), true);
        this.d.b();
    }

    public final void F(ArrayList arrayList, p71 p71Var) {
        ArrayList arrayList2;
        this.N = arrayList;
        this.O = p71Var;
        this.Q = null;
        this.S = "hls";
        this.R = null;
        this.T = null;
        this.U = false;
        this.c0 = false;
        this.G = false;
        this.x = false;
        this.F = null;
        this.v = true;
        i();
        this.e0 = false;
        this.d0 = (p71Var == null || (arrayList2 = this.N) == null) ? -1 : arrayList2.indexOf(p71Var);
        R(true, p71Var);
        if (this.c0) {
            this.d0 = -1;
        }
    }

    public final void G(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        u2.x xVar = null;
        this.N = null;
        this.O = null;
        this.Q = uri;
        this.R = uri2;
        this.S = str;
        this.T = str2;
        this.U = true;
        this.e0 = false;
        this.x = true;
        this.H = false;
        this.G = false;
        i();
        u2.x xVar2 = null;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            u2.x xVar3 = new u2.x(A(uri3, str3, 0L));
            if (i10 == 0) {
                xVar = xVar3;
            } else {
                xVar2 = xVar3;
            }
        }
        this.d.q1(xVar, true);
        this.d.b();
        this.e.q1(xVar2, true);
        this.e.b();
        k0.add(Integer.valueOf(this.a));
    }

    public final void H() {
        k0.remove(Integer.valueOf(this.a));
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            e0Var.U0();
            this.d = null;
        }
        i2.e0 e0Var2 = this.e;
        if (e0Var2 != null) {
            e0Var2.U0();
            this.e = null;
        }
        if (this.W) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    public void K(long j3) {
        L(j3, false);
    }

    public final void L(long j3, boolean z10) {
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            e0Var.s1(z10 ? i2.o1.d : i2.o1.c);
            this.d.W0(5, j3);
        }
    }

    public final void M(long j3, boolean z10, Runnable runnable) {
        if (this.d != null) {
            if (runnable != null) {
                this.i0.add(runnable);
            }
            this.d.s1(z10 ? i2.o1.d : i2.o1.c);
            this.d.W0(5, j3);
        }
    }

    public final void N(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            i2.e0 e0Var = this.d;
            if (e0Var != null) {
                e0Var.j(z10 ? 2 : 0);
            }
        }
    }

    public final void O(boolean z10) {
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            e0Var.U(z10 ? 0.0f : 1.0f);
        }
        i2.e0 e0Var2 = this.e;
        if (e0Var2 != null) {
            e0Var2.U(z10 ? 0.0f : 1.0f);
        }
    }

    public void P(boolean z10) {
        this.I = z10;
        if (z10 && this.x && (!this.H || !this.G)) {
            i2.e0 e0Var = this.d;
            if (e0Var != null) {
                e0Var.X(false);
            }
            i2.e0 e0Var2 = this.e;
            if (e0Var2 != null) {
                e0Var2.X(false);
                return;
            }
            return;
        }
        this.w = z10;
        i2.e0 e0Var3 = this.d;
        if (e0Var3 != null) {
            e0Var3.X(z10);
        }
        i2.e0 e0Var4 = this.e;
        if (e0Var4 != null) {
            e0Var4.X(z10);
        }
    }

    public void Q(float f7) {
        try {
            i2.e0 e0Var = this.d;
            if (e0Var != null) {
                e0Var.f(new b2.v0(f7, f7 > 1.0f ? 0.98f : 1.0f));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(boolean z10, p71 p71Var) {
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        b2.m1 m1Var;
        int i12;
        p71 p71Var2;
        i2.e0 e0Var = this.d;
        if (e0Var == null) {
            return;
        }
        boolean i02 = e0Var.i0();
        long J0 = this.d.J0();
        if (!z10) {
            this.g0 = J0;
            this.f0 = this.d.getDuration();
        }
        this.O = p71Var;
        x2.p pVar = this.f;
        boolean z13 = true;
        int i13 = 0;
        if (p71Var == null) {
            Uri z14 = z(this.N);
            int i14 = 0;
            while (true) {
                if (i14 >= t()) {
                    p71Var2 = null;
                    break;
                }
                p71 u10 = u(i14);
                if (u10.a) {
                    p71Var2 = u10;
                    break;
                }
                i14++;
            }
            if (p71Var2 != null) {
                ArrayList arrayList = p71Var2.d;
                if (arrayList.size() == 1 && ((r71) arrayList.get(0)).b()) {
                    this.e0 = false;
                    this.c0 = true;
                    this.O = p71Var2;
                    this.d.q1(A(p71Var2.a().d, "other", 0L), false);
                    z11 = i02;
                }
            }
            if (z14 != null) {
                this.c0 = false;
                x2.i e = pVar.e();
                e.getClass();
                x2.h hVar = new x2.h(e);
                hVar.c();
                pVar.b(new x2.i(hVar));
                if (this.e0) {
                    z13 = false;
                } else {
                    this.e0 = true;
                    this.d.q1(A(z14, "hls", 0L), false);
                }
            } else {
                p71 r10 = r(Boolean.TRUE);
                if (r10 == null) {
                    r10 = r(Boolean.FALSE);
                }
                if (r10 == null || r10.d.isEmpty()) {
                    return;
                }
                this.e0 = false;
                this.O = r10;
                this.c0 = r10.a;
                this.d.q1(A(r10.a().d, "other", 0L), false);
            }
            z11 = i02;
        } else {
            ArrayList arrayList2 = p71Var.d;
            this.c0 = false;
            if (arrayList2.isEmpty()) {
                return;
            }
            Uri z15 = arrayList2.size() > 1 ? z(this.N) : null;
            if (z15 == null || arrayList2.size() == 1 || pVar.c == null) {
                z11 = i02;
                this.e0 = false;
                this.d.q1(A(p71Var.a().d, "other", 0L), false);
            } else {
                if (this.e0) {
                    z13 = false;
                } else {
                    this.e0 = true;
                    this.d.q1(A(z15, "hls", 0L), false);
                }
                x2.i e7 = pVar.e();
                e7.getClass();
                x2.h hVar2 = new x2.h(e7);
                hVar2.c();
                int size = arrayList2.size();
                int i15 = 0;
                while (i15 < size) {
                    int i16 = i15 + 1;
                    r71 r71Var = (r71) arrayList2.get(i15);
                    try {
                        int indexOf = this.P.indexOf(r71Var);
                        x2.t tVar = pVar.c;
                        int i17 = 0;
                        while (i17 < tVar.a) {
                            u2.q1 q1Var = tVar.c[i17];
                            z12 = i02;
                            while (i13 < q1Var.a) {
                                try {
                                    b2.l1 a2 = q1Var.a(i13);
                                    i10 = size;
                                    i11 = i16;
                                    int i18 = 0;
                                    while (i18 < a2.a) {
                                        try {
                                            b2.s sVar = a2.d[i18];
                                            u2.q1 q1Var2 = q1Var;
                                            try {
                                                i12 = Integer.parseInt(sVar.a);
                                            } catch (Exception unused) {
                                                i12 = -1;
                                            }
                                            if (i12 >= 0 && indexOf == i12) {
                                                m1Var = new b2.m1(a2, i18);
                                                break;
                                            }
                                            int i19 = indexOf;
                                            if (sVar.y == r71Var.i && sVar.z == r71Var.j) {
                                                m1Var = new b2.m1(a2, i18);
                                                break;
                                            } else {
                                                i18++;
                                                q1Var = q1Var2;
                                                indexOf = i19;
                                            }
                                        } catch (Exception e10) {
                                            e = e10;
                                            FileLog.e(e);
                                            m1Var = null;
                                            if (m1Var != null) {
                                            }
                                            size = i10;
                                            i02 = z12;
                                            i15 = i11;
                                            i13 = 0;
                                        }
                                    }
                                    i13++;
                                    size = i10;
                                    i16 = i11;
                                } catch (Exception e11) {
                                    e = e11;
                                    i10 = size;
                                    i11 = i16;
                                    FileLog.e(e);
                                    m1Var = null;
                                    if (m1Var != null) {
                                    }
                                    size = i10;
                                    i02 = z12;
                                    i15 = i11;
                                    i13 = 0;
                                }
                            }
                            i17++;
                            i02 = z12;
                            i13 = 0;
                        }
                        z12 = i02;
                        i10 = size;
                        i11 = i16;
                    } catch (Exception e12) {
                        e = e12;
                        z12 = i02;
                    }
                    m1Var = null;
                    if (m1Var != null) {
                        hVar2.D.put(m1Var.a, m1Var);
                    }
                    size = i10;
                    i02 = z12;
                    i15 = i11;
                    i13 = 0;
                }
                z11 = i02;
                pVar.b(new x2.i(hVar2));
            }
        }
        if (z13) {
            this.d.b();
            if (!z10) {
                this.d.W0(5, J0);
                if (z11) {
                    this.d.i();
                }
            }
            org.telegram.ui.ir0 ir0Var = this.h0;
            if (ir0Var != null) {
                AndroidUtilities.runOnUIThread(ir0Var);
            }
            k0.add(Integer.valueOf(this.a));
        }
    }

    public final void S(int i10) {
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            e0Var.K0(new b2.e(0, 0, i10 == 0 ? 2 : 1, 1, 0, false), false);
        }
        i2.e0 e0Var2 = this.e;
        if (e0Var2 != null) {
            e0Var2.K0(new b2.e(0, 0, i10 == 0 ? 2 : 1, 1, 0, false), true);
        }
    }

    public final void T(Surface surface) {
        if (this.s == surface) {
            return;
        }
        this.s = surface;
        i2.e0 e0Var = this.d;
        if (e0Var == null) {
            return;
        }
        e0Var.n(surface);
    }

    public final void U(SurfaceView surfaceView) {
        if (this.r == surfaceView) {
            return;
        }
        this.r = surfaceView;
        i2.e0 e0Var = this.d;
        if (e0Var == null) {
            return;
        }
        e0Var.u1(surfaceView);
    }

    public final void V(TextureView textureView) {
        if (this.n == textureView) {
            return;
        }
        this.n = textureView;
        i2.e0 e0Var = this.d;
        if (e0Var == null) {
            return;
        }
        e0Var.v1(textureView);
    }

    public final void W(float f7) {
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            e0Var.U(f7);
        }
        i2.e0 e0Var2 = this.e;
        if (e0Var2 != null) {
            e0Var2.U(f7);
        }
    }

    public final void X(DispatchQueue dispatchQueue) {
        this.b = dispatchQueue;
        if (dispatchQueue == null) {
            this.d.m0 = null;
        } else {
            this.d.m0 = new org.telegram.messenger.e1(dispatchQueue);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.playerDidStartPlaying || ((t71) objArr[0]) == this || !y() || this.y) {
            return;
        }
        B();
    }

    @Override // j2.b
    public final void g(j2.a aVar, int i10) {
        if (i10 == 1) {
            q71 q71Var = this.J;
            if (q71Var != null) {
                q71Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.i0;
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
        y2.d dVar = new y2.d();
        boolean z10 = this.c;
        int i10 = MediaDataController.MAX_STYLE_RUNS_COUNT;
        int i11 = z10 ? MediaDataController.MAX_STYLE_RUNS_COUNT : 100;
        if (!z10) {
            i10 = 2000;
        }
        i2.k.a(i11, 0, "bufferForPlaybackMs", "0");
        i2.k.a(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i2.k.a(50000, i11, "minBufferMs", "bufferForPlaybackMs");
        i2.k.a(50000, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i2.k.a(50000, 50000, "maxBufferMs", "minBufferMs");
        i2.k.a(0, 0, "backBufferDurationMs", "0");
        i2.k kVar = new i2.k(dVar, i11, i10);
        if (this.d == null) {
            i2.l n71Var = this.K != null ? new n71(ApplicationLoader.applicationContext, this) : new i2.l(ApplicationLoader.applicationContext);
            n71Var.c = 1;
            i2.p pVar = new i2.p(ApplicationLoader.applicationContext);
            e2.d.g(!pVar.v);
            pVar.c = new i2.o(n71Var, 2);
            x2.p pVar2 = this.f;
            e2.d.g(!pVar.v);
            pVar2.getClass();
            pVar.e = new i2.o(pVar2, 1);
            e2.d.g(!pVar.v);
            pVar.f = new i2.o(kVar, 0);
            e2.d.g(!pVar.v);
            pVar.v = true;
            i2.e0 e0Var = new i2.e0(pVar);
            this.d = e0Var;
            j2.e eVar = e0Var.s;
            eVar.getClass();
            eVar.f.a(this);
            this.d.m.a(this);
            this.d.n0.add(this);
            TextureView textureView = this.n;
            if (textureView != null) {
                this.d.v1(textureView);
            } else {
                Surface surface = this.s;
                if (surface != null) {
                    this.d.n(surface);
                } else {
                    SurfaceView surfaceView = this.r;
                    if (surfaceView != null) {
                        this.d.u1(surfaceView);
                    }
                }
            }
            this.d.X(this.w);
            this.d.j(this.V ? 2 : 0);
        }
        if (this.x && this.e == null) {
            i2.p pVar3 = new i2.p(ApplicationLoader.applicationContext);
            x2.p pVar4 = this.f;
            e2.d.g(!pVar3.v);
            pVar4.getClass();
            pVar3.e = new i2.o(pVar4, 1);
            e2.d.g(!pVar3.v);
            pVar3.f = new i2.o(kVar, 0);
            e2.d.g(!pVar3.v);
            pVar3.v = true;
            i2.e0 e0Var2 = new i2.e0(pVar3);
            this.e = e0Var2;
            e0Var2.m.a(new l71(this));
            this.e.X(this.w);
        }
    }

    public final long j() {
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            return this.v ? e0Var.c0() : e0Var.getDuration();
        }
        return 0L;
    }

    public final of.g l(String str, String str2, String str3) {
        if (this.N == null) {
            if (this.Q == null) {
                return null;
            }
            String i10 = org.telegram.ui.Cells.r6.i("/mtproto_", str);
            String queryParameter = this.Q.getQueryParameter("mime");
            of.e eVar = new of.e(this.Q, TextUtils.isEmpty(queryParameter) ? "video/mp4" : queryParameter, i10);
            eVar.e = str2;
            eVar.f = str3;
            return new of.g(new of.f(eVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ArrayList arrayList3 = ((p71) obj).d;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                r71 r71Var = (r71) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(r71Var.c);
                String sb3 = sb2.toString();
                TLRPC.Document document = r71Var.g;
                String str4 = document != null ? document.mime_type : null;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                of.e eVar2 = new of.e(r71Var.d, str4, sb3);
                eVar2.e = str2;
                eVar2.f = str3;
                int i13 = r71Var.i;
                int i14 = r71Var.j;
                eVar2.a = i13;
                eVar2.b = i14;
                arrayList.add(new of.f(eVar2));
                arrayList2 = arrayList4;
            }
        }
        return new of.g(arrayList);
    }

    public final TLRPC.Document m() {
        ArrayList arrayList;
        i2.e0 e0Var = this.d;
        if (e0Var == null) {
            return null;
        }
        e0Var.B1();
        b2.s sVar = e0Var.Q;
        if (sVar == null || sVar.n == 0 || (arrayList = this.N) == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((p71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                r71 r71Var = (r71) obj2;
                if (r71Var.c == sVar.n) {
                    return r71Var.g;
                }
            }
        }
        return null;
    }

    public final long n() {
        long j3 = this.g0;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            return e0Var.J0();
        }
        return 0L;
    }

    public final int o() {
        if (this.d0 == -1) {
            try {
                if (this.c0) {
                    for (int i10 = 0; i10 < t(); i10++) {
                        if (u(i10).a) {
                            return i10;
                        }
                    }
                }
                i2.e0 e0Var = this.d;
                if (e0Var != null) {
                    e0Var.B1();
                    b2.s sVar = e0Var.Q;
                    if (sVar != null) {
                        for (int i11 = 0; i11 < t(); i11++) {
                            p71 u10 = u(i11);
                            if (!u10.a && sVar.y == u10.b && sVar.z == u10.c && sVar.j == ((int) Math.floor(((r71) u10.d.get(0)).l * 8.0d))) {
                                return i11;
                            }
                        }
                    }
                }
                return -1;
            } catch (Exception e) {
                FileLog.e(e);
                return -1;
            }
        }
        return this.d0;
    }

    @Override // b2.z0
    public final /* synthetic */ void onCues(d2.c cVar) {
    }

    @Override // b2.z0
    public final void onPlayerError(b2.u0 u0Var) {
        AndroidUtilities.runOnUIThread(new yo0(19, this, u0Var));
    }

    @Override // b2.z0
    public final void onPlayerStateChanged(boolean z10, int i10) {
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            boolean u10 = e0Var.u();
            int d = this.d.d();
            if (this.M != u10 || this.L != d) {
                this.J.onStateChanged(u10, d);
                this.M = u10;
                this.L = d;
            }
        }
        if (z10 && i10 == 3 && !x() && this.W) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.playerDidStartPlaying, this);
        }
        if (!this.G && i10 == 3) {
            this.G = true;
            if (this.H && this.I) {
                C();
            }
        }
        if (i10 != 3) {
            this.a0.removeCallbacksAndMessages(null);
            m71 m71Var = this.K;
            if (m71Var != null) {
                m71Var.onVisualizerUpdate(false, true, null);
            }
        }
    }

    @Override // b2.z0
    public final /* synthetic */ void onPositionDiscontinuity(int i10) {
    }

    @Override // j2.b
    public final void onRenderedFirstFrame(j2.a aVar) {
        this.g0 = -9223372036854775807L;
        this.f0 = -9223372036854775807L;
        q71 q71Var = this.J;
        if (q71Var != null) {
            q71Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override // j2.b
    public final void onSeekStarted(j2.a aVar) {
        q71 q71Var = this.J;
        if (q71Var != null) {
            q71Var.onSeekStarted(aVar);
        }
    }

    @Override // b2.z0
    public final void onTrackSelectionParametersChanged(b2.q1 q1Var) {
        org.telegram.ui.ir0 ir0Var = this.h0;
        if (ir0Var != null) {
            AndroidUtilities.runOnUIThread(ir0Var);
        }
    }

    @Override // b2.z0
    public final void onTracksChanged(b2.s1 s1Var) {
        org.telegram.ui.ir0 ir0Var = this.h0;
        if (ir0Var != null) {
            AndroidUtilities.runOnUIThread(ir0Var);
        }
    }

    @Override // b2.z0
    public final void onVideoSizeChanged(b2.x1 x1Var) {
        if (Objects.equals(x1Var, b2.x1.d)) {
            return;
        }
        this.J.onVideoSizeChanged(x1Var.a, x1Var.b, 0, x1Var.c);
    }

    public final long p() {
        long j3 = this.f0;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            return e0Var.getDuration();
        }
        return 0L;
    }

    public final bi.q9 q(bi.q9 q9Var) {
        if (q9Var == null) {
            q9Var = new bi.q9();
        }
        try {
            i2.e0 e0Var = this.d;
            e0Var.B1();
            MediaFormat mediaFormat = ((r2.r) e0Var.g[0]).d0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    q9Var.b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    q9Var.a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return q9Var;
    }

    public final p71 r(Boolean bool) {
        p71 p71Var = null;
        for (int i10 = 0; i10 < t(); i10++) {
            p71 u10 = u(i10);
            if (u10.a == bool.booleanValue() && (p71Var == null || p71Var.b * p71Var.c < u10.b * u10.c)) {
                p71Var = u10;
            }
        }
        return p71Var;
    }

    public final int t() {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final p71 u(int i10) {
        ArrayList arrayList = this.N;
        return arrayList == null ? r(Boolean.FALSE) : (i10 < 0 || i10 >= arrayList.size()) ? r(Boolean.FALSE) : (p71) this.N.get(i10);
    }

    public final boolean x() {
        i2.e0 e0Var = this.d;
        if (e0Var == null) {
            return false;
        }
        e0Var.B1();
        return e0Var.Z == 0.0f;
    }

    public final boolean y() {
        if (this.x && this.I) {
            return true;
        }
        i2.e0 e0Var = this.d;
        return e0Var != null && e0Var.u();
    }

    public final Uri z(ArrayList arrayList) {
        String str;
        StringBuilder sb2 = new StringBuilder("#EXTM3U\n#EXT-X-VERSION:6\n#EXT-X-INDEPENDENT-SEGMENTS\n\n");
        this.P = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList3 = ((p71) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                r71 r71Var = (r71) obj2;
                long j3 = r71Var.c;
                Uri uri = r71Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j3, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(r71Var.e, r71Var.f);
                if (r71Var.f != null) {
                    this.P.add(r71Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(r71Var.l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(r71Var.i);
                    sb3.append("x");
                    sb3.append(r71Var.j);
                    String str2 = r71Var.m;
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
                        sb3.append(",MIME=\"");
                        sb3.append(str);
                        sb3.append("\"");
                    }
                    if (r71Var.b() && r71Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(r71Var.c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(r71Var.a);
                    sb3.append("\"\n");
                    if (r71Var.c()) {
                        sb3.append(r71Var.f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(r71Var.e);
                        sb3.append("\n\n");
                    }
                    arrayList2.add(sb3.toString());
                    z10 = true;
                }
            }
        }
        if (!z10) {
            return null;
        }
        Collections.reverse(arrayList2);
        sb2.append(TextUtils.join("", arrayList2));
        return Uri.parse("data:application/x-mpegurl;base64," + Base64.encodeToString(sb2.toString().getBytes(), 2));
    }

    public t71(boolean z10, boolean z11) {
        int i10 = j0;
        j0 = i10 + 1;
        this.a = i10;
        this.a0 = new Handler(Looper.getMainLooper());
        this.c0 = false;
        this.d0 = -1;
        this.f0 = -9223372036854775807L;
        this.g0 = -9223372036854775807L;
        this.i0 = new ArrayList();
        this.b0 = z11;
        this.h = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        x2.p pVar = new x2.p(ApplicationLoader.applicationContext, new t7.u());
        this.f = pVar;
        if (z11) {
            x2.i e = pVar.e();
            e.getClass();
            x2.h hVar = new x2.h(e);
            hVar.E.add(1);
            pVar.b(new x2.i(hVar));
        }
        this.L = 1;
        this.W = z10;
        if (z10) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    @Override // b2.z0
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // b2.z0
    public final void onPositionDiscontinuity(b2.a1 a1Var, b2.a1 a1Var2, int i10) {
    }

    @Override // b2.z0
    public void onRenderedFirstFrame() {
        this.J.onRenderedFirstFrame();
    }

    @Override // j2.b
    public final /* synthetic */ void a(i2.g gVar) {
    }

    @Override // j2.b
    public final /* synthetic */ void b(u2.c0 c0Var) {
    }

    @Override // j2.b
    public final /* synthetic */ void c(b2.x1 x1Var) {
    }

    @Override // j2.b
    public final /* synthetic */ void h(b2.u0 u0Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onAudioAttributesChanged(b2.e eVar) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onAudioSessionIdChanged(int i10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onAvailableCommandsChanged(b2.x0 x0Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onIsLoadingChanged(boolean z10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onIsPlayingChanged(boolean z10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onLoadingChanged(boolean z10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onMediaMetadataChanged(b2.n0 n0Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onMetadata(b2.p0 p0Var) {
    }

    @Override // b2.z0
    public final void onPlaybackParametersChanged(b2.v0 v0Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlaybackStateChanged(int i10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlayerErrorChanged(b2.u0 u0Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlaylistMetadataChanged(b2.n0 n0Var) {
    }

    @Override // b2.z0
    public final void onRepeatModeChanged(int i10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onVolumeChanged(float f7) {
    }

    @Override // j2.b
    public final /* synthetic */ void d(j2.a aVar, u2.c0 c0Var) {
    }

    @Override // j2.b
    public final /* synthetic */ void e(b2.b1 b1Var, n4.y yVar) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onEvents(b2.b1 b1Var, b2.y0 y0Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onMediaItemTransition(b2.k0 k0Var, int i10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onTimelineChanged(b2.k1 k1Var, int i10) {
    }

    @Override // j2.b
    public final /* synthetic */ void f(j2.a aVar, int i10, long j3) {
    }
}
