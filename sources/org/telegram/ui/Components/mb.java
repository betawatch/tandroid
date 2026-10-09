package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ci1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class mb implements View.OnLayoutChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ tc b;

    public mb(tc tcVar, boolean z10) {
        this.b = tcVar;
        this.a = z10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        rb rbVar;
        tc tcVar = this.b;
        xb xbVar = tcVar.e;
        xbVar.removeOnLayoutChangeListener(this);
        if (tcVar.l) {
            xbVar.onShow();
            org.telegram.ui.ActionBar.n2 n2Var = tcVar.g;
            boolean z10 = this.a;
            if (z10 && (n2Var instanceof ci1)) {
                n2Var = ((ci1) n2Var).X();
            }
            FrameLayout frameLayout = tcVar.h;
            if (n2Var == null || (rbVar = n2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof rb) {
                        rbVar = (rb) tag;
                    }
                }
                rbVar = null;
            }
            tcVar.p = rbVar;
            if (rbVar == null && n2Var != null) {
                tcVar.p = new ai.x4(n2Var, 5);
            }
            o1.k kVar = tcVar.d;
            if (kVar == null || !kVar.f) {
                rb rbVar2 = tcVar.p;
                tcVar.o = rbVar2 != null ? rbVar2.f(tcVar.a) : 0;
            }
            rb rbVar3 = tcVar.p;
            if (rbVar3 != null) {
                rbVar3.b(tcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !tcVar.s) {
                if (xbVar != null && tcVar.q == null) {
                    tcVar.q = xbVar.createTransition();
                }
                xbVar.transitionRunningEnter = true;
                xbVar.delegate = tcVar.p;
                xbVar.invalidate();
                wb wbVar = tcVar.q;
                Objects.requireNonNull(xbVar);
                wbVar.z(xbVar, new ib(xbVar, 1), new rg(this, 15), new dm(2, this, z10));
                return;
            }
            rb rbVar4 = tcVar.p;
            xbVar.delegate = rbVar4;
            if (rbVar4 != null && !z10) {
                rbVar4.c(xbVar.getHeight());
            }
            tcVar.l();
            xbVar.onEnterTransitionStart();
            xbVar.onEnterTransitionEnd();
            if (tcVar.u) {
                tcVar.i(true);
            }
        }
    }
}
