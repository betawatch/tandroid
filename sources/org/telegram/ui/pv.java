package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv {
    public final /* synthetic */ int a;
    public final /* synthetic */ qv b;
    public final /* synthetic */ View c;

    public /* synthetic */ pv(qv qvVar, View view, int i7) {
        this.a = i7;
        this.b = qvVar;
        this.c = view;
    }

    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof fi.p) {
                    this.b.P0.F0.i((fi.p) view, false);
                    if (z10) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.ih(20), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof fi.p) {
                    this.b.P0.F0.i((fi.p) view2, false);
                    if (z10) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.ih(20), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
