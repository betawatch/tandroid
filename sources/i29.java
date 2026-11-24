// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i29 extends e69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v29 b;

    public /* synthetic */ i29(v29 v29Var, byte b) {
        this.a = b;
        this.b = v29Var;
    }

    @Override // e69
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        byte b = this.a;
        v29 v29Var = this.b;
        switch (b) {
            case 0:
                super.d(rect, view, recyclerView, r69Var);
                if (!v29Var.n()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = gm.L(6.0f);
                    }
                    rect.right = gm.L(4.0f);
                    if (R == v29Var.b0.b() - 1) {
                        if ((!v29Var.V.isEmpty() && !oc7.r1(v29Var.K).H3()) || v29Var.n()) {
                            rect.right = gm.L(2.0f);
                            break;
                        } else {
                            rect.right = gm.L(6.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = 0;
                    rect.right = 0;
                    break;
                }
                break;
            default:
                int R2 = RecyclerView.R(view);
                if (R2 == 0) {
                    rect.left = gm.L(8.0f);
                }
                if (R2 == v29Var.b0.b() - 1) {
                    rect.right = gm.L(8.0f);
                    break;
                }
                break;
        }
    }
}
