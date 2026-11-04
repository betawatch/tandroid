package m3;

import b8.ig;
import d2.v0;
import g9.f0;
import g9.g0;
import g9.i0;
import g9.s1;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class d {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r6 == (-1)) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ig a(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!g2.a.i(newPullParser, "x:xmpmeta")) {
            throw v0.a(null, "Couldn't find xmp metadata");
        }
        g0 g0Var = i0.b;
        s1 s1Var = s1.e;
        long j10 = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            int i3 = 4;
            if (g2.a.i(newPullParser, "rdf:Description")) {
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= 4) {
                        break loop0;
                    }
                    String f10 = g2.a.f(newPullParser, a[i11]);
                    if (f10 == null) {
                        i11++;
                    } else {
                        if (Integer.parseInt(f10) != 1) {
                            break;
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 >= 4) {
                                break;
                            }
                            String f11 = g2.a.f(newPullParser, b[i12]);
                            if (f11 != null) {
                                j10 = Long.parseLong(f11);
                            } else {
                                i12++;
                            }
                        }
                        j10 = -9223372036854775807L;
                        while (true) {
                            if (i10 >= 2) {
                                g0 g0Var2 = i0.b;
                                s1Var = s1.e;
                                break;
                            }
                            String f12 = g2.a.f(newPullParser, c[i10]);
                            if (f12 != null) {
                                s1Var = i0.v(new c("image/jpeg", "Primary", 0L, 0L), new c("video/mp4", "MotionPhoto", Long.parseLong(f12), 0L));
                                break;
                            }
                            i10++;
                        }
                    }
                }
            } else if (g2.a.i(newPullParser, "Container:Directory")) {
                s1Var = b(newPullParser, "Container", "Item");
            } else if (g2.a.i(newPullParser, "GContainer:Directory")) {
                s1Var = b(newPullParser, "GContainer", "GContainerItem");
            }
            if (g2.a.h(newPullParser, "x:xmpmeta")) {
                if (!s1Var.isEmpty()) {
                    return new ig(j10, s1Var, i3);
                }
            }
        }
        return null;
    }

    public static s1 b(XmlPullParser xmlPullParser, String str, String str2) {
        f0 p10 = i0.p();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (g2.a.i(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String f10 = g2.a.f(xmlPullParser, concat3);
                String f11 = g2.a.f(xmlPullParser, concat4);
                String f12 = g2.a.f(xmlPullParser, concat5);
                String f13 = g2.a.f(xmlPullParser, concat6);
                if (f10 == null || f11 == null) {
                    return s1.e;
                }
                p10.c(new c(f10, f11, f12 != null ? Long.parseLong(f12) : 0L, f13 != null ? Long.parseLong(f13) : 0L));
            }
        } while (!g2.a.h(xmlPullParser, concat2));
        return p10.f();
    }
}
