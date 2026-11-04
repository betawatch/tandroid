package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ qg(KeyEvent.Callback callback, int i3) {
        this.a = i3;
        this.b = callback;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                bi biVar = (bi) this.b;
                q1.g gVar = biVar.k4;
                if (gVar != null) {
                    gVar.d();
                }
                q1.g gVar2 = new q1.g((Object) biVar.b, (q1.e) q1.g.p, 0.0f);
                biVar.k4 = gVar2;
                gVar2.m.a(1.5f);
                biVar.k4.m.b(1500.0f);
                biVar.k4.h();
                break;
            default:
                ((View) this.b).setTag(null);
                break;
        }
    }
}
