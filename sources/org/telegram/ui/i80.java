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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i80 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final Paint a;
    public final Path b;
    public final ImageView c;
    public final bi.t2 d;
    public GradientDrawable e;
    public final /* synthetic */ k80 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i80(k80 k80Var, Context context, org.telegram.ui.ActionBar.x1 x1Var) {
        super(context);
        this.f = k80Var;
        this.a = new Paint(1);
        this.b = new Path();
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.outline_search_1_24);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.l1(0.6f, k80Var.getThemedColor(i10)), PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.a6.d(24, 24.0f, 51, 11.0f, 8.0f, 11.0f, 8.0f));
        x1Var.setClipChildren(true);
        addView(x1Var, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 40.0f));
        bi.t2 t2Var = new bi.t2(this, context, 7);
        this.d = t2Var;
        t2Var.setHint(LocaleController.getString(R.string.Search));
        t2Var.setTextSize(1, 15.0f);
        t2Var.setCursorWidth(1.5f);
        t2Var.setInputType(t2Var.getInputType() | 176);
        t2Var.setSingleLine(true);
        t2Var.setBackground(null);
        t2Var.setVerticalScrollBarEnabled(false);
        t2Var.setHorizontalScrollBarEnabled(false);
        t2Var.setClipToPadding(true);
        t2Var.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(46.0f), 0);
        t2Var.setEllipsizeByGradient(true);
        t2Var.setImeOptions(268435462);
        t2Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        t2Var.addTextChangedListener(new h80(this));
        if (Build.VERSION.SDK_INT >= 35) {
            t2Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        t2Var.setTextColor(k80Var.getThemedColor(i10));
        t2Var.setHintTextColor(k80Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        addView(t2Var, w7.a6.d(-1, 40.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33f);
        Paint paint = this.a;
        paint.setShadowLayer(dpf2, 0.0f, dpf22, 285212672);
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        k80 k80Var = this.f;
        paint.setColor(k80Var.getThemedColor(i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f) + k80Var.b.e + AndroidUtilities.dp(3.0f));
        Path path = this.b;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
        GradientDrawable gradientDrawable = this.e;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(0, 0, getWidth(), Math.min(getHeight(), AndroidUtilities.dp(24.0f) + ((int) k80Var.b.e)));
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        int themedColor = this.f.getThemedColor(org.telegram.ui.ActionBar.j6.a7);
        this.e = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(1.0f, themedColor), org.telegram.ui.ActionBar.j6.l1(0.0f, themedColor)});
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(144.0f), TLObject.FLAG_30));
    }
}
