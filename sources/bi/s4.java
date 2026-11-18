package bi;

import android.content.Context;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s4 implements q10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s4(int i7, org.telegram.ui.Wallet.u0 u0Var, org.telegram.ui.Wallet.d3 d3Var, org.telegram.ui.Wallet.y2 y2Var, String str, byte[] bArr, byte[] bArr2, org.telegram.ui.ActionBar.i6 i6Var) {
        this.b = i7;
        this.d = u0Var;
        this.e = y2Var;
        this.c = str;
        this.f = bArr;
        this.g = bArr2;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i7) {
            case 0:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj6;
                Context context = (Context) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                di.k1 k1Var = (di.k1) obj3;
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj;
                Boolean bool = (Boolean) obj2;
                p0Var.h = new TL_wallet.walletOnchainGiftActionDelist();
                p0Var.i = tL_starGiftUnique;
                int i10 = this.b;
                o3 o3Var = new o3(i10, context, tL_starGiftUnique, i6Var);
                String str = this.c;
                o3Var.k1(gd.M0(bool.booleanValue() ? 2131749513 : 2131749514, null), gd.a0(null, null, 2131749870, str));
                o3Var.Z1.e(gd.M0(2131749540, null), v4.i(p0Var.b), null, null);
                o3Var.d2.i(gd.M0(2131750416, null), false, true);
                o3Var.q2 = 2131749615;
                o3Var.j1(p0Var);
                o3Var.i1(new u4(k1Var, tL_starGiftUnique, str, i10, 0), new ai.v1(3, tL_starGiftUnique, str), new h4(context, i10, i6Var, o3Var, bool, 0));
                o3Var.show();
                break;
            default:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj6;
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj5;
                byte[] bArr = (byte[]) obj4;
                byte[] bArr2 = (byte[]) obj3;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str2 = (String) obj2;
                if (!y2Var.e || y2Var.d) {
                    if (sendtransfer != null) {
                        int i11 = this.b;
                        ConnectionsManager.getInstance(i11).sendRequestTyped(sendtransfer, new d3.b(1), new j4(i11, u0Var, this.c, bArr, bArr2, sendtransfer, y2Var));
                        break;
                    } else {
                        if (str2 == null) {
                            str2 = gd.M0(2131742728, null);
                        }
                        lc.c0(str2);
                        y2Var.d = false;
                        if (!y2Var.f) {
                            y2Var.f = true;
                            y2Var.b.a();
                        }
                        if (!y2Var.e) {
                            y2Var.a.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ s4(TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, String str, di.k1 k1Var) {
        this.d = tL_starGiftUnique;
        this.e = context;
        this.b = i7;
        this.f = i6Var;
        this.c = str;
        this.g = k1Var;
    }
}
