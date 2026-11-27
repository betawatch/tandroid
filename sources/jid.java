// default package

import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class jid {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r6 == (-1)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zg2 a(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!h3f.c(newPullParser, "x:xmpmeta")) {
            throw hy7.a("Couldn't find xmp metadata", null);
        }
        no5 no5Var = po5.b;
        j99 j99Var = j99.e;
        long j = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            if (h3f.c(newPullParser, "rdf:Description")) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        break loop0;
                    }
                    String a2 = h3f.a(newPullParser, a[i2]);
                    if (a2 == null) {
                        i2++;
                    } else {
                        if (Integer.parseInt(a2) != 1) {
                            break;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 4) {
                                break;
                            }
                            String a3 = h3f.a(newPullParser, b[i3]);
                            if (a3 != null) {
                                j = Long.parseLong(a3);
                            } else {
                                i3++;
                            }
                        }
                        j = -9223372036854775807L;
                        while (true) {
                            if (i >= 2) {
                                no5 no5Var2 = po5.b;
                                j99Var = j99.e;
                                break;
                            }
                            String a4 = h3f.a(newPullParser, c[i]);
                            if (a4 != null) {
                                j99Var = po5.v(new mh7("image/jpeg", "Primary", 0L, 0L), new mh7("video/mp4", "MotionPhoto", Long.parseLong(a4), 0L));
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else if (h3f.c(newPullParser, "Container:Directory")) {
                j99Var = b(newPullParser, "Container", "Item");
            } else if (h3f.c(newPullParser, "GContainer:Directory")) {
                j99Var = b(newPullParser, "GContainer", "GContainerItem");
            }
            if (h3f.b(newPullParser, "x:xmpmeta")) {
                if (!j99Var.isEmpty()) {
                    return new zg2(j, (Object) j99Var, (byte) 3);
                }
            }
        }
        return null;
    }

    public static j99 b(XmlPullParser xmlPullParser, String str, String str2) {
        mo5 p = po5.p();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (h3f.c(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String a2 = h3f.a(xmlPullParser, concat3);
                String a3 = h3f.a(xmlPullParser, concat4);
                String a4 = h3f.a(xmlPullParser, concat5);
                String a5 = h3f.a(xmlPullParser, concat6);
                if (a2 == null || a3 == null) {
                    return j99.e;
                }
                p.c(new mh7(a2, a3, a4 != null ? Long.parseLong(a4) : 0L, a5 != null ? Long.parseLong(a5) : 0L));
            }
        } while (!h3f.b(xmlPullParser, concat2));
        return p.f();
    }
}
