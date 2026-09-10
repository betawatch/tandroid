package f4;

import android.text.Layout;
import android.text.TextUtils;
import b2.q0;
import bi.u6;
import com.google.android.gms.internal.vision.e2;
import e2.d0;
import e2.h;
import e9.g1;
import e9.i1;
import e9.m0;
import e9.m1;
import e9.n0;
import e9.q;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import v7.r6;
import w7.c9;
import z3.l;
import z3.m;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class e implements m {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern h = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern n = Pattern.compile("^(\\d+) (\\d+)$");
    public static final d r = new d(30.0f, 1, 1);
    public final XmlPullParserFactory a;

    public e() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    public static g a(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = n.matcher(attributeValue);
        if (!matcher.matches()) {
            e2.a.n("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z10 = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z10 = false;
            }
            e2.d.a("Invalid cell resolution " + parseInt + " " + parseInt2, z10);
            return parseInt2;
        } catch (NumberFormatException unused) {
            e2.a.n("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, g gVar) {
        Matcher matcher;
        String group;
        String str2 = d0.a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new z3.f(a4.a.n(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(split[1]);
            e2.a.n("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new z3.f(a4.a.p("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        switch (group) {
            case "%":
                gVar.j = 3;
                break;
            case "em":
                gVar.j = 2;
                break;
            case "px":
                gVar.j = 1;
                break;
            default:
                throw new z3.f(a4.a.p("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        gVar.k = Float.parseFloat(group2);
    }

    public static d e(XmlPullParser xmlPullParser) {
        float f7;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = d0.a;
            e2.d.a("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f7 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f7 = 1.0f;
        }
        d dVar = r;
        int i10 = dVar.a;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = dVar.b;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new d(parseInt * f7, i10, i11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(XmlPullParser xmlPullParser, HashMap hashMap, int i10, q0 q0Var, HashMap hashMap2, HashMap hashMap3) {
        String k10;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i11;
        String k11;
        int i12;
        f fVar;
        char c10;
        float parseFloat;
        float parseFloat2;
        String k12;
        g gVar;
        String k13;
        g gVar2;
        String[] split;
        do {
            xmlPullParser.next();
            if (e2.d.m(xmlPullParser, "style")) {
                String k14 = e2.d.k(xmlPullParser, "style");
                g h10 = h(xmlPullParser, new g());
                if (k14 != null) {
                    String trim = k14.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str = d0.a;
                        split = trim.split("\\s+", -1);
                    }
                    for (String str2 : split) {
                        h10.a((g) hashMap.get(str2));
                    }
                }
                String str3 = h10.l;
                if (str3 != null) {
                    hashMap.put(str3, h10);
                }
            } else if (e2.d.m(xmlPullParser, "region")) {
                String k15 = e2.d.k(xmlPullParser, "id");
                if (k15 != null) {
                    String k16 = e2.d.k(xmlPullParser, "origin");
                    if (k16 == null && (k13 = e2.d.k(xmlPullParser, "style")) != null && (gVar2 = (g) hashMap.get(k13)) != null) {
                        k16 = gVar2.t;
                    }
                    Pattern pattern = h;
                    Pattern pattern2 = f;
                    if (k16 != null) {
                        Matcher matcher = pattern2.matcher(k16);
                        Matcher matcher2 = pattern.matcher(k16);
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                group.getClass();
                                f11 = Float.parseFloat(group) / 100.0f;
                                String group2 = matcher.group(2);
                                group2.getClass();
                                f10 = Float.parseFloat(group2) / 100.0f;
                                f7 = 100.0f;
                            } catch (NumberFormatException unused) {
                                e2.a.n("TtmlParser", "Ignoring region with malformed origin: ".concat(k16));
                            }
                        } else if (!matcher2.matches()) {
                            e2.a.n("TtmlParser", "Ignoring region with unsupported origin: ".concat(k16));
                        } else if (q0Var == null) {
                            e2.a.n("TtmlParser", "Ignoring region with missing tts:extent: ".concat(k16));
                        } else {
                            try {
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                int parseInt = Integer.parseInt(group3);
                                String group4 = matcher2.group(2);
                                group4.getClass();
                                f7 = 100.0f;
                                float f15 = parseInt / q0Var.a;
                                float parseInt2 = Integer.parseInt(group4) / q0Var.b;
                                f11 = f15;
                                f10 = parseInt2;
                            } catch (NumberFormatException unused2) {
                                e2.a.n("TtmlParser", "Ignoring region with malformed origin: ".concat(k16));
                            }
                        }
                    } else {
                        f7 = 100.0f;
                        f10 = 0.0f;
                        f11 = 0.0f;
                    }
                    String k17 = e2.d.k(xmlPullParser, "extent");
                    if (k17 == null && (k12 = e2.d.k(xmlPullParser, "style")) != null && (gVar = (g) hashMap.get(k12)) != null) {
                        k17 = gVar.u;
                    }
                    if (k17 != null) {
                        Matcher matcher3 = pattern2.matcher(k17);
                        Matcher matcher4 = pattern.matcher(k17);
                        if (matcher3.matches()) {
                            try {
                                String group5 = matcher3.group(1);
                                group5.getClass();
                                parseFloat = Float.parseFloat(group5) / f7;
                                String group6 = matcher3.group(2);
                                group6.getClass();
                                parseFloat2 = Float.parseFloat(group6) / f7;
                            } catch (NumberFormatException unused3) {
                                e2.s("Ignoring region with malformed extent: ", k16, "TtmlParser");
                            }
                        } else if (!matcher4.matches()) {
                            e2.s("Ignoring region with unsupported extent: ", k16, "TtmlParser");
                        } else if (q0Var == null) {
                            e2.s("Ignoring region with missing tts:extent: ", k16, "TtmlParser");
                        } else {
                            String group7 = matcher4.group(1);
                            group7.getClass();
                            int parseInt3 = Integer.parseInt(group7);
                            String group8 = matcher4.group(2);
                            group8.getClass();
                            float f16 = parseInt3 / q0Var.a;
                            parseFloat2 = Integer.parseInt(group8) / q0Var.b;
                            parseFloat = f16;
                        }
                        f12 = parseFloat;
                        f13 = parseFloat2;
                    } else {
                        f12 = 1.0f;
                        f13 = 1.0f;
                    }
                    String k18 = e2.d.k(xmlPullParser, "displayAlign");
                    if (k18 != null) {
                        String b10 = r6.b(k18);
                        b10.getClass();
                        if (b10.equals("center")) {
                            f14 = f10 + (f13 / 2.0f);
                            i11 = 1;
                        } else if (b10.equals("after")) {
                            f14 = f10 + f13;
                            i11 = 2;
                        }
                        float f17 = 1.0f / i10;
                        k11 = e2.d.k(xmlPullParser, "writingMode");
                        if (k11 != null) {
                            String b11 = r6.b(k11);
                            b11.getClass();
                            switch (b11.hashCode()) {
                                case 3694:
                                    if (b11.equals("tb")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 3553396:
                                    if (b11.equals("tblr")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 3553576:
                                    if (b11.equals("tbrl")) {
                                        c10 = 2;
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
                                case 1:
                                    i12 = 2;
                                    break;
                                case 2:
                                    i12 = 1;
                                    break;
                            }
                            fVar = new f(k15, f11, f14, 0, i11, f12, f13, 1, f17, i12);
                            if (fVar != null) {
                                hashMap2.put(fVar.a, fVar);
                            }
                        }
                        i12 = TLObject.FLAG_31;
                        fVar = new f(k15, f11, f14, 0, i11, f12, f13, 1, f17, i12);
                        if (fVar != null) {
                        }
                    }
                    f14 = f10;
                    i11 = 0;
                    float f172 = 1.0f / i10;
                    k11 = e2.d.k(xmlPullParser, "writingMode");
                    if (k11 != null) {
                    }
                    i12 = TLObject.FLAG_31;
                    fVar = new f(k15, f11, f14, 0, i11, f12, f13, 1, f172, i12);
                    if (fVar != null) {
                    }
                }
                fVar = null;
                if (fVar != null) {
                }
            } else if (e2.d.m(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (e2.d.m(xmlPullParser, "image") && (k10 = e2.d.k(xmlPullParser, "id")) != null) {
                        hashMap3.put(k10, xmlPullParser.nextText());
                    }
                } while (!e2.d.l(xmlPullParser, "metadata"));
            }
        } while (!e2.d.l(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static c g(XmlPullParser xmlPullParser, c cVar, HashMap hashMap, d dVar) {
        long j3;
        char c10;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        g h10 = h(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
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
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j12 = i(attributeValue, dVar);
                    break;
                case 2:
                    j11 = i(attributeValue, dVar);
                    break;
                case 3:
                    j10 = i(attributeValue, dVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = d0.a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (cVar != null) {
            long j13 = cVar.d;
            if (j13 != -9223372036854775807L) {
                if (j10 != -9223372036854775807L) {
                    j10 += j13;
                }
                if (j11 != -9223372036854775807L) {
                    j11 += j13;
                }
            }
        }
        if (j11 == -9223372036854775807L) {
            if (j12 != -9223372036854775807L) {
                j11 = j10 + j12;
            } else if (cVar != null) {
                long j14 = cVar.e;
                if (j14 != -9223372036854775807L) {
                    j3 = j14;
                    return new c(xmlPullParser.getName(), null, j10, j3, h10, strArr, str2, str, cVar);
                }
            }
        }
        j3 = j11;
        return new c(xmlPullParser.getName(), null, j10, j3, h10, strArr, str2, str, cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g h(XmlPullParser xmlPullParser, g gVar) {
        char c10;
        char c11;
        char c12;
        char c13;
        int i10;
        i1 n10;
        int i11;
        int hashCode;
        int i12;
        b bVar;
        int i13;
        char c14;
        int attributeCount = xmlPullParser.getAttributeCount();
        g gVar2 = gVar;
        for (int i14 = 0; i14 < attributeCount; i14++) {
            String attributeValue = xmlPullParser.getAttributeValue(i14);
            String attributeName = xmlPullParser.getAttributeName(i14);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c10 = '\r';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c10 = 14;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c10 = 15;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c10 = 16;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (c10) {
                case 0:
                    gVar2 = a(gVar2);
                    gVar2.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    gVar2 = a(gVar2);
                    gVar2.u = attributeValue;
                    break;
                case 2:
                    gVar2 = a(gVar2);
                    gVar2.a = attributeValue;
                    break;
                case 3:
                    gVar2 = a(gVar2);
                    String b10 = r6.b(attributeValue);
                    b10.getClass();
                    switch (b10.hashCode()) {
                        case -1364013995:
                            if (b10.equals("center")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 100571:
                            if (b10.equals("end")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3317767:
                            if (b10.equals("left")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 108511772:
                            if (b10.equals("right")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 109757538:
                            if (b10.equals("start")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    gVar2.o = alignment;
                    break;
                case 4:
                    gVar2 = a(gVar2);
                    gVar2.t = attributeValue;
                    break;
                case 5:
                    String b11 = r6.b(attributeValue);
                    b11.getClass();
                    switch (b11.hashCode()) {
                        case -1461280213:
                            if (b11.equals("nounderline")) {
                                c12 = 0;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -1026963764:
                            if (b11.equals("underline")) {
                                c12 = 1;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 913457136:
                            if (b11.equals("nolinethrough")) {
                                c12 = 2;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 1679736913:
                            if (b11.equals("linethrough")) {
                                c12 = 3;
                                break;
                            }
                            c12 = 65535;
                            break;
                        default:
                            c12 = 65535;
                            break;
                    }
                    switch (c12) {
                        case 0:
                            gVar2 = a(gVar2);
                            gVar2.g = 0;
                            break;
                        case 1:
                            gVar2 = a(gVar2);
                            gVar2.g = 1;
                            break;
                        case 2:
                            gVar2 = a(gVar2);
                            gVar2.f = 0;
                            break;
                        case 3:
                            gVar2 = a(gVar2);
                            gVar2.f = 1;
                            break;
                    }
                case 6:
                    gVar2 = a(gVar2);
                    gVar2.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        gVar2 = a(gVar2);
                        gVar2.l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case '\b':
                    String b12 = r6.b(attributeValue);
                    b12.getClass();
                    switch (b12.hashCode()) {
                        case -618561360:
                            if (b12.equals("baseContainer")) {
                                c13 = 0;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case -410956671:
                            if (b12.equals("container")) {
                                c13 = 1;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case -250518009:
                            if (b12.equals("delimiter")) {
                                c13 = 2;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case -136074796:
                            if (b12.equals("textContainer")) {
                                c13 = 3;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 3016401:
                            if (b12.equals("base")) {
                                c13 = 4;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 3556653:
                            if (b12.equals("text")) {
                                c13 = 5;
                                break;
                            }
                            c13 = 65535;
                            break;
                        default:
                            c13 = 65535;
                            break;
                    }
                    switch (c13) {
                        case 0:
                        case 4:
                            gVar2 = a(gVar2);
                            gVar2.m = 2;
                            break;
                        case 1:
                            gVar2 = a(gVar2);
                            gVar2.m = 1;
                            break;
                        case 2:
                            gVar2 = a(gVar2);
                            gVar2.m = 4;
                            break;
                        case 3:
                        case 5:
                            gVar2 = a(gVar2);
                            gVar2.m = 3;
                            break;
                    }
                case '\t':
                    gVar2 = a(gVar2);
                    try {
                        gVar2.b = e2.f.a(attributeValue, false);
                        gVar2.c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        e2.s("Failed parsing color value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\n':
                    g a2 = a(gVar2);
                    Matcher matcher = e.matcher(attributeValue);
                    float f7 = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f7 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e7) {
                            e2.a.o("TtmlParser", "Failed to parse shear: " + attributeValue, e7);
                        }
                    } else {
                        e2.s("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    a2.s = f7;
                    gVar2 = a2;
                    break;
                case 11:
                    String b13 = r6.b(attributeValue);
                    b13.getClass();
                    if (b13.equals("all")) {
                        gVar2 = a(gVar2);
                        gVar2.q = 1;
                        break;
                    } else if (b13.equals("none")) {
                        gVar2 = a(gVar2);
                        gVar2.q = 0;
                        break;
                    } else {
                        break;
                    }
                case '\f':
                    try {
                        gVar2 = a(gVar2);
                        d(attributeValue, gVar2);
                        break;
                    } catch (z3.f unused2) {
                        e2.s("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\r':
                    gVar2 = a(gVar2);
                    Pattern pattern = b.d;
                    if (attributeValue != null) {
                        String b14 = r6.b(attributeValue.trim());
                        if (!b14.isEmpty()) {
                            String[] split = TextUtils.split(b14, b.d);
                            int length = split.length;
                            m0 u10 = length != 0 ? length != 1 ? m0.u(split.length, (Object[]) split.clone()) : new m1(split[0]) : g1.s;
                            String str = (String) q.k(q.n(b.h, u10), "outside");
                            int hashCode2 = str.hashCode();
                            if (hashCode2 != -1392885889) {
                                if (hashCode2 != -1106037339) {
                                    if (hashCode2 == 92734940 && str.equals("after")) {
                                        i10 = 2;
                                        n10 = q.n(b.e, u10);
                                        if (n10.isEmpty()) {
                                            i1 n11 = q.n(b.g, u10);
                                            i1 n12 = q.n(b.f, u10);
                                            if (n11.isEmpty() && n12.isEmpty()) {
                                                bVar = new b(-1, 0, i10);
                                            } else {
                                                String str2 = (String) q.k(n11, "filled");
                                                int hashCode3 = str2.hashCode();
                                                if (hashCode3 == -1274499742) {
                                                    str2.equals("filled");
                                                } else if (hashCode3 == 3417674 && str2.equals("open")) {
                                                    i11 = 2;
                                                    String str3 = (String) q.k(n12, "circle");
                                                    hashCode = str3.hashCode();
                                                    if (hashCode != -1360216880) {
                                                        str3.equals("circle");
                                                    } else if (hashCode != -905816648) {
                                                        if (hashCode == 99657 && str3.equals("dot")) {
                                                            i12 = 2;
                                                            bVar = new b(i12, i11, i10);
                                                        }
                                                    } else if (str3.equals("sesame")) {
                                                        i12 = 3;
                                                        bVar = new b(i12, i11, i10);
                                                    }
                                                    i12 = 1;
                                                    bVar = new b(i12, i11, i10);
                                                }
                                                i11 = 1;
                                                String str32 = (String) q.k(n12, "circle");
                                                hashCode = str32.hashCode();
                                                if (hashCode != -1360216880) {
                                                }
                                                i12 = 1;
                                                bVar = new b(i12, i11, i10);
                                            }
                                        } else {
                                            String str4 = (String) new n0(n10).next();
                                            int hashCode4 = str4.hashCode();
                                            if (hashCode4 == 3005871) {
                                                str4.equals("auto");
                                            } else if (hashCode4 == 3387192 && str4.equals("none")) {
                                                i13 = 0;
                                                bVar = new b(i13, 0, i10);
                                            }
                                            i13 = -1;
                                            bVar = new b(i13, 0, i10);
                                        }
                                    }
                                } else if (str.equals("outside")) {
                                    i10 = -2;
                                    n10 = q.n(b.e, u10);
                                    if (n10.isEmpty()) {
                                    }
                                }
                                gVar2.r = bVar;
                                break;
                            } else {
                                str.equals("before");
                            }
                            i10 = 1;
                            n10 = q.n(b.e, u10);
                            if (n10.isEmpty()) {
                            }
                            gVar2.r = bVar;
                        }
                    }
                    bVar = null;
                    gVar2.r = bVar;
                    break;
                case 14:
                    String b15 = r6.b(attributeValue);
                    b15.getClass();
                    if (b15.equals("before")) {
                        gVar2 = a(gVar2);
                        gVar2.n = 1;
                        break;
                    } else if (b15.equals("after")) {
                        gVar2 = a(gVar2);
                        gVar2.n = 2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    gVar2 = a(gVar2);
                    try {
                        gVar2.d = e2.f.a(attributeValue, false);
                        gVar2.e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        e2.s("Failed parsing background value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case 16:
                    gVar2 = a(gVar2);
                    String b16 = r6.b(attributeValue);
                    b16.getClass();
                    switch (b16.hashCode()) {
                        case -1364013995:
                            if (b16.equals("center")) {
                                c14 = 0;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 100571:
                            if (b16.equals("end")) {
                                c14 = 1;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 3317767:
                            if (b16.equals("left")) {
                                c14 = 2;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 108511772:
                            if (b16.equals("right")) {
                                c14 = 3;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 109757538:
                            if (b16.equals("start")) {
                                c14 = 4;
                                break;
                            }
                            c14 = 65535;
                            break;
                        default:
                            c14 = 65535;
                            break;
                    }
                    switch (c14) {
                        case 0:
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    gVar2.p = alignment;
                    break;
            }
        }
        return gVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long i(String str, d dVar) {
        double d10;
        double d11;
        Matcher matcher = b.matcher(str);
        char c10 = 4;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / dVar.c : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / dVar.a) / dVar.c : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = c.matcher(str);
        if (!matcher2.matches()) {
            throw new z3.f(org.telegram.ui.Cells.r6.i("Malformed time expression: ", str));
        }
        String group3 = matcher2.group(1);
        group3.getClass();
        double parseDouble = Double.parseDouble(group3);
        String group4 = matcher2.group(2);
        group4.getClass();
        switch (group4.hashCode()) {
            case 102:
                if (group4.equals("f")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 104:
                if (group4.equals("h")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 109:
                if (group4.equals("m")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 116:
                if (group4.equals("t")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3494:
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                d10 = dVar.c;
                parseDouble /= d10;
                break;
            case 1:
                d11 = 3600.0d;
                break;
            case 2:
                d11 = 60.0d;
                break;
            case 3:
                d10 = dVar.b;
                parseDouble /= d10;
                break;
            case 4:
                d10 = 1000.0d;
                parseDouble /= d10;
                break;
        }
        parseDouble *= d11;
        return (long) (parseDouble * 1000000.0d);
    }

    public static q0 j(XmlPullParser xmlPullParser) {
        String k10 = e2.d.k(xmlPullParser, "extent");
        if (k10 == null) {
            return null;
        }
        Matcher matcher = h.matcher(k10);
        if (!matcher.matches()) {
            e2.a.n("TtmlParser", "Ignoring non-pixel tts extent: ".concat(k10));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new q0(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            e2.a.n("TtmlParser", "Ignoring malformed tts extent: ".concat(k10));
            return null;
        }
    }

    @Override // z3.m
    public final void A(byte[] bArr, int i10, int i11, l lVar, h hVar) {
        c9.b(k(i10, i11, bArr), lVar, hVar);
    }

    @Override // z3.m
    public final z3.d k(int i10, int i11, byte[] bArr) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new f("", -3.4028235E38f, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, TLObject.FLAG_31, -3.4028235E38f, TLObject.FLAG_31));
            q0 q0Var = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            d dVar = r;
            u6 u6Var = null;
            int i12 = 15;
            int i13 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i13 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            dVar = e(newPullParser);
                            i12 = c(newPullParser);
                            q0Var = j(newPullParser);
                        }
                        d dVar2 = dVar;
                        q0 q0Var2 = q0Var;
                        int i14 = i12;
                        if (b(name)) {
                            if ("head".equals(name)) {
                                f(newPullParser, hashMap, i14, q0Var2, hashMap2, hashMap3);
                            } else {
                                try {
                                    c g10 = g(newPullParser, cVar, hashMap2, dVar2);
                                    arrayDeque.push(g10);
                                    if (cVar != null) {
                                        if (cVar.m == null) {
                                            cVar.m = new ArrayList();
                                        }
                                        cVar.m.add(g10);
                                    }
                                } catch (z3.f e7) {
                                    e2.a.o("TtmlParser", "Suppressing parser error", e7);
                                }
                            }
                            i12 = i14;
                            q0Var = q0Var2;
                            dVar = dVar2;
                        } else {
                            e2.a.i("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        }
                        i13++;
                        i12 = i14;
                        q0Var = q0Var2;
                        dVar = dVar2;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c a2 = c.a(newPullParser.getText());
                        if (cVar.m == null) {
                            cVar.m = new ArrayList();
                        }
                        cVar.m.add(a2);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            u6Var = new u6(cVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i13++;
                } else if (eventType == 3) {
                    i13--;
                }
                newPullParser.next();
            }
            u6Var.getClass();
            return u6Var;
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected error when reading input.", e10);
        } catch (XmlPullParserException e11) {
            throw new IllegalStateException("Unable to decode source", e11);
        }
    }

    @Override // z3.m
    public final int n() {
        return 1;
    }

    @Override // z3.m
    public final /* synthetic */ void reset() {
    }
}
