package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ sg(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ci ciVar = (ci) this.b;
                r1.g gVar = ciVar.m4;
                if (gVar != null) {
                    gVar.d();
                }
                r1.g gVar2 = new r1.g((Object) ciVar.b, (r1.e) r1.g.p, 0.0f);
                ciVar.m4 = gVar2;
                gVar2.m.a(1.5f);
                ciVar.m4.m.b(1500.0f);
                ciVar.m4.h();
                break;
            default:
                ((View) this.b).setTag(null);
                break;
        }
    }
}
