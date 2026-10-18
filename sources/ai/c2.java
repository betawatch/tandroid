package ai;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                this.b.v2();
                break;
            case 1:
                this.b.k2();
                break;
            case 2:
                k7 k7Var = this.b;
                if (k7Var.Y1() != null && k7Var.Y1().host_id != null) {
                    k7Var.l2();
                    break;
                } else {
                    org.telegram.messenger.g0.q(R.string.Gift2WearWalletHidden, k7Var.getBulletinFactory(), R.raw.info, 36);
                    break;
                }
            case 3:
                k7 k7Var2 = this.b;
                k7Var2.Y0 = true;
                k7Var2.P2(false);
                break;
            case 4:
                this.b.onBackPressed();
                break;
            case 5:
                this.b.K1();
                break;
            case 6:
                this.b.onBackPressed();
                break;
            case 7:
                this.b.t2();
                break;
            case 8:
                this.b.dismiss();
                break;
            case 9:
                this.b.t2();
                break;
            case 10:
                this.b.onBackPressed();
                break;
            case 11:
                this.b.e2();
                break;
            case 12:
                this.b.t2();
                break;
            case 13:
                this.b.onBackPressed();
                break;
            case 14:
                this.b.n2(true);
                break;
            case 15:
                this.b.t2();
                break;
            case 16:
                if (view.getAlpha() >= 1.0f) {
                    k7 k7Var3 = this.b;
                    ei.d dVar = k7Var3.k0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new c2(k7Var3, 27));
                    k7Var3.f0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    k7Var3.O2(3, true, null);
                    break;
                }
                break;
            case 17:
                k7 k7Var4 = this.b;
                if (!k7Var4.k0.N) {
                    k7Var4.w0.a(!r7.a.q, true);
                    break;
                }
                break;
            case 18:
                k7.i1(this.b);
                break;
            case 19:
                k7.W0(this.b, view);
                break;
            case 20:
                this.b.n2(true);
                break;
            case 21:
                float alpha = view.getAlpha();
                k7 k7Var5 = this.b;
                if (alpha >= 0.99f) {
                    k7Var5.q2();
                    break;
                } else {
                    k7Var5.H1();
                    break;
                }
            case 22:
                this.b.l2();
                break;
            case 23:
                this.b.g2();
                break;
            case 24:
                this.b.f2(view);
                break;
            case 25:
                this.b.j2();
                break;
            case 26:
                k7 k7Var6 = this.b;
                k7Var6.Y0 = true;
                k7Var6.P2(false);
                break;
            case 27:
                this.b.n2(false);
                break;
            case 28:
                this.b.v2();
                break;
            default:
                this.b.onBackPressed();
                break;
        }
    }
}
