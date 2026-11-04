package k2;

import android.view.View;
import b8.zb;
import java.util.Arrays;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public void a(int i3, int i10, byte[] bArr) {
        if (this.c) {
            int i11 = i10 - i3;
            byte[] bArr2 = (byte[]) this.f;
            int length = bArr2.length;
            int i12 = this.e;
            if (length < i12 + i11) {
                this.f = Arrays.copyOf(bArr2, (i12 + i11) * 2);
            }
            System.arraycopy(bArr, i3, (byte[]) this.f, this.e, i11);
            this.e += i11;
        }
    }

    public void b() {
        this.e = this.c ? ((androidx.emoji2.text.g) this.f).f() : ((androidx.emoji2.text.g) this.f).j();
    }

    public void c(int i3, View view) {
        if (this.c) {
            int a10 = ((androidx.emoji2.text.g) this.f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f;
            this.e = (Integer.MIN_VALUE == gVar.a ? 0 : gVar.k() - gVar.a) + a10;
        } else {
            this.e = ((androidx.emoji2.text.g) this.f).d(view);
        }
        this.b = i3;
    }

    public void d(int i3, View view) {
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f;
        int k10 = Integer.MIN_VALUE == gVar.a ? 0 : gVar.k() - gVar.a;
        if (k10 >= 0) {
            c(i3, view);
            return;
        }
        this.b = i3;
        if (!this.c) {
            int d = ((androidx.emoji2.text.g) this.f).d(view);
            int j10 = d - ((androidx.emoji2.text.g) this.f).j();
            this.e = d;
            if (j10 > 0) {
                int f10 = (((androidx.emoji2.text.g) this.f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f).f() - k10) - ((androidx.emoji2.text.g) this.f).a(view))) - (((androidx.emoji2.text.g) this.f).b(view) + d);
                if (f10 < 0) {
                    this.e -= Math.min(j10, -f10);
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
            int j11 = ((androidx.emoji2.text.g) this.f).j();
            int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f).d(view) - j11, 0) + j11);
            if (min < 0) {
                this.e = Math.min(f11, -min) + this.e;
            }
        }
    }

    public boolean e(int i3) {
        if (!this.c) {
            return false;
        }
        this.e -= i3;
        this.c = false;
        this.d = true;
        return true;
    }

    public void f(int i3) {
        this.c |= i3 > 0;
        this.b += i3;
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

    public void h(int i3) {
        zb.p(!this.c);
        boolean z10 = i3 == this.b;
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

    public o0(int i3) {
        this.b = i3;
        byte[] bArr = new byte[hs.P1];
        this.f = bArr;
        bArr[2] = 1;
    }

    public o0(j1 j1Var) {
        this.f = j1Var;
    }
}
