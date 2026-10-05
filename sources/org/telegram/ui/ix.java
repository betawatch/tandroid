package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ix {
    public final /* synthetic */ int a;
    public final /* synthetic */ jx b;
    public final /* synthetic */ View c;

    public /* synthetic */ ix(jx jxVar, View view, int i10) {
        this.a = i10;
        this.b = jxVar;
        this.c = view;
    }

    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof ai.a0) {
                    this.b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uh(17), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof ai.a0) {
                    this.b.O0.E0.i((ai.a0) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uh(17), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
