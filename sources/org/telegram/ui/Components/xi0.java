package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi0 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mj0 b;

    public /* synthetic */ xi0(mj0 mj0Var, int i10) {
        this.a = i10;
        this.b = mj0Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                mj0 mj0Var = this.b;
                ArrayList arrayList = mj0Var.d;
                mj0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof kj0)) {
                    ((kj0) view).f(((dj0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof kj0) {
                    kj0 kj0Var = (kj0) view;
                    jj0 jj0Var = kj0Var.b;
                    kj0Var.N = false;
                    jj0Var.setAlpha(1.0f);
                    if (!this.b.N0) {
                        kj0Var.d();
                        break;
                    } else {
                        jj0Var.setScaleX(kj0Var.I * (kj0Var.x ? 0.76f : 1.0f));
                        jj0Var.setScaleY(kj0Var.I * (kj0Var.x ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
