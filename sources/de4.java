// default package

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class de4 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ de4(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, byte b) {
        this.a = b;
        this.e = viewGroup;
        this.c = view;
        this.b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        byte b = this.a;
        View view = this.c;
        ViewGroup viewGroup = this.e;
        switch (b) {
            case 0:
                ((ke4) viewGroup).y = null;
                a91 a91Var = (a91) view;
                a91Var.animate().cancel();
                a91Var.animate().alpha(0.0f).setDuration(150L).setListener(new kh2(this, (byte) 22));
                break;
            default:
                ((f56) viewGroup).s = null;
                a91 a91Var2 = (a91) view;
                a91Var2.animate().cancel();
                a91Var2.animate().alpha(0.0f).setDuration(150L).setListener(new v85(this, (byte) 13));
                break;
        }
    }
}
