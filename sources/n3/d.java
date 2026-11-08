package n3;

import a8.ua;
import e2.t0;
import h9.f0;
import h9.g0;
import h9.i0;
import h9.t1;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class d {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r6 == (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ua a(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!h2.a.i(newPullParser, "x:xmpmeta")) {
            throw t0.a(null, "Couldn't find xmp metadata");
        }
        g0 g0Var = i0.b;
        t1 t1Var = t1.e;
        long j3 = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            if (h2.a.i(newPullParser, "rdf:Description")) {
                int i7 = 0;
                int i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        break loop0;
                    }
                    String f10 = h2.a.f(newPullParser, a[i10]);
                    if (f10 == null) {
                        i10++;
                    } else {
                        if (Integer.parseInt(f10) != 1) {
                            break;
                        }
                        int i11 = 0;
                        while (true) {
                            if (i11 >= 4) {
                                break;
                            }
                            String f11 = h2.a.f(newPullParser, b[i11]);
                            if (f11 != null) {
                                j3 = Long.parseLong(f11);
                            } else {
                                i11++;
                            }
                        }
                        j3 = -9223372036854775807L;
                        while (true) {
                            if (i7 >= 2) {
                                g0 g0Var2 = i0.b;
                                t1Var = t1.e;
                                break;
                            }
                            String f12 = h2.a.f(newPullParser, c[i7]);
                            if (f12 != null) {
                                t1Var = i0.v(new c("image/jpeg", "Primary", 0L, 0L), new c("video/mp4", "MotionPhoto", Long.parseLong(f12), 0L));
                                break;
                            }
                            i7++;
                        }
                    }
                }
            } else if (h2.a.i(newPullParser, "Container:Directory")) {
                t1Var = b(newPullParser, "Container", "Item");
            } else if (h2.a.i(newPullParser, "GContainer:Directory")) {
                t1Var = b(newPullParser, "GContainer", "GContainerItem");
            }
            if (h2.a.h(newPullParser, "x:xmpmeta")) {
                if (!t1Var.isEmpty()) {
                    return new ua(j3, t1Var, 5);
                }
            }
        }
        return null;
    }

    public static t1 b(XmlPullParser xmlPullParser, String str, String str2) {
        f0 p10 = i0.p();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (h2.a.i(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String f10 = h2.a.f(xmlPullParser, concat3);
                String f11 = h2.a.f(xmlPullParser, concat4);
                String f12 = h2.a.f(xmlPullParser, concat5);
                String f13 = h2.a.f(xmlPullParser, concat6);
                if (f10 == null || f11 == null) {
                    return t1.e;
                }
                p10.c(new c(f10, f11, f12 != null ? Long.parseLong(f12) : 0L, f13 != null ? Long.parseLong(f13) : 0L));
            }
        } while (!h2.a.h(xmlPullParser, concat2));
        return p10.f();
    }
}
