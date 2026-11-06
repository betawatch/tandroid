package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.ui.nb1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class va implements View.OnLayoutChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ cc b;

    public va(cc ccVar, boolean z9) {
        this.b = ccVar;
        this.a = z9;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        ab abVar;
        cc ccVar = this.b;
        gb gbVar = ccVar.e;
        gbVar.removeOnLayoutChangeListener(this);
        if (ccVar.l) {
            gbVar.onShow();
            org.telegram.ui.ActionBar.f2 f2Var = ccVar.g;
            boolean z9 = this.a;
            if (z9 && (f2Var instanceof nb1)) {
                f2Var = ((nb1) f2Var).c0();
            }
            FrameLayout frameLayout = ccVar.h;
            if (f2Var == null || (abVar = f2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof ab) {
                        abVar = (ab) tag;
                    }
                }
                abVar = null;
            }
            ccVar.p = abVar;
            int i17 = 1;
            if (abVar == null && f2Var != null) {
                ccVar.p = new org.telegram.ui.ActionBar.z1(i17, f2Var);
            }
            r1.g gVar = ccVar.d;
            if (gVar == null || !gVar.f) {
                ab abVar2 = ccVar.p;
                ccVar.o = abVar2 != null ? abVar2.f(ccVar.a) : 0;
            }
            ab abVar3 = ccVar.p;
            if (abVar3 != null) {
                abVar3.b(ccVar);
            }
            if (org.telegram.messenger.qp.e1().getBoolean("view_animations", true) && !ccVar.s) {
                if (gbVar != null && ccVar.q == null) {
                    ccVar.q = gbVar.createTransition();
                }
                gbVar.transitionRunningEnter = true;
                gbVar.delegate = ccVar.p;
                gbVar.invalidate();
                fb fbVar = ccVar.q;
                Objects.requireNonNull(gbVar);
                fbVar.B(gbVar, new ra(gbVar, 1), new xf(this, 15), new bl(2, this, z9));
                return;
            }
            ab abVar4 = ccVar.p;
            gbVar.delegate = abVar4;
            if (abVar4 != null && !z9) {
                abVar4.c(gbVar.getHeight());
            }
            ccVar.l();
            gbVar.onEnterTransitionStart();
            gbVar.onEnterTransitionEnd();
            if (ccVar.u) {
                ccVar.i(true);
            }
        }
    }
}
