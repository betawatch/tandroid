package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                wn wnVar = (wn) this.b;
                wnVar.r9 = true;
                wnVar.p9 = 0;
                wnVar.Qb = 0;
                wnVar.Z4 = 0;
                wnVar.C9();
                wnVar.dc(false);
                break;
            case 1:
                oo ooVar = (oo) this.b;
                ooVar.L0 = false;
                ooVar.b = null;
                ooVar.M0 = false;
                break;
            case 2:
                ((pp) this.b).n = null;
                break;
            default:
                ((ob0) this.b).b();
                break;
        }
    }
}
