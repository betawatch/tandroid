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
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.cy;
import org.telegram.ui.tw;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
        tw twVar;
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
                        yj0 yj0Var = q4Var.z0;
                        if (yj0Var != null) {
                            yj0Var.setAnimation(q4Var.x1.u);
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
                            if (n2Var3 instanceof cy) {
                                cy cyVar = (cy) n2Var3;
                                cyVar.I3();
                                twVar = cyVar.E0;
                                r3 = twVar != null ? twVar.e(l10.longValue()) : null;
                                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.n2) arrayList.get(i10), false);
                                }
                                n2Var = aaVar.f;
                                if (n2Var != null) {
                                    n2Var.clearSheets();
                                }
                                aaVar.v();
                                q4Var.U3 = false;
                                if (twVar != null || !twVar.k(l10.longValue())) {
                                    vbVar.X(qb.c(r3));
                                    AndroidUtilities.runOnUIThread(runnable, 400L);
                                    break;
                                } else {
                                    twVar.b0.add(new ai.t0(r3, twVar, l10, vbVar, runnable, 8));
                                    break;
                                }
                            } else {
                                arrayList.add(n2Var3);
                            }
                        }
                    }
                    twVar = null;
                    n2Var = aaVar.f;
                    if (n2Var != null) {
                    }
                    aaVar.v();
                    q4Var.U3 = false;
                    if (twVar != null) {
                    }
                    vbVar.X(qb.c(r3));
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                }
                break;
            case 1:
                fv0 fv0Var = (fv0) this.b;
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i11 = fv0Var.d;
                MessagesController.getInstance(i11).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i11).putChats((ArrayList) obj3, true);
                org.telegram.ui.Components.r5.h(i11).d((ArrayList) obj4);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                    if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(fv0Var.w);
                    fv0Var.n.add(messageObject);
                }
                fv0Var.G(true);
                AndroidUtilities.runOnUIThread(i4Var, 540L);
                break;
            default:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) this.b;
                org.telegram.ui.Wallet.z7 z7Var = (org.telegram.ui.Wallet.z7) this.c;
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
                    m0Var.c.p(UserConfig.getInstance(m0Var.a).getClientUserId(), bArr, j0Var, new org.telegram.ui.Wallet.x(m0Var, h0Var, z7Var));
                    break;
                } else {
                    org.telegram.ui.Wallet.m0.i("prepare disable backup, failed to prepare transfer: ".concat(str == null ? "NULL_ERROR" : str));
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    z7Var.run(null, str);
                    break;
                }
        }
    }
}
