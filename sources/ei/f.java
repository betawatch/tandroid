package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.r20;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class f extends rg.v1 {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Context context, int i10) {
        super(context);
        this.n = i10;
    }

    @Override // rg.v1
    public final void a() {
        switch (this.n) {
            case 0:
                super.a();
                rg.u1 u1Var = this.a;
                u1Var.q = true;
                u1Var.K = false;
                u1Var.L = true;
                u1Var.H = true;
                u1Var.c();
                break;
            case 1:
                super.a();
                rg.u1 u1Var2 = this.a;
                u1Var2.q = true;
                u1Var2.K = false;
                u1Var2.L = true;
                u1Var2.H = true;
                u1Var2.c();
                break;
            case 2:
                r20 r20Var = new r20(50);
                this.a = r20Var;
                r20Var.N = 100;
                r20Var.M = false;
                r20Var.G = false;
                r20Var.K = true;
                r20Var.H = true;
                r20Var.J = false;
                r20Var.r = 4;
                r20Var.w = 0.98f;
                r20Var.v = 0.98f;
                r20Var.u = 0.98f;
                r20Var.c();
                break;
            case 3:
                rg.u1 u1Var3 = this.a;
                u1Var3.q = true;
                u1Var3.K = false;
                u1Var3.H = true;
                u1Var3.J = true;
                u1Var3.k = AndroidUtilities.dp(-14.0f);
                rg.u1 u1Var4 = this.a;
                u1Var4.x = 2000L;
                u1Var4.y = 3000;
                u1Var4.r = 16;
                u1Var4.G = false;
                u1Var4.N = 28;
                u1Var4.P = j6.Mj;
                u1Var4.c();
                break;
            case 4:
                rg.u1 u1Var5 = this.a;
                u1Var5.q = true;
                u1Var5.K = false;
                u1Var5.H = true;
                u1Var5.J = true;
                u1Var5.k = AndroidUtilities.dp(-14.0f);
                rg.u1 u1Var6 = this.a;
                u1Var6.x = 2000L;
                u1Var6.y = 3000;
                u1Var6.r = 16;
                u1Var6.G = false;
                u1Var6.N = 28;
                u1Var6.P = j6.Mj;
                u1Var6.c();
                break;
            default:
                super.a();
                rg.u1 u1Var7 = this.a;
                u1Var7.q = true;
                u1Var7.K = false;
                u1Var7.L = true;
                u1Var7.H = true;
                u1Var7.c();
                break;
        }
    }

    @Override // rg.v1
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

    @Override // rg.v1, android.view.View
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
