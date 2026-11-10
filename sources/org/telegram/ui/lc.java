package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                if (view instanceof org.telegram.ui.Components.zz0) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i5, pcVar.b));
                    break;
                }
                break;
            default:
                if (view instanceof org.telegram.ui.Components.zz0) {
                    org.telegram.ui.Components.zz0 zz0Var = (org.telegram.ui.Components.zz0) view;
                    zz0Var.setFallbackWallpaper(zz0Var.G.a.b ? null : this.b.w);
                    break;
                }
                break;
        }
    }
}
