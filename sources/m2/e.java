package m2;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.car.app.navigation.model.Maneuver;
import b2.r0;
import b2.s0;
import b2.w;
import e2.d0;
import e9.a1;
import e9.g0;
import e9.i0;
import java.io.ByteArrayOutputStream;
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
import v7.r6;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class e extends DefaultHandler implements y2.o {
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

    public static long a(ArrayList arrayList, long j3, long j10, int i10, long j11) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            String str = d0.a;
            i11 = (int) ((((j11 - j3) + j10) - 1) / j10);
        }
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(new q(j3, j10));
            j3 += j10;
        }
        return j3;
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
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0099, code lost:
    
        if (r13 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009d, code lost:
    
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
    
        if (r13.equals("fa01") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a7, code lost:
    
        if (r13 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ba, code lost:
    
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
                        String[] b02 = d0.b0(str);
                        if (b02.length != 0) {
                            List x10 = new a5.a(new xa.c(new d9.b('.'), 14)).x(r6.b(b02[0].trim()));
                            if (x10.size() == 4 && ((String) x10.get(0)).equals("ac-4")) {
                                String str2 = (String) x10.get(3);
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
                    String b10 = r6.b(attributeValue5);
                    b10.getClass();
                    switch (b10.hashCode()) {
                        case 1596796:
                            if (b10.equals("4000")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2937391:
                            if (b10.equals("a000")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3094034:
                            if (b10.equals("f800")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3094035:
                            if (b10.equals("f801")) {
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
        } while (!e2.d.l(xmlPullParser, "AudioChannelConfiguration"));
        return i12;
    }

    public static long d(XmlPullParser xmlPullParser, long j3) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j3;
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
        } while (!e2.d.l(xmlPullParser, "BaseURL"));
        if (str != null && e2.a.h(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return e9.q.p(new b(parseInt, parseInt2, str, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            b bVar = (b) arrayList.get(i10);
            String l4 = e2.a.l(bVar.a, str);
            String str2 = attributeValue3 == null ? l4 : attributeValue3;
            if (z10) {
                parseInt = bVar.c;
                parseInt2 = bVar.d;
                str2 = bVar.b;
            }
            arrayList2.add(new b(parseInt, parseInt2, l4, str2));
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0176  */
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
            String b10 = r6.b(attributeValue);
            b10.getClass();
            switch (b10.hashCode()) {
                case -1980789791:
                    if (b10.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 489446379:
                    if (b10.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 755418770:
                    if (b10.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1812765994:
                    if (b10.equals("urn:mpeg:dash:mp4protection:2011")) {
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
                    r72 = b2.i.c;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r82 = str2;
                    break;
                case 1:
                    r72 = b2.i.e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r82 = str2;
                    break;
                case 2:
                    r72 = b2.i.d;
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
                        r72 = b2.i.b;
                        str3 = null;
                        r82 = w3.n.a(r72, uuidArr, null);
                        break;
                    } else {
                        e2.a.n("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
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
                if ((!e2.d.m(xmlPullParser, "clearkey:Laurl") || e2.d.m(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r82 = r82;
                } else if (e2.d.m(xmlPullParser, "ms:laurl")) {
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
                            j6.l j3 = w3.n.j(decode);
                            UUID uuid = j3 == null ? null : (UUID) j3.b;
                            if (uuid == null) {
                                e2.a.n("MpdParser", "Skipping malformed cenc:pssh data");
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
                        ?? r10 = b2.i.e;
                        if (r10.equals(r72) && e2.d.m(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r82 = w3.n.a(r10, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    b(xmlPullParser);
                    r82 = r82;
                }
            } while (!e2.d.l(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r72 != null ? new b2.n(r72, str3, "video/mp4", r82) : null);
        }
        str = null;
        r72 = null;
        str2 = r72;
        str3 = str2;
        r82 = str2;
        do {
            xmlPullParser.next();
            if (e2.d.m(xmlPullParser, "clearkey:Laurl")) {
            }
            str3 = xmlPullParser.getText();
            r82 = r82;
        } while (!e2.d.l(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r72 != null ? new b2.n(r72, str3, "video/mp4", r82) : null);
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
        } while (!e2.d.l(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j3) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j3;
        }
        Matcher matcher = d0.e.matcher(attributeValue);
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
    /* JADX WARN: Code restructure failed: missing block: B:377:0x09ca, code lost:
    
        if ("audio/eac3-joc".equals(r3) != false) goto L343;
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x1026 A[LOOP:5: B:181:0x0415->B:190:0x1026, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0ea3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0cd2 A[LOOP:11: B:349:0x06b0->B:358:0x0cd2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0904 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x1421 A[LOOP:1: B:35:0x00d3->B:43:0x1421, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x13ed A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c k(XmlPullParser xmlPullParser, Uri uri) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        long j3;
        long j10;
        long j11;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str;
        String str2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long j12;
        String str3;
        String str4;
        String str5;
        long j13;
        long j14;
        ArrayList arrayList7;
        String str6;
        ByteArrayOutputStream byteArrayOutputStream;
        String str7;
        long j15;
        String str8;
        String str9;
        long j16;
        String str10;
        ByteArrayOutputStream byteArrayOutputStream2;
        String str11;
        ArrayList arrayList8;
        long j17;
        ArrayList arrayList9;
        String str12;
        String str13;
        String str14;
        String str15;
        float f7;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        ArrayList arrayList10;
        ArrayList arrayList11;
        long j18;
        ArrayList arrayList12;
        ArrayList arrayList13;
        String str21;
        long j19;
        String str22;
        int i10;
        String str23;
        ArrayList arrayList14;
        ArrayList arrayList15;
        long j20;
        ArrayList arrayList16;
        String str24;
        long j21;
        String str25;
        String str26;
        int i11;
        String str27;
        String str28;
        ArrayList arrayList17;
        int parseInt;
        String str29;
        String str30;
        float f10;
        ArrayList arrayList18;
        String str31;
        String str32;
        ArrayList arrayList19;
        String str33;
        String str34;
        int i12;
        String str35;
        ArrayList arrayList20;
        int i13;
        String str36;
        String str37;
        int i14;
        ArrayList arrayList21;
        float f11;
        ArrayList arrayList22;
        String str38;
        ArrayList arrayList23;
        long j22;
        ArrayList arrayList24;
        long j23;
        String str39;
        String str40;
        String str41;
        ArrayList arrayList25;
        long j24;
        ArrayList arrayList26;
        String str42;
        String str43;
        int i15;
        String str44;
        String str45;
        String d10;
        ArrayList arrayList27;
        String str46;
        Pair pair;
        int parseInt2;
        String str47;
        char c10;
        int i16;
        String str48;
        String str49;
        long j25;
        m kVar;
        String str50;
        long j26;
        String[] strArr = new String[0];
        String str51 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(",");
        }
        int length = strArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                z10 = false;
                break;
            }
            if (strArr[i17].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z10 = true;
                break;
            }
            i17++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long j27 = -9223372036854775807L;
        long T = attributeValue2 == null ? -9223372036854775807L : d0.T(attributeValue2);
        long i18 = i(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long i19 = i(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, TeXSymbolParser.TYPE_ATTR));
        long i20 = equals ? i(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long i21 = equals ? i(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long i22 = equals ? i(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long T2 = attributeValue3 == null ? -9223372036854775807L : d0.T(attributeValue3);
        long j28 = equals ? 0L : -9223372036854775807L;
        ArrayList p5 = e9.q.p(new b(z10 ? 1 : TLObject.FLAG_31, 1, uri.toString(), uri.toString()));
        ArrayList arrayList28 = new ArrayList();
        ArrayList arrayList29 = new ArrayList();
        long j29 = equals ? -9223372036854775807L : 0L;
        i iVar = null;
        u uVar = null;
        Uri uri2 = null;
        b2.d0 d0Var = null;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            xmlPullParser.next();
            String str52 = "BaseURL";
            if (e2.d.m(xmlPullParser, "BaseURL")) {
                if (!z12) {
                    j28 = d(xmlPullParser, j28);
                    z12 = true;
                }
                arrayList29.addAll(e(xmlPullParser, p5, z10));
                arrayList = p5;
                j3 = j27;
                arrayList2 = arrayList29;
                z11 = z10;
                arrayList3 = arrayList28;
            } else {
                char c11 = 1;
                long j30 = j27;
                String str53 = "lang";
                if (e2.d.m(xmlPullParser, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(str51, "moreInformationURL");
                    String str54 = attributeValue4 == null ? str51 : attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str51, "lang");
                    String str55 = attributeValue5 == null ? str51 : attributeValue5;
                    String str56 = str51;
                    String str57 = str56;
                    String str58 = str57;
                    while (true) {
                        xmlPullParser.next();
                        if (e2.d.m(xmlPullParser, "Title")) {
                            str56 = xmlPullParser.nextText();
                        } else if (e2.d.m(xmlPullParser, "Source")) {
                            str57 = xmlPullParser.nextText();
                        } else if (e2.d.m(xmlPullParser, "Copyright")) {
                            str58 = xmlPullParser.nextText();
                        } else {
                            b(xmlPullParser);
                        }
                        String str59 = str56;
                        String str60 = str57;
                        String str61 = str58;
                        if (e2.d.l(xmlPullParser, "ProgramInformation")) {
                            i iVar2 = new i(str59, str60, str61, str54, str55);
                            arrayList = p5;
                            arrayList2 = arrayList29;
                            z11 = z10;
                            arrayList3 = arrayList28;
                            j3 = j30;
                            iVar = iVar2;
                        } else {
                            str56 = str59;
                            str57 = str60;
                            str58 = str61;
                        }
                    }
                } else {
                    String str62 = "schemeIdUri";
                    if (e2.d.m(xmlPullParser, "UTCTiming")) {
                        arrayList = p5;
                        arrayList2 = arrayList29;
                        uVar = new u(0, xmlPullParser.getAttributeValue(str51, "schemeIdUri"), xmlPullParser.getAttributeValue(str51, "value"));
                    } else if (e2.d.m(xmlPullParser, "Location")) {
                        uri2 = e2.a.m(uri.toString(), xmlPullParser.nextText());
                        arrayList = p5;
                        arrayList2 = arrayList29;
                    } else {
                        if (e2.d.m(xmlPullParser, "ServiceDescription")) {
                            long j31 = j30;
                            long j32 = j31;
                            long j33 = j32;
                            float f12 = -3.4028235E38f;
                            float f13 = -3.4028235E38f;
                            while (true) {
                                xmlPullParser.next();
                                if (e2.d.m(xmlPullParser, "Latency")) {
                                    arrayList = p5;
                                    String attributeValue6 = xmlPullParser.getAttributeValue(null, "target");
                                    j31 = attributeValue6 == null ? j30 : Long.parseLong(attributeValue6);
                                    String attributeValue7 = xmlPullParser.getAttributeValue(null, "min");
                                    j32 = attributeValue7 == null ? j30 : Long.parseLong(attributeValue7);
                                    String attributeValue8 = xmlPullParser.getAttributeValue(null, "max");
                                    j33 = attributeValue8 == null ? j30 : Long.parseLong(attributeValue8);
                                } else {
                                    arrayList = p5;
                                    if (e2.d.m(xmlPullParser, "PlaybackRate")) {
                                        String attributeValue9 = xmlPullParser.getAttributeValue(null, "min");
                                        f12 = attributeValue9 == null ? -3.4028235E38f : Float.parseFloat(attributeValue9);
                                        String attributeValue10 = xmlPullParser.getAttributeValue(null, "max");
                                        f13 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                                    }
                                }
                                long j34 = j31;
                                long j35 = j28;
                                long j36 = j32;
                                long j37 = i21;
                                long j38 = j33;
                                if (e2.d.l(xmlPullParser, "ServiceDescription")) {
                                    b2.d0 d0Var2 = new b2.d0();
                                    d0Var2.a = j34;
                                    d0Var2.b = j36;
                                    d0Var2.c = j38;
                                    d0Var2.d = f12;
                                    d0Var2.e = f13;
                                    d0Var = d0Var2;
                                    z11 = z10;
                                    j3 = j30;
                                    j28 = j35;
                                    j10 = j37;
                                    arrayList2 = arrayList29;
                                    arrayList3 = arrayList28;
                                } else {
                                    j33 = j38;
                                    i21 = j37;
                                    p5 = arrayList;
                                    j32 = j36;
                                    j28 = j35;
                                    j31 = j34;
                                }
                            }
                        } else {
                            arrayList = p5;
                            long j39 = j28;
                            long j40 = i21;
                            if (!e2.d.m(xmlPullParser, "Period") || z13) {
                                z11 = z10;
                                j3 = j30;
                                j10 = j40;
                                j11 = j39;
                                arrayList2 = arrayList29;
                                arrayList3 = arrayList28;
                                b(xmlPullParser);
                                j29 = j29;
                            } else {
                                ArrayList arrayList30 = !arrayList29.isEmpty() ? arrayList29 : arrayList;
                                String str63 = "id";
                                String attributeValue11 = xmlPullParser.getAttributeValue(null, "id");
                                long i23 = i(xmlPullParser, "start", j29);
                                String str64 = "duration";
                                long j41 = T != j30 ? T + i23 : j30;
                                long i24 = i(xmlPullParser, "duration", j30);
                                ArrayList arrayList31 = new ArrayList();
                                ArrayList arrayList32 = new ArrayList();
                                ArrayList arrayList33 = new ArrayList();
                                long j42 = j30;
                                String str65 = "value";
                                String str66 = "Period";
                                long j43 = j39;
                                boolean z14 = false;
                                s sVar = null;
                                while (true) {
                                    xmlPullParser.next();
                                    if (e2.d.m(xmlPullParser, str52)) {
                                        if (!z14) {
                                            j43 = d(xmlPullParser, j43);
                                            z14 = true;
                                        }
                                        arrayList33.addAll(e(xmlPullParser, arrayList30, z10));
                                        arrayList4 = arrayList30;
                                        str = str53;
                                        str5 = str63;
                                        str2 = str52;
                                        str4 = str64;
                                        arrayList5 = arrayList33;
                                        z11 = z10;
                                        j13 = i24;
                                        j10 = j40;
                                        j14 = j41;
                                        arrayList7 = arrayList31;
                                        arrayList6 = arrayList32;
                                        str6 = str66;
                                        j3 = -9223372036854775807L;
                                        j12 = j29;
                                        str3 = str62;
                                        j11 = j39;
                                        arrayList2 = arrayList29;
                                    } else {
                                        long j44 = j43;
                                        String str67 = str62;
                                        if (e2.d.m(xmlPullParser, "AdaptationSet")) {
                                            if (arrayList33.isEmpty()) {
                                                arrayList8 = arrayList30;
                                                arrayList4 = arrayList8;
                                            } else {
                                                arrayList4 = arrayList30;
                                                arrayList8 = arrayList33;
                                            }
                                            String attributeValue12 = xmlPullParser.getAttributeValue(null, str63);
                                            long parseLong = attributeValue12 == null ? -1L : Long.parseLong(attributeValue12);
                                            int g10 = g(xmlPullParser);
                                            String str68 = "SegmentTemplate";
                                            String attributeValue13 = xmlPullParser.getAttributeValue(null, "mimeType");
                                            String str69 = "AdaptationSet";
                                            ArrayList arrayList34 = arrayList29;
                                            String attributeValue14 = xmlPullParser.getAttributeValue(null, "codecs");
                                            long j45 = j29;
                                            String attributeValue15 = xmlPullParser.getAttributeValue(null, "scte214:supplementalCodecs");
                                            xmlPullParser.getAttributeValue(null, "scte214:supplementalProfiles");
                                            String str70 = str64;
                                            String attributeValue16 = xmlPullParser.getAttributeValue(null, "width");
                                            int parseInt3 = attributeValue16 == null ? -1 : Integer.parseInt(attributeValue16);
                                            arrayList5 = arrayList33;
                                            String attributeValue17 = xmlPullParser.getAttributeValue(null, "height");
                                            int parseInt4 = attributeValue17 == null ? -1 : Integer.parseInt(attributeValue17);
                                            float j46 = j(xmlPullParser, -1.0f);
                                            String str71 = "SegmentList";
                                            String str72 = "SegmentBase";
                                            String attributeValue18 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                            int parseInt5 = attributeValue18 == null ? -1 : Integer.parseInt(attributeValue18);
                                            String attributeValue19 = xmlPullParser.getAttributeValue(null, str53);
                                            String str73 = "audioSamplingRate";
                                            String attributeValue20 = xmlPullParser.getAttributeValue(null, "label");
                                            ArrayList arrayList35 = new ArrayList();
                                            String str74 = attributeValue20;
                                            ArrayList arrayList36 = new ArrayList();
                                            ArrayList arrayList37 = new ArrayList();
                                            ArrayList arrayList38 = new ArrayList();
                                            float f14 = j46;
                                            ArrayList arrayList39 = new ArrayList();
                                            String str75 = "height";
                                            ArrayList arrayList40 = new ArrayList();
                                            String str76 = "width";
                                            ArrayList arrayList41 = new ArrayList();
                                            String str77 = "scte214:supplementalProfiles";
                                            ArrayList arrayList42 = new ArrayList();
                                            ArrayList arrayList43 = new ArrayList();
                                            String str78 = "codecs";
                                            String str79 = "scte214:supplementalCodecs";
                                            String str80 = "mimeType";
                                            ArrayList arrayList44 = arrayList38;
                                            s sVar2 = sVar;
                                            long j47 = j42;
                                            long j48 = j44;
                                            int i25 = g10;
                                            String str81 = attributeValue19;
                                            boolean z15 = false;
                                            String str82 = null;
                                            int i26 = -1;
                                            while (true) {
                                                xmlPullParser.next();
                                                if (e2.d.m(xmlPullParser, str52)) {
                                                    if (!z15) {
                                                        j48 = d(xmlPullParser, j48);
                                                        z15 = true;
                                                    }
                                                    j17 = j48;
                                                    arrayList43.addAll(e(xmlPullParser, arrayList8, z10));
                                                } else {
                                                    j17 = j48;
                                                    if (e2.d.m(xmlPullParser, "ContentProtection")) {
                                                        Pair f15 = f(xmlPullParser);
                                                        Object obj = f15.first;
                                                        if (obj != null) {
                                                            str82 = (String) obj;
                                                        }
                                                        Object obj2 = f15.second;
                                                        if (obj2 != null) {
                                                            arrayList36.add((b2.n) obj2);
                                                        }
                                                    } else if (e2.d.m(xmlPullParser, "ContentComponent")) {
                                                        String attributeValue21 = xmlPullParser.getAttributeValue(null, str53);
                                                        if (str81 == null) {
                                                            str81 = attributeValue21;
                                                        } else if (attributeValue21 != null) {
                                                            e2.d.g(str81.equals(attributeValue21));
                                                        }
                                                        int g11 = g(xmlPullParser);
                                                        if (i25 == -1) {
                                                            i25 = g11;
                                                        } else if (g11 != -1) {
                                                            e2.d.g(i25 == g11);
                                                        }
                                                    } else {
                                                        if (e2.d.m(xmlPullParser, "Role")) {
                                                            arrayList39.add(h(xmlPullParser, "Role"));
                                                            str5 = str63;
                                                            str12 = str81;
                                                            i10 = i25;
                                                            str2 = str52;
                                                            z11 = z10;
                                                            arrayList9 = arrayList36;
                                                            arrayList7 = arrayList31;
                                                            arrayList6 = arrayList32;
                                                            str22 = str68;
                                                            str13 = str69;
                                                            str24 = attributeValue15;
                                                            str14 = str70;
                                                            str21 = str71;
                                                            str23 = str72;
                                                            str15 = str73;
                                                            arrayList16 = arrayList37;
                                                            f7 = f14;
                                                            str16 = str77;
                                                            arrayList14 = arrayList42;
                                                            str17 = str79;
                                                            str18 = str78;
                                                            str19 = str80;
                                                            arrayList10 = arrayList43;
                                                            arrayList15 = arrayList41;
                                                            j20 = i24;
                                                            j12 = j45;
                                                            arrayList13 = arrayList40;
                                                            str25 = str53;
                                                        } else {
                                                            String str83 = "AudioChannelConfiguration";
                                                            if (e2.d.m(xmlPullParser, "AudioChannelConfiguration")) {
                                                                str5 = str63;
                                                                str12 = str81;
                                                                str2 = str52;
                                                                z11 = z10;
                                                                arrayList9 = arrayList36;
                                                                i26 = c(xmlPullParser, attributeValue14);
                                                                arrayList7 = arrayList31;
                                                                arrayList6 = arrayList32;
                                                                str22 = str68;
                                                                str24 = attributeValue15;
                                                                str14 = str70;
                                                                str21 = str71;
                                                                str23 = str72;
                                                                str15 = str73;
                                                                arrayList16 = arrayList37;
                                                                f7 = f14;
                                                                str16 = str77;
                                                                arrayList14 = arrayList42;
                                                                str17 = str79;
                                                                str18 = str78;
                                                                str19 = str80;
                                                                arrayList10 = arrayList43;
                                                                arrayList15 = arrayList41;
                                                                j20 = i24;
                                                                j12 = j45;
                                                                arrayList13 = arrayList40;
                                                                str25 = str53;
                                                                str27 = str69;
                                                                i11 = i25;
                                                                arrayList12 = arrayList8;
                                                                j11 = j39;
                                                                j14 = j41;
                                                                arrayList2 = arrayList34;
                                                                str20 = attributeValue14;
                                                                arrayList11 = arrayList39;
                                                                j18 = j40;
                                                                if (e2.d.l(xmlPullParser, str27)) {
                                                                    long j49 = j18;
                                                                    c11 = 1;
                                                                    str53 = str25;
                                                                    str72 = str23;
                                                                    str68 = str22;
                                                                    arrayList34 = arrayList2;
                                                                    j39 = j11;
                                                                    attributeValue14 = str20;
                                                                    arrayList39 = arrayList11;
                                                                    z10 = z11;
                                                                    i25 = i11;
                                                                    arrayList41 = arrayList15;
                                                                    arrayList43 = arrayList10;
                                                                    str78 = str18;
                                                                    arrayList36 = arrayList9;
                                                                    str80 = str19;
                                                                    str73 = str15;
                                                                    arrayList42 = arrayList14;
                                                                    str70 = str14;
                                                                    str63 = str5;
                                                                    str69 = str27;
                                                                    j41 = j14;
                                                                    str71 = str21;
                                                                    arrayList8 = arrayList12;
                                                                    attributeValue15 = str24;
                                                                    arrayList40 = arrayList13;
                                                                    j40 = j49;
                                                                    str79 = str17;
                                                                    j48 = j17;
                                                                    str77 = str16;
                                                                    f14 = f7;
                                                                    str81 = str12;
                                                                    arrayList37 = arrayList16;
                                                                    j45 = j12;
                                                                    i24 = j20;
                                                                    str52 = str2;
                                                                    arrayList31 = arrayList7;
                                                                    arrayList32 = arrayList6;
                                                                } else {
                                                                    ArrayList arrayList45 = new ArrayList(arrayList14.size());
                                                                    int i27 = 0;
                                                                    while (i27 < arrayList14.size()) {
                                                                        ArrayList arrayList46 = arrayList14;
                                                                        d dVar = (d) arrayList46.get(i27);
                                                                        b2.r a2 = dVar.a.a();
                                                                        if (str74 == null || !arrayList35.isEmpty()) {
                                                                            str48 = str74;
                                                                            a2.c = i0.v(arrayList35);
                                                                        } else {
                                                                            str48 = str74;
                                                                            a2.b = str48;
                                                                        }
                                                                        String str84 = dVar.d;
                                                                        if (str84 == null) {
                                                                            str84 = str82;
                                                                        }
                                                                        ArrayList arrayList47 = dVar.e;
                                                                        ArrayList arrayList48 = arrayList9;
                                                                        arrayList47.addAll(arrayList48);
                                                                        long j50 = j14;
                                                                        if (arrayList47.isEmpty()) {
                                                                            str74 = str48;
                                                                            str49 = str25;
                                                                            j25 = j18;
                                                                        } else {
                                                                            int i28 = 0;
                                                                            while (true) {
                                                                                if (i28 < arrayList47.size()) {
                                                                                    b2.n nVar = (b2.n) arrayList47.get(i28);
                                                                                    str74 = str48;
                                                                                    if (!b2.i.c.equals(nVar.b) || (str50 = nVar.c) == null) {
                                                                                        i28++;
                                                                                        str48 = str74;
                                                                                    } else {
                                                                                        arrayList47.remove(i28);
                                                                                    }
                                                                                } else {
                                                                                    str74 = str48;
                                                                                    str50 = null;
                                                                                }
                                                                            }
                                                                            if (str50 != null) {
                                                                                int i29 = 0;
                                                                                while (i29 < arrayList47.size()) {
                                                                                    b2.n nVar2 = (b2.n) arrayList47.get(i29);
                                                                                    String str85 = str25;
                                                                                    if (b2.i.b.equals(nVar2.b) && nVar2.c == null) {
                                                                                        j26 = j18;
                                                                                        arrayList47.set(i29, new b2.n(b2.i.c, str50, nVar2.d, nVar2.e));
                                                                                    } else {
                                                                                        j26 = j18;
                                                                                    }
                                                                                    i29++;
                                                                                    j18 = j26;
                                                                                    str25 = str85;
                                                                                }
                                                                            }
                                                                            str49 = str25;
                                                                            j25 = j18;
                                                                            for (int size = arrayList47.size() - 1; size >= 0; size--) {
                                                                                b2.n nVar3 = (b2.n) arrayList47.get(size);
                                                                                if (nVar3.e == null) {
                                                                                    int i30 = 0;
                                                                                    while (true) {
                                                                                        if (i30 < arrayList47.size()) {
                                                                                            b2.n nVar4 = (b2.n) arrayList47.get(i30);
                                                                                            if (nVar4.e != null && nVar3.e == null && nVar4.a(nVar3.b)) {
                                                                                                arrayList47.remove(size);
                                                                                            } else {
                                                                                                i30++;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            a2.u = new b2.o(str84, arrayList47);
                                                                        }
                                                                        ArrayList arrayList49 = dVar.f;
                                                                        arrayList49.addAll(arrayList16);
                                                                        b2.s sVar3 = new b2.s(a2);
                                                                        i0 i0Var = dVar.b;
                                                                        s sVar4 = dVar.c;
                                                                        ArrayList arrayList50 = dVar.g;
                                                                        ArrayList arrayList51 = dVar.h;
                                                                        if (sVar4 instanceof r) {
                                                                            kVar = new l(sVar3, i0Var, (r) sVar4, arrayList49, arrayList50, arrayList51);
                                                                        } else {
                                                                            if (!(sVar4 instanceof n)) {
                                                                                throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                            }
                                                                            kVar = new k(sVar3, i0Var, (n) sVar4, arrayList49, arrayList50, arrayList51);
                                                                        }
                                                                        arrayList45.add(kVar);
                                                                        i27++;
                                                                        arrayList9 = arrayList48;
                                                                        j18 = j25;
                                                                        arrayList14 = arrayList46;
                                                                        str25 = str49;
                                                                        j14 = j50;
                                                                    }
                                                                    str = str25;
                                                                    c11 = 1;
                                                                    arrayList7.add(new a(parseLong, i11, arrayList45, arrayList44, arrayList13, arrayList15));
                                                                    j13 = j20;
                                                                    str3 = str67;
                                                                    j10 = j18;
                                                                    str4 = str14;
                                                                }
                                                            } else {
                                                                String str86 = str53;
                                                                if (e2.d.m(xmlPullParser, "Accessibility")) {
                                                                    arrayList44.add(h(xmlPullParser, "Accessibility"));
                                                                } else if (e2.d.m(xmlPullParser, "EssentialProperty")) {
                                                                    arrayList40.add(h(xmlPullParser, "EssentialProperty"));
                                                                } else {
                                                                    arrayList9 = arrayList36;
                                                                    if (e2.d.m(xmlPullParser, "SupplementalProperty")) {
                                                                        arrayList41.add(h(xmlPullParser, "SupplementalProperty"));
                                                                        str5 = str63;
                                                                        str12 = str81;
                                                                        i10 = i25;
                                                                        str2 = str52;
                                                                        z11 = z10;
                                                                        arrayList7 = arrayList31;
                                                                        arrayList6 = arrayList32;
                                                                        str22 = str68;
                                                                        str13 = str69;
                                                                        str24 = attributeValue15;
                                                                        str14 = str70;
                                                                        str21 = str71;
                                                                        str23 = str72;
                                                                        str15 = str73;
                                                                        arrayList16 = arrayList37;
                                                                        f7 = f14;
                                                                        str16 = str77;
                                                                        arrayList14 = arrayList42;
                                                                        str17 = str79;
                                                                        str18 = str78;
                                                                        str19 = str80;
                                                                        arrayList10 = arrayList43;
                                                                        arrayList15 = arrayList41;
                                                                        j20 = i24;
                                                                        j12 = j45;
                                                                        str25 = str86;
                                                                        arrayList13 = arrayList40;
                                                                    } else {
                                                                        String str87 = "SupplementalProperty";
                                                                        String str88 = "Representation";
                                                                        if (e2.d.m(xmlPullParser, "Representation")) {
                                                                            if (arrayList43.isEmpty()) {
                                                                                str28 = "InbandEventStream";
                                                                                arrayList17 = arrayList8;
                                                                            } else {
                                                                                str28 = "InbandEventStream";
                                                                                arrayList17 = arrayList43;
                                                                            }
                                                                            String str89 = "EssentialProperty";
                                                                            String str90 = "ContentProtection";
                                                                            String attributeValue22 = xmlPullParser.getAttributeValue(null, str63);
                                                                            String str91 = str63;
                                                                            String attributeValue23 = xmlPullParser.getAttributeValue(null, "bandwidth");
                                                                            if (attributeValue23 == null) {
                                                                                String str92 = str80;
                                                                                str29 = attributeValue22;
                                                                                str30 = str92;
                                                                                parseInt = -1;
                                                                            } else {
                                                                                parseInt = Integer.parseInt(attributeValue23);
                                                                                String str93 = str80;
                                                                                str29 = attributeValue22;
                                                                                str30 = str93;
                                                                            }
                                                                            String attributeValue24 = xmlPullParser.getAttributeValue(null, str30);
                                                                            String str94 = str78;
                                                                            int i31 = parseInt;
                                                                            String str95 = attributeValue24 == null ? attributeValue13 : attributeValue24;
                                                                            String attributeValue25 = xmlPullParser.getAttributeValue(null, str94);
                                                                            String str96 = str79;
                                                                            str18 = str94;
                                                                            str19 = str30;
                                                                            String str97 = attributeValue25 == null ? attributeValue14 : attributeValue25;
                                                                            String attributeValue26 = xmlPullParser.getAttributeValue(null, str96);
                                                                            String str98 = str77;
                                                                            str17 = str96;
                                                                            String str99 = attributeValue26 == null ? attributeValue15 : attributeValue26;
                                                                            xmlPullParser.getAttributeValue(null, str98);
                                                                            str16 = str98;
                                                                            String str100 = str76;
                                                                            String attributeValue27 = xmlPullParser.getAttributeValue(null, str100);
                                                                            int parseInt6 = attributeValue27 == null ? parseInt3 : Integer.parseInt(attributeValue27);
                                                                            str76 = str100;
                                                                            String str101 = str75;
                                                                            String attributeValue28 = xmlPullParser.getAttributeValue(null, str101);
                                                                            int parseInt7 = attributeValue28 == null ? parseInt4 : Integer.parseInt(attributeValue28);
                                                                            str75 = str101;
                                                                            float f16 = f14;
                                                                            String str102 = str81;
                                                                            float j51 = j(xmlPullParser, f16);
                                                                            f7 = f16;
                                                                            String str103 = str73;
                                                                            String attributeValue29 = xmlPullParser.getAttributeValue(null, str103);
                                                                            int parseInt8 = attributeValue29 == null ? parseInt5 : Integer.parseInt(attributeValue29);
                                                                            ArrayList arrayList52 = new ArrayList();
                                                                            ArrayList arrayList53 = new ArrayList();
                                                                            ArrayList arrayList54 = new ArrayList(arrayList40);
                                                                            ArrayList arrayList55 = arrayList40;
                                                                            ArrayList arrayList56 = new ArrayList(arrayList41);
                                                                            ArrayList arrayList57 = new ArrayList();
                                                                            ArrayList arrayList58 = arrayList54;
                                                                            str15 = str103;
                                                                            String str104 = attributeValue14;
                                                                            int i32 = i25;
                                                                            s sVar5 = sVar2;
                                                                            long j52 = j47;
                                                                            int i33 = i26;
                                                                            long j53 = j17;
                                                                            boolean z16 = false;
                                                                            String str105 = null;
                                                                            while (true) {
                                                                                xmlPullParser.next();
                                                                                if (e2.d.m(xmlPullParser, str52)) {
                                                                                    if (!z16) {
                                                                                        j53 = d(xmlPullParser, j53);
                                                                                        z16 = true;
                                                                                    }
                                                                                    f10 = j51;
                                                                                    arrayList57.addAll(e(xmlPullParser, arrayList17, z10));
                                                                                } else {
                                                                                    f10 = j51;
                                                                                    if (e2.d.m(xmlPullParser, str83)) {
                                                                                        i33 = c(xmlPullParser, str97);
                                                                                    } else {
                                                                                        String str106 = str72;
                                                                                        if (e2.d.m(xmlPullParser, str106)) {
                                                                                            arrayList18 = arrayList57;
                                                                                            sVar5 = o(xmlPullParser, (r) sVar5);
                                                                                            str32 = str106;
                                                                                            str2 = str52;
                                                                                            z11 = z10;
                                                                                            arrayList19 = arrayList17;
                                                                                            str33 = str83;
                                                                                            arrayList7 = arrayList31;
                                                                                            arrayList6 = arrayList32;
                                                                                            str39 = str68;
                                                                                            str34 = str69;
                                                                                            str14 = str70;
                                                                                            str31 = str71;
                                                                                            i12 = parseInt8;
                                                                                            str35 = str102;
                                                                                            arrayList20 = arrayList42;
                                                                                            i13 = i31;
                                                                                            str36 = str86;
                                                                                            str41 = str87;
                                                                                            str37 = str89;
                                                                                            str5 = str91;
                                                                                            i14 = i32;
                                                                                            arrayList21 = arrayList52;
                                                                                            i15 = i33;
                                                                                            f11 = f10;
                                                                                            arrayList10 = arrayList43;
                                                                                            arrayList22 = arrayList41;
                                                                                            str38 = str97;
                                                                                            str40 = str28;
                                                                                            str43 = str105;
                                                                                            arrayList23 = arrayList53;
                                                                                            arrayList25 = arrayList58;
                                                                                            j24 = j52;
                                                                                            str42 = str88;
                                                                                            arrayList26 = arrayList56;
                                                                                            arrayList12 = arrayList8;
                                                                                            j11 = j39;
                                                                                            j22 = j41;
                                                                                            arrayList2 = arrayList34;
                                                                                            str20 = str104;
                                                                                            arrayList24 = arrayList39;
                                                                                            j23 = i24;
                                                                                            j18 = j40;
                                                                                            j12 = j45;
                                                                                            arrayList13 = arrayList55;
                                                                                            if (e2.d.l(xmlPullParser, str42)) {
                                                                                                if (r0.i(str95)) {
                                                                                                    if (str38 != null) {
                                                                                                        for (String str107 : d0.b0(str38)) {
                                                                                                            d10 = r0.d(str107);
                                                                                                            if (d10 != null && r0.i(d10)) {
                                                                                                                str44 = d10;
                                                                                                                str45 = str95;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    d10 = null;
                                                                                                    str44 = d10;
                                                                                                    str45 = str95;
                                                                                                } else if (r0.m(str95)) {
                                                                                                    if (str38 != null) {
                                                                                                        for (String str108 : d0.b0(str38)) {
                                                                                                            d10 = r0.d(str108);
                                                                                                            if (d10 != null && r0.m(d10)) {
                                                                                                                str44 = d10;
                                                                                                                str45 = str95;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    d10 = null;
                                                                                                    str44 = d10;
                                                                                                    str45 = str95;
                                                                                                } else if (r0.l(str95) || r0.k(str95)) {
                                                                                                    str44 = str95;
                                                                                                    str45 = str44;
                                                                                                } else {
                                                                                                    str45 = str95;
                                                                                                    if ("application/mp4".equals(str45)) {
                                                                                                        str44 = r0.d(str38);
                                                                                                        if ("text/vtt".equals(str44)) {
                                                                                                            str44 = "application/x-mp4-vtt";
                                                                                                        }
                                                                                                    } else {
                                                                                                        str44 = null;
                                                                                                    }
                                                                                                }
                                                                                                if ("audio/eac3".equals(str44)) {
                                                                                                    int i34 = 0;
                                                                                                    while (true) {
                                                                                                        str46 = "ec+3";
                                                                                                        if (i34 < arrayList26.size()) {
                                                                                                            f fVar = (f) arrayList26.get(i34);
                                                                                                            arrayList27 = arrayList26;
                                                                                                            String str109 = fVar.a;
                                                                                                            String str110 = fVar.b;
                                                                                                            int i35 = i34;
                                                                                                            if ((!"tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str109) || !"JOC".equals(str110)) && (!"tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str109) || !"ec+3".equals(str110))) {
                                                                                                                i34 = i35 + 1;
                                                                                                                arrayList26 = arrayList27;
                                                                                                            }
                                                                                                        } else {
                                                                                                            arrayList27 = arrayList26;
                                                                                                            str44 = "audio/eac3";
                                                                                                        }
                                                                                                    }
                                                                                                    str44 = "audio/eac3-joc";
                                                                                                } else {
                                                                                                    arrayList27 = arrayList26;
                                                                                                }
                                                                                                str46 = str38;
                                                                                                String str111 = str99;
                                                                                                if (r0.j(str46, str111)) {
                                                                                                    str44 = "video/dolby-vision";
                                                                                                    str46 = str111 != null ? str111 : str46;
                                                                                                }
                                                                                                int i36 = 0;
                                                                                                int i37 = 0;
                                                                                                while (i36 < arrayList24.size()) {
                                                                                                    ArrayList arrayList59 = arrayList24;
                                                                                                    int i38 = i36;
                                                                                                    f fVar2 = (f) arrayList59.get(i36);
                                                                                                    long j54 = j22;
                                                                                                    if (r6.a("urn:mpeg:dash:role:2011", fVar2.a)) {
                                                                                                        String str112 = fVar2.b;
                                                                                                        i37 = ((str112 != null && (str112.equals("forced_subtitle") || str112.equals("forced-subtitle"))) ? 2 : 0) | i37;
                                                                                                    }
                                                                                                    i36 = i38 + 1;
                                                                                                    arrayList24 = arrayList59;
                                                                                                    j22 = j54;
                                                                                                }
                                                                                                long j55 = j22;
                                                                                                ArrayList arrayList60 = arrayList24;
                                                                                                int i39 = 0;
                                                                                                int i40 = 0;
                                                                                                while (i39 < arrayList60.size()) {
                                                                                                    f fVar3 = (f) arrayList60.get(i39);
                                                                                                    int i41 = i39;
                                                                                                    if (r6.a("urn:mpeg:dash:role:2011", fVar3.a)) {
                                                                                                        i40 = m(fVar3.b) | i40;
                                                                                                    }
                                                                                                    i39 = i41 + 1;
                                                                                                }
                                                                                                int i42 = i40;
                                                                                                int i43 = 0;
                                                                                                int i44 = 0;
                                                                                                while (i43 < arrayList44.size()) {
                                                                                                    ArrayList arrayList61 = arrayList44;
                                                                                                    int i45 = i43;
                                                                                                    f fVar4 = (f) arrayList61.get(i43);
                                                                                                    int i46 = i44;
                                                                                                    String str113 = fVar4.a;
                                                                                                    String str114 = str45;
                                                                                                    String str115 = fVar4.b;
                                                                                                    if (r6.a("urn:mpeg:dash:role:2011", str113)) {
                                                                                                        i16 = m(str115);
                                                                                                    } else if (r6.a("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar4.a)) {
                                                                                                        if (str115 != null) {
                                                                                                            switch (str115.hashCode()) {
                                                                                                                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                                                                                                    if (str115.equals("1")) {
                                                                                                                        c10 = 0;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c10 = 65535;
                                                                                                                    break;
                                                                                                                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                                                                                                    if (str115.equals("2")) {
                                                                                                                        c10 = 1;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c10 = 65535;
                                                                                                                    break;
                                                                                                                case 51:
                                                                                                                    if (str115.equals("3")) {
                                                                                                                        c10 = 2;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c10 = 65535;
                                                                                                                    break;
                                                                                                                case 52:
                                                                                                                    if (str115.equals("4")) {
                                                                                                                        c10 = 3;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c10 = 65535;
                                                                                                                    break;
                                                                                                                case 53:
                                                                                                                default:
                                                                                                                    c10 = 65535;
                                                                                                                    break;
                                                                                                                case 54:
                                                                                                                    if (str115.equals("6")) {
                                                                                                                        c10 = 4;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c10 = 65535;
                                                                                                                    break;
                                                                                                            }
                                                                                                            switch (c10) {
                                                                                                                case 0:
                                                                                                                    i16 = 512;
                                                                                                                    break;
                                                                                                                case 1:
                                                                                                                    i16 = 2048;
                                                                                                                    break;
                                                                                                                case 2:
                                                                                                                    i16 = 4;
                                                                                                                    break;
                                                                                                                case 3:
                                                                                                                    i16 = 8;
                                                                                                                    break;
                                                                                                                case 4:
                                                                                                                    i16 = 1;
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        i16 = 0;
                                                                                                    } else {
                                                                                                        i44 = i46;
                                                                                                        i43 = i45 + 1;
                                                                                                        arrayList44 = arrayList61;
                                                                                                        str45 = str114;
                                                                                                    }
                                                                                                    i44 = i46 | i16;
                                                                                                    i43 = i45 + 1;
                                                                                                    arrayList44 = arrayList61;
                                                                                                    str45 = str114;
                                                                                                }
                                                                                                String str116 = str45;
                                                                                                ArrayList arrayList62 = arrayList44;
                                                                                                int n10 = i42 | i44 | n(arrayList25) | n(arrayList27);
                                                                                                int i47 = 0;
                                                                                                while (true) {
                                                                                                    if (i47 < arrayList25.size()) {
                                                                                                        f fVar5 = (f) arrayList25.get(i47);
                                                                                                        int i48 = i47;
                                                                                                        if ((r6.a("http://dashif.org/thumbnail_tile", fVar5.a) || r6.a("http://dashif.org/guidelines/thumbnail_tile", fVar5.a)) && (str47 = fVar5.b) != null) {
                                                                                                            String str117 = d0.a;
                                                                                                            String[] split = str47.split("x", -1);
                                                                                                            if (split.length == 2) {
                                                                                                                try {
                                                                                                                    pair = Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[c11])));
                                                                                                                } catch (NumberFormatException unused) {
                                                                                                                    continue;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        i47 = i48 + 1;
                                                                                                    } else {
                                                                                                        pair = null;
                                                                                                    }
                                                                                                }
                                                                                                b2.r rVar = new b2.r();
                                                                                                rVar.a = str29;
                                                                                                rVar.p = r0.n(str116);
                                                                                                rVar.q = r0.n(str44);
                                                                                                rVar.j = str46;
                                                                                                rVar.i = i13;
                                                                                                rVar.e = i37;
                                                                                                rVar.f = n10;
                                                                                                String str118 = str35;
                                                                                                rVar.d = str118;
                                                                                                rVar.P = pair != null ? ((Integer) pair.first).intValue() : -1;
                                                                                                rVar.Q = pair != null ? ((Integer) pair.second).intValue() : -1;
                                                                                                if (r0.m(str44)) {
                                                                                                    rVar.x = parseInt6;
                                                                                                    rVar.y = parseInt7;
                                                                                                    rVar.B = f11;
                                                                                                } else {
                                                                                                    int i49 = parseInt6;
                                                                                                    int i50 = parseInt7;
                                                                                                    if (r0.i(str44)) {
                                                                                                        rVar.I = i15;
                                                                                                        rVar.J = i12;
                                                                                                    } else if (r0.l(str44)) {
                                                                                                        if ("application/cea-608".equals(str44)) {
                                                                                                            for (int i51 = 0; i51 < arrayList62.size(); i51++) {
                                                                                                                f fVar6 = (f) arrayList62.get(i51);
                                                                                                                String str119 = fVar6.a;
                                                                                                                String str120 = fVar6.b;
                                                                                                                if ("urn:scte:dash:cc:cea-608:2015".equals(str119) && str120 != null) {
                                                                                                                    Matcher matcher = c.matcher(str120);
                                                                                                                    if (matcher.matches()) {
                                                                                                                        parseInt2 = Integer.parseInt(matcher.group(1));
                                                                                                                        rVar.N = parseInt2;
                                                                                                                    } else {
                                                                                                                        e2.a.n("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str120));
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            parseInt2 = -1;
                                                                                                            rVar.N = parseInt2;
                                                                                                        } else {
                                                                                                            if ("application/cea-708".equals(str44)) {
                                                                                                                for (int i52 = 0; i52 < arrayList62.size(); i52++) {
                                                                                                                    f fVar7 = (f) arrayList62.get(i52);
                                                                                                                    String str121 = fVar7.a;
                                                                                                                    String str122 = fVar7.b;
                                                                                                                    if ("urn:scte:dash:cc:cea-708:2015".equals(str121) && str122 != null) {
                                                                                                                        Matcher matcher2 = d.matcher(str122);
                                                                                                                        if (matcher2.matches()) {
                                                                                                                            parseInt2 = Integer.parseInt(matcher2.group(1));
                                                                                                                            rVar.N = parseInt2;
                                                                                                                        } else {
                                                                                                                            e2.a.n("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str122));
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            parseInt2 = -1;
                                                                                                            rVar.N = parseInt2;
                                                                                                        }
                                                                                                        str6 = str66;
                                                                                                        j43 = j44;
                                                                                                    } else if (r0.k(str44)) {
                                                                                                        rVar.x = i49;
                                                                                                        rVar.y = i50;
                                                                                                    }
                                                                                                }
                                                                                                b2.s sVar6 = new b2.s(rVar);
                                                                                                d dVar2 = new d(sVar6, !arrayList18.isEmpty() ? arrayList18 : arrayList19, sVar5 != null ? sVar5 : new r(null, 1L, 0L, 0L, 0L), str43, arrayList21, arrayList23, arrayList25, arrayList27);
                                                                                                int h = r0.h(sVar6.r);
                                                                                                int i53 = i14;
                                                                                                if (i53 != -1) {
                                                                                                    if (h != -1) {
                                                                                                        e2.d.g(i53 == h);
                                                                                                    }
                                                                                                    h = i53;
                                                                                                }
                                                                                                ArrayList arrayList63 = arrayList20;
                                                                                                arrayList63.add(dVar2);
                                                                                                str12 = str118;
                                                                                                arrayList44 = arrayList62;
                                                                                                arrayList11 = arrayList60;
                                                                                                arrayList14 = arrayList63;
                                                                                                str24 = attributeValue15;
                                                                                                arrayList16 = arrayList37;
                                                                                                j14 = j55;
                                                                                                str25 = str36;
                                                                                                str27 = str34;
                                                                                                str21 = str31;
                                                                                                str23 = str32;
                                                                                                str22 = str39;
                                                                                                arrayList15 = arrayList22;
                                                                                                j20 = j23;
                                                                                                i11 = h;
                                                                                            } else {
                                                                                                arrayList56 = arrayList26;
                                                                                                i33 = i15;
                                                                                                str88 = str42;
                                                                                                arrayList58 = arrayList25;
                                                                                                arrayList52 = arrayList21;
                                                                                                arrayList53 = arrayList23;
                                                                                                str89 = str37;
                                                                                                str104 = str20;
                                                                                                arrayList41 = arrayList22;
                                                                                                str97 = str38;
                                                                                                str83 = str33;
                                                                                                arrayList55 = arrayList13;
                                                                                                arrayList57 = arrayList18;
                                                                                                j52 = j24;
                                                                                                str105 = str43;
                                                                                                arrayList17 = arrayList19;
                                                                                                i32 = i14;
                                                                                                arrayList31 = arrayList7;
                                                                                                arrayList32 = arrayList6;
                                                                                                arrayList42 = arrayList20;
                                                                                                str102 = str35;
                                                                                                i31 = i13;
                                                                                                parseInt8 = i12;
                                                                                                str86 = str36;
                                                                                                str70 = str14;
                                                                                                str72 = str32;
                                                                                                str91 = str5;
                                                                                                str68 = str39;
                                                                                                c11 = 1;
                                                                                                str28 = str40;
                                                                                                str87 = str41;
                                                                                                j45 = j12;
                                                                                                i24 = j23;
                                                                                                arrayList43 = arrayList10;
                                                                                                str52 = str2;
                                                                                                str69 = str34;
                                                                                                str71 = str31;
                                                                                                arrayList34 = arrayList2;
                                                                                                j39 = j11;
                                                                                                long j56 = j22;
                                                                                                arrayList8 = arrayList12;
                                                                                                j40 = j18;
                                                                                                arrayList39 = arrayList24;
                                                                                                z10 = z11;
                                                                                                j51 = f11;
                                                                                                j41 = j56;
                                                                                            }
                                                                                        } else {
                                                                                            arrayList18 = arrayList57;
                                                                                            String str123 = str71;
                                                                                            if (e2.d.m(xmlPullParser, str123)) {
                                                                                                arrayList10 = arrayList43;
                                                                                                str2 = str52;
                                                                                                long d11 = d(xmlPullParser, j52);
                                                                                                str31 = str123;
                                                                                                str32 = str106;
                                                                                                arrayList19 = arrayList17;
                                                                                                str33 = str83;
                                                                                                long j57 = j41;
                                                                                                arrayList7 = arrayList31;
                                                                                                arrayList6 = arrayList32;
                                                                                                str34 = str69;
                                                                                                str14 = str70;
                                                                                                i12 = parseInt8;
                                                                                                str35 = str102;
                                                                                                arrayList20 = arrayList42;
                                                                                                i13 = i31;
                                                                                                str36 = str86;
                                                                                                str37 = str89;
                                                                                                str5 = str91;
                                                                                                str20 = str104;
                                                                                                i14 = i32;
                                                                                                arrayList21 = arrayList52;
                                                                                                f11 = f10;
                                                                                                arrayList22 = arrayList41;
                                                                                                arrayList24 = arrayList39;
                                                                                                str38 = str97;
                                                                                                long j58 = j40;
                                                                                                arrayList23 = arrayList53;
                                                                                                arrayList12 = arrayList8;
                                                                                                long j59 = i24;
                                                                                                j11 = j39;
                                                                                                arrayList2 = arrayList34;
                                                                                                j12 = j45;
                                                                                                arrayList13 = arrayList55;
                                                                                                sVar5 = p(xmlPullParser, (o) sVar5, j57, j59, j53, d11, j58);
                                                                                                j23 = j59;
                                                                                                j22 = j57;
                                                                                                z11 = z10;
                                                                                                str39 = str68;
                                                                                                str42 = str88;
                                                                                                str43 = str105;
                                                                                                i15 = i33;
                                                                                                arrayList26 = arrayList56;
                                                                                                j18 = j58;
                                                                                                arrayList25 = arrayList58;
                                                                                                str41 = str87;
                                                                                                str40 = str28;
                                                                                                j24 = d11;
                                                                                            } else {
                                                                                                str31 = str123;
                                                                                                str32 = str106;
                                                                                                arrayList10 = arrayList43;
                                                                                                str2 = str52;
                                                                                                arrayList19 = arrayList17;
                                                                                                str33 = str83;
                                                                                                arrayList7 = arrayList31;
                                                                                                arrayList6 = arrayList32;
                                                                                                String str124 = str68;
                                                                                                str34 = str69;
                                                                                                str14 = str70;
                                                                                                i12 = parseInt8;
                                                                                                str35 = str102;
                                                                                                arrayList20 = arrayList42;
                                                                                                i13 = i31;
                                                                                                str36 = str86;
                                                                                                str37 = str89;
                                                                                                str5 = str91;
                                                                                                i14 = i32;
                                                                                                arrayList21 = arrayList52;
                                                                                                ArrayList arrayList64 = arrayList56;
                                                                                                f11 = f10;
                                                                                                arrayList22 = arrayList41;
                                                                                                str38 = str97;
                                                                                                arrayList23 = arrayList53;
                                                                                                long j60 = j40;
                                                                                                arrayList12 = arrayList8;
                                                                                                j11 = j39;
                                                                                                j22 = j41;
                                                                                                arrayList2 = arrayList34;
                                                                                                str20 = str104;
                                                                                                arrayList24 = arrayList39;
                                                                                                j23 = i24;
                                                                                                j12 = j45;
                                                                                                arrayList13 = arrayList55;
                                                                                                if (e2.d.m(xmlPullParser, str124)) {
                                                                                                    j18 = j60;
                                                                                                    long d12 = d(xmlPullParser, j52);
                                                                                                    str39 = str124;
                                                                                                    z11 = z10;
                                                                                                    long j61 = j53;
                                                                                                    sVar5 = q(xmlPullParser, (p) sVar5, arrayList22, j22, j23, j61, d12, j18);
                                                                                                    j53 = j61;
                                                                                                    j22 = j22;
                                                                                                    str40 = str28;
                                                                                                    str42 = str88;
                                                                                                    str43 = str105;
                                                                                                    i15 = i33;
                                                                                                    arrayList26 = arrayList64;
                                                                                                    str41 = str87;
                                                                                                    j24 = d12;
                                                                                                    arrayList25 = arrayList58;
                                                                                                } else {
                                                                                                    str39 = str124;
                                                                                                    z11 = z10;
                                                                                                    String str125 = str90;
                                                                                                    j18 = j60;
                                                                                                    if (e2.d.m(xmlPullParser, str125)) {
                                                                                                        Pair f17 = f(xmlPullParser);
                                                                                                        Object obj3 = f17.first;
                                                                                                        if (obj3 != null) {
                                                                                                            str105 = (String) obj3;
                                                                                                        }
                                                                                                        Object obj4 = f17.second;
                                                                                                        if (obj4 != null) {
                                                                                                            arrayList21.add((b2.n) obj4);
                                                                                                        }
                                                                                                        str90 = str125;
                                                                                                        str41 = str87;
                                                                                                        str40 = str28;
                                                                                                        str43 = str105;
                                                                                                        arrayList25 = arrayList58;
                                                                                                        i15 = i33;
                                                                                                        j24 = j52;
                                                                                                        str42 = str88;
                                                                                                        arrayList26 = arrayList64;
                                                                                                    } else {
                                                                                                        str40 = str28;
                                                                                                        if (e2.d.m(xmlPullParser, str40)) {
                                                                                                            arrayList23.add(h(xmlPullParser, str40));
                                                                                                            str90 = str125;
                                                                                                            str41 = str87;
                                                                                                            arrayList25 = arrayList58;
                                                                                                        } else if (e2.d.m(xmlPullParser, str37)) {
                                                                                                            arrayList25 = arrayList58;
                                                                                                            arrayList25.add(h(xmlPullParser, str37));
                                                                                                            str90 = str125;
                                                                                                            str41 = str87;
                                                                                                        } else {
                                                                                                            str41 = str87;
                                                                                                            arrayList25 = arrayList58;
                                                                                                            if (e2.d.m(xmlPullParser, str41)) {
                                                                                                                str90 = str125;
                                                                                                                j24 = j52;
                                                                                                                arrayList26 = arrayList64;
                                                                                                                arrayList26.add(h(xmlPullParser, str41));
                                                                                                            } else {
                                                                                                                str90 = str125;
                                                                                                                j24 = j52;
                                                                                                                arrayList26 = arrayList64;
                                                                                                                b(xmlPullParser);
                                                                                                            }
                                                                                                            str42 = str88;
                                                                                                            str43 = str105;
                                                                                                            i15 = i33;
                                                                                                        }
                                                                                                        j24 = j52;
                                                                                                        arrayList26 = arrayList64;
                                                                                                        str42 = str88;
                                                                                                        str43 = str105;
                                                                                                        i15 = i33;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if (e2.d.l(xmlPullParser, str42)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str2 = str52;
                                                                                z11 = z10;
                                                                                arrayList19 = arrayList17;
                                                                                str33 = str83;
                                                                                arrayList7 = arrayList31;
                                                                                arrayList6 = arrayList32;
                                                                                str39 = str68;
                                                                                str34 = str69;
                                                                                str14 = str70;
                                                                                str31 = str71;
                                                                                str32 = str72;
                                                                                i12 = parseInt8;
                                                                                str35 = str102;
                                                                                arrayList20 = arrayList42;
                                                                                i13 = i31;
                                                                                str36 = str86;
                                                                                str41 = str87;
                                                                                str37 = str89;
                                                                                str5 = str91;
                                                                                i14 = i32;
                                                                                arrayList21 = arrayList52;
                                                                                f11 = f10;
                                                                                arrayList18 = arrayList57;
                                                                                arrayList10 = arrayList43;
                                                                                arrayList22 = arrayList41;
                                                                                str38 = str97;
                                                                                str40 = str28;
                                                                                str43 = str105;
                                                                                arrayList23 = arrayList53;
                                                                                arrayList25 = arrayList58;
                                                                                i15 = i33;
                                                                                j24 = j52;
                                                                                str42 = str88;
                                                                                arrayList26 = arrayList56;
                                                                                arrayList12 = arrayList8;
                                                                                j11 = j39;
                                                                                j22 = j41;
                                                                                arrayList2 = arrayList34;
                                                                                str20 = str104;
                                                                                arrayList24 = arrayList39;
                                                                                j23 = i24;
                                                                                j18 = j40;
                                                                                j12 = j45;
                                                                                arrayList13 = arrayList55;
                                                                                if (e2.d.l(xmlPullParser, str42)) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str5 = str63;
                                                                            str12 = str81;
                                                                            str2 = str52;
                                                                            z11 = z10;
                                                                            long j62 = j41;
                                                                            arrayList7 = arrayList31;
                                                                            arrayList6 = arrayList32;
                                                                            String str126 = str68;
                                                                            str13 = str69;
                                                                            str14 = str70;
                                                                            String str127 = str71;
                                                                            str15 = str73;
                                                                            f7 = f14;
                                                                            str16 = str77;
                                                                            str17 = str79;
                                                                            str18 = str78;
                                                                            str19 = str80;
                                                                            ArrayList arrayList65 = arrayList44;
                                                                            str20 = attributeValue14;
                                                                            arrayList10 = arrayList43;
                                                                            ArrayList arrayList66 = arrayList41;
                                                                            arrayList11 = arrayList39;
                                                                            j18 = j40;
                                                                            ArrayList arrayList67 = arrayList42;
                                                                            arrayList12 = arrayList8;
                                                                            int i54 = i25;
                                                                            j11 = j39;
                                                                            arrayList2 = arrayList34;
                                                                            long j63 = i24;
                                                                            j12 = j45;
                                                                            arrayList13 = arrayList40;
                                                                            String str128 = str72;
                                                                            if (e2.d.m(xmlPullParser, str128)) {
                                                                                sVar2 = o(xmlPullParser, (r) sVar2);
                                                                                arrayList44 = arrayList65;
                                                                                arrayList14 = arrayList67;
                                                                                str24 = attributeValue15;
                                                                                arrayList16 = arrayList37;
                                                                                j14 = j62;
                                                                                str25 = str86;
                                                                                str21 = str127;
                                                                                str22 = str126;
                                                                                arrayList15 = arrayList66;
                                                                                j20 = j63;
                                                                                i11 = i54;
                                                                                str23 = str128;
                                                                            } else {
                                                                                str21 = str127;
                                                                                if (e2.d.m(xmlPullParser, str21)) {
                                                                                    long d13 = d(xmlPullParser, j47);
                                                                                    arrayList44 = arrayList65;
                                                                                    sVar2 = p(xmlPullParser, (o) sVar2, j62, j63, j17, d13, j18);
                                                                                    j18 = j18;
                                                                                    j14 = j62;
                                                                                    j47 = d13;
                                                                                    str24 = attributeValue15;
                                                                                    arrayList16 = arrayList37;
                                                                                    arrayList14 = arrayList67;
                                                                                    str25 = str86;
                                                                                    str27 = str13;
                                                                                    str22 = str126;
                                                                                    arrayList15 = arrayList66;
                                                                                    j20 = j63;
                                                                                    i11 = i54;
                                                                                    str23 = str128;
                                                                                } else {
                                                                                    arrayList44 = arrayList65;
                                                                                    long j64 = j47;
                                                                                    j19 = j17;
                                                                                    j14 = j62;
                                                                                    if (e2.d.m(xmlPullParser, str126)) {
                                                                                        long d14 = d(xmlPullParser, j64);
                                                                                        str22 = str126;
                                                                                        str23 = str128;
                                                                                        arrayList14 = arrayList67;
                                                                                        sVar2 = q(xmlPullParser, (p) sVar2, arrayList66, j14, j63, j19, d14, j18);
                                                                                        j20 = j63;
                                                                                        String str129 = attributeValue15;
                                                                                        arrayList15 = arrayList66;
                                                                                        j14 = j14;
                                                                                        str24 = str129;
                                                                                        j17 = j19;
                                                                                        j47 = d14;
                                                                                        arrayList16 = arrayList37;
                                                                                        i11 = i54;
                                                                                        str25 = str86;
                                                                                    } else {
                                                                                        str22 = str126;
                                                                                        i10 = i54;
                                                                                        String str130 = attributeValue15;
                                                                                        str23 = str128;
                                                                                        arrayList14 = arrayList67;
                                                                                        arrayList15 = arrayList66;
                                                                                        j20 = j63;
                                                                                        if (e2.d.m(xmlPullParser, "InbandEventStream")) {
                                                                                            arrayList16 = arrayList37;
                                                                                            arrayList16.add(h(xmlPullParser, "InbandEventStream"));
                                                                                            str24 = str130;
                                                                                            j21 = j64;
                                                                                            str25 = str86;
                                                                                        } else {
                                                                                            arrayList16 = arrayList37;
                                                                                            if (e2.d.m(xmlPullParser, "Label")) {
                                                                                                str24 = str130;
                                                                                                j21 = j64;
                                                                                                str25 = str86;
                                                                                                String attributeValue30 = xmlPullParser.getAttributeValue(null, str25);
                                                                                                String str131 = "";
                                                                                                while (true) {
                                                                                                    xmlPullParser.next();
                                                                                                    String str132 = str131;
                                                                                                    if (xmlPullParser.getEventType() == 4) {
                                                                                                        str26 = xmlPullParser.getText();
                                                                                                    } else {
                                                                                                        b(xmlPullParser);
                                                                                                        str26 = str132;
                                                                                                    }
                                                                                                    if (e2.d.l(xmlPullParser, "Label")) {
                                                                                                        arrayList35.add(new w(attributeValue30, str26));
                                                                                                    } else {
                                                                                                        str131 = str26;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                str24 = str130;
                                                                                                j21 = j64;
                                                                                                str25 = str86;
                                                                                                if (xmlPullParser.getEventType() == 2) {
                                                                                                    b(xmlPullParser);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        j17 = j19;
                                                                                        j47 = j21;
                                                                                        i11 = i10;
                                                                                    }
                                                                                }
                                                                            }
                                                                            str27 = str13;
                                                                        }
                                                                        if (e2.d.l(xmlPullParser, str27)) {
                                                                        }
                                                                    }
                                                                }
                                                                str5 = str63;
                                                                str12 = str81;
                                                                i10 = i25;
                                                                str2 = str52;
                                                                z11 = z10;
                                                                arrayList9 = arrayList36;
                                                                arrayList7 = arrayList31;
                                                                arrayList6 = arrayList32;
                                                                str22 = str68;
                                                                str13 = str69;
                                                                str24 = attributeValue15;
                                                                str14 = str70;
                                                                str21 = str71;
                                                                str23 = str72;
                                                                str15 = str73;
                                                                arrayList16 = arrayList37;
                                                                f7 = f14;
                                                                str16 = str77;
                                                                arrayList14 = arrayList42;
                                                                str17 = str79;
                                                                str18 = str78;
                                                                str19 = str80;
                                                                arrayList10 = arrayList43;
                                                                arrayList15 = arrayList41;
                                                                j20 = i24;
                                                                j12 = j45;
                                                                str25 = str86;
                                                                arrayList13 = arrayList40;
                                                            }
                                                        }
                                                        arrayList12 = arrayList8;
                                                        j11 = j39;
                                                        j14 = j41;
                                                        arrayList2 = arrayList34;
                                                        j21 = j47;
                                                        str20 = attributeValue14;
                                                        arrayList11 = arrayList39;
                                                        j18 = j40;
                                                        j19 = j17;
                                                        j17 = j19;
                                                        j47 = j21;
                                                        i11 = i10;
                                                        str27 = str13;
                                                        if (e2.d.l(xmlPullParser, str27)) {
                                                        }
                                                    }
                                                }
                                                str5 = str63;
                                                str12 = str81;
                                                str2 = str52;
                                                z11 = z10;
                                                arrayList9 = arrayList36;
                                                arrayList7 = arrayList31;
                                                arrayList6 = arrayList32;
                                                str22 = str68;
                                                str24 = attributeValue15;
                                                str14 = str70;
                                                str21 = str71;
                                                str23 = str72;
                                                str15 = str73;
                                                arrayList16 = arrayList37;
                                                f7 = f14;
                                                str16 = str77;
                                                arrayList14 = arrayList42;
                                                str17 = str79;
                                                str18 = str78;
                                                str19 = str80;
                                                arrayList10 = arrayList43;
                                                arrayList15 = arrayList41;
                                                j20 = i24;
                                                j12 = j45;
                                                arrayList13 = arrayList40;
                                                str25 = str53;
                                                str27 = str69;
                                                i11 = i25;
                                                arrayList12 = arrayList8;
                                                j11 = j39;
                                                j14 = j41;
                                                arrayList2 = arrayList34;
                                                str20 = attributeValue14;
                                                arrayList11 = arrayList39;
                                                j18 = j40;
                                                if (e2.d.l(xmlPullParser, str27)) {
                                                }
                                            }
                                        } else {
                                            arrayList4 = arrayList30;
                                            str = str53;
                                            String str133 = str63;
                                            str2 = str52;
                                            String str134 = str64;
                                            arrayList5 = arrayList33;
                                            z11 = z10;
                                            long j65 = j40;
                                            long j66 = j41;
                                            ArrayList arrayList68 = arrayList31;
                                            arrayList6 = arrayList32;
                                            long j67 = i24;
                                            j11 = j39;
                                            arrayList2 = arrayList29;
                                            j12 = j29;
                                            if (e2.d.m(xmlPullParser, "EventStream")) {
                                                String str135 = str67;
                                                String attributeValue31 = xmlPullParser.getAttributeValue(null, str135);
                                                String str136 = attributeValue31 == null ? "" : attributeValue31;
                                                String str137 = str65;
                                                String attributeValue32 = xmlPullParser.getAttributeValue(null, str137);
                                                String str138 = attributeValue32 == null ? "" : attributeValue32;
                                                String attributeValue33 = xmlPullParser.getAttributeValue(null, "timescale");
                                                long parseLong2 = attributeValue33 == null ? 1L : Long.parseLong(attributeValue33);
                                                String attributeValue34 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
                                                long parseLong3 = attributeValue34 == null ? 0L : Long.parseLong(attributeValue34);
                                                ArrayList arrayList69 = new ArrayList();
                                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(512);
                                                while (true) {
                                                    xmlPullParser.next();
                                                    String str139 = "Event";
                                                    if (e2.d.m(xmlPullParser, "Event")) {
                                                        str9 = str133;
                                                        String attributeValue35 = xmlPullParser.getAttributeValue(null, str9);
                                                        long parseLong4 = attributeValue35 == null ? 0L : Long.parseLong(attributeValue35);
                                                        str8 = str134;
                                                        String attributeValue36 = xmlPullParser.getAttributeValue(null, str8);
                                                        long parseLong5 = attributeValue36 == null ? -9223372036854775807L : Long.parseLong(attributeValue36);
                                                        String attributeValue37 = xmlPullParser.getAttributeValue(null, "presentationTime");
                                                        long parseLong6 = attributeValue37 == null ? 0L : Long.parseLong(attributeValue37);
                                                        String str140 = d0.a;
                                                        RoundingMode roundingMode = RoundingMode.DOWN;
                                                        long Y = d0.Y(parseLong5, 1000L, parseLong2, roundingMode);
                                                        long Y2 = d0.Y(parseLong6 - parseLong3, 1000000L, parseLong2, roundingMode);
                                                        str3 = str135;
                                                        j15 = parseLong2;
                                                        str65 = str137;
                                                        String attributeValue38 = xmlPullParser.getAttributeValue(null, "messageData");
                                                        if (attributeValue38 == null) {
                                                            attributeValue38 = null;
                                                        }
                                                        byteArrayOutputStream3.reset();
                                                        XmlSerializer newSerializer = Xml.newSerializer();
                                                        j16 = parseLong3;
                                                        newSerializer.setOutput(byteArrayOutputStream3, StandardCharsets.UTF_8.name());
                                                        xmlPullParser.nextToken();
                                                        while (!e2.d.l(xmlPullParser, str139)) {
                                                            switch (xmlPullParser.getEventType()) {
                                                                case 0:
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str139;
                                                                    newSerializer.startDocument(null, Boolean.FALSE);
                                                                    break;
                                                                case 1:
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str139;
                                                                    newSerializer.endDocument();
                                                                    break;
                                                                case 2:
                                                                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    int i55 = 0;
                                                                    while (i55 < xmlPullParser.getAttributeCount()) {
                                                                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i55), xmlPullParser.getAttributeName(i55), xmlPullParser.getAttributeValue(i55));
                                                                        i55++;
                                                                        byteArrayOutputStream3 = byteArrayOutputStream3;
                                                                        str139 = str139;
                                                                    }
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str139;
                                                                    break;
                                                                case 3:
                                                                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str139;
                                                                    break;
                                                                case 4:
                                                                    newSerializer.text(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str139;
                                                                    break;
                                                                case 5:
                                                                    newSerializer.cdsect(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str139;
                                                                    break;
                                                                case 6:
                                                                    newSerializer.entityRef(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str139;
                                                                    break;
                                                                case 7:
                                                                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str139;
                                                                    break;
                                                                case 8:
                                                                    newSerializer.processingInstruction(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str139;
                                                                    break;
                                                                case 9:
                                                                    newSerializer.comment(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str139;
                                                                    break;
                                                                case 10:
                                                                    newSerializer.docdecl(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str139;
                                                                    break;
                                                                default:
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str139;
                                                                    break;
                                                            }
                                                            xmlPullParser.nextToken();
                                                            byteArrayOutputStream3 = byteArrayOutputStream2;
                                                            str139 = str11;
                                                        }
                                                        byteArrayOutputStream = byteArrayOutputStream3;
                                                        newSerializer.flush();
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        Long valueOf = Long.valueOf(Y2);
                                                        if (attributeValue38 != null) {
                                                            byteArray = attributeValue38.getBytes(StandardCharsets.UTF_8);
                                                        }
                                                        str7 = str136;
                                                        str10 = str138;
                                                        arrayList69.add(Pair.create(valueOf, new n3.a(str136, str138, Y, parseLong4, byteArray)));
                                                    } else {
                                                        str3 = str135;
                                                        str65 = str137;
                                                        byteArrayOutputStream = byteArrayOutputStream3;
                                                        str7 = str136;
                                                        j15 = parseLong2;
                                                        str8 = str134;
                                                        str9 = str133;
                                                        j16 = parseLong3;
                                                        str10 = str138;
                                                        b(xmlPullParser);
                                                    }
                                                    if (e2.d.l(xmlPullParser, "EventStream")) {
                                                        long[] jArr = new long[arrayList69.size()];
                                                        n3.a[] aVarArr = new n3.a[arrayList69.size()];
                                                        for (int i56 = 0; i56 < arrayList69.size(); i56++) {
                                                            Pair pair2 = (Pair) arrayList69.get(i56);
                                                            jArr[i56] = ((Long) pair2.first).longValue();
                                                            aVarArr[i56] = (n3.a) pair2.second;
                                                        }
                                                        arrayList6.add(new g(str7, str10, jArr, aVarArr));
                                                        str5 = str9;
                                                        arrayList7 = arrayList68;
                                                        str4 = str8;
                                                        j13 = j67;
                                                        j10 = j65;
                                                        j14 = j66;
                                                    } else {
                                                        str136 = str7;
                                                        str138 = str10;
                                                        str133 = str9;
                                                        str134 = str8;
                                                        str135 = str3;
                                                        str137 = str65;
                                                        byteArrayOutputStream3 = byteArrayOutputStream;
                                                        parseLong3 = j16;
                                                        parseLong2 = j15;
                                                    }
                                                }
                                            } else {
                                                str3 = str67;
                                                str4 = str134;
                                                if (e2.d.m(xmlPullParser, "SegmentBase")) {
                                                    sVar = o(xmlPullParser, null);
                                                    arrayList6 = arrayList6;
                                                    str5 = str133;
                                                    arrayList7 = arrayList68;
                                                    j13 = j67;
                                                    str6 = str66;
                                                    j43 = j44;
                                                    j10 = j65;
                                                    j14 = j66;
                                                    j3 = -9223372036854775807L;
                                                } else if (e2.d.m(xmlPullParser, "SegmentList")) {
                                                    str5 = str133;
                                                    long d15 = d(xmlPullParser, -9223372036854775807L);
                                                    arrayList6 = arrayList6;
                                                    j3 = -9223372036854775807L;
                                                    sVar = p(xmlPullParser, null, j66, j67, j44, d15, j65);
                                                    j13 = j67;
                                                    j14 = j66;
                                                    j42 = d15;
                                                    arrayList7 = arrayList68;
                                                    str6 = str66;
                                                    j43 = j44;
                                                    j10 = j65;
                                                } else {
                                                    arrayList6 = arrayList6;
                                                    str5 = str133;
                                                    j13 = j67;
                                                    j14 = j66;
                                                    if (e2.d.m(xmlPullParser, "SegmentTemplate")) {
                                                        long d16 = d(xmlPullParser, -9223372036854775807L);
                                                        g0 g0Var = i0.b;
                                                        j3 = -9223372036854775807L;
                                                        arrayList7 = arrayList68;
                                                        j10 = j65;
                                                        sVar = q(xmlPullParser, null, a1.e, j14, j13, j44, d16, j10);
                                                        j14 = j14;
                                                        j42 = d16;
                                                    } else {
                                                        j3 = -9223372036854775807L;
                                                        arrayList7 = arrayList68;
                                                        j10 = j65;
                                                        if (e2.d.m(xmlPullParser, "AssetIdentifier")) {
                                                            h(xmlPullParser, "AssetIdentifier");
                                                        } else {
                                                            b(xmlPullParser);
                                                        }
                                                    }
                                                    str6 = str66;
                                                    j43 = j44;
                                                }
                                            }
                                        }
                                        j3 = -9223372036854775807L;
                                        str6 = str66;
                                        j43 = j44;
                                    }
                                    if (e2.d.l(xmlPullParser, str6)) {
                                        Pair create = Pair.create(new h(attributeValue11, i23, arrayList7, arrayList6), Long.valueOf(j13));
                                        h hVar = (h) create.first;
                                        if (hVar.b != j3) {
                                            long longValue = ((Long) create.second).longValue();
                                            long j68 = longValue == j3 ? j3 : longValue + hVar.b;
                                            arrayList3 = arrayList28;
                                            arrayList3.add(hVar);
                                            j29 = j68;
                                        } else {
                                            if (!equals) {
                                                throw s0.b("Unable to determine start of period " + arrayList28.size(), null);
                                            }
                                            arrayList3 = arrayList28;
                                            j29 = j12;
                                            z13 = true;
                                        }
                                    } else {
                                        str66 = str6;
                                        j29 = j12;
                                        arrayList29 = arrayList2;
                                        j39 = j11;
                                        str62 = str3;
                                        arrayList30 = arrayList4;
                                        i24 = j13;
                                        str64 = str4;
                                        str53 = str;
                                        str52 = str2;
                                        arrayList31 = arrayList7;
                                        arrayList32 = arrayList6;
                                        str63 = str5;
                                        j41 = j14;
                                        j40 = j10;
                                        z10 = z11;
                                        arrayList33 = arrayList5;
                                    }
                                }
                            }
                            j28 = j11;
                        }
                        if (!e2.d.l(xmlPullParser, "MPD")) {
                            if (i18 == j3) {
                                if (j29 != j3) {
                                    i18 = j29;
                                } else if (!equals) {
                                    throw s0.b("Unable to determine duration of static manifest.", null);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw s0.b("No periods found.", null);
                            }
                            return new c(T, i18, i19, equals, i20, j10, i22, T2, iVar, uVar, d0Var, uri2, arrayList3);
                        }
                        arrayList28 = arrayList3;
                        i21 = j10;
                        arrayList29 = arrayList2;
                        p5 = arrayList;
                        z10 = z11;
                        j27 = j3;
                        str51 = null;
                    }
                    z11 = z10;
                    arrayList3 = arrayList28;
                    j3 = j30;
                }
            }
            j10 = i21;
            if (!e2.d.l(xmlPullParser, "MPD")) {
            }
        }
    }

    public static j l(XmlPullParser xmlPullParser, String str, String str2) {
        long j3;
        long j10;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j3 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j10 = (Long.parseLong(split[1]) - j3) + 1;
                return new j(j3, j10, attributeValue);
            }
        } else {
            j3 = 0;
        }
        j10 = -1;
        return new j(j3, j10, attributeValue);
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
                i10 = 16384;
            }
        }
        return i10;
    }

    public static r o(XmlPullParser xmlPullParser, r rVar) {
        long j3 = rVar != null ? rVar.b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j3 = Long.parseLong(attributeValue);
        }
        long j10 = j3;
        long j11 = rVar != null ? rVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j11 = Long.parseLong(attributeValue2);
        }
        long j12 = j11;
        long j13 = rVar != null ? rVar.d : 0L;
        long j14 = rVar != null ? rVar.e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split("-");
            j13 = Long.parseLong(split[0]);
            j14 = (Long.parseLong(split[1]) - j13) + 1;
        }
        long j15 = j14;
        long j16 = j13;
        j jVar = rVar != null ? rVar.a : null;
        while (true) {
            xmlPullParser.next();
            if (e2.d.m(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar2 = jVar;
            if (e2.d.l(xmlPullParser, "SegmentBase")) {
                return new r(jVar2, j10, j12, j16, j15);
            }
            jVar = jVar2;
        }
    }

    public static o p(XmlPullParser xmlPullParser, o oVar, long j3, long j10, long j11, long j12, long j13) {
        long j14 = oVar != null ? oVar.b : 1L;
        List list = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j14 = Long.parseLong(attributeValue);
        }
        long j15 = j14;
        long j16 = oVar != null ? oVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j16 = Long.parseLong(attributeValue2);
        }
        long j17 = j16;
        long j18 = oVar != null ? oVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j18 = Long.parseLong(attributeValue3);
        }
        long j19 = j18;
        long j20 = oVar != null ? oVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j20 = Long.parseLong(attributeValue4);
        }
        long j21 = j20;
        long j22 = j12 == -9223372036854775807L ? j11 : j12;
        long j23 = j22 == Long.MAX_VALUE ? -9223372036854775807L : j22;
        j jVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (e2.d.m(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else if (e2.d.m(xmlPullParser, "SegmentTimeline")) {
                list2 = r(xmlPullParser, j15, j10);
            } else if (e2.d.m(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(l(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!e2.d.l(xmlPullParser, "SegmentList"));
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
        return new o(jVar, j15, j17, j21, j19, list2, j23, list, d0.Q(j13), d0.Q(j3));
    }

    public static p q(XmlPullParser xmlPullParser, p pVar, List list, long j3, long j10, long j11, long j12, long j13) {
        long j14;
        long j15 = pVar != null ? pVar.b : 1L;
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j15 = Long.parseLong(attributeValue);
        }
        long j16 = j15;
        long j17 = pVar != null ? pVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j17 = Long.parseLong(attributeValue2);
        }
        long j18 = j17;
        long j19 = pVar != null ? pVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j19 = Long.parseLong(attributeValue3);
        }
        long j20 = j19;
        long j21 = pVar != null ? pVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j21 = Long.parseLong(attributeValue4);
        }
        long j22 = j21;
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                j14 = -1;
                break;
            }
            f fVar = (f) list.get(i10);
            if (r6.a("http://dashif.org/guidelines/last-segment-number", fVar.a)) {
                j14 = Long.parseLong(fVar.b);
                break;
            }
            i10++;
        }
        long j23 = j14;
        long j24 = j12 == -9223372036854775807L ? j11 : j12;
        long j25 = j24 == Long.MAX_VALUE ? -9223372036854775807L : j24;
        t s10 = s(xmlPullParser, "media", pVar != null ? pVar.k : null);
        t s11 = s(xmlPullParser, "initialization", pVar != null ? pVar.j : null);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (e2.d.m(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else if (e2.d.m(xmlPullParser, "SegmentTimeline")) {
                list2 = r(xmlPullParser, j16, j10);
            } else {
                b(xmlPullParser);
            }
        } while (!e2.d.l(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar == null) {
                jVar = pVar.a;
            }
            if (list2 == null) {
                list2 = pVar.f;
            }
        }
        return new p(jVar, j16, j18, j22, j23, j20, list2, j25, s11, s10, d0.Q(j13), d0.Q(j3));
    }

    public static ArrayList r(XmlPullParser xmlPullParser, long j3, long j10) {
        long j11;
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        long j13 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (e2.d.m(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long parseLong = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z10) {
                    int i11 = i10;
                    j11 = parseLong;
                    j12 = a(arrayList, j12, j13, i11, j11);
                } else {
                    j11 = parseLong;
                }
                if (j11 != -9223372036854775807L) {
                    j12 = j11;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j13 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i10 = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z10 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!e2.d.l(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            String str = d0.a;
            a(arrayList, j12, j13, i10, d0.Y(j10, j3, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0100. Please report as an issue. */
    public static t s(XmlPullParser xmlPullParser, String str, t tVar) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return tVar;
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
        return new t(arrayList, arrayList2, arrayList3, 0);
    }

    @Override // y2.o
    public final Object f2(Uri uri, g2.k kVar) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(kVar, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return k(newPullParser, uri);
            }
            throw s0.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e7) {
            throw s0.b(null, e7);
        }
    }
}
