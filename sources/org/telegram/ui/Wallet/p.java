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
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                m0 m0Var = (m0) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                String str = (String) this.d;
                byte[] bArr = (byte[]) obj;
                m0Var.getClass();
                if (bArr != null) {
                    TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                    walletuseraddress.user_id = 0L;
                    walletuseraddress.address = str;
                    walletuseraddress.public_key = bArr;
                    m0Var.M.put(str, walletuseraddress);
                    callback2.run(walletuseraddress, null);
                    break;
                } else {
                    callback2.run(null, null);
                    break;
                }
            case 1:
                f2 f2Var = (f2) this.b;
                b2 b2Var = (b2) this.c;
                ki.c cVar = (ki.c) this.d;
                String str2 = (String) obj;
                f2Var.getClass();
                b2Var.p = !b2Var.n && !f2Var.i(b2Var) && f2Var.y(b2Var) && str2 == null;
                cVar.run(null, str2);
                break;
            case 2:
                f2 f2Var2 = (f2) this.b;
                b2 b2Var2 = (b2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String str3 = (String) obj;
                f2Var2.getClass();
                b2Var2.m = false;
                if (b2Var2.r == null && f2Var2.g == b2Var2) {
                    f2Var2.g = null;
                }
                callback.run(str3);
                break;
            case 3:
                f2 f2Var3 = (f2) this.b;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
                l lVar = (l) this.d;
                f2Var3.getClass();
                AndroidUtilities.runOnUIThread(new w6((Object) f2Var3, (Object) tonconnectsession, (String) obj, (Object) lVar, 7));
                break;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.b;
                b4 b4Var = (b4) this.c;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) this.d;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    wallettransaction2.incoming = wallettransaction.incoming;
                    wallettransaction2.peer = wallettransaction.peer;
                    wallettransactionArr[0] = wallettransaction2;
                    b4Var.run(wallettransaction2);
                    break;
                }
                break;
            case 5:
                ei.d dVar = (ei.d) this.b;
                k2[] k2VarArr = (k2[]) this.c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                String str4 = (String) obj;
                dVar.setLoading(false);
                if (!TextUtils.isEmpty(str4)) {
                    new xc(k2VarArr[0].topBulletinContainer, d6Var).e0(str4, false);
                    break;
                } else {
                    k2VarArr[0].dismiss();
                    break;
                }
            case 6:
                h8 h8Var = (h8) this.c;
                m0 m0Var2 = (m0) this.b;
                m0Var2.j0(new e2.o0((Object) m0Var2, (Object) new o(h8Var, (Utilities.Callback) obj, (ArrayList) this.d, m0Var2), true, false, 3));
                break;
            case 7:
                r9 r9Var = (r9) this.c;
                m0 m0Var3 = (m0) this.b;
                TLRPC.User user = (TLRPC.User) this.d;
                String str5 = (String) obj;
                if (!r9Var.n) {
                    if (!TextUtils.isEmpty(str5) && m0.a(r9Var.e, m0Var3.s())) {
                        c0 c0Var = new c0(m0Var3, str5, r9Var.d, null, new q(r9Var, m0Var3, user, str5));
                        m0Var3.j0(c0Var);
                        r9Var.h = new n(c0Var, 1);
                        break;
                    } else {
                        r9Var.f = false;
                        r9Var.V.setLoading(false);
                        xc.a0(r9Var).e0(TextUtils.isEmpty(str5) ? LocaleController.getString(R.string.WalletRecipientUnavailable) : "WALLET_CHANGED", false);
                        break;
                    }
                }
                break;
            case 8:
                ((org.telegram.ui.Cells.h6) ((View) obj)).u((TLRPC.User) this.b, null, (CharSequence) this.c, (CharSequence) this.d, false, false);
                break;
            default:
                ei.d dVar2 = (ei.d) this.b;
                k2 k2Var = (k2) this.c;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                String str6 = (String) obj;
                dVar2.setLoading(false);
                if (str6 != null) {
                    xc.c0(str6, k2Var.topBulletinContainer, d6Var2);
                    break;
                } else {
                    k2Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ p(w61 w61Var, m0 m0Var, Object obj, int i10) {
        this.a = i10;
        this.c = w61Var;
        this.b = m0Var;
        this.d = obj;
    }
}
