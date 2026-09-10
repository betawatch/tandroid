package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class su0 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ su0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    @Override // org.telegram.messenger.Utilities.Callback4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        org.telegram.ui.nx nxVar;
        org.telegram.ui.ActionBar.p2 p2Var;
        org.telegram.ui.ActionBar.f5 parentLayout;
        switch (this.a) {
            case 0:
                tu0 tu0Var = (tu0) this.b;
                my myVar = (my) this.c;
                ArrayList arrayList = (ArrayList) obj;
                int i10 = tu0Var.d;
                MessagesController.getInstance(i10).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i10).putChats((ArrayList) obj3, true);
                p5.h(i10).d((ArrayList) obj4);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(tu0Var.w);
                    tu0Var.n.add(messageObject);
                }
                tu0Var.G(true);
                AndroidUtilities.runOnUIThread(myVar, 540L);
                break;
            default:
                zh.a3 a3Var = (zh.a3) this.b;
                bi.ce ceVar = (bi.ce) this.c;
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                zh.u7 u7Var = a3Var.J0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    k2.v vVar = a3Var.M2;
                    if (vVar == null || ((zh.t7) vVar.c) != null) {
                        zh.t7 t7Var = (zh.t7) vVar.c;
                        t7Var.firstFrameRendered = false;
                        vVar.a = false;
                        t7Var.setOnReadyListener(new zh.n1(0, currentTimeMillis, runnable));
                        ((zh.l7) a3Var.Q1).g(false);
                        kj0 kj0Var = a3Var.z0;
                        if (kj0Var != null) {
                            kj0Var.setAnimation(a3Var.x1.u);
                        }
                        if (a3Var.R2 > 0 && l4.longValue() > a3Var.R2 - 1400) {
                            l4 = 0L;
                        }
                        a3Var.T0(l4.longValue(), true);
                        a3Var.U3 = false;
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        if (bool.booleanValue()) {
                            a3Var.f1(false);
                            break;
                        }
                    } else {
                        ((zh.l7) a3Var.Q1).g(false);
                        a3Var.setActive(true);
                        a3Var.U3 = false;
                        a3Var.i1 = new org.telegram.tgnet.f(1, runnable);
                        if (bool.booleanValue()) {
                            a3Var.f1(false);
                        }
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.p2 p2Var2 = u7Var.f;
                    if (p2Var2 != null && (parentLayout = p2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList2 = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) fragmentStack.get(size);
                            if (p2Var3 instanceof org.telegram.ui.wy) {
                                org.telegram.ui.wy wyVar = (org.telegram.ui.wy) p2Var3;
                                wyVar.K3();
                                nxVar = wyVar.E0;
                                r3 = nxVar != null ? nxVar.e(l10.longValue()) : null;
                                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.p2) arrayList2.get(i12), false);
                                }
                                p2Var = u7Var.f;
                                if (p2Var != null) {
                                    p2Var.clearSheets();
                                }
                                u7Var.v();
                                a3Var.U3 = false;
                                if (nxVar != null || !nxVar.k(l10.longValue())) {
                                    ceVar.Y(bi.xd.c(r3));
                                    AndroidUtilities.runOnUIThread(runnable, 400L);
                                    break;
                                } else {
                                    nxVar.b0.add(new xh.x4(r3, nxVar, l10, ceVar, runnable, 4));
                                    break;
                                }
                            } else {
                                arrayList2.add(p2Var3);
                            }
                        }
                    }
                    nxVar = null;
                    p2Var = u7Var.f;
                    if (p2Var != null) {
                    }
                    u7Var.v();
                    a3Var.U3 = false;
                    if (nxVar != null) {
                    }
                    ceVar.Y(bi.xd.c(r3));
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                }
                break;
        }
    }
}
