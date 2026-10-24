package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y4 b;

    public /* synthetic */ o4(y4 y4Var, int i10) {
        this.a = i10;
        this.b = y4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.g();
                break;
            case 1:
                this.b.g();
                break;
            default:
                this.b.g();
                break;
        }
    }
}
