package a0;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class j {
    public static final Object a = new Object();
    public static final Object b = new Object();

    public static final void a(g gVar, int i10) {
        gVar.a = new int[i10];
        gVar.b = new Object[i10];
    }

    public static final int b(g gVar, Object obj, int i10) {
        int i11 = gVar.c;
        if (i11 == 0) {
            return -1;
        }
        try {
            int a2 = b0.a.a(i11, i10, gVar.a);
            if (a2 < 0 || kotlin.jvm.internal.i.a(obj, gVar.b[a2])) {
                return a2;
            }
            int i12 = a2 + 1;
            while (i12 < i11 && gVar.a[i12] == i10) {
                if (kotlin.jvm.internal.i.a(obj, gVar.b[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = a2 - 1; i13 >= 0 && gVar.a[i13] == i10; i13--) {
                if (kotlin.jvm.internal.i.a(obj, gVar.b[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
