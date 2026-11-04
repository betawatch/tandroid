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
import b8.kg;
import cg.v0;
import d2.n0;
import i2.g;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k4.j;
import mb.b;
import n2.h;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i9;
import org.telegram.utils.twidget.a;
import p2.m;
import q2.c;
import q2.l;
import r2.d;
import r2.t;
import ra.e;
import w2.f0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class m51 implements d2.c1, d2.z1, l2.b, org.telegram.messenger.cs {
    public static int k0;
    public static final HashSet l0 = new HashSet();
    public static HashMap m0;
    public boolean E;
    public boolean F;
    public Uri G;
    public boolean H;
    public boolean I;
    public boolean J;
    public k51 K;
    public g51 L;
    public int M;
    public boolean N;
    public ArrayList O;
    public j51 P;
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
    public w2.x0 a0;
    public org.telegram.messenger.q5 b;
    public final Handler b0;
    public boolean c;
    public final boolean c0;
    public k2.i0 d;
    public boolean d0;
    public k2.i0 e;
    public int e0;
    public final z2.n f;
    public boolean f0;
    public long g0;
    public final ExtendedDefaultDataSourceFactory h;
    public long h0;
    public org.telegram.ui.xm0 i0;
    public final ArrayList j0;
    public TextureView n;
    public SurfaceView r;
    public Surface s;
    public boolean w;
    public boolean x;
    public boolean y;

    public m51() {
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
            if (!org.telegram.messenger.hp.e1().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i3 = 0; i3 < codecCount; i3++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i3);
                    if (!codecInfoAt.isEncoder() && t2.w.i(codecInfoAt, concat)) {
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

    public static l51 M(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ArrayList arrayList2 = ((j51) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                l51 l51Var = (l51) obj2;
                if (l51Var.b()) {
                    return l51Var;
                }
            }
        }
        return null;
    }

    public static ArrayList X(int i3, TLRPC.Document document, ArrayList arrayList, int i10, boolean z10) {
        j51 j51Var;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!org.telegram.messenger.hp.s1(i3).F6 && arrayList != null) {
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
                    l51 d = l51.d(i3, document3, (TLRPC.Document) longSparseArray.get(document3.id), i10, z10);
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
            l51 l51Var = (l51) arrayList3.get(i13);
            String str2 = l51Var.m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(l51Var.m) && !"hevc".equals(l51Var.m) && !"h265".equals(l51Var.m) && !"vp9".equals(l51Var.m)) || D0(l51Var.m))) {
                arrayList4.add(l51Var);
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
            l51 l51Var2 = (l51) obj;
            if (l51Var2.b) {
                arrayList6.add(new j51(l51Var2));
            } else {
                int size2 = arrayList6.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        j51Var = null;
                        break;
                    }
                    Object obj2 = arrayList6.get(i15);
                    i15++;
                    j51Var = (j51) obj2;
                    if (!j51Var.a && j51Var.b == l51Var2.i && j51Var.c == l51Var2.j) {
                        break;
                    }
                }
                if (j51Var == null || org.telegram.messenger.az.R0) {
                    arrayList6.add(new j51(l51Var2));
                } else {
                    j51Var.d.add(l51Var2);
                }
            }
        }
        return arrayList6;
    }

    public static l51 a0(ArrayList arrayList) {
        int i3;
        int i10;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ArrayList arrayList2 = ((j51) obj).d;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                l51 l51Var = (l51) obj2;
                if (l51Var.b && l51Var.b()) {
                    return l51Var;
                }
            }
        }
        int size3 = arrayList.size();
        l51 l51Var2 = null;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList.get(i13);
            i13++;
            ArrayList arrayList3 = ((j51) obj3).d;
            int size4 = arrayList3.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                l51 l51Var3 = (l51) obj4;
                if (!l51Var3.b && D0(l51Var3.m) && (l51Var2 == null || (i3 = l51Var3.i * l51Var3.j) > (i10 = l51Var2.i * l51Var2.j) || (i3 == i10 && l51Var3.l < l51Var2.l))) {
                    l51Var2 = l51Var3;
                }
            }
        }
        if (l51Var2 == null) {
            int size5 = arrayList.size();
            int i15 = 0;
            while (i15 < size5) {
                Object obj5 = arrayList.get(i15);
                i15++;
                ArrayList arrayList4 = ((j51) obj5).d;
                int size6 = arrayList4.size();
                int i16 = 0;
                while (i16 < size6) {
                    Object obj6 = arrayList4.get(i16);
                    i16++;
                    l51 l51Var4 = (l51) obj6;
                    if (l51Var2 == null || l51Var2.i * l51Var2.j > l51Var4.i * l51Var4.j || l51Var4.l < l51Var2.l) {
                        l51Var2 = l51Var4;
                    }
                }
            }
        }
        return l51Var2;
    }

    public static l51 b0(ArrayList arrayList) {
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ArrayList arrayList2 = ((j51) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                l51 l51Var = (l51) obj2;
                if (l51Var.b()) {
                    return l51Var;
                }
            }
        }
        int size3 = arrayList.size();
        l51 l51Var2 = null;
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            ArrayList arrayList3 = ((j51) obj3).d;
            int size4 = arrayList3.size();
            int i12 = 0;
            while (i12 < size4) {
                Object obj4 = arrayList3.get(i12);
                i12++;
                l51 l51Var3 = (l51) obj4;
                if (!l51Var3.b && (l51Var2 == null || l51Var2.i * l51Var2.j > l51Var3.i * l51Var3.j || l51Var3.l < l51Var2.l)) {
                    if (l51Var3.i <= 900 && l51Var3.j <= 900) {
                        l51Var2 = l51Var3;
                    }
                }
            }
        }
        if (l51Var2 == null) {
            int size5 = arrayList.size();
            int i13 = 0;
            while (i13 < size5) {
                Object obj5 = arrayList.get(i13);
                i13++;
                ArrayList arrayList4 = ((j51) obj5).d;
                int size6 = arrayList4.size();
                int i14 = 0;
                while (i14 < size6) {
                    Object obj6 = arrayList4.get(i14);
                    i14++;
                    l51 l51Var4 = (l51) obj6;
                    if (l51Var2 == null || l51Var2.i * l51Var2.j > l51Var4.i * l51Var4.j || l51Var4.l < l51Var2.l) {
                        l51Var2 = l51Var4;
                    }
                }
            }
        }
        return l51Var2;
    }

    public static void n0(org.telegram.messenger.zi ziVar, boolean z10) {
        if (ziVar == null) {
            return;
        }
        org.telegram.messenger.t0.b.getSharedPreferences("media_saved_pos", 0).edit().putBoolean(org.telegram.messenger.zi.B0(ziVar.k) + "_" + ziVar.f1() + "loop", z10).apply();
    }

    public static void o0(j51 j51Var, org.telegram.messenger.zi ziVar) {
        if (ziVar == null) {
            return;
        }
        long B0 = org.telegram.messenger.zi.B0(ziVar.k);
        int f12 = ziVar.f1();
        SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("media_saved_pos", 0).edit();
        if (j51Var == null) {
            edit.remove(B0 + "_" + f12 + "q2");
        } else {
            String str = B0 + "_" + f12 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j51Var.b);
            sb2.append("x");
            sb2.append(j51Var.c);
            sb2.append(j51Var.a ? "s" : "");
            edit.putString(str, sb2.toString());
        }
        edit.apply();
    }

    @Override // l2.b
    public final void A(l2.a aVar, int i3) {
        if (i3 == 1) {
            k51 k51Var = this.K;
            if (k51Var != null) {
                k51Var.onSeekFinished(aVar);
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

    public final void A0(TextureView textureView) {
        if (this.n == textureView) {
            return;
        }
        this.n = textureView;
        k2.i0 i0Var = this.d;
        if (i0Var == null) {
            return;
        }
        i0Var.z1(textureView);
    }

    @Override // d2.c1
    public final void B(d2.s1 s1Var) {
        org.telegram.ui.xm0 xm0Var = this.i0;
        if (xm0Var != null) {
            org.telegram.messenger.g0.h3(xm0Var);
        }
    }

    public final void B0(float f10) {
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.R(f10);
        }
        k2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.R(f10);
        }
    }

    public final void C0(org.telegram.messenger.q5 q5Var) {
        this.b = q5Var;
        if (q5Var == null) {
            this.d.s0 = null;
        } else {
            this.d.s0 = new e51(q5Var);
        }
    }

    @Override // d2.c1
    public final void G(int i3, boolean z10) {
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            boolean u10 = i0Var.u();
            int h = this.d.h();
            if (this.N != u10 || this.M != h) {
                this.K.onStateChanged(u10, h);
                this.N = u10;
                this.M = h;
            }
        }
        if (z10 && i3 == 3 && !c0() && this.X) {
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.H4, this);
        }
        if (!this.H && i3 == 3) {
            this.H = true;
            if (this.I && this.J) {
                h0();
            }
        }
        if (i3 != 3) {
            this.b0.removeCallbacksAndMessages(null);
            g51 g51Var = this.L;
            if (g51Var != null) {
                g51Var.r(false, null);
            }
        }
    }

    public final void I() {
        HashMap hashMap = new HashMap();
        hashMap.put(l2.k.c.a, 144179200);
        a3.e eVar = new a3.e();
        boolean z10 = this.c;
        int i3 = z10 ? 1000 : 100;
        int i10 = z10 ? 1000 : 2000;
        k2.h.a(i3, 0, "bufferForPlaybackMs", "0");
        k2.h.a(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k2.h.a(50000, i3, "minBufferMs", "bufferForPlaybackMs");
        k2.h.a(50000, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k2.h.a(50000, 50000, "maxBufferMs", "minBufferMs");
        k2.h.a(0, 0, "backBufferDurationMs", "0");
        k2.h hVar = new k2.h(eVar, 50000, i3, i3, i10, i10, false, hashMap);
        if (this.d == null) {
            k2.j h51Var = this.L != null ? new h51(org.telegram.messenger.t0.b, this) : new k2.j(org.telegram.messenger.t0.b);
            h51Var.c = 1;
            k2.n nVar = new k2.n(org.telegram.messenger.t0.b);
            b8.zb.p(!nVar.z);
            nVar.c = new k2.m(h51Var, 2);
            z2.n nVar2 = this.f;
            b8.zb.p(!nVar.z);
            nVar2.getClass();
            nVar.e = new k2.m(nVar2, 1);
            b8.zb.p(!nVar.z);
            nVar.f = new k2.m(hVar, 0);
            k2.i0 a10 = nVar.a();
            this.d = a10;
            a10.A0(new d2.f(3, 0, 1, 1, false, 0, true), false);
            l2.f fVar = this.d.s;
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
                        k2.i0 i0Var = this.d;
                        i0Var.F1();
                        i0Var.Q(surfaceView.getHolder());
                    }
                }
            }
            this.d.V(this.x);
            this.d.k(this.W ? 2 : 0);
        }
        if (this.y && this.e == null) {
            k2.n nVar3 = new k2.n(org.telegram.messenger.t0.b);
            z2.n nVar4 = this.f;
            b8.zb.p(!nVar3.z);
            nVar4.getClass();
            nVar3.e = new k2.m(nVar4, 1);
            b8.zb.p(true ^ nVar3.z);
            nVar3.f = new k2.m(hVar, 0);
            k2.i0 a11 = nVar3.a();
            this.e = a11;
            a11.A0(new d2.f(2, 0, 1, 1, false, 0, true), false);
            this.e.m.a(new g2.a0(this, 1));
            this.e.V(this.x);
        }
    }

    public final long K() {
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            return this.w ? i0Var.b0() : i0Var.getDuration();
        }
        return 0L;
    }

    public final mi.z3 Q(String str, String str2, String str3) {
        if (this.O == null) {
            if (this.R == null) {
                return null;
            }
            String f10 = t4.c.f("/mtproto_", str);
            String queryParameter = this.R.getQueryParameter("mime");
            tf.e eVar = new tf.e(this.R, TextUtils.isEmpty(queryParameter) ? "video/mp4" : queryParameter, f10);
            eVar.e = str2;
            eVar.f = str3;
            return new mi.z3(new tf.f(eVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.O;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            ArrayList arrayList3 = ((j51) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                l51 l51Var = (l51) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(l51Var.c);
                String sb3 = sb2.toString();
                TLRPC.Document document = l51Var.g;
                String str4 = document != null ? document.mime_type : null;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                tf.e eVar2 = new tf.e(l51Var.d, str4, sb3);
                eVar2.e = str2;
                eVar2.f = str3;
                int i11 = l51Var.i;
                int i12 = l51Var.j;
                eVar2.a = i11;
                eVar2.b = i12;
                arrayList.add(new tf.f(eVar2));
                arrayList2 = arrayList4;
            }
        }
        return new mi.z3(arrayList);
    }

    public final TLRPC.Document R() {
        ArrayList arrayList;
        k2.i0 i0Var = this.d;
        if (i0Var == null) {
            return null;
        }
        i0Var.F1();
        d2.v vVar = i0Var.S;
        if (vVar == null || vVar.o == 0 || (arrayList = this.O) == null) {
            return null;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ArrayList arrayList2 = ((j51) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                l51 l51Var = (l51) obj2;
                if (l51Var.c == vVar.o) {
                    return l51Var.g;
                }
            }
        }
        return null;
    }

    public final long S() {
        long j10 = this.h0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            return i0Var.N0();
        }
        return 0L;
    }

    public final int T() {
        if (this.e0 == -1) {
            try {
                if (this.d0) {
                    for (int i3 = 0; i3 < Y(); i3++) {
                        if (Z(i3).a) {
                            return i3;
                        }
                    }
                }
                k2.i0 i0Var = this.d;
                if (i0Var != null) {
                    i0Var.F1();
                    d2.v vVar = i0Var.S;
                    if (vVar != null) {
                        for (int i10 = 0; i10 < Y(); i10++) {
                            j51 Z = Z(i10);
                            if (!Z.a && vVar.z == Z.b && vVar.A == Z.c && vVar.j == ((int) Math.floor(((l51) Z.d.get(0)).l * 8.0d))) {
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
        long j10 = this.g0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            return i0Var.getDuration();
        }
        return 0L;
    }

    public final gi.e7 V(gi.e7 e7Var) {
        if (e7Var == null) {
            e7Var = new gi.e7();
        }
        try {
            k2.i0 i0Var = this.d;
            i0Var.F1();
            MediaFormat mediaFormat = ((t2.r) i0Var.g[0]).g0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    e7Var.b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    e7Var.a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return e7Var;
    }

    public final j51 W(Boolean bool) {
        j51 j51Var = null;
        for (int i3 = 0; i3 < Y(); i3++) {
            j51 Z = Z(i3);
            if (Z.a == bool.booleanValue() && (j51Var == null || j51Var.b * j51Var.c < Z.b * Z.c)) {
                j51Var = Z;
            }
        }
        return j51Var;
    }

    public final int Y() {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final j51 Z(int i3) {
        ArrayList arrayList = this.O;
        return arrayList == null ? W(Boolean.FALSE) : (i3 < 0 || i3 >= arrayList.size()) ? W(Boolean.FALSE) : (j51) this.O.get(i3);
    }

    public final boolean c0() {
        k2.i0 i0Var = this.d;
        if (i0Var == null) {
            return false;
        }
        i0Var.F1();
        return i0Var.b0 == 0.0f;
    }

    public final boolean d0() {
        if (this.y && this.J) {
            return true;
        }
        k2.i0 i0Var = this.d;
        return i0Var != null && i0Var.u();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 != org.telegram.messenger.hs.H4 || ((m51) objArr[0]) == this || !d0() || this.E) {
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ArrayList arrayList3 = ((j51) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                l51 l51Var = (l51) obj2;
                long j10 = l51Var.c;
                Uri uri = l51Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j10, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(l51Var.e, l51Var.f);
                if (l51Var.f != null) {
                    this.Q.add(l51Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(l51Var.l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(l51Var.i);
                    sb3.append("x");
                    sb3.append(l51Var.j);
                    String str2 = l51Var.m;
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
                    if (l51Var.b() && l51Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(l51Var.c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(l51Var.a);
                    sb3.append("\"\n");
                    if (l51Var.c()) {
                        sb3.append(l51Var.f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(l51Var.e);
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

    @Override // d2.c1
    public final void f(d2.a2 a2Var) {
        if (Objects.equals(a2Var, d2.a2.d)) {
            return;
        }
        this.K.onVideoSizeChanged(a2Var.a, a2Var.b, 0, a2Var.c);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.exoplayer.hls.HlsMediaSource$Factory] */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.media3.exoplayer.dash.DashMediaSource$Factory] */
    public final w2.a f0(long j10, Uri uri, String str) {
        ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory;
        d2.g0 g0Var;
        int i3;
        d2.i0 i0Var;
        p2.m s6;
        p2.m mVar;
        ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory2 = this.h;
        d2.b0 b0Var = new d2.b0();
        d2.e0 e0Var = new d2.e0();
        List list = Collections.EMPTY_LIST;
        g9.s1 s1Var = g9.s1.e;
        d2.g0 g0Var2 = new d2.g0();
        d2.j0 j0Var = d2.j0.d;
        b8.zb.p(e0Var.b == null || e0Var.a != null);
        if (uri != null) {
            d2.f0 f0Var = e0Var.a != null ? new d2.f0(e0Var) : null;
            extendedDefaultDataSourceFactory = extendedDefaultDataSourceFactory2;
            i3 = 1;
            g0Var = g0Var2;
            i0Var = new d2.i0(uri, null, f0Var, null, list, null, s1Var, -9223372036854775807L);
        } else {
            extendedDefaultDataSourceFactory = extendedDefaultDataSourceFactory2;
            g0Var = g0Var2;
            i3 = 1;
            i0Var = null;
        }
        d2.n0 n0Var = new d2.n0("", new d2.d0(b0Var), i0Var, new d2.h0(g0Var), d2.q0.L, j0Var);
        if (j10 == 0) {
            str.getClass();
            if (str.equals("hls")) {
                final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory3 = extendedDefaultDataSourceFactory;
                if (this.Z == null) {
                    this.Z = new w2.f0(extendedDefaultDataSourceFactory3) { // from class: androidx.media3.exoplayer.hls.HlsMediaSource$Factory
                        public final i9 a;
                        public c b;
                        public b c;
                        public final j i = new j(28);
                        public final e f = new e(22);
                        public final a g = d.K;
                        public final kb.a j = new kb.a(1);
                        public final e h = new e(26);
                        public final int l = 1;
                        public final long m = -9223372036854775807L;
                        public final boolean k = true;
                        public int e = 3;
                        public boolean d = true;

                        {
                            this.a = new i9(extendedDefaultDataSourceFactory3, 12);
                        }

                        @Override // w2.f0
                        public final f0 a(b bVar) {
                            this.c = bVar;
                            return this;
                        }

                        @Override // w2.f0
                        public final f0 b(boolean z10) {
                            this.d = z10;
                            return this;
                        }

                        @Override // w2.f0
                        public final f0 d(int i10) {
                            this.e = i10;
                            return this;
                        }

                        @Override // w2.f0
                        /* renamed from: e, reason: merged with bridge method [inline-methods] */
                        public final l c(n0 n0Var2) {
                            n0Var2.b.getClass();
                            if (this.b == null) {
                                c cVar = new c();
                                cVar.a = new b(4);
                                cVar.c = 3;
                                this.b = cVar;
                            }
                            b bVar = this.c;
                            if (bVar != null) {
                                this.b.a = bVar;
                            }
                            c cVar2 = this.b;
                            cVar2.b = this.d;
                            cVar2.c = this.e;
                            List list2 = n0Var2.b.e;
                            boolean isEmpty = list2.isEmpty();
                            t tVar = this.f;
                            if (!isEmpty) {
                                tVar = new m2.t(tVar, list2, false, 24);
                            }
                            m x10 = this.i.x(n0Var2);
                            this.g.getClass();
                            i9 i9Var = this.a;
                            kb.a aVar = this.j;
                            return new l(n0Var2, i9Var, cVar2, this.h, x10, aVar, new d(i9Var, aVar, tVar), this.m, this.k, this.l);
                        }
                    };
                }
                return c(n0Var);
            }
            if (!str.equals("dash")) {
                if (this.a0 == null) {
                    this.a0 = new w2.x0(extendedDefaultDataSourceFactory, new e3.m());
                }
                return this.a0.c(n0Var);
            }
            final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory4 = extendedDefaultDataSourceFactory;
            if (this.Y == null) {
                this.Y = new w2.f0(extendedDefaultDataSourceFactory4) { // from class: androidx.media3.exoplayer.dash.DashMediaSource$Factory
                    public final kg a;
                    public final g b;
                    public final j c;
                    public final e d;
                    public final kb.a e;
                    public final long f;
                    public final long g;

                    {
                        kg kgVar = new kg(extendedDefaultDataSourceFactory4);
                        this.a = kgVar;
                        this.b = extendedDefaultDataSourceFactory4;
                        this.c = new j(28);
                        this.e = new kb.a(1);
                        this.f = 30000L;
                        this.g = 5000000L;
                        this.d = new e(26);
                        ((v0) kgVar.d).a = true;
                    }

                    @Override // w2.f0
                    public final f0 a(b bVar) {
                        v0 v0Var = (v0) this.a.d;
                        v0Var.getClass();
                        v0Var.c = bVar;
                        return this;
                    }

                    @Override // w2.f0
                    public final f0 b(boolean z10) {
                        ((v0) this.a.d).a = z10;
                        return this;
                    }

                    @Override // w2.f0
                    public final w2.a c(n0 n0Var2) {
                        n0Var2.b.getClass();
                        o2.e eVar = new o2.e();
                        List list2 = n0Var2.b.e;
                        return new h(n0Var2, this.b, !list2.isEmpty() ? new ua.b(2, eVar, list2) : eVar, this.a, this.d, this.c.x(n0Var2), this.e, this.f, this.g);
                    }

                    @Override // w2.f0
                    public final f0 d(int i10) {
                        ((v0) this.a.d).b = i10;
                        return this;
                    }
                };
            }
            return c(n0Var);
        }
        ei.c1 c1Var = new ei.c1(this, j10, 7);
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(new e3.m(), 27);
        Object obj = new Object();
        kb.a aVar = new kb.a(i3);
        i0Var.getClass();
        n0Var.b.getClass();
        d2.f0 f0Var2 = n0Var.b.c;
        if (f0Var2 == null) {
            mVar = p2.m.z;
        } else {
            synchronized (obj) {
                try {
                    s6 = !f0Var2.equals(null) ? k4.j.s(f0Var2) : null;
                    s6.getClass();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            mVar = s6;
        }
        return new w2.y0(n0Var, c1Var, e3Var, mVar, aVar, TLObject.FLAG_20, null);
    }

    public void g0() {
        this.J = false;
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.V(false);
        }
        k2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.V(false);
        }
        if (this.L != null) {
            this.b0.removeCallbacksAndMessages(null);
            this.L.r(false, null);
        }
    }

    public void h0() {
        this.J = true;
        if (!this.y || (this.I && this.H)) {
            k2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.V(true);
            }
            k2.i0 i0Var2 = this.e;
            if (i0Var2 != null) {
                i0Var2.V(true);
                return;
            }
            return;
        }
        k2.i0 i0Var3 = this.d;
        if (i0Var3 != null) {
            i0Var3.V(false);
        }
        k2.i0 i0Var4 = this.e;
        if (i0Var4 != null) {
            i0Var4.V(false);
        }
    }

    public final void i0(long j10, Uri uri, String str) {
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
        this.d.u1(f0(j10, uri, str), true);
        this.d.a();
    }

    public final void j0(Uri uri, String str) {
        i0(0L, uri, str);
    }

    public final void k0(ArrayList arrayList, j51 j51Var) {
        ArrayList arrayList2;
        this.O = arrayList;
        this.P = j51Var;
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
        this.e0 = (j51Var == null || (arrayList2 = this.O) == null) ? -1 : arrayList2.indexOf(j51Var);
        w0(true, j51Var);
        if (this.d0) {
            this.e0 = -1;
        }
    }

    public final void l0(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        w2.x xVar = null;
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
        w2.x xVar2 = null;
        for (int i3 = 0; i3 < 2; i3++) {
            if (i3 == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            w2.x xVar3 = new w2.x(f0(0L, uri3, str3));
            if (i3 == 0) {
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
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.X0();
            this.d = null;
        }
        k2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.X0();
            this.e = null;
        }
        if (this.X) {
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.H4);
        }
    }

    @Override // d2.c1
    public final void o(d2.x0 x0Var) {
        org.telegram.messenger.g0.h3(new p11(5, this, x0Var));
    }

    @Override // l2.b
    public final void onRenderedFirstFrame(l2.a aVar) {
        this.h0 = -9223372036854775807L;
        this.g0 = -9223372036854775807L;
        k51 k51Var = this.K;
        if (k51Var != null) {
            k51Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override // l2.b
    public final void onSeekStarted(l2.a aVar) {
        k51 k51Var = this.K;
        if (k51Var != null) {
            k51Var.onSeekStarted(aVar);
        }
    }

    public void p0(long j10) {
        q0(j10, false);
    }

    public final void q0(long j10, boolean z10) {
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.w1(z10 ? k2.t1.d : k2.t1.c);
            this.d.Z0(5, j10);
        }
    }

    public final void r0(long j10, boolean z10, Runnable runnable) {
        if (this.d != null) {
            if (runnable != null) {
                this.j0.add(runnable);
            }
            this.d.w1(z10 ? k2.t1.d : k2.t1.c);
            this.d.Z0(5, j10);
        }
    }

    public final void s0(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            k2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.k(z10 ? 2 : 0);
            }
        }
    }

    public final void t0(boolean z10) {
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.R(z10 ? 0.0f : 1.0f);
        }
        k2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.R(z10 ? 0.0f : 1.0f);
        }
    }

    public void u0(boolean z10) {
        this.J = z10;
        if (z10 && this.y && (!this.I || !this.H)) {
            k2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.V(false);
            }
            k2.i0 i0Var2 = this.e;
            if (i0Var2 != null) {
                i0Var2.V(false);
                return;
            }
            return;
        }
        this.x = z10;
        k2.i0 i0Var3 = this.d;
        if (i0Var3 != null) {
            i0Var3.V(z10);
        }
        k2.i0 i0Var4 = this.e;
        if (i0Var4 != null) {
            i0Var4.V(z10);
        }
    }

    @Override // d2.c1
    public final void v(d2.v1 v1Var) {
        org.telegram.ui.xm0 xm0Var = this.i0;
        if (xm0Var != null) {
            org.telegram.messenger.g0.h3(xm0Var);
        }
    }

    public void v0(float f10) {
        try {
            k2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.c(new d2.y0(f10, f10 > 1.0f ? 0.98f : 1.0f));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(boolean z10, j51 j51Var) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i3;
        boolean z15;
        d2.p1 p1Var;
        int i10;
        j51 j51Var2;
        k2.i0 i0Var = this.d;
        if (i0Var == null) {
            return;
        }
        boolean i02 = i0Var.i0();
        long N0 = this.d.N0();
        if (!z10) {
            this.h0 = N0;
            this.g0 = this.d.getDuration();
        }
        this.P = j51Var;
        z2.n nVar = this.f;
        boolean z16 = true;
        int i11 = 0;
        if (j51Var == null) {
            Uri e02 = e0(this.O);
            int i12 = 0;
            while (true) {
                if (i12 >= Y()) {
                    j51Var2 = null;
                    break;
                }
                j51 Z = Z(i12);
                if (Z.a) {
                    j51Var2 = Z;
                    break;
                }
                i12++;
            }
            if (j51Var2 != null) {
                ArrayList arrayList = j51Var2.d;
                if (arrayList.size() == 1 && ((l51) arrayList.get(0)).b()) {
                    this.f0 = false;
                    this.d0 = true;
                    this.P = j51Var2;
                    this.d.u1(f0(0L, j51Var2.a().d, "other"), false);
                    z11 = i02;
                }
            }
            if (e02 != null) {
                this.d0 = false;
                z2.i j10 = nVar.j();
                j10.getClass();
                z2.h hVar = new z2.h(j10);
                hVar.c();
                nVar.b(new z2.i(hVar));
                if (this.f0) {
                    z16 = false;
                } else {
                    this.f0 = true;
                    this.d.u1(f0(0L, e02, "hls"), false);
                }
            } else {
                j51 W = W(Boolean.TRUE);
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
            z11 = i02;
        } else {
            ArrayList arrayList2 = j51Var.d;
            this.d0 = false;
            if (arrayList2.isEmpty()) {
                return;
            }
            Uri e03 = arrayList2.size() > 1 ? e0(this.O) : null;
            if (e03 == null || arrayList2.size() == 1 || nVar.c == null) {
                z11 = i02;
                this.f0 = false;
                this.d.u1(f0(0L, j51Var.a().d, "other"), false);
                z16 = true;
            } else {
                if (this.f0) {
                    z12 = false;
                } else {
                    this.f0 = true;
                    this.d.u1(f0(0L, e03, "hls"), false);
                    z12 = true;
                }
                z2.i j11 = nVar.j();
                j11.getClass();
                z2.h hVar2 = new z2.h(j11);
                hVar2.c();
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    l51 l51Var = (l51) arrayList2.get(i13);
                    try {
                        int indexOf = this.Q.indexOf(l51Var);
                        z2.r rVar = nVar.c;
                        int i15 = i11;
                        while (i15 < rVar.a) {
                            try {
                                w2.r1 r1Var = rVar.c[i15];
                                z13 = i02;
                                int i16 = 0;
                                while (i16 < r1Var.a) {
                                    try {
                                        d2.o1 a10 = r1Var.a(i16);
                                        z14 = z12;
                                        i3 = size;
                                        int i17 = 0;
                                        while (i17 < a10.a) {
                                            try {
                                                d2.v vVar = a10.d[i17];
                                                int i18 = i15;
                                                try {
                                                    i10 = Integer.parseInt(vVar.a);
                                                } catch (Exception unused) {
                                                    i10 = -1;
                                                }
                                                if (i10 < 0 || indexOf != i10) {
                                                    int i19 = indexOf;
                                                    if (vVar.z == l51Var.i && vVar.A == l51Var.j) {
                                                        p1Var = new d2.p1(a10, i17);
                                                    } else {
                                                        i17++;
                                                        i15 = i18;
                                                        indexOf = i19;
                                                    }
                                                } else {
                                                    p1Var = new d2.p1(a10, i17);
                                                }
                                                z15 = true;
                                            } catch (Exception e10) {
                                                e = e10;
                                                z15 = true;
                                                org.telegram.messenger.a8.g(e, true);
                                                p1Var = null;
                                                if (p1Var != null) {
                                                }
                                                z12 = z14;
                                                z16 = z15;
                                                i13 = i14;
                                                i02 = z13;
                                                size = i3;
                                                i11 = 0;
                                            }
                                        }
                                        i16++;
                                        z12 = z14;
                                        size = i3;
                                    } catch (Exception e11) {
                                        e = e11;
                                        z14 = z12;
                                        i3 = size;
                                        z15 = true;
                                        org.telegram.messenger.a8.g(e, true);
                                        p1Var = null;
                                        if (p1Var != null) {
                                        }
                                        z12 = z14;
                                        z16 = z15;
                                        i13 = i14;
                                        i02 = z13;
                                        size = i3;
                                        i11 = 0;
                                    }
                                }
                                i15++;
                                i02 = z13;
                                z16 = true;
                            } catch (Exception e12) {
                                e = e12;
                                z13 = i02;
                            }
                        }
                        z13 = i02;
                        z14 = z12;
                        i3 = size;
                        z15 = z16;
                    } catch (Exception e13) {
                        e = e13;
                        z13 = i02;
                    }
                    p1Var = null;
                    if (p1Var != null) {
                        hVar2.H.put(p1Var.a, p1Var);
                    }
                    z12 = z14;
                    z16 = z15;
                    i13 = i14;
                    i02 = z13;
                    size = i3;
                    i11 = 0;
                }
                z11 = i02;
                nVar.b(new z2.i(hVar2));
                z16 = z12;
            }
        }
        if (z16) {
            this.d.a();
            if (!z10) {
                this.d.Z0(5, N0);
                if (z11) {
                    this.d.j();
                }
            }
            org.telegram.ui.xm0 xm0Var = this.i0;
            if (xm0Var != null) {
                org.telegram.messenger.g0.h3(xm0Var);
            }
            l0.add(Integer.valueOf(this.a));
        }
    }

    public final void x0(int i3) {
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.A0(new d2.f(i3 == 0 ? 1 : 3, 0, i3 == 0 ? 2 : 1, 1, false, 0, true), false);
        }
        k2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.A0(new d2.f(i3 == 0 ? 1 : 2, 0, i3 == 0 ? 2 : 1, 1, false, 0, true), true);
        }
    }

    public final void y0(Surface surface) {
        if (this.s == surface) {
            return;
        }
        this.s = surface;
        k2.i0 i0Var = this.d;
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
        k2.i0 i0Var = this.d;
        if (i0Var == null) {
            return;
        }
        i0Var.F1();
        i0Var.Q(surfaceView == null ? null : surfaceView.getHolder());
    }

    public m51(boolean z10, boolean z11) {
        int i3 = k0;
        k0 = i3 + 1;
        this.a = i3;
        this.b0 = new Handler(Looper.getMainLooper());
        this.d0 = false;
        this.e0 = -1;
        this.g0 = -9223372036854775807L;
        this.h0 = -9223372036854775807L;
        this.j0 = new ArrayList();
        this.c0 = z11;
        this.h = new ExtendedDefaultDataSourceFactory(org.telegram.messenger.t0.b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        z2.n nVar = new z2.n(org.telegram.messenger.t0.b, new ra.e(28));
        this.f = nVar;
        if (z11) {
            z2.i j10 = nVar.j();
            j10.getClass();
            z2.h hVar = new z2.h(j10);
            hVar.I.add(1);
            nVar.b(new z2.i(hVar));
        }
        this.M = 1;
        this.X = z10;
        if (z10) {
            org.telegram.messenger.hs.e().b(this, org.telegram.messenger.hs.H4);
        }
    }

    @Override // d2.c1
    public void onRenderedFirstFrame() {
        this.K.onRenderedFirstFrame();
    }

    @Override // d2.c1
    public final /* synthetic */ void C(d2.q0 q0Var) {
    }

    @Override // d2.c1
    public final /* synthetic */ void F(List list) {
    }

    @Override // d2.c1
    public final void H(d2.y0 y0Var) {
    }

    @Override // d2.c1
    public final /* synthetic */ void L(d2.q0 q0Var) {
    }

    @Override // d2.c1
    public final /* synthetic */ void N(d2.a1 a1Var) {
    }

    @Override // d2.c1
    public final /* synthetic */ void O(d2.b1 b1Var) {
    }

    @Override // d2.c1
    public final /* synthetic */ void P(boolean z10) {
    }

    @Override // d2.c1
    public final /* synthetic */ void a(int i3) {
    }

    @Override // d2.c1
    public final void c(int i3) {
    }

    @Override // l2.b
    public final /* synthetic */ void d(w2.c0 c0Var) {
    }

    @Override // d2.c1
    public final /* synthetic */ void e(boolean z10) {
    }

    @Override // d2.c1
    public final /* synthetic */ void g(int i3) {
    }

    @Override // d2.c1
    public final /* synthetic */ void h(boolean z10) {
    }

    @Override // d2.c1
    public final /* synthetic */ void i(int i3) {
    }

    @Override // l2.b
    public final /* synthetic */ void j(d2.x0 x0Var) {
    }

    @Override // d2.c1
    public final /* synthetic */ void k(f2.c cVar) {
    }

    @Override // d2.c1
    public final /* synthetic */ void l(d2.x0 x0Var) {
    }

    @Override // d2.c1
    public final /* synthetic */ void m(d2.s0 s0Var) {
    }

    @Override // d2.c1
    public final /* synthetic */ void p(boolean z10) {
    }

    @Override // d2.c1
    public final /* synthetic */ void s(float f10) {
    }

    @Override // l2.b
    public final /* synthetic */ void t(k2.d dVar) {
    }

    @Override // d2.c1
    public final /* synthetic */ void u(d2.f fVar) {
    }

    @Override // d2.c1
    public final /* synthetic */ void w(int i3) {
    }

    @Override // l2.b
    public final /* synthetic */ void x(d2.a2 a2Var) {
    }

    @Override // d2.c1
    public final /* synthetic */ void y(boolean z10) {
    }

    @Override // l2.b
    public final /* synthetic */ void D(l2.a aVar, w2.c0 c0Var) {
    }

    @Override // d2.c1
    public final /* synthetic */ void E(d2.n1 n1Var, int i3) {
    }

    @Override // d2.c1
    public final /* synthetic */ void J(int i3, int i10) {
    }

    @Override // l2.b
    public final /* synthetic */ void b(d2.e1 e1Var, tf.b bVar) {
    }

    @Override // d2.c1
    public final /* synthetic */ void n(int i3, d2.n0 n0Var) {
    }

    @Override // d2.c1
    public final /* synthetic */ void r(int i3, boolean z10) {
    }

    @Override // d2.c1
    public final void q(d2.d1 d1Var, d2.d1 d1Var2, int i3) {
    }

    @Override // l2.b
    public final /* synthetic */ void z(l2.a aVar, int i3, long j10) {
    }
}
