package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class gm extends org.telegram.ui.Components.ap0 {
    public final /* synthetic */ org.telegram.messenger.gj V2;
    public final /* synthetic */ mm W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(mm mmVar, Activity activity, bn bnVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.h6 h6Var, boolean z12, org.telegram.messenger.gj gjVar) {
        super(activity, bnVar, arrayList, null, null, z10, null, null, false, false, z11, null, h6Var);
        this.W2 = mmVar;
        this.V2 = gjVar;
        this.W1 = z12;
    }

    @Override // org.telegram.ui.Components.ap0, org.telegram.ui.ActionBar.w2
    public final void L() {
        int i7;
        bn bnVar = this.W2.a;
        Activity parentActivity = bnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
        org.telegram.messenger.g0.Z2(parentActivity, i7);
        super.L();
        if (bnVar.a0.getVisibility() == 0) {
            bnVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.ap0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        mm mmVar = this.W2;
        bn bnVar = mmVar.a;
        int i10 = bn.md;
        bnVar.h8();
        if (mmVar.a.N3 == null || !z10) {
            return;
        }
        if (hVar.m() != 1) {
            mmVar.a.N3.k(0L, 53, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) hVar.n(0)).id == mmVar.a.getUserConfig().e() && org.telegram.ui.Components.lc.b0(mmVar.a).h0(i7, ((TLRPC.Dialog) hVar.n(0)).id)) {
                return;
            }
            mmVar.a.N3.k(((TLRPC.Dialog) hVar.n(0)).id, 53, Integer.valueOf(i7), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.ap0
    public final void T0(final View view) {
        bn bnVar = this.W2.a;
        hi.la b10 = view instanceof org.telegram.ui.Cells.e7 ? hi.na.b((org.telegram.ui.Cells.e7) view) : null;
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.gj gjVar = this.V2;
        org.telegram.messenger.bj bjVar = gjVar.c1() != 0 ? (org.telegram.messenger.bj) bnVar.P6.f(gjVar.c1()) : null;
        if (bjVar != null) {
            arrayList.addAll(bjVar.d);
        } else {
            arrayList.add(gjVar);
        }
        final hi.sa D = hi.sa.D(bnVar.getParentActivity(), this.a);
        D.S = new org.telegram.messenger.v10() { // from class: org.telegram.ui.bm
            @Override // org.telegram.messenger.v10
            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                hi.sa saVar = D;
                hi.la laVar = null;
                if (booleanValue) {
                    gm gmVar = gm.this;
                    org.telegram.messenger.g0.g3(new eh(5, gmVar, l10));
                    gmVar.dismiss();
                    saVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.e7) && view2.isAttachedToWindow()) {
                        laVar = hi.na.b((org.telegram.ui.Cells.e7) view2);
                    }
                    saVar.X(laVar);
                }
                org.telegram.messenger.g0.g3(runnable);
            }
        };
        D.T(b10, hi.c7.y(arrayList));
    }
}
