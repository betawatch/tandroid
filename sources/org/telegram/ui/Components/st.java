package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
