package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ij0 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj0 b;

    public /* synthetic */ ij0(wj0 wj0Var, int i10) {
        this.a = i10;
        this.b = wj0Var;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                wj0 wj0Var = this.b;
                ArrayList arrayList = wj0Var.d;
                wj0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof uj0)) {
                    ((uj0) view).f(((nj0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof uj0) {
                    uj0 uj0Var = (uj0) view;
                    tj0 tj0Var = uj0Var.b;
                    uj0Var.J = false;
                    tj0Var.setAlpha(1.0f);
                    if (!this.b.J0) {
                        uj0Var.d();
                        break;
                    } else {
                        tj0Var.setScaleX(uj0Var.E * (uj0Var.w ? 0.76f : 1.0f));
                        tj0Var.setScaleY(uj0Var.E * (uj0Var.w ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
