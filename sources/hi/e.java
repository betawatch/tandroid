package hi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.d20;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class e extends tg.x1 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Context context, int i10) {
        super(context);
        this.r = i10;
    }

    @Override // tg.x1
    public final void a() {
        switch (this.r) {
            case 0:
                super.a();
                tg.w1 w1Var = this.a;
                w1Var.q = true;
                w1Var.K = false;
                w1Var.L = true;
                w1Var.H = true;
                w1Var.c();
                break;
            case 1:
                super.a();
                tg.w1 w1Var2 = this.a;
                w1Var2.q = true;
                w1Var2.K = false;
                w1Var2.L = true;
                w1Var2.H = true;
                w1Var2.c();
                break;
            case 2:
                d20 d20Var = new d20(50);
                this.a = d20Var;
                d20Var.O = 100;
                d20Var.M = false;
                d20Var.G = false;
                d20Var.K = true;
                d20Var.H = true;
                d20Var.J = false;
                d20Var.r = 4;
                d20Var.w = 0.98f;
                d20Var.v = 0.98f;
                d20Var.u = 0.98f;
                d20Var.c();
                break;
            case 3:
                tg.w1 w1Var3 = this.a;
                w1Var3.q = true;
                w1Var3.K = false;
                w1Var3.H = true;
                w1Var3.J = true;
                w1Var3.k = AndroidUtilities.dp(-14.0f);
                tg.w1 w1Var4 = this.a;
                w1Var4.x = 2000L;
                w1Var4.y = 3000;
                w1Var4.r = 16;
                w1Var4.G = false;
                w1Var4.O = 28;
                w1Var4.Q = y6.Mj;
                w1Var4.c();
                break;
            case 4:
                tg.w1 w1Var5 = this.a;
                w1Var5.q = true;
                w1Var5.K = false;
                w1Var5.H = true;
                w1Var5.J = true;
                w1Var5.k = AndroidUtilities.dp(-14.0f);
                tg.w1 w1Var6 = this.a;
                w1Var6.x = 2000L;
                w1Var6.y = 3000;
                w1Var6.r = 16;
                w1Var6.G = false;
                w1Var6.O = 28;
                w1Var6.Q = y6.Mj;
                w1Var6.c();
                break;
            default:
                super.a();
                tg.w1 w1Var7 = this.a;
                w1Var7.q = true;
                w1Var7.K = false;
                w1Var7.L = true;
                w1Var7.H = true;
                w1Var7.c();
                break;
        }
    }

    @Override // tg.x1
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

    @Override // tg.x1, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.r) {
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
