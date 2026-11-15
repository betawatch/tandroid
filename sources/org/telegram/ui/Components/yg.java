package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ yg(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ki kiVar = (ki) this.b;
                r1.g gVar = kiVar.n4;
                if (gVar != null) {
                    gVar.d();
                }
                r1.g gVar2 = new r1.g((Object) kiVar.b, (r1.e) r1.g.p, 0.0f);
                kiVar.n4 = gVar2;
                gVar2.m.a(1.5f);
                kiVar.n4.m.b(1500.0f);
                kiVar.n4.h();
                break;
            default:
                ((View) this.b).setTag(null);
                break;
        }
    }
}
