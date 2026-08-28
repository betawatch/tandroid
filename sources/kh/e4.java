package kh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.ui.Components.l41;
import org.telegram.ui.y50;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e4 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e4(Object obj, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                m4 m4Var = (m4) this.c;
                View view = (View) obj;
                h4 h4Var = m4Var.b;
                if (view instanceof l4) {
                    h4Var.getClass();
                    int R = RecyclerView.R(view);
                    l41 G = h4Var.U2.G(R);
                    if (G != null) {
                        l4 l4Var = (l4) view;
                        l4Var.setPosition(m4Var.b(R));
                        l4Var.b(this.b == G.d, true);
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            default:
                y50.e1((y50) this.c, this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
