// default package

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class n11 extends FrameLayout {
    public final /* synthetic */ o11 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n11(o11 o11Var, Context context) {
        super(context);
        this.a = o11Var;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
        this.a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.a.b;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        o11 o11Var = this.a;
        super.removeView(view);
        try {
            o11Var.dismiss();
        } catch (Exception unused) {
        }
        v21.h(o11Var.a);
    }

    public void setTouchable(boolean z) {
        o11 o11Var = this.a;
        WindowManager.LayoutParams layoutParams = o11Var.b;
        if (layoutParams == null) {
            return;
        }
        int i = layoutParams.flags;
        if (z) {
            layoutParams.flags = i & (-17);
        } else {
            layoutParams.flags = i | 16;
        }
        o11Var.getWindow().setAttributes(layoutParams);
    }
}
