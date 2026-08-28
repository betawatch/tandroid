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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nx extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ wy A;
    public final pi0 a;
    public final org.telegram.ui.ActionBar.h5 b;
    public final TextView c;
    public final FrameLayout d;
    public final TextView e;
    public final TextView f;
    public final zf.p0 h;
    public TLRPC.TL_inputStickerSetID n;
    public TLRPC.TL_inputStickerSetID r;
    public jx s;
    public boolean v;
    public Paint w;
    public int x;
    public AnimatorSet y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(wy wyVar, Context context) {
        super(context);
        this.A = wyVar;
        pi0 pi0Var = new pi0(context);
        this.a = pi0Var;
        pi0Var.f(R.raw.unlock_icon, 24, 24, null);
        int i9 = org.telegram.ui.ActionBar.f6.Te;
        pi0Var.setColorFilter(wyVar.z(i9));
        addView(pi0Var, g7.e6.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.b = h5Var;
        h5Var.setTextSize(15);
        h5Var.setTextColor(wyVar.z(i9));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setOnClickListener(new mx(this, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(wyVar.z(i9));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.f6.l1(0.12f, wyVar.z(org.telegram.ui.ActionBar.f6.Me))));
        textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f));
        textView.setText(LocaleController.getString(R.string.GroupEmoji));
        h5Var.setEllipsizeByGradient(true);
        addView(h5Var, g7.e6.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, g7.e6.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new mx(this, 1));
        addView(frameLayout, g7.e6.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        j3.r0.u(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.Add));
        textView2.setTextColor(wyVar.z(org.telegram.ui.ActionBar.f6.Sh));
        int i10 = org.telegram.ui.ActionBar.f6.Oh;
        textView2.setBackground(org.telegram.ui.ActionBar.v5.d(new float[]{16.0f}, wyVar.z(i10), wyVar.z(org.telegram.ui.ActionBar.f6.Qh)));
        textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new mx(this, 2));
        frameLayout.addView(textView2, g7.e6.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.f = textView3;
        j3.r0.u(14.0f, 1, textView3);
        textView3.setText(LocaleController.getString(R.string.StickersRemove));
        textView3.setTextColor(wyVar.z(org.telegram.ui.ActionBar.f6.Rh));
        textView3.setBackground(org.telegram.ui.ActionBar.v5.d(new float[]{16.0f}, 0, wyVar.z(i10) & 452984831));
        textView3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(AndroidUtilities.dp(4.0f));
        textView3.setOnClickListener(new mx(this, 3));
        frameLayout.addView(textView3, g7.e6.h(-2.0f, 26.0f, 8388661));
        zf.p0 p0Var = new zf.p0(AndroidUtilities.dp(16.0f), context, wyVar.V1, false);
        this.h = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        p0Var.a(LocaleController.getString(R.string.Unlock), new mx(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int dp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = dp;
            marginLayoutParams.width = dp;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) p0Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = AndroidUtilities.dp(5.0f);
            marginLayoutParams2.topMargin = AndroidUtilities.dp(-0.5f);
            p0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        this.d.addView(this.h, g7.e6.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        char c10;
        float f10;
        jx jxVar = this.s;
        if (jxVar == null) {
            return;
        }
        boolean z11 = jxVar.f;
        wy wyVar = this.A;
        int i9 = (this.s.e || UserConfig.getInstance(wyVar.Y0).isPremium() || wyVar.Q0) ? this.s.g ? z11 || wyVar.l1.contains(Long.valueOf(jxVar.b.id)) ? 3 : 2 : 0 : 1;
        if ((i9 == 0) != (this.x == 0)) {
            requestLayout();
        }
        this.x = i9;
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.y = null;
        }
        boolean z12 = i9 == 1;
        zf.p0 p0Var = this.h;
        p0Var.setEnabled(z12);
        boolean z13 = i9 == 2;
        TextView textView = this.e;
        textView.setEnabled(z13);
        boolean z14 = i9 == 3;
        TextView textView2 = this.f;
        textView2.setEnabled(z14);
        org.telegram.ui.ActionBar.h5 h5Var = this.b;
        pi0 pi0Var = this.a;
        if (!z10) {
            pi0Var.setAlpha(i9 == 1 ? 1.0f : 0.0f);
            pi0Var.setTranslationX(i9 == 1 ? 0.0f : -AndroidUtilities.dp(16.0f));
            h5Var.setTranslationX(i9 == 1 ? AndroidUtilities.dp(16.0f) : 0.0f);
            p0Var.setAlpha(i9 == 1 ? 1.0f : 0.0f);
            p0Var.setScaleX(i9 == 1 ? 1.0f : 0.6f);
            p0Var.setScaleY(i9 == 1 ? 1.0f : 0.6f);
            p0Var.setVisibility(i9 == 1 ? 0 : 8);
            textView.setAlpha(i9 == 2 ? 1.0f : 0.0f);
            textView.setScaleX(i9 == 2 ? 1.0f : 0.6f);
            textView.setScaleY(i9 == 2 ? 1.0f : 0.6f);
            textView.setVisibility(i9 == 2 ? 0 : 8);
            textView2.setAlpha(i9 == 3 ? 1.0f : 0.0f);
            textView2.setScaleX(i9 == 3 ? 1.0f : 0.6f);
            textView2.setScaleY(i9 == 3 ? 1.0f : 0.6f);
            textView2.setVisibility(i9 == 3 ? 0 : 8);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.y = animatorSet2;
        if (i9 == 1) {
            f10 = 0.0f;
            c10 = 0;
        } else {
            c10 = 0;
            f10 = -AndroidUtilities.dp(16.0f);
        }
        float[] fArr = new float[1];
        fArr[c10] = f10;
        Property property = FrameLayout.TRANSLATION_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pi0Var, (Property<pi0, Float>) property, fArr);
        float[] fArr2 = new float[1];
        fArr2[c10] = i9 == 1 ? 1.0f : 0.0f;
        Property property2 = FrameLayout.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pi0Var, (Property<pi0, Float>) property2, fArr2);
        float[] fArr3 = new float[1];
        fArr3[c10] = i9 == 1 ? AndroidUtilities.dp(16.0f) : 0.0f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, fArr3);
        float[] fArr4 = new float[1];
        fArr4[c10] = i9 == 1 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(p0Var, (Property<zf.p0, Float>) property2, fArr4);
        float[] fArr5 = new float[1];
        fArr5[c10] = i9 == 1 ? 1.0f : 0.6f;
        Property property3 = FrameLayout.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(p0Var, (Property<zf.p0, Float>) property3, fArr5);
        float[] fArr6 = new float[1];
        fArr6[c10] = i9 == 1 ? 1.0f : 0.6f;
        Property property4 = FrameLayout.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(p0Var, (Property<zf.p0, Float>) property4, fArr6);
        float[] fArr7 = new float[1];
        fArr7[c10] = i9 == 2 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr7);
        float[] fArr8 = new float[1];
        fArr8[c10] = i9 == 2 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, fArr8);
        float[] fArr9 = new float[1];
        fArr9[c10] = i9 == 2 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, fArr9);
        float[] fArr10 = new float[1];
        fArr10[c10] = i9 == 3 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr10);
        float[] fArr11 = new float[1];
        fArr11[c10] = i9 == 3 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr11);
        float[] fArr12 = new float[1];
        fArr12[c10] = i9 == 3 ? 1.0f : 0.6f;
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
        this.y.addListener(new mh.o2(this, i9, 6));
        this.y.setDuration(250L);
        this.y.setInterpolator(new OvershootInterpolator(1.02f));
        this.y.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.TL_messages_stickerSet stickerSetById;
        TLRPC.TL_messages_stickerSet stickerSetById2;
        wy wyVar = this.A;
        int i11 = wyVar.Y0;
        if (i9 == NotificationCenter.groupStickersDidLoad) {
            int i12 = 9;
            if (this.n != null && (stickerSetById2 = MediaDataController.getInstance(i11).getStickerSetById(this.n.id)) != null && stickerSetById2.set != null) {
                org.telegram.ui.ActionBar.o2 o2Var = wyVar.U1;
                if (o2Var == null) {
                    o2Var = new bg.i1(this, 9);
                }
                dv.V(o2Var, stickerSetById2, true, null, new np(this, 14));
                this.n = null;
            }
            if (this.r == null || (stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(this.r.id)) == null || stickerSetById.set == null) {
                return;
            }
            org.telegram.ui.ActionBar.o2 o2Var2 = wyVar.U1;
            if (o2Var2 == null) {
                o2Var2 = new bg.i1(this, 9);
            }
            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
            zq zqVar = new zq(i12, this, stickerSetById);
            Pattern pattern = dv.R;
            if (o2Var3.getFragmentView() != null) {
                MediaDataController.getInstance(o2Var3.getCurrentAccount()).toggleStickerSet(o2Var3.getFragmentView().getContext(), stickerSetById, 0, o2Var3, true, true, zqVar, false);
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
                this.w.setColor(this.A.z(org.telegram.ui.ActionBar.f6.d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.w);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
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
    public final void onMeasure(int i9, int i10) {
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).topMargin = AndroidUtilities.dp(this.x == 0 ? 10.0f : 15.0f);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.x == 0 ? 32.0f : 42.0f), TLObject.FLAG_30));
    }
}
