package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ yo0(FrameLayout frameLayout, boolean z9, int i7, int i10) {
        this.a = i10;
        this.d = frameLayout;
        this.b = z9;
        this.c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xs0 xs0Var = (xs0) this.d;
                org.telegram.ui.ActionBar.f2 f2Var = xs0Var.x1;
                if (!this.b) {
                    f2Var.getMessagesController().e7.edit().putBoolean("story_keep", true).apply();
                    fi.va.D(f2Var.getParentActivity(), f2Var.getCurrentAccount()).Q(null);
                    break;
                } else {
                    xs0Var.Y0(f2Var, xs0Var.l1, this.c);
                    break;
                }
            default:
                up0 up0Var = (up0) this.d;
                if (up0Var.e.h() && up0Var.h.getCurrentPosition() != 0) {
                    up0Var.a();
                    break;
                } else {
                    boolean z9 = this.b;
                    int i7 = this.c;
                    if (!z9) {
                        wg.f1.l1(2, org.telegram.messenger.v1.a(i7).b());
                        break;
                    } else {
                        zh.h1 h1Var = new zh.h1(up0Var.getContext(), i7, up0Var.c, null, null);
                        h1Var.e1(org.telegram.messenger.v1.a(i7).c(up0Var.c));
                        h1Var.show();
                        break;
                    }
                }
        }
    }
}
