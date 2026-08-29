package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.vg1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fb implements View.OnLayoutChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ mc b;

    public fb(mc mcVar, boolean z10) {
        this.b = mcVar;
        this.a = z10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        kb kbVar;
        mc mcVar = this.b;
        rb rbVar = mcVar.e;
        rbVar.removeOnLayoutChangeListener(this);
        if (mcVar.l) {
            rbVar.onShow();
            org.telegram.ui.ActionBar.o2 o2Var = mcVar.g;
            boolean z10 = this.a;
            if (z10 && (o2Var instanceof vg1)) {
                o2Var = ((vg1) o2Var).X();
            }
            FrameLayout frameLayout = mcVar.h;
            if (o2Var == null || (kbVar = o2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof kb) {
                        kbVar = (kb) tag;
                    }
                }
                kbVar = null;
            }
            mcVar.p = kbVar;
            if (kbVar == null && o2Var != null) {
                mcVar.p = new ih.u0(o2Var, 7);
            }
            o1.k kVar = mcVar.d;
            if (kVar == null || !kVar.f) {
                kb kbVar2 = mcVar.p;
                mcVar.o = kbVar2 != null ? kbVar2.f(mcVar.a) : 0;
            }
            kb kbVar3 = mcVar.p;
            if (kbVar3 != null) {
                kbVar3.b(mcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !mcVar.s) {
                if (rbVar != null && mcVar.q == null) {
                    mcVar.q = rbVar.createTransition();
                }
                rbVar.transitionRunningEnter = true;
                rbVar.delegate = mcVar.p;
                rbVar.invalidate();
                qb qbVar = mcVar.q;
                Objects.requireNonNull(rbVar);
                qbVar.r(rbVar, new bb(rbVar, 1), new ig(this, 15), new hl(2, this, z10));
                return;
            }
            kb kbVar4 = mcVar.p;
            rbVar.delegate = kbVar4;
            if (kbVar4 != null && !z10) {
                kbVar4.c(rbVar.getHeight());
            }
            mcVar.l();
            rbVar.onEnterTransitionStart();
            rbVar.onEnterTransitionEnd();
            if (mcVar.u) {
                mcVar.i(true);
            }
        }
    }
}
