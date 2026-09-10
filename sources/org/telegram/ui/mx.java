package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class mx {
    public final /* synthetic */ int a;
    public final /* synthetic */ nx b;
    public final /* synthetic */ View c;

    public /* synthetic */ mx(nx nxVar, View view, int i10) {
        this.a = i10;
        this.b = nxVar;
        this.c = view;
    }

    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof zh.k) {
                    this.b.O0.E0.i((zh.k) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c30(10), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof zh.k) {
                    this.b.O0.E0.i((zh.k) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c30(10), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
