package ai;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                org.telegram.ui.Wallet.u4 u4Var = k7Var.h1;
                if (u4Var != null) {
                    k7Var.dismiss();
                    AndroidUtilities.runOnUIThread(new a3.d(u4Var, 13), 250L);
                    break;
                }
                break;
            case 1:
                this.b.v2();
                break;
            case 2:
                this.b.k2();
                break;
            case 3:
                k7 k7Var2 = this.b;
                if (k7Var2.Y1() != null && k7Var2.Y1().host_id != null) {
                    k7Var2.l2();
                    break;
                } else {
                    org.telegram.messenger.g0.q(R.string.Gift2WearWalletHidden, k7Var2.getBulletinFactory(), R.raw.info, 36);
                    break;
                }
            case 4:
                k7 k7Var3 = this.b;
                k7Var3.Y0 = true;
                k7Var3.P2(false);
                break;
            case 5:
                this.b.onBackPressed();
                break;
            case 6:
                this.b.K1();
                break;
            case 7:
                this.b.onBackPressed();
                break;
            case 8:
                this.b.dismiss();
                break;
            case 9:
                this.b.t2();
                break;
            case 10:
                this.b.t2();
                break;
            case 11:
                this.b.onBackPressed();
                break;
            case 12:
                this.b.e2();
                break;
            case 13:
                this.b.t2();
                break;
            case 14:
                this.b.onBackPressed();
                break;
            case 15:
                this.b.n2(true);
                break;
            case 16:
                this.b.t2();
                break;
            case 17:
                if (view.getAlpha() >= 1.0f) {
                    k7 k7Var4 = this.b;
                    ei.d dVar = k7Var4.k0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new c2(k7Var4, 28));
                    k7Var4.f0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    k7Var4.O2(3, true, null);
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
                k7.k1(this.b);
                break;
            case 20:
                k7.Y0(this.b, view);
                break;
            case 21:
                this.b.n2(true);
                break;
            case 22:
                float alpha = view.getAlpha();
                k7 k7Var6 = this.b;
                if (alpha >= 0.99f) {
                    k7Var6.q2();
                    break;
                } else {
                    k7Var6.H1();
                    break;
                }
            case 23:
                this.b.l2();
                break;
            case 24:
                this.b.g2();
                break;
            case 25:
                this.b.f2(view);
                break;
            case 26:
                this.b.j2();
                break;
            case 27:
                k7 k7Var7 = this.b;
                k7Var7.Y0 = true;
                k7Var7.P2(false);
                break;
            case 28:
                this.b.n2(false);
                break;
            default:
                this.b.v2();
                break;
        }
    }
}
