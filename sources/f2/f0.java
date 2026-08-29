package f2;

import android.view.View;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f0 {
    public final /* synthetic */ int a = 0;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public Object f;

    public /* synthetic */ f0() {
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
        int k9 = Integer.MIN_VALUE == gVar.a ? 0 : gVar.k() - gVar.a;
        if (k9 >= 0) {
            c(i10, view);
            return;
        }
        this.b = i10;
        if (!this.c) {
            int d = ((androidx.emoji2.text.g) this.f).d(view);
            int j10 = d - ((androidx.emoji2.text.g) this.f).j();
            this.e = d;
            if (j10 > 0) {
                int f9 = (((androidx.emoji2.text.g) this.f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f).f() - k9) - ((androidx.emoji2.text.g) this.f).a(view))) - (((androidx.emoji2.text.g) this.f).b(view) + d);
                if (f9 < 0) {
                    this.e -= Math.min(j10, -f9);
                    return;
                }
                return;
            }
            return;
        }
        int f10 = (((androidx.emoji2.text.g) this.f).f() - k9) - ((androidx.emoji2.text.g) this.f).a(view);
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

    public void g(int i10) {
        f5.a.i(!this.c);
        boolean z10 = i10 == this.b;
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

    public f0(int i10) {
        this.b = i10;
        byte[] bArr = new byte[131];
        this.f = bArr;
        bArr[2] = 1;
    }
}
