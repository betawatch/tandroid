package nh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.ui.Components.w41;
import org.telegram.ui.a60;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements f5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z3(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // f5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.c;
                View view = (View) obj;
                b4 b4Var = g4Var.b;
                if (view instanceof f4) {
                    b4Var.getClass();
                    int R = RecyclerView.R(view);
                    w41 G = b4Var.U2.G(R);
                    if (G != null) {
                        f4 f4Var = (f4) view;
                        f4Var.setPosition(g4Var.b(R));
                        f4Var.b(this.b == G.d, true);
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            default:
                a60.e1((a60) this.c, this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
