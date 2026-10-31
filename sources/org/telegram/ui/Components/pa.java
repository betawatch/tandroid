package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.ui.jd1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pa implements View.OnLayoutChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ wb b;

    public pa(wb wbVar, boolean z10) {
        this.b = wbVar;
        this.a = z10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        ua uaVar;
        wb wbVar = this.b;
        bb bbVar = wbVar.e;
        bbVar.removeOnLayoutChangeListener(this);
        if (wbVar.l) {
            bbVar.onShow();
            org.telegram.ui.ActionBar.k2 k2Var = wbVar.g;
            boolean z10 = this.a;
            if (z10 && (k2Var instanceof jd1)) {
                k2Var = ((jd1) k2Var).b0();
            }
            FrameLayout frameLayout = wbVar.h;
            if (k2Var == null || (uaVar = k2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof ua) {
                        uaVar = (ua) tag;
                    }
                }
                uaVar = null;
            }
            wbVar.p = uaVar;
            int i18 = 1;
            if (uaVar == null && k2Var != null) {
                wbVar.p = new org.telegram.ui.ActionBar.e2(i18, k2Var);
            }
            o1.j jVar = wbVar.d;
            if (jVar == null || !jVar.f) {
                ua uaVar2 = wbVar.p;
                wbVar.o = uaVar2 != null ? uaVar2.f(wbVar.a) : 0;
            }
            ua uaVar3 = wbVar.p;
            if (uaVar3 != null) {
                uaVar3.b(wbVar);
            }
            if (org.telegram.messenger.vp.d1().getBoolean("view_animations", true) && !wbVar.s) {
                if (bbVar != null && wbVar.q == null) {
                    wbVar.q = bbVar.createTransition();
                }
                bbVar.transitionRunningEnter = true;
                bbVar.delegate = wbVar.p;
                bbVar.invalidate();
                ab abVar = wbVar.q;
                Objects.requireNonNull(bbVar);
                abVar.p0(bbVar, new la(bbVar, 1), new tf(this, 16), new gl(2, this, z10));
                return;
            }
            ua uaVar4 = wbVar.p;
            bbVar.delegate = uaVar4;
            if (uaVar4 != null && !z10) {
                uaVar4.c(bbVar.getHeight());
            }
            wbVar.l();
            bbVar.onEnterTransitionStart();
            bbVar.onEnterTransitionEnd();
            if (wbVar.u) {
                wbVar.i(true);
            }
        }
    }
}
