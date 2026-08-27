package ag;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.y10;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j extends k3 {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Context context, int i10) {
        super(context);
        this.n = i10;
    }

    @Override // ag.k3
    public final void a() {
        switch (this.n) {
            case 0:
                j3 j3Var = this.a;
                j3Var.q = true;
                j3Var.K = false;
                j3Var.H = true;
                j3Var.J = true;
                j3Var.k = AndroidUtilities.dp(-14.0f);
                j3 j3Var2 = this.a;
                j3Var2.x = 2000L;
                j3Var2.y = 3000;
                j3Var2.r = 16;
                j3Var2.G = false;
                j3Var2.N = 28;
                j3Var2.P = g6.Mj;
                j3Var2.c();
                break;
            case 1:
                super.a();
                j3 j3Var3 = this.a;
                j3Var3.q = true;
                j3Var3.K = false;
                j3Var3.L = true;
                j3Var3.H = true;
                j3Var3.c();
                break;
            case 2:
                super.a();
                j3 j3Var4 = this.a;
                j3Var4.q = true;
                j3Var4.K = false;
                j3Var4.L = true;
                j3Var4.H = true;
                j3Var4.c();
                break;
            case 3:
                super.a();
                j3 j3Var5 = this.a;
                j3Var5.q = true;
                j3Var5.K = false;
                j3Var5.L = true;
                j3Var5.H = true;
                j3Var5.c();
                break;
            case 4:
                y10 y10Var = new y10(50);
                this.a = y10Var;
                y10Var.N = 100;
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
            default:
                j3 j3Var6 = this.a;
                j3Var6.q = true;
                j3Var6.K = false;
                j3Var6.H = true;
                j3Var6.J = true;
                j3Var6.k = AndroidUtilities.dp(-14.0f);
                j3 j3Var7 = this.a;
                j3Var7.x = 2000L;
                j3Var7.y = 3000;
                j3Var7.r = 16;
                j3Var7.G = false;
                j3Var7.N = 28;
                j3Var7.P = g6.Mj;
                j3Var7.c();
                break;
        }
    }

    @Override // ag.k3
    public int getStarsRectWidth() {
        switch (this.n) {
            case 2:
                return getMeasuredWidth();
            case 3:
                return getMeasuredWidth();
            case 4:
                return getMeasuredWidth();
            default:
                return super.getStarsRectWidth();
        }
    }

    @Override // ag.k3, android.view.View
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
