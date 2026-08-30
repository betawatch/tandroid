package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class zx extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ kz B;
    public final jj0 a;
    public final org.telegram.ui.ActionBar.k5 b;
    public final TextView c;
    public final FrameLayout d;
    public final TextView e;
    public final TextView f;
    public final eg.c1 h;
    public TLRPC.TL_inputStickerSetID n;
    public TLRPC.TL_inputStickerSetID r;
    public vx s;
    public boolean v;
    public Paint w;
    public int x;
    public AnimatorSet y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(kz kzVar, Context context) {
        super(context);
        this.B = kzVar;
        jj0 jj0Var = new jj0(context);
        this.a = jj0Var;
        jj0Var.f(R.raw.unlock_icon, 24, 24, null);
        int i10 = org.telegram.ui.ActionBar.j6.Te;
        jj0Var.setColorFilter(kzVar.A(i10));
        addView(jj0Var, k7.b6.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var;
        k5Var.setTextSize(15);
        k5Var.setTextColor(kzVar.A(i10));
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setOnClickListener(new yx(this, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(kzVar.A(i10));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.j6.l1(0.12f, kzVar.A(org.telegram.ui.ActionBar.j6.Me))));
        textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f));
        textView.setText(LocaleController.getString(R.string.GroupEmoji));
        k5Var.setEllipsizeByGradient(true);
        addView(k5Var, k7.b6.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, k7.b6.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new yx(this, 1));
        addView(frameLayout, k7.b6.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        org.telegram.ui.yh.p(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.Add));
        textView2.setTextColor(kzVar.A(org.telegram.ui.ActionBar.j6.Sh));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        textView2.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{16.0f}, kzVar.A(i11), kzVar.A(org.telegram.ui.ActionBar.j6.Qh)));
        textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new yx(this, 2));
        frameLayout.addView(textView2, k7.b6.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.f = textView3;
        org.telegram.ui.yh.p(14.0f, 1, textView3);
        textView3.setText(LocaleController.getString(R.string.StickersRemove));
        textView3.setTextColor(kzVar.A(org.telegram.ui.ActionBar.j6.Rh));
        textView3.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{16.0f}, 0, kzVar.A(i11) & 452984831));
        textView3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(AndroidUtilities.dp(4.0f));
        textView3.setOnClickListener(new yx(this, 3));
        frameLayout.addView(textView3, k7.b6.h(-2.0f, 26.0f, 8388661));
        eg.c1 c1Var = new eg.c1(AndroidUtilities.dp(16.0f), context, kzVar.W1, false);
        this.h = c1Var;
        c1Var.setIcon(R.raw.unlock_icon);
        c1Var.a(LocaleController.getString(R.string.Unlock), new yx(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int dp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = dp;
            marginLayoutParams.width = dp;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c1Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = AndroidUtilities.dp(5.0f);
            marginLayoutParams2.topMargin = AndroidUtilities.dp(-0.5f);
            c1Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        this.d.addView(this.h, k7.b6.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z4) {
        char c3;
        float f10;
        vx vxVar = this.s;
        if (vxVar == null) {
            return;
        }
        boolean z10 = vxVar.f;
        kz kzVar = this.B;
        int i10 = (this.s.e || UserConfig.getInstance(kzVar.Z0).isPremium() || kzVar.R0) ? this.s.g ? z10 || kzVar.m1.contains(Long.valueOf(vxVar.b.id)) ? 3 : 2 : 0 : 1;
        if ((i10 == 0) != (this.x == 0)) {
            requestLayout();
        }
        this.x = i10;
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.y = null;
        }
        boolean z11 = i10 == 1;
        eg.c1 c1Var = this.h;
        c1Var.setEnabled(z11);
        boolean z12 = i10 == 2;
        TextView textView = this.e;
        textView.setEnabled(z12);
        boolean z13 = i10 == 3;
        TextView textView2 = this.f;
        textView2.setEnabled(z13);
        org.telegram.ui.ActionBar.k5 k5Var = this.b;
        jj0 jj0Var = this.a;
        if (!z4) {
            jj0Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            jj0Var.setTranslationX(i10 == 1 ? 0.0f : -AndroidUtilities.dp(16.0f));
            k5Var.setTranslationX(i10 == 1 ? AndroidUtilities.dp(16.0f) : 0.0f);
            c1Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            c1Var.setScaleX(i10 == 1 ? 1.0f : 0.6f);
            c1Var.setScaleY(i10 == 1 ? 1.0f : 0.6f);
            c1Var.setVisibility(i10 == 1 ? 0 : 8);
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
        this.y = animatorSet2;
        if (i10 == 1) {
            f10 = 0.0f;
            c3 = 0;
        } else {
            c3 = 0;
            f10 = -AndroidUtilities.dp(16.0f);
        }
        float[] fArr = new float[1];
        fArr[c3] = f10;
        Property property = FrameLayout.TRANSLATION_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jj0Var, (Property<jj0, Float>) property, fArr);
        float[] fArr2 = new float[1];
        fArr2[c3] = i10 == 1 ? 1.0f : 0.0f;
        Property property2 = FrameLayout.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(jj0Var, (Property<jj0, Float>) property2, fArr2);
        float[] fArr3 = new float[1];
        fArr3[c3] = i10 == 1 ? AndroidUtilities.dp(16.0f) : 0.0f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property, fArr3);
        float[] fArr4 = new float[1];
        fArr4[c3] = i10 == 1 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c1Var, (Property<eg.c1, Float>) property2, fArr4);
        float[] fArr5 = new float[1];
        fArr5[c3] = i10 == 1 ? 1.0f : 0.6f;
        Property property3 = FrameLayout.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(c1Var, (Property<eg.c1, Float>) property3, fArr5);
        float[] fArr6 = new float[1];
        fArr6[c3] = i10 == 1 ? 1.0f : 0.6f;
        Property property4 = FrameLayout.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(c1Var, (Property<eg.c1, Float>) property4, fArr6);
        float[] fArr7 = new float[1];
        fArr7[c3] = i10 == 2 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr7);
        float[] fArr8 = new float[1];
        fArr8[c3] = i10 == 2 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, fArr8);
        float[] fArr9 = new float[1];
        fArr9[c3] = i10 == 2 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, fArr9);
        float[] fArr10 = new float[1];
        fArr10[c3] = i10 == 3 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr10);
        float[] fArr11 = new float[1];
        fArr11[c3] = i10 == 3 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr11);
        float[] fArr12 = new float[1];
        fArr12[c3] = i10 == 3 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr12);
        Animator[] animatorArr = new Animator[12];
        animatorArr[c3] = ofFloat;
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
        this.y.addListener(new org.telegram.ui.Cells.b4(this, i10, 4));
        this.y.setDuration(250L);
        this.y.setInterpolator(new OvershootInterpolator(1.02f));
        this.y.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet stickerSetById;
        TLRPC.TL_messages_stickerSet stickerSetById2;
        kz kzVar = this.B;
        int i12 = kzVar.Z0;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            if (this.n != null && (stickerSetById2 = MediaDataController.getInstance(i12).getStickerSetById(this.n.id)) != null && stickerSetById2.set != null) {
                org.telegram.ui.ActionBar.p2 p2Var = kzVar.V1;
                if (p2Var == null) {
                    p2Var = new eg.y1(this, 8);
                }
                mv.W(p2Var, stickerSetById2, true, null, new vp(this, 14));
                this.n = null;
            }
            if (this.r == null || (stickerSetById = MediaDataController.getInstance(i12).getStickerSetById(this.r.id)) == null || stickerSetById.set == null) {
                return;
            }
            org.telegram.ui.ActionBar.p2 p2Var2 = kzVar.V1;
            if (p2Var2 == null) {
                p2Var2 = new eg.y1(this, 8);
            }
            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
            il ilVar = new il(15, this, stickerSetById);
            Pattern pattern = mv.S;
            if (p2Var3.getFragmentView() != null) {
                MediaDataController.getInstance(p2Var3.getCurrentAccount()).toggleStickerSet(p2Var3.getFragmentView().getContext(), stickerSetById, 0, p2Var3, true, true, ilVar, false);
            }
            this.r = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.B.Z0).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.v) {
            if (this.w == null) {
                Paint paint = new Paint(1);
                this.w = paint;
                paint.setStrokeWidth(1.0f);
                this.w.setColor(this.B.A(org.telegram.ui.ActionBar.j6.d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.w);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(11.0f) + this.d.getWidth();
        TextView textView = this.c;
        int measuredWidth = dp + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() : 0);
        org.telegram.ui.ActionBar.k5 k5Var = this.b;
        k5Var.setRightPadding(measuredWidth);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(AndroidUtilities.dp(4.0f) + k5Var.getTextWidth());
            float dp2 = AndroidUtilities.dp(4.0f) + (k5Var.getMaxTextWidth() - measuredWidth);
            if (textView.getTranslationX() > dp2) {
                textView.setTranslationX(dp2);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).topMargin = AndroidUtilities.dp(this.x == 0 ? 10.0f : 15.0f);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.x == 0 ? 32.0f : 42.0f), TLObject.FLAG_30));
    }
}
