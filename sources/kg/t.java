package kg;

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
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t extends FrameLayout {
    public final m5 a;
    public final xh.l b;
    public final m5 c;
    public final h6 d;
    public boolean e;
    public TL_account.TL_businessChatLink f;

    public t(Context context, h6 h6Var) {
        super(context);
        this.d = h6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(36.0f);
        int i7 = m6.Ci;
        ShapeDrawable L2 = m6.L(L, m6.x0(null, i7, false));
        p6 M = t6.M(i7);
        imageView.setBackground(L2);
        t6.j(imageView, L2, M, null, null);
        imageView.setOnClickListener(new ii.g(this, 8));
        addView(imageView, ha.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        m5 m5Var = new m5(context);
        this.a = m5Var;
        m5Var.setTextSize(15);
        t6.X(m5Var, m6.G6, null);
        m5Var.setGravity(id.a0 ? 5 : 3);
        addView(m5Var, ha.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        m5 m5Var2 = new m5(context);
        this.c = m5Var2;
        m5Var2.setTextSize(14);
        int i10 = m6.z6;
        t6.X(m5Var2, i10, null);
        m5Var2.setGravity(id.a0 ? 3 : 5);
        addView(m5Var2, ha.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        xh.l lVar = new xh.l(context);
        this.b = lVar;
        lVar.setTextSize(1, 13.0f);
        lVar.setMaxLines(1);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        t6.U(lVar, i10, h6Var);
        lVar.setGravity(id.a0 ? 5 : 3);
        lVar.r = false;
        lVar.setUseAlphaForEmoji(false);
        qs.i(lVar);
        addView(lVar, ha.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            Paint W0 = m6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = m6.k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(id.a0 ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.g0.L(id.a0 ? 64.0f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        boolean z10 = id.a0;
        m5 m5Var = this.c;
        m5 m5Var2 = this.a;
        if (z10) {
            m5Var2.setPadding(m5Var.getTextWidth(), 0, 0, 0);
        } else {
            m5Var2.setPadding(0, 0, m5Var.getTextWidth(), 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }
}
