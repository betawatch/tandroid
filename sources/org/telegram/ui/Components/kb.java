package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.th1;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class kb implements View.OnLayoutChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ rc b;

    public kb(rc rcVar, boolean z10) {
        this.b = rcVar;
        this.a = z10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        pb pbVar;
        rc rcVar = this.b;
        vb vbVar = rcVar.e;
        vbVar.removeOnLayoutChangeListener(this);
        if (rcVar.l) {
            vbVar.onShow();
            org.telegram.ui.ActionBar.n2 n2Var = rcVar.g;
            boolean z10 = this.a;
            if (z10 && (n2Var instanceof th1)) {
                n2Var = ((th1) n2Var).W();
            }
            FrameLayout frameLayout = rcVar.h;
            if (n2Var == null || (pbVar = n2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof pb) {
                        pbVar = (pb) tag;
                    }
                }
                pbVar = null;
            }
            rcVar.p = pbVar;
            if (pbVar == null && n2Var != null) {
                rcVar.p = new ai.w4(n2Var, 5);
            }
            o1.k kVar = rcVar.d;
            if (kVar == null || !kVar.f) {
                pb pbVar2 = rcVar.p;
                rcVar.o = pbVar2 != null ? pbVar2.f(rcVar.a) : 0;
            }
            pb pbVar3 = rcVar.p;
            if (pbVar3 != null) {
                pbVar3.b(rcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !rcVar.s) {
                if (vbVar != null && rcVar.q == null) {
                    rcVar.q = vbVar.createTransition();
                }
                vbVar.transitionRunningEnter = true;
                vbVar.delegate = rcVar.p;
                vbVar.invalidate();
                ub ubVar = rcVar.q;
                Objects.requireNonNull(vbVar);
                ubVar.L(vbVar, new gb(vbVar, 1), new qg(this, 15), new pl(2, this, z10));
                return;
            }
            pb pbVar4 = rcVar.p;
            vbVar.delegate = pbVar4;
            if (pbVar4 != null && !z10) {
                pbVar4.c(vbVar.getHeight());
            }
            rcVar.l();
            vbVar.onEnterTransitionStart();
            vbVar.onEnterTransitionEnd();
            if (rcVar.u) {
                rcVar.i(true);
            }
        }
    }
}
