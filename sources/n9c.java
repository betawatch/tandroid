// default package

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class n9c extends e {
    public wa a;
    public b84 b;
    public int c;
    public int d;

    public n9c() {
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
    public void Y(ArrayList arrayList, l9c l9cVar) {
        List<b35> list;
        c C = c.C(this.currentAccount);
        TL_wallet.WalletState walletState = C.e;
        boolean z = true;
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
            if (!tL_walletState.can_export_phrase) {
                k35 k35Var = C.c;
                if (k35Var != null) {
                }
            }
            arrayList.add(b8c.u(ob6.M0(2131742665, null)));
            b8c e = b8c.e(1, ob6.M0(2131742667, null));
            e.r = true;
            arrayList.add(e);
            arrayList.add(b8c.C(ob6.M0(2131742662, null)));
            TL_wallet.WalletState walletState2 = C.e;
            if (!(!(walletState2 instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState2).backup_enabled)) {
                if (walletState2 instanceof TL_wallet.TL_walletState) {
                    TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState2;
                    if (tL_walletState2.can_enable_backup) {
                        k35 k35Var2 = C.c;
                        if (k35Var2 != null) {
                        }
                    }
                }
                b8c e2 = b8c.e(4, ob6.M0(2131742791, null));
                e2.s = true;
                arrayList.add(e2);
                list = C.K;
                if (list.isEmpty()) {
                    for (b35 b35Var : list) {
                        if (b35Var.e) {
                            boolean z2 = f11.a;
                        } else {
                            if (z) {
                                arrayList.add(b8c.C(null));
                                arrayList.add(b8c.u(ob6.M0(2131742680, null)));
                                z = false;
                            }
                            String str = b35Var.a;
                            long j = b35Var.c;
                            int i = b35Var.b;
                            boolean z3 = b35Var.e;
                            int i2 = etc.b;
                            b8c K = b8c.K(etc.class);
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
                    arrayList.add(b8c.C(ob6.M0(2131742679, null)));
                    return;
                }
                return;
            }
            bp1.o(2131742777, null, arrayList);
            TL_wallet.WalletState walletState3 = C.e;
            if (!(walletState3 instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState3).backup_enabled) {
                b8c e3 = b8c.e(3, ob6.M0(2131742786, null));
                e3.s = true;
                arrayList.add(e3);
                arrayList.add(b8c.C(ob6.M0(2131742838, null)));
            } else {
                b8c e4 = b8c.e(2, ob6.M0(2131742778, null));
                e4.r = true;
                arrayList.add(e4);
                arrayList.add(b8c.C(ob6.M0(2131742841, null)));
            }
            b8c e22 = b8c.e(4, ob6.M0(2131742791, null));
            e22.s = true;
            arrayList.add(e22);
            list = C.K;
            if (list.isEmpty()) {
            }
        }
    }

    public CharSequence Z() {
        return ob6.M0(2131752706, null);
    }

    public void a0(b8c b8cVar, View view) {
        byte b = 1;
        if (b8cVar.d == 1) {
            r41 d = r41.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.a).sendRequest(createbusinesschatlink, new p41(d, b));
            return;
        }
        if (b8cVar.a == 29) {
            Object obj = b8cVar.H;
            if (obj instanceof m41) {
                Bundle j = qu6.j(6, "chatMode");
                j.putString("business_link", ((m41) obj).a.link);
                presentFragment(new zu1(j));
            }
        }
    }

    public boolean b0(b8c b8cVar, View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public View createView(Context context) {
        rn8 rn8Var = new rn8(this, (byte) 25);
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null) {
            jlaVar.setBackButtonDrawable(new gd0(false));
            this.simpleActionBar.setTitle(Z());
            this.simpleActionBar.setActionBarMenuOnItemClick(rn8Var);
        } else {
            this.actionBar.setBackButtonDrawable(new gd0(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(Z());
            this.actionBar.setActionBarMenuOnItemClick(rn8Var);
        }
        this.b = new b84(context, null, (byte) 3);
        if (!useSimpleActionBar()) {
            yob.h(aob.a7, null, this.b);
        }
        wa waVar = new wa(this, this, new l8b(this, (byte) 9), new m9c(this), new m9c(this));
        this.a = waVar;
        this.b.addView(waVar, tre.c(-1.0f, -1));
        b84 b84Var = this.b;
        this.fragmentView = b84Var;
        return b84Var;
    }
}
