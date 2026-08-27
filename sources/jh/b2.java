package jh;

import java.util.ArrayList;
import java.util.List;
import lh.nb;
import lh.sb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.gy;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        yw ywVar;
        org.telegram.ui.ActionBar.n2 n2Var;
        org.telegram.ui.ActionBar.b5 parentLayout;
        switch (this.a) {
            case 0:
                e4 e4Var = (e4) this.b;
                sb sbVar = (sb) this.c;
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                i9 i9Var = e4Var.F0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    d4 d4Var = e4Var.I2;
                    if (d4Var == null || d4Var.b != null) {
                        h9 h9Var = d4Var.b;
                        h9Var.firstFrameRendered = false;
                        d4Var.f = false;
                        h9Var.setOnReadyListener(new e2(0, currentTimeMillis, runnable));
                        ((z8) e4Var.M1).g(false);
                        ri0 ri0Var = e4Var.v0;
                        if (ri0Var != null) {
                            ri0Var.setAnimation(e4Var.t1.u);
                        }
                        if (e4Var.N2 > 0 && l10.longValue() > e4Var.N2 - 1400) {
                            l10 = 0L;
                        }
                        e4Var.T0(l10.longValue(), true);
                        e4Var.Q3 = false;
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        if (bool.booleanValue()) {
                            e4Var.f1(false);
                            break;
                        }
                    } else {
                        ((z8) e4Var.M1).g(false);
                        e4Var.setActive(true);
                        e4Var.Q3 = false;
                        e4Var.e1 = new d2(0, runnable);
                        if (bool.booleanValue()) {
                            e4Var.f1(false);
                        }
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.n2 n2Var2 = i9Var.f;
                    if (n2Var2 != null && (parentLayout = n2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) fragmentStack.get(size);
                            if (n2Var3 instanceof gy) {
                                gy gyVar = (gy) n2Var3;
                                gyVar.K3();
                                ywVar = gyVar.A0;
                                r3 = ywVar != null ? ywVar.e(l11.longValue()) : null;
                                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.n2) arrayList.get(i10), false);
                                }
                                n2Var = i9Var.f;
                                if (n2Var != null) {
                                    n2Var.clearSheets();
                                }
                                i9Var.v();
                                e4Var.Q3 = false;
                                if (ywVar != null || !ywVar.k(l11.longValue())) {
                                    sbVar.Y(nb.c(r3));
                                    AndroidUtilities.runOnUIThread(runnable, 400L);
                                    break;
                                } else {
                                    ywVar.U.add(new cg.k0(r3, ywVar, l11, sbVar, runnable, 13));
                                    break;
                                }
                            } else {
                                arrayList.add(n2Var3);
                            }
                        }
                    }
                    ywVar = null;
                    n2Var = i9Var.f;
                    if (n2Var != null) {
                    }
                    i9Var.v();
                    e4Var.Q3 = false;
                    if (ywVar != null) {
                    }
                    sbVar.Y(nb.c(r3));
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                }
                break;
            default:
                st0 st0Var = (st0) this.b;
                km kmVar = (km) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i11 = st0Var.d;
                MessagesController.getInstance(i11).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i11).putChats((ArrayList) obj3, true);
                org.telegram.ui.Components.k5.h(i11).d((ArrayList) obj4);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                    if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(st0Var.w);
                    st0Var.n.add(messageObject);
                }
                st0Var.G(true);
                AndroidUtilities.runOnUIThread(kmVar, 540L);
                break;
        }
    }
}
