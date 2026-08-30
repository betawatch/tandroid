package n2;

import j$.util.Objects;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        sb.append(i11 != 0 ? i11 != 1 ? "Unknown" : "ArrayBuffer" : "String");
        sb.append(" expected, but got ");
        sb.append(i10 != 0 ? i10 != 1 ? "Unknown" : "ArrayBuffer" : "String");
        throw new IllegalStateException(sb.toString());
    }

    public b(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.b = bArr;
        this.a = null;
        this.c = 1;
    }
}
