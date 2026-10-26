package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                un unVar = (un) this.b;
                unVar.n9 = true;
                unVar.l9 = 0;
                unVar.Mb = 0;
                unVar.Z4 = 0;
                unVar.z9();
                unVar.Zb(false);
                break;
            case 1:
                mo moVar = (mo) this.b;
                moVar.L0 = false;
                moVar.b = null;
                moVar.M0 = false;
                break;
            case 2:
                ((np) this.b).n = null;
                break;
            default:
                ((lb0) this.b).b();
                break;
        }
    }
}
