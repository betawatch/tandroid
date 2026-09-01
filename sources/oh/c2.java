package oh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.hx;
import org.telegram.ui.py;
import qh.ca;
import qh.x9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c2(int i10, Object obj, Object obj2) {
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
        org.telegram.ui.ActionBar.p2 p2Var;
        org.telegram.ui.ActionBar.f5 parentLayout;
        switch (this.a) {
            case 0:
                f4 f4Var = (f4) this.b;
                ca caVar = (ca) this.c;
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                i9 i9Var = f4Var.G0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    e4 e4Var = f4Var.J2;
                    if (e4Var == null || e4Var.b != null) {
                        h9 h9Var = e4Var.b;
                        h9Var.firstFrameRendered = false;
                        e4Var.f = false;
                        h9Var.setOnReadyListener(new f2(0, currentTimeMillis, runnable));
                        ((z8) f4Var.N1).g(false);
                        lj0 lj0Var = f4Var.w0;
                        if (lj0Var != null) {
                            lj0Var.setAnimation(f4Var.u1.u);
                        }
                        if (f4Var.O2 > 0 && l10.longValue() > f4Var.O2 - 1400) {
                            l10 = 0L;
                        }
                        f4Var.T0(l10.longValue(), true);
                        f4Var.R3 = false;
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        if (bool.booleanValue()) {
                            f4Var.f1(false);
                            break;
                        }
                    } else {
                        ((z8) f4Var.N1).g(false);
                        f4Var.setActive(true);
                        f4Var.R3 = false;
                        f4Var.f1 = new e2(0, runnable);
                        if (bool.booleanValue()) {
                            f4Var.f1(false);
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
                            if (p2Var3 instanceof py) {
                                py pyVar = (py) p2Var3;
                                pyVar.K3();
                                hxVar = pyVar.B0;
                                r3 = hxVar != null ? hxVar.e(l11.longValue()) : null;
                                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.p2) arrayList.get(i10), false);
                                }
                                p2Var = i9Var.f;
                                if (p2Var != null) {
                                    p2Var.clearSheets();
                                }
                                i9Var.v();
                                f4Var.R3 = false;
                                if (hxVar != null || !hxVar.k(l11.longValue())) {
                                    caVar.Y(x9.c(r3));
                                    AndroidUtilities.runOnUIThread(runnable, 400L);
                                    break;
                                } else {
                                    hxVar.V.add(new hg.j0(r3, hxVar, l11, caVar, runnable, 13));
                                    break;
                                }
                            } else {
                                arrayList.add(p2Var3);
                            }
                        }
                    }
                    hxVar = null;
                    p2Var = i9Var.f;
                    if (p2Var != null) {
                    }
                    i9Var.v();
                    f4Var.R3 = false;
                    if (hxVar != null) {
                    }
                    caVar.Y(x9.c(r3));
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                }
                break;
            default:
                ku0 ku0Var = (ku0) this.b;
                gy gyVar = (gy) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i11 = ku0Var.d;
                MessagesController.getInstance(i11).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i11).putChats((ArrayList) obj3, true);
                org.telegram.ui.Components.l5.h(i11).d((ArrayList) obj4);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                    if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(ku0Var.w);
                    ku0Var.n.add(messageObject);
                }
                ku0Var.G(true);
                AndroidUtilities.runOnUIThread(gyVar, 540L);
                break;
        }
    }
}
