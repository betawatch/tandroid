package lh;

import java.util.ArrayList;
import java.util.List;
import nh.bb;
import nh.gb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.rm;
import org.telegram.ui.fy;
import org.telegram.ui.xw;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a2(int i10, Object obj, Object obj2) {
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
        xw xwVar;
        org.telegram.ui.ActionBar.o2 o2Var;
        org.telegram.ui.ActionBar.b5 parentLayout;
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.b;
                gb gbVar = (gb) this.c;
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                i9 i9Var = d4Var.F0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    c4 c4Var = d4Var.I2;
                    if (c4Var == null || c4Var.b != null) {
                        h9 h9Var = c4Var.b;
                        h9Var.firstFrameRendered = false;
                        c4Var.f = false;
                        h9Var.setOnReadyListener(new d2(0, currentTimeMillis, runnable));
                        ((z8) d4Var.M1).g(false);
                        aj0 aj0Var = d4Var.v0;
                        if (aj0Var != null) {
                            aj0Var.setAnimation(d4Var.t1.u);
                        }
                        if (d4Var.N2 > 0 && l10.longValue() > d4Var.N2 - 1400) {
                            l10 = 0L;
                        }
                        d4Var.T0(l10.longValue(), true);
                        d4Var.Q3 = false;
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        if (bool.booleanValue()) {
                            d4Var.f1(false);
                            break;
                        }
                    } else {
                        ((z8) d4Var.M1).g(false);
                        d4Var.setActive(true);
                        d4Var.Q3 = false;
                        d4Var.e1 = new c2(0, runnable);
                        if (bool.booleanValue()) {
                            d4Var.f1(false);
                        }
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.o2 o2Var2 = i9Var.f;
                    if (o2Var2 != null && (parentLayout = o2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) fragmentStack.get(size);
                            if (o2Var3 instanceof fy) {
                                fy fyVar = (fy) o2Var3;
                                fyVar.K3();
                                xwVar = fyVar.A0;
                                r3 = xwVar != null ? xwVar.e(l11.longValue()) : null;
                                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.o2) arrayList.get(i10), false);
                                }
                                o2Var = i9Var.f;
                                if (o2Var != null) {
                                    o2Var.clearSheets();
                                }
                                i9Var.v();
                                d4Var.Q3 = false;
                                if (xwVar != null || !xwVar.k(l11.longValue())) {
                                    gbVar.Y(bb.c(r3));
                                    AndroidUtilities.runOnUIThread(runnable, 400L);
                                    break;
                                } else {
                                    xwVar.U.add(new eg.k0(r3, xwVar, l11, gbVar, runnable, 13));
                                    break;
                                }
                            } else {
                                arrayList.add(o2Var3);
                            }
                        }
                    }
                    xwVar = null;
                    o2Var = i9Var.f;
                    if (o2Var != null) {
                    }
                    i9Var.v();
                    d4Var.Q3 = false;
                    if (xwVar != null) {
                    }
                    gbVar.Y(bb.c(r3));
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                }
                break;
            default:
                bu0 bu0Var = (bu0) this.b;
                rm rmVar = (rm) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i11 = bu0Var.d;
                MessagesController.getInstance(i11).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i11).putChats((ArrayList) obj3, true);
                org.telegram.ui.Components.p5.h(i11).d((ArrayList) obj4);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                    if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(bu0Var.w);
                    bu0Var.n.add(messageObject);
                }
                bu0Var.G(true);
                AndroidUtilities.runOnUIThread(rmVar, 540L);
                break;
        }
    }
}
