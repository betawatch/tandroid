package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ b(l lVar, int i7) {
        this.a = i7;
        this.b = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                l lVar = this.b;
                if (!lVar.n0 && (runnable = lVar.j0) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                l lVar2 = this.b;
                if (!lVar2.J && lVar2.n0) {
                    lVar2.n(true);
                    break;
                } else {
                    k kVar = lVar2.u0;
                    if (kVar != null) {
                        kVar.b(-1);
                        break;
                    }
                }
                break;
        }
    }
}
