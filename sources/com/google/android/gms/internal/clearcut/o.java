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

    public static o n(int i9, int i10, byte[] bArr) {
        byte[] copyOfRange;
        switch (d.a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i9, i10 + i9);
                break;
            default:
                copyOfRange = new byte[i10];
                System.arraycopy(bArr, i9, copyOfRange, 0, i10);
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
        int i9 = this.a;
        int i10 = oVar.a;
        if (i9 != 0 && i10 != 0 && i9 != i10) {
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
        int i11 = i() + size;
        int i12 = i();
        int i13 = oVar.i();
        while (i12 < i11) {
            if (this.b[i12] != bArr[i13]) {
                return false;
            }
            i12++;
            i13++;
        }
        return true;
    }

    public final int hashCode() {
        int i9 = this.a;
        if (i9 != 0) {
            return i9;
        }
        int size = size();
        int i10 = i();
        int i11 = size;
        for (int i12 = i10; i12 < i10 + size; i12++) {
            i11 = (i11 * 31) + this.b[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.a = i11;
        return i11;
    }

    public int i() {
        return 0;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public byte o(int i9) {
        return this.b[i9];
    }

    public int size() {
        return this.b.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
