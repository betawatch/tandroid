package org.telegram.ui.Components;

import a8.xa;
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
import bg.w0;
import e2.l0;
import j$.util.Objects;
import j2.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import nb.a;
import o2.h;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.md0;
import p2.e;
import pb.b;
import q2.m;
import r0.f1;
import r2.c;
import r2.k;
import s2.d;
import s2.t;
import sg.h0;
import x2.f0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class i61 implements e2.a1, e2.w1, m2.b, org.telegram.messenger.gs {
    public static int k0;
    public static final HashSet l0 = new HashSet();
    public static HashMap m0;
    public boolean E;
    public boolean F;
    public Uri G;
    public boolean H;
    public boolean I;
    public boolean J;
    public g61 K;
    public c61 L;
    public int M;
    public boolean N;
    public ArrayList O;
    public f61 P;
    public ArrayList Q;
    public Uri R;
    public Uri S;
    public String T;
    public String U;
    public boolean V;
    public boolean W;
    public final boolean X;
    public DashMediaSource$Factory Y;
    public HlsMediaSource$Factory Z;
    public final int a;
    public x2.x0 a0;
    public org.telegram.messenger.r5 b;
    public final Handler b0;
    public boolean c;
    public final boolean c0;
    public l2.f0 d;
    public boolean d0;
    public l2.f0 e;
    public int e0;
    public final a3.s f;
    public boolean f0;
    public long g0;
    public final ExtendedDefaultDataSourceFactory h;
    public long h0;
    public org.telegram.ui.zn0 i0;
    public final ArrayList j0;
    public TextureView n;
    public SurfaceView r;
    public Surface s;
    public boolean w;
    public boolean x;
    public boolean y;

    public i61() {
        this(true, false);
    }

    public static boolean D0(String str) {
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
                    concat = "video/avc";
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
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return false;
                    }
            }
        }
        if (concat != null) {
            if (m0 == null) {
                m0 = new HashMap();
            }
            Boolean bool = (Boolean) m0.get(concat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!org.telegram.messenger.np.g1().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i7 = 0; i7 < codecCount; i7++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i7);
                    if (!codecInfoAt.isEncoder() && u2.w.i(codecInfoAt, concat)) {
                        for (String str2 : codecInfoAt.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(concat)) {
                                m0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                    }
                }
                m0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static h61 N(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((f61) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                h61 h61Var = (h61) obj2;
                if (h61Var.b()) {
                    return h61Var;
                }
            }
        }
        return null;
    }

    public static ArrayList X(int i7, TLRPC.Document document, ArrayList arrayList, int i10, boolean z10) {
        f61 f61Var;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!org.telegram.messenger.np.u1(i7).I6 && arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        LongSparseArray longSparseArray = new LongSparseArray();
        int i11 = 0;
        while (i11 < arrayList2.size()) {
            TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i11);
            if ("application/x-mpegurl".equalsIgnoreCase(document2.mime_type) && (str = document2.file_name_fixed) != null && str.startsWith("mtproto")) {
                try {
                    longSparseArray.put(Long.parseLong(document2.file_name_fixed.substring(7)), document2);
                    arrayList2.remove(i11);
                    i11--;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            i11++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i12);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    h61 d = h61.d(i7, document3, (TLRPC.Document) longSparseArray.get(document3.id), i10, z10);
                    if (d.i > 0 && d.j > 0) {
                        if (document3 == document) {
                            d.b = true;
                        }
                        arrayList3.add(d);
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            h61 h61Var = (h61) arrayList3.get(i13);
            String str2 = h61Var.m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(h61Var.m) && !"hevc".equals(h61Var.m) && !"h265".equals(h61Var.m) && !"vp9".equals(h61Var.m)) || D0(h61Var.m))) {
                arrayList4.add(h61Var);
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
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList5.get(i14);
            i14++;
            h61 h61Var2 = (h61) obj;
            if (h61Var2.b) {
                arrayList6.add(new f61(h61Var2));
            } else {
                int size2 = arrayList6.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        f61Var = null;
                        break;
                    }
                    Object obj2 = arrayList6.get(i15);
                    i15++;
                    f61Var = (f61) obj2;
                    if (!f61Var.a && f61Var.b == h61Var2.i && f61Var.c == h61Var2.j) {
                        break;
                    }
                }
                if (f61Var == null || org.telegram.messenger.cz.R0) {
                    arrayList6.add(new f61(h61Var2));
                } else {
                    f61Var.d.add(h61Var2);
                }
            }
        }
        return arrayList6;
    }

    public static h61 a0(ArrayList arrayList) {
        int i7;
        int i10;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ArrayList arrayList2 = ((f61) obj).d;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                h61 h61Var = (h61) obj2;
                if (h61Var.b && h61Var.b()) {
                    return h61Var;
                }
            }
        }
        int size3 = arrayList.size();
        h61 h61Var2 = null;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList.get(i13);
            i13++;
            ArrayList arrayList3 = ((f61) obj3).d;
            int size4 = arrayList3.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                h61 h61Var3 = (h61) obj4;
                if (!h61Var3.b && D0(h61Var3.m) && (h61Var2 == null || (i7 = h61Var3.i * h61Var3.j) > (i10 = h61Var2.i * h61Var2.j) || (i7 == i10 && h61Var3.l < h61Var2.l))) {
                    h61Var2 = h61Var3;
                }
            }
        }
        if (h61Var2 == null) {
            int size5 = arrayList.size();
            int i15 = 0;
            while (i15 < size5) {
                Object obj5 = arrayList.get(i15);
                i15++;
                ArrayList arrayList4 = ((f61) obj5).d;
                int size6 = arrayList4.size();
                int i16 = 0;
                while (i16 < size6) {
                    Object obj6 = arrayList4.get(i16);
                    i16++;
                    h61 h61Var4 = (h61) obj6;
                    if (h61Var2 == null || h61Var2.i * h61Var2.j > h61Var4.i * h61Var4.j || h61Var4.l < h61Var2.l) {
                        h61Var2 = h61Var4;
                    }
                }
            }
        }
        return h61Var2;
    }

    public static h61 b0(ArrayList arrayList) {
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((f61) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                h61 h61Var = (h61) obj2;
                if (h61Var.b()) {
                    return h61Var;
                }
            }
        }
        int size3 = arrayList.size();
        h61 h61Var2 = null;
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            ArrayList arrayList3 = ((f61) obj3).d;
            int size4 = arrayList3.size();
            int i12 = 0;
            while (i12 < size4) {
                Object obj4 = arrayList3.get(i12);
                i12++;
                h61 h61Var3 = (h61) obj4;
                if (!h61Var3.b && (h61Var2 == null || h61Var2.i * h61Var2.j > h61Var3.i * h61Var3.j || h61Var3.l < h61Var2.l)) {
                    if (h61Var3.i <= 900 && h61Var3.j <= 900) {
                        h61Var2 = h61Var3;
                    }
                }
            }
        }
        if (h61Var2 == null) {
            int size5 = arrayList.size();
            int i13 = 0;
            while (i13 < size5) {
                Object obj5 = arrayList.get(i13);
                i13++;
                ArrayList arrayList4 = ((f61) obj5).d;
                int size6 = arrayList4.size();
                int i14 = 0;
                while (i14 < size6) {
                    Object obj6 = arrayList4.get(i14);
                    i14++;
                    h61 h61Var4 = (h61) obj6;
                    if (h61Var2 == null || h61Var2.i * h61Var2.j > h61Var4.i * h61Var4.j || h61Var4.l < h61Var2.l) {
                        h61Var2 = h61Var4;
                    }
                }
            }
        }
        return h61Var2;
    }

    public static void n0(org.telegram.messenger.gj gjVar, boolean z10) {
        if (gjVar == null) {
            return;
        }
        org.telegram.messenger.t0.b.getSharedPreferences("media_saved_pos", 0).edit().putBoolean(org.telegram.messenger.gj.B0(gjVar.k) + "_" + gjVar.e1() + "loop", z10).apply();
    }

    public static void o0(f61 f61Var, org.telegram.messenger.gj gjVar) {
        if (gjVar == null) {
            return;
        }
        long B0 = org.telegram.messenger.gj.B0(gjVar.k);
        int e12 = gjVar.e1();
        SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("media_saved_pos", 0).edit();
        if (f61Var == null) {
            edit.remove(B0 + "_" + e12 + "q2");
        } else {
            String str = B0 + "_" + e12 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f61Var.b);
            sb2.append("x");
            sb2.append(f61Var.c);
            sb2.append(f61Var.a ? "s" : "");
            edit.putString(str, sb2.toString());
        }
        edit.apply();
    }

    public final void A0(TextureView textureView) {
        if (this.n == textureView) {
            return;
        }
        this.n = textureView;
        l2.f0 f0Var = this.d;
        if (f0Var == null) {
            return;
        }
        f0Var.z1(textureView);
    }

    public final void B0(float f10) {
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.T(f10);
        }
        l2.f0 f0Var2 = this.e;
        if (f0Var2 != null) {
            f0Var2.T(f10);
        }
    }

    @Override // m2.b
    public final void C(m2.a aVar, int i7) {
        if (i7 == 1) {
            g61 g61Var = this.K;
            if (g61Var != null) {
                g61Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.j0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            arrayList.clear();
        }
    }

    public final void C0(org.telegram.messenger.r5 r5Var) {
        this.b = r5Var;
        if (r5Var == null) {
            this.d.s0 = null;
        } else {
            this.d.s0 = new b61(r5Var);
        }
    }

    @Override // e2.a1
    public final void D(int i7, boolean z10) {
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            boolean u10 = f0Var.u();
            int i10 = this.d.i();
            if (this.N != u10 || this.M != i10) {
                this.K.onStateChanged(u10, i10);
                this.N = u10;
                this.M = i10;
            }
        }
        if (z10 && i7 == 3 && !c0() && this.X) {
            org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.K4, this);
        }
        if (!this.H && i7 == 3) {
            this.H = true;
            if (this.I && this.J) {
                h0();
            }
        }
        if (i7 != 3) {
            this.b0.removeCallbacksAndMessages(null);
            c61 c61Var = this.L;
            if (c61Var != null) {
                c61Var.x(false, null);
            }
        }
    }

    @Override // e2.a1
    public final void E(e2.q1 q1Var) {
        org.telegram.ui.zn0 zn0Var = this.i0;
        if (zn0Var != null) {
            org.telegram.messenger.g0.g3(zn0Var);
        }
    }

    public final void I() {
        HashMap hashMap = new HashMap();
        hashMap.put(m2.i.c.a, 144179200);
        b3.e eVar = new b3.e();
        boolean z10 = this.c;
        int i7 = z10 ? 1000 : 100;
        int i10 = z10 ? 1000 : 2000;
        l2.h.a(i7, 0, "bufferForPlaybackMs", "0");
        l2.h.a(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
        l2.h.a(50000, i7, "minBufferMs", "bufferForPlaybackMs");
        l2.h.a(50000, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        l2.h.a(50000, 50000, "maxBufferMs", "minBufferMs");
        l2.h.a(0, 0, "backBufferDurationMs", "0");
        l2.h hVar = new l2.h(eVar, 50000, i7, i7, i10, i10, false, hashMap);
        if (this.d == null) {
            l2.j d61Var = this.L != null ? new d61(org.telegram.messenger.t0.b, this) : new l2.j(org.telegram.messenger.t0.b);
            d61Var.c = 1;
            l2.n nVar = new l2.n(org.telegram.messenger.t0.b);
            a8.la.p(!nVar.z);
            nVar.c = new l2.m(d61Var, 2);
            a3.s sVar = this.f;
            a8.la.p(!nVar.z);
            sVar.getClass();
            nVar.e = new l2.m(sVar, 1);
            a8.la.p(!nVar.z);
            nVar.f = new l2.m(hVar, 0);
            l2.f0 a10 = nVar.a();
            this.d = a10;
            a10.D(new e2.e(3, 0, 1, 1, false, 0, true), false);
            m2.d dVar = this.d.s;
            dVar.getClass();
            dVar.f.a(this);
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
                        l2.f0 f0Var = this.d;
                        f0Var.F1();
                        f0Var.S(surfaceView.getHolder());
                    }
                }
            }
            this.d.X(this.x);
            this.d.k(this.W ? 2 : 0);
        }
        if (this.y && this.e == null) {
            l2.n nVar2 = new l2.n(org.telegram.messenger.t0.b);
            a3.s sVar2 = this.f;
            a8.la.p(!nVar2.z);
            sVar2.getClass();
            nVar2.e = new l2.m(sVar2, 1);
            a8.la.p(true ^ nVar2.z);
            nVar2.f = new l2.m(hVar, 0);
            l2.f0 a11 = nVar2.a();
            this.e = a11;
            a11.D(new e2.e(2, 0, 1, 1, false, 0, true), false);
            this.e.m.a(new h2.z(this, 1));
            this.e.X(this.x);
        }
    }

    public final long K() {
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            return this.w ? f0Var.d0() : f0Var.getDuration();
        }
        return 0L;
    }

    public final oi.z3 Q(String str, String str2, String str3) {
        if (this.O == null) {
            if (this.R == null) {
                return null;
            }
            String k10 = p5.c.k("/mtproto_", str);
            String queryParameter = this.R.getQueryParameter("mime");
            v4.x0 x0Var = new v4.x0(this.R, TextUtils.isEmpty(queryParameter) ? "video/mp4" : queryParameter, k10);
            x0Var.g = str2;
            x0Var.h = str3;
            return new oi.z3(new wf.e(x0Var));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.O;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            ArrayList arrayList3 = ((f61) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                h61 h61Var = (h61) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(h61Var.c);
                String sb3 = sb2.toString();
                TLRPC.Document document = h61Var.g;
                String str4 = document != null ? document.mime_type : null;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                v4.x0 x0Var2 = new v4.x0(h61Var.d, str4, sb3);
                x0Var2.g = str2;
                x0Var2.h = str3;
                int i11 = h61Var.i;
                int i12 = h61Var.j;
                x0Var2.a = i11;
                x0Var2.b = i12;
                arrayList.add(new wf.e(x0Var2));
                arrayList2 = arrayList4;
            }
        }
        oi.z3 z3Var = new oi.z3();
        z3Var.a = arrayList;
        return z3Var;
    }

    public final TLRPC.Document R() {
        ArrayList arrayList;
        l2.f0 f0Var = this.d;
        if (f0Var == null) {
            return null;
        }
        f0Var.F1();
        e2.u uVar = f0Var.S;
        if (uVar == null || uVar.o == 0 || (arrayList = this.O) == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((f61) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                h61 h61Var = (h61) obj2;
                if (h61Var.c == uVar.o) {
                    return h61Var.g;
                }
            }
        }
        return null;
    }

    public final long S() {
        long j3 = this.h0;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            return f0Var.l();
        }
        return 0L;
    }

    public final int T() {
        if (this.e0 == -1) {
            try {
                if (this.d0) {
                    for (int i7 = 0; i7 < Y(); i7++) {
                        if (Z(i7).a) {
                            return i7;
                        }
                    }
                }
                l2.f0 f0Var = this.d;
                if (f0Var != null) {
                    f0Var.F1();
                    e2.u uVar = f0Var.S;
                    if (uVar != null) {
                        for (int i10 = 0; i10 < Y(); i10++) {
                            f61 Z = Z(i10);
                            if (!Z.a && uVar.z == Z.b && uVar.A == Z.c && uVar.j == ((int) Math.floor(((h61) Z.d.get(0)).l * 8.0d))) {
                                return i10;
                            }
                        }
                    }
                }
                return -1;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return -1;
            }
        }
        return this.e0;
    }

    public final long U() {
        long j3 = this.g0;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            return f0Var.getDuration();
        }
        return 0L;
    }

    public final hi.b7 V(hi.b7 b7Var) {
        if (b7Var == null) {
            b7Var = new hi.b7();
        }
        try {
            l2.f0 f0Var = this.d;
            f0Var.F1();
            MediaFormat mediaFormat = ((u2.r) f0Var.g[0]).g0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    b7Var.b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    b7Var.a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return b7Var;
    }

    public final f61 W(Boolean bool) {
        f61 f61Var = null;
        for (int i7 = 0; i7 < Y(); i7++) {
            f61 Z = Z(i7);
            if (Z.a == bool.booleanValue() && (f61Var == null || f61Var.b * f61Var.c < Z.b * Z.c)) {
                f61Var = Z;
            }
        }
        return f61Var;
    }

    public final int Y() {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final f61 Z(int i7) {
        ArrayList arrayList = this.O;
        return arrayList == null ? W(Boolean.FALSE) : (i7 < 0 || i7 >= arrayList.size()) ? W(Boolean.FALSE) : (f61) this.O.get(i7);
    }

    @Override // e2.a1
    public final void a(e2.x1 x1Var) {
        if (Objects.equals(x1Var, e2.x1.d)) {
            return;
        }
        this.K.onVideoSizeChanged(x1Var.a, x1Var.b, 0, x1Var.c);
    }

    public final boolean c0() {
        l2.f0 f0Var = this.d;
        if (f0Var == null) {
            return false;
        }
        f0Var.F1();
        return f0Var.b0 == 0.0f;
    }

    public final boolean d0() {
        if (this.y && this.J) {
            return true;
        }
        l2.f0 f0Var = this.d;
        return f0Var != null && f0Var.u();
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ls.K4 || ((i61) objArr[0]) == this || !d0() || this.E) {
            return;
        }
        g0();
    }

    public final Uri e0(ArrayList arrayList) {
        String str;
        StringBuilder sb2 = new StringBuilder("#EXTM3U\n#EXT-X-VERSION:6\n#EXT-X-INDEPENDENT-SEGMENTS\n\n");
        this.Q = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z10 = false;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList3 = ((f61) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                h61 h61Var = (h61) obj2;
                long j3 = h61Var.c;
                Uri uri = h61Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j3, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(h61Var.e, h61Var.f);
                if (h61Var.f != null) {
                    this.Q.add(h61Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(h61Var.l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(h61Var.i);
                    sb3.append("x");
                    sb3.append(h61Var.j);
                    String str2 = h61Var.m;
                    if (str2 != null) {
                        switch (str2) {
                            case "av1":
                            case "av01":
                                str = "video/av01";
                                break;
                            case "avc":
                            case "h264":
                                str = "video/avc";
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
                    if (h61Var.b() && h61Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(h61Var.c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(h61Var.a);
                    sb3.append("\"\n");
                    if (h61Var.c()) {
                        sb3.append(h61Var.f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(h61Var.e);
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

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.exoplayer.hls.HlsMediaSource$Factory] */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.media3.exoplayer.dash.DashMediaSource$Factory] */
    public final x2.a f0(long j3, Uri uri, String str) {
        e2.e0 e0Var;
        e2.g0 g0Var;
        q2.m o4;
        q2.m mVar;
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        e2.z zVar = new e2.z();
        e2.c0 c0Var = new e2.c0();
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var = h9.t1.e;
        e2.e0 e0Var2 = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        a8.la.p(c0Var.b == null || c0Var.a != null);
        if (uri != null) {
            e2.d0 d0Var = c0Var.a != null ? new e2.d0(c0Var) : null;
            e0Var = e0Var2;
            g0Var = new e2.g0(uri, null, d0Var, null, list, null, t1Var, -9223372036854775807L);
        } else {
            e0Var = e0Var2;
            g0Var = null;
        }
        e2.l0 l0Var = new e2.l0("", new e2.b0(zVar), g0Var, new e2.f0(e0Var), e2.o0.L, h0Var);
        if (j3 == 0) {
            str.getClass();
            if (str.equals("hls")) {
                if (this.Z == null) {
                    this.Z = new x2.f0(extendedDefaultDataSourceFactory) { // from class: androidx.media3.exoplayer.hls.HlsMediaSource$Factory
                        public final c5 a;
                        public c b;
                        public a c;
                        public final md0 i = new md0(7);
                        public final b f = new b(24);
                        public final f1 g = d.K;
                        public final qb.a j = new qb.a(4);
                        public final a h = new a(28);
                        public final int l = 1;
                        public final long m = -9223372036854775807L;
                        public final boolean k = true;
                        public int e = 3;
                        public boolean d = true;

                        {
                            this.a = new c5(extendedDefaultDataSourceFactory);
                        }

                        @Override // x2.f0
                        public final f0 a(a aVar) {
                            this.c = aVar;
                            return this;
                        }

                        @Override // x2.f0
                        public final f0 c(boolean z10) {
                            this.d = z10;
                            return this;
                        }

                        @Override // x2.f0
                        public final f0 d(int i7) {
                            this.e = i7;
                            return this;
                        }

                        @Override // x2.f0
                        /* renamed from: e, reason: merged with bridge method [inline-methods] */
                        public final k b(l0 l0Var2) {
                            l0Var2.b.getClass();
                            if (this.b == null) {
                                c cVar = new c();
                                cVar.a = new a(6);
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
                            List list2 = l0Var2.b.e;
                            boolean isEmpty = list2.isEmpty();
                            t tVar = this.f;
                            if (!isEmpty) {
                                tVar = new k8.a(tVar, list2, false, 29);
                            }
                            m s5 = this.i.s(l0Var2);
                            this.g.getClass();
                            c5 c5Var = this.a;
                            qb.a aVar2 = this.j;
                            return new k(l0Var2, c5Var, cVar2, this.h, s5, aVar2, new d(c5Var, aVar2, tVar), this.m, this.k, this.l);
                        }
                    };
                }
                return b(l0Var);
            }
            if (str.equals("dash")) {
                if (this.Y == null) {
                    this.Y = new x2.f0(extendedDefaultDataSourceFactory) { // from class: androidx.media3.exoplayer.dash.DashMediaSource$Factory
                        public final xa a;
                        public final g b;
                        public final md0 c;
                        public final a d;
                        public final qb.a e;
                        public final long f;
                        public final long g;

                        {
                            xa xaVar = new xa(extendedDefaultDataSourceFactory);
                            this.a = xaVar;
                            this.b = extendedDefaultDataSourceFactory;
                            this.c = new md0(7);
                            this.e = new qb.a(4);
                            this.f = 30000L;
                            this.g = 5000000L;
                            this.d = new a(28);
                            ((w0) xaVar.d).a = true;
                        }

                        @Override // x2.f0
                        public final f0 a(a aVar) {
                            w0 w0Var = (w0) this.a.d;
                            w0Var.getClass();
                            w0Var.c = aVar;
                            return this;
                        }

                        @Override // x2.f0
                        public final x2.a b(l0 l0Var2) {
                            l0Var2.b.getClass();
                            e eVar = new e();
                            List list2 = l0Var2.b.e;
                            return new h(l0Var2, this.b, !list2.isEmpty() ? new h0(8, eVar, list2) : eVar, this.a, this.d, this.c.s(l0Var2), this.e, this.f, this.g);
                        }

                        @Override // x2.f0
                        public final f0 c(boolean z10) {
                            ((w0) this.a.d).a = z10;
                            return this;
                        }

                        @Override // x2.f0
                        public final f0 d(int i7) {
                            ((w0) this.a.d).b = i7;
                            return this;
                        }
                    };
                }
                return b(l0Var);
            }
            if (this.a0 == null) {
                this.a0 = new x2.x0(extendedDefaultDataSourceFactory, new f3.m());
            }
            return this.a0.b(l0Var);
        }
        ai.d0 d0Var2 = new ai.d0(this, j3, 7);
        tg.o1 o1Var = new tg.o1(new f3.m(), 16);
        Object obj = new Object();
        qb.a aVar = new qb.a(4);
        g0Var.getClass();
        l0Var.b.getClass();
        e2.d0 d0Var3 = l0Var.b.c;
        if (d0Var3 == null) {
            mVar = q2.m.A;
        } else {
            synchronized (obj) {
                try {
                    o4 = !d0Var3.equals(null) ? org.telegram.ui.md0.o(d0Var3) : null;
                    o4.getClass();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            mVar = o4;
        }
        return new x2.y0(l0Var, d0Var2, o1Var, mVar, aVar, TLObject.FLAG_20, null);
    }

    public void g0() {
        this.J = false;
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.X(false);
        }
        l2.f0 f0Var2 = this.e;
        if (f0Var2 != null) {
            f0Var2.X(false);
        }
        if (this.L != null) {
            this.b0.removeCallbacksAndMessages(null);
            this.L.x(false, null);
        }
    }

    public void h0() {
        this.J = true;
        if (!this.y || (this.I && this.H)) {
            l2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.X(true);
            }
            l2.f0 f0Var2 = this.e;
            if (f0Var2 != null) {
                f0Var2.X(true);
                return;
            }
            return;
        }
        l2.f0 f0Var3 = this.d;
        if (f0Var3 != null) {
            f0Var3.X(false);
        }
        l2.f0 f0Var4 = this.e;
        if (f0Var4 != null) {
            f0Var4.X(false);
        }
    }

    public final void i0(long j3, Uri uri, String str) {
        this.O = null;
        this.P = null;
        this.R = uri;
        this.T = str;
        this.S = null;
        this.U = null;
        boolean z10 = false;
        this.V = false;
        this.d0 = false;
        this.f0 = false;
        this.H = false;
        this.y = false;
        this.G = uri;
        String scheme = uri != null ? uri.getScheme() : null;
        if (scheme != null && !scheme.startsWith("file")) {
            z10 = true;
        }
        this.w = z10;
        I();
        this.d.u1(f0(j3, uri, str), true);
        this.d.a();
    }

    public final void j0(Uri uri, String str) {
        i0(0L, uri, str);
    }

    public final void k0(ArrayList arrayList, f61 f61Var) {
        ArrayList arrayList2;
        this.O = arrayList;
        this.P = f61Var;
        this.R = null;
        this.T = "hls";
        this.S = null;
        this.U = null;
        this.V = false;
        this.d0 = false;
        this.H = false;
        this.y = false;
        this.G = null;
        this.w = true;
        I();
        this.f0 = false;
        this.e0 = (f61Var == null || (arrayList2 = this.O) == null) ? -1 : arrayList2.indexOf(f61Var);
        w0(true, f61Var);
        if (this.d0) {
            this.e0 = -1;
        }
    }

    public final void l0(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        x2.x xVar = null;
        this.O = null;
        this.P = null;
        this.R = uri;
        this.S = uri2;
        this.T = str;
        this.U = str2;
        this.V = true;
        this.f0 = false;
        this.y = true;
        this.I = false;
        this.H = false;
        I();
        x2.x xVar2 = null;
        for (int i7 = 0; i7 < 2; i7++) {
            if (i7 == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            x2.x xVar3 = new x2.x(f0(0L, uri3, str3));
            if (i7 == 0) {
                xVar = xVar3;
            } else {
                xVar2 = xVar3;
            }
        }
        this.d.u1(xVar, true);
        this.d.a();
        this.e.u1(xVar2, true);
        this.e.a();
        l0.add(Integer.valueOf(this.a));
    }

    public final void m0() {
        l0.remove(Integer.valueOf(this.a));
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.X0();
            this.d = null;
        }
        l2.f0 f0Var2 = this.e;
        if (f0Var2 != null) {
            f0Var2.X0();
            this.e = null;
        }
        if (this.X) {
            org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.K4);
        }
    }

    @Override // m2.b
    public final void onRenderedFirstFrame(m2.a aVar) {
        this.h0 = -9223372036854775807L;
        this.g0 = -9223372036854775807L;
        g61 g61Var = this.K;
        if (g61Var != null) {
            g61Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override // m2.b
    public final void onSeekStarted(m2.a aVar) {
        g61 g61Var = this.K;
        if (g61Var != null) {
            g61Var.onSeekStarted(aVar);
        }
    }

    public void p0(long j3) {
        q0(j3, false);
    }

    public final void q0(long j3, boolean z10) {
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.w1(z10 ? l2.p1.d : l2.p1.c);
            this.d.Z0(5, j3);
        }
    }

    public final void r0(long j3, boolean z10, Runnable runnable) {
        if (this.d != null) {
            if (runnable != null) {
                this.j0.add(runnable);
            }
            this.d.w1(z10 ? l2.p1.d : l2.p1.c);
            this.d.Z0(5, j3);
        }
    }

    public final void s0(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            l2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.k(z10 ? 2 : 0);
            }
        }
    }

    public final void t0(boolean z10) {
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.T(z10 ? 0.0f : 1.0f);
        }
        l2.f0 f0Var2 = this.e;
        if (f0Var2 != null) {
            f0Var2.T(z10 ? 0.0f : 1.0f);
        }
    }

    @Override // e2.a1
    public final void u(e2.s1 s1Var) {
        org.telegram.ui.zn0 zn0Var = this.i0;
        if (zn0Var != null) {
            org.telegram.messenger.g0.g3(zn0Var);
        }
    }

    public void u0(boolean z10) {
        this.J = z10;
        if (z10 && this.y && (!this.I || !this.H)) {
            l2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.X(false);
            }
            l2.f0 f0Var2 = this.e;
            if (f0Var2 != null) {
                f0Var2.X(false);
                return;
            }
            return;
        }
        this.x = z10;
        l2.f0 f0Var3 = this.d;
        if (f0Var3 != null) {
            f0Var3.X(z10);
        }
        l2.f0 f0Var4 = this.e;
        if (f0Var4 != null) {
            f0Var4.X(z10);
        }
    }

    public void v0(float f10) {
        try {
            l2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.e(new e2.w0(f10, f10 > 1.0f ? 0.98f : 1.0f));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(boolean z10, f61 f61Var) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i7;
        boolean z15;
        e2.n1 n1Var;
        int i10;
        f61 f61Var2;
        l2.f0 f0Var = this.d;
        if (f0Var == null) {
            return;
        }
        boolean h = f0Var.h();
        long l10 = this.d.l();
        if (!z10) {
            this.h0 = l10;
            this.g0 = this.d.getDuration();
        }
        this.P = f61Var;
        a3.s sVar = this.f;
        boolean z16 = true;
        int i11 = 0;
        if (f61Var == null) {
            Uri e02 = e0(this.O);
            int i12 = 0;
            while (true) {
                if (i12 >= Y()) {
                    f61Var2 = null;
                    break;
                }
                f61 Z = Z(i12);
                if (Z.a) {
                    f61Var2 = Z;
                    break;
                }
                i12++;
            }
            if (f61Var2 != null) {
                ArrayList arrayList = f61Var2.d;
                if (arrayList.size() == 1 && ((h61) arrayList.get(0)).b()) {
                    this.f0 = false;
                    this.d0 = true;
                    this.P = f61Var2;
                    this.d.u1(f0(0L, f61Var2.a().d, "other"), false);
                    z11 = h;
                }
            }
            if (e02 != null) {
                this.d0 = false;
                a3.n j3 = sVar.j();
                j3.getClass();
                a3.m mVar = new a3.m(j3);
                mVar.c();
                sVar.b(new a3.n(mVar));
                if (this.f0) {
                    z16 = false;
                } else {
                    this.f0 = true;
                    this.d.u1(f0(0L, e02, "hls"), false);
                }
            } else {
                f61 W = W(Boolean.TRUE);
                if (W == null) {
                    W = W(Boolean.FALSE);
                }
                if (W == null || W.d.isEmpty()) {
                    return;
                }
                this.f0 = false;
                this.P = W;
                this.d0 = W.a;
                this.d.u1(f0(0L, W.a().d, "other"), false);
            }
            z11 = h;
        } else {
            ArrayList arrayList2 = f61Var.d;
            this.d0 = false;
            if (arrayList2.isEmpty()) {
                return;
            }
            Uri e03 = arrayList2.size() > 1 ? e0(this.O) : null;
            if (e03 == null || arrayList2.size() == 1 || sVar.c == null) {
                z11 = h;
                this.f0 = false;
                this.d.u1(f0(0L, f61Var.a().d, "other"), false);
                z16 = true;
            } else {
                if (this.f0) {
                    z12 = false;
                } else {
                    this.f0 = true;
                    this.d.u1(f0(0L, e03, "hls"), false);
                    z12 = true;
                }
                a3.n j10 = sVar.j();
                j10.getClass();
                a3.m mVar2 = new a3.m(j10);
                mVar2.c();
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    h61 h61Var = (h61) arrayList2.get(i13);
                    try {
                        int indexOf = this.Q.indexOf(h61Var);
                        a3.w wVar = sVar.c;
                        int i15 = i11;
                        while (i15 < wVar.a) {
                            try {
                                x2.r1 r1Var = wVar.c[i15];
                                z13 = h;
                                int i16 = 0;
                                while (i16 < r1Var.a) {
                                    try {
                                        e2.m1 a10 = r1Var.a(i16);
                                        z14 = z12;
                                        i7 = size;
                                        int i17 = 0;
                                        while (i17 < a10.a) {
                                            try {
                                                e2.u uVar = a10.d[i17];
                                                int i18 = i15;
                                                try {
                                                    i10 = Integer.parseInt(uVar.a);
                                                } catch (Exception unused) {
                                                    i10 = -1;
                                                }
                                                if (i10 < 0 || indexOf != i10) {
                                                    int i19 = indexOf;
                                                    if (uVar.z == h61Var.i && uVar.A == h61Var.j) {
                                                        n1Var = new e2.n1(a10, i17);
                                                    } else {
                                                        i17++;
                                                        i15 = i18;
                                                        indexOf = i19;
                                                    }
                                                } else {
                                                    n1Var = new e2.n1(a10, i17);
                                                }
                                                z15 = true;
                                            } catch (Exception e10) {
                                                e = e10;
                                                z15 = true;
                                                org.telegram.messenger.a8.g(e, true);
                                                n1Var = null;
                                                if (n1Var != null) {
                                                }
                                                z12 = z14;
                                                z16 = z15;
                                                i13 = i14;
                                                h = z13;
                                                size = i7;
                                                i11 = 0;
                                            }
                                        }
                                        i16++;
                                        z12 = z14;
                                        size = i7;
                                    } catch (Exception e11) {
                                        e = e11;
                                        z14 = z12;
                                        i7 = size;
                                        z15 = true;
                                        org.telegram.messenger.a8.g(e, true);
                                        n1Var = null;
                                        if (n1Var != null) {
                                        }
                                        z12 = z14;
                                        z16 = z15;
                                        i13 = i14;
                                        h = z13;
                                        size = i7;
                                        i11 = 0;
                                    }
                                }
                                i15++;
                                h = z13;
                                z16 = true;
                            } catch (Exception e12) {
                                e = e12;
                                z13 = h;
                            }
                        }
                        z13 = h;
                        z14 = z12;
                        i7 = size;
                        z15 = z16;
                    } catch (Exception e13) {
                        e = e13;
                        z13 = h;
                    }
                    n1Var = null;
                    if (n1Var != null) {
                        mVar2.H.put(n1Var.a, n1Var);
                    }
                    z12 = z14;
                    z16 = z15;
                    i13 = i14;
                    h = z13;
                    size = i7;
                    i11 = 0;
                }
                z11 = h;
                sVar.b(new a3.n(mVar2));
                z16 = z12;
            }
        }
        if (z16) {
            this.d.a();
            if (!z10) {
                this.d.Z0(5, l10);
                if (z11) {
                    this.d.f();
                }
            }
            org.telegram.ui.zn0 zn0Var = this.i0;
            if (zn0Var != null) {
                org.telegram.messenger.g0.g3(zn0Var);
            }
            l0.add(Integer.valueOf(this.a));
        }
    }

    public final void x0(int i7) {
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.D(new e2.e(i7 == 0 ? 1 : 3, 0, i7 == 0 ? 2 : 1, 1, false, 0, true), false);
        }
        l2.f0 f0Var2 = this.e;
        if (f0Var2 != null) {
            f0Var2.D(new e2.e(i7 == 0 ? 1 : 2, 0, i7 == 0 ? 2 : 1, 1, false, 0, true), true);
        }
    }

    @Override // e2.a1
    public final void y(e2.v0 v0Var) {
        org.telegram.messenger.g0.g3(new fm0(22, this, v0Var));
    }

    public final void y0(Surface surface) {
        if (this.s == surface) {
            return;
        }
        this.s = surface;
        l2.f0 f0Var = this.d;
        if (f0Var == null) {
            return;
        }
        f0Var.y1(surface);
    }

    public final void z0(SurfaceView surfaceView) {
        if (this.r == surfaceView) {
            return;
        }
        this.r = surfaceView;
        l2.f0 f0Var = this.d;
        if (f0Var == null) {
            return;
        }
        f0Var.F1();
        f0Var.S(surfaceView == null ? null : surfaceView.getHolder());
    }

    public i61(boolean z10, boolean z11) {
        int i7 = k0;
        k0 = i7 + 1;
        this.a = i7;
        this.b0 = new Handler(Looper.getMainLooper());
        this.d0 = false;
        this.e0 = -1;
        this.g0 = -9223372036854775807L;
        this.h0 = -9223372036854775807L;
        this.j0 = new ArrayList();
        this.c0 = z11;
        this.h = new ExtendedDefaultDataSourceFactory(org.telegram.messenger.t0.b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        a3.s sVar = new a3.s(org.telegram.messenger.t0.b, new nb.a(1));
        this.f = sVar;
        if (z11) {
            a3.n j3 = sVar.j();
            j3.getClass();
            a3.m mVar = new a3.m(j3);
            mVar.I.add(1);
            sVar.b(new a3.n(mVar));
        }
        this.M = 1;
        this.X = z10;
        if (z10) {
            org.telegram.messenger.ls.e().b(this, org.telegram.messenger.ls.K4);
        }
    }

    @Override // e2.a1
    public void onRenderedFirstFrame() {
        this.K.onRenderedFirstFrame();
    }

    @Override // e2.a1
    public final /* synthetic */ void B(List list) {
    }

    @Override // e2.a1
    public final /* synthetic */ void F(e2.z0 z0Var) {
    }

    @Override // m2.b
    public final /* synthetic */ void G(e2.v0 v0Var) {
    }

    @Override // e2.a1
    public final void H(e2.w0 w0Var) {
    }

    @Override // e2.a1
    public final /* synthetic */ void M(e2.q0 q0Var) {
    }

    @Override // e2.a1
    public final /* synthetic */ void O(e2.y0 y0Var) {
    }

    @Override // e2.a1
    public final /* synthetic */ void P(boolean z10) {
    }

    @Override // m2.b
    public final /* synthetic */ void b(x2.c0 c0Var) {
    }

    @Override // e2.a1
    public final /* synthetic */ void d(int i7) {
    }

    @Override // e2.a1
    public final void e(int i7) {
    }

    @Override // e2.a1
    public final /* synthetic */ void f(boolean z10) {
    }

    @Override // e2.a1
    public final /* synthetic */ void g(int i7) {
    }

    @Override // e2.a1
    public final /* synthetic */ void h(boolean z10) {
    }

    @Override // e2.a1
    public final /* synthetic */ void i(int i7) {
    }

    @Override // e2.a1
    public final /* synthetic */ void j(boolean z10) {
    }

    @Override // e2.a1
    public final /* synthetic */ void l(float f10) {
    }

    @Override // e2.a1
    public final /* synthetic */ void m(int i7) {
    }

    @Override // e2.a1
    public final /* synthetic */ void n(e2.o0 o0Var) {
    }

    @Override // e2.a1
    public final /* synthetic */ void o(e2.e eVar) {
    }

    @Override // e2.a1
    public final /* synthetic */ void p(e2.o0 o0Var) {
    }

    @Override // e2.a1
    public final /* synthetic */ void q(e2.v0 v0Var) {
    }

    @Override // e2.a1
    public final /* synthetic */ void t(boolean z10) {
    }

    @Override // m2.b
    public final /* synthetic */ void w(e2.x1 x1Var) {
    }

    @Override // e2.a1
    public final /* synthetic */ void x(g2.c cVar) {
    }

    @Override // m2.b
    public final /* synthetic */ void z(l2.d dVar) {
    }

    @Override // m2.b
    public final /* synthetic */ void A(e2.c1 c1Var, ji.l lVar) {
    }

    @Override // e2.a1
    public final /* synthetic */ void J(int i7, int i10) {
    }

    @Override // e2.a1
    public final /* synthetic */ void L(e2.l1 l1Var, int i7) {
    }

    @Override // e2.a1
    public final /* synthetic */ void k(int i7, boolean z10) {
    }

    @Override // m2.b
    public final /* synthetic */ void r(m2.a aVar, x2.c0 c0Var) {
    }

    @Override // e2.a1
    public final /* synthetic */ void v(int i7, e2.l0 l0Var) {
    }

    @Override // m2.b
    public final /* synthetic */ void c(m2.a aVar, int i7, long j3) {
    }

    @Override // e2.a1
    public final void s(e2.b1 b1Var, e2.b1 b1Var2, int i7) {
    }
}
