package ci;

import ei.qb;
import ei.vb;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.dv0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.ey;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i2 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i2(int i10, Object obj, Object obj2) {
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
        vw vwVar;
        org.telegram.ui.ActionBar.n2 n2Var;
        org.telegram.ui.ActionBar.d5 parentLayout;
        switch (this.a) {
            case 0:
                q4 q4Var = (q4) this.b;
                vb vbVar = (vb) this.c;
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                aa aaVar = q4Var.J0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    p4 p4Var = q4Var.M2;
                    if (p4Var == null || ((z9) p4Var.c) != null) {
                        z9 z9Var = (z9) p4Var.c;
                        z9Var.firstFrameRendered = false;
                        p4Var.a = false;
                        z9Var.setOnReadyListener(new l2(0, currentTimeMillis, runnable));
                        ((r9) q4Var.Q1).g(false);
                        xj0 xj0Var = q4Var.z0;
                        if (xj0Var != null) {
                            xj0Var.setAnimation(q4Var.x1.u);
                        }
                        if (q4Var.R2 > 0 && l4.longValue() > q4Var.R2 - 1400) {
                            l4 = 0L;
                        }
                        q4Var.T0(l4.longValue(), true);
                        q4Var.U3 = false;
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        if (bool.booleanValue()) {
                            q4Var.f1(false);
                            break;
                        }
                    } else {
                        ((r9) q4Var.Q1).g(false);
                        q4Var.setActive(true);
                        q4Var.U3 = false;
                        q4Var.i1 = new k2(0, runnable);
                        if (bool.booleanValue()) {
                            q4Var.f1(false);
                        }
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.n2 n2Var2 = aaVar.f;
                    if (n2Var2 != null && (parentLayout = n2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) fragmentStack.get(size);
                            if (n2Var3 instanceof ey) {
                                ey eyVar = (ey) n2Var3;
                                eyVar.I3();
                                vwVar = eyVar.E0;
                                r3 = vwVar != null ? vwVar.e(l10.longValue()) : null;
                                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.n2) arrayList.get(i10), false);
                                }
                                n2Var = aaVar.f;
                                if (n2Var != null) {
                                    n2Var.clearSheets();
                                }
                                aaVar.v();
                                q4Var.U3 = false;
                                if (vwVar != null || !vwVar.k(l10.longValue())) {
                                    vbVar.X(qb.c(r3));
                                    AndroidUtilities.runOnUIThread(runnable, 400L);
                                    break;
                                } else {
                                    vwVar.b0.add(new ai.t0(r3, vwVar, l10, vbVar, runnable, 8));
                                    break;
                                }
                            } else {
                                arrayList.add(n2Var3);
                            }
                        }
                    }
                    vwVar = null;
                    n2Var = aaVar.f;
                    if (n2Var != null) {
                    }
                    aaVar.v();
                    q4Var.U3 = false;
                    if (vwVar != null) {
                    }
                    vbVar.X(qb.c(r3));
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                }
                break;
            case 1:
                dv0 dv0Var = (dv0) this.b;
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i11 = dv0Var.d;
                MessagesController.getInstance(i11).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i11).putChats((ArrayList) obj3, true);
                org.telegram.ui.Components.r5.h(i11).d((ArrayList) obj4);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                    if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(dv0Var.w);
                    dv0Var.n.add(messageObject);
                }
                dv0Var.G(true);
                AndroidUtilities.runOnUIThread(i4Var, 540L);
                break;
            default:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) this.b;
                org.telegram.ui.Wallet.f8 f8Var = (org.telegram.ui.Wallet.f8) this.c;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) obj2;
                byte[] bArr = (byte[]) obj3;
                String str = (String) obj4;
                if (sendtransfer != null && j0Var != null && bArr != null) {
                    org.telegram.ui.Wallet.m0.F("prepare disable backup: transfer ready, initing storage with new secret phrase!");
                    org.telegram.ui.Wallet.h0 h0Var = new org.telegram.ui.Wallet.h0();
                    h0Var.c = bArr;
                    h0Var.b = j0Var.b();
                    h0Var.a = sendtransfer;
                    m0Var.c.p(UserConfig.getInstance(m0Var.a).getClientUserId(), bArr, j0Var, new org.telegram.ui.Wallet.x(m0Var, h0Var, f8Var));
                    break;
                } else {
                    org.telegram.ui.Wallet.m0.i("prepare disable backup, failed to prepare transfer: ".concat(str == null ? "NULL_ERROR" : str));
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    f8Var.run(null, str);
                    break;
                }
        }
    }
}
