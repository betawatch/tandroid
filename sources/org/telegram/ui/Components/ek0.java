package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ek0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ sk0 b;

    public /* synthetic */ ek0(sk0 sk0Var, int i10) {
        this.a = i10;
        this.b = sk0Var;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                sk0 sk0Var = this.b;
                ArrayList arrayList = sk0Var.d;
                sk0Var.b.getClass();
                int S = RecyclerView.S(view);
                if (S >= 0 && S < arrayList.size() && (view instanceof qk0)) {
                    ((qk0) view).f(((jk0) arrayList.get(S)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof qk0) {
                    qk0 qk0Var = (qk0) view;
                    pk0 pk0Var = qk0Var.b;
                    qk0Var.N = false;
                    pk0Var.setAlpha(1.0f);
                    if (!this.b.N0) {
                        qk0Var.d();
                        break;
                    } else {
                        pk0Var.setScaleX(qk0Var.I * (qk0Var.w ? 0.76f : 1.0f));
                        pk0Var.setScaleY(qk0Var.I * (qk0Var.w ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
