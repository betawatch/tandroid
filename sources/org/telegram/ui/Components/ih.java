package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ ih(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ti tiVar = (ti) this.b;
                r1.g gVar = tiVar.n4;
                if (gVar != null) {
                    gVar.d();
                }
                r1.g gVar2 = new r1.g((Object) tiVar.b, (r1.e) r1.g.p, 0.0f);
                tiVar.n4 = gVar2;
                gVar2.m.a(1.5f);
                tiVar.n4.m.b(1500.0f);
                tiVar.n4.h();
                break;
            default:
                ((View) this.b).setTag(null);
                break;
        }
    }
}
