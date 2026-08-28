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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o70 extends FrameLayout implements org.telegram.ui.ActionBar.w5 {
    public final Paint a;
    public final Path b;
    public final ImageView c;
    public final fg.g d;
    public GradientDrawable e;
    public final /* synthetic */ q70 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o70(q70 q70Var, Context context, org.telegram.ui.ActionBar.w1 w1Var) {
        super(context);
        this.f = q70Var;
        this.a = new Paint(1);
        this.b = new Path();
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.outline_search_1_24);
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.l1(0.6f, q70Var.getThemedColor(i9)), PorterDuff.Mode.SRC_IN));
        addView(imageView, g7.e6.d(24, 24.0f, 51, 11.0f, 8.0f, 11.0f, 8.0f));
        w1Var.setClipChildren(true);
        addView(w1Var, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 40.0f));
        fg.g gVar = new fg.g(this, context, 8);
        this.d = gVar;
        gVar.setHint(LocaleController.getString(R.string.Search));
        gVar.setTextSize(1, 15.0f);
        gVar.setCursorWidth(1.5f);
        gVar.setInputType(gVar.getInputType() | 176);
        gVar.setSingleLine(true);
        gVar.setBackground(null);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setClipToPadding(true);
        gVar.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(46.0f), 0);
        gVar.setEllipsizeByGradient(true);
        gVar.setImeOptions(268435462);
        gVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        gVar.addTextChangedListener(new n70(this));
        if (Build.VERSION.SDK_INT >= 35) {
            gVar.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        gVar.setTextColor(q70Var.getThemedColor(i9));
        gVar.setHintTextColor(q70Var.getThemedColor(org.telegram.ui.ActionBar.f6.H6));
        addView(gVar, g7.e6.d(-1, 40.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        d();
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        int themedColor = this.f.getThemedColor(org.telegram.ui.ActionBar.f6.a7);
        this.e = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.f6.l1(1.0f, themedColor), org.telegram.ui.ActionBar.f6.l1(0.0f, themedColor)});
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33f);
        Paint paint = this.a;
        paint.setShadowLayer(dpf2, 0.0f, dpf22, 285212672);
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        q70 q70Var = this.f;
        paint.setColor(q70Var.getThemedColor(i9));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f) + q70Var.b.e + AndroidUtilities.dp(3.0f));
        Path path = this.b;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
        GradientDrawable gradientDrawable = this.e;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(0, 0, getWidth(), Math.min(getHeight(), AndroidUtilities.dp(24.0f) + ((int) q70Var.b.e)));
            this.e.draw(canvas);
        }
        canvas.save();
        canvas.drawPath(path, paint);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f.e) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(144.0f), TLObject.FLAG_30));
    }
}
