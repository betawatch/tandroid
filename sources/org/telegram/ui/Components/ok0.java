package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ok0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ cl0 b;

    public /* synthetic */ ok0(cl0 cl0Var, int i10) {
        this.a = i10;
        this.b = cl0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                cl0 cl0Var = this.b;
                ArrayList arrayList = cl0Var.d;
                cl0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof al0)) {
                    ((al0) view).f(((tk0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof al0) {
                    al0 al0Var = (al0) view;
                    zk0 zk0Var = al0Var.b;
                    al0Var.N = false;
                    zk0Var.setAlpha(1.0f);
                    if (!this.b.N0) {
                        al0Var.d();
                        break;
                    } else {
                        zk0Var.setScaleX(al0Var.I * (al0Var.w ? 0.76f : 1.0f));
                        zk0Var.setScaleY(al0Var.I * (al0Var.w ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
