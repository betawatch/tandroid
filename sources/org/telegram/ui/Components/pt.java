package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pt implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ pt(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.k4 k4Var = ((EditTextBoldCursor) this.b).floatingActionMode;
                if (k4Var != null) {
                    k4Var.e();
                    break;
                }
                break;
            default:
                ((o70) this.b).invalidate();
                break;
        }
        return true;
    }
}
