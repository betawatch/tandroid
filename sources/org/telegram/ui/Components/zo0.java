package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class zo0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ zo0(FrameLayout frameLayout, boolean z9, int i7, int i10) {
        this.a = i10;
        this.d = frameLayout;
        this.b = z9;
        this.c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zs0 zs0Var = (zs0) this.d;
                org.telegram.ui.ActionBar.f2 f2Var = zs0Var.x1;
                if (!this.b) {
                    f2Var.getMessagesController().e7.edit().putBoolean("story_keep", true).apply();
                    fi.va.D(f2Var.getParentActivity(), f2Var.getCurrentAccount()).Q(null);
                    break;
                } else {
                    zs0Var.a1(f2Var, zs0Var.l1, this.c);
                    break;
                }
            default:
                vp0 vp0Var = (vp0) this.d;
                if (vp0Var.e.h() && vp0Var.h.getCurrentPosition() != 0) {
                    vp0Var.a();
                    break;
                } else {
                    boolean z9 = this.b;
                    int i7 = this.c;
                    if (!z9) {
                        wg.f1.l1(2, org.telegram.messenger.v1.a(i7).b());
                        break;
                    } else {
                        zh.g1 g1Var = new zh.g1(vp0Var.getContext(), i7, vp0Var.c, null, null);
                        g1Var.e1(org.telegram.messenger.v1.a(i7).c(vp0Var.c));
                        g1Var.show();
                        break;
                    }
                }
        }
    }
}
