package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.wg1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jb implements View.OnLayoutChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ qc b;

    public jb(qc qcVar, boolean z10) {
        this.b = qcVar;
        this.a = z10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        ob obVar;
        qc qcVar = this.b;
        ub ubVar = qcVar.e;
        ubVar.removeOnLayoutChangeListener(this);
        if (qcVar.m) {
            ubVar.onShow();
            org.telegram.ui.ActionBar.r2 r2Var = qcVar.g;
            boolean z10 = this.a;
            if (z10 && (r2Var instanceof wg1)) {
                r2Var = ((wg1) r2Var).X();
            }
            FrameLayout frameLayout = qcVar.h;
            if (r2Var == null || (obVar = r2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof ob) {
                        obVar = (ob) tag;
                    }
                }
                obVar = null;
            }
            qcVar.q = obVar;
            if (obVar == null && r2Var != null) {
                qcVar.q = new bh.c0(r2Var, 6);
            }
            o1.j jVar = qcVar.d;
            if (jVar == null || !jVar.f) {
                ob obVar2 = qcVar.q;
                qcVar.p = obVar2 != null ? obVar2.f(qcVar.a) : 0;
            }
            ob obVar3 = qcVar.q;
            if (obVar3 != null) {
                obVar3.b(qcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !qcVar.t) {
                if (ubVar != null && qcVar.r == null) {
                    qcVar.r = ubVar.createTransition();
                }
                ubVar.transitionRunningEnter = true;
                ubVar.delegate = qcVar.q;
                ubVar.invalidate();
                tb tbVar = qcVar.r;
                Objects.requireNonNull(ubVar);
                tbVar.Q0(ubVar, new fb(ubVar, 1), new pg(this, 16), new yl(2, this, z10));
                return;
            }
            ob obVar4 = qcVar.q;
            ubVar.delegate = obVar4;
            if (obVar4 != null && !z10) {
                obVar4.c(ubVar.getHeight());
            }
            qcVar.l();
            ubVar.onEnterTransitionStart();
            ubVar.onEnterTransitionEnd();
            if (qcVar.v) {
                qcVar.i(true);
            }
        }
    }
}
