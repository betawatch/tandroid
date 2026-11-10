package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m70 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ m70(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i7) {
        this.a = i7;
        this.e = viewGroup;
        this.c = view;
        this.b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((q70) this.e).s = null;
                fi.p5 p5Var = (fi.p5) this.c;
                p5Var.animate().cancel();
                p5Var.animate().alpha(0.0f).setDuration(150L).setListener(new e60(this, 3));
                break;
            default:
                ((org.telegram.ui.hy) this.e).y = null;
                fi.p5 p5Var2 = (fi.p5) this.c;
                p5Var2.animate().cancel();
                p5Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.va(this, 29));
                break;
        }
    }
}
