package f4;

import a1.g;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import b4.l;
import b4.m;
import b8.od;
import b8.xb;
import b8.zb;
import g2.k;
import g2.n0;
import g2.y;
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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements m {
    public static final Pattern h = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    public final d4.b b;
    public LinkedHashMap d;
    public float e = -3.4028235E38f;
    public float f = -3.4028235E38f;
    public final y c = new y();

    public a(List list) {
        if (list == null || list.isEmpty()) {
            this.a = false;
            this.b = null;
            return;
        }
        this.a = true;
        String r5 = n0.r((byte[]) list.get(0));
        zb.f(r5.startsWith("Format:"));
        d4.b b10 = d4.b.b(r5);
        b10.getClass();
        this.b = b10;
        b(new y((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int a(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i3 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j10) {
                i3 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i3, Long.valueOf(j10));
        arrayList2.add(i3, i3 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i3 - 1)));
        return i3;
    }

    public static long c(String str) {
        Matcher matcher = h.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = n0.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override // b4.m
    public final /* synthetic */ b4.d B(int i3, int i10, byte[] bArr) {
        return g.a(this, bArr, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    @Override // b4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(byte[] bArr, int i3, int i10, l lVar, k kVar) {
        Charset charset;
        y yVar;
        d4.b bVar;
        long j10;
        int parseInt;
        long c2;
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
        long j11 = lVar.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        y yVar2 = aVar.c;
        yVar2.L(i3 + i10, bArr);
        yVar2.N(i3);
        Charset J = yVar2.J();
        if (J == null) {
            J = StandardCharsets.UTF_8;
        }
        boolean z11 = aVar.a;
        if (!z11) {
            aVar.b(yVar2, J);
        }
        d4.b bVar2 = z11 ? aVar.b : null;
        while (true) {
            String n4 = yVar2.n(J);
            if (n4 == null) {
                long j12 = j11;
                ArrayList arrayList3 = (j12 == -9223372036854775807L || !lVar.b) ? null : new ArrayList();
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    List list = (List) arrayList.get(i23);
                    if (!list.isEmpty() || i23 == 0) {
                        if (i23 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long longValue = ((Long) arrayList2.get(i23)).longValue();
                        long longValue2 = ((Long) arrayList2.get(i23 + 1)).longValue();
                        b4.a aVar2 = new b4.a(longValue, longValue2 - longValue, list);
                        if (j12 == -9223372036854775807L || longValue2 >= j12) {
                            kVar.accept(aVar2);
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
                        kVar.accept((b4.a) obj);
                    }
                    return;
                }
                return;
            }
            if (n4.startsWith("Format:")) {
                bVar2 = d4.b.b(n4);
            } else {
                if (n4.startsWith("Dialogue:")) {
                    if (bVar2 == null) {
                        g2.a.l("SsaParser", "Skipping dialogue line before complete format: ".concat(n4));
                    } else {
                        int i25 = bVar2.f;
                        zb.f(n4.startsWith("Dialogue:"));
                        String substring = n4.substring(9);
                        int i26 = bVar2.a;
                        String[] split = substring.split(",", i25);
                        if (split.length != i25) {
                            g2.a.l("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(n4));
                        } else {
                            if (i26 != -1) {
                                try {
                                    parseInt = Integer.parseInt(split[i26].trim());
                                } catch (RuntimeException unused) {
                                    g2.a.l("SsaParser", "Fail to parse layer: " + split[i26]);
                                }
                                c2 = c(split[bVar2.b]);
                                charset = J;
                                if (c2 != -9223372036854775807L) {
                                    g2.a.l("SsaParser", "Skipping invalid timing: ".concat(n4));
                                    j10 = j11;
                                    bVar = bVar2;
                                    yVar = yVar2;
                                    aVar = this;
                                    J = charset;
                                    j11 = j10;
                                    bVar2 = bVar;
                                    yVar2 = yVar;
                                } else {
                                    j10 = j11;
                                    long c10 = c(split[bVar2.c]);
                                    if (c10 == -9223372036854775807L || c10 <= c2) {
                                        bVar = bVar2;
                                        yVar = yVar2;
                                        g2.a.l("SsaParser", "Skipping invalid timing: ".concat(n4));
                                    } else {
                                        LinkedHashMap linkedHashMap = aVar.d;
                                        d dVar = (linkedHashMap == null || (i22 = bVar2.d) == -1) ? null : (d) linkedHashMap.get(split[i22].trim());
                                        String str = split[bVar2.e];
                                        Matcher matcher = c.a.matcher(str);
                                        bVar = bVar2;
                                        PointF pointF = null;
                                        int i27 = -1;
                                        while (matcher.find()) {
                                            y yVar3 = yVar2;
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
                                            yVar2 = yVar3;
                                        }
                                        yVar = yVar2;
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
                                                com.google.android.recaptcha.internal.a.o(i27, "Unknown alignment: ", "SsaParser");
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
                                                com.google.android.recaptcha.internal.a.o(i27, "Unknown alignment: ", "SsaParser");
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
                                                com.google.android.recaptcha.internal.a.o(i27, "Unknown alignment: ", "SsaParser");
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
                                        f2.b bVar3 = new f2.b(spannableString, alignment2, null, null, f14, i11, i28, f15, i13, i12, f12, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f, parseInt);
                                        int a11 = a(c10, arrayList2, arrayList);
                                        for (int a12 = a(c2, arrayList2, arrayList); a12 < a11; a12++) {
                                            ((List) arrayList.get(a12)).add(bVar3);
                                        }
                                    }
                                    aVar = this;
                                    J = charset;
                                    j11 = j10;
                                    bVar2 = bVar;
                                    yVar2 = yVar;
                                }
                            }
                            parseInt = 0;
                            c2 = c(split[bVar2.b]);
                            charset = J;
                            if (c2 != -9223372036854775807L) {
                            }
                        }
                    }
                }
                charset = J;
                j10 = j11;
                bVar = bVar2;
                yVar = yVar2;
                aVar = this;
                J = charset;
                j11 = j10;
                bVar2 = bVar;
                yVar2 = yVar;
            }
        }
    }

    @Override // b4.m
    public final int Y() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(y yVar, Charset charset) {
        int i3;
        d dVar;
        while (true) {
            String n4 = yVar.n(charset);
            if (n4 == null) {
                return;
            }
            int i10 = 0;
            int i11 = 91;
            if ("[Script Info]".equalsIgnoreCase(n4)) {
                while (true) {
                    String n10 = yVar.n(charset);
                    if (n10 == null) {
                        break;
                    }
                    if (yVar.a() != 0) {
                        if ((yVar.h(charset) != 0 ? od.b(r2 >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] split = n10.split(":");
                    if (split.length == 2) {
                        String c2 = xb.c(split[0].trim());
                        c2.getClass();
                        if (c2.equals("playresx")) {
                            this.e = Float.parseFloat(split[1].trim());
                        } else if (c2.equals("playresy")) {
                            try {
                                this.f = Float.parseFloat(split[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(n4)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                b bVar = null;
                while (true) {
                    String n11 = yVar.n(charset);
                    if (n11 != null) {
                        if (yVar.a() != 0) {
                            if ((yVar.h(charset) != 0 ? od.b(r0 >>> 8) : 1114112) == i11) {
                            }
                        }
                        int i12 = -1;
                        if (n11.startsWith("Format:")) {
                            String[] split2 = TextUtils.split(n11.substring(7), ",");
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
                                String c10 = xb.c(split2[i23].trim());
                                c10.getClass();
                                switch (c10.hashCode()) {
                                    case -1178781136:
                                        if (c10.equals("italic")) {
                                            i3 = i10;
                                            break;
                                        }
                                        i3 = -1;
                                        break;
                                    case -1026963764:
                                        if (c10.equals("underline")) {
                                            i3 = 1;
                                            break;
                                        }
                                        i3 = -1;
                                        break;
                                    case -192095652:
                                        if (c10.equals("strikeout")) {
                                            i3 = 2;
                                            break;
                                        }
                                        i3 = -1;
                                        break;
                                    case -70925746:
                                        if (c10.equals("primarycolour")) {
                                            i3 = 3;
                                            break;
                                        }
                                        i3 = -1;
                                        break;
                                    case 3029637:
                                        if (c10.equals("bold")) {
                                            i3 = 4;
                                            break;
                                        }
                                        i3 = -1;
                                        break;
                                    case 3373707:
                                        if (c10.equals("name")) {
                                            i3 = 5;
                                            break;
                                        }
                                        i3 = -1;
                                        break;
                                    case 366554320:
                                        if (c10.equals("fontsize")) {
                                            i3 = 6;
                                            break;
                                        }
                                        i3 = -1;
                                        break;
                                    case 767321349:
                                        if (c10.equals("borderstyle")) {
                                            i3 = 7;
                                            break;
                                        }
                                        i3 = -1;
                                        break;
                                    case 1767875043:
                                        if (c10.equals("alignment")) {
                                            i3 = 8;
                                            break;
                                        }
                                        i3 = -1;
                                        break;
                                    case 1988365454:
                                        if (c10.equals("outlinecolour")) {
                                            i3 = 9;
                                            break;
                                        }
                                        i3 = -1;
                                        break;
                                    default:
                                        i3 = -1;
                                        break;
                                }
                                switch (i3) {
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
                            if (n11.startsWith("Style:")) {
                                if (bVar == null) {
                                    g2.a.l("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(n11));
                                } else {
                                    zb.f(n11.startsWith("Style:"));
                                    String[] split3 = TextUtils.split(n11.substring(6), ",");
                                    int length = split3.length;
                                    int i24 = bVar.k;
                                    if (length != i24) {
                                        int length2 = split3.length;
                                        String str = n0.a;
                                        Locale locale = Locale.US;
                                        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("Skipping malformed 'Style:' line (expected ", i24, " values, found ", length2, "): '");
                                        m10.append(n11);
                                        m10.append("'");
                                        g2.a.l("SsaStyle", m10.toString());
                                    } else {
                                        try {
                                            String trim = split3[bVar.a].trim();
                                            int i25 = bVar.b;
                                            int a10 = i25 != -1 ? d.a(split3[i25].trim()) : -1;
                                            int i26 = bVar.c;
                                            Integer c11 = i26 != -1 ? d.c(split3[i26].trim()) : null;
                                            int i27 = bVar.d;
                                            Integer c12 = i27 != -1 ? d.c(split3[i27].trim()) : null;
                                            int i28 = bVar.e;
                                            float f10 = -3.4028235E38f;
                                            if (i28 != -1) {
                                                String trim2 = split3[i28].trim();
                                                try {
                                                    f10 = Float.parseFloat(trim2);
                                                } catch (NumberFormatException e10) {
                                                    g2.a.m("SsaStyle", "Failed to parse font size: '" + trim2 + "'", e10);
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
                                                g2.a.l("SsaStyle", "Ignoring unknown BorderStyle: " + trim3);
                                            }
                                            dVar = new d(trim, a10, c11, c12, f11, z10, z11, z12, z13, i12);
                                        } catch (RuntimeException e11) {
                                            g2.a.m("SsaStyle", "Skipping malformed 'Style:' line: '" + n11 + "'", e11);
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
            } else if ("[V4 Styles]".equalsIgnoreCase(n4)) {
                g2.a.g("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(n4)) {
                return;
            }
        }
    }

    @Override // b4.m
    public final /* synthetic */ void reset() {
    }
}
