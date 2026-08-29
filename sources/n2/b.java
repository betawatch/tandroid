package n2;

import j$.util.Objects;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final byte[] b;
    public final int c;

    public b(String str) {
        this.a = str;
        this.b = null;
        this.c = 0;
    }

    public final void a(int i10) {
        int i11 = this.c;
        if (i10 == i11) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Wrong data accessor type detected. ");
        sb2.append(i11 != 0 ? i11 != 1 ? "Unknown" : "ArrayBuffer" : "String");
        sb2.append(" expected, but got ");
        sb2.append(i10 != 0 ? i10 != 1 ? "Unknown" : "ArrayBuffer" : "String");
        throw new IllegalStateException(sb2.toString());
    }

    public b(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.b = bArr;
        this.a = null;
        this.c = 1;
    }
}
