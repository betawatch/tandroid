package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ai1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ib implements View.OnLayoutChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ pc b;

    public ib(pc pcVar, boolean z10) {
        this.b = pcVar;
        this.a = z10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        nb nbVar;
        pc pcVar = this.b;
        tb tbVar = pcVar.e;
        tbVar.removeOnLayoutChangeListener(this);
        if (pcVar.l) {
            tbVar.onShow();
            org.telegram.ui.ActionBar.n2 n2Var = pcVar.g;
            boolean z10 = this.a;
            if (z10 && (n2Var instanceof ai1)) {
                n2Var = ((ai1) n2Var).X();
            }
            FrameLayout frameLayout = pcVar.h;
            if (n2Var == null || (nbVar = n2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof nb) {
                        nbVar = (nb) tag;
                    }
                }
                nbVar = null;
            }
            pcVar.p = nbVar;
            if (nbVar == null && n2Var != null) {
                pcVar.p = new ai.w4(n2Var, 5);
            }
            o1.k kVar = pcVar.d;
            if (kVar == null || !kVar.f) {
                nb nbVar2 = pcVar.p;
                pcVar.o = nbVar2 != null ? nbVar2.f(pcVar.a) : 0;
            }
            nb nbVar3 = pcVar.p;
            if (nbVar3 != null) {
                nbVar3.b(pcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !pcVar.s) {
                if (tbVar != null && pcVar.q == null) {
                    pcVar.q = tbVar.createTransition();
                }
                tbVar.transitionRunningEnter = true;
                tbVar.delegate = pcVar.p;
                tbVar.invalidate();
                sb sbVar = pcVar.q;
                Objects.requireNonNull(tbVar);
                sbVar.U(tbVar, new eb(tbVar, 1), new og(this, 15), new ml(2, this, z10));
                return;
            }
            nb nbVar4 = pcVar.p;
            tbVar.delegate = nbVar4;
            if (nbVar4 != null && !z10) {
                nbVar4.c(tbVar.getHeight());
            }
            pcVar.l();
            tbVar.onEnterTransitionStart();
            tbVar.onEnterTransitionEnd();
            if (pcVar.u) {
                pcVar.i(true);
            }
        }
    }
}
