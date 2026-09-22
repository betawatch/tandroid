package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class c90 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ c90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
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
                ((g90) this.e).s = null;
                ci.s6 s6Var = (ci.s6) this.c;
                s6Var.animate().cancel();
                s6Var.animate().alpha(0.0f).setDuration(150L).setListener(new q8(this, 28));
                break;
            default:
                ((org.telegram.ui.a00) this.e).x = null;
                ci.s6 s6Var2 = (ci.s6) this.c;
                s6Var2.animate().cancel();
                s6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new t81(this, 21));
                break;
        }
    }
}
