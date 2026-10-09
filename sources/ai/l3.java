package ai;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.zk;
import org.telegram.ui.ft;
import org.telegram.ui.kx;
import org.telegram.ui.ty;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l3 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    @Override // org.telegram.messenger.Utilities.Callback4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        kx kxVar;
        org.telegram.ui.ActionBar.n2 n2Var;
        org.telegram.ui.ActionBar.d5 parentLayout;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                ci.lc lcVar = (ci.lc) this.c;
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                kc kcVar = f6Var.J0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    e6 e6Var = f6Var.M2;
                    if (e6Var == null || ((jc) e6Var.c) != null) {
                        jc jcVar = (jc) e6Var.c;
                        jcVar.firstFrameRendered = false;
                        e6Var.a = false;
                        jcVar.setOnReadyListener(new p3(0, currentTimeMillis, runnable));
                        ((bc) f6Var.Q1).g(false);
                        fk0 fk0Var = f6Var.z0;
                        if (fk0Var != null) {
                            fk0Var.setAnimation(f6Var.x1.u);
                        }
                        if (f6Var.R2 > 0 && l4.longValue() > f6Var.R2 - 1400) {
                            l4 = 0L;
                        }
                        f6Var.T0(l4.longValue(), true);
                        f6Var.U3 = false;
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        if (bool.booleanValue()) {
                            f6Var.f1(false);
                            break;
                        }
                    } else {
                        ((bc) f6Var.Q1).g(false);
                        f6Var.setActive(true);
                        f6Var.U3 = false;
                        f6Var.i1 = new o3(0, runnable);
                        if (bool.booleanValue()) {
                            f6Var.f1(false);
                        }
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.n2 n2Var2 = kcVar.f;
                    if (n2Var2 != null && (parentLayout = n2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) fragmentStack.get(size);
                            if (n2Var3 instanceof ty) {
                                ty tyVar = (ty) n2Var3;
                                tyVar.H3();
                                kxVar = tyVar.E0;
                                r3 = kxVar != null ? kxVar.e(l10.longValue()) : null;
                                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.n2) arrayList.get(i10), false);
                                }
                                n2Var = kcVar.f;
                                if (n2Var != null) {
                                    n2Var.clearSheets();
                                }
                                kcVar.v();
                                f6Var.U3 = false;
                                if (kxVar != null || !kxVar.k(l10.longValue())) {
                                    lcVar.X(ci.gc.c(r3));
                                    AndroidUtilities.runOnUIThread(runnable, 400L);
                                    break;
                                } else {
                                    kxVar.b0.add(new n3(r3, kxVar, l10, lcVar, runnable, 0));
                                    break;
                                }
                            } else {
                                arrayList.add(n2Var3);
                            }
                        }
                    }
                    kxVar = null;
                    n2Var = kcVar.f;
                    if (n2Var != null) {
                    }
                    kcVar.v();
                    f6Var.U3 = false;
                    if (kxVar != null) {
                    }
                    lcVar.X(ci.gc.c(r3));
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                }
                break;
            case 1:
                mv0 mv0Var = (mv0) this.b;
                zk zkVar = (zk) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i11 = mv0Var.d;
                MessagesController.getInstance(i11).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i11).putChats((ArrayList) obj3, true);
                org.telegram.ui.Components.s5.h(i11).d((ArrayList) obj4);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                    if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(mv0Var.w);
                    mv0Var.n.add(messageObject);
                }
                mv0Var.G(true);
                AndroidUtilities.runOnUIThread(zkVar, 540L);
                break;
            default:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.b;
                org.telegram.ui.Wallet.d7 d7Var = (org.telegram.ui.Wallet.d7) this.c;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj2;
                byte[] bArr = (byte[]) obj3;
                String str = (String) obj4;
                if (sendtransfer != null && h0Var != null && bArr != null) {
                    org.telegram.ui.Wallet.k0.E("prepare disable backup: transfer ready, initing storage with new secret phrase!");
                    org.telegram.ui.Wallet.f0 f0Var = new org.telegram.ui.Wallet.f0();
                    f0Var.c = bArr;
                    f0Var.b = h0Var.b();
                    f0Var.a = sendtransfer;
                    k0Var.c.p(UserConfig.getInstance(k0Var.a).getClientUserId(), bArr, h0Var, new ft(k0Var, f0Var, d7Var));
                    break;
                } else {
                    org.telegram.ui.Wallet.k0.i("prepare disable backup, failed to prepare transfer: ".concat(str == null ? "NULL_ERROR" : str));
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    d7Var.run(null, str);
                    break;
                }
        }
    }
}
