package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class en extends org.telegram.ui.Components.zq0 {
    public final /* synthetic */ MessageObject X0;
    public final /* synthetic */ kn Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en(kn knVar, Activity activity, yn ynVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, boolean z12, MessageObject messageObject) {
        super(activity, ynVar, arrayList, null, null, z10, null, null, false, false, z11, null, d6Var);
        this.Y0 = knVar;
        this.X0 = messageObject;
        this.a0 = z12;
    }

    @Override // org.telegram.ui.Components.zq0
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        kn knVar = this.Y0;
        yn ynVar = knVar.a;
        int i11 = yn.Bc;
        ynVar.Q7();
        if (knVar.a.w3 == null || !z10) {
            return;
        }
        if (iVar.m() != 1) {
            knVar.a.w3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) iVar.n(0)).id == knVar.a.getUserConfig().getClientUserId() && org.telegram.ui.Components.yc.a0(knVar.a).e0(i10, ((TLRPC.Dialog) iVar.n(0)).id)) {
                return;
            }
            knVar.a.w3.k(((TLRPC.Dialog) iVar.n(0)).id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.zq0
    public final void P0(final View view) {
        yn ynVar = this.Y0.a;
        ci.dc b10 = view instanceof org.telegram.ui.Cells.g7 ? ci.fc.b((org.telegram.ui.Cells.g7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.X0;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) ynVar.v6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final ci.kc E = ci.kc.E(ynVar.getParentActivity(), this.currentAccount);
        E.R = new Utilities.Callback4() { // from class: org.telegram.ui.ym
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ci.kc kcVar = E;
                ci.dc dcVar = null;
                if (booleanValue) {
                    en enVar = en.this;
                    AndroidUtilities.runOnUIThread(new oh(11, enVar, l4));
                    enVar.dismiss();
                    kcVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.g7) && view2.isAttachedToWindow()) {
                        dcVar = ci.fc.b((org.telegram.ui.Cells.g7) view2);
                    }
                    kcVar.Y(dcVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(b10, ci.k8.y(arrayList));
    }

    @Override // org.telegram.ui.Components.zq0, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        int i10;
        yn ynVar = this.Y0.a;
        Activity parentActivity = ynVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (ynVar.W.getVisibility() == 0) {
            ynVar.fragmentView.requestLayout();
        }
    }
}
