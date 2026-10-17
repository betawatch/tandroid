package m2;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.car.app.navigation.model.Maneuver;
import b2.a0;
import b2.h0;
import b2.v;
import b2.v0;
import b2.w;
import b2.w0;
import e2.m0;
import e9.l0;
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
import m.g3;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLObject;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import v7.s6;
import v7.u6;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
            String str = m0.a;
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
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0099, code lost:
    
        if (r13 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009d, code lost:
    
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
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
                        String[] d02 = m0.d0(str);
                        if (d02.length != 0) {
                            List B = new a5.a(new a6.i(new d9.e('.', 0), 15)).B(s6.c(d02[0].trim()));
                            if (B.size() == 4 && ((String) B.get(0)).equals("ac-4")) {
                                String str2 = (String) B.get(3);
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
                    String c12 = s6.c(attributeValue5);
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
            String c11 = s6.c(attributeValue);
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
                    r72 = b2.m.d;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r82 = str2;
                    break;
                case 1:
                    r72 = b2.m.f;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r82 = str2;
                    break;
                case 2:
                    r72 = b2.m.e;
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
                        r72 = b2.m.c;
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
                            j6.l i12 = w3.p.i(decode);
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
                        ?? r10 = b2.m.f;
                        if (r10.equals(r72) && e2.a.i(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r82 = w3.p.a(r10, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    b(xmlPullParser);
                    r82 = r82;
                }
            } while (!e2.a.h(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r72 != null ? new b2.r(r72, str3, "video/mp4", r82) : null);
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
        return Pair.create(str, r72 != null ? new b2.r(r72, str3, "video/mp4", r82) : null);
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
        Matcher matcher = m0.e.matcher(attributeValue);
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
    /* JADX WARN: Code restructure failed: missing block: B:380:0x09fe, code lost:
    
        if ("audio/eac3-joc".equals(r3) != false) goto L346;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x107c A[LOOP:5: B:182:0x041b->B:191:0x107c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0ef9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0d1b A[LOOP:11: B:352:0x06cc->B:361:0x0d1b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0938 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x1474 A[LOOP:1: B:35:0x00d3->B:43:0x1474, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x1440 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c k(XmlPullParser xmlPullParser, Uri uri) {
        int i10;
        boolean z10;
        int i11;
        ArrayList arrayList;
        boolean z11;
        long j10;
        long j11;
        int i12;
        long j12;
        long j13;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str;
        ArrayList arrayList4;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        String str5;
        long j14;
        long j15;
        ArrayList arrayList7;
        String str6;
        ByteArrayOutputStream byteArrayOutputStream;
        String str7;
        long j16;
        String str8;
        String str9;
        long j17;
        String str10;
        ByteArrayOutputStream byteArrayOutputStream2;
        String str11;
        ArrayList arrayList8;
        long j18;
        ArrayList arrayList9;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        ArrayList arrayList10;
        ArrayList arrayList11;
        long j19;
        ArrayList arrayList12;
        String str20;
        String str21;
        ArrayList arrayList13;
        long j20;
        String str22;
        int i13;
        String str23;
        ArrayList arrayList14;
        ArrayList arrayList15;
        long j21;
        ArrayList arrayList16;
        String str24;
        long j22;
        String str25;
        String str26;
        int i14;
        String str27;
        String str28;
        ArrayList arrayList17;
        int parseInt;
        String str29;
        String str30;
        String str31;
        String str32;
        int parseInt2;
        String str33;
        float f7;
        int parseInt3;
        float f10;
        ArrayList arrayList18;
        String str34;
        String str35;
        ArrayList arrayList19;
        String str36;
        String str37;
        int i15;
        ArrayList arrayList20;
        int i16;
        String str38;
        String str39;
        String str40;
        int i17;
        ArrayList arrayList21;
        float f11;
        ArrayList arrayList22;
        String str41;
        ArrayList arrayList23;
        long j23;
        ArrayList arrayList24;
        long j24;
        String str42;
        String str43;
        String str44;
        ArrayList arrayList25;
        long j25;
        ArrayList arrayList26;
        String str45;
        String str46;
        int i18;
        String str47;
        String str48;
        String d10;
        ArrayList arrayList27;
        String str49;
        b2.n nVar;
        Pair pair;
        int parseInt4;
        String str50;
        int i19;
        int i20;
        String str51;
        String str52;
        long j26;
        m kVar;
        String str53;
        long j27;
        int i21 = 0;
        String[] strArr = new String[0];
        String str54 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(",");
        }
        int length = strArr.length;
        int i22 = 0;
        while (true) {
            i10 = 1;
            if (i22 >= length) {
                z10 = false;
                break;
            }
            if (strArr[i22].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z10 = true;
                break;
            }
            i22++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long j28 = -9223372036854775807L;
        long V = attributeValue2 == null ? -9223372036854775807L : m0.V(attributeValue2);
        long i23 = i(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long i24 = i(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, TeXSymbolParser.TYPE_ATTR));
        long i25 = equals ? i(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long i26 = equals ? i(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long i27 = equals ? i(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long V2 = attributeValue3 == null ? -9223372036854775807L : m0.V(attributeValue3);
        long j29 = equals ? 0L : -9223372036854775807L;
        ArrayList q6 = e9.s.q(new b(z10 ? 1 : TLObject.FLAG_31, 1, uri.toString(), uri.toString()));
        ArrayList arrayList28 = new ArrayList();
        ArrayList arrayList29 = new ArrayList();
        long j30 = equals ? -9223372036854775807L : 0L;
        int i28 = 0;
        int i29 = 0;
        i iVar = null;
        t tVar = null;
        Uri uri2 = null;
        h0 h0Var = null;
        while (true) {
            xmlPullParser.next();
            String str55 = "BaseURL";
            if (e2.a.i(xmlPullParser, "BaseURL")) {
                if (i28 == 0) {
                    j29 = d(xmlPullParser, j29);
                    i28 = i10;
                }
                arrayList29.addAll(e(xmlPullParser, q6, z10));
                arrayList = q6;
                j10 = j28;
                arrayList2 = arrayList29;
                z11 = z10;
                i12 = i21;
                i11 = i10;
                arrayList3 = arrayList28;
            } else {
                i11 = i10;
                long j31 = j28;
                String str56 = "lang";
                if (e2.a.i(xmlPullParser, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(str54, "moreInformationURL");
                    String str57 = attributeValue4 == null ? str54 : attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str54, "lang");
                    String str58 = attributeValue5 == null ? str54 : attributeValue5;
                    String str59 = str54;
                    String str60 = str59;
                    String str61 = str60;
                    while (true) {
                        xmlPullParser.next();
                        if (e2.a.i(xmlPullParser, "Title")) {
                            str59 = xmlPullParser.nextText();
                        } else if (e2.a.i(xmlPullParser, "Source")) {
                            str60 = xmlPullParser.nextText();
                        } else if (e2.a.i(xmlPullParser, "Copyright")) {
                            str61 = xmlPullParser.nextText();
                        } else {
                            b(xmlPullParser);
                        }
                        String str62 = str59;
                        String str63 = str60;
                        String str64 = str61;
                        if (e2.a.h(xmlPullParser, "ProgramInformation")) {
                            i iVar2 = new i(str62, str63, str64, str57, str58);
                            arrayList = q6;
                            arrayList2 = arrayList29;
                            z11 = z10;
                            arrayList3 = arrayList28;
                            j10 = j31;
                            iVar = iVar2;
                        } else {
                            str59 = str62;
                            str60 = str63;
                            str61 = str64;
                        }
                    }
                } else {
                    String str65 = "schemeIdUri";
                    if (e2.a.i(xmlPullParser, "UTCTiming")) {
                        arrayList = q6;
                        arrayList2 = arrayList29;
                        tVar = new t(0, xmlPullParser.getAttributeValue(str54, "schemeIdUri"), xmlPullParser.getAttributeValue(str54, "value"));
                        z11 = z10;
                        i12 = 0;
                        arrayList3 = arrayList28;
                        j10 = j31;
                    } else if (e2.a.i(xmlPullParser, "Location")) {
                        uri2 = e2.e.g(uri.toString(), xmlPullParser.nextText());
                        arrayList = q6;
                        arrayList2 = arrayList29;
                        z11 = z10;
                        arrayList3 = arrayList28;
                        j10 = j31;
                    } else {
                        if (e2.a.i(xmlPullParser, "ServiceDescription")) {
                            long j32 = j31;
                            long j33 = j32;
                            long j34 = j33;
                            float f12 = -3.4028235E38f;
                            float f13 = -3.4028235E38f;
                            while (true) {
                                xmlPullParser.next();
                                if (e2.a.i(xmlPullParser, "Latency")) {
                                    arrayList = q6;
                                    String attributeValue6 = xmlPullParser.getAttributeValue(null, "target");
                                    j32 = attributeValue6 == null ? j31 : Long.parseLong(attributeValue6);
                                    String attributeValue7 = xmlPullParser.getAttributeValue(null, "min");
                                    j33 = attributeValue7 == null ? j31 : Long.parseLong(attributeValue7);
                                    String attributeValue8 = xmlPullParser.getAttributeValue(null, "max");
                                    j34 = attributeValue8 == null ? j31 : Long.parseLong(attributeValue8);
                                } else {
                                    arrayList = q6;
                                    if (e2.a.i(xmlPullParser, "PlaybackRate")) {
                                        String attributeValue9 = xmlPullParser.getAttributeValue(null, "min");
                                        f12 = attributeValue9 == null ? -3.4028235E38f : Float.parseFloat(attributeValue9);
                                        String attributeValue10 = xmlPullParser.getAttributeValue(null, "max");
                                        f13 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                                    }
                                }
                                long j35 = j32;
                                long j36 = j29;
                                long j37 = j33;
                                long j38 = i26;
                                long j39 = j34;
                                if (e2.a.h(xmlPullParser, "ServiceDescription")) {
                                    h0 h0Var2 = new h0();
                                    h0Var2.a = j35;
                                    h0Var2.b = j37;
                                    h0Var2.c = j39;
                                    h0Var2.d = f12;
                                    h0Var2.e = f13;
                                    h0Var = h0Var2;
                                    z11 = z10;
                                    j10 = j31;
                                    j29 = j36;
                                    j11 = j38;
                                    i12 = 0;
                                    arrayList2 = arrayList29;
                                    arrayList3 = arrayList28;
                                } else {
                                    j34 = j39;
                                    i26 = j38;
                                    q6 = arrayList;
                                    j33 = j37;
                                    j29 = j36;
                                    j32 = j35;
                                }
                            }
                        } else {
                            arrayList = q6;
                            long j40 = j29;
                            long j41 = i26;
                            if (e2.a.i(xmlPullParser, "Period") && i29 == 0) {
                                ArrayList arrayList30 = !arrayList29.isEmpty() ? arrayList29 : arrayList;
                                String str66 = "id";
                                String attributeValue11 = xmlPullParser.getAttributeValue(null, "id");
                                long i30 = i(xmlPullParser, "start", j30);
                                String str67 = "duration";
                                long j42 = V != j31 ? V + i30 : j31;
                                long i31 = i(xmlPullParser, "duration", j31);
                                ArrayList arrayList31 = new ArrayList();
                                ArrayList arrayList32 = new ArrayList();
                                ArrayList arrayList33 = new ArrayList();
                                long j43 = j31;
                                String str68 = "value";
                                String str69 = "Period";
                                long j44 = j40;
                                int i32 = 0;
                                s sVar = null;
                                while (true) {
                                    xmlPullParser.next();
                                    if (e2.a.i(xmlPullParser, str55)) {
                                        if (i32 == 0) {
                                            j44 = d(xmlPullParser, j44);
                                            i32 = i11;
                                        }
                                        arrayList33.addAll(e(xmlPullParser, arrayList30, z10));
                                        arrayList4 = arrayList30;
                                        str2 = str56;
                                        str5 = str66;
                                        str3 = str55;
                                        str4 = str67;
                                        arrayList5 = arrayList33;
                                        z11 = z10;
                                        str = str65;
                                        j14 = i31;
                                        j11 = j41;
                                        j15 = j42;
                                        arrayList7 = arrayList31;
                                        arrayList6 = arrayList32;
                                        str6 = str69;
                                        i12 = 0;
                                        j10 = -9223372036854775807L;
                                        j12 = j30;
                                        j13 = j40;
                                        arrayList2 = arrayList29;
                                    } else {
                                        long j45 = j44;
                                        str = str65;
                                        if (e2.a.i(xmlPullParser, "AdaptationSet")) {
                                            if (arrayList33.isEmpty()) {
                                                arrayList8 = arrayList30;
                                                arrayList4 = arrayList8;
                                            } else {
                                                arrayList4 = arrayList30;
                                                arrayList8 = arrayList33;
                                            }
                                            String attributeValue12 = xmlPullParser.getAttributeValue(null, str66);
                                            long parseLong = attributeValue12 == null ? -1L : Long.parseLong(attributeValue12);
                                            int g10 = g(xmlPullParser);
                                            String str70 = "SegmentTemplate";
                                            String attributeValue13 = xmlPullParser.getAttributeValue(null, "mimeType");
                                            String str71 = "AdaptationSet";
                                            ArrayList arrayList34 = arrayList29;
                                            String attributeValue14 = xmlPullParser.getAttributeValue(null, "codecs");
                                            long j46 = j30;
                                            String attributeValue15 = xmlPullParser.getAttributeValue(null, "scte214:supplementalCodecs");
                                            String attributeValue16 = xmlPullParser.getAttributeValue(null, "scte214:supplementalProfiles");
                                            String str72 = str67;
                                            String attributeValue17 = xmlPullParser.getAttributeValue(null, "width");
                                            int parseInt5 = attributeValue17 == null ? -1 : Integer.parseInt(attributeValue17);
                                            arrayList5 = arrayList33;
                                            String attributeValue18 = xmlPullParser.getAttributeValue(null, "height");
                                            int parseInt6 = attributeValue18 == null ? -1 : Integer.parseInt(attributeValue18);
                                            float j47 = j(xmlPullParser, -1.0f);
                                            String str73 = "SegmentList";
                                            String str74 = "SegmentBase";
                                            String attributeValue19 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                            int parseInt7 = attributeValue19 == null ? -1 : Integer.parseInt(attributeValue19);
                                            String attributeValue20 = xmlPullParser.getAttributeValue(null, str56);
                                            String str75 = "audioSamplingRate";
                                            String attributeValue21 = xmlPullParser.getAttributeValue(null, "label");
                                            ArrayList arrayList35 = new ArrayList();
                                            String str76 = attributeValue21;
                                            ArrayList arrayList36 = new ArrayList();
                                            ArrayList arrayList37 = new ArrayList();
                                            ArrayList arrayList38 = new ArrayList();
                                            float f14 = j47;
                                            ArrayList arrayList39 = new ArrayList();
                                            String str77 = "height";
                                            ArrayList arrayList40 = new ArrayList();
                                            String str78 = "width";
                                            ArrayList arrayList41 = new ArrayList();
                                            String str79 = "scte214:supplementalProfiles";
                                            ArrayList arrayList42 = new ArrayList();
                                            ArrayList arrayList43 = new ArrayList();
                                            String str80 = "codecs";
                                            String str81 = "scte214:supplementalCodecs";
                                            String str82 = "mimeType";
                                            ArrayList arrayList44 = arrayList38;
                                            s sVar2 = sVar;
                                            long j48 = j43;
                                            long j49 = j45;
                                            int i33 = g10;
                                            String str83 = attributeValue20;
                                            int i34 = 0;
                                            String str84 = null;
                                            int i35 = -1;
                                            while (true) {
                                                xmlPullParser.next();
                                                if (e2.a.i(xmlPullParser, str55)) {
                                                    if (i34 == 0) {
                                                        j49 = d(xmlPullParser, j49);
                                                        i34 = i11;
                                                    }
                                                    j18 = j49;
                                                    arrayList43.addAll(e(xmlPullParser, arrayList8, z10));
                                                } else {
                                                    j18 = j49;
                                                    if (e2.a.i(xmlPullParser, "ContentProtection")) {
                                                        Pair f15 = f(xmlPullParser);
                                                        Object obj = f15.first;
                                                        if (obj != null) {
                                                            str84 = (String) obj;
                                                        }
                                                        Object obj2 = f15.second;
                                                        if (obj2 != null) {
                                                            arrayList36.add((b2.r) obj2);
                                                        }
                                                    } else if (e2.a.i(xmlPullParser, "ContentComponent")) {
                                                        String attributeValue22 = xmlPullParser.getAttributeValue(null, str56);
                                                        if (str83 == null) {
                                                            str83 = attributeValue22;
                                                        } else if (attributeValue22 != null) {
                                                            u6.p(str83.equals(attributeValue22));
                                                        }
                                                        int g11 = g(xmlPullParser);
                                                        if (i33 == -1) {
                                                            i33 = g11;
                                                        } else if (g11 != -1) {
                                                            u6.p(i33 == g11 ? i11 : 0);
                                                        }
                                                    } else {
                                                        if (e2.a.i(xmlPullParser, "Role")) {
                                                            arrayList39.add(h(xmlPullParser, "Role"));
                                                            str5 = str66;
                                                            str21 = str83;
                                                            i13 = i33;
                                                            str3 = str55;
                                                            arrayList9 = arrayList36;
                                                            arrayList7 = arrayList31;
                                                            arrayList6 = arrayList32;
                                                            str22 = str70;
                                                            str12 = str71;
                                                            str24 = attributeValue15;
                                                            str4 = str72;
                                                            str20 = str73;
                                                            str23 = str74;
                                                            str13 = str75;
                                                            arrayList16 = arrayList37;
                                                            str14 = str78;
                                                            str15 = str79;
                                                            arrayList14 = arrayList42;
                                                            str16 = str81;
                                                            str17 = str80;
                                                            str18 = str82;
                                                            i12 = 0;
                                                            arrayList10 = arrayList43;
                                                            arrayList15 = arrayList41;
                                                            z11 = z10;
                                                            j21 = i31;
                                                            j12 = j46;
                                                            arrayList11 = arrayList40;
                                                            str25 = str56;
                                                        } else {
                                                            String str85 = "AudioChannelConfiguration";
                                                            if (e2.a.i(xmlPullParser, "AudioChannelConfiguration")) {
                                                                str5 = str66;
                                                                str21 = str83;
                                                                str3 = str55;
                                                                arrayList9 = arrayList36;
                                                                i35 = c(xmlPullParser, attributeValue14);
                                                                arrayList7 = arrayList31;
                                                                arrayList6 = arrayList32;
                                                                str22 = str70;
                                                                str24 = attributeValue15;
                                                                str4 = str72;
                                                                str20 = str73;
                                                                str23 = str74;
                                                                str13 = str75;
                                                                arrayList16 = arrayList37;
                                                                str14 = str78;
                                                                str15 = str79;
                                                                arrayList14 = arrayList42;
                                                                str16 = str81;
                                                                str17 = str80;
                                                                str18 = str82;
                                                                i12 = 0;
                                                                arrayList10 = arrayList43;
                                                                arrayList15 = arrayList41;
                                                                z11 = z10;
                                                                j21 = i31;
                                                                j12 = j46;
                                                                arrayList11 = arrayList40;
                                                                str25 = str56;
                                                                str27 = str71;
                                                                i14 = i33;
                                                                arrayList12 = arrayList8;
                                                                j13 = j40;
                                                                j15 = j42;
                                                                arrayList2 = arrayList34;
                                                                str19 = attributeValue14;
                                                                arrayList13 = arrayList39;
                                                                j19 = j41;
                                                                if (e2.a.h(xmlPullParser, str27)) {
                                                                    long j50 = j19;
                                                                    i11 = 1;
                                                                    arrayList37 = arrayList16;
                                                                    str56 = str25;
                                                                    str74 = str23;
                                                                    arrayList34 = arrayList2;
                                                                    j40 = j13;
                                                                    attributeValue14 = str19;
                                                                    arrayList39 = arrayList13;
                                                                    z10 = z11;
                                                                    i33 = i14;
                                                                    arrayList41 = arrayList15;
                                                                    arrayList43 = arrayList10;
                                                                    arrayList36 = arrayList9;
                                                                    str75 = str13;
                                                                    str55 = str3;
                                                                    arrayList42 = arrayList14;
                                                                    str72 = str4;
                                                                    str66 = str5;
                                                                    str71 = str27;
                                                                    j42 = j15;
                                                                    str70 = str22;
                                                                    str73 = str20;
                                                                    arrayList8 = arrayList12;
                                                                    attributeValue15 = str24;
                                                                    arrayList40 = arrayList11;
                                                                    j41 = j50;
                                                                    j49 = j18;
                                                                    str82 = str18;
                                                                    str83 = str21;
                                                                    j46 = j12;
                                                                    i31 = j21;
                                                                    str80 = str17;
                                                                    arrayList31 = arrayList7;
                                                                    arrayList32 = arrayList6;
                                                                    str81 = str16;
                                                                    str79 = str15;
                                                                    str78 = str14;
                                                                } else {
                                                                    ArrayList arrayList45 = new ArrayList(arrayList14.size());
                                                                    int i36 = i12;
                                                                    while (i36 < arrayList14.size()) {
                                                                        ArrayList arrayList46 = arrayList14;
                                                                        d dVar = (d) arrayList46.get(i36);
                                                                        v a2 = dVar.a.a();
                                                                        if (str76 == null || !arrayList35.isEmpty()) {
                                                                            str51 = str76;
                                                                            a2.c = n0.u(arrayList35);
                                                                        } else {
                                                                            str51 = str76;
                                                                            a2.b = str51;
                                                                        }
                                                                        String str86 = dVar.d;
                                                                        if (str86 == null) {
                                                                            str86 = str84;
                                                                        }
                                                                        ArrayList arrayList47 = dVar.e;
                                                                        ArrayList arrayList48 = arrayList9;
                                                                        arrayList47.addAll(arrayList48);
                                                                        long j51 = j15;
                                                                        if (arrayList47.isEmpty()) {
                                                                            str76 = str51;
                                                                            str52 = str25;
                                                                            j26 = j19;
                                                                        } else {
                                                                            int i37 = i12;
                                                                            while (true) {
                                                                                if (i37 < arrayList47.size()) {
                                                                                    b2.r rVar = (b2.r) arrayList47.get(i37);
                                                                                    str76 = str51;
                                                                                    if (!b2.m.d.equals(rVar.b) || (str53 = rVar.c) == null) {
                                                                                        i37++;
                                                                                        str51 = str76;
                                                                                    } else {
                                                                                        arrayList47.remove(i37);
                                                                                    }
                                                                                } else {
                                                                                    str76 = str51;
                                                                                    str53 = null;
                                                                                }
                                                                            }
                                                                            if (str53 != null) {
                                                                                int i38 = i12;
                                                                                while (i38 < arrayList47.size()) {
                                                                                    b2.r rVar2 = (b2.r) arrayList47.get(i38);
                                                                                    String str87 = str25;
                                                                                    if (b2.m.c.equals(rVar2.b) && rVar2.c == null) {
                                                                                        j27 = j19;
                                                                                        arrayList47.set(i38, new b2.r(b2.m.d, str53, rVar2.d, rVar2.e));
                                                                                    } else {
                                                                                        j27 = j19;
                                                                                    }
                                                                                    i38++;
                                                                                    j19 = j27;
                                                                                    str25 = str87;
                                                                                }
                                                                            }
                                                                            str52 = str25;
                                                                            j26 = j19;
                                                                            for (int size = arrayList47.size() - 1; size >= 0; size--) {
                                                                                b2.r rVar3 = (b2.r) arrayList47.get(size);
                                                                                if (rVar3.e == null) {
                                                                                    int i39 = i12;
                                                                                    while (true) {
                                                                                        if (i39 < arrayList47.size()) {
                                                                                            b2.r rVar4 = (b2.r) arrayList47.get(i39);
                                                                                            if (rVar4.e != null && rVar3.e == null && rVar4.a(rVar3.b)) {
                                                                                                arrayList47.remove(size);
                                                                                            } else {
                                                                                                i39++;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            a2.v = new b2.s(str86, arrayList47);
                                                                        }
                                                                        ArrayList arrayList49 = dVar.f;
                                                                        arrayList49.addAll(arrayList16);
                                                                        w wVar = new w(a2);
                                                                        n0 n0Var = dVar.b;
                                                                        s sVar3 = dVar.c;
                                                                        ArrayList arrayList50 = dVar.g;
                                                                        ArrayList arrayList51 = dVar.h;
                                                                        if (sVar3 instanceof r) {
                                                                            kVar = new l(wVar, n0Var, (r) sVar3, arrayList49, arrayList50, arrayList51);
                                                                        } else {
                                                                            if (!(sVar3 instanceof n)) {
                                                                                throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                            }
                                                                            kVar = new k(wVar, n0Var, (n) sVar3, arrayList49, arrayList50, arrayList51);
                                                                        }
                                                                        arrayList45.add(kVar);
                                                                        i36++;
                                                                        arrayList9 = arrayList48;
                                                                        arrayList14 = arrayList46;
                                                                        j19 = j26;
                                                                        str25 = str52;
                                                                        j15 = j51;
                                                                    }
                                                                    str2 = str25;
                                                                    i11 = 1;
                                                                    arrayList7.add(new a(parseLong, i14, arrayList45, arrayList44, arrayList11, arrayList15));
                                                                    j14 = j21;
                                                                    j11 = j19;
                                                                }
                                                            } else {
                                                                String str88 = str56;
                                                                if (e2.a.i(xmlPullParser, "Accessibility")) {
                                                                    arrayList44.add(h(xmlPullParser, "Accessibility"));
                                                                } else if (e2.a.i(xmlPullParser, "EssentialProperty")) {
                                                                    arrayList40.add(h(xmlPullParser, "EssentialProperty"));
                                                                } else {
                                                                    arrayList9 = arrayList36;
                                                                    if (e2.a.i(xmlPullParser, "SupplementalProperty")) {
                                                                        arrayList41.add(h(xmlPullParser, "SupplementalProperty"));
                                                                        str5 = str66;
                                                                        str21 = str83;
                                                                        i13 = i33;
                                                                        str3 = str55;
                                                                        arrayList7 = arrayList31;
                                                                        arrayList6 = arrayList32;
                                                                        str22 = str70;
                                                                        str12 = str71;
                                                                        str24 = attributeValue15;
                                                                        str4 = str72;
                                                                        str20 = str73;
                                                                        str23 = str74;
                                                                        str13 = str75;
                                                                        arrayList16 = arrayList37;
                                                                        str14 = str78;
                                                                        str15 = str79;
                                                                        arrayList14 = arrayList42;
                                                                        str16 = str81;
                                                                        str17 = str80;
                                                                        str18 = str82;
                                                                        i12 = 0;
                                                                        arrayList10 = arrayList43;
                                                                        arrayList15 = arrayList41;
                                                                        z11 = z10;
                                                                        j21 = i31;
                                                                        j12 = j46;
                                                                        str25 = str88;
                                                                        arrayList11 = arrayList40;
                                                                    } else {
                                                                        String str89 = "SupplementalProperty";
                                                                        String str90 = "Representation";
                                                                        if (e2.a.i(xmlPullParser, "Representation")) {
                                                                            if (arrayList43.isEmpty()) {
                                                                                str28 = "InbandEventStream";
                                                                                arrayList17 = arrayList8;
                                                                            } else {
                                                                                str28 = "InbandEventStream";
                                                                                arrayList17 = arrayList43;
                                                                            }
                                                                            String str91 = "EssentialProperty";
                                                                            String str92 = "ContentProtection";
                                                                            String attributeValue23 = xmlPullParser.getAttributeValue(null, str66);
                                                                            String str93 = str66;
                                                                            String attributeValue24 = xmlPullParser.getAttributeValue(null, "bandwidth");
                                                                            if (attributeValue24 == null) {
                                                                                String str94 = str82;
                                                                                str29 = attributeValue23;
                                                                                str30 = str94;
                                                                                parseInt = -1;
                                                                            } else {
                                                                                parseInt = Integer.parseInt(attributeValue24);
                                                                                String str95 = str82;
                                                                                str29 = attributeValue23;
                                                                                str30 = str95;
                                                                            }
                                                                            String attributeValue25 = xmlPullParser.getAttributeValue(null, str30);
                                                                            String str96 = str80;
                                                                            int i40 = parseInt;
                                                                            String str97 = attributeValue25 == null ? attributeValue13 : attributeValue25;
                                                                            String attributeValue26 = xmlPullParser.getAttributeValue(null, str96);
                                                                            String str98 = str81;
                                                                            str17 = str96;
                                                                            str18 = str30;
                                                                            String str99 = attributeValue26 == null ? attributeValue14 : attributeValue26;
                                                                            String attributeValue27 = xmlPullParser.getAttributeValue(null, str98);
                                                                            String str100 = str79;
                                                                            str16 = str98;
                                                                            String str101 = attributeValue27 == null ? attributeValue15 : attributeValue27;
                                                                            String attributeValue28 = xmlPullParser.getAttributeValue(null, str100);
                                                                            String str102 = str78;
                                                                            str15 = str100;
                                                                            String str103 = attributeValue28 == null ? attributeValue16 : attributeValue28;
                                                                            String attributeValue29 = xmlPullParser.getAttributeValue(null, str102);
                                                                            if (attributeValue29 == null) {
                                                                                String str104 = str77;
                                                                                str31 = str102;
                                                                                str32 = str104;
                                                                                parseInt2 = parseInt5;
                                                                            } else {
                                                                                String str105 = str77;
                                                                                str31 = str102;
                                                                                str32 = str105;
                                                                                parseInt2 = Integer.parseInt(attributeValue29);
                                                                            }
                                                                            String attributeValue30 = xmlPullParser.getAttributeValue(null, str32);
                                                                            if (attributeValue30 == null) {
                                                                                float f16 = f14;
                                                                                str33 = str32;
                                                                                f7 = f16;
                                                                                parseInt3 = parseInt6;
                                                                            } else {
                                                                                float f17 = f14;
                                                                                str33 = str32;
                                                                                f7 = f17;
                                                                                parseInt3 = Integer.parseInt(attributeValue30);
                                                                            }
                                                                            String str106 = str83;
                                                                            float j52 = j(xmlPullParser, f7);
                                                                            float f18 = f7;
                                                                            String str107 = str75;
                                                                            String attributeValue31 = xmlPullParser.getAttributeValue(null, str107);
                                                                            int parseInt8 = attributeValue31 == null ? parseInt7 : Integer.parseInt(attributeValue31);
                                                                            ArrayList arrayList52 = new ArrayList();
                                                                            ArrayList arrayList53 = new ArrayList();
                                                                            ArrayList arrayList54 = new ArrayList(arrayList40);
                                                                            ArrayList arrayList55 = arrayList40;
                                                                            ArrayList arrayList56 = new ArrayList(arrayList41);
                                                                            ArrayList arrayList57 = new ArrayList();
                                                                            ArrayList arrayList58 = arrayList54;
                                                                            str13 = str107;
                                                                            String str108 = attributeValue14;
                                                                            int i41 = i33;
                                                                            s sVar4 = sVar2;
                                                                            long j53 = j48;
                                                                            int i42 = i35;
                                                                            long j54 = j18;
                                                                            int i43 = 0;
                                                                            String str109 = null;
                                                                            while (true) {
                                                                                xmlPullParser.next();
                                                                                if (e2.a.i(xmlPullParser, str55)) {
                                                                                    if (i43 == 0) {
                                                                                        j54 = d(xmlPullParser, j54);
                                                                                        i43 = i11;
                                                                                    }
                                                                                    f10 = j52;
                                                                                    arrayList57.addAll(e(xmlPullParser, arrayList17, z10));
                                                                                } else {
                                                                                    f10 = j52;
                                                                                    if (e2.a.i(xmlPullParser, str85)) {
                                                                                        i42 = c(xmlPullParser, str99);
                                                                                    } else {
                                                                                        String str110 = str74;
                                                                                        if (e2.a.i(xmlPullParser, str110)) {
                                                                                            arrayList18 = arrayList57;
                                                                                            sVar4 = o(xmlPullParser, (r) sVar4);
                                                                                            str35 = str110;
                                                                                            str3 = str55;
                                                                                            arrayList19 = arrayList17;
                                                                                            str36 = str85;
                                                                                            arrayList7 = arrayList31;
                                                                                            arrayList6 = arrayList32;
                                                                                            str42 = str70;
                                                                                            str37 = str71;
                                                                                            str4 = str72;
                                                                                            str34 = str73;
                                                                                            i15 = parseInt8;
                                                                                            str14 = str31;
                                                                                            arrayList20 = arrayList42;
                                                                                            i16 = i40;
                                                                                            str38 = str88;
                                                                                            str44 = str89;
                                                                                            str39 = str91;
                                                                                            str5 = str93;
                                                                                            str40 = str106;
                                                                                            i17 = i41;
                                                                                            arrayList21 = arrayList52;
                                                                                            i18 = i42;
                                                                                            f11 = f10;
                                                                                            arrayList10 = arrayList43;
                                                                                            arrayList22 = arrayList41;
                                                                                            z11 = z10;
                                                                                            str41 = str99;
                                                                                            str77 = str33;
                                                                                            str43 = str28;
                                                                                            f14 = f18;
                                                                                            str46 = str109;
                                                                                            arrayList23 = arrayList53;
                                                                                            arrayList25 = arrayList58;
                                                                                            j25 = j53;
                                                                                            str45 = str90;
                                                                                            arrayList26 = arrayList56;
                                                                                            arrayList12 = arrayList8;
                                                                                            j13 = j40;
                                                                                            j23 = j42;
                                                                                            arrayList2 = arrayList34;
                                                                                            str19 = str108;
                                                                                            arrayList24 = arrayList39;
                                                                                            j24 = i31;
                                                                                            j19 = j41;
                                                                                            j12 = j46;
                                                                                            arrayList11 = arrayList55;
                                                                                            if (e2.a.h(xmlPullParser, str45)) {
                                                                                                if (v0.i(str97)) {
                                                                                                    if (str41 != null) {
                                                                                                        for (String str111 : m0.d0(str41)) {
                                                                                                            d10 = v0.d(str111);
                                                                                                            if (d10 != null && v0.i(d10)) {
                                                                                                                str47 = d10;
                                                                                                                str48 = str97;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    d10 = null;
                                                                                                    str47 = d10;
                                                                                                    str48 = str97;
                                                                                                } else if (v0.m(str97)) {
                                                                                                    if (str41 != null) {
                                                                                                        for (String str112 : m0.d0(str41)) {
                                                                                                            d10 = v0.d(str112);
                                                                                                            if (d10 != null && v0.m(d10)) {
                                                                                                                str47 = d10;
                                                                                                                str48 = str97;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    d10 = null;
                                                                                                    str47 = d10;
                                                                                                    str48 = str97;
                                                                                                } else if (v0.l(str97) || v0.k(str97)) {
                                                                                                    str47 = str97;
                                                                                                    str48 = str47;
                                                                                                } else {
                                                                                                    str48 = str97;
                                                                                                    if ("application/mp4".equals(str48)) {
                                                                                                        str47 = v0.d(str41);
                                                                                                        if ("text/vtt".equals(str47)) {
                                                                                                            str47 = "application/x-mp4-vtt";
                                                                                                        }
                                                                                                    } else {
                                                                                                        str47 = null;
                                                                                                    }
                                                                                                }
                                                                                                if ("audio/eac3".equals(str47)) {
                                                                                                    int i44 = 0;
                                                                                                    while (true) {
                                                                                                        str49 = "ec+3";
                                                                                                        if (i44 < arrayList26.size()) {
                                                                                                            f fVar = (f) arrayList26.get(i44);
                                                                                                            arrayList27 = arrayList26;
                                                                                                            String str113 = fVar.a;
                                                                                                            String str114 = fVar.b;
                                                                                                            int i45 = i44;
                                                                                                            if ((!"tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str113) || !"JOC".equals(str114)) && (!"tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str113) || !"ec+3".equals(str114))) {
                                                                                                                i44 = i45 + 1;
                                                                                                                arrayList26 = arrayList27;
                                                                                                            }
                                                                                                        } else {
                                                                                                            arrayList27 = arrayList26;
                                                                                                            str47 = "audio/eac3";
                                                                                                        }
                                                                                                    }
                                                                                                    str47 = "audio/eac3-joc";
                                                                                                } else {
                                                                                                    arrayList27 = arrayList26;
                                                                                                }
                                                                                                str49 = str41;
                                                                                                String str115 = str101;
                                                                                                if (v0.j(str49, str115)) {
                                                                                                    b2.n x10 = m0.x(str49, str115, str103);
                                                                                                    String str116 = str115 != null ? str115 : str49;
                                                                                                    str47 = "video/dolby-vision";
                                                                                                    nVar = x10;
                                                                                                    str49 = str116;
                                                                                                } else {
                                                                                                    nVar = null;
                                                                                                }
                                                                                                int i46 = 0;
                                                                                                int i47 = 0;
                                                                                                while (true) {
                                                                                                    long j55 = j23;
                                                                                                    if (i46 < arrayList24.size()) {
                                                                                                        ArrayList arrayList59 = arrayList24;
                                                                                                        f fVar2 = (f) arrayList59.get(i46);
                                                                                                        String str117 = str48;
                                                                                                        if (s6.a("urn:mpeg:dash:role:2011", fVar2.a)) {
                                                                                                            String str118 = fVar2.b;
                                                                                                            i47 = ((str118 != null && (str118.equals("forced_subtitle") || str118.equals("forced-subtitle"))) ? 2 : 0) | i47;
                                                                                                        }
                                                                                                        i46++;
                                                                                                        str48 = str117;
                                                                                                        arrayList24 = arrayList59;
                                                                                                        j23 = j55;
                                                                                                    } else {
                                                                                                        ArrayList arrayList60 = arrayList24;
                                                                                                        String str119 = str48;
                                                                                                        int i48 = 0;
                                                                                                        int i49 = 0;
                                                                                                        while (i48 < arrayList60.size()) {
                                                                                                            f fVar3 = (f) arrayList60.get(i48);
                                                                                                            ArrayList arrayList61 = arrayList60;
                                                                                                            if (s6.a("urn:mpeg:dash:role:2011", fVar3.a)) {
                                                                                                                i49 = m(fVar3.b) | i49;
                                                                                                            }
                                                                                                            i48++;
                                                                                                            arrayList60 = arrayList61;
                                                                                                        }
                                                                                                        ArrayList arrayList62 = arrayList60;
                                                                                                        int i50 = 0;
                                                                                                        int i51 = 0;
                                                                                                        while (i50 < arrayList44.size()) {
                                                                                                            ArrayList arrayList63 = arrayList44;
                                                                                                            int i52 = i50;
                                                                                                            f fVar4 = (f) arrayList63.get(i50);
                                                                                                            int i53 = i51;
                                                                                                            String str120 = fVar4.a;
                                                                                                            int i54 = i49;
                                                                                                            String str121 = fVar4.b;
                                                                                                            if (s6.a("urn:mpeg:dash:role:2011", str120)) {
                                                                                                                i20 = m(str121);
                                                                                                            } else if (s6.a("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar4.a)) {
                                                                                                                if (str121 != null) {
                                                                                                                    switch (str121.hashCode()) {
                                                                                                                        case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                                                                                                            if (str121.equals("1")) {
                                                                                                                                i19 = 0;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            i19 = -1;
                                                                                                                            break;
                                                                                                                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                                                                                                            if (str121.equals("2")) {
                                                                                                                                i19 = i11;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            i19 = -1;
                                                                                                                            break;
                                                                                                                        case 51:
                                                                                                                            if (str121.equals("3")) {
                                                                                                                                i19 = 2;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            i19 = -1;
                                                                                                                            break;
                                                                                                                        case 52:
                                                                                                                            if (str121.equals("4")) {
                                                                                                                                i19 = 3;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            i19 = -1;
                                                                                                                            break;
                                                                                                                        case 53:
                                                                                                                        default:
                                                                                                                            i19 = -1;
                                                                                                                            break;
                                                                                                                        case 54:
                                                                                                                            if (str121.equals("6")) {
                                                                                                                                i19 = 4;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            i19 = -1;
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    switch (i19) {
                                                                                                                        case 0:
                                                                                                                            i20 = 512;
                                                                                                                            break;
                                                                                                                        case 1:
                                                                                                                            i20 = 2048;
                                                                                                                            break;
                                                                                                                        case 2:
                                                                                                                            i20 = 4;
                                                                                                                            break;
                                                                                                                        case 3:
                                                                                                                            i20 = 8;
                                                                                                                            break;
                                                                                                                        case 4:
                                                                                                                            i20 = i11;
                                                                                                                            break;
                                                                                                                    }
                                                                                                                }
                                                                                                                i20 = 0;
                                                                                                            } else {
                                                                                                                i51 = i53;
                                                                                                                i50 = i52 + 1;
                                                                                                                arrayList44 = arrayList63;
                                                                                                                i49 = i54;
                                                                                                            }
                                                                                                            i51 = i53 | i20;
                                                                                                            i50 = i52 + 1;
                                                                                                            arrayList44 = arrayList63;
                                                                                                            i49 = i54;
                                                                                                        }
                                                                                                        ArrayList arrayList64 = arrayList44;
                                                                                                        int n10 = i49 | i51 | n(arrayList25) | n(arrayList27);
                                                                                                        int i55 = 0;
                                                                                                        while (true) {
                                                                                                            if (i55 < arrayList25.size()) {
                                                                                                                f fVar5 = (f) arrayList25.get(i55);
                                                                                                                int i56 = i55;
                                                                                                                if ((s6.a("http://dashif.org/thumbnail_tile", fVar5.a) || s6.a("http://dashif.org/guidelines/thumbnail_tile", fVar5.a)) && (str50 = fVar5.b) != null) {
                                                                                                                    String str122 = m0.a;
                                                                                                                    String[] split = str50.split("x", -1);
                                                                                                                    if (split.length == 2) {
                                                                                                                        i12 = 0;
                                                                                                                        try {
                                                                                                                            pair = Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[i11])));
                                                                                                                        } catch (NumberFormatException unused) {
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                i55 = i56 + 1;
                                                                                                            } else {
                                                                                                                i12 = 0;
                                                                                                                pair = null;
                                                                                                            }
                                                                                                        }
                                                                                                        v vVar = new v();
                                                                                                        vVar.a = str29;
                                                                                                        vVar.q = v0.n(str119);
                                                                                                        vVar.r = v0.n(str47);
                                                                                                        vVar.j = str49;
                                                                                                        vVar.i = i16;
                                                                                                        vVar.e = i47;
                                                                                                        vVar.f = n10;
                                                                                                        vVar.H = nVar;
                                                                                                        String str123 = str40;
                                                                                                        vVar.d = str123;
                                                                                                        vVar.Q = pair != null ? ((Integer) pair.first).intValue() : -1;
                                                                                                        vVar.R = pair != null ? ((Integer) pair.second).intValue() : -1;
                                                                                                        if (v0.m(str47)) {
                                                                                                            vVar.y = parseInt2;
                                                                                                            vVar.z = parseInt3;
                                                                                                            vVar.C = f11;
                                                                                                        } else {
                                                                                                            int i57 = parseInt2;
                                                                                                            int i58 = parseInt3;
                                                                                                            if (v0.i(str47)) {
                                                                                                                vVar.J = i18;
                                                                                                                vVar.K = i15;
                                                                                                            } else if (v0.l(str47)) {
                                                                                                                if ("application/cea-608".equals(str47)) {
                                                                                                                    int i59 = i12;
                                                                                                                    while (i59 < arrayList64.size()) {
                                                                                                                        f fVar6 = (f) arrayList64.get(i59);
                                                                                                                        String str124 = fVar6.a;
                                                                                                                        String str125 = fVar6.b;
                                                                                                                        if ("urn:scte:dash:cc:cea-608:2015".equals(str124) && str125 != null) {
                                                                                                                            Matcher matcher = c.matcher(str125);
                                                                                                                            if (matcher.matches()) {
                                                                                                                                parseInt4 = Integer.parseInt(matcher.group(i11));
                                                                                                                                vVar.O = parseInt4;
                                                                                                                            } else {
                                                                                                                                e2.a.l("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str125));
                                                                                                                            }
                                                                                                                        }
                                                                                                                        i59++;
                                                                                                                        i11 = 1;
                                                                                                                    }
                                                                                                                    parseInt4 = -1;
                                                                                                                    vVar.O = parseInt4;
                                                                                                                } else {
                                                                                                                    if ("application/cea-708".equals(str47)) {
                                                                                                                        for (int i60 = i12; i60 < arrayList64.size(); i60++) {
                                                                                                                            f fVar7 = (f) arrayList64.get(i60);
                                                                                                                            String str126 = fVar7.a;
                                                                                                                            String str127 = fVar7.b;
                                                                                                                            if ("urn:scte:dash:cc:cea-708:2015".equals(str126) && str127 != null) {
                                                                                                                                Matcher matcher2 = d.matcher(str127);
                                                                                                                                if (matcher2.matches()) {
                                                                                                                                    parseInt4 = Integer.parseInt(matcher2.group(1));
                                                                                                                                    vVar.O = parseInt4;
                                                                                                                                } else {
                                                                                                                                    e2.a.l("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str127));
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    parseInt4 = -1;
                                                                                                                    vVar.O = parseInt4;
                                                                                                                }
                                                                                                                str6 = str69;
                                                                                                                j44 = j45;
                                                                                                            } else if (v0.k(str47)) {
                                                                                                                vVar.y = i57;
                                                                                                                vVar.z = i58;
                                                                                                            }
                                                                                                        }
                                                                                                        w wVar2 = new w(vVar);
                                                                                                        d dVar2 = new d(wVar2, !arrayList18.isEmpty() ? arrayList18 : arrayList19, sVar4 != null ? sVar4 : new r(null, 1L, 0L, 0L, 0L), str46, arrayList21, arrayList23, arrayList25, arrayList27);
                                                                                                        int h = v0.h(wVar2.s);
                                                                                                        int i61 = i17;
                                                                                                        if (i61 != -1) {
                                                                                                            if (h != -1) {
                                                                                                                u6.p(i61 == h ? 1 : i12);
                                                                                                            }
                                                                                                            h = i61;
                                                                                                        }
                                                                                                        ArrayList arrayList65 = arrayList20;
                                                                                                        arrayList65.add(dVar2);
                                                                                                        str21 = str123;
                                                                                                        arrayList44 = arrayList64;
                                                                                                        arrayList14 = arrayList65;
                                                                                                        arrayList13 = arrayList62;
                                                                                                        str24 = attributeValue15;
                                                                                                        arrayList16 = arrayList37;
                                                                                                        j15 = j55;
                                                                                                        str25 = str38;
                                                                                                        str27 = str37;
                                                                                                        str20 = str34;
                                                                                                        str23 = str35;
                                                                                                        str22 = str42;
                                                                                                        arrayList15 = arrayList22;
                                                                                                        j21 = j24;
                                                                                                        i14 = h;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                arrayList56 = arrayList26;
                                                                                                arrayList53 = arrayList23;
                                                                                                i42 = i18;
                                                                                                str90 = str45;
                                                                                                arrayList58 = arrayList25;
                                                                                                arrayList52 = arrayList21;
                                                                                                str91 = str39;
                                                                                                str108 = str19;
                                                                                                arrayList41 = arrayList22;
                                                                                                str99 = str41;
                                                                                                str85 = str36;
                                                                                                arrayList55 = arrayList11;
                                                                                                arrayList57 = arrayList18;
                                                                                                f18 = f14;
                                                                                                str33 = str77;
                                                                                                j53 = j25;
                                                                                                str109 = str46;
                                                                                                arrayList17 = arrayList19;
                                                                                                i41 = i17;
                                                                                                arrayList31 = arrayList7;
                                                                                                arrayList32 = arrayList6;
                                                                                                arrayList42 = arrayList20;
                                                                                                str106 = str40;
                                                                                                i40 = i16;
                                                                                                parseInt8 = i15;
                                                                                                str88 = str38;
                                                                                                str72 = str4;
                                                                                                str74 = str35;
                                                                                                str93 = str5;
                                                                                                i11 = 1;
                                                                                                j42 = j23;
                                                                                                str28 = str43;
                                                                                                str89 = str44;
                                                                                                arrayList8 = arrayList12;
                                                                                                str31 = str14;
                                                                                                arrayList43 = arrayList10;
                                                                                                str55 = str3;
                                                                                                j52 = f11;
                                                                                                str73 = str34;
                                                                                                long j56 = j24;
                                                                                                arrayList34 = arrayList2;
                                                                                                j40 = j13;
                                                                                                str71 = str37;
                                                                                                j41 = j19;
                                                                                                z10 = z11;
                                                                                                arrayList39 = arrayList24;
                                                                                                str70 = str42;
                                                                                                j46 = j12;
                                                                                                i31 = j56;
                                                                                            }
                                                                                        } else {
                                                                                            arrayList18 = arrayList57;
                                                                                            String str128 = str73;
                                                                                            if (e2.a.i(xmlPullParser, str128)) {
                                                                                                arrayList10 = arrayList43;
                                                                                                str3 = str55;
                                                                                                long d11 = d(xmlPullParser, j53);
                                                                                                str34 = str128;
                                                                                                str35 = str110;
                                                                                                arrayList19 = arrayList17;
                                                                                                str36 = str85;
                                                                                                long j57 = j42;
                                                                                                arrayList7 = arrayList31;
                                                                                                arrayList6 = arrayList32;
                                                                                                str37 = str71;
                                                                                                str4 = str72;
                                                                                                i15 = parseInt8;
                                                                                                str14 = str31;
                                                                                                arrayList20 = arrayList42;
                                                                                                i16 = i40;
                                                                                                str38 = str88;
                                                                                                str39 = str91;
                                                                                                str5 = str93;
                                                                                                str40 = str106;
                                                                                                str19 = str108;
                                                                                                i17 = i41;
                                                                                                arrayList21 = arrayList52;
                                                                                                f11 = f10;
                                                                                                arrayList22 = arrayList41;
                                                                                                arrayList24 = arrayList39;
                                                                                                str41 = str99;
                                                                                                long j58 = j41;
                                                                                                str77 = str33;
                                                                                                f14 = f18;
                                                                                                arrayList23 = arrayList53;
                                                                                                arrayList12 = arrayList8;
                                                                                                long j59 = i31;
                                                                                                j13 = j40;
                                                                                                arrayList2 = arrayList34;
                                                                                                j12 = j46;
                                                                                                arrayList11 = arrayList55;
                                                                                                sVar4 = p(xmlPullParser, (o) sVar4, j57, j59, j54, d11, j58);
                                                                                                j24 = j59;
                                                                                                j23 = j57;
                                                                                                str42 = str70;
                                                                                                str45 = str90;
                                                                                                str46 = str109;
                                                                                                i18 = i42;
                                                                                                arrayList26 = arrayList56;
                                                                                                z11 = z10;
                                                                                                j19 = j58;
                                                                                                arrayList25 = arrayList58;
                                                                                                str44 = str89;
                                                                                                str43 = str28;
                                                                                                j25 = d11;
                                                                                            } else {
                                                                                                str34 = str128;
                                                                                                str35 = str110;
                                                                                                arrayList10 = arrayList43;
                                                                                                str3 = str55;
                                                                                                arrayList19 = arrayList17;
                                                                                                str36 = str85;
                                                                                                arrayList7 = arrayList31;
                                                                                                arrayList6 = arrayList32;
                                                                                                String str129 = str70;
                                                                                                str37 = str71;
                                                                                                str4 = str72;
                                                                                                i15 = parseInt8;
                                                                                                str14 = str31;
                                                                                                arrayList20 = arrayList42;
                                                                                                i16 = i40;
                                                                                                str38 = str88;
                                                                                                str39 = str91;
                                                                                                str5 = str93;
                                                                                                str40 = str106;
                                                                                                i17 = i41;
                                                                                                arrayList21 = arrayList52;
                                                                                                ArrayList arrayList66 = arrayList56;
                                                                                                f11 = f10;
                                                                                                arrayList22 = arrayList41;
                                                                                                str41 = str99;
                                                                                                str77 = str33;
                                                                                                f14 = f18;
                                                                                                arrayList23 = arrayList53;
                                                                                                long j60 = j41;
                                                                                                arrayList12 = arrayList8;
                                                                                                j13 = j40;
                                                                                                j23 = j42;
                                                                                                arrayList2 = arrayList34;
                                                                                                str19 = str108;
                                                                                                arrayList24 = arrayList39;
                                                                                                j24 = i31;
                                                                                                j12 = j46;
                                                                                                arrayList11 = arrayList55;
                                                                                                if (e2.a.i(xmlPullParser, str129)) {
                                                                                                    j19 = j60;
                                                                                                    long d12 = d(xmlPullParser, j53);
                                                                                                    str42 = str129;
                                                                                                    z11 = z10;
                                                                                                    long j61 = j54;
                                                                                                    sVar4 = q(xmlPullParser, (p) sVar4, arrayList22, j23, j24, j61, d12, j19);
                                                                                                    j54 = j61;
                                                                                                    j23 = j23;
                                                                                                    str43 = str28;
                                                                                                    str45 = str90;
                                                                                                    str46 = str109;
                                                                                                    i18 = i42;
                                                                                                    arrayList26 = arrayList66;
                                                                                                    str44 = str89;
                                                                                                    j25 = d12;
                                                                                                    arrayList25 = arrayList58;
                                                                                                } else {
                                                                                                    str42 = str129;
                                                                                                    z11 = z10;
                                                                                                    String str130 = str92;
                                                                                                    j19 = j60;
                                                                                                    if (e2.a.i(xmlPullParser, str130)) {
                                                                                                        Pair f19 = f(xmlPullParser);
                                                                                                        Object obj3 = f19.first;
                                                                                                        if (obj3 != null) {
                                                                                                            str109 = (String) obj3;
                                                                                                        }
                                                                                                        Object obj4 = f19.second;
                                                                                                        if (obj4 != null) {
                                                                                                            arrayList21.add((b2.r) obj4);
                                                                                                        }
                                                                                                        str92 = str130;
                                                                                                        str44 = str89;
                                                                                                        str43 = str28;
                                                                                                        str46 = str109;
                                                                                                        arrayList25 = arrayList58;
                                                                                                        i18 = i42;
                                                                                                        j25 = j53;
                                                                                                        str45 = str90;
                                                                                                        arrayList26 = arrayList66;
                                                                                                    } else {
                                                                                                        str43 = str28;
                                                                                                        if (e2.a.i(xmlPullParser, str43)) {
                                                                                                            arrayList23.add(h(xmlPullParser, str43));
                                                                                                            str92 = str130;
                                                                                                            str44 = str89;
                                                                                                            arrayList25 = arrayList58;
                                                                                                        } else if (e2.a.i(xmlPullParser, str39)) {
                                                                                                            arrayList25 = arrayList58;
                                                                                                            arrayList25.add(h(xmlPullParser, str39));
                                                                                                            str92 = str130;
                                                                                                            str44 = str89;
                                                                                                        } else {
                                                                                                            str44 = str89;
                                                                                                            arrayList25 = arrayList58;
                                                                                                            if (e2.a.i(xmlPullParser, str44)) {
                                                                                                                str92 = str130;
                                                                                                                j25 = j53;
                                                                                                                arrayList26 = arrayList66;
                                                                                                                arrayList26.add(h(xmlPullParser, str44));
                                                                                                            } else {
                                                                                                                str92 = str130;
                                                                                                                j25 = j53;
                                                                                                                arrayList26 = arrayList66;
                                                                                                                b(xmlPullParser);
                                                                                                            }
                                                                                                            str45 = str90;
                                                                                                            str46 = str109;
                                                                                                            i18 = i42;
                                                                                                        }
                                                                                                        j25 = j53;
                                                                                                        arrayList26 = arrayList66;
                                                                                                        str45 = str90;
                                                                                                        str46 = str109;
                                                                                                        i18 = i42;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if (e2.a.h(xmlPullParser, str45)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str3 = str55;
                                                                                arrayList19 = arrayList17;
                                                                                str36 = str85;
                                                                                arrayList7 = arrayList31;
                                                                                arrayList6 = arrayList32;
                                                                                str42 = str70;
                                                                                str37 = str71;
                                                                                str4 = str72;
                                                                                str34 = str73;
                                                                                str35 = str74;
                                                                                i15 = parseInt8;
                                                                                str14 = str31;
                                                                                arrayList20 = arrayList42;
                                                                                i16 = i40;
                                                                                str38 = str88;
                                                                                str44 = str89;
                                                                                str39 = str91;
                                                                                str5 = str93;
                                                                                str40 = str106;
                                                                                i17 = i41;
                                                                                arrayList21 = arrayList52;
                                                                                f11 = f10;
                                                                                arrayList18 = arrayList57;
                                                                                arrayList10 = arrayList43;
                                                                                arrayList22 = arrayList41;
                                                                                z11 = z10;
                                                                                str41 = str99;
                                                                                str77 = str33;
                                                                                str43 = str28;
                                                                                f14 = f18;
                                                                                str46 = str109;
                                                                                arrayList23 = arrayList53;
                                                                                arrayList25 = arrayList58;
                                                                                i18 = i42;
                                                                                j25 = j53;
                                                                                str45 = str90;
                                                                                arrayList26 = arrayList56;
                                                                                arrayList12 = arrayList8;
                                                                                j13 = j40;
                                                                                j23 = j42;
                                                                                arrayList2 = arrayList34;
                                                                                str19 = str108;
                                                                                arrayList24 = arrayList39;
                                                                                j24 = i31;
                                                                                j19 = j41;
                                                                                j12 = j46;
                                                                                arrayList11 = arrayList55;
                                                                                if (e2.a.h(xmlPullParser, str45)) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str5 = str66;
                                                                            str3 = str55;
                                                                            long j62 = j42;
                                                                            arrayList7 = arrayList31;
                                                                            arrayList6 = arrayList32;
                                                                            String str131 = str70;
                                                                            str12 = str71;
                                                                            str4 = str72;
                                                                            String str132 = str73;
                                                                            str13 = str75;
                                                                            str14 = str78;
                                                                            str15 = str79;
                                                                            str16 = str81;
                                                                            str17 = str80;
                                                                            str18 = str82;
                                                                            i12 = 0;
                                                                            str19 = attributeValue14;
                                                                            arrayList10 = arrayList43;
                                                                            ArrayList arrayList67 = arrayList41;
                                                                            z11 = z10;
                                                                            ArrayList arrayList68 = arrayList42;
                                                                            int i62 = i33;
                                                                            long j63 = j46;
                                                                            arrayList11 = arrayList40;
                                                                            ArrayList arrayList69 = arrayList39;
                                                                            j19 = j41;
                                                                            String str133 = str74;
                                                                            arrayList12 = arrayList8;
                                                                            j13 = j40;
                                                                            arrayList2 = arrayList34;
                                                                            long j64 = i31;
                                                                            j12 = j63;
                                                                            if (e2.a.i(xmlPullParser, str133)) {
                                                                                sVar2 = o(xmlPullParser, (r) sVar2);
                                                                                str21 = str83;
                                                                                arrayList14 = arrayList68;
                                                                                arrayList13 = arrayList69;
                                                                                str24 = attributeValue15;
                                                                                arrayList16 = arrayList37;
                                                                                j15 = j62;
                                                                                str25 = str88;
                                                                                str20 = str132;
                                                                                str22 = str131;
                                                                                arrayList15 = arrayList67;
                                                                                j21 = j64;
                                                                                i14 = i62;
                                                                                str23 = str133;
                                                                            } else {
                                                                                str20 = str132;
                                                                                if (e2.a.i(xmlPullParser, str20)) {
                                                                                    long d13 = d(xmlPullParser, j48);
                                                                                    str21 = str83;
                                                                                    arrayList13 = arrayList69;
                                                                                    sVar2 = p(xmlPullParser, (o) sVar2, j62, j64, j18, d13, j19);
                                                                                    j19 = j19;
                                                                                    j15 = j62;
                                                                                    j48 = d13;
                                                                                    str24 = attributeValue15;
                                                                                    arrayList16 = arrayList37;
                                                                                    arrayList14 = arrayList68;
                                                                                    str25 = str88;
                                                                                    str27 = str12;
                                                                                    str22 = str131;
                                                                                    arrayList15 = arrayList67;
                                                                                    j21 = j64;
                                                                                    i14 = i62;
                                                                                    str23 = str133;
                                                                                } else {
                                                                                    str21 = str83;
                                                                                    arrayList13 = arrayList69;
                                                                                    long j65 = j48;
                                                                                    j20 = j18;
                                                                                    j15 = j62;
                                                                                    if (e2.a.i(xmlPullParser, str131)) {
                                                                                        long d14 = d(xmlPullParser, j65);
                                                                                        str22 = str131;
                                                                                        str23 = str133;
                                                                                        arrayList14 = arrayList68;
                                                                                        sVar2 = q(xmlPullParser, (p) sVar2, arrayList67, j15, j64, j20, d14, j19);
                                                                                        j21 = j64;
                                                                                        String str134 = attributeValue15;
                                                                                        arrayList15 = arrayList67;
                                                                                        j15 = j15;
                                                                                        str24 = str134;
                                                                                        j18 = j20;
                                                                                        j48 = d14;
                                                                                        arrayList16 = arrayList37;
                                                                                        i14 = i62;
                                                                                        str25 = str88;
                                                                                    } else {
                                                                                        str22 = str131;
                                                                                        i13 = i62;
                                                                                        String str135 = attributeValue15;
                                                                                        str23 = str133;
                                                                                        arrayList14 = arrayList68;
                                                                                        arrayList15 = arrayList67;
                                                                                        j21 = j64;
                                                                                        if (e2.a.i(xmlPullParser, "InbandEventStream")) {
                                                                                            arrayList16 = arrayList37;
                                                                                            arrayList16.add(h(xmlPullParser, "InbandEventStream"));
                                                                                            str24 = str135;
                                                                                            j22 = j65;
                                                                                            str25 = str88;
                                                                                        } else {
                                                                                            arrayList16 = arrayList37;
                                                                                            if (e2.a.i(xmlPullParser, "Label")) {
                                                                                                str24 = str135;
                                                                                                j22 = j65;
                                                                                                str25 = str88;
                                                                                                String attributeValue32 = xmlPullParser.getAttributeValue(null, str25);
                                                                                                String str136 = "";
                                                                                                while (true) {
                                                                                                    xmlPullParser.next();
                                                                                                    String str137 = str136;
                                                                                                    if (xmlPullParser.getEventType() == 4) {
                                                                                                        str26 = xmlPullParser.getText();
                                                                                                    } else {
                                                                                                        b(xmlPullParser);
                                                                                                        str26 = str137;
                                                                                                    }
                                                                                                    if (e2.a.h(xmlPullParser, "Label")) {
                                                                                                        arrayList35.add(new a0(attributeValue32, str26));
                                                                                                    } else {
                                                                                                        str136 = str26;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                str24 = str135;
                                                                                                j22 = j65;
                                                                                                str25 = str88;
                                                                                                if (xmlPullParser.getEventType() == 2) {
                                                                                                    b(xmlPullParser);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        j18 = j20;
                                                                                        j48 = j22;
                                                                                        i14 = i13;
                                                                                    }
                                                                                }
                                                                            }
                                                                            str27 = str12;
                                                                        }
                                                                        if (e2.a.h(xmlPullParser, str27)) {
                                                                        }
                                                                    }
                                                                }
                                                                str5 = str66;
                                                                str21 = str83;
                                                                i13 = i33;
                                                                str3 = str55;
                                                                arrayList9 = arrayList36;
                                                                arrayList7 = arrayList31;
                                                                arrayList6 = arrayList32;
                                                                str22 = str70;
                                                                str12 = str71;
                                                                str24 = attributeValue15;
                                                                str4 = str72;
                                                                str20 = str73;
                                                                str23 = str74;
                                                                str13 = str75;
                                                                arrayList16 = arrayList37;
                                                                str14 = str78;
                                                                str15 = str79;
                                                                arrayList14 = arrayList42;
                                                                str16 = str81;
                                                                str17 = str80;
                                                                str18 = str82;
                                                                i12 = 0;
                                                                arrayList10 = arrayList43;
                                                                arrayList15 = arrayList41;
                                                                z11 = z10;
                                                                j21 = i31;
                                                                j12 = j46;
                                                                str25 = str88;
                                                                arrayList11 = arrayList40;
                                                            }
                                                        }
                                                        arrayList12 = arrayList8;
                                                        j13 = j40;
                                                        j15 = j42;
                                                        arrayList2 = arrayList34;
                                                        j22 = j48;
                                                        str19 = attributeValue14;
                                                        arrayList13 = arrayList39;
                                                        j19 = j41;
                                                        j20 = j18;
                                                        j18 = j20;
                                                        j48 = j22;
                                                        i14 = i13;
                                                        str27 = str12;
                                                        if (e2.a.h(xmlPullParser, str27)) {
                                                        }
                                                    }
                                                }
                                                str5 = str66;
                                                str21 = str83;
                                                str3 = str55;
                                                arrayList9 = arrayList36;
                                                arrayList7 = arrayList31;
                                                arrayList6 = arrayList32;
                                                str22 = str70;
                                                str24 = attributeValue15;
                                                str4 = str72;
                                                str20 = str73;
                                                str23 = str74;
                                                str13 = str75;
                                                arrayList16 = arrayList37;
                                                str14 = str78;
                                                str15 = str79;
                                                arrayList14 = arrayList42;
                                                str16 = str81;
                                                str17 = str80;
                                                str18 = str82;
                                                i12 = 0;
                                                arrayList10 = arrayList43;
                                                arrayList15 = arrayList41;
                                                z11 = z10;
                                                j21 = i31;
                                                j12 = j46;
                                                arrayList11 = arrayList40;
                                                str25 = str56;
                                                str27 = str71;
                                                i14 = i33;
                                                arrayList12 = arrayList8;
                                                j13 = j40;
                                                j15 = j42;
                                                arrayList2 = arrayList34;
                                                str19 = attributeValue14;
                                                arrayList13 = arrayList39;
                                                j19 = j41;
                                                if (e2.a.h(xmlPullParser, str27)) {
                                                }
                                            }
                                        } else {
                                            arrayList4 = arrayList30;
                                            str2 = str56;
                                            String str138 = str66;
                                            str3 = str55;
                                            str4 = str67;
                                            arrayList5 = arrayList33;
                                            z11 = z10;
                                            long j66 = j41;
                                            long j67 = j42;
                                            ArrayList arrayList70 = arrayList31;
                                            arrayList6 = arrayList32;
                                            i12 = 0;
                                            long j68 = i31;
                                            j13 = j40;
                                            arrayList2 = arrayList29;
                                            j12 = j30;
                                            if (e2.a.i(xmlPullParser, "EventStream")) {
                                                String str139 = str;
                                                String attributeValue33 = xmlPullParser.getAttributeValue(null, str139);
                                                String str140 = attributeValue33 == null ? "" : attributeValue33;
                                                String str141 = str68;
                                                String attributeValue34 = xmlPullParser.getAttributeValue(null, str141);
                                                String str142 = attributeValue34 == null ? "" : attributeValue34;
                                                String attributeValue35 = xmlPullParser.getAttributeValue(null, "timescale");
                                                long parseLong2 = attributeValue35 == null ? 1L : Long.parseLong(attributeValue35);
                                                String attributeValue36 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
                                                long parseLong3 = attributeValue36 == null ? 0L : Long.parseLong(attributeValue36);
                                                ArrayList arrayList71 = new ArrayList();
                                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(512);
                                                while (true) {
                                                    xmlPullParser.next();
                                                    String str143 = "Event";
                                                    if (e2.a.i(xmlPullParser, "Event")) {
                                                        str9 = str138;
                                                        String attributeValue37 = xmlPullParser.getAttributeValue(null, str9);
                                                        long parseLong4 = attributeValue37 == null ? 0L : Long.parseLong(attributeValue37);
                                                        str8 = str4;
                                                        String attributeValue38 = xmlPullParser.getAttributeValue(null, str8);
                                                        long parseLong5 = attributeValue38 == null ? -9223372036854775807L : Long.parseLong(attributeValue38);
                                                        String attributeValue39 = xmlPullParser.getAttributeValue(null, "presentationTime");
                                                        long parseLong6 = attributeValue39 == null ? 0L : Long.parseLong(attributeValue39);
                                                        String str144 = m0.a;
                                                        RoundingMode roundingMode = RoundingMode.DOWN;
                                                        long a02 = m0.a0(parseLong5, 1000L, parseLong2, roundingMode);
                                                        long a03 = m0.a0(parseLong6 - parseLong3, 1000000L, parseLong2, roundingMode);
                                                        str = str139;
                                                        j16 = parseLong2;
                                                        str68 = str141;
                                                        String attributeValue40 = xmlPullParser.getAttributeValue(null, "messageData");
                                                        if (attributeValue40 == null) {
                                                            attributeValue40 = null;
                                                        }
                                                        byteArrayOutputStream3.reset();
                                                        XmlSerializer newSerializer = Xml.newSerializer();
                                                        j17 = parseLong3;
                                                        newSerializer.setOutput(byteArrayOutputStream3, StandardCharsets.UTF_8.name());
                                                        xmlPullParser.nextToken();
                                                        while (!e2.a.h(xmlPullParser, str143)) {
                                                            switch (xmlPullParser.getEventType()) {
                                                                case 0:
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str143;
                                                                    newSerializer.startDocument(null, Boolean.FALSE);
                                                                    break;
                                                                case 1:
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str143;
                                                                    newSerializer.endDocument();
                                                                    break;
                                                                case 2:
                                                                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    int i63 = 0;
                                                                    while (i63 < xmlPullParser.getAttributeCount()) {
                                                                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i63), xmlPullParser.getAttributeName(i63), xmlPullParser.getAttributeValue(i63));
                                                                        i63++;
                                                                        byteArrayOutputStream3 = byteArrayOutputStream3;
                                                                        str143 = str143;
                                                                    }
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str143;
                                                                    break;
                                                                case 3:
                                                                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str143;
                                                                    break;
                                                                case 4:
                                                                    newSerializer.text(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str143;
                                                                    break;
                                                                case 5:
                                                                    newSerializer.cdsect(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str143;
                                                                    break;
                                                                case 6:
                                                                    newSerializer.entityRef(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str143;
                                                                    break;
                                                                case 7:
                                                                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str143;
                                                                    break;
                                                                case 8:
                                                                    newSerializer.processingInstruction(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str143;
                                                                    break;
                                                                case 9:
                                                                    newSerializer.comment(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str143;
                                                                    break;
                                                                case 10:
                                                                    newSerializer.docdecl(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str143;
                                                                    break;
                                                                default:
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    str11 = str143;
                                                                    break;
                                                            }
                                                            xmlPullParser.nextToken();
                                                            byteArrayOutputStream3 = byteArrayOutputStream2;
                                                            str143 = str11;
                                                        }
                                                        byteArrayOutputStream = byteArrayOutputStream3;
                                                        newSerializer.flush();
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        Long valueOf = Long.valueOf(a03);
                                                        if (attributeValue40 != null) {
                                                            byteArray = attributeValue40.getBytes(StandardCharsets.UTF_8);
                                                        }
                                                        str7 = str140;
                                                        str10 = str142;
                                                        arrayList71.add(Pair.create(valueOf, new n3.a(str140, str142, a02, parseLong4, byteArray)));
                                                    } else {
                                                        str = str139;
                                                        str68 = str141;
                                                        byteArrayOutputStream = byteArrayOutputStream3;
                                                        str7 = str140;
                                                        j16 = parseLong2;
                                                        str8 = str4;
                                                        str9 = str138;
                                                        j17 = parseLong3;
                                                        str10 = str142;
                                                        b(xmlPullParser);
                                                    }
                                                    if (e2.a.h(xmlPullParser, "EventStream")) {
                                                        long[] jArr = new long[arrayList71.size()];
                                                        n3.a[] aVarArr = new n3.a[arrayList71.size()];
                                                        for (int i64 = 0; i64 < arrayList71.size(); i64++) {
                                                            Pair pair2 = (Pair) arrayList71.get(i64);
                                                            jArr[i64] = ((Long) pair2.first).longValue();
                                                            aVarArr[i64] = (n3.a) pair2.second;
                                                        }
                                                        arrayList6.add(new g(str7, str10, jArr, aVarArr));
                                                        str5 = str9;
                                                        arrayList7 = arrayList70;
                                                        str4 = str8;
                                                        j14 = j68;
                                                        j11 = j66;
                                                        j15 = j67;
                                                    } else {
                                                        str140 = str7;
                                                        str142 = str10;
                                                        str138 = str9;
                                                        str4 = str8;
                                                        byteArrayOutputStream3 = byteArrayOutputStream;
                                                        str141 = str68;
                                                        str139 = str;
                                                        parseLong3 = j17;
                                                        parseLong2 = j16;
                                                    }
                                                }
                                            } else if (e2.a.i(xmlPullParser, "SegmentBase")) {
                                                sVar = o(xmlPullParser, null);
                                                arrayList6 = arrayList6;
                                                str5 = str138;
                                                arrayList7 = arrayList70;
                                                j14 = j68;
                                                str6 = str69;
                                                j44 = j45;
                                                j11 = j66;
                                                j15 = j67;
                                                j10 = -9223372036854775807L;
                                            } else if (e2.a.i(xmlPullParser, "SegmentList")) {
                                                str5 = str138;
                                                long d15 = d(xmlPullParser, -9223372036854775807L);
                                                arrayList6 = arrayList6;
                                                j10 = -9223372036854775807L;
                                                sVar = p(xmlPullParser, null, j67, j68, j45, d15, j66);
                                                j14 = j68;
                                                j15 = j67;
                                                j43 = d15;
                                                arrayList7 = arrayList70;
                                                str6 = str69;
                                                j44 = j45;
                                                j11 = j66;
                                            } else {
                                                arrayList6 = arrayList6;
                                                str5 = str138;
                                                j14 = j68;
                                                j15 = j67;
                                                if (e2.a.i(xmlPullParser, "SegmentTemplate")) {
                                                    long d16 = d(xmlPullParser, -9223372036854775807L);
                                                    l0 l0Var = n0.b;
                                                    j10 = -9223372036854775807L;
                                                    arrayList7 = arrayList70;
                                                    j11 = j66;
                                                    sVar = q(xmlPullParser, null, x1.e, j15, j14, j45, d16, j11);
                                                    j15 = j15;
                                                    j43 = d16;
                                                } else {
                                                    j10 = -9223372036854775807L;
                                                    arrayList7 = arrayList70;
                                                    j11 = j66;
                                                    if (e2.a.i(xmlPullParser, "AssetIdentifier")) {
                                                        h(xmlPullParser, "AssetIdentifier");
                                                    } else {
                                                        b(xmlPullParser);
                                                    }
                                                }
                                                str6 = str69;
                                                j44 = j45;
                                            }
                                        }
                                        j10 = -9223372036854775807L;
                                        str6 = str69;
                                        j44 = j45;
                                    }
                                    if (e2.a.h(xmlPullParser, str6)) {
                                        Pair create = Pair.create(new h(attributeValue11, i30, arrayList7, arrayList6), Long.valueOf(j14));
                                        h hVar = (h) create.first;
                                        if (hVar.b != j10) {
                                            long longValue = ((Long) create.second).longValue();
                                            long j69 = longValue == j10 ? j10 : longValue + hVar.b;
                                            arrayList3 = arrayList28;
                                            arrayList3.add(hVar);
                                            j30 = j69;
                                        } else {
                                            if (!equals) {
                                                throw w0.b("Unable to determine start of period " + arrayList28.size(), null);
                                            }
                                            arrayList3 = arrayList28;
                                            i29 = i11;
                                        }
                                    } else {
                                        str69 = str6;
                                        j42 = j15;
                                        j30 = j12;
                                        arrayList29 = arrayList2;
                                        j40 = j13;
                                        str65 = str;
                                        arrayList30 = arrayList4;
                                        i31 = j14;
                                        str56 = str2;
                                        str55 = str3;
                                        arrayList31 = arrayList7;
                                        arrayList32 = arrayList6;
                                        str67 = str4;
                                        str66 = str5;
                                        j41 = j11;
                                        z10 = z11;
                                        arrayList33 = arrayList5;
                                    }
                                }
                                j29 = j13;
                            } else {
                                z11 = z10;
                                j10 = j31;
                                j11 = j41;
                                i12 = 0;
                                j12 = j30;
                                j13 = j40;
                                arrayList2 = arrayList29;
                                arrayList3 = arrayList28;
                                b(xmlPullParser);
                            }
                            j30 = j12;
                            j29 = j13;
                        }
                        if (!e2.a.h(xmlPullParser, "MPD")) {
                            if (i23 == j10) {
                                if (j30 != j10) {
                                    i23 = j30;
                                } else if (!equals) {
                                    throw w0.b("Unable to determine duration of static manifest.", null);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw w0.b("No periods found.", null);
                            }
                            return new c(V, i23, i24, equals, i25, j11, i27, V2, iVar, tVar, h0Var, uri2, arrayList3);
                        }
                        arrayList28 = arrayList3;
                        i26 = j11;
                        i10 = i11;
                        i21 = i12;
                        arrayList29 = arrayList2;
                        q6 = arrayList;
                        j28 = j10;
                        z10 = z11;
                        str54 = null;
                    }
                }
                i12 = 0;
            }
            j11 = i26;
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
                return new j(j10, j11, attributeValue);
            }
        } else {
            j10 = 0;
        }
        j11 = -1;
        return new j(j10, j11, attributeValue);
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
            if (s6.a("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i11)).a)) {
                i10 = 16384;
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
        return new o(jVar, j16, j18, j22, j20, list2, j24, list, m0.S(j14), m0.S(j10));
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
            if (s6.a("http://dashif.org/guidelines/last-segment-number", fVar.a)) {
                j15 = Long.parseLong(fVar.b);
                break;
            }
            i10++;
        }
        long j24 = j15;
        long j25 = j13 == -9223372036854775807L ? j12 : j13;
        long j26 = j25 == Long.MAX_VALUE ? -9223372036854775807L : j25;
        g3 s10 = s(xmlPullParser, "media", pVar != null ? pVar.k : null);
        g3 s11 = s(xmlPullParser, "initialization", pVar != null ? pVar.j : null);
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
        return new p(jVar, j17, j19, j23, j24, j21, list2, j26, s11, s10, m0.S(j14), m0.S(j10));
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
            String str = m0.a;
            a(arrayList, j13, j14, i10, m0.a0(j11, j10, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0100. Please report as an issue. */
    public static g3 s(XmlPullParser xmlPullParser, String str, g3 g3Var) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return g3Var;
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
        return new g3(arrayList, arrayList2, arrayList3, 1);
    }

    @Override // y2.n
    public final Object d2(Uri uri, g2.k kVar) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(kVar, null);
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
