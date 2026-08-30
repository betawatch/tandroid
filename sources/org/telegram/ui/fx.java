package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fx {
    public final /* synthetic */ int a;
    public final /* synthetic */ gx b;
    public final /* synthetic */ View c;

    public /* synthetic */ fx(gx gxVar, View view, int i10) {
        this.a = i10;
        this.b = gxVar;
        this.c = view;
    }

    public final void a(boolean z4) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof nh.p) {
                    this.b.L0.B0.i((nh.p) view, false);
                    if (z4) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.mc(18), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof nh.p) {
                    this.b.L0.B0.i((nh.p) view2, false);
                    if (z4) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.mc(18), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
