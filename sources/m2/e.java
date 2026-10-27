package m2;

import a8.ng;
import a8.wb;
import a8.yb;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.car.app.navigation.model.Maneuver;
import b2.b0;
import b2.i0;
import b2.w;
import b2.w0;
import b2.x;
import b2.x0;
import e2.n0;
import f9.g0;
import f9.s1;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static long a(ArrayList arrayList, long j10, long j11, int i10, long j12) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            String str = n0.a;
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
    
        if (r13 == 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009d, code lost:
    
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        if (r13.equals("fa01") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a4, code lost:
    
        if (r13 == 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b7, code lost:
    
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
                        String[] d02 = n0.d0(str);
                        if (d02.length != 0) {
                            i10 = 18;
                            List B = new ng(new za.c(new e9.e('.', 0), 18)).B(wb.c(d02[0].trim()));
                            if (B.size() == 4 && ((String) B.get(0)).equals("ac-4")) {
                                String str2 = (String) B.get(3);
                                str2.getClass();
                                if (!str2.equals("03")) {
                                    if (str2.equals("04")) {
                                        i12 = 21;
                                        break;
                                    }
                                }
                                i12 = i10;
                                break;
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
                    String c12 = wb.c(attributeValue5);
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
            return f9.o.q(new b(parseInt, parseInt2, str, attributeValue3));
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
            String c11 = wb.c(attributeValue);
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
                            k6.m i12 = w3.p.i(decode);
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
        Matcher matcher = n0.e.matcher(attributeValue);
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
    /* JADX WARN: Removed duplicated region for block: B:193:0x1035 A[LOOP:5: B:183:0x041e->B:193:0x1035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0eae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0d03 A[LOOP:11: B:354:0x06c4->B:363:0x0d03, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0922 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0a59 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x141a A[LOOP:1: B:35:0x00d3->B:43:0x141a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x13e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0a15  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c k(XmlPullParser xmlPullParser, Uri uri) {
        int i10;
        boolean z10;
        int i11;
        int i12;
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
        String str3;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long j15;
        ArrayList arrayList7;
        String str4;
        long j16;
        long j17;
        String str5;
        String str6;
        String str7;
        long j18;
        ByteArrayOutputStream byteArrayOutputStream;
        String str8;
        String str9;
        long j19;
        String str10;
        String str11;
        long j20;
        ByteArrayOutputStream byteArrayOutputStream2;
        ArrayList arrayList8;
        long j21;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        String str12;
        String str13;
        String str14;
        float f7;
        String str15;
        String str16;
        String str17;
        ArrayList arrayList13;
        ArrayList arrayList14;
        String str18;
        String str19;
        String str20;
        long j22;
        String str21;
        String str22;
        String str23;
        String str24;
        int i13;
        ArrayList arrayList15;
        long j23;
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
        float f10;
        int parseInt3;
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
        String str39;
        ArrayList arrayList21;
        long j25;
        ArrayList arrayList22;
        long j26;
        String str40;
        ArrayList arrayList23;
        long j27;
        String str41;
        ArrayList arrayList24;
        long j28;
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
        ArrayList arrayList27;
        Pair pair;
        int parseInt4;
        String str48;
        int i20;
        int i21;
        String str49;
        long j29;
        String str50;
        m kVar;
        String str51;
        ArrayList arrayList28;
        long j30;
        int i22 = 0;
        String[] strArr = new String[0];
        String str52 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(",");
        }
        int length = strArr.length;
        int i23 = 0;
        while (true) {
            i10 = 1;
            if (i23 >= length) {
                z10 = false;
                break;
            }
            if (strArr[i23].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z10 = true;
                break;
            }
            i23++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long j31 = -9223372036854775807L;
        long V = attributeValue2 == null ? -9223372036854775807L : n0.V(attributeValue2);
        long i24 = i(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long i25 = i(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, TeXSymbolParser.TYPE_ATTR));
        long i26 = equals ? i(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long i27 = equals ? i(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long i28 = equals ? i(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long V2 = attributeValue3 == null ? -9223372036854775807L : n0.V(attributeValue3);
        long j32 = equals ? 0L : -9223372036854775807L;
        ArrayList q5 = f9.o.q(new b(z10 ? 1 : TLObject.FLAG_31, 1, uri.toString(), uri.toString()));
        ArrayList arrayList29 = new ArrayList();
        ArrayList arrayList30 = new ArrayList();
        long j33 = equals ? -9223372036854775807L : 0L;
        int i29 = 0;
        int i30 = 0;
        i iVar = null;
        t tVar = null;
        Uri uri2 = null;
        i0 i0Var = null;
        while (true) {
            xmlPullParser.next();
            String str53 = "BaseURL";
            if (e2.a.i(xmlPullParser, "BaseURL")) {
                if (i29 == 0) {
                    j32 = d(xmlPullParser, j32);
                    i29 = i10;
                }
                arrayList30.addAll(e(xmlPullParser, q5, z10));
                arrayList = q5;
                arrayList2 = arrayList30;
                j13 = j33;
                z11 = z10;
                i11 = i22;
                i12 = i10;
                arrayList3 = arrayList29;
                j11 = j31;
            } else {
                i11 = i22;
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
                        long j34 = j31;
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
                            arrayList = q5;
                            arrayList2 = arrayList30;
                            z11 = z10;
                            iVar = iVar2;
                            j11 = j34;
                            j13 = j33;
                            j10 = i27;
                        } else {
                            str57 = str60;
                            str58 = str61;
                            str59 = str62;
                            j31 = j34;
                        }
                    }
                } else {
                    long j35 = j31;
                    if (e2.a.i(xmlPullParser, "UTCTiming")) {
                        arrayList = q5;
                        arrayList2 = arrayList30;
                        j13 = j33;
                        tVar = new t(xmlPullParser.getAttributeValue(str52, "schemeIdUri"), xmlPullParser.getAttributeValue(str52, "value"));
                    } else if (e2.a.i(xmlPullParser, "Location")) {
                        uri2 = e2.e.g(uri.toString(), xmlPullParser.nextText());
                        arrayList = q5;
                        arrayList2 = arrayList30;
                        j13 = j33;
                    } else if (e2.a.i(xmlPullParser, "ServiceDescription")) {
                        float f11 = -3.4028235E38f;
                        float f12 = -3.4028235E38f;
                        long j36 = j35;
                        long j37 = j36;
                        long j38 = j37;
                        while (true) {
                            xmlPullParser.next();
                            if (e2.a.i(xmlPullParser, "Latency")) {
                                arrayList = q5;
                                String attributeValue6 = xmlPullParser.getAttributeValue(null, "target");
                                j36 = attributeValue6 == null ? j35 : Long.parseLong(attributeValue6);
                                String attributeValue7 = xmlPullParser.getAttributeValue(null, "min");
                                j37 = attributeValue7 == null ? j35 : Long.parseLong(attributeValue7);
                                String attributeValue8 = xmlPullParser.getAttributeValue(null, "max");
                                j38 = attributeValue8 == null ? j35 : Long.parseLong(attributeValue8);
                            } else {
                                arrayList = q5;
                                if (e2.a.i(xmlPullParser, "PlaybackRate")) {
                                    String attributeValue9 = xmlPullParser.getAttributeValue(null, "min");
                                    f11 = attributeValue9 == null ? -3.4028235E38f : Float.parseFloat(attributeValue9);
                                    String attributeValue10 = xmlPullParser.getAttributeValue(null, "max");
                                    f12 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                                }
                            }
                            long j39 = j36;
                            long j40 = j32;
                            long j41 = j37;
                            long j42 = i27;
                            long j43 = j38;
                            if (e2.a.h(xmlPullParser, "ServiceDescription")) {
                                i0 i0Var2 = new i0();
                                i0Var2.a = j39;
                                i0Var2.b = j41;
                                i0Var2.c = j43;
                                i0Var2.d = f11;
                                i0Var2.e = f12;
                                i0Var = i0Var2;
                                z11 = z10;
                                j32 = j40;
                                j10 = j42;
                                j11 = j35;
                                arrayList2 = arrayList30;
                                j13 = j33;
                            } else {
                                j38 = j43;
                                i27 = j42;
                                q5 = arrayList;
                                j37 = j41;
                                j32 = j40;
                                j36 = j39;
                            }
                        }
                    } else {
                        arrayList = q5;
                        long j44 = j32;
                        long j45 = i27;
                        if (e2.a.i(xmlPullParser, "Period") && i30 == 0) {
                            ArrayList arrayList31 = !arrayList30.isEmpty() ? arrayList30 : arrayList;
                            String str63 = "id";
                            String attributeValue11 = xmlPullParser.getAttributeValue(null, "id");
                            long i31 = i(xmlPullParser, "start", j33);
                            String str64 = "duration";
                            String str65 = "schemeIdUri";
                            long j46 = V != j35 ? V + i31 : j35;
                            long i32 = i(xmlPullParser, "duration", j35);
                            ArrayList arrayList32 = new ArrayList();
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = new ArrayList();
                            long j47 = j35;
                            String str66 = "value";
                            String str67 = "Period";
                            int i33 = i11;
                            long j48 = j44;
                            s sVar2 = null;
                            while (true) {
                                xmlPullParser.next();
                                if (e2.a.i(xmlPullParser, str53)) {
                                    if (i33 == 0) {
                                        j48 = d(xmlPullParser, j48);
                                        i33 = i12;
                                    }
                                    arrayList34.addAll(e(xmlPullParser, arrayList31, z10));
                                    arrayList4 = arrayList31;
                                    str5 = str63;
                                    str = str53;
                                    str2 = str64;
                                    str4 = str65;
                                    z11 = z10;
                                    j14 = j48;
                                    str3 = str54;
                                    j10 = j45;
                                    j16 = j46;
                                    arrayList7 = arrayList32;
                                    arrayList5 = arrayList33;
                                    str6 = str67;
                                    j11 = -9223372036854775807L;
                                    arrayList6 = arrayList34;
                                    arrayList2 = arrayList30;
                                    j12 = j44;
                                    j17 = i32;
                                    j15 = j33;
                                } else {
                                    j14 = j48;
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
                                        int g7 = g(xmlPullParser);
                                        String str69 = "AdaptationSet";
                                        String attributeValue13 = xmlPullParser.getAttributeValue(null, "mimeType");
                                        ArrayList arrayList35 = arrayList34;
                                        ArrayList arrayList36 = arrayList30;
                                        String attributeValue14 = xmlPullParser.getAttributeValue(null, "codecs");
                                        long j49 = j33;
                                        String attributeValue15 = xmlPullParser.getAttributeValue(null, "scte214:supplementalCodecs");
                                        String attributeValue16 = xmlPullParser.getAttributeValue(null, "scte214:supplementalProfiles");
                                        String str70 = str64;
                                        String attributeValue17 = xmlPullParser.getAttributeValue(null, "width");
                                        int parseInt5 = attributeValue17 == null ? -1 : Integer.parseInt(attributeValue17);
                                        String str71 = str65;
                                        String attributeValue18 = xmlPullParser.getAttributeValue(null, "height");
                                        int parseInt6 = attributeValue18 == null ? -1 : Integer.parseInt(attributeValue18);
                                        float j50 = j(xmlPullParser, -1.0f);
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
                                        float f13 = j50;
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
                                        int i34 = i11;
                                        s sVar3 = sVar2;
                                        long j51 = j47;
                                        long j52 = j14;
                                        String str82 = attributeValue20;
                                        int i35 = -1;
                                        String str83 = "scte214:supplementalCodecs";
                                        int i36 = g7;
                                        String str84 = null;
                                        while (true) {
                                            xmlPullParser.next();
                                            if (e2.a.i(xmlPullParser, str53)) {
                                                if (i34 == 0) {
                                                    j52 = d(xmlPullParser, j52);
                                                    i34 = i12;
                                                }
                                                j21 = j52;
                                                arrayList46.addAll(e(xmlPullParser, arrayList8, z10));
                                            } else {
                                                j21 = j52;
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
                                                        yb.p(str82.equals(attributeValue22));
                                                    }
                                                    int g10 = g(xmlPullParser);
                                                    if (i36 == -1) {
                                                        i36 = g10;
                                                    } else if (g10 != -1) {
                                                        yb.p(i36 == g10 ? i12 : i11);
                                                    }
                                                    arrayList11 = arrayList43;
                                                    arrayList12 = arrayList8;
                                                    str24 = str82;
                                                    str = str53;
                                                    z11 = z10;
                                                    arrayList9 = arrayList38;
                                                    arrayList10 = arrayList41;
                                                    j23 = j46;
                                                    arrayList7 = arrayList32;
                                                    arrayList5 = arrayList33;
                                                    str26 = str69;
                                                    arrayList6 = arrayList35;
                                                    str2 = str70;
                                                    str14 = str71;
                                                    str22 = str72;
                                                    str23 = str73;
                                                    arrayList17 = arrayList39;
                                                    f7 = f13;
                                                    str15 = str77;
                                                    str16 = str78;
                                                    str17 = str79;
                                                    i14 = i36;
                                                    arrayList13 = arrayList46;
                                                    str25 = str54;
                                                    str12 = str68;
                                                    str18 = str83;
                                                    str19 = str81;
                                                    str20 = str80;
                                                    arrayList14 = arrayList44;
                                                    j22 = i32;
                                                    str21 = attributeValue14;
                                                    arrayList15 = arrayList42;
                                                    j10 = j45;
                                                    arrayList2 = arrayList36;
                                                    arrayList16 = arrayList40;
                                                    j12 = j44;
                                                    j15 = j49;
                                                    if (e2.a.h(xmlPullParser, str26)) {
                                                        i12 = 1;
                                                        str69 = str26;
                                                        arrayList39 = arrayList17;
                                                        arrayList40 = arrayList16;
                                                        str73 = str23;
                                                        j49 = j15;
                                                        arrayList36 = arrayList2;
                                                        j44 = j12;
                                                        attributeValue14 = str21;
                                                        arrayList44 = arrayList14;
                                                        arrayList46 = arrayList13;
                                                        j52 = j21;
                                                        arrayList41 = arrayList10;
                                                        arrayList43 = arrayList11;
                                                        f13 = f7;
                                                        str53 = str;
                                                        arrayList32 = arrayList7;
                                                        arrayList33 = arrayList5;
                                                        str71 = str14;
                                                        str70 = str2;
                                                        j45 = j10;
                                                        str72 = str22;
                                                        str68 = str12;
                                                        arrayList42 = arrayList15;
                                                        z10 = z11;
                                                        i32 = j22;
                                                        arrayList38 = arrayList9;
                                                        str79 = str17;
                                                        str54 = str25;
                                                        i36 = i14;
                                                        str80 = str20;
                                                        arrayList35 = arrayList6;
                                                        str81 = str19;
                                                        str83 = str18;
                                                        j46 = j23;
                                                        str78 = str16;
                                                        arrayList8 = arrayList12;
                                                        str82 = str24;
                                                        str77 = str15;
                                                    } else {
                                                        ArrayList arrayList47 = new ArrayList(arrayList45.size());
                                                        int i37 = i11;
                                                        while (i37 < arrayList45.size()) {
                                                            ArrayList arrayList48 = arrayList45;
                                                            d dVar = (d) arrayList48.get(i37);
                                                            w a2 = dVar.a.a();
                                                            if (str75 == null || !arrayList17.isEmpty()) {
                                                                str49 = str75;
                                                                a2.c = f9.i0.u(arrayList17);
                                                            } else {
                                                                str49 = str75;
                                                                a2.b = str49;
                                                            }
                                                            String str85 = dVar.d;
                                                            if (str85 == null) {
                                                                str85 = str84;
                                                            }
                                                            ArrayList arrayList49 = dVar.e;
                                                            int i38 = i37;
                                                            arrayList49.addAll(arrayList9);
                                                            ArrayList arrayList50 = arrayList17;
                                                            if (arrayList49.isEmpty()) {
                                                                j29 = j23;
                                                                str50 = str25;
                                                                arrayList45 = arrayList48;
                                                            } else {
                                                                int i39 = i11;
                                                                while (true) {
                                                                    if (i39 < arrayList49.size()) {
                                                                        b2.s sVar4 = (b2.s) arrayList49.get(i39);
                                                                        j29 = j23;
                                                                        if (!b2.n.d.equals(sVar4.b) || (str51 = sVar4.c) == null) {
                                                                            i39++;
                                                                            j23 = j29;
                                                                        } else {
                                                                            arrayList49.remove(i39);
                                                                        }
                                                                    } else {
                                                                        j29 = j23;
                                                                        str51 = null;
                                                                    }
                                                                }
                                                                if (str51 != null) {
                                                                    int i40 = i11;
                                                                    while (i40 < arrayList49.size()) {
                                                                        b2.s sVar5 = (b2.s) arrayList49.get(i40);
                                                                        String str86 = str25;
                                                                        if (b2.n.c.equals(sVar5.b) && sVar5.c == null) {
                                                                            arrayList28 = arrayList48;
                                                                            arrayList49.set(i40, new b2.s(b2.n.d, str51, sVar5.d, sVar5.e));
                                                                        } else {
                                                                            arrayList28 = arrayList48;
                                                                        }
                                                                        i40++;
                                                                        arrayList48 = arrayList28;
                                                                        str25 = str86;
                                                                    }
                                                                }
                                                                str50 = str25;
                                                                arrayList45 = arrayList48;
                                                                for (int size = arrayList49.size() - 1; size >= 0; size--) {
                                                                    b2.s sVar6 = (b2.s) arrayList49.get(size);
                                                                    if (sVar6.e == null) {
                                                                        int i41 = i11;
                                                                        while (true) {
                                                                            if (i41 < arrayList49.size()) {
                                                                                b2.s sVar7 = (b2.s) arrayList49.get(i41);
                                                                                if (sVar7.e != null && sVar6.e == null && sVar7.a(sVar6.b)) {
                                                                                    arrayList49.remove(size);
                                                                                } else {
                                                                                    i41++;
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
                                                            f9.i0 i0Var3 = dVar.b;
                                                            s sVar8 = dVar.c;
                                                            ArrayList arrayList52 = dVar.g;
                                                            ArrayList arrayList53 = dVar.h;
                                                            if (sVar8 instanceof r) {
                                                                kVar = new l(xVar, i0Var3, (r) sVar8, arrayList51, arrayList52, arrayList53);
                                                            } else {
                                                                if (!(sVar8 instanceof n)) {
                                                                    throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                }
                                                                kVar = new k(xVar, i0Var3, (n) sVar8, arrayList51, arrayList52, arrayList53);
                                                            }
                                                            arrayList47.add(kVar);
                                                            i37 = i38 + 1;
                                                            str75 = str49;
                                                            j23 = j29;
                                                            arrayList17 = arrayList50;
                                                            str25 = str50;
                                                        }
                                                        str3 = str25;
                                                        i12 = 1;
                                                        arrayList7.add(new a(parseLong, i14, arrayList47, arrayList10, arrayList11, arrayList14));
                                                        j16 = j23;
                                                        j17 = j22;
                                                        str4 = str14;
                                                        str5 = str17;
                                                        j11 = -9223372036854775807L;
                                                    }
                                                } else {
                                                    if (e2.a.i(xmlPullParser, "Role")) {
                                                        arrayList42.add(h(xmlPullParser, "Role"));
                                                    } else {
                                                        String str87 = "AudioChannelConfiguration";
                                                        if (e2.a.i(xmlPullParser, "AudioChannelConfiguration")) {
                                                            arrayList11 = arrayList43;
                                                            i35 = c(xmlPullParser, attributeValue14);
                                                            arrayList12 = arrayList8;
                                                            str24 = str82;
                                                            str = str53;
                                                            z11 = z10;
                                                            arrayList9 = arrayList38;
                                                            arrayList10 = arrayList41;
                                                            j23 = j46;
                                                            arrayList7 = arrayList32;
                                                            arrayList5 = arrayList33;
                                                            str26 = str69;
                                                            arrayList6 = arrayList35;
                                                            str2 = str70;
                                                            str14 = str71;
                                                            str22 = str72;
                                                            str23 = str73;
                                                            arrayList17 = arrayList39;
                                                            f7 = f13;
                                                            str15 = str77;
                                                            str16 = str78;
                                                            str17 = str79;
                                                            i14 = i36;
                                                            arrayList13 = arrayList46;
                                                            str25 = str54;
                                                            str12 = str68;
                                                            str18 = str83;
                                                            str19 = str81;
                                                            str20 = str80;
                                                            arrayList14 = arrayList44;
                                                            j22 = i32;
                                                            str21 = attributeValue14;
                                                            arrayList15 = arrayList42;
                                                            j10 = j45;
                                                            arrayList2 = arrayList36;
                                                            arrayList16 = arrayList40;
                                                            j12 = j44;
                                                            j15 = j49;
                                                            if (e2.a.h(xmlPullParser, str26)) {
                                                            }
                                                        } else {
                                                            String str88 = "ContentProtection";
                                                            if (e2.a.i(xmlPullParser, "Accessibility")) {
                                                                arrayList41.add(h(xmlPullParser, "Accessibility"));
                                                            } else if (e2.a.i(xmlPullParser, "EssentialProperty")) {
                                                                arrayList43.add(h(xmlPullParser, "EssentialProperty"));
                                                            } else {
                                                                arrayList9 = arrayList38;
                                                                if (e2.a.i(xmlPullParser, "SupplementalProperty")) {
                                                                    arrayList44.add(h(xmlPullParser, "SupplementalProperty"));
                                                                    arrayList11 = arrayList43;
                                                                    arrayList12 = arrayList8;
                                                                    str24 = str82;
                                                                    i13 = i36;
                                                                    str = str53;
                                                                    z11 = z10;
                                                                    arrayList10 = arrayList41;
                                                                    str25 = str54;
                                                                    j23 = j46;
                                                                    arrayList7 = arrayList32;
                                                                    arrayList5 = arrayList33;
                                                                    str12 = str68;
                                                                    str13 = str69;
                                                                    arrayList6 = arrayList35;
                                                                    str2 = str70;
                                                                    str14 = str71;
                                                                    str22 = str72;
                                                                    str23 = str73;
                                                                    arrayList17 = arrayList39;
                                                                    f7 = f13;
                                                                    str15 = str77;
                                                                    str16 = str78;
                                                                    str17 = str79;
                                                                    j24 = j51;
                                                                    arrayList13 = arrayList46;
                                                                    arrayList14 = arrayList44;
                                                                    str18 = str83;
                                                                    str19 = str81;
                                                                    str20 = str80;
                                                                    j22 = i32;
                                                                    str21 = attributeValue14;
                                                                    arrayList15 = arrayList42;
                                                                    j10 = j45;
                                                                    arrayList2 = arrayList36;
                                                                    arrayList16 = arrayList40;
                                                                    j12 = j44;
                                                                    j15 = j49;
                                                                    j51 = j24;
                                                                    i14 = i13;
                                                                    str26 = str13;
                                                                    if (e2.a.h(xmlPullParser, str26)) {
                                                                    }
                                                                } else {
                                                                    String str89 = str54;
                                                                    arrayList10 = arrayList41;
                                                                    if (e2.a.i(xmlPullParser, "Representation")) {
                                                                        arrayList12 = arrayList8;
                                                                        if (arrayList46.isEmpty()) {
                                                                            str27 = "Representation";
                                                                            arrayList18 = arrayList12;
                                                                        } else {
                                                                            str27 = "Representation";
                                                                            arrayList18 = arrayList46;
                                                                        }
                                                                        String str90 = "SupplementalProperty";
                                                                        String str91 = str79;
                                                                        String str92 = "EssentialProperty";
                                                                        String attributeValue23 = xmlPullParser.getAttributeValue(null, str91);
                                                                        String str93 = str91;
                                                                        String attributeValue24 = xmlPullParser.getAttributeValue(null, "bandwidth");
                                                                        if (attributeValue24 == null) {
                                                                            str28 = str80;
                                                                            parseInt = -1;
                                                                        } else {
                                                                            String str94 = str80;
                                                                            parseInt = Integer.parseInt(attributeValue24);
                                                                            str28 = str94;
                                                                        }
                                                                        String attributeValue25 = xmlPullParser.getAttributeValue(null, str28);
                                                                        String str95 = str81;
                                                                        str20 = str28;
                                                                        String str96 = attributeValue25 == null ? attributeValue13 : attributeValue25;
                                                                        String attributeValue26 = xmlPullParser.getAttributeValue(null, str95);
                                                                        String str97 = str83;
                                                                        str19 = str95;
                                                                        String str98 = attributeValue26 == null ? attributeValue14 : attributeValue26;
                                                                        String attributeValue27 = xmlPullParser.getAttributeValue(null, str97);
                                                                        String str99 = str78;
                                                                        str18 = str97;
                                                                        String str100 = attributeValue27 == null ? attributeValue15 : attributeValue27;
                                                                        String attributeValue28 = xmlPullParser.getAttributeValue(null, str99);
                                                                        String str101 = str77;
                                                                        str16 = str99;
                                                                        String str102 = attributeValue28 == null ? attributeValue16 : attributeValue28;
                                                                        String attributeValue29 = xmlPullParser.getAttributeValue(null, str101);
                                                                        if (attributeValue29 == null) {
                                                                            String str103 = str76;
                                                                            str29 = str101;
                                                                            str30 = str103;
                                                                            parseInt2 = parseInt5;
                                                                        } else {
                                                                            String str104 = str76;
                                                                            str29 = str101;
                                                                            str30 = str104;
                                                                            parseInt2 = Integer.parseInt(attributeValue29);
                                                                        }
                                                                        String attributeValue30 = xmlPullParser.getAttributeValue(null, str30);
                                                                        if (attributeValue30 == null) {
                                                                            float f15 = f13;
                                                                            str31 = str30;
                                                                            f10 = f15;
                                                                            parseInt3 = parseInt6;
                                                                        } else {
                                                                            float f16 = f13;
                                                                            str31 = str30;
                                                                            f10 = f16;
                                                                            parseInt3 = Integer.parseInt(attributeValue30);
                                                                        }
                                                                        String str105 = "InbandEventStream";
                                                                        float j53 = j(xmlPullParser, f10);
                                                                        String str106 = str74;
                                                                        String attributeValue31 = xmlPullParser.getAttributeValue(null, str106);
                                                                        int parseInt8 = attributeValue31 == null ? parseInt7 : Integer.parseInt(attributeValue31);
                                                                        str74 = str106;
                                                                        ArrayList arrayList54 = new ArrayList();
                                                                        ArrayList arrayList55 = new ArrayList();
                                                                        ArrayList arrayList56 = new ArrayList(arrayList43);
                                                                        ArrayList arrayList57 = new ArrayList(arrayList44);
                                                                        ArrayList arrayList58 = new ArrayList();
                                                                        arrayList11 = arrayList43;
                                                                        int i42 = parseInt8;
                                                                        String str107 = attributeValue14;
                                                                        int i43 = i36;
                                                                        int i44 = i11;
                                                                        s sVar9 = sVar3;
                                                                        long j54 = j51;
                                                                        int i45 = i35;
                                                                        long j55 = j21;
                                                                        String str108 = null;
                                                                        while (true) {
                                                                            xmlPullParser.next();
                                                                            if (e2.a.i(xmlPullParser, str53)) {
                                                                                if (i44 == 0) {
                                                                                    j55 = d(xmlPullParser, j55);
                                                                                    i44 = i12;
                                                                                }
                                                                                f7 = f10;
                                                                                arrayList58.addAll(e(xmlPullParser, arrayList18, z10));
                                                                            } else {
                                                                                f7 = f10;
                                                                                if (e2.a.i(xmlPullParser, str87)) {
                                                                                    i45 = c(xmlPullParser, str98);
                                                                                } else {
                                                                                    String str109 = str73;
                                                                                    if (e2.a.i(xmlPullParser, str109)) {
                                                                                        str32 = str87;
                                                                                        str34 = str109;
                                                                                        str35 = str82;
                                                                                        str = str53;
                                                                                        z11 = z10;
                                                                                        str36 = str98;
                                                                                        arrayList7 = arrayList32;
                                                                                        arrayList5 = arrayList33;
                                                                                        str37 = str69;
                                                                                        str2 = str70;
                                                                                        str14 = str71;
                                                                                        str33 = str72;
                                                                                        str15 = str29;
                                                                                        arrayList19 = arrayList45;
                                                                                        i15 = parseInt;
                                                                                        str38 = str88;
                                                                                        str42 = str27;
                                                                                        str17 = str93;
                                                                                        str40 = str105;
                                                                                        i16 = i43;
                                                                                        sVar = o(xmlPullParser, (r) sVar9);
                                                                                        arrayList25 = arrayList57;
                                                                                        i17 = i42;
                                                                                        arrayList13 = arrayList46;
                                                                                        arrayList20 = arrayList58;
                                                                                        arrayList22 = arrayList18;
                                                                                        str12 = str68;
                                                                                        str76 = str31;
                                                                                        str39 = str92;
                                                                                        str43 = str108;
                                                                                        j26 = j55;
                                                                                        arrayList14 = arrayList44;
                                                                                        j25 = i32;
                                                                                        str21 = str107;
                                                                                        arrayList23 = arrayList54;
                                                                                        arrayList21 = arrayList42;
                                                                                        j10 = j45;
                                                                                        arrayList2 = arrayList36;
                                                                                        arrayList6 = arrayList35;
                                                                                        j27 = j54;
                                                                                        j12 = j44;
                                                                                        j15 = j49;
                                                                                        arrayList24 = arrayList56;
                                                                                        i18 = i45;
                                                                                        j28 = j46;
                                                                                        if (e2.a.h(xmlPullParser, str42)) {
                                                                                            if (w0.i(str96)) {
                                                                                                if (str36 != null) {
                                                                                                    String[] d02 = n0.d0(str36);
                                                                                                    int length2 = d02.length;
                                                                                                    for (int i46 = i11; i46 < length2; i46++) {
                                                                                                        d10 = w0.d(d02[i46]);
                                                                                                        if (d10 != null && w0.i(d10)) {
                                                                                                            str44 = d10;
                                                                                                            str45 = str96;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                d10 = null;
                                                                                                str44 = d10;
                                                                                                str45 = str96;
                                                                                            } else if (w0.m(str96)) {
                                                                                                if (str36 != null) {
                                                                                                    String[] d03 = n0.d0(str36);
                                                                                                    int length3 = d03.length;
                                                                                                    for (int i47 = i11; i47 < length3; i47++) {
                                                                                                        d10 = w0.d(d03[i47]);
                                                                                                        if (d10 != null && w0.m(d10)) {
                                                                                                            str44 = d10;
                                                                                                            str45 = str96;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                d10 = null;
                                                                                                str44 = d10;
                                                                                                str45 = str96;
                                                                                            } else if (w0.l(str96) || w0.k(str96)) {
                                                                                                str44 = str96;
                                                                                                str45 = str44;
                                                                                            } else {
                                                                                                str45 = str96;
                                                                                                if ("application/mp4".equals(str45)) {
                                                                                                    str44 = w0.d(str36);
                                                                                                    if ("text/vtt".equals(str44)) {
                                                                                                        str44 = "application/x-mp4-vtt";
                                                                                                    }
                                                                                                } else {
                                                                                                    str44 = null;
                                                                                                }
                                                                                            }
                                                                                            if ("audio/eac3".equals(str44)) {
                                                                                                int i48 = i11;
                                                                                                while (i48 < arrayList25.size()) {
                                                                                                    f fVar = (f) arrayList25.get(i48);
                                                                                                    int i49 = i48;
                                                                                                    String str110 = fVar.a;
                                                                                                    String str111 = fVar.b;
                                                                                                    arrayList26 = arrayList25;
                                                                                                    if (("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str110) && "JOC".equals(str111)) || ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str110) && "ec+3".equals(str111))) {
                                                                                                        str44 = "audio/eac3-joc";
                                                                                                        if ("audio/eac3-joc".equals(str44)) {
                                                                                                            str47 = "ec+3";
                                                                                                            str46 = str100;
                                                                                                            if (w0.j(str47, str46)) {
                                                                                                                oVar = null;
                                                                                                            } else {
                                                                                                                b2.o x9 = n0.x(str47, str46, str102);
                                                                                                                String str112 = str46 != null ? str46 : str47;
                                                                                                                oVar = x9;
                                                                                                                str44 = "video/dolby-vision";
                                                                                                                str47 = str112;
                                                                                                            }
                                                                                                            i19 = i11;
                                                                                                            int i50 = i19;
                                                                                                            while (true) {
                                                                                                                j22 = j25;
                                                                                                                if (i19 >= arrayList21.size()) {
                                                                                                                    ArrayList arrayList59 = arrayList21;
                                                                                                                    f fVar2 = (f) arrayList59.get(i19);
                                                                                                                    String str113 = str45;
                                                                                                                    if (wb.a("urn:mpeg:dash:role:2011", fVar2.a)) {
                                                                                                                        String str114 = fVar2.b;
                                                                                                                        i50 |= (str114 != null && (str114.equals("forced_subtitle") || str114.equals("forced-subtitle"))) ? 2 : i11;
                                                                                                                    }
                                                                                                                    i19++;
                                                                                                                    str45 = str113;
                                                                                                                    arrayList21 = arrayList59;
                                                                                                                    j25 = j22;
                                                                                                                } else {
                                                                                                                    ArrayList arrayList60 = arrayList21;
                                                                                                                    String str115 = str45;
                                                                                                                    int i51 = i11;
                                                                                                                    int i52 = i51;
                                                                                                                    while (i51 < arrayList60.size()) {
                                                                                                                        f fVar3 = (f) arrayList60.get(i51);
                                                                                                                        ArrayList arrayList61 = arrayList60;
                                                                                                                        if (wb.a("urn:mpeg:dash:role:2011", fVar3.a)) {
                                                                                                                            i52 |= m(fVar3.b);
                                                                                                                        }
                                                                                                                        i51++;
                                                                                                                        arrayList60 = arrayList61;
                                                                                                                    }
                                                                                                                    ArrayList arrayList62 = arrayList60;
                                                                                                                    int i53 = i11;
                                                                                                                    int i54 = i53;
                                                                                                                    while (i53 < arrayList10.size()) {
                                                                                                                        ArrayList arrayList63 = arrayList10;
                                                                                                                        int i55 = i53;
                                                                                                                        f fVar4 = (f) arrayList63.get(i53);
                                                                                                                        int i56 = i54;
                                                                                                                        String str116 = fVar4.a;
                                                                                                                        int i57 = i52;
                                                                                                                        String str117 = fVar4.b;
                                                                                                                        if (wb.a("urn:mpeg:dash:role:2011", str116)) {
                                                                                                                            i21 = m(str117);
                                                                                                                        } else if (wb.a("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar4.a)) {
                                                                                                                            if (str117 != null) {
                                                                                                                                switch (str117.hashCode()) {
                                                                                                                                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                                                                                                                        if (str117.equals("1")) {
                                                                                                                                            i20 = i11;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        i20 = -1;
                                                                                                                                        break;
                                                                                                                                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                                                                                                                        if (str117.equals("2")) {
                                                                                                                                            i20 = i12;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        i20 = -1;
                                                                                                                                        break;
                                                                                                                                    case 51:
                                                                                                                                        if (str117.equals("3")) {
                                                                                                                                            i20 = 2;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        i20 = -1;
                                                                                                                                        break;
                                                                                                                                    case 52:
                                                                                                                                        if (str117.equals("4")) {
                                                                                                                                            i20 = 3;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        i20 = -1;
                                                                                                                                        break;
                                                                                                                                    case 53:
                                                                                                                                    default:
                                                                                                                                        i20 = -1;
                                                                                                                                        break;
                                                                                                                                    case 54:
                                                                                                                                        if (str117.equals("6")) {
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
                                                                                                                            i54 = i56;
                                                                                                                            i53 = i55 + 1;
                                                                                                                            arrayList10 = arrayList63;
                                                                                                                            i52 = i57;
                                                                                                                        }
                                                                                                                        i54 = i56 | i21;
                                                                                                                        i53 = i55 + 1;
                                                                                                                        arrayList10 = arrayList63;
                                                                                                                        i52 = i57;
                                                                                                                    }
                                                                                                                    ArrayList arrayList64 = arrayList10;
                                                                                                                    int n10 = i52 | i54 | n(arrayList24) | n(arrayList26);
                                                                                                                    int i58 = i11;
                                                                                                                    while (true) {
                                                                                                                        if (i58 < arrayList24.size()) {
                                                                                                                            f fVar5 = (f) arrayList24.get(i58);
                                                                                                                            arrayList27 = arrayList24;
                                                                                                                            if ((wb.a("http://dashif.org/thumbnail_tile", fVar5.a) || wb.a("http://dashif.org/guidelines/thumbnail_tile", fVar5.a)) && (str48 = fVar5.b) != null) {
                                                                                                                                String str118 = n0.a;
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
                                                                                                                            i58++;
                                                                                                                            arrayList24 = arrayList27;
                                                                                                                        } else {
                                                                                                                            arrayList27 = arrayList24;
                                                                                                                            pair = null;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    w wVar = new w();
                                                                                                                    wVar.a = attributeValue23;
                                                                                                                    wVar.q = w0.n(str115);
                                                                                                                    wVar.r = w0.n(str44);
                                                                                                                    wVar.j = str47;
                                                                                                                    wVar.i = i15;
                                                                                                                    wVar.e = i50;
                                                                                                                    wVar.f = n10;
                                                                                                                    wVar.H = oVar;
                                                                                                                    String str119 = str35;
                                                                                                                    wVar.d = str119;
                                                                                                                    wVar.Q = pair != null ? ((Integer) pair.first).intValue() : -1;
                                                                                                                    wVar.R = pair != null ? ((Integer) pair.second).intValue() : -1;
                                                                                                                    if (w0.m(str44)) {
                                                                                                                        wVar.y = parseInt2;
                                                                                                                        wVar.z = parseInt3;
                                                                                                                        wVar.C = j53;
                                                                                                                    } else {
                                                                                                                        int i59 = parseInt2;
                                                                                                                        int i60 = parseInt3;
                                                                                                                        if (w0.i(str44)) {
                                                                                                                            wVar.J = i18;
                                                                                                                            wVar.K = i17;
                                                                                                                        } else if (w0.l(str44)) {
                                                                                                                            if ("application/cea-608".equals(str44)) {
                                                                                                                                int i61 = i11;
                                                                                                                                while (i61 < arrayList64.size()) {
                                                                                                                                    f fVar6 = (f) arrayList64.get(i61);
                                                                                                                                    String str120 = fVar6.a;
                                                                                                                                    String str121 = fVar6.b;
                                                                                                                                    if ("urn:scte:dash:cc:cea-608:2015".equals(str120) && str121 != null) {
                                                                                                                                        Matcher matcher = c.matcher(str121);
                                                                                                                                        if (matcher.matches()) {
                                                                                                                                            parseInt4 = Integer.parseInt(matcher.group(i12));
                                                                                                                                            wVar.O = parseInt4;
                                                                                                                                        } else {
                                                                                                                                            e2.a.l("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str121));
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    i61++;
                                                                                                                                    i12 = 1;
                                                                                                                                }
                                                                                                                                parseInt4 = -1;
                                                                                                                                wVar.O = parseInt4;
                                                                                                                            } else {
                                                                                                                                if ("application/cea-708".equals(str44)) {
                                                                                                                                    for (int i62 = i11; i62 < arrayList64.size(); i62++) {
                                                                                                                                        f fVar7 = (f) arrayList64.get(i62);
                                                                                                                                        String str122 = fVar7.a;
                                                                                                                                        String str123 = fVar7.b;
                                                                                                                                        if ("urn:scte:dash:cc:cea-708:2015".equals(str122) && str123 != null) {
                                                                                                                                            Matcher matcher2 = d.matcher(str123);
                                                                                                                                            if (matcher2.matches()) {
                                                                                                                                                parseInt4 = Integer.parseInt(matcher2.group(1));
                                                                                                                                                wVar.O = parseInt4;
                                                                                                                                            } else {
                                                                                                                                                e2.a.l("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str123));
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                parseInt4 = -1;
                                                                                                                                wVar.O = parseInt4;
                                                                                                                            }
                                                                                                                        } else if (w0.k(str44)) {
                                                                                                                            wVar.y = i59;
                                                                                                                            wVar.z = i60;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    x xVar2 = new x(wVar);
                                                                                                                    d dVar2 = new d(xVar2, !arrayList20.isEmpty() ? arrayList20 : arrayList22, sVar != null ? sVar : new r(null, 1L, 0L, 0L, 0L), str43, arrayList23, arrayList55, arrayList27, arrayList26);
                                                                                                                    int h = w0.h(xVar2.s);
                                                                                                                    int i63 = i16;
                                                                                                                    if (i63 != -1) {
                                                                                                                        if (h != -1) {
                                                                                                                            yb.p(i63 == h ? 1 : i11);
                                                                                                                        }
                                                                                                                        h = i63;
                                                                                                                    }
                                                                                                                    ArrayList arrayList65 = arrayList19;
                                                                                                                    arrayList65.add(dVar2);
                                                                                                                    arrayList45 = arrayList65;
                                                                                                                    str24 = str119;
                                                                                                                    i14 = h;
                                                                                                                    arrayList10 = arrayList64;
                                                                                                                    j23 = j28;
                                                                                                                    arrayList15 = arrayList62;
                                                                                                                    arrayList17 = arrayList39;
                                                                                                                    arrayList16 = arrayList40;
                                                                                                                    str25 = str89;
                                                                                                                    str26 = str37;
                                                                                                                    str22 = str33;
                                                                                                                    str23 = str34;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        i48 = i49 + 1;
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
                                                                                            str46 = str100;
                                                                                            str47 = str36;
                                                                                            if (w0.j(str47, str46)) {
                                                                                            }
                                                                                            i19 = i11;
                                                                                            int i502 = i19;
                                                                                            while (true) {
                                                                                                j22 = j25;
                                                                                                if (i19 >= arrayList21.size()) {
                                                                                                }
                                                                                                i19++;
                                                                                                str45 = str113;
                                                                                                arrayList21 = arrayList59;
                                                                                                j25 = j22;
                                                                                            }
                                                                                        } else {
                                                                                            arrayList56 = arrayList24;
                                                                                            arrayList57 = arrayList25;
                                                                                            long j56 = j25;
                                                                                            arrayList54 = arrayList23;
                                                                                            i45 = i18;
                                                                                            str27 = str42;
                                                                                            j55 = j26;
                                                                                            str105 = str40;
                                                                                            str88 = str38;
                                                                                            str107 = str21;
                                                                                            arrayList44 = arrayList14;
                                                                                            j54 = j27;
                                                                                            arrayList46 = arrayList13;
                                                                                            str87 = str32;
                                                                                            str31 = str76;
                                                                                            str108 = str43;
                                                                                            f10 = f7;
                                                                                            str53 = str;
                                                                                            str98 = str36;
                                                                                            i43 = i16;
                                                                                            arrayList45 = arrayList19;
                                                                                            str82 = str35;
                                                                                            i42 = i17;
                                                                                            str71 = str14;
                                                                                            str70 = str2;
                                                                                            str72 = str33;
                                                                                            str73 = str34;
                                                                                            str93 = str17;
                                                                                            i12 = 1;
                                                                                            str68 = str12;
                                                                                            arrayList36 = arrayList2;
                                                                                            arrayList35 = arrayList6;
                                                                                            arrayList18 = arrayList22;
                                                                                            str29 = str15;
                                                                                            sVar9 = sVar;
                                                                                            arrayList32 = arrayList7;
                                                                                            str69 = str37;
                                                                                            str92 = str39;
                                                                                            arrayList58 = arrayList20;
                                                                                            arrayList33 = arrayList5;
                                                                                            parseInt = i15;
                                                                                            long j57 = j10;
                                                                                            arrayList42 = arrayList21;
                                                                                            z10 = z11;
                                                                                            i32 = j56;
                                                                                            j45 = j57;
                                                                                            j46 = j28;
                                                                                            j49 = j15;
                                                                                            j44 = j12;
                                                                                        }
                                                                                    } else {
                                                                                        str32 = str87;
                                                                                        String str124 = str72;
                                                                                        if (e2.a.i(xmlPullParser, str124)) {
                                                                                            arrayList13 = arrayList46;
                                                                                            str = str53;
                                                                                            long d11 = d(xmlPullParser, j54);
                                                                                            str33 = str124;
                                                                                            str34 = str109;
                                                                                            str35 = str82;
                                                                                            str36 = str98;
                                                                                            long j58 = j46;
                                                                                            long j59 = i32;
                                                                                            arrayList7 = arrayList32;
                                                                                            arrayList5 = arrayList33;
                                                                                            str37 = str69;
                                                                                            arrayList6 = arrayList35;
                                                                                            str2 = str70;
                                                                                            str14 = str71;
                                                                                            str15 = str29;
                                                                                            arrayList19 = arrayList45;
                                                                                            i15 = parseInt;
                                                                                            str38 = str88;
                                                                                            str17 = str93;
                                                                                            str21 = str107;
                                                                                            i16 = i43;
                                                                                            i17 = i42;
                                                                                            ArrayList arrayList66 = arrayList44;
                                                                                            arrayList21 = arrayList42;
                                                                                            arrayList20 = arrayList58;
                                                                                            long j60 = j45;
                                                                                            arrayList2 = arrayList36;
                                                                                            str76 = str31;
                                                                                            str39 = str92;
                                                                                            j12 = j44;
                                                                                            j15 = j49;
                                                                                            j25 = j59;
                                                                                            j27 = d11;
                                                                                            j26 = j55;
                                                                                            arrayList22 = arrayList18;
                                                                                            str12 = str68;
                                                                                            arrayList14 = arrayList66;
                                                                                            j28 = j58;
                                                                                            z11 = z10;
                                                                                            str42 = str27;
                                                                                            str40 = str105;
                                                                                            sVar = p(xmlPullParser, (o) sVar9, j58, j59, j55, d11, j60);
                                                                                            arrayList24 = arrayList56;
                                                                                            arrayList25 = arrayList57;
                                                                                            i18 = i45;
                                                                                            j10 = j60;
                                                                                            str43 = str108;
                                                                                            arrayList23 = arrayList54;
                                                                                        } else {
                                                                                            str33 = str124;
                                                                                            str34 = str109;
                                                                                            str35 = str82;
                                                                                            arrayList13 = arrayList46;
                                                                                            str = str53;
                                                                                            str36 = str98;
                                                                                            long j61 = j46;
                                                                                            arrayList7 = arrayList32;
                                                                                            arrayList5 = arrayList33;
                                                                                            str37 = str69;
                                                                                            arrayList6 = arrayList35;
                                                                                            str2 = str70;
                                                                                            str14 = str71;
                                                                                            str15 = str29;
                                                                                            arrayList19 = arrayList45;
                                                                                            i15 = parseInt;
                                                                                            str38 = str88;
                                                                                            str17 = str93;
                                                                                            i16 = i43;
                                                                                            i17 = i42;
                                                                                            ArrayList arrayList67 = arrayList44;
                                                                                            arrayList20 = arrayList58;
                                                                                            str76 = str31;
                                                                                            str39 = str92;
                                                                                            long j62 = i32;
                                                                                            arrayList21 = arrayList42;
                                                                                            long j63 = j45;
                                                                                            arrayList2 = arrayList36;
                                                                                            str21 = str107;
                                                                                            long j64 = j55;
                                                                                            j12 = j44;
                                                                                            j25 = j62;
                                                                                            String str125 = str68;
                                                                                            j15 = j49;
                                                                                            if (e2.a.i(xmlPullParser, str125)) {
                                                                                                j10 = j63;
                                                                                                long d12 = d(xmlPullParser, j54);
                                                                                                z11 = z10;
                                                                                                arrayList22 = arrayList18;
                                                                                                str12 = str125;
                                                                                                j26 = j64;
                                                                                                s q9 = q(xmlPullParser, (p) sVar9, arrayList67, j61, j25, j26, d12, j10);
                                                                                                arrayList14 = arrayList67;
                                                                                                j28 = j61;
                                                                                                j27 = d12;
                                                                                                str42 = str27;
                                                                                                str40 = str105;
                                                                                                sVar = q9;
                                                                                                arrayList23 = arrayList54;
                                                                                            } else {
                                                                                                z11 = z10;
                                                                                                arrayList14 = arrayList67;
                                                                                                j10 = j63;
                                                                                                arrayList22 = arrayList18;
                                                                                                str12 = str125;
                                                                                                j26 = j64;
                                                                                                if (e2.a.i(xmlPullParser, str38)) {
                                                                                                    Pair f17 = f(xmlPullParser);
                                                                                                    Object obj3 = f17.first;
                                                                                                    if (obj3 != null) {
                                                                                                        str108 = (String) obj3;
                                                                                                    }
                                                                                                    Object obj4 = f17.second;
                                                                                                    if (obj4 != null) {
                                                                                                        arrayList23 = arrayList54;
                                                                                                        arrayList23.add((b2.s) obj4);
                                                                                                    } else {
                                                                                                        arrayList23 = arrayList54;
                                                                                                    }
                                                                                                    j27 = j54;
                                                                                                    j28 = j61;
                                                                                                    str42 = str27;
                                                                                                    str40 = str105;
                                                                                                    sVar = sVar9;
                                                                                                } else {
                                                                                                    str40 = str105;
                                                                                                    arrayList23 = arrayList54;
                                                                                                    if (e2.a.i(xmlPullParser, str40)) {
                                                                                                        j27 = j54;
                                                                                                        arrayList55.add(h(xmlPullParser, str40));
                                                                                                        j28 = j61;
                                                                                                        str41 = str90;
                                                                                                        arrayList24 = arrayList56;
                                                                                                    } else {
                                                                                                        j27 = j54;
                                                                                                        ArrayList arrayList68 = arrayList55;
                                                                                                        if (e2.a.i(xmlPullParser, str39)) {
                                                                                                            arrayList55 = arrayList68;
                                                                                                            arrayList24 = arrayList56;
                                                                                                            arrayList24.add(h(xmlPullParser, str39));
                                                                                                            j28 = j61;
                                                                                                            str41 = str90;
                                                                                                        } else {
                                                                                                            arrayList55 = arrayList68;
                                                                                                            str41 = str90;
                                                                                                            arrayList24 = arrayList56;
                                                                                                            if (e2.a.i(xmlPullParser, str41)) {
                                                                                                                j28 = j61;
                                                                                                                arrayList25 = arrayList57;
                                                                                                                arrayList25.add(h(xmlPullParser, str41));
                                                                                                            } else {
                                                                                                                j28 = j61;
                                                                                                                arrayList25 = arrayList57;
                                                                                                                b(xmlPullParser);
                                                                                                            }
                                                                                                            str90 = str41;
                                                                                                            str42 = str27;
                                                                                                            sVar = sVar9;
                                                                                                            i18 = i45;
                                                                                                            str43 = str108;
                                                                                                        }
                                                                                                    }
                                                                                                    arrayList25 = arrayList57;
                                                                                                    str90 = str41;
                                                                                                    str42 = str27;
                                                                                                    sVar = sVar9;
                                                                                                    i18 = i45;
                                                                                                    str43 = str108;
                                                                                                }
                                                                                            }
                                                                                            arrayList24 = arrayList56;
                                                                                            arrayList25 = arrayList57;
                                                                                            i18 = i45;
                                                                                            str43 = str108;
                                                                                        }
                                                                                        if (e2.a.h(xmlPullParser, str42)) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            str35 = str82;
                                                                            str = str53;
                                                                            z11 = z10;
                                                                            str36 = str98;
                                                                            arrayList7 = arrayList32;
                                                                            arrayList5 = arrayList33;
                                                                            str37 = str69;
                                                                            str2 = str70;
                                                                            str14 = str71;
                                                                            str33 = str72;
                                                                            str34 = str73;
                                                                            str15 = str29;
                                                                            arrayList19 = arrayList45;
                                                                            i15 = parseInt;
                                                                            str38 = str88;
                                                                            str17 = str93;
                                                                            str40 = str105;
                                                                            i16 = i43;
                                                                            sVar = sVar9;
                                                                            arrayList25 = arrayList57;
                                                                            i17 = i42;
                                                                            str32 = str87;
                                                                            arrayList13 = arrayList46;
                                                                            arrayList20 = arrayList58;
                                                                            arrayList22 = arrayList18;
                                                                            str12 = str68;
                                                                            str76 = str31;
                                                                            str39 = str92;
                                                                            str42 = str27;
                                                                            str43 = str108;
                                                                            j26 = j55;
                                                                            arrayList14 = arrayList44;
                                                                            j25 = i32;
                                                                            str21 = str107;
                                                                            arrayList23 = arrayList54;
                                                                            arrayList21 = arrayList42;
                                                                            j10 = j45;
                                                                            arrayList2 = arrayList36;
                                                                            arrayList6 = arrayList35;
                                                                            j27 = j54;
                                                                            j12 = j44;
                                                                            j15 = j49;
                                                                            arrayList24 = arrayList56;
                                                                            i18 = i45;
                                                                            j28 = j46;
                                                                            if (e2.a.h(xmlPullParser, str42)) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        arrayList11 = arrayList43;
                                                                        arrayList12 = arrayList8;
                                                                        str = str53;
                                                                        z11 = z10;
                                                                        arrayList7 = arrayList32;
                                                                        arrayList5 = arrayList33;
                                                                        str12 = str68;
                                                                        str13 = str69;
                                                                        str2 = str70;
                                                                        str14 = str71;
                                                                        String str126 = str72;
                                                                        String str127 = str73;
                                                                        f7 = f13;
                                                                        str15 = str77;
                                                                        str16 = str78;
                                                                        str17 = str79;
                                                                        arrayList13 = arrayList46;
                                                                        arrayList14 = arrayList44;
                                                                        ArrayList arrayList69 = arrayList42;
                                                                        j10 = j45;
                                                                        arrayList2 = arrayList36;
                                                                        str18 = str83;
                                                                        str19 = str81;
                                                                        str20 = str80;
                                                                        j22 = i32;
                                                                        str21 = attributeValue14;
                                                                        int i64 = i36;
                                                                        long j65 = j46;
                                                                        arrayList6 = arrayList35;
                                                                        j12 = j44;
                                                                        j15 = j49;
                                                                        if (e2.a.i(xmlPullParser, str127)) {
                                                                            sVar3 = o(xmlPullParser, (r) sVar3);
                                                                            str23 = str127;
                                                                            str24 = str82;
                                                                            i14 = i64;
                                                                            j23 = j65;
                                                                            arrayList15 = arrayList69;
                                                                            arrayList17 = arrayList39;
                                                                            arrayList16 = arrayList40;
                                                                            str25 = str89;
                                                                            str26 = str13;
                                                                            str22 = str126;
                                                                        } else {
                                                                            str22 = str126;
                                                                            if (e2.a.i(xmlPullParser, str22)) {
                                                                                long d13 = d(xmlPullParser, j51);
                                                                                str23 = str127;
                                                                                str24 = str82;
                                                                                arrayList15 = arrayList69;
                                                                                sVar3 = p(xmlPullParser, (o) sVar3, j65, j22, j21, d13, j10);
                                                                                j10 = j10;
                                                                                j22 = j22;
                                                                                j51 = d13;
                                                                                arrayList16 = arrayList40;
                                                                                str25 = str89;
                                                                                i14 = i64;
                                                                                str26 = str13;
                                                                                j23 = j65;
                                                                                arrayList17 = arrayList39;
                                                                            } else {
                                                                                str23 = str127;
                                                                                str24 = str82;
                                                                                i13 = i64;
                                                                                arrayList15 = arrayList69;
                                                                                long j66 = j51;
                                                                                if (e2.a.i(xmlPullParser, str12)) {
                                                                                    long d14 = d(xmlPullParser, j66);
                                                                                    sVar3 = q(xmlPullParser, (p) sVar3, arrayList14, j65, j22, j21, d14, j10);
                                                                                    j22 = j22;
                                                                                    j23 = j65;
                                                                                    j51 = d14;
                                                                                    arrayList17 = arrayList39;
                                                                                    arrayList16 = arrayList40;
                                                                                    str25 = str89;
                                                                                    i14 = i13;
                                                                                    str26 = str13;
                                                                                } else {
                                                                                    j22 = j22;
                                                                                    j23 = j65;
                                                                                    if (e2.a.i(xmlPullParser, "InbandEventStream")) {
                                                                                        arrayList16 = arrayList40;
                                                                                        arrayList16.add(h(xmlPullParser, "InbandEventStream"));
                                                                                        j24 = j66;
                                                                                        arrayList17 = arrayList39;
                                                                                        str25 = str89;
                                                                                    } else {
                                                                                        arrayList16 = arrayList40;
                                                                                        if (e2.a.i(xmlPullParser, "Label")) {
                                                                                            str25 = str89;
                                                                                            String attributeValue32 = xmlPullParser.getAttributeValue(null, str25);
                                                                                            String str128 = "";
                                                                                            while (true) {
                                                                                                xmlPullParser.next();
                                                                                                j24 = j66;
                                                                                                if (xmlPullParser.getEventType() == 4) {
                                                                                                    str128 = xmlPullParser.getText();
                                                                                                } else {
                                                                                                    b(xmlPullParser);
                                                                                                }
                                                                                                if (e2.a.h(xmlPullParser, "Label")) {
                                                                                                    arrayList17 = arrayList39;
                                                                                                    arrayList17.add(new b0(attributeValue32, str128));
                                                                                                } else {
                                                                                                    j66 = j24;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            j24 = j66;
                                                                                            arrayList17 = arrayList39;
                                                                                            str25 = str89;
                                                                                            if (xmlPullParser.getEventType() == 2) {
                                                                                                b(xmlPullParser);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    j51 = j24;
                                                                                    i14 = i13;
                                                                                    str26 = str13;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (e2.a.h(xmlPullParser, str26)) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    arrayList11 = arrayList43;
                                                    arrayList12 = arrayList8;
                                                    str24 = str82;
                                                    i13 = i36;
                                                    str = str53;
                                                    z11 = z10;
                                                    arrayList9 = arrayList38;
                                                    arrayList10 = arrayList41;
                                                    str25 = str54;
                                                    j23 = j46;
                                                    arrayList7 = arrayList32;
                                                    arrayList5 = arrayList33;
                                                    str12 = str68;
                                                    str13 = str69;
                                                    arrayList6 = arrayList35;
                                                    str2 = str70;
                                                    str14 = str71;
                                                    str22 = str72;
                                                    str23 = str73;
                                                    arrayList17 = arrayList39;
                                                    f7 = f13;
                                                    str15 = str77;
                                                    str16 = str78;
                                                    str17 = str79;
                                                    j24 = j51;
                                                    arrayList13 = arrayList46;
                                                    arrayList14 = arrayList44;
                                                    str18 = str83;
                                                    str19 = str81;
                                                    str20 = str80;
                                                    j22 = i32;
                                                    str21 = attributeValue14;
                                                    arrayList15 = arrayList42;
                                                    j10 = j45;
                                                    arrayList2 = arrayList36;
                                                    arrayList16 = arrayList40;
                                                    j12 = j44;
                                                    j15 = j49;
                                                    j51 = j24;
                                                    i14 = i13;
                                                    str26 = str13;
                                                    if (e2.a.h(xmlPullParser, str26)) {
                                                    }
                                                }
                                            }
                                            arrayList11 = arrayList43;
                                            arrayList12 = arrayList8;
                                            str24 = str82;
                                            str = str53;
                                            z11 = z10;
                                            arrayList9 = arrayList38;
                                            arrayList10 = arrayList41;
                                            j23 = j46;
                                            arrayList7 = arrayList32;
                                            arrayList5 = arrayList33;
                                            str26 = str69;
                                            arrayList6 = arrayList35;
                                            str2 = str70;
                                            str14 = str71;
                                            str22 = str72;
                                            str23 = str73;
                                            arrayList17 = arrayList39;
                                            f7 = f13;
                                            str15 = str77;
                                            str16 = str78;
                                            str17 = str79;
                                            i14 = i36;
                                            arrayList13 = arrayList46;
                                            str25 = str54;
                                            str12 = str68;
                                            str18 = str83;
                                            str19 = str81;
                                            str20 = str80;
                                            arrayList14 = arrayList44;
                                            j22 = i32;
                                            str21 = attributeValue14;
                                            arrayList15 = arrayList42;
                                            j10 = j45;
                                            arrayList2 = arrayList36;
                                            arrayList16 = arrayList40;
                                            j12 = j44;
                                            j15 = j49;
                                            if (e2.a.h(xmlPullParser, str26)) {
                                            }
                                        }
                                    } else {
                                        arrayList4 = arrayList31;
                                        String str129 = str63;
                                        str = str53;
                                        str2 = str64;
                                        String str130 = str65;
                                        z11 = z10;
                                        str3 = str54;
                                        j10 = j45;
                                        long j67 = i32;
                                        ArrayList arrayList70 = arrayList32;
                                        arrayList5 = arrayList33;
                                        arrayList2 = arrayList30;
                                        long j68 = j46;
                                        arrayList6 = arrayList34;
                                        j12 = j44;
                                        j15 = j33;
                                        if (e2.a.i(xmlPullParser, "EventStream")) {
                                            String str131 = str130;
                                            String attributeValue33 = xmlPullParser.getAttributeValue(null, str131);
                                            String str132 = attributeValue33 == null ? "" : attributeValue33;
                                            String str133 = str66;
                                            String attributeValue34 = xmlPullParser.getAttributeValue(null, str133);
                                            String str134 = attributeValue34 == null ? "" : attributeValue34;
                                            String attributeValue35 = xmlPullParser.getAttributeValue(null, "timescale");
                                            long parseLong2 = attributeValue35 == null ? 1L : Long.parseLong(attributeValue35);
                                            String attributeValue36 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
                                            long parseLong3 = attributeValue36 == null ? 0L : Long.parseLong(attributeValue36);
                                            ArrayList arrayList71 = new ArrayList();
                                            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(512);
                                            while (true) {
                                                xmlPullParser.next();
                                                if (e2.a.i(xmlPullParser, "Event")) {
                                                    str11 = str129;
                                                    String attributeValue37 = xmlPullParser.getAttributeValue(null, str11);
                                                    long parseLong4 = attributeValue37 == null ? 0L : Long.parseLong(attributeValue37);
                                                    str10 = str2;
                                                    String attributeValue38 = xmlPullParser.getAttributeValue(null, str10);
                                                    long parseLong5 = attributeValue38 == null ? -9223372036854775807L : Long.parseLong(attributeValue38);
                                                    String attributeValue39 = xmlPullParser.getAttributeValue(null, "presentationTime");
                                                    long parseLong6 = attributeValue39 == null ? 0L : Long.parseLong(attributeValue39);
                                                    String str135 = n0.a;
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    long a02 = n0.a0(parseLong5, 1000L, parseLong2, roundingMode);
                                                    long a03 = n0.a0(parseLong6 - parseLong3, 1000000L, parseLong2, roundingMode);
                                                    arrayList7 = arrayList70;
                                                    j19 = parseLong2;
                                                    str4 = str131;
                                                    String attributeValue40 = xmlPullParser.getAttributeValue(null, "messageData");
                                                    if (attributeValue40 == null) {
                                                        attributeValue40 = null;
                                                    }
                                                    byteArrayOutputStream3.reset();
                                                    XmlSerializer newSerializer = Xml.newSerializer();
                                                    str7 = str133;
                                                    newSerializer.setOutput(byteArrayOutputStream3, StandardCharsets.UTF_8.name());
                                                    xmlPullParser.nextToken();
                                                    while (!e2.a.h(xmlPullParser, "Event")) {
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
                                                                int i65 = i11;
                                                                while (i65 < xmlPullParser.getAttributeCount()) {
                                                                    newSerializer.attribute(xmlPullParser.getAttributeNamespace(i65), xmlPullParser.getAttributeName(i65), xmlPullParser.getAttributeValue(i65));
                                                                    i65++;
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
                                                        byteArrayOutputStream3 = byteArrayOutputStream2;
                                                        parseLong3 = j20;
                                                    }
                                                    j18 = parseLong3;
                                                    byteArrayOutputStream = byteArrayOutputStream3;
                                                    newSerializer.flush();
                                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                    Long valueOf = Long.valueOf(a03);
                                                    if (attributeValue40 != null) {
                                                        byteArray = attributeValue40.getBytes(StandardCharsets.UTF_8);
                                                    }
                                                    str8 = str132;
                                                    str9 = str134;
                                                    arrayList71.add(Pair.create(valueOf, new n3.a(str132, str134, a02, parseLong4, byteArray)));
                                                } else {
                                                    arrayList7 = arrayList70;
                                                    str4 = str131;
                                                    str7 = str133;
                                                    j18 = parseLong3;
                                                    byteArrayOutputStream = byteArrayOutputStream3;
                                                    str8 = str132;
                                                    str9 = str134;
                                                    j19 = parseLong2;
                                                    str10 = str2;
                                                    str11 = str129;
                                                    b(xmlPullParser);
                                                }
                                                if (e2.a.h(xmlPullParser, "EventStream")) {
                                                    long[] jArr = new long[arrayList71.size()];
                                                    n3.a[] aVarArr = new n3.a[arrayList71.size()];
                                                    for (int i66 = i11; i66 < arrayList71.size(); i66++) {
                                                        Pair pair2 = (Pair) arrayList71.get(i66);
                                                        jArr[i66] = ((Long) pair2.first).longValue();
                                                        aVarArr[i66] = (n3.a) pair2.second;
                                                    }
                                                    arrayList5.add(new g(str8, str9, jArr, aVarArr));
                                                    str2 = str10;
                                                    j16 = j68;
                                                    str66 = str7;
                                                    j17 = j67;
                                                    j11 = -9223372036854775807L;
                                                    str5 = str11;
                                                } else {
                                                    str132 = str8;
                                                    str134 = str9;
                                                    str129 = str11;
                                                    str2 = str10;
                                                    byteArrayOutputStream3 = byteArrayOutputStream;
                                                    str133 = str7;
                                                    parseLong2 = j19;
                                                    parseLong3 = j18;
                                                    str131 = str4;
                                                    arrayList70 = arrayList7;
                                                }
                                            }
                                        } else {
                                            arrayList7 = arrayList70;
                                            String str136 = str66;
                                            str4 = str130;
                                            if (e2.a.i(xmlPullParser, "SegmentBase")) {
                                                sVar2 = o(xmlPullParser, null);
                                                arrayList5 = arrayList5;
                                                j16 = j68;
                                                str6 = str67;
                                                str66 = str136;
                                                j17 = j67;
                                                j11 = -9223372036854775807L;
                                                str5 = str129;
                                            } else if (e2.a.i(xmlPullParser, "SegmentList")) {
                                                j11 = -9223372036854775807L;
                                                long d15 = d(xmlPullParser, -9223372036854775807L);
                                                arrayList5 = arrayList5;
                                                str66 = str136;
                                                str5 = str129;
                                                sVar2 = p(xmlPullParser, null, j68, j67, j14, d15, j10);
                                                j10 = j10;
                                                j17 = j67;
                                                j16 = j68;
                                                j47 = d15;
                                            } else {
                                                arrayList5 = arrayList5;
                                                j16 = j68;
                                                str66 = str136;
                                                j17 = j67;
                                                j11 = -9223372036854775807L;
                                                str5 = str129;
                                                if (e2.a.i(xmlPullParser, str68)) {
                                                    long d16 = d(xmlPullParser, -9223372036854775807L);
                                                    g0 g0Var = f9.i0.b;
                                                    sVar2 = q(xmlPullParser, null, s1.e, j16, j17, j14, d16, j10);
                                                    j47 = d16;
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
                                    Pair create = Pair.create(new h(attributeValue11, i31, arrayList7, arrayList5), Long.valueOf(j17));
                                    h hVar = (h) create.first;
                                    if (hVar.b != j11) {
                                        long longValue = ((Long) create.second).longValue();
                                        j30 = longValue == j11 ? j11 : longValue + hVar.b;
                                        arrayList3 = arrayList29;
                                        arrayList3.add(hVar);
                                    } else {
                                        if (!equals) {
                                            throw x0.b("Unable to determine start of period " + arrayList29.size(), null);
                                        }
                                        arrayList3 = arrayList29;
                                        i30 = i12;
                                        j30 = j15;
                                    }
                                    j13 = j30;
                                } else {
                                    str67 = str6;
                                    i32 = j17;
                                    j33 = j15;
                                    arrayList30 = arrayList2;
                                    j44 = j12;
                                    arrayList34 = arrayList6;
                                    arrayList31 = arrayList4;
                                    str63 = str5;
                                    str54 = str3;
                                    str53 = str;
                                    arrayList32 = arrayList7;
                                    arrayList33 = arrayList5;
                                    str64 = str2;
                                    j46 = j16;
                                    j45 = j10;
                                    z10 = z11;
                                    j48 = j14;
                                    str65 = str4;
                                }
                            }
                        } else {
                            z11 = z10;
                            j10 = j45;
                            j11 = j35;
                            arrayList2 = arrayList30;
                            j12 = j44;
                            j13 = j33;
                            arrayList3 = arrayList29;
                            b(xmlPullParser);
                        }
                        j32 = j12;
                        if (e2.a.h(xmlPullParser, "MPD")) {
                            if (i24 == j11) {
                                if (j13 != j11) {
                                    i24 = j13;
                                } else if (!equals) {
                                    throw x0.b("Unable to determine duration of static manifest.", null);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw x0.b("No periods found.", null);
                            }
                            return new c(V, i24, i25, equals, i26, j10, i28, V2, iVar, tVar, i0Var, uri2, arrayList3);
                        }
                        arrayList29 = arrayList3;
                        i27 = j10;
                        j31 = j11;
                        i22 = i11;
                        i10 = i12;
                        j33 = j13;
                        arrayList30 = arrayList2;
                        q5 = arrayList;
                        z10 = z11;
                        str52 = null;
                    }
                    z11 = z10;
                    arrayList3 = arrayList29;
                    j11 = j35;
                }
                arrayList3 = arrayList29;
                if (e2.a.h(xmlPullParser, "MPD")) {
                }
            }
            j10 = i27;
            if (e2.a.h(xmlPullParser, "MPD")) {
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
            if (wb.a("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i11)).a)) {
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
        return new o(jVar, j16, j18, j22, j20, list2, j24, list, n0.S(j14), n0.S(j10));
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
            if (wb.a("http://dashif.org/guidelines/last-segment-number", fVar.a)) {
                j15 = Long.parseLong(fVar.b);
                break;
            }
            i10++;
        }
        long j24 = j15;
        long j25 = j13 == -9223372036854775807L ? j12 : j13;
        long j26 = j25 == Long.MAX_VALUE ? -9223372036854775807L : j25;
        k6.c s10 = s(xmlPullParser, "media", pVar != null ? pVar.k : null);
        k6.c s11 = s(xmlPullParser, "initialization", pVar != null ? pVar.j : null);
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
        return new p(jVar, j17, j19, j23, j24, j21, list2, j26, s11, s10, n0.S(j14), n0.S(j10));
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
            String str = n0.a;
            a(arrayList, j13, j14, i10, n0.a0(j11, j10, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0101. Please report as an issue. */
    public static k6.c s(XmlPullParser xmlPullParser, String str, k6.c cVar) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return cVar;
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
        return new k6.c(arrayList, arrayList2, arrayList3, 4);
    }

    @Override // y2.n
    public final Object S1(Uri uri, g2.k kVar) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(kVar, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return k(newPullParser, uri);
            }
            throw x0.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            if (e10.getDetail() instanceof IOException) {
                throw ((IOException) e10.getDetail());
            }
            throw x0.b(null, e10);
        }
    }
}
