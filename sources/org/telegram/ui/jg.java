package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ jg(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                co.B0(this.b);
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
                this.b.Gb = null;
                break;
            default:
                hk hkVar = this.b.X1;
                if (hkVar != null) {
                    hkVar.c(false);
                    break;
                }
                break;
        }
    }
}
