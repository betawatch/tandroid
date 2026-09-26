package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gx {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx b;
    public final /* synthetic */ View c;

    public /* synthetic */ gx(hx hxVar, View view, int i10) {
        this.a = i10;
        this.b = hxVar;
        this.c = view;
    }

    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof ai.a0) {
                    this.b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(17), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof ai.a0) {
                    this.b.O0.E0.i((ai.a0) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(17), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
