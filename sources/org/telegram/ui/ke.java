package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ ke(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                mj mjVar = this.b.m2;
                if (mjVar != null) {
                    mjVar.c(false);
                    break;
                }
                break;
            case 1:
                bn.j1(this.b);
                break;
            case 2:
                this.b.x8(false, true, 0.0f);
                break;
            case 3:
                this.b.x8(false, true, 0.0f);
                break;
            case 4:
                this.b.x8(false, true, 0.0f);
                break;
            case 5:
                this.b.x8(false, true, 0.0f);
                break;
            case 6:
                this.b.x8(false, true, 0.0f);
                break;
            case 7:
                this.b.x8(false, true, 0.0f);
                break;
            default:
                this.b.kc = null;
                break;
        }
    }
}
