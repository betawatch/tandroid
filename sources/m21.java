// default package

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m21 extends FrameLayout {
    public final /* synthetic */ n21 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m21(n21 n21Var, Context context) {
        super(context);
        this.a = n21Var;
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
        n21 n21Var = this.a;
        super.removeView(view);
        try {
            n21Var.dismiss();
        } catch (Exception unused) {
        }
        u31.h(n21Var.a);
    }

    public void setTouchable(boolean z) {
        n21 n21Var = this.a;
        WindowManager.LayoutParams layoutParams = n21Var.b;
        if (layoutParams == null) {
            return;
        }
        int i = layoutParams.flags;
        if (z) {
            layoutParams.flags = i & (-17);
        } else {
            layoutParams.flags = i | 16;
        }
        n21Var.getWindow().setAttributes(layoutParams);
    }
}
