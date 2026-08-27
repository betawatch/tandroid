package hh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class n1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;

    public /* synthetic */ n1(i5 i5Var, int i10) {
        this.a = i10;
        this.b = i5Var;
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
                i5 i5Var = this.b;
                if (!i5Var.f0.J) {
                    i5Var.r0.a(!r7.a.q, true);
                    break;
                }
                break;
            case 13:
                i5.T0(this.b, view);
                break;
            case 14:
                this.b.W1(true);
                break;
            case 15:
                float alpha = view.getAlpha();
                i5 i5Var2 = this.b;
                if (alpha >= 0.99f) {
                    i5Var2.Y1();
                    break;
                } else {
                    i5Var2.u1();
                    break;
                }
            case 16:
                i5.b1(this.b);
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
                    i5 i5Var3 = this.b;
                    lh.d dVar = i5Var3.f0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new n1(i5Var3, 22));
                    i5Var3.a0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    i5Var3.q2(3, true, null);
                    break;
                }
                break;
            case 21:
                i5 i5Var4 = this.b;
                i5Var4.R0 = true;
                i5Var4.r2(false);
                break;
            case 22:
                this.b.W1(false);
                break;
            case 23:
                t4 t4Var = this.b.I0;
                t4Var.h.e();
                t4Var.i.e();
                t4Var.j.e();
                t4Var.k.e();
                break;
            case 24:
                this.b.Q1();
                break;
            case 25:
                this.b.onBackPressed();
                break;
            default:
                i5 i5Var5 = this.b;
                i5Var5.R0 = true;
                i5Var5.r2(false);
                break;
        }
    }
}
