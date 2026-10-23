package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ vr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xv0 xv0Var = (xv0) this.d;
                org.telegram.ui.ActionBar.o2 o2Var = xv0Var.v1;
                if (!this.b) {
                    o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    ei.vb.D(o2Var.getParentActivity(), o2Var.getCurrentAccount()).Q(null);
                    break;
                } else {
                    xv0Var.R0(o2Var, xv0Var.j1, this.c);
                    break;
                }
            default:
                ns0 ns0Var = (ns0) this.d;
                if (ns0Var.e.h() && ns0Var.h.getCurrentPosition() != 0) {
                    ns0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        ug.l1.e0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        yh.o1 o1Var = new yh.o1(ns0Var.getContext(), i10, ns0Var.c, null, null);
                        o1Var.V(BirthdayController.getInstance(i10).isToday(ns0Var.c));
                        o1Var.show();
                        break;
                    }
                }
        }
    }
}
