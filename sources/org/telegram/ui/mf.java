package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ mf(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.Nb(false);
                break;
            default:
                this.b.Nb(false);
                break;
        }
    }
}
