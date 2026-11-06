package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ov {
    public final /* synthetic */ int a;
    public final /* synthetic */ pv b;
    public final /* synthetic */ View c;

    public /* synthetic */ ov(pv pvVar, View view, int i7) {
        this.a = i7;
        this.b = pvVar;
        this.c = view;
    }

    public final void a(boolean z9) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof di.p) {
                    this.b.O0.E0.i((di.p) view, false);
                    if (z9) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.l10(14), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof di.p) {
                    this.b.O0.E0.i((di.p) view2, false);
                    if (z9) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.l10(14), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
