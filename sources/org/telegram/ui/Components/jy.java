package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class jy extends FrameLayout implements org.telegram.ui.ActionBar.b6, NotificationCenter.NotificationCenterDelegate {
    public int E;
    public AnimatorSet F;
    public final /* synthetic */ tz G;
    public int a;
    public int b;
    public final bk0 c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final TextView e;
    public final FrameLayout f;
    public final TextView h;
    public final TextView n;
    public final sg.p0 r;
    public TLRPC.TL_inputStickerSetID s;
    public TLRPC.TL_inputStickerSetID v;
    public fy w;
    public boolean x;
    public Paint y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy(tz tzVar, Context context) {
        super(context);
        this.G = tzVar;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.a;
        bk0 bk0Var = new bk0(context);
        this.c = bk0Var;
        bk0Var.f(R.raw.unlock_icon, 24, 24, null);
        int i10 = org.telegram.ui.ActionBar.k6.Te;
        org.telegram.ui.ActionBar.g6 g6Var = tzVar.Z1;
        org.telegram.ui.ActionBar.r6.t(bk0Var, i10, g6Var, PorterDuff.Mode.SRC_ATOP);
        addView(bk0Var, w7.z5.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        n5Var.setTextSize(15);
        org.telegram.ui.ActionBar.r6.Z(n5Var, i10, g6Var);
        n5Var.setTypeface(AndroidUtilities.bold());
        n5Var.setOnClickListener(new iy(this, 0));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.r6.W(textView, i10, g6Var);
        textView.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Me;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.o1(0.12f, tzVar.A(i11)));
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.12f, i11);
        textView.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(textView, c02, M, null, g6Var);
        textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f));
        textView.setText(LocaleController.getString(R.string.GroupEmoji));
        n5Var.setEllipsizeByGradient(true);
        addView(n5Var, w7.z5.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, w7.z5.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new iy(this, 1));
        addView(frameLayout, w7.z5.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.Add));
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.Sh, g6Var);
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        textView2.setBackground(org.telegram.ui.ActionBar.a6.d(new float[]{16.0f}, tzVar.A(i12), tzVar.A(org.telegram.ui.ActionBar.k6.Qh)));
        textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new iy(this, 2));
        frameLayout.addView(textView2, w7.z5.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.n = textView3;
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView3);
        textView3.setText(LocaleController.getString(R.string.StickersRemove));
        org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.Rh, g6Var);
        textView3.setBackground(org.telegram.ui.ActionBar.a6.d(new float[]{16.0f}, 0, tzVar.A(i12) & 452984831));
        textView3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(AndroidUtilities.dp(4.0f));
        textView3.setOnClickListener(new iy(this, 3));
        frameLayout.addView(textView3, w7.z5.h(-2.0f, 26.0f, 8388661));
        sg.p0 p0Var = new sg.p0(AndroidUtilities.dp(16.0f), context, g6Var, false);
        this.r = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        p0Var.a(LocaleController.getString(R.string.Unlock), new iy(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = dp2;
            marginLayoutParams.width = dp2;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) p0Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = AndroidUtilities.dp(5.0f);
            marginLayoutParams2.topMargin = AndroidUtilities.dp(-0.5f);
            p0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        this.f.addView(this.r, w7.z5.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        char c10;
        float f7;
        fy fyVar = this.w;
        if (fyVar == null) {
            return;
        }
        boolean z11 = fyVar.f;
        tz tzVar = this.G;
        int i10 = (this.w.e || UserConfig.getInstance(tzVar.c1).isPremium() || tzVar.U0) ? this.w.g ? z11 || tzVar.p1.contains(Long.valueOf(fyVar.b.id)) ? 3 : 2 : 0 : 1;
        if ((i10 == 0) != (this.E == 0)) {
            requestLayout();
        }
        this.E = i10;
        AnimatorSet animatorSet = this.F;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.F = null;
        }
        boolean z12 = i10 == 1;
        sg.p0 p0Var = this.r;
        p0Var.setEnabled(z12);
        boolean z13 = i10 == 2;
        TextView textView = this.h;
        textView.setEnabled(z13);
        boolean z14 = i10 == 3;
        TextView textView2 = this.n;
        textView2.setEnabled(z14);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        bk0 bk0Var = this.c;
        if (!z10) {
            bk0Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            bk0Var.setTranslationX(i10 == 1 ? 0.0f : -AndroidUtilities.dp(16.0f));
            n5Var.setTranslationX(i10 == 1 ? AndroidUtilities.dp(16.0f) : 0.0f);
            p0Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            p0Var.setScaleX(i10 == 1 ? 1.0f : 0.6f);
            p0Var.setScaleY(i10 == 1 ? 1.0f : 0.6f);
            p0Var.setVisibility(i10 == 1 ? 0 : 8);
            textView.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            textView.setScaleX(i10 == 2 ? 1.0f : 0.6f);
            textView.setScaleY(i10 == 2 ? 1.0f : 0.6f);
            textView.setVisibility(i10 == 2 ? 0 : 8);
            textView2.setAlpha(i10 == 3 ? 1.0f : 0.0f);
            textView2.setScaleX(i10 == 3 ? 1.0f : 0.6f);
            textView2.setScaleY(i10 == 3 ? 1.0f : 0.6f);
            textView2.setVisibility(i10 == 3 ? 0 : 8);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.F = animatorSet2;
        if (i10 == 1) {
            f7 = 0.0f;
            c10 = 0;
        } else {
            c10 = 0;
            f7 = -AndroidUtilities.dp(16.0f);
        }
        float[] fArr = new float[1];
        fArr[c10] = f7;
        Property property = FrameLayout.TRANSLATION_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bk0Var, (Property<bk0, Float>) property, fArr);
        float[] fArr2 = new float[1];
        fArr2[c10] = i10 == 1 ? 1.0f : 0.0f;
        Property property2 = FrameLayout.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bk0Var, (Property<bk0, Float>) property2, fArr2);
        float[] fArr3 = new float[1];
        fArr3[c10] = i10 == 1 ? AndroidUtilities.dp(16.0f) : 0.0f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(n5Var, (Property<org.telegram.ui.ActionBar.n5, Float>) property, fArr3);
        float[] fArr4 = new float[1];
        fArr4[c10] = i10 == 1 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(p0Var, (Property<sg.p0, Float>) property2, fArr4);
        float[] fArr5 = new float[1];
        fArr5[c10] = i10 == 1 ? 1.0f : 0.6f;
        Property property3 = FrameLayout.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(p0Var, (Property<sg.p0, Float>) property3, fArr5);
        float[] fArr6 = new float[1];
        fArr6[c10] = i10 == 1 ? 1.0f : 0.6f;
        Property property4 = FrameLayout.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(p0Var, (Property<sg.p0, Float>) property4, fArr6);
        float[] fArr7 = new float[1];
        fArr7[c10] = i10 == 2 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr7);
        float[] fArr8 = new float[1];
        fArr8[c10] = i10 == 2 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, fArr8);
        float[] fArr9 = new float[1];
        fArr9[c10] = i10 == 2 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, fArr9);
        float[] fArr10 = new float[1];
        fArr10[c10] = i10 == 3 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr10);
        float[] fArr11 = new float[1];
        fArr11[c10] = i10 == 3 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr11);
        float[] fArr12 = new float[1];
        fArr12[c10] = i10 == 3 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr12);
        Animator[] animatorArr = new Animator[12];
        animatorArr[c10] = ofFloat;
        animatorArr[1] = ofFloat2;
        animatorArr[2] = ofFloat3;
        animatorArr[3] = ofFloat4;
        animatorArr[4] = ofFloat5;
        animatorArr[5] = ofFloat6;
        animatorArr[6] = ofFloat7;
        animatorArr[7] = ofFloat8;
        animatorArr[8] = ofFloat9;
        animatorArr[9] = ofFloat10;
        animatorArr[10] = ofFloat11;
        animatorArr[11] = ofFloat12;
        animatorSet2.playTogether(animatorArr);
        this.F.addListener(new gi.p2(this, i10, 7));
        this.F.setDuration(250L);
        this.F.setInterpolator(new OvershootInterpolator(1.02f));
        this.F.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet stickerSetById;
        TLRPC.TL_messages_stickerSet stickerSetById2;
        tz tzVar = this.G;
        int i12 = tzVar.c1;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            if (this.s != null && (stickerSetById2 = MediaDataController.getInstance(i12).getStickerSetById(this.s.id)) != null && stickerSetById2.set != null) {
                org.telegram.ui.ActionBar.o2 o2Var = tzVar.Y1;
                if (o2Var == null) {
                    o2Var = new ai.a5(this, 7);
                }
                aw.g0(o2Var, stickerSetById2, true, null, new zp(this, 15));
                this.s = null;
            }
            if (this.v == null || (stickerSetById = MediaDataController.getInstance(i12).getStickerSetById(this.v.id)) == null || stickerSetById.set == null) {
                return;
            }
            org.telegram.ui.ActionBar.o2 o2Var2 = tzVar.Y1;
            if (o2Var2 == null) {
                o2Var2 = new ai.a5(this, 7);
            }
            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
            yt ytVar = new yt(4, this, stickerSetById);
            Pattern pattern = aw.V;
            if (o2Var3.getFragmentView() != null) {
                MediaDataController.getInstance(o2Var3.getCurrentAccount()).toggleStickerSet(o2Var3.getFragmentView().getContext(), stickerSetById, 0, o2Var3, true, true, ytVar, false);
            }
            this.v = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.G.c1).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.x) {
            if (this.y == null) {
                Paint paint = new Paint(1);
                this.y = paint;
                paint.setStrokeWidth(1.0f);
                this.y.setColor(this.G.A(org.telegram.ui.ActionBar.k6.d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.y);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(11.0f) + this.f.getWidth();
        TextView textView = this.e;
        int measuredWidth = dp + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() : 0);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        n5Var.setRightPadding(measuredWidth);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(AndroidUtilities.dp(4.0f) + n5Var.getTextWidth());
            float dp2 = AndroidUtilities.dp(4.0f) + (n5Var.getMaxTextWidth() - measuredWidth);
            if (textView.getTranslationX() > dp2) {
                textView.setTranslationX(dp2);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).topMargin = AndroidUtilities.dp(this.E == 0 ? 10.0f : 15.0f);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.E == 0 ? 32.0f : 42.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        tz tzVar = this.G;
        try {
            int A = tzVar.A(org.telegram.ui.ActionBar.k6.Oh);
            int A2 = tzVar.A(org.telegram.ui.ActionBar.k6.Qh);
            if (A == this.a) {
                if (A2 != this.b) {
                }
                invalidate();
            }
            this.a = A;
            this.b = A2;
            TextView textView = this.h;
            if (textView != null) {
                org.telegram.ui.ActionBar.k6.E1(textView.getBackground(), A, false);
                org.telegram.ui.ActionBar.k6.E1(textView.getBackground(), A2, true);
                textView.invalidate();
            }
            TextView textView2 = this.n;
            if (textView2 != null) {
                org.telegram.ui.ActionBar.k6.E1(textView2.getBackground(), A & 452984831, true);
                textView2.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
