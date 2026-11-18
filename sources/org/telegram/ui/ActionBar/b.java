package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                    kVar2.o(true);
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
