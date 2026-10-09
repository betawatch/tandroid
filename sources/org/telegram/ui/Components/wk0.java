package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wk0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl0 b;

    public /* synthetic */ wk0(kl0 kl0Var, int i10) {
        this.a = i10;
        this.b = kl0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                kl0 kl0Var = this.b;
                ArrayList arrayList = kl0Var.d;
                kl0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof il0)) {
                    ((il0) view).f(((bl0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof il0) {
                    il0 il0Var = (il0) view;
                    hl0 hl0Var = il0Var.b;
                    il0Var.N = false;
                    hl0Var.setAlpha(1.0f);
                    if (!this.b.N0) {
                        il0Var.d();
                        break;
                    } else {
                        hl0Var.setScaleX(il0Var.I * (il0Var.w ? 0.76f : 1.0f));
                        hl0Var.setScaleY(il0Var.I * (il0Var.w ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
