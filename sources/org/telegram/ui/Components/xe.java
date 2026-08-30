package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xe implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ xe(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.a = i10;
        this.c = chatActivityEnterView;
        this.b = dialog;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.c;
                chatActivityEnterView.m0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.m0.postDelayed(new fg(this.b, 18), 100L);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                chatActivityEnterView2.m0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.m0.postDelayed(new fg(this.b, 18), 100L);
                break;
        }
        return true;
    }
}
