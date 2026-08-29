package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class af implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ af(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.a = i10;
        this.c = chatActivityEnterView;
        this.b = dialog;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.c;
                chatActivityEnterView.l0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.l0.postDelayed(new ig(this.b, 18), 100L);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                chatActivityEnterView2.l0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.l0.postDelayed(new ig(this.b, 18), 100L);
                break;
        }
        return true;
    }
}
