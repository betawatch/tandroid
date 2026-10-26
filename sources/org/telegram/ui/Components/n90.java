package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                fi.f6 f6Var = (fi.f6) this.c;
                f6Var.animate().cancel();
                f6Var.animate().alpha(0.0f).setDuration(150L).setListener(new i10(this, 5));
                break;
            default:
                ((org.telegram.ui.jz) this.e).x = null;
                fi.f6 f6Var2 = (fi.f6) this.c;
                f6Var2.animate().cancel();
                f6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new h31(this, 28));
                break;
        }
    }
}
