package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class l10 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public final org.telegram.ui.Components.f6 F;
    public final Paint G;
    public final /* synthetic */ FiltersSetupActivity H;
    public final org.telegram.ui.ActionBar.n5 a;
    public final TextView b;
    public final ImageView c;
    public int d;
    public int e;
    public final View f;
    public final ImageView h;
    public final org.telegram.ui.Components.s30 n;
    public boolean r;
    public final org.telegram.ui.Components.ca0 s;
    public boolean v;
    public float w;
    public MessagesController.DialogFilter x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l10(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        this.H = filtersSetupActivity;
        this.d = -2;
        this.e = -1;
        this.r = false;
        this.F = new org.telegram.ui.Components.f6(this, 0L, 420L, org.telegram.ui.Components.bs.h);
        this.G = new Paint(1);
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.list_reorder);
        int i10 = org.telegram.ui.ActionBar.k6.Uh;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, null, mode);
        imageView.setContentDescription(LocaleController.getString(R.string.FilterReorder));
        imageView.setClickable(true);
        addView(imageView, w7.z5.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        addView(view, w7.z5.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.a = n5Var;
        n5Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.G6, null);
        n5Var.setTextSize(16);
        n5Var.setMaxLines(1);
        n5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
        org.telegram.ui.ActionBar.r6.z(this, drawable, i10, null, mode);
        n5Var.i(drawable);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        g6Var = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity).resourceProvider;
        n5Var.setEmojiColor(org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        boolean z10 = LocaleController.isRTL;
        addView(n5Var, w7.z5.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 80.0f : 64.0f, 10.0f, z10 ? 64.0f : 80.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.z6, null);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z11 = LocaleController.isRTL;
        addView(textView, w7.z5.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 80.0f : 64.0f, 35.0f, z11 ? 64.0f : 80.0f, 0.0f));
        textView.setVisibility(8);
        org.telegram.ui.Components.ca0 ca0Var = new org.telegram.ui.Components.ca0();
        this.s = ca0Var;
        ca0Var.D = true;
        ca0Var.t = 2.0f;
        int i12 = org.telegram.ui.ActionBar.k6.i6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        ca0Var.g(org.telegram.ui.ActionBar.k6.o1(0.4f, x02), org.telegram.ui.ActionBar.k6.o1(1.0f, x02), org.telegram.ui.ActionBar.k6.o1(0.9f, x02), org.telegram.ui.ActionBar.k6.o1(1.7f, x02));
        int dp = AndroidUtilities.dp(1.0f);
        ca0Var.x.setStrokeWidth(dp);
        ca0Var.k(40.0f);
        org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(this, context, dp, 1);
        this.n = s30Var;
        ca0Var.setCallback(s30Var);
        s30Var.setFocusable(false);
        s30Var.setScaleType(scaleType);
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(x02, 1, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        s30Var.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(s30Var, g02, null, O, null);
        org.telegram.ui.ActionBar.r6.t(s30Var, i10, null, mode);
        s30Var.setContentDescription(LocaleController.getString(R.string.FilterShare));
        s30Var.setVisibility(8);
        s30Var.setImageResource(R.drawable.msg_link_folder);
        org.telegram.ui.ActionBar.r6.t(s30Var, i10, null, mode);
        boolean z12 = LocaleController.isRTL;
        addView(s30Var, w7.z5.d(40, 40.0f, (z12 ? 3 : 5) | 16, z12 ? 52.0f : 6.0f, 0.0f, z12 ? 6.0f : 52.0f, 0.0f));
        s30Var.setOnClickListener(new a(this, 26));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i12);
        imageView2.setBackground(g03);
        org.telegram.ui.ActionBar.r6.k(imageView2, g03, null, O2, null);
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, null, mode);
        imageView2.setImageResource(R.drawable.msg_actions);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        addView(imageView2, w7.z5.d(40, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public MessagesController.DialogFilter getCurrentFilter() {
        return this.x;
    }

    public float getDraggingProgress() {
        return this.F.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float e = this.F.e(this.E);
        if (e > 0.0f) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
            Paint paint = this.G;
            paint.setColor(x02);
            paint.setAlpha((int) (255.0f * e));
            paint.setShadowLayer(AndroidUtilities.dp(12.0f) * e, 0.0f, AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.k6.o1(e, 301989888));
            float dp = AndroidUtilities.dp(8.0f) * e;
            float dp2 = AndroidUtilities.dp(12.0f) * e;
            canvas.drawRoundRect(dp, 0.0f, getWidth() - dp, getHeight(), dp2, dp2, paint);
        }
        if (this.v && e < 1.0f) {
            int alpha = org.telegram.ui.ActionBar.k6.k0.getAlpha();
            org.telegram.ui.ActionBar.k6.k0.setAlpha((int) ((1.0f - e) * alpha));
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(62.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
            org.telegram.ui.ActionBar.k6.k0.setAlpha(alpha);
        }
        MessagesController.DialogFilter dialogFilter = this.x;
        if (dialogFilter != null) {
            boolean z10 = dialogFilter.locked;
            if (z10) {
                float f7 = this.w;
                if (f7 != 1.0f) {
                    this.w = f7 + 0.10666667f;
                    invalidate();
                }
            }
            if (!z10) {
                float f10 = this.w;
                if (f10 != 0.0f) {
                    this.w = f10 - 0.10666667f;
                    invalidate();
                }
            }
        }
        float clamp = Utilities.clamp(this.w, 1.0f, 0.0f);
        this.w = clamp;
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        n5Var.setRightDrawableScale(clamp);
        n5Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }

    public void setDragging(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        invalidate();
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.c.setOnTouchListener(onTouchListener);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.ActionBar.g6 g6Var;
        try {
            org.telegram.ui.ActionBar.n5 n5Var = this.a;
            if (n5Var != null) {
                int i10 = org.telegram.ui.ActionBar.k6.Oh;
                g6Var = ((org.telegram.ui.ActionBar.o2) this.H).resourceProvider;
                n5Var.setEmojiColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
