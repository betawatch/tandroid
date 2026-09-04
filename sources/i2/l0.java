package i2;

import android.view.View;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class l0 {
    public final /* synthetic */ int a = 2;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public Object f;

    public /* synthetic */ l0() {
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
            int j3 = d - ((androidx.emoji2.text.g) this.f).j();
            this.e = d;
            if (j3 > 0) {
                int f7 = (((androidx.emoji2.text.g) this.f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f).f() - k10) - ((androidx.emoji2.text.g) this.f).a(view))) - (((androidx.emoji2.text.g) this.f).b(view) + d);
                if (f7 < 0) {
                    this.e -= Math.min(j3, -f7);
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
            int j10 = ((androidx.emoji2.text.g) this.f).j();
            int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f).d(view) - j10, 0) + j10);
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
        e2.d.g(!this.c);
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

    public l0(int i10) {
        this.b = i10;
        byte[] bArr = new byte[131];
        this.f = bArr;
        bArr[2] = 1;
    }

    public l0(g1 g1Var) {
        this.f = g1Var;
    }
}
