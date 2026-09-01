package fg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class q0 extends FrameLayout {
    public final ImageView a;
    public final l5 b;
    public final eg.q1 c;
    public final l5 d;
    public p0 e;
    public o0 f;

    public q0(v0 v0Var, Context context, g6 g6Var) {
        super(context);
        int i10;
        int i11;
        i10 = ((h3) v0Var).backgroundPaddingLeft;
        i11 = ((h3) v0Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.Lj, g6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, c6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        l5 l5Var = new l5(context);
        this.b = l5Var;
        l5Var.setWidthWrapContent(true);
        l5Var.setTextColor(k6.v0(k6.j5, g6Var));
        l5Var.setTextSize(14);
        boolean z4 = LocaleController.isRTL;
        addView(l5Var, c6.d(-2, -2.0f, (z4 ? 5 : 3) | 16, z4 ? 30.0f : 60.0f, 0.0f, z4 ? 60.0f : 30.0f, 0.0f));
        l5 l5Var2 = new l5(context);
        this.d = l5Var2;
        l5Var2.setTextColor(-1);
        l5Var2.setWidthWrapContent(true);
        l5Var2.setTypeface(AndroidUtilities.bold());
        l5Var2.setTextSize(14);
        eg.q1 q1Var = new eg.q1(this, context, g6Var);
        this.c = q1Var;
        q1Var.setWillNotDraw(false);
        q1Var.addView(l5Var2, c6.e(-2, -2, 17));
        addView(q1Var, c6.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
