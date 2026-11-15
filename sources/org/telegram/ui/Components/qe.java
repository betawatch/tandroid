package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qe implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ qe(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i7) {
        this.a = i7;
        this.c = chatActivityEnterView;
        this.b = dialog;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.c;
                chatActivityEnterView.q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.q0.postDelayed(new dg(this.b, 20), 100L);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                chatActivityEnterView2.q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.q0.postDelayed(new dg(this.b, 20), 100L);
                break;
        }
        return true;
    }
}
