package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class kn extends org.telegram.ui.Components.ir0 {
    public final /* synthetic */ MessageObject b1;
    public final /* synthetic */ qn c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(qn qnVar, Activity activity, fo foVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, boolean z12, MessageObject messageObject) {
        super(activity, foVar, arrayList, null, null, z10, null, null, false, false, z11, null, c6Var);
        this.c1 = qnVar;
        this.b1 = messageObject;
        this.a0 = z12;
    }

    @Override // org.telegram.ui.Components.ir0
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        qn qnVar = this.c1;
        fo foVar = qnVar.a;
        int i11 = fo.Hc;
        foVar.T7();
        if (qnVar.a.y3 == null || !z10) {
            return;
        }
        if (hVar.m() != 1) {
            qnVar.a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) hVar.n(0)).id == qnVar.a.getUserConfig().getClientUserId() && org.telegram.ui.Components.zc.a0(qnVar.a).g0(i10, ((TLRPC.Dialog) hVar.n(0)).id)) {
                return;
            }
            qnVar.a.y3.k(((TLRPC.Dialog) hVar.n(0)).id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.ir0
    public final void T0(final View view) {
        fo foVar = this.c1.a;
        di.dc b10 = view instanceof org.telegram.ui.Cells.f7 ? di.fc.b((org.telegram.ui.Cells.f7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.b1;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) foVar.x6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final di.kc D = di.kc.D(foVar.getParentActivity(), this.currentAccount);
        D.R = new Utilities.Callback4() { // from class: org.telegram.ui.fn
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                di.kc kcVar = D;
                di.dc dcVar = null;
                if (booleanValue) {
                    kn knVar = kn.this;
                    AndroidUtilities.runOnUIThread(new jd(21, knVar, l4));
                    knVar.dismiss();
                    kcVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.f7) && view2.isAttachedToWindow()) {
                        dcVar = di.fc.b((org.telegram.ui.Cells.f7) view2);
                    }
                    kcVar.X(dcVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        D.T(b10, di.k8.y(arrayList));
    }

    @Override // org.telegram.ui.Components.ir0, org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        int i10;
        fo foVar = this.c1.a;
        Activity parentActivity = foVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (foVar.Y.getVisibility() == 0) {
            foVar.fragmentView.requestLayout();
        }
    }
}
