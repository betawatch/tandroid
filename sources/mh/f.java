package mh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.v10;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class f extends zf.w1 {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Context context, int i9) {
        super(context);
        this.n = i9;
    }

    @Override // zf.w1
    public final void a() {
        switch (this.n) {
            case 0:
                super.a();
                zf.v1 v1Var = this.a;
                v1Var.q = true;
                v1Var.K = false;
                v1Var.L = true;
                v1Var.H = true;
                v1Var.c();
                break;
            case 1:
                super.a();
                zf.v1 v1Var2 = this.a;
                v1Var2.q = true;
                v1Var2.K = false;
                v1Var2.L = true;
                v1Var2.H = true;
                v1Var2.c();
                break;
            case 2:
                v10 v10Var = new v10(50);
                this.a = v10Var;
                v10Var.N = 100;
                v10Var.M = false;
                v10Var.G = false;
                v10Var.K = true;
                v10Var.H = true;
                v10Var.J = false;
                v10Var.r = 4;
                v10Var.w = 0.98f;
                v10Var.v = 0.98f;
                v10Var.u = 0.98f;
                v10Var.c();
                break;
            case 3:
                zf.v1 v1Var3 = this.a;
                v1Var3.q = true;
                v1Var3.K = false;
                v1Var3.H = true;
                v1Var3.J = true;
                v1Var3.k = AndroidUtilities.dp(-14.0f);
                zf.v1 v1Var4 = this.a;
                v1Var4.x = 2000L;
                v1Var4.y = 3000;
                v1Var4.r = 16;
                v1Var4.G = false;
                v1Var4.N = 28;
                v1Var4.P = f6.Mj;
                v1Var4.c();
                break;
            case 4:
                zf.v1 v1Var5 = this.a;
                v1Var5.q = true;
                v1Var5.K = false;
                v1Var5.H = true;
                v1Var5.J = true;
                v1Var5.k = AndroidUtilities.dp(-14.0f);
                zf.v1 v1Var6 = this.a;
                v1Var6.x = 2000L;
                v1Var6.y = 3000;
                v1Var6.r = 16;
                v1Var6.G = false;
                v1Var6.N = 28;
                v1Var6.P = f6.Mj;
                v1Var6.c();
                break;
            default:
                super.a();
                zf.v1 v1Var7 = this.a;
                v1Var7.q = true;
                v1Var7.K = false;
                v1Var7.L = true;
                v1Var7.H = true;
                v1Var7.c();
                break;
        }
    }

    @Override // zf.w1
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

    @Override // zf.w1, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.n) {
            case 3:
                super.onMeasure(i9, i10);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                break;
            case 4:
                super.onMeasure(i9, i10);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                break;
            case 5:
                super.onMeasure(i9, i10);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }
}
