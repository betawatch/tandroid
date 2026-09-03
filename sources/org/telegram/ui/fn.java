package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fn extends org.telegram.ui.Components.lq0 {
    public final /* synthetic */ MessageObject Y0;
    public final /* synthetic */ ln Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(ln lnVar, Activity activity, zn znVar, ArrayList arrayList, boolean z4, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, boolean z11, MessageObject messageObject) {
        super(activity, znVar, arrayList, null, null, z4, null, null, false, false, z10, null, f6Var);
        this.Z0 = lnVar;
        this.Y0 = messageObject;
        this.X = z11;
    }

    @Override // org.telegram.ui.Components.lq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        ln lnVar = this.Z0;
        zn znVar = lnVar.a;
        int i11 = zn.Ec;
        znVar.Q7();
        if (lnVar.a.v3 == null || !z4) {
            return;
        }
        if (hVar.m() != 1) {
            lnVar.a.v3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) hVar.n(0)).id == lnVar.a.getUserConfig().getClientUserId() && org.telegram.ui.Components.qc.a0(lnVar.a).e0(i10, ((TLRPC.Dialog) hVar.n(0)).id)) {
                return;
            }
            lnVar.a.v3.k(((TLRPC.Dialog) hVar.n(0)).id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.lq0
    public final void S0(final View view) {
        zn znVar = this.Z0.a;
        ph.w9 b10 = view instanceof org.telegram.ui.Cells.d7 ? ph.y9.b((org.telegram.ui.Cells.d7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.Y0;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) znVar.u6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final ph.da E = ph.da.E(znVar.getParentActivity(), this.currentAccount);
        E.O = new Utilities.Callback4() { // from class: org.telegram.ui.an
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ph.da daVar = E;
                ph.w9 w9Var = null;
                if (booleanValue) {
                    fn fnVar = fn.this;
                    AndroidUtilities.runOnUIThread(new hc(24, fnVar, l10));
                    fnVar.dismiss();
                    daVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.d7) && view2.isAttachedToWindow()) {
                        w9Var = ph.y9.b((org.telegram.ui.Cells.d7) view2);
                    }
                    daVar.Y(w9Var);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(b10, ph.t6.y(arrayList));
    }

    @Override // org.telegram.ui.Components.lq0, org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        int i10;
        zn znVar = this.Z0.a;
        Activity parentActivity = znVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (znVar.V.getVisibility() == 0) {
            znVar.fragmentView.requestLayout();
        }
    }
}
