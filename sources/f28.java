// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f28 extends h28 {
    public int H;
    public final /* synthetic */ d38 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f28(d38 d38Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.I = d38Var;
        this.H = 0;
    }

    @Override // h28
    public final void a() {
        d38 d38Var = this.I;
        if (d38Var.getParentActivity() != null) {
            gm.k3(d38Var.getParentActivity(), d38Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.H != actionBarButtonColor) {
            ImageView imageView = d38Var.K;
            if (imageView != null) {
                this.H = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = d38Var.L;
            if (imageView2 != null) {
                this.H = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        d38Var.K0();
        d38Var.D0();
    }
}
