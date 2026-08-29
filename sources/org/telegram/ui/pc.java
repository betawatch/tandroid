package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc implements f5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc b;

    public /* synthetic */ pc(tc tcVar, int i10) {
        this.a = i10;
        this.b = tcVar;
    }

    @Override // f5.d
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                tc tcVar = this.b;
                tcVar.getClass();
                ((org.telegram.ui.Components.l11) view).setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i5, tcVar.b));
                break;
            default:
                if (view instanceof org.telegram.ui.Components.l11) {
                    org.telegram.ui.Components.l11 l11Var = (org.telegram.ui.Components.l11) view;
                    l11Var.setFallbackWallpaper(l11Var.C.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
