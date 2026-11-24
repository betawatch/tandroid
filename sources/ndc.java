// default package

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
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.a;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ndc implements pe8, fdc, uk, jm7 {
    public static int k0;
    public static final HashSet l0 = new HashSet();
    public static HashMap m0;
    public boolean E;
    public boolean F;
    public Uri G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ldc K;
    public hdc L;
    public int M;
    public boolean N;
    public ArrayList O;
    public kdc P;
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
    public vu8 a0;
    public np3 b;
    public final Handler b0;
    public boolean c;
    public final boolean c0;
    public h74 d;
    public boolean d0;
    public h74 e;
    public int e0;
    public final fe3 f;
    public boolean f0;
    public long g0;
    public final ExtendedDefaultDataSourceFactory h;
    public long h0;
    public n88 i0;
    public final ArrayList j0;
    public TextureView n;
    public SurfaceView r;
    public Surface s;
    public boolean w;
    public boolean x;
    public boolean y;

    public ndc(boolean z, boolean z2) {
        int i = k0;
        k0 = i + 1;
        this.a = i;
        this.b0 = new Handler(Looper.getMainLooper());
        this.d0 = false;
        this.e0 = -1;
        this.g0 = -9223372036854775807L;
        this.h0 = -9223372036854775807L;
        this.j0 = new ArrayList();
        this.c0 = z2;
        this.h = new ExtendedDefaultDataSourceFactory(a.b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        fe3 fe3Var = new fe3(a.b, new q7f((byte) 13));
        this.f = fe3Var;
        if (z2) {
            ae3 ae3Var = fe3Var.f;
            ae3Var.getClass();
            zd3 zd3Var = new zd3(ae3Var);
            zd3Var.I.add(1);
            fe3Var.m(new ae3(zd3Var));
        }
        this.M = 1;
        this.X = z;
        if (z) {
            nm7.e().a(this, nm7.L4);
        }
    }

    public static boolean C0(String str) {
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
                        fc4.g(e, true);
                        return false;
                    }
            }
        }
        if (concat != null) {
            HashMap hashMap = m0;
            if (hashMap == null) {
                hashMap = new HashMap();
                m0 = hashMap;
            }
            Boolean bool = (Boolean) hashMap.get(concat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!oc7.d1().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i = 0; i < codecCount; i++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                    if (!codecInfoAt.isEncoder() && tm6.i(codecInfoAt, concat)) {
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

    public static mdc O(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((kdc) obj).d;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                mdc mdcVar = (mdc) obj2;
                if (mdcVar.b()) {
                    return mdcVar;
                }
            }
        }
        return null;
    }

    public static ArrayList X(int i, TLRPC.Document document, ArrayList arrayList, int i2, boolean z) {
        kdc kdcVar;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!oc7.r1(i).l4.S2.f && arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        LongSparseArray longSparseArray = new LongSparseArray();
        int i3 = 0;
        while (i3 < arrayList2.size()) {
            TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i3);
            if ("application/x-mpegurl".equalsIgnoreCase(document2.mime_type) && (str = document2.file_name_fixed) != null && str.startsWith("mtproto")) {
                try {
                    longSparseArray.put(Long.parseLong(document2.file_name_fixed.substring(7)), document2);
                    arrayList2.remove(i3);
                    i3--;
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
            i3++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i4);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    mdc d = mdc.d(i, document3, (TLRPC.Document) longSparseArray.get(document3.id), i2, z);
                    if (d.i > 0 && d.j > 0) {
                        if (document3 == document) {
                            d.b = true;
                        }
                        arrayList3.add(d);
                    }
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i5 = 0; i5 < arrayList3.size(); i5++) {
            mdc mdcVar = (mdc) arrayList3.get(i5);
            String str2 = mdcVar.m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(mdcVar.m) && !"hevc".equals(mdcVar.m) && !"h265".equals(mdcVar.m) && !"vp9".equals(mdcVar.m)) || C0(mdcVar.m))) {
                arrayList4.add(mdcVar);
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
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList5.get(i6);
            i6++;
            mdc mdcVar2 = (mdc) obj;
            if (mdcVar2.b) {
                arrayList6.add(new kdc(mdcVar2));
            } else {
                int size2 = arrayList6.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        kdcVar = null;
                        break;
                    }
                    Object obj2 = arrayList6.get(i7);
                    i7++;
                    kdcVar = (kdc) obj2;
                    if (!kdcVar.a && kdcVar.b == mdcVar2.i && kdcVar.c == mdcVar2.j) {
                        break;
                    }
                }
                if (kdcVar == null || gda.N0) {
                    arrayList6.add(new kdc(mdcVar2));
                } else {
                    kdcVar.d.add(mdcVar2);
                }
            }
        }
        return arrayList6;
    }

    public static mdc a0(ArrayList arrayList) {
        int i;
        int i2;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ArrayList arrayList2 = ((kdc) obj).d;
            int size2 = arrayList2.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                mdc mdcVar = (mdc) obj2;
                if (mdcVar.b && mdcVar.b()) {
                    return mdcVar;
                }
            }
        }
        int size3 = arrayList.size();
        mdc mdcVar2 = null;
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList.get(i5);
            i5++;
            ArrayList arrayList3 = ((kdc) obj3).d;
            int size4 = arrayList3.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList3.get(i6);
                i6++;
                mdc mdcVar3 = (mdc) obj4;
                if (!mdcVar3.b && C0(mdcVar3.m) && (mdcVar2 == null || (i = mdcVar3.i * mdcVar3.j) > (i2 = mdcVar2.i * mdcVar2.j) || (i == i2 && mdcVar3.l < mdcVar2.l))) {
                    mdcVar2 = mdcVar3;
                }
            }
        }
        if (mdcVar2 == null) {
            int size5 = arrayList.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList.get(i7);
                i7++;
                ArrayList arrayList4 = ((kdc) obj5).d;
                int size6 = arrayList4.size();
                int i8 = 0;
                while (i8 < size6) {
                    Object obj6 = arrayList4.get(i8);
                    i8++;
                    mdc mdcVar4 = (mdc) obj6;
                    if (mdcVar2 == null || mdcVar2.i * mdcVar2.j > mdcVar4.i * mdcVar4.j || mdcVar4.l < mdcVar2.l) {
                        mdcVar2 = mdcVar4;
                    }
                }
            }
        }
        return mdcVar2;
    }

    public static mdc b0(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((kdc) obj).d;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                mdc mdcVar = (mdc) obj2;
                if (mdcVar.b()) {
                    return mdcVar;
                }
            }
        }
        int size3 = arrayList.size();
        mdc mdcVar2 = null;
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList.get(i3);
            i3++;
            ArrayList arrayList3 = ((kdc) obj3).d;
            int size4 = arrayList3.size();
            int i4 = 0;
            while (i4 < size4) {
                Object obj4 = arrayList3.get(i4);
                i4++;
                mdc mdcVar3 = (mdc) obj4;
                if (!mdcVar3.b && (mdcVar2 == null || mdcVar2.i * mdcVar2.j > mdcVar3.i * mdcVar3.j || mdcVar3.l < mdcVar2.l)) {
                    if (mdcVar3.i <= 900 && mdcVar3.j <= 900) {
                        mdcVar2 = mdcVar3;
                    }
                }
            }
        }
        if (mdcVar2 == null) {
            int size5 = arrayList.size();
            int i5 = 0;
            while (i5 < size5) {
                Object obj5 = arrayList.get(i5);
                i5++;
                ArrayList arrayList4 = ((kdc) obj5).d;
                int size6 = arrayList4.size();
                int i6 = 0;
                while (i6 < size6) {
                    Object obj6 = arrayList4.get(i6);
                    i6++;
                    mdc mdcVar4 = (mdc) obj6;
                    if (mdcVar2 == null || mdcVar2.i * mdcVar2.j > mdcVar4.i * mdcVar4.j || mdcVar4.l < mdcVar2.l) {
                        mdcVar2 = mdcVar4;
                    }
                }
            }
        }
        return mdcVar2;
    }

    public static void m0(k47 k47Var, boolean z) {
        if (k47Var == null) {
            return;
        }
        a.b.getSharedPreferences("media_saved_pos", 0).edit().putBoolean(k47.B0(k47Var.k) + "_" + k47Var.e1() + "loop", z).apply();
    }

    public static void n0(kdc kdcVar, k47 k47Var) {
        if (k47Var == null) {
            return;
        }
        long B0 = k47.B0(k47Var.k);
        int e1 = k47Var.e1();
        SharedPreferences.Editor edit = a.b.getSharedPreferences("media_saved_pos", 0).edit();
        if (kdcVar == null) {
            edit.remove(B0 + "_" + e1 + "q2");
        } else {
            String str = B0 + "_" + e1 + "q2";
            StringBuilder sb = new StringBuilder();
            sb.append(kdcVar.b);
            sb.append("x");
            sb.append(kdcVar.c);
            sb.append(kdcVar.a ? "s" : "");
            edit.putString(str, sb.toString());
        }
        edit.apply();
    }

    public final void A0(float f) {
        h74 h74Var = this.d;
        if (h74Var != null) {
            h74Var.R(f);
        }
        h74 h74Var2 = this.e;
        if (h74Var2 != null) {
            h74Var2.R(f);
        }
    }

    public final void B0(np3 np3Var) {
        this.b = np3Var;
        h74 h74Var = this.d;
        if (np3Var != null) {
            h74Var.s0 = new rf2(np3Var, (byte) 7);
        } else {
            h74Var.s0 = null;
        }
    }

    @Override // pe8
    public final void F(u64 u64Var) {
        gm.c3(new x4c(this, u64Var, (byte) 18));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r7.b0 != 0.0f) goto L16;
     */
    @Override // pe8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(int i, boolean z) {
        h74 h74Var = this.d;
        if (h74Var != null) {
            boolean s = h74Var.s();
            int h = this.d.h();
            if (this.N != s || this.M != h) {
                this.K.onStateChanged(s, h);
                this.N = s;
                this.M = h;
            }
        }
        if (z && i == 3) {
            h74 h74Var2 = this.d;
            if (h74Var2 != null) {
                h74Var2.y1();
            }
            if (this.X) {
                nm7.e().k(nm7.L4, this);
            }
        }
        if (!this.H && i == 3) {
            this.H = true;
            if (this.I && this.J) {
                g0();
            }
        }
        if (i != 3) {
            this.b0.removeCallbacksAndMessages(null);
            hdc hdcVar = this.L;
            if (hdcVar != null) {
                hdcVar.s(false, null);
            }
        }
    }

    public final void I() {
        int i;
        int i2;
        HashMap hashMap = new HashMap();
        hashMap.put(we8.c.a, 144179200);
        ag0 ag0Var = new ag0();
        if (this.c) {
            i2 = 1000;
            i = 1000;
        } else {
            i = 2000;
            i2 = 100;
        }
        xc3.a(i2, 0, "bufferForPlaybackMs", "0");
        xc3.a(i, 0, "bufferForPlaybackAfterRebufferMs", "0");
        xc3.a(50000, i2, "minBufferMs", "bufferForPlaybackMs");
        xc3.a(50000, i, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        xc3.a(50000, 50000, "maxBufferMs", "minBufferMs");
        xc3.a(0, 0, "backBufferDurationMs", "0");
        xc3 xc3Var = new xc3(ag0Var, 50000, 50000, 50000, 50000, i2, i2, i, i, false, hashMap);
        byte b = 2;
        if (this.d == null) {
            hd3 idcVar = this.L != null ? new idc(this, a.b) : new hd3(a.b);
            idcVar.c = true;
            v64 v64Var = new v64(a.b);
            jte.p(!v64Var.A);
            v64Var.c = new ad3(idcVar, (byte) 3);
            fe3 fe3Var = this.f;
            jte.p(!v64Var.A);
            fe3Var.getClass();
            v64Var.e = new ad3(fe3Var, b);
            v64Var.b(xc3Var);
            h74 a = v64Var.a();
            this.d = a;
            a.i0(new o00(3, 0, 1, 1, false, 0, true), false);
            xa3 xa3Var = this.d.s;
            xa3Var.getClass();
            xa3Var.f.a(this);
            this.d.m.a(this);
            this.d.t0.add(this);
            TextureView textureView = this.n;
            if (textureView != null) {
                this.d.s1(textureView);
            } else {
                Surface surface = this.s;
                if (surface != null) {
                    this.d.r1(surface);
                } else {
                    SurfaceView surfaceView = this.r;
                    if (surfaceView != null) {
                        h74 h74Var = this.d;
                        h74Var.y1();
                        h74Var.Q(surfaceView.getHolder());
                    }
                }
            }
            this.d.V(this.x);
            this.d.n0(this.W ? 2 : 0);
        }
        if (this.y && this.e == null) {
            v64 v64Var2 = new v64(a.b);
            fe3 fe3Var2 = this.f;
            jte.p(!v64Var2.A);
            fe3Var2.getClass();
            v64Var2.e = new ad3(fe3Var2, b);
            v64Var2.b(xc3Var);
            h74 a2 = v64Var2.a();
            this.e = a2;
            a2.i0(new o00(2, 0, 1, 1, false, 0, true), false);
            this.e.m.a(new b40(this, (byte) 4));
            this.e.V(this.x);
        }
    }

    public final long N() {
        h74 h74Var = this.d;
        if (h74Var != null) {
            return this.w ? h74Var.b0() : h74Var.getDuration();
        }
        return 0L;
    }

    public final mi2 Q(String str, String str2, String str3) {
        if (this.O == null) {
            if (this.R == null) {
                return null;
            }
            String concat = "/mtproto_".concat(str);
            String queryParameter = this.R.getQueryParameter("mime");
            ki2 ki2Var = new ki2(TextUtils.isEmpty(queryParameter) ? "video/mp4" : queryParameter, this.R, concat);
            ki2Var.e = str2;
            ki2Var.f = str3;
            return new mi2(new li2(ki2Var));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.O;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ArrayList arrayList3 = ((kdc) obj).d;
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                mdc mdcVar = (mdc) obj2;
                StringBuilder sb = new StringBuilder("/mtproto_");
                int i3 = size;
                sb.append(mdcVar.c);
                String sb2 = sb.toString();
                TLRPC.Document document = mdcVar.g;
                String str4 = document != null ? document.mime_type : null;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                ki2 ki2Var2 = new ki2(str4, mdcVar.d, sb2);
                ki2Var2.e = str2;
                ki2Var2.f = str3;
                int i4 = mdcVar.i;
                int i5 = mdcVar.j;
                ki2Var2.a = i4;
                ki2Var2.b = i5;
                arrayList.add(new li2(ki2Var2));
                size = i3;
            }
        }
        return new mi2(arrayList);
    }

    public final TLRPC.Document R() {
        ArrayList arrayList;
        h74 h74Var = this.d;
        if (h74Var == null) {
            return null;
        }
        h74Var.y1();
        go4 go4Var = h74Var.S;
        if (go4Var == null || go4Var.p == 0 || (arrayList = this.O) == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((kdc) obj).d;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                mdc mdcVar = (mdc) obj2;
                if (mdcVar.c == go4Var.p) {
                    return mdcVar.g;
                }
            }
        }
        return null;
    }

    public final long S() {
        long j = this.h0;
        if (j != -9223372036854775807L) {
            return j;
        }
        h74 h74Var = this.d;
        if (h74Var != null) {
            return h74Var.k();
        }
        return 0L;
    }

    public final int T() {
        if (this.e0 == -1) {
            try {
                if (this.d0) {
                    for (int i = 0; i < Y(); i++) {
                        if (Z(i).a) {
                            return i;
                        }
                    }
                }
                h74 h74Var = this.d;
                if (h74Var != null) {
                    h74Var.y1();
                    go4 go4Var = h74Var.S;
                    if (go4Var != null) {
                        for (int i2 = 0; i2 < Y(); i2++) {
                            kdc Z = Z(i2);
                            if (!Z.a && go4Var.A == Z.b && go4Var.B == Z.c && go4Var.k == ((int) Math.floor(((mdc) Z.d.get(0)).l * 8.0d))) {
                                return i2;
                            }
                        }
                    }
                }
                return -1;
            } catch (Exception e) {
                fc4.g(e, true);
                return -1;
            }
        }
        return this.e0;
    }

    public final long U() {
        long j = this.g0;
        if (j != -9223372036854775807L) {
            return j;
        }
        h74 h74Var = this.d;
        if (h74Var != null) {
            return h74Var.getDuration();
        }
        return 0L;
    }

    public final f6b V(f6b f6bVar) {
        if (f6bVar == null) {
            f6bVar = new f6b();
        }
        try {
            h74 h74Var = this.d;
            h74Var.y1();
            MediaFormat mediaFormat = ((om6) h74Var.g[0]).e0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    f6bVar.b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    f6bVar.a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return f6bVar;
    }

    public final kdc W(Boolean bool) {
        kdc kdcVar = null;
        for (int i = 0; i < Y(); i++) {
            kdc Z = Z(i);
            if (Z.a == bool.booleanValue() && (kdcVar == null || kdcVar.b * kdcVar.c < Z.b * Z.c)) {
                kdcVar = Z;
            }
        }
        return kdcVar;
    }

    public final int Y() {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final kdc Z(int i) {
        ArrayList arrayList = this.O;
        return arrayList == null ? W(Boolean.FALSE) : (i < 0 || i >= arrayList.size()) ? W(Boolean.FALSE) : (kdc) this.O.get(i);
    }

    @Override // pe8
    public final void a(jec jecVar) {
        if (Objects.equals(jecVar, jec.d)) {
            return;
        }
        this.K.onVideoSizeChanged(jecVar.a, jecVar.b, 0, jecVar.c);
    }

    public final boolean c0() {
        if (this.y && this.J) {
            return true;
        }
        h74 h74Var = this.d;
        return h74Var != null && h74Var.s();
    }

    public final Uri d0(ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("#EXTM3U\n#EXT-X-VERSION:6\n#EXT-X-INDEPENDENT-SEGMENTS\n\n");
        this.Q = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList3 = ((kdc) obj).d;
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                mdc mdcVar = (mdc) obj2;
                long j = mdcVar.c;
                Uri uri = mdcVar.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(mdcVar.e, mdcVar.f);
                if (mdcVar.f != null) {
                    this.Q.add(mdcVar);
                    StringBuilder sb2 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb2.append((int) Math.floor(mdcVar.l * 8.0d));
                    sb2.append(",RESOLUTION=");
                    sb2.append(mdcVar.i);
                    sb2.append("x");
                    sb2.append(mdcVar.j);
                    String str2 = mdcVar.m;
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
                        wi8.z(",MIME=\"", str, "\"", sb2);
                    }
                    if (mdcVar.b() && mdcVar.c()) {
                        sb2.append(",CACHED=\"true\"");
                    }
                    sb2.append(",DOCID=\"");
                    sb2.append(mdcVar.c);
                    sb2.append("\",ACCOUNT=\"");
                    sb2.append(mdcVar.a);
                    sb2.append("\"\n");
                    if (mdcVar.c()) {
                        sb2.append(mdcVar.f);
                        sb2.append("\n\n");
                    } else {
                        sb2.append("mtproto:");
                        sb2.append(mdcVar.e);
                        sb2.append("\n\n");
                    }
                    arrayList2.add(sb2.toString());
                    z = true;
                }
            }
        }
        if (!z) {
            return null;
        }
        Collections.reverse(arrayList2);
        sb.append(TextUtils.join("", arrayList2));
        return Uri.parse("data:application/x-mpegurl;base64," + Base64.encodeToString(sb.toString().getBytes(), 2));
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != nm7.L4 || ((ndc) objArr[0]) == this || !c0() || this.E) {
            return;
        }
        f0();
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.media3.exoplayer.dash.DashMediaSource$Factory] */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.media3.exoplayer.hls.HlsMediaSource$Factory] */
    public final rh0 e0(long j, Uri uri, String str) {
        vs6 vs6Var;
        xs6 xs6Var;
        is3 y;
        is3 is3Var;
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        qs6 qs6Var = new qs6();
        ts6 ts6Var = new ts6();
        List list = Collections.EMPTY_LIST;
        ko5 ko5Var = mo5.b;
        y79 y79Var = y79.e;
        vs6 vs6Var2 = new vs6();
        ys6 ys6Var = ys6.d;
        jte.p(ts6Var.b == null || ts6Var.a != null);
        if (uri != null) {
            us6 us6Var = ts6Var.a != null ? new us6(ts6Var) : null;
            vs6Var = vs6Var2;
            xs6Var = new xs6(uri, null, us6Var, null, list, null, y79Var, -9223372036854775807L);
        } else {
            vs6Var = vs6Var2;
            xs6Var = null;
        }
        bt6 bt6Var = new bt6("", new ss6(qs6Var), xs6Var, new ws6(vs6Var), jt6.M, ys6Var);
        if (j != 0) {
            d12 d12Var = new d12((Object) this, j, (byte) 14);
            h68 h68Var = new h68((Object) new wb3(), (byte) 18);
            Object obj = new Object();
            k4f k4fVar = new k4f((byte) 17);
            bt6Var.b.getClass();
            bt6Var.b.getClass();
            us6 us6Var2 = bt6Var.b.c;
            if (us6Var2 == null) {
                is3Var = is3.u;
            } else {
                synchronized (obj) {
                    y = !us6Var2.equals(null) ? mx6.y(us6Var2) : null;
                    y.getClass();
                }
                is3Var = y;
            }
            return new wu8(bt6Var, d12Var, h68Var, is3Var, k4fVar, TLObject.FLAG_20, null);
        }
        str.getClass();
        if (str.equals("hls")) {
            HlsMediaSource$Factory hlsMediaSource$Factory = this.Z;
            HlsMediaSource$Factory hlsMediaSource$Factory2 = hlsMediaSource$Factory;
            if (hlsMediaSource$Factory == null) {
                ?? r1 = new qz6(extendedDefaultDataSourceFactory) { // from class: androidx.media3.exoplayer.hls.HlsMediaSource$Factory
                    public final k6d a;
                    public bc3 b;
                    public fgf c;
                    public final k1f f;
                    public final k4f j;
                    public final mx6 i = new mx6();
                    public final wa3 g = fc3.N;
                    public final kg7 h = new kg7((byte) 17);
                    public final boolean l = true;
                    public final long m = -9223372036854775807L;
                    public final boolean k = true;
                    public byte e = 3;
                    public boolean d = true;

                    {
                        this.a = new k6d((Object) extendedDefaultDataSourceFactory, (byte) 26);
                        byte b = 17;
                        this.f = new k1f(b);
                        this.j = new k4f(b);
                    }

                    @Override // qz6
                    public final qz6 a() {
                        this.d = true;
                        return this;
                    }

                    @Override // qz6
                    public final qz6 b() {
                        this.e = (byte) 3;
                        return this;
                    }

                    @Override // qz6
                    public final qz6 c(fgf fgfVar) {
                        this.c = fgfVar;
                        return this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v3, types: [hi2] */
                    @Override // qz6
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public final dh5 d(bt6 bt6Var2) {
                        bt6Var2.b.getClass();
                        bc3 bc3Var = this.b;
                        if (bc3Var == null) {
                            bc3Var = new bc3();
                            bc3Var.c = new fgf((byte) 17);
                            bc3Var.b = (byte) 3;
                            this.b = bc3Var;
                        }
                        bc3 bc3Var2 = bc3Var;
                        fgf fgfVar = this.c;
                        if (fgfVar != null) {
                            bc3Var2.c = fgfVar;
                        }
                        bc3Var2.a = this.d;
                        bc3Var2.b = this.e;
                        List list2 = bt6Var2.b.e;
                        boolean isEmpty = list2.isEmpty();
                        k1f k1fVar = this.f;
                        if (!isEmpty) {
                            k1fVar = new hi2((Object) k1fVar, (Object) list2, (byte) 29);
                        }
                        is3 G = this.i.G(bt6Var2);
                        this.g.getClass();
                        k6d k6dVar = this.a;
                        k4f k4fVar2 = this.j;
                        return new dh5(bt6Var2, k6dVar, bc3Var2, this.h, G, k4fVar2, new fc3(k6dVar, k4fVar2, k1fVar), this.m, this.k, this.l ? 1 : 0);
                    }
                };
                this.Z = r1;
                hlsMediaSource$Factory2 = r1;
            }
            return hlsMediaSource$Factory2.d(bt6Var);
        }
        if (!str.equals("dash")) {
            vu8 vu8Var = this.a0;
            if (vu8Var == null) {
                vu8Var = new vu8(extendedDefaultDataSourceFactory, new wb3());
                this.a0 = vu8Var;
            }
            return vu8Var.d(bt6Var);
        }
        DashMediaSource$Factory dashMediaSource$Factory = this.Y;
        DashMediaSource$Factory dashMediaSource$Factory2 = dashMediaSource$Factory;
        if (dashMediaSource$Factory == null) {
            ?? r12 = new qz6(extendedDefaultDataSourceFactory) { // from class: androidx.media3.exoplayer.dash.DashMediaSource$Factory
                public final hi2 a;
                public final y73 b;
                public final mx6 c;
                public final kg7 d;
                public final k4f e;
                public final short f;
                public final int g;

                {
                    hi2 hi2Var = new hi2(extendedDefaultDataSourceFactory);
                    this.a = hi2Var;
                    this.b = extendedDefaultDataSourceFactory;
                    this.c = new mx6();
                    this.e = new k4f((byte) 17);
                    this.f = (short) 30000;
                    this.g = 5000000;
                    this.d = new kg7((byte) 17);
                    ((m41) hi2Var.c).b = true;
                }

                @Override // qz6
                public final qz6 a() {
                    ((m41) this.a.c).b = true;
                    return this;
                }

                @Override // qz6
                public final qz6 b() {
                    Object obj2 = this.a.c;
                    return this;
                }

                @Override // qz6
                public final qz6 c(fgf fgfVar) {
                    ((m41) this.a.c).c = fgfVar;
                    return this;
                }

                @Override // qz6
                public final rh0 d(bt6 bt6Var2) {
                    bt6Var2.b.getClass();
                    cx7 v63Var = new v63();
                    List list2 = bt6Var2.b.e;
                    return new c73(bt6Var2, this.b, !list2.isEmpty() ? new lx6(v63Var, list2, (byte) 27) : v63Var, this.a, this.d, this.c.G(bt6Var2), this.e, this.f, this.g);
                }
            };
            this.Y = r12;
            dashMediaSource$Factory2 = r12;
        }
        return dashMediaSource$Factory2.d(bt6Var);
    }

    public void f0() {
        this.J = false;
        h74 h74Var = this.d;
        if (h74Var != null) {
            h74Var.V(false);
        }
        h74 h74Var2 = this.e;
        if (h74Var2 != null) {
            h74Var2.V(false);
        }
        if (this.L != null) {
            this.b0.removeCallbacksAndMessages(null);
            this.L.s(false, null);
        }
    }

    public void g0() {
        this.J = true;
        if (!this.y || (this.I && this.H)) {
            h74 h74Var = this.d;
            if (h74Var != null) {
                h74Var.V(true);
            }
            h74 h74Var2 = this.e;
            if (h74Var2 != null) {
                h74Var2.V(true);
                return;
            }
            return;
        }
        h74 h74Var3 = this.d;
        if (h74Var3 != null) {
            h74Var3.V(false);
        }
        h74 h74Var4 = this.e;
        if (h74Var4 != null) {
            h74Var4.V(false);
        }
    }

    public final void h0(long j, Uri uri, String str) {
        this.O = null;
        this.P = null;
        this.R = uri;
        this.T = str;
        this.S = null;
        this.U = null;
        boolean z = false;
        this.V = false;
        this.d0 = false;
        this.f0 = false;
        this.H = false;
        this.y = false;
        this.G = uri;
        String scheme = uri != null ? uri.getScheme() : null;
        if (scheme != null && !scheme.startsWith("file")) {
            z = true;
        }
        this.w = z;
        I();
        this.d.n1(e0(j, uri, str), true);
        this.d.a();
    }

    public final void i0(Uri uri, String str) {
        h0(0L, uri, str);
    }

    public final void j0(ArrayList arrayList, kdc kdcVar) {
        ArrayList arrayList2;
        this.O = arrayList;
        this.P = kdcVar;
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
        this.e0 = (kdcVar == null || (arrayList2 = this.O) == null) ? -1 : arrayList2.indexOf(kdcVar);
        v0(true, kdcVar);
        if (this.d0) {
            this.e0 = -1;
        }
    }

    public final void k0(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        zh6 zh6Var = null;
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
        zh6 zh6Var2 = null;
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            zh6 zh6Var3 = new zh6(e0(0L, uri3, str3));
            if (i == 0) {
                zh6Var = zh6Var3;
            } else {
                zh6Var2 = zh6Var3;
            }
        }
        this.d.n1(zh6Var, true);
        this.d.a();
        this.e.n1(zh6Var2, true);
        this.e.a();
        l0.add(Integer.valueOf(this.a));
    }

    public final void l0() {
        l0.remove(Integer.valueOf(this.a));
        h74 h74Var = this.d;
        if (h74Var != null) {
            h74Var.g1();
            this.d = null;
        }
        h74 h74Var2 = this.e;
        if (h74Var2 != null) {
            h74Var2.g1();
            this.e = null;
        }
        if (this.X) {
            nm7.e().n(this, nm7.L4);
        }
    }

    @Override // pe8
    public final void m(d0c d0cVar) {
        n88 n88Var = this.i0;
        if (n88Var != null) {
            gm.c3(n88Var);
        }
    }

    public void o0(long j) {
        p0(j, false);
    }

    @Override // uk
    public final void onRenderedFirstFrame(tk tkVar) {
        this.h0 = -9223372036854775807L;
        this.g0 = -9223372036854775807L;
        ldc ldcVar = this.K;
        if (ldcVar != null) {
            ldcVar.onRenderedFirstFrame(tkVar);
        }
    }

    @Override // uk
    public final void onSeekStarted(tk tkVar) {
        ldc ldcVar = this.K;
        if (ldcVar != null) {
            ldcVar.onSeekStarted(tkVar);
        }
    }

    public final void p0(long j, boolean z) {
        h74 h74Var = this.d;
        if (h74Var != null) {
            h74Var.p1(z ? jx9.d : jx9.c);
            this.d.k1(j);
        }
    }

    public final void q0(long j, boolean z, Runnable runnable) {
        if (this.d != null) {
            if (runnable != null) {
                this.j0.add(runnable);
            }
            this.d.p1(z ? jx9.d : jx9.c);
            this.d.k1(j);
        }
    }

    public final void r0(boolean z) {
        if (this.W != z) {
            this.W = z;
            h74 h74Var = this.d;
            if (h74Var != null) {
                h74Var.n0(z ? 2 : 0);
            }
        }
    }

    public final void s0(boolean z) {
        h74 h74Var = this.d;
        if (h74Var != null) {
            h74Var.R(z ? 0.0f : 1.0f);
        }
        h74 h74Var2 = this.e;
        if (h74Var2 != null) {
            h74Var2.R(z ? 0.0f : 1.0f);
        }
    }

    public void t0(boolean z) {
        this.J = z;
        if (z && this.y && (!this.I || !this.H)) {
            h74 h74Var = this.d;
            if (h74Var != null) {
                h74Var.V(false);
            }
            h74 h74Var2 = this.e;
            if (h74Var2 != null) {
                h74Var2.V(false);
                return;
            }
            return;
        }
        this.x = z;
        h74 h74Var3 = this.d;
        if (h74Var3 != null) {
            h74Var3.V(z);
        }
        h74 h74Var4 = this.e;
        if (h74Var4 != null) {
            h74Var4.V(z);
        }
    }

    public void u0(float f) {
        try {
            h74 h74Var = this.d;
            if (h74Var != null) {
                h74Var.b(new ce8(f, f > 1.0f ? 0.98f : 1.0f));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(boolean z, kdc kdcVar) {
        boolean z2;
        int i;
        boolean z3;
        int i2;
        int i3;
        a0c a0cVar;
        int i4;
        kdc kdcVar2;
        h74 h74Var = this.d;
        if (h74Var != null) {
            boolean i5 = h74Var.i();
            long k = this.d.k();
            if (!z) {
                this.h0 = k;
                this.g0 = this.d.getDuration();
            }
            this.P = kdcVar;
            fe3 fe3Var = this.f;
            int i6 = 0;
            if (kdcVar == null) {
                Uri d0 = d0(this.O);
                int i7 = 0;
                while (true) {
                    if (i7 >= Y()) {
                        kdcVar2 = null;
                        break;
                    }
                    kdc Z = Z(i7);
                    if (Z.a) {
                        kdcVar2 = Z;
                        break;
                    }
                    i7++;
                }
                if (kdcVar2 != null) {
                    ArrayList arrayList = kdcVar2.d;
                    if (arrayList.size() == 1 && ((mdc) arrayList.get(0)).b()) {
                        this.f0 = false;
                        this.d0 = true;
                        this.P = kdcVar2;
                        this.d.n1(e0(0L, kdcVar2.a().d, "other"), false);
                        i6 = 1;
                        z2 = i5;
                    }
                }
                if (d0 != null) {
                    this.d0 = false;
                    ae3 ae3Var = fe3Var.f;
                    ae3Var.getClass();
                    zd3 zd3Var = new zd3(ae3Var);
                    zd3Var.c();
                    fe3Var.m(new ae3(zd3Var));
                    if (!this.f0) {
                        this.f0 = true;
                        this.d.n1(e0(0L, d0, "hls"), false);
                    }
                    z2 = i5;
                } else {
                    kdc W = W(Boolean.TRUE);
                    if (W == null) {
                        W = W(Boolean.FALSE);
                    }
                    if (W == null || W.d.isEmpty()) {
                        return;
                    }
                    this.f0 = false;
                    this.P = W;
                    this.d0 = W.a;
                    this.d.n1(e0(0L, W.a().d, "other"), false);
                }
                i6 = 1;
                z2 = i5;
            } else {
                ArrayList arrayList2 = kdcVar.d;
                this.d0 = false;
                if (arrayList2.isEmpty()) {
                    return;
                }
                Uri d02 = arrayList2.size() > 1 ? d0(this.O) : null;
                if (d02 == null || arrayList2.size() == 1 || fe3Var.c == null) {
                    z2 = i5;
                    this.f0 = false;
                    this.d.n1(e0(0L, kdcVar.a().d, "other"), false);
                    i6 = 1;
                } else {
                    if (this.f0) {
                        i = 0;
                    } else {
                        this.f0 = true;
                        this.d.n1(e0(0L, d02, "hls"), false);
                        i = 1;
                    }
                    ae3 ae3Var2 = fe3Var.f;
                    ae3Var2.getClass();
                    zd3 zd3Var2 = new zd3(ae3Var2);
                    zd3Var2.c();
                    int size = arrayList2.size();
                    int i8 = 0;
                    while (i8 < size) {
                        int i9 = i8 + 1;
                        mdc mdcVar = (mdc) arrayList2.get(i8);
                        try {
                            int indexOf = this.Q.indexOf(mdcVar);
                            kp kpVar = fe3Var.c;
                            int i10 = i6;
                            while (i10 < kpVar.a) {
                                vzb vzbVar = ((vzb[]) kpVar.c)[i10];
                                z3 = i5;
                                int i11 = 0;
                                while (i11 < vzbVar.a) {
                                    try {
                                        uzb a = vzbVar.a(i11);
                                        i2 = i;
                                        i3 = size;
                                        int i12 = 0;
                                        while (i12 < a.a) {
                                            try {
                                                go4 go4Var = a.d[i12];
                                                int i13 = i10;
                                                try {
                                                    i4 = Integer.parseInt(go4Var.a);
                                                } catch (Exception unused) {
                                                    i4 = -1;
                                                }
                                                if (i4 >= 0 && indexOf == i4) {
                                                    a0cVar = new a0c(a, i12);
                                                    break;
                                                }
                                                int i14 = indexOf;
                                                if (go4Var.A == mdcVar.i && go4Var.B == mdcVar.j) {
                                                    a0cVar = new a0c(a, i12);
                                                    break;
                                                } else {
                                                    i12++;
                                                    i10 = i13;
                                                    indexOf = i14;
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                fc4.g(e, true);
                                                a0cVar = null;
                                                if (a0cVar != null) {
                                                }
                                                i = i2;
                                                i8 = i9;
                                                i5 = z3;
                                                size = i3;
                                                i6 = 0;
                                            }
                                        }
                                        i11++;
                                        i = i2;
                                        size = i3;
                                    } catch (Exception e2) {
                                        e = e2;
                                        i2 = i;
                                        i3 = size;
                                        fc4.g(e, true);
                                        a0cVar = null;
                                        if (a0cVar != null) {
                                        }
                                        i = i2;
                                        i8 = i9;
                                        i5 = z3;
                                        size = i3;
                                        i6 = 0;
                                    }
                                }
                                i10++;
                                i5 = z3;
                            }
                            z3 = i5;
                            i2 = i;
                            i3 = size;
                        } catch (Exception e3) {
                            e = e3;
                            z3 = i5;
                        }
                        a0cVar = null;
                        if (a0cVar != null) {
                            zd3Var2.H.put(a0cVar.a, a0cVar);
                        }
                        i = i2;
                        i8 = i9;
                        i5 = z3;
                        size = i3;
                        i6 = 0;
                    }
                    z2 = i5;
                    fe3Var.m(new ae3(zd3Var2));
                    i6 = i;
                }
            }
            if (i6 != 0) {
                this.d.a();
                if (!z) {
                    this.d.k1(k);
                    if (z2) {
                        this.d.V(true);
                    }
                }
                n88 n88Var = this.i0;
                if (n88Var != null) {
                    gm.c3(n88Var);
                }
                l0.add(Integer.valueOf(this.a));
            }
        }
    }

    @Override // uk
    public final void w(tk tkVar, int i) {
        if (i == 1) {
            ldc ldcVar = this.K;
            if (ldcVar != null) {
                ldcVar.onSeekFinished(tkVar);
            }
            ArrayList arrayList = this.j0;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((Runnable) obj).run();
            }
            arrayList.clear();
        }
    }

    public final void w0(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        h74 h74Var = this.d;
        if (h74Var != null) {
            if (i == 0) {
                i4 = 2;
                i5 = 1;
            } else {
                i4 = 1;
                i5 = 3;
            }
            h74Var.i0(new o00(i5, 0, i4, 1, false, 0, true), false);
        }
        h74 h74Var2 = this.e;
        if (h74Var2 != null) {
            if (i == 0) {
                i3 = 2;
                i2 = 1;
            } else {
                i2 = 2;
                i3 = 1;
            }
            h74Var2.i0(new o00(i2, 0, i3, 1, false, 0, true), true);
        }
    }

    public final void x0(Surface surface) {
        if (this.s != surface) {
            this.s = surface;
            h74 h74Var = this.d;
            if (h74Var == null) {
                return;
            }
            h74Var.r1(surface);
        }
    }

    public final void y0(SurfaceView surfaceView) {
        if (this.r != surfaceView) {
            this.r = surfaceView;
            h74 h74Var = this.d;
            if (h74Var == null) {
                return;
            }
            h74Var.y1();
            h74Var.Q(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // pe8
    public final void z(g0c g0cVar) {
        n88 n88Var = this.i0;
        if (n88Var != null) {
            gm.c3(n88Var);
        }
    }

    public final void z0(TextureView textureView) {
        if (this.n != textureView) {
            this.n = textureView;
            h74 h74Var = this.d;
            if (h74Var == null) {
                return;
            }
            h74Var.s1(textureView);
        }
    }

    @Override // pe8
    public void onRenderedFirstFrame() {
        this.K.onRenderedFirstFrame();
    }

    @Override // pe8
    public final void B(jt6 jt6Var) {
    }

    @Override // pe8
    public final void C(jt6 jt6Var) {
    }

    @Override // pe8
    public final void E(u64 u64Var) {
    }

    @Override // pe8
    public final void G(y79 y79Var) {
    }

    @Override // pe8
    public final void J(ce8 ce8Var) {
    }

    @Override // pe8
    public final void K(ne8 ne8Var) {
    }

    @Override // pe8
    public final void L(nf7 nf7Var) {
    }

    @Override // pe8
    public final void P(boolean z) {
    }

    @Override // pe8
    public final void b(int i) {
    }

    @Override // pe8
    public final void c(int i) {
    }

    @Override // pe8
    public final void d(oe8 oe8Var) {
    }

    @Override // pe8
    public final void e(boolean z) {
    }

    @Override // pe8
    public final void f(boolean z) {
    }

    @Override // pe8
    public final void g(int i) {
    }

    @Override // pe8
    public final void h(int i) {
    }

    @Override // uk
    public final void i(ft6 ft6Var) {
    }

    @Override // uk
    public final void j(ia3 ia3Var) {
    }

    @Override // pe8
    public final void l(o00 o00Var) {
    }

    @Override // uk
    public final void n(jec jecVar) {
    }

    @Override // pe8
    public final void o(boolean z) {
    }

    @Override // pe8
    public final void q(float f) {
    }

    @Override // uk
    public final void s(u64 u64Var) {
    }

    @Override // pe8
    public final void t(int i) {
    }

    @Override // pe8
    public final void v(boolean z) {
    }

    @Override // pe8
    public final void x(g53 g53Var) {
    }

    @Override // pe8
    public final void D(bqb bqbVar, int i) {
    }

    @Override // pe8
    public final void M(int i, int i2) {
    }

    @Override // pe8
    public final void p(int i, boolean z) {
    }

    @Override // pe8
    public final void r(int i, bt6 bt6Var) {
    }

    @Override // uk
    public final void u(tk tkVar, ft6 ft6Var) {
    }

    @Override // uk
    public final void y(h74 h74Var, hi2 hi2Var) {
    }

    @Override // pe8
    public final void A(int i, qe8 qe8Var, qe8 qe8Var2) {
    }

    @Override // uk
    public final void k(tk tkVar, int i, long j) {
    }

    public ndc() {
        this(true, false);
    }
}
