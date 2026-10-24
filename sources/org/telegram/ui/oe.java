package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ oe(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ak akVar = this.b.j2;
                if (akVar != null) {
                    akVar.c(false);
                    break;
                }
                break;
            case 1:
                sn.k1(this.b);
                break;
            case 2:
                this.b.j8(false, true, 0.0f);
                break;
            case 3:
                this.b.j8(false, true, 0.0f);
                break;
            case 4:
                this.b.j8(false, true, 0.0f);
                break;
            case 5:
                this.b.j8(false, true, 0.0f);
                break;
            case 6:
                this.b.j8(false, true, 0.0f);
                break;
            case 7:
                this.b.j8(false, true, 0.0f);
                break;
            default:
                this.b.Tb = null;
                break;
        }
    }
}
