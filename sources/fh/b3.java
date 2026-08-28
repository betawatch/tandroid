package fh;

import android.view.View;
import android.widget.FrameLayout;
import kh.wb;
import org.telegram.messenger.BirthdayController;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.vq0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ b3(FrameLayout frameLayout, boolean z10, int i9, int i10) {
        this.a = i10;
        this.d = frameLayout;
        this.b = z10;
        this.c = i9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                vq0 vq0Var = (vq0) this.d;
                if (vq0Var.e.h() && vq0Var.h.getCurrentPosition() != 0) {
                    vq0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i9 = this.c;
                    if (!z10) {
                        bg.g3.d0(2, BirthdayController.getInstance(i9).getState());
                        break;
                    } else {
                        p2 p2Var = new p2(vq0Var.getContext(), i9, vq0Var.c, null, null);
                        p2Var.U(BirthdayController.getInstance(i9).isToday(vq0Var.c));
                        p2Var.show();
                        break;
                    }
                }
                break;
            default:
                eu0 eu0Var = (eu0) this.d;
                org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
                if (!this.b) {
                    o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    wb.E(o2Var.getParentActivity(), o2Var.getCurrentAccount()).R(null);
                    break;
                } else {
                    eu0Var.O0(o2Var, eu0Var.f1, this.c);
                    break;
                }
        }
    }
}
