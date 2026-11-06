package l2;

import a8.ia;
import android.view.View;
import java.util.Arrays;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class o0 {
    public final /* synthetic */ int a = 2;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public Object f;

    public /* synthetic */ o0() {
    }

    public void a(int i7, int i10, byte[] bArr) {
        if (this.c) {
            int i11 = i10 - i7;
            byte[] bArr2 = (byte[]) this.f;
            int length = bArr2.length;
            int i12 = this.e;
            if (length < i12 + i11) {
                this.f = Arrays.copyOf(bArr2, (i12 + i11) * 2);
            }
            System.arraycopy(bArr, i7, (byte[]) this.f, this.e, i11);
            this.e += i11;
        }
    }

    public void b() {
        this.e = this.c ? ((androidx.emoji2.text.g) this.f).f() : ((androidx.emoji2.text.g) this.f).j();
    }

    public void c(int i7, View view) {
        if (this.c) {
            int a10 = ((androidx.emoji2.text.g) this.f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f;
            this.e = (Integer.MIN_VALUE == gVar.a ? 0 : gVar.k() - gVar.a) + a10;
        } else {
            this.e = ((androidx.emoji2.text.g) this.f).d(view);
        }
        this.b = i7;
    }

    public void d(int i7, View view) {
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f;
        int k10 = Integer.MIN_VALUE == gVar.a ? 0 : gVar.k() - gVar.a;
        if (k10 >= 0) {
            c(i7, view);
            return;
        }
        this.b = i7;
        if (!this.c) {
            int d = ((androidx.emoji2.text.g) this.f).d(view);
            int j3 = d - ((androidx.emoji2.text.g) this.f).j();
            this.e = d;
            if (j3 > 0) {
                int f10 = (((androidx.emoji2.text.g) this.f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f).f() - k10) - ((androidx.emoji2.text.g) this.f).a(view))) - (((androidx.emoji2.text.g) this.f).b(view) + d);
                if (f10 < 0) {
                    this.e -= Math.min(j3, -f10);
                    return;
                }
                return;
            }
            return;
        }
        int f11 = (((androidx.emoji2.text.g) this.f).f() - k10) - ((androidx.emoji2.text.g) this.f).a(view);
        this.e = ((androidx.emoji2.text.g) this.f).f() - f11;
        if (f11 > 0) {
            int b10 = this.e - ((androidx.emoji2.text.g) this.f).b(view);
            int j10 = ((androidx.emoji2.text.g) this.f).j();
            int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f).d(view) - j10, 0) + j10);
            if (min < 0) {
                this.e = Math.min(f11, -min) + this.e;
            }
        }
    }

    public boolean e(int i7) {
        if (!this.c) {
            return false;
        }
        this.e -= i7;
        this.c = false;
        this.d = true;
        return true;
    }

    public void f(int i7) {
        this.c |= i7 > 0;
        this.b += i7;
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

    public void h(int i7) {
        ia.p(!this.c);
        boolean z9 = i7 == this.b;
        this.c = z9;
        if (z9) {
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

    public o0(int i7) {
        this.b = i7;
        byte[] bArr = new byte[qs.P1];
        this.f = bArr;
        bArr[2] = 1;
    }

    public o0(k1 k1Var) {
        this.f = k1Var;
    }
}
