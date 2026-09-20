package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class z80 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ z80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
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
                ((d90) this.e).s = null;
                ci.s6 s6Var = (ci.s6) this.c;
                s6Var.animate().cancel();
                s6Var.animate().alpha(0.0f).setDuration(150L).setListener(new q8(this, 28));
                break;
            default:
                ((org.telegram.ui.a00) this.e).x = null;
                ci.s6 s6Var2 = (ci.s6) this.c;
                s6Var2.animate().cancel();
                s6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new r81(this, 21));
                break;
        }
    }
}
