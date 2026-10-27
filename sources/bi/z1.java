package bi;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;

    public /* synthetic */ z1(h7 h7Var, int i10) {
        this.a = i10;
        this.b = h7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                h7 h7Var = this.b;
                org.telegram.ui.Wallet.t4 t4Var = h7Var.h1;
                if (t4Var != null) {
                    h7Var.dismiss();
                    AndroidUtilities.runOnUIThread(new a3.d(t4Var, 24), 250L);
                    break;
                }
                break;
            case 1:
                this.b.B2();
                break;
            case 2:
                this.b.q2();
                break;
            case 3:
                h7 h7Var2 = this.b;
                if (h7Var2.e2() != null && h7Var2.e2().host_id != null) {
                    h7Var2.r2();
                    break;
                } else {
                    org.telegram.messenger.t.q(R.string.Gift2WearWalletHidden, h7Var2.getBulletinFactory(), R.raw.info, 36);
                    break;
                }
            case 4:
                h7 h7Var3 = this.b;
                h7Var3.Y0 = true;
                h7Var3.V2(false);
                break;
            case 5:
                this.b.onBackPressed();
                break;
            case 6:
                this.b.Q1();
                break;
            case 7:
                this.b.onBackPressed();
                break;
            case 8:
                this.b.z2();
                break;
            case 9:
                this.b.dismiss();
                break;
            case 10:
                this.b.z2();
                break;
            case 11:
                this.b.onBackPressed();
                break;
            case 12:
                this.b.k2();
                break;
            case 13:
                this.b.z2();
                break;
            case 14:
                this.b.onBackPressed();
                break;
            case 15:
                this.b.t2(true);
                break;
            case 16:
                this.b.z2();
                break;
            case 17:
                if (view.getAlpha() >= 1.0f) {
                    h7 h7Var4 = this.b;
                    fi.d dVar = h7Var4.k0;
                    dVar.i(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.g(null, true);
                    dVar.setOnClickListener(new z1(h7Var4, 28));
                    h7Var4.f0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    h7Var4.U2(3, true, null);
                    break;
                }
                break;
            case 18:
                h7 h7Var5 = this.b;
                if (!h7Var5.k0.Q) {
                    h7Var5.w0.a(!r7.a.q, true);
                    break;
                }
                break;
            case 19:
                h7.j1(this.b);
                break;
            case 20:
                h7.Y0(this.b, view);
                break;
            case 21:
                this.b.t2(true);
                break;
            case 22:
                float alpha = view.getAlpha();
                h7 h7Var6 = this.b;
                if (alpha >= 0.99f) {
                    h7Var6.w2();
                    break;
                } else {
                    h7Var6.N1();
                    break;
                }
            case 23:
                this.b.r2();
                break;
            case 24:
                this.b.m2();
                break;
            case 25:
                this.b.l2(view);
                break;
            case 26:
                this.b.p2();
                break;
            case 27:
                h7 h7Var7 = this.b;
                h7Var7.Y0 = true;
                h7Var7.V2(false);
                break;
            case 28:
                this.b.t2(false);
                break;
            default:
                this.b.B2();
                break;
        }
    }
}
