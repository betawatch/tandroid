package f2;

import android.view.View;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i0 {
    public final /* synthetic */ int a = 0;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public Object f;

    public /* synthetic */ i0() {
    }

    public void a(int i9, int i10, byte[] bArr) {
        if (this.c) {
            int i11 = i10 - i9;
            byte[] bArr2 = (byte[]) this.f;
            int length = bArr2.length;
            int i12 = this.e;
            if (length < i12 + i11) {
                this.f = Arrays.copyOf(bArr2, (i12 + i11) * 2);
            }
            System.arraycopy(bArr, i9, (byte[]) this.f, this.e, i11);
            this.e += i11;
        }
    }

    public void b() {
        this.e = this.c ? ((androidx.emoji2.text.f) this.f).f() : ((androidx.emoji2.text.f) this.f).j();
    }

    public void c(int i9, View view) {
        if (this.c) {
            int a2 = ((androidx.emoji2.text.f) this.f).a(view);
            androidx.emoji2.text.f fVar = (androidx.emoji2.text.f) this.f;
            this.e = (Integer.MIN_VALUE == fVar.a ? 0 : fVar.k() - fVar.a) + a2;
        } else {
            this.e = ((androidx.emoji2.text.f) this.f).d(view);
        }
        this.b = i9;
    }

    public void d(int i9, View view) {
        androidx.emoji2.text.f fVar = (androidx.emoji2.text.f) this.f;
        int k10 = Integer.MIN_VALUE == fVar.a ? 0 : fVar.k() - fVar.a;
        if (k10 >= 0) {
            c(i9, view);
            return;
        }
        this.b = i9;
        if (!this.c) {
            int d = ((androidx.emoji2.text.f) this.f).d(view);
            int j10 = d - ((androidx.emoji2.text.f) this.f).j();
            this.e = d;
            if (j10 > 0) {
                int f10 = (((androidx.emoji2.text.f) this.f).f() - Math.min(0, (((androidx.emoji2.text.f) this.f).f() - k10) - ((androidx.emoji2.text.f) this.f).a(view))) - (((androidx.emoji2.text.f) this.f).b(view) + d);
                if (f10 < 0) {
                    this.e -= Math.min(j10, -f10);
                    return;
                }
                return;
            }
            return;
        }
        int f11 = (((androidx.emoji2.text.f) this.f).f() - k10) - ((androidx.emoji2.text.f) this.f).a(view);
        this.e = ((androidx.emoji2.text.f) this.f).f() - f11;
        if (f11 > 0) {
            int b10 = this.e - ((androidx.emoji2.text.f) this.f).b(view);
            int j11 = ((androidx.emoji2.text.f) this.f).j();
            int min = b10 - (Math.min(((androidx.emoji2.text.f) this.f).d(view) - j11, 0) + j11);
            if (min < 0) {
                this.e = Math.min(f11, -min) + this.e;
            }
        }
    }

    public boolean e(int i9) {
        if (!this.c) {
            return false;
        }
        this.e -= i9;
        this.c = false;
        this.d = true;
        return true;
    }

    public final void f() {
        switch (this.a) {
            case 0:
                this.b = -1;
                this.e = TLObject.FLAG_31;
                this.c = false;
                this.d = false;
                break;
            default:
                this.c = false;
                this.d = false;
                break;
        }
    }

    public void g(int i9) {
        d5.a.i(!this.c);
        boolean z10 = i9 == this.b;
        this.c = z10;
        if (z10) {
            this.e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.e + ", mLayoutFromEnd=" + this.c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public i0(int i9) {
        this.b = i9;
        byte[] bArr = new byte[131];
        this.f = bArr;
        bArr[2] = 1;
    }
}
