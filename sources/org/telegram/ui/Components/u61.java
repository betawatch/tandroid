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
import b2.p0;
import g2.g;
import hb.a;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import jb.b;
import l2.f;
import l2.h;
import li.k;
import m5.e;
import n2.m;
import o2.c;
import o2.l;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.utils.twidget.t;
import p2.d;
import t7.u;
import u2.f0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class u61 implements b2.d1, b2.a2, j2.b, org.telegram.messenger.us {
    public static int j0;
    public static final HashSet k0 = new HashSet();
    public static HashMap l0;
    public boolean D;
    public boolean E;
    public Uri F;
    public boolean G;
    public boolean H;
    public boolean I;
    public s61 J;
    public o61 K;
    public int L;
    public boolean M;
    public ArrayList N;
    public r61 O;
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
    public org.telegram.messenger.s5 b;
    public final boolean b0;
    public boolean c;
    public boolean c0;
    public i2.i0 d;
    public int d0;
    public i2.i0 e;
    public boolean e0;
    public final x2.o f;
    public long f0;
    public long g0;
    public final ExtendedDefaultDataSourceFactory h;
    public org.telegram.ui.qo0 h0;
    public final ArrayList i0;
    public TextureView n;
    public SurfaceView r;
    public Surface s;
    public boolean w;
    public boolean x;
    public boolean y;

    public u61() {
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
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
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
            if (!org.telegram.messenger.vp.d1().getBoolean("unsupport_".concat(concat), false)) {
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

    public static t61 L(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((r61) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                t61 t61Var = (t61) obj2;
                if (t61Var.b()) {
                    return t61Var;
                }
            }
        }
        return null;
    }

    public static ArrayList X(int i10, TLRPC.Document document, ArrayList arrayList, int i11, boolean z10) {
        r61 r61Var;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!org.telegram.messenger.vp.r1(i10).G6 && arrayList != null) {
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
                    org.telegram.messenger.f8.g(e, true);
                }
            }
            i12++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i13);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    t61 d = t61.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.id), i11, z10);
                    if (d.i > 0 && d.j > 0) {
                        if (document3 == document) {
                            d.b = true;
                        }
                        arrayList3.add(d);
                    }
                }
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
            t61 t61Var = (t61) arrayList3.get(i14);
            String str2 = t61Var.m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(t61Var.m) && !"hevc".equals(t61Var.m) && !"h265".equals(t61Var.m) && !"vp9".equals(t61Var.m)) || D0(t61Var.m))) {
                arrayList4.add(t61Var);
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
            t61 t61Var2 = (t61) obj;
            if (t61Var2.b) {
                arrayList6.add(new r61(t61Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size2) {
                        r61Var = null;
                        break;
                    }
                    Object obj2 = arrayList6.get(i16);
                    i16++;
                    r61Var = (r61) obj2;
                    if (!r61Var.a && r61Var.b == t61Var2.i && r61Var.c == t61Var2.j) {
                        break;
                    }
                }
                if (r61Var == null || org.telegram.messenger.tz.R0) {
                    arrayList6.add(new r61(t61Var2));
                } else {
                    r61Var.d.add(t61Var2);
                }
            }
        }
        return arrayList6;
    }

    public static t61 a0(ArrayList arrayList) {
        int i10;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ArrayList arrayList2 = ((r61) obj).d;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                t61 t61Var = (t61) obj2;
                if (t61Var.b && t61Var.b()) {
                    return t61Var;
                }
            }
        }
        int size3 = arrayList.size();
        t61 t61Var2 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            ArrayList arrayList3 = ((r61) obj3).d;
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                t61 t61Var3 = (t61) obj4;
                if (!t61Var3.b && D0(t61Var3.m) && (t61Var2 == null || (i10 = t61Var3.i * t61Var3.j) > (i11 = t61Var2.i * t61Var2.j) || (i10 == i11 && t61Var3.l < t61Var2.l))) {
                    t61Var2 = t61Var3;
                }
            }
        }
        if (t61Var2 == null) {
            int size5 = arrayList.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList.get(i16);
                i16++;
                ArrayList arrayList4 = ((r61) obj5).d;
                int size6 = arrayList4.size();
                int i17 = 0;
                while (i17 < size6) {
                    Object obj6 = arrayList4.get(i17);
                    i17++;
                    t61 t61Var4 = (t61) obj6;
                    if (t61Var2 == null || t61Var2.i * t61Var2.j > t61Var4.i * t61Var4.j || t61Var4.l < t61Var2.l) {
                        t61Var2 = t61Var4;
                    }
                }
            }
        }
        return t61Var2;
    }

    public static t61 b0(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((r61) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                t61 t61Var = (t61) obj2;
                if (t61Var.b()) {
                    return t61Var;
                }
            }
        }
        int size3 = arrayList.size();
        t61 t61Var2 = null;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ArrayList arrayList3 = ((r61) obj3).d;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                t61 t61Var3 = (t61) obj4;
                if (!t61Var3.b && (t61Var2 == null || t61Var2.i * t61Var2.j > t61Var3.i * t61Var3.j || t61Var3.l < t61Var2.l)) {
                    if (t61Var3.i <= 900 && t61Var3.j <= 900) {
                        t61Var2 = t61Var3;
                    }
                }
            }
        }
        if (t61Var2 == null) {
            int size5 = arrayList.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj5 = arrayList.get(i14);
                i14++;
                ArrayList arrayList4 = ((r61) obj5).d;
                int size6 = arrayList4.size();
                int i15 = 0;
                while (i15 < size6) {
                    Object obj6 = arrayList4.get(i15);
                    i15++;
                    t61 t61Var4 = (t61) obj6;
                    if (t61Var2 == null || t61Var2.i * t61Var2.j > t61Var4.i * t61Var4.j || t61Var4.l < t61Var2.l) {
                        t61Var2 = t61Var4;
                    }
                }
            }
        }
        return t61Var2;
    }

    public static void n0(org.telegram.messenger.jj jjVar, boolean z10) {
        if (jjVar == null) {
            return;
        }
        org.telegram.messenger.w0.b.getSharedPreferences("media_saved_pos", 0).edit().putBoolean(org.telegram.messenger.jj.B0(jjVar.k) + "_" + jjVar.f1() + "loop", z10).apply();
    }

    public static void o0(r61 r61Var, org.telegram.messenger.jj jjVar) {
        if (jjVar == null) {
            return;
        }
        long B0 = org.telegram.messenger.jj.B0(jjVar.k);
        int f12 = jjVar.f1();
        SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("media_saved_pos", 0).edit();
        if (r61Var == null) {
            edit.remove(B0 + "_" + f12 + "q2");
        } else {
            String str = B0 + "_" + f12 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(r61Var.b);
            sb2.append("x");
            sb2.append(r61Var.c);
            sb2.append(r61Var.a ? "s" : "");
            edit.putString(str, sb2.toString());
        }
        edit.apply();
    }

    public final void A0(TextureView textureView) {
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

    @Override // j2.b
    public final void B(j2.a aVar, int i10) {
        if (i10 == 1) {
            s61 s61Var = this.J;
            if (s61Var != null) {
                s61Var.onSeekFinished(aVar);
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

    public final void B0(float f7) {
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.S(f7);
        }
        i2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.S(f7);
        }
    }

    public final void C0(org.telegram.messenger.s5 s5Var) {
        this.b = s5Var;
        if (s5Var == null) {
            this.d.s0 = null;
        } else {
            this.d.s0 = new n61(s5Var);
        }
    }

    public final void G() {
        HashMap hashMap = new HashMap();
        hashMap.put(j2.l.c.a, 144179200);
        y2.d dVar = new y2.d();
        boolean z10 = this.c;
        int i10 = z10 ? 1000 : 100;
        int i11 = z10 ? 1000 : 2000;
        i2.h.a(i10, 0, "bufferForPlaybackMs", "0");
        i2.h.a(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i2.h.a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        i2.h.a(50000, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i2.h.a(50000, 50000, "maxBufferMs", "minBufferMs");
        i2.h.a(0, 0, "backBufferDurationMs", "0");
        i2.h hVar = new i2.h(dVar, 50000, i10, i10, i11, i11, false, hashMap);
        if (this.d == null) {
            i2.j p61Var = this.K != null ? new p61(org.telegram.messenger.w0.b, this) : new i2.j(org.telegram.messenger.w0.b);
            p61Var.c = 1;
            i2.n nVar = new i2.n(org.telegram.messenger.w0.b);
            v7.t6.p(!nVar.z);
            nVar.c = new i2.m(p61Var, 2);
            x2.o oVar = this.f;
            v7.t6.p(!nVar.z);
            oVar.getClass();
            nVar.e = new i2.m(oVar, 1);
            v7.t6.p(!nVar.z);
            nVar.f = new i2.m(hVar, 0);
            i2.i0 a2 = nVar.a();
            this.d = a2;
            j2.g gVar = a2.s;
            gVar.getClass();
            gVar.f.a(this);
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
                        i0Var.R(surfaceView.getHolder());
                    }
                }
            }
            this.d.W(this.x);
            this.d.k(this.V ? 2 : 0);
        }
        if (this.y && this.e == null) {
            i2.n nVar2 = new i2.n(org.telegram.messenger.w0.b);
            x2.o oVar2 = this.f;
            v7.t6.p(!nVar2.z);
            oVar2.getClass();
            nVar2.e = new i2.m(oVar2, 1);
            v7.t6.p(true ^ nVar2.z);
            nVar2.f = new i2.m(hVar, 0);
            i2.i0 a10 = nVar2.a();
            this.e = a10;
            a10.m.a(new e2.z(this, 3));
            this.e.W(this.x);
        }
    }

    @Override // b2.d1
    public final void H(b2.y0 y0Var) {
        org.telegram.messenger.i0.g3(new gi0(23, this, y0Var));
    }

    public final long J() {
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            return this.w ? i0Var.c0() : i0Var.getDuration();
        }
        return 0L;
    }

    @Override // b2.d1
    public final void K(int i10, boolean z10) {
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            boolean t10 = i0Var.t();
            int h = this.d.h();
            if (this.M != t10 || this.L != h) {
                this.J.onStateChanged(t10, h);
                this.M = t10;
                this.L = h;
            }
        }
        if (z10 && i10 == 3 && !c0() && this.W) {
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.H4, this);
        }
        if (!this.G && i10 == 3) {
            this.G = true;
            if (this.H && this.I) {
                h0();
            }
        }
        if (i10 != 3) {
            this.a0.removeCallbacksAndMessages(null);
            o61 o61Var = this.K;
            if (o61Var != null) {
                o61Var.B(false, null);
            }
        }
    }

    @Override // b2.d1
    public final void N(b2.w1 w1Var) {
        org.telegram.ui.qo0 qo0Var = this.h0;
        if (qo0Var != null) {
            org.telegram.messenger.i0.g3(qo0Var);
        }
    }

    public final bi.j4 Q(String str, String str2, String str3) {
        if (this.N == null) {
            if (this.Q == null) {
                return null;
            }
            String h = sc.e.h("/mtproto_", str);
            String queryParameter = this.Q.getQueryParameter("mime");
            hf.e eVar = new hf.e(this.Q, TextUtils.isEmpty(queryParameter) ? "video/mp4" : queryParameter, h);
            eVar.e = str2;
            eVar.f = str3;
            return new bi.j4(new hf.f(eVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ArrayList arrayList3 = ((r61) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                t61 t61Var = (t61) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(t61Var.c);
                String sb3 = sb2.toString();
                TLRPC.Document document = t61Var.g;
                String str4 = document != null ? document.mime_type : null;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                hf.e eVar2 = new hf.e(t61Var.d, str4, sb3);
                eVar2.e = str2;
                eVar2.f = str3;
                int i12 = t61Var.i;
                int i13 = t61Var.j;
                eVar2.a = i12;
                eVar2.b = i13;
                arrayList.add(new hf.f(eVar2));
                arrayList2 = arrayList4;
            }
        }
        return new bi.j4(arrayList);
    }

    public final TLRPC.Document R() {
        ArrayList arrayList;
        i2.i0 i0Var = this.d;
        if (i0Var == null) {
            return null;
        }
        i0Var.F1();
        b2.x xVar = i0Var.S;
        if (xVar == null || xVar.o == 0 || (arrayList = this.N) == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((r61) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                t61 t61Var = (t61) obj2;
                if (t61Var.c == xVar.o) {
                    return t61Var.g;
                }
            }
        }
        return null;
    }

    public final long S() {
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

    public final int T() {
        if (this.d0 == -1) {
            try {
                if (this.c0) {
                    for (int i10 = 0; i10 < Y(); i10++) {
                        if (Z(i10).a) {
                            return i10;
                        }
                    }
                }
                i2.i0 i0Var = this.d;
                if (i0Var != null) {
                    i0Var.F1();
                    b2.x xVar = i0Var.S;
                    if (xVar != null) {
                        for (int i11 = 0; i11 < Y(); i11++) {
                            r61 Z = Z(i11);
                            if (!Z.a && xVar.z == Z.b && xVar.A == Z.c && xVar.j == ((int) Math.floor(((t61) Z.d.get(0)).l * 8.0d))) {
                                return i11;
                            }
                        }
                    }
                }
                return -1;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return -1;
            }
        }
        return this.d0;
    }

    public final long U() {
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

    public final vh.m5 V(vh.m5 m5Var) {
        if (m5Var == null) {
            m5Var = new vh.m5();
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
                    m5Var.b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    m5Var.a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return m5Var;
    }

    public final r61 W(Boolean bool) {
        r61 r61Var = null;
        for (int i10 = 0; i10 < Y(); i10++) {
            r61 Z = Z(i10);
            if (Z.a == bool.booleanValue() && (r61Var == null || r61Var.b * r61Var.c < Z.b * Z.c)) {
                r61Var = Z;
            }
        }
        return r61Var;
    }

    public final int Y() {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final r61 Z(int i10) {
        ArrayList arrayList = this.N;
        return arrayList == null ? W(Boolean.FALSE) : (i10 < 0 || i10 >= arrayList.size()) ? W(Boolean.FALSE) : (r61) this.N.get(i10);
    }

    public final boolean c0() {
        i2.i0 i0Var = this.d;
        if (i0Var == null) {
            return false;
        }
        i0Var.F1();
        return i0Var.b0 == 0.0f;
    }

    @Override // b2.d1
    public final void d(b2.b2 b2Var) {
        if (Objects.equals(b2Var, b2.b2.d)) {
            return;
        }
        this.J.onVideoSizeChanged(b2Var.a, b2Var.b, 0, b2Var.c);
    }

    public final boolean d0() {
        if (this.y && this.I) {
            return true;
        }
        i2.i0 i0Var = this.d;
        return i0Var != null && i0Var.t();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != org.telegram.messenger.zs.H4 || ((u61) objArr[0]) == this || !d0() || this.D) {
            return;
        }
        g0();
    }

    public final Uri e0(ArrayList arrayList) {
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
            ArrayList arrayList3 = ((r61) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                t61 t61Var = (t61) obj2;
                long j10 = t61Var.c;
                Uri uri = t61Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j10, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(t61Var.e, t61Var.f);
                if (t61Var.f != null) {
                    this.P.add(t61Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(t61Var.l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(t61Var.i);
                    sb3.append("x");
                    sb3.append(t61Var.j);
                    String str2 = t61Var.m;
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
                    if (t61Var.b() && t61Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(t61Var.c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(t61Var.a);
                    sb3.append("\"\n");
                    if (t61Var.c()) {
                        sb3.append(t61Var.f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(t61Var.e);
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
    public final u2.a f0(long j10, Uri uri, String str) {
        b2.i0 i0Var;
        b2.k0 k0Var;
        n2.m n10;
        n2.m mVar;
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = new b2.g0();
        List list = Collections.EMPTY_LIST;
        e9.x1 x1Var = e9.x1.e;
        b2.i0 i0Var2 = new b2.i0();
        b2.l0 l0Var = b2.l0.d;
        v7.t6.p(g0Var.b == null || g0Var.a != null);
        if (uri != null) {
            b2.h0 h0Var = g0Var.a != null ? new b2.h0(g0Var) : null;
            i0Var = i0Var2;
            k0Var = new b2.k0(uri, null, h0Var, null, list, null, x1Var, -9223372036854775807L);
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
                        public final f a;
                        public c b;
                        public u c;
                        public final k i = new k(7);
                        public final b f = new b(17);
                        public final t g = d.J;
                        public final a j = new a(27);
                        public final kb.a h = new kb.a(21);
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
                        public final l a(p0 p0Var2) {
                            p0Var2.b.getClass();
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
                            List list2 = p0Var2.b.e;
                            boolean isEmpty = list2.isEmpty();
                            p2.t tVar = this.f;
                            if (!isEmpty) {
                                tVar = new e(17, tVar, list2);
                            }
                            m u10 = this.i.u(p0Var2);
                            this.g.getClass();
                            f fVar = this.a;
                            a aVar = this.j;
                            return new l(p0Var2, fVar, cVar2, this.h, u10, aVar, new d(fVar, aVar, tVar), this.m, this.k, this.l);
                        }
                    };
                }
                return a(p0Var);
            }
            if (str.equals("dash")) {
                if (this.X == null) {
                    this.X = new u2.f0(extendedDefaultDataSourceFactory) { // from class: androidx.media3.exoplayer.dash.DashMediaSource$Factory
                        public final a5.a a;
                        public final g b;
                        public final k c;
                        public final kb.a d;
                        public final a e;
                        public final long f;
                        public final long g;

                        {
                            a5.a aVar = new a5.a(extendedDefaultDataSourceFactory);
                            this.a = aVar;
                            this.b = extendedDefaultDataSourceFactory;
                            this.c = new k(7);
                            this.e = new a(27);
                            this.f = 30000L;
                            this.g = 5000000L;
                            this.d = new kb.a(21);
                            ((c5.e) aVar.d).b = true;
                        }

                        @Override // u2.f0
                        public final u2.a a(p0 p0Var2) {
                            p0Var2.b.getClass();
                            m2.e eVar = new m2.e();
                            List list2 = p0Var2.b.e;
                            return new h(p0Var2, this.b, !list2.isEmpty() ? new e(25, eVar, list2) : eVar, this.a, this.d, this.c.u(p0Var2), this.e, this.f, this.g);
                        }

                        @Override // u2.f0
                        public final f0 b(boolean z10) {
                            ((c5.e) this.a.d).b = z10;
                            return this;
                        }

                        @Override // u2.f0
                        public final f0 c(int i10) {
                            ((c5.e) this.a.d).a = i10;
                            return this;
                        }

                        @Override // u2.f0
                        public final f0 d(u uVar) {
                            c5.e eVar = (c5.e) this.a.d;
                            eVar.getClass();
                            eVar.c = uVar;
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
        m4.x0 x0Var = new m4.x0(this, j10, 5);
        rh.d0 d0Var2 = new rh.d0(new c3.m(), 19);
        Object obj = new Object();
        hb.a aVar = new hb.a(27);
        k0Var.getClass();
        p0Var.b.getClass();
        b2.h0 h0Var2 = p0Var.b.c;
        if (h0Var2 == null) {
            mVar = n2.m.m;
        } else {
            synchronized (obj) {
                try {
                    n10 = !h0Var2.equals(null) ? li.k.n(h0Var2) : null;
                    n10.getClass();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            mVar = n10;
        }
        return new u2.y0(p0Var, x0Var, d0Var2, mVar, aVar, TLObject.FLAG_20, null);
    }

    public void g0() {
        this.I = false;
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.W(false);
        }
        i2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.W(false);
        }
        if (this.K != null) {
            this.a0.removeCallbacksAndMessages(null);
            this.K.B(false, null);
        }
    }

    public void h0() {
        this.I = true;
        if (!this.y || (this.H && this.G)) {
            i2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.W(true);
            }
            i2.i0 i0Var2 = this.e;
            if (i0Var2 != null) {
                i0Var2.W(true);
                return;
            }
            return;
        }
        i2.i0 i0Var3 = this.d;
        if (i0Var3 != null) {
            i0Var3.W(false);
        }
        i2.i0 i0Var4 = this.e;
        if (i0Var4 != null) {
            i0Var4.W(false);
        }
    }

    public final void i0(long j10, Uri uri, String str) {
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
        this.y = false;
        this.F = uri;
        String scheme = uri != null ? uri.getScheme() : null;
        if (scheme != null && !scheme.startsWith("file")) {
            z10 = true;
        }
        this.w = z10;
        G();
        this.d.u1(f0(j10, uri, str), true);
        this.d.a();
    }

    public final void j0(Uri uri, String str) {
        i0(0L, uri, str);
    }

    public final void k0(ArrayList arrayList, r61 r61Var) {
        ArrayList arrayList2;
        this.N = arrayList;
        this.O = r61Var;
        this.Q = null;
        this.S = "hls";
        this.R = null;
        this.T = null;
        this.U = false;
        this.c0 = false;
        this.G = false;
        this.y = false;
        this.F = null;
        this.w = true;
        G();
        this.e0 = false;
        this.d0 = (r61Var == null || (arrayList2 = this.N) == null) ? -1 : arrayList2.indexOf(r61Var);
        w0(true, r61Var);
        if (this.c0) {
            this.d0 = -1;
        }
    }

    public final void l0(Uri uri, String str, Uri uri2, String str2) {
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
        this.y = true;
        this.H = false;
        this.G = false;
        G();
        u2.x xVar2 = null;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            u2.x xVar3 = new u2.x(f0(0L, uri3, str3));
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

    public final void m0() {
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
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.H4);
        }
    }

    @Override // j2.b
    public final void onRenderedFirstFrame(j2.a aVar) {
        this.g0 = -9223372036854775807L;
        this.f0 = -9223372036854775807L;
        s61 s61Var = this.J;
        if (s61Var != null) {
            s61Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override // j2.b
    public final void onSeekStarted(j2.a aVar) {
        s61 s61Var = this.J;
        if (s61Var != null) {
            s61Var.onSeekStarted(aVar);
        }
    }

    public void p0(long j10) {
        q0(j10, false);
    }

    public final void q0(long j10, boolean z10) {
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.w1(z10 ? i2.v1.d : i2.v1.c);
            this.d.Z0(5, j10);
        }
    }

    public final void r0(long j10, boolean z10, Runnable runnable) {
        if (this.d != null) {
            if (runnable != null) {
                this.i0.add(runnable);
            }
            this.d.w1(z10 ? i2.v1.d : i2.v1.c);
            this.d.Z0(5, j10);
        }
    }

    public final void s0(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            i2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.k(z10 ? 2 : 0);
            }
        }
    }

    public final void t0(boolean z10) {
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.S(z10 ? 0.0f : 1.0f);
        }
        i2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.S(z10 ? 0.0f : 1.0f);
        }
    }

    public void u0(boolean z10) {
        this.I = z10;
        if (z10 && this.y && (!this.H || !this.G)) {
            i2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.W(false);
            }
            i2.i0 i0Var2 = this.e;
            if (i0Var2 != null) {
                i0Var2.W(false);
                return;
            }
            return;
        }
        this.x = z10;
        i2.i0 i0Var3 = this.d;
        if (i0Var3 != null) {
            i0Var3.W(z10);
        }
        i2.i0 i0Var4 = this.e;
        if (i0Var4 != null) {
            i0Var4.W(z10);
        }
    }

    public void v0(float f7) {
        try {
            i2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.c(new b2.z0(f7, f7 > 1.0f ? 0.98f : 1.0f));
            }
        } catch (Exception unused) {
        }
    }

    @Override // b2.d1
    public final void w(b2.u1 u1Var) {
        org.telegram.ui.qo0 qo0Var = this.h0;
        if (qo0Var != null) {
            org.telegram.messenger.i0.g3(qo0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(boolean z10, r61 r61Var) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean z15;
        b2.q1 q1Var;
        int i11;
        r61 r61Var2;
        i2.i0 i0Var = this.d;
        if (i0Var == null) {
            return;
        }
        boolean i02 = i0Var.i0();
        long M0 = this.d.M0();
        if (!z10) {
            this.g0 = M0;
            this.f0 = this.d.getDuration();
        }
        this.O = r61Var;
        x2.o oVar = this.f;
        boolean z16 = true;
        int i12 = 0;
        if (r61Var == null) {
            Uri e02 = e0(this.N);
            int i13 = 0;
            while (true) {
                if (i13 >= Y()) {
                    r61Var2 = null;
                    break;
                }
                r61 Z = Z(i13);
                if (Z.a) {
                    r61Var2 = Z;
                    break;
                }
                i13++;
            }
            if (r61Var2 != null) {
                ArrayList arrayList = r61Var2.d;
                if (arrayList.size() == 1 && ((t61) arrayList.get(0)).b()) {
                    this.e0 = false;
                    this.c0 = true;
                    this.O = r61Var2;
                    this.d.u1(f0(0L, r61Var2.a().d, "other"), false);
                    z11 = i02;
                }
            }
            if (e02 != null) {
                this.c0 = false;
                x2.j j10 = oVar.j();
                j10.getClass();
                x2.i iVar = new x2.i(j10);
                iVar.c();
                oVar.b(new x2.j(iVar));
                if (this.e0) {
                    z16 = false;
                } else {
                    this.e0 = true;
                    this.d.u1(f0(0L, e02, "hls"), false);
                }
            } else {
                r61 W = W(Boolean.TRUE);
                if (W == null) {
                    W = W(Boolean.FALSE);
                }
                if (W == null || W.d.isEmpty()) {
                    return;
                }
                this.e0 = false;
                this.O = W;
                this.c0 = W.a;
                this.d.u1(f0(0L, W.a().d, "other"), false);
            }
            z11 = i02;
        } else {
            ArrayList arrayList2 = r61Var.d;
            this.c0 = false;
            if (arrayList2.isEmpty()) {
                return;
            }
            Uri e03 = arrayList2.size() > 1 ? e0(this.N) : null;
            if (e03 == null || arrayList2.size() == 1 || oVar.c == null) {
                z11 = i02;
                this.e0 = false;
                this.d.u1(f0(0L, r61Var.a().d, "other"), false);
                z16 = true;
            } else {
                if (this.e0) {
                    z12 = false;
                } else {
                    this.e0 = true;
                    this.d.u1(f0(0L, e03, "hls"), false);
                    z12 = true;
                }
                x2.j j11 = oVar.j();
                j11.getClass();
                x2.i iVar2 = new x2.i(j11);
                iVar2.c();
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    int i15 = i14 + 1;
                    t61 t61Var = (t61) arrayList2.get(i14);
                    try {
                        int indexOf = this.P.indexOf(t61Var);
                        x2.s sVar = oVar.c;
                        int i16 = i12;
                        while (i16 < sVar.a) {
                            try {
                                u2.r1 r1Var = sVar.c[i16];
                                z13 = i02;
                                int i17 = 0;
                                while (i17 < r1Var.a) {
                                    try {
                                        b2.p1 a2 = r1Var.a(i17);
                                        z14 = z12;
                                        i10 = size;
                                        int i18 = 0;
                                        while (i18 < a2.a) {
                                            try {
                                                b2.x xVar = a2.d[i18];
                                                int i19 = i16;
                                                try {
                                                    i11 = Integer.parseInt(xVar.a);
                                                } catch (Exception unused) {
                                                    i11 = -1;
                                                }
                                                if (i11 < 0 || indexOf != i11) {
                                                    int i20 = indexOf;
                                                    if (xVar.z == t61Var.i && xVar.A == t61Var.j) {
                                                        q1Var = new b2.q1(a2, i18);
                                                    } else {
                                                        i18++;
                                                        i16 = i19;
                                                        indexOf = i20;
                                                    }
                                                } else {
                                                    q1Var = new b2.q1(a2, i18);
                                                }
                                                z15 = true;
                                            } catch (Exception e) {
                                                e = e;
                                                z15 = true;
                                                org.telegram.messenger.f8.g(e, true);
                                                q1Var = null;
                                                if (q1Var != null) {
                                                }
                                                z12 = z14;
                                                z16 = z15;
                                                i14 = i15;
                                                i02 = z13;
                                                size = i10;
                                                i12 = 0;
                                            }
                                        }
                                        i17++;
                                        z12 = z14;
                                        size = i10;
                                    } catch (Exception e7) {
                                        e = e7;
                                        z14 = z12;
                                        i10 = size;
                                        z15 = true;
                                        org.telegram.messenger.f8.g(e, true);
                                        q1Var = null;
                                        if (q1Var != null) {
                                        }
                                        z12 = z14;
                                        z16 = z15;
                                        i14 = i15;
                                        i02 = z13;
                                        size = i10;
                                        i12 = 0;
                                    }
                                }
                                i16++;
                                i02 = z13;
                                z16 = true;
                            } catch (Exception e10) {
                                e = e10;
                                z13 = i02;
                            }
                        }
                        z13 = i02;
                        z14 = z12;
                        i10 = size;
                        z15 = z16;
                    } catch (Exception e11) {
                        e = e11;
                        z13 = i02;
                    }
                    q1Var = null;
                    if (q1Var != null) {
                        iVar2.H.put(q1Var.a, q1Var);
                    }
                    z12 = z14;
                    z16 = z15;
                    i14 = i15;
                    i02 = z13;
                    size = i10;
                    i12 = 0;
                }
                z11 = i02;
                oVar.b(new x2.j(iVar2));
                z16 = z12;
            }
        }
        if (z16) {
            this.d.a();
            if (!z10) {
                this.d.Z0(5, M0);
                if (z11) {
                    this.d.j();
                }
            }
            org.telegram.ui.qo0 qo0Var = this.h0;
            if (qo0Var != null) {
                org.telegram.messenger.i0.g3(qo0Var);
            }
            k0.add(Integer.valueOf(this.a));
        }
    }

    public final void x0(int i10) {
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.N0(new b2.f(0, 0, i10 == 0 ? 2 : 1, 1, false, 0, true), false);
        }
        i2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.N0(new b2.f(0, 0, i10 == 0 ? 2 : 1, 1, false, 0, true), true);
        }
    }

    public final void y0(Surface surface) {
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

    public final void z0(SurfaceView surfaceView) {
        if (this.r == surfaceView) {
            return;
        }
        this.r = surfaceView;
        i2.i0 i0Var = this.d;
        if (i0Var == null) {
            return;
        }
        i0Var.F1();
        i0Var.R(surfaceView == null ? null : surfaceView.getHolder());
    }

    public u61(boolean z10, boolean z11) {
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
        this.h = new ExtendedDefaultDataSourceFactory(org.telegram.messenger.w0.b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        x2.o oVar = new x2.o(org.telegram.messenger.w0.b, new t7.u(25));
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
            org.telegram.messenger.zs.e().b(this, org.telegram.messenger.zs.H4);
        }
    }

    @Override // b2.d1
    public void onRenderedFirstFrame() {
        this.J.onRenderedFirstFrame();
    }

    @Override // b2.d1
    public final /* synthetic */ void A(d2.d dVar) {
    }

    @Override // b2.d1
    public final /* synthetic */ void D(b2.c1 c1Var) {
    }

    @Override // j2.b
    public final /* synthetic */ void E(b2.y0 y0Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void F(b2.u0 u0Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void I(List list) {
    }

    @Override // b2.d1
    public final /* synthetic */ void P(boolean z10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void a(int i10) {
    }

    @Override // j2.b
    public final /* synthetic */ void b(i2.d dVar) {
    }

    @Override // b2.d1
    public final void c(int i10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void e(boolean z10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void f(int i10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void g(boolean z10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void h(int i10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void i(b2.s0 s0Var) {
    }

    @Override // j2.b
    public final /* synthetic */ void j(u2.c0 c0Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void k(boolean z10) {
    }

    @Override // j2.b
    public final /* synthetic */ void l(b2.b2 b2Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void m(b2.s0 s0Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void p(b2.b1 b1Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void q(float f7) {
    }

    @Override // b2.d1
    public final /* synthetic */ void u(int i10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void v(b2.y0 y0Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void x(boolean z10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void y(b2.f fVar) {
    }

    @Override // b2.d1
    public final void z(b2.z0 z0Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void C(int i10, b2.p0 p0Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void M(int i10, int i11) {
    }

    @Override // b2.d1
    public final /* synthetic */ void O(b2.o1 o1Var, int i10) {
    }

    @Override // j2.b
    public final /* synthetic */ void n(j2.a aVar, u2.c0 c0Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void o(int i10, boolean z10) {
    }

    @Override // j2.b
    public final /* synthetic */ void r(b2.f1 f1Var, hf.b bVar) {
    }

    @Override // b2.d1
    public final void s(b2.e1 e1Var, b2.e1 e1Var2, int i10) {
    }

    @Override // j2.b
    public final /* synthetic */ void t(j2.a aVar, int i10, long j10) {
    }
}
