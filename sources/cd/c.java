package cd;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int a = 0;
    public String[] b;
    public String[] c;

    public c() {
        String[] strArr = d;
        this.b = strArr;
        this.c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.a = this.a;
            String[] strArr = this.b;
            int i10 = this.a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.b = strArr2;
            String[] strArr3 = this.c;
            int i11 = this.a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.c = strArr4;
            return cVar;
        } catch (CloneNotSupportedException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a == cVar.a && Arrays.equals(this.b, cVar.b)) {
            return Arrays.equals(this.c, cVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }

    public final int i(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
        for (int i10 = 0; i10 < this.a; i10++) {
            if (str.equals(this.b[i10])) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this);
    }
}
