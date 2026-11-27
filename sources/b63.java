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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class b63 extends DefaultHandler implements iy7 {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    public static final int[] f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public b63() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            grb.j("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            String str = gcc.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new lz9(j, j2));
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
                        String[] e0 = gcc.e0(str);
                        if (e0.length != 0) {
                            List d0 = new um4(new l09(new ck1('.', (byte) 0), (byte) 12)).d0(jrd.c(e0[0].trim()));
                            if (d0.size() == 4 && ((String) d0.get(0)).equals("ac-4")) {
                                String str2 = (String) d0.get(3);
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
                    String c4 = jrd.c(attributeValue5);
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
        } while (!h3f.b(xmlPullParser, "AudioChannelConfiguration"));
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
        } while (!h3f.b(xmlPullParser, "BaseURL"));
        if (str != null && d2f.a(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return ose.a(new xg0(parseInt, parseInt2, str, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            xg0 xg0Var = (xg0) arrayList.get(i);
            String c2 = d2f.c(xg0Var.a, str);
            String str2 = attributeValue3 == null ? c2 : attributeValue3;
            if (z) {
                parseInt = xg0Var.c;
                parseInt2 = xg0Var.d;
                str2 = xg0Var.b;
            }
            arrayList2.add(new xg0(parseInt, parseInt2, c2, str2));
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
            String c3 = jrd.c(attributeValue);
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
                    r7 = o51.d;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r8 = str2;
                    break;
                case 1:
                    r7 = o51.f;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r8 = str2;
                    break;
                case 2:
                    r7 = o51.e;
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
                        r7 = o51.c;
                        str3 = null;
                        r8 = lwe.a(r7, uuidArr, null);
                        break;
                    } else {
                        efd.f("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        r7 = null;
                        str2 = r7;
                        str3 = str2;
                        r8 = str2;
                        break;
                    }
            }
            do {
                xmlPullParser.next();
                if ((!h3f.c(xmlPullParser, "clearkey:Laurl") || h3f.c(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r8 = r8;
                } else if (h3f.c(xmlPullParser, "ms:laurl")) {
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
                            sx8 b2 = lwe.b(decode);
                            UUID uuid = b2 == null ? null : (UUID) b2.c;
                            if (uuid == null) {
                                efd.f("MpdParser", "Skipping malformed cenc:pssh data");
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
                        ?? r10 = o51.f;
                        if (r10.equals(r7) && h3f.c(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r8 = lwe.a(r10, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    b(xmlPullParser);
                    r8 = r8;
                }
            } while (!h3f.b(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r7 != null ? new gr3(r7, str3, "video/mp4", r8) : null);
        }
        str = null;
        r7 = null;
        str2 = r7;
        str3 = str2;
        r8 = str2;
        do {
            xmlPullParser.next();
            if (h3f.c(xmlPullParser, "clearkey:Laurl")) {
            }
            str3 = xmlPullParser.getText();
            r8 = r8;
        } while (!h3f.b(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r7 != null ? new gr3(r7, str3, "video/mp4", r8) : null);
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

    public static te3 h(XmlPullParser xmlPullParser, String str) {
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
        } while (!h3f.b(xmlPullParser, str));
        return new te3(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = gcc.e.matcher(attributeValue);
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
    /* JADX WARN: Code restructure failed: missing block: B:388:0x09ea, code lost:
    
        if ("audio/eac3-joc".equals(r1) != false) goto L344;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0d04 A[LOOP:11: B:355:0x073c->B:363:0x0d04, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x092c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0a1d  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0a50 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x09f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z53 k(XmlPullParser xmlPullParser, Uri uri) {
        int i;
        boolean z;
        long j;
        long j2;
        long j3;
        int i2;
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
        int i3;
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
        String str32;
        long j14;
        String str33;
        ArrayList arrayList18;
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
        bm2 bm2Var;
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
        Object sb9Var;
        String str47;
        String str48;
        tv8 tv8Var;
        j5 j5Var;
        ArrayList arrayList25;
        long j21;
        long j22;
        String[] strArr = new String[0];
        String str49 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(",");
        }
        int length = strArr.length;
        int i13 = 0;
        while (true) {
            i = 1;
            if (i13 >= length) {
                z = false;
                break;
            }
            if (strArr[i13].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z = true;
                break;
            }
            i13++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long W = attributeValue2 == null ? -9223372036854775807L : gcc.W(attributeValue2);
        long i14 = i(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long i15 = i(xmlPullParser, "minBufferTime", -9223372036854775807L);
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
        long W2 = attributeValue3 == null ? -9223372036854775807L : gcc.W(attributeValue3);
        ArrayList arrayList26 = new ArrayList();
        long j23 = equals ? 0L : -9223372036854775807L;
        String uri2 = uri.toString();
        ArrayList a = ose.a(new xg0(z ? 1 : TLObject.FLAG_31, 1, uri2, uri2));
        ArrayList arrayList27 = new ArrayList();
        ArrayList arrayList28 = new ArrayList();
        long j24 = -9223372036854775807L;
        long j25 = equals ? -9223372036854775807L : 0L;
        int i16 = 0;
        int i17 = 0;
        tv8 tv8Var2 = null;
        j5 j5Var2 = null;
        zs6 zs6Var = null;
        while (true) {
            xmlPullParser.next();
            String str50 = "BaseURL";
            if (h3f.c(xmlPullParser, "BaseURL")) {
                if (i16 == 0) {
                    j23 = d(xmlPullParser, j23);
                    i16 = i;
                }
                arrayList28.addAll(e(xmlPullParser, a, z));
                arrayList = arrayList26;
                str = uri2;
                arrayList3 = a;
                arrayList2 = arrayList28;
                z2 = z;
                i2 = i;
                j6 = j24;
                arrayList4 = arrayList27;
                tv8Var = tv8Var2;
                j5Var = j5Var2;
            } else {
                i2 = i;
                String str51 = "lang";
                if (h3f.c(xmlPullParser, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(str49, "moreInformationURL");
                    String str52 = attributeValue4 == null ? str49 : attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str49, "lang");
                    String str53 = attributeValue5 == null ? str49 : attributeValue5;
                    String str54 = str49;
                    String str55 = str54;
                    String str56 = str55;
                    while (true) {
                        xmlPullParser.next();
                        if (h3f.c(xmlPullParser, "Title")) {
                            str54 = xmlPullParser.nextText();
                        } else if (h3f.c(xmlPullParser, "Source")) {
                            str55 = xmlPullParser.nextText();
                        } else if (h3f.c(xmlPullParser, "Copyright")) {
                            str56 = xmlPullParser.nextText();
                        } else {
                            b(xmlPullParser);
                        }
                        String str57 = str54;
                        String str58 = str55;
                        String str59 = str56;
                        if (h3f.b(xmlPullParser, "ProgramInformation")) {
                            tv8 tv8Var3 = new tv8(str57, str58, str59, str52, str53);
                            arrayList = arrayList26;
                            str = uri2;
                            arrayList3 = a;
                            arrayList2 = arrayList28;
                            z2 = z;
                            j6 = j24;
                            arrayList4 = arrayList27;
                            j5Var = j5Var2;
                            tv8Var = tv8Var3;
                        } else {
                            str54 = str57;
                            str55 = str58;
                            str56 = str59;
                        }
                    }
                } else {
                    if (h3f.c(xmlPullParser, "UTCTiming")) {
                        j4 = j23;
                        j5Var = new j5(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"), (byte) 4, false);
                        j6 = j24;
                        arrayList = arrayList26;
                        str = uri2;
                        arrayList3 = a;
                        arrayList2 = arrayList28;
                        z2 = z;
                        arrayList4 = arrayList27;
                        tv8Var = tv8Var2;
                    } else {
                        j4 = j23;
                        if (h3f.c(xmlPullParser, "Location")) {
                            String attributeValue6 = xmlPullParser.getAttributeValue(null, "serviceLocation");
                            Uri parse = Uri.parse(d2f.c(uri2, xmlPullParser.nextText()));
                            arrayList26.add(attributeValue6 != null ? new wb6(parse, attributeValue6) : new wb6(parse));
                            arrayList = arrayList26;
                            j5 = j25;
                            str = uri2;
                            arrayList3 = a;
                            arrayList2 = arrayList28;
                            z2 = z;
                            j6 = j24;
                            arrayList4 = arrayList27;
                        } else {
                            if (h3f.c(xmlPullParser, "ServiceDescription")) {
                                long j26 = j24;
                                long j27 = j26;
                                long j28 = j27;
                                float f4 = -3.4028235E38f;
                                float f5 = -3.4028235E38f;
                                while (true) {
                                    xmlPullParser.next();
                                    arrayList = arrayList26;
                                    if (h3f.c(xmlPullParser, "Latency")) {
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
                                        if (h3f.c(xmlPullParser, "PlaybackRate")) {
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
                                    if (h3f.b(xmlPullParser, "ServiceDescription")) {
                                        zs6 zs6Var2 = new zs6();
                                        zs6Var2.a = j26;
                                        zs6Var2.b = j21;
                                        zs6Var2.c = j22;
                                        zs6Var2.d = f4;
                                        zs6Var2.e = f5;
                                        arrayList3 = arrayList25;
                                        zs6Var = zs6Var2;
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
                                if (h3f.c(xmlPullParser, "Period") && i17 == 0) {
                                    ArrayList arrayList30 = !arrayList2.isEmpty() ? arrayList2 : arrayList29;
                                    String str61 = "id";
                                    String attributeValue12 = xmlPullParser.getAttributeValue(null, "id");
                                    long i18 = i(xmlPullParser, "start", j25);
                                    long j29 = W != j24 ? W + i18 : j24;
                                    String str62 = "value";
                                    long j30 = j25;
                                    ArrayList arrayList31 = arrayList29;
                                    long j31 = j24;
                                    long i19 = i(xmlPullParser, "duration", j31);
                                    String str63 = "duration";
                                    ArrayList arrayList32 = new ArrayList();
                                    String str64 = "schemeIdUri";
                                    ArrayList arrayList33 = new ArrayList();
                                    ArrayList arrayList34 = new ArrayList();
                                    long j32 = j31;
                                    long j33 = j4;
                                    int i20 = 0;
                                    nz9 nz9Var = null;
                                    while (true) {
                                        xmlPullParser.next();
                                        if (h3f.c(xmlPullParser, str50)) {
                                            if (i20 == 0) {
                                                j33 = d(xmlPullParser, j33);
                                                i20 = i2;
                                            }
                                            arrayList34.addAll(e(xmlPullParser, arrayList30, z));
                                            arrayList3 = arrayList31;
                                            str5 = str61;
                                            str3 = str50;
                                            z2 = z;
                                            str4 = str51;
                                            arrayList5 = arrayList34;
                                            arrayList6 = arrayList32;
                                            j33 = j33;
                                            j6 = -9223372036854775807L;
                                            long j34 = j29;
                                            str6 = str60;
                                            j8 = j34;
                                            arrayList7 = arrayList30;
                                            j9 = i19;
                                        } else {
                                            arrayList5 = arrayList34;
                                            arrayList6 = arrayList32;
                                            String str65 = "AdaptationSet";
                                            String str66 = "SegmentTemplate";
                                            if (h3f.c(xmlPullParser, "AdaptationSet")) {
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
                                                String str77 = "scte214:supplementalCodecs";
                                                ArrayList arrayList47 = arrayList44;
                                                ArrayList arrayList48 = arrayList43;
                                                nz9 nz9Var2 = nz9Var;
                                                long j38 = j32;
                                                int i21 = g;
                                                long j39 = j7;
                                                String str78 = attributeValue21;
                                                int i22 = 0;
                                                String str79 = null;
                                                int i23 = -1;
                                                while (true) {
                                                    xmlPullParser.next();
                                                    if (h3f.c(xmlPullParser, str50)) {
                                                        if (i22 == 0) {
                                                            j39 = d(xmlPullParser, j39);
                                                            i22 = i2;
                                                        }
                                                        long j40 = j39;
                                                        arrayList46.addAll(e(xmlPullParser, arrayList35, z));
                                                        String str80 = str69;
                                                        str3 = str50;
                                                        str22 = str51;
                                                        str20 = str80;
                                                        str12 = str78;
                                                        str13 = attributeValue15;
                                                        str5 = str61;
                                                        arrayList10 = arrayList38;
                                                        arrayList12 = arrayList41;
                                                        j9 = i19;
                                                        str19 = str66;
                                                        str2 = str68;
                                                        arrayList7 = arrayList36;
                                                        str21 = str70;
                                                        arrayList15 = arrayList39;
                                                        str14 = str74;
                                                        str15 = str75;
                                                        str16 = str77;
                                                        str17 = str76;
                                                        arrayList13 = arrayList47;
                                                        j12 = j40;
                                                        i3 = 0;
                                                        arrayList8 = arrayList35;
                                                        arrayList11 = arrayList42;
                                                        str18 = str67;
                                                        arrayList9 = arrayList46;
                                                        z2 = z;
                                                        str23 = str65;
                                                        j8 = j35;
                                                        arrayList14 = arrayList40;
                                                    } else {
                                                        arrayList8 = arrayList35;
                                                        if (h3f.c(xmlPullParser, "ContentProtection")) {
                                                            Pair f7 = f(xmlPullParser);
                                                            arrayList9 = arrayList46;
                                                            Object obj = f7.first;
                                                            if (obj != null) {
                                                                str79 = (String) obj;
                                                            }
                                                            Object obj2 = f7.second;
                                                            if (obj2 != null) {
                                                                arrayList38.add((gr3) obj2);
                                                            }
                                                            String str81 = str69;
                                                            str3 = str50;
                                                            str22 = str51;
                                                            str20 = str81;
                                                        } else {
                                                            arrayList9 = arrayList46;
                                                            if (h3f.c(xmlPullParser, "ContentComponent")) {
                                                                String attributeValue23 = xmlPullParser.getAttributeValue(null, str51);
                                                                if (str78 == null) {
                                                                    str78 = attributeValue23;
                                                                } else if (attributeValue23 != null) {
                                                                    yve.p(str78.equals(attributeValue23));
                                                                }
                                                                int g2 = g(xmlPullParser);
                                                                if (i21 == -1) {
                                                                    i21 = g2;
                                                                } else if (g2 != -1) {
                                                                    yve.p(i21 == g2 ? i2 : 0);
                                                                }
                                                                String str82 = str69;
                                                                str3 = str50;
                                                                str22 = str51;
                                                                str20 = str82;
                                                                str12 = str78;
                                                                str13 = attributeValue15;
                                                                str5 = str61;
                                                                j12 = j39;
                                                                arrayList10 = arrayList38;
                                                                arrayList12 = arrayList41;
                                                                j9 = i19;
                                                                str23 = str65;
                                                                str19 = str66;
                                                                str2 = str68;
                                                                arrayList7 = arrayList36;
                                                                str21 = str70;
                                                                arrayList15 = arrayList39;
                                                                arrayList14 = arrayList40;
                                                                str14 = str74;
                                                                str15 = str75;
                                                                str16 = str77;
                                                                str17 = str76;
                                                                arrayList13 = arrayList47;
                                                                i3 = 0;
                                                                arrayList11 = arrayList42;
                                                                str18 = str67;
                                                                z2 = z;
                                                                j8 = j35;
                                                            } else {
                                                                if (h3f.c(xmlPullParser, "Role")) {
                                                                    arrayList42.add(h(xmlPullParser, "Role"));
                                                                } else {
                                                                    String str83 = "AudioChannelConfiguration";
                                                                    if (h3f.c(xmlPullParser, "AudioChannelConfiguration")) {
                                                                        String str84 = str69;
                                                                        str3 = str50;
                                                                        str22 = str51;
                                                                        str20 = str84;
                                                                        i23 = c(xmlPullParser, attributeValue15);
                                                                    } else {
                                                                        String str85 = "ContentProtection";
                                                                        if (h3f.c(xmlPullParser, "Accessibility")) {
                                                                            arrayList41.add(h(xmlPullParser, "Accessibility"));
                                                                        } else if (h3f.c(xmlPullParser, "EssentialProperty")) {
                                                                            arrayList48.add(h(xmlPullParser, "EssentialProperty"));
                                                                            String str86 = str69;
                                                                            str3 = str50;
                                                                            str22 = str51;
                                                                            str20 = str86;
                                                                            str12 = str78;
                                                                            str13 = attributeValue15;
                                                                            str5 = str61;
                                                                            i4 = i21;
                                                                            j12 = j39;
                                                                            arrayList10 = arrayList38;
                                                                            arrayList12 = arrayList41;
                                                                            j9 = i19;
                                                                            str19 = str66;
                                                                            str2 = str68;
                                                                            arrayList7 = arrayList36;
                                                                            str21 = str70;
                                                                            arrayList15 = arrayList39;
                                                                            arrayList14 = arrayList40;
                                                                            str14 = str74;
                                                                            str15 = str75;
                                                                            str16 = str77;
                                                                            str17 = str76;
                                                                            arrayList13 = arrayList47;
                                                                            i3 = 0;
                                                                            arrayList11 = arrayList42;
                                                                            str18 = str67;
                                                                            z2 = z;
                                                                            j8 = j35;
                                                                            j13 = j38;
                                                                            str23 = str65;
                                                                            j38 = j13;
                                                                            i21 = i4;
                                                                        } else {
                                                                            ArrayList arrayList49 = arrayList48;
                                                                            String str87 = "EssentialProperty";
                                                                            arrayList10 = arrayList38;
                                                                            if (h3f.c(xmlPullParser, "SupplementalProperty")) {
                                                                                ArrayList arrayList50 = arrayList47;
                                                                                arrayList50.add(h(xmlPullParser, "SupplementalProperty"));
                                                                                String str88 = str69;
                                                                                str3 = str50;
                                                                                str22 = str51;
                                                                                str20 = str88;
                                                                                arrayList48 = arrayList49;
                                                                                arrayList11 = arrayList42;
                                                                                str12 = str78;
                                                                                str13 = attributeValue15;
                                                                                str5 = str61;
                                                                                i4 = i21;
                                                                                j12 = j39;
                                                                                arrayList13 = arrayList50;
                                                                                arrayList12 = arrayList41;
                                                                                j9 = i19;
                                                                                str19 = str66;
                                                                                str2 = str68;
                                                                                arrayList7 = arrayList36;
                                                                                str21 = str70;
                                                                                arrayList15 = arrayList39;
                                                                                arrayList14 = arrayList40;
                                                                                str14 = str74;
                                                                                str15 = str75;
                                                                                str16 = str77;
                                                                                str17 = str76;
                                                                                i3 = 0;
                                                                                str18 = str67;
                                                                                z2 = z;
                                                                                j8 = j35;
                                                                                j13 = j38;
                                                                                str23 = str65;
                                                                                j38 = j13;
                                                                                i21 = i4;
                                                                            } else {
                                                                                ArrayList arrayList51 = arrayList47;
                                                                                arrayList11 = arrayList42;
                                                                                String str89 = str51;
                                                                                arrayList12 = arrayList41;
                                                                                if (h3f.c(xmlPullParser, "Representation")) {
                                                                                    if (arrayList9.isEmpty()) {
                                                                                        str24 = "Representation";
                                                                                        arrayList16 = arrayList8;
                                                                                    } else {
                                                                                        str24 = "Representation";
                                                                                        arrayList16 = arrayList9;
                                                                                    }
                                                                                    String str90 = str78;
                                                                                    String str91 = "SupplementalProperty";
                                                                                    String attributeValue24 = xmlPullParser.getAttributeValue(null, str61);
                                                                                    str13 = attributeValue15;
                                                                                    String attributeValue25 = xmlPullParser.getAttributeValue(null, "bandwidth");
                                                                                    int parseInt7 = attributeValue25 == null ? -1 : Integer.parseInt(attributeValue25);
                                                                                    String attributeValue26 = xmlPullParser.getAttributeValue(null, str67);
                                                                                    String str92 = str76;
                                                                                    str18 = str67;
                                                                                    String str93 = attributeValue26 == null ? attributeValue14 : attributeValue26;
                                                                                    String attributeValue27 = xmlPullParser.getAttributeValue(null, str92);
                                                                                    String str94 = str77;
                                                                                    str17 = str92;
                                                                                    String str95 = attributeValue27 == null ? str13 : attributeValue27;
                                                                                    String attributeValue28 = xmlPullParser.getAttributeValue(null, str94);
                                                                                    String str96 = str75;
                                                                                    str16 = str94;
                                                                                    String str97 = attributeValue28 == null ? attributeValue16 : attributeValue28;
                                                                                    String attributeValue29 = xmlPullParser.getAttributeValue(null, str96);
                                                                                    String str98 = str74;
                                                                                    str15 = str96;
                                                                                    String str99 = attributeValue29 == null ? attributeValue17 : attributeValue29;
                                                                                    String attributeValue30 = xmlPullParser.getAttributeValue(null, str98);
                                                                                    if (attributeValue30 == null) {
                                                                                        String str100 = str73;
                                                                                        str25 = str98;
                                                                                        str26 = str100;
                                                                                        parseInt = parseInt4;
                                                                                    } else {
                                                                                        String str101 = str73;
                                                                                        str25 = str98;
                                                                                        str26 = str101;
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
                                                                                    String str102 = "InbandEventStream";
                                                                                    float j41 = j(xmlPullParser, f2);
                                                                                    String str103 = str71;
                                                                                    String attributeValue32 = xmlPullParser.getAttributeValue(null, str103);
                                                                                    int parseInt8 = attributeValue32 == null ? parseInt6 : Integer.parseInt(attributeValue32);
                                                                                    str71 = str103;
                                                                                    ArrayList arrayList52 = new ArrayList();
                                                                                    ArrayList arrayList53 = new ArrayList();
                                                                                    ArrayList arrayList54 = new ArrayList(arrayList49);
                                                                                    ArrayList arrayList55 = new ArrayList(arrayList51);
                                                                                    ArrayList arrayList56 = new ArrayList();
                                                                                    ArrayList arrayList57 = arrayList49;
                                                                                    arrayList13 = arrayList51;
                                                                                    String str104 = str61;
                                                                                    int i24 = i21;
                                                                                    long j42 = j39;
                                                                                    nz9 nz9Var3 = nz9Var2;
                                                                                    long j43 = j38;
                                                                                    int i25 = i23;
                                                                                    int i26 = 0;
                                                                                    String str105 = null;
                                                                                    while (true) {
                                                                                        xmlPullParser.next();
                                                                                        if (h3f.c(xmlPullParser, str50)) {
                                                                                            if (i26 == 0) {
                                                                                                j42 = d(xmlPullParser, j42);
                                                                                                i26 = i2;
                                                                                            }
                                                                                            f3 = f2;
                                                                                            arrayList56.addAll(e(xmlPullParser, arrayList16, z));
                                                                                        } else {
                                                                                            f3 = f2;
                                                                                            if (h3f.c(xmlPullParser, str83)) {
                                                                                                i25 = c(xmlPullParser, str95);
                                                                                            } else {
                                                                                                String str106 = str70;
                                                                                                if (h3f.c(xmlPullParser, str106)) {
                                                                                                    str70 = str106;
                                                                                                    nz9Var3 = o(xmlPullParser, (mz9) nz9Var3);
                                                                                                } else {
                                                                                                    String str107 = str69;
                                                                                                    if (h3f.c(xmlPullParser, str107)) {
                                                                                                        str29 = str83;
                                                                                                        str3 = str50;
                                                                                                        long d3 = d(xmlPullParser, j43);
                                                                                                        str28 = str107;
                                                                                                        i5 = parseInt8;
                                                                                                        i6 = parseInt7;
                                                                                                        j12 = j39;
                                                                                                        long j44 = i19;
                                                                                                        str2 = str68;
                                                                                                        arrayList7 = arrayList36;
                                                                                                        long j45 = j35;
                                                                                                        long j46 = j36;
                                                                                                        str30 = str106;
                                                                                                        str14 = str25;
                                                                                                        arrayList17 = arrayList45;
                                                                                                        str31 = str90;
                                                                                                        i7 = i24;
                                                                                                        str5 = str104;
                                                                                                        arrayList18 = arrayList16;
                                                                                                        str32 = str95;
                                                                                                        str73 = str27;
                                                                                                        str33 = str87;
                                                                                                        str34 = str85;
                                                                                                        arrayList48 = arrayList57;
                                                                                                        f6 = f3;
                                                                                                        nz9Var3 = p(xmlPullParser, (jz9) nz9Var3, j45, j44, j42, d3, j46);
                                                                                                        j14 = j44;
                                                                                                        j17 = d3;
                                                                                                        j15 = j42;
                                                                                                        str38 = str24;
                                                                                                        str37 = str91;
                                                                                                        str35 = str102;
                                                                                                        str39 = str105;
                                                                                                        arrayList21 = arrayList54;
                                                                                                        j18 = j45;
                                                                                                        arrayList19 = arrayList56;
                                                                                                        str19 = str66;
                                                                                                        arrayList22 = arrayList55;
                                                                                                        i8 = i25;
                                                                                                        z2 = z;
                                                                                                        j16 = j46;
                                                                                                        arrayList20 = arrayList52;
                                                                                                    } else {
                                                                                                        str28 = str107;
                                                                                                        i5 = parseInt8;
                                                                                                        i6 = parseInt7;
                                                                                                        str29 = str83;
                                                                                                        str3 = str50;
                                                                                                        j12 = j39;
                                                                                                        str2 = str68;
                                                                                                        long j47 = j35;
                                                                                                        long j48 = j36;
                                                                                                        str30 = str106;
                                                                                                        arrayList17 = arrayList45;
                                                                                                        str31 = str90;
                                                                                                        i7 = i24;
                                                                                                        str5 = str104;
                                                                                                        long j49 = j42;
                                                                                                        str32 = str95;
                                                                                                        j14 = i19;
                                                                                                        String str108 = str66;
                                                                                                        arrayList7 = arrayList36;
                                                                                                        str14 = str25;
                                                                                                        str33 = str87;
                                                                                                        arrayList48 = arrayList57;
                                                                                                        arrayList18 = arrayList16;
                                                                                                        str73 = str27;
                                                                                                        str34 = str85;
                                                                                                        f6 = f3;
                                                                                                        if (h3f.c(xmlPullParser, str108)) {
                                                                                                            long d4 = d(xmlPullParser, j43);
                                                                                                            ArrayList arrayList58 = arrayList56;
                                                                                                            str19 = str108;
                                                                                                            j15 = j49;
                                                                                                            arrayList19 = arrayList58;
                                                                                                            z2 = z;
                                                                                                            j16 = j48;
                                                                                                            nz9Var3 = q(xmlPullParser, (kz9) nz9Var3, arrayList13, j47, j14, j15, d4, j16);
                                                                                                            j17 = d4;
                                                                                                            str38 = str24;
                                                                                                            str37 = str91;
                                                                                                            str35 = str102;
                                                                                                            str39 = str105;
                                                                                                            arrayList20 = arrayList52;
                                                                                                        } else {
                                                                                                            ArrayList arrayList59 = arrayList56;
                                                                                                            str19 = str108;
                                                                                                            j15 = j49;
                                                                                                            arrayList19 = arrayList59;
                                                                                                            z2 = z;
                                                                                                            j16 = j48;
                                                                                                            if (h3f.c(xmlPullParser, str34)) {
                                                                                                                Pair f10 = f(xmlPullParser);
                                                                                                                Object obj3 = f10.first;
                                                                                                                if (obj3 != null) {
                                                                                                                    str105 = (String) obj3;
                                                                                                                }
                                                                                                                Object obj4 = f10.second;
                                                                                                                if (obj4 != null) {
                                                                                                                    arrayList20 = arrayList52;
                                                                                                                    arrayList20.add((gr3) obj4);
                                                                                                                } else {
                                                                                                                    arrayList20 = arrayList52;
                                                                                                                }
                                                                                                                j17 = j43;
                                                                                                                str38 = str24;
                                                                                                                str37 = str91;
                                                                                                                str35 = str102;
                                                                                                                str39 = str105;
                                                                                                            } else {
                                                                                                                str35 = str102;
                                                                                                                arrayList20 = arrayList52;
                                                                                                                j17 = j43;
                                                                                                                if (h3f.c(xmlPullParser, str35)) {
                                                                                                                    arrayList53.add(h(xmlPullParser, str35));
                                                                                                                    str36 = str91;
                                                                                                                    arrayList21 = arrayList54;
                                                                                                                } else {
                                                                                                                    ArrayList arrayList60 = arrayList53;
                                                                                                                    if (h3f.c(xmlPullParser, str33)) {
                                                                                                                        arrayList53 = arrayList60;
                                                                                                                        arrayList21 = arrayList54;
                                                                                                                        arrayList21.add(h(xmlPullParser, str33));
                                                                                                                        str36 = str91;
                                                                                                                    } else {
                                                                                                                        arrayList53 = arrayList60;
                                                                                                                        str36 = str91;
                                                                                                                        arrayList21 = arrayList54;
                                                                                                                        j18 = j47;
                                                                                                                        if (h3f.c(xmlPullParser, str36)) {
                                                                                                                            arrayList22 = arrayList55;
                                                                                                                            arrayList22.add(h(xmlPullParser, str36));
                                                                                                                        } else {
                                                                                                                            arrayList22 = arrayList55;
                                                                                                                            b(xmlPullParser);
                                                                                                                        }
                                                                                                                        str37 = str36;
                                                                                                                        str38 = str24;
                                                                                                                        str39 = str105;
                                                                                                                        i8 = i25;
                                                                                                                    }
                                                                                                                }
                                                                                                                j18 = j47;
                                                                                                                arrayList22 = arrayList55;
                                                                                                                str37 = str36;
                                                                                                                str38 = str24;
                                                                                                                str39 = str105;
                                                                                                                i8 = i25;
                                                                                                            }
                                                                                                        }
                                                                                                        arrayList21 = arrayList54;
                                                                                                        j18 = j47;
                                                                                                        arrayList22 = arrayList55;
                                                                                                        i8 = i25;
                                                                                                    }
                                                                                                    if (h3f.b(xmlPullParser, str38)) {
                                                                                                        arrayList54 = arrayList21;
                                                                                                        arrayList55 = arrayList22;
                                                                                                        arrayList52 = arrayList20;
                                                                                                        String str109 = str97;
                                                                                                        long j50 = j14;
                                                                                                        str24 = str38;
                                                                                                        i25 = i8;
                                                                                                        j42 = j15;
                                                                                                        str102 = str35;
                                                                                                        str85 = str34;
                                                                                                        arrayList16 = arrayList18;
                                                                                                        j43 = j17;
                                                                                                        str50 = str3;
                                                                                                        f2 = f6;
                                                                                                        str27 = str73;
                                                                                                        str105 = str39;
                                                                                                        str83 = str29;
                                                                                                        i24 = i7;
                                                                                                        arrayList45 = arrayList17;
                                                                                                        parseInt7 = i6;
                                                                                                        str69 = str28;
                                                                                                        str104 = str5;
                                                                                                        i2 = 1;
                                                                                                        j36 = j16;
                                                                                                        j39 = j12;
                                                                                                        z = z2;
                                                                                                        str25 = str14;
                                                                                                        arrayList57 = arrayList48;
                                                                                                        str87 = str33;
                                                                                                        str66 = str19;
                                                                                                        arrayList36 = arrayList7;
                                                                                                        str95 = str32;
                                                                                                        arrayList56 = arrayList19;
                                                                                                        i19 = j50;
                                                                                                        str68 = str2;
                                                                                                        str97 = str109;
                                                                                                        str99 = str99;
                                                                                                        parseInt8 = i5;
                                                                                                        str70 = str30;
                                                                                                        str91 = str37;
                                                                                                        j35 = j18;
                                                                                                        str90 = str31;
                                                                                                    } else if (eg7.i(str93)) {
                                                                                                        if (str32 != null) {
                                                                                                            for (String str110 : gcc.e0(str32)) {
                                                                                                                d2 = eg7.d(str110);
                                                                                                                if (d2 != null && eg7.i(d2)) {
                                                                                                                    str40 = d2;
                                                                                                                    str41 = str93;
                                                                                                                    if ("audio/eac3".equals(str40)) {
                                                                                                                        int i27 = 0;
                                                                                                                        while (true) {
                                                                                                                            str42 = "ec+3";
                                                                                                                            if (i27 < arrayList22.size()) {
                                                                                                                                te3 te3Var = (te3) arrayList22.get(i27);
                                                                                                                                int i28 = i27;
                                                                                                                                String str111 = te3Var.a;
                                                                                                                                String str112 = te3Var.b;
                                                                                                                                arrayList23 = arrayList22;
                                                                                                                                if ((!"tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str111) || !"JOC".equals(str112)) && (!"tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str111) || !"ec+3".equals(str112))) {
                                                                                                                                    i27 = i28 + 1;
                                                                                                                                    arrayList22 = arrayList23;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                arrayList23 = arrayList22;
                                                                                                                                str40 = "audio/eac3";
                                                                                                                            }
                                                                                                                        }
                                                                                                                        str40 = "audio/eac3-joc";
                                                                                                                    } else {
                                                                                                                        arrayList23 = arrayList22;
                                                                                                                    }
                                                                                                                    str42 = str32;
                                                                                                                    str43 = str97;
                                                                                                                    if (eg7.j(str42, str43)) {
                                                                                                                        bm2 x = gcc.x(str42, str43, str99);
                                                                                                                        String str113 = str43 != null ? str43 : str42;
                                                                                                                        bm2Var = x;
                                                                                                                        str40 = "video/dolby-vision";
                                                                                                                        str42 = str113;
                                                                                                                    } else {
                                                                                                                        bm2Var = null;
                                                                                                                    }
                                                                                                                    i9 = 0;
                                                                                                                    int i29 = 0;
                                                                                                                    while (true) {
                                                                                                                        j19 = j14;
                                                                                                                        if (i9 < arrayList11.size()) {
                                                                                                                            ArrayList arrayList61 = arrayList11;
                                                                                                                            te3 te3Var2 = (te3) arrayList61.get(i9);
                                                                                                                            String str114 = str41;
                                                                                                                            if (jrd.a("urn:mpeg:dash:role:2011", te3Var2.a)) {
                                                                                                                                String str115 = te3Var2.b;
                                                                                                                                i29 |= (str115 == null || !(str115.equals("forced_subtitle") || str115.equals("forced-subtitle"))) ? 0 : 2;
                                                                                                                            }
                                                                                                                            i9++;
                                                                                                                            arrayList11 = arrayList61;
                                                                                                                            str41 = str114;
                                                                                                                            j14 = j19;
                                                                                                                        } else {
                                                                                                                            String str116 = str41;
                                                                                                                            int i30 = 0;
                                                                                                                            int i31 = 0;
                                                                                                                            while (true) {
                                                                                                                                ArrayList arrayList62 = arrayList11;
                                                                                                                                if (i30 < arrayList62.size()) {
                                                                                                                                    te3 te3Var3 = (te3) arrayList62.get(i30);
                                                                                                                                    arrayList11 = arrayList62;
                                                                                                                                    if (jrd.a("urn:mpeg:dash:role:2011", te3Var3.a)) {
                                                                                                                                        i31 |= m(te3Var3.b);
                                                                                                                                    }
                                                                                                                                    i30++;
                                                                                                                                } else {
                                                                                                                                    arrayList11 = arrayList62;
                                                                                                                                    int i32 = 0;
                                                                                                                                    int i33 = 0;
                                                                                                                                    while (i32 < arrayList12.size()) {
                                                                                                                                        ArrayList arrayList63 = arrayList12;
                                                                                                                                        int i34 = i32;
                                                                                                                                        te3 te3Var4 = (te3) arrayList63.get(i32);
                                                                                                                                        int i35 = i33;
                                                                                                                                        String str117 = te3Var4.a;
                                                                                                                                        int i36 = i31;
                                                                                                                                        String str118 = te3Var4.b;
                                                                                                                                        if (jrd.a("urn:mpeg:dash:role:2011", str117)) {
                                                                                                                                            i10 = m(str118);
                                                                                                                                        } else if (jrd.a("urn:tva:metadata:cs:AudioPurposeCS:2007", te3Var4.a)) {
                                                                                                                                            if (str118 != null) {
                                                                                                                                                switch (str118.hashCode()) {
                                                                                                                                                    case 49:
                                                                                                                                                        if (str118.equals("1")) {
                                                                                                                                                            i11 = 0;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        i11 = -1;
                                                                                                                                                        break;
                                                                                                                                                    case 50:
                                                                                                                                                        if (str118.equals("2")) {
                                                                                                                                                            i11 = i2;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        i11 = -1;
                                                                                                                                                        break;
                                                                                                                                                    case jn7.n0 /* 51 */:
                                                                                                                                                        if (str118.equals("3")) {
                                                                                                                                                            i11 = 2;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        i11 = -1;
                                                                                                                                                        break;
                                                                                                                                                    case jn7.o0 /* 52 */:
                                                                                                                                                        if (str118.equals("4")) {
                                                                                                                                                            i11 = 3;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        i11 = -1;
                                                                                                                                                        break;
                                                                                                                                                    case jn7.p0 /* 53 */:
                                                                                                                                                    default:
                                                                                                                                                        i11 = -1;
                                                                                                                                                        break;
                                                                                                                                                    case jn7.q0 /* 54 */:
                                                                                                                                                        if (str118.equals("6")) {
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
                                                                                                                                                        i10 = i2;
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            i10 = 0;
                                                                                                                                        } else {
                                                                                                                                            i33 = i35;
                                                                                                                                            i32 = i34 + 1;
                                                                                                                                            arrayList12 = arrayList63;
                                                                                                                                            i31 = i36;
                                                                                                                                        }
                                                                                                                                        i33 = i35 | i10;
                                                                                                                                        i32 = i34 + 1;
                                                                                                                                        arrayList12 = arrayList63;
                                                                                                                                        i31 = i36;
                                                                                                                                    }
                                                                                                                                    ArrayList arrayList64 = arrayList12;
                                                                                                                                    int n = i31 | i33 | n(arrayList21) | n(arrayList23);
                                                                                                                                    int i37 = 0;
                                                                                                                                    while (true) {
                                                                                                                                        if (i37 < arrayList21.size()) {
                                                                                                                                            te3 te3Var5 = (te3) arrayList21.get(i37);
                                                                                                                                            arrayList24 = arrayList21;
                                                                                                                                            if ((jrd.a("http://dashif.org/thumbnail_tile", te3Var5.a) || jrd.a("http://dashif.org/guidelines/thumbnail_tile", te3Var5.a)) && (str44 = te3Var5.b) != null) {
                                                                                                                                                String str119 = gcc.a;
                                                                                                                                                String[] split = str44.split("x", -1);
                                                                                                                                                if (split.length == 2) {
                                                                                                                                                    i3 = 0;
                                                                                                                                                    try {
                                                                                                                                                        pair = Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[i2])));
                                                                                                                                                    } catch (NumberFormatException unused) {
                                                                                                                                                        continue;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    continue;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            i37++;
                                                                                                                                            arrayList21 = arrayList24;
                                                                                                                                        } else {
                                                                                                                                            arrayList24 = arrayList21;
                                                                                                                                            i3 = 0;
                                                                                                                                            pair = null;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    jo4 jo4Var = new jo4();
                                                                                                                                    jo4Var.a = attributeValue24;
                                                                                                                                    jo4Var.r = eg7.n(str116);
                                                                                                                                    jo4Var.s = eg7.n(str40);
                                                                                                                                    jo4Var.k = str42;
                                                                                                                                    jo4Var.j = i6;
                                                                                                                                    jo4Var.e = i29;
                                                                                                                                    jo4Var.f = n;
                                                                                                                                    jo4Var.K = bm2Var;
                                                                                                                                    String str120 = str31;
                                                                                                                                    jo4Var.d = str120;
                                                                                                                                    jo4Var.U = pair != null ? ((Integer) pair.first).intValue() : -1;
                                                                                                                                    jo4Var.V = pair != null ? ((Integer) pair.second).intValue() : -1;
                                                                                                                                    if (eg7.m(str40)) {
                                                                                                                                        jo4Var.z = parseInt;
                                                                                                                                        jo4Var.A = parseInt2;
                                                                                                                                        jo4Var.a(j41);
                                                                                                                                    } else {
                                                                                                                                        int i38 = parseInt;
                                                                                                                                        int i39 = parseInt2;
                                                                                                                                        if (eg7.i(str40)) {
                                                                                                                                            jo4Var.M = i8;
                                                                                                                                            jo4Var.O = i5;
                                                                                                                                        } else if (eg7.l(str40)) {
                                                                                                                                            if ("application/cea-608".equals(str40)) {
                                                                                                                                                int i40 = i3;
                                                                                                                                                while (i40 < arrayList64.size()) {
                                                                                                                                                    te3 te3Var6 = (te3) arrayList64.get(i40);
                                                                                                                                                    String str121 = te3Var6.a;
                                                                                                                                                    String str122 = te3Var6.b;
                                                                                                                                                    if ("urn:scte:dash:cc:cea-608:2015".equals(str121) && str122 != null) {
                                                                                                                                                        Matcher matcher = c.matcher(str122);
                                                                                                                                                        if (matcher.matches()) {
                                                                                                                                                            parseInt3 = Integer.parseInt(matcher.group(i2));
                                                                                                                                                            jo4Var.S = parseInt3;
                                                                                                                                                        } else {
                                                                                                                                                            efd.f("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str122));
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    i40++;
                                                                                                                                                    i2 = 1;
                                                                                                                                                }
                                                                                                                                                parseInt3 = -1;
                                                                                                                                                jo4Var.S = parseInt3;
                                                                                                                                            } else {
                                                                                                                                                if ("application/cea-708".equals(str40)) {
                                                                                                                                                    for (int i41 = i3; i41 < arrayList64.size(); i41++) {
                                                                                                                                                        te3 te3Var7 = (te3) arrayList64.get(i41);
                                                                                                                                                        String str123 = te3Var7.a;
                                                                                                                                                        String str124 = te3Var7.b;
                                                                                                                                                        if ("urn:scte:dash:cc:cea-708:2015".equals(str123) && str124 != null) {
                                                                                                                                                            Matcher matcher2 = d.matcher(str124);
                                                                                                                                                            if (matcher2.matches()) {
                                                                                                                                                                parseInt3 = Integer.parseInt(matcher2.group(1));
                                                                                                                                                                jo4Var.S = parseInt3;
                                                                                                                                                            } else {
                                                                                                                                                                efd.f("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str124));
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                parseInt3 = -1;
                                                                                                                                                jo4Var.S = parseInt3;
                                                                                                                                            }
                                                                                                                                            j33 = j7;
                                                                                                                                            str6 = str2;
                                                                                                                                        } else if (eg7.k(str40)) {
                                                                                                                                            jo4Var.z = i38;
                                                                                                                                            jo4Var.A = i39;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    ko4 ko4Var = new ko4(jo4Var);
                                                                                                                                    nz9 mz9Var = nz9Var3 != null ? nz9Var3 : new mz9(null, 1L, 0L, 0L, 0L);
                                                                                                                                    String str125 = ko4Var.s;
                                                                                                                                    if (str125 != null && eg7.l(str125) && mz9Var.c != 0) {
                                                                                                                                        mz9Var = mz9Var.a();
                                                                                                                                    }
                                                                                                                                    a63 a63Var = new a63(ko4Var, !arrayList19.isEmpty() ? arrayList19 : arrayList18, mz9Var, str39, arrayList20, arrayList53, arrayList24, arrayList23);
                                                                                                                                    i21 = eg7.h(ko4Var.t);
                                                                                                                                    int i42 = i7;
                                                                                                                                    if (i42 != -1) {
                                                                                                                                        if (i21 != -1) {
                                                                                                                                            yve.p(i42 == i21 ? 1 : i3);
                                                                                                                                        }
                                                                                                                                        i21 = i42;
                                                                                                                                    }
                                                                                                                                    ArrayList arrayList65 = arrayList17;
                                                                                                                                    arrayList65.add(a63Var);
                                                                                                                                    arrayList45 = arrayList65;
                                                                                                                                    str12 = str120;
                                                                                                                                    j36 = j16;
                                                                                                                                    arrayList12 = arrayList64;
                                                                                                                                    str23 = str65;
                                                                                                                                    arrayList15 = arrayList39;
                                                                                                                                    arrayList14 = arrayList40;
                                                                                                                                    str22 = str89;
                                                                                                                                    j8 = j18;
                                                                                                                                    j9 = j19;
                                                                                                                                    str20 = str28;
                                                                                                                                    str21 = str30;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        d2 = null;
                                                                                                        str40 = d2;
                                                                                                        str41 = str93;
                                                                                                        if ("audio/eac3".equals(str40)) {
                                                                                                        }
                                                                                                        str42 = str32;
                                                                                                        str43 = str97;
                                                                                                        if (eg7.j(str42, str43)) {
                                                                                                        }
                                                                                                        i9 = 0;
                                                                                                        int i292 = 0;
                                                                                                        while (true) {
                                                                                                            j19 = j14;
                                                                                                            if (i9 < arrayList11.size()) {
                                                                                                            }
                                                                                                            i9++;
                                                                                                            arrayList11 = arrayList61;
                                                                                                            str41 = str114;
                                                                                                            j14 = j19;
                                                                                                        }
                                                                                                    } else if (eg7.m(str93)) {
                                                                                                        if (str32 != null) {
                                                                                                            for (String str126 : gcc.e0(str32)) {
                                                                                                                d2 = eg7.d(str126);
                                                                                                                if (d2 != null && eg7.m(d2)) {
                                                                                                                    str40 = d2;
                                                                                                                    str41 = str93;
                                                                                                                    if ("audio/eac3".equals(str40)) {
                                                                                                                    }
                                                                                                                    str42 = str32;
                                                                                                                    str43 = str97;
                                                                                                                    if (eg7.j(str42, str43)) {
                                                                                                                    }
                                                                                                                    i9 = 0;
                                                                                                                    int i2922 = 0;
                                                                                                                    while (true) {
                                                                                                                        j19 = j14;
                                                                                                                        if (i9 < arrayList11.size()) {
                                                                                                                        }
                                                                                                                        i9++;
                                                                                                                        arrayList11 = arrayList61;
                                                                                                                        str41 = str114;
                                                                                                                        j14 = j19;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        d2 = null;
                                                                                                        str40 = d2;
                                                                                                        str41 = str93;
                                                                                                        if ("audio/eac3".equals(str40)) {
                                                                                                        }
                                                                                                        str42 = str32;
                                                                                                        str43 = str97;
                                                                                                        if (eg7.j(str42, str43)) {
                                                                                                        }
                                                                                                        i9 = 0;
                                                                                                        int i29222 = 0;
                                                                                                        while (true) {
                                                                                                            j19 = j14;
                                                                                                            if (i9 < arrayList11.size()) {
                                                                                                            }
                                                                                                            i9++;
                                                                                                            arrayList11 = arrayList61;
                                                                                                            str41 = str114;
                                                                                                            j14 = j19;
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (eg7.l(str93) || eg7.k(str93)) {
                                                                                                            str40 = str93;
                                                                                                            str41 = str40;
                                                                                                        } else {
                                                                                                            str41 = str93;
                                                                                                            if ("application/mp4".equals(str41)) {
                                                                                                                str40 = eg7.d(str32);
                                                                                                                if ("text/vtt".equals(str40)) {
                                                                                                                    str40 = "application/x-mp4-vtt";
                                                                                                                }
                                                                                                            } else {
                                                                                                                str40 = null;
                                                                                                            }
                                                                                                        }
                                                                                                        if ("audio/eac3".equals(str40)) {
                                                                                                        }
                                                                                                        str42 = str32;
                                                                                                        str43 = str97;
                                                                                                        if (eg7.j(str42, str43)) {
                                                                                                        }
                                                                                                        i9 = 0;
                                                                                                        int i292222 = 0;
                                                                                                        while (true) {
                                                                                                            j19 = j14;
                                                                                                            if (i9 < arrayList11.size()) {
                                                                                                            }
                                                                                                            i9++;
                                                                                                            arrayList11 = arrayList61;
                                                                                                            str41 = str114;
                                                                                                            j14 = j19;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        i5 = parseInt8;
                                                                                        i6 = parseInt7;
                                                                                        str29 = str83;
                                                                                        j12 = j39;
                                                                                        str2 = str68;
                                                                                        str28 = str69;
                                                                                        str30 = str70;
                                                                                        arrayList17 = arrayList45;
                                                                                        str31 = str90;
                                                                                        i7 = i24;
                                                                                        arrayList20 = arrayList52;
                                                                                        arrayList22 = arrayList55;
                                                                                        i8 = i25;
                                                                                        str5 = str104;
                                                                                        j15 = j42;
                                                                                        str3 = str50;
                                                                                        str32 = str95;
                                                                                        j14 = i19;
                                                                                        arrayList7 = arrayList36;
                                                                                        str14 = str25;
                                                                                        str33 = str87;
                                                                                        str35 = str102;
                                                                                        arrayList48 = arrayList57;
                                                                                        arrayList18 = arrayList16;
                                                                                        str73 = str27;
                                                                                        str34 = str85;
                                                                                        str39 = str105;
                                                                                        f6 = f3;
                                                                                        String str127 = str66;
                                                                                        z2 = z;
                                                                                        j16 = j36;
                                                                                        j17 = j43;
                                                                                        str38 = str24;
                                                                                        arrayList21 = arrayList54;
                                                                                        long j51 = j35;
                                                                                        arrayList19 = arrayList56;
                                                                                        str19 = str127;
                                                                                        str37 = str91;
                                                                                        j18 = j51;
                                                                                        if (h3f.b(xmlPullParser, str38)) {
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    arrayList48 = arrayList49;
                                                                                    arrayList13 = arrayList51;
                                                                                    str12 = str78;
                                                                                    str13 = attributeValue15;
                                                                                    str5 = str61;
                                                                                    int i43 = i21;
                                                                                    j12 = j39;
                                                                                    long j52 = i19;
                                                                                    str2 = str68;
                                                                                    arrayList7 = arrayList36;
                                                                                    long j53 = j35;
                                                                                    String str128 = str69;
                                                                                    str14 = str74;
                                                                                    str15 = str75;
                                                                                    str16 = str77;
                                                                                    str17 = str76;
                                                                                    i3 = 0;
                                                                                    str18 = str67;
                                                                                    str3 = str50;
                                                                                    str19 = str66;
                                                                                    String str129 = str70;
                                                                                    z2 = z;
                                                                                    long j54 = j36;
                                                                                    if (h3f.c(xmlPullParser, str129)) {
                                                                                        nz9Var2 = o(xmlPullParser, (mz9) nz9Var2);
                                                                                        str21 = str129;
                                                                                        i21 = i43;
                                                                                        j36 = j54;
                                                                                        str23 = str65;
                                                                                        arrayList15 = arrayList39;
                                                                                        arrayList14 = arrayList40;
                                                                                        str22 = str89;
                                                                                        j8 = j53;
                                                                                        j9 = j52;
                                                                                        str20 = str128;
                                                                                    } else {
                                                                                        str20 = str128;
                                                                                        if (h3f.c(xmlPullParser, str20)) {
                                                                                            long d5 = d(xmlPullParser, j38);
                                                                                            str21 = str129;
                                                                                            i4 = i43;
                                                                                            nz9Var2 = p(xmlPullParser, (jz9) nz9Var2, j53, j52, j12, d5, j54);
                                                                                            j9 = j52;
                                                                                            j8 = j53;
                                                                                            j38 = d5;
                                                                                            j36 = j54;
                                                                                        } else {
                                                                                            str21 = str129;
                                                                                            i4 = i43;
                                                                                            long j55 = j38;
                                                                                            j8 = j53;
                                                                                            j9 = j52;
                                                                                            long j56 = j54;
                                                                                            if (h3f.c(xmlPullParser, str19)) {
                                                                                                long d6 = d(xmlPullParser, j55);
                                                                                                nz9Var2 = q(xmlPullParser, (kz9) nz9Var2, arrayList13, j8, j9, j12, d6, j56);
                                                                                                j38 = d6;
                                                                                                j36 = j56;
                                                                                            } else {
                                                                                                if (h3f.c(xmlPullParser, "InbandEventStream")) {
                                                                                                    arrayList14 = arrayList40;
                                                                                                    arrayList14.add(h(xmlPullParser, "InbandEventStream"));
                                                                                                    j13 = j55;
                                                                                                    j36 = j56;
                                                                                                    arrayList15 = arrayList39;
                                                                                                    str22 = str89;
                                                                                                } else {
                                                                                                    arrayList14 = arrayList40;
                                                                                                    j13 = j55;
                                                                                                    if (h3f.c(xmlPullParser, "Label")) {
                                                                                                        str22 = str89;
                                                                                                        String attributeValue33 = xmlPullParser.getAttributeValue(null, str22);
                                                                                                        String str130 = "";
                                                                                                        while (true) {
                                                                                                            xmlPullParser.next();
                                                                                                            j36 = j56;
                                                                                                            if (xmlPullParser.getEventType() == 4) {
                                                                                                                str130 = xmlPullParser.getText();
                                                                                                            } else {
                                                                                                                b(xmlPullParser);
                                                                                                            }
                                                                                                            if (h3f.b(xmlPullParser, "Label")) {
                                                                                                                arrayList15 = arrayList39;
                                                                                                                arrayList15.add(new xy5(attributeValue33, str130));
                                                                                                            } else {
                                                                                                                j56 = j36;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        j36 = j56;
                                                                                                        arrayList15 = arrayList39;
                                                                                                        str22 = str89;
                                                                                                        if (xmlPullParser.getEventType() == 2) {
                                                                                                            b(xmlPullParser);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                str23 = str65;
                                                                                                j38 = j13;
                                                                                                i21 = i4;
                                                                                            }
                                                                                        }
                                                                                        str23 = str65;
                                                                                        arrayList15 = arrayList39;
                                                                                        arrayList14 = arrayList40;
                                                                                        str22 = str89;
                                                                                        i21 = i4;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                String str131 = str69;
                                                                str3 = str50;
                                                                str22 = str51;
                                                                str20 = str131;
                                                                str12 = str78;
                                                                str13 = attributeValue15;
                                                                str5 = str61;
                                                                i4 = i21;
                                                                j12 = j39;
                                                                arrayList10 = arrayList38;
                                                                arrayList12 = arrayList41;
                                                                j9 = i19;
                                                                str19 = str66;
                                                                str2 = str68;
                                                                arrayList7 = arrayList36;
                                                                str21 = str70;
                                                                arrayList15 = arrayList39;
                                                                arrayList14 = arrayList40;
                                                                str14 = str74;
                                                                str15 = str75;
                                                                str16 = str77;
                                                                str17 = str76;
                                                                arrayList13 = arrayList47;
                                                                i3 = 0;
                                                                arrayList11 = arrayList42;
                                                                str18 = str67;
                                                                z2 = z;
                                                                j8 = j35;
                                                                j13 = j38;
                                                                str23 = str65;
                                                                j38 = j13;
                                                                i21 = i4;
                                                            }
                                                        }
                                                        str12 = str78;
                                                        str13 = attributeValue15;
                                                        str5 = str61;
                                                        j12 = j39;
                                                        arrayList10 = arrayList38;
                                                        arrayList12 = arrayList41;
                                                        j9 = i19;
                                                        str23 = str65;
                                                        str19 = str66;
                                                        str2 = str68;
                                                        arrayList7 = arrayList36;
                                                        str21 = str70;
                                                        arrayList15 = arrayList39;
                                                        arrayList14 = arrayList40;
                                                        str14 = str74;
                                                        str15 = str75;
                                                        str16 = str77;
                                                        str17 = str76;
                                                        arrayList13 = arrayList47;
                                                        i3 = 0;
                                                        arrayList11 = arrayList42;
                                                        str18 = str67;
                                                        z2 = z;
                                                        j8 = j35;
                                                    }
                                                    if (h3f.b(xmlPullParser, str23)) {
                                                        ArrayList arrayList66 = new ArrayList(arrayList45.size());
                                                        int i44 = i3;
                                                        while (i44 < arrayList45.size()) {
                                                            ArrayList arrayList67 = arrayList45;
                                                            a63 a63Var2 = (a63) arrayList67.get(i44);
                                                            jo4 a2 = a63Var2.a.a();
                                                            if (str72 == null || !arrayList15.isEmpty()) {
                                                                str45 = str72;
                                                                a2.c = po5.q(arrayList15);
                                                            } else {
                                                                str45 = str72;
                                                                a2.b = str45;
                                                            }
                                                            String str132 = a63Var2.d;
                                                            if (str132 == null) {
                                                                str132 = str79;
                                                            }
                                                            arrayList45 = arrayList67;
                                                            ArrayList arrayList68 = a63Var2.e;
                                                            long j57 = j8;
                                                            ArrayList arrayList69 = arrayList10;
                                                            arrayList68.addAll(arrayList69);
                                                            arrayList10 = arrayList69;
                                                            if (arrayList68.isEmpty()) {
                                                                j20 = j9;
                                                                i12 = i21;
                                                                str46 = str22;
                                                            } else {
                                                                int i45 = i3;
                                                                while (true) {
                                                                    if (i45 < arrayList68.size()) {
                                                                        gr3 gr3Var = (gr3) arrayList68.get(i45);
                                                                        j20 = j9;
                                                                        if (!o51.d.equals(gr3Var.b) || (str47 = gr3Var.c) == null) {
                                                                            i45++;
                                                                            j9 = j20;
                                                                        } else {
                                                                            arrayList68.remove(i45);
                                                                        }
                                                                    } else {
                                                                        j20 = j9;
                                                                        str47 = null;
                                                                    }
                                                                }
                                                                if (str47 != null) {
                                                                    int i46 = i3;
                                                                    while (i46 < arrayList68.size()) {
                                                                        gr3 gr3Var2 = (gr3) arrayList68.get(i46);
                                                                        int i47 = i21;
                                                                        if (o51.c.equals(gr3Var2.b) && gr3Var2.c == null) {
                                                                            str48 = str22;
                                                                            arrayList68.set(i46, new gr3(o51.d, str47, gr3Var2.d, gr3Var2.e));
                                                                        } else {
                                                                            str48 = str22;
                                                                        }
                                                                        i46++;
                                                                        i21 = i47;
                                                                        str22 = str48;
                                                                    }
                                                                }
                                                                i12 = i21;
                                                                str46 = str22;
                                                                for (int size = arrayList68.size() - 1; size >= 0; size--) {
                                                                    gr3 gr3Var3 = (gr3) arrayList68.get(size);
                                                                    if (gr3Var3.e == null) {
                                                                        int i48 = i3;
                                                                        while (true) {
                                                                            if (i48 < arrayList68.size()) {
                                                                                gr3 gr3Var4 = (gr3) arrayList68.get(i48);
                                                                                if (gr3Var4.e != null && gr3Var3.e == null && gr3Var4.a(gr3Var3.b)) {
                                                                                    arrayList68.remove(size);
                                                                                } else {
                                                                                    i48++;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                a2.w = new hr3(str132, arrayList68);
                                                            }
                                                            ArrayList arrayList70 = a63Var2.f;
                                                            arrayList70.addAll(arrayList14);
                                                            ko4 ko4Var2 = new ko4(a2);
                                                            po5 po5Var = a63Var2.b;
                                                            nz9 nz9Var4 = a63Var2.c;
                                                            ArrayList arrayList71 = a63Var2.g;
                                                            ArrayList arrayList72 = a63Var2.h;
                                                            if (nz9Var4 instanceof mz9) {
                                                                sb9Var = new tb9(ko4Var2, po5Var, (mz9) nz9Var4, arrayList70, arrayList71, arrayList72);
                                                            } else {
                                                                if (!(nz9Var4 instanceof iz9)) {
                                                                    lq5.j("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                    return null;
                                                                }
                                                                sb9Var = new sb9(ko4Var2, po5Var, (iz9) nz9Var4, arrayList70, arrayList71, arrayList72);
                                                            }
                                                            arrayList66.add(sb9Var);
                                                            i44++;
                                                            str72 = str45;
                                                            i21 = i12;
                                                            str22 = str46;
                                                            j8 = j57;
                                                            j9 = j20;
                                                        }
                                                        str4 = str22;
                                                        i2 = 1;
                                                        arrayList6.add(new fa(parseLong4, i21, arrayList66, arrayList12, arrayList48, arrayList13));
                                                        j = j36;
                                                    } else {
                                                        i2 = 1;
                                                        String str133 = str20;
                                                        str51 = str22;
                                                        str50 = str3;
                                                        str69 = str133;
                                                        str65 = str23;
                                                        j35 = j8;
                                                        arrayList40 = arrayList14;
                                                        arrayList39 = arrayList15;
                                                        str70 = str21;
                                                        j39 = j12;
                                                        z = z2;
                                                        str67 = str18;
                                                        arrayList42 = arrayList11;
                                                        arrayList35 = arrayList8;
                                                        arrayList46 = arrayList9;
                                                        arrayList38 = arrayList10;
                                                        arrayList47 = arrayList13;
                                                        str78 = str12;
                                                        str68 = str2;
                                                        str66 = str19;
                                                        str76 = str17;
                                                        arrayList41 = arrayList12;
                                                        str77 = str16;
                                                        str75 = str15;
                                                        str74 = str14;
                                                        arrayList36 = arrayList7;
                                                        i19 = j9;
                                                        attributeValue15 = str13;
                                                        str61 = str5;
                                                    }
                                                }
                                            } else {
                                                j7 = j33;
                                                arrayList3 = arrayList31;
                                                str2 = str60;
                                                String str134 = str61;
                                                long j58 = j29;
                                                str3 = str50;
                                                long j59 = j;
                                                str4 = str51;
                                                long j60 = i19;
                                                arrayList7 = arrayList30;
                                                z2 = z;
                                                if (h3f.c(xmlPullParser, "EventStream")) {
                                                    String str135 = str64;
                                                    String attributeValue34 = xmlPullParser.getAttributeValue(null, str135);
                                                    String str136 = attributeValue34 == null ? "" : attributeValue34;
                                                    String str137 = str62;
                                                    String attributeValue35 = xmlPullParser.getAttributeValue(null, str137);
                                                    String str138 = attributeValue35 == null ? "" : attributeValue35;
                                                    String attributeValue36 = xmlPullParser.getAttributeValue(null, "timescale");
                                                    long parseLong5 = attributeValue36 == null ? 1L : Long.parseLong(attributeValue36);
                                                    String attributeValue37 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
                                                    long parseLong6 = attributeValue37 == null ? 0L : Long.parseLong(attributeValue37);
                                                    ArrayList arrayList73 = new ArrayList();
                                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                                                    while (true) {
                                                        xmlPullParser.next();
                                                        if (h3f.c(xmlPullParser, "Event")) {
                                                            str10 = str134;
                                                            String attributeValue38 = xmlPullParser.getAttributeValue(null, str10);
                                                            long parseLong7 = attributeValue38 == null ? 0L : Long.parseLong(attributeValue38);
                                                            str7 = str63;
                                                            String attributeValue39 = xmlPullParser.getAttributeValue(null, str7);
                                                            long parseLong8 = attributeValue39 == null ? -9223372036854775807L : Long.parseLong(attributeValue39);
                                                            String attributeValue40 = xmlPullParser.getAttributeValue(null, "presentationTime");
                                                            long parseLong9 = attributeValue40 == null ? 0L : Long.parseLong(attributeValue40);
                                                            String str139 = gcc.a;
                                                            RoundingMode roundingMode = RoundingMode.DOWN;
                                                            long b0 = gcc.b0(parseLong8, 1000L, parseLong5, roundingMode);
                                                            long b02 = gcc.b0(parseLong9 - parseLong6, 1000000L, parseLong5, roundingMode);
                                                            String attributeValue41 = xmlPullParser.getAttributeValue(null, "messageData");
                                                            if (attributeValue41 == null) {
                                                                attributeValue41 = null;
                                                            }
                                                            byteArrayOutputStream.reset();
                                                            XmlSerializer newSerializer = Xml.newSerializer();
                                                            str64 = str135;
                                                            newSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
                                                            xmlPullParser.nextToken();
                                                            while (!h3f.b(xmlPullParser, "Event")) {
                                                                switch (xmlPullParser.getEventType()) {
                                                                    case 0:
                                                                        str11 = str137;
                                                                        j11 = parseLong6;
                                                                        newSerializer.startDocument(null, Boolean.FALSE);
                                                                        break;
                                                                    case 1:
                                                                        str11 = str137;
                                                                        j11 = parseLong6;
                                                                        newSerializer.endDocument();
                                                                        break;
                                                                    case 2:
                                                                        str11 = str137;
                                                                        newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                        int i49 = 0;
                                                                        while (i49 < xmlPullParser.getAttributeCount()) {
                                                                            newSerializer.attribute(xmlPullParser.getAttributeNamespace(i49), xmlPullParser.getAttributeName(i49), xmlPullParser.getAttributeValue(i49));
                                                                            i49++;
                                                                            parseLong6 = parseLong6;
                                                                        }
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 3:
                                                                        str11 = str137;
                                                                        newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 4:
                                                                        newSerializer.text(xmlPullParser.getText());
                                                                        str11 = str137;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 5:
                                                                        newSerializer.cdsect(xmlPullParser.getText());
                                                                        str11 = str137;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 6:
                                                                        newSerializer.entityRef(xmlPullParser.getText());
                                                                        str11 = str137;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 7:
                                                                        newSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                        str11 = str137;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 8:
                                                                        newSerializer.processingInstruction(xmlPullParser.getText());
                                                                        str11 = str137;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 9:
                                                                        newSerializer.comment(xmlPullParser.getText());
                                                                        str11 = str137;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 10:
                                                                        newSerializer.docdecl(xmlPullParser.getText());
                                                                        str11 = str137;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    default:
                                                                        str11 = str137;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                }
                                                                xmlPullParser.nextToken();
                                                                str137 = str11;
                                                                parseLong6 = j11;
                                                            }
                                                            str62 = str137;
                                                            j10 = parseLong6;
                                                            newSerializer.flush();
                                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                            Long valueOf = Long.valueOf(b02);
                                                            if (attributeValue41 != null) {
                                                                byteArray = attributeValue41.getBytes(StandardCharsets.UTF_8);
                                                            }
                                                            str8 = str136;
                                                            str9 = str138;
                                                            arrayList73.add(Pair.create(valueOf, new f54(str136, str138, b0, parseLong7, byteArray)));
                                                        } else {
                                                            str64 = str135;
                                                            str62 = str137;
                                                            j10 = parseLong6;
                                                            str7 = str63;
                                                            str8 = str136;
                                                            str9 = str138;
                                                            str10 = str134;
                                                            b(xmlPullParser);
                                                        }
                                                        if (h3f.b(xmlPullParser, "EventStream")) {
                                                            long[] jArr = new long[arrayList73.size()];
                                                            f54[] f54VarArr = new f54[arrayList73.size()];
                                                            for (int i50 = 0; i50 < arrayList73.size(); i50++) {
                                                                Pair pair2 = (Pair) arrayList73.get(i50);
                                                                jArr[i50] = ((Long) pair2.first).longValue();
                                                                f54VarArr[i50] = (f54) pair2.second;
                                                            }
                                                            arrayList33.add(new i54(str8, str9, jArr, f54VarArr));
                                                            str5 = str10;
                                                            str63 = str7;
                                                            arrayList6 = arrayList6;
                                                            j = j59;
                                                            j8 = j58;
                                                            j9 = j60;
                                                        } else {
                                                            str136 = str8;
                                                            str138 = str9;
                                                            str134 = str10;
                                                            str63 = str7;
                                                            str137 = str62;
                                                            str135 = str64;
                                                            parseLong6 = j10;
                                                        }
                                                    }
                                                } else {
                                                    String str140 = str63;
                                                    ArrayList arrayList74 = arrayList33;
                                                    if (h3f.c(xmlPullParser, "SegmentBase")) {
                                                        nz9Var = o(xmlPullParser, null);
                                                        arrayList33 = arrayList74;
                                                        str5 = str134;
                                                        str63 = str140;
                                                        arrayList6 = arrayList6;
                                                        j33 = j7;
                                                        j = j59;
                                                        j8 = j58;
                                                        j9 = j60;
                                                        str6 = str2;
                                                        j6 = -9223372036854775807L;
                                                    } else {
                                                        if (h3f.c(xmlPullParser, "SegmentList")) {
                                                            str5 = str134;
                                                            j6 = -9223372036854775807L;
                                                            long d7 = d(xmlPullParser, -9223372036854775807L);
                                                            arrayList33 = arrayList74;
                                                            str63 = str140;
                                                            j = j59;
                                                            nz9Var = p(xmlPullParser, null, j58, j60, j7, d7, j);
                                                            j9 = j60;
                                                            j8 = j58;
                                                            j32 = d7;
                                                            arrayList6 = arrayList6;
                                                        } else {
                                                            arrayList33 = arrayList74;
                                                            str5 = str134;
                                                            str63 = str140;
                                                            j = j59;
                                                            j8 = j58;
                                                            j9 = j60;
                                                            j6 = -9223372036854775807L;
                                                            if (h3f.c(xmlPullParser, str66)) {
                                                                long d8 = d(xmlPullParser, -9223372036854775807L);
                                                                no5 no5Var = po5.b;
                                                                arrayList6 = arrayList6;
                                                                nz9Var = q(xmlPullParser, null, j99.e, j8, j9, j7, d8, j);
                                                                j = j;
                                                                j32 = d8;
                                                            } else {
                                                                arrayList6 = arrayList6;
                                                                if (h3f.c(xmlPullParser, "AssetIdentifier")) {
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
                                        if (h3f.b(xmlPullParser, str6)) {
                                            Pair create = Pair.create(new v68(attributeValue12, i18, arrayList6, arrayList33), Long.valueOf(j9));
                                            v68 v68Var = (v68) create.first;
                                            if (v68Var.b != j6) {
                                                long longValue = ((Long) create.second).longValue();
                                                long j61 = longValue == j6 ? j6 : longValue + v68Var.b;
                                                arrayList4 = arrayList27;
                                                arrayList4.add(v68Var);
                                                j25 = j61;
                                            } else {
                                                if (!equals) {
                                                    throw hy7.b("Unable to determine start of period " + arrayList27.size(), null);
                                                }
                                                arrayList4 = arrayList27;
                                                i17 = i2;
                                                j25 = j30;
                                            }
                                        } else {
                                            str60 = str6;
                                            j29 = j8;
                                            long j62 = j9;
                                            arrayList30 = arrayList7;
                                            i19 = j62;
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
                            tv8Var = tv8Var2;
                            j5Var = j5Var2;
                        }
                        tv8Var = tv8Var2;
                        j5Var = j5Var2;
                        j23 = j4;
                        j25 = j5;
                    }
                    j23 = j4;
                }
            }
            if (h3f.b(xmlPullParser, "MPD")) {
                if (i14 == j6) {
                    if (j25 != j6) {
                        i14 = j25;
                    } else if (!equals) {
                        throw hy7.b("Unable to determine duration of static manifest.", null);
                    }
                }
                if (arrayList4.isEmpty()) {
                    throw hy7.b("No periods found.", null);
                }
                return new z53(W, i14, i15, equals, j2, j, j3, W2, tv8Var, j5Var, zs6Var, arrayList4, arrayList);
            }
            arrayList27 = arrayList4;
            tv8Var2 = tv8Var;
            j5Var2 = j5Var;
            i = i2;
            arrayList28 = arrayList2;
            arrayList26 = arrayList;
            uri2 = str;
            z = z2;
            a = arrayList3;
            j24 = j6;
            str49 = null;
        }
    }

    public static n29 l(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
                return new n29(j, j2, attributeValue);
            }
        } else {
            j = 0;
        }
        j2 = -1;
        return new n29(j, j2, attributeValue);
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
            if (jrd.a("http://dashif.org/guidelines/trickmode", ((te3) arrayList.get(i2)).a)) {
                i = TLObject.FLAG_14;
            }
        }
        return i;
    }

    public static mz9 o(XmlPullParser xmlPullParser, mz9 mz9Var) {
        long j;
        long j2 = mz9Var != null ? mz9Var.b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j2 = Long.parseLong(attributeValue);
        }
        long j3 = j2;
        long j4 = 0;
        long j5 = mz9Var != null ? mz9Var.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j5 = Long.parseLong(attributeValue2);
        }
        long j6 = j5;
        if (mz9Var != null) {
            j = mz9Var.d;
            j4 = mz9Var.e;
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
        n29 n29Var = mz9Var != null ? mz9Var.a : null;
        while (true) {
            xmlPullParser.next();
            if (h3f.c(xmlPullParser, "Initialization")) {
                n29Var = l(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            n29 n29Var2 = n29Var;
            if (h3f.b(xmlPullParser, "SegmentBase")) {
                return new mz9(n29Var2, j3, j6, j8, j7);
            }
            n29Var = n29Var2;
        }
    }

    public static jz9 p(XmlPullParser xmlPullParser, jz9 jz9Var, long j, long j2, long j3, long j4, long j5) {
        long j6 = jz9Var != null ? jz9Var.b : 1L;
        ArrayList arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j6 = Long.parseLong(attributeValue);
        }
        long j7 = j6;
        long j8 = jz9Var != null ? jz9Var.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j8 = Long.parseLong(attributeValue2);
        }
        long j9 = j8;
        long j10 = jz9Var != null ? jz9Var.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j10 = Long.parseLong(attributeValue3);
        }
        long j11 = j10;
        long j12 = jz9Var != null ? jz9Var.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j12 = Long.parseLong(attributeValue4);
        }
        long j13 = j12;
        long j14 = j4 == -9223372036854775807L ? j3 : j4;
        long j15 = j14 == Long.MAX_VALUE ? -9223372036854775807L : j14;
        n29 n29Var = null;
        ArrayList arrayList2 = null;
        do {
            xmlPullParser.next();
            if (h3f.c(xmlPullParser, "Initialization")) {
                n29Var = l(xmlPullParser, "sourceURL", "range");
            } else if (h3f.c(xmlPullParser, "SegmentTimeline")) {
                arrayList2 = r(xmlPullParser, j7, j2);
            } else if (h3f.c(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(l(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!h3f.b(xmlPullParser, "SegmentList"));
        if (jz9Var != null) {
            if (n29Var == null) {
                n29Var = jz9Var.a;
            }
            if (arrayList2 == null) {
                arrayList2 = jz9Var.f;
            }
            if (arrayList == null) {
                arrayList = jz9Var.j;
            }
        }
        return new jz9(n29Var, j7, j9, j13, j11, arrayList2, j15, arrayList, gcc.T(j5), gcc.T(j));
    }

    public static kz9 q(XmlPullParser xmlPullParser, kz9 kz9Var, List list, long j, long j2, long j3, long j4, long j5) {
        long j6;
        long j7 = kz9Var != null ? kz9Var.b : 1L;
        n29 n29Var = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j7 = Long.parseLong(attributeValue);
        }
        long j8 = j7;
        long j9 = kz9Var != null ? kz9Var.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j9 = Long.parseLong(attributeValue2);
        }
        long j10 = j9;
        long j11 = kz9Var != null ? kz9Var.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j11 = Long.parseLong(attributeValue3);
        }
        long j12 = j11;
        long j13 = kz9Var != null ? kz9Var.d : 1L;
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
            te3 te3Var = (te3) list.get(i);
            if (jrd.a("http://dashif.org/guidelines/last-segment-number", te3Var.a)) {
                j6 = Long.parseLong(te3Var.b);
                break;
            }
            i++;
        }
        long j15 = j6;
        long j16 = j4 == -9223372036854775807L ? j3 : j4;
        long j17 = j16 == Long.MAX_VALUE ? -9223372036854775807L : j16;
        ko9 s = s(xmlPullParser, "media", kz9Var != null ? kz9Var.k : null);
        ko9 s2 = s(xmlPullParser, "initialization", kz9Var != null ? kz9Var.j : null);
        ArrayList arrayList = null;
        do {
            xmlPullParser.next();
            if (h3f.c(xmlPullParser, "Initialization")) {
                n29Var = l(xmlPullParser, "sourceURL", "range");
            } else if (h3f.c(xmlPullParser, "SegmentTimeline")) {
                arrayList = r(xmlPullParser, j8, j2);
            } else {
                b(xmlPullParser);
            }
        } while (!h3f.b(xmlPullParser, "SegmentTemplate"));
        if (kz9Var != null) {
            if (n29Var == null) {
                n29Var = kz9Var.a;
            }
            if (arrayList == null) {
                arrayList = kz9Var.f;
            }
        }
        return new kz9(n29Var, j8, j10, j14, j15, j12, arrayList, j17, s2, s, gcc.T(j5), gcc.T(j));
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
            if (h3f.c(xmlPullParser, "S")) {
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
        } while (!h3f.b(xmlPullParser, "SegmentTimeline"));
        if (z) {
            String str = gcc.a;
            a(arrayList, j4, j5, i, gcc.b0(j2, j, 1000L, RoundingMode.DOWN));
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
    
        lq5.j("Invalid template: ".concat(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0129, code lost:
    
        return null;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ko9 s(XmlPullParser xmlPullParser, String str, ko9 ko9Var) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return ko9Var;
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
        return new ko9(arrayList, arrayList2, arrayList3, (byte) 11);
    }

    @Override // iy7
    public final Object I(Uri uri, l73 l73Var) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(l73Var, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return k(newPullParser, uri);
            }
            throw hy7.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            if (e2.getDetail() instanceof IOException) {
                throw ((IOException) e2.getDetail());
            }
            throw hy7.b(null, e2);
        }
    }
}
