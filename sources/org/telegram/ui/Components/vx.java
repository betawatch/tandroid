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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vx extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ fz A;
    public final aj0 a;
    public final org.telegram.ui.ActionBar.h5 b;
    public final TextView c;
    public final FrameLayout d;
    public final TextView e;
    public final TextView f;
    public final cg.d1 h;
    public TLRPC.TL_inputStickerSetID n;
    public TLRPC.TL_inputStickerSetID r;
    public rx s;
    public boolean v;
    public Paint w;
    public int x;
    public AnimatorSet y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx(fz fzVar, Context context) {
        super(context);
        this.A = fzVar;
        aj0 aj0Var = new aj0(context);
        this.a = aj0Var;
        aj0Var.f(R.raw.unlock_icon, 24, 24, null);
        int i10 = org.telegram.ui.ActionBar.g6.Te;
        aj0Var.setColorFilter(fzVar.A(i10));
        addView(aj0Var, i7.f6.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.b = h5Var;
        h5Var.setTextSize(15);
        h5Var.setTextColor(fzVar.A(i10));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setOnClickListener(new ux(this, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(fzVar.A(i10));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.g6.l1(0.12f, fzVar.A(org.telegram.ui.ActionBar.g6.Me))));
        textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f));
        textView.setText(LocaleController.getString(R.string.GroupEmoji));
        h5Var.setEllipsizeByGradient(true);
        addView(h5Var, i7.f6.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, i7.f6.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new ux(this, 1));
        addView(frameLayout, i7.f6.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        org.telegram.ui.th.n(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.Add));
        textView2.setTextColor(fzVar.A(org.telegram.ui.ActionBar.g6.Sh));
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        textView2.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{16.0f}, fzVar.A(i11), fzVar.A(org.telegram.ui.ActionBar.g6.Qh)));
        textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new ux(this, 2));
        frameLayout.addView(textView2, i7.f6.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.f = textView3;
        org.telegram.ui.th.n(14.0f, 1, textView3);
        textView3.setText(LocaleController.getString(R.string.StickersRemove));
        textView3.setTextColor(fzVar.A(org.telegram.ui.ActionBar.g6.Rh));
        textView3.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{16.0f}, 0, fzVar.A(i11) & 452984831));
        textView3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(AndroidUtilities.dp(4.0f));
        textView3.setOnClickListener(new ux(this, 3));
        frameLayout.addView(textView3, i7.f6.h(-2.0f, 26.0f, 8388661));
        cg.d1 d1Var = new cg.d1(AndroidUtilities.dp(16.0f), context, fzVar.V1, false);
        this.h = d1Var;
        d1Var.setIcon(R.raw.unlock_icon);
        d1Var.a(LocaleController.getString(R.string.Unlock), new ux(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d1Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int dp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = dp;
            marginLayoutParams.width = dp;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) d1Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = AndroidUtilities.dp(5.0f);
            marginLayoutParams2.topMargin = AndroidUtilities.dp(-0.5f);
            d1Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        this.d.addView(this.h, i7.f6.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        char c3;
        float f9;
        rx rxVar = this.s;
        if (rxVar == null) {
            return;
        }
        boolean z11 = rxVar.f;
        fz fzVar = this.A;
        int i10 = (this.s.e || UserConfig.getInstance(fzVar.Y0).isPremium() || fzVar.Q0) ? this.s.g ? z11 || fzVar.l1.contains(Long.valueOf(rxVar.b.id)) ? 3 : 2 : 0 : 1;
        if ((i10 == 0) != (this.x == 0)) {
            requestLayout();
        }
        this.x = i10;
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.y = null;
        }
        boolean z12 = i10 == 1;
        cg.d1 d1Var = this.h;
        d1Var.setEnabled(z12);
        boolean z13 = i10 == 2;
        TextView textView = this.e;
        textView.setEnabled(z13);
        boolean z14 = i10 == 3;
        TextView textView2 = this.f;
        textView2.setEnabled(z14);
        org.telegram.ui.ActionBar.h5 h5Var = this.b;
        aj0 aj0Var = this.a;
        if (!z10) {
            aj0Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            aj0Var.setTranslationX(i10 == 1 ? 0.0f : -AndroidUtilities.dp(16.0f));
            h5Var.setTranslationX(i10 == 1 ? AndroidUtilities.dp(16.0f) : 0.0f);
            d1Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            d1Var.setScaleX(i10 == 1 ? 1.0f : 0.6f);
            d1Var.setScaleY(i10 == 1 ? 1.0f : 0.6f);
            d1Var.setVisibility(i10 == 1 ? 0 : 8);
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
            f9 = 0.0f;
            c3 = 0;
        } else {
            c3 = 0;
            f9 = -AndroidUtilities.dp(16.0f);
        }
        float[] fArr = new float[1];
        fArr[c3] = f9;
        Property property = FrameLayout.TRANSLATION_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) property, fArr);
        float[] fArr2 = new float[1];
        fArr2[c3] = i10 == 1 ? 1.0f : 0.0f;
        Property property2 = FrameLayout.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) property2, fArr2);
        float[] fArr3 = new float[1];
        fArr3[c3] = i10 == 1 ? AndroidUtilities.dp(16.0f) : 0.0f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, fArr3);
        float[] fArr4 = new float[1];
        fArr4[c3] = i10 == 1 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(d1Var, (Property<cg.d1, Float>) property2, fArr4);
        float[] fArr5 = new float[1];
        fArr5[c3] = i10 == 1 ? 1.0f : 0.6f;
        Property property3 = FrameLayout.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(d1Var, (Property<cg.d1, Float>) property3, fArr5);
        float[] fArr6 = new float[1];
        fArr6[c3] = i10 == 1 ? 1.0f : 0.6f;
        Property property4 = FrameLayout.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(d1Var, (Property<cg.d1, Float>) property4, fArr6);
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
        this.y.addListener(new org.telegram.ui.Cells.z3(this, i10, 4));
        this.y.setDuration(250L);
        this.y.setInterpolator(new OvershootInterpolator(1.02f));
        this.y.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet stickerSetById;
        TLRPC.TL_messages_stickerSet stickerSetById2;
        fz fzVar = this.A;
        int i12 = fzVar.Y0;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            if (this.n != null && (stickerSetById2 = MediaDataController.getInstance(i12).getStickerSetById(this.n.id)) != null && stickerSetById2.set != null) {
                org.telegram.ui.ActionBar.o2 o2Var = fzVar.U1;
                if (o2Var == null) {
                    o2Var = new cg.z1(this, 10);
                }
                jv.W(o2Var, stickerSetById2, true, null, new rp(this, 14));
                this.n = null;
            }
            if (this.r == null || (stickerSetById = MediaDataController.getInstance(i12).getStickerSetById(this.r.id)) == null || stickerSetById.set == null) {
                return;
            }
            org.telegram.ui.ActionBar.o2 o2Var2 = fzVar.U1;
            if (o2Var2 == null) {
                o2Var2 = new cg.z1(this, 10);
            }
            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
            gt gtVar = new gt(6, this, stickerSetById);
            Pattern pattern = jv.R;
            if (o2Var3.getFragmentView() != null) {
                MediaDataController.getInstance(o2Var3.getCurrentAccount()).toggleStickerSet(o2Var3.getFragmentView().getContext(), stickerSetById, 0, o2Var3, true, true, gtVar, false);
            }
            this.r = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.A.Y0).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.v) {
            if (this.w == null) {
                Paint paint = new Paint(1);
                this.w = paint;
                paint.setStrokeWidth(1.0f);
                this.w.setColor(this.A.A(org.telegram.ui.ActionBar.g6.d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.w);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(11.0f) + this.d.getWidth();
        TextView textView = this.c;
        int measuredWidth = dp + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() : 0);
        org.telegram.ui.ActionBar.h5 h5Var = this.b;
        h5Var.setRightPadding(measuredWidth);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(AndroidUtilities.dp(4.0f) + h5Var.getTextWidth());
            float dp2 = AndroidUtilities.dp(4.0f) + (h5Var.getMaxTextWidth() - measuredWidth);
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
