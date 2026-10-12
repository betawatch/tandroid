package k3;

import b2.x0;
import e9.k0;
import e9.l0;
import e9.n0;
import e9.x1;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class d {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r6 == (-1)) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ad.d a(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!e2.a.i(newPullParser, "x:xmpmeta")) {
            throw x0.a(null, "Couldn't find xmp metadata");
        }
        l0 l0Var = n0.b;
        x1 x1Var = x1.e;
        long j10 = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            if (e2.a.i(newPullParser, "rdf:Description")) {
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= 4) {
                        break loop0;
                    }
                    String f7 = e2.a.f(newPullParser, a[i11]);
                    if (f7 == null) {
                        i11++;
                    } else {
                        if (Integer.parseInt(f7) != 1) {
                            break;
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 >= 4) {
                                break;
                            }
                            String f10 = e2.a.f(newPullParser, b[i12]);
                            if (f10 != null) {
                                j10 = Long.parseLong(f10);
                            } else {
                                i12++;
                            }
                        }
                        j10 = -9223372036854775807L;
                        while (true) {
                            if (i10 >= 2) {
                                l0 l0Var2 = n0.b;
                                x1Var = x1.e;
                                break;
                            }
                            String f11 = e2.a.f(newPullParser, c[i10]);
                            if (f11 != null) {
                                x1Var = n0.z(new c("image/jpeg", 0L, 0L, "Primary"), new c("video/mp4", Long.parseLong(f11), 0L, "MotionPhoto"));
                                break;
                            }
                            i10++;
                        }
                    }
                }
            } else if (e2.a.i(newPullParser, "Container:Directory")) {
                x1Var = b(newPullParser, "Container", "Item");
            } else if (e2.a.i(newPullParser, "GContainer:Directory")) {
                x1Var = b(newPullParser, "GContainer", "GContainerItem");
            }
            if (e2.a.h(newPullParser, "x:xmpmeta")) {
                if (!x1Var.isEmpty()) {
                    return new ad.d(j10, x1Var, 4);
                }
            }
        }
        return null;
    }

    public static x1 b(XmlPullParser xmlPullParser, String str, String str2) {
        k0 t10 = n0.t();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (e2.a.i(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String f7 = e2.a.f(xmlPullParser, concat3);
                String f10 = e2.a.f(xmlPullParser, concat4);
                String f11 = e2.a.f(xmlPullParser, concat5);
                String f12 = e2.a.f(xmlPullParser, concat6);
                if (f7 == null || f10 == null) {
                    return x1.e;
                }
                t10.c(new c(f7, f11 != null ? Long.parseLong(f11) : 0L, f12 != null ? Long.parseLong(f12) : 0L, f10));
            }
        } while (!e2.a.h(xmlPullParser, concat2));
        return t10.f();
    }
}
