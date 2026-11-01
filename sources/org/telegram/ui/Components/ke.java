package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ke implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ ke(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.a = i10;
        this.c = chatActivityEnterView;
        this.b = dialog;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.c;
                chatActivityEnterView.p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.p0.postDelayed(new tf(this.b, 20), 100L);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                chatActivityEnterView2.p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.p0.postDelayed(new tf(this.b, 20), 100L);
                break;
        }
        return true;
    }
}
