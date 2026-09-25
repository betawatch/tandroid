package ai;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.xm;
import org.telegram.ui.hx;
import org.telegram.ui.qy;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k3 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    @Override // org.telegram.messenger.Utilities.Callback4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        hx hxVar;
        org.telegram.ui.ActionBar.m2 m2Var;
        org.telegram.ui.ActionBar.b5 parentLayout;
        switch (this.a) {
            case 0:
                e6 e6Var = (e6) this.b;
                ci.lc lcVar = (ci.lc) this.c;
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                jc jcVar = e6Var.J0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    d6 d6Var = e6Var.M2;
                    if (d6Var == null || ((ic) d6Var.c) != null) {
                        ic icVar = (ic) d6Var.c;
                        icVar.firstFrameRendered = false;
                        d6Var.a = false;
                        icVar.setOnReadyListener(new o3(0, currentTimeMillis, runnable));
                        ((ac) e6Var.Q1).g(false);
                        lj0 lj0Var = e6Var.z0;
                        if (lj0Var != null) {
                            lj0Var.setAnimation(e6Var.x1.u);
                        }
                        if (e6Var.R2 > 0 && l4.longValue() > e6Var.R2 - 1400) {
                            l4 = 0L;
                        }
                        e6Var.T0(l4.longValue(), true);
                        e6Var.U3 = false;
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        if (bool.booleanValue()) {
                            e6Var.f1(false);
                            break;
                        }
                    } else {
                        ((ac) e6Var.Q1).g(false);
                        e6Var.setActive(true);
                        e6Var.U3 = false;
                        e6Var.i1 = new n3(0, runnable);
                        if (bool.booleanValue()) {
                            e6Var.f1(false);
                        }
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.m2 m2Var2 = jcVar.f;
                    if (m2Var2 != null && (parentLayout = m2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) fragmentStack.get(size);
                            if (m2Var3 instanceof qy) {
                                qy qyVar = (qy) m2Var3;
                                qyVar.K3();
                                hxVar = qyVar.E0;
                                r3 = hxVar != null ? hxVar.e(l10.longValue()) : null;
                                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.m2) arrayList.get(i10), false);
                                }
                                m2Var = jcVar.f;
                                if (m2Var != null) {
                                    m2Var.clearSheets();
                                }
                                jcVar.v();
                                e6Var.U3 = false;
                                if (hxVar != null || !hxVar.k(l10.longValue())) {
                                    lcVar.Y(ci.gc.c(r3));
                                    AndroidUtilities.runOnUIThread(runnable, 400L);
                                    break;
                                } else {
                                    hxVar.b0.add(new m3(r3, hxVar, l10, lcVar, runnable, 0));
                                    break;
                                }
                            } else {
                                arrayList.add(m2Var3);
                            }
                        }
                    }
                    hxVar = null;
                    m2Var = jcVar.f;
                    if (m2Var != null) {
                    }
                    jcVar.v();
                    e6Var.U3 = false;
                    if (hxVar != null) {
                    }
                    lcVar.Y(ci.gc.c(r3));
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                }
                break;
            default:
                uu0 uu0Var = (uu0) this.b;
                xm xmVar = (xm) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i11 = uu0Var.d;
                MessagesController.getInstance(i11).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i11).putChats((ArrayList) obj3, true);
                org.telegram.ui.Components.q5.h(i11).d((ArrayList) obj4);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                    if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(uu0Var.w);
                    uu0Var.n.add(messageObject);
                }
                uu0Var.G(true);
                AndroidUtilities.runOnUIThread(xmVar, 540L);
                break;
        }
    }
}
