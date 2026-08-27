package lh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.ui.Components.n41;
import org.telegram.ui.c60;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d4 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d4(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                k4 k4Var = (k4) this.c;
                View view = (View) obj;
                f4 f4Var = k4Var.b;
                if (view instanceof j4) {
                    f4Var.getClass();
                    int R = RecyclerView.R(view);
                    n41 G = f4Var.U2.G(R);
                    if (G != null) {
                        j4 j4Var = (j4) view;
                        j4Var.setPosition(k4Var.b(R));
                        j4Var.b(this.b == G.d, true);
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            default:
                c60.e1((c60) this.c, this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
