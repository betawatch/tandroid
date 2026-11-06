package com.google.android.gms.internal.clearcut;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o implements Serializable, Iterable {
    public static final o c = new o(a0.b);
    public static final n d;
    public int a = 0;
    public final byte[] b;

    static {
        d = l.a() ? new n(1) : new n(0);
    }

    public o(byte[] bArr) {
        this.b = bArr;
    }

    public static o i(int i7, int i10, byte[] bArr) {
        byte[] copyOfRange;
        switch (d.a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i7, i10 + i7);
                break;
            default:
                copyOfRange = new byte[i10];
                System.arraycopy(bArr, i7, copyOfRange, 0, i10);
                break;
        }
        return new o(copyOfRange);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o) || size() != ((o) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof o)) {
            return obj.equals(this);
        }
        o oVar = (o) obj;
        int i7 = this.a;
        int i10 = oVar.a;
        if (i7 != 0 && i10 != 0 && i7 != i10) {
            return false;
        }
        int size = size();
        if (size > oVar.size()) {
            int size2 = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(size);
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (size > oVar.size()) {
            int size3 = oVar.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: 0, ");
            sb3.append(size);
            sb3.append(", ");
            sb3.append(size3);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = oVar.b;
        int f10 = f() + size;
        int f11 = f();
        int f12 = oVar.f();
        while (f11 < f10) {
            if (this.b[f11] != bArr[f12]) {
                return false;
            }
            f11++;
            f12++;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    public final int hashCode() {
        int i7 = this.a;
        if (i7 != 0) {
            return i7;
        }
        int size = size();
        int f10 = f();
        int i10 = size;
        for (int i11 = f10; i11 < f10 + size; i11++) {
            i10 = (i10 * 31) + this.b[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.a = i10;
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public byte j(int i7) {
        return this.b[i7];
    }

    public int size() {
        return this.b.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
