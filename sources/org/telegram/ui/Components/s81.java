package org.telegram.ui.Components;

import a8.ng;
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
import b2.p0;
import d5.f;
import g2.g;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import li.e3;
import m2.e;
import m4.w1;
import n2.m;
import o2.c;
import o2.l;
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
import org.telegram.ui.ji1;
import p2.t;
import pa.d;
import qb.a;
import u2.f0;
import u7.s;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class s81 implements b2.e1, b2.a2, j2.b, NotificationCenter.NotificationCenterDelegate {
    public static int j0;
    public static final HashSet k0 = new HashSet();
    public static HashMap l0;
    public boolean E;
    public Uri F;
    public boolean G;
    public boolean H;
    public boolean I;
    public p81 J;
    public l81 K;
    public int L;
    public boolean M;
    public ArrayList N;
    public o81 O;
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
    public i2.j0 d;
    public int d0;
    public i2.j0 e;
    public boolean e0;
    public final x2.o f;
    public long f0;
    public long g0;
    public final ExtendedDefaultDataSourceFactory h;
    public org.telegram.ui.xq0 h0;
    public final ArrayList i0;
    public TextureView n;
    public SurfaceView r;
    public Surface s;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    public s81() {
        this(true, false);
    }

    public static void I(MessageObject messageObject, boolean z10) {
        if (messageObject == null) {
            return;
        }
        ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z10).apply();
    }

    public static void J(o81 o81Var, MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (o81Var == null) {
            edit.remove(dialogId + "_" + id2 + "q2");
        } else {
            String str = dialogId + "_" + id2 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(o81Var.b);
            sb2.append("x");
            sb2.append(o81Var.c);
            sb2.append(o81Var.a ? "s" : "");
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
                    if (!codecInfoAt.isEncoder() && r2.w.i(codecInfoAt, concat)) {
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

    public static q81 k(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((o81) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                q81 q81Var = (q81) obj2;
                if (q81Var.b()) {
                    return q81Var;
                }
            }
        }
        return null;
    }

    public static ArrayList s(int i10, TLRPC.Document document, ArrayList arrayList, int i11, boolean z10) {
        o81 o81Var;
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
                    q81 d = q81.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.id), i11, z10);
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
            q81 q81Var = (q81) arrayList3.get(i14);
            String str2 = q81Var.m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(q81Var.m) && !"hevc".equals(q81Var.m) && !"h265".equals(q81Var.m) && !"vp9".equals(q81Var.m)) || Y(q81Var.m))) {
                arrayList4.add(q81Var);
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
            q81 q81Var2 = (q81) obj;
            if (q81Var2.b) {
                arrayList6.add(new o81(q81Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size2) {
                        o81Var = null;
                        break;
                    }
                    Object obj2 = arrayList6.get(i16);
                    i16++;
                    o81Var = (o81) obj2;
                    if (!o81Var.a && o81Var.b == q81Var2.i && o81Var.c == q81Var2.j) {
                        break;
                    }
                }
                if (o81Var == null || SharedConfig.debugVideoQualities) {
                    arrayList6.add(new o81(q81Var2));
                } else {
                    o81Var.d.add(q81Var2);
                }
            }
        }
        return arrayList6;
    }

    public static q81 v(ArrayList arrayList) {
        int i10;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ArrayList arrayList2 = ((o81) obj).d;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                q81 q81Var = (q81) obj2;
                if (q81Var.b && q81Var.b()) {
                    return q81Var;
                }
            }
        }
        int size3 = arrayList.size();
        q81 q81Var2 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            ArrayList arrayList3 = ((o81) obj3).d;
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                q81 q81Var3 = (q81) obj4;
                if (!q81Var3.b && Y(q81Var3.m) && (q81Var2 == null || (i10 = q81Var3.i * q81Var3.j) > (i11 = q81Var2.i * q81Var2.j) || (i10 == i11 && q81Var3.l < q81Var2.l))) {
                    q81Var2 = q81Var3;
                }
            }
        }
        if (q81Var2 == null) {
            int size5 = arrayList.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList.get(i16);
                i16++;
                ArrayList arrayList4 = ((o81) obj5).d;
                int size6 = arrayList4.size();
                int i17 = 0;
                while (i17 < size6) {
                    Object obj6 = arrayList4.get(i17);
                    i17++;
                    q81 q81Var4 = (q81) obj6;
                    if (q81Var2 == null || q81Var2.i * q81Var2.j > q81Var4.i * q81Var4.j || q81Var4.l < q81Var2.l) {
                        q81Var2 = q81Var4;
                    }
                }
            }
        }
        return q81Var2;
    }

    public static q81 w(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((o81) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                q81 q81Var = (q81) obj2;
                if (q81Var.b()) {
                    return q81Var;
                }
            }
        }
        int size3 = arrayList.size();
        q81 q81Var2 = null;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ArrayList arrayList3 = ((o81) obj3).d;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                q81 q81Var3 = (q81) obj4;
                if (!q81Var3.b && (q81Var2 == null || q81Var2.i * q81Var2.j > q81Var3.i * q81Var3.j || q81Var3.l < q81Var2.l)) {
                    if (q81Var3.i <= 900 && q81Var3.j <= 900) {
                        q81Var2 = q81Var3;
                    }
                }
            }
        }
        if (q81Var2 == null) {
            int size5 = arrayList.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj5 = arrayList.get(i14);
                i14++;
                ArrayList arrayList4 = ((o81) obj5).d;
                int size6 = arrayList4.size();
                int i15 = 0;
                while (i15 < size6) {
                    Object obj6 = arrayList4.get(i15);
                    i15++;
                    q81 q81Var4 = (q81) obj6;
                    if (q81Var2 == null || q81Var2.i * q81Var2.j > q81Var4.i * q81Var4.j || q81Var4.l < q81Var2.l) {
                        q81Var2 = q81Var4;
                    }
                }
            }
        }
        return q81Var2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.exoplayer.hls.HlsMediaSource$Factory] */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.media3.exoplayer.dash.DashMediaSource$Factory] */
    public final u2.a A(Uri uri, String str, long j10) {
        b2.i0 i0Var;
        b2.k0 k0Var;
        n2.m r6;
        n2.m mVar;
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = new b2.g0();
        List list = Collections.EMPTY_LIST;
        f9.s1 s1Var = f9.s1.e;
        b2.i0 i0Var2 = new b2.i0();
        b2.l0 l0Var = b2.l0.d;
        a8.yb.p(g0Var.b == null || g0Var.a != null);
        if (uri != null) {
            b2.h0 h0Var = g0Var.a != null ? new b2.h0(g0Var) : null;
            i0Var = i0Var2;
            k0Var = new b2.k0(uri, null, h0Var, null, list, null, s1Var, -9223372036854775807L);
        } else {
            i0Var = i0Var2;
            k0Var = null;
        }
        b2.p0 p0Var = new b2.p0("", new b2.f0(d0Var), k0Var, new b2.j0(i0Var), b2.s0.L, l0Var);
        if (j10 == 0) {
            str.getClass();
            if (str.equals("hls")) {
                if (this.Y == null) {
                    this.Y = new u2.f0(extendedDefaultDataSourceFactory) { // from class: androidx.media3.exoplayer.hls.HlsMediaSource$Factory
                        public final e3 a;
                        public c b;
                        public a c;
                        public final k6.c i = new k6.c(8);
                        public final d f = new d();
                        public final ji1 g = p2.d.J;
                        public final s j = new s(26);
                        public final d h = new d();
                        public final int l = 1;
                        public final long m = -9223372036854775807L;
                        public final boolean k = true;
                        public int e = 3;
                        public boolean d = true;

                        {
                            this.a = new e3(extendedDefaultDataSourceFactory, 5);
                        }

                        @Override // u2.f0
                        public final f0 b(a aVar) {
                            this.c = aVar;
                            return this;
                        }

                        @Override // u2.f0
                        public final f0 c(boolean z10) {
                            this.d = z10;
                            return this;
                        }

                        @Override // u2.f0
                        public final f0 d(int i10) {
                            this.e = i10;
                            return this;
                        }

                        @Override // u2.f0
                        /* renamed from: e, reason: merged with bridge method [inline-methods] */
                        public final l a(p0 p0Var2) {
                            p0Var2.b.getClass();
                            if (this.b == null) {
                                c cVar = new c();
                                cVar.a = new a(28);
                                cVar.c = 3;
                                this.b = cVar;
                            }
                            a aVar = this.c;
                            if (aVar != null) {
                                this.b.a = aVar;
                            }
                            c cVar2 = this.b;
                            cVar2.b = this.d;
                            cVar2.c = this.e;
                            List list2 = p0Var2.b.e;
                            boolean isEmpty = list2.isEmpty();
                            t tVar = this.f;
                            if (!isEmpty) {
                                tVar = new w1(16, tVar, list2);
                            }
                            m u10 = this.i.u(p0Var2);
                            this.g.getClass();
                            e3 e3Var = this.a;
                            s sVar = this.j;
                            return new l(p0Var2, e3Var, cVar2, this.h, u10, sVar, new p2.d(e3Var, sVar, tVar), this.m, this.k, this.l);
                        }
                    };
                }
                return a(p0Var);
            }
            if (str.equals("dash")) {
                if (this.X == null) {
                    this.X = new u2.f0(extendedDefaultDataSourceFactory) { // from class: androidx.media3.exoplayer.dash.DashMediaSource$Factory
                        public final ng a;
                        public final g b;
                        public final k6.c c;
                        public final d d;
                        public final s e;
                        public final long f;
                        public final long g;

                        {
                            ng ngVar = new ng(extendedDefaultDataSourceFactory);
                            this.a = ngVar;
                            this.b = extendedDefaultDataSourceFactory;
                            this.c = new k6.c(8);
                            this.e = new s(26);
                            this.f = 30000L;
                            this.g = 5000000L;
                            this.d = new d();
                            ((f) ngVar.d).b = true;
                        }

                        @Override // u2.f0
                        public final u2.a a(p0 p0Var2) {
                            p0Var2.b.getClass();
                            e eVar = new e();
                            List list2 = p0Var2.b.e;
                            return new l2.g(p0Var2, this.b, !list2.isEmpty() ? new m4.c(20, eVar, list2) : eVar, this.a, this.d, this.c.u(p0Var2), this.e, this.f, this.g);
                        }

                        @Override // u2.f0
                        public final f0 b(a aVar) {
                            f fVar = (f) this.a.d;
                            fVar.getClass();
                            fVar.c = aVar;
                            return this;
                        }

                        @Override // u2.f0
                        public final f0 c(boolean z10) {
                            ((f) this.a.d).b = z10;
                            return this;
                        }

                        @Override // u2.f0
                        public final f0 d(int i10) {
                            ((f) this.a.d).a = i10;
                            return this;
                        }
                    };
                }
                return a(p0Var);
            }
            if (this.Z == null) {
                this.Z = new u2.x0(extendedDefaultDataSourceFactory, new c3.m());
            }
            return this.Z.a(p0Var);
        }
        di.d1 d1Var = new di.d1(this, j10, 7);
        org.telegram.ui.Components.voip.j1 j1Var = new org.telegram.ui.Components.voip.j1(new c3.m(), 22);
        Object obj = new Object();
        u7.s sVar = new u7.s(26);
        k0Var.getClass();
        p0Var.b.getClass();
        b2.h0 h0Var2 = p0Var.b.c;
        if (h0Var2 == null) {
            mVar = n2.m.z;
        } else {
            synchronized (obj) {
                try {
                    r6 = !h0Var2.equals(null) ? k6.c.r(h0Var2) : null;
                    r6.getClass();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            mVar = r6;
        }
        return new u2.y0(p0Var, d1Var, j1Var, mVar, sVar, 1048576, null);
    }

    public void B() {
        this.I = false;
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            j0Var.X(false);
        }
        i2.j0 j0Var2 = this.e;
        if (j0Var2 != null) {
            j0Var2.X(false);
        }
        if (this.K != null) {
            this.a0.removeCallbacksAndMessages(null);
            this.K.onVisualizerUpdate(false, true, null);
        }
    }

    public void C() {
        this.I = true;
        if (!this.x || (this.H && this.G)) {
            i2.j0 j0Var = this.d;
            if (j0Var != null) {
                j0Var.X(true);
            }
            i2.j0 j0Var2 = this.e;
            if (j0Var2 != null) {
                j0Var2.X(true);
                return;
            }
            return;
        }
        i2.j0 j0Var3 = this.d;
        if (j0Var3 != null) {
            j0Var3.X(false);
        }
        i2.j0 j0Var4 = this.e;
        if (j0Var4 != null) {
            j0Var4.X(false);
        }
    }

    public final void D(Uri uri, String str) {
        E(uri, str, 0L);
    }

    public final void E(Uri uri, String str, long j10) {
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
        this.d.u1(A(uri, str, j10), true);
        this.d.a();
    }

    public final void F(ArrayList arrayList, o81 o81Var) {
        ArrayList arrayList2;
        this.N = arrayList;
        this.O = o81Var;
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
        this.d0 = (o81Var == null || (arrayList2 = this.N) == null) ? -1 : arrayList2.indexOf(o81Var);
        R(true, o81Var);
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
        this.d.u1(xVar, true);
        this.d.a();
        this.e.u1(xVar2, true);
        this.e.a();
        k0.add(Integer.valueOf(this.a));
    }

    public final void H() {
        k0.remove(Integer.valueOf(this.a));
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            j0Var.X0();
            this.d = null;
        }
        i2.j0 j0Var2 = this.e;
        if (j0Var2 != null) {
            j0Var2.X0();
            this.e = null;
        }
        if (this.W) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    public void K(long j10) {
        L(j10, false);
    }

    public final void L(long j10, boolean z10) {
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            j0Var.w1(z10 ? i2.t1.d : i2.t1.c);
            this.d.Z0(5, j10);
        }
    }

    public final void M(long j10, boolean z10, Runnable runnable) {
        if (this.d != null) {
            if (runnable != null) {
                this.i0.add(runnable);
            }
            this.d.w1(z10 ? i2.t1.d : i2.t1.c);
            this.d.Z0(5, j10);
        }
    }

    public final void N(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            i2.j0 j0Var = this.d;
            if (j0Var != null) {
                j0Var.j(z10 ? 2 : 0);
            }
        }
    }

    public final void O(boolean z10) {
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            j0Var.U(z10 ? 0.0f : 1.0f);
        }
        i2.j0 j0Var2 = this.e;
        if (j0Var2 != null) {
            j0Var2.U(z10 ? 0.0f : 1.0f);
        }
    }

    public void P(boolean z10) {
        this.I = z10;
        if (z10 && this.x && (!this.H || !this.G)) {
            i2.j0 j0Var = this.d;
            if (j0Var != null) {
                j0Var.X(false);
            }
            i2.j0 j0Var2 = this.e;
            if (j0Var2 != null) {
                j0Var2.X(false);
                return;
            }
            return;
        }
        this.w = z10;
        i2.j0 j0Var3 = this.d;
        if (j0Var3 != null) {
            j0Var3.X(z10);
        }
        i2.j0 j0Var4 = this.e;
        if (j0Var4 != null) {
            j0Var4.X(z10);
        }
    }

    public void Q(float f7) {
        try {
            i2.j0 j0Var = this.d;
            if (j0Var != null) {
                j0Var.f(new b2.a1(f7, f7 > 1.0f ? 0.98f : 1.0f));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(boolean z10, o81 o81Var) {
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        b2.r1 r1Var;
        int i12;
        o81 o81Var2;
        i2.j0 j0Var = this.d;
        if (j0Var == null) {
            return;
        }
        boolean j02 = j0Var.j0();
        long M0 = this.d.M0();
        if (!z10) {
            this.g0 = M0;
            this.f0 = this.d.getDuration();
        }
        this.O = o81Var;
        x2.o oVar = this.f;
        boolean z13 = true;
        int i13 = 0;
        if (o81Var == null) {
            Uri z14 = z(this.N);
            int i14 = 0;
            while (true) {
                if (i14 >= t()) {
                    o81Var2 = null;
                    break;
                }
                o81 u10 = u(i14);
                if (u10.a) {
                    o81Var2 = u10;
                    break;
                }
                i14++;
            }
            if (o81Var2 != null) {
                ArrayList arrayList = o81Var2.d;
                if (arrayList.size() == 1 && ((q81) arrayList.get(0)).b()) {
                    this.e0 = false;
                    this.c0 = true;
                    this.O = o81Var2;
                    this.d.u1(A(o81Var2.a().d, "other", 0L), false);
                    z11 = j02;
                }
            }
            if (z14 != null) {
                this.c0 = false;
                x2.j j10 = oVar.j();
                j10.getClass();
                x2.i iVar = new x2.i(j10);
                iVar.c();
                oVar.b(new x2.j(iVar));
                if (this.e0) {
                    z13 = false;
                } else {
                    this.e0 = true;
                    this.d.u1(A(z14, "hls", 0L), false);
                }
            } else {
                o81 r6 = r(Boolean.TRUE);
                if (r6 == null) {
                    r6 = r(Boolean.FALSE);
                }
                if (r6 == null || r6.d.isEmpty()) {
                    return;
                }
                this.e0 = false;
                this.O = r6;
                this.c0 = r6.a;
                this.d.u1(A(r6.a().d, "other", 0L), false);
            }
            z11 = j02;
        } else {
            ArrayList arrayList2 = o81Var.d;
            this.c0 = false;
            if (arrayList2.isEmpty()) {
                return;
            }
            Uri z15 = arrayList2.size() > 1 ? z(this.N) : null;
            if (z15 == null || arrayList2.size() == 1 || oVar.c == null) {
                z11 = j02;
                this.e0 = false;
                this.d.u1(A(o81Var.a().d, "other", 0L), false);
            } else {
                if (this.e0) {
                    z13 = false;
                } else {
                    this.e0 = true;
                    this.d.u1(A(z15, "hls", 0L), false);
                }
                x2.j j11 = oVar.j();
                j11.getClass();
                x2.i iVar2 = new x2.i(j11);
                iVar2.c();
                int size = arrayList2.size();
                int i15 = 0;
                while (i15 < size) {
                    int i16 = i15 + 1;
                    q81 q81Var = (q81) arrayList2.get(i15);
                    try {
                        int indexOf = this.P.indexOf(q81Var);
                        x2.s sVar = oVar.c;
                        int i17 = i13;
                        while (i17 < sVar.a) {
                            u2.r1 r1Var2 = sVar.c[i17];
                            z12 = j02;
                            while (i13 < r1Var2.a) {
                                try {
                                    b2.q1 a2 = r1Var2.a(i13);
                                    i10 = size;
                                    i11 = i16;
                                    int i18 = 0;
                                    while (i18 < a2.a) {
                                        try {
                                            b2.x xVar = a2.d[i18];
                                            u2.r1 r1Var3 = r1Var2;
                                            try {
                                                i12 = Integer.parseInt(xVar.a);
                                            } catch (Exception unused) {
                                                i12 = -1;
                                            }
                                            if (i12 >= 0 && indexOf == i12) {
                                                r1Var = new b2.r1(a2, i18);
                                                break;
                                            }
                                            int i19 = indexOf;
                                            if (xVar.z == q81Var.i && xVar.A == q81Var.j) {
                                                r1Var = new b2.r1(a2, i18);
                                                break;
                                            } else {
                                                i18++;
                                                r1Var2 = r1Var3;
                                                indexOf = i19;
                                            }
                                        } catch (Exception e) {
                                            e = e;
                                            FileLog.e(e);
                                            r1Var = null;
                                            if (r1Var != null) {
                                            }
                                            size = i10;
                                            j02 = z12;
                                            i15 = i11;
                                            i13 = 0;
                                        }
                                    }
                                    i13++;
                                    size = i10;
                                    i16 = i11;
                                } catch (Exception e10) {
                                    e = e10;
                                    i10 = size;
                                    i11 = i16;
                                    FileLog.e(e);
                                    r1Var = null;
                                    if (r1Var != null) {
                                    }
                                    size = i10;
                                    j02 = z12;
                                    i15 = i11;
                                    i13 = 0;
                                }
                            }
                            i17++;
                            j02 = z12;
                            i13 = 0;
                        }
                        z12 = j02;
                        i10 = size;
                        i11 = i16;
                    } catch (Exception e11) {
                        e = e11;
                        z12 = j02;
                    }
                    r1Var = null;
                    if (r1Var != null) {
                        iVar2.H.put(r1Var.a, r1Var);
                    }
                    size = i10;
                    j02 = z12;
                    i15 = i11;
                    i13 = 0;
                }
                z11 = j02;
                oVar.b(new x2.j(iVar2));
            }
        }
        if (z13) {
            this.d.a();
            if (!z10) {
                this.d.Z0(5, M0);
                if (z11) {
                    this.d.i();
                }
            }
            org.telegram.ui.xq0 xq0Var = this.h0;
            if (xq0Var != null) {
                AndroidUtilities.runOnUIThread(xq0Var);
            }
            k0.add(Integer.valueOf(this.a));
        }
    }

    public final void S(int i10) {
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            j0Var.N0(new b2.f(0, 0, i10 == 0 ? 2 : 1, 1, false, 0, true), false);
        }
        i2.j0 j0Var2 = this.e;
        if (j0Var2 != null) {
            j0Var2.N0(new b2.f(0, 0, i10 == 0 ? 2 : 1, 1, false, 0, true), true);
        }
    }

    public final void T(Surface surface) {
        if (this.s == surface) {
            return;
        }
        this.s = surface;
        i2.j0 j0Var = this.d;
        if (j0Var == null) {
            return;
        }
        j0Var.y1(surface);
    }

    public final void U(SurfaceView surfaceView) {
        if (this.r == surfaceView) {
            return;
        }
        this.r = surfaceView;
        i2.j0 j0Var = this.d;
        if (j0Var == null) {
            return;
        }
        j0Var.F1();
        j0Var.T(surfaceView == null ? null : surfaceView.getHolder());
    }

    public final void V(TextureView textureView) {
        if (this.n == textureView) {
            return;
        }
        this.n = textureView;
        i2.j0 j0Var = this.d;
        if (j0Var == null) {
            return;
        }
        j0Var.z1(textureView);
    }

    public final void W(float f7) {
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            j0Var.U(f7);
        }
        i2.j0 j0Var2 = this.e;
        if (j0Var2 != null) {
            j0Var2.U(f7);
        }
    }

    public final void X(DispatchQueue dispatchQueue) {
        this.b = dispatchQueue;
        if (dispatchQueue == null) {
            this.d.s0 = null;
        } else {
            this.d.s0 = new k81(dispatchQueue);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.playerDidStartPlaying || ((s81) objArr[0]) == this || !y() || this.y) {
            return;
        }
        B();
    }

    @Override // j2.b
    public final void g(j2.a aVar, int i10) {
        if (i10 == 1) {
            p81 p81Var = this.J;
            if (p81Var != null) {
                p81Var.onSeekFinished(aVar);
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
        HashMap hashMap = new HashMap();
        hashMap.put(j2.j.c.a, 144179200);
        y2.d dVar = new y2.d();
        boolean z10 = this.c;
        int i10 = MediaDataController.MAX_STYLE_RUNS_COUNT;
        int i11 = z10 ? 1000 : 100;
        if (!z10) {
            i10 = 2000;
        }
        int i12 = i10;
        i2.i.a(i11, 0, "bufferForPlaybackMs", "0");
        i2.i.a(i12, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i2.i.a(50000, i11, "minBufferMs", "bufferForPlaybackMs");
        i2.i.a(50000, i12, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i2.i.a(50000, 50000, "maxBufferMs", "minBufferMs");
        i2.i.a(0, 0, "backBufferDurationMs", "0");
        i2.i iVar = new i2.i(dVar, 50000, i11, i11, i12, i12, false, hashMap);
        if (this.d == null) {
            i2.k m81Var = this.K != null ? new m81(ApplicationLoader.applicationContext, this) : new i2.k(ApplicationLoader.applicationContext);
            m81Var.c = 1;
            i2.o oVar = new i2.o(ApplicationLoader.applicationContext);
            a8.yb.p(!oVar.z);
            oVar.c = new i2.n(m81Var, 2);
            x2.o oVar2 = this.f;
            a8.yb.p(!oVar.z);
            oVar2.getClass();
            oVar.e = new i2.n(oVar2, 1);
            a8.yb.p(!oVar.z);
            oVar.f = new i2.n(iVar, 0);
            i2.j0 a2 = oVar.a();
            this.d = a2;
            j2.e eVar = a2.s;
            eVar.getClass();
            eVar.f.a(this);
            this.d.m.a(this);
            this.d.t0.add(this);
            TextureView textureView = this.n;
            if (textureView != null) {
                this.d.z1(textureView);
            } else {
                Surface surface = this.s;
                if (surface != null) {
                    this.d.y1(surface);
                } else {
                    SurfaceView surfaceView = this.r;
                    if (surfaceView != null) {
                        i2.j0 j0Var = this.d;
                        j0Var.F1();
                        j0Var.T(surfaceView.getHolder());
                    }
                }
            }
            this.d.X(this.w);
            this.d.j(this.V ? 2 : 0);
        }
        if (this.x && this.e == null) {
            i2.o oVar3 = new i2.o(ApplicationLoader.applicationContext);
            x2.o oVar4 = this.f;
            a8.yb.p(!oVar3.z);
            oVar4.getClass();
            oVar3.e = new i2.n(oVar4, 1);
            a8.yb.p(true ^ oVar3.z);
            oVar3.f = new i2.n(iVar, 0);
            i2.j0 a10 = oVar3.a();
            this.e = a10;
            a10.m.a(new e2.z(this, 1));
            this.e.X(this.w);
        }
    }

    public final long j() {
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            return this.v ? j0Var.d0() : j0Var.getDuration();
        }
        return 0L;
    }

    public final rf.g l(String str, String str2, String str3) {
        if (this.N == null) {
            if (this.Q == null) {
                return null;
            }
            String j10 = b10.j("/mtproto_", str);
            String queryParameter = this.Q.getQueryParameter("mime");
            rf.e eVar = new rf.e(this.Q, TextUtils.isEmpty(queryParameter) ? "video/mp4" : queryParameter, j10);
            eVar.e = str2;
            eVar.f = str3;
            return new rf.g(new rf.f(eVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ArrayList arrayList3 = ((o81) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                q81 q81Var = (q81) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(q81Var.c);
                String sb3 = sb2.toString();
                TLRPC.Document document = q81Var.g;
                String str4 = document != null ? document.mime_type : null;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                rf.e eVar2 = new rf.e(q81Var.d, str4, sb3);
                eVar2.e = str2;
                eVar2.f = str3;
                int i12 = q81Var.i;
                int i13 = q81Var.j;
                eVar2.a = i12;
                eVar2.b = i13;
                arrayList.add(new rf.f(eVar2));
                arrayList2 = arrayList4;
            }
        }
        return new rf.g(arrayList);
    }

    public final TLRPC.Document m() {
        ArrayList arrayList;
        i2.j0 j0Var = this.d;
        if (j0Var == null) {
            return null;
        }
        j0Var.F1();
        b2.x xVar = j0Var.S;
        if (xVar == null || xVar.o == 0 || (arrayList = this.N) == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((o81) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                q81 q81Var = (q81) obj2;
                if (q81Var.c == xVar.o) {
                    return q81Var.g;
                }
            }
        }
        return null;
    }

    public final long n() {
        long j10 = this.g0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            return j0Var.M0();
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
                i2.j0 j0Var = this.d;
                if (j0Var != null) {
                    j0Var.F1();
                    b2.x xVar = j0Var.S;
                    if (xVar != null) {
                        for (int i11 = 0; i11 < t(); i11++) {
                            o81 u10 = u(i11);
                            if (!u10.a && xVar.z == u10.b && xVar.A == u10.c && xVar.j == ((int) Math.floor(((q81) u10.d.get(0)).l * 8.0d))) {
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

    @Override // b2.e1
    public final /* synthetic */ void onCues(d2.c cVar) {
    }

    @Override // b2.e1
    public final void onPlayerError(b2.z0 z0Var) {
        AndroidUtilities.runOnUIThread(new c71(2, this, z0Var));
    }

    @Override // b2.e1
    public final void onPlayerStateChanged(boolean z10, int i10) {
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            boolean t10 = j0Var.t();
            int d = this.d.d();
            if (this.M != t10 || this.L != d) {
                this.J.onStateChanged(t10, d);
                this.M = t10;
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
            l81 l81Var = this.K;
            if (l81Var != null) {
                l81Var.onVisualizerUpdate(false, true, null);
            }
        }
    }

    @Override // b2.e1
    public final /* synthetic */ void onPositionDiscontinuity(int i10) {
    }

    @Override // j2.b
    public final void onRenderedFirstFrame(j2.a aVar) {
        this.g0 = -9223372036854775807L;
        this.f0 = -9223372036854775807L;
        p81 p81Var = this.J;
        if (p81Var != null) {
            p81Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override // j2.b
    public final void onSeekStarted(j2.a aVar) {
        p81 p81Var = this.J;
        if (p81Var != null) {
            p81Var.onSeekStarted(aVar);
        }
    }

    @Override // b2.e1
    public final void onTrackSelectionParametersChanged(b2.u1 u1Var) {
        org.telegram.ui.xq0 xq0Var = this.h0;
        if (xq0Var != null) {
            AndroidUtilities.runOnUIThread(xq0Var);
        }
    }

    @Override // b2.e1
    public final void onTracksChanged(b2.w1 w1Var) {
        org.telegram.ui.xq0 xq0Var = this.h0;
        if (xq0Var != null) {
            AndroidUtilities.runOnUIThread(xq0Var);
        }
    }

    @Override // b2.e1
    public final void onVideoSizeChanged(b2.b2 b2Var) {
        if (Objects.equals(b2Var, b2.b2.d)) {
            return;
        }
        this.J.onVideoSizeChanged(b2Var.a, b2Var.b, 0, b2Var.c);
    }

    public final long p() {
        long j10 = this.f0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            return j0Var.getDuration();
        }
        return 0L;
    }

    public final fi.v7 q(fi.v7 v7Var) {
        if (v7Var == null) {
            v7Var = new fi.v7();
        }
        try {
            i2.j0 j0Var = this.d;
            j0Var.F1();
            MediaFormat mediaFormat = ((r2.r) j0Var.g[0]).f0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    v7Var.b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    v7Var.a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return v7Var;
    }

    public final o81 r(Boolean bool) {
        o81 o81Var = null;
        for (int i10 = 0; i10 < t(); i10++) {
            o81 u10 = u(i10);
            if (u10.a == bool.booleanValue() && (o81Var == null || o81Var.b * o81Var.c < u10.b * u10.c)) {
                o81Var = u10;
            }
        }
        return o81Var;
    }

    public final int t() {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final o81 u(int i10) {
        ArrayList arrayList = this.N;
        return arrayList == null ? r(Boolean.FALSE) : (i10 < 0 || i10 >= arrayList.size()) ? r(Boolean.FALSE) : (o81) this.N.get(i10);
    }

    public final boolean x() {
        i2.j0 j0Var = this.d;
        if (j0Var == null) {
            return false;
        }
        j0Var.F1();
        return j0Var.b0 == 0.0f;
    }

    public final boolean y() {
        if (this.x && this.I) {
            return true;
        }
        i2.j0 j0Var = this.d;
        return j0Var != null && j0Var.t();
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
            ArrayList arrayList3 = ((o81) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                q81 q81Var = (q81) obj2;
                long j10 = q81Var.c;
                Uri uri = q81Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j10, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(q81Var.e, q81Var.f);
                if (q81Var.f != null) {
                    this.P.add(q81Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(q81Var.l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(q81Var.i);
                    sb3.append("x");
                    sb3.append(q81Var.j);
                    String str2 = q81Var.m;
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
                    if (q81Var.b() && q81Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(q81Var.c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(q81Var.a);
                    sb3.append("\"\n");
                    if (q81Var.c()) {
                        sb3.append(q81Var.f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(q81Var.e);
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

    public s81(boolean z10, boolean z11) {
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
        x2.o oVar = new x2.o(ApplicationLoader.applicationContext, new qb.a(26));
        this.f = oVar;
        if (z11) {
            x2.j j10 = oVar.j();
            j10.getClass();
            x2.i iVar = new x2.i(j10);
            iVar.I.add(1);
            oVar.b(new x2.j(iVar));
        }
        this.L = 1;
        this.W = z10;
        if (z10) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    @Override // b2.e1
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // b2.e1
    public final void onPositionDiscontinuity(b2.f1 f1Var, b2.f1 f1Var2, int i10) {
    }

    @Override // b2.e1
    public void onRenderedFirstFrame() {
        this.J.onRenderedFirstFrame();
    }

    @Override // j2.b
    public final /* synthetic */ void a(i2.e eVar) {
    }

    @Override // j2.b
    public final /* synthetic */ void b(u2.c0 c0Var) {
    }

    @Override // j2.b
    public final /* synthetic */ void c(b2.b2 b2Var) {
    }

    @Override // j2.b
    public final /* synthetic */ void h(b2.z0 z0Var) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onAudioAttributesChanged(b2.f fVar) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onAudioSessionIdChanged(int i10) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onAvailableCommandsChanged(b2.c1 c1Var) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onIsLoadingChanged(boolean z10) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onIsPlayingChanged(boolean z10) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onLoadingChanged(boolean z10) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onMediaMetadataChanged(b2.s0 s0Var) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onMetadata(b2.u0 u0Var) {
    }

    @Override // b2.e1
    public final void onPlaybackParametersChanged(b2.a1 a1Var) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onPlaybackStateChanged(int i10) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onPlayerErrorChanged(b2.z0 z0Var) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onPlaylistMetadataChanged(b2.s0 s0Var) {
    }

    @Override // b2.e1
    public final void onRepeatModeChanged(int i10) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onVolumeChanged(float f7) {
    }

    @Override // j2.b
    public final /* synthetic */ void d(j2.a aVar, u2.c0 c0Var) {
    }

    @Override // j2.b
    public final /* synthetic */ void e(b2.g1 g1Var, n4.s sVar) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onEvents(b2.g1 g1Var, b2.d1 d1Var) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onMediaItemTransition(b2.p0 p0Var, int i10) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onTimelineChanged(b2.p1 p1Var, int i10) {
    }

    @Override // j2.b
    public final /* synthetic */ void f(j2.a aVar, int i10, long j10) {
    }
}
