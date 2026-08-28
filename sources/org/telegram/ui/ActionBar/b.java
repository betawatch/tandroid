package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ b(k kVar, int i9) {
        this.a = i9;
        this.b = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                k kVar = this.b;
                if (!kVar.j0 && (runnable = kVar.f0) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                k kVar2 = this.b;
                if (!kVar2.F && kVar2.j0) {
                    kVar2.h(true);
                    break;
                } else {
                    j jVar = kVar2.q0;
                    if (jVar != null) {
                        jVar.b(-1);
                        break;
                    }
                }
                break;
        }
    }
}
