package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class fm extends org.telegram.ui.Components.mo0 {
    public final /* synthetic */ org.telegram.messenger.ij R2;
    public final /* synthetic */ lm S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm(lm lmVar, Activity activity, an anVar, ArrayList arrayList, boolean z9, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, boolean z11, org.telegram.messenger.ij ijVar) {
        super(activity, anVar, arrayList, null, null, z9, null, null, false, false, z10, null, f6Var);
        this.S2 = lmVar;
        this.R2 = ijVar;
        this.S1 = z11;
    }

    @Override // org.telegram.ui.Components.mo0, org.telegram.ui.ActionBar.v2
    public final void K() {
        int i7;
        an anVar = this.S2.a;
        Activity parentActivity = anVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
        org.telegram.messenger.g0.a3(parentActivity, i7);
        super.K();
        if (anVar.Z.getVisibility() == 0) {
            anVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        lm lmVar = this.S2;
        an anVar = lmVar.a;
        int i10 = an.id;
        anVar.f8();
        if (lmVar.a.M3 == null || !z9) {
            return;
        }
        if (hVar.m() != 1) {
            lmVar.a.M3.k(0L, 53, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) hVar.n(0)).id == lmVar.a.getUserConfig().e() && org.telegram.ui.Components.hc.a0(lmVar.a).g0(i7, ((TLRPC.Dialog) hVar.n(0)).id)) {
                return;
            }
            lmVar.a.M3.k(((TLRPC.Dialog) hVar.n(0)).id, 53, Integer.valueOf(i7), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.mo0
    public final void S0(final View view) {
        an anVar = this.S2.a;
        fi.oa b10 = view instanceof org.telegram.ui.Cells.d7 ? fi.qa.b((org.telegram.ui.Cells.d7) view) : null;
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.ij ijVar = this.R2;
        org.telegram.messenger.dj djVar = ijVar.d1() != 0 ? (org.telegram.messenger.dj) anVar.N6.f(ijVar.d1()) : null;
        if (djVar != null) {
            arrayList.addAll(djVar.d);
        } else {
            arrayList.add(ijVar);
        }
        final fi.va D = fi.va.D(anVar.getParentActivity(), this.a);
        D.R = new org.telegram.messenger.z10() { // from class: org.telegram.ui.am
            @Override // org.telegram.messenger.z10
            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                fi.va vaVar = D;
                fi.oa oaVar = null;
                if (booleanValue) {
                    fm fmVar = fm.this;
                    org.telegram.messenger.g0.h3(new qf(18, fmVar, l10));
                    fmVar.dismiss();
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
