package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ pg(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                bi biVar = (bi) this.b;
                o1.j jVar = biVar.j4;
                if (jVar != null) {
                    jVar.d();
                }
                o1.j jVar2 = new o1.j((Object) biVar.b, (o1.h) o1.j.p, 0.0f);
                biVar.j4 = jVar2;
                jVar2.m.a(1.5f);
                biVar.j4.m.b(1500.0f);
                biVar.j4.h();
                break;
            default:
                ((View) this.b).setTag(null);
                break;
        }
    }
}
