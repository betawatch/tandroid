package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class rj0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk0 b;

    public /* synthetic */ rj0(fk0 fk0Var, int i10) {
        this.a = i10;
        this.b = fk0Var;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                fk0 fk0Var = this.b;
                ArrayList arrayList = fk0Var.d;
                fk0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof dk0)) {
                    ((dk0) view).f(((wj0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof dk0) {
                    dk0 dk0Var = (dk0) view;
                    ck0 ck0Var = dk0Var.b;
                    dk0Var.N = false;
                    ck0Var.setAlpha(1.0f);
                    if (!this.b.N0) {
                        dk0Var.d();
                        break;
                    } else {
                        ck0Var.setScaleX(dk0Var.I * (dk0Var.w ? 0.76f : 1.0f));
                        ck0Var.setScaleY(dk0Var.I * (dk0Var.w ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
