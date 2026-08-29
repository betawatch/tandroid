package cg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q0 extends FrameLayout {
    public final ImageView a;
    public final h5 b;
    public final bg.u1 c;
    public final h5 d;
    public p0 e;
    public o0 f;

    public q0(v0 v0Var, Context context, c6 c6Var) {
        super(context);
        int i10;
        int i11;
        i10 = ((f3) v0Var).backgroundPaddingLeft;
        i11 = ((f3) v0Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.Lj, c6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, f6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        h5 h5Var = new h5(context);
        this.b = h5Var;
        h5Var.setWidthWrapContent(true);
        h5Var.setTextColor(g6.v0(g6.j5, c6Var));
        h5Var.setTextSize(14);
        boolean z10 = LocaleController.isRTL;
        addView(h5Var, f6.d(-2, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 30.0f : 60.0f, 0.0f, z10 ? 60.0f : 30.0f, 0.0f));
        h5 h5Var2 = new h5(context);
        this.d = h5Var2;
        h5Var2.setTextColor(-1);
        h5Var2.setWidthWrapContent(true);
        h5Var2.setTypeface(AndroidUtilities.bold());
        h5Var2.setTextSize(14);
        bg.u1 u1Var = new bg.u1(this, context, c6Var);
        this.c = u1Var;
        u1Var.setWillNotDraw(false);
        u1Var.addView(h5Var2, f6.e(-2, -2, 17));
        addView(u1Var, f6.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
