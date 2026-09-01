package fg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.k20;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class h extends p2 {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Context context, int i10) {
        super(context);
        this.n = i10;
    }

    @Override // fg.p2
    public final void a() {
        switch (this.n) {
            case 0:
                o2 o2Var = this.a;
                o2Var.q = true;
                o2Var.K = false;
                o2Var.H = true;
                o2Var.J = true;
                o2Var.k = AndroidUtilities.dp(-14.0f);
                o2 o2Var2 = this.a;
                o2Var2.x = 2000L;
                o2Var2.y = 3000;
                o2Var2.r = 16;
                o2Var2.G = false;
                o2Var2.N = 28;
                o2Var2.P = k6.Mj;
                o2Var2.c();
                break;
            case 1:
                super.a();
                o2 o2Var3 = this.a;
                o2Var3.q = true;
                o2Var3.K = false;
                o2Var3.L = true;
                o2Var3.H = true;
                o2Var3.c();
                break;
            case 2:
                k20 k20Var = new k20(50);
                this.a = k20Var;
                k20Var.N = 100;
                k20Var.M = false;
                k20Var.G = false;
                k20Var.K = true;
                k20Var.H = true;
                k20Var.J = false;
                k20Var.r = 4;
                k20Var.w = 0.98f;
                k20Var.v = 0.98f;
                k20Var.u = 0.98f;
                k20Var.c();
                break;
            case 3:
                o2 o2Var4 = this.a;
                o2Var4.q = true;
                o2Var4.K = false;
                o2Var4.H = true;
                o2Var4.J = true;
                o2Var4.k = AndroidUtilities.dp(-14.0f);
                o2 o2Var5 = this.a;
                o2Var5.x = 2000L;
                o2Var5.y = 3000;
                o2Var5.r = 16;
                o2Var5.G = false;
                o2Var5.N = 28;
                o2Var5.P = k6.Mj;
                o2Var5.c();
                break;
            case 4:
                super.a();
                o2 o2Var6 = this.a;
                o2Var6.q = true;
                o2Var6.K = false;
                o2Var6.L = true;
                o2Var6.H = true;
                o2Var6.c();
                break;
            default:
                super.a();
                o2 o2Var7 = this.a;
                o2Var7.q = true;
                o2Var7.K = false;
                o2Var7.L = true;
                o2Var7.H = true;
                o2Var7.c();
                break;
        }
    }

    @Override // fg.p2
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

    @Override // fg.p2, android.view.View
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
