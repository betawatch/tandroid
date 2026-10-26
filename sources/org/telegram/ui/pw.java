package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pw {
    public final /* synthetic */ int a;
    public final /* synthetic */ qw b;
    public final /* synthetic */ View c;

    public /* synthetic */ pw(qw qwVar, View view, int i10) {
        this.a = i10;
        this.b = qwVar;
        this.c = view;
    }

    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof di.q) {
                    this.b.O0.E0.i((di.q) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k5(25), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof di.q) {
                    this.b.O0.E0.i((di.q) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k5(25), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
