package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class pe implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ pe(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i7) {
        this.a = i7;
        this.c = chatActivityEnterView;
        this.b = dialog;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.c;
                chatActivityEnterView.p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.p0.postDelayed(new xf(this.b, 19), 100L);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                chatActivityEnterView2.p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.p0.postDelayed(new xf(this.b, 19), 100L);
                break;
        }
        return true;
    }
}
