package lh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;

    public /* synthetic */ l1(g5 g5Var, int i10) {
        this.a = i10;
        this.b = g5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.onBackPressed();
                break;
            case 1:
                this.b.w1();
                break;
            case 2:
                this.b.onBackPressed();
                break;
            case 3:
                this.b.a2();
                break;
            case 4:
                this.b.dismiss();
                break;
            case 5:
                this.b.a2();
                break;
            case 6:
                this.b.onBackPressed();
                break;
            case 7:
                this.b.Q1();
                break;
            case 8:
                this.b.a2();
                break;
            case 9:
                this.b.onBackPressed();
                break;
            case 10:
                this.b.W1(true);
                break;
            case 11:
                this.b.a2();
                break;
            case 12:
                g5 g5Var = this.b;
                if (!g5Var.g0.K) {
                    g5Var.s0.a(!r7.a.q, true);
                    break;
                }
                break;
            case 13:
                g5.T0(this.b, view);
                break;
            case 14:
                this.b.W1(true);
                break;
            case 15:
                float alpha = view.getAlpha();
                g5 g5Var2 = this.b;
                if (alpha >= 0.99f) {
                    g5Var2.Y1();
                    break;
                } else {
                    g5Var2.u1();
                    break;
                }
            case 16:
                g5.b1(this.b);
                break;
            case 17:
                this.b.S1();
                break;
            case 18:
                this.b.R1(view);
                break;
            case 19:
                this.b.U1();
                break;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    g5 g5Var3 = this.b;
                    ph.d dVar = g5Var3.g0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new l1(g5Var3, 22));
                    g5Var3.b0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    g5Var3.q2(3, true, null);
                    break;
                }
                break;
            case 21:
                g5 g5Var4 = this.b;
                g5Var4.S0 = true;
                g5Var4.r2(false);
                break;
            case 22:
                this.b.W1(false);
                break;
            case 23:
                r4 r4Var = this.b.J0;
                r4Var.h.e();
                r4Var.i.e();
                r4Var.j.e();
                r4Var.k.e();
                break;
            case 24:
                this.b.Q1();
                break;
            case 25:
                this.b.onBackPressed();
                break;
            default:
                g5 g5Var5 = this.b;
                g5Var5.S0 = true;
                g5Var5.r2(false);
                break;
        }
    }
}
