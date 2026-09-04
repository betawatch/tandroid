package a0;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
