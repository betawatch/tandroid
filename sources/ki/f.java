package ki;

import android.content.Context;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.n00;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class f extends ug.s1 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Context context, int i7) {
        super(context);
        this.r = i7;
    }

    @Override // ug.s1
    public final void a() {
        switch (this.r) {
            case 0:
                super.a();
                ug.r1 r1Var = this.a;
                r1Var.q = true;
                r1Var.K = false;
                r1Var.L = true;
                r1Var.H = true;
                r1Var.c();
                break;
            case 1:
                super.a();
                ug.r1 r1Var2 = this.a;
                r1Var2.q = true;
                r1Var2.K = false;
                r1Var2.L = true;
                r1Var2.H = true;
                r1Var2.c();
                break;
            case 2:
                n00 n00Var = new n00(50);
                this.a = n00Var;
                n00Var.O = 100;
                n00Var.M = false;
                n00Var.G = false;
                n00Var.K = true;
                n00Var.H = true;
                n00Var.J = false;
                n00Var.r = 4;
                n00Var.w = 0.98f;
                n00Var.v = 0.98f;
                n00Var.u = 0.98f;
                n00Var.c();
                break;
            case 3:
                ug.r1 r1Var3 = this.a;
                r1Var3.q = true;
                r1Var3.K = false;
                r1Var3.H = true;
                r1Var3.J = true;
                r1Var3.k = org.telegram.messenger.g0.L(-14.0f);
                ug.r1 r1Var4 = this.a;
                r1Var4.x = 2000L;
                r1Var4.y = 3000;
                r1Var4.r = 16;
                r1Var4.G = false;
                r1Var4.O = 28;
                r1Var4.Q = j6.Dk;
                r1Var4.c();
                break;
            case 4:
                ug.r1 r1Var5 = this.a;
                r1Var5.q = true;
                r1Var5.K = false;
                r1Var5.H = true;
                r1Var5.J = true;
                r1Var5.k = org.telegram.messenger.g0.L(-14.0f);
                ug.r1 r1Var6 = this.a;
                r1Var6.x = 2000L;
                r1Var6.y = 3000;
                r1Var6.r = 16;
                r1Var6.G = false;
                r1Var6.O = 28;
                r1Var6.Q = j6.Dk;
                r1Var6.c();
                break;
            default:
                super.a();
                ug.r1 r1Var7 = this.a;
                r1Var7.q = true;
                r1Var7.K = false;
                r1Var7.L = true;
                r1Var7.H = true;
                r1Var7.c();
                break;
        }
    }

    @Override // ug.s1
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

    @Override // ug.s1, android.view.View
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
