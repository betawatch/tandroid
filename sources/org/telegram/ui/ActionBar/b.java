package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ b(k kVar, int i7) {
        this.a = i7;
        this.b = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                k kVar = this.b;
                if (!kVar.o0 && (runnable = kVar.k0) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                k kVar2 = this.b;
                if (!kVar2.K && kVar2.o0) {
                    kVar2.n(true);
                    break;
                } else {
                    j jVar = kVar2.v0;
                    if (jVar != null) {
                        jVar.b(-1);
                        break;
                    }
                }
                break;
        }
    }
}
