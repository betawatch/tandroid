package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class fn extends org.telegram.ui.Components.uq0 {
    public final /* synthetic */ MessageObject b1;
    public final /* synthetic */ ln c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(ln lnVar, Activity activity, zn znVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, boolean z12, MessageObject messageObject) {
        super(activity, znVar, arrayList, null, null, z10, null, null, false, false, z11, null, f6Var);
        this.c1 = lnVar;
        this.b1 = messageObject;
        this.a0 = z12;
    }

    @Override // org.telegram.ui.Components.uq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        ln lnVar = this.c1;
        zn znVar = lnVar.a;
        int i11 = zn.Gc;
        znVar.Q7();
        if (lnVar.a.y3 == null || !z10) {
            return;
        }
        if (iVar.m() != 1) {
            lnVar.a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) iVar.n(0)).id == lnVar.a.getUserConfig().getClientUserId() && org.telegram.ui.Components.xc.a0(lnVar.a).e0(i10, ((TLRPC.Dialog) iVar.n(0)).id)) {
                return;
            }
            lnVar.a.y3.k(((TLRPC.Dialog) iVar.n(0)).id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.uq0
    public final void S0(final View view) {
        zn znVar = this.c1.a;
        ci.hc b10 = view instanceof org.telegram.ui.Cells.h7 ? ci.jc.b((org.telegram.ui.Cells.h7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.b1;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) znVar.x6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final ci.oc E = ci.oc.E(znVar.getParentActivity(), this.currentAccount);
        E.R = new Utilities.Callback4() { // from class: org.telegram.ui.an
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ci.oc ocVar = E;
                ci.hc hcVar = null;
                if (booleanValue) {
                    fn fnVar = fn.this;
                    AndroidUtilities.runOnUIThread(new gh(13, fnVar, l4));
                    fnVar.dismiss();
                    ocVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.h7) && view2.isAttachedToWindow()) {
                        hcVar = ci.jc.b((org.telegram.ui.Cells.h7) view2);
                    }
                    ocVar.Y(hcVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(b10, ci.o8.y(arrayList));
    }

    @Override // org.telegram.ui.Components.uq0, org.telegram.ui.ActionBar.f3
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
