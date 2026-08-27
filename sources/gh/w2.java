package gh;

import android.view.View;
import android.widget.FrameLayout;
import lh.sb;
import org.telegram.messenger.BirthdayController;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.wq0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class w2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ w2(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wq0 wq0Var = (wq0) this.d;
                if (wq0Var.e.h() && wq0Var.h.getCurrentPosition() != 0) {
                    wq0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        cg.y2.e0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        k2 k2Var = new k2(wq0Var.getContext(), i10, wq0Var.c, null, null);
                        k2Var.V(BirthdayController.getInstance(i10).isToday(wq0Var.c));
                        k2Var.show();
                        break;
                    }
                }
                break;
            default:
                hu0 hu0Var = (hu0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = hu0Var.r1;
                if (!this.b) {
                    n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    sb.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                    break;
                } else {
                    hu0Var.O0(n2Var, hu0Var.f1, this.c);
                    break;
                }
        }
    }
}
