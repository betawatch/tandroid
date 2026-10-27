package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bn extends org.telegram.ui.Components.nr0 {
    public final /* synthetic */ MessageObject a1;
    public final /* synthetic */ hn b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(hn hnVar, Activity activity, wn wnVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.u6 u6Var, boolean z12, MessageObject messageObject) {
        super(activity, wnVar, arrayList, null, null, z10, null, null, false, false, z11, null, u6Var);
        this.b1 = hnVar;
        this.a1 = messageObject;
        this.b0 = z12;
    }

    @Override // org.telegram.ui.Components.nr0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        hn hnVar = this.b1;
        wn wnVar = hnVar.a;
        int i11 = wn.fd;
        wnVar.Z7();
        if (hnVar.a.K3 == null || !z10) {
            return;
        }
        if (hVar.m() != 1) {
            hnVar.a.K3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) hVar.n(0)).id == hnVar.a.getUserConfig().getClientUserId() && org.telegram.ui.Components.wc.b0(hnVar.a).h0(i10, ((TLRPC.Dialog) hVar.n(0)).id)) {
                return;
            }
            hnVar.a.K3.k(((TLRPC.Dialog) hVar.n(0)).id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.nr0
    public final void U0(final View view) {
        wn wnVar = this.b1.a;
        fi.lb b10 = view instanceof org.telegram.ui.Cells.k7 ? fi.nb.b((org.telegram.ui.Cells.k7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.a1;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) wnVar.N6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final fi.sb D = fi.sb.D(wnVar.getParentActivity(), this.currentAccount);
        D.R = new Utilities.Callback4() { // from class: org.telegram.ui.wm
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                fi.sb sbVar = D;
                fi.lb lbVar = null;
                if (booleanValue) {
                    bn bnVar = bn.this;
                    AndroidUtilities.runOnUIThread(new ed(21, bnVar, l4));
                    bnVar.dismiss();
                    sbVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.k7) && view2.isAttachedToWindow()) {
                        lbVar = fi.nb.b((org.telegram.ui.Cells.k7) view2);
                    }
                    sbVar.X(lbVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        D.T(b10, fi.w7.y(arrayList));
    }

    @Override // org.telegram.ui.Components.nr0, org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        int i10;
        wn wnVar = this.b1.a;
        Activity parentActivity = wnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (wnVar.Y.getVisibility() == 0) {
            wnVar.fragmentView.requestLayout();
        }
    }
}
