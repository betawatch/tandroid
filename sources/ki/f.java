package ki;

import android.content.Context;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.q00;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class f extends ug.u1 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Context context, int i7) {
        super(context);
        this.r = i7;
    }

    @Override // ug.u1
    public final void a() {
        switch (this.r) {
            case 0:
                super.a();
                ug.t1 t1Var = this.a;
                t1Var.q = true;
                t1Var.K = false;
                t1Var.L = true;
                t1Var.H = true;
                t1Var.c();
                break;
            case 1:
                super.a();
                ug.t1 t1Var2 = this.a;
                t1Var2.q = true;
                t1Var2.K = false;
                t1Var2.L = true;
                t1Var2.H = true;
                t1Var2.c();
                break;
            case 2:
                q00 q00Var = new q00(50);
                this.a = q00Var;
                q00Var.O = 100;
                q00Var.M = false;
                q00Var.G = false;
                q00Var.K = true;
                q00Var.H = true;
                q00Var.J = false;
                q00Var.r = 4;
                q00Var.w = 0.98f;
                q00Var.v = 0.98f;
                q00Var.u = 0.98f;
                q00Var.c();
                break;
            case 3:
                ug.t1 t1Var3 = this.a;
                t1Var3.q = true;
                t1Var3.K = false;
                t1Var3.H = true;
                t1Var3.J = true;
                t1Var3.k = org.telegram.messenger.g0.L(-14.0f);
                ug.t1 t1Var4 = this.a;
                t1Var4.x = 2000L;
                t1Var4.y = 3000;
                t1Var4.r = 16;
                t1Var4.G = false;
                t1Var4.O = 28;
                t1Var4.Q = n6.Dk;
                t1Var4.c();
                break;
            case 4:
                ug.t1 t1Var5 = this.a;
                t1Var5.q = true;
                t1Var5.K = false;
                t1Var5.H = true;
                t1Var5.J = true;
                t1Var5.k = org.telegram.messenger.g0.L(-14.0f);
                ug.t1 t1Var6 = this.a;
                t1Var6.x = 2000L;
                t1Var6.y = 3000;
                t1Var6.r = 16;
                t1Var6.G = false;
                t1Var6.O = 28;
                t1Var6.Q = n6.Dk;
                t1Var6.c();
                break;
            default:
                super.a();
                ug.t1 t1Var7 = this.a;
                t1Var7.q = true;
                t1Var7.K = false;
                t1Var7.L = true;
                t1Var7.H = true;
                t1Var7.c();
                break;
        }
    }

    @Override // ug.u1
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

    @Override // ug.u1, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.r) {
            case 3:
                super.onMeasure(i7, i10);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                break;
            case 4:
                super.onMeasure(i7, i10);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                break;
            case 5:
                super.onMeasure(i7, i10);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }
}
