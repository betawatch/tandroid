package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class n90 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ n90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
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
                ((r90) this.e).s = null;
                ei.g6 g6Var = (ei.g6) this.c;
                g6Var.animate().cancel();
                g6Var.animate().alpha(0.0f).setDuration(150L).setListener(new i60(this, 4));
                break;
            default:
                ((org.telegram.ui.mz) this.e).x = null;
                ei.g6 g6Var2 = (ei.g6) this.c;
                g6Var2.animate().cancel();
                g6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new p31(this, 27));
                break;
        }
    }
}
