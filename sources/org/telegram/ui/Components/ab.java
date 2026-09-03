package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ph1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ab implements View.OnLayoutChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ic b;

    public ab(ic icVar, boolean z4) {
        this.b = icVar;
        this.a = z4;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        fb fbVar;
        ic icVar = this.b;
        nb nbVar = icVar.e;
        nbVar.removeOnLayoutChangeListener(this);
        if (icVar.l) {
            nbVar.onShow();
            org.telegram.ui.ActionBar.p2 p2Var = icVar.g;
            boolean z4 = this.a;
            if (z4 && (p2Var instanceof ph1)) {
                p2Var = ((ph1) p2Var).X();
            }
            FrameLayout frameLayout = icVar.h;
            if (p2Var == null || (fbVar = p2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof fb) {
                        fbVar = (fb) tag;
                    }
                }
                fbVar = null;
            }
            icVar.p = fbVar;
            if (fbVar == null && p2Var != null) {
                icVar.p = new kh.t0(p2Var, 6);
            }
            o1.j jVar = icVar.d;
            if (jVar == null || !jVar.f) {
                fb fbVar2 = icVar.p;
                icVar.o = fbVar2 != null ? fbVar2.f(icVar.a) : 0;
            }
            fb fbVar3 = icVar.p;
            if (fbVar3 != null) {
                fbVar3.b(icVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !icVar.s) {
                if (nbVar != null && icVar.q == null) {
                    icVar.q = nbVar.createTransition();
                }
                nbVar.transitionRunningEnter = true;
                nbVar.delegate = icVar.p;
                nbVar.invalidate();
                mb mbVar = icVar.q;
                Objects.requireNonNull(nbVar);
                mbVar.J(nbVar, new wa(nbVar, 1), new fg(this, 15), new gl(2, this, z4));
                return;
            }
            fb fbVar4 = icVar.p;
            nbVar.delegate = fbVar4;
            if (fbVar4 != null && !z4) {
                fbVar4.c(nbVar.getHeight());
            }
            icVar.l();
            nbVar.onEnterTransitionStart();
            nbVar.onEnterTransitionEnd();
            if (icVar.u) {
                icVar.i(true);
            }
        }
    }
}
