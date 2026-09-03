package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ b(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                k kVar = this.b;
                if (!kVar.k0 && (runnable = kVar.g0) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                k kVar2 = this.b;
                if (!kVar2.G && kVar2.k0) {
                    kVar2.h(true);
                    break;
                } else {
                    j jVar = kVar2.r0;
                    if (jVar != null) {
                        jVar.b(-1);
                        break;
                    }
                }
                break;
        }
    }
}
