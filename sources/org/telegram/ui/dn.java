package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class dn extends org.telegram.ui.Components.hq0 {
    public final /* synthetic */ MessageObject b1;
    public final /* synthetic */ jn c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn(jn jnVar, Activity activity, xn xnVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, boolean z12, MessageObject messageObject) {
        super(activity, xnVar, arrayList, null, null, z10, null, null, false, false, z11, null, d6Var);
        this.c1 = jnVar;
        this.b1 = messageObject;
        this.a0 = z12;
    }

    @Override // org.telegram.ui.Components.hq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        jn jnVar = this.c1;
        xn xnVar = jnVar.a;
        int i11 = xn.Gc;
        xnVar.Q7();
        if (jnVar.a.y3 == null || !z10) {
            return;
        }
        if (iVar.m() != 1) {
            jnVar.a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) iVar.n(0)).id == jnVar.a.getUserConfig().getClientUserId() && org.telegram.ui.Components.xc.a0(jnVar.a).e0(i10, ((TLRPC.Dialog) iVar.n(0)).id)) {
                return;
            }
            jnVar.a.y3.k(((TLRPC.Dialog) iVar.n(0)).id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.hq0
    public final void S0(final View view) {
        xn xnVar = this.c1.a;
        ci.ec b10 = view instanceof org.telegram.ui.Cells.f7 ? ci.gc.b((org.telegram.ui.Cells.f7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.b1;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) xnVar.x6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final ci.lc E = ci.lc.E(xnVar.getParentActivity(), this.currentAccount);
        E.R = new Utilities.Callback4() { // from class: org.telegram.ui.ym
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ci.lc lcVar = E;
                ci.ec ecVar = null;
                if (booleanValue) {
                    dn dnVar = dn.this;
                    AndroidUtilities.runOnUIThread(new rh(7, dnVar, l4));
                    dnVar.dismiss();
                    lcVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.f7) && view2.isAttachedToWindow()) {
                        ecVar = ci.gc.b((org.telegram.ui.Cells.f7) view2);
                    }
                    lcVar.Y(ecVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(b10, ci.l8.y(arrayList));
    }

    @Override // org.telegram.ui.Components.hq0, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        int i10;
        xn xnVar = this.c1.a;
        Activity parentActivity = xnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (xnVar.Y.getVisibility() == 0) {
            xnVar.fragmentView.requestLayout();
        }
    }
}
