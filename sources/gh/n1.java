package gh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class n1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;

    public /* synthetic */ n1(k5 k5Var, int i9) {
        this.a = i9;
        this.b = k5Var;
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
                k5 k5Var = this.b;
                if (!k5Var.f0.J) {
                    k5Var.r0.a(!r7.a.q, true);
                    break;
                }
                break;
            case 13:
                k5.T0(this.b, view);
                break;
            case 14:
                this.b.W1(true);
                break;
            case 15:
                float alpha = view.getAlpha();
                k5 k5Var2 = this.b;
                if (alpha >= 0.99f) {
                    k5Var2.Y1();
                    break;
                } else {
                    k5Var2.u1();
                    break;
                }
            case 16:
                k5.b1(this.b);
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
                    k5 k5Var3 = this.b;
                    kh.d dVar = k5Var3.f0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new n1(k5Var3, 22));
                    k5Var3.a0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    k5Var3.q2(3, true, null);
                    break;
                }
                break;
            case 21:
                k5 k5Var4 = this.b;
                k5Var4.R0 = true;
                k5Var4.r2(false);
                break;
            case 22:
                this.b.W1(false);
                break;
            case 23:
                v4 v4Var = this.b.I0;
                v4Var.h.e();
                v4Var.i.e();
                v4Var.j.e();
                v4Var.k.e();
                break;
            case 24:
                this.b.Q1();
                break;
            case 25:
                this.b.onBackPressed();
                break;
            default:
                k5 k5Var5 = this.b;
                k5Var5.R0 = true;
                k5Var5.r2(false);
                break;
        }
    }
}
