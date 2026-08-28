package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ha0 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ ha0(ViewGroup viewGroup, int i9) {
        this.a = i9;
        this.b = viewGroup;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                wa0 wa0Var = (wa0) this.b;
                wa0Var.n.y(wa0Var.f.T((View) obj));
                break;
            default:
                i51 i51Var = (i51) this.b;
                i51Var.U2.Q(i51Var.T((View) obj), i51Var.Y2);
                break;
        }
    }
}
