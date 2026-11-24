// default package

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class bma implements uab {
    public static final Pattern h = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    public final pr3 b;
    public LinkedHashMap d;
    public float e = -3.4028235E38f;
    public float f = -3.4028235E38f;
    public final xu7 c = new xu7();

    public bma(List list) {
        if (list == null || list.isEmpty()) {
            this.a = false;
            this.b = null;
            return;
        }
        this.a = true;
        String r = g8c.r((byte[]) list.get(0));
        gre.f(r.startsWith("Format:"));
        pr3 a = pr3.a(r);
        a.getClass();
        this.b = a;
        b(new xu7((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int a(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long c(String str) {
        Matcher matcher = h.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = g8c.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(xu7 xu7Var, Charset charset) {
        int i;
        ema emaVar;
        while (true) {
            String n = xu7Var.n(charset);
            if (n == null) {
                return;
            }
            int i2 = 0;
            int i3 = 91;
            if ("[Script Info]".equalsIgnoreCase(n)) {
                while (true) {
                    String n2 = xu7Var.n(charset);
                    if (n2 == null) {
                        break;
                    }
                    if (xu7Var.a() != 0) {
                        if ((xu7Var.h(charset) != 0 ? gle.b(r2 >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] split = n2.split(":");
                    if (split.length == 2) {
                        String c = smd.c(split[0].trim());
                        c.getClass();
                        if (c.equals("playresx")) {
                            this.e = Float.parseFloat(split[1].trim());
                        } else if (c.equals("playresy")) {
                            try {
                                this.f = Float.parseFloat(split[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(n)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    cma cmaVar = null;
                    while (true) {
                        String n3 = xu7Var.n(charset);
                        if (n3 != null) {
                            if (xu7Var.a() != 0) {
                                if ((xu7Var.h(charset) != 0 ? gle.b(r0 >>> 8) : 1114112) == i3) {
                                }
                            }
                            int i4 = -1;
                            if (n3.startsWith("Format:")) {
                                String[] split2 = TextUtils.split(n3.substring(7), ",");
                                int i5 = -1;
                                int i6 = -1;
                                int i7 = -1;
                                int i8 = -1;
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -1;
                                int i14 = -1;
                                for (int i15 = i2; i15 < split2.length; i15++) {
                                    String c2 = smd.c(split2[i15].trim());
                                    c2.getClass();
                                    switch (c2.hashCode()) {
                                        case -1178781136:
                                            if (c2.equals("italic")) {
                                                i = i2;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -1026963764:
                                            if (c2.equals("underline")) {
                                                i = 1;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -192095652:
                                            if (c2.equals("strikeout")) {
                                                i = 2;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -70925746:
                                            if (c2.equals("primarycolour")) {
                                                i = 3;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 3029637:
                                            if (c2.equals("bold")) {
                                                i = 4;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 3373707:
                                            if (c2.equals("name")) {
                                                i = 5;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 366554320:
                                            if (c2.equals("fontsize")) {
                                                i = 6;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 767321349:
                                            if (c2.equals("borderstyle")) {
                                                i = 7;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 1767875043:
                                            if (c2.equals("alignment")) {
                                                i = 8;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 1988365454:
                                            if (c2.equals("outlinecolour")) {
                                                i = 9;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        default:
                                            i = -1;
                                            break;
                                    }
                                    switch (i) {
                                        case 0:
                                            i11 = i15;
                                            break;
                                        case 1:
                                            i12 = i15;
                                            break;
                                        case 2:
                                            i13 = i15;
                                            break;
                                        case 3:
                                            i7 = i15;
                                            break;
                                        case 4:
                                            i10 = i15;
                                            break;
                                        case 5:
                                            i5 = i15;
                                            break;
                                        case 6:
                                            i9 = i15;
                                            break;
                                        case 7:
                                            i14 = i15;
                                            break;
                                        case 8:
                                            i6 = i15;
                                            break;
                                        case 9:
                                            i8 = i15;
                                            break;
                                    }
                                }
                                if (i5 != -1) {
                                    cmaVar = new cma(i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, split2.length);
                                }
                            } else {
                                if (n3.startsWith("Style:")) {
                                    if (cmaVar == null) {
                                        lad.f("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(n3));
                                    } else {
                                        gre.f(n3.startsWith("Style:"));
                                        String[] split3 = TextUtils.split(n3.substring(6), ",");
                                        int length = split3.length;
                                        int i16 = cmaVar.k;
                                        if (length != i16) {
                                            int length2 = split3.length;
                                            String str = g8c.a;
                                            Locale locale = Locale.US;
                                            StringBuilder p = ir2.p("Skipping malformed 'Style:' line (expected ", i16, " values, found ", length2, "): '");
                                            p.append(n3);
                                            p.append("'");
                                            lad.f("SsaStyle", p.toString());
                                        } else {
                                            try {
                                                String trim = split3[cmaVar.a].trim();
                                                int i17 = cmaVar.b;
                                                int a = i17 != -1 ? ema.a(split3[i17].trim()) : -1;
                                                int i18 = cmaVar.c;
                                                Integer c3 = i18 != -1 ? ema.c(split3[i18].trim()) : null;
                                                int i19 = cmaVar.d;
                                                Integer c4 = i19 != -1 ? ema.c(split3[i19].trim()) : null;
                                                int i20 = cmaVar.e;
                                                float f = -3.4028235E38f;
                                                if (i20 != -1) {
                                                    String trim2 = split3[i20].trim();
                                                    try {
                                                        f = Float.parseFloat(trim2);
                                                    } catch (NumberFormatException e) {
                                                        lad.g("SsaStyle", "Failed to parse font size: '" + trim2 + "'", e);
                                                    }
                                                }
                                                float f2 = f;
                                                int i21 = cmaVar.f;
                                                boolean z = i21 != -1 && ema.b(split3[i21].trim());
                                                int i22 = cmaVar.g;
                                                boolean z2 = i22 != -1 && ema.b(split3[i22].trim());
                                                int i23 = cmaVar.h;
                                                boolean z3 = i23 != -1 && ema.b(split3[i23].trim());
                                                int i24 = cmaVar.i;
                                                boolean z4 = i24 != -1 && ema.b(split3[i24].trim());
                                                int i25 = cmaVar.j;
                                                if (i25 != -1) {
                                                    String trim3 = split3[i25].trim();
                                                    try {
                                                        int parseInt = Integer.parseInt(trim3.trim());
                                                        if (parseInt == 1 || parseInt == 3) {
                                                            i4 = parseInt;
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    lad.f("SsaStyle", "Ignoring unknown BorderStyle: " + trim3);
                                                }
                                                emaVar = new ema(trim, a, c3, c4, f2, z, z2, z3, z4, i4);
                                            } catch (RuntimeException e2) {
                                                lad.g("SsaStyle", "Skipping malformed 'Style:' line: '" + n3 + "'", e2);
                                            }
                                            if (emaVar != null) {
                                                linkedHashMap.put(emaVar.a, emaVar);
                                            }
                                        }
                                        emaVar = null;
                                        if (emaVar != null) {
                                        }
                                    }
                                }
                                i2 = 0;
                                i3 = 91;
                            }
                        }
                    }
                }
                this.d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(n)) {
                lad.e("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(n)) {
                return;
            }
        }
    }

    @Override // uab
    public final /* synthetic */ kab f(int i, int i2, byte[] bArr) {
        return de9.c(this, bArr, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    @Override // uab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(byte[] bArr, int i, int i2, tab tabVar, us2 us2Var) {
        Charset charset;
        xu7 xu7Var;
        pr3 pr3Var;
        long j;
        int parseInt;
        long c;
        float f;
        float f2;
        int i3;
        float f3;
        int i4;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i5;
        float f4;
        float f5;
        boolean z;
        int i6;
        int i7;
        float f6;
        int i8;
        int i9;
        float f7;
        int i10;
        int i11;
        int i12;
        bma bmaVar = this;
        long j2 = tabVar.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        xu7 xu7Var2 = bmaVar.c;
        xu7Var2.L(i + i2, bArr);
        xu7Var2.N(i);
        Charset J = xu7Var2.J();
        if (J == null) {
            J = StandardCharsets.UTF_8;
        }
        boolean z2 = bmaVar.a;
        if (!z2) {
            bmaVar.b(xu7Var2, J);
        }
        pr3 pr3Var2 = z2 ? bmaVar.b : null;
        while (true) {
            String n = xu7Var2.n(J);
            if (n == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !tabVar.b) ? null : new ArrayList();
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    List list = (List) arrayList.get(i13);
                    if (!list.isEmpty() || i13 == 0) {
                        if (i13 == arrayList.size() - 1) {
                            sdb.a();
                            return;
                        }
                        long longValue = ((Long) arrayList2.get(i13)).longValue();
                        long longValue2 = ((Long) arrayList2.get(i13 + 1)).longValue();
                        x33 x33Var = new x33(longValue, longValue2 - longValue, list);
                        if (j3 == -9223372036854775807L || longValue2 >= j3) {
                            us2Var.accept(x33Var);
                        } else if (arrayList3 != null) {
                            arrayList3.add(x33Var);
                        }
                    }
                }
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList3.get(i14);
                        i14++;
                        us2Var.accept((x33) obj);
                    }
                    return;
                }
                return;
            }
            if (n.startsWith("Format:")) {
                pr3Var2 = pr3.a(n);
            } else {
                if (n.startsWith("Dialogue:")) {
                    if (pr3Var2 == null) {
                        lad.f("SsaParser", "Skipping dialogue line before complete format: ".concat(n));
                    } else {
                        int i15 = pr3Var2.f;
                        gre.f(n.startsWith("Dialogue:"));
                        String substring = n.substring(9);
                        int i16 = pr3Var2.a;
                        String[] split = substring.split(",", i15);
                        if (split.length != i15) {
                            lad.f("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(n));
                        } else {
                            if (i16 != -1) {
                                try {
                                    parseInt = Integer.parseInt(split[i16].trim());
                                } catch (RuntimeException unused) {
                                    lad.f("SsaParser", "Fail to parse layer: " + split[i16]);
                                }
                                c = c(split[pr3Var2.b]);
                                charset = J;
                                if (c != -9223372036854775807L) {
                                    lad.f("SsaParser", "Skipping invalid timing: ".concat(n));
                                    j = j2;
                                    pr3Var = pr3Var2;
                                    xu7Var = xu7Var2;
                                    bmaVar = this;
                                    J = charset;
                                    j2 = j;
                                    pr3Var2 = pr3Var;
                                    xu7Var2 = xu7Var;
                                } else {
                                    j = j2;
                                    long c2 = c(split[pr3Var2.c]);
                                    if (c2 == -9223372036854775807L || c2 <= c) {
                                        pr3Var = pr3Var2;
                                        xu7Var = xu7Var2;
                                        lad.f("SsaParser", "Skipping invalid timing: ".concat(n));
                                    } else {
                                        LinkedHashMap linkedHashMap = bmaVar.d;
                                        ema emaVar = (linkedHashMap == null || (i12 = pr3Var2.d) == -1) ? null : (ema) linkedHashMap.get(split[i12].trim());
                                        String str = split[pr3Var2.e];
                                        Matcher matcher = dma.a.matcher(str);
                                        pr3Var = pr3Var2;
                                        PointF pointF = null;
                                        int i17 = -1;
                                        while (true) {
                                            xu7Var = xu7Var2;
                                            if (matcher.find()) {
                                                String group = matcher.group(1);
                                                group.getClass();
                                                try {
                                                    PointF a = dma.a(group);
                                                    if (a != null) {
                                                        pointF = a;
                                                    }
                                                } catch (RuntimeException unused2) {
                                                }
                                                try {
                                                    Matcher matcher2 = dma.d.matcher(group);
                                                    if (matcher2.find()) {
                                                        String group2 = matcher2.group(1);
                                                        group2.getClass();
                                                        i11 = ema.a(group2);
                                                    } else {
                                                        i11 = -1;
                                                    }
                                                    if (i11 != -1) {
                                                        i17 = i11;
                                                    }
                                                } catch (RuntimeException unused3) {
                                                }
                                                xu7Var2 = xu7Var;
                                            } else {
                                                String replace = dma.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                                float f8 = bmaVar.e;
                                                float f9 = bmaVar.f;
                                                SpannableString spannableString = new SpannableString(replace);
                                                if (emaVar != null) {
                                                    boolean z3 = emaVar.g;
                                                    Integer num = emaVar.d;
                                                    Integer num2 = emaVar.c;
                                                    if (num2 != null) {
                                                        z = z3;
                                                        f = f8;
                                                        f2 = f9;
                                                        i6 = 33;
                                                        i7 = 0;
                                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                                    } else {
                                                        z = z3;
                                                        f = f8;
                                                        f2 = f9;
                                                        i6 = 33;
                                                        i7 = 0;
                                                    }
                                                    if (emaVar.j == 3 && num != null) {
                                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i7, spannableString.length(), i6);
                                                    }
                                                    float f10 = emaVar.e;
                                                    if (f10 == -3.4028235E38f || f2 == -3.4028235E38f) {
                                                        f6 = -3.4028235E38f;
                                                        i8 = Integer.MIN_VALUE;
                                                    } else {
                                                        f6 = f10 / f2;
                                                        i8 = 1;
                                                    }
                                                    if (!emaVar.f) {
                                                        i9 = i8;
                                                        f7 = f6;
                                                        i10 = 33;
                                                        i3 = 0;
                                                        if (z) {
                                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                        }
                                                    } else if (z) {
                                                        i9 = i8;
                                                        f7 = f6;
                                                        i10 = 33;
                                                        i3 = 0;
                                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                                    } else {
                                                        i9 = i8;
                                                        f7 = f6;
                                                        i10 = 33;
                                                        i3 = 0;
                                                        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                    }
                                                    if (emaVar.h) {
                                                        spannableString.setSpan(new UnderlineSpan(), i3, spannableString.length(), i10);
                                                    }
                                                    if (emaVar.i) {
                                                        spannableString.setSpan(new StrikethroughSpan(), i3, spannableString.length(), i10);
                                                    }
                                                    i4 = i9;
                                                    f3 = f7;
                                                } else {
                                                    f = f8;
                                                    f2 = f9;
                                                    i3 = 0;
                                                    f3 = -3.4028235E38f;
                                                    i4 = Integer.MIN_VALUE;
                                                }
                                                if (i17 == -1) {
                                                    i17 = emaVar != null ? emaVar.b : -1;
                                                }
                                                switch (i17) {
                                                    case 0:
                                                    default:
                                                        b00.o(i17, "Unknown alignment: ", "SsaParser");
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
                                                int i18 = TLObject.FLAG_31;
                                                switch (i17) {
                                                    case 0:
                                                    default:
                                                        b00.o(i17, "Unknown alignment: ", "SsaParser");
                                                    case -1:
                                                        i5 = Integer.MIN_VALUE;
                                                        break;
                                                    case 1:
                                                    case 4:
                                                    case 7:
                                                        i5 = i3;
                                                        break;
                                                    case 2:
                                                    case 5:
                                                    case 8:
                                                        i5 = 1;
                                                        break;
                                                    case 3:
                                                    case 6:
                                                    case 9:
                                                        i5 = 2;
                                                        break;
                                                }
                                                switch (i17) {
                                                    case -1:
                                                        break;
                                                    case 0:
                                                    default:
                                                        b00.o(i17, "Unknown alignment: ", "SsaParser");
                                                        break;
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                        i18 = 2;
                                                        break;
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                        i18 = 1;
                                                        break;
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        i18 = i3;
                                                        break;
                                                }
                                                if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                                    float f11 = 0.95f;
                                                    float f12 = i5 != 0 ? i5 != 1 ? i5 != 2 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                                    if (i18 == 0) {
                                                        f11 = 0.05f;
                                                    } else if (i18 == 1) {
                                                        f11 = 0.5f;
                                                    } else if (i18 != 2) {
                                                        f11 = -3.4028235E38f;
                                                    }
                                                    f4 = f11;
                                                    f5 = f12;
                                                } else {
                                                    f5 = pointF.x / f;
                                                    f4 = pointF.y / f2;
                                                }
                                                u33 u33Var = new u33(spannableString, alignment2, null, null, f4, i3, i18, f5, i5, i4, f3, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f, parseInt);
                                                int a2 = a(c2, arrayList2, arrayList);
                                                for (int a3 = a(c, arrayList2, arrayList); a3 < a2; a3++) {
                                                    ((List) arrayList.get(a3)).add(u33Var);
                                                }
                                            }
                                        }
                                    }
                                    bmaVar = this;
                                    J = charset;
                                    j2 = j;
                                    pr3Var2 = pr3Var;
                                    xu7Var2 = xu7Var;
                                }
                            }
                            parseInt = 0;
                            c = c(split[pr3Var2.b]);
                            charset = J;
                            if (c != -9223372036854775807L) {
                            }
                        }
                    }
                }
                charset = J;
                j = j2;
                pr3Var = pr3Var2;
                xu7Var = xu7Var2;
                bmaVar = this;
                J = charset;
                j2 = j;
                pr3Var2 = pr3Var;
                xu7Var2 = xu7Var;
            }
        }
    }

    @Override // uab
    public final int o() {
        return 1;
    }

    @Override // uab
    public final void reset() {
    }
}
