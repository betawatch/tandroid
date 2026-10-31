package i2;

import android.view.View;
import java.util.Arrays;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p0 {
    public final /* synthetic */ int a = 2;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public Object f;

    public /* synthetic */ p0() {
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (this.c) {
            int i12 = i11 - i10;
            byte[] bArr2 = (byte[]) this.f;
            int length = bArr2.length;
            int i13 = this.e;
            if (length < i13 + i12) {
                this.f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, (byte[]) this.f, this.e, i12);
            this.e += i12;
        }
    }

    public void b() {
        this.e = this.c ? ((androidx.emoji2.text.g) this.f).f() : ((androidx.emoji2.text.g) this.f).j();
    }

    public void c(int i10, View view) {
        if (this.c) {
            int a2 = ((androidx.emoji2.text.g) this.f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f;
            this.e = (Integer.MIN_VALUE == gVar.a ? 0 : gVar.k() - gVar.a) + a2;
        } else {
            this.e = ((androidx.emoji2.text.g) this.f).d(view);
        }
        this.b = i10;
    }

    public void d(int i10, View view) {
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f;
        int k10 = Integer.MIN_VALUE == gVar.a ? 0 : gVar.k() - gVar.a;
        if (k10 >= 0) {
            c(i10, view);
            return;
        }
        this.b = i10;
        if (!this.c) {
            int d = ((androidx.emoji2.text.g) this.f).d(view);
            int j10 = d - ((androidx.emoji2.text.g) this.f).j();
            this.e = d;
            if (j10 > 0) {
                int f7 = (((androidx.emoji2.text.g) this.f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f).f() - k10) - ((androidx.emoji2.text.g) this.f).a(view))) - (((androidx.emoji2.text.g) this.f).b(view) + d);
                if (f7 < 0) {
                    this.e -= Math.min(j10, -f7);
                    return;
                }
                return;
            }
            return;
        }
        int f10 = (((androidx.emoji2.text.g) this.f).f() - k10) - ((androidx.emoji2.text.g) this.f).a(view);
        this.e = ((androidx.emoji2.text.g) this.f).f() - f10;
        if (f10 > 0) {
            int b10 = this.e - ((androidx.emoji2.text.g) this.f).b(view);
            int j11 = ((androidx.emoji2.text.g) this.f).j();
            int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f).d(view) - j11, 0) + j11);
            if (min < 0) {
                this.e = Math.min(f10, -min) + this.e;
            }
        }
    }

    public boolean e(int i10) {
        if (!this.c) {
            return false;
        }
        this.e -= i10;
        this.c = false;
        this.d = true;
        return true;
    }

    public void f(int i10) {
        this.c |= i10 > 0;
        this.b += i10;
    }

    public void g() {
        switch (this.a) {
            case 1:
                this.c = false;
                this.d = false;
                break;
            default:
                this.b = -1;
                this.e = TLObject.FLAG_31;
                this.c = false;
                this.d = false;
                break;
        }
    }

    public void h(int i10) {
        t6.p(!this.c);
        boolean z10 = i10 == this.b;
        this.c = z10;
        if (z10) {
            this.e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.e + ", mLayoutFromEnd=" + this.c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public p0(int i10) {
        this.b = i10;
        byte[] bArr = new byte[zs.P1];
        this.f = bArr;
        bArr[2] = 1;
    }

    public p0(m1 m1Var) {
        this.f = m1Var;
    }
}
