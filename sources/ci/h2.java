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
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.ey;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h2 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h2(int i10, Object obj, Object obj2) {
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
        org.telegram.ui.ActionBar.o2 o2Var;
        org.telegram.ui.ActionBar.h5 parentLayout;
        switch (this.a) {
            case 0:
                p4 p4Var = (p4) this.b;
                vb vbVar = (vb) this.c;
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                z9 z9Var = p4Var.J0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    o4 o4Var = p4Var.M2;
                    if (o4Var == null || ((y9) o4Var.c) != null) {
                        y9 y9Var = (y9) o4Var.c;
                        y9Var.firstFrameRendered = false;
                        o4Var.a = false;
                        y9Var.setOnReadyListener(new k2(0, currentTimeMillis, runnable));
                        ((q9) p4Var.Q1).g(false);
                        bk0 bk0Var = p4Var.z0;
                        if (bk0Var != null) {
                            bk0Var.setAnimation(p4Var.x1.u);
                        }
                        if (p4Var.R2 > 0 && l4.longValue() > p4Var.R2 - 1400) {
                            l4 = 0L;
                        }
                        p4Var.S0(l4.longValue(), true);
                        p4Var.U3 = false;
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        if (bool.booleanValue()) {
                            p4Var.e1(false);
                            break;
                        }
                    } else {
                        ((q9) p4Var.Q1).g(false);
                        p4Var.setActive(true);
                        p4Var.U3 = false;
                        p4Var.i1 = new j2(0, runnable);
                        if (bool.booleanValue()) {
                            p4Var.e1(false);
                        }
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.o2 o2Var2 = z9Var.f;
                    if (o2Var2 != null && (parentLayout = o2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) fragmentStack.get(size);
                            if (o2Var3 instanceof ey) {
                                ey eyVar = (ey) o2Var3;
                                eyVar.I3();
                                vwVar = eyVar.E0;
                                r3 = vwVar != null ? vwVar.e(l10.longValue()) : null;
                                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                    ((ActionBarLayout) parentLayout).b0((org.telegram.ui.ActionBar.o2) arrayList.get(i10), false);
                                }
                                o2Var = z9Var.f;
                                if (o2Var != null) {
                                    o2Var.clearSheets();
                                }
                                z9Var.v();
                                p4Var.U3 = false;
                                if (vwVar != null || !vwVar.k(l10.longValue())) {
                                    vbVar.X(qb.c(r3));
                                    AndroidUtilities.runOnUIThread(runnable, 400L);
                                    break;
                                } else {
                                    vwVar.b0.add(new ai.t0(r3, vwVar, l10, vbVar, runnable, 8));
                                    break;
                                }
                            } else {
                                arrayList.add(o2Var3);
                            }
                        }
                    }
                    vwVar = null;
                    o2Var = z9Var.f;
                    if (o2Var != null) {
                    }
                    z9Var.v();
                    p4Var.U3 = false;
                    if (vwVar != null) {
                    }
                    vbVar.X(qb.c(r3));
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                }
                break;
            case 1:
                iv0 iv0Var = (iv0) this.b;
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i11 = iv0Var.d;
                MessagesController.getInstance(i11).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i11).putChats((ArrayList) obj3, true);
                org.telegram.ui.Components.r5.h(i11).d((ArrayList) obj4);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                    if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(iv0Var.w);
                    iv0Var.n.add(messageObject);
                }
                iv0Var.G(true);
                AndroidUtilities.runOnUIThread(h4Var, 540L);
                break;
            default:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.b;
                org.telegram.ui.Wallet.z7 z7Var = (org.telegram.ui.Wallet.z7) this.c;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj2;
                byte[] bArr = (byte[]) obj3;
                String str = (String) obj4;
                if (sendtransfer != null && i0Var != null && bArr != null) {
                    org.telegram.ui.Wallet.l0.F("prepare disable backup: transfer ready, initing storage with new secret phrase!");
                    org.telegram.ui.Wallet.g0 g0Var = new org.telegram.ui.Wallet.g0();
                    g0Var.c = bArr;
                    g0Var.b = i0Var.b();
                    g0Var.a = sendtransfer;
                    l0Var.c.p(UserConfig.getInstance(l0Var.a).getClientUserId(), bArr, i0Var, new org.telegram.ui.Wallet.w(l0Var, g0Var, z7Var));
                    break;
                } else {
                    org.telegram.ui.Wallet.l0.i("prepare disable backup, failed to prepare transfer: ".concat(str == null ? "NULL_ERROR" : str));
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    z7Var.run(null, str);
                    break;
                }
        }
    }
}
