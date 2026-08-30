package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ak0 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ pk0 b;

    public /* synthetic */ ak0(pk0 pk0Var, int i10) {
        this.a = i10;
        this.b = pk0Var;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                pk0 pk0Var = this.b;
                ArrayList arrayList = pk0Var.d;
                pk0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof nk0)) {
                    ((nk0) view).f(((gk0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof nk0) {
                    nk0 nk0Var = (nk0) view;
                    mk0 mk0Var = nk0Var.b;
                    nk0Var.K = false;
                    mk0Var.setAlpha(1.0f);
                    if (!this.b.K0) {
                        nk0Var.d();
                        break;
                    } else {
                        mk0Var.setScaleX(nk0Var.F * (nk0Var.w ? 0.76f : 1.0f));
                        mk0Var.setScaleY(nk0Var.F * (nk0Var.w ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
