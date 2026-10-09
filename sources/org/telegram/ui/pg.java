package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                zn znVar = (zn) this.b;
                znVar.b9 = true;
                znVar.Z8 = 0;
                znVar.qb = 0;
                znVar.N4 = 0;
                znVar.w9();
                znVar.Rb(false);
                break;
            case 1:
                uo uoVar = (uo) this.b;
                uoVar.M0 = false;
                uoVar.b = null;
                uoVar.N0 = false;
                break;
            case 2:
                ((up) this.b).n = null;
                break;
            default:
                ((ec0) this.b).b();
                break;
        }
    }
}
