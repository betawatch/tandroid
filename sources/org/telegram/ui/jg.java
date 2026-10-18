package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                sn snVar = (sn) this.b;
                snVar.b9 = true;
                snVar.Z8 = 0;
                snVar.qb = 0;
                snVar.N4 = 0;
                snVar.w9();
                snVar.Rb(false);
                break;
            case 1:
                ko koVar = (ko) this.b;
                koVar.M0 = false;
                koVar.b = null;
                koVar.N0 = false;
                break;
            case 2:
                ((kp) this.b).n = null;
                break;
            default:
                ((kb0) this.b).b();
                break;
        }
    }
}
