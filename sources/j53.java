// default package

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLObject;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class j53 extends DefaultHandler implements bv7 {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    public static final int[] f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public j53() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            fyb.j("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            String str = g8c.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new rv9(j, j2));
            j += j2;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        if (r13 != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0198, code lost:
    
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
    
        if (r13.equals("fa01") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0183, code lost:
    
        if (r13 == 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0196, code lost:
    
        if (r13 < 33) goto L111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(XmlPullParser xmlPullParser, String str) {
        char c2;
        int parseInt;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i = 5;
        char c3 = 4;
        int i2 = 0;
        int i3 = -1;
        switch (attributeValue.hashCode()) {
            case -2128649360:
                if (attributeValue.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -2060825028:
                if (attributeValue.equals("tag:dolby.com,2015:dash:audio_channel_configuration:2015")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1352850286:
                if (attributeValue.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1138141449:
                if (attributeValue.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -986633423:
                if (attributeValue.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -79006963:
                if (attributeValue.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 312179081:
                if (attributeValue.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 2036691300:
                if (attributeValue.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c2 = 7;
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
            case 5:
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                parseInt = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (parseInt > 0) {
                    break;
                }
                break;
            case 1:
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 != null && attributeValue3.length() == 6) {
                    int parseInt2 = Integer.parseInt(attributeValue3, 16);
                    if ((8388608 & parseInt2) == 0) {
                        parseInt = 0;
                        while (true) {
                            int[] iArr = e;
                            if (i2 >= iArr.length) {
                                break;
                            } else {
                                parseInt += ((parseInt2 >> i2) & 1) * iArr[i2];
                                i2++;
                            }
                        }
                    } else {
                        String[] e0 = g8c.e0(str);
                        if (e0.length != 0) {
                            List g0 = new wk4(new v39(new tj1('.', (byte) 0), (byte) 12)).g0(smd.c(e0[0].trim()));
                            if (g0.size() == 4 && ((String) g0.get(0)).equals("ac-4")) {
                                String str2 = (String) g0.get(3);
                                str2.getClass();
                                if (!str2.equals("03")) {
                                    if (str2.equals("04")) {
                                        i3 = 21;
                                        break;
                                    }
                                } else {
                                    i3 = 18;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue4 != null) {
                    i3 = Integer.parseInt(attributeValue4);
                    break;
                }
                break;
            case 3:
            case 7:
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue5 != null) {
                    String c4 = smd.c(attributeValue5);
                    c4.getClass();
                    switch (c4.hashCode()) {
                        case 1596796:
                            if (c4.equals("4000")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2937391:
                            if (c4.equals("a000")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3094034:
                            if (c4.equals("f800")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3094035:
                            if (c4.equals("f801")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3133436:
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            i = 1;
                            break;
                        case 1:
                            i = 2;
                            break;
                        case 3:
                            i = 6;
                            break;
                        case 4:
                            i = 8;
                            break;
                    }
                    i3 = i;
                    break;
                }
                i = -1;
                i3 = i;
            case 4:
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                int parseInt3 = attributeValue6 == null ? -1 : Integer.parseInt(attributeValue6);
                if (parseInt3 >= 0) {
                    int[] iArr2 = f;
                    if (parseInt3 < iArr2.length) {
                        i3 = iArr2[parseInt3];
                        break;
                    }
                }
                break;
            case 6:
                String attributeValue7 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue7 != null) {
                    parseInt = Integer.bitCount(Integer.parseInt(attributeValue7, 16));
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!oye.b(xmlPullParser, "AudioChannelConfiguration"));
        return i3;
    }

    public static long d(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : TLObject.FLAG_31;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!oye.b(xmlPullParser, "BaseURL"));
        if (str != null && jxe.a(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return tne.a(new wg0(parseInt, parseInt2, str, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            wg0 wg0Var = (wg0) arrayList.get(i);
            String c2 = jxe.c(wg0Var.a, str);
            String str2 = attributeValue3 == null ? c2 : attributeValue3;
            if (z) {
                parseInt = wg0Var.c;
                parseInt2 = wg0Var.d;
                str2 = wg0Var.b;
            }
            arrayList2.add(new wg0(parseInt, parseInt2, c2, str2));
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016a  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair f(XmlPullParser xmlPullParser) {
        String str;
        ?? r7;
        String str2;
        String str3;
        ?? r8;
        char c2;
        String str4;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String c3 = smd.c(attributeValue);
            c3.getClass();
            switch (c3.hashCode()) {
                case -1980789791:
                    if (c3.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 489446379:
                    if (c3.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 755418770:
                    if (c3.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1812765994:
                    if (c3.equals("urn:mpeg:dash:mp4protection:2011")) {
                        c2 = 3;
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
                    r7 = g51.d;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r8 = str2;
                    break;
                case 1:
                    r7 = g51.f;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r8 = str2;
                    break;
                case 2:
                    r7 = g51.e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r8 = str2;
                    break;
                case 3:
                    str = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i = 0;
                    while (true) {
                        if (i >= attributeCount) {
                            str4 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i);
                            int indexOf = attributeName.indexOf(58);
                            if (indexOf != -1) {
                                attributeName = attributeName.substring(indexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                str4 = xmlPullParser.getAttributeValue(i);
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str4) && !"00000000-0000-0000-0000-000000000000".equals(str4)) {
                        String[] split = str4.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i2 = 0; i2 < split.length; i2++) {
                            uuidArr[i2] = UUID.fromString(split[i2]);
                        }
                        r7 = g51.c;
                        str3 = null;
                        r8 = tre.a(r7, uuidArr, null);
                        break;
                    } else {
                        lad.f("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        r7 = null;
                        str2 = r7;
                        str3 = str2;
                        r8 = str2;
                        break;
                    }
            }
            do {
                xmlPullParser.next();
                if ((!oye.c(xmlPullParser, "clearkey:Laurl") || oye.c(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r8 = r8;
                } else if (oye.c(xmlPullParser, "ms:laurl")) {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r8 = r8;
                } else {
                    if (r8 == 0 && xmlPullParser.getEventType() == 2) {
                        String name = xmlPullParser.getName();
                        int indexOf2 = name.indexOf(58);
                        if (indexOf2 != -1) {
                            name = name.substring(indexOf2 + 1);
                        }
                        if (name.equals("pssh") && xmlPullParser.next() == 4) {
                            byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                            ju8 b2 = tre.b(decode);
                            UUID uuid = b2 == null ? null : (UUID) b2.c;
                            if (uuid == null) {
                                lad.f("MpdParser", "Skipping malformed cenc:pssh data");
                                r7 = uuid;
                                r8 = 0;
                            } else {
                                UUID uuid2 = uuid;
                                r8 = decode;
                                r7 = uuid2;
                            }
                        }
                    }
                    if (r8 == 0) {
                        ?? r10 = g51.f;
                        if (r10.equals(r7) && oye.c(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r8 = tre.a(r10, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    b(xmlPullParser);
                    r8 = r8;
                }
            } while (!oye.b(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r7 != null ? new pq3(r7, str3, "video/mp4", r8) : null);
        }
        str = null;
        r7 = null;
        str2 = r7;
        str3 = str2;
        r8 = str2;
        do {
            xmlPullParser.next();
            if (oye.c(xmlPullParser, "clearkey:Laurl")) {
            }
            str3 = xmlPullParser.getText();
            r8 = r8;
        } while (!oye.b(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r7 != null ? new pq3(r7, str3, "video/mp4", r8) : null);
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(attributeValue)) {
            return 1;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static zd3 h(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!oye.b(xmlPullParser, str));
        return new zd3(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = g8c.e.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return !isEmpty ? -parseDouble6 : parseDouble6;
    }

    public static float j(XmlPullParser xmlPullParser, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
            }
        }
        return f2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0fd5 A[LOOP:5: B:183:0x044a->B:191:0x0fd5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0e4f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0cd8 A[LOOP:11: B:354:0x0709->B:362:0x0cd8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x08f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x09cc  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x09ef  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0a23 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:570:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x09c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h53 k(XmlPullParser xmlPullParser, Uri uri) {
        int i;
        boolean z;
        long j;
        long j2;
        long j3;
        int i2;
        int i3;
        long j4;
        ArrayList arrayList;
        String str;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j5;
        boolean z2;
        long j6;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long j7;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList7;
        String str5;
        long j8;
        long j9;
        String str6;
        long j10;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        long j11;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        ArrayList arrayList13;
        String str12;
        String str13;
        long j12;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        int i4;
        ArrayList arrayList14;
        long j13;
        ArrayList arrayList15;
        String str22;
        String str23;
        String str24;
        ArrayList arrayList16;
        String str25;
        String str26;
        int parseInt;
        String str27;
        float f2;
        int parseInt2;
        float f3;
        String str28;
        int i5;
        int i6;
        String str29;
        String str30;
        ArrayList arrayList17;
        String str31;
        int i7;
        ArrayList arrayList18;
        long j14;
        String str32;
        String str33;
        String str34;
        long j15;
        ArrayList arrayList19;
        long j16;
        String str35;
        ArrayList arrayList20;
        long j17;
        String str36;
        ArrayList arrayList21;
        long j18;
        ArrayList arrayList22;
        String str37;
        String str38;
        String str39;
        int i8;
        String str40;
        String str41;
        String d2;
        ArrayList arrayList23;
        String str42;
        String str43;
        hl2 hl2Var;
        int i9;
        long j19;
        ArrayList arrayList24;
        Pair pair;
        int parseInt3;
        String str44;
        int i10;
        int i11;
        String str45;
        long j20;
        int i12;
        String str46;
        Object g89Var;
        String str47;
        String str48;
        ks8 ks8Var;
        ce3 ce3Var;
        ArrayList arrayList25;
        long j21;
        long j22;
        int i13 = 0;
        String[] strArr = new String[0];
        String str49 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(",");
        }
        int length = strArr.length;
        int i14 = 0;
        while (true) {
            i = 1;
            if (i14 >= length) {
                z = false;
                break;
            }
            if (strArr[i14].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z = true;
                break;
            }
            i14++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long W = attributeValue2 == null ? -9223372036854775807L : g8c.W(attributeValue2);
        long i15 = i(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long i16 = i(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, TeXSymbolParser.TYPE_ATTR));
        if (equals) {
            j2 = i(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L);
            j = i(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L);
            j3 = i(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L);
        } else {
            j = -9223372036854775807L;
            j2 = -9223372036854775807L;
            j3 = -9223372036854775807L;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long W2 = attributeValue3 == null ? -9223372036854775807L : g8c.W(attributeValue3);
        ArrayList arrayList26 = new ArrayList();
        long j23 = equals ? 0L : -9223372036854775807L;
        String uri2 = uri.toString();
        ArrayList a = tne.a(new wg0(z ? 1 : TLObject.FLAG_31, 1, uri2, uri2));
        ArrayList arrayList27 = new ArrayList();
        ArrayList arrayList28 = new ArrayList();
        long j24 = -9223372036854775807L;
        long j25 = equals ? -9223372036854775807L : 0L;
        int i17 = 0;
        int i18 = 0;
        ks8 ks8Var2 = null;
        ce3 ce3Var2 = null;
        vq6 vq6Var = null;
        while (true) {
            xmlPullParser.next();
            String str50 = "BaseURL";
            if (oye.c(xmlPullParser, "BaseURL")) {
                if (i17 == 0) {
                    j23 = d(xmlPullParser, j23);
                    i17 = i;
                }
                arrayList28.addAll(e(xmlPullParser, a, z));
                arrayList = arrayList26;
                str = uri2;
                arrayList3 = a;
                arrayList2 = arrayList28;
                z2 = z;
                i2 = i13;
                i3 = i;
                j6 = j24;
                arrayList4 = arrayList27;
                ks8Var = ks8Var2;
                ce3Var = ce3Var2;
            } else {
                i2 = i13;
                i3 = i;
                String str51 = "lang";
                if (oye.c(xmlPullParser, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(str49, "moreInformationURL");
                    String str52 = attributeValue4 == null ? str49 : attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str49, "lang");
                    String str53 = attributeValue5 == null ? str49 : attributeValue5;
                    String str54 = str49;
                    String str55 = str54;
                    String str56 = str55;
                    while (true) {
                        xmlPullParser.next();
                        if (oye.c(xmlPullParser, "Title")) {
                            str54 = xmlPullParser.nextText();
                        } else if (oye.c(xmlPullParser, "Source")) {
                            str55 = xmlPullParser.nextText();
                        } else if (oye.c(xmlPullParser, "Copyright")) {
                            str56 = xmlPullParser.nextText();
                        } else {
                            b(xmlPullParser);
                        }
                        String str57 = str54;
                        String str58 = str55;
                        String str59 = str56;
                        if (oye.b(xmlPullParser, "ProgramInformation")) {
                            ks8 ks8Var3 = new ks8(str57, str58, str59, str52, str53);
                            arrayList = arrayList26;
                            str = uri2;
                            arrayList3 = a;
                            arrayList2 = arrayList28;
                            z2 = z;
                            j6 = j24;
                            arrayList4 = arrayList27;
                            ce3Var = ce3Var2;
                            ks8Var = ks8Var3;
                        } else {
                            str54 = str57;
                            str55 = str58;
                            str56 = str59;
                        }
                    }
                } else {
                    if (oye.c(xmlPullParser, "UTCTiming")) {
                        j4 = j23;
                        ce3Var = new ce3(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"), (byte) 4);
                        j6 = j24;
                        arrayList = arrayList26;
                        str = uri2;
                        arrayList3 = a;
                        arrayList2 = arrayList28;
                        z2 = z;
                        arrayList4 = arrayList27;
                        ks8Var = ks8Var2;
                    } else {
                        j4 = j23;
                        if (oye.c(xmlPullParser, "Location")) {
                            String attributeValue6 = xmlPullParser.getAttributeValue(null, "serviceLocation");
                            Uri parse = Uri.parse(jxe.c(uri2, xmlPullParser.nextText()));
                            arrayList26.add(attributeValue6 != null ? new s96(parse, attributeValue6) : new s96(parse));
                            arrayList = arrayList26;
                            j5 = j25;
                            str = uri2;
                            arrayList3 = a;
                            arrayList2 = arrayList28;
                            z2 = z;
                            j6 = j24;
                            arrayList4 = arrayList27;
                        } else {
                            if (oye.c(xmlPullParser, "ServiceDescription")) {
                                long j26 = j24;
                                long j27 = j26;
                                long j28 = j27;
                                float f4 = -3.4028235E38f;
                                float f5 = -3.4028235E38f;
                                while (true) {
                                    xmlPullParser.next();
                                    arrayList = arrayList26;
                                    if (oye.c(xmlPullParser, "Latency")) {
                                        String attributeValue7 = xmlPullParser.getAttributeValue(null, "target");
                                        long parseLong = attributeValue7 == null ? j24 : Long.parseLong(attributeValue7);
                                        String attributeValue8 = xmlPullParser.getAttributeValue(null, "min");
                                        long parseLong2 = attributeValue8 == null ? j24 : Long.parseLong(attributeValue8);
                                        String attributeValue9 = xmlPullParser.getAttributeValue(null, "max");
                                        long parseLong3 = attributeValue9 == null ? j24 : Long.parseLong(attributeValue9);
                                        str = uri2;
                                        arrayList25 = a;
                                        j26 = parseLong;
                                        j21 = parseLong2;
                                        arrayList2 = arrayList28;
                                        j22 = parseLong3;
                                    } else {
                                        str = uri2;
                                        if (oye.c(xmlPullParser, "PlaybackRate")) {
                                            String attributeValue10 = xmlPullParser.getAttributeValue(null, "min");
                                            f4 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                                            String attributeValue11 = xmlPullParser.getAttributeValue(null, "max");
                                            f5 = attributeValue11 == null ? -3.4028235E38f : Float.parseFloat(attributeValue11);
                                        }
                                        arrayList25 = a;
                                        j21 = j27;
                                        arrayList2 = arrayList28;
                                        j22 = j28;
                                    }
                                    if (oye.b(xmlPullParser, "ServiceDescription")) {
                                        vq6 vq6Var2 = new vq6();
                                        vq6Var2.a = j26;
                                        vq6Var2.b = j21;
                                        vq6Var2.c = j22;
                                        vq6Var2.d = f4;
                                        vq6Var2.e = f5;
                                        arrayList3 = arrayList25;
                                        vq6Var = vq6Var2;
                                        z2 = z;
                                        j6 = j24;
                                        arrayList4 = arrayList27;
                                    } else {
                                        j28 = j22;
                                        arrayList28 = arrayList2;
                                        a = arrayList25;
                                        j27 = j21;
                                        arrayList26 = arrayList;
                                        uri2 = str;
                                    }
                                }
                            } else {
                                arrayList = arrayList26;
                                str = uri2;
                                ArrayList arrayList29 = a;
                                arrayList2 = arrayList28;
                                String str60 = "Period";
                                if (oye.c(xmlPullParser, "Period") && i18 == 0) {
                                    ArrayList arrayList30 = !arrayList2.isEmpty() ? arrayList2 : arrayList29;
                                    String str61 = "id";
                                    String attributeValue12 = xmlPullParser.getAttributeValue(null, "id");
                                    long i19 = i(xmlPullParser, "start", j25);
                                    long j29 = W != j24 ? W + i19 : j24;
                                    String str62 = "value";
                                    long j30 = j25;
                                    ArrayList arrayList31 = arrayList29;
                                    long j31 = j24;
                                    long i20 = i(xmlPullParser, "duration", j31);
                                    String str63 = "duration";
                                    ArrayList arrayList32 = new ArrayList();
                                    String str64 = "schemeIdUri";
                                    ArrayList arrayList33 = new ArrayList();
                                    ArrayList arrayList34 = new ArrayList();
                                    long j32 = j31;
                                    int i21 = i2;
                                    long j33 = j4;
                                    tv9 tv9Var = null;
                                    while (true) {
                                        xmlPullParser.next();
                                        if (oye.c(xmlPullParser, str50)) {
                                            if (i21 == 0) {
                                                j33 = d(xmlPullParser, j33);
                                                i21 = i3;
                                            }
                                            arrayList34.addAll(e(xmlPullParser, arrayList30, z));
                                            arrayList3 = arrayList31;
                                            str5 = str61;
                                            str3 = str50;
                                            z2 = z;
                                            arrayList5 = arrayList34;
                                            arrayList6 = arrayList32;
                                            str4 = str51;
                                            j33 = j33;
                                            j6 = -9223372036854775807L;
                                            long j34 = j29;
                                            str6 = str60;
                                            j8 = j34;
                                            arrayList7 = arrayList30;
                                            j9 = i20;
                                        } else {
                                            arrayList5 = arrayList34;
                                            arrayList6 = arrayList32;
                                            String str65 = "AdaptationSet";
                                            String str66 = "SegmentTemplate";
                                            if (oye.c(xmlPullParser, "AdaptationSet")) {
                                                j7 = j33;
                                                ArrayList arrayList35 = !arrayList5.isEmpty() ? arrayList5 : arrayList30;
                                                String attributeValue13 = xmlPullParser.getAttributeValue(null, str61);
                                                long parseLong4 = attributeValue13 == null ? -1L : Long.parseLong(attributeValue13);
                                                int g = g(xmlPullParser);
                                                arrayList3 = arrayList31;
                                                String str67 = "mimeType";
                                                String attributeValue14 = xmlPullParser.getAttributeValue(null, "mimeType");
                                                String str68 = str60;
                                                ArrayList arrayList36 = arrayList30;
                                                String attributeValue15 = xmlPullParser.getAttributeValue(null, "codecs");
                                                long j35 = j29;
                                                String attributeValue16 = xmlPullParser.getAttributeValue(null, "scte214:supplementalCodecs");
                                                String attributeValue17 = xmlPullParser.getAttributeValue(null, "scte214:supplementalProfiles");
                                                long j36 = j;
                                                String attributeValue18 = xmlPullParser.getAttributeValue(null, "width");
                                                int parseInt4 = attributeValue18 == null ? -1 : Integer.parseInt(attributeValue18);
                                                String attributeValue19 = xmlPullParser.getAttributeValue(null, "height");
                                                int parseInt5 = attributeValue19 == null ? -1 : Integer.parseInt(attributeValue19);
                                                float j37 = j(xmlPullParser, -1.0f);
                                                String str69 = "SegmentList";
                                                String str70 = "SegmentBase";
                                                String attributeValue20 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                                int parseInt6 = attributeValue20 == null ? -1 : Integer.parseInt(attributeValue20);
                                                String attributeValue21 = xmlPullParser.getAttributeValue(null, str51);
                                                String str71 = "audioSamplingRate";
                                                String attributeValue22 = xmlPullParser.getAttributeValue(null, "label");
                                                ArrayList arrayList37 = new ArrayList();
                                                String str72 = attributeValue22;
                                                ArrayList arrayList38 = new ArrayList();
                                                ArrayList arrayList39 = arrayList37;
                                                ArrayList arrayList40 = new ArrayList();
                                                ArrayList arrayList41 = new ArrayList();
                                                float f6 = j37;
                                                ArrayList arrayList42 = new ArrayList();
                                                String str73 = "height";
                                                ArrayList arrayList43 = new ArrayList();
                                                String str74 = "width";
                                                ArrayList arrayList44 = new ArrayList();
                                                String str75 = "scte214:supplementalProfiles";
                                                ArrayList arrayList45 = new ArrayList();
                                                ArrayList arrayList46 = new ArrayList();
                                                String str76 = "codecs";
                                                ArrayList arrayList47 = arrayList44;
                                                ArrayList arrayList48 = arrayList43;
                                                int i22 = i2;
                                                tv9 tv9Var2 = tv9Var;
                                                long j38 = j32;
                                                long j39 = j7;
                                                String str77 = attributeValue21;
                                                int i23 = -1;
                                                String str78 = "scte214:supplementalCodecs";
                                                int i24 = g;
                                                String str79 = null;
                                                while (true) {
                                                    xmlPullParser.next();
                                                    if (oye.c(xmlPullParser, str50)) {
                                                        if (i22 == 0) {
                                                            j39 = d(xmlPullParser, j39);
                                                            i22 = i3;
                                                        }
                                                        long j40 = j39;
                                                        arrayList46.addAll(e(xmlPullParser, arrayList35, z));
                                                        str12 = str77;
                                                        str13 = attributeValue15;
                                                        str5 = str61;
                                                        arrayList10 = arrayList38;
                                                        arrayList12 = arrayList41;
                                                        j9 = i20;
                                                        str2 = str68;
                                                        arrayList7 = arrayList36;
                                                        str20 = str69;
                                                        str21 = str70;
                                                        arrayList15 = arrayList39;
                                                        str15 = str74;
                                                        str16 = str75;
                                                        arrayList13 = arrayList47;
                                                        j12 = j40;
                                                        arrayList8 = arrayList35;
                                                        arrayList11 = arrayList42;
                                                        arrayList9 = arrayList46;
                                                        str3 = str50;
                                                        str22 = str51;
                                                        str23 = str65;
                                                        str14 = str66;
                                                        str17 = str78;
                                                        arrayList14 = arrayList40;
                                                    } else {
                                                        arrayList8 = arrayList35;
                                                        if (oye.c(xmlPullParser, "ContentProtection")) {
                                                            Pair f7 = f(xmlPullParser);
                                                            arrayList9 = arrayList46;
                                                            Object obj = f7.first;
                                                            if (obj != null) {
                                                                str79 = (String) obj;
                                                            }
                                                            Object obj2 = f7.second;
                                                            if (obj2 != null) {
                                                                arrayList38.add((pq3) obj2);
                                                            }
                                                        } else {
                                                            arrayList9 = arrayList46;
                                                            if (oye.c(xmlPullParser, "ContentComponent")) {
                                                                String attributeValue23 = xmlPullParser.getAttributeValue(null, str51);
                                                                if (str77 == null) {
                                                                    str77 = attributeValue23;
                                                                } else if (attributeValue23 != null) {
                                                                    gre.p(str77.equals(attributeValue23));
                                                                }
                                                                int g2 = g(xmlPullParser);
                                                                if (i24 == -1) {
                                                                    i24 = g2;
                                                                } else if (g2 != -1) {
                                                                    gre.p(i24 == g2 ? i3 : i2);
                                                                }
                                                                str12 = str77;
                                                                str13 = attributeValue15;
                                                                str5 = str61;
                                                                j12 = j39;
                                                                arrayList10 = arrayList38;
                                                                arrayList12 = arrayList41;
                                                                j9 = i20;
                                                                str23 = str65;
                                                                str2 = str68;
                                                                arrayList7 = arrayList36;
                                                                str20 = str69;
                                                                str21 = str70;
                                                                arrayList15 = arrayList39;
                                                                arrayList14 = arrayList40;
                                                                str15 = str74;
                                                                str16 = str75;
                                                                arrayList13 = arrayList47;
                                                                arrayList11 = arrayList42;
                                                                str3 = str50;
                                                                str22 = str51;
                                                                str14 = str66;
                                                                str17 = str78;
                                                            } else {
                                                                if (oye.c(xmlPullParser, "Role")) {
                                                                    arrayList42.add(h(xmlPullParser, "Role"));
                                                                } else {
                                                                    String str80 = "AudioChannelConfiguration";
                                                                    if (oye.c(xmlPullParser, "AudioChannelConfiguration")) {
                                                                        i23 = c(xmlPullParser, attributeValue15);
                                                                    } else {
                                                                        String str81 = "ContentProtection";
                                                                        if (oye.c(xmlPullParser, "Accessibility")) {
                                                                            arrayList41.add(h(xmlPullParser, "Accessibility"));
                                                                        } else if (oye.c(xmlPullParser, "EssentialProperty")) {
                                                                            arrayList48.add(h(xmlPullParser, "EssentialProperty"));
                                                                        } else {
                                                                            ArrayList arrayList49 = arrayList48;
                                                                            String str82 = "EssentialProperty";
                                                                            arrayList10 = arrayList38;
                                                                            if (oye.c(xmlPullParser, "SupplementalProperty")) {
                                                                                ArrayList arrayList50 = arrayList47;
                                                                                arrayList50.add(h(xmlPullParser, "SupplementalProperty"));
                                                                                arrayList48 = arrayList49;
                                                                                arrayList11 = arrayList42;
                                                                                str12 = str77;
                                                                                str13 = attributeValue15;
                                                                                str5 = str61;
                                                                                i4 = i24;
                                                                                j12 = j39;
                                                                                arrayList13 = arrayList50;
                                                                                arrayList12 = arrayList41;
                                                                                j9 = i20;
                                                                                str2 = str68;
                                                                                arrayList7 = arrayList36;
                                                                                str20 = str69;
                                                                                str21 = str70;
                                                                                arrayList15 = arrayList39;
                                                                                arrayList14 = arrayList40;
                                                                                str15 = str74;
                                                                                str16 = str75;
                                                                                str3 = str50;
                                                                                str22 = str51;
                                                                                str14 = str66;
                                                                                str17 = str78;
                                                                                str18 = str76;
                                                                                str19 = str67;
                                                                                z2 = z;
                                                                                j8 = j35;
                                                                                j13 = j38;
                                                                                str23 = str65;
                                                                                j38 = j13;
                                                                                i24 = i4;
                                                                                if (oye.b(xmlPullParser, str23)) {
                                                                                    i3 = 1;
                                                                                    j35 = j8;
                                                                                    arrayList40 = arrayList14;
                                                                                    arrayList39 = arrayList15;
                                                                                    str70 = str21;
                                                                                    j39 = j12;
                                                                                    z = z2;
                                                                                    str67 = str19;
                                                                                    arrayList42 = arrayList11;
                                                                                    arrayList46 = arrayList9;
                                                                                    arrayList41 = arrayList12;
                                                                                    arrayList47 = arrayList13;
                                                                                    str77 = str12;
                                                                                    str68 = str2;
                                                                                    str65 = str23;
                                                                                    str66 = str14;
                                                                                    str76 = str18;
                                                                                    str78 = str17;
                                                                                    arrayList35 = arrayList8;
                                                                                    str51 = str22;
                                                                                    str50 = str3;
                                                                                    str75 = str16;
                                                                                    str69 = str20;
                                                                                    str74 = str15;
                                                                                    arrayList38 = arrayList10;
                                                                                    arrayList36 = arrayList7;
                                                                                    i20 = j9;
                                                                                    attributeValue15 = str13;
                                                                                    str61 = str5;
                                                                                } else {
                                                                                    ArrayList arrayList51 = new ArrayList(arrayList45.size());
                                                                                    int i25 = i2;
                                                                                    while (i25 < arrayList45.size()) {
                                                                                        ArrayList arrayList52 = arrayList45;
                                                                                        i53 i53Var = (i53) arrayList52.get(i25);
                                                                                        em4 a2 = i53Var.a.a();
                                                                                        if (str72 == null || !arrayList15.isEmpty()) {
                                                                                            str45 = str72;
                                                                                            a2.c = mm5.q(arrayList15);
                                                                                        } else {
                                                                                            str45 = str72;
                                                                                            a2.b = str45;
                                                                                        }
                                                                                        String str83 = i53Var.d;
                                                                                        if (str83 == null) {
                                                                                            str83 = str79;
                                                                                        }
                                                                                        int i26 = i25;
                                                                                        ArrayList arrayList53 = i53Var.e;
                                                                                        long j41 = j8;
                                                                                        ArrayList arrayList54 = arrayList10;
                                                                                        arrayList53.addAll(arrayList54);
                                                                                        arrayList10 = arrayList54;
                                                                                        if (arrayList53.isEmpty()) {
                                                                                            j20 = j9;
                                                                                            i12 = i24;
                                                                                            str46 = str22;
                                                                                        } else {
                                                                                            int i27 = i2;
                                                                                            while (true) {
                                                                                                if (i27 < arrayList53.size()) {
                                                                                                    pq3 pq3Var = (pq3) arrayList53.get(i27);
                                                                                                    j20 = j9;
                                                                                                    if (!g51.d.equals(pq3Var.b) || (str47 = pq3Var.c) == null) {
                                                                                                        i27++;
                                                                                                        j9 = j20;
                                                                                                    } else {
                                                                                                        arrayList53.remove(i27);
                                                                                                    }
                                                                                                } else {
                                                                                                    j20 = j9;
                                                                                                    str47 = null;
                                                                                                }
                                                                                            }
                                                                                            if (str47 != null) {
                                                                                                int i28 = i2;
                                                                                                while (i28 < arrayList53.size()) {
                                                                                                    pq3 pq3Var2 = (pq3) arrayList53.get(i28);
                                                                                                    int i29 = i24;
                                                                                                    if (g51.c.equals(pq3Var2.b) && pq3Var2.c == null) {
                                                                                                        str48 = str22;
                                                                                                        arrayList53.set(i28, new pq3(g51.d, str47, pq3Var2.d, pq3Var2.e));
                                                                                                    } else {
                                                                                                        str48 = str22;
                                                                                                    }
                                                                                                    i28++;
                                                                                                    i24 = i29;
                                                                                                    str22 = str48;
                                                                                                }
                                                                                            }
                                                                                            i12 = i24;
                                                                                            str46 = str22;
                                                                                            for (int size = arrayList53.size() - 1; size >= 0; size--) {
                                                                                                pq3 pq3Var3 = (pq3) arrayList53.get(size);
                                                                                                if (pq3Var3.e == null) {
                                                                                                    int i30 = i2;
                                                                                                    while (true) {
                                                                                                        if (i30 < arrayList53.size()) {
                                                                                                            pq3 pq3Var4 = (pq3) arrayList53.get(i30);
                                                                                                            if (pq3Var4.e != null && pq3Var3.e == null && pq3Var4.a(pq3Var3.b)) {
                                                                                                                arrayList53.remove(size);
                                                                                                            } else {
                                                                                                                i30++;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            a2.w = new qq3(str83, arrayList53);
                                                                                        }
                                                                                        ArrayList arrayList55 = i53Var.f;
                                                                                        arrayList55.addAll(arrayList14);
                                                                                        fm4 fm4Var = new fm4(a2);
                                                                                        mm5 mm5Var = i53Var.b;
                                                                                        tv9 tv9Var3 = i53Var.c;
                                                                                        ArrayList arrayList56 = i53Var.g;
                                                                                        ArrayList arrayList57 = i53Var.h;
                                                                                        if (tv9Var3 instanceof sv9) {
                                                                                            g89Var = new h89(fm4Var, mm5Var, (sv9) tv9Var3, arrayList55, arrayList56, arrayList57);
                                                                                        } else {
                                                                                            if (!(tv9Var3 instanceof ov9)) {
                                                                                                w26.j("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                                                return null;
                                                                                            }
                                                                                            g89Var = new g89(fm4Var, mm5Var, (ov9) tv9Var3, arrayList55, arrayList56, arrayList57);
                                                                                        }
                                                                                        arrayList51.add(g89Var);
                                                                                        i25 = i26 + 1;
                                                                                        arrayList45 = arrayList52;
                                                                                        str72 = str45;
                                                                                        i24 = i12;
                                                                                        str22 = str46;
                                                                                        j8 = j41;
                                                                                        j9 = j20;
                                                                                    }
                                                                                    str4 = str22;
                                                                                    i3 = 1;
                                                                                    arrayList6.add(new ea(parseLong4, i24, arrayList51, arrayList12, arrayList48, arrayList13));
                                                                                    j = j36;
                                                                                }
                                                                            } else {
                                                                                ArrayList arrayList58 = arrayList47;
                                                                                arrayList11 = arrayList42;
                                                                                String str84 = str51;
                                                                                arrayList12 = arrayList41;
                                                                                if (oye.c(xmlPullParser, "Representation")) {
                                                                                    if (arrayList9.isEmpty()) {
                                                                                        str24 = "Representation";
                                                                                        arrayList16 = arrayList8;
                                                                                    } else {
                                                                                        str24 = "Representation";
                                                                                        arrayList16 = arrayList9;
                                                                                    }
                                                                                    String str85 = str77;
                                                                                    String str86 = "SupplementalProperty";
                                                                                    String attributeValue24 = xmlPullParser.getAttributeValue(null, str61);
                                                                                    str13 = attributeValue15;
                                                                                    String attributeValue25 = xmlPullParser.getAttributeValue(null, "bandwidth");
                                                                                    int parseInt7 = attributeValue25 == null ? -1 : Integer.parseInt(attributeValue25);
                                                                                    String attributeValue26 = xmlPullParser.getAttributeValue(null, str67);
                                                                                    String str87 = str76;
                                                                                    str19 = str67;
                                                                                    String str88 = attributeValue26 == null ? attributeValue14 : attributeValue26;
                                                                                    String attributeValue27 = xmlPullParser.getAttributeValue(null, str87);
                                                                                    String str89 = str78;
                                                                                    str18 = str87;
                                                                                    String str90 = attributeValue27 == null ? str13 : attributeValue27;
                                                                                    String attributeValue28 = xmlPullParser.getAttributeValue(null, str89);
                                                                                    String str91 = str75;
                                                                                    str17 = str89;
                                                                                    String str92 = attributeValue28 == null ? attributeValue16 : attributeValue28;
                                                                                    String attributeValue29 = xmlPullParser.getAttributeValue(null, str91);
                                                                                    String str93 = str74;
                                                                                    str16 = str91;
                                                                                    String str94 = attributeValue29 == null ? attributeValue17 : attributeValue29;
                                                                                    String attributeValue30 = xmlPullParser.getAttributeValue(null, str93);
                                                                                    if (attributeValue30 == null) {
                                                                                        String str95 = str73;
                                                                                        str25 = str93;
                                                                                        str26 = str95;
                                                                                        parseInt = parseInt4;
                                                                                    } else {
                                                                                        String str96 = str73;
                                                                                        str25 = str93;
                                                                                        str26 = str96;
                                                                                        parseInt = Integer.parseInt(attributeValue30);
                                                                                    }
                                                                                    String attributeValue31 = xmlPullParser.getAttributeValue(null, str26);
                                                                                    if (attributeValue31 == null) {
                                                                                        float f8 = f6;
                                                                                        str27 = str26;
                                                                                        f2 = f8;
                                                                                        parseInt2 = parseInt5;
                                                                                    } else {
                                                                                        float f9 = f6;
                                                                                        str27 = str26;
                                                                                        f2 = f9;
                                                                                        parseInt2 = Integer.parseInt(attributeValue31);
                                                                                    }
                                                                                    String str97 = "InbandEventStream";
                                                                                    float j42 = j(xmlPullParser, f2);
                                                                                    String str98 = str71;
                                                                                    String attributeValue32 = xmlPullParser.getAttributeValue(null, str98);
                                                                                    int parseInt8 = attributeValue32 == null ? parseInt6 : Integer.parseInt(attributeValue32);
                                                                                    str71 = str98;
                                                                                    ArrayList arrayList59 = new ArrayList();
                                                                                    ArrayList arrayList60 = new ArrayList();
                                                                                    ArrayList arrayList61 = new ArrayList(arrayList49);
                                                                                    ArrayList arrayList62 = new ArrayList(arrayList58);
                                                                                    ArrayList arrayList63 = new ArrayList();
                                                                                    ArrayList arrayList64 = arrayList49;
                                                                                    arrayList13 = arrayList58;
                                                                                    String str99 = str61;
                                                                                    int i31 = i24;
                                                                                    long j43 = j39;
                                                                                    int i32 = i2;
                                                                                    tv9 tv9Var4 = tv9Var2;
                                                                                    long j44 = j38;
                                                                                    int i33 = i23;
                                                                                    String str100 = null;
                                                                                    while (true) {
                                                                                        xmlPullParser.next();
                                                                                        if (oye.c(xmlPullParser, str50)) {
                                                                                            if (i32 == 0) {
                                                                                                j43 = d(xmlPullParser, j43);
                                                                                                i32 = i3;
                                                                                            }
                                                                                            f3 = f2;
                                                                                            arrayList63.addAll(e(xmlPullParser, arrayList16, z));
                                                                                        } else {
                                                                                            f3 = f2;
                                                                                            if (oye.c(xmlPullParser, str80)) {
                                                                                                i33 = c(xmlPullParser, str90);
                                                                                            } else {
                                                                                                String str101 = str70;
                                                                                                if (oye.c(xmlPullParser, str101)) {
                                                                                                    str70 = str101;
                                                                                                    tv9Var4 = o(xmlPullParser, (sv9) tv9Var4);
                                                                                                } else {
                                                                                                    String str102 = str69;
                                                                                                    if (oye.c(xmlPullParser, str102)) {
                                                                                                        str29 = str80;
                                                                                                        str3 = str50;
                                                                                                        long d3 = d(xmlPullParser, j44);
                                                                                                        str28 = str102;
                                                                                                        i5 = parseInt8;
                                                                                                        i6 = parseInt7;
                                                                                                        j12 = j39;
                                                                                                        long j45 = i20;
                                                                                                        str2 = str68;
                                                                                                        arrayList7 = arrayList36;
                                                                                                        long j46 = j35;
                                                                                                        long j47 = j36;
                                                                                                        str30 = str101;
                                                                                                        str15 = str25;
                                                                                                        arrayList17 = arrayList45;
                                                                                                        str31 = str85;
                                                                                                        i7 = i31;
                                                                                                        str5 = str99;
                                                                                                        str33 = str90;
                                                                                                        arrayList18 = arrayList63;
                                                                                                        str73 = str27;
                                                                                                        str32 = str82;
                                                                                                        str34 = str81;
                                                                                                        arrayList48 = arrayList64;
                                                                                                        f6 = f3;
                                                                                                        tv9Var4 = p(xmlPullParser, (pv9) tv9Var4, j46, j45, j43, d3, j47);
                                                                                                        j14 = j45;
                                                                                                        j17 = d3;
                                                                                                        j15 = j43;
                                                                                                        str38 = str24;
                                                                                                        str37 = str86;
                                                                                                        str35 = str97;
                                                                                                        str39 = str100;
                                                                                                        arrayList21 = arrayList61;
                                                                                                        j18 = j46;
                                                                                                        arrayList19 = arrayList16;
                                                                                                        str14 = str66;
                                                                                                        arrayList22 = arrayList62;
                                                                                                        i8 = i33;
                                                                                                        z2 = z;
                                                                                                        j16 = j47;
                                                                                                        arrayList20 = arrayList59;
                                                                                                    } else {
                                                                                                        str28 = str102;
                                                                                                        i5 = parseInt8;
                                                                                                        i6 = parseInt7;
                                                                                                        str29 = str80;
                                                                                                        str3 = str50;
                                                                                                        j12 = j39;
                                                                                                        str2 = str68;
                                                                                                        long j48 = j35;
                                                                                                        long j49 = j36;
                                                                                                        str30 = str101;
                                                                                                        arrayList17 = arrayList45;
                                                                                                        str31 = str85;
                                                                                                        i7 = i31;
                                                                                                        str5 = str99;
                                                                                                        long j50 = j43;
                                                                                                        arrayList18 = arrayList63;
                                                                                                        j14 = i20;
                                                                                                        String str103 = str66;
                                                                                                        arrayList7 = arrayList36;
                                                                                                        str15 = str25;
                                                                                                        str32 = str82;
                                                                                                        arrayList48 = arrayList64;
                                                                                                        str33 = str90;
                                                                                                        str73 = str27;
                                                                                                        str34 = str81;
                                                                                                        f6 = f3;
                                                                                                        if (oye.c(xmlPullParser, str103)) {
                                                                                                            long d4 = d(xmlPullParser, j44);
                                                                                                            ArrayList arrayList65 = arrayList16;
                                                                                                            str14 = str103;
                                                                                                            j15 = j50;
                                                                                                            arrayList19 = arrayList65;
                                                                                                            z2 = z;
                                                                                                            j16 = j49;
                                                                                                            tv9Var4 = q(xmlPullParser, (qv9) tv9Var4, arrayList13, j48, j14, j15, d4, j16);
                                                                                                            j17 = d4;
                                                                                                            str38 = str24;
                                                                                                            str37 = str86;
                                                                                                            str35 = str97;
                                                                                                            str39 = str100;
                                                                                                            arrayList20 = arrayList59;
                                                                                                        } else {
                                                                                                            ArrayList arrayList66 = arrayList16;
                                                                                                            str14 = str103;
                                                                                                            j15 = j50;
                                                                                                            arrayList19 = arrayList66;
                                                                                                            z2 = z;
                                                                                                            j16 = j49;
                                                                                                            if (oye.c(xmlPullParser, str34)) {
                                                                                                                Pair f10 = f(xmlPullParser);
                                                                                                                Object obj3 = f10.first;
                                                                                                                if (obj3 != null) {
                                                                                                                    str100 = (String) obj3;
                                                                                                                }
                                                                                                                Object obj4 = f10.second;
                                                                                                                if (obj4 != null) {
                                                                                                                    arrayList20 = arrayList59;
                                                                                                                    arrayList20.add((pq3) obj4);
                                                                                                                } else {
                                                                                                                    arrayList20 = arrayList59;
                                                                                                                }
                                                                                                                j17 = j44;
                                                                                                                str38 = str24;
                                                                                                                str37 = str86;
                                                                                                                str35 = str97;
                                                                                                                str39 = str100;
                                                                                                            } else {
                                                                                                                str35 = str97;
                                                                                                                arrayList20 = arrayList59;
                                                                                                                j17 = j44;
                                                                                                                if (oye.c(xmlPullParser, str35)) {
                                                                                                                    arrayList60.add(h(xmlPullParser, str35));
                                                                                                                    str36 = str86;
                                                                                                                    arrayList21 = arrayList61;
                                                                                                                } else {
                                                                                                                    ArrayList arrayList67 = arrayList60;
                                                                                                                    if (oye.c(xmlPullParser, str32)) {
                                                                                                                        arrayList60 = arrayList67;
                                                                                                                        arrayList21 = arrayList61;
                                                                                                                        arrayList21.add(h(xmlPullParser, str32));
                                                                                                                        str36 = str86;
                                                                                                                    } else {
                                                                                                                        arrayList60 = arrayList67;
                                                                                                                        str36 = str86;
                                                                                                                        arrayList21 = arrayList61;
                                                                                                                        j18 = j48;
                                                                                                                        if (oye.c(xmlPullParser, str36)) {
                                                                                                                            arrayList22 = arrayList62;
                                                                                                                            arrayList22.add(h(xmlPullParser, str36));
                                                                                                                        } else {
                                                                                                                            arrayList22 = arrayList62;
                                                                                                                            b(xmlPullParser);
                                                                                                                        }
                                                                                                                        str37 = str36;
                                                                                                                        str38 = str24;
                                                                                                                        str39 = str100;
                                                                                                                        i8 = i33;
                                                                                                                    }
                                                                                                                }
                                                                                                                j18 = j48;
                                                                                                                arrayList22 = arrayList62;
                                                                                                                str37 = str36;
                                                                                                                str38 = str24;
                                                                                                                str39 = str100;
                                                                                                                i8 = i33;
                                                                                                            }
                                                                                                        }
                                                                                                        arrayList21 = arrayList61;
                                                                                                        j18 = j48;
                                                                                                        arrayList22 = arrayList62;
                                                                                                        i8 = i33;
                                                                                                    }
                                                                                                    if (oye.b(xmlPullParser, str38)) {
                                                                                                        arrayList61 = arrayList21;
                                                                                                        arrayList62 = arrayList22;
                                                                                                        arrayList59 = arrayList20;
                                                                                                        String str104 = str92;
                                                                                                        long j51 = j14;
                                                                                                        str24 = str38;
                                                                                                        i33 = i8;
                                                                                                        j43 = j15;
                                                                                                        str97 = str35;
                                                                                                        str81 = str34;
                                                                                                        str90 = str33;
                                                                                                        j44 = j17;
                                                                                                        str50 = str3;
                                                                                                        f2 = f6;
                                                                                                        str27 = str73;
                                                                                                        str100 = str39;
                                                                                                        str80 = str29;
                                                                                                        i31 = i7;
                                                                                                        arrayList45 = arrayList17;
                                                                                                        parseInt7 = i6;
                                                                                                        str69 = str28;
                                                                                                        str99 = str5;
                                                                                                        i3 = 1;
                                                                                                        j36 = j16;
                                                                                                        j39 = j12;
                                                                                                        z = z2;
                                                                                                        str25 = str15;
                                                                                                        arrayList64 = arrayList48;
                                                                                                        str82 = str32;
                                                                                                        str66 = str14;
                                                                                                        arrayList36 = arrayList7;
                                                                                                        arrayList63 = arrayList18;
                                                                                                        arrayList16 = arrayList19;
                                                                                                        i20 = j51;
                                                                                                        str68 = str2;
                                                                                                        str92 = str104;
                                                                                                        str94 = str94;
                                                                                                        parseInt8 = i5;
                                                                                                        str70 = str30;
                                                                                                        str86 = str37;
                                                                                                        j35 = j18;
                                                                                                        str85 = str31;
                                                                                                    } else if (ud7.i(str88)) {
                                                                                                        if (str33 != null) {
                                                                                                            String[] e0 = g8c.e0(str33);
                                                                                                            int length2 = e0.length;
                                                                                                            for (int i34 = i2; i34 < length2; i34++) {
                                                                                                                d2 = ud7.d(e0[i34]);
                                                                                                                if (d2 != null && ud7.i(d2)) {
                                                                                                                    str40 = d2;
                                                                                                                    str41 = str88;
                                                                                                                    if ("audio/eac3".equals(str40)) {
                                                                                                                        int i35 = i2;
                                                                                                                        while (i35 < arrayList22.size()) {
                                                                                                                            zd3 zd3Var = (zd3) arrayList22.get(i35);
                                                                                                                            int i36 = i35;
                                                                                                                            String str105 = zd3Var.a;
                                                                                                                            String str106 = zd3Var.b;
                                                                                                                            arrayList23 = arrayList22;
                                                                                                                            if (("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str105) && "JOC".equals(str106)) || ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str105) && "ec+3".equals(str106))) {
                                                                                                                                str40 = "audio/eac3-joc";
                                                                                                                                if ("audio/eac3-joc".equals(str40)) {
                                                                                                                                    str42 = "ec+3";
                                                                                                                                    str43 = str92;
                                                                                                                                    if (ud7.j(str42, str43)) {
                                                                                                                                        hl2Var = null;
                                                                                                                                    } else {
                                                                                                                                        hl2 x = g8c.x(str42, str43, str94);
                                                                                                                                        String str107 = str43 != null ? str43 : str42;
                                                                                                                                        hl2Var = x;
                                                                                                                                        str40 = "video/dolby-vision";
                                                                                                                                        str42 = str107;
                                                                                                                                    }
                                                                                                                                    i9 = i2;
                                                                                                                                    int i37 = i9;
                                                                                                                                    while (true) {
                                                                                                                                        j19 = j14;
                                                                                                                                        if (i9 >= arrayList11.size()) {
                                                                                                                                            ArrayList arrayList68 = arrayList11;
                                                                                                                                            zd3 zd3Var2 = (zd3) arrayList68.get(i9);
                                                                                                                                            String str108 = str41;
                                                                                                                                            if (smd.a("urn:mpeg:dash:role:2011", zd3Var2.a)) {
                                                                                                                                                String str109 = zd3Var2.b;
                                                                                                                                                i37 |= (str109 == null || !(str109.equals("forced_subtitle") || str109.equals("forced-subtitle"))) ? i2 : 2;
                                                                                                                                            }
                                                                                                                                            i9++;
                                                                                                                                            arrayList11 = arrayList68;
                                                                                                                                            str41 = str108;
                                                                                                                                            j14 = j19;
                                                                                                                                        } else {
                                                                                                                                            String str110 = str41;
                                                                                                                                            int i38 = i2;
                                                                                                                                            int i39 = i38;
                                                                                                                                            while (true) {
                                                                                                                                                ArrayList arrayList69 = arrayList11;
                                                                                                                                                if (i38 < arrayList69.size()) {
                                                                                                                                                    zd3 zd3Var3 = (zd3) arrayList69.get(i38);
                                                                                                                                                    arrayList11 = arrayList69;
                                                                                                                                                    if (smd.a("urn:mpeg:dash:role:2011", zd3Var3.a)) {
                                                                                                                                                        i39 |= m(zd3Var3.b);
                                                                                                                                                    }
                                                                                                                                                    i38++;
                                                                                                                                                } else {
                                                                                                                                                    arrayList11 = arrayList69;
                                                                                                                                                    int i40 = i2;
                                                                                                                                                    int i41 = i40;
                                                                                                                                                    while (i40 < arrayList12.size()) {
                                                                                                                                                        ArrayList arrayList70 = arrayList12;
                                                                                                                                                        int i42 = i40;
                                                                                                                                                        zd3 zd3Var4 = (zd3) arrayList70.get(i40);
                                                                                                                                                        int i43 = i41;
                                                                                                                                                        String str111 = zd3Var4.a;
                                                                                                                                                        int i44 = i39;
                                                                                                                                                        String str112 = zd3Var4.b;
                                                                                                                                                        if (smd.a("urn:mpeg:dash:role:2011", str111)) {
                                                                                                                                                            i10 = m(str112);
                                                                                                                                                        } else if (smd.a("urn:tva:metadata:cs:AudioPurposeCS:2007", zd3Var4.a)) {
                                                                                                                                                            if (str112 != null) {
                                                                                                                                                                switch (str112.hashCode()) {
                                                                                                                                                                    case 49:
                                                                                                                                                                        if (str112.equals("1")) {
                                                                                                                                                                            i11 = i2;
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        i11 = -1;
                                                                                                                                                                        break;
                                                                                                                                                                    case 50:
                                                                                                                                                                        if (str112.equals("2")) {
                                                                                                                                                                            i11 = i3;
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        i11 = -1;
                                                                                                                                                                        break;
                                                                                                                                                                    case kk7.n0 /* 51 */:
                                                                                                                                                                        if (str112.equals("3")) {
                                                                                                                                                                            i11 = 2;
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        i11 = -1;
                                                                                                                                                                        break;
                                                                                                                                                                    case kk7.o0 /* 52 */:
                                                                                                                                                                        if (str112.equals("4")) {
                                                                                                                                                                            i11 = 3;
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        i11 = -1;
                                                                                                                                                                        break;
                                                                                                                                                                    case kk7.p0 /* 53 */:
                                                                                                                                                                    default:
                                                                                                                                                                        i11 = -1;
                                                                                                                                                                        break;
                                                                                                                                                                    case kk7.q0 /* 54 */:
                                                                                                                                                                        if (str112.equals("6")) {
                                                                                                                                                                            i11 = 4;
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        i11 = -1;
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                                switch (i11) {
                                                                                                                                                                    case 0:
                                                                                                                                                                        i10 = 512;
                                                                                                                                                                        break;
                                                                                                                                                                    case 1:
                                                                                                                                                                        i10 = 2048;
                                                                                                                                                                        break;
                                                                                                                                                                    case 2:
                                                                                                                                                                        i10 = 4;
                                                                                                                                                                        break;
                                                                                                                                                                    case 3:
                                                                                                                                                                        i10 = 8;
                                                                                                                                                                        break;
                                                                                                                                                                    case 4:
                                                                                                                                                                        i10 = i3;
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            i10 = i2;
                                                                                                                                                        } else {
                                                                                                                                                            i41 = i43;
                                                                                                                                                            i40 = i42 + 1;
                                                                                                                                                            arrayList12 = arrayList70;
                                                                                                                                                            i39 = i44;
                                                                                                                                                        }
                                                                                                                                                        i41 = i43 | i10;
                                                                                                                                                        i40 = i42 + 1;
                                                                                                                                                        arrayList12 = arrayList70;
                                                                                                                                                        i39 = i44;
                                                                                                                                                    }
                                                                                                                                                    ArrayList arrayList71 = arrayList12;
                                                                                                                                                    int n = i39 | i41 | n(arrayList21) | n(arrayList23);
                                                                                                                                                    int i45 = i2;
                                                                                                                                                    while (true) {
                                                                                                                                                        if (i45 < arrayList21.size()) {
                                                                                                                                                            zd3 zd3Var5 = (zd3) arrayList21.get(i45);
                                                                                                                                                            arrayList24 = arrayList21;
                                                                                                                                                            if ((smd.a("http://dashif.org/thumbnail_tile", zd3Var5.a) || smd.a("http://dashif.org/guidelines/thumbnail_tile", zd3Var5.a)) && (str44 = zd3Var5.b) != null) {
                                                                                                                                                                String str113 = g8c.a;
                                                                                                                                                                String[] split = str44.split("x", -1);
                                                                                                                                                                if (split.length == 2) {
                                                                                                                                                                    try {
                                                                                                                                                                        pair = Pair.create(Integer.valueOf(Integer.parseInt(split[i2])), Integer.valueOf(Integer.parseInt(split[i3])));
                                                                                                                                                                    } catch (NumberFormatException unused) {
                                                                                                                                                                        continue;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    continue;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            i45++;
                                                                                                                                                            arrayList21 = arrayList24;
                                                                                                                                                        } else {
                                                                                                                                                            arrayList24 = arrayList21;
                                                                                                                                                            pair = null;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    em4 em4Var = new em4();
                                                                                                                                                    em4Var.a = attributeValue24;
                                                                                                                                                    em4Var.r = ud7.n(str110);
                                                                                                                                                    em4Var.s = ud7.n(str40);
                                                                                                                                                    em4Var.k = str42;
                                                                                                                                                    em4Var.j = i6;
                                                                                                                                                    em4Var.e = i37;
                                                                                                                                                    em4Var.f = n;
                                                                                                                                                    em4Var.K = hl2Var;
                                                                                                                                                    String str114 = str31;
                                                                                                                                                    em4Var.d = str114;
                                                                                                                                                    em4Var.U = pair != null ? ((Integer) pair.first).intValue() : -1;
                                                                                                                                                    em4Var.V = pair != null ? ((Integer) pair.second).intValue() : -1;
                                                                                                                                                    if (ud7.m(str40)) {
                                                                                                                                                        em4Var.z = parseInt;
                                                                                                                                                        em4Var.A = parseInt2;
                                                                                                                                                        em4Var.a(j42);
                                                                                                                                                    } else {
                                                                                                                                                        int i46 = parseInt;
                                                                                                                                                        int i47 = parseInt2;
                                                                                                                                                        if (ud7.i(str40)) {
                                                                                                                                                            em4Var.M = i8;
                                                                                                                                                            em4Var.O = i5;
                                                                                                                                                        } else if (ud7.l(str40)) {
                                                                                                                                                            if ("application/cea-608".equals(str40)) {
                                                                                                                                                                int i48 = i2;
                                                                                                                                                                while (i48 < arrayList71.size()) {
                                                                                                                                                                    zd3 zd3Var6 = (zd3) arrayList71.get(i48);
                                                                                                                                                                    String str115 = zd3Var6.a;
                                                                                                                                                                    String str116 = zd3Var6.b;
                                                                                                                                                                    if ("urn:scte:dash:cc:cea-608:2015".equals(str115) && str116 != null) {
                                                                                                                                                                        Matcher matcher = c.matcher(str116);
                                                                                                                                                                        if (matcher.matches()) {
                                                                                                                                                                            parseInt3 = Integer.parseInt(matcher.group(i3));
                                                                                                                                                                            em4Var.S = parseInt3;
                                                                                                                                                                        } else {
                                                                                                                                                                            lad.f("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str116));
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    i48++;
                                                                                                                                                                    i3 = 1;
                                                                                                                                                                }
                                                                                                                                                                parseInt3 = -1;
                                                                                                                                                                em4Var.S = parseInt3;
                                                                                                                                                            } else {
                                                                                                                                                                if ("application/cea-708".equals(str40)) {
                                                                                                                                                                    for (int i49 = i2; i49 < arrayList71.size(); i49++) {
                                                                                                                                                                        zd3 zd3Var7 = (zd3) arrayList71.get(i49);
                                                                                                                                                                        String str117 = zd3Var7.a;
                                                                                                                                                                        String str118 = zd3Var7.b;
                                                                                                                                                                        if ("urn:scte:dash:cc:cea-708:2015".equals(str117) && str118 != null) {
                                                                                                                                                                            Matcher matcher2 = d.matcher(str118);
                                                                                                                                                                            if (matcher2.matches()) {
                                                                                                                                                                                parseInt3 = Integer.parseInt(matcher2.group(1));
                                                                                                                                                                                em4Var.S = parseInt3;
                                                                                                                                                                            } else {
                                                                                                                                                                                lad.f("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str118));
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                parseInt3 = -1;
                                                                                                                                                                em4Var.S = parseInt3;
                                                                                                                                                            }
                                                                                                                                                            j33 = j7;
                                                                                                                                                            str6 = str2;
                                                                                                                                                        } else if (ud7.k(str40)) {
                                                                                                                                                            em4Var.z = i46;
                                                                                                                                                            em4Var.A = i47;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    fm4 fm4Var2 = new fm4(em4Var);
                                                                                                                                                    tv9 sv9Var = tv9Var4 != null ? tv9Var4 : new sv9(null, 1L, 0L, 0L, 0L);
                                                                                                                                                    String str119 = fm4Var2.s;
                                                                                                                                                    if (str119 != null && ud7.l(str119) && sv9Var.c != 0) {
                                                                                                                                                        sv9Var = sv9Var.a();
                                                                                                                                                    }
                                                                                                                                                    i53 i53Var2 = new i53(fm4Var2, !arrayList18.isEmpty() ? arrayList18 : arrayList19, sv9Var, str39, arrayList20, arrayList60, arrayList24, arrayList23);
                                                                                                                                                    i24 = ud7.h(fm4Var2.t);
                                                                                                                                                    int i50 = i7;
                                                                                                                                                    if (i50 != -1) {
                                                                                                                                                        if (i24 != -1) {
                                                                                                                                                            gre.p(i50 == i24 ? 1 : i2);
                                                                                                                                                        }
                                                                                                                                                        i24 = i50;
                                                                                                                                                    }
                                                                                                                                                    ArrayList arrayList72 = arrayList17;
                                                                                                                                                    arrayList72.add(i53Var2);
                                                                                                                                                    arrayList45 = arrayList72;
                                                                                                                                                    str12 = str114;
                                                                                                                                                    j36 = j16;
                                                                                                                                                    arrayList12 = arrayList71;
                                                                                                                                                    str23 = str65;
                                                                                                                                                    arrayList15 = arrayList39;
                                                                                                                                                    arrayList14 = arrayList40;
                                                                                                                                                    str22 = str84;
                                                                                                                                                    j8 = j18;
                                                                                                                                                    j9 = j19;
                                                                                                                                                    str20 = str28;
                                                                                                                                                    str21 = str30;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i35 = i36 + 1;
                                                                                                                                arrayList22 = arrayList23;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        arrayList23 = arrayList22;
                                                                                                                        str40 = "audio/eac3";
                                                                                                                        if ("audio/eac3-joc".equals(str40)) {
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        arrayList23 = arrayList22;
                                                                                                                    }
                                                                                                                    str42 = str33;
                                                                                                                    str43 = str92;
                                                                                                                    if (ud7.j(str42, str43)) {
                                                                                                                    }
                                                                                                                    i9 = i2;
                                                                                                                    int i372 = i9;
                                                                                                                    while (true) {
                                                                                                                        j19 = j14;
                                                                                                                        if (i9 >= arrayList11.size()) {
                                                                                                                        }
                                                                                                                        i9++;
                                                                                                                        arrayList11 = arrayList68;
                                                                                                                        str41 = str108;
                                                                                                                        j14 = j19;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        d2 = null;
                                                                                                        str40 = d2;
                                                                                                        str41 = str88;
                                                                                                        if ("audio/eac3".equals(str40)) {
                                                                                                        }
                                                                                                        str42 = str33;
                                                                                                        str43 = str92;
                                                                                                        if (ud7.j(str42, str43)) {
                                                                                                        }
                                                                                                        i9 = i2;
                                                                                                        int i3722 = i9;
                                                                                                        while (true) {
                                                                                                            j19 = j14;
                                                                                                            if (i9 >= arrayList11.size()) {
                                                                                                            }
                                                                                                            i9++;
                                                                                                            arrayList11 = arrayList68;
                                                                                                            str41 = str108;
                                                                                                            j14 = j19;
                                                                                                        }
                                                                                                    } else if (ud7.m(str88)) {
                                                                                                        if (str33 != null) {
                                                                                                            String[] e02 = g8c.e0(str33);
                                                                                                            int length3 = e02.length;
                                                                                                            for (int i51 = i2; i51 < length3; i51++) {
                                                                                                                d2 = ud7.d(e02[i51]);
                                                                                                                if (d2 != null && ud7.m(d2)) {
                                                                                                                    str40 = d2;
                                                                                                                    str41 = str88;
                                                                                                                    if ("audio/eac3".equals(str40)) {
                                                                                                                    }
                                                                                                                    str42 = str33;
                                                                                                                    str43 = str92;
                                                                                                                    if (ud7.j(str42, str43)) {
                                                                                                                    }
                                                                                                                    i9 = i2;
                                                                                                                    int i37222 = i9;
                                                                                                                    while (true) {
                                                                                                                        j19 = j14;
                                                                                                                        if (i9 >= arrayList11.size()) {
                                                                                                                        }
                                                                                                                        i9++;
                                                                                                                        arrayList11 = arrayList68;
                                                                                                                        str41 = str108;
                                                                                                                        j14 = j19;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        d2 = null;
                                                                                                        str40 = d2;
                                                                                                        str41 = str88;
                                                                                                        if ("audio/eac3".equals(str40)) {
                                                                                                        }
                                                                                                        str42 = str33;
                                                                                                        str43 = str92;
                                                                                                        if (ud7.j(str42, str43)) {
                                                                                                        }
                                                                                                        i9 = i2;
                                                                                                        int i372222 = i9;
                                                                                                        while (true) {
                                                                                                            j19 = j14;
                                                                                                            if (i9 >= arrayList11.size()) {
                                                                                                            }
                                                                                                            i9++;
                                                                                                            arrayList11 = arrayList68;
                                                                                                            str41 = str108;
                                                                                                            j14 = j19;
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (ud7.l(str88) || ud7.k(str88)) {
                                                                                                            str40 = str88;
                                                                                                            str41 = str40;
                                                                                                        } else {
                                                                                                            str41 = str88;
                                                                                                            if ("application/mp4".equals(str41)) {
                                                                                                                str40 = ud7.d(str33);
                                                                                                                if ("text/vtt".equals(str40)) {
                                                                                                                    str40 = "application/x-mp4-vtt";
                                                                                                                }
                                                                                                            } else {
                                                                                                                str40 = null;
                                                                                                            }
                                                                                                        }
                                                                                                        if ("audio/eac3".equals(str40)) {
                                                                                                        }
                                                                                                        str42 = str33;
                                                                                                        str43 = str92;
                                                                                                        if (ud7.j(str42, str43)) {
                                                                                                        }
                                                                                                        i9 = i2;
                                                                                                        int i3722222 = i9;
                                                                                                        while (true) {
                                                                                                            j19 = j14;
                                                                                                            if (i9 >= arrayList11.size()) {
                                                                                                            }
                                                                                                            i9++;
                                                                                                            arrayList11 = arrayList68;
                                                                                                            str41 = str108;
                                                                                                            j14 = j19;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        i5 = parseInt8;
                                                                                        i6 = parseInt7;
                                                                                        str29 = str80;
                                                                                        j12 = j39;
                                                                                        str2 = str68;
                                                                                        str28 = str69;
                                                                                        str30 = str70;
                                                                                        arrayList17 = arrayList45;
                                                                                        str31 = str85;
                                                                                        i7 = i31;
                                                                                        arrayList20 = arrayList59;
                                                                                        arrayList22 = arrayList62;
                                                                                        i8 = i33;
                                                                                        str5 = str99;
                                                                                        j15 = j43;
                                                                                        str3 = str50;
                                                                                        arrayList18 = arrayList63;
                                                                                        j14 = i20;
                                                                                        arrayList7 = arrayList36;
                                                                                        str15 = str25;
                                                                                        str32 = str82;
                                                                                        str35 = str97;
                                                                                        arrayList48 = arrayList64;
                                                                                        str33 = str90;
                                                                                        str73 = str27;
                                                                                        str34 = str81;
                                                                                        str39 = str100;
                                                                                        f6 = f3;
                                                                                        String str120 = str66;
                                                                                        z2 = z;
                                                                                        j16 = j36;
                                                                                        j17 = j44;
                                                                                        str38 = str24;
                                                                                        arrayList21 = arrayList61;
                                                                                        long j52 = j35;
                                                                                        arrayList19 = arrayList16;
                                                                                        str14 = str120;
                                                                                        str37 = str86;
                                                                                        j18 = j52;
                                                                                        if (oye.b(xmlPullParser, str38)) {
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    arrayList48 = arrayList49;
                                                                                    arrayList13 = arrayList58;
                                                                                    str12 = str77;
                                                                                    str13 = attributeValue15;
                                                                                    str5 = str61;
                                                                                    int i52 = i24;
                                                                                    j12 = j39;
                                                                                    long j53 = i20;
                                                                                    str14 = str66;
                                                                                    str2 = str68;
                                                                                    arrayList7 = arrayList36;
                                                                                    long j54 = j35;
                                                                                    String str121 = str69;
                                                                                    str15 = str74;
                                                                                    str16 = str75;
                                                                                    str3 = str50;
                                                                                    z2 = z;
                                                                                    long j55 = j36;
                                                                                    str17 = str78;
                                                                                    str18 = str76;
                                                                                    str19 = str67;
                                                                                    String str122 = str70;
                                                                                    if (oye.c(xmlPullParser, str122)) {
                                                                                        tv9Var2 = o(xmlPullParser, (sv9) tv9Var2);
                                                                                        str21 = str122;
                                                                                        i24 = i52;
                                                                                        j36 = j55;
                                                                                        str23 = str65;
                                                                                        arrayList15 = arrayList39;
                                                                                        arrayList14 = arrayList40;
                                                                                        str22 = str84;
                                                                                        j8 = j54;
                                                                                        j9 = j53;
                                                                                        str20 = str121;
                                                                                    } else {
                                                                                        str20 = str121;
                                                                                        if (oye.c(xmlPullParser, str20)) {
                                                                                            long d5 = d(xmlPullParser, j38);
                                                                                            str21 = str122;
                                                                                            i4 = i52;
                                                                                            tv9Var2 = p(xmlPullParser, (pv9) tv9Var2, j54, j53, j12, d5, j55);
                                                                                            j9 = j53;
                                                                                            j8 = j54;
                                                                                            j38 = d5;
                                                                                            j36 = j55;
                                                                                        } else {
                                                                                            str21 = str122;
                                                                                            i4 = i52;
                                                                                            long j56 = j38;
                                                                                            j8 = j54;
                                                                                            j9 = j53;
                                                                                            long j57 = j55;
                                                                                            if (oye.c(xmlPullParser, str14)) {
                                                                                                long d6 = d(xmlPullParser, j56);
                                                                                                tv9Var2 = q(xmlPullParser, (qv9) tv9Var2, arrayList13, j8, j9, j12, d6, j57);
                                                                                                j38 = d6;
                                                                                                j36 = j57;
                                                                                            } else {
                                                                                                if (oye.c(xmlPullParser, "InbandEventStream")) {
                                                                                                    arrayList14 = arrayList40;
                                                                                                    arrayList14.add(h(xmlPullParser, "InbandEventStream"));
                                                                                                    j13 = j56;
                                                                                                    j36 = j57;
                                                                                                    arrayList15 = arrayList39;
                                                                                                    str22 = str84;
                                                                                                } else {
                                                                                                    arrayList14 = arrayList40;
                                                                                                    j13 = j56;
                                                                                                    if (oye.c(xmlPullParser, "Label")) {
                                                                                                        str22 = str84;
                                                                                                        String attributeValue33 = xmlPullParser.getAttributeValue(null, str22);
                                                                                                        String str123 = "";
                                                                                                        while (true) {
                                                                                                            xmlPullParser.next();
                                                                                                            j36 = j57;
                                                                                                            if (xmlPullParser.getEventType() == 4) {
                                                                                                                str123 = xmlPullParser.getText();
                                                                                                            } else {
                                                                                                                b(xmlPullParser);
                                                                                                            }
                                                                                                            if (oye.b(xmlPullParser, "Label")) {
                                                                                                                arrayList15 = arrayList39;
                                                                                                                arrayList15.add(new sw5(attributeValue33, str123));
                                                                                                            } else {
                                                                                                                j57 = j36;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        j36 = j57;
                                                                                                        arrayList15 = arrayList39;
                                                                                                        str22 = str84;
                                                                                                        if (xmlPullParser.getEventType() == 2) {
                                                                                                            b(xmlPullParser);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                str23 = str65;
                                                                                                j38 = j13;
                                                                                                i24 = i4;
                                                                                            }
                                                                                        }
                                                                                        str23 = str65;
                                                                                        arrayList15 = arrayList39;
                                                                                        arrayList14 = arrayList40;
                                                                                        str22 = str84;
                                                                                        i24 = i4;
                                                                                    }
                                                                                }
                                                                                if (oye.b(xmlPullParser, str23)) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                str12 = str77;
                                                                str13 = attributeValue15;
                                                                str5 = str61;
                                                                i4 = i24;
                                                                j12 = j39;
                                                                arrayList10 = arrayList38;
                                                                arrayList12 = arrayList41;
                                                                j9 = i20;
                                                                str2 = str68;
                                                                arrayList7 = arrayList36;
                                                                str20 = str69;
                                                                str21 = str70;
                                                                arrayList15 = arrayList39;
                                                                arrayList14 = arrayList40;
                                                                str15 = str74;
                                                                str16 = str75;
                                                                arrayList13 = arrayList47;
                                                                arrayList11 = arrayList42;
                                                                str3 = str50;
                                                                str22 = str51;
                                                                str14 = str66;
                                                                str17 = str78;
                                                                str18 = str76;
                                                                str19 = str67;
                                                                z2 = z;
                                                                j8 = j35;
                                                                j13 = j38;
                                                                str23 = str65;
                                                                j38 = j13;
                                                                i24 = i4;
                                                                if (oye.b(xmlPullParser, str23)) {
                                                                }
                                                            }
                                                        }
                                                        str12 = str77;
                                                        str13 = attributeValue15;
                                                        str5 = str61;
                                                        j12 = j39;
                                                        arrayList10 = arrayList38;
                                                        arrayList12 = arrayList41;
                                                        j9 = i20;
                                                        str23 = str65;
                                                        str2 = str68;
                                                        arrayList7 = arrayList36;
                                                        str20 = str69;
                                                        str21 = str70;
                                                        arrayList15 = arrayList39;
                                                        arrayList14 = arrayList40;
                                                        str15 = str74;
                                                        str16 = str75;
                                                        arrayList13 = arrayList47;
                                                        arrayList11 = arrayList42;
                                                        str3 = str50;
                                                        str22 = str51;
                                                        str14 = str66;
                                                        str17 = str78;
                                                    }
                                                    str18 = str76;
                                                    str19 = str67;
                                                    z2 = z;
                                                    j8 = j35;
                                                    if (oye.b(xmlPullParser, str23)) {
                                                    }
                                                }
                                            } else {
                                                j7 = j33;
                                                arrayList3 = arrayList31;
                                                str2 = str60;
                                                String str124 = str61;
                                                long j58 = j29;
                                                str3 = str50;
                                                long j59 = j;
                                                str4 = str51;
                                                long j60 = i20;
                                                arrayList7 = arrayList30;
                                                z2 = z;
                                                if (oye.c(xmlPullParser, "EventStream")) {
                                                    String str125 = str64;
                                                    String attributeValue34 = xmlPullParser.getAttributeValue(null, str125);
                                                    String str126 = attributeValue34 == null ? "" : attributeValue34;
                                                    String str127 = str62;
                                                    String attributeValue35 = xmlPullParser.getAttributeValue(null, str127);
                                                    String str128 = attributeValue35 == null ? "" : attributeValue35;
                                                    String attributeValue36 = xmlPullParser.getAttributeValue(null, "timescale");
                                                    long parseLong5 = attributeValue36 == null ? 1L : Long.parseLong(attributeValue36);
                                                    String attributeValue37 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
                                                    long parseLong6 = attributeValue37 == null ? 0L : Long.parseLong(attributeValue37);
                                                    ArrayList arrayList73 = new ArrayList();
                                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                                                    while (true) {
                                                        xmlPullParser.next();
                                                        if (oye.c(xmlPullParser, "Event")) {
                                                            str10 = str124;
                                                            String attributeValue38 = xmlPullParser.getAttributeValue(null, str10);
                                                            long parseLong7 = attributeValue38 == null ? 0L : Long.parseLong(attributeValue38);
                                                            str7 = str63;
                                                            String attributeValue39 = xmlPullParser.getAttributeValue(null, str7);
                                                            long parseLong8 = attributeValue39 == null ? -9223372036854775807L : Long.parseLong(attributeValue39);
                                                            String attributeValue40 = xmlPullParser.getAttributeValue(null, "presentationTime");
                                                            long parseLong9 = attributeValue40 == null ? 0L : Long.parseLong(attributeValue40);
                                                            String str129 = g8c.a;
                                                            RoundingMode roundingMode = RoundingMode.DOWN;
                                                            long b0 = g8c.b0(parseLong8, 1000L, parseLong5, roundingMode);
                                                            long b02 = g8c.b0(parseLong9 - parseLong6, 1000000L, parseLong5, roundingMode);
                                                            String attributeValue41 = xmlPullParser.getAttributeValue(null, "messageData");
                                                            if (attributeValue41 == null) {
                                                                attributeValue41 = null;
                                                            }
                                                            byteArrayOutputStream.reset();
                                                            XmlSerializer newSerializer = Xml.newSerializer();
                                                            str64 = str125;
                                                            newSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
                                                            xmlPullParser.nextToken();
                                                            while (!oye.b(xmlPullParser, "Event")) {
                                                                switch (xmlPullParser.getEventType()) {
                                                                    case 0:
                                                                        str11 = str127;
                                                                        j11 = parseLong6;
                                                                        newSerializer.startDocument(null, Boolean.FALSE);
                                                                        break;
                                                                    case 1:
                                                                        str11 = str127;
                                                                        j11 = parseLong6;
                                                                        newSerializer.endDocument();
                                                                        break;
                                                                    case 2:
                                                                        str11 = str127;
                                                                        newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                        int i53 = i2;
                                                                        while (i53 < xmlPullParser.getAttributeCount()) {
                                                                            newSerializer.attribute(xmlPullParser.getAttributeNamespace(i53), xmlPullParser.getAttributeName(i53), xmlPullParser.getAttributeValue(i53));
                                                                            i53++;
                                                                            parseLong6 = parseLong6;
                                                                        }
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 3:
                                                                        str11 = str127;
                                                                        newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 4:
                                                                        newSerializer.text(xmlPullParser.getText());
                                                                        str11 = str127;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 5:
                                                                        newSerializer.cdsect(xmlPullParser.getText());
                                                                        str11 = str127;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 6:
                                                                        newSerializer.entityRef(xmlPullParser.getText());
                                                                        str11 = str127;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 7:
                                                                        newSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                        str11 = str127;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 8:
                                                                        newSerializer.processingInstruction(xmlPullParser.getText());
                                                                        str11 = str127;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 9:
                                                                        newSerializer.comment(xmlPullParser.getText());
                                                                        str11 = str127;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 10:
                                                                        newSerializer.docdecl(xmlPullParser.getText());
                                                                        str11 = str127;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    default:
                                                                        str11 = str127;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                }
                                                                xmlPullParser.nextToken();
                                                                str127 = str11;
                                                                parseLong6 = j11;
                                                            }
                                                            str62 = str127;
                                                            j10 = parseLong6;
                                                            newSerializer.flush();
                                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                            Long valueOf = Long.valueOf(b02);
                                                            if (attributeValue41 != null) {
                                                                byteArray = attributeValue41.getBytes(StandardCharsets.UTF_8);
                                                            }
                                                            str8 = str126;
                                                            str9 = str128;
                                                            arrayList73.add(Pair.create(valueOf, new j44(str126, str128, b0, parseLong7, byteArray)));
                                                        } else {
                                                            str64 = str125;
                                                            str62 = str127;
                                                            j10 = parseLong6;
                                                            str7 = str63;
                                                            str8 = str126;
                                                            str9 = str128;
                                                            str10 = str124;
                                                            b(xmlPullParser);
                                                        }
                                                        if (oye.b(xmlPullParser, "EventStream")) {
                                                            long[] jArr = new long[arrayList73.size()];
                                                            j44[] j44VarArr = new j44[arrayList73.size()];
                                                            for (int i54 = i2; i54 < arrayList73.size(); i54++) {
                                                                Pair pair2 = (Pair) arrayList73.get(i54);
                                                                jArr[i54] = ((Long) pair2.first).longValue();
                                                                j44VarArr[i54] = (j44) pair2.second;
                                                            }
                                                            arrayList33.add(new m44(str8, str9, jArr, j44VarArr));
                                                            str5 = str10;
                                                            str63 = str7;
                                                            arrayList6 = arrayList6;
                                                            j = j59;
                                                            j8 = j58;
                                                            j9 = j60;
                                                        } else {
                                                            str126 = str8;
                                                            str128 = str9;
                                                            str124 = str10;
                                                            str63 = str7;
                                                            str127 = str62;
                                                            str125 = str64;
                                                            parseLong6 = j10;
                                                        }
                                                    }
                                                } else {
                                                    String str130 = str63;
                                                    ArrayList arrayList74 = arrayList33;
                                                    if (oye.c(xmlPullParser, "SegmentBase")) {
                                                        tv9Var = o(xmlPullParser, null);
                                                        arrayList33 = arrayList74;
                                                        str5 = str124;
                                                        str63 = str130;
                                                        arrayList6 = arrayList6;
                                                        j33 = j7;
                                                        j = j59;
                                                        j8 = j58;
                                                        j9 = j60;
                                                        str6 = str2;
                                                        j6 = -9223372036854775807L;
                                                    } else {
                                                        if (oye.c(xmlPullParser, "SegmentList")) {
                                                            str5 = str124;
                                                            j6 = -9223372036854775807L;
                                                            long d7 = d(xmlPullParser, -9223372036854775807L);
                                                            arrayList33 = arrayList74;
                                                            str63 = str130;
                                                            j = j59;
                                                            tv9Var = p(xmlPullParser, null, j58, j60, j7, d7, j);
                                                            j9 = j60;
                                                            j8 = j58;
                                                            j32 = d7;
                                                            arrayList6 = arrayList6;
                                                        } else {
                                                            arrayList33 = arrayList74;
                                                            str5 = str124;
                                                            str63 = str130;
                                                            j = j59;
                                                            j8 = j58;
                                                            j9 = j60;
                                                            j6 = -9223372036854775807L;
                                                            if (oye.c(xmlPullParser, str66)) {
                                                                long d8 = d(xmlPullParser, -9223372036854775807L);
                                                                km5 km5Var = mm5.b;
                                                                arrayList6 = arrayList6;
                                                                tv9Var = q(xmlPullParser, null, w59.e, j8, j9, j7, d8, j);
                                                                j = j;
                                                                j32 = d8;
                                                            } else {
                                                                arrayList6 = arrayList6;
                                                                if (oye.c(xmlPullParser, "AssetIdentifier")) {
                                                                    h(xmlPullParser, "AssetIdentifier");
                                                                } else {
                                                                    b(xmlPullParser);
                                                                }
                                                            }
                                                        }
                                                        j33 = j7;
                                                        str6 = str2;
                                                    }
                                                }
                                            }
                                            j6 = -9223372036854775807L;
                                            j33 = j7;
                                            str6 = str2;
                                        }
                                        if (oye.b(xmlPullParser, str6)) {
                                            Pair create = Pair.create(new f38(attributeValue12, i19, arrayList6, arrayList33), Long.valueOf(j9));
                                            f38 f38Var = (f38) create.first;
                                            if (f38Var.b != j6) {
                                                long longValue = ((Long) create.second).longValue();
                                                long j61 = longValue == j6 ? j6 : longValue + f38Var.b;
                                                arrayList4 = arrayList27;
                                                arrayList4.add(f38Var);
                                                j25 = j61;
                                            } else {
                                                if (!equals) {
                                                    throw av7.b("Unable to determine start of period " + arrayList27.size(), null);
                                                }
                                                arrayList4 = arrayList27;
                                                i18 = i3;
                                                j25 = j30;
                                            }
                                        } else {
                                            str60 = str6;
                                            j29 = j8;
                                            long j62 = j9;
                                            arrayList30 = arrayList7;
                                            i20 = j62;
                                            arrayList34 = arrayList5;
                                            arrayList32 = arrayList6;
                                            z = z2;
                                            arrayList31 = arrayList3;
                                            str50 = str3;
                                            str51 = str4;
                                            str61 = str5;
                                        }
                                    }
                                } else {
                                    arrayList3 = arrayList29;
                                    j5 = j25;
                                    z2 = z;
                                    j6 = j24;
                                    arrayList4 = arrayList27;
                                    b(xmlPullParser);
                                }
                            }
                            ks8Var = ks8Var2;
                            ce3Var = ce3Var2;
                        }
                        ks8Var = ks8Var2;
                        ce3Var = ce3Var2;
                        j23 = j4;
                        j25 = j5;
                    }
                    j23 = j4;
                }
            }
            if (oye.b(xmlPullParser, "MPD")) {
                if (i15 == j6) {
                    if (j25 != j6) {
                        i15 = j25;
                    } else if (!equals) {
                        throw av7.b("Unable to determine duration of static manifest.", null);
                    }
                }
                if (arrayList4.isEmpty()) {
                    throw av7.b("No periods found.", null);
                }
                return new h53(W, i15, i16, equals, j2, j, j3, W2, ks8Var, ce3Var, vq6Var, arrayList4, arrayList);
            }
            arrayList27 = arrayList4;
            ks8Var2 = ks8Var;
            ce3Var2 = ce3Var;
            i = i3;
            arrayList28 = arrayList2;
            arrayList26 = arrayList;
            uri2 = str;
            z = z2;
            a = arrayList3;
            j24 = j6;
            i13 = i2;
            str49 = null;
        }
    }

    public static az8 l(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
                return new az8(j, attributeValue, j2);
            }
        } else {
            j = 0;
        }
        j2 = -1;
        return new az8(j, attributeValue, j2);
    }

    public static int m(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return 128;
                case "description":
                    return 512;
                case "enhanced-audio-intelligibility":
                    return 2048;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return 256;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int n(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (smd.a("http://dashif.org/guidelines/trickmode", ((zd3) arrayList.get(i2)).a)) {
                i = TLObject.FLAG_14;
            }
        }
        return i;
    }

    public static sv9 o(XmlPullParser xmlPullParser, sv9 sv9Var) {
        long j;
        long j2 = sv9Var != null ? sv9Var.b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j2 = Long.parseLong(attributeValue);
        }
        long j3 = j2;
        long j4 = 0;
        long j5 = sv9Var != null ? sv9Var.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j5 = Long.parseLong(attributeValue2);
        }
        long j6 = j5;
        if (sv9Var != null) {
            j = sv9Var.d;
            j4 = sv9Var.e;
        } else {
            j = 0;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split("-");
            j = Long.parseLong(split[0]);
            j4 = (Long.parseLong(split[1]) - j) + 1;
        }
        long j7 = j4;
        long j8 = j;
        az8 az8Var = sv9Var != null ? sv9Var.a : null;
        while (true) {
            xmlPullParser.next();
            if (oye.c(xmlPullParser, "Initialization")) {
                az8Var = l(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            az8 az8Var2 = az8Var;
            if (oye.b(xmlPullParser, "SegmentBase")) {
                return new sv9(az8Var2, j3, j6, j8, j7);
            }
            az8Var = az8Var2;
        }
    }

    public static pv9 p(XmlPullParser xmlPullParser, pv9 pv9Var, long j, long j2, long j3, long j4, long j5) {
        long j6 = pv9Var != null ? pv9Var.b : 1L;
        ArrayList arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j6 = Long.parseLong(attributeValue);
        }
        long j7 = j6;
        long j8 = pv9Var != null ? pv9Var.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j8 = Long.parseLong(attributeValue2);
        }
        long j9 = j8;
        long j10 = pv9Var != null ? pv9Var.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j10 = Long.parseLong(attributeValue3);
        }
        long j11 = j10;
        long j12 = pv9Var != null ? pv9Var.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j12 = Long.parseLong(attributeValue4);
        }
        long j13 = j12;
        long j14 = j4 == -9223372036854775807L ? j3 : j4;
        long j15 = j14 == Long.MAX_VALUE ? -9223372036854775807L : j14;
        az8 az8Var = null;
        ArrayList arrayList2 = null;
        do {
            xmlPullParser.next();
            if (oye.c(xmlPullParser, "Initialization")) {
                az8Var = l(xmlPullParser, "sourceURL", "range");
            } else if (oye.c(xmlPullParser, "SegmentTimeline")) {
                arrayList2 = r(xmlPullParser, j7, j2);
            } else if (oye.c(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(l(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!oye.b(xmlPullParser, "SegmentList"));
        if (pv9Var != null) {
            if (az8Var == null) {
                az8Var = pv9Var.a;
            }
            if (arrayList2 == null) {
                arrayList2 = pv9Var.f;
            }
            if (arrayList == null) {
                arrayList = pv9Var.j;
            }
        }
        return new pv9(az8Var, j7, j9, j13, j11, arrayList2, j15, arrayList, g8c.T(j5), g8c.T(j));
    }

    public static qv9 q(XmlPullParser xmlPullParser, qv9 qv9Var, List list, long j, long j2, long j3, long j4, long j5) {
        long j6;
        long j7 = qv9Var != null ? qv9Var.b : 1L;
        az8 az8Var = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j7 = Long.parseLong(attributeValue);
        }
        long j8 = j7;
        long j9 = qv9Var != null ? qv9Var.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j9 = Long.parseLong(attributeValue2);
        }
        long j10 = j9;
        long j11 = qv9Var != null ? qv9Var.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j11 = Long.parseLong(attributeValue3);
        }
        long j12 = j11;
        long j13 = qv9Var != null ? qv9Var.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j13 = Long.parseLong(attributeValue4);
        }
        long j14 = j13;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            zd3 zd3Var = (zd3) list.get(i);
            if (smd.a("http://dashif.org/guidelines/last-segment-number", zd3Var.a)) {
                j6 = Long.parseLong(zd3Var.b);
                break;
            }
            i++;
        }
        long j15 = j6;
        long j16 = j4 == -9223372036854775807L ? j3 : j4;
        long j17 = j16 == Long.MAX_VALUE ? -9223372036854775807L : j16;
        vk9 s = s(xmlPullParser, "media", qv9Var != null ? qv9Var.k : null);
        vk9 s2 = s(xmlPullParser, "initialization", qv9Var != null ? qv9Var.j : null);
        ArrayList arrayList = null;
        do {
            xmlPullParser.next();
            if (oye.c(xmlPullParser, "Initialization")) {
                az8Var = l(xmlPullParser, "sourceURL", "range");
            } else if (oye.c(xmlPullParser, "SegmentTimeline")) {
                arrayList = r(xmlPullParser, j8, j2);
            } else {
                b(xmlPullParser);
            }
        } while (!oye.b(xmlPullParser, "SegmentTemplate"));
        if (qv9Var != null) {
            if (az8Var == null) {
                az8Var = qv9Var.a;
            }
            if (arrayList == null) {
                arrayList = qv9Var.f;
            }
        }
        return new qv9(az8Var, j8, j10, j14, j15, j12, arrayList, j17, s2, s, g8c.T(j5), g8c.T(j));
    }

    public static ArrayList r(XmlPullParser xmlPullParser, long j, long j2) {
        long j3;
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        long j5 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (oye.c(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long parseLong = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z) {
                    int i2 = i;
                    j3 = parseLong;
                    j4 = a(arrayList, j4, j5, i2, j3);
                } else {
                    j3 = parseLong;
                }
                if (j3 != -9223372036854775807L) {
                    j4 = j3;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j5 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z = true;
            } else {
                b(xmlPullParser);
            }
        } while (!oye.b(xmlPullParser, "SegmentTimeline"));
        if (z) {
            String str = g8c.a;
            a(arrayList, j4, j5, i, g8c.b0(j2, j, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011d, code lost:
    
        switch(r7) {
            case 0: goto L46;
            case 1: goto L45;
            case 2: goto L44;
            default: goto L59;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012a, code lost:
    
        r14.add(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0143, code lost:
    
        r1.set(r14.size() - 1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0133, code lost:
    
        r14.add(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013c, code lost:
    
        r14.add(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0120, code lost:
    
        w26.j("Invalid template: ".concat(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0129, code lost:
    
        return null;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vk9 s(XmlPullParser xmlPullParser, String str, vk9 vk9Var) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return vk9Var;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int i = 0;
        while (i < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i);
            char c2 = 65535;
            if (indexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i));
                i = attributeValue.length();
            } else if (indexOf != i) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i, indexOf));
                i = indexOf;
            } else if (attributeValue.startsWith("$$", i)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                i += 2;
            } else {
                arrayList3.add("");
                int i2 = i + 1;
                int indexOf2 = attributeValue.indexOf("$", i2);
                String substring = attributeValue.substring(i2, indexOf2);
                if (!substring.equals("RepresentationID")) {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = str2.concat("d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (substring.equals("Number")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 2606829:
                            if (substring.equals("Time")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 38199441:
                            if (substring.equals("Bandwidth")) {
                                c2 = 2;
                                break;
                            }
                            break;
                    }
                } else {
                    arrayList2.add(1);
                }
                arrayList.add("");
                i = indexOf2 + 1;
            }
        }
        return new vk9(arrayList, arrayList2, arrayList3, (byte) 11);
    }

    @Override // bv7
    public final Object v(Uri uri, s63 s63Var) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(s63Var, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return k(newPullParser, uri);
            }
            throw av7.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            if (e2.getDetail() instanceof IOException) {
                throw ((IOException) e2.getDetail());
            }
            throw av7.b(null, e2);
        }
    }
}
