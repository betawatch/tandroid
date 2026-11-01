package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ b(l lVar, int i10) {
        this.a = i10;
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
                    lVar2.k(true);
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
