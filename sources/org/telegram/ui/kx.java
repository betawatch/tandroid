package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kx {
    public final /* synthetic */ int a;
    public final /* synthetic */ lx b;
    public final /* synthetic */ View c;

    public /* synthetic */ kx(lx lxVar, View view, int i10) {
        this.a = i10;
        this.b = lxVar;
        this.c = view;
    }

    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof ai.a0) {
                    this.b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(15), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof ai.a0) {
                    this.b.O0.E0.i((ai.a0) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(15), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
