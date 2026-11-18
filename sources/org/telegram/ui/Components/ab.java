package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.ui.qb1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ab implements View.OnLayoutChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ gc b;

    public ab(gc gcVar, boolean z10) {
        this.b = gcVar;
        this.a = z10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        fb fbVar;
        gc gcVar = this.b;
        lb lbVar = gcVar.e;
        lbVar.removeOnLayoutChangeListener(this);
        if (gcVar.l) {
            lbVar.onShow();
            org.telegram.ui.ActionBar.h2 h2Var = gcVar.g;
            boolean z10 = this.a;
            if (z10 && (h2Var instanceof qb1)) {
                h2Var = ((qb1) h2Var).c0();
            }
            FrameLayout frameLayout = gcVar.h;
            if (h2Var == null || (fbVar = h2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof fb) {
                        fbVar = (fb) tag;
                    }
                }
                fbVar = null;
            }
            gcVar.p = fbVar;
            int i17 = 1;
            if (fbVar == null && h2Var != null) {
                gcVar.p = new org.telegram.ui.ActionBar.b2(i17, h2Var);
            }
            r1.g gVar = gcVar.d;
            if (gVar == null || !gVar.f) {
                fb fbVar2 = gcVar.p;
                gcVar.o = fbVar2 != null ? fbVar2.f(gcVar.a) : 0;
            }
            fb fbVar3 = gcVar.p;
            if (fbVar3 != null) {
                fbVar3.b(gcVar);
            }
            if (h2Var != null) {
                h2Var.setupBulletinGlass(gcVar);
            }
            if (org.telegram.messenger.mp.g1().getBoolean("view_animations", true) && !gcVar.s) {
                if (lbVar != null && gcVar.q == null) {
                    gcVar.q = lbVar.createTransition();
                }
                lbVar.transitionRunningEnter = true;
                lbVar.delegate = gcVar.p;
                lbVar.invalidate();
                kb kbVar = gcVar.q;
                Objects.requireNonNull(lbVar);
                kbVar.u(lbVar, new wa(lbVar, 1), new lg(this, 15), new pl(2, this, z10));
                return;
            }
            fb fbVar4 = gcVar.p;
            lbVar.delegate = fbVar4;
            if (fbVar4 != null && !z10) {
                fbVar4.c(lbVar.getHeight());
            }
            gcVar.l();
            lbVar.onEnterTransitionStart();
            lbVar.onEnterTransitionEnd();
            if (gcVar.u) {
                gcVar.i(true);
            }
        }
    }
}
