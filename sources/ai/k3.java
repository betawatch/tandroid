package ai;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.wm;
import org.telegram.ui.lx;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
        lx lxVar;
        org.telegram.ui.ActionBar.n2 n2Var;
        org.telegram.ui.ActionBar.d5 parentLayout;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                ci.oc ocVar = (ci.oc) this.c;
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                jc jcVar = f6Var.J0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    e6 e6Var = f6Var.M2;
                    if (e6Var == null || ((ic) e6Var.c) != null) {
                        ic icVar = (ic) e6Var.c;
                        icVar.firstFrameRendered = false;
                        e6Var.a = false;
                        icVar.setOnReadyListener(new o3(0, currentTimeMillis, runnable));
                        ((ac) f6Var.Q1).g(false);
                        lj0 lj0Var = f6Var.z0;
                        if (lj0Var != null) {
                            lj0Var.setAnimation(f6Var.x1.u);
                        }
                        if (f6Var.R2 > 0 && l4.longValue() > f6Var.R2 - 1400) {
                            l4 = 0L;
                        }
                        f6Var.T0(l4.longValue(), true);
                        f6Var.U3 = false;
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        if (bool.booleanValue()) {
                            f6Var.f1(false);
                            break;
                        }
                    } else {
                        ((ac) f6Var.Q1).g(false);
                        f6Var.setActive(true);
                        f6Var.U3 = false;
                        f6Var.i1 = new n3(0, runnable);
                        if (bool.booleanValue()) {
                            f6Var.f1(false);
                        }
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.n2 n2Var2 = jcVar.f;
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
                                n2Var = jcVar.f;
                                if (n2Var != null) {
                                    n2Var.clearSheets();
                                }
                                jcVar.v();
                                f6Var.U3 = false;
                                if (lxVar != null || !lxVar.k(l10.longValue())) {
                                    ocVar.Y(ci.jc.c(r3));
                                    AndroidUtilities.runOnUIThread(runnable, 400L);
                                    break;
                                } else {
                                    lxVar.b0.add(new m3(r3, lxVar, l10, ocVar, runnable, 0));
                                    break;
                                }
                            } else {
                                arrayList.add(n2Var3);
                            }
                        }
                    }
                    lxVar = null;
                    n2Var = jcVar.f;
                    if (n2Var != null) {
                    }
                    jcVar.v();
                    f6Var.U3 = false;
                    if (lxVar != null) {
                    }
                    ocVar.Y(ci.jc.c(r3));
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                }
                break;
            default:
                vu0 vu0Var = (vu0) this.b;
                wm wmVar = (wm) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i11 = vu0Var.d;
                MessagesController.getInstance(i11).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i11).putChats((ArrayList) obj3, true);
                org.telegram.ui.Components.q5.h(i11).d((ArrayList) obj4);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                    if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(vu0Var.w);
                    vu0Var.n.add(messageObject);
                }
                vu0Var.G(true);
                AndroidUtilities.runOnUIThread(wmVar, 540L);
                break;
        }
    }
}
