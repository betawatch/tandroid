package oh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.hx;
import org.telegram.ui.py;
import qh.ba;
import qh.w9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                ba baVar = (ba) this.c;
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
                        kj0 kj0Var = f4Var.w0;
                        if (kj0Var != null) {
                            kj0Var.setAnimation(f4Var.u1.u);
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
                                    baVar.Y(w9.c(r3));
                                    AndroidUtilities.runOnUIThread(runnable, 400L);
                                    break;
                                } else {
                                    hxVar.V.add(new hg.j0(r3, hxVar, l11, baVar, runnable, 13));
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
                    baVar.Y(w9.c(r3));
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                }
                break;
            default:
                ju0 ju0Var = (ju0) this.b;
                gy gyVar = (gy) this.c;
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
                AndroidUtilities.runOnUIThread(gyVar, 540L);
                break;
        }
    }
}
