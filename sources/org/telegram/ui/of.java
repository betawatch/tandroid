package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class of implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;

    public /* synthetic */ of(yn ynVar, int i10) {
        this.a = i10;
        this.b = ynVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.Mb(false);
                break;
            default:
                this.b.Mb(false);
                break;
        }
    }
}
