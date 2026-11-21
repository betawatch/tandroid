package b7;

import android.os.Parcel;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class n extends a8.a {
    public final a7.a x1(a7.b bVar, String str, int i7, a7.b bVar2) {
        Parcel p12 = p1();
        p7.g.b(p12, bVar);
        p12.writeString(str);
        p12.writeInt(i7);
        p7.g.b(p12, bVar2);
        Parcel n1 = n1(p12, 2);
        a7.a m12 = a7.b.m1(n1.readStrongBinder());
        n1.recycle();
        return m12;
    }

    public final a7.a y1(a7.b bVar, String str, int i7, a7.b bVar2) {
        Parcel p12 = p1();
        p7.g.b(p12, bVar);
        p12.writeString(str);
        p12.writeInt(i7);
        p7.g.b(p12, bVar2);
        Parcel n1 = n1(p12, 3);
        a7.a m12 = a7.b.m1(n1.readStrongBinder());
        n1.recycle();
        return m12;
    }
}
