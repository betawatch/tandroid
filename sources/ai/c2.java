package ai;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ c2(k7 k7Var, int i10) {
        this.a = i10;
        this.b = k7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                k7 k7Var = this.b;
                org.telegram.ui.Wallet.t4 t4Var = k7Var.h1;
                if (t4Var != null) {
                    k7Var.dismiss();
                    AndroidUtilities.runOnUIThread(new a3.d(t4Var, 13), 250L);
                    break;
                }
                break;
            case 1:
                this.b.t2();
                break;
            case 2:
                this.b.i2();
                break;
            case 3:
                k7 k7Var2 = this.b;
                if (k7Var2.X1() != null && k7Var2.X1().host_id != null) {
                    k7Var2.j2();
                    break;
                } else {
                    org.telegram.messenger.q.q(R.string.Gift2WearWalletHidden, k7Var2.getBulletinFactory(), R.raw.info, 36);
                    break;
                }
            case 4:
                k7 k7Var3 = this.b;
                k7Var3.Y0 = true;
                k7Var3.N2(false);
                break;
            case 5:
                this.b.onBackPressed();
                break;
            case 6:
                this.b.J1();
                break;
            case 7:
                this.b.onBackPressed();
                break;
            case 8:
                this.b.dismiss();
                break;
            case 9:
                this.b.r2();
                break;
            case 10:
                this.b.r2();
                break;
            case 11:
                this.b.onBackPressed();
                break;
            case 12:
                this.b.d2();
                break;
            case 13:
                this.b.r2();
                break;
            case 14:
                this.b.onBackPressed();
                break;
            case 15:
                this.b.l2(true);
                break;
            case 16:
                this.b.r2();
                break;
            case 17:
                if (view.getAlpha() >= 1.0f) {
                    k7 k7Var4 = this.b;
                    ei.d dVar = k7Var4.k0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new c2(k7Var4, 28));
                    k7Var4.f0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    k7Var4.M2(3, true, null);
                    break;
                }
                break;
            case 18:
                k7 k7Var5 = this.b;
                if (!k7Var5.k0.N) {
                    k7Var5.w0.a(!r7.a.q, true);
                    break;
                }
                break;
            case 19:
                k7.h1(this.b);
                break;
            case 20:
                k7.W0(this.b, view);
                break;
            case 21:
                this.b.l2(true);
                break;
            case 22:
                float alpha = view.getAlpha();
                k7 k7Var6 = this.b;
                if (alpha >= 0.99f) {
                    k7Var6.o2();
                    break;
                } else {
                    k7Var6.G1();
                    break;
                }
            case 23:
                this.b.j2();
                break;
            case 24:
                this.b.f2();
                break;
            case 25:
                this.b.e2(view);
                break;
            case 26:
                this.b.h2();
                break;
            case 27:
                k7 k7Var7 = this.b;
                k7Var7.Y0 = true;
                k7Var7.N2(false);
                break;
            case 28:
                this.b.l2(false);
                break;
            default:
                this.b.t2();
                break;
        }
    }
}
