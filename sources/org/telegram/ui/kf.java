package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ kf(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.Rb(false);
                break;
            default:
                this.b.Rb(false);
                break;
        }
    }
}
