package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l60 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l60(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                o60.e1((o60) this.c, this.b, (ChannelBoostsController.CanApplyBoost) obj);
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
