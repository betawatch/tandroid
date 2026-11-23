package j6;

import a8.ka;
import a8.ma;
import a8.p0;
import a8.v7;
import ai.v1;
import ai.w1;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Parcel;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bi.v3;
import c8.u9;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.o0;
import e2.t0;
import h2.k0;
import h2.l0;
import hi.rb;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.a0;
import m4.b0;
import m4.d0;
import m4.f0;
import oi.e1;
import oi.f1;
import oi.h0;
import oi.i0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.jz;
import org.telegram.messenger.ke;
import org.telegram.messenger.ks;
import org.telegram.messenger.lr;
import org.telegram.messenger.lz;
import org.telegram.messenger.mi;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.vr;
import org.telegram.messenger.xs;
import org.telegram.tgnet.SerializedData;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.i4;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.no;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.bn;
import org.telegram.ui.e8;
import org.telegram.ui.ex;
import org.telegram.ui.ez0;
import org.telegram.ui.g8;
import org.telegram.ui.h5;
import org.telegram.ui.hx0;
import org.telegram.ui.i7;
import org.telegram.ui.iy0;
import org.telegram.ui.j4;
import org.telegram.ui.j8;
import org.telegram.ui.jx;
import org.telegram.ui.s6;
import org.telegram.ui.yt;
import org.telegram.ui.zt;
import org.xml.sax.Attributes;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class k implements o, v1, c4.m, a0, Continuation, com.google.android.gms.common.api.internal.q, e1, zm0, lr, no, rb, i7, tj0, f61, h2.d, q5.b, te.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ k(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    public static void R(k kVar, l2.d dVar) {
        kVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) kVar.b).entrySet()) {
            if (entry.getKey() != null) {
                throw new ClassCastException();
            }
            List list = (List) entry.getValue();
            if (!Y(dVar, list).equals(Y((l2.d) kVar.c, list))) {
                throw null;
            }
        }
        kVar.c = dVar;
    }

    public static l2.d Y(l2.d dVar, List list) {
        dVar.getClass();
        Map map = dVar.a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new l2.d(hashMap);
    }

    public static k c0(int i7, boolean z10, byte[] bArr, byte[] bArr2) {
        k kVar = new k(11, false);
        if (bArr == null || bArr.length == 0) {
            kVar.c = null;
            kVar.b = null;
            return kVar;
        }
        int i10 = z10 ? 8 : 0;
        if (i7 != 1) {
            if (i7 != 2) {
                return kVar;
            }
            SerializedData serializedData = new SerializedData();
            serializedData.writeBytes(bArr2, 0, 16);
            serializedData.writeBytes(bArr, i10, 36);
            byte[] byteArray = serializedData.toByteArray();
            Pattern pattern = Utilities.a;
            byte[] o4 = Utilities.o(byteArray.length, byteArray);
            serializedData.cleanup();
            SerializedData serializedData2 = new SerializedData();
            serializedData2.writeBytes(bArr, i10 + 40, 36);
            serializedData2.writeBytes(bArr2, 0, 16);
            byte[] o10 = Utilities.o(r9.length, serializedData2.toByteArray());
            serializedData2.cleanup();
            SerializedData serializedData3 = new SerializedData();
            serializedData3.writeBytes(o4, 0, 8);
            serializedData3.writeBytes(o10, 8, 16);
            serializedData3.writeBytes(o4, 24, 8);
            kVar.b = serializedData3.toByteArray();
            serializedData3.cleanup();
            SerializedData serializedData4 = new SerializedData();
            serializedData4.writeBytes(o10, 0, 8);
            serializedData4.writeBytes(o4, 8, 16);
            serializedData4.writeBytes(o10, 24, 8);
            kVar.c = serializedData4.toByteArray();
            serializedData4.cleanup();
            return kVar;
        }
        SerializedData serializedData5 = new SerializedData();
        serializedData5.writeBytes(bArr2);
        serializedData5.writeBytes(bArr, i10, 32);
        byte[] n10 = Utilities.n(serializedData5.toByteArray());
        serializedData5.cleanup();
        SerializedData serializedData6 = new SerializedData();
        serializedData6.writeBytes(bArr, i10 + 32, 16);
        serializedData6.writeBytes(bArr2);
        serializedData6.writeBytes(bArr, i10 + 48, 16);
        byte[] n11 = Utilities.n(serializedData6.toByteArray());
        serializedData6.cleanup();
        SerializedData serializedData7 = new SerializedData();
        serializedData7.writeBytes(bArr, i10 + 64, 32);
        serializedData7.writeBytes(bArr2);
        byte[] n12 = Utilities.n(serializedData7.toByteArray());
        serializedData7.cleanup();
        SerializedData serializedData8 = new SerializedData();
        serializedData8.writeBytes(bArr2);
        serializedData8.writeBytes(bArr, i10 + 96, 32);
        byte[] n13 = Utilities.n(serializedData8.toByteArray());
        serializedData8.cleanup();
        SerializedData serializedData9 = new SerializedData();
        serializedData9.writeBytes(n10, 0, 8);
        serializedData9.writeBytes(n11, 8, 12);
        serializedData9.writeBytes(n12, 4, 12);
        kVar.b = serializedData9.toByteArray();
        serializedData9.cleanup();
        SerializedData serializedData10 = new SerializedData();
        serializedData10.writeBytes(n10, 8, 12);
        serializedData10.writeBytes(n11, 0, 8);
        serializedData10.writeBytes(n12, 16, 4);
        serializedData10.writeBytes(n13, 0, 8);
        kVar.c = serializedData10.toByteArray();
        serializedData10.cleanup();
        return kVar;
    }

    @Override // oi.e1
    public void A(f1 f1Var) {
        ((h0) this.b).g();
    }

    @Override // j6.o
    public void C(String str, long j3, long j10, long j11) {
        o oVar = (o) this.b;
        if (oVar != null) {
            oVar.C(str, j3, j10, j11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x03a5, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0116, code lost:
    
        if (")".equals(l4.a.b(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // c4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E(byte[] bArr, int i7, int i10, c4.l lVar, h2.j jVar) {
        l4.c cVar;
        String str;
        ?? r12;
        String sb2;
        int i11;
        char c10;
        k kVar = this;
        h2.x xVar = (h2.x) kVar.b;
        xVar.L(i7 + i10, bArr);
        xVar.N(i7);
        ArrayList arrayList = new ArrayList();
        try {
            l4.i.d(xVar);
            while (!TextUtils.isEmpty(xVar.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z10 = false;
                int i12 = -1;
                int i13 = 0;
                char c11 = 65535;
                while (true) {
                    ?? r92 = 1;
                    if (c11 == 65535) {
                        i13 = xVar.b;
                        String n10 = xVar.n(StandardCharsets.UTF_8);
                        c11 = n10 == null ? (char) 0 : "STYLE".equals(n10) ? (char) 2 : n10.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        xVar.N(i13);
                        if (c11 == 0) {
                            v7.b(new h6.m(arrayList2), lVar, jVar);
                            return;
                        }
                        if (c11 == 1) {
                            while (!TextUtils.isEmpty(xVar.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str2 = null;
                            if (c11 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new IllegalArgumentException("A style block was found after the first cue.");
                                }
                                xVar.n(StandardCharsets.UTF_8);
                                l4.a aVar = (l4.a) kVar.c;
                                h2.x xVar2 = aVar.a;
                                StringBuilder sb3 = aVar.b;
                                sb3.setLength(0);
                                int i14 = xVar.b;
                                while (!TextUtils.isEmpty(xVar.n(StandardCharsets.UTF_8))) {
                                }
                                xVar2.L(xVar.b, xVar.a);
                                xVar2.N(i14);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    l4.a.c(xVar2);
                                    if (xVar2.a() >= 5 && "::cue".equals(xVar2.y(5, StandardCharsets.UTF_8))) {
                                        int i15 = xVar2.b;
                                        String b10 = l4.a.b(xVar2, sb3);
                                        if (b10 != null) {
                                            if ("{".equals(b10)) {
                                                xVar2.N(i15);
                                                str = "";
                                            } else if ("(".equals(b10)) {
                                                int i16 = xVar2.b;
                                                int i17 = xVar2.c;
                                                boolean z11 = z10 ? 1 : 0;
                                                while (i16 < i17 && z11 == 0) {
                                                    int i18 = i16 + 1;
                                                    z11 = ((char) xVar2.a[i16]) == ')' ? r92 : z10 ? 1 : 0;
                                                    i16 = i18;
                                                }
                                                str = xVar2.y((i16 - 1) - xVar2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                str = str2;
                                            }
                                            if (str == null && "{".equals(l4.a.b(xVar2, sb3))) {
                                                l4.b bVar = new l4.b();
                                                bVar.a = "";
                                                bVar.b = "";
                                                bVar.c = Collections.EMPTY_SET;
                                                bVar.d = "";
                                                bVar.e = str2;
                                                bVar.g = z10;
                                                bVar.i = z10;
                                                bVar.j = i12;
                                                bVar.k = i12;
                                                bVar.l = i12;
                                                bVar.m = i12;
                                                bVar.n = i12;
                                                bVar.p = i12;
                                                bVar.q = z10;
                                                if (!str.isEmpty()) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i12) {
                                                        ?? matcher = l4.a.c.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(r92);
                                                            group.getClass();
                                                            bVar.d = group;
                                                        }
                                                        str = str.substring(z10 ? 1 : 0, indexOf);
                                                    }
                                                    String str3 = l0.a;
                                                    String[] split = str.split("\\.", i12);
                                                    String str4 = split[z10 ? 1 : 0];
                                                    int indexOf2 = str4.indexOf(35);
                                                    if (indexOf2 != i12) {
                                                        bVar.b = str4.substring(z10 ? 1 : 0, indexOf2);
                                                        bVar.a = str4.substring(indexOf2 + 1);
                                                    } else {
                                                        bVar.b = str4;
                                                    }
                                                    if (split.length > r92) {
                                                        int length = split.length;
                                                        ma.f(length <= split.length ? r92 : z10 ? 1 : 0);
                                                        bVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, (int) r92, length)));
                                                    }
                                                }
                                                boolean z12 = z10 ? 1 : 0;
                                                String str5 = str2;
                                                boolean z13 = r92;
                                                while (z12 == 0) {
                                                    int i19 = xVar2.b;
                                                    str5 = l4.a.b(xVar2, sb3);
                                                    boolean z14 = (str5 == null || "}".equals(str5)) ? z13 : z10;
                                                    if (z14 == 0) {
                                                        xVar2.N(i19);
                                                        l4.a.c(xVar2);
                                                        String a10 = l4.a.a(xVar2, sb3);
                                                        if (!a10.isEmpty() && ":".equals(l4.a.b(xVar2, sb3))) {
                                                            l4.a.c(xVar2);
                                                            StringBuilder sb4 = new StringBuilder();
                                                            boolean z15 = false;
                                                            while (true) {
                                                                if (z15) {
                                                                    sb2 = sb4.toString();
                                                                } else {
                                                                    int i20 = xVar2.b;
                                                                    String b11 = l4.a.b(xVar2, sb3);
                                                                    if (b11 == null) {
                                                                        sb2 = null;
                                                                    } else if ("}".equals(b11) || ";".equals(b11)) {
                                                                        xVar2.N(i20);
                                                                        z15 = true;
                                                                    } else {
                                                                        sb4.append(b11);
                                                                    }
                                                                }
                                                            }
                                                            if (sb2 != null && !sb2.isEmpty()) {
                                                                int i21 = xVar2.b;
                                                                String b12 = l4.a.b(xVar2, sb3);
                                                                if (!";".equals(b12)) {
                                                                    if ("}".equals(b12)) {
                                                                        xVar2.N(i21);
                                                                    }
                                                                }
                                                                if ("color".equals(a10)) {
                                                                    i11 = 1;
                                                                    bVar.f = h2.h.a(sb2, true);
                                                                    bVar.g = true;
                                                                } else {
                                                                    i11 = 1;
                                                                    if ("background-color".equals(a10)) {
                                                                        bVar.h = h2.h.a(sb2, true);
                                                                        bVar.i = true;
                                                                    } else {
                                                                        if ("ruby-position".equals(a10)) {
                                                                            if ("over".equals(sb2)) {
                                                                                bVar.p = 1;
                                                                            } else if ("under".equals(sb2)) {
                                                                                bVar.p = 2;
                                                                                r12 = 1;
                                                                                z13 = r12;
                                                                                z12 = z14;
                                                                                z10 = false;
                                                                            }
                                                                        } else if ("text-combine-upright".equals(a10)) {
                                                                            bVar.q = "all".equals(sb2) || sb2.startsWith("digits");
                                                                        } else if ("text-decoration".equals(a10)) {
                                                                            if ("underline".equals(sb2)) {
                                                                                i11 = 1;
                                                                                bVar.k = 1;
                                                                            }
                                                                        } else if ("font-family".equals(a10)) {
                                                                            bVar.e = ka.c(sb2);
                                                                        } else if (!"font-weight".equals(a10)) {
                                                                            i11 = 1;
                                                                            if ("font-style".equals(a10)) {
                                                                                if ("italic".equals(sb2)) {
                                                                                    bVar.m = 1;
                                                                                }
                                                                            } else if ("font-size".equals(a10)) {
                                                                                ?? matcher2 = l4.a.d.matcher(ka.c(sb2));
                                                                                if (matcher2.matches()) {
                                                                                    String group2 = matcher2.group(2);
                                                                                    group2.getClass();
                                                                                    switch (group2.hashCode()) {
                                                                                        case 37:
                                                                                            if (group2.equals("%")) {
                                                                                                c10 = 0;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3240:
                                                                                            if (group2.equals("em")) {
                                                                                                c10 = 1;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3592:
                                                                                            if (group2.equals("px")) {
                                                                                                c10 = 2;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    c10 = 65535;
                                                                                    switch (c10) {
                                                                                        case 0:
                                                                                            r12 = 1;
                                                                                            bVar.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            r12 = 1;
                                                                                            bVar.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            r12 = 1;
                                                                                            bVar.n = 1;
                                                                                            break;
                                                                                        default:
                                                                                            throw new IllegalStateException();
                                                                                    }
                                                                                    String group3 = matcher2.group(r12);
                                                                                    group3.getClass();
                                                                                    bVar.o = Float.parseFloat(group3);
                                                                                    z13 = r12;
                                                                                    z12 = z14;
                                                                                    z10 = false;
                                                                                } else {
                                                                                    h2.a.l("WebvttCssParser", "Invalid font-size: '" + sb2 + "'.");
                                                                                }
                                                                            }
                                                                        } else if ("bold".equals(sb2)) {
                                                                            i11 = 1;
                                                                            bVar.l = 1;
                                                                        }
                                                                        z13 = r12;
                                                                        z12 = z14;
                                                                        z10 = false;
                                                                    }
                                                                }
                                                                r12 = i11;
                                                                z13 = r12;
                                                                z12 = z14;
                                                                z10 = false;
                                                            }
                                                            r12 = 1;
                                                            z13 = r12;
                                                            z12 = z14;
                                                            z10 = false;
                                                        }
                                                    }
                                                    r12 = z13;
                                                    z13 = r12;
                                                    z12 = z14;
                                                    z10 = false;
                                                }
                                                boolean z16 = z13;
                                                if ("}".equals(str5)) {
                                                    arrayList3.add(bVar);
                                                }
                                                r92 = z16;
                                                z10 = false;
                                                i12 = -1;
                                                str2 = null;
                                            }
                                        }
                                    }
                                    str = str2;
                                    if (str == null) {
                                    }
                                }
                            } else if (c11 == 3) {
                                Pattern pattern = l4.h.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String n11 = xVar.n(charset);
                                if (n11 == null) {
                                    cVar = null;
                                } else {
                                    Pattern pattern2 = l4.h.a;
                                    Matcher matcher3 = pattern2.matcher(n11);
                                    if (matcher3.matches()) {
                                        cVar = l4.h.d(null, matcher3, xVar, arrayList);
                                    } else {
                                        cVar = null;
                                        String n12 = xVar.n(charset);
                                        if (n12 != null) {
                                            Matcher matcher4 = pattern2.matcher(n12);
                                            if (matcher4.matches()) {
                                                cVar = l4.h.d(n11.trim(), matcher4, xVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (cVar != null) {
                                    arrayList2.add(cVar);
                                }
                            }
                            kVar = this;
                        }
                    }
                }
            }
        } catch (t0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // te.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void G(float f10, int i7) {
        boolean z10;
        rh.h hVar = (rh.h) this.c;
        boolean z11 = true;
        if ((hVar.c() == 0.0f && hVar.s == 2) || hVar.s == 3) {
            hVar.s = 1;
            z10 = true;
        } else {
            z10 = false;
        }
        if (f10 == 1.0f) {
            int i10 = hVar.x;
            int i11 = hVar.w;
            if (i10 != i11) {
                hVar.x = i11;
                if (z11) {
                    ((Runnable) this.b).run();
                }
                hVar.a();
            }
        }
        z11 = z10;
        if (z11) {
        }
        hVar.a();
    }

    @Override // h2.d
    public m9.y I(o0 o0Var) {
        m9.y I = ((h2.d) this.b).I(o0Var);
        if (I == null) {
            return null;
        }
        return u9.c(I, new org.telegram.tgnet.g(this, 20));
    }

    @Override // org.telegram.ui.Components.no
    public void J() {
        int i7;
        ((x60) this.b).v();
        bn bnVar = (bn) this.c;
        i7 = ((g2) bnVar).currentAccount;
        SharedPreferences sharedPreferences = mp.u1(i7).g7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + xs.v(bnVar.l6, bnVar.b(), false), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + xs.v(bnVar.l6, bnVar.b(), false), z11).apply();
        if (kc.a(bnVar)) {
            kc.S(z10 ? 1 : 0, bnVar, bnVar.getResourceProvider()).j();
        }
        bnVar.yd(false);
    }

    @Override // te.b
    public void K(int i7, float f10, float f11, te.c cVar) {
        rh.h hVar = (rh.h) this.c;
        hVar.c.a(f10);
        hVar.d.a(f10);
        hVar.b.a(f10);
        ((Runnable) this.b).run();
    }

    @Override // ai.v1
    public void M(int i7, String str) {
        ji.n.b((ji.n) this.c, (w1) this.b, str, i7);
    }

    @Override // c4.m
    public int N() {
        return 1;
    }

    @Override // org.telegram.ui.i7
    public void O(s6 s6Var, ei.b bVar, boolean z10) {
        zt ztVar = (zt) this.c;
        yt ytVar = ztVar.T1;
        if (bVar != null) {
            ((ei.c) this.b).i(bVar);
            ztVar.a2.e();
            ei.c cVar = ztVar.c2;
            pw0[] pw0VarArr = ztVar.X1;
            d2[] d2VarArr = ztVar.Y1;
            d2 d2Var = d2VarArr[0];
            if (d2Var != null) {
                pw0 pw0Var = pw0VarArr[0];
                boolean z11 = cVar.m;
                pw0Var.c = z11;
                d2Var.c(z11, true);
            }
            d2 d2Var2 = d2VarArr[1];
            if (d2Var2 != null) {
                pw0 pw0Var2 = pw0VarArr[1];
                boolean z12 = cVar.n;
                pw0Var2.c = z12;
                d2Var2.c(z12, true);
            }
            d2 d2Var3 = d2VarArr[2];
            if (d2Var3 != null) {
                pw0 pw0Var3 = pw0VarArr[2];
                boolean z13 = cVar.o;
                pw0Var3.c = z13;
                d2Var3.c(z13, true);
            }
            d2 d2Var4 = d2VarArr[3];
            if (d2Var4 != null) {
                pw0 pw0Var4 = pw0VarArr[3];
                boolean z14 = cVar.p;
                pw0Var4.c = z14;
                d2Var4.c(z14, true);
            }
            d2 d2Var5 = d2VarArr[4];
            if (d2Var5 != null) {
                pw0 pw0Var5 = pw0VarArr[4];
                boolean z15 = cVar.q;
                pw0Var5.c = z15;
                d2Var5.c(z15, true);
            }
            ztVar.W1.a(ytVar.d(), true);
            ytVar.c(true);
        }
    }

    @Override // ai.v1
    public void P(String str) {
        w1 w1Var = (w1) this.b;
        ji.n nVar = (ji.n) this.c;
        if (w1Var == nVar.f) {
            nVar.P(str);
        }
    }

    @Override // org.telegram.ui.Components.no
    public void Q(int i7) {
        bn bnVar = (bn) this.c;
        ((x60) this.b).v();
        if (i7 != 0) {
            bnVar.getNotificationsController().H(bnVar.l6, i7, bnVar.b());
            if (kc.a(bnVar)) {
                kc.z(bnVar, 5, i7, bnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (bnVar.getMessagesController().u2(bnVar.l6, bnVar.b(), null)) {
            bnVar.Ic(true);
        }
        if (kc.a(bnVar)) {
            kc.z(bnVar, 4, i7, bnVar.getResourceProvider()).j();
        }
    }

    public void S(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.b).add(p5.c.m(str, "=", valueOf, new StringBuilder(length + 1 + valueOf.length())));
    }

    @Override // oi.e1
    public void T(CharSequence charSequence) {
        ((h0) this.b).M(charSequence);
    }

    @Override // h2.d
    public m9.y V(byte[] bArr) {
        return u9.c(((h2.d) this.b).V(bArr), new org.telegram.tgnet.g(this, 20));
    }

    public boolean W(int i7) {
        return ((e2.s) this.b).a.get(i7);
    }

    @Override // j6.o
    public void Z(String str, long j3, int i7, Object obj, long j10, long j11) {
        int i10;
        n nVar = (n) this.c;
        if (((o) this.b) != null) {
            if (i7 == 2001) {
                Object[] objArr = {Integer.valueOf(nVar.i)};
                b bVar = nVar.a;
                Log.w(bVar.a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((h6.h) nVar.h.b).i.iterator();
                while (it.hasNext()) {
                    ((h6.g) it.next()).o();
                }
                i10 = 2001;
            } else {
                i10 = i7;
            }
            ((o) this.b).Z(str, j3, i10, obj, j10, j11);
        }
    }

    @Override // ai.v1
    public void a(String str, String str2) {
        ji.n nVar = (ji.n) this.c;
        w1 w1Var = (w1) this.b;
        if (!nVar.J) {
            if (w1Var == nVar.f) {
                nVar.a(str, str2);
                return;
            }
            return;
        }
        if (w1Var == nVar.U) {
            nVar.U = null;
            if (!str.isEmpty()) {
                nVar.t(w1Var, str);
            }
            nVar.e();
            Log.d("VoiceLive", "field: final words in (" + nVar.L.size() + " words)");
            nVar.m();
            return;
        }
        if (w1Var != nVar.f) {
            return;
        }
        Log.d("VoiceLive", "field: recogniser ended by itself error=" + str2);
        if (!str.isEmpty()) {
            nVar.t(w1Var, str);
        }
        nVar.f = null;
        if (vr.k == nVar) {
            vr.k = null;
        }
        nVar.d = null;
        nVar.e = null;
        nVar.e();
        nVar.m();
    }

    @Override // org.telegram.ui.Components.zm0
    public /* synthetic */ int a0() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        int i7;
        o7.d dVar = (o7.d) this.b;
        o7.b bVar = (o7.b) obj;
        e7.b bVar2 = new e7.b(dVar, (TaskCompletionSource) obj2);
        Context context = dVar.a;
        try {
            i7 = z6.b.a(context).c(0, context.getPackageName()).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i7 = 0;
        }
        m6.b bVar3 = (m6.b) this.c;
        bVar3.f = i7;
        o7.c cVar = (o7.c) bVar.n();
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), true);
        gVar.c = false;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        int i10 = o7.a.a;
        obtain.writeStrongBinder(bVar2);
        obtain.writeInt(1);
        bVar3.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        gVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // m4.a0
    public void c(h2.x xVar) {
        d0 d0Var = (d0) this.c;
        SparseArray sparseArray = d0Var.h;
        d4.f fVar = (d4.f) this.b;
        if (xVar.A() == 0 && (xVar.A() & 128) != 0) {
            xVar.O(6);
            int a10 = xVar.a() / 4;
            for (int i7 = 0; i7 < a10; i7++) {
                xVar.k(0, 4, (byte[]) fVar.b);
                fVar.J(0);
                int j3 = fVar.j(16);
                fVar.L(3);
                if (j3 == 0) {
                    fVar.L(13);
                } else {
                    int j10 = fVar.j(13);
                    if (sparseArray.get(j10) == null) {
                        sparseArray.put(j10, new b0(new a4.k(d0Var, j10)));
                        d0Var.n++;
                    }
                }
            }
            if (d0Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // oi.e1
    public void d(f1 f1Var) {
        ((h0) this.b).d(f1Var);
    }

    @Override // org.telegram.ui.Components.no
    public void dismiss() {
        switch (this.a) {
            case 15:
                ((x60) this.b).v();
                break;
            default:
                ((zt) this.c).dismiss();
                break;
        }
    }

    @Override // oi.e1
    public void e0(f1 f1Var, int i7, int i10) {
        i9 K;
        h0 h0Var = (h0) this.b;
        if (((i0) this.c).d || i7 == i10 || (K = h0Var.K()) == null) {
            return;
        }
        if (K.x() && K.W == h0Var.P()) {
            return;
        }
        f1Var.post(new v3(this, f1Var, i10, K, h0Var, i7));
    }

    @Override // ai.v1
    public void f(float f10) {
        w1 w1Var = (w1) this.b;
        ji.n nVar = (ji.n) this.c;
        if (w1Var == nVar.f) {
            nVar.f(f10);
        }
    }

    public String f0(String str) {
        ArrayList arrayList = (ArrayList) this.b;
        String str2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                str2 = (String) ((jz) arrayList.get(i7)).a.get(str);
                if (str2 != null) {
                    break;
                }
            }
        }
        return str2 == null ? lz.l(str, (Attributes) this.c) : str2;
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean g(float f10, float f11, int i7, View view) {
        Rect rect = (Rect) this.b;
        jx jxVar = (jx) this.c;
        int i10 = 0;
        if (jxVar.getParentActivity() != null && (view instanceof i4)) {
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jxVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{gd.N0(2131751586, null)}, new ex(this, i7, i10));
                jxVar.showDialog(alertDialog$Builder.a);
                return true;
            }
        }
        return false;
    }

    @Override // oi.e1
    public void g0(Editable editable) {
        ((i0) this.c).i();
        ((h0) this.b).h0();
    }

    @Override // fd.a
    public Object get() {
        return new p5.e((Context) ((i5) this.b).a, (i61) ((aa) this.c).get());
    }

    @Override // org.telegram.ui.Components.zm0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
    
        if (r5.equals("red") == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer h0(String str) {
        String f02 = f0(str);
        if (f02 == null) {
            return null;
        }
        char c10 = 1;
        try {
            return Integer.valueOf(Integer.parseInt(f02.substring(1), 16));
        } catch (NumberFormatException unused) {
            double[] dArr = lz.a;
            String lowerCase = f02.toLowerCase();
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case -734239628:
                    if (lowerCase.equals("yellow")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 112785:
                    break;
                case 3027034:
                    if (lowerCase.equals("blue")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3068707:
                    if (lowerCase.equals("cyan")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3181155:
                    if (lowerCase.equals("gray")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 93818879:
                    if (lowerCase.equals("black")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 98619139:
                    if (lowerCase.equals("green")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 113101865:
                    if (lowerCase.equals("white")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 828922025:
                    if (lowerCase.equals("magenta")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    return -256;
                case 1:
                    return -65536;
                case 2:
                    return -16776961;
                case 3:
                    return -16711681;
                case 4:
                    return -7829368;
                case 5:
                    return -16777216;
                case 6:
                    return -16711936;
                case 7:
                    return -1;
                case '\b':
                    return -65281;
                default:
                    return null;
            }
        }
    }

    @Override // oi.e1
    public boolean i() {
        return ((h0) this.b).W();
    }

    public boolean i0(q4.t tVar, String str) {
        Context context = (Context) this.b;
        int i7 = tVar.b;
        return i7 < 0 ? context.getPackageManager().checkPermission(str, tVar.a) == 0 : context.checkPermission(str, i7, tVar.c) == 0;
    }

    @Override // org.telegram.ui.Components.zm0
    public void j(boolean z10, float f10) {
        ((TextView) this.b).setText("Alpha " + h5.p1);
        h5.p1 = f10;
        ((h5) this.c).m1.K();
    }

    public void k0(long j3, byte[] bArr) {
        e0.g gVar = (e0.g) this.c;
        if (gVar.b) {
            gVar.b = false;
            ((yi.j) gVar.e).h();
            return;
        }
        yi.j jVar = (yi.j) gVar.e;
        jVar.getClass();
        yi.j.q();
        yi.h hVar = jVar.z;
        File file = (jVar.G != 5 || hVar == null) ? null : hVar.b;
        if (file == null) {
            ke keVar = (ke) this.b;
            IllegalStateException illegalStateException = new IllegalStateException("Preview file is unavailable");
            MediaController mediaController = keVar.a;
            String[] strArr = MediaController.W1;
            a8.e("AudioRecorderV2 failed", illegalStateException);
            ks.f(mediaController.i1).k(ks.m2, Integer.valueOf(mediaController.h1));
            mediaController.x(false);
            return;
        }
        MediaController mediaController2 = ((ke) this.b).a;
        mediaController2.k1 = file;
        mediaController2.l1 = j3;
        mediaController2.G0(file, j3, bArr);
        ri.d0(mediaController2.i1).F1(mediaController2.n1, mediaController2.o1, mi.a(mediaController2, file.getAbsolutePath(), mediaController2.K1));
        ks.f(mediaController2.i1).k(ks.o2, new Object[0]);
        ks.f(mediaController2.i1).k(ks.s2, Integer.valueOf(mediaController2.h1), mediaController2.g1, file.getAbsolutePath());
        mediaController2.Y(false);
        MediaController.j0(false);
    }

    public int l0(Context context, com.google.android.gms.common.api.c cVar) {
        q6.m.h(context);
        q6.m.h(cVar);
        int i7 = 0;
        if (!cVar.c()) {
            return 0;
        }
        int d = cVar.d();
        int q02 = q0(d);
        if (q02 != -1) {
            return q02;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            int i10 = 0;
            while (true) {
                try {
                    if (i10 >= sparseIntArray.size()) {
                        i7 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i10);
                    if (keyAt > d && sparseIntArray.get(keyAt) == 0) {
                        break;
                    }
                    i10++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (i7 == -1) {
                i7 = ((n6.e) this.c).d(context, d);
            }
            sparseIntArray.put(d, i7);
        }
        return i7;
    }

    @Override // oi.e1
    public void m(int i7, int i10) {
        ((h0) this.b).Y(i7, i10);
    }

    @Override // oi.e1
    public /* synthetic */ boolean m0(boolean z10) {
        return false;
    }

    @Override // oi.e1
    public /* synthetic */ boolean o(f1 f1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.f61
    public void onError(h61 h61Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        int i7 = secretMediaViewer.a0;
        if (i7 <= 0) {
            a8.g(exc, true);
            return;
        }
        secretMediaViewer.a0 = i7 - 1;
        g0.h3(new iy0(4, this, (File) this.b), 100L);
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public void onStateChanged(boolean z10, int i7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        ez0 ez0Var = secretMediaViewer.h1;
        if (secretMediaViewer.E == null || secretMediaViewer.g0 == null) {
            return;
        }
        g0.r(ez0Var);
        g0.g3(ez0Var);
        if (i7 == 4 || i7 == 1) {
            try {
                secretMediaViewer.b.getWindow().clearFlags(128);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        } else {
            try {
                secretMediaViewer.b.getWindow().addFlags(128);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        if (i7 == 3 && secretMediaViewer.x.getVisibility() != 0) {
            secretMediaViewer.x.setVisibility(0);
        }
        if (secretMediaViewer.E.d0() && i7 != 4) {
            if (secretMediaViewer.F) {
                return;
            }
            secretMediaViewer.F = true;
        } else if (secretMediaViewer.F) {
            secretMediaViewer.F = false;
            if (i7 == 4) {
                secretMediaViewer.I = true;
                if (secretMediaViewer.J) {
                    secretMediaViewer.e(true, !secretMediaViewer.p1);
                } else {
                    secretMediaViewer.E.q0(0L, false);
                    secretMediaViewer.E.h0();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.f61
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        j4 j4Var = ((SecretMediaViewer) this.c).x;
        if (j4Var != null) {
            j4Var.a(i10 == 0 ? 1.0f : (i7 * f10) / i10, 0);
        }
    }

    @Override // org.telegram.messenger.lr
    public void q(boolean z10) {
        g8 g8Var = ((e8) this.c).b;
        g8Var.y.finishFragment();
        bn bnVar = (bn) this.b;
        j8 j8Var = g8Var.y;
        bnVar.j8(j8Var.Q, j8Var.R + 86400, z10);
    }

    public int q0(int i7) {
        int i10;
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            i10 = sparseIntArray.get(i7, -1);
        }
        return i10;
    }

    @Override // ai.v1
    public void r(String str) {
        ji.n.b((ji.n) this.c, (w1) this.b, str, -1);
    }

    @Override // c4.m
    public /* synthetic */ c4.d s(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    @Override // oi.e1
    public /* synthetic */ boolean t0(f1 f1Var) {
        return false;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        m6.c cVar = (m6.c) this.b;
        Bundle bundle = (Bundle) this.c;
        cVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : cVar.d(bundle).onSuccessTask(m6.d.b, w7.s.c);
    }

    public String toString() {
        switch (this.a) {
            case 25:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    sb2.append((String) arrayList.get(i7));
                    if (i7 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // org.telegram.ui.Components.no
    public void v() {
        ((x60) this.b).v();
        bn bnVar = (bn) this.c;
        bnVar.Ic(true);
        kc.A(bnVar, bnVar.getMessagesController().u2(bnVar.l6, bnVar.b(), null), bnVar.Ba).j();
    }

    @Override // hi.rb
    public void x(boolean z10, float f10) {
        eb0 eb0Var = (eb0) this.b;
        ee0 ee0Var = (ee0) this.c;
        h61 h61Var = ee0Var.d;
        if (h61Var == null) {
            return;
        }
        float max = 2.8f / Math.max(60L, r2);
        long U = (long) ((((f10 / (1.0f - max)) * max) + f10) * h61Var.U());
        ee0Var.e = U;
        ee0Var.d.q0(U, !z10);
        if (z10) {
            return;
        }
        g0.r(eb0Var);
        g0.h3(eb0Var, 120L);
    }

    @Override // org.telegram.ui.Components.no
    public void y() {
        ((x60) this.b).v();
        bn bnVar = (bn) this.c;
        if (bnVar.l6 == 0 || bnVar.g4 == 3) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", bnVar.l6);
        if (bnVar.b() != 0) {
            bundle.putLong("topic_id", bnVar.b());
        }
        bnVar.presentFragment(new hx0(bundle, bnVar.Ba));
    }

    public /* synthetic */ k(int i7, boolean z10) {
        this.a = i7;
    }

    @Override // org.telegram.ui.Components.f61
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        if (secretMediaViewer.b0) {
            return;
        }
        secretMediaViewer.b0 = true;
        secretMediaViewer.e.invalidate();
    }

    public /* synthetic */ k(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public /* synthetic */ k(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ k(Object obj) {
        this.a = 25;
        this.c = obj;
        this.b = new ArrayList();
    }

    public k(n6.e eVar) {
        this.a = 26;
        this.b = new SparseIntArray();
        q6.m.h(eVar);
        this.c = eVar;
    }

    public k(ee0 ee0Var) {
        this.a = 16;
        this.c = ee0Var;
        this.b = new eb0(this, 8);
    }

    public k(e2.s sVar, SparseArray sparseArray) {
        this.a = 4;
        this.b = sVar;
        SparseBooleanArray sparseBooleanArray = sVar.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i7 = 0; i7 < sparseBooleanArray.size(); i7++) {
            int a10 = sVar.a(i7);
            m2.a aVar = (m2.a) sparseArray.get(a10);
            aVar.getClass();
            sparseArray2.append(a10, aVar);
        }
        this.c = sparseArray2;
    }

    @Override // org.telegram.ui.i7
    public void B() {
    }

    @Override // oi.e1
    public /* synthetic */ void F() {
    }

    @Override // org.telegram.ui.i7
    public void clear() {
    }

    @Override // org.telegram.ui.Components.tj0
    public void h() {
    }

    @Override // hi.rb
    public /* synthetic */ void p0() {
    }

    @Override // c4.m
    public /* synthetic */ void reset() {
    }

    @Override // hi.rb
    public /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Components.no
    public /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.zm0
    public void w() {
    }

    public k(String str) {
        this.a = 7;
        this.c = null;
        this.b = str;
    }

    public k(ji.n nVar) {
        this.a = 1;
        this.c = nVar;
    }

    public k(d0 d0Var) {
        this.a = 5;
        this.c = d0Var;
        this.b = new d4.f(new byte[4], 4);
    }

    @Override // hi.rb
    public /* synthetic */ void D(boolean z10) {
    }

    @Override // hi.rb
    public /* synthetic */ void L(float f10) {
    }

    @Override // hi.rb
    public /* synthetic */ void U(long j3) {
    }

    @Override // hi.rb
    public /* synthetic */ void X(boolean z10) {
    }

    @Override // hi.rb
    public /* synthetic */ void d0(float f10) {
    }

    @Override // hi.rb
    public /* synthetic */ void e(int i7) {
    }

    @Override // hi.rb
    public /* synthetic */ void j0(float f10) {
    }

    @Override // hi.rb
    public /* synthetic */ void k(float f10) {
    }

    @Override // org.telegram.ui.Components.tj0
    public void l(float f10) {
    }

    @Override // hi.rb
    public /* synthetic */ void n(float f10) {
    }

    @Override // hi.rb
    public /* synthetic */ void o0(float f10) {
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // hi.rb
    public /* synthetic */ void r0(float f10) {
    }

    @Override // hi.rb
    public /* synthetic */ void y0(long j3) {
    }

    @Override // hi.rb
    public /* synthetic */ void z(float f10) {
    }

    public k(jx jxVar) {
        this.a = 18;
        this.c = jxVar;
        this.b = new Rect();
    }

    public k(Attributes attributes, HashMap hashMap) {
        this.a = 12;
        this.c = attributes;
        String l10 = lz.l("style", attributes);
        if (l10 != null) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(new jz(l10));
            return;
        }
        String l11 = lz.l("class", attributes);
        if (l11 != null) {
            this.b = new ArrayList();
            for (String str : l11.split(" ")) {
                jz jzVar = (jz) hashMap.get(str.trim());
                if (jzVar != null) {
                    ((ArrayList) this.b).add(jzVar);
                }
            }
        }
    }

    @Override // hi.rb
    public /* synthetic */ void H(float f10, int i7) {
    }

    @Override // hi.rb
    public /* synthetic */ void b0(float f10, int i7) {
    }

    @Override // hi.rb
    public /* synthetic */ void n0(float f10, int i7) {
    }

    @Override // hi.rb
    public /* synthetic */ void p(long j3, boolean z10) {
    }

    @Override // hi.rb
    public /* synthetic */ void u0(int i7, long j3) {
    }

    public k(int i7) {
        this.a = i7;
        switch (i7) {
            case 3:
                this.b = new h2.x();
                this.c = new l4.a();
                break;
            default:
                this.b = new HashMap();
                this.c = l2.d.b;
                break;
        }
    }

    @Override // m4.a0
    public void b(k0 k0Var, f3.q qVar, f0 f0Var) {
    }
}
