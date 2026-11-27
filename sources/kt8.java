// default package

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kt8 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ kt8(FrameLayout frameLayout, boolean z, int i, byte b) {
        this.a = b;
        this.d = frameLayout;
        this.b = z;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        boolean z = this.b;
        FrameLayout frameLayout = this.d;
        switch (b) {
            case 0:
                cga cgaVar = (cga) frameLayout;
                if (cgaVar.e.h() && cgaVar.h.getCurrentPosition() != 0) {
                    cgaVar.a();
                    break;
                } else {
                    int i = this.c;
                    if (!z) {
                        bx4.g1(false, pj0.a(i).b());
                        break;
                    } else {
                        yx4 yx4Var = new yx4(cgaVar.getContext(), i, cgaVar.c, null, null);
                        yx4Var.b1(pj0.a(i).c(cgaVar.c));
                        yx4Var.show();
                        break;
                    }
                }
                break;
            default:
                eja ejaVar = (eja) frameLayout;
                e eVar = ejaVar.y1;
                if (!z) {
                    eVar.getMessagesController().X3.edit().putBoolean("story_keep", true).apply();
                    rbb.C(eVar.getParentActivity(), eVar.getCurrentAccount()).Q(null);
                    break;
                } else {
                    ejaVar.U0(this.c, ejaVar.m1, eVar);
                    break;
                }
        }
    }
}
