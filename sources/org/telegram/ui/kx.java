package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                if (view instanceof bi.u) {
                    this.b.O0.E0.i((bi.u) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ue(16), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof bi.u) {
                    this.b.O0.E0.i((bi.u) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ue(16), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
