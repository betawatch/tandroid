package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.n20;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class f extends rg.w1 {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Context context, int i10) {
        super(context);
        this.n = i10;
    }

    @Override // rg.w1
    public final void a() {
        switch (this.n) {
            case 0:
                super.a();
                rg.v1 v1Var = this.a;
                v1Var.q = true;
                v1Var.K = false;
                v1Var.L = true;
                v1Var.H = true;
                v1Var.c();
                break;
            case 1:
                super.a();
                rg.v1 v1Var2 = this.a;
                v1Var2.q = true;
                v1Var2.K = false;
                v1Var2.L = true;
                v1Var2.H = true;
                v1Var2.c();
                break;
            case 2:
                n20 n20Var = new n20(50);
                this.a = n20Var;
                n20Var.N = 100;
                n20Var.M = false;
                n20Var.G = false;
                n20Var.K = true;
                n20Var.H = true;
                n20Var.J = false;
                n20Var.r = 4;
                n20Var.w = 0.98f;
                n20Var.v = 0.98f;
                n20Var.u = 0.98f;
                n20Var.c();
                break;
            case 3:
                rg.v1 v1Var3 = this.a;
                v1Var3.q = true;
                v1Var3.K = false;
                v1Var3.H = true;
                v1Var3.J = true;
                v1Var3.k = AndroidUtilities.dp(-14.0f);
                rg.v1 v1Var4 = this.a;
                v1Var4.x = 2000L;
                v1Var4.y = 3000;
                v1Var4.r = 16;
                v1Var4.G = false;
                v1Var4.N = 28;
                v1Var4.P = i6.Mj;
                v1Var4.c();
                break;
            case 4:
                rg.v1 v1Var5 = this.a;
                v1Var5.q = true;
                v1Var5.K = false;
                v1Var5.H = true;
                v1Var5.J = true;
                v1Var5.k = AndroidUtilities.dp(-14.0f);
                rg.v1 v1Var6 = this.a;
                v1Var6.x = 2000L;
                v1Var6.y = 3000;
                v1Var6.r = 16;
                v1Var6.G = false;
                v1Var6.N = 28;
                v1Var6.P = i6.Mj;
                v1Var6.c();
                break;
            default:
                super.a();
                rg.v1 v1Var7 = this.a;
                v1Var7.q = true;
                v1Var7.K = false;
                v1Var7.L = true;
                v1Var7.H = true;
                v1Var7.c();
                break;
        }
    }

    @Override // rg.w1
    public int getStarsRectWidth() {
        switch (this.n) {
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

    @Override // rg.w1, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.n) {
            case 3:
                super.onMeasure(i10, i11);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                break;
            case 4:
                super.onMeasure(i10, i11);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                break;
            case 5:
                super.onMeasure(i10, i11);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
