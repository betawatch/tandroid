package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ ya0(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                pb0 pb0Var = (pb0) this.b;
                pb0Var.n.y(pb0Var.f.T((View) obj));
                break;
            default:
                e61 e61Var = (e61) this.b;
                e61Var.Y2.Q(e61Var.T((View) obj), e61Var.c3);
                break;
        }
    }
}
