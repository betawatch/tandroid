package b4;

import android.view.View;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class v {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public Object f;

    public /* synthetic */ v() {
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (this.d) {
            int i12 = i11 - i10;
            byte[] bArr2 = (byte[]) this.f;
            int length = bArr2.length;
            int i13 = this.c;
            if (length < i13 + i12) {
                this.f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, (byte[]) this.f, this.c, i12);
            this.c += i12;
        }
    }

    public void b() {
        this.c = this.d ? ((androidx.emoji2.text.g) this.f).f() : ((androidx.emoji2.text.g) this.f).j();
    }

    public void c(int i10, View view) {
        if (this.d) {
            int a2 = ((androidx.emoji2.text.g) this.f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f;
            this.c = (Integer.MIN_VALUE == gVar.a ? 0 : gVar.k() - gVar.a) + a2;
        } else {
            this.c = ((androidx.emoji2.text.g) this.f).d(view);
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
        if (!this.d) {
            int d = ((androidx.emoji2.text.g) this.f).d(view);
            int j10 = d - ((androidx.emoji2.text.g) this.f).j();
            this.c = d;
            if (j10 > 0) {
                int f10 = (((androidx.emoji2.text.g) this.f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f).f() - k10) - ((androidx.emoji2.text.g) this.f).a(view))) - (((androidx.emoji2.text.g) this.f).b(view) + d);
                if (f10 < 0) {
                    this.c -= Math.min(j10, -f10);
                    return;
                }
                return;
            }
            return;
        }
        int f11 = (((androidx.emoji2.text.g) this.f).f() - k10) - ((androidx.emoji2.text.g) this.f).a(view);
        this.c = ((androidx.emoji2.text.g) this.f).f() - f11;
        if (f11 > 0) {
            int b10 = this.c - ((androidx.emoji2.text.g) this.f).b(view);
            int j11 = ((androidx.emoji2.text.g) this.f).j();
            int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f).d(view) - j11, 0) + j11);
            if (min < 0) {
                this.c = Math.min(f11, -min) + this.c;
            }
        }
    }

    public boolean e(int i10) {
        if (!this.d) {
            return false;
        }
        this.c -= i10;
        this.d = false;
        this.e = true;
        return true;
    }

    public final void f() {
        switch (this.a) {
            case 0:
                this.d = false;
                this.e = false;
                break;
            default:
                this.b = -1;
                this.c = TLObject.FLAG_31;
                this.d = false;
                this.e = false;
                break;
        }
    }

    public void g(int i10) {
        h5.a.i(!this.d);
        boolean z4 = i10 == this.b;
        this.d = z4;
        if (z4) {
            this.c = 3;
            this.e = false;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
            default:
                return super.toString();
        }
    }

    public v(int i10) {
        this.b = i10;
        byte[] bArr = new byte[131];
        this.f = bArr;
        bArr[2] = 1;
    }
}
