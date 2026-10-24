package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mf0 b;

    public /* synthetic */ hf0(mf0 mf0Var, int i10) {
        this.a = i10;
        this.b = mf0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.u0.finishFragment();
                break;
            default:
                this.b.u0.finishFragment();
                break;
        }
    }
}
