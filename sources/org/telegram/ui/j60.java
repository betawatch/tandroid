package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j60 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j60(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                m60.e1((m60) this.c, this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                ph.r3 r3Var = (ph.r3) this.c;
                View view = (View) obj;
                ph.m3 m3Var = r3Var.b;
                if (view instanceof ph.q3) {
                    m3Var.getClass();
                    int R = RecyclerView.R(view);
                    org.telegram.ui.Components.i51 G = m3Var.V2.G(R);
                    if (G != null) {
                        ph.q3 q3Var = (ph.q3) view;
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
