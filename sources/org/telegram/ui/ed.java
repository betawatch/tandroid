package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ md b;

    public /* synthetic */ ed(md mdVar, int i10) {
        this.a = i10;
        this.b = mdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                md.X(this.b, view);
                break;
            case 1:
                md mdVar = this.b;
                mdVar.w.n(mdVar.y != null, new cd(mdVar, 2), new v5(mdVar, 2), 0);
                mdVar.K.M(0);
                mdVar.K.P(43);
                mdVar.n.d();
                break;
            case 2:
                md mdVar2 = this.b;
                if (!mdVar2.k0) {
                    mdVar2.g0();
                    break;
                } else if (mdVar2.b0) {
                    mdVar2.b0 = false;
                    mdVar2.i0();
                    break;
                }
                break;
            default:
                md mdVar3 = this.b;
                if (!mdVar3.b0) {
                    mdVar3.b0 = true;
                    mdVar3.i0();
                    break;
                }
                break;
        }
    }
}
