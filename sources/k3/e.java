package k3;

import b2.s0;
import e6.n;
import e9.a1;
import e9.f0;
import e9.g0;
import e9.i0;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class e {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r6 == (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n a(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!e2.d.m(newPullParser, "x:xmpmeta")) {
            throw s0.a(null, "Couldn't find xmp metadata");
        }
        g0 g0Var = i0.b;
        a1 a1Var = a1.e;
        long j3 = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            if (e2.d.m(newPullParser, "rdf:Description")) {
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= 4) {
                        break loop0;
                    }
                    String k10 = e2.d.k(newPullParser, a[i11]);
                    if (k10 == null) {
                        i11++;
                    } else {
                        if (Integer.parseInt(k10) != 1) {
                            break;
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 >= 4) {
                                break;
                            }
                            String k11 = e2.d.k(newPullParser, b[i12]);
                            if (k11 != null) {
                                j3 = Long.parseLong(k11);
                            } else {
                                i12++;
                            }
                        }
                        j3 = -9223372036854775807L;
                        while (true) {
                            if (i10 >= 2) {
                                g0 g0Var2 = i0.b;
                                a1Var = a1.e;
                                break;
                            }
                            String k12 = e2.d.k(newPullParser, c[i10]);
                            if (k12 != null) {
                                a1Var = i0.A(new c("image/jpeg", 0L, 0L, "Primary"), new c("video/mp4", Long.parseLong(k12), 0L, "MotionPhoto"));
                                break;
                            }
                            i10++;
                        }
                    }
                }
            } else if (e2.d.m(newPullParser, "Container:Directory")) {
                a1Var = b(newPullParser, "Container", "Item");
            } else if (e2.d.m(newPullParser, "GContainer:Directory")) {
                a1Var = b(newPullParser, "GContainer", "GContainerItem");
            }
            if (e2.d.l(newPullParser, "x:xmpmeta")) {
                if (!a1Var.isEmpty()) {
                    return new n(j3, a1Var, 1);
                }
            }
        }
        return null;
    }

    public static a1 b(XmlPullParser xmlPullParser, String str, String str2) {
        f0 u10 = i0.u();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (e2.d.m(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String k10 = e2.d.k(xmlPullParser, concat3);
                String k11 = e2.d.k(xmlPullParser, concat4);
                String k12 = e2.d.k(xmlPullParser, concat5);
                String k13 = e2.d.k(xmlPullParser, concat6);
                if (k10 == null || k11 == null) {
                    return a1.e;
                }
                u10.b(new c(k10, k12 != null ? Long.parseLong(k12) : 0L, k13 != null ? Long.parseLong(k13) : 0L, k11));
            }
        } while (!e2.d.l(xmlPullParser, concat2));
        return u10.i();
    }
}
