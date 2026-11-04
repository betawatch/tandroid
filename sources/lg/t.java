package lg;

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
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t extends FrameLayout {
    public final k5 a;
    public final yh.l b;
    public final k5 c;
    public final e6 d;
    public boolean e;
    public TL_account.TL_businessChatLink f;

    public t(Context context, e6 e6Var) {
        super(context);
        this.d = e6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(36.0f);
        int i3 = k6.Ci;
        ShapeDrawable L2 = k6.L(L, k6.x0(null, i3, false));
        n6 N = r6.N(i3);
        imageView.setBackground(L2);
        r6.k(imageView, L2, N, null, null);
        imageView.setOnClickListener(new ii.m(this, 11));
        addView(imageView, mf.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        k5 k5Var = new k5(context);
        this.a = k5Var;
        k5Var.setTextSize(15);
        r6.Y(k5Var, k6.G6, null);
        k5Var.setGravity(bd.a0 ? 5 : 3);
        addView(k5Var, mf.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        k5 k5Var2 = new k5(context);
        this.c = k5Var2;
        k5Var2.setTextSize(14);
        int i10 = k6.z6;
        r6.Y(k5Var2, i10, null);
        k5Var2.setGravity(bd.a0 ? 3 : 5);
        addView(k5Var2, mf.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        yh.l lVar = new yh.l(context);
        this.b = lVar;
        lVar.setTextSize(1, 13.0f);
        lVar.setMaxLines(1);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        r6.V(lVar, i10, e6Var);
        lVar.setGravity(bd.a0 ? 5 : 3);
        lVar.r = false;
        lVar.setUseAlphaForEmoji(false);
        hs.i(lVar);
        addView(lVar, mf.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            Paint W0 = k6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = k6.k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(bd.a0 ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.g0.L(bd.a0 ? 64.0f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        boolean z11 = bd.a0;
        k5 k5Var = this.c;
        k5 k5Var2 = this.a;
        if (z11) {
            k5Var2.setPadding(k5Var.getTextWidth(), 0, 0, 0);
        } else {
            k5Var2.setPadding(0, 0, k5Var.getTextWidth(), 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }
}
