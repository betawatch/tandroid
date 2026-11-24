// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class c08 extends e08 {
    public int H;
    public final /* synthetic */ a18 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c08(a18 a18Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.I = a18Var;
        this.H = 0;
    }

    @Override // e08
    public final void a() {
        a18 a18Var = this.I;
        if (a18Var.getParentActivity() != null) {
            gl.k3(a18Var.getParentActivity(), a18Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.H != actionBarButtonColor) {
            ImageView imageView = a18Var.K;
            if (imageView != null) {
                this.H = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = a18Var.L;
            if (imageView2 != null) {
                this.H = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        a18Var.J0();
        a18Var.C0();
    }
}
