package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class hf implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ hf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
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
                chatActivityEnterView.p0.postDelayed(new pg(this.b, 18), 100L);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                chatActivityEnterView2.p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.p0.postDelayed(new pg(this.b, 18), 100L);
                break;
        }
        return true;
    }
}
