package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class j80 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final Paint a;
    public final Path b;
    public final ImageView c;
    public final di.h2 d;
    public GradientDrawable e;
    public final /* synthetic */ l80 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j80(l80 l80Var, Context context, org.telegram.ui.ActionBar.v1 v1Var) {
        super(context);
        this.f = l80Var;
        this.a = new Paint(1);
        this.b = new Path();
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.outline_search_1_24);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.l1(0.6f, l80Var.getThemedColor(i10)), PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.x5.d(24, 24.0f, 51, 11.0f, 8.0f, 11.0f, 8.0f));
        v1Var.setClipChildren(true);
        addView(v1Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 40.0f));
        di.h2 h2Var = new di.h2(this, context, 7);
        this.d = h2Var;
        h2Var.setHint(LocaleController.getString(R.string.Search));
        h2Var.setTextSize(1, 15.0f);
        h2Var.setCursorWidth(1.5f);
        h2Var.setInputType(h2Var.getInputType() | 176);
        h2Var.setSingleLine(true);
        h2Var.setBackground(null);
        h2Var.setVerticalScrollBarEnabled(false);
        h2Var.setHorizontalScrollBarEnabled(false);
        h2Var.setClipToPadding(true);
        h2Var.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(46.0f), 0);
        h2Var.setEllipsizeByGradient(true);
        h2Var.setImeOptions(268435462);
        h2Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        h2Var.addTextChangedListener(new i80(this));
        if (Build.VERSION.SDK_INT >= 35) {
            h2Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        h2Var.setTextColor(l80Var.getThemedColor(i10));
        h2Var.setHintTextColor(l80Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        addView(h2Var, w7.x5.d(-1, 40.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        d();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void d() {
        int themedColor = this.f.getThemedColor(org.telegram.ui.ActionBar.j6.a7);
        this.e = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(1.0f, themedColor), org.telegram.ui.ActionBar.j6.l1(0.0f, themedColor)});
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33f);
        Paint paint = this.a;
        paint.setShadowLayer(dpf2, 0.0f, dpf22, 285212672);
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        l80 l80Var = this.f;
        paint.setColor(l80Var.getThemedColor(i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f) + l80Var.b.e + AndroidUtilities.dp(3.0f));
        Path path = this.b;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
        GradientDrawable gradientDrawable = this.e;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(0, 0, getWidth(), Math.min(getHeight(), AndroidUtilities.dp(24.0f) + ((int) l80Var.b.e)));
            this.e.draw(canvas);
        }
        canvas.save();
        canvas.drawPath(path, paint);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.f.e) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(144.0f), TLObject.FLAG_30));
    }
}
