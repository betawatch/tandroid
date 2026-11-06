package a0;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class i {
    public static final Object a = new Object();
    public static final Object b = new Object();

    public static final void a(g gVar, int i7) {
        gVar.a = new int[i7];
        gVar.b = new Object[i7];
    }

    public static final int b(g gVar, Object obj, int i7) {
        int i10 = gVar.c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int a10 = b0.a.a(i10, i7, gVar.a);
            if (a10 < 0 || kotlin.jvm.internal.j.a(obj, gVar.b[a10])) {
                return a10;
            }
            int i11 = a10 + 1;
            while (i11 < i10 && gVar.a[i11] == i7) {
                if (kotlin.jvm.internal.j.a(obj, gVar.b[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a10 - 1; i12 >= 0 && gVar.a[i12] == i7; i12--) {
                if (kotlin.jvm.internal.j.a(obj, gVar.b[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
