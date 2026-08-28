package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qc implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc b;

    public /* synthetic */ qc(vc vcVar, int i9) {
        this.a = i9;
        this.b = vcVar;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                vc vcVar = this.b;
                vcVar.getClass();
                ((org.telegram.ui.Components.a11) view).setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i5, vcVar.b));
                break;
            default:
                if (view instanceof org.telegram.ui.Components.a11) {
                    org.telegram.ui.Components.a11 a11Var = (org.telegram.ui.Components.a11) view;
                    a11Var.setFallbackWallpaper(a11Var.C.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
