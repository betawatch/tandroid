package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.th1;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
        if (qcVar.l) {
            ubVar.onShow();
            org.telegram.ui.ActionBar.m2 m2Var = qcVar.g;
            boolean z10 = this.a;
            if (z10 && (m2Var instanceof th1)) {
                m2Var = ((th1) m2Var).X();
            }
            FrameLayout frameLayout = qcVar.h;
            if (m2Var == null || (obVar = m2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof ob) {
                        obVar = (ob) tag;
                    }
                }
                obVar = null;
            }
            qcVar.p = obVar;
            if (obVar == null && m2Var != null) {
                qcVar.p = new ai.w4(m2Var, 5);
            }
            o1.k kVar = qcVar.d;
            if (kVar == null || !kVar.f) {
                ob obVar2 = qcVar.p;
                qcVar.o = obVar2 != null ? obVar2.f(qcVar.a) : 0;
            }
            ob obVar3 = qcVar.p;
            if (obVar3 != null) {
                obVar3.b(qcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !qcVar.s) {
                if (ubVar != null && qcVar.q == null) {
                    qcVar.q = ubVar.createTransition();
                }
                ubVar.transitionRunningEnter = true;
                ubVar.delegate = qcVar.p;
                ubVar.invalidate();
                tb tbVar = qcVar.q;
                Objects.requireNonNull(ubVar);
                tbVar.U(ubVar, new fb(ubVar, 1), new pg(this, 15), new nl(2, this, z10));
                return;
            }
            ob obVar4 = qcVar.p;
            ubVar.delegate = obVar4;
            if (obVar4 != null && !z10) {
                obVar4.c(ubVar.getHeight());
            }
            qcVar.l();
            ubVar.onEnterTransitionStart();
            ubVar.onEnterTransitionEnd();
            if (qcVar.u) {
                qcVar.i(true);
            }
        }
    }
}
