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
import b2.o0;
import g2.g;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l2.f;
import l2.h;
import m.g3;
import mi.q;
import n2.n;
import o2.c;
import o2.l;
import oa.d;
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
import org.telegram.ui.fk0;
import p2.e;
import pb.a;
import t7.u;
import u2.f0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public class c81 implements b2.d1, b2.z1, j2.b, NotificationCenter.NotificationCenterDelegate {
    public static int j0;
    public static final HashSet k0 = new HashSet();
    public static HashMap l0;
    public boolean E;
    public Uri F;
    public boolean G;
    public boolean H;
    public boolean I;
    public z71 J;
    public v71 K;
    public int L;
    public boolean M;
    public ArrayList N;
    public y71 O;
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
    public u2.y0 Z;
    public final int a;
    public final Handler a0;
    public DispatchQueue b;
    public final boolean b0;
    public boolean c;
    public boolean c0;
    public i2.i0 d;
    public int d0;
    public i2.i0 e;
    public boolean e0;
    public final x2.n f;
    public long f0;
    public long g0;
    public final ExtendedDefaultDataSourceFactory h;
    public org.telegram.ui.qq0 h0;
    public final ArrayList i0;
    public TextureView n;
    public SurfaceView r;
    public Surface s;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    public c81() {
        this(true, false);
    }

    public static void I(MessageObject messageObject, boolean z10) {
        if (messageObject == null) {
            return;
        }
        ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z10).apply();
    }

    public static void J(y71 y71Var, MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (y71Var == null) {
            edit.remove(dialogId + "_" + id2 + "q2");
        } else {
            String str = dialogId + "_" + id2 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(y71Var.b);
            sb2.append("x");
            sb2.append(y71Var.c);
            sb2.append(y71Var.a ? "s" : "");
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

    public static a81 k(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((y71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                a81 a81Var = (a81) obj2;
                if (a81Var.b()) {
                    return a81Var;
                }
            }
        }
        return null;
    }

    public static ArrayList s(int i10, TLRPC.Document document, ArrayList arrayList, int i11, boolean z10) {
        y71 y71Var;
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
                    a81 d = a81.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.id), i11, z10);
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
            a81 a81Var = (a81) arrayList3.get(i14);
            String str2 = a81Var.m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(a81Var.m) && !"hevc".equals(a81Var.m) && !"h265".equals(a81Var.m) && !"vp9".equals(a81Var.m)) || Y(a81Var.m))) {
                arrayList4.add(a81Var);
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
            a81 a81Var2 = (a81) obj;
            if (a81Var2.b) {
                arrayList6.add(new y71(a81Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size2) {
                        y71Var = null;
                        break;
                    }
                    Object obj2 = arrayList6.get(i16);
                    i16++;
                    y71Var = (y71) obj2;
                    if (!y71Var.a && y71Var.b == a81Var2.i && y71Var.c == a81Var2.j) {
                        break;
                    }
                }
                if (y71Var == null || SharedConfig.debugVideoQualities) {
                    arrayList6.add(new y71(a81Var2));
                } else {
                    y71Var.d.add(a81Var2);
                }
            }
        }
        return arrayList6;
    }

    public static a81 v(ArrayList arrayList) {
        int i10;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ArrayList arrayList2 = ((y71) obj).d;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                a81 a81Var = (a81) obj2;
                if (a81Var.b && a81Var.b()) {
                    return a81Var;
                }
            }
        }
        int size3 = arrayList.size();
        a81 a81Var2 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            ArrayList arrayList3 = ((y71) obj3).d;
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                a81 a81Var3 = (a81) obj4;
                if (!a81Var3.b && Y(a81Var3.m) && (a81Var2 == null || (i10 = a81Var3.i * a81Var3.j) > (i11 = a81Var2.i * a81Var2.j) || (i10 == i11 && a81Var3.l < a81Var2.l))) {
                    a81Var2 = a81Var3;
                }
            }
        }
        if (a81Var2 == null) {
            int size5 = arrayList.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList.get(i16);
                i16++;
                ArrayList arrayList4 = ((y71) obj5).d;
                int size6 = arrayList4.size();
                int i17 = 0;
                while (i17 < size6) {
                    Object obj6 = arrayList4.get(i17);
                    i17++;
                    a81 a81Var4 = (a81) obj6;
                    if (a81Var2 == null || a81Var2.i * a81Var2.j > a81Var4.i * a81Var4.j || a81Var4.l < a81Var2.l) {
                        a81Var2 = a81Var4;
                    }
                }
            }
        }
        return a81Var2;
    }

    public static a81 w(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((y71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                a81 a81Var = (a81) obj2;
                if (a81Var.b()) {
                    return a81Var;
                }
            }
        }
        int size3 = arrayList.size();
        a81 a81Var2 = null;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ArrayList arrayList3 = ((y71) obj3).d;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                a81 a81Var3 = (a81) obj4;
                if (!a81Var3.b && (a81Var2 == null || a81Var2.i * a81Var2.j > a81Var3.i * a81Var3.j || a81Var3.l < a81Var2.l)) {
                    if (a81Var3.i <= 900 && a81Var3.j <= 900) {
                        a81Var2 = a81Var3;
                    }
                }
            }
        }
        if (a81Var2 == null) {
            int size5 = arrayList.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj5 = arrayList.get(i14);
                i14++;
                ArrayList arrayList4 = ((y71) obj5).d;
                int size6 = arrayList4.size();
                int i15 = 0;
                while (i15 < size6) {
                    Object obj6 = arrayList4.get(i15);
                    i15++;
                    a81 a81Var4 = (a81) obj6;
                    if (a81Var2 == null || a81Var2.i * a81Var2.j > a81Var4.i * a81Var4.j || a81Var4.l < a81Var2.l) {
                        a81Var2 = a81Var4;
                    }
                }
            }
        }
        return a81Var2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.exoplayer.hls.HlsMediaSource$Factory] */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.media3.exoplayer.dash.DashMediaSource$Factory] */
    public final u2.a A(Uri uri, String str, long j10) {
        b2.h0 h0Var;
        b2.j0 j0Var;
        n2.n x10;
        n2.n nVar;
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        b2.c0 c0Var = new b2.c0();
        b2.f0 f0Var = new b2.f0();
        List list = Collections.EMPTY_LIST;
        e9.x1 x1Var = e9.x1.e;
        b2.h0 h0Var2 = new b2.h0();
        b2.k0 k0Var = b2.k0.d;
        v7.u6.p(f0Var.b == null || f0Var.a != null);
        if (uri != null) {
            b2.g0 g0Var = f0Var.a != null ? new b2.g0(f0Var) : null;
            h0Var = h0Var2;
            j0Var = new b2.j0(uri, null, g0Var, null, list, null, x1Var, -9223372036854775807L);
        } else {
            h0Var = h0Var2;
            j0Var = null;
        }
        b2.o0 o0Var = new b2.o0("", new b2.e0(c0Var), j0Var, new b2.i0(h0Var), b2.r0.L, k0Var);
        if (j10 == 0) {
            str.getClass();
            if (str.equals("hls")) {
                if (this.Y == null) {
                    this.Y = new u2.f0(extendedDefaultDataSourceFactory) { // from class: androidx.media3.exoplayer.hls.HlsMediaSource$Factory
                        public final f a;
                        public c b;
                        public u c;
                        public final g3 i = new g3(5);
                        public final a f = new a(19);
                        public final fk0 g = e.J;
                        public final d j = new d(27);
                        public final d h = new d(24);
                        public final int l = 1;
                        public final long m = -9223372036854775807L;
                        public final boolean k = true;
                        public int e = 3;
                        public boolean d = true;

                        {
                            this.a = new f(extendedDefaultDataSourceFactory, 6);
                        }

                        @Override // u2.f0
                        public final f0 b(boolean z10) {
                            this.d = z10;
                            return this;
                        }

                        @Override // u2.f0
                        public final f0 c(int i10) {
                            this.e = i10;
                            return this;
                        }

                        @Override // u2.f0
                        public final f0 d(u uVar) {
                            this.c = uVar;
                            return this;
                        }

                        @Override // u2.f0
                        /* renamed from: e, reason: merged with bridge method [inline-methods] */
                        public final l a(o0 o0Var2) {
                            o0Var2.b.getClass();
                            if (this.b == null) {
                                c cVar = new c();
                                cVar.a = new u(28);
                                cVar.c = 3;
                                this.b = cVar;
                            }
                            u uVar = this.c;
                            if (uVar != null) {
                                this.b.a = uVar;
                            }
                            c cVar2 = this.b;
                            cVar2.b = this.d;
                            cVar2.c = this.e;
                            List list2 = o0Var2.b.e;
                            boolean isEmpty = list2.isEmpty();
                            p2.u uVar2 = this.f;
                            if (!isEmpty) {
                                uVar2 = new n2.e(13, uVar2, list2);
                            }
                            n B = this.i.B(o0Var2);
                            this.g.getClass();
                            f fVar = this.a;
                            d dVar = this.j;
                            return new l(o0Var2, fVar, cVar2, this.h, B, dVar, new e(fVar, dVar, uVar2), this.m, this.k, this.l);
                        }
                    };
                }
                return a(o0Var);
            }
            if (str.equals("dash")) {
                if (this.X == null) {
                    this.X = new u2.f0(extendedDefaultDataSourceFactory) { // from class: androidx.media3.exoplayer.dash.DashMediaSource$Factory
                        public final a5.a a;
                        public final g b;
                        public final g3 c;
                        public final d d;
                        public final d e;
                        public final long f;
                        public final long g;

                        {
                            a5.a aVar = new a5.a(extendedDefaultDataSourceFactory);
                            this.a = aVar;
                            this.b = extendedDefaultDataSourceFactory;
                            this.c = new g3(5);
                            this.e = new d(27);
                            this.f = 30000L;
                            this.g = 5000000L;
                            this.d = new d(24);
                            ((c5.f) aVar.d).b = true;
                        }

                        @Override // u2.f0
                        public final u2.a a(o0 o0Var2) {
                            o0Var2.b.getClass();
                            m2.e eVar = new m2.e();
                            List list2 = o0Var2.b.e;
                            return new h(o0Var2, this.b, !list2.isEmpty() ? new q(22, eVar, list2) : eVar, this.a, this.d, this.c.B(o0Var2), this.e, this.f, this.g);
                        }

                        @Override // u2.f0
                        public final f0 b(boolean z10) {
                            ((c5.f) this.a.d).b = z10;
                            return this;
                        }

                        @Override // u2.f0
                        public final f0 c(int i10) {
                            ((c5.f) this.a.d).a = i10;
                            return this;
                        }

                        @Override // u2.f0
                        public final f0 d(u uVar) {
                            c5.f fVar = (c5.f) this.a.d;
                            fVar.getClass();
                            fVar.c = uVar;
                            return this;
                        }
                    };
                }
                return a(o0Var);
            }
            if (this.Z == null) {
                this.Z = new u2.y0(extendedDefaultDataSourceFactory, new c3.m());
            }
            return this.Z.a(o0Var);
        }
        ci.d1 d1Var = new ci.d1(this, j10, 7);
        qg.h0 h0Var3 = new qg.h0(new c3.m(), 17);
        Object obj = new Object();
        oa.d dVar = new oa.d(27);
        j0Var.getClass();
        o0Var.b.getClass();
        b2.g0 g0Var2 = o0Var.b.c;
        if (g0Var2 == null) {
            nVar = n2.n.z;
        } else {
            synchronized (obj) {
                try {
                    x10 = !g0Var2.equals(null) ? m.g3.x(g0Var2) : null;
                    x10.getClass();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            nVar = x10;
        }
        return new u2.z0(o0Var, d1Var, h0Var3, nVar, dVar, 1048576, null);
    }

    public void B() {
        this.I = false;
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.X(false);
        }
        i2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.X(false);
        }
        if (this.K != null) {
            this.a0.removeCallbacksAndMessages(null);
            this.K.onVisualizerUpdate(false, true, null);
        }
    }

    public void C() {
        this.I = true;
        if (!this.x || (this.H && this.G)) {
            i2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.X(true);
            }
            i2.i0 i0Var2 = this.e;
            if (i0Var2 != null) {
                i0Var2.X(true);
                return;
            }
            return;
        }
        i2.i0 i0Var3 = this.d;
        if (i0Var3 != null) {
            i0Var3.X(false);
        }
        i2.i0 i0Var4 = this.e;
        if (i0Var4 != null) {
            i0Var4.X(false);
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
        this.d.b();
    }

    public final void F(ArrayList arrayList, y71 y71Var) {
        ArrayList arrayList2;
        this.N = arrayList;
        this.O = y71Var;
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
        this.d0 = (y71Var == null || (arrayList2 = this.N) == null) ? -1 : arrayList2.indexOf(y71Var);
        R(true, y71Var);
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
        this.d.b();
        this.e.u1(xVar2, true);
        this.e.b();
        k0.add(Integer.valueOf(this.a));
    }

    public final void H() {
        k0.remove(Integer.valueOf(this.a));
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.X0();
            this.d = null;
        }
        i2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.X0();
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
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.w1(z10 ? i2.s1.d : i2.s1.c);
            this.d.Z0(5, j10);
        }
    }

    public final void M(long j10, boolean z10, Runnable runnable) {
        if (this.d != null) {
            if (runnable != null) {
                this.i0.add(runnable);
            }
            this.d.w1(z10 ? i2.s1.d : i2.s1.c);
            this.d.Z0(5, j10);
        }
    }

    public final void N(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            i2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.j(z10 ? 2 : 0);
            }
        }
    }

    public final void O(boolean z10) {
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.U(z10 ? 0.0f : 1.0f);
        }
        i2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.U(z10 ? 0.0f : 1.0f);
        }
    }

    public void P(boolean z10) {
        this.I = z10;
        if (z10 && this.x && (!this.H || !this.G)) {
            i2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.X(false);
            }
            i2.i0 i0Var2 = this.e;
            if (i0Var2 != null) {
                i0Var2.X(false);
                return;
            }
            return;
        }
        this.w = z10;
        i2.i0 i0Var3 = this.d;
        if (i0Var3 != null) {
            i0Var3.X(z10);
        }
        i2.i0 i0Var4 = this.e;
        if (i0Var4 != null) {
            i0Var4.X(z10);
        }
    }

    public void Q(float f7) {
        try {
            i2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.f(new b2.z0(f7, f7 > 1.0f ? 0.98f : 1.0f));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(boolean z10, y71 y71Var) {
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        b2.q1 q1Var;
        int i12;
        y71 y71Var2;
        i2.i0 i0Var = this.d;
        if (i0Var == null) {
            return;
        }
        boolean j02 = i0Var.j0();
        long M0 = this.d.M0();
        if (!z10) {
            this.g0 = M0;
            this.f0 = this.d.getDuration();
        }
        this.O = y71Var;
        x2.n nVar = this.f;
        boolean z13 = true;
        int i13 = 0;
        if (y71Var == null) {
            Uri z14 = z(this.N);
            int i14 = 0;
            while (true) {
                if (i14 >= t()) {
                    y71Var2 = null;
                    break;
                }
                y71 u10 = u(i14);
                if (u10.a) {
                    y71Var2 = u10;
                    break;
                }
                i14++;
            }
            if (y71Var2 != null) {
                ArrayList arrayList = y71Var2.d;
                if (arrayList.size() == 1 && ((a81) arrayList.get(0)).b()) {
                    this.e0 = false;
                    this.c0 = true;
                    this.O = y71Var2;
                    this.d.u1(A(y71Var2.a().d, "other", 0L), false);
                    z11 = j02;
                }
            }
            if (z14 != null) {
                this.c0 = false;
                x2.i j10 = nVar.j();
                j10.getClass();
                x2.h hVar = new x2.h(j10);
                hVar.c();
                nVar.b(new x2.i(hVar));
                if (this.e0) {
                    z13 = false;
                } else {
                    this.e0 = true;
                    this.d.u1(A(z14, "hls", 0L), false);
                }
            } else {
                y71 r10 = r(Boolean.TRUE);
                if (r10 == null) {
                    r10 = r(Boolean.FALSE);
                }
                if (r10 == null || r10.d.isEmpty()) {
                    return;
                }
                this.e0 = false;
                this.O = r10;
                this.c0 = r10.a;
                this.d.u1(A(r10.a().d, "other", 0L), false);
            }
            z11 = j02;
        } else {
            ArrayList arrayList2 = y71Var.d;
            this.c0 = false;
            if (arrayList2.isEmpty()) {
                return;
            }
            Uri z15 = arrayList2.size() > 1 ? z(this.N) : null;
            if (z15 == null || arrayList2.size() == 1 || nVar.c == null) {
                z11 = j02;
                this.e0 = false;
                this.d.u1(A(y71Var.a().d, "other", 0L), false);
            } else {
                if (this.e0) {
                    z13 = false;
                } else {
                    this.e0 = true;
                    this.d.u1(A(z15, "hls", 0L), false);
                }
                x2.i j11 = nVar.j();
                j11.getClass();
                x2.h hVar2 = new x2.h(j11);
                hVar2.c();
                int size = arrayList2.size();
                int i15 = 0;
                while (i15 < size) {
                    int i16 = i15 + 1;
                    a81 a81Var = (a81) arrayList2.get(i15);
                    try {
                        int indexOf = this.P.indexOf(a81Var);
                        x2.r rVar = nVar.c;
                        int i17 = i13;
                        while (i17 < rVar.a) {
                            u2.s1 s1Var = rVar.c[i17];
                            z12 = j02;
                            while (i13 < s1Var.a) {
                                try {
                                    b2.p1 a2 = s1Var.a(i13);
                                    i10 = size;
                                    i11 = i16;
                                    int i18 = 0;
                                    while (i18 < a2.a) {
                                        try {
                                            b2.w wVar = a2.d[i18];
                                            u2.s1 s1Var2 = s1Var;
                                            try {
                                                i12 = Integer.parseInt(wVar.a);
                                            } catch (Exception unused) {
                                                i12 = -1;
                                            }
                                            if (i12 >= 0 && indexOf == i12) {
                                                q1Var = new b2.q1(a2, i18);
                                                break;
                                            }
                                            int i19 = indexOf;
                                            if (wVar.z == a81Var.i && wVar.A == a81Var.j) {
                                                q1Var = new b2.q1(a2, i18);
                                                break;
                                            } else {
                                                i18++;
                                                s1Var = s1Var2;
                                                indexOf = i19;
                                            }
                                        } catch (Exception e) {
                                            e = e;
                                            FileLog.e(e);
                                            q1Var = null;
                                            if (q1Var != null) {
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
                                } catch (Exception e7) {
                                    e = e7;
                                    i10 = size;
                                    i11 = i16;
                                    FileLog.e(e);
                                    q1Var = null;
                                    if (q1Var != null) {
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
                    } catch (Exception e10) {
                        e = e10;
                        z12 = j02;
                    }
                    q1Var = null;
                    if (q1Var != null) {
                        hVar2.H.put(q1Var.a, q1Var);
                    }
                    size = i10;
                    j02 = z12;
                    i15 = i11;
                    i13 = 0;
                }
                z11 = j02;
                nVar.b(new x2.i(hVar2));
            }
        }
        if (z13) {
            this.d.b();
            if (!z10) {
                this.d.Z0(5, M0);
                if (z11) {
                    this.d.i();
                }
            }
            org.telegram.ui.qq0 qq0Var = this.h0;
            if (qq0Var != null) {
                AndroidUtilities.runOnUIThread(qq0Var);
            }
            k0.add(Integer.valueOf(this.a));
        }
    }

    public final void S(int i10) {
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.N0(new b2.f(0, 0, i10 == 0 ? 2 : 1, 1, false, 0, true), false);
        }
        i2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.N0(new b2.f(0, 0, i10 == 0 ? 2 : 1, 1, false, 0, true), true);
        }
    }

    public final void T(Surface surface) {
        if (this.s == surface) {
            return;
        }
        this.s = surface;
        i2.i0 i0Var = this.d;
        if (i0Var == null) {
            return;
        }
        i0Var.y1(surface);
    }

    public final void U(SurfaceView surfaceView) {
        if (this.r == surfaceView) {
            return;
        }
        this.r = surfaceView;
        i2.i0 i0Var = this.d;
        if (i0Var == null) {
            return;
        }
        i0Var.F1();
        i0Var.T(surfaceView == null ? null : surfaceView.getHolder());
    }

    public final void V(TextureView textureView) {
        if (this.n == textureView) {
            return;
        }
        this.n = textureView;
        i2.i0 i0Var = this.d;
        if (i0Var == null) {
            return;
        }
        i0Var.z1(textureView);
    }

    public final void W(float f7) {
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.U(f7);
        }
        i2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.U(f7);
        }
    }

    public final void X(DispatchQueue dispatchQueue) {
        this.b = dispatchQueue;
        if (dispatchQueue == null) {
            this.d.s0 = null;
        } else {
            this.d.s0 = new org.telegram.messenger.g1(dispatchQueue);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.playerDidStartPlaying || ((c81) objArr[0]) == this || !y() || this.y) {
            return;
        }
        B();
    }

    @Override // j2.b
    public final void g(j2.a aVar, int i10) {
        if (i10 == 1) {
            z71 z71Var = this.J;
            if (z71Var != null) {
                z71Var.onSeekFinished(aVar);
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
        hashMap.put(j2.k.c.a, 144179200);
        y2.d dVar = new y2.d();
        boolean z10 = this.c;
        int i10 = MediaDataController.MAX_STYLE_RUNS_COUNT;
        int i11 = z10 ? 1000 : 100;
        if (!z10) {
            i10 = 2000;
        }
        int i12 = i10;
        i2.j.a(i11, 0, "bufferForPlaybackMs", "0");
        i2.j.a(i12, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i2.j.a(50000, i11, "minBufferMs", "bufferForPlaybackMs");
        i2.j.a(50000, i12, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i2.j.a(50000, 50000, "maxBufferMs", "minBufferMs");
        i2.j.a(0, 0, "backBufferDurationMs", "0");
        i2.j jVar = new i2.j(dVar, 50000, i11, i11, i12, i12, false, hashMap);
        if (this.d == null) {
            i2.l w71Var = this.K != null ? new w71(ApplicationLoader.applicationContext, this) : new i2.l(ApplicationLoader.applicationContext);
            w71Var.c = 1;
            i2.p pVar = new i2.p(ApplicationLoader.applicationContext);
            v7.u6.p(!pVar.z);
            pVar.c = new i2.o(w71Var, 2);
            x2.n nVar = this.f;
            v7.u6.p(!pVar.z);
            nVar.getClass();
            pVar.e = new i2.o(nVar, 1);
            v7.u6.p(!pVar.z);
            pVar.f = new i2.o(jVar, 0);
            i2.i0 a2 = pVar.a();
            this.d = a2;
            j2.f fVar = a2.s;
            fVar.getClass();
            fVar.f.a(this);
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
                        i2.i0 i0Var = this.d;
                        i0Var.F1();
                        i0Var.T(surfaceView.getHolder());
                    }
                }
            }
            this.d.X(this.w);
            this.d.j(this.V ? 2 : 0);
        }
        if (this.x && this.e == null) {
            i2.p pVar2 = new i2.p(ApplicationLoader.applicationContext);
            x2.n nVar2 = this.f;
            v7.u6.p(!pVar2.z);
            nVar2.getClass();
            pVar2.e = new i2.o(nVar2, 1);
            v7.u6.p(true ^ pVar2.z);
            pVar2.f = new i2.o(jVar, 0);
            i2.i0 a10 = pVar2.a();
            this.e = a10;
            a10.m.a(new e2.z(this, 1));
            this.e.X(this.w);
        }
    }

    public final long j() {
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            return this.v ? i0Var.d0() : i0Var.getDuration();
        }
        return 0L;
    }

    public final qf.g l(String str, String str2, String str3) {
        if (this.N == null) {
            if (this.Q == null) {
                return null;
            }
            String h = r4.c.h("/mtproto_", str);
            String queryParameter = this.Q.getQueryParameter("mime");
            qf.e eVar = new qf.e(this.Q, TextUtils.isEmpty(queryParameter) ? "video/mp4" : queryParameter, h);
            eVar.e = str2;
            eVar.f = str3;
            return new qf.g(new qf.f(eVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ArrayList arrayList3 = ((y71) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                a81 a81Var = (a81) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(a81Var.c);
                String sb3 = sb2.toString();
                TLRPC.Document document = a81Var.g;
                String str4 = document != null ? document.mime_type : null;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                qf.e eVar2 = new qf.e(a81Var.d, str4, sb3);
                eVar2.e = str2;
                eVar2.f = str3;
                int i12 = a81Var.i;
                int i13 = a81Var.j;
                eVar2.a = i12;
                eVar2.b = i13;
                arrayList.add(new qf.f(eVar2));
                arrayList2 = arrayList4;
            }
        }
        return new qf.g(arrayList);
    }

    public final TLRPC.Document m() {
        ArrayList arrayList;
        i2.i0 i0Var = this.d;
        if (i0Var == null) {
            return null;
        }
        i0Var.F1();
        b2.w wVar = i0Var.S;
        if (wVar == null || wVar.o == 0 || (arrayList = this.N) == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((y71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                a81 a81Var = (a81) obj2;
                if (a81Var.c == wVar.o) {
                    return a81Var.g;
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
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            return i0Var.M0();
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
                i2.i0 i0Var = this.d;
                if (i0Var != null) {
                    i0Var.F1();
                    b2.w wVar = i0Var.S;
                    if (wVar != null) {
                        for (int i11 = 0; i11 < t(); i11++) {
                            y71 u10 = u(i11);
                            if (!u10.a && wVar.z == u10.b && wVar.A == u10.c && wVar.j == ((int) Math.floor(((a81) u10.d.get(0)).l * 8.0d))) {
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

    @Override // b2.d1
    public final /* synthetic */ void onCues(d2.c cVar) {
    }

    @Override // b2.d1
    public final void onPlayerError(b2.y0 y0Var) {
        AndroidUtilities.runOnUIThread(new ho0(21, this, y0Var));
    }

    @Override // b2.d1
    public final void onPlayerStateChanged(boolean z10, int i10) {
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            boolean t10 = i0Var.t();
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
            v71 v71Var = this.K;
            if (v71Var != null) {
                v71Var.onVisualizerUpdate(false, true, null);
            }
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void onPositionDiscontinuity(int i10) {
    }

    @Override // j2.b
    public final void onRenderedFirstFrame(j2.a aVar) {
        this.g0 = -9223372036854775807L;
        this.f0 = -9223372036854775807L;
        z71 z71Var = this.J;
        if (z71Var != null) {
            z71Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override // j2.b
    public final void onSeekStarted(j2.a aVar) {
        z71 z71Var = this.J;
        if (z71Var != null) {
            z71Var.onSeekStarted(aVar);
        }
    }

    @Override // b2.d1
    public final void onTrackSelectionParametersChanged(b2.t1 t1Var) {
        org.telegram.ui.qq0 qq0Var = this.h0;
        if (qq0Var != null) {
            AndroidUtilities.runOnUIThread(qq0Var);
        }
    }

    @Override // b2.d1
    public final void onTracksChanged(b2.v1 v1Var) {
        org.telegram.ui.qq0 qq0Var = this.h0;
        if (qq0Var != null) {
            AndroidUtilities.runOnUIThread(qq0Var);
        }
    }

    @Override // b2.d1
    public final void onVideoSizeChanged(b2.a2 a2Var) {
        if (Objects.equals(a2Var, b2.a2.d)) {
            return;
        }
        this.J.onVideoSizeChanged(a2Var.a, a2Var.b, 0, a2Var.c);
    }

    public final long p() {
        long j10 = this.f0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            return i0Var.getDuration();
        }
        return 0L;
    }

    public final ei.z7 q(ei.z7 z7Var) {
        if (z7Var == null) {
            z7Var = new ei.z7();
        }
        try {
            i2.i0 i0Var = this.d;
            i0Var.F1();
            MediaFormat mediaFormat = ((r2.r) i0Var.g[0]).f0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    z7Var.b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    z7Var.a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return z7Var;
    }

    public final y71 r(Boolean bool) {
        y71 y71Var = null;
        for (int i10 = 0; i10 < t(); i10++) {
            y71 u10 = u(i10);
            if (u10.a == bool.booleanValue() && (y71Var == null || y71Var.b * y71Var.c < u10.b * u10.c)) {
                y71Var = u10;
            }
        }
        return y71Var;
    }

    public final int t() {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final y71 u(int i10) {
        ArrayList arrayList = this.N;
        return arrayList == null ? r(Boolean.FALSE) : (i10 < 0 || i10 >= arrayList.size()) ? r(Boolean.FALSE) : (y71) this.N.get(i10);
    }

    public final boolean x() {
        i2.i0 i0Var = this.d;
        if (i0Var == null) {
            return false;
        }
        i0Var.F1();
        return i0Var.b0 == 0.0f;
    }

    public final boolean y() {
        if (this.x && this.I) {
            return true;
        }
        i2.i0 i0Var = this.d;
        return i0Var != null && i0Var.t();
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
            ArrayList arrayList3 = ((y71) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                a81 a81Var = (a81) obj2;
                long j10 = a81Var.c;
                Uri uri = a81Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j10, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(a81Var.e, a81Var.f);
                if (a81Var.f != null) {
                    this.P.add(a81Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(a81Var.l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(a81Var.i);
                    sb3.append("x");
                    sb3.append(a81Var.j);
                    String str2 = a81Var.m;
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
                    if (a81Var.b() && a81Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(a81Var.c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(a81Var.a);
                    sb3.append("\"\n");
                    if (a81Var.c()) {
                        sb3.append(a81Var.f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(a81Var.e);
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

    public c81(boolean z10, boolean z11) {
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
        x2.n nVar = new x2.n(ApplicationLoader.applicationContext, new oa.d(26));
        this.f = nVar;
        if (z11) {
            x2.i j10 = nVar.j();
            j10.getClass();
            x2.h hVar = new x2.h(j10);
            hVar.I.add(1);
            nVar.b(new x2.i(hVar));
        }
        this.L = 1;
        this.W = z10;
        if (z10) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // b2.d1
    public final void onPositionDiscontinuity(b2.e1 e1Var, b2.e1 e1Var2, int i10) {
    }

    @Override // b2.d1
    public void onRenderedFirstFrame() {
        this.J.onRenderedFirstFrame();
    }

    @Override // j2.b
    public final /* synthetic */ void a(i2.f fVar) {
    }

    @Override // j2.b
    public final /* synthetic */ void b(u2.c0 c0Var) {
    }

    @Override // j2.b
    public final /* synthetic */ void c(b2.a2 a2Var) {
    }

    @Override // j2.b
    public final /* synthetic */ void h(b2.y0 y0Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onAudioAttributesChanged(b2.f fVar) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onAudioSessionIdChanged(int i10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onAvailableCommandsChanged(b2.b1 b1Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onIsLoadingChanged(boolean z10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onIsPlayingChanged(boolean z10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onLoadingChanged(boolean z10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onMediaMetadataChanged(b2.r0 r0Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onMetadata(b2.t0 t0Var) {
    }

    @Override // b2.d1
    public final void onPlaybackParametersChanged(b2.z0 z0Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onPlaybackStateChanged(int i10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onPlayerErrorChanged(b2.y0 y0Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onPlaylistMetadataChanged(b2.r0 r0Var) {
    }

    @Override // b2.d1
    public final void onRepeatModeChanged(int i10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onVolumeChanged(float f7) {
    }

    @Override // j2.b
    public final /* synthetic */ void d(b2.f1 f1Var, qf.b bVar) {
    }

    @Override // j2.b
    public final /* synthetic */ void e(j2.a aVar, u2.c0 c0Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onEvents(b2.f1 f1Var, b2.c1 c1Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onMediaItemTransition(b2.o0 o0Var, int i10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onTimelineChanged(b2.o1 o1Var, int i10) {
    }

    @Override // j2.b
    public final /* synthetic */ void f(j2.a aVar, int i10, long j10) {
    }
}
