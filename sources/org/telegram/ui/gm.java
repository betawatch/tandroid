package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gm extends org.telegram.ui.Components.zo0 {
    public final /* synthetic */ org.telegram.messenger.fj V2;
    public final /* synthetic */ mm W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(mm mmVar, Activity activity, bn bnVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.i6 i6Var, boolean z12, org.telegram.messenger.fj fjVar) {
        super(activity, bnVar, arrayList, null, null, z10, null, null, false, false, z11, null, i6Var);
        this.W2 = mmVar;
        this.V2 = fjVar;
        this.W1 = z12;
    }

    @Override // org.telegram.ui.Components.zo0, org.telegram.ui.ActionBar.w2
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

    @Override // org.telegram.ui.Components.zo0
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
            if (((TLRPC.Dialog) hVar.n(0)).id == mmVar.a.getUserConfig().e() && org.telegram.ui.Components.kc.b0(mmVar.a).h0(i7, ((TLRPC.Dialog) hVar.n(0)).id)) {
                return;
            }
            mmVar.a.N3.k(((TLRPC.Dialog) hVar.n(0)).id, 53, Integer.valueOf(i7), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.zo0
    public final void T0(final View view) {
        bn bnVar = this.W2.a;
        hi.gb b10 = view instanceof org.telegram.ui.Cells.d7 ? hi.ib.b((org.telegram.ui.Cells.d7) view) : null;
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.fj fjVar = this.V2;
        org.telegram.messenger.aj ajVar = fjVar.c1() != 0 ? (org.telegram.messenger.aj) bnVar.P6.f(fjVar.c1()) : null;
        if (ajVar != null) {
            arrayList.addAll(ajVar.d);
        } else {
            arrayList.add(fjVar);
        }
        final hi.nb D = hi.nb.D(bnVar.getParentActivity(), this.a);
        D.S = new org.telegram.messenger.t10() { // from class: org.telegram.ui.bm
            @Override // org.telegram.messenger.t10
            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                hi.nb nbVar = D;
                hi.gb gbVar = null;
                if (booleanValue) {
                    gm gmVar = gm.this;
                    org.telegram.messenger.g0.g3(new ah(7, gmVar, l10));
                    gmVar.dismiss();
                    nbVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.d7) && view2.isAttachedToWindow()) {
                        gbVar = hi.ib.b((org.telegram.ui.Cells.d7) view2);
                    }
                    nbVar.X(gbVar);
                }
                org.telegram.messenger.g0.g3(runnable);
            }
        };
        D.T(b10, hi.x7.y(arrayList));
    }
}
