package cg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.x10;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h extends s2 {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Context context, int i10) {
        super(context);
        this.n = i10;
    }

    @Override // cg.s2
    public final void a() {
        switch (this.n) {
            case 0:
                r2 r2Var = this.a;
                r2Var.q = true;
                r2Var.K = false;
                r2Var.H = true;
                r2Var.J = true;
                r2Var.k = AndroidUtilities.dp(-14.0f);
                r2 r2Var2 = this.a;
                r2Var2.x = 2000L;
                r2Var2.y = 3000;
                r2Var2.r = 16;
                r2Var2.G = false;
                r2Var2.N = 28;
                r2Var2.P = g6.Mj;
                r2Var2.c();
                break;
            case 1:
                super.a();
                r2 r2Var3 = this.a;
                r2Var3.q = true;
                r2Var3.K = false;
                r2Var3.L = true;
                r2Var3.H = true;
                r2Var3.c();
                break;
            case 2:
                x10 x10Var = new x10(50);
                this.a = x10Var;
                x10Var.N = 100;
                x10Var.M = false;
                x10Var.G = false;
                x10Var.K = true;
                x10Var.H = true;
                x10Var.J = false;
                x10Var.r = 4;
                x10Var.w = 0.98f;
                x10Var.v = 0.98f;
                x10Var.u = 0.98f;
                x10Var.c();
                break;
            case 3:
                r2 r2Var4 = this.a;
                r2Var4.q = true;
                r2Var4.K = false;
                r2Var4.H = true;
                r2Var4.J = true;
                r2Var4.k = AndroidUtilities.dp(-14.0f);
                r2 r2Var5 = this.a;
                r2Var5.x = 2000L;
                r2Var5.y = 3000;
                r2Var5.r = 16;
                r2Var5.G = false;
                r2Var5.N = 28;
                r2Var5.P = g6.Mj;
                r2Var5.c();
                break;
            case 4:
                super.a();
                r2 r2Var6 = this.a;
                r2Var6.q = true;
                r2Var6.K = false;
                r2Var6.L = true;
                r2Var6.H = true;
                r2Var6.c();
                break;
            default:
                super.a();
                r2 r2Var7 = this.a;
                r2Var7.q = true;
                r2Var7.K = false;
                r2Var7.L = true;
                r2Var7.H = true;
                r2Var7.c();
                break;
        }
    }

    @Override // cg.s2
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

    @Override // cg.s2, android.view.View
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
