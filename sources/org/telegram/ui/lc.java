package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                    view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, pcVar.b));
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
