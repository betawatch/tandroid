package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class r80 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ r80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.a = i10;
        this.e = viewGroup;
        this.c = view;
        this.b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((v80) this.e).s = null;
                ci.s6 s6Var = (ci.s6) this.c;
                s6Var.animate().cancel();
                s6Var.animate().alpha(0.0f).setDuration(150L).setListener(new p8(this, 27));
                break;
            default:
                ((org.telegram.ui.c00) this.e).x = null;
                ci.s6 s6Var2 = (ci.s6) this.c;
                s6Var2.animate().cancel();
                s6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new w81(this, 20));
                break;
        }
    }
}
