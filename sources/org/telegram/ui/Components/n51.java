package org.telegram.ui.Components;

import a8.wa;
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
import o2.h;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n;
import org.telegram.ui.hy0;
import p2.e;
import q2.m;
import r2.c;
import r2.l;
import s0.b;
import s2.t;
import sa.d;
import sg.i0;
import w7.s;
import x2.a;
import x2.f0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class n51 implements e2.a1, e2.w1, m2.b, org.telegram.messenger.ls {
    public static int j0;
    public static final HashSet k0 = new HashSet();
    public static HashMap l0;
    public boolean D;
    public boolean E;
    public Uri F;
    public boolean G;
    public boolean H;
    public boolean I;
    public l51 J;
    public h51 K;
    public int L;
    public boolean M;
    public ArrayList N;
    public k51 O;
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
    public x2.x0 Z;
    public final int a;
    public final Handler a0;
    public org.telegram.messenger.q5 b;
    public final boolean b0;
    public boolean c;
    public boolean c0;
    public l2.i0 d;
    public int d0;
    public l2.i0 e;
    public boolean e0;
    public final a3.s f;
    public long f0;
    public long g0;
    public final ExtendedDefaultDataSourceFactory h;
    public org.telegram.ui.vn0 h0;
    public final ArrayList i0;
    public TextureView n;
    public SurfaceView r;
    public Surface s;
    public boolean w;
    public boolean x;
    public boolean y;

    public n51() {
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
            if (l0 == null) {
                l0 = new HashMap();
            }
            Boolean bool = (Boolean) l0.get(concat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!org.telegram.messenger.qp.e1().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i7 = 0; i7 < codecCount; i7++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i7);
                    if (!codecInfoAt.isEncoder() && u2.w.i(codecInfoAt, concat)) {
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

    public static m51 N(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((k51) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                m51 m51Var = (m51) obj2;
                if (m51Var.b()) {
                    return m51Var;
                }
            }
        }
        return null;
    }

    public static ArrayList X(int i7, TLRPC.Document document, ArrayList arrayList, int i10, boolean z9) {
        k51 k51Var;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!org.telegram.messenger.qp.s1(i7).F6 && arrayList != null) {
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
                    m51 d = m51.d(i7, document3, (TLRPC.Document) longSparseArray.get(document3.id), i10, z9);
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
            m51 m51Var = (m51) arrayList3.get(i13);
            String str2 = m51Var.m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(m51Var.m) && !"hevc".equals(m51Var.m) && !"h265".equals(m51Var.m) && !"vp9".equals(m51Var.m)) || D0(m51Var.m))) {
                arrayList4.add(m51Var);
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
            m51 m51Var2 = (m51) obj;
            if (m51Var2.b) {
                arrayList6.add(new k51(m51Var2));
            } else {
                int size2 = arrayList6.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        k51Var = null;
                        break;
                    }
                    Object obj2 = arrayList6.get(i15);
                    i15++;
                    k51Var = (k51) obj2;
                    if (!k51Var.a && k51Var.b == m51Var2.i && k51Var.c == m51Var2.j) {
                        break;
                    }
                }
                if (k51Var == null || org.telegram.messenger.iz.R0) {
                    arrayList6.add(new k51(m51Var2));
                } else {
                    k51Var.d.add(m51Var2);
                }
            }
        }
        return arrayList6;
    }

    public static m51 a0(ArrayList arrayList) {
        int i7;
        int i10;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ArrayList arrayList2 = ((k51) obj).d;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                m51 m51Var = (m51) obj2;
                if (m51Var.b && m51Var.b()) {
                    return m51Var;
                }
            }
        }
        int size3 = arrayList.size();
        m51 m51Var2 = null;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList.get(i13);
            i13++;
            ArrayList arrayList3 = ((k51) obj3).d;
            int size4 = arrayList3.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                m51 m51Var3 = (m51) obj4;
                if (!m51Var3.b && D0(m51Var3.m) && (m51Var2 == null || (i7 = m51Var3.i * m51Var3.j) > (i10 = m51Var2.i * m51Var2.j) || (i7 == i10 && m51Var3.l < m51Var2.l))) {
                    m51Var2 = m51Var3;
                }
            }
        }
        if (m51Var2 == null) {
            int size5 = arrayList.size();
            int i15 = 0;
            while (i15 < size5) {
                Object obj5 = arrayList.get(i15);
                i15++;
                ArrayList arrayList4 = ((k51) obj5).d;
                int size6 = arrayList4.size();
                int i16 = 0;
                while (i16 < size6) {
                    Object obj6 = arrayList4.get(i16);
                    i16++;
                    m51 m51Var4 = (m51) obj6;
                    if (m51Var2 == null || m51Var2.i * m51Var2.j > m51Var4.i * m51Var4.j || m51Var4.l < m51Var2.l) {
                        m51Var2 = m51Var4;
                    }
                }
            }
        }
        return m51Var2;
    }

    public static m51 b0(ArrayList arrayList) {
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((k51) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                m51 m51Var = (m51) obj2;
                if (m51Var.b()) {
                    return m51Var;
                }
            }
        }
        int size3 = arrayList.size();
        m51 m51Var2 = null;
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            ArrayList arrayList3 = ((k51) obj3).d;
            int size4 = arrayList3.size();
            int i12 = 0;
            while (i12 < size4) {
                Object obj4 = arrayList3.get(i12);
                i12++;
                m51 m51Var3 = (m51) obj4;
                if (!m51Var3.b && (m51Var2 == null || m51Var2.i * m51Var2.j > m51Var3.i * m51Var3.j || m51Var3.l < m51Var2.l)) {
                    if (m51Var3.i <= 900 && m51Var3.j <= 900) {
                        m51Var2 = m51Var3;
                    }
                }
            }
        }
        if (m51Var2 == null) {
            int size5 = arrayList.size();
            int i13 = 0;
            while (i13 < size5) {
                Object obj5 = arrayList.get(i13);
                i13++;
                ArrayList arrayList4 = ((k51) obj5).d;
                int size6 = arrayList4.size();
                int i14 = 0;
                while (i14 < size6) {
                    Object obj6 = arrayList4.get(i14);
                    i14++;
                    m51 m51Var4 = (m51) obj6;
                    if (m51Var2 == null || m51Var2.i * m51Var2.j > m51Var4.i * m51Var4.j || m51Var4.l < m51Var2.l) {
                        m51Var2 = m51Var4;
                    }
                }
            }
        }
        return m51Var2;
    }

    public static void n0(org.telegram.messenger.ij ijVar, boolean z9) {
        if (ijVar == null) {
            return;
        }
        org.telegram.messenger.t0.b.getSharedPreferences("media_saved_pos", 0).edit().putBoolean(org.telegram.messenger.ij.B0(ijVar.k) + "_" + ijVar.f1() + "loop", z9).apply();
    }

    public static void o0(k51 k51Var, org.telegram.messenger.ij ijVar) {
        if (ijVar == null) {
            return;
        }
        long B0 = org.telegram.messenger.ij.B0(ijVar.k);
        int f12 = ijVar.f1();
        SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("media_saved_pos", 0).edit();
        if (k51Var == null) {
            edit.remove(B0 + "_" + f12 + "q2");
        } else {
            String str = B0 + "_" + f12 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(k51Var.b);
            sb2.append("x");
            sb2.append(k51Var.c);
            sb2.append(k51Var.a ? "s" : "");
            edit.putString(str, sb2.toString());
        }
        edit.apply();
    }

    @Override // m2.b
    public final void A(m2.a aVar, int i7) {
        if (i7 == 1) {
            l51 l51Var = this.J;
            if (l51Var != null) {
                l51Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.i0;
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
        l2.i0 i0Var = this.d;
        if (i0Var == null) {
            return;
        }
        i0Var.z1(textureView);
    }

    public final void B0(float f10) {
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.T(f10);
        }
        l2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.T(f10);
        }
    }

    @Override // e2.a1
    public final void C(int i7, boolean z9) {
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            boolean u10 = i0Var.u();
            int i10 = this.d.i();
            if (this.M != u10 || this.L != i10) {
                this.J.onStateChanged(u10, i10);
                this.M = u10;
                this.L = i10;
            }
        }
        if (z9 && i7 == 3 && !c0() && this.W) {
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.H4, this);
        }
        if (!this.G && i7 == 3) {
            this.G = true;
            if (this.H && this.I) {
                h0();
            }
        }
        if (i7 != 3) {
            this.a0.removeCallbacksAndMessages(null);
            h51 h51Var = this.K;
            if (h51Var != null) {
                h51Var.F(false, null);
            }
        }
    }

    public final void C0(org.telegram.messenger.q5 q5Var) {
        this.b = q5Var;
        if (q5Var == null) {
            this.d.s0 = null;
        } else {
            this.d.s0 = new f51(q5Var);
        }
    }

    @Override // e2.a1
    public final void D(e2.q1 q1Var) {
        org.telegram.ui.vn0 vn0Var = this.h0;
        if (vn0Var != null) {
            org.telegram.messenger.g0.h3(vn0Var);
        }
    }

    public final void I() {
        HashMap hashMap = new HashMap();
        hashMap.put(m2.j.c.a, 144179200);
        b3.e eVar = new b3.e();
        boolean z9 = this.c;
        int i7 = z9 ? 1000 : 100;
        int i10 = z9 ? 1000 : 2000;
        l2.h.a(i7, 0, "bufferForPlaybackMs", "0");
        l2.h.a(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
        l2.h.a(50000, i7, "minBufferMs", "bufferForPlaybackMs");
        l2.h.a(50000, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        l2.h.a(50000, 50000, "maxBufferMs", "minBufferMs");
        l2.h.a(0, 0, "backBufferDurationMs", "0");
        l2.h hVar = new l2.h(eVar, 50000, i7, i7, i10, i10, false, hashMap);
        if (this.d == null) {
            l2.j i51Var = this.K != null ? new i51(org.telegram.messenger.t0.b, this) : new l2.j(org.telegram.messenger.t0.b);
            i51Var.c = 1;
            l2.n nVar = new l2.n(org.telegram.messenger.t0.b);
            a8.ia.p(!nVar.z);
            nVar.c = new l2.m(i51Var, 2);
            a3.s sVar = this.f;
            a8.ia.p(!nVar.z);
            sVar.getClass();
            nVar.e = new l2.m(sVar, 1);
            a8.ia.p(!nVar.z);
            nVar.f = new l2.m(hVar, 0);
            l2.i0 a10 = nVar.a();
            this.d = a10;
            a10.D(new e2.e(3, 0, 1, 1, false, 0, true), false);
            m2.e eVar2 = this.d.s;
            eVar2.getClass();
            eVar2.f.a(this);
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
                        l2.i0 i0Var = this.d;
                        i0Var.F1();
                        i0Var.S(surfaceView.getHolder());
                    }
                }
            }
            this.d.X(this.x);
            this.d.k(this.V ? 2 : 0);
        }
        if (this.y && this.e == null) {
            l2.n nVar2 = new l2.n(org.telegram.messenger.t0.b);
            a3.s sVar2 = this.f;
            a8.ia.p(!nVar2.z);
            sVar2.getClass();
            nVar2.e = new l2.m(sVar2, 1);
            a8.ia.p(true ^ nVar2.z);
            nVar2.f = new l2.m(hVar, 0);
            l2.i0 a11 = nVar2.a();
            this.e = a11;
            a11.D(new e2.e(2, 0, 1, 1, false, 0, true), false);
            this.e.m.a(new h2.z(this, 1));
            this.e.X(this.x);
        }
    }

    public final long K() {
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            return this.w ? i0Var.d0() : i0Var.getDuration();
        }
        return 0L;
    }

    public final g7.c Q(String str, String str2, String str3) {
        if (this.N == null) {
            if (this.Q == null) {
                return null;
            }
            String i7 = rf.b.i("/mtproto_", str);
            String queryParameter = this.Q.getQueryParameter("mime");
            v4.v0 v0Var = new v4.v0(this.Q, TextUtils.isEmpty(queryParameter) ? "video/mp4" : queryParameter, i7);
            v0Var.g = str2;
            v0Var.h = str3;
            return new g7.c(new wf.e(v0Var));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ArrayList arrayList3 = ((k51) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                m51 m51Var = (m51) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(m51Var.c);
                String sb3 = sb2.toString();
                TLRPC.Document document = m51Var.g;
                String str4 = document != null ? document.mime_type : null;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                v4.v0 v0Var2 = new v4.v0(m51Var.d, str4, sb3);
                v0Var2.g = str2;
                v0Var2.h = str3;
                int i12 = m51Var.i;
                int i13 = m51Var.j;
                v0Var2.a = i12;
                v0Var2.b = i13;
                arrayList.add(new wf.e(v0Var2));
                arrayList2 = arrayList4;
            }
        }
        return new g7.c(arrayList);
    }

    public final TLRPC.Document R() {
        ArrayList arrayList;
        l2.i0 i0Var = this.d;
        if (i0Var == null) {
            return null;
        }
        i0Var.F1();
        e2.u uVar = i0Var.S;
        if (uVar == null || uVar.o == 0 || (arrayList = this.N) == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((k51) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                m51 m51Var = (m51) obj2;
                if (m51Var.c == uVar.o) {
                    return m51Var.g;
                }
            }
        }
        return null;
    }

    public final long S() {
        long j3 = this.g0;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            return i0Var.l();
        }
        return 0L;
    }

    public final int T() {
        if (this.d0 == -1) {
            try {
                if (this.c0) {
                    for (int i7 = 0; i7 < Y(); i7++) {
                        if (Z(i7).a) {
                            return i7;
                        }
                    }
                }
                l2.i0 i0Var = this.d;
                if (i0Var != null) {
                    i0Var.F1();
                    e2.u uVar = i0Var.S;
                    if (uVar != null) {
                        for (int i10 = 0; i10 < Y(); i10++) {
                            k51 Z = Z(i10);
                            if (!Z.a && uVar.z == Z.b && uVar.A == Z.c && uVar.j == ((int) Math.floor(((m51) Z.d.get(0)).l * 8.0d))) {
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
        return this.d0;
    }

    public final long U() {
        long j3 = this.f0;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            return i0Var.getDuration();
        }
        return 0L;
    }

    public final fi.d7 V(fi.d7 d7Var) {
        if (d7Var == null) {
            d7Var = new fi.d7();
        }
        try {
            l2.i0 i0Var = this.d;
            i0Var.F1();
            MediaFormat mediaFormat = ((u2.r) i0Var.g[0]).f0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    d7Var.b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    d7Var.a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return d7Var;
    }

    public final k51 W(Boolean bool) {
        k51 k51Var = null;
        for (int i7 = 0; i7 < Y(); i7++) {
            k51 Z = Z(i7);
            if (Z.a == bool.booleanValue() && (k51Var == null || k51Var.b * k51Var.c < Z.b * Z.c)) {
                k51Var = Z;
            }
        }
        return k51Var;
    }

    public final int Y() {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final k51 Z(int i7) {
        ArrayList arrayList = this.N;
        return arrayList == null ? W(Boolean.FALSE) : (i7 < 0 || i7 >= arrayList.size()) ? W(Boolean.FALSE) : (k51) this.N.get(i7);
    }

    @Override // e2.a1
    public final void a(e2.x1 x1Var) {
        if (Objects.equals(x1Var, e2.x1.d)) {
            return;
        }
        this.J.onVideoSizeChanged(x1Var.a, x1Var.b, 0, x1Var.c);
    }

    public final boolean c0() {
        l2.i0 i0Var = this.d;
        if (i0Var == null) {
            return false;
        }
        i0Var.F1();
        return i0Var.b0 == 0.0f;
    }

    public final boolean d0() {
        if (this.y && this.I) {
            return true;
        }
        l2.i0 i0Var = this.d;
        return i0Var != null && i0Var.u();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.qs.H4 || ((n51) objArr[0]) == this || !d0() || this.D) {
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
        boolean z9 = false;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList3 = ((k51) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                m51 m51Var = (m51) obj2;
                long j3 = m51Var.c;
                Uri uri = m51Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j3, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(m51Var.e, m51Var.f);
                if (m51Var.f != null) {
                    this.P.add(m51Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(m51Var.l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(m51Var.i);
                    sb3.append("x");
                    sb3.append(m51Var.j);
                    String str2 = m51Var.m;
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
                    if (m51Var.b() && m51Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(m51Var.c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(m51Var.a);
                    sb3.append("\"\n");
                    if (m51Var.c()) {
                        sb3.append(m51Var.f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(m51Var.e);
                        sb3.append("\n\n");
                    }
                    arrayList2.add(sb3.toString());
                    z9 = true;
                }
            }
        }
        if (!z9) {
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
        a8.ia.p(c0Var.b == null || c0Var.a != null);
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
                if (this.Y == null) {
                    this.Y = new x2.f0(extendedDefaultDataSourceFactory) { // from class: androidx.media3.exoplayer.hls.HlsMediaSource$Factory
                        public final n a;
                        public c b;
                        public s c;
                        public final hy0 i = new hy0(6);
                        public final d f = new d(23);
                        public final b g = s2.d.J;
                        public final pb.b j = new pb.b(4);
                        public final d h = new d(27);
                        public final int l = 1;
                        public final long m = -9223372036854775807L;
                        public final boolean k = true;
                        public int e = 3;
                        public boolean d = true;

                        {
                            this.a = new n(extendedDefaultDataSourceFactory);
                        }

                        @Override // x2.f0
                        public final f0 a(s sVar) {
                            this.c = sVar;
                            return this;
                        }

                        @Override // x2.f0
                        public final f0 c(boolean z9) {
                            this.d = z9;
                            return this;
                        }

                        @Override // x2.f0
                        public final f0 d(int i7) {
                            this.e = i7;
                            return this;
                        }

                        @Override // x2.f0
                        /* renamed from: e, reason: merged with bridge method [inline-methods] */
                        public final l b(l0 l0Var2) {
                            l0Var2.b.getClass();
                            if (this.b == null) {
                                c cVar = new c();
                                cVar.a = new s(5, false);
                                cVar.c = 3;
                                this.b = cVar;
                            }
                            s sVar = this.c;
                            if (sVar != null) {
                                this.b.a = sVar;
                            }
                            c cVar2 = this.b;
                            cVar2.b = this.d;
                            cVar2.c = this.e;
                            List list2 = l0Var2.b.e;
                            boolean isEmpty = list2.isEmpty();
                            t tVar = this.f;
                            if (!isEmpty) {
                                tVar = new j2.n(tVar, list2, false, 29);
                            }
                            m t6 = this.i.t(l0Var2);
                            this.g.getClass();
                            n nVar = this.a;
                            pb.b bVar = this.j;
                            return new l(l0Var2, nVar, cVar2, this.h, t6, bVar, new s2.d(nVar, bVar, tVar), this.m, this.k, this.l);
                        }
                    };
                }
                return b(l0Var);
            }
            if (str.equals("dash")) {
                if (this.X == null) {
                    this.X = new x2.f0(extendedDefaultDataSourceFactory) { // from class: androidx.media3.exoplayer.dash.DashMediaSource$Factory
                        public final wa a;
                        public final g b;
                        public final hy0 c;
                        public final d d;
                        public final pb.b e;
                        public final long f;
                        public final long g;

                        {
                            wa waVar = new wa(extendedDefaultDataSourceFactory);
                            this.a = waVar;
                            this.b = extendedDefaultDataSourceFactory;
                            this.c = new hy0(6);
                            this.e = new pb.b(4);
                            this.f = 30000L;
                            this.g = 5000000L;
                            this.d = new d(27);
                            ((w0) waVar.d).a = true;
                        }

                        @Override // x2.f0
                        public final f0 a(s sVar) {
                            w0 w0Var = (w0) this.a.d;
                            w0Var.getClass();
                            w0Var.c = sVar;
                            return this;
                        }

                        @Override // x2.f0
                        public final a b(l0 l0Var2) {
                            l0Var2.b.getClass();
                            e eVar = new e();
                            List list2 = l0Var2.b.e;
                            return new h(l0Var2, this.b, !list2.isEmpty() ? new i0(8, eVar, list2) : eVar, this.a, this.d, this.c.t(l0Var2), this.e, this.f, this.g);
                        }

                        @Override // x2.f0
                        public final f0 c(boolean z9) {
                            ((w0) this.a.d).a = z9;
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
            if (this.Z == null) {
                this.Z = new x2.x0(extendedDefaultDataSourceFactory, new f3.m());
            }
            return this.Z.b(l0Var);
        }
        di.c1 c1Var = new di.c1(this, j3, 6);
        u5.e eVar = new u5.e(new f3.m(), 10);
        Object obj = new Object();
        pb.b bVar = new pb.b(4);
        g0Var.getClass();
        l0Var.b.getClass();
        e2.d0 d0Var2 = l0Var.b.c;
        if (d0Var2 == null) {
            mVar = q2.m.A;
        } else {
            synchronized (obj) {
                try {
                    o4 = !d0Var2.equals(null) ? org.telegram.ui.hy0.o(d0Var2) : null;
                    o4.getClass();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            mVar = o4;
        }
        return new x2.y0(l0Var, c1Var, eVar, mVar, bVar, TLObject.FLAG_20, null);
    }

    public void g0() {
        this.I = false;
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.X(false);
        }
        l2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.X(false);
        }
        if (this.K != null) {
            this.a0.removeCallbacksAndMessages(null);
            this.K.F(false, null);
        }
    }

    public void h0() {
        this.I = true;
        if (!this.y || (this.H && this.G)) {
            l2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.X(true);
            }
            l2.i0 i0Var2 = this.e;
            if (i0Var2 != null) {
                i0Var2.X(true);
                return;
            }
            return;
        }
        l2.i0 i0Var3 = this.d;
        if (i0Var3 != null) {
            i0Var3.X(false);
        }
        l2.i0 i0Var4 = this.e;
        if (i0Var4 != null) {
            i0Var4.X(false);
        }
    }

    public final void i0(long j3, Uri uri, String str) {
        this.N = null;
        this.O = null;
        this.Q = uri;
        this.S = str;
        this.R = null;
        this.T = null;
        boolean z9 = false;
        this.U = false;
        this.c0 = false;
        this.e0 = false;
        this.G = false;
        this.y = false;
        this.F = uri;
        String scheme = uri != null ? uri.getScheme() : null;
        if (scheme != null && !scheme.startsWith("file")) {
            z9 = true;
        }
        this.w = z9;
        I();
        this.d.u1(f0(j3, uri, str), true);
        this.d.a();
    }

    public final void j0(Uri uri, String str) {
        i0(0L, uri, str);
    }

    public final void k0(ArrayList arrayList, k51 k51Var) {
        ArrayList arrayList2;
        this.N = arrayList;
        this.O = k51Var;
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
        I();
        this.e0 = false;
        this.d0 = (k51Var == null || (arrayList2 = this.N) == null) ? -1 : arrayList2.indexOf(k51Var);
        w0(true, k51Var);
        if (this.c0) {
            this.d0 = -1;
        }
    }

    public final void l0(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        x2.x xVar = null;
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
        k0.add(Integer.valueOf(this.a));
    }

    public final void m0() {
        k0.remove(Integer.valueOf(this.a));
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.X0();
            this.d = null;
        }
        l2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.X0();
            this.e = null;
        }
        if (this.W) {
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.H4);
        }
    }

    @Override // m2.b
    public final void onRenderedFirstFrame(m2.a aVar) {
        this.g0 = -9223372036854775807L;
        this.f0 = -9223372036854775807L;
        l51 l51Var = this.J;
        if (l51Var != null) {
            l51Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override // m2.b
    public final void onSeekStarted(m2.a aVar) {
        l51 l51Var = this.J;
        if (l51Var != null) {
            l51Var.onSeekStarted(aVar);
        }
    }

    public void p0(long j3) {
        q0(j3, false);
    }

    public final void q0(long j3, boolean z9) {
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.w1(z9 ? l2.t1.d : l2.t1.c);
            this.d.Z0(5, j3);
        }
    }

    public final void r0(long j3, boolean z9, Runnable runnable) {
        if (this.d != null) {
            if (runnable != null) {
                this.i0.add(runnable);
            }
            this.d.w1(z9 ? l2.t1.d : l2.t1.c);
            this.d.Z0(5, j3);
        }
    }

    public final void s0(boolean z9) {
        if (this.V != z9) {
            this.V = z9;
            l2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.k(z9 ? 2 : 0);
            }
        }
    }

    public final void t0(boolean z9) {
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.T(z9 ? 0.0f : 1.0f);
        }
        l2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.T(z9 ? 0.0f : 1.0f);
        }
    }

    @Override // e2.a1
    public final void u(e2.s1 s1Var) {
        org.telegram.ui.vn0 vn0Var = this.h0;
        if (vn0Var != null) {
            org.telegram.messenger.g0.h3(vn0Var);
        }
    }

    public void u0(boolean z9) {
        this.I = z9;
        if (z9 && this.y && (!this.H || !this.G)) {
            l2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.X(false);
            }
            l2.i0 i0Var2 = this.e;
            if (i0Var2 != null) {
                i0Var2.X(false);
                return;
            }
            return;
        }
        this.x = z9;
        l2.i0 i0Var3 = this.d;
        if (i0Var3 != null) {
            i0Var3.X(z9);
        }
        l2.i0 i0Var4 = this.e;
        if (i0Var4 != null) {
            i0Var4.X(z9);
        }
    }

    public void v0(float f10) {
        try {
            l2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.e(new e2.w0(f10, f10 > 1.0f ? 0.98f : 1.0f));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(boolean z9, k51 k51Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        boolean z14;
        e2.n1 n1Var;
        int i10;
        k51 k51Var2;
        l2.i0 i0Var = this.d;
        if (i0Var == null) {
            return;
        }
        boolean h = i0Var.h();
        long l10 = this.d.l();
        if (!z9) {
            this.g0 = l10;
            this.f0 = this.d.getDuration();
        }
        this.O = k51Var;
        a3.s sVar = this.f;
        boolean z15 = true;
        int i11 = 0;
        if (k51Var == null) {
            Uri e02 = e0(this.N);
            int i12 = 0;
            while (true) {
                if (i12 >= Y()) {
                    k51Var2 = null;
                    break;
                }
                k51 Z = Z(i12);
                if (Z.a) {
                    k51Var2 = Z;
                    break;
                }
                i12++;
            }
            if (k51Var2 != null) {
                ArrayList arrayList = k51Var2.d;
                if (arrayList.size() == 1 && ((m51) arrayList.get(0)).b()) {
                    this.e0 = false;
                    this.c0 = true;
                    this.O = k51Var2;
                    this.d.u1(f0(0L, k51Var2.a().d, "other"), false);
                    z10 = h;
                }
            }
            if (e02 != null) {
                this.c0 = false;
                a3.n j3 = sVar.j();
                j3.getClass();
                a3.m mVar = new a3.m(j3);
                mVar.c();
                sVar.b(new a3.n(mVar));
                if (this.e0) {
                    z15 = false;
                } else {
                    this.e0 = true;
                    this.d.u1(f0(0L, e02, "hls"), false);
                }
            } else {
                k51 W = W(Boolean.TRUE);
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
            z10 = h;
        } else {
            ArrayList arrayList2 = k51Var.d;
            this.c0 = false;
            if (arrayList2.isEmpty()) {
                return;
            }
            Uri e03 = arrayList2.size() > 1 ? e0(this.N) : null;
            if (e03 == null || arrayList2.size() == 1 || sVar.c == null) {
                z10 = h;
                this.e0 = false;
                this.d.u1(f0(0L, k51Var.a().d, "other"), false);
                z15 = true;
            } else {
                if (this.e0) {
                    z11 = false;
                } else {
                    this.e0 = true;
                    this.d.u1(f0(0L, e03, "hls"), false);
                    z11 = true;
                }
                a3.n j10 = sVar.j();
                j10.getClass();
                a3.m mVar2 = new a3.m(j10);
                mVar2.c();
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    m51 m51Var = (m51) arrayList2.get(i13);
                    try {
                        int indexOf = this.P.indexOf(m51Var);
                        a3.w wVar = sVar.c;
                        int i15 = i11;
                        while (i15 < wVar.a) {
                            try {
                                x2.q1 q1Var = wVar.c[i15];
                                z12 = h;
                                int i16 = 0;
                                while (i16 < q1Var.a) {
                                    try {
                                        e2.m1 a10 = q1Var.a(i16);
                                        z13 = z11;
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
                                                    if (uVar.z == m51Var.i && uVar.A == m51Var.j) {
                                                        n1Var = new e2.n1(a10, i17);
                                                    } else {
                                                        i17++;
                                                        i15 = i18;
                                                        indexOf = i19;
                                                    }
                                                } else {
                                                    n1Var = new e2.n1(a10, i17);
                                                }
                                                z14 = true;
                                            } catch (Exception e10) {
                                                e = e10;
                                                z14 = true;
                                                org.telegram.messenger.a8.g(e, true);
                                                n1Var = null;
                                                if (n1Var != null) {
                                                }
                                                z11 = z13;
                                                z15 = z14;
                                                i13 = i14;
                                                h = z12;
                                                size = i7;
                                                i11 = 0;
                                            }
                                        }
                                        i16++;
                                        z11 = z13;
                                        size = i7;
                                    } catch (Exception e11) {
                                        e = e11;
                                        z13 = z11;
                                        i7 = size;
                                        z14 = true;
                                        org.telegram.messenger.a8.g(e, true);
                                        n1Var = null;
                                        if (n1Var != null) {
                                        }
                                        z11 = z13;
                                        z15 = z14;
                                        i13 = i14;
                                        h = z12;
                                        size = i7;
                                        i11 = 0;
                                    }
                                }
                                i15++;
                                h = z12;
                                z15 = true;
                            } catch (Exception e12) {
                                e = e12;
                                z12 = h;
                            }
                        }
                        z12 = h;
                        z13 = z11;
                        i7 = size;
                        z14 = z15;
                    } catch (Exception e13) {
                        e = e13;
                        z12 = h;
                    }
                    n1Var = null;
                    if (n1Var != null) {
                        mVar2.H.put(n1Var.a, n1Var);
                    }
                    z11 = z13;
                    z15 = z14;
                    i13 = i14;
                    h = z12;
                    size = i7;
                    i11 = 0;
                }
                z10 = h;
                sVar.b(new a3.n(mVar2));
                z15 = z11;
            }
        }
        if (z15) {
            this.d.a();
            if (!z9) {
                this.d.Z0(5, l10);
                if (z10) {
                    this.d.f();
                }
            }
            org.telegram.ui.vn0 vn0Var = this.h0;
            if (vn0Var != null) {
                org.telegram.messenger.g0.h3(vn0Var);
            }
            k0.add(Integer.valueOf(this.a));
        }
    }

    public final void x0(int i7) {
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.D(new e2.e(i7 == 0 ? 1 : 3, 0, i7 == 0 ? 2 : 1, 1, false, 0, true), false);
        }
        l2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.D(new e2.e(i7 == 0 ? 1 : 2, 0, i7 == 0 ? 2 : 1, 1, false, 0, true), true);
        }
    }

    @Override // e2.a1
    public final void y(e2.v0 v0Var) {
        org.telegram.messenger.g0.h3(new g51(0, this, v0Var));
    }

    public final void y0(Surface surface) {
        if (this.s == surface) {
            return;
        }
        this.s = surface;
        l2.i0 i0Var = this.d;
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
        l2.i0 i0Var = this.d;
        if (i0Var == null) {
            return;
        }
        i0Var.F1();
        i0Var.S(surfaceView == null ? null : surfaceView.getHolder());
    }

    public n51(boolean z9, boolean z10) {
        int i7 = j0;
        j0 = i7 + 1;
        this.a = i7;
        this.a0 = new Handler(Looper.getMainLooper());
        this.c0 = false;
        this.d0 = -1;
        this.f0 = -9223372036854775807L;
        this.g0 = -9223372036854775807L;
        this.i0 = new ArrayList();
        this.b0 = z10;
        this.h = new ExtendedDefaultDataSourceFactory(org.telegram.messenger.t0.b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        a3.s sVar = new a3.s(org.telegram.messenger.t0.b, new nb.a(1));
        this.f = sVar;
        if (z10) {
            a3.n j3 = sVar.j();
            j3.getClass();
            a3.m mVar = new a3.m(j3);
            mVar.I.add(1);
            sVar.b(new a3.n(mVar));
        }
        this.L = 1;
        this.W = z9;
        if (z9) {
            org.telegram.messenger.qs.e().b(this, org.telegram.messenger.qs.H4);
        }
    }

    @Override // e2.a1
    public void onRenderedFirstFrame() {
        this.J.onRenderedFirstFrame();
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
    public final /* synthetic */ void P(boolean z9) {
    }

    @Override // m2.b
    public final /* synthetic */ void b(x2.c0 c0Var) {
    }

    @Override // e2.a1
    public final /* synthetic */ void c(int i7) {
    }

    @Override // e2.a1
    public final void e(int i7) {
    }

    @Override // e2.a1
    public final /* synthetic */ void f(boolean z9) {
    }

    @Override // e2.a1
    public final /* synthetic */ void g(int i7) {
    }

    @Override // e2.a1
    public final /* synthetic */ void h(boolean z9) {
    }

    @Override // e2.a1
    public final /* synthetic */ void i(int i7) {
    }

    @Override // e2.a1
    public final /* synthetic */ void j(boolean z9) {
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
    public final /* synthetic */ void t(boolean z9) {
    }

    @Override // m2.b
    public final /* synthetic */ void w(e2.x1 x1Var) {
    }

    @Override // e2.a1
    public final /* synthetic */ void x(g2.d dVar) {
    }

    @Override // m2.b
    public final /* synthetic */ void z(l2.d dVar) {
    }

    @Override // m2.b
    public final /* synthetic */ void E(e2.c1 c1Var, wf.b bVar) {
    }

    @Override // e2.a1
    public final /* synthetic */ void J(int i7, int i10) {
    }

    @Override // e2.a1
    public final /* synthetic */ void L(e2.l1 l1Var, int i7) {
    }

    @Override // e2.a1
    public final /* synthetic */ void k(int i7, boolean z9) {
    }

    @Override // m2.b
    public final /* synthetic */ void r(m2.a aVar, x2.c0 c0Var) {
    }

    @Override // e2.a1
    public final /* synthetic */ void v(int i7, e2.l0 l0Var) {
    }

    @Override // m2.b
    public final /* synthetic */ void d(m2.a aVar, int i7, long j3) {
    }

    @Override // e2.a1
    public final void s(e2.b1 b1Var, e2.b1 b1Var2, int i7) {
    }
}
