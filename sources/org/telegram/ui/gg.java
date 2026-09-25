package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ gg(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                wn.Q0(this.b);
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
                ek ekVar = this.b.X1;
                if (ekVar != null) {
                    ekVar.c(false);
                    break;
                }
                break;
        }
    }
}
