package m2;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import b2.b0;
import b2.i0;
import b2.v0;
import b2.w;
import b2.w0;
import b2.x;
import e2.l0;
import e9.n0;
import e9.x1;
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
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import v7.r6;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends DefaultHandler implements y2.n {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    public static final int[] f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public e() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    public static long a(ArrayList arrayList, long j10, long j11, int i10, long j12) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            String str = l0.a;
            i11 = (int) ((((j12 - j10) + j11) - 1) / j11);
        }
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(new q(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i10++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i10--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008f, code lost:
    
        if (r13 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0093, code lost:
    
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
    
        if (r13.equals("fa01") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019d, code lost:
    
        if (r13 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b0, code lost:
    
        if (r13 < 33) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(XmlPullParser xmlPullParser, String str) {
        char c10;
        int parseInt;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i10 = 5;
        char c11 = 4;
        int i11 = 0;
        int i12 = -1;
        switch (attributeValue.hashCode()) {
            case -2128649360:
                if (attributeValue.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -2060825028:
                if (attributeValue.equals("tag:dolby.com,2015:dash:audio_channel_configuration:2015")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1352850286:
                if (attributeValue.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1138141449:
                if (attributeValue.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -986633423:
                if (attributeValue.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -79006963:
                if (attributeValue.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 312179081:
                if (attributeValue.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 2036691300:
                if (attributeValue.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c10 = 7;
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
                            if (i11 >= iArr.length) {
                                break;
                            } else {
                                parseInt += ((parseInt2 >> i11) & 1) * iArr[i11];
                                i11++;
                            }
                        }
                    } else {
                        String[] d02 = l0.d0(str);
                        if (d02.length != 0) {
                            List A = new a5.a(new k6.h(new d9.e('.', 0), 19)).A(r6.c(d02[0].trim()));
                            if (A.size() == 4 && ((String) A.get(0)).equals("ac-4")) {
                                String str2 = (String) A.get(3);
                                str2.getClass();
                                if (!str2.equals("03")) {
                                    if (str2.equals("04")) {
                                        i12 = 21;
                                        break;
                                    }
                                } else {
                                    i12 = 18;
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
                    i12 = Integer.parseInt(attributeValue4);
                    break;
                }
                break;
            case 3:
            case 7:
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue5 != null) {
                    String c12 = r6.c(attributeValue5);
                    c12.getClass();
                    switch (c12.hashCode()) {
                        case 1596796:
                            if (c12.equals("4000")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2937391:
                            if (c12.equals("a000")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3094034:
                            if (c12.equals("f800")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3094035:
                            if (c12.equals("f801")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3133436:
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            i10 = 1;
                            break;
                        case 1:
                            i10 = 2;
                            break;
                        case 3:
                            i10 = 6;
                            break;
                        case 4:
                            i10 = 8;
                            break;
                    }
                    i12 = i10;
                    break;
                }
                i10 = -1;
                i12 = i10;
            case 4:
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                int parseInt3 = attributeValue6 == null ? -1 : Integer.parseInt(attributeValue6);
                if (parseInt3 >= 0) {
                    int[] iArr2 = f;
                    if (parseInt3 < iArr2.length) {
                        i12 = iArr2[parseInt3];
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
        } while (!e2.a.h(xmlPullParser, "AudioChannelConfiguration"));
        return i12;
    }

    public static long d(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : TLObject.FLAG_31;
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
        } while (!e2.a.h(xmlPullParser, "BaseURL"));
        if (str != null && e2.e.c(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return e9.s.q(new b(parseInt, parseInt2, str, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            b bVar = (b) arrayList.get(i10);
            String f7 = e2.e.f(bVar.a, str);
            String str2 = attributeValue3 == null ? f7 : attributeValue3;
            if (z10) {
                parseInt = bVar.c;
                parseInt2 = bVar.d;
                str2 = bVar.b;
            }
            arrayList2.add(new b(parseInt, parseInt2, f7, str2));
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016f  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.util.UUID] */
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
        ?? r72;
        String str2;
        String str3;
        ?? r82;
        char c10;
        String str4;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String c11 = r6.c(attributeValue);
            c11.getClass();
            switch (c11.hashCode()) {
                case -1980789791:
                    if (c11.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 489446379:
                    if (c11.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 755418770:
                    if (c11.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1812765994:
                    if (c11.equals("urn:mpeg:dash:mp4protection:2011")) {
                        c10 = 3;
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
                    r72 = b2.n.d;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r82 = str2;
                    break;
                case 1:
                    r72 = b2.n.f;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r82 = str2;
                    break;
                case 2:
                    r72 = b2.n.e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r82 = str2;
                    break;
                case 3:
                    str = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= attributeCount) {
                            str4 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i10);
                            int indexOf = attributeName.indexOf(58);
                            if (indexOf != -1) {
                                attributeName = attributeName.substring(indexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                str4 = xmlPullParser.getAttributeValue(i10);
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str4) && !"00000000-0000-0000-0000-000000000000".equals(str4)) {
                        String[] split = str4.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i11 = 0; i11 < split.length; i11++) {
                            uuidArr[i11] = UUID.fromString(split[i11]);
                        }
                        r72 = b2.n.c;
                        str3 = null;
                        r82 = w3.p.a(r72, uuidArr, null);
                        break;
                    } else {
                        e2.a.l("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        r72 = null;
                        str2 = r72;
                        str3 = str2;
                        r82 = str2;
                        break;
                    }
                    break;
            }
            do {
                xmlPullParser.next();
                if ((!e2.a.i(xmlPullParser, "clearkey:Laurl") || e2.a.i(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r82 = r82;
                } else if (e2.a.i(xmlPullParser, "ms:laurl")) {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r82 = r82;
                } else {
                    if (r82 == 0 && xmlPullParser.getEventType() == 2) {
                        String name = xmlPullParser.getName();
                        int indexOf2 = name.indexOf(58);
                        if (indexOf2 != -1) {
                            name = name.substring(indexOf2 + 1);
                        }
                        if (name.equals("pssh") && xmlPullParser.next() == 4) {
                            byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                            j6.m i12 = w3.p.i(decode);
                            UUID uuid = i12 == null ? null : (UUID) i12.b;
                            if (uuid == null) {
                                e2.a.l("MpdParser", "Skipping malformed cenc:pssh data");
                                r72 = uuid;
                                r82 = 0;
                            } else {
                                UUID uuid2 = uuid;
                                r82 = decode;
                                r72 = uuid2;
                            }
                        }
                    }
                    if (r82 == 0) {
                        ?? r10 = b2.n.f;
                        if (r10.equals(r72) && e2.a.i(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r82 = w3.p.a(r10, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    b(xmlPullParser);
                    r82 = r82;
                }
            } while (!e2.a.h(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r72 != null ? new b2.s(r72, str3, "video/mp4", r82) : null);
        }
        str = null;
        r72 = null;
        str2 = r72;
        str3 = str2;
        r82 = str2;
        do {
            xmlPullParser.next();
            if (e2.a.i(xmlPullParser, "clearkey:Laurl")) {
            }
            str3 = xmlPullParser.getText();
            r82 = r82;
        } while (!e2.a.h(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r72 != null ? new b2.s(r72, str3, "video/mp4", r82) : null);
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

    public static f h(XmlPullParser xmlPullParser, String str) {
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
        } while (!e2.a.h(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j10;
        }
        Matcher matcher = l0.e.matcher(attributeValue);
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

    public static float j(XmlPullParser xmlPullParser, float f7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
            }
        }
        return f7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x1007 A[LOOP:5: B:183:0x0411->B:192:0x1007, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0e80 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0ce8 A[LOOP:11: B:352:0x06a9->B:361:0x0ce8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x090f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x09e9  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0a0c  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0a41 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x13e7 A[LOOP:1: B:35:0x00cd->B:43:0x13e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x13b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:556:0x09fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c k(XmlPullParser xmlPullParser, Uri uri) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        long j10;
        ArrayList arrayList;
        boolean z11;
        long j11;
        long j12;
        ArrayList arrayList2;
        long j13;
        long j14;
        ArrayList arrayList3;
        long j15;
        ArrayList arrayList4;
        String str;
        String str2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long j16;
        ArrayList arrayList7;
        String str3;
        String str4;
        long j17;
        long j18;
        String str5;
        String str6;
        ByteArrayOutputStream byteArrayOutputStream;
        String str7;
        long j19;
        String str8;
        String str9;
        long j20;
        String str10;
        long j21;
        ByteArrayOutputStream byteArrayOutputStream2;
        ArrayList arrayList8;
        long j22;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        ArrayList arrayList12;
        ArrayList arrayList13;
        String str18;
        String str19;
        String str20;
        ArrayList arrayList14;
        long j23;
        String str21;
        String str22;
        String str23;
        String str24;
        int i13;
        ArrayList arrayList15;
        ArrayList arrayList16;
        long j24;
        ArrayList arrayList17;
        String str25;
        int i14;
        String str26;
        String str27;
        ArrayList arrayList18;
        int parseInt;
        String str28;
        String str29;
        String str30;
        int parseInt2;
        String str31;
        float f7;
        int parseInt3;
        float f10;
        String str32;
        String str33;
        String str34;
        String str35;
        String str36;
        String str37;
        ArrayList arrayList19;
        int i15;
        String str38;
        int i16;
        int i17;
        ArrayList arrayList20;
        ArrayList arrayList21;
        String str39;
        long j25;
        ArrayList arrayList22;
        long j26;
        String str40;
        ArrayList arrayList23;
        long j27;
        String str41;
        ArrayList arrayList24;
        ArrayList arrayList25;
        String str42;
        s sVar;
        int i18;
        String str43;
        String str44;
        String str45;
        String d10;
        ArrayList arrayList26;
        String str46;
        String str47;
        b2.o oVar;
        int i19;
        long j28;
        ArrayList arrayList27;
        Pair pair;
        int parseInt4;
        String str48;
        int i20;
        int i21;
        String str49;
        String str50;
        int i22;
        m kVar;
        String str51;
        ArrayList arrayList28;
        long j29;
        int i23 = 0;
        String[] strArr = new String[0];
        String str52 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(",");
        }
        int length = strArr.length;
        int i24 = 0;
        while (true) {
            i10 = 1;
            if (i24 >= length) {
                z10 = false;
                break;
            }
            if (strArr[i24].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z10 = true;
                break;
            }
            i24++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long j30 = -9223372036854775807L;
        long V = attributeValue2 == null ? -9223372036854775807L : l0.V(attributeValue2);
        long i25 = i(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long i26 = i(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, TeXSymbolParser.TYPE_ATTR));
        long i27 = equals ? i(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long i28 = equals ? i(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long i29 = equals ? i(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long V2 = attributeValue3 == null ? -9223372036854775807L : l0.V(attributeValue3);
        long j31 = equals ? 0L : -9223372036854775807L;
        ArrayList q6 = e9.s.q(new b(z10 ? 1 : TLObject.FLAG_31, 1, uri.toString(), uri.toString()));
        ArrayList arrayList29 = new ArrayList();
        ArrayList arrayList30 = new ArrayList();
        long j32 = equals ? -9223372036854775807L : 0L;
        int i30 = 0;
        int i31 = 0;
        i iVar = null;
        c5.a aVar = null;
        Uri uri2 = null;
        i0 i0Var = null;
        while (true) {
            xmlPullParser.next();
            String str53 = "BaseURL";
            if (e2.a.i(xmlPullParser, "BaseURL")) {
                if (i30 == 0) {
                    j31 = d(xmlPullParser, j31);
                    i30 = i10;
                }
                arrayList30.addAll(e(xmlPullParser, q6, z10));
                arrayList = q6;
                arrayList2 = arrayList30;
                j14 = j32;
                z11 = z10;
                i11 = i23;
                i12 = i10;
                arrayList3 = arrayList29;
                j12 = j30;
            } else {
                i11 = i23;
                i12 = i10;
                String str54 = "lang";
                if (e2.a.i(xmlPullParser, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(str52, "moreInformationURL");
                    String str55 = attributeValue4 == null ? str52 : attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str52, "lang");
                    String str56 = attributeValue5 == null ? str52 : attributeValue5;
                    String str57 = str52;
                    String str58 = str57;
                    String str59 = str58;
                    while (true) {
                        xmlPullParser.next();
                        j10 = j30;
                        if (e2.a.i(xmlPullParser, "Title")) {
                            str57 = xmlPullParser.nextText();
                        } else if (e2.a.i(xmlPullParser, "Source")) {
                            str58 = xmlPullParser.nextText();
                        } else if (e2.a.i(xmlPullParser, "Copyright")) {
                            str59 = xmlPullParser.nextText();
                        } else {
                            b(xmlPullParser);
                        }
                        String str60 = str57;
                        String str61 = str58;
                        String str62 = str59;
                        if (e2.a.h(xmlPullParser, "ProgramInformation")) {
                            i iVar2 = new i(str60, str61, str62, str55, str56);
                            arrayList = q6;
                            arrayList2 = arrayList30;
                            j14 = j32;
                            z11 = z10;
                            arrayList3 = arrayList29;
                            iVar = iVar2;
                        } else {
                            str57 = str60;
                            str58 = str61;
                            str59 = str62;
                            j30 = j10;
                        }
                    }
                } else {
                    j10 = j30;
                    if (e2.a.i(xmlPullParser, "UTCTiming")) {
                        arrayList = q6;
                        arrayList2 = arrayList30;
                        j14 = j32;
                        aVar = new c5.a(2, xmlPullParser.getAttributeValue(str52, "schemeIdUri"), xmlPullParser.getAttributeValue(str52, "value"));
                    } else if (e2.a.i(xmlPullParser, "Location")) {
                        uri2 = e2.e.g(uri.toString(), xmlPullParser.nextText());
                        arrayList = q6;
                        arrayList2 = arrayList30;
                        j14 = j32;
                    } else {
                        if (e2.a.i(xmlPullParser, "ServiceDescription")) {
                            float f11 = -3.4028235E38f;
                            float f12 = -3.4028235E38f;
                            long j33 = j10;
                            long j34 = j33;
                            long j35 = j34;
                            while (true) {
                                xmlPullParser.next();
                                if (e2.a.i(xmlPullParser, "Latency")) {
                                    arrayList = q6;
                                    String attributeValue6 = xmlPullParser.getAttributeValue(null, "target");
                                    j33 = attributeValue6 == null ? j10 : Long.parseLong(attributeValue6);
                                    String attributeValue7 = xmlPullParser.getAttributeValue(null, "min");
                                    j34 = attributeValue7 == null ? j10 : Long.parseLong(attributeValue7);
                                    String attributeValue8 = xmlPullParser.getAttributeValue(null, "max");
                                    j35 = attributeValue8 == null ? j10 : Long.parseLong(attributeValue8);
                                } else {
                                    arrayList = q6;
                                    if (e2.a.i(xmlPullParser, "PlaybackRate")) {
                                        String attributeValue9 = xmlPullParser.getAttributeValue(null, "min");
                                        f11 = attributeValue9 == null ? -3.4028235E38f : Float.parseFloat(attributeValue9);
                                        String attributeValue10 = xmlPullParser.getAttributeValue(null, "max");
                                        f12 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                                    }
                                }
                                long j36 = j33;
                                long j37 = j31;
                                long j38 = j34;
                                long j39 = i28;
                                long j40 = j35;
                                if (e2.a.h(xmlPullParser, "ServiceDescription")) {
                                    i0 i0Var2 = new i0();
                                    i0Var2.a = j36;
                                    i0Var2.b = j38;
                                    i0Var2.c = j40;
                                    i0Var2.d = f11;
                                    i0Var2.e = f12;
                                    i0Var = i0Var2;
                                    z11 = z10;
                                    j31 = j37;
                                    j11 = j39;
                                    j12 = j10;
                                    arrayList2 = arrayList30;
                                    j14 = j32;
                                    arrayList3 = arrayList29;
                                } else {
                                    j35 = j40;
                                    i28 = j39;
                                    q6 = arrayList;
                                    j34 = j38;
                                    j31 = j37;
                                    j33 = j36;
                                }
                            }
                        } else {
                            arrayList = q6;
                            long j41 = j31;
                            long j42 = i28;
                            if (e2.a.i(xmlPullParser, "Period") && i31 == 0) {
                                ArrayList arrayList31 = !arrayList30.isEmpty() ? arrayList30 : arrayList;
                                String str63 = "id";
                                String attributeValue11 = xmlPullParser.getAttributeValue(null, "id");
                                long i32 = i(xmlPullParser, "start", j32);
                                String str64 = "duration";
                                String str65 = "value";
                                long j43 = V != j10 ? V + i32 : j10;
                                long i33 = i(xmlPullParser, "duration", j10);
                                ArrayList arrayList32 = new ArrayList();
                                ArrayList arrayList33 = new ArrayList();
                                ArrayList arrayList34 = new ArrayList();
                                long j44 = j10;
                                String str66 = "schemeIdUri";
                                String str67 = "Period";
                                int i34 = i11;
                                long j45 = j41;
                                s sVar2 = null;
                                while (true) {
                                    xmlPullParser.next();
                                    if (e2.a.i(xmlPullParser, str53)) {
                                        if (i34 == 0) {
                                            j45 = d(xmlPullParser, j45);
                                            i34 = i12;
                                        }
                                        arrayList34.addAll(e(xmlPullParser, arrayList31, z10));
                                        arrayList4 = arrayList31;
                                        str5 = str63;
                                        str = str53;
                                        str4 = str64;
                                        str3 = str65;
                                        z11 = z10;
                                        j15 = j45;
                                        str2 = str54;
                                        j11 = j42;
                                        j17 = j43;
                                        arrayList7 = arrayList32;
                                        arrayList5 = arrayList33;
                                        str6 = str67;
                                        j12 = -9223372036854775807L;
                                        arrayList6 = arrayList34;
                                        arrayList2 = arrayList30;
                                        j18 = i33;
                                        j13 = j41;
                                        j16 = j32;
                                    } else {
                                        j15 = j45;
                                        String str68 = "SegmentTemplate";
                                        if (e2.a.i(xmlPullParser, "AdaptationSet")) {
                                            if (arrayList34.isEmpty()) {
                                                arrayList8 = arrayList31;
                                                arrayList4 = arrayList8;
                                            } else {
                                                arrayList4 = arrayList31;
                                                arrayList8 = arrayList34;
                                            }
                                            String attributeValue12 = xmlPullParser.getAttributeValue(null, str63);
                                            long parseLong = attributeValue12 == null ? -1L : Long.parseLong(attributeValue12);
                                            int g10 = g(xmlPullParser);
                                            String str69 = "AdaptationSet";
                                            String attributeValue13 = xmlPullParser.getAttributeValue(null, "mimeType");
                                            ArrayList arrayList35 = arrayList34;
                                            ArrayList arrayList36 = arrayList30;
                                            String attributeValue14 = xmlPullParser.getAttributeValue(null, "codecs");
                                            long j46 = j32;
                                            String attributeValue15 = xmlPullParser.getAttributeValue(null, "scte214:supplementalCodecs");
                                            String attributeValue16 = xmlPullParser.getAttributeValue(null, "scte214:supplementalProfiles");
                                            String str70 = str64;
                                            String attributeValue17 = xmlPullParser.getAttributeValue(null, "width");
                                            int parseInt5 = attributeValue17 == null ? -1 : Integer.parseInt(attributeValue17);
                                            String str71 = str65;
                                            String attributeValue18 = xmlPullParser.getAttributeValue(null, "height");
                                            int parseInt6 = attributeValue18 == null ? -1 : Integer.parseInt(attributeValue18);
                                            float j47 = j(xmlPullParser, -1.0f);
                                            String str72 = "SegmentList";
                                            String str73 = "SegmentBase";
                                            String attributeValue19 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                            int parseInt7 = attributeValue19 == null ? -1 : Integer.parseInt(attributeValue19);
                                            String attributeValue20 = xmlPullParser.getAttributeValue(null, str54);
                                            String str74 = "audioSamplingRate";
                                            String attributeValue21 = xmlPullParser.getAttributeValue(null, "label");
                                            ArrayList arrayList37 = new ArrayList();
                                            String str75 = attributeValue21;
                                            ArrayList arrayList38 = new ArrayList();
                                            ArrayList arrayList39 = arrayList37;
                                            ArrayList arrayList40 = new ArrayList();
                                            ArrayList arrayList41 = new ArrayList();
                                            float f13 = j47;
                                            ArrayList arrayList42 = new ArrayList();
                                            String str76 = "height";
                                            ArrayList arrayList43 = new ArrayList();
                                            String str77 = "width";
                                            ArrayList arrayList44 = new ArrayList();
                                            String str78 = "scte214:supplementalProfiles";
                                            ArrayList arrayList45 = new ArrayList();
                                            ArrayList arrayList46 = new ArrayList();
                                            String str79 = str63;
                                            String str80 = "mimeType";
                                            String str81 = "codecs";
                                            int i35 = i11;
                                            s sVar3 = sVar2;
                                            long j48 = j44;
                                            long j49 = j15;
                                            String str82 = attributeValue20;
                                            int i36 = -1;
                                            String str83 = "scte214:supplementalCodecs";
                                            int i37 = g10;
                                            String str84 = null;
                                            while (true) {
                                                xmlPullParser.next();
                                                if (e2.a.i(xmlPullParser, str53)) {
                                                    if (i35 == 0) {
                                                        j49 = d(xmlPullParser, j49);
                                                        i35 = i12;
                                                    }
                                                    j22 = j49;
                                                    arrayList46.addAll(e(xmlPullParser, arrayList8, z10));
                                                } else {
                                                    j22 = j49;
                                                    if (e2.a.i(xmlPullParser, "ContentProtection")) {
                                                        Pair f14 = f(xmlPullParser);
                                                        Object obj = f14.first;
                                                        if (obj != null) {
                                                            str84 = (String) obj;
                                                        }
                                                        Object obj2 = f14.second;
                                                        if (obj2 != null) {
                                                            arrayList38.add((b2.s) obj2);
                                                        }
                                                    } else if (e2.a.i(xmlPullParser, "ContentComponent")) {
                                                        String attributeValue22 = xmlPullParser.getAttributeValue(null, str54);
                                                        if (str82 == null) {
                                                            str82 = attributeValue22;
                                                        } else if (attributeValue22 != null) {
                                                            t6.p(str82.equals(attributeValue22));
                                                        }
                                                        int g11 = g(xmlPullParser);
                                                        if (i37 == -1) {
                                                            i37 = g11;
                                                        } else if (g11 != -1) {
                                                            t6.p(i37 == g11 ? i12 : i11);
                                                        }
                                                        arrayList11 = arrayList8;
                                                        str24 = str82;
                                                        str = str53;
                                                        z11 = z10;
                                                        arrayList9 = arrayList38;
                                                        arrayList10 = arrayList41;
                                                        arrayList7 = arrayList32;
                                                        arrayList5 = arrayList33;
                                                        str13 = str70;
                                                        str14 = str71;
                                                        str22 = str72;
                                                        str23 = str73;
                                                        arrayList17 = arrayList39;
                                                        arrayList16 = arrayList40;
                                                        str15 = str77;
                                                        str16 = str78;
                                                        str17 = str79;
                                                        arrayList12 = arrayList46;
                                                        str18 = str83;
                                                        str19 = str81;
                                                        str20 = str80;
                                                        j23 = j43;
                                                        str21 = attributeValue14;
                                                        arrayList15 = arrayList42;
                                                        j11 = j42;
                                                        j18 = i33;
                                                        arrayList6 = arrayList35;
                                                        arrayList2 = arrayList36;
                                                        i14 = i37;
                                                        str25 = str54;
                                                        j13 = j41;
                                                        str11 = str68;
                                                        j16 = j46;
                                                        arrayList14 = arrayList43;
                                                        arrayList13 = arrayList44;
                                                        str26 = str69;
                                                        if (e2.a.h(xmlPullParser, str26)) {
                                                            i12 = 1;
                                                            str69 = str26;
                                                            arrayList39 = arrayList17;
                                                            arrayList40 = arrayList16;
                                                            str73 = str23;
                                                            arrayList36 = arrayList2;
                                                            arrayList44 = arrayList13;
                                                            arrayList43 = arrayList14;
                                                            arrayList46 = arrayList12;
                                                            j49 = j22;
                                                            arrayList41 = arrayList10;
                                                            arrayList8 = arrayList11;
                                                            str53 = str;
                                                            arrayList32 = arrayList7;
                                                            arrayList33 = arrayList5;
                                                            str71 = str14;
                                                            str70 = str13;
                                                            str72 = str22;
                                                            str68 = str11;
                                                            j46 = j16;
                                                            j41 = j13;
                                                            arrayList38 = arrayList9;
                                                            i33 = j18;
                                                            str54 = str25;
                                                            attributeValue14 = str21;
                                                            i37 = i14;
                                                            str82 = str24;
                                                            arrayList35 = arrayList6;
                                                            j42 = j11;
                                                            arrayList42 = arrayList15;
                                                            z10 = z11;
                                                            j43 = j23;
                                                            str79 = str17;
                                                            str80 = str20;
                                                            str81 = str19;
                                                            str83 = str18;
                                                            str78 = str16;
                                                            str77 = str15;
                                                        } else {
                                                            ArrayList arrayList47 = new ArrayList(arrayList45.size());
                                                            int i38 = i11;
                                                            while (i38 < arrayList45.size()) {
                                                                ArrayList arrayList48 = arrayList45;
                                                                d dVar = (d) arrayList48.get(i38);
                                                                w a2 = dVar.a.a();
                                                                if (str75 == null || !arrayList17.isEmpty()) {
                                                                    str49 = str75;
                                                                    a2.c = n0.u(arrayList17);
                                                                } else {
                                                                    str49 = str75;
                                                                    a2.b = str49;
                                                                }
                                                                String str85 = dVar.d;
                                                                if (str85 == null) {
                                                                    str85 = str84;
                                                                }
                                                                ArrayList arrayList49 = dVar.e;
                                                                ArrayList arrayList50 = arrayList17;
                                                                arrayList49.addAll(arrayList9);
                                                                long j50 = j18;
                                                                if (arrayList49.isEmpty()) {
                                                                    str50 = str25;
                                                                    i22 = i38;
                                                                    arrayList45 = arrayList48;
                                                                } else {
                                                                    int i39 = i11;
                                                                    while (true) {
                                                                        if (i39 < arrayList49.size()) {
                                                                            b2.s sVar4 = (b2.s) arrayList49.get(i39);
                                                                            str50 = str25;
                                                                            if (!b2.n.d.equals(sVar4.b) || (str51 = sVar4.c) == null) {
                                                                                i39++;
                                                                                str25 = str50;
                                                                            } else {
                                                                                arrayList49.remove(i39);
                                                                            }
                                                                        } else {
                                                                            str50 = str25;
                                                                            str51 = null;
                                                                        }
                                                                    }
                                                                    if (str51 != null) {
                                                                        int i40 = i11;
                                                                        while (i40 < arrayList49.size()) {
                                                                            b2.s sVar5 = (b2.s) arrayList49.get(i40);
                                                                            int i41 = i38;
                                                                            if (b2.n.c.equals(sVar5.b) && sVar5.c == null) {
                                                                                arrayList28 = arrayList48;
                                                                                arrayList49.set(i40, new b2.s(b2.n.d, str51, sVar5.d, sVar5.e));
                                                                            } else {
                                                                                arrayList28 = arrayList48;
                                                                            }
                                                                            i40++;
                                                                            i38 = i41;
                                                                            arrayList48 = arrayList28;
                                                                        }
                                                                    }
                                                                    i22 = i38;
                                                                    arrayList45 = arrayList48;
                                                                    for (int size = arrayList49.size() - 1; size >= 0; size--) {
                                                                        b2.s sVar6 = (b2.s) arrayList49.get(size);
                                                                        if (sVar6.e == null) {
                                                                            int i42 = i11;
                                                                            while (true) {
                                                                                if (i42 < arrayList49.size()) {
                                                                                    b2.s sVar7 = (b2.s) arrayList49.get(i42);
                                                                                    if (sVar7.e != null && sVar6.e == null && sVar7.a(sVar6.b)) {
                                                                                        arrayList49.remove(size);
                                                                                    } else {
                                                                                        i42++;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    a2.v = new b2.t(str85, arrayList49);
                                                                }
                                                                ArrayList arrayList51 = dVar.f;
                                                                arrayList51.addAll(arrayList16);
                                                                x xVar = new x(a2);
                                                                n0 n0Var = dVar.b;
                                                                s sVar8 = dVar.c;
                                                                ArrayList arrayList52 = dVar.g;
                                                                ArrayList arrayList53 = dVar.h;
                                                                if (sVar8 instanceof r) {
                                                                    kVar = new l(xVar, n0Var, (r) sVar8, arrayList51, arrayList52, arrayList53);
                                                                } else {
                                                                    if (!(sVar8 instanceof n)) {
                                                                        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                    }
                                                                    kVar = new k(xVar, n0Var, (n) sVar8, arrayList51, arrayList52, arrayList53);
                                                                }
                                                                arrayList47.add(kVar);
                                                                i38 = i22 + 1;
                                                                str75 = str49;
                                                                arrayList17 = arrayList50;
                                                                str25 = str50;
                                                                j18 = j50;
                                                            }
                                                            str2 = str25;
                                                            i12 = 1;
                                                            arrayList7.add(new a(parseLong, i14, arrayList47, arrayList10, arrayList14, arrayList13));
                                                            j17 = j23;
                                                            str3 = str14;
                                                            str4 = str13;
                                                            str5 = str17;
                                                            j12 = -9223372036854775807L;
                                                        }
                                                    } else {
                                                        if (e2.a.i(xmlPullParser, "Role")) {
                                                            arrayList42.add(h(xmlPullParser, "Role"));
                                                        } else {
                                                            String str86 = "AudioChannelConfiguration";
                                                            if (e2.a.i(xmlPullParser, "AudioChannelConfiguration")) {
                                                                i36 = c(xmlPullParser, attributeValue14);
                                                            } else {
                                                                String str87 = "ContentProtection";
                                                                if (e2.a.i(xmlPullParser, "Accessibility")) {
                                                                    arrayList41.add(h(xmlPullParser, "Accessibility"));
                                                                } else if (e2.a.i(xmlPullParser, "EssentialProperty")) {
                                                                    arrayList43.add(h(xmlPullParser, "EssentialProperty"));
                                                                } else {
                                                                    arrayList9 = arrayList38;
                                                                    if (e2.a.i(xmlPullParser, "SupplementalProperty")) {
                                                                        arrayList44.add(h(xmlPullParser, "SupplementalProperty"));
                                                                        arrayList11 = arrayList8;
                                                                        str24 = str82;
                                                                        i13 = i37;
                                                                        str = str53;
                                                                        z11 = z10;
                                                                        arrayList10 = arrayList41;
                                                                        str25 = str54;
                                                                        arrayList7 = arrayList32;
                                                                        arrayList5 = arrayList33;
                                                                        str11 = str68;
                                                                        str12 = str69;
                                                                        str13 = str70;
                                                                        str14 = str71;
                                                                        str22 = str72;
                                                                        str23 = str73;
                                                                        arrayList17 = arrayList39;
                                                                        arrayList16 = arrayList40;
                                                                        str15 = str77;
                                                                        str16 = str78;
                                                                        str17 = str79;
                                                                        j24 = j48;
                                                                        arrayList12 = arrayList46;
                                                                        arrayList13 = arrayList44;
                                                                        str18 = str83;
                                                                        str19 = str81;
                                                                        str20 = str80;
                                                                        j23 = j43;
                                                                        str21 = attributeValue14;
                                                                        arrayList15 = arrayList42;
                                                                        j11 = j42;
                                                                        j18 = i33;
                                                                        arrayList6 = arrayList35;
                                                                        arrayList2 = arrayList36;
                                                                        j13 = j41;
                                                                        j16 = j46;
                                                                        arrayList14 = arrayList43;
                                                                        j48 = j24;
                                                                        i14 = i13;
                                                                        str26 = str12;
                                                                        if (e2.a.h(xmlPullParser, str26)) {
                                                                        }
                                                                    } else {
                                                                        String str88 = str54;
                                                                        arrayList10 = arrayList41;
                                                                        if (e2.a.i(xmlPullParser, "Representation")) {
                                                                            arrayList11 = arrayList8;
                                                                            if (arrayList46.isEmpty()) {
                                                                                str27 = "Representation";
                                                                                arrayList18 = arrayList11;
                                                                            } else {
                                                                                str27 = "Representation";
                                                                                arrayList18 = arrayList46;
                                                                            }
                                                                            String str89 = "SupplementalProperty";
                                                                            String str90 = str79;
                                                                            String str91 = "EssentialProperty";
                                                                            String attributeValue23 = xmlPullParser.getAttributeValue(null, str90);
                                                                            String str92 = str90;
                                                                            String attributeValue24 = xmlPullParser.getAttributeValue(null, "bandwidth");
                                                                            if (attributeValue24 == null) {
                                                                                str28 = str80;
                                                                                parseInt = -1;
                                                                            } else {
                                                                                String str93 = str80;
                                                                                parseInt = Integer.parseInt(attributeValue24);
                                                                                str28 = str93;
                                                                            }
                                                                            String attributeValue25 = xmlPullParser.getAttributeValue(null, str28);
                                                                            String str94 = str81;
                                                                            str20 = str28;
                                                                            String str95 = attributeValue25 == null ? attributeValue13 : attributeValue25;
                                                                            String attributeValue26 = xmlPullParser.getAttributeValue(null, str94);
                                                                            String str96 = str83;
                                                                            str19 = str94;
                                                                            String str97 = attributeValue26 == null ? attributeValue14 : attributeValue26;
                                                                            String attributeValue27 = xmlPullParser.getAttributeValue(null, str96);
                                                                            String str98 = str78;
                                                                            str18 = str96;
                                                                            String str99 = attributeValue27 == null ? attributeValue15 : attributeValue27;
                                                                            String attributeValue28 = xmlPullParser.getAttributeValue(null, str98);
                                                                            String str100 = str77;
                                                                            str16 = str98;
                                                                            String str101 = attributeValue28 == null ? attributeValue16 : attributeValue28;
                                                                            String attributeValue29 = xmlPullParser.getAttributeValue(null, str100);
                                                                            if (attributeValue29 == null) {
                                                                                String str102 = str76;
                                                                                str29 = str100;
                                                                                str30 = str102;
                                                                                parseInt2 = parseInt5;
                                                                            } else {
                                                                                String str103 = str76;
                                                                                str29 = str100;
                                                                                str30 = str103;
                                                                                parseInt2 = Integer.parseInt(attributeValue29);
                                                                            }
                                                                            String attributeValue30 = xmlPullParser.getAttributeValue(null, str30);
                                                                            if (attributeValue30 == null) {
                                                                                float f15 = f13;
                                                                                str31 = str30;
                                                                                f7 = f15;
                                                                                parseInt3 = parseInt6;
                                                                            } else {
                                                                                float f16 = f13;
                                                                                str31 = str30;
                                                                                f7 = f16;
                                                                                parseInt3 = Integer.parseInt(attributeValue30);
                                                                            }
                                                                            String str104 = "InbandEventStream";
                                                                            float j51 = j(xmlPullParser, f7);
                                                                            String str105 = str74;
                                                                            String attributeValue31 = xmlPullParser.getAttributeValue(null, str105);
                                                                            int parseInt8 = attributeValue31 == null ? parseInt7 : Integer.parseInt(attributeValue31);
                                                                            str74 = str105;
                                                                            ArrayList arrayList54 = new ArrayList();
                                                                            ArrayList arrayList55 = new ArrayList();
                                                                            ArrayList arrayList56 = new ArrayList(arrayList43);
                                                                            ArrayList arrayList57 = new ArrayList(arrayList44);
                                                                            ArrayList arrayList58 = new ArrayList();
                                                                            ArrayList arrayList59 = arrayList43;
                                                                            int i43 = parseInt8;
                                                                            String str106 = attributeValue14;
                                                                            int i44 = i37;
                                                                            int i45 = i11;
                                                                            s sVar9 = sVar3;
                                                                            long j52 = j48;
                                                                            int i46 = i36;
                                                                            long j53 = j22;
                                                                            String str107 = null;
                                                                            while (true) {
                                                                                xmlPullParser.next();
                                                                                if (e2.a.i(xmlPullParser, str53)) {
                                                                                    if (i45 == 0) {
                                                                                        j53 = d(xmlPullParser, j53);
                                                                                        i45 = i12;
                                                                                    }
                                                                                    f10 = f7;
                                                                                    arrayList58.addAll(e(xmlPullParser, arrayList18, z10));
                                                                                } else {
                                                                                    f10 = f7;
                                                                                    if (e2.a.i(xmlPullParser, str86)) {
                                                                                        i46 = c(xmlPullParser, str97);
                                                                                    } else {
                                                                                        String str108 = str73;
                                                                                        if (e2.a.i(xmlPullParser, str108)) {
                                                                                            str32 = str86;
                                                                                            str34 = str108;
                                                                                            str35 = str82;
                                                                                            str = str53;
                                                                                            z11 = z10;
                                                                                            str36 = str97;
                                                                                            arrayList7 = arrayList32;
                                                                                            arrayList5 = arrayList33;
                                                                                            str37 = str69;
                                                                                            str13 = str70;
                                                                                            str14 = str71;
                                                                                            str33 = str72;
                                                                                            str15 = str29;
                                                                                            arrayList19 = arrayList45;
                                                                                            i15 = parseInt;
                                                                                            str38 = str87;
                                                                                            str42 = str27;
                                                                                            str17 = str92;
                                                                                            str40 = str104;
                                                                                            i16 = i44;
                                                                                            sVar = o(xmlPullParser, (r) sVar9);
                                                                                            arrayList25 = arrayList57;
                                                                                            i17 = i43;
                                                                                            arrayList12 = arrayList46;
                                                                                            arrayList21 = arrayList58;
                                                                                            arrayList22 = arrayList18;
                                                                                            str11 = str68;
                                                                                            str76 = str31;
                                                                                            str39 = str91;
                                                                                            str43 = str107;
                                                                                            f13 = f10;
                                                                                            j26 = j53;
                                                                                            arrayList13 = arrayList44;
                                                                                            j25 = i33;
                                                                                            j23 = j43;
                                                                                            str21 = str106;
                                                                                            arrayList23 = arrayList54;
                                                                                            arrayList20 = arrayList42;
                                                                                            j13 = j41;
                                                                                            j11 = j42;
                                                                                            arrayList6 = arrayList35;
                                                                                            arrayList2 = arrayList36;
                                                                                            j16 = j46;
                                                                                            arrayList14 = arrayList59;
                                                                                            j27 = j52;
                                                                                            arrayList24 = arrayList56;
                                                                                            i18 = i46;
                                                                                            if (e2.a.h(xmlPullParser, str42)) {
                                                                                                if (v0.i(str95)) {
                                                                                                    if (str36 != null) {
                                                                                                        String[] d02 = l0.d0(str36);
                                                                                                        int length2 = d02.length;
                                                                                                        for (int i47 = i11; i47 < length2; i47++) {
                                                                                                            d10 = v0.d(d02[i47]);
                                                                                                            if (d10 != null && v0.i(d10)) {
                                                                                                                str44 = d10;
                                                                                                                str45 = str95;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    d10 = null;
                                                                                                    str44 = d10;
                                                                                                    str45 = str95;
                                                                                                } else if (v0.m(str95)) {
                                                                                                    if (str36 != null) {
                                                                                                        String[] d03 = l0.d0(str36);
                                                                                                        int length3 = d03.length;
                                                                                                        for (int i48 = i11; i48 < length3; i48++) {
                                                                                                            d10 = v0.d(d03[i48]);
                                                                                                            if (d10 != null && v0.m(d10)) {
                                                                                                                str44 = d10;
                                                                                                                str45 = str95;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    d10 = null;
                                                                                                    str44 = d10;
                                                                                                    str45 = str95;
                                                                                                } else if (v0.l(str95) || v0.k(str95)) {
                                                                                                    str44 = str95;
                                                                                                    str45 = str44;
                                                                                                } else {
                                                                                                    str45 = str95;
                                                                                                    if ("application/mp4".equals(str45)) {
                                                                                                        str44 = v0.d(str36);
                                                                                                        if ("text/vtt".equals(str44)) {
                                                                                                            str44 = "application/x-mp4-vtt";
                                                                                                        }
                                                                                                    } else {
                                                                                                        str44 = null;
                                                                                                    }
                                                                                                }
                                                                                                if ("audio/eac3".equals(str44)) {
                                                                                                    int i49 = i11;
                                                                                                    while (i49 < arrayList25.size()) {
                                                                                                        f fVar = (f) arrayList25.get(i49);
                                                                                                        int i50 = i49;
                                                                                                        String str109 = fVar.a;
                                                                                                        String str110 = fVar.b;
                                                                                                        arrayList26 = arrayList25;
                                                                                                        if (("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str109) && "JOC".equals(str110)) || ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str109) && "ec+3".equals(str110))) {
                                                                                                            str44 = "audio/eac3-joc";
                                                                                                            if ("audio/eac3-joc".equals(str44)) {
                                                                                                                str47 = "ec+3";
                                                                                                                str46 = str99;
                                                                                                                if (v0.j(str47, str46)) {
                                                                                                                    oVar = null;
                                                                                                                } else {
                                                                                                                    b2.o x10 = l0.x(str47, str46, str101);
                                                                                                                    String str111 = str46 != null ? str46 : str47;
                                                                                                                    oVar = x10;
                                                                                                                    str44 = "video/dolby-vision";
                                                                                                                    str47 = str111;
                                                                                                                }
                                                                                                                i19 = i11;
                                                                                                                int i51 = i19;
                                                                                                                while (true) {
                                                                                                                    j28 = j25;
                                                                                                                    if (i19 >= arrayList20.size()) {
                                                                                                                        ArrayList arrayList60 = arrayList20;
                                                                                                                        f fVar2 = (f) arrayList60.get(i19);
                                                                                                                        String str112 = str45;
                                                                                                                        if (r6.a("urn:mpeg:dash:role:2011", fVar2.a)) {
                                                                                                                            String str113 = fVar2.b;
                                                                                                                            i51 |= (str113 != null && (str113.equals("forced_subtitle") || str113.equals("forced-subtitle"))) ? 2 : i11;
                                                                                                                        }
                                                                                                                        i19++;
                                                                                                                        str45 = str112;
                                                                                                                        arrayList20 = arrayList60;
                                                                                                                        j25 = j28;
                                                                                                                    } else {
                                                                                                                        ArrayList arrayList61 = arrayList20;
                                                                                                                        String str114 = str45;
                                                                                                                        int i52 = i11;
                                                                                                                        int i53 = i52;
                                                                                                                        while (i52 < arrayList61.size()) {
                                                                                                                            f fVar3 = (f) arrayList61.get(i52);
                                                                                                                            ArrayList arrayList62 = arrayList61;
                                                                                                                            if (r6.a("urn:mpeg:dash:role:2011", fVar3.a)) {
                                                                                                                                i53 |= m(fVar3.b);
                                                                                                                            }
                                                                                                                            i52++;
                                                                                                                            arrayList61 = arrayList62;
                                                                                                                        }
                                                                                                                        ArrayList arrayList63 = arrayList61;
                                                                                                                        int i54 = i11;
                                                                                                                        int i55 = i54;
                                                                                                                        while (i54 < arrayList10.size()) {
                                                                                                                            ArrayList arrayList64 = arrayList10;
                                                                                                                            int i56 = i54;
                                                                                                                            f fVar4 = (f) arrayList64.get(i54);
                                                                                                                            int i57 = i55;
                                                                                                                            String str115 = fVar4.a;
                                                                                                                            int i58 = i53;
                                                                                                                            String str116 = fVar4.b;
                                                                                                                            if (r6.a("urn:mpeg:dash:role:2011", str115)) {
                                                                                                                                i21 = m(str116);
                                                                                                                            } else if (r6.a("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar4.a)) {
                                                                                                                                if (str116 != null) {
                                                                                                                                    switch (str116.hashCode()) {
                                                                                                                                        case 49:
                                                                                                                                            if (str116.equals("1")) {
                                                                                                                                                i20 = i11;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            i20 = -1;
                                                                                                                                            break;
                                                                                                                                        case 50:
                                                                                                                                            if (str116.equals("2")) {
                                                                                                                                                i20 = i12;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            i20 = -1;
                                                                                                                                            break;
                                                                                                                                        case zs.o0 /* 51 */:
                                                                                                                                            if (str116.equals("3")) {
                                                                                                                                                i20 = 2;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            i20 = -1;
                                                                                                                                            break;
                                                                                                                                        case zs.p0 /* 52 */:
                                                                                                                                            if (str116.equals("4")) {
                                                                                                                                                i20 = 3;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            i20 = -1;
                                                                                                                                            break;
                                                                                                                                        case zs.q0 /* 53 */:
                                                                                                                                        default:
                                                                                                                                            i20 = -1;
                                                                                                                                            break;
                                                                                                                                        case zs.r0 /* 54 */:
                                                                                                                                            if (str116.equals("6")) {
                                                                                                                                                i20 = 4;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            i20 = -1;
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                    switch (i20) {
                                                                                                                                        case 0:
                                                                                                                                            i21 = 512;
                                                                                                                                            break;
                                                                                                                                        case 1:
                                                                                                                                            i21 = 2048;
                                                                                                                                            break;
                                                                                                                                        case 2:
                                                                                                                                            i21 = 4;
                                                                                                                                            break;
                                                                                                                                        case 3:
                                                                                                                                            i21 = 8;
                                                                                                                                            break;
                                                                                                                                        case 4:
                                                                                                                                            i21 = i12;
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                i21 = i11;
                                                                                                                            } else {
                                                                                                                                i55 = i57;
                                                                                                                                i54 = i56 + 1;
                                                                                                                                arrayList10 = arrayList64;
                                                                                                                                i53 = i58;
                                                                                                                            }
                                                                                                                            i55 = i57 | i21;
                                                                                                                            i54 = i56 + 1;
                                                                                                                            arrayList10 = arrayList64;
                                                                                                                            i53 = i58;
                                                                                                                        }
                                                                                                                        ArrayList arrayList65 = arrayList10;
                                                                                                                        int n10 = i53 | i55 | n(arrayList24) | n(arrayList26);
                                                                                                                        int i59 = i11;
                                                                                                                        while (true) {
                                                                                                                            if (i59 < arrayList24.size()) {
                                                                                                                                f fVar5 = (f) arrayList24.get(i59);
                                                                                                                                arrayList27 = arrayList24;
                                                                                                                                if ((r6.a("http://dashif.org/thumbnail_tile", fVar5.a) || r6.a("http://dashif.org/guidelines/thumbnail_tile", fVar5.a)) && (str48 = fVar5.b) != null) {
                                                                                                                                    String str117 = l0.a;
                                                                                                                                    String[] split = str48.split("x", -1);
                                                                                                                                    if (split.length != 2) {
                                                                                                                                        continue;
                                                                                                                                    } else {
                                                                                                                                        try {
                                                                                                                                            pair = Pair.create(Integer.valueOf(Integer.parseInt(split[i11])), Integer.valueOf(Integer.parseInt(split[i12])));
                                                                                                                                        } catch (NumberFormatException unused) {
                                                                                                                                            continue;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                i59++;
                                                                                                                                arrayList24 = arrayList27;
                                                                                                                            } else {
                                                                                                                                arrayList27 = arrayList24;
                                                                                                                                pair = null;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        w wVar = new w();
                                                                                                                        wVar.a = attributeValue23;
                                                                                                                        wVar.q = v0.n(str114);
                                                                                                                        wVar.r = v0.n(str44);
                                                                                                                        wVar.j = str47;
                                                                                                                        wVar.i = i15;
                                                                                                                        wVar.e = i51;
                                                                                                                        wVar.f = n10;
                                                                                                                        wVar.H = oVar;
                                                                                                                        String str118 = str35;
                                                                                                                        wVar.d = str118;
                                                                                                                        wVar.Q = pair != null ? ((Integer) pair.first).intValue() : -1;
                                                                                                                        wVar.R = pair != null ? ((Integer) pair.second).intValue() : -1;
                                                                                                                        if (v0.m(str44)) {
                                                                                                                            wVar.y = parseInt2;
                                                                                                                            wVar.z = parseInt3;
                                                                                                                            wVar.C = j51;
                                                                                                                        } else {
                                                                                                                            int i60 = parseInt2;
                                                                                                                            int i61 = parseInt3;
                                                                                                                            if (v0.i(str44)) {
                                                                                                                                wVar.J = i18;
                                                                                                                                wVar.K = i17;
                                                                                                                            } else if (v0.l(str44)) {
                                                                                                                                if ("application/cea-608".equals(str44)) {
                                                                                                                                    int i62 = i11;
                                                                                                                                    while (i62 < arrayList65.size()) {
                                                                                                                                        f fVar6 = (f) arrayList65.get(i62);
                                                                                                                                        String str119 = fVar6.a;
                                                                                                                                        String str120 = fVar6.b;
                                                                                                                                        if ("urn:scte:dash:cc:cea-608:2015".equals(str119) && str120 != null) {
                                                                                                                                            Matcher matcher = c.matcher(str120);
                                                                                                                                            if (matcher.matches()) {
                                                                                                                                                parseInt4 = Integer.parseInt(matcher.group(i12));
                                                                                                                                                wVar.O = parseInt4;
                                                                                                                                            } else {
                                                                                                                                                e2.a.l("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str120));
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        i62++;
                                                                                                                                        i12 = 1;
                                                                                                                                    }
                                                                                                                                    parseInt4 = -1;
                                                                                                                                    wVar.O = parseInt4;
                                                                                                                                } else {
                                                                                                                                    if ("application/cea-708".equals(str44)) {
                                                                                                                                        for (int i63 = i11; i63 < arrayList65.size(); i63++) {
                                                                                                                                            f fVar7 = (f) arrayList65.get(i63);
                                                                                                                                            String str121 = fVar7.a;
                                                                                                                                            String str122 = fVar7.b;
                                                                                                                                            if ("urn:scte:dash:cc:cea-708:2015".equals(str121) && str122 != null) {
                                                                                                                                                Matcher matcher2 = d.matcher(str122);
                                                                                                                                                if (matcher2.matches()) {
                                                                                                                                                    parseInt4 = Integer.parseInt(matcher2.group(1));
                                                                                                                                                    wVar.O = parseInt4;
                                                                                                                                                } else {
                                                                                                                                                    e2.a.l("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str122));
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    parseInt4 = -1;
                                                                                                                                    wVar.O = parseInt4;
                                                                                                                                }
                                                                                                                                if (e2.a.h(xmlPullParser, str26)) {
                                                                                                                                }
                                                                                                                            } else if (v0.k(str44)) {
                                                                                                                                wVar.y = i60;
                                                                                                                                wVar.z = i61;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        x xVar2 = new x(wVar);
                                                                                                                        d dVar2 = new d(xVar2, !arrayList21.isEmpty() ? arrayList21 : arrayList22, sVar != null ? sVar : new r(null, 1L, 0L, 0L, 0L), str43, arrayList23, arrayList55, arrayList27, arrayList26);
                                                                                                                        int h = v0.h(xVar2.s);
                                                                                                                        int i64 = i16;
                                                                                                                        if (i64 != -1) {
                                                                                                                            if (h != -1) {
                                                                                                                                t6.p(i64 == h ? 1 : i11);
                                                                                                                            }
                                                                                                                            h = i64;
                                                                                                                        }
                                                                                                                        ArrayList arrayList66 = arrayList19;
                                                                                                                        arrayList66.add(dVar2);
                                                                                                                        arrayList45 = arrayList66;
                                                                                                                        str24 = str118;
                                                                                                                        i14 = h;
                                                                                                                        arrayList10 = arrayList65;
                                                                                                                        arrayList15 = arrayList63;
                                                                                                                        arrayList17 = arrayList39;
                                                                                                                        arrayList16 = arrayList40;
                                                                                                                        str25 = str88;
                                                                                                                        j18 = j28;
                                                                                                                        str26 = str37;
                                                                                                                        str22 = str33;
                                                                                                                        str23 = str34;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            i49 = i50 + 1;
                                                                                                            arrayList25 = arrayList26;
                                                                                                        }
                                                                                                    }
                                                                                                    arrayList26 = arrayList25;
                                                                                                    str44 = "audio/eac3";
                                                                                                    if ("audio/eac3-joc".equals(str44)) {
                                                                                                    }
                                                                                                } else {
                                                                                                    arrayList26 = arrayList25;
                                                                                                }
                                                                                                str46 = str99;
                                                                                                str47 = str36;
                                                                                                if (v0.j(str47, str46)) {
                                                                                                }
                                                                                                i19 = i11;
                                                                                                int i512 = i19;
                                                                                                while (true) {
                                                                                                    j28 = j25;
                                                                                                    if (i19 >= arrayList20.size()) {
                                                                                                    }
                                                                                                    i19++;
                                                                                                    str45 = str112;
                                                                                                    arrayList20 = arrayList60;
                                                                                                    j25 = j28;
                                                                                                }
                                                                                            } else {
                                                                                                arrayList56 = arrayList24;
                                                                                                arrayList57 = arrayList25;
                                                                                                arrayList54 = arrayList23;
                                                                                                long j54 = j25;
                                                                                                i46 = i18;
                                                                                                str27 = str42;
                                                                                                j53 = j26;
                                                                                                str104 = str40;
                                                                                                str87 = str38;
                                                                                                str106 = str21;
                                                                                                arrayList44 = arrayList13;
                                                                                                j52 = j27;
                                                                                                arrayList59 = arrayList14;
                                                                                                arrayList46 = arrayList12;
                                                                                                str86 = str32;
                                                                                                f7 = f13;
                                                                                                str31 = str76;
                                                                                                str107 = str43;
                                                                                                str53 = str;
                                                                                                str97 = str36;
                                                                                                i44 = i16;
                                                                                                arrayList45 = arrayList19;
                                                                                                str82 = str35;
                                                                                                i43 = i17;
                                                                                                str71 = str14;
                                                                                                str70 = str13;
                                                                                                str72 = str33;
                                                                                                str73 = str34;
                                                                                                i12 = 1;
                                                                                                str68 = str11;
                                                                                                arrayList36 = arrayList2;
                                                                                                arrayList35 = arrayList6;
                                                                                                arrayList18 = arrayList22;
                                                                                                str29 = str15;
                                                                                                sVar9 = sVar;
                                                                                                arrayList32 = arrayList7;
                                                                                                str69 = str37;
                                                                                                j42 = j11;
                                                                                                z10 = z11;
                                                                                                arrayList42 = arrayList20;
                                                                                                j46 = j16;
                                                                                                j41 = j13;
                                                                                                i33 = j54;
                                                                                                str92 = str17;
                                                                                                str95 = str95;
                                                                                                j43 = j23;
                                                                                                parseInt = i15;
                                                                                                str91 = str39;
                                                                                                arrayList58 = arrayList21;
                                                                                                arrayList33 = arrayList5;
                                                                                            }
                                                                                        } else {
                                                                                            str32 = str86;
                                                                                            String str123 = str72;
                                                                                            if (e2.a.i(xmlPullParser, str123)) {
                                                                                                arrayList12 = arrayList46;
                                                                                                str = str53;
                                                                                                long d11 = d(xmlPullParser, j52);
                                                                                                str33 = str123;
                                                                                                str34 = str108;
                                                                                                str35 = str82;
                                                                                                str36 = str97;
                                                                                                long j55 = i33;
                                                                                                long j56 = j43;
                                                                                                arrayList7 = arrayList32;
                                                                                                arrayList5 = arrayList33;
                                                                                                str37 = str69;
                                                                                                str13 = str70;
                                                                                                str14 = str71;
                                                                                                str15 = str29;
                                                                                                arrayList19 = arrayList45;
                                                                                                i15 = parseInt;
                                                                                                str38 = str87;
                                                                                                str17 = str92;
                                                                                                str21 = str106;
                                                                                                i16 = i44;
                                                                                                i17 = i43;
                                                                                                ArrayList arrayList67 = arrayList44;
                                                                                                arrayList20 = arrayList42;
                                                                                                arrayList21 = arrayList58;
                                                                                                j13 = j41;
                                                                                                long j57 = j42;
                                                                                                arrayList6 = arrayList35;
                                                                                                arrayList2 = arrayList36;
                                                                                                j16 = j46;
                                                                                                str76 = str31;
                                                                                                str39 = str91;
                                                                                                arrayList14 = arrayList59;
                                                                                                f13 = f10;
                                                                                                j25 = j55;
                                                                                                j27 = d11;
                                                                                                j26 = j53;
                                                                                                arrayList22 = arrayList18;
                                                                                                str11 = str68;
                                                                                                arrayList13 = arrayList67;
                                                                                                j23 = j56;
                                                                                                z11 = z10;
                                                                                                str42 = str27;
                                                                                                str40 = str104;
                                                                                                sVar = p(xmlPullParser, (o) sVar9, j56, j55, j53, d11, j57);
                                                                                                arrayList24 = arrayList56;
                                                                                                arrayList25 = arrayList57;
                                                                                                i18 = i46;
                                                                                                j11 = j57;
                                                                                                str43 = str107;
                                                                                                arrayList23 = arrayList54;
                                                                                            } else {
                                                                                                str33 = str123;
                                                                                                str34 = str108;
                                                                                                str35 = str82;
                                                                                                arrayList12 = arrayList46;
                                                                                                str = str53;
                                                                                                str36 = str97;
                                                                                                long j58 = j43;
                                                                                                arrayList7 = arrayList32;
                                                                                                arrayList5 = arrayList33;
                                                                                                str37 = str69;
                                                                                                str13 = str70;
                                                                                                str14 = str71;
                                                                                                str15 = str29;
                                                                                                arrayList19 = arrayList45;
                                                                                                i15 = parseInt;
                                                                                                str38 = str87;
                                                                                                str17 = str92;
                                                                                                str21 = str106;
                                                                                                i16 = i44;
                                                                                                i17 = i43;
                                                                                                ArrayList arrayList68 = arrayList44;
                                                                                                arrayList20 = arrayList42;
                                                                                                arrayList21 = arrayList58;
                                                                                                long j59 = j42;
                                                                                                arrayList6 = arrayList35;
                                                                                                arrayList2 = arrayList36;
                                                                                                str76 = str31;
                                                                                                str39 = str91;
                                                                                                f13 = f10;
                                                                                                long j60 = j53;
                                                                                                j25 = i33;
                                                                                                String str124 = str68;
                                                                                                j13 = j41;
                                                                                                j16 = j46;
                                                                                                arrayList14 = arrayList59;
                                                                                                if (e2.a.i(xmlPullParser, str124)) {
                                                                                                    j11 = j59;
                                                                                                    long d12 = d(xmlPullParser, j52);
                                                                                                    z11 = z10;
                                                                                                    arrayList22 = arrayList18;
                                                                                                    str11 = str124;
                                                                                                    j26 = j60;
                                                                                                    s q10 = q(xmlPullParser, (p) sVar9, arrayList68, j58, j25, j26, d12, j11);
                                                                                                    arrayList13 = arrayList68;
                                                                                                    j23 = j58;
                                                                                                    j27 = d12;
                                                                                                    str42 = str27;
                                                                                                    str40 = str104;
                                                                                                    sVar = q10;
                                                                                                    arrayList23 = arrayList54;
                                                                                                } else {
                                                                                                    z11 = z10;
                                                                                                    arrayList13 = arrayList68;
                                                                                                    j11 = j59;
                                                                                                    arrayList22 = arrayList18;
                                                                                                    str11 = str124;
                                                                                                    j26 = j60;
                                                                                                    if (e2.a.i(xmlPullParser, str38)) {
                                                                                                        Pair f17 = f(xmlPullParser);
                                                                                                        Object obj3 = f17.first;
                                                                                                        if (obj3 != null) {
                                                                                                            str107 = (String) obj3;
                                                                                                        }
                                                                                                        Object obj4 = f17.second;
                                                                                                        if (obj4 != null) {
                                                                                                            arrayList23 = arrayList54;
                                                                                                            arrayList23.add((b2.s) obj4);
                                                                                                        } else {
                                                                                                            arrayList23 = arrayList54;
                                                                                                        }
                                                                                                        j27 = j52;
                                                                                                        j23 = j58;
                                                                                                        str42 = str27;
                                                                                                        str40 = str104;
                                                                                                        sVar = sVar9;
                                                                                                    } else {
                                                                                                        str40 = str104;
                                                                                                        arrayList23 = arrayList54;
                                                                                                        if (e2.a.i(xmlPullParser, str40)) {
                                                                                                            j27 = j52;
                                                                                                            arrayList55.add(h(xmlPullParser, str40));
                                                                                                            j23 = j58;
                                                                                                            str41 = str89;
                                                                                                            arrayList24 = arrayList56;
                                                                                                        } else {
                                                                                                            j27 = j52;
                                                                                                            ArrayList arrayList69 = arrayList55;
                                                                                                            if (e2.a.i(xmlPullParser, str39)) {
                                                                                                                arrayList55 = arrayList69;
                                                                                                                arrayList24 = arrayList56;
                                                                                                                arrayList24.add(h(xmlPullParser, str39));
                                                                                                                j23 = j58;
                                                                                                                str41 = str89;
                                                                                                            } else {
                                                                                                                arrayList55 = arrayList69;
                                                                                                                str41 = str89;
                                                                                                                arrayList24 = arrayList56;
                                                                                                                if (e2.a.i(xmlPullParser, str41)) {
                                                                                                                    j23 = j58;
                                                                                                                    arrayList25 = arrayList57;
                                                                                                                    arrayList25.add(h(xmlPullParser, str41));
                                                                                                                } else {
                                                                                                                    j23 = j58;
                                                                                                                    arrayList25 = arrayList57;
                                                                                                                    b(xmlPullParser);
                                                                                                                }
                                                                                                                str89 = str41;
                                                                                                                str42 = str27;
                                                                                                                sVar = sVar9;
                                                                                                                i18 = i46;
                                                                                                                str43 = str107;
                                                                                                            }
                                                                                                        }
                                                                                                        arrayList25 = arrayList57;
                                                                                                        str89 = str41;
                                                                                                        str42 = str27;
                                                                                                        sVar = sVar9;
                                                                                                        i18 = i46;
                                                                                                        str43 = str107;
                                                                                                    }
                                                                                                }
                                                                                                arrayList24 = arrayList56;
                                                                                                arrayList25 = arrayList57;
                                                                                                i18 = i46;
                                                                                                str43 = str107;
                                                                                            }
                                                                                            if (e2.a.h(xmlPullParser, str42)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str35 = str82;
                                                                                str = str53;
                                                                                z11 = z10;
                                                                                str36 = str97;
                                                                                arrayList7 = arrayList32;
                                                                                arrayList5 = arrayList33;
                                                                                str37 = str69;
                                                                                str13 = str70;
                                                                                str14 = str71;
                                                                                str33 = str72;
                                                                                str34 = str73;
                                                                                str15 = str29;
                                                                                arrayList19 = arrayList45;
                                                                                i15 = parseInt;
                                                                                str38 = str87;
                                                                                str17 = str92;
                                                                                str40 = str104;
                                                                                i16 = i44;
                                                                                sVar = sVar9;
                                                                                arrayList25 = arrayList57;
                                                                                i17 = i43;
                                                                                str32 = str86;
                                                                                arrayList12 = arrayList46;
                                                                                arrayList21 = arrayList58;
                                                                                arrayList22 = arrayList18;
                                                                                str11 = str68;
                                                                                str76 = str31;
                                                                                str39 = str91;
                                                                                str42 = str27;
                                                                                str43 = str107;
                                                                                f13 = f10;
                                                                                j26 = j53;
                                                                                arrayList13 = arrayList44;
                                                                                j25 = i33;
                                                                                j23 = j43;
                                                                                str21 = str106;
                                                                                arrayList23 = arrayList54;
                                                                                arrayList20 = arrayList42;
                                                                                j13 = j41;
                                                                                j11 = j42;
                                                                                arrayList6 = arrayList35;
                                                                                arrayList2 = arrayList36;
                                                                                j16 = j46;
                                                                                arrayList14 = arrayList59;
                                                                                j27 = j52;
                                                                                arrayList24 = arrayList56;
                                                                                i18 = i46;
                                                                                if (e2.a.h(xmlPullParser, str42)) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            arrayList11 = arrayList8;
                                                                            str = str53;
                                                                            z11 = z10;
                                                                            long j61 = i33;
                                                                            arrayList7 = arrayList32;
                                                                            arrayList5 = arrayList33;
                                                                            str11 = str68;
                                                                            str12 = str69;
                                                                            str13 = str70;
                                                                            str14 = str71;
                                                                            String str125 = str72;
                                                                            str15 = str77;
                                                                            str16 = str78;
                                                                            str17 = str79;
                                                                            arrayList12 = arrayList46;
                                                                            arrayList13 = arrayList44;
                                                                            j13 = j41;
                                                                            j16 = j46;
                                                                            str18 = str83;
                                                                            str19 = str81;
                                                                            str20 = str80;
                                                                            arrayList14 = arrayList43;
                                                                            ArrayList arrayList70 = arrayList42;
                                                                            j11 = j42;
                                                                            j23 = j43;
                                                                            arrayList6 = arrayList35;
                                                                            arrayList2 = arrayList36;
                                                                            String str126 = str73;
                                                                            str21 = attributeValue14;
                                                                            int i65 = i37;
                                                                            if (e2.a.i(xmlPullParser, str126)) {
                                                                                sVar3 = o(xmlPullParser, (r) sVar3);
                                                                                str23 = str126;
                                                                                str24 = str82;
                                                                                i14 = i65;
                                                                                arrayList15 = arrayList70;
                                                                                arrayList17 = arrayList39;
                                                                                arrayList16 = arrayList40;
                                                                                str25 = str88;
                                                                                j18 = j61;
                                                                                str26 = str12;
                                                                                str22 = str125;
                                                                            } else {
                                                                                str22 = str125;
                                                                                if (e2.a.i(xmlPullParser, str22)) {
                                                                                    long d13 = d(xmlPullParser, j48);
                                                                                    str23 = str126;
                                                                                    str24 = str82;
                                                                                    i13 = i65;
                                                                                    arrayList15 = arrayList70;
                                                                                    sVar3 = p(xmlPullParser, (o) sVar3, j23, j61, j22, d13, j11);
                                                                                    j11 = j11;
                                                                                    j18 = j61;
                                                                                    j48 = d13;
                                                                                } else {
                                                                                    str23 = str126;
                                                                                    str24 = str82;
                                                                                    i13 = i65;
                                                                                    arrayList15 = arrayList70;
                                                                                    long j62 = j48;
                                                                                    j18 = j61;
                                                                                    if (e2.a.i(xmlPullParser, str11)) {
                                                                                        long d14 = d(xmlPullParser, j62);
                                                                                        sVar3 = q(xmlPullParser, (p) sVar3, arrayList13, j23, j18, j22, d14, j11);
                                                                                        j48 = d14;
                                                                                    } else {
                                                                                        if (e2.a.i(xmlPullParser, "InbandEventStream")) {
                                                                                            arrayList16 = arrayList40;
                                                                                            arrayList16.add(h(xmlPullParser, "InbandEventStream"));
                                                                                            j24 = j62;
                                                                                            arrayList17 = arrayList39;
                                                                                            str25 = str88;
                                                                                        } else {
                                                                                            arrayList16 = arrayList40;
                                                                                            if (e2.a.i(xmlPullParser, "Label")) {
                                                                                                str25 = str88;
                                                                                                String attributeValue32 = xmlPullParser.getAttributeValue(null, str25);
                                                                                                String str127 = "";
                                                                                                while (true) {
                                                                                                    xmlPullParser.next();
                                                                                                    j24 = j62;
                                                                                                    if (xmlPullParser.getEventType() == 4) {
                                                                                                        str127 = xmlPullParser.getText();
                                                                                                    } else {
                                                                                                        b(xmlPullParser);
                                                                                                    }
                                                                                                    if (e2.a.h(xmlPullParser, "Label")) {
                                                                                                        arrayList17 = arrayList39;
                                                                                                        arrayList17.add(new b0(attributeValue32, str127));
                                                                                                    } else {
                                                                                                        j62 = j24;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                j24 = j62;
                                                                                                arrayList17 = arrayList39;
                                                                                                str25 = str88;
                                                                                                if (xmlPullParser.getEventType() == 2) {
                                                                                                    b(xmlPullParser);
                                                                                                }
                                                                                                j48 = j24;
                                                                                                i14 = i13;
                                                                                                str26 = str12;
                                                                                                if (e2.a.h(xmlPullParser, str26)) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        j48 = j24;
                                                                                        i14 = i13;
                                                                                        str26 = str12;
                                                                                        if (e2.a.h(xmlPullParser, str26)) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                                arrayList17 = arrayList39;
                                                                                arrayList16 = arrayList40;
                                                                                str25 = str88;
                                                                                i14 = i13;
                                                                                str26 = str12;
                                                                            }
                                                                        }
                                                                        if (e2.a.h(xmlPullParser, str26)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        arrayList11 = arrayList8;
                                                        str24 = str82;
                                                        i13 = i37;
                                                        str = str53;
                                                        z11 = z10;
                                                        arrayList9 = arrayList38;
                                                        arrayList10 = arrayList41;
                                                        str25 = str54;
                                                        arrayList7 = arrayList32;
                                                        arrayList5 = arrayList33;
                                                        str11 = str68;
                                                        str12 = str69;
                                                        str13 = str70;
                                                        str14 = str71;
                                                        str22 = str72;
                                                        str23 = str73;
                                                        arrayList17 = arrayList39;
                                                        arrayList16 = arrayList40;
                                                        str15 = str77;
                                                        str16 = str78;
                                                        str17 = str79;
                                                        j24 = j48;
                                                        arrayList12 = arrayList46;
                                                        arrayList13 = arrayList44;
                                                        str18 = str83;
                                                        str19 = str81;
                                                        str20 = str80;
                                                        j23 = j43;
                                                        str21 = attributeValue14;
                                                        arrayList15 = arrayList42;
                                                        j11 = j42;
                                                        j18 = i33;
                                                        arrayList6 = arrayList35;
                                                        arrayList2 = arrayList36;
                                                        j13 = j41;
                                                        j16 = j46;
                                                        arrayList14 = arrayList43;
                                                        j48 = j24;
                                                        i14 = i13;
                                                        str26 = str12;
                                                        if (e2.a.h(xmlPullParser, str26)) {
                                                        }
                                                    }
                                                }
                                                arrayList11 = arrayList8;
                                                str24 = str82;
                                                str = str53;
                                                z11 = z10;
                                                arrayList9 = arrayList38;
                                                arrayList10 = arrayList41;
                                                arrayList7 = arrayList32;
                                                arrayList5 = arrayList33;
                                                str13 = str70;
                                                str14 = str71;
                                                str22 = str72;
                                                str23 = str73;
                                                arrayList17 = arrayList39;
                                                arrayList16 = arrayList40;
                                                str15 = str77;
                                                str16 = str78;
                                                str17 = str79;
                                                arrayList12 = arrayList46;
                                                str18 = str83;
                                                str19 = str81;
                                                str20 = str80;
                                                j23 = j43;
                                                str21 = attributeValue14;
                                                arrayList15 = arrayList42;
                                                j11 = j42;
                                                j18 = i33;
                                                arrayList6 = arrayList35;
                                                arrayList2 = arrayList36;
                                                i14 = i37;
                                                str25 = str54;
                                                j13 = j41;
                                                str11 = str68;
                                                j16 = j46;
                                                arrayList14 = arrayList43;
                                                arrayList13 = arrayList44;
                                                str26 = str69;
                                                if (e2.a.h(xmlPullParser, str26)) {
                                                }
                                            }
                                        } else {
                                            arrayList4 = arrayList31;
                                            String str128 = str63;
                                            str = str53;
                                            String str129 = str64;
                                            String str130 = str65;
                                            z11 = z10;
                                            str2 = str54;
                                            j11 = j42;
                                            long j63 = i33;
                                            long j64 = j43;
                                            ArrayList arrayList71 = arrayList32;
                                            arrayList5 = arrayList33;
                                            arrayList6 = arrayList34;
                                            arrayList2 = arrayList30;
                                            j13 = j41;
                                            j16 = j32;
                                            if (e2.a.i(xmlPullParser, "EventStream")) {
                                                String str131 = str66;
                                                String attributeValue33 = xmlPullParser.getAttributeValue(null, str131);
                                                String str132 = attributeValue33 == null ? "" : attributeValue33;
                                                String str133 = str130;
                                                String attributeValue34 = xmlPullParser.getAttributeValue(null, str133);
                                                String str134 = attributeValue34 == null ? "" : attributeValue34;
                                                String attributeValue35 = xmlPullParser.getAttributeValue(null, "timescale");
                                                long parseLong2 = attributeValue35 == null ? 1L : Long.parseLong(attributeValue35);
                                                String attributeValue36 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
                                                long parseLong3 = attributeValue36 == null ? 0L : Long.parseLong(attributeValue36);
                                                ArrayList arrayList72 = new ArrayList();
                                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(512);
                                                while (true) {
                                                    xmlPullParser.next();
                                                    if (e2.a.i(xmlPullParser, "Event")) {
                                                        str9 = str128;
                                                        String attributeValue37 = xmlPullParser.getAttributeValue(null, str9);
                                                        long parseLong4 = attributeValue37 == null ? 0L : Long.parseLong(attributeValue37);
                                                        str8 = str129;
                                                        String attributeValue38 = xmlPullParser.getAttributeValue(null, str8);
                                                        long parseLong5 = attributeValue38 == null ? -9223372036854775807L : Long.parseLong(attributeValue38);
                                                        String attributeValue39 = xmlPullParser.getAttributeValue(null, "presentationTime");
                                                        long parseLong6 = attributeValue39 == null ? 0L : Long.parseLong(attributeValue39);
                                                        String str135 = l0.a;
                                                        RoundingMode roundingMode = RoundingMode.DOWN;
                                                        long a02 = l0.a0(parseLong5, 1000L, parseLong2, roundingMode);
                                                        long a03 = l0.a0(parseLong6 - parseLong3, 1000000L, parseLong2, roundingMode);
                                                        arrayList7 = arrayList71;
                                                        j19 = parseLong2;
                                                        str66 = str131;
                                                        String attributeValue40 = xmlPullParser.getAttributeValue(null, "messageData");
                                                        if (attributeValue40 == null) {
                                                            attributeValue40 = null;
                                                        }
                                                        byteArrayOutputStream3.reset();
                                                        XmlSerializer newSerializer = Xml.newSerializer();
                                                        str3 = str133;
                                                        newSerializer.setOutput(byteArrayOutputStream3, StandardCharsets.UTF_8.name());
                                                        xmlPullParser.nextToken();
                                                        while (!e2.a.h(xmlPullParser, "Event")) {
                                                            switch (xmlPullParser.getEventType()) {
                                                                case 0:
                                                                    j21 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    newSerializer.startDocument(null, Boolean.FALSE);
                                                                    break;
                                                                case 1:
                                                                    j21 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    newSerializer.endDocument();
                                                                    break;
                                                                case 2:
                                                                    j21 = parseLong3;
                                                                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    int i66 = i11;
                                                                    while (i66 < xmlPullParser.getAttributeCount()) {
                                                                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i66), xmlPullParser.getAttributeName(i66), xmlPullParser.getAttributeValue(i66));
                                                                        i66++;
                                                                        byteArrayOutputStream3 = byteArrayOutputStream3;
                                                                    }
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 3:
                                                                    j21 = parseLong3;
                                                                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 4:
                                                                    newSerializer.text(xmlPullParser.getText());
                                                                    j21 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 5:
                                                                    newSerializer.cdsect(xmlPullParser.getText());
                                                                    j21 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 6:
                                                                    newSerializer.entityRef(xmlPullParser.getText());
                                                                    j21 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 7:
                                                                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                    j21 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 8:
                                                                    newSerializer.processingInstruction(xmlPullParser.getText());
                                                                    j21 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 9:
                                                                    newSerializer.comment(xmlPullParser.getText());
                                                                    j21 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 10:
                                                                    newSerializer.docdecl(xmlPullParser.getText());
                                                                    j21 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                default:
                                                                    j21 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                            }
                                                            xmlPullParser.nextToken();
                                                            byteArrayOutputStream3 = byteArrayOutputStream2;
                                                            parseLong3 = j21;
                                                        }
                                                        j20 = parseLong3;
                                                        byteArrayOutputStream = byteArrayOutputStream3;
                                                        newSerializer.flush();
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        Long valueOf = Long.valueOf(a03);
                                                        if (attributeValue40 != null) {
                                                            byteArray = attributeValue40.getBytes(StandardCharsets.UTF_8);
                                                        }
                                                        str7 = str132;
                                                        str10 = str134;
                                                        arrayList72.add(Pair.create(valueOf, new n3.a(str132, str134, a02, parseLong4, byteArray)));
                                                    } else {
                                                        arrayList7 = arrayList71;
                                                        str66 = str131;
                                                        str3 = str133;
                                                        byteArrayOutputStream = byteArrayOutputStream3;
                                                        str7 = str132;
                                                        j19 = parseLong2;
                                                        str8 = str129;
                                                        str9 = str128;
                                                        j20 = parseLong3;
                                                        str10 = str134;
                                                        b(xmlPullParser);
                                                    }
                                                    if (e2.a.h(xmlPullParser, "EventStream")) {
                                                        long[] jArr = new long[arrayList72.size()];
                                                        n3.a[] aVarArr = new n3.a[arrayList72.size()];
                                                        for (int i67 = i11; i67 < arrayList72.size(); i67++) {
                                                            Pair pair2 = (Pair) arrayList72.get(i67);
                                                            jArr[i67] = ((Long) pair2.first).longValue();
                                                            aVarArr[i67] = (n3.a) pair2.second;
                                                        }
                                                        arrayList5.add(new g(str7, str10, jArr, aVarArr));
                                                        str4 = str8;
                                                        j17 = j64;
                                                        j18 = j63;
                                                        j12 = -9223372036854775807L;
                                                        str5 = str9;
                                                    } else {
                                                        str132 = str7;
                                                        str134 = str10;
                                                        str128 = str9;
                                                        str129 = str8;
                                                        str131 = str66;
                                                        byteArrayOutputStream3 = byteArrayOutputStream;
                                                        parseLong3 = j20;
                                                        str133 = str3;
                                                        arrayList71 = arrayList7;
                                                        parseLong2 = j19;
                                                    }
                                                }
                                            } else {
                                                arrayList7 = arrayList71;
                                                str3 = str130;
                                                str4 = str129;
                                                if (e2.a.i(xmlPullParser, "SegmentBase")) {
                                                    sVar2 = o(xmlPullParser, null);
                                                    arrayList5 = arrayList5;
                                                    str6 = str67;
                                                    j17 = j64;
                                                    j18 = j63;
                                                    j12 = -9223372036854775807L;
                                                    str5 = str128;
                                                } else if (e2.a.i(xmlPullParser, "SegmentList")) {
                                                    j12 = -9223372036854775807L;
                                                    long d15 = d(xmlPullParser, -9223372036854775807L);
                                                    arrayList5 = arrayList5;
                                                    str5 = str128;
                                                    sVar2 = p(xmlPullParser, null, j64, j63, j15, d15, j11);
                                                    j11 = j11;
                                                    j18 = j63;
                                                    j17 = j64;
                                                    j44 = d15;
                                                } else {
                                                    arrayList5 = arrayList5;
                                                    j17 = j64;
                                                    j18 = j63;
                                                    j12 = -9223372036854775807L;
                                                    str5 = str128;
                                                    if (e2.a.i(xmlPullParser, str68)) {
                                                        long d16 = d(xmlPullParser, -9223372036854775807L);
                                                        e9.l0 l0Var = n0.b;
                                                        sVar2 = q(xmlPullParser, null, x1.e, j17, j18, j15, d16, j11);
                                                        j44 = d16;
                                                    } else if (e2.a.i(xmlPullParser, "AssetIdentifier")) {
                                                        h(xmlPullParser, "AssetIdentifier");
                                                    } else {
                                                        b(xmlPullParser);
                                                    }
                                                }
                                            }
                                        }
                                        str6 = str67;
                                    }
                                    if (e2.a.h(xmlPullParser, str6)) {
                                        Pair create = Pair.create(new h(attributeValue11, i32, arrayList7, arrayList5), Long.valueOf(j18));
                                        h hVar = (h) create.first;
                                        if (hVar.b != j12) {
                                            long longValue = ((Long) create.second).longValue();
                                            j29 = longValue == j12 ? j12 : longValue + hVar.b;
                                            arrayList3 = arrayList29;
                                            arrayList3.add(hVar);
                                        } else {
                                            if (!equals) {
                                                throw w0.b("Unable to determine start of period " + arrayList29.size(), null);
                                            }
                                            arrayList3 = arrayList29;
                                            i31 = i12;
                                            j29 = j16;
                                        }
                                        j14 = j29;
                                    } else {
                                        str67 = str6;
                                        j43 = j17;
                                        j32 = j16;
                                        j41 = j13;
                                        j45 = j15;
                                        arrayList31 = arrayList4;
                                        str64 = str4;
                                        str63 = str5;
                                        str54 = str2;
                                        str53 = str;
                                        arrayList32 = arrayList7;
                                        arrayList33 = arrayList5;
                                        i33 = j18;
                                        arrayList30 = arrayList2;
                                        arrayList34 = arrayList6;
                                        j42 = j11;
                                        z10 = z11;
                                        str65 = str3;
                                    }
                                }
                            } else {
                                z11 = z10;
                                j11 = j42;
                                j12 = j10;
                                arrayList2 = arrayList30;
                                j13 = j41;
                                j14 = j32;
                                arrayList3 = arrayList29;
                                b(xmlPullParser);
                            }
                            j31 = j13;
                        }
                        if (!e2.a.h(xmlPullParser, "MPD")) {
                            if (i25 == j12) {
                                if (j14 != j12) {
                                    i25 = j14;
                                } else if (!equals) {
                                    throw w0.b("Unable to determine duration of static manifest.", null);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw w0.b("No periods found.", null);
                            }
                            return new c(V, i25, i26, equals, i27, j11, i29, V2, iVar, aVar, i0Var, uri2, arrayList3);
                        }
                        arrayList29 = arrayList3;
                        i28 = j11;
                        j30 = j12;
                        i23 = i11;
                        i10 = i12;
                        j32 = j14;
                        arrayList30 = arrayList2;
                        q6 = arrayList;
                        z10 = z11;
                        str52 = null;
                    }
                    z11 = z10;
                    arrayList3 = arrayList29;
                }
                j12 = j10;
            }
            j11 = i28;
            if (!e2.a.h(xmlPullParser, "MPD")) {
            }
        }
    }

    public static j l(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j10 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j11 = (Long.parseLong(split[1]) - j10) + 1;
                return new j(j10, attributeValue, j11);
            }
        } else {
            j10 = 0;
        }
        j11 = -1;
        return new j(j10, attributeValue, j11);
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
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (r6.a("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i11)).a)) {
                i10 = TLObject.FLAG_14;
            }
        }
        return i10;
    }

    public static r o(XmlPullParser xmlPullParser, r rVar) {
        long j10 = rVar != null ? rVar.b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j10 = Long.parseLong(attributeValue);
        }
        long j11 = j10;
        long j12 = rVar != null ? rVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j12 = Long.parseLong(attributeValue2);
        }
        long j13 = j12;
        long j14 = rVar != null ? rVar.d : 0L;
        long j15 = rVar != null ? rVar.e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split("-");
            j14 = Long.parseLong(split[0]);
            j15 = (Long.parseLong(split[1]) - j14) + 1;
        }
        long j16 = j15;
        long j17 = j14;
        j jVar = rVar != null ? rVar.a : null;
        while (true) {
            xmlPullParser.next();
            if (e2.a.i(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar2 = jVar;
            if (e2.a.h(xmlPullParser, "SegmentBase")) {
                return new r(jVar2, j11, j13, j17, j16);
            }
            jVar = jVar2;
        }
    }

    public static o p(XmlPullParser xmlPullParser, o oVar, long j10, long j11, long j12, long j13, long j14) {
        long j15 = oVar != null ? oVar.b : 1L;
        List list = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j15 = Long.parseLong(attributeValue);
        }
        long j16 = j15;
        long j17 = oVar != null ? oVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j17 = Long.parseLong(attributeValue2);
        }
        long j18 = j17;
        long j19 = oVar != null ? oVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j19 = Long.parseLong(attributeValue3);
        }
        long j20 = j19;
        long j21 = oVar != null ? oVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j21 = Long.parseLong(attributeValue4);
        }
        long j22 = j21;
        long j23 = j13 == -9223372036854775807L ? j12 : j13;
        long j24 = j23 == Long.MAX_VALUE ? -9223372036854775807L : j23;
        j jVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (e2.a.i(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else if (e2.a.i(xmlPullParser, "SegmentTimeline")) {
                list2 = r(xmlPullParser, j16, j11);
            } else if (e2.a.i(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(l(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!e2.a.h(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVar == null) {
                jVar = oVar.a;
            }
            if (list2 == null) {
                list2 = oVar.f;
            }
            if (list == null) {
                list = oVar.j;
            }
        }
        return new o(jVar, j16, j18, j22, j20, list2, j24, list, l0.S(j14), l0.S(j10));
    }

    public static p q(XmlPullParser xmlPullParser, p pVar, List list, long j10, long j11, long j12, long j13, long j14) {
        long j15;
        long j16 = pVar != null ? pVar.b : 1L;
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j16 = Long.parseLong(attributeValue);
        }
        long j17 = j16;
        long j18 = pVar != null ? pVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j18 = Long.parseLong(attributeValue2);
        }
        long j19 = j18;
        long j20 = pVar != null ? pVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j20 = Long.parseLong(attributeValue3);
        }
        long j21 = j20;
        long j22 = pVar != null ? pVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j22 = Long.parseLong(attributeValue4);
        }
        long j23 = j22;
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                j15 = -1;
                break;
            }
            f fVar = (f) list.get(i10);
            if (r6.a("http://dashif.org/guidelines/last-segment-number", fVar.a)) {
                j15 = Long.parseLong(fVar.b);
                break;
            }
            i10++;
        }
        long j24 = j15;
        long j25 = j13 == -9223372036854775807L ? j12 : j13;
        long j26 = j25 == Long.MAX_VALUE ? -9223372036854775807L : j25;
        li.k s10 = s(xmlPullParser, "media", pVar != null ? pVar.k : null);
        li.k s11 = s(xmlPullParser, "initialization", pVar != null ? pVar.j : null);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (e2.a.i(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else if (e2.a.i(xmlPullParser, "SegmentTimeline")) {
                list2 = r(xmlPullParser, j17, j11);
            } else {
                b(xmlPullParser);
            }
        } while (!e2.a.h(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar == null) {
                jVar = pVar.a;
            }
            if (list2 == null) {
                list2 = pVar.f;
            }
        }
        return new p(jVar, j17, j19, j23, j24, j21, list2, j26, s11, s10, l0.S(j14), l0.S(j10));
    }

    public static ArrayList r(XmlPullParser xmlPullParser, long j10, long j11) {
        long j12;
        ArrayList arrayList = new ArrayList();
        long j13 = 0;
        long j14 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (e2.a.i(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long parseLong = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z10) {
                    int i11 = i10;
                    j12 = parseLong;
                    j13 = a(arrayList, j13, j14, i11, j12);
                } else {
                    j12 = parseLong;
                }
                if (j12 != -9223372036854775807L) {
                    j13 = j12;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j14 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i10 = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z10 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!e2.a.h(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            String str = l0.a;
            a(arrayList, j13, j14, i10, l0.a0(j11, j10, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0100. Please report as an issue. */
    public static li.k s(XmlPullParser xmlPullParser, String str, li.k kVar) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return kVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int i10 = 0;
        while (i10 < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i10);
            if (indexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i10));
                i10 = attributeValue.length();
            } else if (indexOf != i10) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i10, indexOf));
                i10 = indexOf;
            } else if (attributeValue.startsWith("$$", i10)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                i10 += 2;
            } else {
                arrayList3.add("");
                int i11 = i10 + 1;
                int indexOf2 = attributeValue.indexOf("$", i11);
                String substring = attributeValue.substring(i11, indexOf2);
                if (substring.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
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
                    substring.getClass();
                    switch (substring) {
                        case "Number":
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    arrayList3.set(arrayList2.size() - 1, str2);
                }
                arrayList.add("");
                i10 = indexOf2 + 1;
            }
        }
        return new li.k(arrayList, arrayList2, arrayList3, 3);
    }

    @Override // y2.n
    public final Object g1(Uri uri, g2.l lVar) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(lVar, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return k(newPullParser, uri);
            }
            throw w0.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e7) {
            if (e7.getDetail() instanceof IOException) {
                throw ((IOException) e7.getDetail());
            }
            throw w0.b(null, e7);
        }
    }
}
