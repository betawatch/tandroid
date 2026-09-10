package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class bk0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ pk0 b;

    public /* synthetic */ bk0(pk0 pk0Var, int i10) {
        this.a = i10;
        this.b = pk0Var;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                pk0 pk0Var = this.b;
                ArrayList arrayList = pk0Var.d;
                pk0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof nk0)) {
                    ((nk0) view).f(((gk0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof nk0) {
                    nk0 nk0Var = (nk0) view;
                    mk0 mk0Var = nk0Var.b;
                    nk0Var.N = false;
                    mk0Var.setAlpha(1.0f);
                    if (!this.b.N0) {
                        nk0Var.d();
                        break;
                    } else {
                        mk0Var.setScaleX(nk0Var.I * (nk0Var.w ? 0.76f : 1.0f));
                        mk0Var.setScaleY(nk0Var.I * (nk0Var.w ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
