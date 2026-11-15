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
import c8.ja;
import hi.p5;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class t extends FrameLayout {
    public final j5 a;
    public final xh.l b;
    public final j5 c;
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
        int i7 = j6.Fi;
        ShapeDrawable L2 = j6.L(L, j6.x0(null, i7, false));
        m6 M = q6.M(i7);
        imageView.setBackground(L2);
        q6.j(imageView, L2, M, null, null);
        imageView.setOnClickListener(new p5(this, 7));
        addView(imageView, ja.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        j5 j5Var = new j5(context);
        this.a = j5Var;
        j5Var.setTextSize(15);
        q6.X(j5Var, j6.G6, null);
        j5Var.setGravity(hd.a0 ? 5 : 3);
        addView(j5Var, ja.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        j5 j5Var2 = new j5(context);
        this.c = j5Var2;
        j5Var2.setTextSize(14);
        int i10 = j6.z6;
        q6.X(j5Var2, i10, null);
        j5Var2.setGravity(hd.a0 ? 3 : 5);
        addView(j5Var2, ja.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        xh.l lVar = new xh.l(context);
        this.b = lVar;
        lVar.setTextSize(1, 13.0f);
        lVar.setMaxLines(1);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        q6.U(lVar, i10, e6Var);
        lVar.setGravity(hd.a0 ? 5 : 3);
        lVar.r = false;
        lVar.setUseAlphaForEmoji(false);
        ns.i(lVar);
        addView(lVar, ja.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            Paint W0 = j6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = j6.k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(hd.a0 ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.g0.L(hd.a0 ? 64.0f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        boolean z11 = hd.a0;
        j5 j5Var = this.c;
        j5 j5Var2 = this.a;
        if (z11) {
            j5Var2.setPadding(j5Var.getTextWidth(), 0, 0, 0);
        } else {
            j5Var2.setPadding(0, 0, j5Var.getTextWidth(), 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }
}
