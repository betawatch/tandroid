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
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.s0;
import e.a;
import h3.f1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l3.i;
import m4.g;
import n4.e;
import n5.e0;
import o4.j;
import o4.m;
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
import org.telegram.ui.Cells.e3;
import org.telegram.ui.fk0;
import p4.c;
import p4.q;
import v9.d;
import ya.b;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class k61 implements h3.a2, e5.t, i3.b, NotificationCenter.NotificationCenterDelegate {
    public static int f0;
    public static final HashSet g0 = new HashSet();
    public static HashMap h0;
    public boolean A;
    public Uri B;
    public boolean C;
    public boolean D;
    public boolean E;
    public h61 F;
    public d61 G;
    public int H;
    public boolean I;
    public ArrayList J;
    public g61 K;
    public ArrayList L;
    public Uri M;
    public Uri N;
    public String O;
    public String P;
    public boolean Q;
    public boolean R;
    public final boolean S;
    public DashMediaSource$Factory T;
    public HlsMediaSource$Factory U;
    public j4.t0 V;
    public final Handler W;
    public final boolean X;
    public boolean Y;
    public int Z;
    public final int a;
    public boolean a0;
    public DispatchQueue b;
    public long b0;
    public boolean c;
    public long c0;
    public h3.k0 d;
    public org.telegram.ui.gq0 d0;
    public h3.k2 e;
    public final ArrayList e0;
    public final b5.r f;
    public final ExtendedDefaultDataSourceFactory h;
    public TextureView n;
    public SurfaceView r;
    public Surface s;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    public k61() {
        this(true, false);
    }

    public static void J(MessageObject messageObject, boolean z10) {
        if (messageObject == null) {
            return;
        }
        ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z10).apply();
    }

    public static void K(g61 g61Var, MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (g61Var == null) {
            edit.remove(dialogId + "_" + id2 + "q2");
        } else {
            String str = dialogId + "_" + id2 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(g61Var.b);
            sb2.append("x");
            sb2.append(g61Var.c);
            sb2.append(g61Var.a ? "s" : "");
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
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return false;
                    }
            }
        }
        if (concat != null) {
            if (h0 == null) {
                h0 = new HashMap();
            }
            Boolean bool = (Boolean) h0.get(concat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!MessagesController.getGlobalMainSettings().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i9 = 0; i9 < codecCount; i9++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i9);
                    if (!codecInfoAt.isEncoder() && y3.w.h(codecInfoAt, concat)) {
                        for (String str2 : codecInfoAt.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(concat)) {
                                h0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                    }
                }
                h0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static i61 l(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ArrayList arrayList2 = ((g61) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                i61 i61Var = (i61) obj2;
                if (i61Var.b()) {
                    return i61Var;
                }
            }
        }
        return null;
    }

    public static ArrayList t(int i9, TLRPC.Document document, ArrayList arrayList, int i10, boolean z10) {
        g61 g61Var;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!MessagesController.getInstance(i9).videoIgnoreAltDocuments && arrayList != null) {
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
                    FileLog.e(e10);
                }
            }
            i11++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i12);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    i61 d = i61.d(i9, document3, (TLRPC.Document) longSparseArray.get(document3.id), i10, z10);
                    if (d.i > 0 && d.j > 0) {
                        if (document3 == document) {
                            d.b = true;
                        }
                        arrayList3.add(d);
                    }
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            i61 i61Var = (i61) arrayList3.get(i13);
            String str2 = i61Var.m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(i61Var.m) && !"hevc".equals(i61Var.m) && !"h265".equals(i61Var.m) && !"vp9".equals(i61Var.m)) || Y(i61Var.m))) {
                arrayList4.add(i61Var);
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
            i61 i61Var2 = (i61) obj;
            if (i61Var2.b) {
                arrayList6.add(new g61(i61Var2));
            } else {
                int size2 = arrayList6.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        g61Var = null;
                        break;
                    }
                    Object obj2 = arrayList6.get(i15);
                    i15++;
                    g61Var = (g61) obj2;
                    if (!g61Var.a && g61Var.b == i61Var2.i && g61Var.c == i61Var2.j) {
                        break;
                    }
                }
                if (g61Var == null || SharedConfig.debugVideoQualities) {
                    arrayList6.add(new g61(i61Var2));
                } else {
                    g61Var.d.add(i61Var2);
                }
            }
        }
        return arrayList6;
    }

    public static i61 w(ArrayList arrayList) {
        int i9;
        int i10;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ArrayList arrayList2 = ((g61) obj).d;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                i61 i61Var = (i61) obj2;
                if (i61Var.b && i61Var.b()) {
                    return i61Var;
                }
            }
        }
        int size3 = arrayList.size();
        i61 i61Var2 = null;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList.get(i13);
            i13++;
            ArrayList arrayList3 = ((g61) obj3).d;
            int size4 = arrayList3.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                i61 i61Var3 = (i61) obj4;
                if (!i61Var3.b && Y(i61Var3.m) && (i61Var2 == null || (i9 = i61Var3.i * i61Var3.j) > (i10 = i61Var2.i * i61Var2.j) || (i9 == i10 && i61Var3.l < i61Var2.l))) {
                    i61Var2 = i61Var3;
                }
            }
        }
        if (i61Var2 == null) {
            int size5 = arrayList.size();
            int i15 = 0;
            while (i15 < size5) {
                Object obj5 = arrayList.get(i15);
                i15++;
                ArrayList arrayList4 = ((g61) obj5).d;
                int size6 = arrayList4.size();
                int i16 = 0;
                while (i16 < size6) {
                    Object obj6 = arrayList4.get(i16);
                    i16++;
                    i61 i61Var4 = (i61) obj6;
                    if (i61Var2 == null || i61Var2.i * i61Var2.j > i61Var4.i * i61Var4.j || i61Var4.l < i61Var2.l) {
                        i61Var2 = i61Var4;
                    }
                }
            }
        }
        return i61Var2;
    }

    public static i61 x(ArrayList arrayList) {
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ArrayList arrayList2 = ((g61) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                i61 i61Var = (i61) obj2;
                if (i61Var.b()) {
                    return i61Var;
                }
            }
        }
        int size3 = arrayList.size();
        i61 i61Var2 = null;
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            ArrayList arrayList3 = ((g61) obj3).d;
            int size4 = arrayList3.size();
            int i12 = 0;
            while (i12 < size4) {
                Object obj4 = arrayList3.get(i12);
                i12++;
                i61 i61Var3 = (i61) obj4;
                if (!i61Var3.b && (i61Var2 == null || i61Var2.i * i61Var2.j > i61Var3.i * i61Var3.j || i61Var3.l < i61Var2.l)) {
                    if (i61Var3.i <= 900 && i61Var3.j <= 900) {
                        i61Var2 = i61Var3;
                    }
                }
            }
        }
        if (i61Var2 == null) {
            int size5 = arrayList.size();
            int i13 = 0;
            while (i13 < size5) {
                Object obj5 = arrayList.get(i13);
                i13++;
                ArrayList arrayList4 = ((g61) obj5).d;
                int size6 = arrayList4.size();
                int i14 = 0;
                while (i14 < size6) {
                    Object obj6 = arrayList4.get(i14);
                    i14++;
                    i61 i61Var4 = (i61) obj6;
                    if (i61Var2 == null || i61Var2.i * i61Var2.j > i61Var4.i * i61Var4.j || i61Var4.l < i61Var2.l) {
                        i61Var2 = i61Var4;
                    }
                }
            }
        }
        return i61Var2;
    }

    public final Uri A(ArrayList arrayList) {
        String str;
        StringBuilder sb2 = new StringBuilder("#EXTM3U\n#EXT-X-VERSION:6\n#EXT-X-INDEPENDENT-SEGMENTS\n\n");
        this.L = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z10 = false;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ArrayList arrayList3 = ((g61) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                i61 i61Var = (i61) obj2;
                long j10 = i61Var.c;
                Uri uri = i61Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j10, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(i61Var.e, i61Var.f);
                if (i61Var.f != null) {
                    this.L.add(i61Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(i61Var.l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(i61Var.i);
                    sb3.append("x");
                    sb3.append(i61Var.j);
                    String str2 = i61Var.m;
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
                    if (i61Var.b() && i61Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(i61Var.c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(i61Var.a);
                    sb3.append("\"\n");
                    if (i61Var.c()) {
                        sb3.append(i61Var.f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(i61Var.e);
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

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.google.android.exoplayer2.source.dash.DashMediaSource$Factory] */
    public final j4.a B(Uri uri, String str, long j10) {
        h3.x0 x0Var = new h3.x0();
        o8.x xVar = o8.z.b;
        o8.l0 l0Var = o8.l0.e;
        List list = Collections.EMPTY_LIST;
        o8.l0 l0Var2 = o8.l0.e;
        h3.d1 d1Var = h3.d1.c;
        h3.c1 c1Var = uri != null ? new h3.c1(uri, null, null, list, null, l0Var2, null) : null;
        h3.f1 f1Var = new h3.f1("", new h3.z0(x0Var), c1Var, new h3.b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), h3.h1.U, d1Var);
        if (j10 != 0) {
            d3.e eVar = new d3.e(this, j10, 7);
            gh.i3 i3Var = new gh.i3(new m3.i(), 27);
            v9.d dVar = new v9.d(4);
            c1Var.getClass();
            h3.c1 c1Var2 = f1Var.b;
            c1Var2.getClass();
            c1Var2.getClass();
            return new j4.u0(f1Var, eVar, i3Var, l3.i.p, dVar, 1048576);
        }
        str.getClass();
        boolean equals = str.equals("hls");
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        if (equals) {
            if (this.U == null) {
                this.U = new j4.c0(extendedDefaultDataSourceFactory) { // from class: com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory
                    public final e0 a;
                    public final a f = new a();
                    public final b c = new b(20);
                    public final fk0 d = c.A;
                    public final o4.c b = j.a;
                    public final d g = new d(4);
                    public final za.a e = new za.a(10);
                    public final int i = 1;
                    public final long j = -9223372036854775807L;
                    public final boolean h = true;

                    {
                        this.a = new e0(extendedDefaultDataSourceFactory, 4);
                    }

                    @Override // j4.c0
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final m a(f1 f1Var2) {
                        f1Var2.b.getClass();
                        List list2 = f1Var2.b.c;
                        boolean isEmpty = list2.isEmpty();
                        q qVar = this.c;
                        if (!isEmpty) {
                            qVar = new e3(qVar, list2, false, 13);
                        }
                        i b10 = this.f.b(f1Var2);
                        this.d.getClass();
                        e0 e0Var = this.a;
                        d dVar2 = this.g;
                        return new m(f1Var2, e0Var, this.b, this.e, b10, dVar2, new c(e0Var, dVar2, qVar), this.j, this.h, this.i);
                    }
                };
            }
            return a(f1Var);
        }
        if (str.equals("dash")) {
            if (this.T == null) {
                this.T = new j4.c0(extendedDefaultDataSourceFactory) { // from class: com.google.android.exoplayer2.source.dash.DashMediaSource$Factory
                    public final android.support.v4.media.c a;
                    public final l b;
                    public final a c = new a();
                    public final d e = new d(4);
                    public final long f = 30000;
                    public final za.a d = new za.a(10);

                    {
                        this.a = new android.support.v4.media.c(extendedDefaultDataSourceFactory, 28);
                        this.b = extendedDefaultDataSourceFactory;
                    }

                    @Override // j4.c0
                    public final j4.a a(f1 f1Var2) {
                        f1Var2.b.getClass();
                        s0 eVar2 = new e();
                        List list2 = f1Var2.b.c;
                        return new g(f1Var2, this.b, !list2.isEmpty() ? new g5.b(9, eVar2, list2) : eVar2, this.a, this.d, this.c.b(f1Var2), this.e, this.f);
                    }
                };
            }
            return a(f1Var);
        }
        if (this.V == null) {
            this.V = new j4.t0(extendedDefaultDataSourceFactory, new m3.i());
        }
        return this.V.a(f1Var);
    }

    public void C() {
        this.E = false;
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.o(false);
        }
        h3.k2 k2Var = this.e;
        if (k2Var != null) {
            k2Var.o(false);
        }
        if (this.G != null) {
            this.W.removeCallbacksAndMessages(null);
            this.G.onVisualizerUpdate(false, true, null);
        }
    }

    public void D() {
        this.E = true;
        if (!this.x || (this.D && this.C)) {
            h3.k0 k0Var = this.d;
            if (k0Var != null) {
                k0Var.o(true);
            }
            h3.k2 k2Var = this.e;
            if (k2Var != null) {
                k2Var.o(true);
                return;
            }
            return;
        }
        h3.k0 k0Var2 = this.d;
        if (k0Var2 != null) {
            k0Var2.o(false);
        }
        h3.k2 k2Var2 = this.e;
        if (k2Var2 != null) {
            k2Var2.o(false);
        }
    }

    public final void E(Uri uri, String str) {
        F(uri, str, 0L);
    }

    public final void F(Uri uri, String str, long j10) {
        this.J = null;
        this.K = null;
        this.M = uri;
        this.O = str;
        this.N = null;
        this.P = null;
        boolean z10 = false;
        this.Q = false;
        this.Y = false;
        this.a0 = false;
        this.C = false;
        this.x = false;
        this.B = uri;
        String scheme = uri != null ? uri.getScheme() : null;
        if (scheme != null && !scheme.startsWith("file")) {
            z10 = true;
        }
        this.v = z10;
        j();
        this.d.e0(B(uri, str, j10), true);
        this.d.a();
    }

    public final void G(ArrayList arrayList, g61 g61Var) {
        ArrayList arrayList2;
        this.J = arrayList;
        this.K = g61Var;
        this.M = null;
        this.O = "hls";
        this.N = null;
        this.P = null;
        this.Q = false;
        this.Y = false;
        this.C = false;
        this.x = false;
        this.B = null;
        this.v = true;
        j();
        this.a0 = false;
        this.Z = (g61Var == null || (arrayList2 = this.J) == null) ? -1 : arrayList2.indexOf(g61Var);
        S(true, g61Var);
        if (this.Y) {
            this.Z = -1;
        }
    }

    public final void H(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        j4.t tVar = null;
        this.J = null;
        this.K = null;
        this.M = uri;
        this.N = uri2;
        this.O = str;
        this.P = str2;
        this.Q = true;
        this.a0 = false;
        this.x = true;
        this.D = false;
        this.C = false;
        j();
        j4.t tVar2 = null;
        for (int i9 = 0; i9 < 2; i9++) {
            if (i9 == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            j4.t tVar3 = new j4.t(B(uri3, str3, 0L));
            if (i9 == 0) {
                tVar = tVar3;
            } else {
                tVar2 = tVar3;
            }
        }
        this.d.e0(tVar, true);
        this.d.a();
        h3.k2 k2Var = this.e;
        k2Var.Q();
        k2Var.b.e0(tVar2, true);
        this.e.a();
        g0.add(Integer.valueOf(this.a));
    }

    public final void I() {
        g0.remove(Integer.valueOf(this.a));
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.N();
            this.d = null;
        }
        h3.k2 k2Var = this.e;
        if (k2Var != null) {
            k2Var.N();
            this.e = null;
        }
        if (this.S) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    public void L(long j10) {
        M(j10, false);
    }

    public final void M(long j10, boolean z10) {
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.f0(z10 ? h3.j2.d : h3.j2.c);
            this.d.P(5, j10);
        }
    }

    public final void N(long j10, boolean z10, Runnable runnable) {
        if (this.d != null) {
            if (runnable != null) {
                this.e0.add(runnable);
            }
            this.d.f0(z10 ? h3.j2.d : h3.j2.c);
            this.d.P(5, j10);
        }
    }

    public final void O(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            h3.k0 k0Var = this.d;
            if (k0Var != null) {
                k0Var.e(z10 ? 2 : 0);
            }
        }
    }

    public final void P(boolean z10) {
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.k0(z10 ? 0.0f : 1.0f);
        }
        h3.k2 k2Var = this.e;
        if (k2Var != null) {
            k2Var.R(z10 ? 0.0f : 1.0f);
        }
    }

    public void Q(boolean z10) {
        this.E = z10;
        if (z10 && this.x && (!this.D || !this.C)) {
            h3.k0 k0Var = this.d;
            if (k0Var != null) {
                k0Var.o(false);
            }
            h3.k2 k2Var = this.e;
            if (k2Var != null) {
                k2Var.o(false);
                return;
            }
            return;
        }
        this.w = z10;
        h3.k0 k0Var2 = this.d;
        if (k0Var2 != null) {
            k0Var2.o(z10);
        }
        h3.k2 k2Var2 = this.e;
        if (k2Var2 != null) {
            k2Var2.o(z10);
        }
    }

    public void R(float f10) {
        try {
            h3.k0 k0Var = this.d;
            if (k0Var != null) {
                k0Var.setPlaybackParameters(new h3.x1(f10, f10 > 1.0f ? 0.98f : 1.0f));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(boolean z10, g61 g61Var) {
        boolean z11;
        int i9;
        boolean z12;
        int i10;
        int i11;
        b5.x xVar;
        int i12;
        g61 g61Var2;
        h3.k0 k0Var = this.d;
        if (k0Var == null) {
            return;
        }
        boolean K = k0Var.K();
        long D = this.d.D();
        if (!z10) {
            this.c0 = D;
            this.b0 = this.d.getDuration();
        }
        this.K = g61Var;
        b5.r rVar = this.f;
        int i13 = 0;
        if (g61Var == null) {
            Uri A = A(this.J);
            int i14 = 0;
            while (true) {
                if (i14 >= u()) {
                    g61Var2 = null;
                    break;
                }
                g61 v = v(i14);
                if (v.a) {
                    g61Var2 = v;
                    break;
                }
                i14++;
            }
            if (g61Var2 != null) {
                ArrayList arrayList = g61Var2.d;
                if (arrayList.size() == 1 && ((i61) arrayList.get(0)).b()) {
                    this.a0 = false;
                    this.Y = true;
                    this.K = g61Var2;
                    this.d.e0(B(g61Var2.a().d, "other", 0L), false);
                    i13 = 1;
                    z11 = K;
                }
            }
            if (A != null) {
                this.Y = false;
                b5.j e10 = rVar.e();
                e10.getClass();
                b5.i iVar = new b5.i(e10);
                iVar.c();
                rVar.j(new b5.j(iVar));
                if (!this.a0) {
                    this.a0 = true;
                    this.d.e0(B(A, "hls", 0L), false);
                }
                z11 = K;
            } else {
                g61 s10 = s(Boolean.TRUE);
                if (s10 == null) {
                    s10 = s(Boolean.FALSE);
                }
                if (s10 == null || s10.d.isEmpty()) {
                    return;
                }
                this.a0 = false;
                this.K = s10;
                this.Y = s10.a;
                this.d.e0(B(s10.a().d, "other", 0L), false);
            }
            i13 = 1;
            z11 = K;
        } else {
            ArrayList arrayList2 = g61Var.d;
            this.Y = false;
            if (arrayList2.isEmpty()) {
                return;
            }
            Uri A2 = arrayList2.size() > 1 ? A(this.J) : null;
            if (A2 == null || arrayList2.size() == 1 || rVar.c == null) {
                z11 = K;
                this.a0 = false;
                this.d.e0(B(g61Var.a().d, "other", 0L), false);
                i13 = 1;
            } else {
                if (this.a0) {
                    i9 = 0;
                } else {
                    this.a0 = true;
                    this.d.e0(B(A2, "hls", 0L), false);
                    i9 = 1;
                }
                b5.j e11 = rVar.e();
                e11.getClass();
                b5.i iVar2 = new b5.i(e11);
                iVar2.c();
                int size = arrayList2.size();
                int i15 = 0;
                while (i15 < size) {
                    int i16 = i15 + 1;
                    i61 i61Var = (i61) arrayList2.get(i15);
                    try {
                        int indexOf = this.L.indexOf(i61Var);
                        b5.v vVar = rVar.c;
                        int i17 = 0;
                        while (i17 < vVar.a) {
                            j4.j1 j1Var = vVar.c[i17];
                            z12 = K;
                            while (i13 < j1Var.a) {
                                try {
                                    j4.i1 a2 = j1Var.a(i13);
                                    i10 = i9;
                                    i11 = size;
                                    int i18 = 0;
                                    while (i18 < a2.a) {
                                        try {
                                            h3.t0 t0Var = a2.d[i18];
                                            int i19 = i17;
                                            try {
                                                i12 = Integer.parseInt(t0Var.a);
                                            } catch (Exception unused) {
                                                i12 = -1;
                                            }
                                            if (i12 >= 0 && indexOf == i12) {
                                                xVar = new b5.x(a2, i18);
                                                break;
                                            }
                                            int i20 = indexOf;
                                            if (t0Var.G == i61Var.i && t0Var.H == i61Var.j) {
                                                xVar = new b5.x(a2, i18);
                                                break;
                                            } else {
                                                i18++;
                                                i17 = i19;
                                                indexOf = i20;
                                            }
                                        } catch (Exception e12) {
                                            e = e12;
                                            FileLog.e(e);
                                            xVar = null;
                                            if (xVar != null) {
                                            }
                                            i9 = i10;
                                            i15 = i16;
                                            K = z12;
                                            size = i11;
                                            i13 = 0;
                                        }
                                    }
                                    i13++;
                                    i9 = i10;
                                    size = i11;
                                } catch (Exception e13) {
                                    e = e13;
                                    i10 = i9;
                                    i11 = size;
                                    FileLog.e(e);
                                    xVar = null;
                                    if (xVar != null) {
                                    }
                                    i9 = i10;
                                    i15 = i16;
                                    K = z12;
                                    size = i11;
                                    i13 = 0;
                                }
                            }
                            i17++;
                            K = z12;
                            i13 = 0;
                        }
                        z12 = K;
                        i10 = i9;
                        i11 = size;
                    } catch (Exception e14) {
                        e = e14;
                        z12 = K;
                    }
                    xVar = null;
                    if (xVar != null) {
                        iVar2.y.put(xVar.a, xVar);
                    }
                    i9 = i10;
                    i15 = i16;
                    K = z12;
                    size = i11;
                    i13 = 0;
                }
                z11 = K;
                rVar.j(new b5.j(iVar2));
                i13 = i9;
            }
        }
        if (i13 != 0) {
            this.d.a();
            if (!z10) {
                this.d.P(5, D);
                if (z11) {
                    this.d.o(true);
                }
            }
            org.telegram.ui.gq0 gq0Var = this.d0;
            if (gq0Var != null) {
                AndroidUtilities.runOnUIThread(gq0Var);
            }
            g0.add(Integer.valueOf(this.a));
        }
    }

    public final void T(int i9) {
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.d0(new j3.e(0, 0, i9 == 0 ? 2 : 1, 1, 0), false);
        }
        h3.k2 k2Var = this.e;
        if (k2Var != null) {
            j3.e eVar = new j3.e(0, 0, i9 == 0 ? 2 : 1, 1, 0);
            k2Var.Q();
            k2Var.b.d0(eVar, true);
        }
    }

    public final void U(Surface surface) {
        if (this.s == surface) {
            return;
        }
        this.s = surface;
        h3.k0 k0Var = this.d;
        if (k0Var == null) {
            return;
        }
        k0Var.h0(surface);
    }

    public final void V(SurfaceView surfaceView) {
        if (this.r == surfaceView) {
            return;
        }
        this.r = surfaceView;
        h3.k0 k0Var = this.d;
        if (k0Var == null) {
            return;
        }
        k0Var.i0(surfaceView);
    }

    public final void W(TextureView textureView) {
        if (this.n == textureView) {
            return;
        }
        this.n = textureView;
        h3.k0 k0Var = this.d;
        if (k0Var == null) {
            return;
        }
        k0Var.j0(textureView);
    }

    public final void X(float f10) {
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.k0(f10);
        }
        h3.k2 k2Var = this.e;
        if (k2Var != null) {
            k2Var.R(f10);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 != NotificationCenter.playerDidStartPlaying || ((k61) objArr[0]) == this || !z() || this.y) {
            return;
        }
        C();
    }

    @Override // i3.b
    public final void f(i3.a aVar) {
        h61 h61Var = this.F;
        if (h61Var != null) {
            h61Var.onSeekFinished(aVar);
        }
        ArrayList arrayList = this.e0;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((Runnable) obj).run();
        }
        arrayList.clear();
    }

    public final void j() {
        h3.j jVar = this.c ? new h3.j(new com.google.android.exoplayer2.upstream.r(), MediaDataController.MAX_STYLE_RUNS_COUNT, MediaDataController.MAX_STYLE_RUNS_COUNT) : new h3.j(new com.google.android.exoplayer2.upstream.r(), 100, 5000);
        if (this.d == null) {
            h3.l e61Var = this.G != null ? new e61(ApplicationLoader.applicationContext, this) : new h3.l(ApplicationLoader.applicationContext);
            e61Var.c = 2;
            h3.r rVar = new h3.r(ApplicationLoader.applicationContext);
            d5.a.i(!rVar.s);
            rVar.c = new h3.o(e61Var, 2);
            b5.r rVar2 = this.f;
            d5.a.i(!rVar.s);
            rVar2.getClass();
            rVar.e = new h3.o(rVar2, 1);
            d5.a.i(!rVar.s);
            rVar.f = new h3.o(jVar, 0);
            d5.a.i(!rVar.s);
            rVar.s = true;
            h3.k0 k0Var = new h3.k0(rVar, null);
            this.d = k0Var;
            i3.f fVar = k0Var.r;
            fVar.getClass();
            fVar.f.a(this);
            this.d.l.a(this);
            this.d.m0.add(this);
            TextureView textureView = this.n;
            if (textureView != null) {
                this.d.j0(textureView);
            } else {
                Surface surface = this.s;
                if (surface != null) {
                    this.d.h0(surface);
                } else {
                    SurfaceView surfaceView = this.r;
                    if (surfaceView != null) {
                        this.d.i0(surfaceView);
                    }
                }
            }
            this.d.o(this.w);
            this.d.e(this.R ? 2 : 0);
        }
        if (this.x && this.e == null) {
            h3.r rVar3 = new h3.r(ApplicationLoader.applicationContext);
            b5.r rVar4 = this.f;
            d5.a.i(!rVar3.s);
            rVar4.getClass();
            rVar3.e = new h3.o(rVar4, 1);
            d5.a.i(!rVar3.s);
            rVar3.f = new h3.o(jVar, 0);
            d5.a.i(!rVar3.s);
            rVar3.s = true;
            h3.k2 k2Var = new h3.k2(rVar3);
            this.e = k2Var;
            k2Var.k(new c61(this));
            this.e.o(this.w);
        }
    }

    public final long k() {
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            return this.v ? k0Var.t() : k0Var.getDuration();
        }
        return 0L;
    }

    public final we.g m(String str, String str2, String str3) {
        if (this.J == null) {
            if (this.M == null) {
                return null;
            }
            String d = ta.b.d("/mtproto_", str);
            String queryParameter = this.M.getQueryParameter("mime");
            f2.g1 g1Var = new f2.g1(this.M, TextUtils.isEmpty(queryParameter) ? "video/mp4" : queryParameter, d);
            g1Var.g = str2;
            g1Var.h = str3;
            return new we.g(new we.f(g1Var));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.J;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            ArrayList arrayList3 = ((g61) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                i61 i61Var = (i61) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(i61Var.c);
                String sb3 = sb2.toString();
                TLRPC.Document document = i61Var.g;
                String str4 = document != null ? document.mime_type : null;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                f2.g1 g1Var2 = new f2.g1(i61Var.d, str4, sb3);
                g1Var2.g = str2;
                g1Var2.h = str3;
                int i11 = i61Var.i;
                int i12 = i61Var.j;
                g1Var2.a = i11;
                g1Var2.b = i12;
                arrayList.add(new we.f(g1Var2));
                arrayList2 = arrayList4;
            }
        }
        return new we.g(arrayList);
    }

    public final TLRPC.Document n() {
        ArrayList arrayList;
        h3.k0 k0Var = this.d;
        if (k0Var == null) {
            return null;
        }
        k0Var.q0();
        h3.t0 t0Var = k0Var.P;
        if (t0Var == null || t0Var.w == 0 || (arrayList = this.J) == null) {
            return null;
        }
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ArrayList arrayList2 = ((g61) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                i61 i61Var = (i61) obj2;
                if (i61Var.c == t0Var.w) {
                    return i61Var.g;
                }
            }
        }
        return null;
    }

    public final long o() {
        long j10 = this.c0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            return k0Var.D();
        }
        return 0L;
    }

    @Override // h3.a2
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // h3.a2
    public final void onPlayerError(h3.v1 v1Var) {
        AndroidUtilities.runOnUIThread(new jg0(28, this, v1Var));
    }

    @Override // h3.a2
    public final void onPlayerStateChanged(boolean z10, int i9) {
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            boolean h = k0Var.h();
            int b10 = this.d.b();
            if (this.I != h || this.H != b10) {
                this.F.onStateChanged(h, b10);
                this.I = h;
                this.H = b10;
            }
        }
        if (z10 && i9 == 3 && !y() && this.S) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.playerDidStartPlaying, this);
        }
        if (!this.C && i9 == 3) {
            this.C = true;
            if (this.D && this.E) {
                D();
            }
        }
        if (i9 != 3) {
            this.W.removeCallbacksAndMessages(null);
            d61 d61Var = this.G;
            if (d61Var != null) {
                d61Var.onVisualizerUpdate(false, true, null);
            }
        }
    }

    @Override // h3.a2
    public final /* synthetic */ void onPositionDiscontinuity(int i9) {
    }

    @Override // i3.b
    public final void onRenderedFirstFrame(i3.a aVar) {
        this.c0 = -9223372036854775807L;
        this.b0 = -9223372036854775807L;
        h61 h61Var = this.F;
        if (h61Var != null) {
            h61Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override // i3.b
    public final void onSeekStarted(i3.a aVar) {
        h61 h61Var = this.F;
        if (h61Var != null) {
            h61Var.onSeekStarted(aVar);
        }
    }

    @Override // h3.a2
    public final void onTracksChanged(h3.t2 t2Var) {
        org.telegram.ui.gq0 gq0Var = this.d0;
        if (gq0Var != null) {
            AndroidUtilities.runOnUIThread(gq0Var);
        }
    }

    @Override // h3.a2
    public final void onVideoSizeChanged(e5.z zVar) {
        this.F.onVideoSizeChanged(zVar.a, zVar.b, zVar.c, zVar.d);
    }

    public final int p() {
        if (this.Z == -1) {
            try {
                if (this.Y) {
                    for (int i9 = 0; i9 < u(); i9++) {
                        if (v(i9).a) {
                            return i9;
                        }
                    }
                }
                h3.k0 k0Var = this.d;
                if (k0Var != null) {
                    k0Var.q0();
                    h3.t0 t0Var = k0Var.P;
                    if (t0Var != null) {
                        for (int i10 = 0; i10 < u(); i10++) {
                            g61 v = v(i10);
                            if (!v.a && t0Var.G == v.b && t0Var.H == v.c && t0Var.n == ((int) Math.floor(((i61) v.d.get(0)).l * 8.0d))) {
                                return i10;
                            }
                        }
                    }
                }
                return -1;
            } catch (Exception e10) {
                FileLog.e(e10);
                return -1;
            }
        }
        return this.Z;
    }

    public final long q() {
        long j10 = this.b0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            return k0Var.getDuration();
        }
        return 0L;
    }

    public final kh.z7 r(kh.z7 z7Var) {
        if (z7Var == null) {
            z7Var = new kh.z7();
        }
        try {
            h3.k0 k0Var = this.d;
            k0Var.q0();
            MediaFormat mediaFormat = ((y3.q) k0Var.g[0]).K;
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

    public final g61 s(Boolean bool) {
        g61 g61Var = null;
        for (int i9 = 0; i9 < u(); i9++) {
            g61 v = v(i9);
            if (v.a == bool.booleanValue() && (g61Var == null || g61Var.b * g61Var.c < v.b * v.c)) {
                g61Var = v;
            }
        }
        return g61Var;
    }

    public final int u() {
        ArrayList arrayList = this.J;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final g61 v(int i9) {
        ArrayList arrayList = this.J;
        return arrayList == null ? s(Boolean.FALSE) : (i9 < 0 || i9 >= arrayList.size()) ? s(Boolean.FALSE) : (g61) this.J.get(i9);
    }

    public final boolean y() {
        h3.k0 k0Var = this.d;
        if (k0Var == null) {
            return false;
        }
        k0Var.q0();
        return k0Var.a0 == 0.0f;
    }

    public final boolean z() {
        if (this.x && this.E) {
            return true;
        }
        h3.k0 k0Var = this.d;
        return k0Var != null && k0Var.h();
    }

    public k61(boolean z10, boolean z11) {
        int i9 = f0;
        f0 = i9 + 1;
        this.a = i9;
        this.W = new Handler(Looper.getMainLooper());
        this.Y = false;
        this.Z = -1;
        this.b0 = -9223372036854775807L;
        this.c0 = -9223372036854775807L;
        this.e0 = new ArrayList();
        this.X = z11;
        this.h = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        b5.r rVar = new b5.r(ApplicationLoader.applicationContext, new wa.a(3));
        this.f = rVar;
        if (z11) {
            b5.j e10 = rVar.e();
            e10.getClass();
            b5.i iVar = new b5.i(e10);
            iVar.z.add(1);
            rVar.j(new b5.j(iVar));
        }
        this.H = 1;
        this.S = z10;
        if (z10) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    @Override // h3.a2
    public final /* synthetic */ void onCues(r4.c cVar) {
    }

    @Override // h3.a2
    public final void onPositionDiscontinuity(h3.b2 b2Var, h3.b2 b2Var2, int i9) {
    }

    @Override // h3.a2
    public void onRenderedFirstFrame() {
        this.F.onRenderedFirstFrame();
    }

    @Override // i3.b
    public final /* synthetic */ void a(h3.v1 v1Var) {
    }

    @Override // i3.b
    public final /* synthetic */ void b(j4.y yVar) {
    }

    @Override // i3.b
    public final /* synthetic */ void d(e5.z zVar) {
    }

    @Override // i3.b
    public final /* synthetic */ void e(int i9) {
    }

    @Override // i3.b
    public final /* synthetic */ void h(k3.f fVar) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onAudioAttributesChanged(j3.e eVar) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onAvailableCommandsChanged(h3.y1 y1Var) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onDeviceInfoChanged(h3.m mVar) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onIsLoadingChanged(boolean z10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onIsPlayingChanged(boolean z10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onLoadingChanged(boolean z10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onMediaMetadataChanged(h3.h1 h1Var) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onMetadata(z3.c cVar) {
    }

    @Override // h3.a2
    public final void onPlaybackParametersChanged(h3.x1 x1Var) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onPlaybackStateChanged(int i9) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i9) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onPlayerErrorChanged(h3.v1 v1Var) {
    }

    @Override // h3.a2
    public final void onRepeatModeChanged(int i9) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onSeekProcessed() {
    }

    @Override // h3.a2
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onVolumeChanged(float f10) {
    }

    @Override // i3.b
    public final /* synthetic */ void c(h3.c2 c2Var, g5.b bVar) {
    }

    @Override // i3.b
    public final /* synthetic */ void g(i3.a aVar, j4.y yVar) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onDeviceVolumeChanged(int i9, boolean z10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onEvents(h3.c2 c2Var, h3.z1 z1Var) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onMediaItemTransition(h3.f1 f1Var, int i9) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i9) {
    }

    @Override // h3.a2
    public final void onSurfaceSizeChanged(int i9, int i10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onTimelineChanged(h3.r2 r2Var, int i9) {
    }

    @Override // i3.b
    public final /* synthetic */ void i(i3.a aVar, int i9, long j10) {
    }
}
