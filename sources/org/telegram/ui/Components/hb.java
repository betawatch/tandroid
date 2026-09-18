package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ai1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hb implements View.OnLayoutChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ oc b;

    public hb(oc ocVar, boolean z10) {
        this.b = ocVar;
        this.a = z10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        mb mbVar;
        oc ocVar = this.b;
        sb sbVar = ocVar.e;
        sbVar.removeOnLayoutChangeListener(this);
        if (ocVar.l) {
            sbVar.onShow();
            org.telegram.ui.ActionBar.o2 o2Var = ocVar.g;
            boolean z10 = this.a;
            if (z10 && (o2Var instanceof ai1)) {
                o2Var = ((ai1) o2Var).X();
            }
            FrameLayout frameLayout = ocVar.h;
            if (o2Var == null || (mbVar = o2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof mb) {
                        mbVar = (mb) tag;
                    }
                }
                mbVar = null;
            }
            ocVar.p = mbVar;
            if (mbVar == null && o2Var != null) {
                ocVar.p = new ai.w4(o2Var, 5);
            }
            o1.k kVar = ocVar.d;
            if (kVar == null || !kVar.f) {
                mb mbVar2 = ocVar.p;
                ocVar.o = mbVar2 != null ? mbVar2.f(ocVar.a) : 0;
            }
            mb mbVar3 = ocVar.p;
            if (mbVar3 != null) {
                mbVar3.b(ocVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !ocVar.s) {
                if (sbVar != null && ocVar.q == null) {
                    ocVar.q = sbVar.createTransition();
                }
                sbVar.transitionRunningEnter = true;
                sbVar.delegate = ocVar.p;
                sbVar.invalidate();
                rb rbVar = ocVar.q;
                Objects.requireNonNull(sbVar);
                rbVar.U(sbVar, new db(sbVar, 1), new ng(this, 15), new ml(2, this, z10));
                return;
            }
            mb mbVar4 = ocVar.p;
            sbVar.delegate = mbVar4;
            if (mbVar4 != null && !z10) {
                mbVar4.c(sbVar.getHeight());
            }
            ocVar.l();
            sbVar.onEnterTransitionStart();
            sbVar.onEnterTransitionEnd();
            if (ocVar.u) {
                ocVar.i(true);
            }
        }
    }
}
