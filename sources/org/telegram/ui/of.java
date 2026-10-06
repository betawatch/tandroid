package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
