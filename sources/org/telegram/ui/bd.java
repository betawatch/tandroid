package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd b;

    public /* synthetic */ bd(fd fdVar, int i10) {
        this.a = i10;
        this.b = fdVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                fd fdVar = this.b;
                fdVar.getClass();
                ((org.telegram.ui.Components.v21) view).setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i5, fdVar.b));
                break;
            default:
                if (view instanceof org.telegram.ui.Components.v21) {
                    org.telegram.ui.Components.v21 v21Var = (org.telegram.ui.Components.v21) view;
                    v21Var.setFallbackWallpaper(v21Var.G.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
