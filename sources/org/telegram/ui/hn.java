package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hn extends org.telegram.ui.Components.iq0 {
    public final /* synthetic */ MessageObject b1;
    public final /* synthetic */ nn c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(nn nnVar, Activity activity, bo boVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, boolean z12, MessageObject messageObject) {
        super(activity, boVar, arrayList, null, null, z10, null, null, false, false, z11, null, f6Var);
        this.c1 = nnVar;
        this.b1 = messageObject;
        this.a0 = z12;
    }

    @Override // org.telegram.ui.Components.iq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        nn nnVar = this.c1;
        bo boVar = nnVar.a;
        int i11 = bo.Gc;
        boVar.Q7();
        if (nnVar.a.y3 == null || !z10) {
            return;
        }
        if (iVar.m() != 1) {
            nnVar.a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) iVar.n(0)).id == nnVar.a.getUserConfig().getClientUserId() && org.telegram.ui.Components.vc.a0(nnVar.a).e0(i10, ((TLRPC.Dialog) iVar.n(0)).id)) {
                return;
            }
            nnVar.a.y3.k(((TLRPC.Dialog) iVar.n(0)).id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.iq0
    public final void S0(final View view) {
        bo boVar = this.c1.a;
        ci.hc b10 = view instanceof org.telegram.ui.Cells.f7 ? ci.jc.b((org.telegram.ui.Cells.f7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.b1;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) boVar.x6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final ci.oc E = ci.oc.E(boVar.getParentActivity(), this.currentAccount);
        E.R = new Utilities.Callback4() { // from class: org.telegram.ui.cn
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ci.oc ocVar = E;
                ci.hc hcVar = null;
                if (booleanValue) {
                    hn hnVar = hn.this;
                    AndroidUtilities.runOnUIThread(new wh(7, hnVar, l4));
                    hnVar.dismiss();
                    ocVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.f7) && view2.isAttachedToWindow()) {
                        hcVar = ci.jc.b((org.telegram.ui.Cells.f7) view2);
                    }
                    ocVar.Y(hcVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(b10, ci.o8.y(arrayList));
    }

    @Override // org.telegram.ui.Components.iq0, org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        int i10;
        bo boVar = this.c1.a;
        Activity parentActivity = boVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) boVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (boVar.Y.getVisibility() == 0) {
            boVar.fragmentView.requestLayout();
        }
    }
}
