package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class jf implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ jf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
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
                chatActivityEnterView.p0.postDelayed(new qg(this.b, 18), 100L);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                chatActivityEnterView2.p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.p0.postDelayed(new qg(this.b, 18), 100L);
                break;
        }
        return true;
    }
}
