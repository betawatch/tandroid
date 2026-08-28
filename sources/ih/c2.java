package ih;

import java.util.ArrayList;
import java.util.List;
import kh.rb;
import kh.wb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.dy;
import org.telegram.ui.rl;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c2(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    @Override // org.telegram.messenger.Utilities.Callback4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        vw vwVar;
        org.telegram.ui.ActionBar.o2 o2Var;
        org.telegram.ui.ActionBar.b5 parentLayout;
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.b;
                wb wbVar = (wb) this.c;
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                m9 m9Var = i4Var.F0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    h4 h4Var = i4Var.I2;
                    if (h4Var == null || h4Var.b != null) {
                        l9 l9Var = h4Var.b;
                        l9Var.firstFrameRendered = false;
                        h4Var.f = false;
                        l9Var.setOnReadyListener(new f2(0, currentTimeMillis, runnable));
                        ((d9) i4Var.M1).g(false);
                        pi0 pi0Var = i4Var.v0;
                        if (pi0Var != null) {
                            pi0Var.setAnimation(i4Var.t1.u);
                        }
                        if (i4Var.N2 > 0 && l10.longValue() > i4Var.N2 - 1400) {
                            l10 = 0L;
                        }
                        i4Var.T0(l10.longValue(), true);
                        i4Var.Q3 = false;
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        if (bool.booleanValue()) {
                            i4Var.f1(false);
                            break;
                        }
                    } else {
                        ((d9) i4Var.M1).g(false);
                        i4Var.setActive(true);
                        i4Var.Q3 = false;
                        i4Var.e1 = new e2(0, runnable);
                        if (bool.booleanValue()) {
                            i4Var.f1(false);
                        }
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.o2 o2Var2 = m9Var.f;
                    if (o2Var2 != null && (parentLayout = o2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) fragmentStack.get(size);
                            if (o2Var3 instanceof dy) {
                                dy dyVar = (dy) o2Var3;
                                dyVar.K3();
                                vwVar = dyVar.A0;
                                r3 = vwVar != null ? vwVar.e(l11.longValue()) : null;
                                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.o2) arrayList.get(i9), false);
                                }
                                o2Var = m9Var.f;
                                if (o2Var != null) {
                                    o2Var.clearSheets();
                                }
                                m9Var.v();
                                i4Var.Q3 = false;
                                if (vwVar != null || !vwVar.k(l11.longValue())) {
                                    wbVar.Y(rb.c(r3));
                                    AndroidUtilities.runOnUIThread(runnable, 400L);
                                    break;
                                } else {
                                    vwVar.U.add(new bg.o0(r3, vwVar, l11, wbVar, runnable, 13));
                                    break;
                                }
                            } else {
                                arrayList.add(o2Var3);
                            }
                        }
                    }
                    vwVar = null;
                    o2Var = m9Var.f;
                    if (o2Var != null) {
                    }
                    m9Var.v();
                    i4Var.Q3 = false;
                    if (vwVar != null) {
                    }
                    wbVar.Y(rb.c(r3));
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                }
                break;
            default:
                pt0 pt0Var = (pt0) this.b;
                rl rlVar = (rl) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i10 = pt0Var.d;
                MessagesController.getInstance(i10).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i10).putChats((ArrayList) obj3, true);
                org.telegram.ui.Components.k5.h(i10).d((ArrayList) obj4);
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                    if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(pt0Var.w);
                    pt0Var.n.add(messageObject);
                }
                pt0Var.G(true);
                AndroidUtilities.runOnUIThread(rlVar, 540L);
                break;
        }
    }
}
