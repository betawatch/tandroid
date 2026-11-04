package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jc implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc b;

    public /* synthetic */ jc(nc ncVar, int i3) {
        this.a = i3;
        this.b = ncVar;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                nc ncVar = this.b;
                ncVar.getClass();
                if (view instanceof org.telegram.ui.Components.yz0) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, ncVar.b));
                    break;
                }
                break;
            default:
                if (view instanceof org.telegram.ui.Components.yz0) {
                    org.telegram.ui.Components.yz0 yz0Var = (org.telegram.ui.Components.yz0) view;
                    yz0Var.setFallbackWallpaper(yz0Var.H.a.b ? null : this.b.w);
                    break;
                }
                break;
        }
    }
}
