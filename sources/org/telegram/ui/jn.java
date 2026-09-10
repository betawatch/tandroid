package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class jn extends org.telegram.ui.Components.sq0 {
    public final /* synthetic */ MessageObject b1;
    public final /* synthetic */ pn c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn(pn pnVar, Activity activity, eo eoVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, boolean z12, MessageObject messageObject) {
        super(activity, eoVar, arrayList, null, null, z10, null, null, false, false, z11, null, f6Var);
        this.c1 = pnVar;
        this.b1 = messageObject;
        this.a0 = z12;
    }

    @Override // org.telegram.ui.Components.sq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        pn pnVar = this.c1;
        eo eoVar = pnVar.a;
        int i11 = eo.Hc;
        eoVar.Q7();
        if (pnVar.a.y3 == null || !z10) {
            return;
        }
        if (iVar.m() != 1) {
            pnVar.a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) iVar.n(0)).id == pnVar.a.getUserConfig().getClientUserId() && org.telegram.ui.Components.wc.a0(pnVar.a).e0(i10, ((TLRPC.Dialog) iVar.n(0)).id)) {
                return;
            }
            pnVar.a.y3.k(((TLRPC.Dialog) iVar.n(0)).id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.sq0
    public final void S0(final View view) {
        eo eoVar = this.c1.a;
        bi.ud b10 = view instanceof org.telegram.ui.Cells.h7 ? bi.xd.b((org.telegram.ui.Cells.h7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.b1;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) eoVar.x6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final bi.ce E = bi.ce.E(eoVar.getParentActivity(), this.currentAccount);
        E.R = new Utilities.Callback4() { // from class: org.telegram.ui.en
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                bi.ce ceVar = E;
                bi.ud udVar = null;
                if (booleanValue) {
                    jn jnVar = jn.this;
                    AndroidUtilities.runOnUIThread(new qh(10, jnVar, l4));
                    jnVar.dismiss();
                    ceVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.h7) && view2.isAttachedToWindow()) {
                        udVar = bi.xd.b((org.telegram.ui.Cells.h7) view2);
                    }
                    ceVar.Y(udVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(b10, bi.r9.y(arrayList));
    }

    @Override // org.telegram.ui.Components.sq0, org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        int i10;
        eo eoVar = this.c1.a;
        Activity parentActivity = eoVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (eoVar.Y.getVisibility() == 0) {
            eoVar.fragmentView.requestLayout();
        }
    }
}
