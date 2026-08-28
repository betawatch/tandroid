package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gj0 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ uj0 b;

    public /* synthetic */ gj0(uj0 uj0Var, int i9) {
        this.a = i9;
        this.b = uj0Var;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                uj0 uj0Var = this.b;
                ArrayList arrayList = uj0Var.d;
                uj0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof sj0)) {
                    ((sj0) view).f(((lj0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof sj0) {
                    sj0 sj0Var = (sj0) view;
                    rj0 rj0Var = sj0Var.b;
                    sj0Var.J = false;
                    rj0Var.setAlpha(1.0f);
                    if (!this.b.J0) {
                        sj0Var.d();
                        break;
                    } else {
                        rj0Var.setScaleX(sj0Var.E * (sj0Var.w ? 0.76f : 1.0f));
                        rj0Var.setScaleY(sj0Var.E * (sj0Var.w ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
