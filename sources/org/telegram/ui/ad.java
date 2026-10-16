package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ad implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ed b;

    public /* synthetic */ ad(ed edVar, int i10) {
        this.a = i10;
        this.b = edVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                ed edVar = this.b;
                edVar.getClass();
                ((org.telegram.ui.Components.w21) view).setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i5, edVar.b));
                break;
            default:
                if (view instanceof org.telegram.ui.Components.w21) {
                    org.telegram.ui.Components.w21 w21Var = (org.telegram.ui.Components.w21) view;
                    w21Var.setFallbackWallpaper(w21Var.G.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
