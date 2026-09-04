package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class in extends org.telegram.ui.Components.hq0 {
    public final /* synthetic */ MessageObject b1;
    public final /* synthetic */ on c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(on onVar, Activity activity, co coVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, boolean z12, MessageObject messageObject) {
        super(activity, coVar, arrayList, null, null, z10, null, null, false, false, z11, null, f6Var);
        this.c1 = onVar;
        this.b1 = messageObject;
        this.a0 = z12;
    }

    @Override // org.telegram.ui.Components.hq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        on onVar = this.c1;
        co coVar = onVar.a;
        int i11 = co.Hc;
        coVar.Q7();
        if (onVar.a.y3 == null || !z10) {
            return;
        }
        if (iVar.m() != 1) {
            onVar.a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) iVar.n(0)).id == onVar.a.getUserConfig().getClientUserId() && org.telegram.ui.Components.yc.a0(onVar.a).e0(i10, ((TLRPC.Dialog) iVar.n(0)).id)) {
                return;
            }
            onVar.a.y3.k(((TLRPC.Dialog) iVar.n(0)).id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.hq0
    public final void S0(final View view) {
        co coVar = this.c1.a;
        di.ic b10 = view instanceof org.telegram.ui.Cells.f7 ? di.kc.b((org.telegram.ui.Cells.f7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.b1;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) coVar.x6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final di.pc E = di.pc.E(coVar.getParentActivity(), this.currentAccount);
        E.R = new Utilities.Callback4() { // from class: org.telegram.ui.dn
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                di.pc pcVar = E;
                di.ic icVar = null;
                if (booleanValue) {
                    in inVar = in.this;
                    AndroidUtilities.runOnUIThread(new fh(13, inVar, l4));
                    inVar.dismiss();
                    pcVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.f7) && view2.isAttachedToWindow()) {
                        icVar = di.kc.b((org.telegram.ui.Cells.f7) view2);
                    }
                    pcVar.Y(icVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(b10, di.o8.y(arrayList));
    }

    @Override // org.telegram.ui.Components.hq0, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        int i10;
        co coVar = this.c1.a;
        Activity parentActivity = coVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (coVar.Y.getVisibility() == 0) {
            coVar.fragmentView.requestLayout();
        }
    }
}
