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

    public static o n(int i10, int i11, byte[] bArr) {
        byte[] copyOfRange;
        switch (d.a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                copyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, copyOfRange, 0, i11);
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
        int i10 = this.a;
        int i11 = oVar.a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
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
        int i12 = i() + size;
        int i13 = i();
        int i14 = oVar.i();
        while (i13 < i12) {
            if (this.b[i13] != bArr[i14]) {
                return false;
            }
            i13++;
            i14++;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.a;
        if (i10 != 0) {
            return i10;
        }
        int size = size();
        int i11 = i();
        int i12 = size;
        for (int i13 = i11; i13 < i11 + size; i13++) {
            i12 = (i12 * 31) + this.b[i13];
        }
        if (i12 == 0) {
            i12 = 1;
        }
        this.a = i12;
        return i12;
    }

    public int i() {
        return 0;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public byte o(int i10) {
        return this.b[i10];
    }

    public int size() {
        return this.b.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
