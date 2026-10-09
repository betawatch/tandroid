package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fn extends org.telegram.ui.Components.mr0 {
    public final /* synthetic */ MessageObject b1;
    public final /* synthetic */ ln c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(ln lnVar, Activity activity, zn znVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, boolean z12, MessageObject messageObject) {
        super(activity, znVar, arrayList, null, null, z10, null, null, false, false, z11, null, e6Var);
        this.c1 = lnVar;
        this.b1 = messageObject;
        this.a0 = z12;
    }

    @Override // org.telegram.ui.Components.mr0
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        ln lnVar = this.c1;
        zn znVar = lnVar.a;
        int i11 = zn.Hc;
        znVar.T7();
        if (lnVar.a.y3 == null || !z10) {
            return;
        }
        if (iVar.m() != 1) {
            lnVar.a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) iVar.n(0)).id == lnVar.a.getUserConfig().getClientUserId() && org.telegram.ui.Components.ad.a0(lnVar.a).g0(i10, ((TLRPC.Dialog) iVar.n(0)).id)) {
                return;
            }
            lnVar.a.y3.k(((TLRPC.Dialog) iVar.n(0)).id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.mr0
    public final void T0(final View view) {
        zn znVar = this.c1.a;
        ci.ec b10 = view instanceof org.telegram.ui.Cells.g7 ? ci.gc.b((org.telegram.ui.Cells.g7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.b1;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) znVar.x6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final ci.lc D = ci.lc.D(znVar.getParentActivity(), this.currentAccount);
        D.R = new Utilities.Callback4() { // from class: org.telegram.ui.an
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ci.lc lcVar = D;
                ci.ec ecVar = null;
                if (booleanValue) {
                    fn fnVar = fn.this;
                    AndroidUtilities.runOnUIThread(new sg(15, fnVar, l4));
                    fnVar.dismiss();
                    lcVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.g7) && view2.isAttachedToWindow()) {
                        ecVar = ci.gc.b((org.telegram.ui.Cells.g7) view2);
                    }
                    lcVar.X(ecVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        D.T(b10, ci.l8.y(arrayList));
    }

    @Override // org.telegram.ui.Components.mr0, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        int i10;
        zn znVar = this.c1.a;
        Activity parentActivity = znVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (znVar.Y.getVisibility() == 0) {
            znVar.fragmentView.requestLayout();
        }
    }
}
