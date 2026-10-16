package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ji1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class lb implements View.OnLayoutChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ sc b;

    public lb(sc scVar, boolean z10) {
        this.b = scVar;
        this.a = z10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        qb qbVar;
        sc scVar = this.b;
        wb wbVar = scVar.e;
        wbVar.removeOnLayoutChangeListener(this);
        if (scVar.l) {
            wbVar.onShow();
            org.telegram.ui.ActionBar.m2 m2Var = scVar.g;
            boolean z10 = this.a;
            if (z10 && (m2Var instanceof ji1)) {
                m2Var = ((ji1) m2Var).X();
            }
            FrameLayout frameLayout = scVar.h;
            if (m2Var == null || (qbVar = m2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof qb) {
                        qbVar = (qb) tag;
                    }
                }
                qbVar = null;
            }
            scVar.p = qbVar;
            if (qbVar == null && m2Var != null) {
                scVar.p = new ah.m0(m2Var, 6);
            }
            o1.k kVar = scVar.d;
            if (kVar == null || !kVar.f) {
                qb qbVar2 = scVar.p;
                scVar.o = qbVar2 != null ? qbVar2.f(scVar.a) : 0;
            }
            qb qbVar3 = scVar.p;
            if (qbVar3 != null) {
                qbVar3.b(scVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !scVar.s) {
                if (wbVar != null && scVar.q == null) {
                    scVar.q = wbVar.createTransition();
                }
                wbVar.transitionRunningEnter = true;
                wbVar.delegate = scVar.p;
                wbVar.invalidate();
                vb vbVar = scVar.q;
                Objects.requireNonNull(wbVar);
                vbVar.X(wbVar, new hb(wbVar, 1), new qg(this, 15), new zl(2, this, z10));
                return;
            }
            qb qbVar4 = scVar.p;
            wbVar.delegate = qbVar4;
            if (qbVar4 != null && !z10) {
                qbVar4.c(wbVar.getHeight());
            }
            scVar.l();
            wbVar.onEnterTransitionStart();
            wbVar.onEnterTransitionEnd();
            if (scVar.u) {
                scVar.i(true);
            }
        }
    }
}
