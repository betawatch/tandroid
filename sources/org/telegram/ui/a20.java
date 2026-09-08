package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class a20 extends FrameLayout {
    public final /* synthetic */ FiltersSetupActivity E;
    public final org.telegram.ui.ActionBar.j5 a;
    public final TextView b;
    public final ImageView c;
    public int d;
    public int e;
    public final View f;
    public final ImageView h;
    public final org.telegram.ui.Components.j30 n;
    public boolean r;
    public final org.telegram.ui.Components.h90 s;
    public boolean v;
    public float w;
    public MessagesController.DialogFilter x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a20(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.E = filtersSetupActivity;
        this.d = -2;
        this.e = -1;
        this.r = false;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.list_reorder);
        int i10 = org.telegram.ui.ActionBar.j6.Uh;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setContentDescription(LocaleController.getString(R.string.FilterReorder));
        imageView.setClickable(true);
        addView(imageView, w7.x5.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        addView(view, w7.x5.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.a = j5Var;
        j5Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        j5Var.setTextSize(16);
        j5Var.setMaxLines(1);
        j5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), mode));
        j5Var.i(drawable);
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        f6Var = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity).resourceProvider;
        j5Var.setEmojiColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        boolean z10 = LocaleController.isRTL;
        addView(j5Var, w7.x5.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 80.0f : 64.0f, 10.0f, z10 ? 64.0f : 80.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z6, false));
        textView.setTextSize(1, 13.0f);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z11 = LocaleController.isRTL;
        addView(textView, w7.x5.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 80.0f : 64.0f, 35.0f, z11 ? 64.0f : 80.0f, 0.0f));
        textView.setVisibility(8);
        org.telegram.ui.Components.h90 h90Var = new org.telegram.ui.Components.h90();
        this.s = h90Var;
        h90Var.C = true;
        h90Var.t = 2.0f;
        int i12 = org.telegram.ui.ActionBar.j6.i6;
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        h90Var.f(org.telegram.ui.ActionBar.j6.l1(0.4f, w03), org.telegram.ui.ActionBar.j6.l1(1.0f, w03), org.telegram.ui.ActionBar.j6.l1(0.9f, w03), org.telegram.ui.ActionBar.j6.l1(1.7f, w03));
        int dp = AndroidUtilities.dp(1.0f);
        h90Var.w.setStrokeWidth(dp);
        h90Var.j(40.0f);
        org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(this, context, dp, 1);
        this.n = j30Var;
        h90Var.setCallback(j30Var);
        j30Var.setFocusable(false);
        j30Var.setScaleType(scaleType);
        j30Var.setBackground(org.telegram.ui.ActionBar.j6.f0(w03, 1, -1));
        j30Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), mode));
        j30Var.setContentDescription(LocaleController.getString(R.string.FilterShare));
        j30Var.setVisibility(8);
        j30Var.setImageResource(R.drawable.msg_link_folder);
        j30Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), mode));
        boolean z12 = LocaleController.isRTL;
        addView(j30Var, w7.x5.d(40, 40.0f, (z12 ? 3 : 5) | 16, z12 ? 52.0f : 6.0f, 0.0f, z12 ? 6.0f : 52.0f, 0.0f));
        j30Var.setOnClickListener(new a(this, 26));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, -1));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), mode));
        imageView2.setImageResource(R.drawable.msg_actions);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        addView(imageView2, w7.x5.d(40, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public MessagesController.DialogFilter getCurrentFilter() {
        return this.x;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.v) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(62.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
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
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        j5Var.setRightDrawableScale(clamp);
        j5Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.c.setOnTouchListener(onTouchListener);
    }
}
