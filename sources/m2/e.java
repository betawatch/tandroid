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
import v7.s6;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a5, code lost:
    
        if (r13 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b8, code lost:
    
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
                            List x10 = new a5.a(new a6.i(new d9.b('.'), 16)).x(s6.b(b02[0].trim()));
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
                    String b10 = s6.b(attributeValue5);
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
            String b10 = s6.b(attributeValue);
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
    /* JADX WARN: Removed duplicated region for block: B:191:0x0f99 A[LOOP:5: B:183:0x0422->B:191:0x0f99, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0e18 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0c8e A[LOOP:11: B:349:0x067c->B:358:0x0c8e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x08cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x1371 A[LOOP:1: B:35:0x00d3->B:43:0x1371, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x133d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0b4a  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0b5c  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0c43  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0c62  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0c4a  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0c2a  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0b6a  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0b45  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0b14 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c k(XmlPullParser xmlPullParser, Uri uri) {
        boolean z10;
        long j3;
        ArrayList arrayList;
        boolean z11;
        long j10;
        long j11;
        ArrayList arrayList2;
        long j12;
        long j13;
        ArrayList arrayList3;
        long j14;
        ArrayList arrayList4;
        String str;
        String str2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long j15;
        ArrayList arrayList7;
        String str3;
        String str4;
        long j16;
        long j17;
        String str5;
        String str6;
        long j18;
        String str7;
        String str8;
        long j19;
        String str9;
        String str10;
        ByteArrayOutputStream byteArrayOutputStream;
        long j20;
        ByteArrayOutputStream byteArrayOutputStream2;
        ArrayList arrayList8;
        long j21;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String str11;
        ArrayList arrayList11;
        String str12;
        String str13;
        String str14;
        String str15;
        float f7;
        String str16;
        String str17;
        ArrayList arrayList12;
        String str18;
        String str19;
        String str20;
        ArrayList arrayList13;
        long j22;
        String str21;
        ArrayList arrayList14;
        String str22;
        String str23;
        ArrayList arrayList15;
        int i10;
        ArrayList arrayList16;
        long j23;
        ArrayList arrayList17;
        String str24;
        int i11;
        String str25;
        String str26;
        ArrayList arrayList18;
        int parseInt;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        long j24;
        String str33;
        ArrayList arrayList19;
        int i12;
        String str34;
        int i13;
        int i14;
        ArrayList arrayList20;
        ArrayList arrayList21;
        String str35;
        long j25;
        ArrayList arrayList22;
        String str36;
        ArrayList arrayList23;
        long j26;
        String str37;
        ArrayList arrayList24;
        ArrayList arrayList25;
        String str38;
        s sVar;
        int i15;
        String str39;
        String str40;
        String str41;
        String d10;
        ArrayList arrayList26;
        String str42;
        String str43;
        int i16;
        ArrayList arrayList27;
        int i17;
        int i18;
        int i19;
        ArrayList arrayList28;
        Pair pair;
        int parseInt2;
        int i20;
        String str44;
        char c10;
        int i21;
        String str45;
        long j27;
        String str46;
        m kVar;
        String str47;
        ArrayList arrayList29;
        long j28;
        String[] strArr = new String[0];
        String str48 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(",");
        }
        int length = strArr.length;
        int i22 = 0;
        while (true) {
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
        long j29 = -9223372036854775807L;
        long T = attributeValue2 == null ? -9223372036854775807L : d0.T(attributeValue2);
        long i23 = i(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long i24 = i(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, TeXSymbolParser.TYPE_ATTR));
        long i25 = equals ? i(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long i26 = equals ? i(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long i27 = equals ? i(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long T2 = attributeValue3 == null ? -9223372036854775807L : d0.T(attributeValue3);
        long j30 = equals ? 0L : -9223372036854775807L;
        ArrayList p5 = e9.q.p(new b(z10 ? 1 : TLObject.FLAG_31, 1, uri.toString(), uri.toString()));
        ArrayList arrayList30 = new ArrayList();
        ArrayList arrayList31 = new ArrayList();
        long j31 = equals ? -9223372036854775807L : 0L;
        i iVar = null;
        c5.a aVar = null;
        Uri uri2 = null;
        b2.d0 d0Var = null;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            xmlPullParser.next();
            String str49 = "BaseURL";
            if (e2.d.m(xmlPullParser, "BaseURL")) {
                if (!z12) {
                    j30 = d(xmlPullParser, j30);
                    z12 = true;
                }
                arrayList31.addAll(e(xmlPullParser, p5, z10));
                arrayList = p5;
                j11 = j29;
                arrayList2 = arrayList31;
                j13 = j31;
                z11 = z10;
                arrayList3 = arrayList30;
            } else {
                char c11 = 1;
                String str50 = "lang";
                if (e2.d.m(xmlPullParser, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(str48, "moreInformationURL");
                    String str51 = attributeValue4 == null ? str48 : attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str48, "lang");
                    String str52 = attributeValue5 == null ? str48 : attributeValue5;
                    String str53 = str48;
                    String str54 = str53;
                    String str55 = str54;
                    while (true) {
                        xmlPullParser.next();
                        j3 = j29;
                        if (e2.d.m(xmlPullParser, "Title")) {
                            str53 = xmlPullParser.nextText();
                        } else if (e2.d.m(xmlPullParser, "Source")) {
                            str54 = xmlPullParser.nextText();
                        } else if (e2.d.m(xmlPullParser, "Copyright")) {
                            str55 = xmlPullParser.nextText();
                        } else {
                            b(xmlPullParser);
                        }
                        String str56 = str53;
                        String str57 = str54;
                        String str58 = str55;
                        if (e2.d.l(xmlPullParser, "ProgramInformation")) {
                            i iVar2 = new i(str56, str57, str58, str51, str52);
                            arrayList = p5;
                            arrayList2 = arrayList31;
                            j13 = j31;
                            z11 = z10;
                            arrayList3 = arrayList30;
                            iVar = iVar2;
                        } else {
                            str53 = str56;
                            str54 = str57;
                            str55 = str58;
                            j29 = j3;
                        }
                    }
                } else {
                    j3 = j29;
                    if (e2.d.m(xmlPullParser, "UTCTiming")) {
                        arrayList = p5;
                        arrayList2 = arrayList31;
                        j13 = j31;
                        aVar = new c5.a(3, xmlPullParser.getAttributeValue(str48, "schemeIdUri"), xmlPullParser.getAttributeValue(str48, "value"));
                    } else if (e2.d.m(xmlPullParser, "Location")) {
                        uri2 = e2.a.m(uri.toString(), xmlPullParser.nextText());
                        arrayList = p5;
                        arrayList2 = arrayList31;
                        j13 = j31;
                    } else {
                        if (e2.d.m(xmlPullParser, "ServiceDescription")) {
                            long j32 = j3;
                            long j33 = j32;
                            long j34 = j33;
                            float f10 = -3.4028235E38f;
                            float f11 = -3.4028235E38f;
                            while (true) {
                                xmlPullParser.next();
                                if (e2.d.m(xmlPullParser, "Latency")) {
                                    arrayList = p5;
                                    String attributeValue6 = xmlPullParser.getAttributeValue(null, "target");
                                    j32 = attributeValue6 == null ? j3 : Long.parseLong(attributeValue6);
                                    String attributeValue7 = xmlPullParser.getAttributeValue(null, "min");
                                    j33 = attributeValue7 == null ? j3 : Long.parseLong(attributeValue7);
                                    String attributeValue8 = xmlPullParser.getAttributeValue(null, "max");
                                    j34 = attributeValue8 == null ? j3 : Long.parseLong(attributeValue8);
                                } else {
                                    arrayList = p5;
                                    if (e2.d.m(xmlPullParser, "PlaybackRate")) {
                                        String attributeValue9 = xmlPullParser.getAttributeValue(null, "min");
                                        f10 = attributeValue9 == null ? -3.4028235E38f : Float.parseFloat(attributeValue9);
                                        String attributeValue10 = xmlPullParser.getAttributeValue(null, "max");
                                        f11 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                                    }
                                }
                                long j35 = j32;
                                long j36 = j30;
                                long j37 = j33;
                                long j38 = i26;
                                long j39 = j34;
                                if (e2.d.l(xmlPullParser, "ServiceDescription")) {
                                    b2.d0 d0Var2 = new b2.d0();
                                    d0Var2.a = j35;
                                    d0Var2.b = j37;
                                    d0Var2.c = j39;
                                    d0Var2.d = f10;
                                    d0Var2.e = f11;
                                    d0Var = d0Var2;
                                    z11 = z10;
                                    j30 = j36;
                                    j10 = j38;
                                    j11 = j3;
                                    arrayList2 = arrayList31;
                                    j13 = j31;
                                    arrayList3 = arrayList30;
                                } else {
                                    j34 = j39;
                                    i26 = j38;
                                    p5 = arrayList;
                                    j33 = j37;
                                    j30 = j36;
                                    j32 = j35;
                                }
                            }
                        } else {
                            arrayList = p5;
                            long j40 = j30;
                            long j41 = i26;
                            if (!e2.d.m(xmlPullParser, "Period") || z13) {
                                z11 = z10;
                                j10 = j41;
                                j11 = j3;
                                arrayList2 = arrayList31;
                                j12 = j40;
                                j13 = j31;
                                arrayList3 = arrayList30;
                                b(xmlPullParser);
                            } else {
                                ArrayList arrayList32 = !arrayList31.isEmpty() ? arrayList31 : arrayList;
                                String str59 = "id";
                                String attributeValue11 = xmlPullParser.getAttributeValue(null, "id");
                                long i28 = i(xmlPullParser, "start", j31);
                                String str60 = "duration";
                                String str61 = "value";
                                long j42 = T != j3 ? T + i28 : j3;
                                long i29 = i(xmlPullParser, "duration", j3);
                                ArrayList arrayList33 = new ArrayList();
                                ArrayList arrayList34 = new ArrayList();
                                ArrayList arrayList35 = new ArrayList();
                                long j43 = j3;
                                String str62 = "schemeIdUri";
                                String str63 = "Period";
                                long j44 = j40;
                                s sVar2 = null;
                                boolean z14 = false;
                                while (true) {
                                    xmlPullParser.next();
                                    if (e2.d.m(xmlPullParser, str49)) {
                                        if (!z14) {
                                            j44 = d(xmlPullParser, j44);
                                            z14 = true;
                                        }
                                        arrayList35.addAll(e(xmlPullParser, arrayList32, z10));
                                        arrayList4 = arrayList32;
                                        str5 = str59;
                                        str = str49;
                                        str4 = str60;
                                        str3 = str61;
                                        z11 = z10;
                                        j14 = j44;
                                        str2 = str50;
                                        j10 = j41;
                                        j16 = j42;
                                        arrayList7 = arrayList33;
                                        arrayList5 = arrayList34;
                                        str6 = str63;
                                        j11 = -9223372036854775807L;
                                        arrayList6 = arrayList35;
                                        arrayList2 = arrayList31;
                                        j17 = i29;
                                        j12 = j40;
                                        j15 = j31;
                                    } else {
                                        j14 = j44;
                                        String str64 = "SegmentTemplate";
                                        if (e2.d.m(xmlPullParser, "AdaptationSet")) {
                                            if (arrayList35.isEmpty()) {
                                                arrayList8 = arrayList32;
                                                arrayList4 = arrayList8;
                                            } else {
                                                arrayList4 = arrayList32;
                                                arrayList8 = arrayList35;
                                            }
                                            String attributeValue12 = xmlPullParser.getAttributeValue(null, str59);
                                            long parseLong = attributeValue12 == null ? -1L : Long.parseLong(attributeValue12);
                                            int g10 = g(xmlPullParser);
                                            String str65 = "AdaptationSet";
                                            String attributeValue13 = xmlPullParser.getAttributeValue(null, "mimeType");
                                            ArrayList arrayList36 = arrayList35;
                                            ArrayList arrayList37 = arrayList31;
                                            String attributeValue14 = xmlPullParser.getAttributeValue(null, "codecs");
                                            long j45 = j31;
                                            String attributeValue15 = xmlPullParser.getAttributeValue(null, "scte214:supplementalCodecs");
                                            xmlPullParser.getAttributeValue(null, "scte214:supplementalProfiles");
                                            String str66 = str60;
                                            String attributeValue16 = xmlPullParser.getAttributeValue(null, "width");
                                            int parseInt3 = attributeValue16 == null ? -1 : Integer.parseInt(attributeValue16);
                                            String str67 = str61;
                                            String attributeValue17 = xmlPullParser.getAttributeValue(null, "height");
                                            int parseInt4 = attributeValue17 == null ? -1 : Integer.parseInt(attributeValue17);
                                            float j46 = j(xmlPullParser, -1.0f);
                                            String str68 = "SegmentList";
                                            String str69 = "SegmentBase";
                                            String attributeValue18 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                            int parseInt5 = attributeValue18 == null ? -1 : Integer.parseInt(attributeValue18);
                                            String attributeValue19 = xmlPullParser.getAttributeValue(null, str50);
                                            String str70 = "audioSamplingRate";
                                            String attributeValue20 = xmlPullParser.getAttributeValue(null, "label");
                                            ArrayList arrayList38 = new ArrayList();
                                            String str71 = attributeValue20;
                                            ArrayList arrayList39 = new ArrayList();
                                            ArrayList arrayList40 = arrayList38;
                                            ArrayList arrayList41 = new ArrayList();
                                            ArrayList arrayList42 = new ArrayList();
                                            float f12 = j46;
                                            ArrayList arrayList43 = new ArrayList();
                                            String str72 = "height";
                                            ArrayList arrayList44 = new ArrayList();
                                            String str73 = "width";
                                            ArrayList arrayList45 = new ArrayList();
                                            String str74 = "scte214:supplementalProfiles";
                                            ArrayList arrayList46 = new ArrayList();
                                            ArrayList arrayList47 = new ArrayList();
                                            String str75 = str59;
                                            String str76 = "mimeType";
                                            String str77 = "codecs";
                                            s sVar3 = sVar2;
                                            long j47 = j43;
                                            long j48 = j14;
                                            String str78 = attributeValue19;
                                            boolean z15 = false;
                                            int i30 = -1;
                                            String str79 = "scte214:supplementalCodecs";
                                            int i31 = g10;
                                            String str80 = null;
                                            while (true) {
                                                xmlPullParser.next();
                                                if (e2.d.m(xmlPullParser, str49)) {
                                                    if (!z15) {
                                                        j48 = d(xmlPullParser, j48);
                                                        z15 = true;
                                                    }
                                                    j21 = j48;
                                                    arrayList47.addAll(e(xmlPullParser, arrayList8, z10));
                                                } else {
                                                    j21 = j48;
                                                    if (e2.d.m(xmlPullParser, "ContentProtection")) {
                                                        Pair f13 = f(xmlPullParser);
                                                        Object obj = f13.first;
                                                        if (obj != null) {
                                                            str80 = (String) obj;
                                                        }
                                                        Object obj2 = f13.second;
                                                        if (obj2 != null) {
                                                            arrayList39.add((b2.n) obj2);
                                                        }
                                                    } else if (e2.d.m(xmlPullParser, "ContentComponent")) {
                                                        String attributeValue21 = xmlPullParser.getAttributeValue(null, str50);
                                                        if (str78 == null) {
                                                            str78 = attributeValue21;
                                                        } else if (attributeValue21 != null) {
                                                            e2.d.g(str78.equals(attributeValue21));
                                                        }
                                                        int g11 = g(xmlPullParser);
                                                        if (i31 == -1) {
                                                            i31 = g11;
                                                        } else if (g11 != -1) {
                                                            e2.d.g(i31 == g11);
                                                        }
                                                    } else {
                                                        if (e2.d.m(xmlPullParser, "Role")) {
                                                            arrayList43.add(h(xmlPullParser, "Role"));
                                                        } else {
                                                            String str81 = "AudioChannelConfiguration";
                                                            if (e2.d.m(xmlPullParser, "AudioChannelConfiguration")) {
                                                                i30 = c(xmlPullParser, attributeValue14);
                                                            } else {
                                                                String str82 = "ContentProtection";
                                                                if (e2.d.m(xmlPullParser, "Accessibility")) {
                                                                    arrayList42.add(h(xmlPullParser, "Accessibility"));
                                                                } else if (e2.d.m(xmlPullParser, "EssentialProperty")) {
                                                                    arrayList44.add(h(xmlPullParser, "EssentialProperty"));
                                                                } else {
                                                                    arrayList9 = arrayList39;
                                                                    if (e2.d.m(xmlPullParser, "SupplementalProperty")) {
                                                                        arrayList45.add(h(xmlPullParser, "SupplementalProperty"));
                                                                        arrayList10 = arrayList8;
                                                                        str11 = str78;
                                                                        i10 = i31;
                                                                        str = str49;
                                                                        arrayList11 = arrayList45;
                                                                        z11 = z10;
                                                                        arrayList15 = arrayList42;
                                                                        str24 = str50;
                                                                        arrayList7 = arrayList33;
                                                                        arrayList5 = arrayList34;
                                                                        str12 = str64;
                                                                        str13 = str65;
                                                                        str14 = str66;
                                                                        str15 = str67;
                                                                        str22 = str68;
                                                                        str23 = str69;
                                                                        arrayList17 = arrayList40;
                                                                        arrayList16 = arrayList41;
                                                                        f7 = f12;
                                                                        str16 = str74;
                                                                        str17 = str75;
                                                                        j23 = j47;
                                                                        arrayList12 = arrayList47;
                                                                        str18 = str79;
                                                                        str19 = str77;
                                                                        str20 = str76;
                                                                        j22 = j42;
                                                                        str21 = attributeValue14;
                                                                        arrayList14 = arrayList43;
                                                                        j10 = j41;
                                                                        j17 = i29;
                                                                        arrayList6 = arrayList36;
                                                                        arrayList2 = arrayList37;
                                                                        j12 = j40;
                                                                        j15 = j45;
                                                                        arrayList13 = arrayList44;
                                                                        j47 = j23;
                                                                        i11 = i10;
                                                                        str25 = str13;
                                                                        if (e2.d.l(xmlPullParser, str25)) {
                                                                            ArrayList arrayList48 = new ArrayList(arrayList46.size());
                                                                            int i32 = 0;
                                                                            while (i32 < arrayList46.size()) {
                                                                                ArrayList arrayList49 = arrayList46;
                                                                                d dVar = (d) arrayList49.get(i32);
                                                                                b2.r a2 = dVar.a.a();
                                                                                if (str71 == null || !arrayList17.isEmpty()) {
                                                                                    str45 = str71;
                                                                                    a2.c = i0.v(arrayList17);
                                                                                } else {
                                                                                    str45 = str71;
                                                                                    a2.b = str45;
                                                                                }
                                                                                String str83 = dVar.d;
                                                                                if (str83 == null) {
                                                                                    str83 = str80;
                                                                                }
                                                                                ArrayList arrayList50 = dVar.e;
                                                                                int i33 = i32;
                                                                                arrayList50.addAll(arrayList9);
                                                                                ArrayList arrayList51 = arrayList17;
                                                                                if (arrayList50.isEmpty()) {
                                                                                    j27 = j17;
                                                                                    str46 = str24;
                                                                                    arrayList46 = arrayList49;
                                                                                } else {
                                                                                    int i34 = 0;
                                                                                    while (true) {
                                                                                        if (i34 < arrayList50.size()) {
                                                                                            b2.n nVar = (b2.n) arrayList50.get(i34);
                                                                                            j27 = j17;
                                                                                            if (!b2.i.c.equals(nVar.b) || (str47 = nVar.c) == null) {
                                                                                                i34++;
                                                                                                j17 = j27;
                                                                                            } else {
                                                                                                arrayList50.remove(i34);
                                                                                            }
                                                                                        } else {
                                                                                            j27 = j17;
                                                                                            str47 = null;
                                                                                        }
                                                                                    }
                                                                                    if (str47 != null) {
                                                                                        int i35 = 0;
                                                                                        while (i35 < arrayList50.size()) {
                                                                                            b2.n nVar2 = (b2.n) arrayList50.get(i35);
                                                                                            String str84 = str24;
                                                                                            if (b2.i.b.equals(nVar2.b) && nVar2.c == null) {
                                                                                                arrayList29 = arrayList49;
                                                                                                arrayList50.set(i35, new b2.n(b2.i.c, str47, nVar2.d, nVar2.e));
                                                                                            } else {
                                                                                                arrayList29 = arrayList49;
                                                                                            }
                                                                                            i35++;
                                                                                            arrayList49 = arrayList29;
                                                                                            str24 = str84;
                                                                                        }
                                                                                    }
                                                                                    str46 = str24;
                                                                                    arrayList46 = arrayList49;
                                                                                    for (int size = arrayList50.size() - 1; size >= 0; size--) {
                                                                                        b2.n nVar3 = (b2.n) arrayList50.get(size);
                                                                                        if (nVar3.e == null) {
                                                                                            int i36 = 0;
                                                                                            while (true) {
                                                                                                if (i36 < arrayList50.size()) {
                                                                                                    b2.n nVar4 = (b2.n) arrayList50.get(i36);
                                                                                                    if (nVar4.e != null && nVar3.e == null && nVar4.a(nVar3.b)) {
                                                                                                        arrayList50.remove(size);
                                                                                                    } else {
                                                                                                        i36++;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    a2.u = new b2.o(str83, arrayList50);
                                                                                }
                                                                                ArrayList arrayList52 = dVar.f;
                                                                                arrayList52.addAll(arrayList16);
                                                                                b2.s sVar4 = new b2.s(a2);
                                                                                i0 i0Var = dVar.b;
                                                                                s sVar5 = dVar.c;
                                                                                ArrayList arrayList53 = dVar.g;
                                                                                ArrayList arrayList54 = dVar.h;
                                                                                if (sVar5 instanceof r) {
                                                                                    kVar = new l(sVar4, i0Var, (r) sVar5, arrayList52, arrayList53, arrayList54);
                                                                                } else {
                                                                                    if (!(sVar5 instanceof n)) {
                                                                                        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                                    }
                                                                                    kVar = new k(sVar4, i0Var, (n) sVar5, arrayList52, arrayList53, arrayList54);
                                                                                }
                                                                                arrayList48.add(kVar);
                                                                                i32 = i33 + 1;
                                                                                str71 = str45;
                                                                                arrayList17 = arrayList51;
                                                                                str24 = str46;
                                                                                j17 = j27;
                                                                            }
                                                                            str2 = str24;
                                                                            c11 = 1;
                                                                            arrayList7.add(new a(parseLong, i11, arrayList48, arrayList15, arrayList13, arrayList11));
                                                                            j16 = j22;
                                                                            str3 = str15;
                                                                            str4 = str14;
                                                                            str5 = str17;
                                                                            j11 = -9223372036854775807L;
                                                                        } else {
                                                                            c11 = 1;
                                                                            str65 = str25;
                                                                            arrayList40 = arrayList17;
                                                                            arrayList41 = arrayList16;
                                                                            str69 = str23;
                                                                            str64 = str12;
                                                                            arrayList37 = arrayList2;
                                                                            arrayList45 = arrayList11;
                                                                            arrayList44 = arrayList13;
                                                                            arrayList47 = arrayList12;
                                                                            j48 = j21;
                                                                            arrayList42 = arrayList15;
                                                                            arrayList8 = arrayList10;
                                                                            f12 = f7;
                                                                            str49 = str;
                                                                            arrayList33 = arrayList7;
                                                                            arrayList34 = arrayList5;
                                                                            str67 = str15;
                                                                            str66 = str14;
                                                                            str50 = str24;
                                                                            str68 = str22;
                                                                            j45 = j15;
                                                                            j40 = j12;
                                                                            i31 = i11;
                                                                            arrayList39 = arrayList9;
                                                                            i29 = j17;
                                                                            arrayList36 = arrayList6;
                                                                            attributeValue14 = str21;
                                                                            str78 = str11;
                                                                            j41 = j10;
                                                                            arrayList43 = arrayList14;
                                                                            z10 = z11;
                                                                            j42 = j22;
                                                                            str75 = str17;
                                                                            str76 = str20;
                                                                            str77 = str19;
                                                                            str79 = str18;
                                                                            str74 = str16;
                                                                        }
                                                                    } else {
                                                                        String str85 = str50;
                                                                        ArrayList arrayList55 = arrayList42;
                                                                        if (e2.d.m(xmlPullParser, "Representation")) {
                                                                            arrayList10 = arrayList8;
                                                                            if (arrayList47.isEmpty()) {
                                                                                str26 = "Representation";
                                                                                arrayList18 = arrayList10;
                                                                            } else {
                                                                                str26 = "Representation";
                                                                                arrayList18 = arrayList47;
                                                                            }
                                                                            String str86 = "SupplementalProperty";
                                                                            String str87 = str75;
                                                                            String str88 = "EssentialProperty";
                                                                            String attributeValue22 = xmlPullParser.getAttributeValue(null, str87);
                                                                            String str89 = str87;
                                                                            String attributeValue23 = xmlPullParser.getAttributeValue(null, "bandwidth");
                                                                            if (attributeValue23 == null) {
                                                                                str27 = str76;
                                                                                parseInt = -1;
                                                                            } else {
                                                                                String str90 = str76;
                                                                                parseInt = Integer.parseInt(attributeValue23);
                                                                                str27 = str90;
                                                                            }
                                                                            String attributeValue24 = xmlPullParser.getAttributeValue(null, str27);
                                                                            String str91 = str77;
                                                                            str20 = str27;
                                                                            String str92 = attributeValue24 == null ? attributeValue13 : attributeValue24;
                                                                            String attributeValue25 = xmlPullParser.getAttributeValue(null, str91);
                                                                            String str93 = str79;
                                                                            str19 = str91;
                                                                            String str94 = attributeValue25 == null ? attributeValue14 : attributeValue25;
                                                                            String attributeValue26 = xmlPullParser.getAttributeValue(null, str93);
                                                                            String str95 = str74;
                                                                            str18 = str93;
                                                                            String str96 = attributeValue26 == null ? attributeValue15 : attributeValue26;
                                                                            xmlPullParser.getAttributeValue(null, str95);
                                                                            str16 = str95;
                                                                            String str97 = str73;
                                                                            String attributeValue27 = xmlPullParser.getAttributeValue(null, str97);
                                                                            int parseInt6 = attributeValue27 == null ? parseInt3 : Integer.parseInt(attributeValue27);
                                                                            str73 = str97;
                                                                            String str98 = str72;
                                                                            String attributeValue28 = xmlPullParser.getAttributeValue(null, str98);
                                                                            int parseInt7 = attributeValue28 == null ? parseInt4 : Integer.parseInt(attributeValue28);
                                                                            str72 = str98;
                                                                            float f14 = f12;
                                                                            String str99 = "InbandEventStream";
                                                                            float j49 = j(xmlPullParser, f14);
                                                                            String str100 = str70;
                                                                            String attributeValue29 = xmlPullParser.getAttributeValue(null, str100);
                                                                            int parseInt8 = attributeValue29 == null ? parseInt5 : Integer.parseInt(attributeValue29);
                                                                            str70 = str100;
                                                                            ArrayList arrayList56 = new ArrayList();
                                                                            ArrayList arrayList57 = new ArrayList();
                                                                            ArrayList arrayList58 = new ArrayList(arrayList44);
                                                                            ArrayList arrayList59 = new ArrayList(arrayList45);
                                                                            ArrayList arrayList60 = new ArrayList();
                                                                            ArrayList arrayList61 = arrayList44;
                                                                            int i37 = parseInt8;
                                                                            String str101 = attributeValue14;
                                                                            int i38 = i31;
                                                                            s sVar6 = sVar3;
                                                                            long j50 = j47;
                                                                            int i39 = i30;
                                                                            long j51 = j21;
                                                                            boolean z16 = false;
                                                                            String str102 = null;
                                                                            while (true) {
                                                                                xmlPullParser.next();
                                                                                if (e2.d.m(xmlPullParser, str49)) {
                                                                                    if (!z16) {
                                                                                        j51 = d(xmlPullParser, j51);
                                                                                        z16 = true;
                                                                                    }
                                                                                    f7 = f14;
                                                                                    arrayList60.addAll(e(xmlPullParser, arrayList18, z10));
                                                                                } else {
                                                                                    f7 = f14;
                                                                                    if (e2.d.m(xmlPullParser, str81)) {
                                                                                        i39 = c(xmlPullParser, str94);
                                                                                    } else {
                                                                                        String str103 = str69;
                                                                                        if (e2.d.m(xmlPullParser, str103)) {
                                                                                            str28 = str81;
                                                                                            sVar6 = o(xmlPullParser, (r) sVar6);
                                                                                            str30 = str103;
                                                                                            str31 = str78;
                                                                                            str = str49;
                                                                                            arrayList11 = arrayList45;
                                                                                            z11 = z10;
                                                                                            str32 = str94;
                                                                                            arrayList7 = arrayList33;
                                                                                            arrayList5 = arrayList34;
                                                                                            str33 = str65;
                                                                                            str14 = str66;
                                                                                            str15 = str67;
                                                                                            str29 = str68;
                                                                                            str36 = str99;
                                                                                            arrayList19 = arrayList46;
                                                                                            i12 = parseInt;
                                                                                            str34 = str82;
                                                                                            str38 = str26;
                                                                                            str17 = str89;
                                                                                            i13 = i38;
                                                                                            arrayList23 = arrayList56;
                                                                                            arrayList25 = arrayList59;
                                                                                            i14 = i37;
                                                                                            arrayList12 = arrayList47;
                                                                                            arrayList21 = arrayList60;
                                                                                            arrayList22 = arrayList18;
                                                                                            str12 = str64;
                                                                                            str35 = str88;
                                                                                            sVar = sVar6;
                                                                                            j25 = j51;
                                                                                            j24 = i29;
                                                                                            j22 = j42;
                                                                                            str39 = str102;
                                                                                            str21 = str101;
                                                                                            arrayList20 = arrayList43;
                                                                                            j12 = j40;
                                                                                            j10 = j41;
                                                                                            arrayList6 = arrayList36;
                                                                                            arrayList2 = arrayList37;
                                                                                            j15 = j45;
                                                                                            arrayList13 = arrayList61;
                                                                                            j26 = j50;
                                                                                            arrayList24 = arrayList58;
                                                                                            i15 = i39;
                                                                                            if (e2.d.l(xmlPullParser, str38)) {
                                                                                                if (r0.i(str92)) {
                                                                                                    if (str32 != null) {
                                                                                                        for (String str104 : d0.b0(str32)) {
                                                                                                            d10 = r0.d(str104);
                                                                                                            if (d10 != null && r0.i(d10)) {
                                                                                                                str40 = d10;
                                                                                                                str41 = str92;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    d10 = null;
                                                                                                    str40 = d10;
                                                                                                    str41 = str92;
                                                                                                } else if (r0.m(str92)) {
                                                                                                    if (str32 != null) {
                                                                                                        for (String str105 : d0.b0(str32)) {
                                                                                                            d10 = r0.d(str105);
                                                                                                            if (d10 != null && r0.m(d10)) {
                                                                                                                str40 = d10;
                                                                                                                str41 = str92;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    d10 = null;
                                                                                                    str40 = d10;
                                                                                                    str41 = str92;
                                                                                                } else if (r0.l(str92) || r0.k(str92)) {
                                                                                                    str40 = str92;
                                                                                                    str41 = str40;
                                                                                                } else {
                                                                                                    str41 = str92;
                                                                                                    if ("application/mp4".equals(str41)) {
                                                                                                        str40 = r0.d(str32);
                                                                                                        if ("text/vtt".equals(str40)) {
                                                                                                            str40 = "application/x-mp4-vtt";
                                                                                                        }
                                                                                                    } else {
                                                                                                        str40 = null;
                                                                                                    }
                                                                                                }
                                                                                                if ("audio/eac3".equals(str40)) {
                                                                                                    int i40 = 0;
                                                                                                    while (i40 < arrayList25.size()) {
                                                                                                        f fVar = (f) arrayList25.get(i40);
                                                                                                        int i41 = i40;
                                                                                                        String str106 = fVar.a;
                                                                                                        String str107 = fVar.b;
                                                                                                        arrayList26 = arrayList25;
                                                                                                        if (("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str106) && "JOC".equals(str107)) || ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str106) && "ec+3".equals(str107))) {
                                                                                                            str40 = "audio/eac3-joc";
                                                                                                            if ("audio/eac3-joc".equals(str40)) {
                                                                                                                str43 = "ec+3";
                                                                                                                str42 = str96;
                                                                                                                if (r0.j(str43, str42)) {
                                                                                                                    str40 = "video/dolby-vision";
                                                                                                                    str43 = str42 != null ? str42 : str43;
                                                                                                                }
                                                                                                                i16 = 0;
                                                                                                                int i42 = 0;
                                                                                                                while (i16 < arrayList20.size()) {
                                                                                                                    ArrayList arrayList62 = arrayList20;
                                                                                                                    int i43 = i16;
                                                                                                                    f fVar2 = (f) arrayList62.get(i16);
                                                                                                                    long j52 = j24;
                                                                                                                    if (s6.a("urn:mpeg:dash:role:2011", fVar2.a)) {
                                                                                                                        String str108 = fVar2.b;
                                                                                                                        i42 |= (str108 != null && (str108.equals("forced_subtitle") || str108.equals("forced-subtitle"))) ? 2 : 0;
                                                                                                                    }
                                                                                                                    i16 = i43 + 1;
                                                                                                                    arrayList20 = arrayList62;
                                                                                                                    j24 = j52;
                                                                                                                }
                                                                                                                long j53 = j24;
                                                                                                                arrayList27 = arrayList20;
                                                                                                                i17 = 0;
                                                                                                                int i44 = 0;
                                                                                                                while (i17 < arrayList27.size()) {
                                                                                                                    f fVar3 = (f) arrayList27.get(i17);
                                                                                                                    int i45 = i17;
                                                                                                                    if (s6.a("urn:mpeg:dash:role:2011", fVar3.a)) {
                                                                                                                        i44 |= m(fVar3.b);
                                                                                                                    }
                                                                                                                    i17 = i45 + 1;
                                                                                                                }
                                                                                                                int i46 = i44;
                                                                                                                i18 = 0;
                                                                                                                int i47 = 0;
                                                                                                                while (i18 < arrayList55.size()) {
                                                                                                                    ArrayList arrayList63 = arrayList55;
                                                                                                                    int i48 = i18;
                                                                                                                    f fVar4 = (f) arrayList63.get(i18);
                                                                                                                    int i49 = i47;
                                                                                                                    String str109 = fVar4.a;
                                                                                                                    String str110 = str41;
                                                                                                                    String str111 = fVar4.b;
                                                                                                                    if (s6.a("urn:mpeg:dash:role:2011", str109)) {
                                                                                                                        i21 = m(str111);
                                                                                                                    } else if (s6.a("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar4.a)) {
                                                                                                                        if (str111 != null) {
                                                                                                                            switch (str111.hashCode()) {
                                                                                                                                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                                                                                                                    if (str111.equals("1")) {
                                                                                                                                        c10 = 0;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c10 = 65535;
                                                                                                                                    break;
                                                                                                                                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                                                                                                                    if (str111.equals("2")) {
                                                                                                                                        c10 = 1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c10 = 65535;
                                                                                                                                    break;
                                                                                                                                case 51:
                                                                                                                                    if (str111.equals("3")) {
                                                                                                                                        c10 = 2;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c10 = 65535;
                                                                                                                                    break;
                                                                                                                                case 52:
                                                                                                                                    if (str111.equals("4")) {
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
                                                                                                                                    if (str111.equals("6")) {
                                                                                                                                        c10 = 4;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c10 = 65535;
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            switch (c10) {
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
                                                                                                                                    i21 = 1;
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        i21 = 0;
                                                                                                                    } else {
                                                                                                                        i47 = i49;
                                                                                                                        i18 = i48 + 1;
                                                                                                                        arrayList55 = arrayList63;
                                                                                                                        str41 = str110;
                                                                                                                    }
                                                                                                                    i47 = i49 | i21;
                                                                                                                    i18 = i48 + 1;
                                                                                                                    arrayList55 = arrayList63;
                                                                                                                    str41 = str110;
                                                                                                                }
                                                                                                                String str112 = str41;
                                                                                                                ArrayList arrayList64 = arrayList55;
                                                                                                                int n10 = i46 | i47 | n(arrayList24) | n(arrayList26);
                                                                                                                i19 = 0;
                                                                                                                while (true) {
                                                                                                                    if (i19 >= arrayList24.size()) {
                                                                                                                        f fVar5 = (f) arrayList24.get(i19);
                                                                                                                        arrayList28 = arrayList24;
                                                                                                                        if ((s6.a("http://dashif.org/thumbnail_tile", fVar5.a) || s6.a("http://dashif.org/guidelines/thumbnail_tile", fVar5.a)) && (str44 = fVar5.b) != null) {
                                                                                                                            String str113 = d0.a;
                                                                                                                            String[] split = str44.split("x", -1);
                                                                                                                            if (split.length != 2) {
                                                                                                                                continue;
                                                                                                                            } else {
                                                                                                                                try {
                                                                                                                                    pair = Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[c11])));
                                                                                                                                } catch (NumberFormatException unused) {
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        i19++;
                                                                                                                        arrayList24 = arrayList28;
                                                                                                                    } else {
                                                                                                                        arrayList28 = arrayList24;
                                                                                                                        pair = null;
                                                                                                                    }
                                                                                                                }
                                                                                                                b2.r rVar = new b2.r();
                                                                                                                rVar.a = attributeValue22;
                                                                                                                rVar.p = r0.n(str112);
                                                                                                                rVar.q = r0.n(str40);
                                                                                                                rVar.j = str43;
                                                                                                                rVar.i = i12;
                                                                                                                rVar.e = i42;
                                                                                                                rVar.f = n10;
                                                                                                                String str114 = str31;
                                                                                                                rVar.d = str114;
                                                                                                                rVar.P = pair == null ? ((Integer) pair.first).intValue() : -1;
                                                                                                                rVar.Q = pair == null ? ((Integer) pair.second).intValue() : -1;
                                                                                                                if (r0.m(str40)) {
                                                                                                                    int i50 = parseInt6;
                                                                                                                    int i51 = parseInt7;
                                                                                                                    if (r0.i(str40)) {
                                                                                                                        rVar.I = i15;
                                                                                                                        rVar.J = i14;
                                                                                                                    } else if (r0.l(str40)) {
                                                                                                                        if ("application/cea-608".equals(str40)) {
                                                                                                                            for (int i52 = 0; i52 < arrayList64.size(); i52++) {
                                                                                                                                f fVar6 = (f) arrayList64.get(i52);
                                                                                                                                String str115 = fVar6.a;
                                                                                                                                String str116 = fVar6.b;
                                                                                                                                if ("urn:scte:dash:cc:cea-608:2015".equals(str115) && str116 != null) {
                                                                                                                                    Matcher matcher = c.matcher(str116);
                                                                                                                                    if (matcher.matches()) {
                                                                                                                                        parseInt2 = Integer.parseInt(matcher.group(1));
                                                                                                                                        rVar.N = parseInt2;
                                                                                                                                    } else {
                                                                                                                                        e2.a.n("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str116));
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            parseInt2 = -1;
                                                                                                                            rVar.N = parseInt2;
                                                                                                                        } else {
                                                                                                                            if ("application/cea-708".equals(str40)) {
                                                                                                                                for (int i53 = 0; i53 < arrayList64.size(); i53++) {
                                                                                                                                    f fVar7 = (f) arrayList64.get(i53);
                                                                                                                                    String str117 = fVar7.a;
                                                                                                                                    String str118 = fVar7.b;
                                                                                                                                    if ("urn:scte:dash:cc:cea-708:2015".equals(str117) && str118 != null) {
                                                                                                                                        Matcher matcher2 = d.matcher(str118);
                                                                                                                                        if (matcher2.matches()) {
                                                                                                                                            parseInt2 = Integer.parseInt(matcher2.group(1));
                                                                                                                                            rVar.N = parseInt2;
                                                                                                                                        } else {
                                                                                                                                            e2.a.n("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str118));
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            parseInt2 = -1;
                                                                                                                            rVar.N = parseInt2;
                                                                                                                        }
                                                                                                                        if (e2.d.l(xmlPullParser, str25)) {
                                                                                                                        }
                                                                                                                    } else if (r0.k(str40)) {
                                                                                                                        rVar.x = i50;
                                                                                                                        rVar.y = i51;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    rVar.x = parseInt6;
                                                                                                                    rVar.y = parseInt7;
                                                                                                                    rVar.B = j49;
                                                                                                                }
                                                                                                                b2.s sVar7 = new b2.s(rVar);
                                                                                                                d dVar2 = new d(sVar7, arrayList21.isEmpty() ? arrayList21 : arrayList22, sVar == null ? sVar : new r(null, 1L, 0L, 0L, 0L), str39, arrayList23, arrayList57, arrayList28, arrayList26);
                                                                                                                int h = r0.h(sVar7.r);
                                                                                                                i20 = i13;
                                                                                                                if (i20 != -1) {
                                                                                                                    if (h != -1) {
                                                                                                                        e2.d.g(i20 == h);
                                                                                                                    }
                                                                                                                    h = i20;
                                                                                                                }
                                                                                                                ArrayList arrayList65 = arrayList19;
                                                                                                                arrayList65.add(dVar2);
                                                                                                                arrayList46 = arrayList65;
                                                                                                                str11 = str114;
                                                                                                                arrayList15 = arrayList64;
                                                                                                                i11 = h;
                                                                                                                arrayList14 = arrayList27;
                                                                                                                arrayList17 = arrayList40;
                                                                                                                arrayList16 = arrayList41;
                                                                                                                str24 = str85;
                                                                                                                j17 = j53;
                                                                                                                str25 = str33;
                                                                                                                str22 = str29;
                                                                                                                str23 = str30;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i40 = i41 + 1;
                                                                                                            arrayList25 = arrayList26;
                                                                                                        }
                                                                                                    }
                                                                                                    arrayList26 = arrayList25;
                                                                                                    str40 = "audio/eac3";
                                                                                                    if ("audio/eac3-joc".equals(str40)) {
                                                                                                    }
                                                                                                } else {
                                                                                                    arrayList26 = arrayList25;
                                                                                                }
                                                                                                str42 = str96;
                                                                                                str43 = str32;
                                                                                                if (r0.j(str43, str42)) {
                                                                                                }
                                                                                                i16 = 0;
                                                                                                int i422 = 0;
                                                                                                while (i16 < arrayList20.size()) {
                                                                                                }
                                                                                                long j532 = j24;
                                                                                                arrayList27 = arrayList20;
                                                                                                i17 = 0;
                                                                                                int i442 = 0;
                                                                                                while (i17 < arrayList27.size()) {
                                                                                                }
                                                                                                int i462 = i442;
                                                                                                i18 = 0;
                                                                                                int i472 = 0;
                                                                                                while (i18 < arrayList55.size()) {
                                                                                                }
                                                                                                String str1122 = str41;
                                                                                                ArrayList arrayList642 = arrayList55;
                                                                                                int n102 = i462 | i472 | n(arrayList24) | n(arrayList26);
                                                                                                i19 = 0;
                                                                                                while (true) {
                                                                                                    if (i19 >= arrayList24.size()) {
                                                                                                    }
                                                                                                    i19++;
                                                                                                    arrayList24 = arrayList28;
                                                                                                }
                                                                                                b2.r rVar2 = new b2.r();
                                                                                                rVar2.a = attributeValue22;
                                                                                                rVar2.p = r0.n(str1122);
                                                                                                rVar2.q = r0.n(str40);
                                                                                                rVar2.j = str43;
                                                                                                rVar2.i = i12;
                                                                                                rVar2.e = i422;
                                                                                                rVar2.f = n102;
                                                                                                String str1142 = str31;
                                                                                                rVar2.d = str1142;
                                                                                                rVar2.P = pair == null ? ((Integer) pair.first).intValue() : -1;
                                                                                                rVar2.Q = pair == null ? ((Integer) pair.second).intValue() : -1;
                                                                                                if (r0.m(str40)) {
                                                                                                }
                                                                                                b2.s sVar72 = new b2.s(rVar2);
                                                                                                if (sVar == null) {
                                                                                                }
                                                                                                d dVar22 = new d(sVar72, arrayList21.isEmpty() ? arrayList21 : arrayList22, sVar == null ? sVar : new r(null, 1L, 0L, 0L, 0L), str39, arrayList23, arrayList57, arrayList28, arrayList26);
                                                                                                int h10 = r0.h(sVar72.r);
                                                                                                i20 = i13;
                                                                                                if (i20 != -1) {
                                                                                                }
                                                                                                ArrayList arrayList652 = arrayList19;
                                                                                                arrayList652.add(dVar22);
                                                                                                arrayList46 = arrayList652;
                                                                                                str11 = str1142;
                                                                                                arrayList15 = arrayList642;
                                                                                                i11 = h10;
                                                                                                arrayList14 = arrayList27;
                                                                                                arrayList17 = arrayList40;
                                                                                                arrayList16 = arrayList41;
                                                                                                str24 = str85;
                                                                                                j17 = j532;
                                                                                                str25 = str33;
                                                                                                str22 = str29;
                                                                                                str23 = str30;
                                                                                            } else {
                                                                                                arrayList58 = arrayList24;
                                                                                                arrayList59 = arrayList25;
                                                                                                long j54 = j24;
                                                                                                i39 = i15;
                                                                                                str26 = str38;
                                                                                                j51 = j25;
                                                                                                str99 = str36;
                                                                                                arrayList56 = arrayList23;
                                                                                                str82 = str34;
                                                                                                str101 = str21;
                                                                                                arrayList45 = arrayList11;
                                                                                                j50 = j26;
                                                                                                arrayList61 = arrayList13;
                                                                                                arrayList47 = arrayList12;
                                                                                                str81 = str28;
                                                                                                str102 = str39;
                                                                                                f14 = f7;
                                                                                                str49 = str;
                                                                                                str94 = str32;
                                                                                                i38 = i13;
                                                                                                arrayList46 = arrayList19;
                                                                                                str78 = str31;
                                                                                                i37 = i14;
                                                                                                str67 = str15;
                                                                                                str66 = str14;
                                                                                                str68 = str29;
                                                                                                str69 = str30;
                                                                                                c11 = 1;
                                                                                                j45 = j15;
                                                                                                arrayList37 = arrayList2;
                                                                                                arrayList36 = arrayList6;
                                                                                                j40 = j12;
                                                                                                sVar6 = sVar;
                                                                                                i29 = j54;
                                                                                                str89 = str17;
                                                                                                j41 = j10;
                                                                                                str64 = str12;
                                                                                                arrayList43 = arrayList20;
                                                                                                arrayList18 = arrayList22;
                                                                                                z10 = z11;
                                                                                                str92 = str92;
                                                                                                j42 = j22;
                                                                                                arrayList33 = arrayList7;
                                                                                                parseInt = i12;
                                                                                                str65 = str33;
                                                                                                str88 = str35;
                                                                                                arrayList60 = arrayList21;
                                                                                                arrayList34 = arrayList5;
                                                                                            }
                                                                                        } else {
                                                                                            str28 = str81;
                                                                                            String str119 = str68;
                                                                                            if (e2.d.m(xmlPullParser, str119)) {
                                                                                                arrayList12 = arrayList47;
                                                                                                str = str49;
                                                                                                long d11 = d(xmlPullParser, j50);
                                                                                                str29 = str119;
                                                                                                str30 = str103;
                                                                                                str31 = str78;
                                                                                                str32 = str94;
                                                                                                long j55 = i29;
                                                                                                long j56 = j42;
                                                                                                arrayList7 = arrayList33;
                                                                                                arrayList5 = arrayList34;
                                                                                                str33 = str65;
                                                                                                str14 = str66;
                                                                                                str15 = str67;
                                                                                                arrayList19 = arrayList46;
                                                                                                i12 = parseInt;
                                                                                                str34 = str82;
                                                                                                str17 = str89;
                                                                                                str21 = str101;
                                                                                                i13 = i38;
                                                                                                i14 = i37;
                                                                                                ArrayList arrayList66 = arrayList45;
                                                                                                arrayList20 = arrayList43;
                                                                                                arrayList21 = arrayList60;
                                                                                                j12 = j40;
                                                                                                long j57 = j41;
                                                                                                arrayList6 = arrayList36;
                                                                                                arrayList2 = arrayList37;
                                                                                                j15 = j45;
                                                                                                str35 = str88;
                                                                                                arrayList13 = arrayList61;
                                                                                                s p10 = p(xmlPullParser, (o) sVar6, j56, j55, j51, d11, j57);
                                                                                                j24 = j55;
                                                                                                j22 = j56;
                                                                                                j26 = d11;
                                                                                                j25 = j51;
                                                                                                str36 = str99;
                                                                                                str38 = str26;
                                                                                                arrayList24 = arrayList58;
                                                                                                arrayList25 = arrayList59;
                                                                                                i15 = i39;
                                                                                                z11 = z10;
                                                                                                arrayList11 = arrayList66;
                                                                                                j10 = j57;
                                                                                                arrayList22 = arrayList18;
                                                                                                str12 = str64;
                                                                                                sVar = p10;
                                                                                                arrayList23 = arrayList56;
                                                                                            } else {
                                                                                                str29 = str119;
                                                                                                str30 = str103;
                                                                                                str31 = str78;
                                                                                                long j58 = j51;
                                                                                                arrayList12 = arrayList47;
                                                                                                str = str49;
                                                                                                str32 = str94;
                                                                                                j24 = i29;
                                                                                                long j59 = j42;
                                                                                                arrayList7 = arrayList33;
                                                                                                arrayList5 = arrayList34;
                                                                                                String str120 = str64;
                                                                                                str33 = str65;
                                                                                                str14 = str66;
                                                                                                str15 = str67;
                                                                                                arrayList19 = arrayList46;
                                                                                                i12 = parseInt;
                                                                                                str34 = str82;
                                                                                                str17 = str89;
                                                                                                str21 = str101;
                                                                                                i13 = i38;
                                                                                                i14 = i37;
                                                                                                ArrayList arrayList67 = arrayList45;
                                                                                                arrayList20 = arrayList43;
                                                                                                arrayList21 = arrayList60;
                                                                                                j12 = j40;
                                                                                                long j60 = j41;
                                                                                                arrayList6 = arrayList36;
                                                                                                arrayList2 = arrayList37;
                                                                                                j15 = j45;
                                                                                                str35 = str88;
                                                                                                arrayList13 = arrayList61;
                                                                                                if (e2.d.m(xmlPullParser, str120)) {
                                                                                                    j10 = j60;
                                                                                                    long d12 = d(xmlPullParser, j50);
                                                                                                    arrayList22 = arrayList18;
                                                                                                    str12 = str120;
                                                                                                    z11 = z10;
                                                                                                    j25 = j58;
                                                                                                    s q6 = q(xmlPullParser, (p) sVar6, arrayList67, j59, j24, j25, d12, j10);
                                                                                                    arrayList11 = arrayList67;
                                                                                                    j22 = j59;
                                                                                                    j26 = d12;
                                                                                                    str36 = str99;
                                                                                                    str38 = str26;
                                                                                                    sVar = q6;
                                                                                                    arrayList23 = arrayList56;
                                                                                                } else {
                                                                                                    ArrayList arrayList68 = arrayList18;
                                                                                                    str12 = str120;
                                                                                                    j25 = j58;
                                                                                                    arrayList11 = arrayList67;
                                                                                                    arrayList22 = arrayList68;
                                                                                                    z11 = z10;
                                                                                                    j10 = j60;
                                                                                                    if (e2.d.m(xmlPullParser, str34)) {
                                                                                                        Pair f15 = f(xmlPullParser);
                                                                                                        Object obj3 = f15.first;
                                                                                                        if (obj3 != null) {
                                                                                                            str102 = (String) obj3;
                                                                                                        }
                                                                                                        Object obj4 = f15.second;
                                                                                                        if (obj4 != null) {
                                                                                                            arrayList23 = arrayList56;
                                                                                                            arrayList23.add((b2.n) obj4);
                                                                                                        } else {
                                                                                                            arrayList23 = arrayList56;
                                                                                                        }
                                                                                                        j26 = j50;
                                                                                                        j22 = j59;
                                                                                                        str36 = str99;
                                                                                                        str38 = str26;
                                                                                                        sVar = sVar6;
                                                                                                    } else {
                                                                                                        str36 = str99;
                                                                                                        arrayList23 = arrayList56;
                                                                                                        if (e2.d.m(xmlPullParser, str36)) {
                                                                                                            j26 = j50;
                                                                                                            arrayList57.add(h(xmlPullParser, str36));
                                                                                                            j22 = j59;
                                                                                                            str37 = str86;
                                                                                                            arrayList24 = arrayList58;
                                                                                                        } else {
                                                                                                            j26 = j50;
                                                                                                            ArrayList arrayList69 = arrayList57;
                                                                                                            if (e2.d.m(xmlPullParser, str35)) {
                                                                                                                arrayList57 = arrayList69;
                                                                                                                arrayList24 = arrayList58;
                                                                                                                arrayList24.add(h(xmlPullParser, str35));
                                                                                                                j22 = j59;
                                                                                                                str37 = str86;
                                                                                                            } else {
                                                                                                                arrayList57 = arrayList69;
                                                                                                                str37 = str86;
                                                                                                                arrayList24 = arrayList58;
                                                                                                                if (e2.d.m(xmlPullParser, str37)) {
                                                                                                                    j22 = j59;
                                                                                                                    arrayList25 = arrayList59;
                                                                                                                    arrayList25.add(h(xmlPullParser, str37));
                                                                                                                } else {
                                                                                                                    j22 = j59;
                                                                                                                    arrayList25 = arrayList59;
                                                                                                                    b(xmlPullParser);
                                                                                                                }
                                                                                                                str86 = str37;
                                                                                                                str38 = str26;
                                                                                                                sVar = sVar6;
                                                                                                                i15 = i39;
                                                                                                            }
                                                                                                        }
                                                                                                        arrayList25 = arrayList59;
                                                                                                        str86 = str37;
                                                                                                        str38 = str26;
                                                                                                        sVar = sVar6;
                                                                                                        i15 = i39;
                                                                                                    }
                                                                                                }
                                                                                                arrayList24 = arrayList58;
                                                                                                arrayList25 = arrayList59;
                                                                                                i15 = i39;
                                                                                            }
                                                                                            str39 = str102;
                                                                                            if (e2.d.l(xmlPullParser, str38)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str31 = str78;
                                                                                str = str49;
                                                                                arrayList11 = arrayList45;
                                                                                z11 = z10;
                                                                                str32 = str94;
                                                                                arrayList7 = arrayList33;
                                                                                arrayList5 = arrayList34;
                                                                                str33 = str65;
                                                                                str14 = str66;
                                                                                str15 = str67;
                                                                                str29 = str68;
                                                                                str30 = str69;
                                                                                str36 = str99;
                                                                                arrayList19 = arrayList46;
                                                                                i12 = parseInt;
                                                                                str34 = str82;
                                                                                str17 = str89;
                                                                                i13 = i38;
                                                                                arrayList23 = arrayList56;
                                                                                arrayList25 = arrayList59;
                                                                                i14 = i37;
                                                                                str28 = str81;
                                                                                arrayList12 = arrayList47;
                                                                                arrayList21 = arrayList60;
                                                                                arrayList22 = arrayList18;
                                                                                str12 = str64;
                                                                                str35 = str88;
                                                                                str38 = str26;
                                                                                sVar = sVar6;
                                                                                j25 = j51;
                                                                                j24 = i29;
                                                                                j22 = j42;
                                                                                str39 = str102;
                                                                                str21 = str101;
                                                                                arrayList20 = arrayList43;
                                                                                j12 = j40;
                                                                                j10 = j41;
                                                                                arrayList6 = arrayList36;
                                                                                arrayList2 = arrayList37;
                                                                                j15 = j45;
                                                                                arrayList13 = arrayList61;
                                                                                j26 = j50;
                                                                                arrayList24 = arrayList58;
                                                                                i15 = i39;
                                                                                if (e2.d.l(xmlPullParser, str38)) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            arrayList10 = arrayList8;
                                                                            str11 = str78;
                                                                            str = str49;
                                                                            arrayList11 = arrayList45;
                                                                            z11 = z10;
                                                                            long j61 = i29;
                                                                            arrayList7 = arrayList33;
                                                                            arrayList5 = arrayList34;
                                                                            str12 = str64;
                                                                            str13 = str65;
                                                                            str14 = str66;
                                                                            str15 = str67;
                                                                            String str121 = str68;
                                                                            f7 = f12;
                                                                            str16 = str74;
                                                                            str17 = str75;
                                                                            arrayList12 = arrayList47;
                                                                            j12 = j40;
                                                                            j15 = j45;
                                                                            str18 = str79;
                                                                            str19 = str77;
                                                                            str20 = str76;
                                                                            arrayList13 = arrayList44;
                                                                            j22 = j42;
                                                                            String str122 = str69;
                                                                            str21 = attributeValue14;
                                                                            int i54 = i31;
                                                                            arrayList14 = arrayList43;
                                                                            j10 = j41;
                                                                            arrayList6 = arrayList36;
                                                                            arrayList2 = arrayList37;
                                                                            if (e2.d.m(xmlPullParser, str122)) {
                                                                                sVar3 = o(xmlPullParser, (r) sVar3);
                                                                                str23 = str122;
                                                                                arrayList15 = arrayList55;
                                                                                i11 = i54;
                                                                                arrayList17 = arrayList40;
                                                                                arrayList16 = arrayList41;
                                                                                str24 = str85;
                                                                                j17 = j61;
                                                                                str25 = str13;
                                                                                str22 = str121;
                                                                            } else {
                                                                                str22 = str121;
                                                                                if (e2.d.m(xmlPullParser, str22)) {
                                                                                    long d13 = d(xmlPullParser, j47);
                                                                                    str23 = str122;
                                                                                    arrayList15 = arrayList55;
                                                                                    i10 = i54;
                                                                                    sVar3 = p(xmlPullParser, (o) sVar3, j22, j61, j21, d13, j10);
                                                                                    j10 = j10;
                                                                                    j17 = j61;
                                                                                    j47 = d13;
                                                                                } else {
                                                                                    str23 = str122;
                                                                                    arrayList15 = arrayList55;
                                                                                    i10 = i54;
                                                                                    long j62 = j47;
                                                                                    j17 = j61;
                                                                                    if (e2.d.m(xmlPullParser, str12)) {
                                                                                        long d14 = d(xmlPullParser, j62);
                                                                                        sVar3 = q(xmlPullParser, (p) sVar3, arrayList11, j22, j17, j21, d14, j10);
                                                                                        j47 = d14;
                                                                                    } else {
                                                                                        if (e2.d.m(xmlPullParser, "InbandEventStream")) {
                                                                                            arrayList16 = arrayList41;
                                                                                            arrayList16.add(h(xmlPullParser, "InbandEventStream"));
                                                                                            j23 = j62;
                                                                                            arrayList17 = arrayList40;
                                                                                            str24 = str85;
                                                                                        } else {
                                                                                            arrayList16 = arrayList41;
                                                                                            if (e2.d.m(xmlPullParser, "Label")) {
                                                                                                str24 = str85;
                                                                                                String attributeValue30 = xmlPullParser.getAttributeValue(null, str24);
                                                                                                String str123 = "";
                                                                                                while (true) {
                                                                                                    xmlPullParser.next();
                                                                                                    j23 = j62;
                                                                                                    if (xmlPullParser.getEventType() == 4) {
                                                                                                        str123 = xmlPullParser.getText();
                                                                                                    } else {
                                                                                                        b(xmlPullParser);
                                                                                                    }
                                                                                                    if (e2.d.l(xmlPullParser, "Label")) {
                                                                                                        arrayList17 = arrayList40;
                                                                                                        arrayList17.add(new w(attributeValue30, str123));
                                                                                                    } else {
                                                                                                        j62 = j23;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                j23 = j62;
                                                                                                arrayList17 = arrayList40;
                                                                                                str24 = str85;
                                                                                                if (xmlPullParser.getEventType() == 2) {
                                                                                                    b(xmlPullParser);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        j47 = j23;
                                                                                        i11 = i10;
                                                                                        str25 = str13;
                                                                                        if (e2.d.l(xmlPullParser, str25)) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                                arrayList17 = arrayList40;
                                                                                arrayList16 = arrayList41;
                                                                                str24 = str85;
                                                                                i11 = i10;
                                                                                str25 = str13;
                                                                                if (e2.d.l(xmlPullParser, str25)) {
                                                                                }
                                                                            }
                                                                        }
                                                                        if (e2.d.l(xmlPullParser, str25)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        arrayList10 = arrayList8;
                                                        str11 = str78;
                                                        i10 = i31;
                                                        str = str49;
                                                        arrayList11 = arrayList45;
                                                        z11 = z10;
                                                        arrayList9 = arrayList39;
                                                        arrayList15 = arrayList42;
                                                        str24 = str50;
                                                        arrayList7 = arrayList33;
                                                        arrayList5 = arrayList34;
                                                        str12 = str64;
                                                        str13 = str65;
                                                        str14 = str66;
                                                        str15 = str67;
                                                        str22 = str68;
                                                        str23 = str69;
                                                        arrayList17 = arrayList40;
                                                        arrayList16 = arrayList41;
                                                        f7 = f12;
                                                        str16 = str74;
                                                        str17 = str75;
                                                        j23 = j47;
                                                        arrayList12 = arrayList47;
                                                        str18 = str79;
                                                        str19 = str77;
                                                        str20 = str76;
                                                        j22 = j42;
                                                        str21 = attributeValue14;
                                                        arrayList14 = arrayList43;
                                                        j10 = j41;
                                                        j17 = i29;
                                                        arrayList6 = arrayList36;
                                                        arrayList2 = arrayList37;
                                                        j12 = j40;
                                                        j15 = j45;
                                                        arrayList13 = arrayList44;
                                                        j47 = j23;
                                                        i11 = i10;
                                                        str25 = str13;
                                                        if (e2.d.l(xmlPullParser, str25)) {
                                                        }
                                                    }
                                                }
                                                arrayList10 = arrayList8;
                                                str11 = str78;
                                                str = str49;
                                                arrayList11 = arrayList45;
                                                z11 = z10;
                                                arrayList9 = arrayList39;
                                                arrayList15 = arrayList42;
                                                arrayList7 = arrayList33;
                                                arrayList5 = arrayList34;
                                                str14 = str66;
                                                str15 = str67;
                                                str22 = str68;
                                                str23 = str69;
                                                arrayList17 = arrayList40;
                                                arrayList16 = arrayList41;
                                                f7 = f12;
                                                str16 = str74;
                                                str17 = str75;
                                                arrayList12 = arrayList47;
                                                str18 = str79;
                                                str19 = str77;
                                                str20 = str76;
                                                j22 = j42;
                                                str21 = attributeValue14;
                                                arrayList14 = arrayList43;
                                                j10 = j41;
                                                j17 = i29;
                                                arrayList6 = arrayList36;
                                                arrayList2 = arrayList37;
                                                i11 = i31;
                                                str24 = str50;
                                                j12 = j40;
                                                str12 = str64;
                                                j15 = j45;
                                                arrayList13 = arrayList44;
                                                str25 = str65;
                                                if (e2.d.l(xmlPullParser, str25)) {
                                                }
                                            }
                                        } else {
                                            arrayList4 = arrayList32;
                                            String str124 = str59;
                                            str = str49;
                                            String str125 = str60;
                                            String str126 = str61;
                                            z11 = z10;
                                            str2 = str50;
                                            j10 = j41;
                                            long j63 = i29;
                                            long j64 = j42;
                                            ArrayList arrayList70 = arrayList33;
                                            arrayList5 = arrayList34;
                                            arrayList6 = arrayList35;
                                            arrayList2 = arrayList31;
                                            j12 = j40;
                                            j15 = j31;
                                            if (e2.d.m(xmlPullParser, "EventStream")) {
                                                String str127 = str62;
                                                String attributeValue31 = xmlPullParser.getAttributeValue(null, str127);
                                                String str128 = attributeValue31 == null ? "" : attributeValue31;
                                                String str129 = str126;
                                                String attributeValue32 = xmlPullParser.getAttributeValue(null, str129);
                                                String str130 = attributeValue32 == null ? "" : attributeValue32;
                                                String attributeValue33 = xmlPullParser.getAttributeValue(null, "timescale");
                                                long parseLong2 = attributeValue33 == null ? 1L : Long.parseLong(attributeValue33);
                                                String attributeValue34 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
                                                long parseLong3 = attributeValue34 == null ? 0L : Long.parseLong(attributeValue34);
                                                ArrayList arrayList71 = new ArrayList();
                                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(512);
                                                while (true) {
                                                    xmlPullParser.next();
                                                    if (e2.d.m(xmlPullParser, "Event")) {
                                                        str10 = str124;
                                                        String attributeValue35 = xmlPullParser.getAttributeValue(null, str10);
                                                        long parseLong4 = attributeValue35 == null ? 0L : Long.parseLong(attributeValue35);
                                                        str9 = str125;
                                                        String attributeValue36 = xmlPullParser.getAttributeValue(null, str9);
                                                        long parseLong5 = attributeValue36 == null ? -9223372036854775807L : Long.parseLong(attributeValue36);
                                                        String attributeValue37 = xmlPullParser.getAttributeValue(null, "presentationTime");
                                                        long parseLong6 = attributeValue37 == null ? 0L : Long.parseLong(attributeValue37);
                                                        String str131 = d0.a;
                                                        RoundingMode roundingMode = RoundingMode.DOWN;
                                                        long Y = d0.Y(parseLong5, 1000L, parseLong2, roundingMode);
                                                        long Y2 = d0.Y(parseLong6 - parseLong3, 1000000L, parseLong2, roundingMode);
                                                        arrayList7 = arrayList70;
                                                        j19 = parseLong2;
                                                        str62 = str127;
                                                        String attributeValue38 = xmlPullParser.getAttributeValue(null, "messageData");
                                                        if (attributeValue38 == null) {
                                                            attributeValue38 = null;
                                                        }
                                                        byteArrayOutputStream3.reset();
                                                        XmlSerializer newSerializer = Xml.newSerializer();
                                                        str3 = str129;
                                                        newSerializer.setOutput(byteArrayOutputStream3, StandardCharsets.UTF_8.name());
                                                        xmlPullParser.nextToken();
                                                        while (!e2.d.l(xmlPullParser, "Event")) {
                                                            switch (xmlPullParser.getEventType()) {
                                                                case 0:
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    newSerializer.startDocument(null, Boolean.FALSE);
                                                                    break;
                                                                case 1:
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    newSerializer.endDocument();
                                                                    break;
                                                                case 2:
                                                                    j20 = parseLong3;
                                                                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    int i55 = 0;
                                                                    while (i55 < xmlPullParser.getAttributeCount()) {
                                                                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i55), xmlPullParser.getAttributeName(i55), xmlPullParser.getAttributeValue(i55));
                                                                        i55++;
                                                                        byteArrayOutputStream3 = byteArrayOutputStream3;
                                                                    }
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 3:
                                                                    j20 = parseLong3;
                                                                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 4:
                                                                    newSerializer.text(xmlPullParser.getText());
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 5:
                                                                    newSerializer.cdsect(xmlPullParser.getText());
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 6:
                                                                    newSerializer.entityRef(xmlPullParser.getText());
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 7:
                                                                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 8:
                                                                    newSerializer.processingInstruction(xmlPullParser.getText());
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 9:
                                                                    newSerializer.comment(xmlPullParser.getText());
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 10:
                                                                    newSerializer.docdecl(xmlPullParser.getText());
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                default:
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                            }
                                                            xmlPullParser.nextToken();
                                                            parseLong3 = j20;
                                                            byteArrayOutputStream3 = byteArrayOutputStream2;
                                                        }
                                                        j18 = parseLong3;
                                                        byteArrayOutputStream = byteArrayOutputStream3;
                                                        newSerializer.flush();
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        Long valueOf = Long.valueOf(Y2);
                                                        if (attributeValue38 != null) {
                                                            byteArray = attributeValue38.getBytes(StandardCharsets.UTF_8);
                                                        }
                                                        str7 = str128;
                                                        str8 = str130;
                                                        arrayList71.add(Pair.create(valueOf, new n3.a(str128, str130, Y, parseLong4, byteArray)));
                                                    } else {
                                                        arrayList7 = arrayList70;
                                                        str62 = str127;
                                                        str3 = str129;
                                                        j18 = parseLong3;
                                                        str7 = str128;
                                                        str8 = str130;
                                                        j19 = parseLong2;
                                                        str9 = str125;
                                                        str10 = str124;
                                                        byteArrayOutputStream = byteArrayOutputStream3;
                                                        b(xmlPullParser);
                                                    }
                                                    if (e2.d.l(xmlPullParser, "EventStream")) {
                                                        long[] jArr = new long[arrayList71.size()];
                                                        n3.a[] aVarArr = new n3.a[arrayList71.size()];
                                                        for (int i56 = 0; i56 < arrayList71.size(); i56++) {
                                                            Pair pair2 = (Pair) arrayList71.get(i56);
                                                            jArr[i56] = ((Long) pair2.first).longValue();
                                                            aVarArr[i56] = (n3.a) pair2.second;
                                                        }
                                                        arrayList5.add(new g(str7, str8, jArr, aVarArr));
                                                        str4 = str9;
                                                        j16 = j64;
                                                        j17 = j63;
                                                        j11 = -9223372036854775807L;
                                                        str5 = str10;
                                                    } else {
                                                        str128 = str7;
                                                        str130 = str8;
                                                        str124 = str10;
                                                        str125 = str9;
                                                        str127 = str62;
                                                        parseLong3 = j18;
                                                        byteArrayOutputStream3 = byteArrayOutputStream;
                                                        str129 = str3;
                                                        arrayList70 = arrayList7;
                                                        parseLong2 = j19;
                                                    }
                                                }
                                            } else {
                                                arrayList7 = arrayList70;
                                                str3 = str126;
                                                str4 = str125;
                                                if (e2.d.m(xmlPullParser, "SegmentBase")) {
                                                    sVar2 = o(xmlPullParser, null);
                                                    arrayList5 = arrayList5;
                                                    str6 = str63;
                                                    j16 = j64;
                                                    j17 = j63;
                                                    j11 = -9223372036854775807L;
                                                    str5 = str124;
                                                } else if (e2.d.m(xmlPullParser, "SegmentList")) {
                                                    j11 = -9223372036854775807L;
                                                    long d15 = d(xmlPullParser, -9223372036854775807L);
                                                    arrayList5 = arrayList5;
                                                    str5 = str124;
                                                    sVar2 = p(xmlPullParser, null, j64, j63, j14, d15, j10);
                                                    j10 = j10;
                                                    j17 = j63;
                                                    j16 = j64;
                                                    j43 = d15;
                                                } else {
                                                    arrayList5 = arrayList5;
                                                    j16 = j64;
                                                    j17 = j63;
                                                    j11 = -9223372036854775807L;
                                                    str5 = str124;
                                                    if (e2.d.m(xmlPullParser, str64)) {
                                                        long d16 = d(xmlPullParser, -9223372036854775807L);
                                                        g0 g0Var = i0.b;
                                                        sVar2 = q(xmlPullParser, null, a1.e, j16, j17, j14, d16, j10);
                                                        j43 = d16;
                                                    } else if (e2.d.m(xmlPullParser, "AssetIdentifier")) {
                                                        h(xmlPullParser, "AssetIdentifier");
                                                    } else {
                                                        b(xmlPullParser);
                                                    }
                                                }
                                            }
                                        }
                                        str6 = str63;
                                    }
                                    if (e2.d.l(xmlPullParser, str6)) {
                                        Pair create = Pair.create(new h(attributeValue11, i28, arrayList7, arrayList5), Long.valueOf(j17));
                                        h hVar = (h) create.first;
                                        if (hVar.b != j11) {
                                            long longValue = ((Long) create.second).longValue();
                                            j28 = longValue == j11 ? j11 : longValue + hVar.b;
                                            arrayList3 = arrayList30;
                                            arrayList3.add(hVar);
                                        } else {
                                            if (!equals) {
                                                throw s0.b("Unable to determine start of period " + arrayList30.size(), null);
                                            }
                                            arrayList3 = arrayList30;
                                            j28 = j15;
                                            z13 = true;
                                        }
                                        j13 = j28;
                                    } else {
                                        str63 = str6;
                                        j42 = j16;
                                        j31 = j15;
                                        j40 = j12;
                                        j44 = j14;
                                        arrayList32 = arrayList4;
                                        str60 = str4;
                                        str59 = str5;
                                        str50 = str2;
                                        str49 = str;
                                        arrayList33 = arrayList7;
                                        arrayList34 = arrayList5;
                                        i29 = j17;
                                        arrayList31 = arrayList2;
                                        arrayList35 = arrayList6;
                                        j41 = j10;
                                        z10 = z11;
                                        str61 = str3;
                                    }
                                }
                            }
                            j30 = j12;
                        }
                        if (!e2.d.l(xmlPullParser, "MPD")) {
                            if (i23 == j11) {
                                if (j13 != j11) {
                                    i23 = j13;
                                } else if (!equals) {
                                    throw s0.b("Unable to determine duration of static manifest.", null);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw s0.b("No periods found.", null);
                            }
                            return new c(T, i23, i24, equals, i25, j10, i27, T2, iVar, aVar, d0Var, uri2, arrayList3);
                        }
                        arrayList30 = arrayList3;
                        i26 = j10;
                        j29 = j11;
                        j31 = j13;
                        arrayList31 = arrayList2;
                        p5 = arrayList;
                        z10 = z11;
                        str48 = null;
                    }
                    z11 = z10;
                    arrayList3 = arrayList30;
                }
                j11 = j3;
            }
            j10 = i26;
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
            if (s6.a("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i11)).a)) {
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
            if (s6.a("http://dashif.org/guidelines/last-segment-number", fVar.a)) {
                j14 = Long.parseLong(fVar.b);
                break;
            }
            i10++;
        }
        long j23 = j14;
        long j24 = j12 == -9223372036854775807L ? j11 : j12;
        long j25 = j24 == Long.MAX_VALUE ? -9223372036854775807L : j24;
        lf.h s10 = s(xmlPullParser, "media", pVar != null ? pVar.k : null);
        lf.h s11 = s(xmlPullParser, "initialization", pVar != null ? pVar.j : null);
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
    public static lf.h s(XmlPullParser xmlPullParser, String str, lf.h hVar) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return hVar;
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
        return new lf.h(arrayList, arrayList2, arrayList3, 2);
    }

    @Override // y2.o
    public final Object n2(Uri uri, g2.k kVar) {
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
