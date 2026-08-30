package nh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.gx;
import org.telegram.ui.oy;
import ph.da;
import ph.y9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b2(int i10, Object obj, Object obj2) {
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
        gx gxVar;
        org.telegram.ui.ActionBar.p2 p2Var;
        org.telegram.ui.ActionBar.e5 parentLayout;
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.b;
                da daVar = (da) this.c;
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                i9 i9Var = d4Var.G0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    c4 c4Var = d4Var.J2;
                    if (c4Var == null || c4Var.b != null) {
                        h9 h9Var = c4Var.b;
                        h9Var.firstFrameRendered = false;
                        c4Var.f = false;
                        h9Var.setOnReadyListener(new e2(0, currentTimeMillis, runnable));
                        ((z8) d4Var.N1).g(false);
                        jj0 jj0Var = d4Var.w0;
                        if (jj0Var != null) {
                            jj0Var.setAnimation(d4Var.u1.u);
                        }
                        if (d4Var.O2 > 0 && l10.longValue() > d4Var.O2 - 1400) {
                            l10 = 0L;
                        }
                        d4Var.T0(l10.longValue(), true);
                        d4Var.R3 = false;
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        if (bool.booleanValue()) {
                            d4Var.f1(false);
                            break;
                        }
                    } else {
                        ((z8) d4Var.N1).g(false);
                        d4Var.setActive(true);
                        d4Var.R3 = false;
                        d4Var.f1 = new d2(0, runnable);
                        if (bool.booleanValue()) {
                            d4Var.f1(false);
                        }
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.p2 p2Var2 = i9Var.f;
                    if (p2Var2 != null && (parentLayout = p2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) fragmentStack.get(size);
                            if (p2Var3 instanceof oy) {
                                oy oyVar = (oy) p2Var3;
                                oyVar.K3();
                                gxVar = oyVar.B0;
                                r3 = gxVar != null ? gxVar.e(l11.longValue()) : null;
                                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.p2) arrayList.get(i10), false);
                                }
                                p2Var = i9Var.f;
                                if (p2Var != null) {
                                    p2Var.clearSheets();
                                }
                                i9Var.v();
                                d4Var.R3 = false;
                                if (gxVar != null || !gxVar.k(l11.longValue())) {
                                    daVar.Y(y9.c(r3));
                                    AndroidUtilities.runOnUIThread(runnable, 400L);
                                    break;
                                } else {
                                    gxVar.V.add(new gg.j0(r3, gxVar, l11, daVar, runnable, 13));
                                    break;
                                }
                            } else {
                                arrayList.add(p2Var3);
                            }
                        }
                    }
                    gxVar = null;
                    p2Var = i9Var.f;
                    if (p2Var != null) {
                    }
                    i9Var.v();
                    d4Var.R3 = false;
                    if (gxVar != null) {
                    }
                    daVar.Y(y9.c(r3));
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                }
                break;
            default:
                ju0 ju0Var = (ju0) this.b;
                ey eyVar = (ey) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i11 = ju0Var.d;
                MessagesController.getInstance(i11).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i11).putChats((ArrayList) obj3, true);
                org.telegram.ui.Components.l5.h(i11).d((ArrayList) obj4);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                    if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(ju0Var.w);
                    ju0Var.n.add(messageObject);
                }
                ju0Var.G(true);
                AndroidUtilities.runOnUIThread(eyVar, 540L);
                break;
        }
    }
}
