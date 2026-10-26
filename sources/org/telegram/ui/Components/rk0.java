package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rk0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ fl0 b;

    public /* synthetic */ rk0(fl0 fl0Var, int i10) {
        this.a = i10;
        this.b = fl0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                fl0 fl0Var = this.b;
                ArrayList arrayList = fl0Var.d;
                fl0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof dl0)) {
                    ((dl0) view).f(((wk0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof dl0) {
                    dl0 dl0Var = (dl0) view;
                    cl0 cl0Var = dl0Var.b;
                    dl0Var.N = false;
                    cl0Var.setAlpha(1.0f);
                    if (!this.b.N0) {
                        dl0Var.d();
                        break;
                    } else {
                        cl0Var.setScaleX(dl0Var.I * (dl0Var.w ? 0.76f : 1.0f));
                        cl0Var.setScaleY(dl0Var.I * (dl0Var.w ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
