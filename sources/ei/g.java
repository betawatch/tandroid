package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.p20;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class g extends rg.y1 {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Context context, int i10) {
        super(context);
        this.n = i10;
    }

    @Override // rg.y1
    public final void a() {
        switch (this.n) {
            case 0:
                super.a();
                rg.x1 x1Var = this.a;
                x1Var.q = true;
                x1Var.K = false;
                x1Var.L = true;
                x1Var.H = true;
                x1Var.c();
                break;
            case 1:
                super.a();
                rg.x1 x1Var2 = this.a;
                x1Var2.q = true;
                x1Var2.K = false;
                x1Var2.L = true;
                x1Var2.H = true;
                x1Var2.c();
                break;
            case 2:
                p20 p20Var = new p20(50);
                this.a = p20Var;
                p20Var.N = 100;
                p20Var.M = false;
                p20Var.G = false;
                p20Var.K = true;
                p20Var.H = true;
                p20Var.J = false;
                p20Var.r = 4;
                p20Var.w = 0.98f;
                p20Var.v = 0.98f;
                p20Var.u = 0.98f;
                p20Var.c();
                break;
            case 3:
                rg.x1 x1Var3 = this.a;
                x1Var3.q = true;
                x1Var3.K = false;
                x1Var3.H = true;
                x1Var3.J = true;
                x1Var3.k = AndroidUtilities.dp(-14.0f);
                rg.x1 x1Var4 = this.a;
                x1Var4.x = 2000L;
                x1Var4.y = 3000;
                x1Var4.r = 16;
                x1Var4.G = false;
                x1Var4.N = 28;
                x1Var4.P = i6.Mj;
                x1Var4.c();
                break;
            case 4:
                rg.x1 x1Var5 = this.a;
                x1Var5.q = true;
                x1Var5.K = false;
                x1Var5.H = true;
                x1Var5.J = true;
                x1Var5.k = AndroidUtilities.dp(-14.0f);
                rg.x1 x1Var6 = this.a;
                x1Var6.x = 2000L;
                x1Var6.y = 3000;
                x1Var6.r = 16;
                x1Var6.G = false;
                x1Var6.N = 28;
                x1Var6.P = i6.Mj;
                x1Var6.c();
                break;
            default:
                super.a();
                rg.x1 x1Var7 = this.a;
                x1Var7.q = true;
                x1Var7.K = false;
                x1Var7.L = true;
                x1Var7.H = true;
                x1Var7.c();
                break;
        }
    }

    @Override // rg.y1
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

    @Override // rg.y1, android.view.View
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
