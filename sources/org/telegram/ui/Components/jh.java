package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class jh implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ jh(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ui uiVar = (ui) this.b;
                r1.g gVar = uiVar.n4;
                if (gVar != null) {
                    gVar.d();
                }
                r1.g gVar2 = new r1.g((Object) uiVar.b, (r1.e) r1.g.p, 0.0f);
                uiVar.n4 = gVar2;
                gVar2.m.a(1.5f);
                uiVar.n4.m.b(1500.0f);
                uiVar.n4.h();
                break;
            default:
                ((View) this.b).setTag(null);
                break;
        }
    }
}
