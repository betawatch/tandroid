package kg;

import android.content.Context;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.n10;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g extends g2 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Context context, int i10) {
        super(context);
        this.r = i10;
    }

    @Override // kg.g2
    public final void a() {
        switch (this.r) {
            case 0:
                f2 f2Var = this.a;
                f2Var.q = true;
                f2Var.K = false;
                f2Var.H = true;
                f2Var.J = true;
                f2Var.k = org.telegram.messenger.i0.L(-14.0f);
                f2 f2Var2 = this.a;
                f2Var2.x = 2000L;
                f2Var2.y = 3000;
                f2Var2.r = 16;
                f2Var2.G = false;
                f2Var2.O = 28;
                f2Var2.Q = t6.Ak;
                f2Var2.c();
                break;
            case 1:
                super.a();
                f2 f2Var3 = this.a;
                f2Var3.q = true;
                f2Var3.K = false;
                f2Var3.L = true;
                f2Var3.H = true;
                f2Var3.c();
                break;
            case 2:
                n10 n10Var = new n10(50);
                this.a = n10Var;
                n10Var.O = 100;
                n10Var.M = false;
                n10Var.G = false;
                n10Var.K = true;
                n10Var.H = true;
                n10Var.J = false;
                n10Var.r = 4;
                n10Var.w = 0.98f;
                n10Var.v = 0.98f;
                n10Var.u = 0.98f;
                n10Var.c();
                break;
            case 3:
                f2 f2Var4 = this.a;
                f2Var4.q = true;
                f2Var4.K = false;
                f2Var4.H = true;
                f2Var4.J = true;
                f2Var4.k = org.telegram.messenger.i0.L(-14.0f);
                f2 f2Var5 = this.a;
                f2Var5.x = 2000L;
                f2Var5.y = 3000;
                f2Var5.r = 16;
                f2Var5.G = false;
                f2Var5.O = 28;
                f2Var5.Q = t6.Ak;
                f2Var5.c();
                break;
            case 4:
                super.a();
                f2 f2Var6 = this.a;
                f2Var6.q = true;
                f2Var6.K = false;
                f2Var6.L = true;
                f2Var6.H = true;
                f2Var6.c();
                break;
            default:
                super.a();
                f2 f2Var7 = this.a;
                f2Var7.q = true;
                f2Var7.K = false;
                f2Var7.L = true;
                f2Var7.H = true;
                f2Var7.c();
                break;
        }
    }

    @Override // kg.g2
    public int getStarsRectWidth() {
        switch (this.r) {
            case 2:
                return getMeasuredWidth();
            case 3:
            default:
                return super.getStarsRectWidth();
            case 4:
                return getMeasuredWidth();
            case 5:
                return getMeasuredWidth();
        }
    }

    @Override // kg.g2, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.r) {
            case 0:
                super.onMeasure(i10, i11);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.i0.L(52.0f));
                break;
            case 1:
                super.onMeasure(i10, i11);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.i0.L(52.0f));
                break;
            case 2:
            default:
                super.onMeasure(i10, i11);
                break;
            case 3:
                super.onMeasure(i10, i11);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.i0.L(52.0f));
                break;
        }
    }
}
