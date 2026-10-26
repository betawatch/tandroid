package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ bs0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                aw0 aw0Var = (aw0) this.d;
                org.telegram.ui.ActionBar.r2 r2Var = aw0Var.x1;
                if (!this.b) {
                    r2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    fi.sb.D(r2Var.getParentActivity(), r2Var.getCurrentAccount()).Q(null);
                    break;
                } else {
                    aw0Var.U0(r2Var, aw0Var.l1, this.c);
                    break;
                }
            default:
                vs0 vs0Var = (vs0) this.d;
                if (vs0Var.e.h() && vs0Var.h.getCurrentPosition() != 0) {
                    vs0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        vg.n1.e0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        zh.p1 p1Var = new zh.p1(vs0Var.getContext(), i10, vs0Var.c, null, null);
                        p1Var.V(BirthdayController.getInstance(i10).isToday(vs0Var.c));
                        p1Var.show();
                        break;
                    }
                }
        }
    }
}
