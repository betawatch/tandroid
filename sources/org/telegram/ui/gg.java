package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                sn snVar = (sn) this.b;
                snVar.n9 = true;
                snVar.l9 = 0;
                snVar.Db = 0;
                snVar.Z4 = 0;
                snVar.w9();
                snVar.Tb(false);
                break;
            case 1:
                ko koVar = (ko) this.b;
                koVar.L0 = false;
                koVar.b = null;
                koVar.M0 = false;
                break;
            case 2:
                ((kp) this.b).n = null;
                break;
            default:
                ((ob0) this.b).b();
                break;
        }
    }
}
