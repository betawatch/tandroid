package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class sj0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ gk0 b;

    public /* synthetic */ sj0(gk0 gk0Var, int i10) {
        this.a = i10;
        this.b = gk0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                gk0 gk0Var = this.b;
                ArrayList arrayList = gk0Var.d;
                gk0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof ek0)) {
                    ((ek0) view).f(((xj0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof ek0) {
                    ek0 ek0Var = (ek0) view;
                    dk0 dk0Var = ek0Var.b;
                    ek0Var.N = false;
                    dk0Var.setAlpha(1.0f);
                    if (!this.b.N0) {
                        ek0Var.d();
                        break;
                    } else {
                        dk0Var.setScaleX(ek0Var.I * (ek0Var.w ? 0.76f : 1.0f));
                        dk0Var.setScaleY(ek0Var.I * (ek0Var.w ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
