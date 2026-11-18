package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kc implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc b;

    public /* synthetic */ kc(oc ocVar, int i7) {
        this.a = i7;
        this.b = ocVar;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                oc ocVar = this.b;
                ocVar.getClass();
                if (view instanceof org.telegram.ui.Components.j01) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i5, ocVar.b));
                    break;
                }
                break;
            default:
                if (view instanceof org.telegram.ui.Components.j01) {
                    org.telegram.ui.Components.j01 j01Var = (org.telegram.ui.Components.j01) view;
                    j01Var.setFallbackWallpaper(j01Var.H.a.b ? null : this.b.w);
                    break;
                }
                break;
        }
    }
}
