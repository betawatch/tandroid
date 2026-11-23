package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ob1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class za implements View.OnLayoutChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ fc b;

    public za(fc fcVar, boolean z10) {
        this.b = fcVar;
        this.a = z10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        eb ebVar;
        fc fcVar = this.b;
        kb kbVar = fcVar.e;
        kbVar.removeOnLayoutChangeListener(this);
        if (fcVar.l) {
            kbVar.onShow();
            org.telegram.ui.ActionBar.g2 g2Var = fcVar.g;
            boolean z10 = this.a;
            if (z10 && (g2Var instanceof ob1)) {
                g2Var = ((ob1) g2Var).c0();
            }
            FrameLayout frameLayout = fcVar.h;
            if (g2Var == null || (ebVar = g2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof eb) {
                        ebVar = (eb) tag;
                    }
                }
                ebVar = null;
            }
            fcVar.p = ebVar;
            int i17 = 1;
            if (ebVar == null && g2Var != null) {
                fcVar.p = new org.telegram.ui.ActionBar.a2(i17, g2Var);
            }
            r1.g gVar = fcVar.d;
            if (gVar == null || !gVar.f) {
                eb ebVar2 = fcVar.p;
                fcVar.o = ebVar2 != null ? ebVar2.f(fcVar.a) : 0;
            }
            eb ebVar3 = fcVar.p;
            if (ebVar3 != null) {
                ebVar3.b(fcVar);
            }
            if (g2Var != null) {
                g2Var.setupBulletinGlass(fcVar);
            }
            if (org.telegram.messenger.mp.g1().getBoolean("view_animations", true) && !fcVar.s) {
                if (kbVar != null && fcVar.q == null) {
                    fcVar.q = kbVar.createTransition();
                }
                kbVar.transitionRunningEnter = true;
                kbVar.delegate = fcVar.p;
                kbVar.invalidate();
                jb jbVar = fcVar.q;
                Objects.requireNonNull(kbVar);
                jbVar.H(kbVar, new va(kbVar, 1), new ng(this, 15), new pl(2, this, z10));
                return;
            }
            eb ebVar4 = fcVar.p;
            kbVar.delegate = ebVar4;
            if (ebVar4 != null && !z10) {
                ebVar4.c(kbVar.getHeight());
            }
            fcVar.l();
            kbVar.onEnterTransitionStart();
            kbVar.onEnterTransitionEnd();
            if (fcVar.u) {
                fcVar.i(true);
            }
        }
    }
}
