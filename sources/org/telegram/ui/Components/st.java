package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class st implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ st(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.g4 g4Var = ((EditTextBoldCursor) this.b).floatingActionMode;
                if (g4Var != null) {
                    g4Var.e();
                    break;
                }
                break;
            default:
                ((w70) this.b).invalidate();
                break;
        }
        return true;
    }
}
