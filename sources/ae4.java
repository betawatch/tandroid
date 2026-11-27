// default package

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ae4 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ ae4(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, byte b) {
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
                ((he4) viewGroup).y = null;
                a81 a81Var = (a81) view;
                a81Var.animate().cancel();
                a81Var.animate().alpha(0.0f).setDuration(150L).setListener(new cn2(this, (byte) 20));
                break;
            default:
                ((i56) viewGroup).s = null;
                a81 a81Var2 = (a81) view;
                a81Var2.animate().cancel();
                a81Var2.animate().alpha(0.0f).setDuration(150L).setListener(new ad5(this, (byte) 10));
                break;
        }
    }
}
