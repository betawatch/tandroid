package eg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.j20;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class h extends q2 {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Context context, int i10) {
        super(context);
        this.n = i10;
    }

    @Override // eg.q2
    public final void a() {
        switch (this.n) {
            case 0:
                p2 p2Var = this.a;
                p2Var.q = true;
                p2Var.K = false;
                p2Var.H = true;
                p2Var.J = true;
                p2Var.k = AndroidUtilities.dp(-14.0f);
                p2 p2Var2 = this.a;
                p2Var2.x = 2000L;
                p2Var2.y = 3000;
                p2Var2.r = 16;
                p2Var2.G = false;
                p2Var2.N = 28;
                p2Var2.P = j6.Mj;
                p2Var2.c();
                break;
            case 1:
                super.a();
                p2 p2Var3 = this.a;
                p2Var3.q = true;
                p2Var3.K = false;
                p2Var3.L = true;
                p2Var3.H = true;
                p2Var3.c();
                break;
            case 2:
                j20 j20Var = new j20(50);
                this.a = j20Var;
                j20Var.N = 100;
                j20Var.M = false;
                j20Var.G = false;
                j20Var.K = true;
                j20Var.H = true;
                j20Var.J = false;
                j20Var.r = 4;
                j20Var.w = 0.98f;
                j20Var.v = 0.98f;
                j20Var.u = 0.98f;
                j20Var.c();
                break;
            case 3:
                p2 p2Var4 = this.a;
                p2Var4.q = true;
                p2Var4.K = false;
                p2Var4.H = true;
                p2Var4.J = true;
                p2Var4.k = AndroidUtilities.dp(-14.0f);
                p2 p2Var5 = this.a;
                p2Var5.x = 2000L;
                p2Var5.y = 3000;
                p2Var5.r = 16;
                p2Var5.G = false;
                p2Var5.N = 28;
                p2Var5.P = j6.Mj;
                p2Var5.c();
                break;
            case 4:
                super.a();
                p2 p2Var6 = this.a;
                p2Var6.q = true;
                p2Var6.K = false;
                p2Var6.L = true;
                p2Var6.H = true;
                p2Var6.c();
                break;
            default:
                super.a();
                p2 p2Var7 = this.a;
                p2Var7.q = true;
                p2Var7.K = false;
                p2Var7.L = true;
                p2Var7.H = true;
                p2Var7.c();
                break;
        }
    }

    @Override // eg.q2
    public int getStarsRectWidth() {
        switch (this.n) {
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

    @Override // eg.q2, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.n) {
            case 0:
                super.onMeasure(i10, i11);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                break;
            case 1:
                super.onMeasure(i10, i11);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                break;
            case 2:
            default:
                super.onMeasure(i10, i11);
                break;
            case 3:
                super.onMeasure(i10, i11);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                break;
        }
    }
}
