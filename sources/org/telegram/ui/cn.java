package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class cn extends org.telegram.ui.Components.uq0 {
    public final /* synthetic */ MessageObject b1;
    public final /* synthetic */ in c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn(in inVar, Activity activity, wn wnVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, boolean z12, MessageObject messageObject) {
        super(activity, wnVar, arrayList, null, null, z10, null, null, false, false, z11, null, d6Var);
        this.c1 = inVar;
        this.b1 = messageObject;
        this.a0 = z12;
    }

    @Override // org.telegram.ui.Components.uq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        in inVar = this.c1;
        wn wnVar = inVar.a;
        int i11 = wn.Gc;
        wnVar.Q7();
        if (inVar.a.y3 == null || !z10) {
            return;
        }
        if (iVar.m() != 1) {
            inVar.a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) iVar.n(0)).id == inVar.a.getUserConfig().getClientUserId() && org.telegram.ui.Components.xc.a0(inVar.a).e0(i10, ((TLRPC.Dialog) iVar.n(0)).id)) {
                return;
            }
            inVar.a.y3.k(((TLRPC.Dialog) iVar.n(0)).id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.uq0
    public final void S0(final View view) {
        wn wnVar = this.c1.a;
        ci.ec b10 = view instanceof org.telegram.ui.Cells.g7 ? ci.gc.b((org.telegram.ui.Cells.g7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.b1;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) wnVar.x6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final ci.lc E = ci.lc.E(wnVar.getParentActivity(), this.currentAccount);
        E.R = new Utilities.Callback4() { // from class: org.telegram.ui.xm
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ci.lc lcVar = E;
                ci.ec ecVar = null;
                if (booleanValue) {
                    cn cnVar = cn.this;
                    AndroidUtilities.runOnUIThread(new fh(12, cnVar, l4));
                    cnVar.dismiss();
                    lcVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.g7) && view2.isAttachedToWindow()) {
                        ecVar = ci.gc.b((org.telegram.ui.Cells.g7) view2);
                    }
                    lcVar.Y(ecVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(b10, ci.l8.y(arrayList));
    }

    @Override // org.telegram.ui.Components.uq0, org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        int i10;
        wn wnVar = this.c1.a;
        Activity parentActivity = wnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (wnVar.Y.getVisibility() == 0) {
            wnVar.fragmentView.requestLayout();
        }
    }
}
