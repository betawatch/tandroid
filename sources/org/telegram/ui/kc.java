package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kc implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc b;

    public /* synthetic */ kc(oc ocVar, int i7) {
        this.a = i7;
        this.b = ocVar;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                oc ocVar = this.b;
                ocVar.getClass();
                if (view instanceof org.telegram.ui.Components.k01) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i5, ocVar.b));
                    break;
                }
                break;
            default:
                if (view instanceof org.telegram.ui.Components.k01) {
                    org.telegram.ui.Components.k01 k01Var = (org.telegram.ui.Components.k01) view;
                    k01Var.setFallbackWallpaper(k01Var.H.a.b ? null : this.b.w);
                    break;
                }
                break;
        }
    }
}
