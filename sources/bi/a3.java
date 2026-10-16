package bi;

import di.fc;
import di.kc;
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
import org.telegram.ui.gm;
import org.telegram.ui.mt;
import org.telegram.ui.px;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a3 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a3(int i10, Object obj, Object obj2) {
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
        px pxVar;
        org.telegram.ui.ActionBar.m2 m2Var;
        org.telegram.ui.ActionBar.b5 parentLayout;
        switch (this.a) {
            case 0:
                q5 q5Var = (q5) this.b;
                kc kcVar = (kc) this.c;
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                sb sbVar = q5Var.J0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    p5 p5Var = q5Var.M2;
                    if (p5Var == null || ((rb) p5Var.c) != null) {
                        rb rbVar = (rb) p5Var.c;
                        rbVar.firstFrameRendered = false;
                        p5Var.a = false;
                        rbVar.setOnReadyListener(new e3(0, currentTimeMillis, runnable));
                        ((jb) q5Var.Q1).g(false);
                        bk0 bk0Var = q5Var.z0;
                        if (bk0Var != null) {
                            bk0Var.setAnimation(q5Var.x1.u);
                        }
                        if (q5Var.R2 > 0 && l4.longValue() > q5Var.R2 - 1400) {
                            l4 = 0L;
                        }
                        q5Var.T0(l4.longValue(), true);
                        q5Var.U3 = false;
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        if (bool.booleanValue()) {
                            q5Var.f1(false);
                            break;
                        }
                    } else {
                        ((jb) q5Var.Q1).g(false);
                        q5Var.setActive(true);
                        q5Var.U3 = false;
                        q5Var.i1 = new d3(0, runnable);
                        if (bool.booleanValue()) {
                            q5Var.f1(false);
                        }
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.m2 m2Var2 = sbVar.f;
                    if (m2Var2 != null && (parentLayout = m2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) fragmentStack.get(size);
                            if (m2Var3 instanceof yy) {
                                yy yyVar = (yy) m2Var3;
                                yyVar.I3();
                                pxVar = yyVar.E0;
                                r3 = pxVar != null ? pxVar.e(l10.longValue()) : null;
                                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.m2) arrayList.get(i10), false);
                                }
                                m2Var = sbVar.f;
                                if (m2Var != null) {
                                    m2Var.clearSheets();
                                }
                                sbVar.v();
                                q5Var.U3 = false;
                                if (pxVar != null || !pxVar.k(l10.longValue())) {
                                    kcVar.X(fc.c(r3));
                                    AndroidUtilities.runOnUIThread(runnable, 400L);
                                    break;
                                } else {
                                    pxVar.b0.add(new c3(r3, pxVar, l10, kcVar, runnable, 0));
                                    break;
                                }
                            } else {
                                arrayList.add(m2Var3);
                            }
                        }
                    }
                    pxVar = null;
                    m2Var = sbVar.f;
                    if (m2Var != null) {
                    }
                    sbVar.v();
                    q5Var.U3 = false;
                    if (pxVar != null) {
                    }
                    kcVar.X(fc.c(r3));
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                }
                break;
            case 1:
                iv0 iv0Var = (iv0) this.b;
                gm gmVar = (gm) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i11 = iv0Var.d;
                MessagesController.getInstance(i11).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i11).putChats((ArrayList) obj3, true);
                org.telegram.ui.Components.s5.h(i11).d((ArrayList) obj4);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                    if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(iv0Var.w);
                    iv0Var.n.add(messageObject);
                }
                iv0Var.G(true);
                AndroidUtilities.runOnUIThread(gmVar, 540L);
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
                    k0Var.c.p(UserConfig.getInstance(k0Var.a).getClientUserId(), bArr, h0Var, new mt(k0Var, f0Var, d7Var));
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
