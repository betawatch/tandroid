package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lc implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc b;

    public /* synthetic */ lc(pc pcVar, int i7) {
        this.a = i7;
        this.b = pcVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                pc pcVar = this.b;
                pcVar.getClass();
                if (view instanceof org.telegram.ui.Components.yz0) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, pcVar.b));
                    break;
                }
                break;
            default:
                if (view instanceof org.telegram.ui.Components.yz0) {
                    org.telegram.ui.Components.yz0 yz0Var = (org.telegram.ui.Components.yz0) view;
                    yz0Var.setFallbackWallpaper(yz0Var.G.a.b ? null : this.b.w);
                    break;
                }
                break;
        }
    }
}
