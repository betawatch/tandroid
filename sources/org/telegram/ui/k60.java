package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k60 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k60(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                n60.e1((n60) this.c, this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                qh.r3 r3Var = (qh.r3) this.c;
                View view = (View) obj;
                qh.m3 m3Var = r3Var.b;
                if (view instanceof qh.q3) {
                    m3Var.getClass();
                    int R = RecyclerView.R(view);
                    org.telegram.ui.Components.j51 G = m3Var.V2.G(R);
                    if (G != null) {
                        qh.q3 q3Var = (qh.q3) view;
                        q3Var.setPosition(r3Var.b(R));
                        q3Var.b(this.b == G.d, true);
                        view.setPressed(false);
                        break;
                    }
                }
                break;
        }
    }
}
