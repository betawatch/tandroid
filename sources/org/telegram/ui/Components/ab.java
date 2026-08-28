package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.tg1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ab implements View.OnLayoutChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ gc b;

    public ab(gc gcVar, boolean z10) {
        this.b = gcVar;
        this.a = z10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        fb fbVar;
        gc gcVar = this.b;
        lb lbVar = gcVar.e;
        lbVar.removeOnLayoutChangeListener(this);
        if (gcVar.l) {
            lbVar.onShow();
            org.telegram.ui.ActionBar.o2 o2Var = gcVar.g;
            boolean z10 = this.a;
            if (z10 && (o2Var instanceof tg1)) {
                o2Var = ((tg1) o2Var).W();
            }
            FrameLayout frameLayout = gcVar.h;
            if (o2Var == null || (fbVar = o2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof fb) {
                        fbVar = (fb) tag;
                    }
                }
                fbVar = null;
            }
            gcVar.p = fbVar;
            if (fbVar == null && o2Var != null) {
                gcVar.p = new fh.y0(o2Var, 7);
            }
            o1.j jVar = gcVar.d;
            if (jVar == null || !jVar.f) {
                fb fbVar2 = gcVar.p;
                gcVar.o = fbVar2 != null ? fbVar2.f(gcVar.a) : 0;
            }
            fb fbVar3 = gcVar.p;
            if (fbVar3 != null) {
                fbVar3.b(gcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !gcVar.s) {
                if (lbVar != null && gcVar.q == null) {
                    gcVar.q = lbVar.createTransition();
                }
                lbVar.transitionRunningEnter = true;
                lbVar.delegate = gcVar.p;
                lbVar.invalidate();
                kb kbVar = gcVar.q;
                Objects.requireNonNull(lbVar);
                kbVar.g(lbVar, new wa(lbVar, 1), new fg(this, 15), new dl(2, this, z10));
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
