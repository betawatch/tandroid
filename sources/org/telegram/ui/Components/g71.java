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
import ji.u4;
import m2.e;
import m2.t;
import n2.m;
import n7.z0;
import na.d;
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
import org.telegram.ui.sw0;
import p2.s;
import qb.b;
import rb.a;
import u2.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class g71 implements b2.z0, b2.w1, j2.b, NotificationCenter.NotificationCenterDelegate {
    public static int j0;
    public static final HashSet k0 = new HashSet();
    public static HashMap l0;
    public boolean E;
    public Uri F;
    public boolean G;
    public boolean H;
    public boolean I;
    public d71 J;
    public z61 K;
    public int L;
    public boolean M;
    public ArrayList N;
    public c71 O;
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
    public u2.v0 Z;
    public final int a;
    public final Handler a0;
    public DispatchQueue b;
    public final boolean b0;
    public boolean c;
    public boolean c0;
    public i2.f0 d;
    public int d0;
    public i2.f0 e;
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

    public g71() {
        this(true, false);
    }

    public static void I(MessageObject messageObject, boolean z10) {
        if (messageObject == null) {
            return;
        }
        ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z10).apply();
    }

    public static void J(c71 c71Var, MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (c71Var == null) {
            edit.remove(dialogId + "_" + id2 + "q2");
        } else {
            String str = dialogId + "_" + id2 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c71Var.b);
            sb2.append("x");
            sb2.append(c71Var.c);
            sb2.append(c71Var.a ? "s" : "");
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
                    } catch (Exception e7) {
                        FileLog.e(e7);
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

    public static e71 k(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((c71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                e71 e71Var = (e71) obj2;
                if (e71Var.b()) {
                    return e71Var;
                }
            }
        }
        return null;
    }

    public static ArrayList s(int i10, TLRPC.Document document, ArrayList arrayList, int i11, boolean z10) {
        c71 c71Var;
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            i12++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i13);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    e71 d = e71.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.id), i11, z10);
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
            e71 e71Var = (e71) arrayList3.get(i14);
            String str2 = e71Var.m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(e71Var.m) && !"hevc".equals(e71Var.m) && !"h265".equals(e71Var.m) && !"vp9".equals(e71Var.m)) || Y(e71Var.m))) {
                arrayList4.add(e71Var);
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
            e71 e71Var2 = (e71) obj;
            if (e71Var2.b) {
                arrayList6.add(new c71(e71Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size2) {
                        c71Var = null;
                        break;
                    }
                    Object obj2 = arrayList6.get(i16);
                    i16++;
                    c71Var = (c71) obj2;
                    if (!c71Var.a && c71Var.b == e71Var2.i && c71Var.c == e71Var2.j) {
                        break;
                    }
                }
                if (c71Var == null || SharedConfig.debugVideoQualities) {
                    arrayList6.add(new c71(e71Var2));
                } else {
                    c71Var.d.add(e71Var2);
                }
            }
        }
        return arrayList6;
    }

    public static e71 v(ArrayList arrayList) {
        int i10;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ArrayList arrayList2 = ((c71) obj).d;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                e71 e71Var = (e71) obj2;
                if (e71Var.b && e71Var.b()) {
                    return e71Var;
                }
            }
        }
        int size3 = arrayList.size();
        e71 e71Var2 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            ArrayList arrayList3 = ((c71) obj3).d;
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                e71 e71Var3 = (e71) obj4;
                if (!e71Var3.b && Y(e71Var3.m) && (e71Var2 == null || (i10 = e71Var3.i * e71Var3.j) > (i11 = e71Var2.i * e71Var2.j) || (i10 == i11 && e71Var3.l < e71Var2.l))) {
                    e71Var2 = e71Var3;
                }
            }
        }
        if (e71Var2 == null) {
            int size5 = arrayList.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList.get(i16);
                i16++;
                ArrayList arrayList4 = ((c71) obj5).d;
                int size6 = arrayList4.size();
                int i17 = 0;
                while (i17 < size6) {
                    Object obj6 = arrayList4.get(i17);
                    i17++;
                    e71 e71Var4 = (e71) obj6;
                    if (e71Var2 == null || e71Var2.i * e71Var2.j > e71Var4.i * e71Var4.j || e71Var4.l < e71Var2.l) {
                        e71Var2 = e71Var4;
                    }
                }
            }
        }
        return e71Var2;
    }

    public static e71 w(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((c71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                e71 e71Var = (e71) obj2;
                if (e71Var.b()) {
                    return e71Var;
                }
            }
        }
        int size3 = arrayList.size();
        e71 e71Var2 = null;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ArrayList arrayList3 = ((c71) obj3).d;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                e71 e71Var3 = (e71) obj4;
                if (!e71Var3.b && (e71Var2 == null || e71Var2.i * e71Var2.j > e71Var3.i * e71Var3.j || e71Var3.l < e71Var2.l)) {
                    if (e71Var3.i <= 900 && e71Var3.j <= 900) {
                        e71Var2 = e71Var3;
                    }
                }
            }
        }
        if (e71Var2 == null) {
            int size5 = arrayList.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj5 = arrayList.get(i14);
                i14++;
                ArrayList arrayList4 = ((c71) obj5).d;
                int size6 = arrayList4.size();
                int i15 = 0;
                while (i15 < size6) {
                    Object obj6 = arrayList4.get(i15);
                    i15++;
                    e71 e71Var4 = (e71) obj6;
                    if (e71Var2 == null || e71Var2.i * e71Var2.j > e71Var4.i * e71Var4.j || e71Var4.l < e71Var2.l) {
                        e71Var2 = e71Var4;
                    }
                }
            }
        }
        return e71Var2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.exoplayer.hls.HlsMediaSource$Factory] */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.media3.exoplayer.dash.DashMediaSource$Factory] */
    public final u2.a A(Uri uri, String str, long j3) {
        b2.d0 d0Var;
        b2.f0 f0Var;
        n2.m s10;
        n2.m mVar;
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        b2.y yVar = new b2.y();
        b2.b0 b0Var = new b2.b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.e;
        b2.d0 d0Var2 = new b2.d0();
        b2.g0 g0Var = b2.g0.d;
        e2.d.g(b0Var.b == null || b0Var.a != null);
        if (uri != null) {
            b2.c0 c0Var = b0Var.a != null ? new b2.c0(b0Var) : null;
            d0Var = d0Var2;
            f0Var = new b2.f0(uri, null, c0Var, null, list, null, a1Var, -9223372036854775807L);
        } else {
            d0Var = d0Var2;
            f0Var = null;
        }
        b2.k0 k0Var = new b2.k0("", new b2.a0(yVar), f0Var, new b2.e0(d0Var), b2.n0.K, g0Var);
        if (j3 == 0) {
            str.getClass();
            if (str.equals("hls")) {
                if (this.Y == null) {
                    this.Y = new u2.e0(extendedDefaultDataSourceFactory) { // from class: androidx.media3.exoplayer.hls.HlsMediaSource$Factory
                        public final u4 a;
                        public c b;
                        public a c;
                        public final t h = new t(4);
                        public final d e = new d();
                        public final sw0 f = p2.c.E;
                        public final a i = new a(26);
                        public final b g = new b(23);
                        public final int k = 1;
                        public final long l = -9223372036854775807L;
                        public final boolean j = true;
                        public boolean d = true;

                        {
                            this.a = new u4(extendedDefaultDataSourceFactory, 8);
                        }

                        @Override // u2.e0
                        public final e0 b(boolean z10) {
                            this.d = z10;
                            return this;
                        }

                        @Override // u2.e0
                        public final e0 d(a aVar) {
                            this.c = aVar;
                            return this;
                        }

                        @Override // u2.e0
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
                                sVar = new z0(10, sVar, list2);
                            }
                            m w10 = this.h.w(k0Var2);
                            this.f.getClass();
                            u4 u4Var = this.a;
                            a aVar2 = this.i;
                            return new l(k0Var2, u4Var, cVar2, this.g, w10, aVar2, new p2.c(u4Var, aVar2, sVar), this.l, this.j, this.k);
                        }

                        @Override // u2.e0
                        public final e0 c() {
                            return this;
                        }
                    };
                }
                return a(k0Var);
            }
            if (str.equals("dash")) {
                if (this.X == null) {
                    this.X = new u2.e0(extendedDefaultDataSourceFactory) { // from class: androidx.media3.exoplayer.dash.DashMediaSource$Factory
                        public final a5.a a;
                        public final g b;
                        public final t c;
                        public final b d;
                        public final a e;
                        public final long f;
                        public final long g;

                        {
                            a5.a aVar = new a5.a(extendedDefaultDataSourceFactory);
                            this.a = aVar;
                            this.b = extendedDefaultDataSourceFactory;
                            this.c = new t(4);
                            this.e = new a(26);
                            this.f = 30000L;
                            this.g = 5000000L;
                            this.d = new b(23);
                            ((p) aVar.d).b = true;
                        }

                        @Override // u2.e0
                        public final u2.a a(k0 k0Var2) {
                            k0Var2.b.getClass();
                            e eVar = new e();
                            List list2 = k0Var2.b.e;
                            return new l2.g(k0Var2, this.b, !list2.isEmpty() ? new z0(17, eVar, list2) : eVar, this.a, this.d, this.c.w(k0Var2), this.e, this.f, this.g);
                        }

                        @Override // u2.e0
                        public final e0 b(boolean z10) {
                            ((p) this.a.d).b = z10;
                            return this;
                        }

                        @Override // u2.e0
                        public final e0 c() {
                            ((p) this.a.d).getClass();
                            return this;
                        }

                        @Override // u2.e0
                        public final e0 d(a aVar) {
                            p pVar = (p) this.a.d;
                            pVar.getClass();
                            pVar.c = aVar;
                            return this;
                        }
                    };
                }
                return a(k0Var);
            }
            if (this.Z == null) {
                this.Z = new u2.v0(extendedDefaultDataSourceFactory, new c3.m());
            }
            return this.Z.a(k0Var);
        }
        bi.p1 p1Var = new bi.p1(this, j3, 7);
        rg.p2 p2Var = new rg.p2(new c3.m(), 4);
        Object obj = new Object();
        rb.a aVar = new rb.a(26);
        f0Var.getClass();
        k0Var.b.getClass();
        b2.c0 c0Var2 = k0Var.b.c;
        if (c0Var2 == null) {
            mVar = n2.m.z;
        } else {
            synchronized (obj) {
                try {
                    s10 = !c0Var2.equals(null) ? m2.t.s(c0Var2) : null;
                    s10.getClass();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            mVar = s10;
        }
        return new u2.w0(k0Var, p1Var, p2Var, mVar, aVar, 1048576, null);
    }

    public void B() {
        this.I = false;
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.X(false);
        }
        i2.f0 f0Var2 = this.e;
        if (f0Var2 != null) {
            f0Var2.X(false);
        }
        if (this.K != null) {
            this.a0.removeCallbacksAndMessages(null);
            this.K.onVisualizerUpdate(false, true, null);
        }
    }

    public void C() {
        this.I = true;
        if (!this.x || (this.H && this.G)) {
            i2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.X(true);
            }
            i2.f0 f0Var2 = this.e;
            if (f0Var2 != null) {
                f0Var2.X(true);
                return;
            }
            return;
        }
        i2.f0 f0Var3 = this.d;
        if (f0Var3 != null) {
            f0Var3.X(false);
        }
        i2.f0 f0Var4 = this.e;
        if (f0Var4 != null) {
            f0Var4.X(false);
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

    public final void F(ArrayList arrayList, c71 c71Var) {
        ArrayList arrayList2;
        this.N = arrayList;
        this.O = c71Var;
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
        this.d0 = (c71Var == null || (arrayList2 = this.N) == null) ? -1 : arrayList2.indexOf(c71Var);
        R(true, c71Var);
        if (this.c0) {
            this.d0 = -1;
        }
    }

    public final void G(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        u2.w wVar = null;
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
        u2.w wVar2 = null;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            u2.w wVar3 = new u2.w(A(uri3, str3, 0L));
            if (i10 == 0) {
                wVar = wVar3;
            } else {
                wVar2 = wVar3;
            }
        }
        this.d.q1(wVar, true);
        this.d.b();
        this.e.q1(wVar2, true);
        this.e.b();
        k0.add(Integer.valueOf(this.a));
    }

    public final void H() {
        k0.remove(Integer.valueOf(this.a));
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.U0();
            this.d = null;
        }
        i2.f0 f0Var2 = this.e;
        if (f0Var2 != null) {
            f0Var2.U0();
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
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.s1(z10 ? i2.p1.d : i2.p1.c);
            this.d.W0(5, j3);
        }
    }

    public final void M(long j3, boolean z10, Runnable runnable) {
        if (this.d != null) {
            if (runnable != null) {
                this.i0.add(runnable);
            }
            this.d.s1(z10 ? i2.p1.d : i2.p1.c);
            this.d.W0(5, j3);
        }
    }

    public final void N(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            i2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.j(z10 ? 2 : 0);
            }
        }
    }

    public final void O(boolean z10) {
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.U(z10 ? 0.0f : 1.0f);
        }
        i2.f0 f0Var2 = this.e;
        if (f0Var2 != null) {
            f0Var2.U(z10 ? 0.0f : 1.0f);
        }
    }

    public void P(boolean z10) {
        this.I = z10;
        if (z10 && this.x && (!this.H || !this.G)) {
            i2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.X(false);
            }
            i2.f0 f0Var2 = this.e;
            if (f0Var2 != null) {
                f0Var2.X(false);
                return;
            }
            return;
        }
        this.w = z10;
        i2.f0 f0Var3 = this.d;
        if (f0Var3 != null) {
            f0Var3.X(z10);
        }
        i2.f0 f0Var4 = this.e;
        if (f0Var4 != null) {
            f0Var4.X(z10);
        }
    }

    public void Q(float f7) {
        try {
            i2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.f(new b2.v0(f7, f7 > 1.0f ? 0.98f : 1.0f));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(boolean z10, c71 c71Var) {
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        b2.m1 m1Var;
        int i12;
        c71 c71Var2;
        i2.f0 f0Var = this.d;
        if (f0Var == null) {
            return;
        }
        boolean i02 = f0Var.i0();
        long J0 = this.d.J0();
        if (!z10) {
            this.g0 = J0;
            this.f0 = this.d.getDuration();
        }
        this.O = c71Var;
        x2.p pVar = this.f;
        boolean z13 = true;
        int i13 = 0;
        if (c71Var == null) {
            Uri z14 = z(this.N);
            int i14 = 0;
            while (true) {
                if (i14 >= t()) {
                    c71Var2 = null;
                    break;
                }
                c71 u10 = u(i14);
                if (u10.a) {
                    c71Var2 = u10;
                    break;
                }
                i14++;
            }
            if (c71Var2 != null) {
                ArrayList arrayList = c71Var2.d;
                if (arrayList.size() == 1 && ((e71) arrayList.get(0)).b()) {
                    this.e0 = false;
                    this.c0 = true;
                    this.O = c71Var2;
                    this.d.q1(A(c71Var2.a().d, "other", 0L), false);
                    z11 = i02;
                }
            }
            if (z14 != null) {
                this.c0 = false;
                x2.i e7 = pVar.e();
                e7.getClass();
                x2.h hVar = new x2.h(e7);
                hVar.c();
                pVar.b(new x2.i(hVar));
                if (this.e0) {
                    z13 = false;
                } else {
                    this.e0 = true;
                    this.d.q1(A(z14, "hls", 0L), false);
                }
            } else {
                c71 r10 = r(Boolean.TRUE);
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
            ArrayList arrayList2 = c71Var.d;
            this.c0 = false;
            if (arrayList2.isEmpty()) {
                return;
            }
            Uri z15 = arrayList2.size() > 1 ? z(this.N) : null;
            if (z15 == null || arrayList2.size() == 1 || pVar.c == null) {
                z11 = i02;
                this.e0 = false;
                this.d.q1(A(c71Var.a().d, "other", 0L), false);
            } else {
                if (this.e0) {
                    z13 = false;
                } else {
                    this.e0 = true;
                    this.d.q1(A(z15, "hls", 0L), false);
                }
                x2.i e10 = pVar.e();
                e10.getClass();
                x2.h hVar2 = new x2.h(e10);
                hVar2.c();
                int size = arrayList2.size();
                int i15 = 0;
                while (i15 < size) {
                    int i16 = i15 + 1;
                    e71 e71Var = (e71) arrayList2.get(i15);
                    try {
                        int indexOf = this.P.indexOf(e71Var);
                        x2.t tVar = pVar.c;
                        int i17 = 0;
                        while (i17 < tVar.a) {
                            u2.o1 o1Var = tVar.c[i17];
                            z12 = i02;
                            while (i13 < o1Var.a) {
                                try {
                                    b2.l1 a2 = o1Var.a(i13);
                                    i10 = size;
                                    i11 = i16;
                                    int i18 = 0;
                                    while (i18 < a2.a) {
                                        try {
                                            b2.s sVar = a2.d[i18];
                                            u2.o1 o1Var2 = o1Var;
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
                                            if (sVar.y == e71Var.i && sVar.z == e71Var.j) {
                                                m1Var = new b2.m1(a2, i18);
                                                break;
                                            } else {
                                                i18++;
                                                o1Var = o1Var2;
                                                indexOf = i19;
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
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
                                } catch (Exception e12) {
                                    e = e12;
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
                    } catch (Exception e13) {
                        e = e13;
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
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.K0(new b2.e(0, 0, i10 == 0 ? 2 : 1, 1, 0, false), false);
        }
        i2.f0 f0Var2 = this.e;
        if (f0Var2 != null) {
            f0Var2.K0(new b2.e(0, 0, i10 == 0 ? 2 : 1, 1, 0, false), true);
        }
    }

    public final void T(Surface surface) {
        if (this.s == surface) {
            return;
        }
        this.s = surface;
        i2.f0 f0Var = this.d;
        if (f0Var == null) {
            return;
        }
        f0Var.n(surface);
    }

    public final void U(SurfaceView surfaceView) {
        if (this.r == surfaceView) {
            return;
        }
        this.r = surfaceView;
        i2.f0 f0Var = this.d;
        if (f0Var == null) {
            return;
        }
        f0Var.u1(surfaceView);
    }

    public final void V(TextureView textureView) {
        if (this.n == textureView) {
            return;
        }
        this.n = textureView;
        i2.f0 f0Var = this.d;
        if (f0Var == null) {
            return;
        }
        f0Var.v1(textureView);
    }

    public final void W(float f7) {
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.U(f7);
        }
        i2.f0 f0Var2 = this.e;
        if (f0Var2 != null) {
            f0Var2.U(f7);
        }
    }

    public final void X(DispatchQueue dispatchQueue) {
        this.b = dispatchQueue;
        if (dispatchQueue == null) {
            this.d.m0 = null;
        } else {
            this.d.m0 = new org.telegram.messenger.b1(dispatchQueue);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.playerDidStartPlaying || ((g71) objArr[0]) == this || !y() || this.y) {
            return;
        }
        B();
    }

    @Override // j2.b
    public final void g(j2.a aVar, int i10) {
        if (i10 == 1) {
            d71 d71Var = this.J;
            if (d71Var != null) {
                d71Var.onSeekFinished(aVar);
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
        i2.l.a(i11, 0, "bufferForPlaybackMs", "0");
        i2.l.a(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i2.l.a(50000, i11, "minBufferMs", "bufferForPlaybackMs");
        i2.l.a(50000, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i2.l.a(50000, 50000, "maxBufferMs", "minBufferMs");
        i2.l.a(0, 0, "backBufferDurationMs", "0");
        i2.l lVar = new i2.l(dVar, i11, i10);
        if (this.d == null) {
            i2.m a71Var = this.K != null ? new a71(ApplicationLoader.applicationContext, this) : new i2.m(ApplicationLoader.applicationContext);
            a71Var.c = 1;
            i2.q qVar = new i2.q(ApplicationLoader.applicationContext);
            e2.d.g(!qVar.v);
            qVar.c = new i2.p(a71Var, 2);
            x2.p pVar = this.f;
            e2.d.g(!qVar.v);
            pVar.getClass();
            qVar.e = new i2.p(pVar, 1);
            e2.d.g(!qVar.v);
            qVar.f = new i2.p(lVar, 0);
            e2.d.g(!qVar.v);
            qVar.v = true;
            i2.f0 f0Var = new i2.f0(qVar);
            this.d = f0Var;
            j2.f fVar = f0Var.s;
            fVar.getClass();
            fVar.f.a(this);
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
            i2.q qVar2 = new i2.q(ApplicationLoader.applicationContext);
            x2.p pVar2 = this.f;
            e2.d.g(!qVar2.v);
            pVar2.getClass();
            qVar2.e = new i2.p(pVar2, 1);
            e2.d.g(!qVar2.v);
            qVar2.f = new i2.p(lVar, 0);
            e2.d.g(!qVar2.v);
            qVar2.v = true;
            i2.f0 f0Var2 = new i2.f0(qVar2);
            this.e = f0Var2;
            f0Var2.m.a(new y61(this));
            this.e.X(this.w);
        }
    }

    public final long j() {
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            return this.v ? f0Var.c0() : f0Var.getDuration();
        }
        return 0L;
    }

    public final pf.g l(String str, String str2, String str3) {
        if (this.N == null) {
            if (this.Q == null) {
                return null;
            }
            String i10 = org.telegram.ui.Cells.p6.i("/mtproto_", str);
            String queryParameter = this.Q.getQueryParameter("mime");
            pf.e eVar = new pf.e(this.Q, TextUtils.isEmpty(queryParameter) ? "video/mp4" : queryParameter, i10);
            eVar.e = str2;
            eVar.f = str3;
            return new pf.g(new pf.f(eVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ArrayList arrayList3 = ((c71) obj).d;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                e71 e71Var = (e71) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(e71Var.c);
                String sb3 = sb2.toString();
                TLRPC.Document document = e71Var.g;
                String str4 = document != null ? document.mime_type : null;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                pf.e eVar2 = new pf.e(e71Var.d, str4, sb3);
                eVar2.e = str2;
                eVar2.f = str3;
                int i13 = e71Var.i;
                int i14 = e71Var.j;
                eVar2.a = i13;
                eVar2.b = i14;
                arrayList.add(new pf.f(eVar2));
                arrayList2 = arrayList4;
            }
        }
        return new pf.g(arrayList);
    }

    public final TLRPC.Document m() {
        ArrayList arrayList;
        i2.f0 f0Var = this.d;
        if (f0Var == null) {
            return null;
        }
        f0Var.B1();
        b2.s sVar = f0Var.Q;
        if (sVar == null || sVar.n == 0 || (arrayList = this.N) == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((c71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                e71 e71Var = (e71) obj2;
                if (e71Var.c == sVar.n) {
                    return e71Var.g;
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
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            return f0Var.J0();
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
                i2.f0 f0Var = this.d;
                if (f0Var != null) {
                    f0Var.B1();
                    b2.s sVar = f0Var.Q;
                    if (sVar != null) {
                        for (int i11 = 0; i11 < t(); i11++) {
                            c71 u10 = u(i11);
                            if (!u10.a && sVar.y == u10.b && sVar.z == u10.c && sVar.j == ((int) Math.floor(((e71) u10.d.get(0)).l * 8.0d))) {
                                return i11;
                            }
                        }
                    }
                }
                return -1;
            } catch (Exception e7) {
                FileLog.e(e7);
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
        AndroidUtilities.runOnUIThread(new jn0(22, this, u0Var));
    }

    @Override // b2.z0
    public final void onPlayerStateChanged(boolean z10, int i10) {
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            boolean u10 = f0Var.u();
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
            z61 z61Var = this.K;
            if (z61Var != null) {
                z61Var.onVisualizerUpdate(false, true, null);
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
        d71 d71Var = this.J;
        if (d71Var != null) {
            d71Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override // j2.b
    public final void onSeekStarted(j2.a aVar) {
        d71 d71Var = this.J;
        if (d71Var != null) {
            d71Var.onSeekStarted(aVar);
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
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            return f0Var.getDuration();
        }
        return 0L;
    }

    public final di.n8 q(di.n8 n8Var) {
        if (n8Var == null) {
            n8Var = new di.n8();
        }
        try {
            i2.f0 f0Var = this.d;
            f0Var.B1();
            MediaFormat mediaFormat = ((r2.r) f0Var.g[0]).d0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    n8Var.b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    n8Var.a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return n8Var;
    }

    public final c71 r(Boolean bool) {
        c71 c71Var = null;
        for (int i10 = 0; i10 < t(); i10++) {
            c71 u10 = u(i10);
            if (u10.a == bool.booleanValue() && (c71Var == null || c71Var.b * c71Var.c < u10.b * u10.c)) {
                c71Var = u10;
            }
        }
        return c71Var;
    }

    public final int t() {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final c71 u(int i10) {
        ArrayList arrayList = this.N;
        return arrayList == null ? r(Boolean.FALSE) : (i10 < 0 || i10 >= arrayList.size()) ? r(Boolean.FALSE) : (c71) this.N.get(i10);
    }

    public final boolean x() {
        i2.f0 f0Var = this.d;
        if (f0Var == null) {
            return false;
        }
        f0Var.B1();
        return f0Var.Z == 0.0f;
    }

    public final boolean y() {
        if (this.x && this.I) {
            return true;
        }
        i2.f0 f0Var = this.d;
        return f0Var != null && f0Var.u();
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
            ArrayList arrayList3 = ((c71) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                e71 e71Var = (e71) obj2;
                long j3 = e71Var.c;
                Uri uri = e71Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j3, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(e71Var.e, e71Var.f);
                if (e71Var.f != null) {
                    this.P.add(e71Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(e71Var.l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(e71Var.i);
                    sb3.append("x");
                    sb3.append(e71Var.j);
                    String str2 = e71Var.m;
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
                    if (e71Var.b() && e71Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(e71Var.c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(e71Var.a);
                    sb3.append("\"\n");
                    if (e71Var.c()) {
                        sb3.append(e71Var.f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(e71Var.e);
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

    public g71(boolean z10, boolean z11) {
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
        x2.p pVar = new x2.p(ApplicationLoader.applicationContext, new rb.a(25));
        this.f = pVar;
        if (z11) {
            x2.i e7 = pVar.e();
            e7.getClass();
            x2.h hVar = new x2.h(e7);
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
    public final /* synthetic */ void a(i2.h hVar) {
    }

    @Override // j2.b
    public final /* synthetic */ void c(u2.b0 b0Var) {
    }

    @Override // j2.b
    public final /* synthetic */ void d(b2.x1 x1Var) {
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
    public final /* synthetic */ void b(b2.b1 b1Var, pf.b bVar) {
    }

    @Override // j2.b
    public final /* synthetic */ void e(j2.a aVar, u2.b0 b0Var) {
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
