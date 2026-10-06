package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
