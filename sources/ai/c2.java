package ai;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;

    public /* synthetic */ c2(l7 l7Var, int i10) {
        this.a = i10;
        this.b = l7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                l7 l7Var = this.b;
                org.telegram.ui.Wallet.w4 w4Var = l7Var.h1;
                if (w4Var != null) {
                    l7Var.dismiss();
                    AndroidUtilities.runOnUIThread(new a3.d(w4Var, 13), 250L);
                    break;
                }
                break;
            case 1:
                this.b.C2();
                break;
            case 2:
                this.b.r2();
                break;
            case 3:
                l7 l7Var2 = this.b;
                if (l7Var2.f2() != null && l7Var2.f2().host_id != null) {
                    l7Var2.s2();
                    break;
                } else {
                    org.telegram.messenger.g0.q(R.string.Gift2WearWalletHidden, l7Var2.getBulletinFactory(), R.raw.info, 36);
                    break;
                }
            case 4:
                l7 l7Var3 = this.b;
                l7Var3.Y0 = true;
                l7Var3.W2(false);
                break;
            case 5:
                this.b.onBackPressed();
                break;
            case 6:
                this.b.R1();
                break;
            case 7:
                this.b.onBackPressed();
                break;
            case 8:
                this.b.A2();
                break;
            case 9:
                this.b.dismiss();
                break;
            case 10:
                this.b.A2();
                break;
            case 11:
                this.b.onBackPressed();
                break;
            case 12:
                this.b.l2();
                break;
            case 13:
                this.b.A2();
                break;
            case 14:
                this.b.onBackPressed();
                break;
            case 15:
                this.b.u2(true);
                break;
            case 16:
                this.b.A2();
                break;
            case 17:
                if (view.getAlpha() >= 1.0f) {
                    l7 l7Var4 = this.b;
                    ei.d dVar = l7Var4.k0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new c2(l7Var4, 28));
                    l7Var4.f0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    l7Var4.V2(3, true, null);
                    break;
                }
                break;
            case 18:
                l7 l7Var5 = this.b;
                if (!l7Var5.k0.N) {
                    l7Var5.w0.a(!r7.a.q, true);
                    break;
                }
                break;
            case 19:
                l7.k1(this.b);
                break;
            case 20:
                l7.Z0(this.b, view);
                break;
            case 21:
                this.b.u2(true);
                break;
            case 22:
                float alpha = view.getAlpha();
                l7 l7Var6 = this.b;
                if (alpha >= 0.99f) {
                    l7Var6.x2();
                    break;
                } else {
                    l7Var6.O1();
                    break;
                }
            case 23:
                this.b.s2();
                break;
            case 24:
                this.b.n2();
                break;
            case 25:
                this.b.m2(view);
                break;
            case 26:
                this.b.q2();
                break;
            case 27:
                l7 l7Var7 = this.b;
                l7Var7.Y0 = true;
                l7Var7.W2(false);
                break;
            case 28:
                this.b.u2(false);
                break;
            default:
                this.b.C2();
                break;
        }
    }
}
