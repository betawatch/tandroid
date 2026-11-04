package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ce implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;

    public /* synthetic */ ce(wm wmVar, int i3) {
        this.a = i3;
        this.b = wmVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                hj hjVar = this.b.m2;
                if (hjVar != null) {
                    hjVar.c(false);
                    break;
                }
                break;
            case 1:
                wm.c1(this.b);
                break;
            case 2:
                this.b.v8(false, true, 0.0f);
                break;
            case 3:
                this.b.v8(false, true, 0.0f);
                break;
            case 4:
                this.b.v8(false, true, 0.0f);
                break;
            case 5:
                this.b.v8(false, true, 0.0f);
                break;
            case 6:
                this.b.v8(false, true, 0.0f);
                break;
            case 7:
                this.b.v8(false, true, 0.0f);
                break;
            default:
                this.b.hc = null;
                break;
        }
    }
}
