package g4;

import a8.ja;
import a8.la;
import a8.p0;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c4.l;
import c4.m;
import c8.k1;
import com.google.android.gms.internal.vision.e2;
import h2.j;
import h2.l0;
import h2.x;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class a implements m {
    public static final Pattern h = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    public final e4.b b;
    public LinkedHashMap d;
    public float e = -3.4028235E38f;
    public float f = -3.4028235E38f;
    public final x c = new x();

    public a(List list) {
        if (list == null || list.isEmpty()) {
            this.a = false;
            this.b = null;
            return;
        }
        this.a = true;
        String r10 = l0.r((byte[]) list.get(0));
        la.f(r10.startsWith("Format:"));
        e4.b b10 = e4.b.b(r10);
        b10.getClass();
        this.b = b10;
        b(new x((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int a(long j3, ArrayList arrayList, ArrayList arrayList2) {
        int i7;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j3) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j3) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i7, Long.valueOf(j3));
        arrayList2.add(i7, i7 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i7 - 1)));
        return i7;
    }

    public static long c(String str) {
        Matcher matcher = h.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = l0.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(x xVar, Charset charset) {
        int i7;
        d dVar;
        while (true) {
            String n10 = xVar.n(charset);
            if (n10 == null) {
                return;
            }
            int i10 = 0;
            int i11 = 91;
            if ("[Script Info]".equalsIgnoreCase(n10)) {
                while (true) {
                    String n11 = xVar.n(charset);
                    if (n11 == null) {
                        break;
                    }
                    if (xVar.a() != 0) {
                        if ((xVar.h(charset) != 0 ? k1.b(r2 >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] split = n11.split(":");
                    if (split.length == 2) {
                        String c10 = ja.c(split[0].trim());
                        c10.getClass();
                        if (c10.equals("playresx")) {
                            this.e = Float.parseFloat(split[1].trim());
                        } else if (c10.equals("playresy")) {
                            try {
                                this.f = Float.parseFloat(split[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(n10)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                b bVar = null;
                while (true) {
                    String n12 = xVar.n(charset);
                    if (n12 != null) {
                        if (xVar.a() != 0) {
                            if ((xVar.h(charset) != 0 ? k1.b(r0 >>> 8) : 1114112) == i11) {
                            }
                        }
                        int i12 = -1;
                        if (n12.startsWith("Format:")) {
                            String[] split2 = TextUtils.split(n12.substring(7), ",");
                            int i13 = -1;
                            int i14 = -1;
                            int i15 = -1;
                            int i16 = -1;
                            int i17 = -1;
                            int i18 = -1;
                            int i19 = -1;
                            int i20 = -1;
                            int i21 = -1;
                            int i22 = -1;
                            for (int i23 = i10; i23 < split2.length; i23++) {
                                String c11 = ja.c(split2[i23].trim());
                                c11.getClass();
                                switch (c11.hashCode()) {
                                    case -1178781136:
                                        if (c11.equals("italic")) {
                                            i7 = i10;
                                            break;
                                        }
                                        i7 = -1;
                                        break;
                                    case -1026963764:
                                        if (c11.equals("underline")) {
                                            i7 = 1;
                                            break;
                                        }
                                        i7 = -1;
                                        break;
                                    case -192095652:
                                        if (c11.equals("strikeout")) {
                                            i7 = 2;
                                            break;
                                        }
                                        i7 = -1;
                                        break;
                                    case -70925746:
                                        if (c11.equals("primarycolour")) {
                                            i7 = 3;
                                            break;
                                        }
                                        i7 = -1;
                                        break;
                                    case 3029637:
                                        if (c11.equals("bold")) {
                                            i7 = 4;
                                            break;
                                        }
                                        i7 = -1;
                                        break;
                                    case 3373707:
                                        if (c11.equals("name")) {
                                            i7 = 5;
                                            break;
                                        }
                                        i7 = -1;
                                        break;
                                    case 366554320:
                                        if (c11.equals("fontsize")) {
                                            i7 = 6;
                                            break;
                                        }
                                        i7 = -1;
                                        break;
                                    case 767321349:
                                        if (c11.equals("borderstyle")) {
                                            i7 = 7;
                                            break;
                                        }
                                        i7 = -1;
                                        break;
                                    case 1767875043:
                                        if (c11.equals("alignment")) {
                                            i7 = 8;
                                            break;
                                        }
                                        i7 = -1;
                                        break;
                                    case 1988365454:
                                        if (c11.equals("outlinecolour")) {
                                            i7 = 9;
                                            break;
                                        }
                                        i7 = -1;
                                        break;
                                    default:
                                        i7 = -1;
                                        break;
                                }
                                switch (i7) {
                                    case 0:
                                        i19 = i23;
                                        break;
                                    case 1:
                                        i20 = i23;
                                        break;
                                    case 2:
                                        i21 = i23;
                                        break;
                                    case 3:
                                        i15 = i23;
                                        break;
                                    case 4:
                                        i18 = i23;
                                        break;
                                    case 5:
                                        i13 = i23;
                                        break;
                                    case 6:
                                        i17 = i23;
                                        break;
                                    case 7:
                                        i22 = i23;
                                        break;
                                    case 8:
                                        i14 = i23;
                                        break;
                                    case 9:
                                        i16 = i23;
                                        break;
                                }
                            }
                            bVar = i13 != -1 ? new b(i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, split2.length) : null;
                        } else {
                            if (n12.startsWith("Style:")) {
                                if (bVar == null) {
                                    h2.a.l("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(n12));
                                } else {
                                    la.f(n12.startsWith("Style:"));
                                    String[] split3 = TextUtils.split(n12.substring(6), ",");
                                    int length = split3.length;
                                    int i24 = bVar.k;
                                    if (length != i24) {
                                        int length2 = split3.length;
                                        String str = l0.a;
                                        Locale locale = Locale.US;
                                        StringBuilder n13 = i5.c.n("Skipping malformed 'Style:' line (expected ", i24, " values, found ", length2, "): '");
                                        n13.append(n12);
                                        n13.append("'");
                                        h2.a.l("SsaStyle", n13.toString());
                                    } else {
                                        try {
                                            String trim = split3[bVar.a].trim();
                                            int i25 = bVar.b;
                                            int a10 = i25 != -1 ? d.a(split3[i25].trim()) : -1;
                                            int i26 = bVar.c;
                                            Integer c12 = i26 != -1 ? d.c(split3[i26].trim()) : null;
                                            int i27 = bVar.d;
                                            Integer c13 = i27 != -1 ? d.c(split3[i27].trim()) : null;
                                            int i28 = bVar.e;
                                            float f10 = -3.4028235E38f;
                                            if (i28 != -1) {
                                                String trim2 = split3[i28].trim();
                                                try {
                                                    f10 = Float.parseFloat(trim2);
                                                } catch (NumberFormatException e10) {
                                                    h2.a.m("SsaStyle", "Failed to parse font size: '" + trim2 + "'", e10);
                                                }
                                            }
                                            float f11 = f10;
                                            int i29 = bVar.f;
                                            boolean z10 = i29 != -1 && d.b(split3[i29].trim());
                                            int i30 = bVar.g;
                                            boolean z11 = i30 != -1 && d.b(split3[i30].trim());
                                            int i31 = bVar.h;
                                            boolean z12 = i31 != -1 && d.b(split3[i31].trim());
                                            int i32 = bVar.i;
                                            boolean z13 = i32 != -1 && d.b(split3[i32].trim());
                                            int i33 = bVar.j;
                                            if (i33 != -1) {
                                                String trim3 = split3[i33].trim();
                                                try {
                                                    int parseInt = Integer.parseInt(trim3.trim());
                                                    if (parseInt == 1 || parseInt == 3) {
                                                        i12 = parseInt;
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                }
                                                h2.a.l("SsaStyle", "Ignoring unknown BorderStyle: " + trim3);
                                            }
                                            dVar = new d(trim, a10, c12, c13, f11, z10, z11, z12, z13, i12);
                                        } catch (RuntimeException e11) {
                                            h2.a.m("SsaStyle", "Skipping malformed 'Style:' line: '" + n12 + "'", e11);
                                        }
                                        if (dVar != null) {
                                            linkedHashMap.put(dVar.a, dVar);
                                        }
                                    }
                                    dVar = null;
                                    if (dVar != null) {
                                    }
                                }
                            }
                            i10 = 0;
                            i11 = 91;
                        }
                    }
                }
                this.d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(n10)) {
                h2.a.g("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(n10)) {
                return;
            }
        }
    }

    @Override // c4.m
    public final /* synthetic */ c4.d q(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    @Override // c4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(byte[] bArr, int i7, int i10, l lVar, j jVar) {
        Charset charset;
        x xVar;
        e4.b bVar;
        long j3;
        int parseInt;
        long c10;
        float f10;
        float f11;
        int i11;
        float f12;
        int i12;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i13;
        int i14;
        int i15;
        float f13;
        float f14;
        float f15;
        boolean z10;
        int i16;
        int i17;
        float f16;
        int i18;
        int i19;
        float f17;
        int i20;
        int i21;
        int i22;
        a aVar = this;
        long j10 = lVar.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        x xVar2 = aVar.c;
        xVar2.L(i7 + i10, bArr);
        xVar2.N(i7);
        Charset J = xVar2.J();
        if (J == null) {
            J = StandardCharsets.UTF_8;
        }
        boolean z11 = aVar.a;
        if (!z11) {
            aVar.b(xVar2, J);
        }
        e4.b bVar2 = z11 ? aVar.b : null;
        while (true) {
            String n10 = xVar2.n(J);
            if (n10 == null) {
                long j11 = j10;
                ArrayList arrayList3 = (j11 == -9223372036854775807L || !lVar.b) ? null : new ArrayList();
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    List list = (List) arrayList.get(i23);
                    if (!list.isEmpty() || i23 == 0) {
                        if (i23 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long longValue = ((Long) arrayList2.get(i23)).longValue();
                        long longValue2 = ((Long) arrayList2.get(i23 + 1)).longValue();
                        c4.a aVar2 = new c4.a(longValue, longValue2 - longValue, list);
                        if (j11 == -9223372036854775807L || longValue2 >= j11) {
                            jVar.accept(aVar2);
                        } else if (arrayList3 != null) {
                            arrayList3.add(aVar2);
                        }
                    }
                }
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i24 = 0;
                    while (i24 < size) {
                        Object obj = arrayList3.get(i24);
                        i24++;
                        jVar.accept((c4.a) obj);
                    }
                    return;
                }
                return;
            }
            if (n10.startsWith("Format:")) {
                bVar2 = e4.b.b(n10);
            } else {
                if (n10.startsWith("Dialogue:")) {
                    if (bVar2 == null) {
                        h2.a.l("SsaParser", "Skipping dialogue line before complete format: ".concat(n10));
                    } else {
                        int i25 = bVar2.f;
                        la.f(n10.startsWith("Dialogue:"));
                        String substring = n10.substring(9);
                        int i26 = bVar2.a;
                        String[] split = substring.split(",", i25);
                        if (split.length != i25) {
                            h2.a.l("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(n10));
                        } else {
                            if (i26 != -1) {
                                try {
                                    parseInt = Integer.parseInt(split[i26].trim());
                                } catch (RuntimeException unused) {
                                    h2.a.l("SsaParser", "Fail to parse layer: " + split[i26]);
                                }
                                c10 = c(split[bVar2.b]);
                                charset = J;
                                if (c10 != -9223372036854775807L) {
                                    h2.a.l("SsaParser", "Skipping invalid timing: ".concat(n10));
                                    j3 = j10;
                                    bVar = bVar2;
                                    xVar = xVar2;
                                    aVar = this;
                                    J = charset;
                                    j10 = j3;
                                    bVar2 = bVar;
                                    xVar2 = xVar;
                                } else {
                                    j3 = j10;
                                    long c11 = c(split[bVar2.c]);
                                    if (c11 == -9223372036854775807L || c11 <= c10) {
                                        bVar = bVar2;
                                        xVar = xVar2;
                                        h2.a.l("SsaParser", "Skipping invalid timing: ".concat(n10));
                                    } else {
                                        LinkedHashMap linkedHashMap = aVar.d;
                                        d dVar = (linkedHashMap == null || (i22 = bVar2.d) == -1) ? null : (d) linkedHashMap.get(split[i22].trim());
                                        String str = split[bVar2.e];
                                        Matcher matcher = c.a.matcher(str);
                                        bVar = bVar2;
                                        PointF pointF = null;
                                        int i27 = -1;
                                        while (matcher.find()) {
                                            x xVar3 = xVar2;
                                            String group = matcher.group(1);
                                            group.getClass();
                                            try {
                                                PointF a10 = c.a(group);
                                                if (a10 != null) {
                                                    pointF = a10;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            try {
                                                Matcher matcher2 = c.d.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    group2.getClass();
                                                    i21 = d.a(group2);
                                                } else {
                                                    i21 = -1;
                                                }
                                                if (i21 != -1) {
                                                    i27 = i21;
                                                }
                                            } catch (RuntimeException unused3) {
                                            }
                                            xVar2 = xVar3;
                                        }
                                        xVar = xVar2;
                                        String replace = c.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f18 = aVar.e;
                                        float f19 = aVar.f;
                                        SpannableString spannableString = new SpannableString(replace);
                                        if (dVar != null) {
                                            boolean z12 = dVar.g;
                                            Integer num = dVar.d;
                                            Integer num2 = dVar.c;
                                            if (num2 != null) {
                                                z10 = z12;
                                                f10 = f18;
                                                f11 = f19;
                                                i16 = 33;
                                                i17 = 0;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                z10 = z12;
                                                f10 = f18;
                                                f11 = f19;
                                                i16 = 33;
                                                i17 = 0;
                                            }
                                            if (dVar.j == 3 && num != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i17, spannableString.length(), i16);
                                            }
                                            float f20 = dVar.e;
                                            if (f20 == -3.4028235E38f || f11 == -3.4028235E38f) {
                                                f16 = -3.4028235E38f;
                                                i18 = Integer.MIN_VALUE;
                                            } else {
                                                f16 = f20 / f11;
                                                i18 = 1;
                                            }
                                            boolean z13 = dVar.f;
                                            if (z13 && z10) {
                                                i19 = i18;
                                                f17 = f16;
                                                i20 = 33;
                                                i11 = 0;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i19 = i18;
                                                f17 = f16;
                                                i20 = 33;
                                                i11 = 0;
                                                if (z13) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z10) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (dVar.h) {
                                                spannableString.setSpan(new UnderlineSpan(), i11, spannableString.length(), i20);
                                            }
                                            if (dVar.i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i11, spannableString.length(), i20);
                                            }
                                            i12 = i19;
                                            f12 = f17;
                                        } else {
                                            f10 = f18;
                                            f11 = f19;
                                            i11 = 0;
                                            f12 = -3.4028235E38f;
                                            i12 = Integer.MIN_VALUE;
                                        }
                                        if (i27 == -1) {
                                            i27 = dVar != null ? dVar.b : -1;
                                        }
                                        switch (i27) {
                                            case 0:
                                            default:
                                                e2.o(i27, "Unknown alignment: ", "SsaParser");
                                            case -1:
                                                alignment2 = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                alignment2 = alignment;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                alignment2 = alignment;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                alignment2 = alignment;
                                                break;
                                        }
                                        int i28 = TLObject.FLAG_31;
                                        switch (i27) {
                                            case 0:
                                            default:
                                                e2.o(i27, "Unknown alignment: ", "SsaParser");
                                            case -1:
                                                i13 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i13 = i11;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i13 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i13 = 2;
                                                break;
                                        }
                                        switch (i27) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                e2.o(i27, "Unknown alignment: ", "SsaParser");
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i28 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i28 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i28 = i11;
                                                break;
                                        }
                                        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
                                            float f21 = 0.95f;
                                            if (i13 != 0) {
                                                i14 = 1;
                                                if (i13 != 1) {
                                                    i15 = 2;
                                                    f13 = i13 != 2 ? -3.4028235E38f : 0.95f;
                                                } else {
                                                    i15 = 2;
                                                    f13 = 0.5f;
                                                }
                                            } else {
                                                i14 = 1;
                                                i15 = 2;
                                                f13 = 0.05f;
                                            }
                                            if (i28 == 0) {
                                                f21 = 0.05f;
                                            } else if (i28 == i14) {
                                                f21 = 0.5f;
                                            } else if (i28 != i15) {
                                                f21 = -3.4028235E38f;
                                            }
                                            f14 = f21;
                                            f15 = f13;
                                        } else {
                                            f15 = pointF.x / f10;
                                            f14 = pointF.y / f11;
                                        }
                                        g2.b bVar3 = new g2.b(spannableString, alignment2, null, null, f14, i11, i28, f15, i13, i12, f12, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f, parseInt);
                                        int a11 = a(c11, arrayList2, arrayList);
                                        for (int a12 = a(c10, arrayList2, arrayList); a12 < a11; a12++) {
                                            ((List) arrayList.get(a12)).add(bVar3);
                                        }
                                    }
                                    aVar = this;
                                    J = charset;
                                    j10 = j3;
                                    bVar2 = bVar;
                                    xVar2 = xVar;
                                }
                            }
                            parseInt = 0;
                            c10 = c(split[bVar2.b]);
                            charset = J;
                            if (c10 != -9223372036854775807L) {
                            }
                        }
                    }
                }
                charset = J;
                j3 = j10;
                bVar = bVar2;
                xVar = xVar2;
                aVar = this;
                J = charset;
                j10 = j3;
                bVar2 = bVar;
                xVar2 = xVar;
            }
        }
    }

    @Override // c4.m
    public final int y() {
        return 1;
    }

    @Override // c4.m
    public final /* synthetic */ void reset() {
    }
}
