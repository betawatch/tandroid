package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ hf(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.Tb(false);
                break;
            default:
                this.b.Tb(false);
                break;
        }
    }
}
