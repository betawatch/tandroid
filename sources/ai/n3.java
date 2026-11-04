package ai;

import android.view.View;
import android.widget.FrameLayout;
import gi.va;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.ws0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ n3(FrameLayout frameLayout, boolean z10, int i3, int i10) {
        this.a = i10;
        this.d = frameLayout;
        this.b = z10;
        this.c = i3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                vp0 vp0Var = (vp0) this.d;
                if (vp0Var.e.h() && vp0Var.h.getCurrentPosition() != 0) {
                    vp0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i3 = this.c;
                    if (!z10) {
                        xg.e1.l1(2, org.telegram.messenger.v1.a(i3).b());
                        break;
                    } else {
                        b3 b3Var = new b3(vp0Var.getContext(), i3, vp0Var.c, null, null);
                        b3Var.e1(org.telegram.messenger.v1.a(i3).c(vp0Var.c));
                        b3Var.show();
                        break;
                    }
                }
                break;
            default:
                ws0 ws0Var = (ws0) this.d;
                org.telegram.ui.ActionBar.d2 d2Var = ws0Var.y1;
                if (!this.b) {
                    d2Var.getMessagesController().e7.edit().putBoolean("story_keep", true).apply();
                    va.D(d2Var.getParentActivity(), d2Var.getCurrentAccount()).Q(null);
                    break;
                } else {
                    ws0Var.Y0(d2Var, ws0Var.m1, this.c);
                    break;
                }
        }
    }
}
