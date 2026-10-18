package gi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.y10;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class f extends sg.w1 {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Context context, int i10) {
        super(context);
        this.n = i10;
    }

    @Override // sg.w1
    public final void a() {
        switch (this.n) {
            case 0:
                super.a();
                sg.v1 v1Var = this.a;
                v1Var.q = true;
                v1Var.K = false;
                v1Var.L = true;
                v1Var.H = true;
                v1Var.c();
                break;
            case 1:
                super.a();
                sg.v1 v1Var2 = this.a;
                v1Var2.q = true;
                v1Var2.K = false;
                v1Var2.L = true;
                v1Var2.H = true;
                v1Var2.c();
                break;
            case 2:
                y10 y10Var = new y10(50);
                this.a = y10Var;
                y10Var.O = 100;
                y10Var.M = false;
                y10Var.G = false;
                y10Var.K = true;
                y10Var.H = true;
                y10Var.J = false;
                y10Var.r = 4;
                y10Var.w = 0.98f;
                y10Var.v = 0.98f;
                y10Var.u = 0.98f;
                y10Var.c();
                break;
            case 3:
                sg.v1 v1Var3 = this.a;
                v1Var3.q = true;
                v1Var3.K = false;
                v1Var3.H = true;
                v1Var3.J = true;
                v1Var3.k = AndroidUtilities.dp(-14.0f);
                sg.v1 v1Var4 = this.a;
                v1Var4.x = 2000L;
                v1Var4.y = 3000;
                v1Var4.r = 16;
                v1Var4.G = false;
                v1Var4.O = 28;
                v1Var4.Q = h6.Mj;
                v1Var4.c();
                break;
            case 4:
                sg.v1 v1Var5 = this.a;
                v1Var5.q = true;
                v1Var5.K = false;
                v1Var5.H = true;
                v1Var5.J = true;
                v1Var5.k = AndroidUtilities.dp(-14.0f);
                sg.v1 v1Var6 = this.a;
                v1Var6.x = 2000L;
                v1Var6.y = 3000;
                v1Var6.r = 16;
                v1Var6.G = false;
                v1Var6.O = 28;
                v1Var6.Q = h6.Mj;
                v1Var6.c();
                break;
            default:
                super.a();
                sg.v1 v1Var7 = this.a;
                v1Var7.q = true;
                v1Var7.K = false;
                v1Var7.L = true;
                v1Var7.H = true;
                v1Var7.c();
                break;
        }
    }

    @Override // sg.w1
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

    @Override // sg.w1, android.view.View
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
