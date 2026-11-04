package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bm extends org.telegram.ui.Components.oo0 {
    public final /* synthetic */ org.telegram.messenger.zi S2;
    public final /* synthetic */ hm T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(hm hmVar, Activity activity, wm wmVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, boolean z12, org.telegram.messenger.zi ziVar) {
        super(activity, wmVar, arrayList, null, null, z10, null, null, false, false, z11, null, e6Var);
        this.T2 = hmVar;
        this.S2 = ziVar;
        this.T1 = z12;
    }

    @Override // org.telegram.ui.Components.oo0, org.telegram.ui.ActionBar.t2
    public final void K() {
        int i3;
        wm wmVar = this.T2.a;
        Activity parentActivity = wmVar.getParentActivity();
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
        org.telegram.messenger.g0.a3(parentActivity, i3);
        super.K();
        if (wmVar.a0.getVisibility() == 0) {
            wmVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.oo0
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        hm hmVar = this.T2;
        wm wmVar = hmVar.a;
        int i10 = wm.jd;
        wmVar.f8();
        if (hmVar.a.N3 == null || !z10) {
            return;
        }
        if (hVar.m() != 1) {
            hmVar.a.N3.k(0L, 53, Integer.valueOf(i3), Integer.valueOf(hVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) hVar.n(0)).id == hmVar.a.getUserConfig().e() && org.telegram.ui.Components.fc.a0(hmVar.a).g0(i3, ((TLRPC.Dialog) hVar.n(0)).id)) {
                return;
            }
            hmVar.a.N3.k(((TLRPC.Dialog) hVar.n(0)).id, 53, Integer.valueOf(i3), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.oo0
    public final void S0(final View view) {
        wm wmVar = this.T2.a;
        gi.oa b10 = view instanceof org.telegram.ui.Cells.c7 ? gi.qa.b((org.telegram.ui.Cells.c7) view) : null;
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.zi ziVar = this.S2;
        org.telegram.messenger.ui uiVar = ziVar.d1() != 0 ? (org.telegram.messenger.ui) wmVar.O6.f(ziVar.d1()) : null;
        if (uiVar != null) {
            arrayList.addAll(uiVar.d);
        } else {
            arrayList.add(ziVar);
        }
        final gi.va D = gi.va.D(wmVar.getParentActivity(), this.a);
        D.S = new org.telegram.messenger.r10() { // from class: org.telegram.ui.wl
            @Override // org.telegram.messenger.r10
            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                gi.va vaVar = D;
                gi.oa oaVar = null;
                if (booleanValue) {
                    bm bmVar = bm.this;
                    org.telegram.messenger.g0.h3(new sc(23, bmVar, l10));
                    bmVar.dismiss();
                    vaVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.c7) && view2.isAttachedToWindow()) {
                        oaVar = gi.qa.b((org.telegram.ui.Cells.c7) view2);
                    }
                    vaVar.X(oaVar);
                }
                org.telegram.messenger.g0.h3(runnable);
            }
        };
        D.T(b10, gi.f7.y(arrayList));
    }
}
