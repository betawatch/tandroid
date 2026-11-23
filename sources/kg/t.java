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
import c8.na;
import hi.z4;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t extends FrameLayout {
    public final n5 a;
    public final xh.l b;
    public final n5 c;
    public final i6 d;
    public boolean e;
    public TL_account.TL_businessChatLink f;

    public t(Context context, i6 i6Var) {
        super(context);
        this.d = i6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(36.0f);
        int i7 = n6.Fi;
        ShapeDrawable L2 = n6.L(L, n6.x0(null, i7, false));
        q6 M = u6.M(i7);
        imageView.setBackground(L2);
        u6.j(imageView, L2, M, null, null);
        imageView.setOnClickListener(new z4(this, 8));
        addView(imageView, na.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        n5 n5Var = new n5(context);
        this.a = n5Var;
        n5Var.setTextSize(15);
        u6.X(n5Var, n6.G6, null);
        n5Var.setGravity(gd.a0 ? 5 : 3);
        addView(n5Var, na.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        n5 n5Var2 = new n5(context);
        this.c = n5Var2;
        n5Var2.setTextSize(14);
        int i10 = n6.z6;
        u6.X(n5Var2, i10, null);
        n5Var2.setGravity(gd.a0 ? 3 : 5);
        addView(n5Var2, na.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        xh.l lVar = new xh.l(context);
        this.b = lVar;
        lVar.setTextSize(1, 13.0f);
        lVar.setMaxLines(1);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        u6.U(lVar, i10, i6Var);
        lVar.setGravity(gd.a0 ? 5 : 3);
        lVar.r = false;
        lVar.setUseAlphaForEmoji(false);
        ks.i(lVar);
        addView(lVar, na.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            Paint W0 = n6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = n6.k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(gd.a0 ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.g0.L(gd.a0 ? 64.0f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        boolean z11 = gd.a0;
        n5 n5Var = this.c;
        n5 n5Var2 = this.a;
        if (z11) {
            n5Var2.setPadding(n5Var.getTextWidth(), 0, 0, 0);
        } else {
            n5Var2.setPadding(0, 0, n5Var.getTextWidth(), 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }
}
