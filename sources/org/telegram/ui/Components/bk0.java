package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bk0 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ qk0 b;

    public /* synthetic */ bk0(qk0 qk0Var, int i10) {
        this.a = i10;
        this.b = qk0Var;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                qk0 qk0Var = this.b;
                ArrayList arrayList = qk0Var.d;
                qk0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof ok0)) {
                    ((ok0) view).f(((hk0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof ok0) {
                    ok0 ok0Var = (ok0) view;
                    nk0 nk0Var = ok0Var.b;
                    ok0Var.K = false;
                    nk0Var.setAlpha(1.0f);
                    if (!this.b.K0) {
                        ok0Var.d();
                        break;
                    } else {
                        nk0Var.setScaleX(ok0Var.F * (ok0Var.w ? 0.76f : 1.0f));
                        nk0Var.setScaleY(ok0Var.F * (ok0Var.w ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
