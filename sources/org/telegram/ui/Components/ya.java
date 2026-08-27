package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.sg1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ya implements View.OnLayoutChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ec b;

    public ya(ec ecVar, boolean z10) {
        this.b = ecVar;
        this.a = z10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        db dbVar;
        ec ecVar = this.b;
        jb jbVar = ecVar.e;
        jbVar.removeOnLayoutChangeListener(this);
        if (ecVar.l) {
            jbVar.onShow();
            org.telegram.ui.ActionBar.n2 n2Var = ecVar.g;
            boolean z10 = this.a;
            if (z10 && (n2Var instanceof sg1)) {
                n2Var = ((sg1) n2Var).X();
            }
            FrameLayout frameLayout = ecVar.h;
            if (n2Var == null || (dbVar = n2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof db) {
                        dbVar = (db) tag;
                    }
                }
                dbVar = null;
            }
            ecVar.p = dbVar;
            if (dbVar == null && n2Var != null) {
                ecVar.p = new gh.w0(n2Var, 7);
            }
            o1.j jVar = ecVar.d;
            if (jVar == null || !jVar.f) {
                db dbVar2 = ecVar.p;
                ecVar.o = dbVar2 != null ? dbVar2.f(ecVar.a) : 0;
            }
            db dbVar3 = ecVar.p;
            if (dbVar3 != null) {
                dbVar3.b(ecVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !ecVar.s) {
                if (jbVar != null && ecVar.q == null) {
                    ecVar.q = jbVar.createTransition();
                }
                jbVar.transitionRunningEnter = true;
                jbVar.delegate = ecVar.p;
                jbVar.invalidate();
                ib ibVar = ecVar.q;
                Objects.requireNonNull(jbVar);
                ibVar.g(jbVar, new ua(jbVar, 1), new bg(this, 15), new zk(2, this, z10));
                return;
            }
            db dbVar4 = ecVar.p;
            jbVar.delegate = dbVar4;
            if (dbVar4 != null && !z10) {
                dbVar4.c(jbVar.getHeight());
            }
            ecVar.l();
            jbVar.onEnterTransitionStart();
            jbVar.onEnterTransitionEnd();
            if (ecVar.u) {
                ecVar.i(true);
            }
        }
    }
}
