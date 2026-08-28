package f7;

import java.io.OutputStream;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends OutputStream {
    public final /* synthetic */ int a;
    public long b;

    @Override // java.io.OutputStream
    public final void write(int i9) {
        switch (this.a) {
            case 0:
                this.b++;
                break;
            case 1:
                this.b++;
                break;
            case 2:
                this.b++;
                break;
            case 3:
                this.b++;
                break;
            default:
                this.b++;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.a) {
            case 0:
                this.b += bArr.length;
                break;
            case 1:
                this.b += bArr.length;
                break;
            case 2:
                this.b += bArr.length;
                break;
            case 3:
                this.b += bArr.length;
                break;
            default:
                this.b += bArr.length;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i9, int i10) {
        int length;
        int i11;
        int length2;
        int i12;
        int length3;
        int i13;
        int length4;
        int i14;
        int i15;
        switch (this.a) {
            case 0:
                if (i9 >= 0 && i9 <= (length = bArr.length) && i10 >= 0 && (i11 = i9 + i10) <= length && i11 >= 0) {
                    this.b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (i9 >= 0 && i9 <= (length2 = bArr.length) && i10 >= 0 && (i12 = i9 + i10) <= length2 && i12 >= 0) {
                    this.b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 2:
                if (i9 >= 0 && i9 <= (length3 = bArr.length) && i10 >= 0 && (i13 = i9 + i10) <= length3 && i13 >= 0) {
                    this.b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 3:
                if (i9 >= 0 && i9 <= (length4 = bArr.length) && i10 >= 0 && (i14 = i9 + i10) <= length4 && i14 >= 0) {
                    this.b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
            default:
                if (i9 >= 0 && i9 <= bArr.length && i10 >= 0 && (i15 = i9 + i10) <= bArr.length && i15 >= 0) {
                    this.b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
        }
    }
}
