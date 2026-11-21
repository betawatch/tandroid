package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                if (view instanceof org.telegram.ui.Components.l01) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i5, ocVar.b));
                    break;
                }
                break;
            default:
                if (view instanceof org.telegram.ui.Components.l01) {
                    org.telegram.ui.Components.l01 l01Var = (org.telegram.ui.Components.l01) view;
                    l01Var.setFallbackWallpaper(l01Var.H.a.b ? null : this.b.w);
                    break;
                }
                break;
        }
    }
}
