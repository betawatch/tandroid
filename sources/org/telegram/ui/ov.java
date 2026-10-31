package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ov implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay b;

    public /* synthetic */ ov(ay ayVar, int i10) {
        this.a = i10;
        this.b = ayVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ay ayVar = this.b;
                if (ayVar.R3 != null) {
                    ayVar.getMessagesController().h4(0L, ayVar.R3);
                    ayVar.R3 = null;
                    ayVar.W4();
                    break;
                }
                break;
            case 1:
                this.b.m4(true);
                break;
            case 2:
                this.b.m4(true);
                break;
            default:
                ay.k0(this.b);
                break;
        }
    }
}
