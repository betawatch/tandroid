package eg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class q0 extends FrameLayout {
    public final ImageView a;
    public final k5 b;
    public final dg.s1 c;
    public final k5 d;
    public p0 e;
    public o0 f;

    public q0(v0 v0Var, Context context, f6 f6Var) {
        super(context);
        int i10;
        int i11;
        i10 = ((g3) v0Var).backgroundPaddingLeft;
        i11 = ((g3) v0Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.Lj, f6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, b6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        k5 k5Var = new k5(context);
        this.b = k5Var;
        k5Var.setWidthWrapContent(true);
        k5Var.setTextColor(j6.v0(j6.j5, f6Var));
        k5Var.setTextSize(14);
        boolean z4 = LocaleController.isRTL;
        addView(k5Var, b6.d(-2, -2.0f, (z4 ? 5 : 3) | 16, z4 ? 30.0f : 60.0f, 0.0f, z4 ? 60.0f : 30.0f, 0.0f));
        k5 k5Var2 = new k5(context);
        this.d = k5Var2;
        k5Var2.setTextColor(-1);
        k5Var2.setWidthWrapContent(true);
        k5Var2.setTypeface(AndroidUtilities.bold());
        k5Var2.setTextSize(14);
        dg.s1 s1Var = new dg.s1(this, context, f6Var);
        this.c = s1Var;
        s1Var.setWillNotDraw(false);
        s1Var.addView(k5Var2, b6.e(-2, -2, 17));
        addView(s1Var, b6.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
