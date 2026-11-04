package ii;

import android.content.Context;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.j00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f extends vg.t1 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Context context, int i3) {
        super(context);
        this.r = i3;
    }

    @Override // vg.t1
    public final void a() {
        switch (this.r) {
            case 0:
                super.a();
                vg.s1 s1Var = this.a;
                s1Var.q = true;
                s1Var.K = false;
                s1Var.L = true;
                s1Var.H = true;
                s1Var.c();
                break;
            case 1:
                super.a();
                vg.s1 s1Var2 = this.a;
                s1Var2.q = true;
                s1Var2.K = false;
                s1Var2.L = true;
                s1Var2.H = true;
                s1Var2.c();
                break;
            case 2:
                j00 j00Var = new j00(50);
                this.a = j00Var;
                j00Var.O = 100;
                j00Var.M = false;
                j00Var.G = false;
                j00Var.K = true;
                j00Var.H = true;
                j00Var.J = false;
                j00Var.r = 4;
                j00Var.w = 0.98f;
                j00Var.v = 0.98f;
                j00Var.u = 0.98f;
                j00Var.c();
                break;
            case 3:
                vg.s1 s1Var3 = this.a;
                s1Var3.q = true;
                s1Var3.K = false;
                s1Var3.H = true;
                s1Var3.J = true;
                s1Var3.k = org.telegram.messenger.g0.L(-14.0f);
                vg.s1 s1Var4 = this.a;
                s1Var4.x = 2000L;
                s1Var4.y = 3000;
                s1Var4.r = 16;
                s1Var4.G = false;
                s1Var4.O = 28;
                s1Var4.Q = k6.Ak;
                s1Var4.c();
                break;
            case 4:
                vg.s1 s1Var5 = this.a;
                s1Var5.q = true;
                s1Var5.K = false;
                s1Var5.H = true;
                s1Var5.J = true;
                s1Var5.k = org.telegram.messenger.g0.L(-14.0f);
                vg.s1 s1Var6 = this.a;
                s1Var6.x = 2000L;
                s1Var6.y = 3000;
                s1Var6.r = 16;
                s1Var6.G = false;
                s1Var6.O = 28;
                s1Var6.Q = k6.Ak;
                s1Var6.c();
                break;
            default:
                super.a();
                vg.s1 s1Var7 = this.a;
                s1Var7.q = true;
                s1Var7.K = false;
                s1Var7.L = true;
                s1Var7.H = true;
                s1Var7.c();
                break;
        }
    }

    @Override // vg.t1
    public int getStarsRectWidth() {
        switch (this.r) {
            case 0:
                return getMeasuredWidth();
            case 1:
                return getMeasuredWidth();
            case 2:
                return getMeasuredWidth();
            default:
                return super.getStarsRectWidth();
        }
    }

    @Override // vg.t1, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.r) {
            case 3:
                super.onMeasure(i3, i10);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                break;
            case 4:
                super.onMeasure(i3, i10);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                break;
            case 5:
                super.onMeasure(i3, i10);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }
}
