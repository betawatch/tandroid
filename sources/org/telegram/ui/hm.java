package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hm extends org.telegram.ui.Components.mo0 {
    public final /* synthetic */ org.telegram.messenger.ij U2;
    public final /* synthetic */ nm V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(nm nmVar, Activity activity, cn cnVar, ArrayList arrayList, boolean z9, boolean z10, org.telegram.ui.ActionBar.h6 h6Var, boolean z11, org.telegram.messenger.ij ijVar) {
        super(activity, cnVar, arrayList, null, null, z9, null, null, false, false, z10, null, h6Var);
        this.V2 = nmVar;
        this.U2 = ijVar;
        this.V1 = z11;
    }

    @Override // org.telegram.ui.Components.mo0, org.telegram.ui.ActionBar.w2
    public final void K() {
        int i7;
        cn cnVar = this.V2.a;
        Activity parentActivity = cnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
        org.telegram.messenger.g0.a3(parentActivity, i7);
        super.K();
        if (cnVar.Z.getVisibility() == 0) {
            cnVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        nm nmVar = this.V2;
        cn cnVar = nmVar.a;
        int i10 = cn.kd;
        cnVar.g8();
        if (nmVar.a.M3 == null || !z9) {
            return;
        }
        if (hVar.m() != 1) {
            nmVar.a.M3.k(0L, 53, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) hVar.n(0)).id == nmVar.a.getUserConfig().e() && org.telegram.ui.Components.gc.a0(nmVar.a).g0(i7, ((TLRPC.Dialog) hVar.n(0)).id)) {
                return;
            }
            nmVar.a.M3.k(((TLRPC.Dialog) hVar.n(0)).id, 53, Integer.valueOf(i7), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.mo0
    public final void S0(final View view) {
        cn cnVar = this.V2.a;
        fi.oa b10 = view instanceof org.telegram.ui.Cells.d7 ? fi.qa.b((org.telegram.ui.Cells.d7) view) : null;
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.ij ijVar = this.U2;
        org.telegram.messenger.dj djVar = ijVar.c1() != 0 ? (org.telegram.messenger.dj) cnVar.N6.f(ijVar.c1()) : null;
        if (djVar != null) {
            arrayList.addAll(djVar.d);
        } else {
            arrayList.add(ijVar);
        }
        final fi.va D = fi.va.D(cnVar.getParentActivity(), this.a);
        D.R = new org.telegram.messenger.z10() { // from class: org.telegram.ui.cm
            @Override // org.telegram.messenger.z10
            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                fi.va vaVar = D;
                fi.oa oaVar = null;
                if (booleanValue) {
                    hm hmVar = hm.this;
                    org.telegram.messenger.g0.h3(new oe(19, hmVar, l10));
                    hmVar.dismiss();
                    vaVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.d7) && view2.isAttachedToWindow()) {
                        oaVar = fi.qa.b((org.telegram.ui.Cells.d7) view2);
                    }
                    vaVar.X(oaVar);
                }
                org.telegram.messenger.g0.h3(runnable);
            }
        };
        D.T(b10, fi.e7.y(arrayList));
    }
}
