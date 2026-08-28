package a0;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class i {
    public static final Object a = new Object();
    public static final Object b = new Object();

    public static final void a(g gVar, int i9) {
        gVar.a = new int[i9];
        gVar.b = new Object[i9];
    }

    public static final int b(g gVar, Object obj, int i9) {
        int i10 = gVar.c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int a2 = b0.a.a(i10, i9, gVar.a);
            if (a2 < 0 || kotlin.jvm.internal.i.a(obj, gVar.b[a2])) {
                return a2;
            }
            int i11 = a2 + 1;
            while (i11 < i10 && gVar.a[i11] == i9) {
                if (kotlin.jvm.internal.i.a(obj, gVar.b[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a2 - 1; i12 >= 0 && gVar.a[i12] == i9; i12--) {
                if (kotlin.jvm.internal.i.a(obj, gVar.b[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
