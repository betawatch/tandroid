// default package

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class n5c extends d {
    public va a;
    public g74 b;
    public int c;
    public int d;

    public n5c() {
        super(null);
        this.c = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r0.f(r10.public_key) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0024, code lost:
    
        if (r8.f() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0.f(r10.public_key) == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Y(ArrayList arrayList, l5c l5cVar) {
        List<x05> list;
        c C = c.C(this.currentAccount);
        TL_wallet.WalletState walletState = C.e;
        boolean z = true;
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
            if (!tL_walletState.can_export_phrase) {
                g15 g15Var = C.c;
                if (g15Var != null) {
                }
            }
            arrayList.add(c4c.u(k96.M0(2131742771, null)));
            c4c e = c4c.e(1, k96.M0(2131742773, null));
            e.r = true;
            arrayList.add(e);
            arrayList.add(c4c.C(k96.M0(2131742768, null)));
            TL_wallet.WalletState walletState2 = C.e;
            if (!(!(walletState2 instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState2).backup_enabled)) {
                if (walletState2 instanceof TL_wallet.TL_walletState) {
                    TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState2;
                    if (tL_walletState2.can_enable_backup) {
                        g15 g15Var2 = C.c;
                        if (g15Var2 != null) {
                        }
                    }
                }
                c4c e2 = c4c.e(4, k96.M0(2131742897, null));
                e2.s = true;
                arrayList.add(e2);
                list = C.K;
                if (list.isEmpty()) {
                    for (x05 x05Var : list) {
                        if (x05Var.e) {
                            boolean z2 = w01.a;
                        } else {
                            if (z) {
                                arrayList.add(c4c.C(null));
                                arrayList.add(c4c.u(k96.M0(2131742786, null)));
                                z = false;
                            }
                            String str = x05Var.a;
                            long j = x05Var.c;
                            int i = x05Var.b;
                            boolean z3 = x05Var.e;
                            int i2 = roc.b;
                            c4c K = c4c.K(roc.class);
                            K.m = str;
                            K.C = j;
                            K.A = i;
                            K.r = z3;
                            arrayList.add(K);
                        }
                    }
                    if (z) {
                        return;
                    }
                    arrayList.add(c4c.C(k96.M0(2131742785, null)));
                    return;
                }
                return;
            }
            oo1.o(2131742883, null, arrayList);
            TL_wallet.WalletState walletState3 = C.e;
            if (!(walletState3 instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState3).backup_enabled) {
                c4c e3 = c4c.e(3, k96.M0(2131742892, null));
                e3.s = true;
                arrayList.add(e3);
                arrayList.add(c4c.C(k96.M0(2131742944, null)));
            } else {
                c4c e4 = c4c.e(2, k96.M0(2131742884, null));
                e4.r = true;
                arrayList.add(e4);
                arrayList.add(c4c.C(k96.M0(2131742947, null)));
            }
            c4c e22 = c4c.e(4, k96.M0(2131742897, null));
            e22.s = true;
            arrayList.add(e22);
            list = C.K;
            if (list.isEmpty()) {
            }
        }
    }

    public CharSequence Z() {
        return k96.M0(2131752713, null);
    }

    public void a0(c4c c4cVar, View view) {
        byte b = 1;
        if (c4cVar.d == 1) {
            j41 d = j41.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.a).sendRequest(createbusinesschatlink, new h41(d, b));
            return;
        }
        if (c4cVar.a == 29) {
            Object obj = c4cVar.H;
            if (obj instanceof e41) {
                Bundle j = ls6.j(6, "chatMode");
                j.putString("business_link", ((e41) obj).a.link);
                presentFragment(new mu1(j));
            }
        }
    }

    public boolean b0(c4c c4cVar, View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public View createView(Context context) {
        kk8 kk8Var = new kk8(this, (byte) 23);
        pha phaVar = this.simpleActionBar;
        if (phaVar != null) {
            phaVar.setBackButtonDrawable(new ed0(false));
            this.simpleActionBar.setTitle(Z());
            this.simpleActionBar.setActionBarMenuOnItemClick(kk8Var);
        } else {
            this.actionBar.setBackButtonDrawable(new ed0(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(Z());
            this.actionBar.setActionBarMenuOnItemClick(kk8Var);
        }
        this.b = new g74(context, null, (byte) 3);
        if (!useSimpleActionBar()) {
            zkb.h(bkb.Z6, null, this.b);
        }
        va vaVar = new va(this, this, new n4b(this, (byte) 9), new m5c(this), new m5c(this));
        this.a = vaVar;
        this.b.addView(vaVar, nme.c(-1.0f, -1));
        g74 g74Var = this.b;
        this.fragmentView = g74Var;
        return g74Var;
    }
}
