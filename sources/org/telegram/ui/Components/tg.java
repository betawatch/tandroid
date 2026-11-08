package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ tg(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                di diVar = (di) this.b;
                r1.g gVar = diVar.j4;
                if (gVar != null) {
                    gVar.d();
                }
                r1.g gVar2 = new r1.g((Object) diVar.b, (r1.e) r1.g.p, 0.0f);
                diVar.j4 = gVar2;
                gVar2.m.a(1.5f);
                diVar.j4.m.b(1500.0f);
                diVar.j4.h();
                break;
            default:
                ((View) this.b).setTag(null);
                break;
        }
    }
}
