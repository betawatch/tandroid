package ii;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import v7.o8;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public abstract class a0 extends FrameLayout implements l4 {
    public a a;
    public final b0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;

    public a0(Context context) {
        super(context);
        b0 b0Var = new b0();
        b0Var.b = Long.MIN_VALUE;
        b0Var.a = -1;
        this.b = b0Var;
    }

    public final void c(a aVar) {
        this.b.a(aVar, new ei.d5(this, 14));
    }

    public int d() {
        return 0;
    }

    public void f(int i10) {
        int i11;
        int d = o8.d(this.a);
        int i12 = 0;
        int d10 = (i10 > 0 || d > 0) ? d() : 0;
        a aVar = this.a;
        if (aVar == null || !aVar.n) {
            i11 = this.e;
        } else {
            i11 = aVar.l <= 0 ? 0 : AndroidUtilities.dp(hg.k0.f(r3, 1, 16, 10));
        }
        a aVar2 = this.a;
        if (aVar2 == null || !aVar2.o) {
            i12 = this.h;
        } else {
            if (aVar2.m > 0) {
                i12 = AndroidUtilities.dp(hg.k0.f(r7, 1, 16, 10));
            }
        }
        int i13 = i10 + d10;
        int i14 = d + d10;
        int i15 = this.d;
        int i16 = this.f;
        if (LocaleController.isRTL) {
            setPadding(i15 + i14, i11, i16 + i13, i12);
        } else {
            setPadding(i15 + i13, i11, i16 + i14, i12);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.e = i11;
        this.f = i12;
        this.h = i13;
        int i14 = this.c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
