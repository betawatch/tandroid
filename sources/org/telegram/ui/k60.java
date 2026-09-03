package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                qh.q3 q3Var = (qh.q3) this.c;
                View view = (View) obj;
                qh.l3 l3Var = q3Var.b;
                if (view instanceof qh.p3) {
                    l3Var.getClass();
                    int R = RecyclerView.R(view);
                    org.telegram.ui.Components.h51 G = l3Var.V2.G(R);
                    if (G != null) {
                        qh.p3 p3Var = (qh.p3) view;
                        p3Var.setPosition(q3Var.b(R));
                        p3Var.b(this.b == G.d, true);
                        view.setPressed(false);
                        break;
                    }
                }
                break;
        }
    }
}
