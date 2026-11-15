package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.ui.mb1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ra implements View.OnLayoutChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ xb b;

    public ra(xb xbVar, boolean z10) {
        this.b = xbVar;
        this.a = z10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        wa waVar;
        xb xbVar = this.b;
        cb cbVar = xbVar.e;
        cbVar.removeOnLayoutChangeListener(this);
        if (xbVar.l) {
            cbVar.onShow();
            org.telegram.ui.ActionBar.e2 e2Var = xbVar.g;
            boolean z10 = this.a;
            if (z10 && (e2Var instanceof mb1)) {
                e2Var = ((mb1) e2Var).c0();
            }
            FrameLayout frameLayout = xbVar.h;
            if (e2Var == null || (waVar = e2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof wa) {
                        waVar = (wa) tag;
                    }
                }
                waVar = null;
            }
            xbVar.p = waVar;
            int i17 = 1;
            if (waVar == null && e2Var != null) {
                xbVar.p = new org.telegram.ui.ActionBar.y1(i17, e2Var);
            }
            r1.g gVar = xbVar.d;
            if (gVar == null || !gVar.f) {
                wa waVar2 = xbVar.p;
                xbVar.o = waVar2 != null ? waVar2.f(xbVar.a) : 0;
            }
            wa waVar3 = xbVar.p;
            if (waVar3 != null) {
                waVar3.b(xbVar);
            }
            if (org.telegram.messenger.np.e1().getBoolean("view_animations", true) && !xbVar.s) {
                if (cbVar != null && xbVar.q == null) {
                    xbVar.q = cbVar.createTransition();
                }
                cbVar.transitionRunningEnter = true;
                cbVar.delegate = xbVar.p;
                cbVar.invalidate();
                bb bbVar = xbVar.q;
                Objects.requireNonNull(cbVar);
                bbVar.y(cbVar, new na(cbVar, 1), new dg(this, 15), new il(2, this, z10));
                return;
            }
            wa waVar4 = xbVar.p;
            cbVar.delegate = waVar4;
            if (waVar4 != null && !z10) {
                waVar4.c(cbVar.getHeight());
            }
            xbVar.l();
            cbVar.onEnterTransitionStart();
            cbVar.onEnterTransitionEnd();
            if (xbVar.u) {
                xbVar.i(true);
            }
        }
    }
}
