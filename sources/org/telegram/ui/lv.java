package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lv {
    public final /* synthetic */ int a;
    public final /* synthetic */ mv b;
    public final /* synthetic */ View c;

    public /* synthetic */ lv(mv mvVar, View view, int i3) {
        this.a = i3;
        this.b = mvVar;
        this.c = view;
    }

    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof ei.q) {
                    this.b.P0.F0.i((ei.q) view, false);
                    if (z10) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.go(15), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof ei.q) {
                    this.b.P0.F0.i((ei.q) view2, false);
                    if (z10) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.go(15), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
