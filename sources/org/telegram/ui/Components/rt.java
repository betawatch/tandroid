package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rt implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ rt(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.j4 j4Var = ((EditTextBoldCursor) this.b).floatingActionMode;
                if (j4Var != null) {
                    j4Var.e();
                    break;
                }
                break;
            default:
                ((l70) this.b).invalidate();
                break;
        }
        return true;
    }
}
