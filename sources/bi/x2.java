package bi;

import di.kc;
import di.pc;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.dm;
import org.telegram.ui.lx;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class x2 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x2(int i10, Object obj, Object obj2) {
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
        lx lxVar;
        org.telegram.ui.ActionBar.n2 n2Var;
        org.telegram.ui.ActionBar.d5 parentLayout;
        switch (this.a) {
            case 0:
                o5 o5Var = (o5) this.b;
                pc pcVar = (pc) this.c;
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                pb pbVar = o5Var.J0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n5 n5Var = o5Var.M2;
                    if (n5Var == null || ((ob) n5Var.c) != null) {
                        ob obVar = (ob) n5Var.c;
                        obVar.firstFrameRendered = false;
                        n5Var.a = false;
                        obVar.setOnReadyListener(new b3(0, currentTimeMillis, runnable));
                        ((gb) o5Var.Q1).g(false);
                        aj0 aj0Var = o5Var.z0;
                        if (aj0Var != null) {
                            aj0Var.setAnimation(o5Var.x1.u);
                        }
                        if (o5Var.R2 > 0 && l4.longValue() > o5Var.R2 - 1400) {
                            l4 = 0L;
                        }
                        o5Var.T0(l4.longValue(), true);
                        o5Var.U3 = false;
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        if (bool.booleanValue()) {
                            o5Var.f1(false);
                            break;
                        }
                    } else {
                        ((gb) o5Var.Q1).g(false);
                        o5Var.setActive(true);
                        o5Var.U3 = false;
                        o5Var.i1 = new a3(0, runnable);
                        if (bool.booleanValue()) {
                            o5Var.f1(false);
                        }
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.n2 n2Var2 = pbVar.f;
                    if (n2Var2 != null && (parentLayout = n2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) fragmentStack.get(size);
                            if (n2Var3 instanceof uy) {
                                uy uyVar = (uy) n2Var3;
                                uyVar.K3();
                                lxVar = uyVar.E0;
                                r3 = lxVar != null ? lxVar.e(l10.longValue()) : null;
                                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.n2) arrayList.get(i10), false);
                                }
                                n2Var = pbVar.f;
                                if (n2Var != null) {
                                    n2Var.clearSheets();
                                }
                                pbVar.v();
                                o5Var.U3 = false;
                                if (lxVar != null || !lxVar.k(l10.longValue())) {
                                    pcVar.Y(kc.c(r3));
                                    AndroidUtilities.runOnUIThread(runnable, 400L);
                                    break;
                                } else {
                                    lxVar.b0.add(new z2(r3, lxVar, l10, pcVar, runnable, 0));
                                    break;
                                }
                            } else {
                                arrayList.add(n2Var3);
                            }
                        }
                    }
                    lxVar = null;
                    n2Var = pbVar.f;
                    if (n2Var != null) {
                    }
                    pbVar.v();
                    o5Var.U3 = false;
                    if (lxVar != null) {
                    }
                    pcVar.Y(kc.c(r3));
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                }
                break;
            default:
                iu0 iu0Var = (iu0) this.b;
                dm dmVar = (dm) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i11 = iu0Var.d;
                MessagesController.getInstance(i11).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i11).putChats((ArrayList) obj3, true);
                org.telegram.ui.Components.q5.h(i11).d((ArrayList) obj4);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                    if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(iu0Var.w);
                    iu0Var.n.add(messageObject);
                }
                iu0Var.G(true);
                AndroidUtilities.runOnUIThread(dmVar, 540L);
                break;
        }
    }
}
