package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.bi1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
            org.telegram.ui.ActionBar.n2 n2Var = qcVar.g;
            boolean z10 = this.a;
            if (z10 && (n2Var instanceof bi1)) {
                n2Var = ((bi1) n2Var).X();
            }
            FrameLayout frameLayout = qcVar.h;
            if (n2Var == null || (obVar = n2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof ob) {
                        obVar = (ob) tag;
                    }
                }
                obVar = null;
            }
            qcVar.p = obVar;
            if (obVar == null && n2Var != null) {
                qcVar.p = new ah.n0(n2Var, 6);
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
                tbVar.h0(ubVar, new fb(ubVar, 1), new pg(this, 15), new ml(2, this, z10));
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
