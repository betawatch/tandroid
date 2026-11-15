package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class fm extends org.telegram.ui.Components.po0 {
    public final /* synthetic */ org.telegram.messenger.gj V2;
    public final /* synthetic */ lm W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm(lm lmVar, Activity activity, an anVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, boolean z12, org.telegram.messenger.gj gjVar) {
        super(activity, anVar, arrayList, null, null, z10, null, null, false, false, z11, null, e6Var);
        this.W2 = lmVar;
        this.V2 = gjVar;
        this.W1 = z12;
    }

    @Override // org.telegram.ui.Components.po0, org.telegram.ui.ActionBar.u2
    public final void L() {
        int i7;
        an anVar = this.W2.a;
        Activity parentActivity = anVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
        org.telegram.messenger.g0.a3(parentActivity, i7);
        super.L();
        if (anVar.a0.getVisibility() == 0) {
            anVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.po0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        lm lmVar = this.W2;
        an anVar = lmVar.a;
        int i10 = an.ld;
        anVar.h8();
        if (lmVar.a.N3 == null || !z10) {
            return;
        }
        if (hVar.m() != 1) {
            lmVar.a.N3.k(0L, 53, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) hVar.n(0)).id == lmVar.a.getUserConfig().e() && org.telegram.ui.Components.cc.a0(lmVar.a).g0(i7, ((TLRPC.Dialog) hVar.n(0)).id)) {
                return;
            }
            lmVar.a.N3.k(((TLRPC.Dialog) hVar.n(0)).id, 53, Integer.valueOf(i7), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.po0
    public final void S0(final View view) {
        an anVar = this.W2.a;
        hi.la b10 = view instanceof org.telegram.ui.Cells.c7 ? hi.na.b((org.telegram.ui.Cells.c7) view) : null;
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.gj gjVar = this.V2;
        org.telegram.messenger.bj bjVar = gjVar.c1() != 0 ? (org.telegram.messenger.bj) anVar.O6.f(gjVar.c1()) : null;
        if (bjVar != null) {
            arrayList.addAll(bjVar.d);
        } else {
            arrayList.add(gjVar);
        }
        final hi.sa D = hi.sa.D(anVar.getParentActivity(), this.a);
        D.S = new org.telegram.messenger.w10() { // from class: org.telegram.ui.am
            @Override // org.telegram.messenger.w10
            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                hi.sa saVar = D;
                hi.la laVar = null;
                if (booleanValue) {
                    fm fmVar = fm.this;
                    org.telegram.messenger.g0.h3(new zg(7, fmVar, l10));
                    fmVar.dismiss();
                    saVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.c7) && view2.isAttachedToWindow()) {
                        laVar = hi.na.b((org.telegram.ui.Cells.c7) view2);
                    }
                    saVar.X(laVar);
                }
                org.telegram.messenger.g0.h3(runnable);
            }
        };
        D.T(b10, hi.d7.y(arrayList));
    }
}
