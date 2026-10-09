package d4;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.internal.vision.e2;
import e2.d0;
import e2.h;
import e2.v;
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
import v7.r6;
import v7.v7;
import z3.l;
import z3.m;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class a implements m {
    public static final Pattern h = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    public final b4.b b;
    public LinkedHashMap d;
    public float e = -3.4028235E38f;
    public float f = -3.4028235E38f;
    public final v c = new v();

    public a(List list) {
        if (list == null || list.isEmpty()) {
            this.a = false;
            this.b = null;
            return;
        }
        this.a = true;
        String p5 = d0.p((byte[]) list.get(0));
        e2.d.b(p5.startsWith("Format:"));
        b4.b a2 = b4.b.a(p5);
        a2.getClass();
        this.b = a2;
        b(new v((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int a(long j3, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j3) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j3) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, Long.valueOf(j3));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    public static long c(String str) {
        Matcher matcher = h.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = d0.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override // z3.m
    public final int O() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    @Override // z3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(byte[] bArr, int i10, int i11, l lVar, h hVar) {
        Charset charset;
        v vVar;
        b4.b bVar;
        long j3;
        int parseInt;
        long c10;
        float f7;
        float f10;
        int i12;
        float f11;
        int i13;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i14;
        int i15;
        int i16;
        float f12;
        float f13;
        float f14;
        boolean z10;
        int i17;
        int i18;
        float f15;
        int i19;
        int i20;
        float f16;
        int i21;
        int i22;
        int i23;
        a aVar = this;
        long j10 = lVar.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        v vVar2 = aVar.c;
        vVar2.H(i10 + i11, bArr);
        vVar2.J(i10);
        Charset F = vVar2.F();
        if (F == null) {
            F = StandardCharsets.UTF_8;
        }
        boolean z11 = aVar.a;
        if (!z11) {
            aVar.b(vVar2, F);
        }
        b4.b bVar2 = z11 ? aVar.b : null;
        while (true) {
            String k10 = vVar2.k(F);
            if (k10 == null) {
                long j11 = j10;
                ArrayList arrayList3 = (j11 == -9223372036854775807L || !lVar.b) ? null : new ArrayList();
                for (int i24 = 0; i24 < arrayList.size(); i24++) {
                    List list = (List) arrayList.get(i24);
                    if (!list.isEmpty() || i24 == 0) {
                        if (i24 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long longValue = ((Long) arrayList2.get(i24)).longValue();
                        long longValue2 = ((Long) arrayList2.get(i24 + 1)).longValue();
                        z3.a aVar2 = new z3.a(longValue, longValue2 - longValue, list);
                        if (j11 == -9223372036854775807L || longValue2 >= j11) {
                            hVar.accept(aVar2);
                        } else if (arrayList3 != null) {
                            arrayList3.add(aVar2);
                        }
                    }
                }
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i25 = 0;
                    while (i25 < size) {
                        Object obj = arrayList3.get(i25);
                        i25++;
                        hVar.accept((z3.a) obj);
                    }
                    return;
                }
                return;
            }
            if (k10.startsWith("Format:")) {
                bVar2 = b4.b.a(k10);
            } else {
                if (k10.startsWith("Dialogue:")) {
                    if (bVar2 == null) {
                        e2.a.n("SsaParser", "Skipping dialogue line before complete format: ".concat(k10));
                    } else {
                        int i26 = bVar2.f;
                        e2.d.b(k10.startsWith("Dialogue:"));
                        String substring = k10.substring(9);
                        int i27 = bVar2.a;
                        String[] split = substring.split(",", i26);
                        if (split.length != i26) {
                            e2.a.n("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(k10));
                        } else {
                            if (i27 != -1) {
                                try {
                                    parseInt = Integer.parseInt(split[i27].trim());
                                } catch (RuntimeException unused) {
                                    e2.a.n("SsaParser", "Fail to parse layer: " + split[i27]);
                                }
                                c10 = c(split[bVar2.b]);
                                charset = F;
                                if (c10 != -9223372036854775807L) {
                                    e2.a.n("SsaParser", "Skipping invalid timing: ".concat(k10));
                                    j3 = j10;
                                    bVar = bVar2;
                                    vVar = vVar2;
                                    aVar = this;
                                    F = charset;
                                    j10 = j3;
                                    bVar2 = bVar;
                                    vVar2 = vVar;
                                } else {
                                    j3 = j10;
                                    long c11 = c(split[bVar2.c]);
                                    if (c11 == -9223372036854775807L || c11 <= c10) {
                                        bVar = bVar2;
                                        vVar = vVar2;
                                        e2.a.n("SsaParser", "Skipping invalid timing: ".concat(k10));
                                    } else {
                                        LinkedHashMap linkedHashMap = aVar.d;
                                        d dVar = (linkedHashMap == null || (i23 = bVar2.d) == -1) ? null : (d) linkedHashMap.get(split[i23].trim());
                                        String str = split[bVar2.e];
                                        Matcher matcher = c.a.matcher(str);
                                        bVar = bVar2;
                                        PointF pointF = null;
                                        int i28 = -1;
                                        while (matcher.find()) {
                                            v vVar3 = vVar2;
                                            String group = matcher.group(1);
                                            group.getClass();
                                            try {
                                                PointF a2 = c.a(group);
                                                if (a2 != null) {
                                                    pointF = a2;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            try {
                                                Matcher matcher2 = c.d.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    group2.getClass();
                                                    i22 = d.a(group2);
                                                } else {
                                                    i22 = -1;
                                                }
                                                if (i22 != -1) {
                                                    i28 = i22;
                                                }
                                            } catch (RuntimeException unused3) {
                                            }
                                            vVar2 = vVar3;
                                        }
                                        vVar = vVar2;
                                        String replace = c.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f17 = aVar.e;
                                        float f18 = aVar.f;
                                        SpannableString spannableString = new SpannableString(replace);
                                        if (dVar != null) {
                                            boolean z12 = dVar.g;
                                            Integer num = dVar.d;
                                            Integer num2 = dVar.c;
                                            if (num2 != null) {
                                                z10 = z12;
                                                f7 = f17;
                                                f10 = f18;
                                                i17 = 33;
                                                i18 = 0;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                z10 = z12;
                                                f7 = f17;
                                                f10 = f18;
                                                i17 = 33;
                                                i18 = 0;
                                            }
                                            if (dVar.j == 3 && num != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i18, spannableString.length(), i17);
                                            }
                                            float f19 = dVar.e;
                                            if (f19 == -3.4028235E38f || f10 == -3.4028235E38f) {
                                                f15 = -3.4028235E38f;
                                                i19 = Integer.MIN_VALUE;
                                            } else {
                                                f15 = f19 / f10;
                                                i19 = 1;
                                            }
                                            boolean z13 = dVar.f;
                                            if (z13 && z10) {
                                                i20 = i19;
                                                f16 = f15;
                                                i21 = 33;
                                                i12 = 0;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i20 = i19;
                                                f16 = f15;
                                                i21 = 33;
                                                i12 = 0;
                                                if (z13) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z10) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (dVar.h) {
                                                spannableString.setSpan(new UnderlineSpan(), i12, spannableString.length(), i21);
                                            }
                                            if (dVar.i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i12, spannableString.length(), i21);
                                            }
                                            i13 = i20;
                                            f11 = f16;
                                        } else {
                                            f7 = f17;
                                            f10 = f18;
                                            i12 = 0;
                                            f11 = -3.4028235E38f;
                                            i13 = Integer.MIN_VALUE;
                                        }
                                        if (i28 == -1) {
                                            i28 = dVar != null ? dVar.b : -1;
                                        }
                                        switch (i28) {
                                            case 0:
                                            default:
                                                e2.m(i28, "Unknown alignment: ", "SsaParser");
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
                                        int i29 = TLObject.FLAG_31;
                                        switch (i28) {
                                            case 0:
                                            default:
                                                e2.m(i28, "Unknown alignment: ", "SsaParser");
                                            case -1:
                                                i14 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i14 = i12;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i14 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i14 = 2;
                                                break;
                                        }
                                        switch (i28) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                e2.m(i28, "Unknown alignment: ", "SsaParser");
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i29 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i29 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i29 = i12;
                                                break;
                                        }
                                        if (pointF == null || f10 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                            float f20 = 0.95f;
                                            if (i14 != 0) {
                                                i15 = 1;
                                                if (i14 != 1) {
                                                    i16 = 2;
                                                    f12 = i14 != 2 ? -3.4028235E38f : 0.95f;
                                                } else {
                                                    i16 = 2;
                                                    f12 = 0.5f;
                                                }
                                            } else {
                                                i15 = 1;
                                                i16 = 2;
                                                f12 = 0.05f;
                                            }
                                            if (i29 == 0) {
                                                f20 = 0.05f;
                                            } else if (i29 == i15) {
                                                f20 = 0.5f;
                                            } else if (i29 != i16) {
                                                f20 = -3.4028235E38f;
                                            }
                                            f13 = f20;
                                            f14 = f12;
                                        } else {
                                            f14 = pointF.x / f7;
                                            f13 = pointF.y / f10;
                                        }
                                        d2.b bVar3 = new d2.b(spannableString, alignment2, null, null, f13, i12, i29, f14, i14, i13, f11, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f, parseInt);
                                        int a10 = a(c11, arrayList2, arrayList);
                                        for (int a11 = a(c10, arrayList2, arrayList); a11 < a10; a11++) {
                                            ((List) arrayList.get(a11)).add(bVar3);
                                        }
                                    }
                                    aVar = this;
                                    F = charset;
                                    j10 = j3;
                                    bVar2 = bVar;
                                    vVar2 = vVar;
                                }
                            }
                            parseInt = 0;
                            c10 = c(split[bVar2.b]);
                            charset = F;
                            if (c10 != -9223372036854775807L) {
                            }
                        }
                    }
                }
                charset = F;
                j3 = j10;
                bVar = bVar2;
                vVar = vVar2;
                aVar = this;
                F = charset;
                j10 = j3;
                bVar2 = bVar;
                vVar2 = vVar;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(v vVar, Charset charset) {
        int i10;
        d dVar;
        while (true) {
            String k10 = vVar.k(charset);
            if (k10 == null) {
                return;
            }
            int i11 = 0;
            int i12 = 91;
            if ("[Script Info]".equalsIgnoreCase(k10)) {
                while (true) {
                    String k11 = vVar.k(charset);
                    if (k11 == null) {
                        break;
                    }
                    if (vVar.a() != 0) {
                        if ((vVar.g(charset) != 0 ? v7.b(r2 >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] split = k11.split(":");
                    if (split.length == 2) {
                        String b10 = r6.b(split[0].trim());
                        b10.getClass();
                        if (b10.equals("playresx")) {
                            this.e = Float.parseFloat(split[1].trim());
                        } else if (b10.equals("playresy")) {
                            try {
                                this.f = Float.parseFloat(split[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(k10)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                b bVar = null;
                while (true) {
                    String k12 = vVar.k(charset);
                    if (k12 != null) {
                        if (vVar.a() != 0) {
                            if ((vVar.g(charset) != 0 ? v7.b(r0 >>> 8) : 1114112) == i12) {
                            }
                        }
                        int i13 = -1;
                        if (k12.startsWith("Format:")) {
                            String[] split2 = TextUtils.split(k12.substring(7), ",");
                            int i14 = -1;
                            int i15 = -1;
                            int i16 = -1;
                            int i17 = -1;
                            int i18 = -1;
                            int i19 = -1;
                            int i20 = -1;
                            int i21 = -1;
                            int i22 = -1;
                            int i23 = -1;
                            for (int i24 = i11; i24 < split2.length; i24++) {
                                String b11 = r6.b(split2[i24].trim());
                                b11.getClass();
                                switch (b11.hashCode()) {
                                    case -1178781136:
                                        if (b11.equals("italic")) {
                                            i10 = i11;
                                            break;
                                        }
                                        i10 = -1;
                                        break;
                                    case -1026963764:
                                        if (b11.equals("underline")) {
                                            i10 = 1;
                                            break;
                                        }
                                        i10 = -1;
                                        break;
                                    case -192095652:
                                        if (b11.equals("strikeout")) {
                                            i10 = 2;
                                            break;
                                        }
                                        i10 = -1;
                                        break;
                                    case -70925746:
                                        if (b11.equals("primarycolour")) {
                                            i10 = 3;
                                            break;
                                        }
                                        i10 = -1;
                                        break;
                                    case 3029637:
                                        if (b11.equals("bold")) {
                                            i10 = 4;
                                            break;
                                        }
                                        i10 = -1;
                                        break;
                                    case 3373707:
                                        if (b11.equals("name")) {
                                            i10 = 5;
                                            break;
                                        }
                                        i10 = -1;
                                        break;
                                    case 366554320:
                                        if (b11.equals("fontsize")) {
                                            i10 = 6;
                                            break;
                                        }
                                        i10 = -1;
                                        break;
                                    case 767321349:
                                        if (b11.equals("borderstyle")) {
                                            i10 = 7;
                                            break;
                                        }
                                        i10 = -1;
                                        break;
                                    case 1767875043:
                                        if (b11.equals("alignment")) {
                                            i10 = 8;
                                            break;
                                        }
                                        i10 = -1;
                                        break;
                                    case 1988365454:
                                        if (b11.equals("outlinecolour")) {
                                            i10 = 9;
                                            break;
                                        }
                                        i10 = -1;
                                        break;
                                    default:
                                        i10 = -1;
                                        break;
                                }
                                switch (i10) {
                                    case 0:
                                        i20 = i24;
                                        break;
                                    case 1:
                                        i21 = i24;
                                        break;
                                    case 2:
                                        i22 = i24;
                                        break;
                                    case 3:
                                        i16 = i24;
                                        break;
                                    case 4:
                                        i19 = i24;
                                        break;
                                    case 5:
                                        i14 = i24;
                                        break;
                                    case 6:
                                        i18 = i24;
                                        break;
                                    case 7:
                                        i23 = i24;
                                        break;
                                    case 8:
                                        i15 = i24;
                                        break;
                                    case 9:
                                        i17 = i24;
                                        break;
                                }
                            }
                            bVar = i14 != -1 ? new b(i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, split2.length) : null;
                        } else {
                            if (k12.startsWith("Style:")) {
                                if (bVar == null) {
                                    e2.a.n("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(k12));
                                } else {
                                    e2.d.b(k12.startsWith("Style:"));
                                    String[] split3 = TextUtils.split(k12.substring(6), ",");
                                    int length = split3.length;
                                    int i25 = bVar.k;
                                    if (length != i25) {
                                        int length2 = split3.length;
                                        String str = d0.a;
                                        Locale locale = Locale.US;
                                        StringBuilder k13 = hg.c.k("Skipping malformed 'Style:' line (expected ", i25, " values, found ", length2, "): '");
                                        k13.append(k12);
                                        k13.append("'");
                                        e2.a.n("SsaStyle", k13.toString());
                                    } else {
                                        try {
                                            String trim = split3[bVar.a].trim();
                                            int i26 = bVar.b;
                                            int a2 = i26 != -1 ? d.a(split3[i26].trim()) : -1;
                                            int i27 = bVar.c;
                                            Integer c10 = i27 != -1 ? d.c(split3[i27].trim()) : null;
                                            int i28 = bVar.d;
                                            Integer c11 = i28 != -1 ? d.c(split3[i28].trim()) : null;
                                            int i29 = bVar.e;
                                            float f7 = -3.4028235E38f;
                                            if (i29 != -1) {
                                                String trim2 = split3[i29].trim();
                                                try {
                                                    f7 = Float.parseFloat(trim2);
                                                } catch (NumberFormatException e7) {
                                                    e2.a.o("SsaStyle", "Failed to parse font size: '" + trim2 + "'", e7);
                                                }
                                            }
                                            float f10 = f7;
                                            int i30 = bVar.f;
                                            boolean z10 = i30 != -1 && d.b(split3[i30].trim());
                                            int i31 = bVar.g;
                                            boolean z11 = i31 != -1 && d.b(split3[i31].trim());
                                            int i32 = bVar.h;
                                            boolean z12 = i32 != -1 && d.b(split3[i32].trim());
                                            int i33 = bVar.i;
                                            boolean z13 = i33 != -1 && d.b(split3[i33].trim());
                                            int i34 = bVar.j;
                                            if (i34 != -1) {
                                                String trim3 = split3[i34].trim();
                                                try {
                                                    int parseInt = Integer.parseInt(trim3.trim());
                                                    if (parseInt == 1 || parseInt == 3) {
                                                        i13 = parseInt;
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                }
                                                e2.a.n("SsaStyle", "Ignoring unknown BorderStyle: " + trim3);
                                            }
                                            dVar = new d(trim, a2, c10, c11, f10, z10, z11, z12, z13, i13);
                                        } catch (RuntimeException e10) {
                                            e2.a.o("SsaStyle", "Skipping malformed 'Style:' line: '" + k12 + "'", e10);
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
                            i11 = 0;
                            i12 = 91;
                        }
                    }
                }
                this.d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(k10)) {
                e2.a.i("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(k10)) {
                return;
            }
        }
    }

    @Override // z3.m
    public final /* synthetic */ z3.d s(int i10, int i11, byte[] bArr) {
        return sc.v.a(this, bArr, i11);
    }

    @Override // z3.m
    public final /* synthetic */ void reset() {
    }
}
