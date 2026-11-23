package ki;

import android.content.Context;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.q00;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class e extends ug.t1 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Context context, int i7) {
        super(context);
        this.r = i7;
    }

    @Override // ug.t1
    public final void a() {
        switch (this.r) {
            case 0:
                super.a();
                ug.s1 s1Var = this.a;
                s1Var.q = true;
                s1Var.K = false;
                s1Var.L = true;
                s1Var.H = true;
                s1Var.c();
                break;
            case 1:
                super.a();
                ug.s1 s1Var2 = this.a;
                s1Var2.q = true;
                s1Var2.K = false;
                s1Var2.L = true;
                s1Var2.H = true;
                s1Var2.c();
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
                ug.s1 s1Var3 = this.a;
                s1Var3.q = true;
                s1Var3.K = false;
                s1Var3.H = true;
                s1Var3.J = true;
                s1Var3.k = org.telegram.messenger.g0.L(-14.0f);
                ug.s1 s1Var4 = this.a;
                s1Var4.x = 2000L;
                s1Var4.y = 3000;
                s1Var4.r = 16;
                s1Var4.G = false;
                s1Var4.O = 28;
                s1Var4.Q = m6.Dk;
                s1Var4.c();
                break;
            case 4:
                ug.s1 s1Var5 = this.a;
                s1Var5.q = true;
                s1Var5.K = false;
                s1Var5.H = true;
                s1Var5.J = true;
                s1Var5.k = org.telegram.messenger.g0.L(-14.0f);
                ug.s1 s1Var6 = this.a;
                s1Var6.x = 2000L;
                s1Var6.y = 3000;
                s1Var6.r = 16;
                s1Var6.G = false;
                s1Var6.O = 28;
                s1Var6.Q = m6.Dk;
                s1Var6.c();
                break;
            default:
                super.a();
                ug.s1 s1Var7 = this.a;
                s1Var7.q = true;
                s1Var7.K = false;
                s1Var7.L = true;
                s1Var7.H = true;
                s1Var7.c();
                break;
        }
    }

    @Override // ug.t1
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

    @Override // ug.t1, android.view.View
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
