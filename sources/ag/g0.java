package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.ActionBar.w6;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g0 extends FrameLayout {
    public final u5 a;
    public final nh.p b;
    public final u5 c;
    public final p6 d;
    public boolean e;
    public TL_account.TL_businessChatLink f;

    public g0(Context context, p6 p6Var) {
        super(context);
        this.d = p6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.i0.L(36.0f);
        int i10 = t6.Ci;
        ShapeDrawable L2 = t6.L(L, t6.x0(null, i10, false));
        w6 N = a7.N(i10);
        imageView.setBackground(L2);
        a7.k(imageView, L2, N, null, null);
        imageView.setOnClickListener(new g(this, 1));
        addView(imageView, b6.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        u5 u5Var = new u5(context);
        this.a = u5Var;
        u5Var.setTextSize(15);
        a7.Y(u5Var, t6.G6, null);
        u5Var.setGravity(cd.X ? 5 : 3);
        addView(u5Var, b6.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        u5 u5Var2 = new u5(context);
        this.c = u5Var2;
        u5Var2.setTextSize(14);
        int i11 = t6.z6;
        a7.Y(u5Var2, i11, null);
        u5Var2.setGravity(cd.X ? 3 : 5);
        addView(u5Var2, b6.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        nh.p pVar = new nh.p(context);
        this.b = pVar;
        pVar.setTextSize(1, 13.0f);
        pVar.setMaxLines(1);
        pVar.setEllipsize(TextUtils.TruncateAt.END);
        a7.V(pVar, i11, p6Var);
        pVar.setGravity(cd.X ? 5 : 3);
        pVar.r = false;
        pVar.setUseAlphaForEmoji(false);
        zs.i(pVar);
        addView(pVar, b6.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            Paint W0 = t6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = t6.k0;
            }
            canvas.drawRect(org.telegram.messenger.i0.L(cd.X ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.i0.L(cd.X ? 64.0f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = cd.X;
        u5 u5Var = this.c;
        u5 u5Var2 = this.a;
        if (z11) {
            u5Var2.setPadding(u5Var.getTextWidth(), 0, 0, 0);
        } else {
            u5Var2.setPadding(0, 0, u5Var.getTextWidth(), 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }
}
