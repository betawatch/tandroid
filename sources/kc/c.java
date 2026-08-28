package kc;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
            int i9 = this.a;
            String[] strArr2 = new String[i9];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i9));
            this.b = strArr2;
            String[] strArr3 = this.c;
            int i10 = this.a;
            String[] strArr4 = new String[i10];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i10));
            this.c = strArr4;
            return cVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
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
        for (int i9 = 0; i9 < this.a; i9++) {
            if (str.equals(this.b[i9])) {
                return i9;
            }
        }
        return -1;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this);
    }
}
