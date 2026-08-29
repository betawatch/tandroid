package jh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;

    public /* synthetic */ l1(h5 h5Var, int i10) {
        this.a = i10;
        this.b = h5Var;
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
                h5 h5Var = this.b;
                if (!h5Var.f0.J) {
                    h5Var.r0.a(!r7.a.q, true);
                    break;
                }
                break;
            case 13:
                h5.T0(this.b, view);
                break;
            case 14:
                this.b.W1(true);
                break;
            case 15:
                float alpha = view.getAlpha();
                h5 h5Var2 = this.b;
                if (alpha >= 0.99f) {
                    h5Var2.Y1();
                    break;
                } else {
                    h5Var2.u1();
                    break;
                }
            case 16:
                h5.b1(this.b);
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
                    h5 h5Var3 = this.b;
                    nh.d dVar = h5Var3.f0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new l1(h5Var3, 22));
                    h5Var3.a0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    h5Var3.q2(3, true, null);
                    break;
                }
                break;
            case 21:
                h5 h5Var4 = this.b;
                h5Var4.R0 = true;
                h5Var4.r2(false);
                break;
            case 22:
                this.b.W1(false);
                break;
            case 23:
                s4 s4Var = this.b.I0;
                s4Var.h.e();
                s4Var.i.e();
                s4Var.j.e();
                s4Var.k.e();
                break;
            case 24:
                this.b.Q1();
                break;
            case 25:
                this.b.onBackPressed();
                break;
            default:
                h5 h5Var5 = this.b;
                h5Var5.R0 = true;
                h5Var5.r2(false);
                break;
        }
    }
}
