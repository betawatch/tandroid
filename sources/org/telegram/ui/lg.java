package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ lg(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                bo.B0(this.b);
                break;
            case 1:
                this.b.g8(false, true, 0.0f);
                break;
            case 2:
                this.b.g8(false, true, 0.0f);
                break;
            case 3:
                this.b.g8(false, true, 0.0f);
                break;
            case 4:
                this.b.g8(false, true, 0.0f);
                break;
            case 5:
                this.b.g8(false, true, 0.0f);
                break;
            case 6:
                this.b.g8(false, true, 0.0f);
                break;
            case 7:
                this.b.Fb = null;
                break;
            default:
                ik ikVar = this.b.X1;
                if (ikVar != null) {
                    ikVar.c(false);
                    break;
                }
                break;
        }
    }
}
