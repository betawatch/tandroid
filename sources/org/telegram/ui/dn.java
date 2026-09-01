package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class dn extends org.telegram.ui.Components.mq0 {
    public final /* synthetic */ MessageObject Y0;
    public final /* synthetic */ jn Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn(jn jnVar, Activity activity, xn xnVar, ArrayList arrayList, boolean z4, boolean z10, org.telegram.ui.ActionBar.g6 g6Var, boolean z11, MessageObject messageObject) {
        super(activity, xnVar, arrayList, null, null, z4, null, null, false, false, z10, null, g6Var);
        this.Z0 = jnVar;
        this.Y0 = messageObject;
        this.X = z11;
    }

    @Override // org.telegram.ui.Components.mq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        jn jnVar = this.Z0;
        xn xnVar = jnVar.a;
        int i11 = xn.Ec;
        xnVar.Q7();
        if (jnVar.a.v3 == null || !z4) {
            return;
        }
        if (hVar.m() != 1) {
            jnVar.a.v3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) hVar.n(0)).id == jnVar.a.getUserConfig().getClientUserId() && org.telegram.ui.Components.qc.a0(jnVar.a).e0(i10, ((TLRPC.Dialog) hVar.n(0)).id)) {
                return;
            }
            jnVar.a.v3.k(((TLRPC.Dialog) hVar.n(0)).id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.mq0
    public final void S0(final View view) {
        xn xnVar = this.Z0.a;
        qh.u9 b10 = view instanceof org.telegram.ui.Cells.e7 ? qh.x9.b((org.telegram.ui.Cells.e7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.Y0;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) xnVar.u6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final qh.ca E = qh.ca.E(xnVar.getParentActivity(), this.currentAccount);
        E.O = new Utilities.Callback4() { // from class: org.telegram.ui.ym
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                qh.ca caVar = E;
                qh.u9 u9Var = null;
                if (booleanValue) {
                    dn dnVar = dn.this;
                    AndroidUtilities.runOnUIThread(new fc(24, dnVar, l10));
                    dnVar.dismiss();
                    caVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.e7) && view2.isAttachedToWindow()) {
                        u9Var = qh.x9.b((org.telegram.ui.Cells.e7) view2);
                    }
                    caVar.Y(u9Var);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(b10, qh.s6.y(arrayList));
    }

    @Override // org.telegram.ui.Components.mq0, org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        int i10;
        xn xnVar = this.Z0.a;
        Activity parentActivity = xnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (xnVar.V.getVisibility() == 0) {
            xnVar.fragmentView.requestLayout();
        }
    }
}
