package h4;

import a1.g;
import android.text.Layout;
import android.text.TextUtils;
import b4.l;
import b4.m;
import b8.g1;
import b8.ke;
import b8.xb;
import b8.zb;
import ci.k5;
import d2.t0;
import g2.i;
import g2.k;
import g2.n0;
import g9.b2;
import g9.e2;
import g9.o;
import g9.v0;
import g9.z1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d implements m {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern h = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern n = Pattern.compile("^(\\d+) (\\d+)$");
    public static final k5 r = new k5(30.0f, 1, 1);
    public final XmlPullParserFactory a;

    public d() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static f a(f fVar) {
        return fVar == null ? new f() : fVar;
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
            g2.a.l("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
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
            zb.b(parseInt, parseInt2, "Invalid cell resolution %s %s", z10);
            return parseInt2;
        } catch (NumberFormatException unused) {
            g2.a.l("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, f fVar) {
        Matcher matcher;
        String group;
        String str2 = n0.a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new b4.f(g.o(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(split[1]);
            g2.a.l("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new b4.f(g.q("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        switch (group) {
            case "%":
                fVar.j = 3;
                break;
            case "em":
                fVar.j = 2;
                break;
            case "px":
                fVar.j = 1;
                break;
            default:
                throw new b4.f(g.q("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        fVar.k = Float.parseFloat(group2);
    }

    public static k5 e(XmlPullParser xmlPullParser) {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = n0.a;
            zb.e("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        k5 k5Var = r;
        int i3 = k5Var.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i10 = k5Var.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i10 = Integer.parseInt(attributeValue4);
        }
        return new k5(parseInt * f10, i3, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(XmlPullParser xmlPullParser, HashMap hashMap, int i3, t0 t0Var, HashMap hashMap2, HashMap hashMap3) {
        String f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i10;
        String f17;
        int i11;
        e eVar;
        char c2;
        float parseFloat;
        float parseFloat2;
        String f18;
        f fVar;
        String f19;
        f fVar2;
        String[] split;
        do {
            xmlPullParser.next();
            if (g2.a.i(xmlPullParser, "style")) {
                String f20 = g2.a.f(xmlPullParser, "style");
                f h7 = h(xmlPullParser, new f());
                if (f20 != null) {
                    String trim = f20.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str = n0.a;
                        split = trim.split("\\s+", -1);
                    }
                    for (String str2 : split) {
                        h7.a((f) hashMap.get(str2));
                    }
                }
                String str3 = h7.l;
                if (str3 != null) {
                    hashMap.put(str3, h7);
                }
            } else if (g2.a.i(xmlPullParser, "region")) {
                String f21 = g2.a.f(xmlPullParser, "id");
                if (f21 != null) {
                    String f22 = g2.a.f(xmlPullParser, "origin");
                    if (f22 == null && (f19 = g2.a.f(xmlPullParser, "style")) != null && (fVar2 = (f) hashMap.get(f19)) != null) {
                        f22 = fVar2.t;
                    }
                    int i12 = 2;
                    Pattern pattern = h;
                    Pattern pattern2 = f;
                    if (f22 != null) {
                        Matcher matcher = pattern2.matcher(f22);
                        Matcher matcher2 = pattern.matcher(f22);
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                group.getClass();
                                f13 = Float.parseFloat(group) / 100.0f;
                                String group2 = matcher.group(2);
                                group2.getClass();
                                f12 = Float.parseFloat(group2) / 100.0f;
                                f11 = 100.0f;
                            } catch (NumberFormatException unused) {
                                g2.a.l("TtmlParser", "Ignoring region with malformed origin: ".concat(f22));
                            }
                        } else if (!matcher2.matches()) {
                            g2.a.l("TtmlParser", "Ignoring region with unsupported origin: ".concat(f22));
                        } else if (t0Var == null) {
                            g2.a.l("TtmlParser", "Ignoring region with missing tts:extent: ".concat(f22));
                        } else {
                            try {
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                int parseInt = Integer.parseInt(group3);
                                String group4 = matcher2.group(2);
                                group4.getClass();
                                f11 = 100.0f;
                                float f23 = parseInt / t0Var.a;
                                float parseInt2 = Integer.parseInt(group4) / t0Var.b;
                                f13 = f23;
                                f12 = parseInt2;
                            } catch (NumberFormatException unused2) {
                                g2.a.l("TtmlParser", "Ignoring region with malformed origin: ".concat(f22));
                            }
                        }
                    } else {
                        f11 = 100.0f;
                        f12 = 0.0f;
                        f13 = 0.0f;
                    }
                    String f24 = g2.a.f(xmlPullParser, "extent");
                    if (f24 == null && (f18 = g2.a.f(xmlPullParser, "style")) != null && (fVar = (f) hashMap.get(f18)) != null) {
                        f24 = fVar.u;
                    }
                    if (f24 != null) {
                        Matcher matcher3 = pattern2.matcher(f24);
                        Matcher matcher4 = pattern.matcher(f24);
                        if (matcher3.matches()) {
                            try {
                                String group5 = matcher3.group(1);
                                group5.getClass();
                                parseFloat = Float.parseFloat(group5) / f11;
                                String group6 = matcher3.group(2);
                                group6.getClass();
                                parseFloat2 = Float.parseFloat(group6) / f11;
                            } catch (NumberFormatException unused3) {
                                com.google.android.recaptcha.internal.a.q("Ignoring region with malformed extent: ", f22, "TtmlParser");
                            }
                        } else if (!matcher4.matches()) {
                            com.google.android.recaptcha.internal.a.q("Ignoring region with unsupported extent: ", f22, "TtmlParser");
                        } else if (t0Var == null) {
                            com.google.android.recaptcha.internal.a.q("Ignoring region with missing tts:extent: ", f22, "TtmlParser");
                        } else {
                            String group7 = matcher4.group(1);
                            group7.getClass();
                            int parseInt3 = Integer.parseInt(group7);
                            String group8 = matcher4.group(2);
                            group8.getClass();
                            float f25 = parseInt3 / t0Var.a;
                            parseFloat2 = Integer.parseInt(group8) / t0Var.b;
                            parseFloat = f25;
                        }
                        f14 = parseFloat;
                        f15 = parseFloat2;
                    } else {
                        f14 = 1.0f;
                        f15 = 1.0f;
                    }
                    String f26 = g2.a.f(xmlPullParser, "displayAlign");
                    if (f26 != null) {
                        String c10 = xb.c(f26);
                        c10.getClass();
                        if (c10.equals("center")) {
                            f16 = f12 + (f15 / 2.0f);
                            i10 = 1;
                        } else if (c10.equals("after")) {
                            f16 = f12 + f15;
                            i10 = 2;
                        }
                        float f27 = 1.0f / i3;
                        f17 = g2.a.f(xmlPullParser, "writingMode");
                        if (f17 != null) {
                            String c11 = xb.c(f17);
                            c11.getClass();
                            switch (c11.hashCode()) {
                                case 3694:
                                    if (c11.equals("tb")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3553396:
                                    if (c11.equals("tblr")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3553576:
                                    if (c11.equals("tbrl")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                case 1:
                                    i11 = i12;
                                    break;
                                case 2:
                                    i11 = 1;
                                    break;
                            }
                            eVar = new e(f21, f13, f16, 0, i10, f14, f15, 1, f27, i11);
                            if (eVar != null) {
                                hashMap2.put(eVar.a, eVar);
                            }
                        }
                        i12 = TLObject.FLAG_31;
                        i11 = i12;
                        eVar = new e(f21, f13, f16, 0, i10, f14, f15, 1, f27, i11);
                        if (eVar != null) {
                        }
                    }
                    f16 = f12;
                    i10 = 0;
                    float f272 = 1.0f / i3;
                    f17 = g2.a.f(xmlPullParser, "writingMode");
                    if (f17 != null) {
                    }
                    i12 = TLObject.FLAG_31;
                    i11 = i12;
                    eVar = new e(f21, f13, f16, 0, i10, f14, f15, 1, f272, i11);
                    if (eVar != null) {
                    }
                }
                eVar = null;
                if (eVar != null) {
                }
            } else if (g2.a.i(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (g2.a.i(xmlPullParser, "image") && (f10 = g2.a.f(xmlPullParser, "id")) != null) {
                        hashMap3.put(f10, xmlPullParser.nextText());
                    }
                } while (!g2.a.h(xmlPullParser, "metadata"));
            }
        } while (!g2.a.h(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static c g(XmlPullParser xmlPullParser, c cVar, HashMap hashMap, k5 k5Var) {
        long j10;
        char c2;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        f h7 = h(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlPullParser.getAttributeName(i3);
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j13 = i(attributeValue, k5Var);
                    break;
                case 2:
                    j12 = i(attributeValue, k5Var);
                    break;
                case 3:
                    j11 = i(attributeValue, k5Var);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = n0.a;
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
            long j14 = cVar.d;
            if (j14 != -9223372036854775807L) {
                if (j11 != -9223372036854775807L) {
                    j11 += j14;
                }
                if (j12 != -9223372036854775807L) {
                    j12 += j14;
                }
            }
        }
        if (j12 == -9223372036854775807L) {
            if (j13 != -9223372036854775807L) {
                j12 = j11 + j13;
            } else if (cVar != null) {
                long j15 = cVar.e;
                if (j15 != -9223372036854775807L) {
                    j10 = j15;
                    return new c(xmlPullParser.getName(), null, j11, j10, h7, strArr, str2, str, cVar);
                }
            }
        }
        j10 = j12;
        return new c(xmlPullParser.getName(), null, j11, j10, h7, strArr, str2, str, cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a5  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f h(XmlPullParser xmlPullParser, f fVar) {
        char c2;
        ?? r9;
        boolean z10;
        char c10;
        int i3;
        b2 p10;
        int i10;
        int hashCode;
        int i11;
        b bVar;
        int i12;
        char c11;
        int attributeCount = xmlPullParser.getAttributeCount();
        f fVar2 = fVar;
        for (int i13 = 0; i13 < attributeCount; i13++) {
            String attributeValue = xmlPullParser.getAttributeValue(i13);
            String attributeName = xmlPullParser.getAttributeName(i13);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (c2) {
                case 0:
                    fVar2 = a(fVar2);
                    fVar2.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    fVar2 = a(fVar2);
                    fVar2.u = attributeValue;
                    break;
                case 2:
                    fVar2 = a(fVar2);
                    fVar2.a = attributeValue;
                    break;
                case 3:
                    fVar2 = a(fVar2);
                    String c12 = xb.c(attributeValue);
                    c12.getClass();
                    switch (c12.hashCode()) {
                        case -1364013995:
                            if (c12.equals("center")) {
                                r9 = false;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 100571:
                            if (c12.equals("end")) {
                                r9 = true;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 3317767:
                            if (c12.equals("left")) {
                                r9 = 2;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 108511772:
                            if (c12.equals("right")) {
                                r9 = 3;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 109757538:
                            if (c12.equals("start")) {
                                r9 = 4;
                                break;
                            }
                            r9 = -1;
                            break;
                        default:
                            r9 = -1;
                            break;
                    }
                    switch (r9) {
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
                    fVar2.o = alignment;
                    break;
                case 4:
                    fVar2 = a(fVar2);
                    fVar2.t = attributeValue;
                    break;
                case 5:
                    String c13 = xb.c(attributeValue);
                    c13.getClass();
                    switch (c13.hashCode()) {
                        case -1461280213:
                            if (c13.equals("nounderline")) {
                                z10 = false;
                                break;
                            }
                            z10 = -1;
                            break;
                        case -1026963764:
                            if (c13.equals("underline")) {
                                z10 = true;
                                break;
                            }
                            z10 = -1;
                            break;
                        case 913457136:
                            if (c13.equals("nolinethrough")) {
                                z10 = 2;
                                break;
                            }
                            z10 = -1;
                            break;
                        case 1679736913:
                            if (c13.equals("linethrough")) {
                                z10 = 3;
                                break;
                            }
                            z10 = -1;
                            break;
                        default:
                            z10 = -1;
                            break;
                    }
                    switch (z10) {
                        case false:
                            fVar2 = a(fVar2);
                            fVar2.g = 0;
                            break;
                        case true:
                            fVar2 = a(fVar2);
                            fVar2.g = 1;
                            break;
                        case true:
                            fVar2 = a(fVar2);
                            fVar2.f = 0;
                            break;
                        case true:
                            fVar2 = a(fVar2);
                            fVar2.f = 1;
                            break;
                    }
                case 6:
                    fVar2 = a(fVar2);
                    fVar2.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        fVar2 = a(fVar2);
                        fVar2.l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case '\b':
                    String c14 = xb.c(attributeValue);
                    c14.getClass();
                    switch (c14.hashCode()) {
                        case -618561360:
                            if (c14.equals("baseContainer")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -410956671:
                            if (c14.equals("container")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -250518009:
                            if (c14.equals("delimiter")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -136074796:
                            if (c14.equals("textContainer")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3016401:
                            if (c14.equals("base")) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3556653:
                            if (c14.equals("text")) {
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
                        case 4:
                            fVar2 = a(fVar2);
                            fVar2.m = 2;
                            break;
                        case 1:
                            fVar2 = a(fVar2);
                            fVar2.m = 1;
                            break;
                        case 2:
                            fVar2 = a(fVar2);
                            fVar2.m = 4;
                            break;
                        case 3:
                        case 5:
                            fVar2 = a(fVar2);
                            fVar2.m = 3;
                            break;
                    }
                case '\t':
                    fVar2 = a(fVar2);
                    try {
                        fVar2.b = i.a(attributeValue, false);
                        fVar2.c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        com.google.android.recaptcha.internal.a.q("Failed parsing color value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\n':
                    f a10 = a(fVar2);
                    Matcher matcher = e.matcher(attributeValue);
                    float f10 = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f10 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e10) {
                            g2.a.m("TtmlParser", "Failed to parse shear: " + attributeValue, e10);
                        }
                    } else {
                        com.google.android.recaptcha.internal.a.q("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    a10.s = f10;
                    fVar2 = a10;
                    break;
                case 11:
                    String c15 = xb.c(attributeValue);
                    c15.getClass();
                    if (c15.equals("all")) {
                        fVar2 = a(fVar2);
                        fVar2.q = 1;
                        break;
                    } else if (c15.equals("none")) {
                        fVar2 = a(fVar2);
                        fVar2.q = 0;
                        break;
                    } else {
                        break;
                    }
                case '\f':
                    try {
                        fVar2 = a(fVar2);
                        d(attributeValue, fVar2);
                        break;
                    } catch (b4.f unused2) {
                        com.google.android.recaptcha.internal.a.q("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\r':
                    fVar2 = a(fVar2);
                    Pattern pattern = b.d;
                    if (attributeValue != null) {
                        String c16 = xb.c(attributeValue.trim());
                        if (!c16.isEmpty()) {
                            String[] split = TextUtils.split(c16, b.d);
                            int length = split.length;
                            g9.t0 p11 = length != 0 ? length != 1 ? g9.t0.p(split.length, (Object[]) split.clone()) : new e2(split[0]) : z1.s;
                            String str = (String) o.m(o.p(b.h, p11), "outside");
                            int hashCode2 = str.hashCode();
                            if (hashCode2 != -1392885889) {
                                if (hashCode2 != -1106037339) {
                                    if (hashCode2 == 92734940 && str.equals("after")) {
                                        i3 = 2;
                                        p10 = o.p(b.e, p11);
                                        if (p10.isEmpty()) {
                                            b2 p12 = o.p(b.g, p11);
                                            b2 p13 = o.p(b.f, p11);
                                            if (p12.isEmpty() && p13.isEmpty()) {
                                                bVar = new b(-1, 0, i3);
                                            } else {
                                                String str2 = (String) o.m(p12, "filled");
                                                int hashCode3 = str2.hashCode();
                                                if (hashCode3 == -1274499742) {
                                                    str2.equals("filled");
                                                } else if (hashCode3 == 3417674 && str2.equals("open")) {
                                                    i10 = 2;
                                                    String str3 = (String) o.m(p13, "circle");
                                                    hashCode = str3.hashCode();
                                                    if (hashCode != -1360216880) {
                                                        str3.equals("circle");
                                                    } else if (hashCode != -905816648) {
                                                        if (hashCode == 99657 && str3.equals("dot")) {
                                                            i11 = 2;
                                                            bVar = new b(i11, i10, i3);
                                                        }
                                                    } else if (str3.equals("sesame")) {
                                                        i11 = 3;
                                                        bVar = new b(i11, i10, i3);
                                                    }
                                                    i11 = 1;
                                                    bVar = new b(i11, i10, i3);
                                                }
                                                i10 = 1;
                                                String str32 = (String) o.m(p13, "circle");
                                                hashCode = str32.hashCode();
                                                if (hashCode != -1360216880) {
                                                }
                                                i11 = 1;
                                                bVar = new b(i11, i10, i3);
                                            }
                                        } else {
                                            String str4 = (String) new v0(p10).next();
                                            int hashCode4 = str4.hashCode();
                                            if (hashCode4 == 3005871) {
                                                str4.equals("auto");
                                            } else if (hashCode4 == 3387192 && str4.equals("none")) {
                                                i12 = 0;
                                                bVar = new b(i12, 0, i3);
                                            }
                                            i12 = -1;
                                            bVar = new b(i12, 0, i3);
                                        }
                                    }
                                } else if (str.equals("outside")) {
                                    i3 = -2;
                                    p10 = o.p(b.e, p11);
                                    if (p10.isEmpty()) {
                                    }
                                }
                                fVar2.r = bVar;
                                break;
                            } else {
                                str.equals("before");
                            }
                            i3 = 1;
                            p10 = o.p(b.e, p11);
                            if (p10.isEmpty()) {
                            }
                            fVar2.r = bVar;
                        }
                    }
                    bVar = null;
                    fVar2.r = bVar;
                    break;
                case 14:
                    String c17 = xb.c(attributeValue);
                    c17.getClass();
                    if (c17.equals("before")) {
                        fVar2 = a(fVar2);
                        fVar2.n = 1;
                        break;
                    } else if (c17.equals("after")) {
                        fVar2 = a(fVar2);
                        fVar2.n = 2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    fVar2 = a(fVar2);
                    try {
                        fVar2.d = i.a(attributeValue, false);
                        fVar2.e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        com.google.android.recaptcha.internal.a.q("Failed parsing background value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case 16:
                    fVar2 = a(fVar2);
                    String c18 = xb.c(attributeValue);
                    c18.getClass();
                    switch (c18.hashCode()) {
                        case -1364013995:
                            if (c18.equals("center")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 100571:
                            if (c18.equals("end")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3317767:
                            if (c18.equals("left")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 108511772:
                            if (c18.equals("right")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 109757538:
                            if (c18.equals("start")) {
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
                    fVar2.p = alignment;
                    break;
            }
        }
        return fVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long i(String str, k5 k5Var) {
        double d10;
        double d11;
        Matcher matcher = b.matcher(str);
        char c2 = 4;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / k5Var.a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / k5Var.b) / k5Var.a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = c.matcher(str);
        if (!matcher2.matches()) {
            throw new b4.f(t4.c.f("Malformed time expression: ", str));
        }
        String group3 = matcher2.group(1);
        group3.getClass();
        double parseDouble = Double.parseDouble(group3);
        String group4 = matcher2.group(2);
        group4.getClass();
        switch (group4.hashCode()) {
            case hs.n1 /* 102 */:
                if (group4.equals("f")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case hs.p1 /* 104 */:
                if (group4.equals("h")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case hs.u1 /* 109 */:
                if (group4.equals("m")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case hs.B1 /* 116 */:
                if (group4.equals("t")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3494:
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                d10 = k5Var.a;
                parseDouble /= d10;
                break;
            case 1:
                d11 = 3600.0d;
                break;
            case 2:
                d11 = 60.0d;
                break;
            case 3:
                d10 = k5Var.c;
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

    public static t0 j(XmlPullParser xmlPullParser) {
        String f10 = g2.a.f(xmlPullParser, "extent");
        if (f10 == null) {
            return null;
        }
        Matcher matcher = h.matcher(f10);
        if (!matcher.matches()) {
            g2.a.l("TtmlParser", "Ignoring non-pixel tts extent: ".concat(f10));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new t0(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            g2.a.l("TtmlParser", "Ignoring malformed tts extent: ".concat(f10));
            return null;
        }
    }

    @Override // b4.m
    public final b4.d B(int i3, int i10, byte[] bArr) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e("", -3.4028235E38f, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, TLObject.FLAG_31, -3.4028235E38f, TLObject.FLAG_31));
            t0 t0Var = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i3, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            k5 k5Var = r;
            int i11 = 0;
            int i12 = 15;
            ke keVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            k5Var = e(newPullParser);
                            i12 = c(newPullParser);
                            t0Var = j(newPullParser);
                        }
                        k5 k5Var2 = k5Var;
                        t0 t0Var2 = t0Var;
                        int i13 = i12;
                        if (b(name)) {
                            if ("head".equals(name)) {
                                f(newPullParser, hashMap, i13, t0Var2, hashMap2, hashMap3);
                            } else {
                                try {
                                    c g7 = g(newPullParser, cVar, hashMap2, k5Var2);
                                    arrayDeque.push(g7);
                                    if (cVar != null) {
                                        if (cVar.m == null) {
                                            cVar.m = new ArrayList();
                                        }
                                        cVar.m.add(g7);
                                    }
                                } catch (b4.f e10) {
                                    g2.a.m("TtmlParser", "Suppressing parser error", e10);
                                }
                            }
                            i12 = i13;
                            t0Var = t0Var2;
                            k5Var = k5Var2;
                        } else {
                            g2.a.g("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        }
                        i11++;
                        i12 = i13;
                        t0Var = t0Var2;
                        k5Var = k5Var2;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c a10 = c.a(newPullParser.getText());
                        if (cVar.m == null) {
                            cVar.m = new ArrayList();
                        }
                        cVar.m.add(a10);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            keVar = new ke(cVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                newPullParser.next();
            }
            keVar.getClass();
            return keVar;
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    @Override // b4.m
    public final void F(byte[] bArr, int i3, int i10, l lVar, k kVar) {
        g1.b(B(i3, i10, bArr), lVar, kVar);
    }

    @Override // b4.m
    public final int Y() {
        return 1;
    }

    @Override // b4.m
    public final /* synthetic */ void reset() {
    }
}
