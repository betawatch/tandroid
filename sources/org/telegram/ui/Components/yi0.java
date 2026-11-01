package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yi0 implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nj0 b;

    public /* synthetic */ yi0(nj0 nj0Var, int i10) {
        this.a = i10;
        this.b = nj0Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                nj0 nj0Var = this.b;
                ArrayList arrayList = nj0Var.d;
                nj0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof lj0)) {
                    ((lj0) view).f(((ej0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof lj0) {
                    lj0 lj0Var = (lj0) view;
                    kj0 kj0Var = lj0Var.b;
                    lj0Var.N = false;
                    kj0Var.setAlpha(1.0f);
                    if (!this.b.N0) {
                        lj0Var.d();
                        break;
                    } else {
                        kj0Var.setScaleX(lj0Var.I * (lj0Var.x ? 0.76f : 1.0f));
                        kj0Var.setScaleY(lj0Var.I * (lj0Var.x ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
