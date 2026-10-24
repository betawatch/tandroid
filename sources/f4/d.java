package f4;

import a1.g;
import ai.h6;
import android.text.Layout;
import android.text.TextUtils;
import b2.u0;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.internal.play_billing.k3;
import e2.h;
import e2.j;
import e2.m0;
import e9.a1;
import e9.e2;
import e9.g2;
import e9.k2;
import e9.s;
import e9.y0;
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
import si.o0;
import v7.s6;
import v7.u6;
import w7.a9;
import z3.l;
import z3.m;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class d implements m {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern h = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern n = Pattern.compile("^(\\d+) (\\d+)$");
    public static final h6 r = new h6(30.0f, 1, 1);
    public final XmlPullParserFactory a;

    public d() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    public static f b(f fVar) {
        return fVar == null ? new f() : fVar;
    }

    public static boolean d(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int e(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = n.matcher(attributeValue);
        if (!matcher.matches()) {
            e2.a.l("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
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
            u6.d("Invalid cell resolution %s %s", parseInt, parseInt2, z10);
            return parseInt2;
        } catch (NumberFormatException unused) {
            e2.a.l("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void g(String str, f fVar) {
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
                throw new z3.f(g.n(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(split[1]);
            e2.a.l("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new z3.f(g.p("Invalid expression for fontSize: '", str, "'."));
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
                throw new z3.f(g.p("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        fVar.k = Float.parseFloat(group2);
    }

    public static h6 h(XmlPullParser xmlPullParser) {
        float f7;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = m0.a;
            u6.f("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f7 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f7 = 1.0f;
        }
        h6 h6Var = r;
        int i10 = h6Var.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = h6Var.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new h6(parseInt * f7, i10, i11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(XmlPullParser xmlPullParser, HashMap hashMap, int i10, u0 u0Var, HashMap hashMap2, HashMap hashMap3) {
        String f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i11;
        String f16;
        int i12;
        e eVar;
        char c10;
        float parseFloat;
        float parseFloat2;
        String f17;
        f fVar;
        String f18;
        f fVar2;
        String[] split;
        do {
            xmlPullParser.next();
            if (e2.a.i(xmlPullParser, "style")) {
                String f19 = e2.a.f(xmlPullParser, "style");
                f k10 = k(xmlPullParser, new f());
                if (f19 != null) {
                    String trim = f19.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str = m0.a;
                        split = trim.split("\\s+", -1);
                    }
                    for (String str2 : split) {
                        k10.a((f) hashMap.get(str2));
                    }
                }
                String str3 = k10.l;
                if (str3 != null) {
                    hashMap.put(str3, k10);
                }
            } else if (e2.a.i(xmlPullParser, "region")) {
                String f20 = e2.a.f(xmlPullParser, "id");
                if (f20 != null) {
                    String f21 = e2.a.f(xmlPullParser, "origin");
                    if (f21 == null && (f18 = e2.a.f(xmlPullParser, "style")) != null && (fVar2 = (f) hashMap.get(f18)) != null) {
                        f21 = fVar2.t;
                    }
                    int i13 = 2;
                    Pattern pattern = h;
                    Pattern pattern2 = f;
                    if (f21 != null) {
                        Matcher matcher = pattern2.matcher(f21);
                        Matcher matcher2 = pattern.matcher(f21);
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                group.getClass();
                                f12 = Float.parseFloat(group) / 100.0f;
                                String group2 = matcher.group(2);
                                group2.getClass();
                                f11 = Float.parseFloat(group2) / 100.0f;
                                f10 = 100.0f;
                            } catch (NumberFormatException unused) {
                                e2.a.l("TtmlParser", "Ignoring region with malformed origin: ".concat(f21));
                            }
                        } else if (!matcher2.matches()) {
                            e2.a.l("TtmlParser", "Ignoring region with unsupported origin: ".concat(f21));
                        } else if (u0Var == null) {
                            e2.a.l("TtmlParser", "Ignoring region with missing tts:extent: ".concat(f21));
                        } else {
                            try {
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                int parseInt = Integer.parseInt(group3);
                                String group4 = matcher2.group(2);
                                group4.getClass();
                                f10 = 100.0f;
                                float f22 = parseInt / u0Var.a;
                                float parseInt2 = Integer.parseInt(group4) / u0Var.b;
                                f12 = f22;
                                f11 = parseInt2;
                            } catch (NumberFormatException unused2) {
                                e2.a.l("TtmlParser", "Ignoring region with malformed origin: ".concat(f21));
                            }
                        }
                    } else {
                        f10 = 100.0f;
                        f11 = 0.0f;
                        f12 = 0.0f;
                    }
                    String f23 = e2.a.f(xmlPullParser, "extent");
                    if (f23 == null && (f17 = e2.a.f(xmlPullParser, "style")) != null && (fVar = (f) hashMap.get(f17)) != null) {
                        f23 = fVar.u;
                    }
                    if (f23 != null) {
                        Matcher matcher3 = pattern2.matcher(f23);
                        Matcher matcher4 = pattern.matcher(f23);
                        if (matcher3.matches()) {
                            try {
                                String group5 = matcher3.group(1);
                                group5.getClass();
                                parseFloat = Float.parseFloat(group5) / f10;
                                String group6 = matcher3.group(2);
                                group6.getClass();
                                parseFloat2 = Float.parseFloat(group6) / f10;
                            } catch (NumberFormatException unused3) {
                                k3.q("Ignoring region with malformed extent: ", f21, "TtmlParser");
                            }
                        } else if (!matcher4.matches()) {
                            k3.q("Ignoring region with unsupported extent: ", f21, "TtmlParser");
                        } else if (u0Var == null) {
                            k3.q("Ignoring region with missing tts:extent: ", f21, "TtmlParser");
                        } else {
                            String group7 = matcher4.group(1);
                            group7.getClass();
                            int parseInt3 = Integer.parseInt(group7);
                            String group8 = matcher4.group(2);
                            group8.getClass();
                            float f24 = parseInt3 / u0Var.a;
                            parseFloat2 = Integer.parseInt(group8) / u0Var.b;
                            parseFloat = f24;
                        }
                        f13 = parseFloat;
                        f14 = parseFloat2;
                    } else {
                        f13 = 1.0f;
                        f14 = 1.0f;
                    }
                    String f25 = e2.a.f(xmlPullParser, "displayAlign");
                    if (f25 != null) {
                        String c11 = s6.c(f25);
                        c11.getClass();
                        if (c11.equals("center")) {
                            f15 = f11 + (f14 / 2.0f);
                            i11 = 1;
                        } else if (c11.equals("after")) {
                            f15 = f11 + f14;
                            i11 = 2;
                        }
                        float f26 = 1.0f / i10;
                        f16 = e2.a.f(xmlPullParser, "writingMode");
                        if (f16 != null) {
                            String c12 = s6.c(f16);
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
                                    i12 = i13;
                                    break;
                                case 2:
                                    i12 = 1;
                                    break;
                            }
                            eVar = new e(f20, f12, f15, 0, i11, f13, f14, 1, f26, i12);
                            if (eVar != null) {
                                hashMap2.put(eVar.a, eVar);
                            }
                        }
                        i13 = TLObject.FLAG_31;
                        i12 = i13;
                        eVar = new e(f20, f12, f15, 0, i11, f13, f14, 1, f26, i12);
                        if (eVar != null) {
                        }
                    }
                    f15 = f11;
                    i11 = 0;
                    float f262 = 1.0f / i10;
                    f16 = e2.a.f(xmlPullParser, "writingMode");
                    if (f16 != null) {
                    }
                    i13 = TLObject.FLAG_31;
                    i12 = i13;
                    eVar = new e(f20, f12, f15, 0, i11, f13, f14, 1, f262, i12);
                    if (eVar != null) {
                    }
                }
                eVar = null;
                if (eVar != null) {
                }
            } else if (e2.a.i(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (e2.a.i(xmlPullParser, "image") && (f7 = e2.a.f(xmlPullParser, "id")) != null) {
                        hashMap3.put(f7, xmlPullParser.nextText());
                    }
                } while (!e2.a.h(xmlPullParser, "metadata"));
            }
        } while (!e2.a.h(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static c j(XmlPullParser xmlPullParser, c cVar, HashMap hashMap, h6 h6Var) {
        long j10;
        char c10;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        f k10 = k(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
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
                    j13 = l(attributeValue, h6Var);
                    break;
                case 2:
                    j12 = l(attributeValue, h6Var);
                    break;
                case 3:
                    j11 = l(attributeValue, h6Var);
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
                    return new c(xmlPullParser.getName(), null, j11, j10, k10, strArr, str2, str, cVar);
                }
            }
        }
        j10 = j12;
        return new c(xmlPullParser.getName(), null, j11, j10, k10, strArr, str2, str, cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b1  */
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
    public static f k(XmlPullParser xmlPullParser, f fVar) {
        char c10;
        ?? r92;
        boolean z10;
        char c11;
        int i10;
        g2 o10;
        int i11;
        int hashCode;
        int i12;
        b bVar;
        int i13;
        char c12;
        int attributeCount = xmlPullParser.getAttributeCount();
        f fVar2 = fVar;
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
                    fVar2 = b(fVar2);
                    fVar2.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    fVar2 = b(fVar2);
                    fVar2.u = attributeValue;
                    break;
                case 2:
                    fVar2 = b(fVar2);
                    fVar2.a = attributeValue;
                    break;
                case 3:
                    fVar2 = b(fVar2);
                    String c13 = s6.c(attributeValue);
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
                    fVar2 = b(fVar2);
                    fVar2.t = attributeValue;
                    break;
                case 5:
                    String c14 = s6.c(attributeValue);
                    c14.getClass();
                    switch (c14.hashCode()) {
                        case -1461280213:
                            if (c14.equals("nounderline")) {
                                z10 = false;
                                break;
                            }
                            z10 = -1;
                            break;
                        case -1026963764:
                            if (c14.equals("underline")) {
                                z10 = true;
                                break;
                            }
                            z10 = -1;
                            break;
                        case 913457136:
                            if (c14.equals("nolinethrough")) {
                                z10 = 2;
                                break;
                            }
                            z10 = -1;
                            break;
                        case 1679736913:
                            if (c14.equals("linethrough")) {
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
                            fVar2 = b(fVar2);
                            fVar2.g = 0;
                            break;
                        case true:
                            fVar2 = b(fVar2);
                            fVar2.g = 1;
                            break;
                        case true:
                            fVar2 = b(fVar2);
                            fVar2.f = 0;
                            break;
                        case true:
                            fVar2 = b(fVar2);
                            fVar2.f = 1;
                            break;
                    }
                case 6:
                    fVar2 = b(fVar2);
                    fVar2.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        fVar2 = b(fVar2);
                        fVar2.l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case '\b':
                    String c15 = s6.c(attributeValue);
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
                            fVar2 = b(fVar2);
                            fVar2.m = 2;
                            break;
                        case 1:
                            fVar2 = b(fVar2);
                            fVar2.m = 1;
                            break;
                        case 2:
                            fVar2 = b(fVar2);
                            fVar2.m = 4;
                            break;
                        case 3:
                        case 5:
                            fVar2 = b(fVar2);
                            fVar2.m = 3;
                            break;
                    }
                case '\t':
                    fVar2 = b(fVar2);
                    try {
                        fVar2.b = h.a(attributeValue, false);
                        fVar2.c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        k3.q("Failed parsing color value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\n':
                    f b10 = b(fVar2);
                    Matcher matcher = e.matcher(attributeValue);
                    float f7 = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f7 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e7) {
                            e2.a.m("TtmlParser", "Failed to parse shear: " + attributeValue, e7);
                        }
                    } else {
                        k3.q("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    b10.s = f7;
                    fVar2 = b10;
                    break;
                case 11:
                    String c16 = s6.c(attributeValue);
                    c16.getClass();
                    if (c16.equals("all")) {
                        fVar2 = b(fVar2);
                        fVar2.q = 1;
                        break;
                    } else if (c16.equals("none")) {
                        fVar2 = b(fVar2);
                        fVar2.q = 0;
                        break;
                    } else {
                        break;
                    }
                case '\f':
                    try {
                        fVar2 = b(fVar2);
                        g(attributeValue, fVar2);
                        break;
                    } catch (z3.f unused2) {
                        k3.q("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\r':
                    fVar2 = b(fVar2);
                    Pattern pattern = b.d;
                    if (attributeValue != null) {
                        String c17 = s6.c(attributeValue.trim());
                        if (!c17.isEmpty()) {
                            String[] split = TextUtils.split(c17, b.d);
                            int length = split.length;
                            y0 t10 = length != 0 ? length != 1 ? y0.t(split.length, (Object[]) split.clone()) : new k2(split[0]) : e2.s;
                            String str = (String) s.l(s.o(b.h, t10), "outside");
                            int hashCode2 = str.hashCode();
                            if (hashCode2 != -1392885889) {
                                if (hashCode2 != -1106037339) {
                                    if (hashCode2 == 92734940 && str.equals("after")) {
                                        i10 = 2;
                                        o10 = s.o(b.e, t10);
                                        if (o10.isEmpty()) {
                                            g2 o11 = s.o(b.g, t10);
                                            g2 o12 = s.o(b.f, t10);
                                            if (o11.isEmpty() && o12.isEmpty()) {
                                                bVar = new b(-1, 0, i10);
                                            } else {
                                                String str2 = (String) s.l(o11, "filled");
                                                int hashCode3 = str2.hashCode();
                                                if (hashCode3 == -1274499742) {
                                                    str2.equals("filled");
                                                } else if (hashCode3 == 3417674 && str2.equals("open")) {
                                                    i11 = 2;
                                                    String str3 = (String) s.l(o12, "circle");
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
                                                String str32 = (String) s.l(o12, "circle");
                                                hashCode = str32.hashCode();
                                                if (hashCode != -1360216880) {
                                                }
                                                i12 = 1;
                                                bVar = new b(i12, i11, i10);
                                            }
                                        } else {
                                            String str4 = (String) new a1(o10).next();
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
                                    o10 = s.o(b.e, t10);
                                    if (o10.isEmpty()) {
                                    }
                                }
                                fVar2.r = bVar;
                                break;
                            } else {
                                str.equals("before");
                            }
                            i10 = 1;
                            o10 = s.o(b.e, t10);
                            if (o10.isEmpty()) {
                            }
                            fVar2.r = bVar;
                        }
                    }
                    bVar = null;
                    fVar2.r = bVar;
                    break;
                case 14:
                    String c18 = s6.c(attributeValue);
                    c18.getClass();
                    if (c18.equals("before")) {
                        fVar2 = b(fVar2);
                        fVar2.n = 1;
                        break;
                    } else if (c18.equals("after")) {
                        fVar2 = b(fVar2);
                        fVar2.n = 2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    fVar2 = b(fVar2);
                    try {
                        fVar2.d = h.a(attributeValue, false);
                        fVar2.e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        k3.q("Failed parsing background value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case 16:
                    fVar2 = b(fVar2);
                    String c19 = s6.c(attributeValue);
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
    public static long l(String str, h6 h6Var) {
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
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / h6Var.a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / h6Var.b) / h6Var.a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = c.matcher(str);
        if (!matcher2.matches()) {
            throw new z3.f(o0.h("Malformed time expression: ", str));
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
                d10 = h6Var.a;
                parseDouble /= d10;
                break;
            case 1:
                d11 = 3600.0d;
                break;
            case 2:
                d11 = 60.0d;
                break;
            case 3:
                d10 = h6Var.c;
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

    public static u0 m(XmlPullParser xmlPullParser) {
        String f7 = e2.a.f(xmlPullParser, "extent");
        if (f7 == null) {
            return null;
        }
        Matcher matcher = h.matcher(f7);
        if (!matcher.matches()) {
            e2.a.l("TtmlParser", "Ignoring non-pixel tts extent: ".concat(f7));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new u0(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            e2.a.l("TtmlParser", "Ignoring malformed tts extent: ".concat(f7));
            return null;
        }
    }

    @Override // z3.m
    public final z3.d a(int i10, int i11, byte[] bArr) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e("", -3.4028235E38f, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, TLObject.FLAG_31, -3.4028235E38f, TLObject.FLAG_31));
            u0 u0Var = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            h6 h6Var = r;
            int i12 = 0;
            int i13 = 15;
            z5 z5Var = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            h6Var = h(newPullParser);
                            i13 = e(newPullParser);
                            u0Var = m(newPullParser);
                        }
                        h6 h6Var2 = h6Var;
                        u0 u0Var2 = u0Var;
                        int i14 = i13;
                        if (d(name)) {
                            if ("head".equals(name)) {
                                i(newPullParser, hashMap, i14, u0Var2, hashMap2, hashMap3);
                            } else {
                                try {
                                    c j10 = j(newPullParser, cVar, hashMap2, h6Var2);
                                    arrayDeque.push(j10);
                                    if (cVar != null) {
                                        if (cVar.m == null) {
                                            cVar.m = new ArrayList();
                                        }
                                        cVar.m.add(j10);
                                    }
                                } catch (z3.f e7) {
                                    e2.a.m("TtmlParser", "Suppressing parser error", e7);
                                }
                            }
                            i13 = i14;
                            u0Var = u0Var2;
                            h6Var = h6Var2;
                        } else {
                            e2.a.g("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        }
                        i12++;
                        i13 = i14;
                        u0Var = u0Var2;
                        h6Var = h6Var2;
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
                            z5Var = new z5(cVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                newPullParser.next();
            }
            z5Var.getClass();
            return z5Var;
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected error when reading input.", e10);
        } catch (XmlPullParserException e11) {
            throw new IllegalStateException("Unable to decode source", e11);
        }
    }

    @Override // z3.m
    public final int c() {
        return 1;
    }

    @Override // z3.m
    public final void f(byte[] bArr, int i10, int i11, l lVar, j jVar) {
        a9.b(a(i10, i11, bArr), lVar, jVar);
    }

    @Override // z3.m
    public final /* synthetic */ void reset() {
    }
}
