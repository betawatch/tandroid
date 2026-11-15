package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class kc implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc b;

    public /* synthetic */ kc(oc ocVar, int i7) {
        this.a = i7;
        this.b = ocVar;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                oc ocVar = this.b;
                ocVar.getClass();
                if (view instanceof org.telegram.ui.Components.b01) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i5, ocVar.b));
                    break;
                }
                break;
            default:
                if (view instanceof org.telegram.ui.Components.b01) {
                    org.telegram.ui.Components.b01 b01Var = (org.telegram.ui.Components.b01) view;
                    b01Var.setFallbackWallpaper(b01Var.H.a.b ? null : this.b.w);
                    break;
                }
                break;
        }
    }
}
