package kg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m0 extends FrameLayout {
    public final ImageView a;
    public final u5 b;
    public final jg.b1 c;
    public final u5 d;
    public l0 e;
    public k0 f;

    public m0(q0 q0Var, Context context, p6 p6Var) {
        super(context);
        int i10 = q0.O2;
        int i11 = q0Var.t0;
        setPadding(i11, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        a7.t(imageView, t6.zk, p6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, b6.d(24, 24.0f, (cd.X ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        u5 u5Var = new u5(context);
        this.b = u5Var;
        u5Var.setWidthWrapContent(true);
        a7.Y(u5Var, t6.j5, p6Var);
        u5Var.setTextSize(14);
        boolean z10 = cd.X;
        addView(u5Var, b6.d(-2, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 30.0f : 60.0f, 0.0f, z10 ? 60.0f : 30.0f, 0.0f));
        u5 u5Var2 = new u5(context);
        this.d = u5Var2;
        u5Var2.setTextColor(-1);
        u5Var2.setWidthWrapContent(true);
        u5Var2.setTypeface(org.telegram.messenger.i0.o());
        u5Var2.setTextSize(14);
        jg.b1 b1Var = new jg.b1(this, context, p6Var);
        this.c = b1Var;
        b1Var.setWillNotDraw(false);
        b1Var.addView(u5Var2, b6.e(-2, -2, 17));
        addView(b1Var, b6.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
