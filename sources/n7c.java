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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class n7c extends d {
    public va a;
    public p84 b;
    public int c;
    public int d;

    public n7c() {
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
    public void Z(ArrayList arrayList, l7c l7cVar) {
        List<x25> list;
        c C = c.C(this.currentAccount);
        TL_wallet.WalletState walletState = C.e;
        boolean z = true;
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
            if (!tL_walletState.can_export_phrase) {
                g35 g35Var = C.c;
                if (g35Var != null) {
                }
            }
            arrayList.add(c6c.u(jb6.M0(2131742697, null)));
            c6c e = c6c.e(1, jb6.M0(2131742699, null));
            e.r = true;
            arrayList.add(e);
            arrayList.add(c6c.C(jb6.M0(2131742694, null)));
            TL_wallet.WalletState walletState2 = C.e;
            if (!(!(walletState2 instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState2).backup_enabled)) {
                if (walletState2 instanceof TL_wallet.TL_walletState) {
                    TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState2;
                    if (tL_walletState2.can_enable_backup) {
                        g35 g35Var2 = C.c;
                        if (g35Var2 != null) {
                        }
                    }
                }
                c6c e2 = c6c.e(4, jb6.M0(2131742823, null));
                e2.s = true;
                arrayList.add(e2);
                list = C.K;
                if (list.isEmpty()) {
                    for (x25 x25Var : list) {
                        if (x25Var.e) {
                            boolean z2 = e21.a;
                        } else {
                            if (z) {
                                arrayList.add(c6c.C(null));
                                arrayList.add(c6c.u(jb6.M0(2131742712, null)));
                                z = false;
                            }
                            String str = x25Var.a;
                            long j = x25Var.c;
                            int i = x25Var.b;
                            boolean z3 = x25Var.e;
                            int i2 = tqc.b;
                            c6c K = c6c.K(tqc.class);
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
                    arrayList.add(c6c.C(jb6.M0(2131742711, null)));
                    return;
                }
                return;
            }
            aq1.o(2131742809, null, arrayList);
            TL_wallet.WalletState walletState3 = C.e;
            if (!(walletState3 instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState3).backup_enabled) {
                c6c e3 = c6c.e(3, jb6.M0(2131742818, null));
                e3.s = true;
                arrayList.add(e3);
                arrayList.add(c6c.C(jb6.M0(2131742870, null)));
            } else {
                c6c e4 = c6c.e(2, jb6.M0(2131742810, null));
                e4.r = true;
                arrayList.add(e4);
                arrayList.add(c6c.C(jb6.M0(2131742873, null)));
            }
            c6c e22 = c6c.e(4, jb6.M0(2131742823, null));
            e22.s = true;
            arrayList.add(e22);
            list = C.K;
            if (list.isEmpty()) {
            }
        }
    }

    public CharSequence a0() {
        return jb6.M0(2131752678, null);
    }

    public void b0(c6c c6cVar, View view) {
        byte b = 1;
        if (c6cVar.d == 1) {
            q51 d = q51.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.a).sendRequest(createbusinesschatlink, new o51(d, b));
            return;
        }
        if (c6cVar.a == 29) {
            Object obj = c6cVar.H;
            if (obj instanceof l51) {
                Bundle j = kt6.j(6, "chatMode");
                j.putString("business_link", ((l51) obj).a.link);
                presentFragment(new yv1(j));
            }
        }
    }

    public boolean c0(c6c c6cVar, View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public View createView(Context context) {
        im8 im8Var = new im8(this, (byte) 24);
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            rjaVar.setBackButtonDrawable(new ee0(false));
            this.simpleActionBar.setTitle(a0());
            this.simpleActionBar.setActionBarMenuOnItemClick(im8Var);
        } else {
            this.actionBar.setBackButtonDrawable(new ee0(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(a0());
            this.actionBar.setActionBarMenuOnItemClick(im8Var);
        }
        this.b = new p84(context, null, (byte) 3);
        if (!useSimpleActionBar()) {
            anb.h(cmb.Z6, null, this.b);
        }
        va vaVar = new va(this, this, new o6b(this, (byte) 9), new m7c(this), new m7c(this));
        this.a = vaVar;
        this.b.addView(vaVar, qoe.c(-1.0f, -1));
        p84 p84Var = this.b;
        this.fragmentView = p84Var;
        return p84Var;
    }
}
