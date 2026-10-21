package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ sr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                uv0 uv0Var = (uv0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = uv0Var.v1;
                if (!this.b) {
                    n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    ei.vb.D(n2Var.getParentActivity(), n2Var.getCurrentAccount()).Q(null);
                    break;
                } else {
                    uv0Var.Q0(n2Var, uv0Var.j1, this.c);
                    break;
                }
            default:
                ks0 ks0Var = (ks0) this.d;
                if (ks0Var.e.h() && ks0Var.h.getCurrentPosition() != 0) {
                    ks0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        ug.m1.f0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        yh.o1 o1Var = new yh.o1(ks0Var.getContext(), i10, ks0Var.c, null, null);
                        o1Var.W(BirthdayController.getInstance(i10).isToday(ks0Var.c));
                        o1Var.show();
                        break;
                    }
                }
        }
    }
}
