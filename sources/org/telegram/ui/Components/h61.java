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
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Components.i61;
import pb.b;
import q2.m;
import r0.f1;
import r2.c;
import r2.k;
import s2.d;
import s2.e;
import s2.u;
import x2.f0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class h61 implements e2.a1, e2.w1, m2.b, org.telegram.messenger.fs {
    public static int k0;
    public static final HashSet l0 = new HashSet();
    public static HashMap m0;
    public boolean E;
    public boolean F;
    public Uri G;
    public boolean H;
    public boolean I;
    public boolean J;
    public f61 K;
    public b61 L;
    public int M;
    public boolean N;
    public ArrayList O;
    public e61 P;
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
    public l2.g0 d;
    public boolean d0;
    public l2.g0 e;
    public int e0;
    public final a3.s f;
    public boolean f0;
    public long g0;
    public final ExtendedDefaultDataSourceFactory h;
    public long h0;
    public org.telegram.ui.kn0 i0;
    public final ArrayList j0;
    public TextureView n;
    public SurfaceView r;
    public Surface s;
    public boolean w;
    public boolean x;
    public boolean y;

    public h61() {
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
            if (!org.telegram.messenger.mp.g1().getBoolean("unsupport_".concat(concat), false)) {
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

    public static g61 N(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((e61) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                g61 g61Var = (g61) obj2;
                if (g61Var.b()) {
                    return g61Var;
                }
            }
        }
        return null;
    }

    public static ArrayList X(int i7, TLRPC.Document document, ArrayList arrayList, int i10, boolean z10) {
        e61 e61Var;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!org.telegram.messenger.mp.u1(i7).I6 && arrayList != null) {
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
                    g61 d = g61.d(i7, document3, (TLRPC.Document) longSparseArray.get(document3.id), i10, z10);
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
            g61 g61Var = (g61) arrayList3.get(i13);
            String str2 = g61Var.m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(g61Var.m) && !"hevc".equals(g61Var.m) && !"h265".equals(g61Var.m) && !"vp9".equals(g61Var.m)) || D0(g61Var.m))) {
                arrayList4.add(g61Var);
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
            g61 g61Var2 = (g61) obj;
            if (g61Var2.b) {
                arrayList6.add(new e61(g61Var2));
            } else {
                int size2 = arrayList6.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        e61Var = null;
                        break;
                    }
                    Object obj2 = arrayList6.get(i15);
                    i15++;
                    e61Var = (e61) obj2;
                    if (!e61Var.a && e61Var.b == g61Var2.i && e61Var.c == g61Var2.j) {
                        break;
                    }
                }
                if (e61Var == null || org.telegram.messenger.bz.R0) {
                    arrayList6.add(new e61(g61Var2));
                } else {
                    e61Var.d.add(g61Var2);
                }
            }
        }
        return arrayList6;
    }

    public static g61 a0(ArrayList arrayList) {
        int i7;
        int i10;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ArrayList arrayList2 = ((e61) obj).d;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                g61 g61Var = (g61) obj2;
                if (g61Var.b && g61Var.b()) {
                    return g61Var;
                }
            }
        }
        int size3 = arrayList.size();
        g61 g61Var2 = null;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList.get(i13);
            i13++;
            ArrayList arrayList3 = ((e61) obj3).d;
            int size4 = arrayList3.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                g61 g61Var3 = (g61) obj4;
                if (!g61Var3.b && D0(g61Var3.m) && (g61Var2 == null || (i7 = g61Var3.i * g61Var3.j) > (i10 = g61Var2.i * g61Var2.j) || (i7 == i10 && g61Var3.l < g61Var2.l))) {
                    g61Var2 = g61Var3;
                }
            }
        }
        if (g61Var2 == null) {
            int size5 = arrayList.size();
            int i15 = 0;
            while (i15 < size5) {
                Object obj5 = arrayList.get(i15);
                i15++;
                ArrayList arrayList4 = ((e61) obj5).d;
                int size6 = arrayList4.size();
                int i16 = 0;
                while (i16 < size6) {
                    Object obj6 = arrayList4.get(i16);
                    i16++;
                    g61 g61Var4 = (g61) obj6;
                    if (g61Var2 == null || g61Var2.i * g61Var2.j > g61Var4.i * g61Var4.j || g61Var4.l < g61Var2.l) {
                        g61Var2 = g61Var4;
                    }
                }
            }
        }
        return g61Var2;
    }

    public static g61 b0(ArrayList arrayList) {
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((e61) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                g61 g61Var = (g61) obj2;
                if (g61Var.b()) {
                    return g61Var;
                }
            }
        }
        int size3 = arrayList.size();
        g61 g61Var2 = null;
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            ArrayList arrayList3 = ((e61) obj3).d;
            int size4 = arrayList3.size();
            int i12 = 0;
            while (i12 < size4) {
                Object obj4 = arrayList3.get(i12);
                i12++;
                g61 g61Var3 = (g61) obj4;
                if (!g61Var3.b && (g61Var2 == null || g61Var2.i * g61Var2.j > g61Var3.i * g61Var3.j || g61Var3.l < g61Var2.l)) {
                    if (g61Var3.i <= 900 && g61Var3.j <= 900) {
                        g61Var2 = g61Var3;
                    }
                }
            }
        }
        if (g61Var2 == null) {
            int size5 = arrayList.size();
            int i13 = 0;
            while (i13 < size5) {
                Object obj5 = arrayList.get(i13);
                i13++;
                ArrayList arrayList4 = ((e61) obj5).d;
                int size6 = arrayList4.size();
                int i14 = 0;
                while (i14 < size6) {
                    Object obj6 = arrayList4.get(i14);
                    i14++;
                    g61 g61Var4 = (g61) obj6;
                    if (g61Var2 == null || g61Var2.i * g61Var2.j > g61Var4.i * g61Var4.j || g61Var4.l < g61Var2.l) {
                        g61Var2 = g61Var4;
                    }
                }
            }
        }
        return g61Var2;
    }

    public static void n0(org.telegram.messenger.fj fjVar, boolean z10) {
        if (fjVar == null) {
            return;
        }
        org.telegram.messenger.t0.b.getSharedPreferences("media_saved_pos", 0).edit().putBoolean(org.telegram.messenger.fj.B0(fjVar.k) + "_" + fjVar.e1() + "loop", z10).apply();
    }

    public static void o0(e61 e61Var, org.telegram.messenger.fj fjVar) {
        if (fjVar == null) {
            return;
        }
        long B0 = org.telegram.messenger.fj.B0(fjVar.k);
        int e12 = fjVar.e1();
        SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("media_saved_pos", 0).edit();
        if (e61Var == null) {
            edit.remove(B0 + "_" + e12 + "q2");
        } else {
            String str = B0 + "_" + e12 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e61Var.b);
            sb2.append("x");
            sb2.append(e61Var.c);
            sb2.append(e61Var.a ? "s" : "");
            edit.putString(str, sb2.toString());
        }
        edit.apply();
    }

    public final void A0(TextureView textureView) {
        if (this.n == textureView) {
            return;
        }
        this.n = textureView;
        l2.g0 g0Var = this.d;
        if (g0Var == null) {
            return;
        }
        g0Var.z1(textureView);
    }

    public final void B0(float f10) {
        l2.g0 g0Var = this.d;
        if (g0Var != null) {
            g0Var.U(f10);
        }
        l2.g0 g0Var2 = this.e;
        if (g0Var2 != null) {
            g0Var2.U(f10);
        }
    }

    @Override // m2.b
    public final void C(m2.a aVar, int i7) {
        if (i7 == 1) {
            f61 f61Var = this.K;
            if (f61Var != null) {
                f61Var.onSeekFinished(aVar);
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
            this.d.s0 = new a61(r5Var);
        }
    }

    @Override // e2.a1
    public final void D(int i7, boolean z10) {
        l2.g0 g0Var = this.d;
        if (g0Var != null) {
            boolean v = g0Var.v();
            int i10 = this.d.i();
            if (this.N != v || this.M != i10) {
                this.K.onStateChanged(v, i10);
                this.N = v;
                this.M = i10;
            }
        }
        if (z10 && i7 == 3 && !c0() && this.X) {
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.K4, this);
        }
        if (!this.H && i7 == 3) {
            this.H = true;
            if (this.I && this.J) {
                h0();
            }
        }
        if (i7 != 3) {
            this.b0.removeCallbacksAndMessages(null);
            b61 b61Var = this.L;
            if (b61Var != null) {
                b61Var.w(false, null);
            }
        }
    }

    @Override // e2.a1
    public final void E(e2.q1 q1Var) {
        org.telegram.ui.kn0 kn0Var = this.i0;
        if (kn0Var != null) {
            org.telegram.messenger.g0.g3(kn0Var);
        }
    }

    public final void I() {
        HashMap hashMap = new HashMap();
        hashMap.put(m2.i.c.a, 144179200);
        b3.e eVar = new b3.e();
        boolean z10 = this.c;
        int i7 = z10 ? 1000 : 100;
        int i10 = z10 ? 1000 : 2000;
        l2.i.a(i7, 0, "bufferForPlaybackMs", "0");
        l2.i.a(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
        l2.i.a(50000, i7, "minBufferMs", "bufferForPlaybackMs");
        l2.i.a(50000, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        l2.i.a(50000, 50000, "maxBufferMs", "minBufferMs");
        l2.i.a(0, 0, "backBufferDurationMs", "0");
        l2.i iVar = new l2.i(eVar, 50000, i7, i7, i10, i10, false, hashMap);
        if (this.d == null) {
            l2.k c61Var = this.L != null ? new c61(org.telegram.messenger.t0.b, this) : new l2.k(org.telegram.messenger.t0.b);
            c61Var.c = 1;
            l2.o oVar = new l2.o(org.telegram.messenger.t0.b);
            a8.ma.p(!oVar.z);
            oVar.c = new l2.n(c61Var, 2);
            a3.s sVar = this.f;
            a8.ma.p(!oVar.z);
            sVar.getClass();
            oVar.e = new l2.n(sVar, 1);
            a8.ma.p(!oVar.z);
            oVar.f = new l2.n(iVar, 0);
            l2.g0 a10 = oVar.a();
            this.d = a10;
            a10.E(new e2.e(3, 0, 1, 1, false, 0, true), false);
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
                        l2.g0 g0Var = this.d;
                        g0Var.F1();
                        g0Var.T(surfaceView.getHolder());
                    }
                }
            }
            this.d.Y(this.x);
            this.d.k(this.W ? 2 : 0);
        }
        if (this.y && this.e == null) {
            l2.o oVar2 = new l2.o(org.telegram.messenger.t0.b);
            a3.s sVar2 = this.f;
            a8.ma.p(!oVar2.z);
            sVar2.getClass();
            oVar2.e = new l2.n(sVar2, 1);
            a8.ma.p(true ^ oVar2.z);
            oVar2.f = new l2.n(iVar, 0);
            l2.g0 a11 = oVar2.a();
            this.e = a11;
            a11.E(new e2.e(2, 0, 1, 1, false, 0, true), false);
            this.e.m.a(new h2.z(this, 1));
            this.e.Y(this.x);
        }
    }

    public final long K() {
        l2.g0 g0Var = this.d;
        if (g0Var != null) {
            return this.w ? g0Var.e0() : g0Var.getDuration();
        }
        return 0L;
    }

    public final wf.f Q(String str, String str2, String str3) {
        if (this.O == null) {
            if (this.R == null) {
                return null;
            }
            String k10 = p5.c.k("/mtproto_", str);
            String queryParameter = this.R.getQueryParameter("mime");
            v4.x0 x0Var = new v4.x0(this.R, TextUtils.isEmpty(queryParameter) ? "video/mp4" : queryParameter, k10);
            x0Var.g = str2;
            x0Var.h = str3;
            return new wf.f(new wf.e(x0Var));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.O;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            ArrayList arrayList3 = ((e61) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                g61 g61Var = (g61) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(g61Var.c);
                String sb3 = sb2.toString();
                TLRPC.Document document = g61Var.g;
                String str4 = document != null ? document.mime_type : null;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                v4.x0 x0Var2 = new v4.x0(g61Var.d, str4, sb3);
                x0Var2.g = str2;
                x0Var2.h = str3;
                int i11 = g61Var.i;
                int i12 = g61Var.j;
                x0Var2.a = i11;
                x0Var2.b = i12;
                arrayList.add(new wf.e(x0Var2));
                arrayList2 = arrayList4;
            }
        }
        return new wf.f(arrayList);
    }

    public final TLRPC.Document R() {
        ArrayList arrayList;
        l2.g0 g0Var = this.d;
        if (g0Var == null) {
            return null;
        }
        g0Var.F1();
        e2.u uVar = g0Var.S;
        if (uVar == null || uVar.o == 0 || (arrayList = this.O) == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((e61) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                g61 g61Var = (g61) obj2;
                if (g61Var.c == uVar.o) {
                    return g61Var.g;
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
        l2.g0 g0Var = this.d;
        if (g0Var != null) {
            return g0Var.n();
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
                l2.g0 g0Var = this.d;
                if (g0Var != null) {
                    g0Var.F1();
                    e2.u uVar = g0Var.S;
                    if (uVar != null) {
                        for (int i10 = 0; i10 < Y(); i10++) {
                            e61 Z = Z(i10);
                            if (!Z.a && uVar.z == Z.b && uVar.A == Z.c && uVar.j == ((int) Math.floor(((g61) Z.d.get(0)).l * 8.0d))) {
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
        l2.g0 g0Var = this.d;
        if (g0Var != null) {
            return g0Var.getDuration();
        }
        return 0L;
    }

    public final hi.w7 V(hi.w7 w7Var) {
        if (w7Var == null) {
            w7Var = new hi.w7();
        }
        try {
            l2.g0 g0Var = this.d;
            g0Var.F1();
            MediaFormat mediaFormat = ((u2.r) g0Var.g[0]).g0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    w7Var.b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    w7Var.a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return w7Var;
    }

    public final e61 W(Boolean bool) {
        e61 e61Var = null;
        for (int i7 = 0; i7 < Y(); i7++) {
            e61 Z = Z(i7);
            if (Z.a == bool.booleanValue() && (e61Var == null || e61Var.b * e61Var.c < Z.b * Z.c)) {
                e61Var = Z;
            }
        }
        return e61Var;
    }

    public final int Y() {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final e61 Z(int i7) {
        ArrayList arrayList = this.O;
        return arrayList == null ? W(Boolean.FALSE) : (i7 < 0 || i7 >= arrayList.size()) ? W(Boolean.FALSE) : (e61) this.O.get(i7);
    }

    @Override // e2.a1
    public final void b(e2.x1 x1Var) {
        if (Objects.equals(x1Var, e2.x1.d)) {
            return;
        }
        this.K.onVideoSizeChanged(x1Var.a, x1Var.b, 0, x1Var.c);
    }

    public final boolean c0() {
        l2.g0 g0Var = this.d;
        if (g0Var == null) {
            return false;
        }
        g0Var.F1();
        return g0Var.b0 == 0.0f;
    }

    public final boolean d0() {
        if (this.y && this.J) {
            return true;
        }
        l2.g0 g0Var = this.d;
        return g0Var != null && g0Var.v();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ks.K4 || ((h61) objArr[0]) == this || !d0() || this.E) {
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
            ArrayList arrayList3 = ((e61) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                g61 g61Var = (g61) obj2;
                long j3 = g61Var.c;
                Uri uri = g61Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j3, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(g61Var.e, g61Var.f);
                if (g61Var.f != null) {
                    this.Q.add(g61Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(g61Var.l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(g61Var.i);
                    sb3.append("x");
                    sb3.append(g61Var.j);
                    String str2 = g61Var.m;
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
                    if (g61Var.b() && g61Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(g61Var.c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(g61Var.a);
                    sb3.append("\"\n");
                    if (g61Var.c()) {
                        sb3.append(g61Var.f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(g61Var.e);
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
        q2.m s5;
        q2.m mVar;
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        e2.z zVar = new e2.z();
        e2.c0 c0Var = new e2.c0();
        List list = Collections.EMPTY_LIST;
        h9.s1 s1Var = h9.s1.e;
        e2.e0 e0Var2 = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        a8.ma.p(c0Var.b == null || c0Var.a != null);
        if (uri != null) {
            e2.d0 d0Var = c0Var.a != null ? new e2.d0(c0Var) : null;
            e0Var = e0Var2;
            g0Var = new e2.g0(uri, null, d0Var, null, list, null, s1Var, -9223372036854775807L);
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
                        public final i5 a;
                        public c b;
                        public a c;
                        public final i61 i = new i61(9);
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
                            this.a = new i5(extendedDefaultDataSourceFactory);
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
                            u uVar = this.f;
                            if (!isEmpty) {
                                uVar = new e(0, uVar, list2);
                            }
                            m x10 = this.i.x(l0Var2);
                            this.g.getClass();
                            i5 i5Var = this.a;
                            qb.a aVar2 = this.j;
                            return new k(l0Var2, i5Var, cVar2, this.h, x10, aVar2, new d(i5Var, aVar2, uVar), this.m, this.k, this.l);
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
                        public final i61 c;
                        public final a d;
                        public final qb.a e;
                        public final long f;
                        public final long g;

                        {
                            xa xaVar = new xa(extendedDefaultDataSourceFactory);
                            this.a = xaVar;
                            this.b = extendedDefaultDataSourceFactory;
                            this.c = new i61(9);
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
                            p2.e eVar = new p2.e();
                            List list2 = l0Var2.b.e;
                            return new h(l0Var2, this.b, !list2.isEmpty() ? new e(9, eVar, list2) : eVar, this.a, this.d, this.c.x(l0Var2), this.e, this.f, this.g);
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
        ai.z zVar2 = new ai.z(this, j3, 7);
        tg.s sVar = new tg.s(new f3.m(), 18);
        Object obj = new Object();
        qb.a aVar = new qb.a(4);
        g0Var.getClass();
        l0Var.b.getClass();
        e2.d0 d0Var2 = l0Var.b.c;
        if (d0Var2 == null) {
            mVar = q2.m.A;
        } else {
            synchronized (obj) {
                try {
                    s5 = !d0Var2.equals(null) ? i61.s(d0Var2) : null;
                    s5.getClass();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            mVar = s5;
        }
        return new x2.y0(l0Var, zVar2, sVar, mVar, aVar, TLObject.FLAG_20, null);
    }

    public void g0() {
        this.J = false;
        l2.g0 g0Var = this.d;
        if (g0Var != null) {
            g0Var.Y(false);
        }
        l2.g0 g0Var2 = this.e;
        if (g0Var2 != null) {
            g0Var2.Y(false);
        }
        if (this.L != null) {
            this.b0.removeCallbacksAndMessages(null);
            this.L.w(false, null);
        }
    }

    public void h0() {
        this.J = true;
        if (!this.y || (this.I && this.H)) {
            l2.g0 g0Var = this.d;
            if (g0Var != null) {
                g0Var.Y(true);
            }
            l2.g0 g0Var2 = this.e;
            if (g0Var2 != null) {
                g0Var2.Y(true);
                return;
            }
            return;
        }
        l2.g0 g0Var3 = this.d;
        if (g0Var3 != null) {
            g0Var3.Y(false);
        }
        l2.g0 g0Var4 = this.e;
        if (g0Var4 != null) {
            g0Var4.Y(false);
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

    public final void k0(ArrayList arrayList, e61 e61Var) {
        ArrayList arrayList2;
        this.O = arrayList;
        this.P = e61Var;
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
        this.e0 = (e61Var == null || (arrayList2 = this.O) == null) ? -1 : arrayList2.indexOf(e61Var);
        w0(true, e61Var);
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
        l2.g0 g0Var = this.d;
        if (g0Var != null) {
            g0Var.X0();
            this.d = null;
        }
        l2.g0 g0Var2 = this.e;
        if (g0Var2 != null) {
            g0Var2.X0();
            this.e = null;
        }
        if (this.X) {
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.K4);
        }
    }

    @Override // m2.b
    public final void onRenderedFirstFrame(m2.a aVar) {
        this.h0 = -9223372036854775807L;
        this.g0 = -9223372036854775807L;
        f61 f61Var = this.K;
        if (f61Var != null) {
            f61Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override // m2.b
    public final void onSeekStarted(m2.a aVar) {
        f61 f61Var = this.K;
        if (f61Var != null) {
            f61Var.onSeekStarted(aVar);
        }
    }

    public void p0(long j3) {
        q0(j3, false);
    }

    public final void q0(long j3, boolean z10) {
        l2.g0 g0Var = this.d;
        if (g0Var != null) {
            g0Var.w1(z10 ? l2.q1.d : l2.q1.c);
            this.d.Z0(5, j3);
        }
    }

    public final void r0(long j3, boolean z10, Runnable runnable) {
        if (this.d != null) {
            if (runnable != null) {
                this.j0.add(runnable);
            }
            this.d.w1(z10 ? l2.q1.d : l2.q1.c);
            this.d.Z0(5, j3);
        }
    }

    public final void s0(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            l2.g0 g0Var = this.d;
            if (g0Var != null) {
                g0Var.k(z10 ? 2 : 0);
            }
        }
    }

    public final void t0(boolean z10) {
        l2.g0 g0Var = this.d;
        if (g0Var != null) {
            g0Var.U(z10 ? 0.0f : 1.0f);
        }
        l2.g0 g0Var2 = this.e;
        if (g0Var2 != null) {
            g0Var2.U(z10 ? 0.0f : 1.0f);
        }
    }

    @Override // e2.a1
    public final void u(e2.s1 s1Var) {
        org.telegram.ui.kn0 kn0Var = this.i0;
        if (kn0Var != null) {
            org.telegram.messenger.g0.g3(kn0Var);
        }
    }

    public void u0(boolean z10) {
        this.J = z10;
        if (z10 && this.y && (!this.I || !this.H)) {
            l2.g0 g0Var = this.d;
            if (g0Var != null) {
                g0Var.Y(false);
            }
            l2.g0 g0Var2 = this.e;
            if (g0Var2 != null) {
                g0Var2.Y(false);
                return;
            }
            return;
        }
        this.x = z10;
        l2.g0 g0Var3 = this.d;
        if (g0Var3 != null) {
            g0Var3.Y(z10);
        }
        l2.g0 g0Var4 = this.e;
        if (g0Var4 != null) {
            g0Var4.Y(z10);
        }
    }

    public void v0(float f10) {
        try {
            l2.g0 g0Var = this.d;
            if (g0Var != null) {
                g0Var.e(new e2.w0(f10, f10 > 1.0f ? 0.98f : 1.0f));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(boolean z10, e61 e61Var) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i7;
        boolean z15;
        e2.n1 n1Var;
        int i10;
        e61 e61Var2;
        l2.g0 g0Var = this.d;
        if (g0Var == null) {
            return;
        }
        boolean j3 = g0Var.j();
        long n10 = this.d.n();
        if (!z10) {
            this.h0 = n10;
            this.g0 = this.d.getDuration();
        }
        this.P = e61Var;
        a3.s sVar = this.f;
        boolean z16 = true;
        int i11 = 0;
        if (e61Var == null) {
            Uri e02 = e0(this.O);
            int i12 = 0;
            while (true) {
                if (i12 >= Y()) {
                    e61Var2 = null;
                    break;
                }
                e61 Z = Z(i12);
                if (Z.a) {
                    e61Var2 = Z;
                    break;
                }
                i12++;
            }
            if (e61Var2 != null) {
                ArrayList arrayList = e61Var2.d;
                if (arrayList.size() == 1 && ((g61) arrayList.get(0)).b()) {
                    this.f0 = false;
                    this.d0 = true;
                    this.P = e61Var2;
                    this.d.u1(f0(0L, e61Var2.a().d, "other"), false);
                    z11 = j3;
                }
            }
            if (e02 != null) {
                this.d0 = false;
                a3.n j10 = sVar.j();
                j10.getClass();
                a3.m mVar = new a3.m(j10);
                mVar.c();
                sVar.b(new a3.n(mVar));
                if (this.f0) {
                    z16 = false;
                } else {
                    this.f0 = true;
                    this.d.u1(f0(0L, e02, "hls"), false);
                }
            } else {
                e61 W = W(Boolean.TRUE);
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
            z11 = j3;
        } else {
            ArrayList arrayList2 = e61Var.d;
            this.d0 = false;
            if (arrayList2.isEmpty()) {
                return;
            }
            Uri e03 = arrayList2.size() > 1 ? e0(this.O) : null;
            if (e03 == null || arrayList2.size() == 1 || sVar.c == null) {
                z11 = j3;
                this.f0 = false;
                this.d.u1(f0(0L, e61Var.a().d, "other"), false);
                z16 = true;
            } else {
                if (this.f0) {
                    z12 = false;
                } else {
                    this.f0 = true;
                    this.d.u1(f0(0L, e03, "hls"), false);
                    z12 = true;
                }
                a3.n j11 = sVar.j();
                j11.getClass();
                a3.m mVar2 = new a3.m(j11);
                mVar2.c();
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    g61 g61Var = (g61) arrayList2.get(i13);
                    try {
                        int indexOf = this.Q.indexOf(g61Var);
                        a3.w wVar = sVar.c;
                        int i15 = i11;
                        while (i15 < wVar.a) {
                            try {
                                x2.r1 r1Var = wVar.c[i15];
                                z13 = j3;
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
                                                    if (uVar.z == g61Var.i && uVar.A == g61Var.j) {
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
                                                j3 = z13;
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
                                        j3 = z13;
                                        size = i7;
                                        i11 = 0;
                                    }
                                }
                                i15++;
                                j3 = z13;
                                z16 = true;
                            } catch (Exception e12) {
                                e = e12;
                                z13 = j3;
                            }
                        }
                        z13 = j3;
                        z14 = z12;
                        i7 = size;
                        z15 = z16;
                    } catch (Exception e13) {
                        e = e13;
                        z13 = j3;
                    }
                    n1Var = null;
                    if (n1Var != null) {
                        mVar2.H.put(n1Var.a, n1Var);
                    }
                    z12 = z14;
                    z16 = z15;
                    i13 = i14;
                    j3 = z13;
                    size = i7;
                    i11 = 0;
                }
                z11 = j3;
                sVar.b(new a3.n(mVar2));
                z16 = z12;
            }
        }
        if (z16) {
            this.d.a();
            if (!z10) {
                this.d.Z0(5, n10);
                if (z11) {
                    this.d.f();
                }
            }
            org.telegram.ui.kn0 kn0Var = this.i0;
            if (kn0Var != null) {
                org.telegram.messenger.g0.g3(kn0Var);
            }
            l0.add(Integer.valueOf(this.a));
        }
    }

    public final void x0(int i7) {
        l2.g0 g0Var = this.d;
        if (g0Var != null) {
            g0Var.E(new e2.e(i7 == 0 ? 1 : 3, 0, i7 == 0 ? 2 : 1, 1, false, 0, true), false);
        }
        l2.g0 g0Var2 = this.e;
        if (g0Var2 != null) {
            g0Var2.E(new e2.e(i7 == 0 ? 1 : 2, 0, i7 == 0 ? 2 : 1, 1, false, 0, true), true);
        }
    }

    @Override // e2.a1
    public final void y(e2.v0 v0Var) {
        org.telegram.messenger.g0.g3(new sh0(24, this, v0Var));
    }

    public final void y0(Surface surface) {
        if (this.s == surface) {
            return;
        }
        this.s = surface;
        l2.g0 g0Var = this.d;
        if (g0Var == null) {
            return;
        }
        g0Var.y1(surface);
    }

    public final void z0(SurfaceView surfaceView) {
        if (this.r == surfaceView) {
            return;
        }
        this.r = surfaceView;
        l2.g0 g0Var = this.d;
        if (g0Var == null) {
            return;
        }
        g0Var.F1();
        g0Var.T(surfaceView == null ? null : surfaceView.getHolder());
    }

    public h61(boolean z10, boolean z11) {
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
            org.telegram.messenger.ks.e().b(this, org.telegram.messenger.ks.K4);
        }
    }

    @Override // e2.a1
    public void onRenderedFirstFrame() {
        this.K.onRenderedFirstFrame();
    }

    @Override // m2.b
    public final /* synthetic */ void A(l2.e eVar) {
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

    @Override // e2.a1
    public final /* synthetic */ void a(int i7) {
    }

    @Override // e2.a1
    public final /* synthetic */ void c(boolean z10) {
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
    public final /* synthetic */ void k(float f10) {
    }

    @Override // m2.b
    public final /* synthetic */ void l(x2.c0 c0Var) {
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

    @Override // e2.a1
    public final /* synthetic */ void x(g2.c cVar) {
    }

    @Override // m2.b
    public final /* synthetic */ void z(e2.x1 x1Var) {
    }

    @Override // e2.a1
    public final /* synthetic */ void J(int i7, int i10) {
    }

    @Override // e2.a1
    public final /* synthetic */ void L(e2.l1 l1Var, int i7) {
    }

    @Override // m2.b
    public final /* synthetic */ void i(e2.c1 c1Var, j6.k kVar) {
    }

    @Override // e2.a1
    public final /* synthetic */ void j(int i7, boolean z10) {
    }

    @Override // e2.a1
    public final /* synthetic */ void v(int i7, e2.l0 l0Var) {
    }

    @Override // m2.b
    public final /* synthetic */ void w(m2.a aVar, x2.c0 c0Var) {
    }

    @Override // m2.b
    public final /* synthetic */ void r(m2.a aVar, int i7, long j3) {
    }

    @Override // e2.a1
    public final void s(e2.b1 b1Var, e2.b1 b1Var2, int i7) {
    }
}
