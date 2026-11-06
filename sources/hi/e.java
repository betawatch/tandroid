package hi;

import android.content.Context;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.m00;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class e extends ug.q1 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Context context, int i7) {
        super(context);
        this.r = i7;
    }

    @Override // ug.q1
    public final void a() {
        switch (this.r) {
            case 0:
                super.a();
                ug.p1 p1Var = this.a;
                p1Var.q = true;
                p1Var.K = false;
                p1Var.L = true;
                p1Var.H = true;
                p1Var.c();
                break;
            case 1:
                super.a();
                ug.p1 p1Var2 = this.a;
                p1Var2.q = true;
                p1Var2.K = false;
                p1Var2.L = true;
                p1Var2.H = true;
                p1Var2.c();
                break;
            case 2:
                m00 m00Var = new m00(50);
                this.a = m00Var;
                m00Var.O = 100;
                m00Var.M = false;
                m00Var.G = false;
                m00Var.K = true;
                m00Var.H = true;
                m00Var.J = false;
                m00Var.r = 4;
                m00Var.w = 0.98f;
                m00Var.v = 0.98f;
                m00Var.u = 0.98f;
                m00Var.c();
                break;
            case 3:
                ug.p1 p1Var3 = this.a;
                p1Var3.q = true;
                p1Var3.K = false;
                p1Var3.H = true;
                p1Var3.J = true;
                p1Var3.k = org.telegram.messenger.g0.L(-14.0f);
                ug.p1 p1Var4 = this.a;
                p1Var4.x = 2000L;
                p1Var4.y = 3000;
                p1Var4.r = 16;
                p1Var4.G = false;
                p1Var4.O = 28;
                p1Var4.Q = k6.Ak;
                p1Var4.c();
                break;
            case 4:
                ug.p1 p1Var5 = this.a;
                p1Var5.q = true;
                p1Var5.K = false;
                p1Var5.H = true;
                p1Var5.J = true;
                p1Var5.k = org.telegram.messenger.g0.L(-14.0f);
                ug.p1 p1Var6 = this.a;
                p1Var6.x = 2000L;
                p1Var6.y = 3000;
                p1Var6.r = 16;
                p1Var6.G = false;
                p1Var6.O = 28;
                p1Var6.Q = k6.Ak;
                p1Var6.c();
                break;
            default:
                super.a();
                ug.p1 p1Var7 = this.a;
                p1Var7.q = true;
                p1Var7.K = false;
                p1Var7.L = true;
                p1Var7.H = true;
                p1Var7.c();
                break;
        }
    }

    @Override // ug.q1
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

    @Override // ug.q1, android.view.View
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
