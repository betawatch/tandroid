package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.ui.rb1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ua implements View.OnLayoutChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ bc b;

    public ua(bc bcVar, boolean z9) {
        this.b = bcVar;
        this.a = z9;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        za zaVar;
        bc bcVar = this.b;
        fb fbVar = bcVar.e;
        fbVar.removeOnLayoutChangeListener(this);
        if (bcVar.l) {
            fbVar.onShow();
            org.telegram.ui.ActionBar.f2 f2Var = bcVar.g;
            boolean z9 = this.a;
            if (z9 && (f2Var instanceof rb1)) {
                f2Var = ((rb1) f2Var).c0();
            }
            FrameLayout frameLayout = bcVar.h;
            if (f2Var == null || (zaVar = f2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof za) {
                        zaVar = (za) tag;
                    }
                }
                zaVar = null;
            }
            bcVar.p = zaVar;
            int i17 = 1;
            if (zaVar == null && f2Var != null) {
                bcVar.p = new org.telegram.ui.ActionBar.z1(i17, f2Var);
            }
            r1.g gVar = bcVar.d;
            if (gVar == null || !gVar.f) {
                za zaVar2 = bcVar.p;
                bcVar.o = zaVar2 != null ? zaVar2.f(bcVar.a) : 0;
            }
            za zaVar3 = bcVar.p;
            if (zaVar3 != null) {
                zaVar3.b(bcVar);
            }
            if (org.telegram.messenger.qp.e1().getBoolean("view_animations", true) && !bcVar.s) {
                if (fbVar != null && bcVar.q == null) {
                    bcVar.q = fbVar.createTransition();
                }
                fbVar.transitionRunningEnter = true;
                fbVar.delegate = bcVar.p;
                fbVar.invalidate();
                eb ebVar = bcVar.q;
                Objects.requireNonNull(fbVar);
                ebVar.B(fbVar, new qa(fbVar, 1), new wf(this, 15), new al(2, this, z9));
                return;
            }
            za zaVar4 = bcVar.p;
            fbVar.delegate = zaVar4;
            if (zaVar4 != null && !z9) {
                zaVar4.c(fbVar.getHeight());
            }
            bcVar.l();
            fbVar.onEnterTransitionStart();
            fbVar.onEnterTransitionEnd();
            if (bcVar.u) {
                bcVar.i(true);
            }
        }
    }
}
