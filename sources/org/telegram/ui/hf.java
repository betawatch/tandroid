package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ hf(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.Zb(false);
                break;
            default:
                this.b.Zb(false);
                break;
        }
    }
}
