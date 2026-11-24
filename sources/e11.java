// default package

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class e11 extends FrameLayout {
    public final /* synthetic */ f11 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e11(f11 f11Var, Context context) {
        super(context);
        this.a = f11Var;
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
        f11 f11Var = this.a;
        super.removeView(view);
        try {
            f11Var.dismiss();
        } catch (Exception unused) {
        }
        m21.h(f11Var.a);
    }

    public void setTouchable(boolean z) {
        f11 f11Var = this.a;
        WindowManager.LayoutParams layoutParams = f11Var.b;
        if (layoutParams == null) {
            return;
        }
        int i = layoutParams.flags;
        if (z) {
            layoutParams.flags = i & (-17);
        } else {
            layoutParams.flags = i | 16;
        }
        f11Var.getWindow().setAttributes(layoutParams);
    }
}
