package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cs0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ cs0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                bw0 bw0Var = (bw0) this.d;
                org.telegram.ui.ActionBar.r2 r2Var = bw0Var.x1;
                if (!this.b) {
                    r2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    fi.sb.D(r2Var.getParentActivity(), r2Var.getCurrentAccount()).Q(null);
                    break;
                } else {
                    bw0Var.U0(r2Var, bw0Var.l1, this.c);
                    break;
                }
            default:
                ws0 ws0Var = (ws0) this.d;
                if (ws0Var.e.h() && ws0Var.h.getCurrentPosition() != 0) {
                    ws0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        vg.n1.e0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        zh.p1 p1Var = new zh.p1(ws0Var.getContext(), i10, ws0Var.c, null, null);
                        p1Var.V(BirthdayController.getInstance(i10).isToday(ws0Var.c));
                        p1Var.show();
                        break;
                    }
                }
        }
    }
}
