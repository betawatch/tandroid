package di;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.q20;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class f extends qg.x1 {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Context context, int i10) {
        super(context);
        this.n = i10;
    }

    @Override // qg.x1
    public final void a() {
        switch (this.n) {
            case 0:
                super.a();
                qg.w1 w1Var = this.a;
                w1Var.q = true;
                w1Var.K = false;
                w1Var.L = true;
                w1Var.H = true;
                w1Var.c();
                break;
            case 1:
                super.a();
                qg.w1 w1Var2 = this.a;
                w1Var2.q = true;
                w1Var2.K = false;
                w1Var2.L = true;
                w1Var2.H = true;
                w1Var2.c();
                break;
            case 2:
                q20 q20Var = new q20(50);
                this.a = q20Var;
                q20Var.N = 100;
                q20Var.M = false;
                q20Var.G = false;
                q20Var.K = true;
                q20Var.H = true;
                q20Var.J = false;
                q20Var.r = 4;
                q20Var.w = 0.98f;
                q20Var.v = 0.98f;
                q20Var.u = 0.98f;
                q20Var.c();
                break;
            case 3:
                qg.w1 w1Var3 = this.a;
                w1Var3.q = true;
                w1Var3.K = false;
                w1Var3.H = true;
                w1Var3.J = true;
                w1Var3.k = AndroidUtilities.dp(-14.0f);
                qg.w1 w1Var4 = this.a;
                w1Var4.x = 2000L;
                w1Var4.y = 3000;
                w1Var4.r = 16;
                w1Var4.G = false;
                w1Var4.N = 28;
                w1Var4.P = j6.Mj;
                w1Var4.c();
                break;
            case 4:
                qg.w1 w1Var5 = this.a;
                w1Var5.q = true;
                w1Var5.K = false;
                w1Var5.H = true;
                w1Var5.J = true;
                w1Var5.k = AndroidUtilities.dp(-14.0f);
                qg.w1 w1Var6 = this.a;
                w1Var6.x = 2000L;
                w1Var6.y = 3000;
                w1Var6.r = 16;
                w1Var6.G = false;
                w1Var6.N = 28;
                w1Var6.P = j6.Mj;
                w1Var6.c();
                break;
            default:
                super.a();
                qg.w1 w1Var7 = this.a;
                w1Var7.q = true;
                w1Var7.K = false;
                w1Var7.L = true;
                w1Var7.H = true;
                w1Var7.c();
                break;
        }
    }

    @Override // qg.x1
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

    @Override // qg.x1, android.view.View
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
