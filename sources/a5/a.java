package a5;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import h5.d0;
import h5.w;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k7.a7;
import org.telegram.tgnet.TLObject;
import v4.f;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a extends v4.e {
    public static final Pattern s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean n;
    public final b o;
    public LinkedHashMap p;
    public float q;
    public float r;

    public a(List list) {
        super("SsaDecoder");
        this.q = -3.4028235E38f;
        this.r = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.n = false;
            this.o = null;
            return;
        }
        this.n = true;
        String m9 = d0.m((byte[]) list.get(0));
        h5.a.f(m9.startsWith("Format:"));
        b b10 = b.b(m9);
        b10.getClass();
        this.o = b10;
        m(new w((byte[]) list.get(1)), r8.d.c);
    }

    public static int l(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, Long.valueOf(j10));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    public static long n(String str) {
        Matcher matcher = s.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i10 = d0.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override // v4.e
    public final f k(int i10, boolean z4, byte[] bArr) {
        w wVar;
        Charset charset;
        b bVar;
        int i11;
        int i12;
        float f10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i13;
        PointF pointF;
        int i14;
        int i15;
        float f11;
        float f12;
        float f13;
        boolean z10;
        int i16;
        int i17;
        float f14;
        int i18;
        float f15;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        w wVar2 = new w(bArr, i10);
        Charset B = wVar2.B();
        if (B == null) {
            B = r8.d.c;
        }
        boolean z11 = aVar.n;
        if (!z11) {
            aVar.m(wVar2, B);
        }
        b bVar2 = z11 ? aVar.o : null;
        while (true) {
            String h = wVar2.h(B);
            if (h == null) {
                return new bf.b(2, arrayList, arrayList2);
            }
            if (h.startsWith("Format:")) {
                bVar2 = b.b(h);
            } else {
                if (h.startsWith("Dialogue:")) {
                    if (bVar2 == null) {
                        h5.a.K("SsaDecoder", "Skipping dialogue line before complete format: ".concat(h));
                    } else {
                        int i24 = bVar2.e;
                        h5.a.f(h.startsWith("Dialogue:"));
                        String[] split = h.substring(9).split(",", i24);
                        if (split.length != i24) {
                            h5.a.K("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(h));
                        } else {
                            long n10 = n(split[bVar2.a]);
                            if (n10 == -9223372036854775807L) {
                                h5.a.K("SsaDecoder", "Skipping invalid timing: ".concat(h));
                            } else {
                                long n11 = n(split[bVar2.b]);
                                if (n11 == -9223372036854775807L) {
                                    h5.a.K("SsaDecoder", "Skipping invalid timing: ".concat(h));
                                } else {
                                    LinkedHashMap linkedHashMap = aVar.p;
                                    e eVar = (linkedHashMap == null || (i23 = bVar2.c) == -1) ? null : (e) linkedHashMap.get(split[i23].trim());
                                    String str = split[bVar2.d];
                                    Matcher matcher = d.a.matcher(str);
                                    int i25 = -1;
                                    PointF pointF2 = null;
                                    while (matcher.find()) {
                                        w wVar3 = wVar2;
                                        String group = matcher.group(1);
                                        group.getClass();
                                        try {
                                            PointF a2 = d.a(group);
                                            if (a2 != null) {
                                                pointF2 = a2;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = d.d.matcher(group);
                                            if (matcher2.find()) {
                                                String group2 = matcher2.group(1);
                                                group2.getClass();
                                                i22 = e.a(group2);
                                            } else {
                                                i22 = -1;
                                            }
                                            if (i22 != -1) {
                                                i25 = i22;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        wVar2 = wVar3;
                                    }
                                    wVar = wVar2;
                                    String replace = d.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f16 = aVar.q;
                                    float f17 = aVar.r;
                                    SpannableString spannableString = new SpannableString(replace);
                                    if (eVar != null) {
                                        boolean z12 = eVar.g;
                                        Integer num = eVar.d;
                                        Integer num2 = eVar.c;
                                        if (num2 != null) {
                                            z10 = z12;
                                            charset = B;
                                            bVar = bVar2;
                                            i16 = 33;
                                            i17 = 0;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            z10 = z12;
                                            charset = B;
                                            bVar = bVar2;
                                            i16 = 33;
                                            i17 = 0;
                                        }
                                        if (eVar.j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i17, spannableString.length(), i16);
                                        }
                                        float f18 = eVar.e;
                                        if (f18 == -3.4028235E38f || f17 == -3.4028235E38f) {
                                            f14 = -3.4028235E38f;
                                            i18 = TLObject.FLAG_31;
                                        } else {
                                            f14 = f18 / f17;
                                            i18 = 1;
                                        }
                                        boolean z13 = eVar.f;
                                        if (z13 && z10) {
                                            f15 = f14;
                                            i19 = i18;
                                            i20 = 33;
                                            i21 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            f15 = f14;
                                            i19 = i18;
                                            i20 = 33;
                                            i21 = 0;
                                            if (z13) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z10) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (eVar.h) {
                                            spannableString.setSpan(new UnderlineSpan(), i21, spannableString.length(), i20);
                                        }
                                        if (eVar.i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i21, spannableString.length(), i20);
                                        }
                                        f10 = f15;
                                        i12 = i19;
                                        i11 = -1;
                                    } else {
                                        charset = B;
                                        bVar = bVar2;
                                        i11 = -1;
                                        i12 = TLObject.FLAG_31;
                                        f10 = -3.4028235E38f;
                                    }
                                    if (i25 != i11) {
                                        i11 = i25;
                                    } else if (eVar != null) {
                                        i11 = eVar.b;
                                    }
                                    switch (i11) {
                                        case 0:
                                        default:
                                            e2.c.q(i11, "Unknown alignment: ", "SsaDecoder");
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
                                    int i26 = TLObject.FLAG_31;
                                    switch (i11) {
                                        case 0:
                                        default:
                                            e2.c.q(i11, "Unknown alignment: ", "SsaDecoder");
                                        case -1:
                                            i13 = TLObject.FLAG_31;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i13 = 0;
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
                                    switch (i11) {
                                        case 0:
                                        default:
                                            e2.c.q(i11, "Unknown alignment: ", "SsaDecoder");
                                        case -1:
                                            pointF = pointF2;
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            pointF = pointF2;
                                            i26 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            pointF = pointF2;
                                            i26 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            pointF = pointF2;
                                            i26 = 0;
                                            break;
                                    }
                                    if (pointF == null || f17 == -3.4028235E38f || f16 == -3.4028235E38f) {
                                        if (i13 != 0) {
                                            i15 = 1;
                                            if (i13 != 1) {
                                                i14 = 2;
                                                f11 = i13 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i14 = 2;
                                                f11 = 0.5f;
                                            }
                                        } else {
                                            i14 = 2;
                                            i15 = 1;
                                            f11 = 0.05f;
                                        }
                                        f12 = i26 != 0 ? i26 != i15 ? i26 != i14 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                        f13 = f11;
                                    } else {
                                        float f19 = pointF.x / f16;
                                        f12 = pointF.y / f17;
                                        f13 = f19;
                                    }
                                    v4.b bVar3 = new v4.b(spannableString, alignment2, null, null, f12, 0, i26, f13, i13, i12, f10, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f);
                                    int l10 = l(n11, arrayList2, arrayList);
                                    for (int l11 = l(n10, arrayList2, arrayList); l11 < l10; l11++) {
                                        ((List) arrayList.get(l11)).add(bVar3);
                                    }
                                    aVar = this;
                                    wVar2 = wVar;
                                    B = charset;
                                    bVar2 = bVar;
                                }
                            }
                        }
                    }
                }
                wVar = wVar2;
                charset = B;
                bVar = bVar2;
                aVar = this;
                wVar2 = wVar;
                B = charset;
                bVar2 = bVar;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(w wVar, Charset charset) {
        char c3;
        float f10;
        int i10;
        e eVar;
        int parseInt;
        while (true) {
            String h = wVar.h(charset);
            if (h == null) {
                return;
            }
            char c10 = '[';
            if ("[Script Info]".equalsIgnoreCase(h)) {
                while (true) {
                    String h9 = wVar.h(charset);
                    if (h9 != null && (wVar.a() == 0 || wVar.c(charset) != '[')) {
                        String[] split = h9.split(":");
                        if (split.length == 2) {
                            String b10 = a7.b(split[0].trim());
                            b10.getClass();
                            if (b10.equals("playresx")) {
                                this.q = Float.parseFloat(split[1].trim());
                            } else if (b10.equals("playresy")) {
                                try {
                                    this.r = Float.parseFloat(split[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(h)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    c cVar = null;
                    while (true) {
                        String h10 = wVar.h(charset);
                        if (h10 != null && (wVar.a() == 0 || wVar.c(charset) != c10)) {
                            int i11 = -1;
                            if (h10.startsWith("Format:")) {
                                String[] split2 = TextUtils.split(h10.substring(7), ",");
                                int i12 = -1;
                                int i13 = -1;
                                int i14 = -1;
                                int i15 = -1;
                                int i16 = -1;
                                int i17 = -1;
                                int i18 = -1;
                                int i19 = -1;
                                int i20 = -1;
                                int i21 = -1;
                                for (int i22 = 0; i22 < split2.length; i22++) {
                                    String b11 = a7.b(split2[i22].trim());
                                    b11.getClass();
                                    switch (b11.hashCode()) {
                                        case -1178781136:
                                            if (b11.equals("italic")) {
                                                c3 = 0;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1026963764:
                                            if (b11.equals("underline")) {
                                                c3 = 1;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -192095652:
                                            if (b11.equals("strikeout")) {
                                                c3 = 2;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -70925746:
                                            if (b11.equals("primarycolour")) {
                                                c3 = 3;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 3029637:
                                            if (b11.equals("bold")) {
                                                c3 = 4;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 3373707:
                                            if (b11.equals("name")) {
                                                c3 = 5;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 366554320:
                                            if (b11.equals("fontsize")) {
                                                c3 = 6;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 767321349:
                                            if (b11.equals("borderstyle")) {
                                                c3 = 7;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 1767875043:
                                            if (b11.equals("alignment")) {
                                                c3 = '\b';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 1988365454:
                                            if (b11.equals("outlinecolour")) {
                                                c3 = '\t';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        default:
                                            c3 = 65535;
                                            break;
                                    }
                                    switch (c3) {
                                        case 0:
                                            i18 = i22;
                                            break;
                                        case 1:
                                            i19 = i22;
                                            break;
                                        case 2:
                                            i20 = i22;
                                            break;
                                        case 3:
                                            i14 = i22;
                                            break;
                                        case 4:
                                            i17 = i22;
                                            break;
                                        case 5:
                                            i12 = i22;
                                            break;
                                        case 6:
                                            i16 = i22;
                                            break;
                                        case 7:
                                            i21 = i22;
                                            break;
                                        case '\b':
                                            i13 = i22;
                                            break;
                                        case '\t':
                                            i15 = i22;
                                            break;
                                    }
                                }
                                if (i12 != -1) {
                                    cVar = new c(i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, split2.length);
                                }
                            } else {
                                if (h10.startsWith("Style:")) {
                                    if (cVar == null) {
                                        h5.a.K("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(h10));
                                    } else {
                                        h5.a.f(h10.startsWith("Style:"));
                                        String[] split3 = TextUtils.split(h10.substring(6), ",");
                                        int length = split3.length;
                                        int i23 = cVar.k;
                                        if (length != i23) {
                                            int length2 = split3.length;
                                            int i24 = d0.a;
                                            Locale locale = Locale.US;
                                            StringBuilder m9 = e2.c.m("Skipping malformed 'Style:' line (expected ", i23, " values, found ", length2, "): '");
                                            m9.append(h10);
                                            m9.append("'");
                                            h5.a.K("SsaStyle", m9.toString());
                                        } else {
                                            try {
                                                String trim = split3[cVar.a].trim();
                                                int i25 = cVar.b;
                                                int a2 = i25 != -1 ? e.a(split3[i25].trim()) : -1;
                                                int i26 = cVar.c;
                                                Integer c11 = i26 != -1 ? e.c(split3[i26].trim()) : null;
                                                int i27 = cVar.d;
                                                Integer c12 = i27 != -1 ? e.c(split3[i27].trim()) : null;
                                                int i28 = cVar.e;
                                                float f11 = -3.4028235E38f;
                                                if (i28 != -1) {
                                                    String trim2 = split3[i28].trim();
                                                    try {
                                                        f11 = Float.parseFloat(trim2);
                                                    } catch (NumberFormatException e6) {
                                                        h5.a.L("SsaStyle", "Failed to parse font size: '" + trim2 + "'", e6);
                                                    }
                                                    f10 = f11;
                                                } else {
                                                    f10 = -3.4028235E38f;
                                                }
                                                int i29 = cVar.f;
                                                boolean z4 = i29 != -1 && e.b(split3[i29].trim());
                                                int i30 = cVar.g;
                                                boolean z10 = i30 != -1 && e.b(split3[i30].trim());
                                                int i31 = cVar.h;
                                                boolean z11 = i31 != -1 && e.b(split3[i31].trim());
                                                int i32 = cVar.i;
                                                boolean z12 = i32 != -1 && e.b(split3[i32].trim());
                                                int i33 = cVar.j;
                                                if (i33 != -1) {
                                                    String trim3 = split3[i33].trim();
                                                    try {
                                                        parseInt = Integer.parseInt(trim3.trim());
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    if (parseInt == 1 || parseInt == 3) {
                                                        i11 = parseInt;
                                                        i10 = i11;
                                                    }
                                                    h5.a.K("SsaStyle", "Ignoring unknown BorderStyle: " + trim3);
                                                    i10 = i11;
                                                } else {
                                                    i10 = -1;
                                                }
                                                eVar = new e(trim, a2, c11, c12, f10, z4, z10, z11, z12, i10);
                                            } catch (RuntimeException e10) {
                                                h5.a.L("SsaStyle", "Skipping malformed 'Style:' line: '" + h10 + "'", e10);
                                            }
                                            if (eVar != null) {
                                                linkedHashMap.put(eVar.a, eVar);
                                            }
                                        }
                                        eVar = null;
                                        if (eVar != null) {
                                        }
                                    }
                                }
                                c10 = '[';
                            }
                        }
                    }
                }
                this.p = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(h)) {
                h5.a.v("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(h)) {
                return;
            }
        }
    }
}
