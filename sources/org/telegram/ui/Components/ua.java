package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.ui.gb1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ua implements View.OnLayoutChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ac b;

    public ua(ac acVar, boolean z10) {
        this.b = acVar;
        this.a = z10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        za zaVar;
        ac acVar = this.b;
        fb fbVar = acVar.e;
        fbVar.removeOnLayoutChangeListener(this);
        if (acVar.l) {
            fbVar.onShow();
            org.telegram.ui.ActionBar.d2 d2Var = acVar.g;
            boolean z10 = this.a;
            if (z10 && (d2Var instanceof gb1)) {
                d2Var = ((gb1) d2Var).c0();
            }
            FrameLayout frameLayout = acVar.h;
            if (d2Var == null || (zaVar = d2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof za) {
                        zaVar = (za) tag;
                    }
                }
                zaVar = null;
            }
            acVar.p = zaVar;
            int i17 = 1;
            if (zaVar == null && d2Var != null) {
                acVar.p = new org.telegram.ui.ActionBar.x1(i17, d2Var);
            }
            q1.g gVar = acVar.d;
            if (gVar == null || !gVar.f) {
                za zaVar2 = acVar.p;
                acVar.o = zaVar2 != null ? zaVar2.f(acVar.a) : 0;
            }
            za zaVar3 = acVar.p;
            if (zaVar3 != null) {
                zaVar3.b(acVar);
            }
            if (org.telegram.messenger.hp.e1().getBoolean("view_animations", true) && !acVar.s) {
                if (fbVar != null && acVar.q == null) {
                    acVar.q = fbVar.createTransition();
                }
                fbVar.transitionRunningEnter = true;
                fbVar.delegate = acVar.p;
                fbVar.invalidate();
                eb ebVar = acVar.q;
                Objects.requireNonNull(fbVar);
                ebVar.G(fbVar, new qa(fbVar, 1), new vf(this, 15), new zk(2, this, z10));
                return;
            }
            za zaVar4 = acVar.p;
            fbVar.delegate = zaVar4;
            if (zaVar4 != null && !z10) {
                zaVar4.c(fbVar.getHeight());
            }
            acVar.l();
            fbVar.onEnterTransitionStart();
            fbVar.onEnterTransitionEnd();
            if (acVar.u) {
                acVar.i(true);
            }
        }
    }
}
