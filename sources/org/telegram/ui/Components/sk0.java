package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sk0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ gl0 b;

    public /* synthetic */ sk0(gl0 gl0Var, int i10) {
        this.a = i10;
        this.b = gl0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                gl0 gl0Var = this.b;
                ArrayList arrayList = gl0Var.d;
                gl0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof el0)) {
                    ((el0) view).f(((xk0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof el0) {
                    el0 el0Var = (el0) view;
                    dl0 dl0Var = el0Var.b;
                    el0Var.N = false;
                    dl0Var.setAlpha(1.0f);
                    if (!this.b.N0) {
                        el0Var.d();
                        break;
                    } else {
                        dl0Var.setScaleX(el0Var.I * (el0Var.w ? 0.76f : 1.0f));
                        dl0Var.setScaleY(el0Var.I * (el0Var.w ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
