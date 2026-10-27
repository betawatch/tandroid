package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                l0 l0Var = (l0) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                String str = (String) this.d;
                byte[] bArr = (byte[]) obj;
                l0Var.getClass();
                if (bArr != null) {
                    TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                    walletuseraddress.user_id = 0L;
                    walletuseraddress.address = str;
                    walletuseraddress.public_key = bArr;
                    l0Var.M.put(str, walletuseraddress);
                    callback2.run(walletuseraddress, null);
                    break;
                } else {
                    callback2.run(null, null);
                    break;
                }
            case 1:
                e2 e2Var = (e2) this.b;
                a2 a2Var = (a2) this.c;
                li.c cVar = (li.c) this.d;
                String str2 = (String) obj;
                e2Var.getClass();
                a2Var.p = !a2Var.n && !e2Var.i(a2Var) && e2Var.y(a2Var) && str2 == null;
                cVar.run(null, str2);
                break;
            case 2:
                e2 e2Var2 = (e2) this.b;
                a2 a2Var2 = (a2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String str3 = (String) obj;
                e2Var2.getClass();
                a2Var2.m = false;
                if (a2Var2.r == null && e2Var2.g == a2Var2) {
                    e2Var2.g = null;
                }
                callback.run(str3);
                break;
            case 3:
                e2 e2Var3 = (e2) this.b;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
                k kVar = (k) this.d;
                e2Var3.getClass();
                AndroidUtilities.runOnUIThread(new w6((Object) e2Var3, (Object) tonconnectsession, (String) obj, (Object) kVar, 7));
                break;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.b;
                di.s sVar = (di.s) this.c;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) this.d;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    wallettransaction2.incoming = wallettransaction.incoming;
                    wallettransaction2.peer = wallettransaction.peer;
                    wallettransactionArr[0] = wallettransaction2;
                    sVar.run(wallettransaction2);
                    break;
                }
                break;
            case 5:
                fi.d dVar = (fi.d) this.b;
                j2[] j2VarArr = (j2[]) this.c;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.d;
                String str4 = (String) obj;
                dVar.setLoading(false);
                if (!TextUtils.isEmpty(str4)) {
                    new wc(j2VarArr[0].topBulletinContainer, u6Var).f0(str4, false);
                    break;
                } else {
                    j2VarArr[0].dismiss();
                    break;
                }
            case 6:
                h8 h8Var = (h8) this.c;
                l0 l0Var2 = (l0) this.b;
                l0Var2.m0(new e2.p0((Object) l0Var2, (Object) new n(h8Var, (Utilities.Callback) obj, (ArrayList) this.d, l0Var2), true, false, 3));
                break;
            case 7:
                r9 r9Var = (r9) this.c;
                l0 l0Var3 = (l0) this.b;
                TLRPC.User user = (TLRPC.User) this.d;
                String str5 = (String) obj;
                if (!r9Var.r) {
                    if (!TextUtils.isEmpty(str5) && l0.b(r9Var.f, l0Var3.t())) {
                        b0 b0Var = new b0(l0Var3, str5, r9Var.e, null, new p(r9Var, l0Var3, user, str5));
                        l0Var3.m0(b0Var);
                        r9Var.n = new m(b0Var, 1);
                        break;
                    } else {
                        r9Var.h = false;
                        r9Var.Z.setLoading(false);
                        wc.b0(r9Var).f0(TextUtils.isEmpty(str5) ? LocaleController.getString(R.string.WalletRecipientUnavailable) : "WALLET_CHANGED", false);
                        break;
                    }
                }
                break;
            case 8:
                ((org.telegram.ui.Cells.m6) ((View) obj)).s((TLRPC.User) this.b, null, (CharSequence) this.c, (CharSequence) this.d, false, false);
                break;
            default:
                fi.d dVar2 = (fi.d) this.b;
                j2 j2Var = (j2) this.c;
                org.telegram.ui.ActionBar.u6 u6Var2 = (org.telegram.ui.ActionBar.u6) this.d;
                String str6 = (String) obj;
                dVar2.setLoading(false);
                if (str6 != null) {
                    wc.d0(str6, j2Var.topBulletinContainer, u6Var2);
                    break;
                } else {
                    j2Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ o(n71 n71Var, l0 l0Var, Object obj, int i10) {
        this.a = i10;
        this.c = n71Var;
        this.b = l0Var;
        this.d = obj;
    }
}
