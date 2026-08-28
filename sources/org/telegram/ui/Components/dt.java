package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dt implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ dt(int i9, View view) {
        this.a = i9;
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
                ((v60) this.b).invalidate();
                break;
        }
        return true;
    }
}
