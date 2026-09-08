package e2;

import android.media.MediaFormat;
import android.os.Bundle;
import e9.a1;
import e9.f0;
import e9.i0;
import i2.t0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class d {
    public static void a(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void d(t0 t0Var) {
        t0Var.getClass();
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void f(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void g(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void h(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    public static a1 j(d9.e eVar, ArrayList arrayList) {
        f0 u10 = i0.u();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Bundle bundle = (Bundle) arrayList.get(i10);
            bundle.getClass();
            u10.b(eVar.apply(bundle));
        }
        return u10.i();
    }

    public static String k(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static boolean l(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean m(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void n(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void o(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(i2.g.i(i10, "csd-"), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static ArrayList p(Collection collection, d9.e eVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) eVar.apply(it.next()));
        }
        return arrayList;
    }
}
