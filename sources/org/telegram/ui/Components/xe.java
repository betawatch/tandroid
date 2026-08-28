package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xe implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ xe(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i9) {
        this.a = i9;
        this.c = chatActivityEnterView;
        this.b = dialog;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.c;
                chatActivityEnterView.l0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.l0.postDelayed(new fg(this.b, 18), 100L);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                chatActivityEnterView2.l0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.l0.postDelayed(new fg(this.b, 18), 100L);
                break;
        }
        return true;
    }
}
