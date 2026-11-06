package i4;

import a8.ga;
import a8.ia;
import a8.p0;
import a8.r7;
import a8.t7;
import android.text.Layout;
import android.text.TextUtils;
import bi.g6;
import c4.l;
import c4.m;
import e2.r0;
import h2.h;
import h2.j;
import h2.m0;
import h9.a2;
import h9.c2;
import h9.f2;
import h9.o;
import h9.t0;
import h9.v0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class d implements m {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern h = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern n = Pattern.compile("^(\\d+) (\\d+)$");
    public static final g6 r = new g6(30.0f, 1, 1);
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

    public static int d(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = n.matcher(attributeValue);
        if (!matcher.matches()) {
            h2.a.l("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z9 = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z9 = false;
            }
            ia.b(parseInt, parseInt2, "Invalid cell resolution %s %s", z9);
            return parseInt2;
        } catch (NumberFormatException unused) {
            h2.a.l("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void e(String str, f fVar) {
        Matcher matcher;
        String group;
        String str2 = m0.a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new c4.f(p0.n(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(split[1]);
            h2.a.l("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new c4.f(p0.p("Invalid expression for fontSize: '", str, "'."));
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
                throw new c4.f(p0.p("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        fVar.k = Float.parseFloat(group2);
    }

    public static g6 f(XmlPullParser xmlPullParser) {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = m0.a;
            ia.e("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        g6 g6Var = r;
        int i7 = g6Var.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i7 = Integer.parseInt(attributeValue3);
        }
        int i10 = g6Var.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i10 = Integer.parseInt(attributeValue4);
        }
        return new g6(parseInt * f10, i7, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(XmlPullParser xmlPullParser, HashMap hashMap, int i7, r0 r0Var, HashMap hashMap2, HashMap hashMap3) {
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
        char c10;
        float parseFloat;
        float parseFloat2;
        String f18;
        f fVar;
        String f19;
        f fVar2;
        String[] split;
        do {
            xmlPullParser.next();
            if (h2.a.i(xmlPullParser, "style")) {
                String f20 = h2.a.f(xmlPullParser, "style");
                f i12 = i(xmlPullParser, new f());
                if (f20 != null) {
                    String trim = f20.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str = m0.a;
                        split = trim.split("\\s+", -1);
                    }
                    for (String str2 : split) {
                        i12.a((f) hashMap.get(str2));
                    }
                }
                String str3 = i12.l;
                if (str3 != null) {
                    hashMap.put(str3, i12);
                }
            } else if (h2.a.i(xmlPullParser, "region")) {
                String f21 = h2.a.f(xmlPullParser, "id");
                if (f21 != null) {
                    String f22 = h2.a.f(xmlPullParser, "origin");
                    if (f22 == null && (f19 = h2.a.f(xmlPullParser, "style")) != null && (fVar2 = (f) hashMap.get(f19)) != null) {
                        f22 = fVar2.t;
                    }
                    int i13 = 2;
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
                                h2.a.l("TtmlParser", "Ignoring region with malformed origin: ".concat(f22));
                            }
                        } else if (!matcher2.matches()) {
                            h2.a.l("TtmlParser", "Ignoring region with unsupported origin: ".concat(f22));
                        } else if (r0Var == null) {
                            h2.a.l("TtmlParser", "Ignoring region with missing tts:extent: ".concat(f22));
                        } else {
                            try {
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                int parseInt = Integer.parseInt(group3);
                                String group4 = matcher2.group(2);
                                group4.getClass();
                                f11 = 100.0f;
                                float f23 = parseInt / r0Var.a;
                                float parseInt2 = Integer.parseInt(group4) / r0Var.b;
                                f13 = f23;
                                f12 = parseInt2;
                            } catch (NumberFormatException unused2) {
                                h2.a.l("TtmlParser", "Ignoring region with malformed origin: ".concat(f22));
                            }
                        }
                    } else {
                        f11 = 100.0f;
                        f12 = 0.0f;
                        f13 = 0.0f;
                    }
                    String f24 = h2.a.f(xmlPullParser, "extent");
                    if (f24 == null && (f18 = h2.a.f(xmlPullParser, "style")) != null && (fVar = (f) hashMap.get(f18)) != null) {
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
                                com.google.android.recaptcha.internal.a.r("Ignoring region with malformed extent: ", f22, "TtmlParser");
                            }
                        } else if (!matcher4.matches()) {
                            com.google.android.recaptcha.internal.a.r("Ignoring region with unsupported extent: ", f22, "TtmlParser");
                        } else if (r0Var == null) {
                            com.google.android.recaptcha.internal.a.r("Ignoring region with missing tts:extent: ", f22, "TtmlParser");
                        } else {
                            String group7 = matcher4.group(1);
                            group7.getClass();
                            int parseInt3 = Integer.parseInt(group7);
                            String group8 = matcher4.group(2);
                            group8.getClass();
                            float f25 = parseInt3 / r0Var.a;
                            parseFloat2 = Integer.parseInt(group8) / r0Var.b;
                            parseFloat = f25;
                        }
                        f14 = parseFloat;
                        f15 = parseFloat2;
                    } else {
                        f14 = 1.0f;
                        f15 = 1.0f;
                    }
                    String f26 = h2.a.f(xmlPullParser, "displayAlign");
                    if (f26 != null) {
                        String c11 = ga.c(f26);
                        c11.getClass();
                        if (c11.equals("center")) {
                            f16 = f12 + (f15 / 2.0f);
                            i10 = 1;
                        } else if (c11.equals("after")) {
                            f16 = f12 + f15;
                            i10 = 2;
                        }
                        float f27 = 1.0f / i7;
                        f17 = h2.a.f(xmlPullParser, "writingMode");
                        if (f17 != null) {
                            String c12 = ga.c(f17);
                            c12.getClass();
                            switch (c12.hashCode()) {
                                case 3694:
                                    if (c12.equals("tb")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 3553396:
                                    if (c12.equals("tblr")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 3553576:
                                    if (c12.equals("tbrl")) {
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
                                    i11 = i13;
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
                        i13 = TLObject.FLAG_31;
                        i11 = i13;
                        eVar = new e(f21, f13, f16, 0, i10, f14, f15, 1, f27, i11);
                        if (eVar != null) {
                        }
                    }
                    f16 = f12;
                    i10 = 0;
                    float f272 = 1.0f / i7;
                    f17 = h2.a.f(xmlPullParser, "writingMode");
                    if (f17 != null) {
                    }
                    i13 = TLObject.FLAG_31;
                    i11 = i13;
                    eVar = new e(f21, f13, f16, 0, i10, f14, f15, 1, f272, i11);
                    if (eVar != null) {
                    }
                }
                eVar = null;
                if (eVar != null) {
                }
            } else if (h2.a.i(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (h2.a.i(xmlPullParser, "image") && (f10 = h2.a.f(xmlPullParser, "id")) != null) {
                        hashMap3.put(f10, xmlPullParser.nextText());
                    }
                } while (!h2.a.h(xmlPullParser, "metadata"));
            }
        } while (!h2.a.h(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static c h(XmlPullParser xmlPullParser, c cVar, HashMap hashMap, g6 g6Var) {
        long j3;
        char c10;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        f i7 = i(xmlPullParser, null);
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
                    j12 = j(attributeValue, g6Var);
                    break;
                case 2:
                    j11 = j(attributeValue, g6Var);
                    break;
                case 3:
                    j10 = j(attributeValue, g6Var);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = m0.a;
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
                    return new c(xmlPullParser.getName(), null, j10, j3, i7, strArr, str2, str, cVar);
                }
            }
        }
        j3 = j11;
        return new c(xmlPullParser.getName(), null, j10, j3, i7, strArr, str2, str, cVar);
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
    public static f i(XmlPullParser xmlPullParser, f fVar) {
        char c10;
        ?? r92;
        boolean z9;
        char c11;
        int i7;
        c2 p10;
        int i10;
        int hashCode;
        int i11;
        b bVar;
        int i12;
        char c12;
        int attributeCount = xmlPullParser.getAttributeCount();
        f fVar2 = fVar;
        for (int i13 = 0; i13 < attributeCount; i13++) {
            String attributeValue = xmlPullParser.getAttributeValue(i13);
            String attributeName = xmlPullParser.getAttributeName(i13);
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
                    String c13 = ga.c(attributeValue);
                    c13.getClass();
                    switch (c13.hashCode()) {
                        case -1364013995:
                            if (c13.equals("center")) {
                                r92 = false;
                                break;
                            }
                            r92 = -1;
                            break;
                        case 100571:
                            if (c13.equals("end")) {
                                r92 = true;
                                break;
                            }
                            r92 = -1;
                            break;
                        case 3317767:
                            if (c13.equals("left")) {
                                r92 = 2;
                                break;
                            }
                            r92 = -1;
                            break;
                        case 108511772:
                            if (c13.equals("right")) {
                                r92 = 3;
                                break;
                            }
                            r92 = -1;
                            break;
                        case 109757538:
                            if (c13.equals("start")) {
                                r92 = 4;
                                break;
                            }
                            r92 = -1;
                            break;
                        default:
                            r92 = -1;
                            break;
                    }
                    switch (r92) {
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
                    String c14 = ga.c(attributeValue);
                    c14.getClass();
                    switch (c14.hashCode()) {
                        case -1461280213:
                            if (c14.equals("nounderline")) {
                                z9 = false;
                                break;
                            }
                            z9 = -1;
                            break;
                        case -1026963764:
                            if (c14.equals("underline")) {
                                z9 = true;
                                break;
                            }
                            z9 = -1;
                            break;
                        case 913457136:
                            if (c14.equals("nolinethrough")) {
                                z9 = 2;
                                break;
                            }
                            z9 = -1;
                            break;
                        case 1679736913:
                            if (c14.equals("linethrough")) {
                                z9 = 3;
                                break;
                            }
                            z9 = -1;
                            break;
                        default:
                            z9 = -1;
                            break;
                    }
                    switch (z9) {
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
                    String c15 = ga.c(attributeValue);
                    c15.getClass();
                    switch (c15.hashCode()) {
                        case -618561360:
                            if (c15.equals("baseContainer")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -410956671:
                            if (c15.equals("container")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -250518009:
                            if (c15.equals("delimiter")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -136074796:
                            if (c15.equals("textContainer")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3016401:
                            if (c15.equals("base")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3556653:
                            if (c15.equals("text")) {
                                c11 = 5;
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
                        fVar2.b = h.a(attributeValue, false);
                        fVar2.c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        com.google.android.recaptcha.internal.a.r("Failed parsing color value: ", attributeValue, "TtmlParser");
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
                            h2.a.m("TtmlParser", "Failed to parse shear: " + attributeValue, e10);
                        }
                    } else {
                        com.google.android.recaptcha.internal.a.r("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    a10.s = f10;
                    fVar2 = a10;
                    break;
                case 11:
                    String c16 = ga.c(attributeValue);
                    c16.getClass();
                    if (c16.equals("all")) {
                        fVar2 = a(fVar2);
                        fVar2.q = 1;
                        break;
                    } else if (c16.equals("none")) {
                        fVar2 = a(fVar2);
                        fVar2.q = 0;
                        break;
                    } else {
                        break;
                    }
                case '\f':
                    try {
                        fVar2 = a(fVar2);
                        e(attributeValue, fVar2);
                        break;
                    } catch (c4.f unused2) {
                        com.google.android.recaptcha.internal.a.r("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\r':
                    fVar2 = a(fVar2);
                    Pattern pattern = b.d;
                    if (attributeValue != null) {
                        String c17 = ga.c(attributeValue.trim());
                        if (!c17.isEmpty()) {
                            String[] split = TextUtils.split(c17, b.d);
                            int length = split.length;
                            t0 p11 = length != 0 ? length != 1 ? t0.p(split.length, (Object[]) split.clone()) : new f2(split[0]) : a2.s;
                            String str = (String) o.m(o.p(b.h, p11), "outside");
                            int hashCode2 = str.hashCode();
                            if (hashCode2 != -1392885889) {
                                if (hashCode2 != -1106037339) {
                                    if (hashCode2 == 92734940 && str.equals("after")) {
                                        i7 = 2;
                                        p10 = o.p(b.e, p11);
                                        if (p10.isEmpty()) {
                                            c2 p12 = o.p(b.g, p11);
                                            c2 p13 = o.p(b.f, p11);
                                            if (p12.isEmpty() && p13.isEmpty()) {
                                                bVar = new b(-1, 0, i7);
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
                                                            bVar = new b(i11, i10, i7);
                                                        }
                                                    } else if (str3.equals("sesame")) {
                                                        i11 = 3;
                                                        bVar = new b(i11, i10, i7);
                                                    }
                                                    i11 = 1;
                                                    bVar = new b(i11, i10, i7);
                                                }
                                                i10 = 1;
                                                String str32 = (String) o.m(p13, "circle");
                                                hashCode = str32.hashCode();
                                                if (hashCode != -1360216880) {
                                                }
                                                i11 = 1;
                                                bVar = new b(i11, i10, i7);
                                            }
                                        } else {
                                            String str4 = (String) new v0(p10).next();
                                            int hashCode4 = str4.hashCode();
                                            if (hashCode4 == 3005871) {
                                                str4.equals("auto");
                                            } else if (hashCode4 == 3387192 && str4.equals("none")) {
                                                i12 = 0;
                                                bVar = new b(i12, 0, i7);
                                            }
                                            i12 = -1;
                                            bVar = new b(i12, 0, i7);
                                        }
                                    }
                                } else if (str.equals("outside")) {
                                    i7 = -2;
                                    p10 = o.p(b.e, p11);
                                    if (p10.isEmpty()) {
                                    }
                                }
                                fVar2.r = bVar;
                                break;
                            } else {
                                str.equals("before");
                            }
                            i7 = 1;
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
                    String c18 = ga.c(attributeValue);
                    c18.getClass();
                    if (c18.equals("before")) {
                        fVar2 = a(fVar2);
                        fVar2.n = 1;
                        break;
                    } else if (c18.equals("after")) {
                        fVar2 = a(fVar2);
                        fVar2.n = 2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    fVar2 = a(fVar2);
                    try {
                        fVar2.d = h.a(attributeValue, false);
                        fVar2.e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        com.google.android.recaptcha.internal.a.r("Failed parsing background value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case 16:
                    fVar2 = a(fVar2);
                    String c19 = ga.c(attributeValue);
                    c19.getClass();
                    switch (c19.hashCode()) {
                        case -1364013995:
                            if (c19.equals("center")) {
                                c12 = 0;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 100571:
                            if (c19.equals("end")) {
                                c12 = 1;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 3317767:
                            if (c19.equals("left")) {
                                c12 = 2;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 108511772:
                            if (c19.equals("right")) {
                                c12 = 3;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 109757538:
                            if (c19.equals("start")) {
                                c12 = 4;
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
    public static long j(String str, g6 g6Var) {
        double d2;
        double d10;
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
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / g6Var.a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / g6Var.b) / g6Var.a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = c.matcher(str);
        if (!matcher2.matches()) {
            throw new c4.f(rf.b.i("Malformed time expression: ", str));
        }
        String group3 = matcher2.group(1);
        group3.getClass();
        double parseDouble = Double.parseDouble(group3);
        String group4 = matcher2.group(2);
        group4.getClass();
        switch (group4.hashCode()) {
            case qs.n1 /* 102 */:
                if (group4.equals("f")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case qs.p1 /* 104 */:
                if (group4.equals("h")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case qs.u1 /* 109 */:
                if (group4.equals("m")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case qs.B1 /* 116 */:
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
                d2 = g6Var.a;
                parseDouble /= d2;
                break;
            case 1:
                d10 = 3600.0d;
                break;
            case 2:
                d10 = 60.0d;
                break;
            case 3:
                d2 = g6Var.c;
                parseDouble /= d2;
                break;
            case 4:
                d2 = 1000.0d;
                parseDouble /= d2;
                break;
        }
        parseDouble *= d10;
        return (long) (parseDouble * 1000000.0d);
    }

    public static r0 k(XmlPullParser xmlPullParser) {
        String f10 = h2.a.f(xmlPullParser, "extent");
        if (f10 == null) {
            return null;
        }
        Matcher matcher = h.matcher(f10);
        if (!matcher.matches()) {
            h2.a.l("TtmlParser", "Ignoring non-pixel tts extent: ".concat(f10));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new r0(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            h2.a.l("TtmlParser", "Ignoring malformed tts extent: ".concat(f10));
            return null;
        }
    }

    @Override // c4.m
    public final int P() {
        return 1;
    }

    @Override // c4.m
    public final c4.d c(int i7, int i10, byte[] bArr) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e("", -3.4028235E38f, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, TLObject.FLAG_31, -3.4028235E38f, TLObject.FLAG_31));
            r0 r0Var = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i7, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            g6 g6Var = r;
            int i11 = 0;
            int i12 = 15;
            r7 r7Var = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            g6Var = f(newPullParser);
                            i12 = d(newPullParser);
                            r0Var = k(newPullParser);
                        }
                        g6 g6Var2 = g6Var;
                        r0 r0Var2 = r0Var;
                        int i13 = i12;
                        if (b(name)) {
                            if ("head".equals(name)) {
                                g(newPullParser, hashMap, i13, r0Var2, hashMap2, hashMap3);
                            } else {
                                try {
                                    c h7 = h(newPullParser, cVar, hashMap2, g6Var2);
                                    arrayDeque.push(h7);
                                    if (cVar != null) {
                                        if (cVar.m == null) {
                                            cVar.m = new ArrayList();
                                        }
                                        cVar.m.add(h7);
                                    }
                                } catch (c4.f e10) {
                                    h2.a.m("TtmlParser", "Suppressing parser error", e10);
                                }
                            }
                            i12 = i13;
                            r0Var = r0Var2;
                            g6Var = g6Var2;
                        } else {
                            h2.a.g("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        }
                        i11++;
                        i12 = i13;
                        r0Var = r0Var2;
                        g6Var = g6Var2;
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
                            r7Var = new r7(cVar2, hashMap, hashMap2, hashMap3);
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
            r7Var.getClass();
            return r7Var;
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    @Override // c4.m
    public final void z(byte[] bArr, int i7, int i10, l lVar, j jVar) {
        t7.b(c(i7, i10, bArr), lVar, jVar);
    }

    @Override // c4.m
    public final /* synthetic */ void reset() {
    }
}
