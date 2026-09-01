package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ck0 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ rk0 b;

    public /* synthetic */ ck0(rk0 rk0Var, int i10) {
        this.a = i10;
        this.b = rk0Var;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                rk0 rk0Var = this.b;
                ArrayList arrayList = rk0Var.d;
                rk0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof pk0)) {
                    ((pk0) view).f(((ik0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof pk0) {
                    pk0 pk0Var = (pk0) view;
                    ok0 ok0Var = pk0Var.b;
                    pk0Var.K = false;
                    ok0Var.setAlpha(1.0f);
                    if (!this.b.K0) {
                        pk0Var.d();
                        break;
                    } else {
                        ok0Var.setScaleX(pk0Var.F * (pk0Var.w ? 0.76f : 1.0f));
                        ok0Var.setScaleY(pk0Var.F * (pk0Var.w ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
