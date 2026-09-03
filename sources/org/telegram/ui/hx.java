package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hx {
    public final /* synthetic */ int a;
    public final /* synthetic */ ix b;
    public final /* synthetic */ View c;

    public /* synthetic */ hx(ix ixVar, View view, int i10) {
        this.a = i10;
        this.b = ixVar;
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
