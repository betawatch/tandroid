package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                if (!lVar.j0 && (runnable = lVar.f0) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                l lVar2 = this.b;
                if (!lVar2.F && lVar2.j0) {
                    lVar2.h(true);
                    break;
                } else {
                    k kVar = lVar2.q0;
                    if (kVar != null) {
                        kVar.b(-1);
                        break;
                    }
                }
                break;
        }
    }
}
