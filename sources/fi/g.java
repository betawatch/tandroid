package fi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.p20;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class g extends sg.z1 {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Context context, int i10) {
        super(context);
        this.n = i10;
    }

    @Override // sg.z1
    public final void a() {
        switch (this.n) {
            case 0:
                super.a();
                sg.y1 y1Var = this.a;
                y1Var.q = true;
                y1Var.K = false;
                y1Var.L = true;
                y1Var.H = true;
                y1Var.c();
                break;
            case 1:
                super.a();
                sg.y1 y1Var2 = this.a;
                y1Var2.q = true;
                y1Var2.K = false;
                y1Var2.L = true;
                y1Var2.H = true;
                y1Var2.c();
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
                sg.y1 y1Var3 = this.a;
                y1Var3.q = true;
                y1Var3.K = false;
                y1Var3.H = true;
                y1Var3.J = true;
                y1Var3.k = AndroidUtilities.dp(-14.0f);
                sg.y1 y1Var4 = this.a;
                y1Var4.x = 2000L;
                y1Var4.y = 3000;
                y1Var4.r = 16;
                y1Var4.G = false;
                y1Var4.N = 28;
                y1Var4.P = j6.Mj;
                y1Var4.c();
                break;
            case 4:
                sg.y1 y1Var5 = this.a;
                y1Var5.q = true;
                y1Var5.K = false;
                y1Var5.H = true;
                y1Var5.J = true;
                y1Var5.k = AndroidUtilities.dp(-14.0f);
                sg.y1 y1Var6 = this.a;
                y1Var6.x = 2000L;
                y1Var6.y = 3000;
                y1Var6.r = 16;
                y1Var6.G = false;
                y1Var6.N = 28;
                y1Var6.P = j6.Mj;
                y1Var6.c();
                break;
            default:
                super.a();
                sg.y1 y1Var7 = this.a;
                y1Var7.q = true;
                y1Var7.K = false;
                y1Var7.L = true;
                y1Var7.H = true;
                y1Var7.c();
                break;
        }
    }

    @Override // sg.z1
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

    @Override // sg.z1, android.view.View
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
