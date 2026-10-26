package di;

import fi.nb;
import fi.sb;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.cy;
import org.telegram.ui.qw;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        qw qwVar;
        org.telegram.ui.ActionBar.r2 r2Var;
        org.telegram.ui.ActionBar.j5 parentLayout;
        switch (this.a) {
            case 0:
                q4 q4Var = (q4) this.b;
                sb sbVar = (sb) this.c;
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                y9 y9Var = q4Var.y0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    p4 p4Var = q4Var.B2;
                    if (p4Var == null || ((x9) p4Var.c) != null) {
                        x9 x9Var = (x9) p4Var.c;
                        x9Var.firstFrameRendered = false;
                        p4Var.a = false;
                        x9Var.setOnReadyListener(new k2(0, currentTimeMillis, runnable));
                        ((p9) q4Var.F1).g(false);
                        ak0 ak0Var = q4Var.o0;
                        if (ak0Var != null) {
                            ak0Var.setAnimation(q4Var.m1.u);
                        }
                        if (q4Var.G2 > 0 && l4.longValue() > q4Var.G2 - 1400) {
                            l4 = 0L;
                        }
                        q4Var.R0(l4.longValue(), true);
                        q4Var.J3 = false;
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        if (bool.booleanValue()) {
                            q4Var.d1(false);
                            break;
                        }
                    } else {
                        ((p9) q4Var.F1).g(false);
                        q4Var.setActive(true);
                        q4Var.J3 = false;
                        q4Var.X0 = new j2(0, runnable);
                        if (bool.booleanValue()) {
                            q4Var.d1(false);
                        }
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.r2 r2Var2 = y9Var.f;
                    if (r2Var2 != null && (parentLayout = r2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.r2 r2Var3 = (org.telegram.ui.ActionBar.r2) fragmentStack.get(size);
                            if (r2Var3 instanceof cy) {
                                cy cyVar = (cy) r2Var3;
                                cyVar.S3();
                                qwVar = cyVar.E0;
                                r3 = qwVar != null ? qwVar.e(l10.longValue()) : null;
                                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                    ((ActionBarLayout) parentLayout).c0((org.telegram.ui.ActionBar.r2) arrayList.get(i10), false);
                                }
                                r2Var = y9Var.f;
                                if (r2Var != null) {
                                    r2Var.clearSheets();
                                }
                                y9Var.v();
                                q4Var.J3 = false;
                                if (qwVar != null || !qwVar.k(l10.longValue())) {
                                    sbVar.X(nb.c(r3));
                                    AndroidUtilities.runOnUIThread(runnable, 400L);
                                    break;
                                } else {
                                    qwVar.b0.add(new bi.u0(r3, qwVar, l10, sbVar, runnable, 8));
                                    break;
                                }
                            } else {
                                arrayList.add(r2Var3);
                            }
                        }
                    }
                    qwVar = null;
                    r2Var = y9Var.f;
                    if (r2Var != null) {
                    }
                    y9Var.v();
                    q4Var.J3 = false;
                    if (qwVar != null) {
                    }
                    sbVar.X(nb.c(r3));
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                }
                break;
            case 1:
                mv0 mv0Var = (mv0) this.b;
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i11 = mv0Var.d;
                MessagesController.getInstance(i11).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i11).putChats((ArrayList) obj3, true);
                org.telegram.ui.Components.t5.h(i11).d((ArrayList) obj4);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                    if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(mv0Var.w);
                    mv0Var.n.add(messageObject);
                }
                mv0Var.G(true);
                AndroidUtilities.runOnUIThread(g4Var, 540L);
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
                    l0Var.c.p(UserConfig.getInstance(l0Var.a).getClientUserId(), bArr, i0Var, new org.telegram.ui.Wallet.s(l0Var, g0Var, z7Var));
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
