package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Map;
import mh.aa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.s6;
import org.telegram.ui.r80;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class d2 extends Dialog implements Drawable.Callback, NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int Z0 = 0;
    public Matrix A0;
    public final boolean[] B;
    public BitmapShader B0;
    public final AnimatorSet[] C;
    public Paint C0;
    public int D;
    public Paint D0;
    public boolean E;
    public boolean E0;
    public int F;
    public boolean F0;
    public DialogInterface.OnCancelListener G;
    public boolean G0;
    public d2 H;
    public boolean H0;
    public int I;
    public final s1 I0;
    public DialogInterface.OnClickListener J;
    public final s1 J0;
    public DialogInterface.OnDismissListener K;
    public final ArrayList K0;
    public Utilities.Callback L;
    public float L0;
    public CharSequence[] M;
    public boolean M0;
    public int[] N;
    public float N0;
    public CharSequence O;
    public final g6 O0;
    public String P;
    public boolean P0;
    public CharSequence Q;
    public boolean Q0;
    public int R;
    public int R0;
    public View S;
    public int S0;
    public boolean T;
    public long T0;
    public int U;
    public boolean U0;
    public int V;
    public FrameLayout V0;
    public Map W;
    public mh.b W0;
    public int X;
    public b2 X0;
    public Drawable Y;
    public boolean Y0;
    public int Z;
    public int a;
    public final int a0;
    public View b;
    public int b0;
    public TextView c;
    public boolean c0;
    public gu d;
    public boolean d0;
    public int e;
    public boolean e0;
    public jh.s f;
    public boolean f0;
    public boolean g0;
    public TextView h;
    public lj0 h0;
    public CharSequence i0;
    public c2 j0;
    public CharSequence k0;
    public c2 l0;
    public String m0;
    public gu n;
    public wh.y3 n0;
    public CharSequence o0;
    public c2 p0;
    public ViewGroup q0;
    public FrameLayout r;
    public p80 r0;
    public FrameLayout s;
    public TextView s0;
    public r80 t0;
    public final int[] u0;
    public x1 v;
    public boolean v0;
    public LinearLayout w;
    public final Drawable w0;
    public a2 x;
    public final Rect x0;
    public final BitmapDrawable[] y;
    public final float y0;
    public Bitmap z0;

    public d2(Context context) {
        this(context, 3, null);
    }

    public static void a(d2 d2Var, int i10, boolean z4) {
        boolean[] zArr = d2Var.B;
        AnimatorSet[] animatorSetArr = d2Var.C;
        if ((!z4 || zArr[i10]) && (z4 || !zArr[i10])) {
            return;
        }
        zArr[i10] = z4;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i10] = animatorSet2;
        BitmapDrawable bitmapDrawable = d2Var.y[i10];
        int i11 = 1;
        if (bitmapDrawable != null) {
            animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", z4 ? 255 : 0));
        }
        animatorSetArr[i10].setDuration(150L);
        animatorSetArr[i10].addListener(new z2(d2Var, i10, i11));
        try {
            animatorSetArr[i10].start();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public static boolean b(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (b(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public final void c(long j10) {
        long currentTimeMillis = System.currentTimeMillis() - this.T0;
        if (currentTimeMillis < j10) {
            AndroidUtilities.runOnUIThread(new s1(this, 0), currentTimeMillis - j10);
        } else {
            dismiss();
        }
    }

    public final View d(int i10) {
        ViewGroup viewGroup = this.q0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i10));
        }
        return null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        gu guVar;
        if (i10 != NotificationCenter.emojiLoaded || (guVar = this.n) == null) {
            return;
        }
        guVar.invalidate();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Bitmap bitmap;
        Utilities.Callback callback = this.L;
        if (callback != null) {
            this.L = null;
            callback.run(new s1(this, 0));
            return;
        }
        if (this.Y0) {
            return;
        }
        this.Y0 = true;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        DialogInterface.OnDismissListener onDismissListener = this.K;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        d2 d2Var = this.H;
        if (d2Var != null) {
            d2Var.dismiss();
        }
        try {
            super.dismiss();
        } catch (Throwable unused) {
        }
        AndroidUtilities.cancelRunOnUIThread(this.J0);
        if (this.B0 == null || (bitmap = this.z0) == null) {
            return;
        }
        bitmap.recycle();
        this.B0 = null;
        this.C0 = null;
        this.z0 = null;
    }

    public int e(int i10) {
        return k6.v0(i10, this.O0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ViewGroup f(boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        b2 b2Var = new b2(getContext(), this);
        this.X0 = b2Var;
        final int i10 = 1;
        b2Var.setOrientation(1);
        boolean z10 = this.Q0;
        int i11 = this.a0;
        int i12 = 3;
        final int i13 = 0;
        if ((z10 || i11 == 3) && i11 != 2) {
            this.X0.setBackground(null);
            this.X0.setPadding(0, 0, 0, 0);
            if (this.Q0) {
                this.X0.setWillNotDraw(false);
            }
            this.f0 = false;
        } else {
            boolean z11 = this.g0;
            Drawable drawable = this.w0;
            if (z11) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.X0.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                this.f0 = true;
            } else {
                this.X0.setBackground(null);
                this.X0.setPadding(0, 0, 0, 0);
                this.X0.setBackground(drawable);
                b2 b2Var2 = this.X0;
                int dp = AndroidUtilities.dp(8.0f);
                float dp2 = AndroidUtilities.dp(20.0f);
                hg.j1 j1Var = lf.q0.a;
                b2Var2.setOutlineProvider(new lf.p0(dp, dp2));
                this.X0.setClipToOutline(true);
                this.f0 = false;
            }
        }
        ViewGroup viewGroup = this.X0;
        boolean z12 = this.U0;
        g6 g6Var = this.O0;
        if (z12) {
            if (this.V0 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.V0 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.u1
                    public final /* synthetic */ d2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                this.b.dismiss();
                                break;
                            case 1:
                                d2 d2Var = this.b;
                                new aa(d2Var.getContext(), d2Var.O0).show();
                                break;
                            default:
                                d2 d2Var2 = this.b;
                                DialogInterface.OnClickListener onClickListener = d2Var2.J;
                                if (onClickListener != null) {
                                    onClickListener.onClick(d2Var2, ((Integer) view.getTag()).intValue());
                                }
                                d2Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            if (this.W0 == null) {
                mh.b bVar = new mh.b(getContext(), UserConfig.selectedAccount, g6Var);
                this.W0 = bVar;
                k7.e6.a(bVar);
                this.W0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.u1
                    public final /* synthetic */ d2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                this.b.dismiss();
                                break;
                            case 1:
                                d2 d2Var = this.b;
                                new aa(d2Var.getContext(), d2Var.O0).show();
                                break;
                            default:
                                d2 d2Var2 = this.b;
                                DialogInterface.OnClickListener onClickListener = d2Var2.J;
                                if (onClickListener != null) {
                                    onClickListener.onClick(d2Var2, ((Integer) view.getTag()).intValue());
                                }
                                d2Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            AndroidUtilities.removeFromParent(this.X0);
            AndroidUtilities.removeFromParent(this.W0);
            this.V0.addView(this.X0, k7.c6.e(-2, -2, 17));
            this.V0.addView(this.W0, k7.c6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.V0;
        }
        if (z4) {
            if (this.U0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 119;
                setContentView(viewGroup, layoutParams);
            } else if (this.a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        boolean z13 = (this.i0 == null && this.k0 == null && this.m0 == null && this.o0 == null) ? false : true;
        if (this.R == 0 && this.U == 0 && this.Y == null) {
            View view = this.S;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                this.X0.addView(this.S, k7.c6.t(-1, this.X, 51, 0, 0, 0, 0));
            }
        } else {
            lj0 lj0Var = new lj0(getContext());
            this.h0 = lj0Var;
            Drawable drawable2 = this.Y;
            if (drawable2 != null) {
                lj0Var.setImageDrawable(drawable2);
                Drawable drawable3 = this.Y;
                if (drawable3 instanceof s6) {
                    s6 s6Var = (s6) drawable3;
                    this.h0.addOnAttachStateChangeListener(new v1(s6Var));
                    s6Var.a(this.h0);
                }
            } else {
                int i14 = this.R;
                if (i14 != 0) {
                    lj0Var.setImageResource(i14);
                } else {
                    lj0Var.setAutoRepeat(this.P0);
                    lj0 lj0Var2 = this.h0;
                    int i15 = this.U;
                    int i16 = this.V;
                    lj0Var2.f(i15, i16, i16, null);
                    if (this.W != null) {
                        ij0 animatedDrawable = this.h0.getAnimatedDrawable();
                        for (Map.Entry entry : this.W.entrySet()) {
                            String str = (String) entry.getKey();
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.s.put(str, num);
                            animatedDrawable.E();
                        }
                    }
                    this.h0.d();
                }
            }
            this.h0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.T) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.Z);
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(128.0f));
                this.h0.setBackground(new w1(this, gradientDrawable));
                this.X = 92;
            } else {
                this.h0.setBackground(k6.c0(AndroidUtilities.dp(10.0f), 0, this.Z));
            }
            if (this.T) {
                this.h0.setTranslationY(AndroidUtilities.dp(16.0f));
            } else {
                this.h0.setTranslationY(0.0f);
            }
            this.h0.setPadding(0, 0, 0, 0);
            this.X0.addView(this.h0, k7.c6.t(-1, this.X, 51, 0, 0, 0, 0));
        }
        int i17 = 5;
        if (this.O != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.s = frameLayout2;
            this.X0.addView(frameLayout2, k7.c6.t(-2, -2, this.T ? 1 : 0, 24, 0, 24, 0));
            jh.s sVar = new jh.s(getContext(), null, false);
            this.f = sVar;
            NotificationCenter.listenEmojiLoading(sVar);
            jh.s sVar2 = this.f;
            sVar2.h = 3;
            sVar2.setText(this.O);
            this.f.setTextColor(e(k6.j5));
            this.f.setTextSize(1, 20.0f);
            this.f.setTypeface(AndroidUtilities.bold());
            this.f.setGravity((this.T ? 1 : LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout3 = this.s;
            jh.s sVar3 = this.f;
            boolean z14 = this.T;
            frameLayout3.addView(sVar3, k7.c6.d(-2, -2.0f, (z14 ? 1 : LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 19.0f, 0.0f, z14 ? 4.0f : this.P != null ? 2 : this.M != null ? 14 : 10));
        }
        if (this.P != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.P);
            this.h.setTextColor(e(k6.J5));
            this.h.setTextSize(1, 14.0f);
            this.h.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            this.X0.addView(this.h, k7.c6.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, 0, 24, this.M != null ? 14 : 10));
        }
        if (i11 == 0) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow).mutate();
            BitmapDrawable[] bitmapDrawableArr = this.y;
            bitmapDrawableArr[0] = bitmapDrawable;
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow_reverse).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            x1 x1Var = new x1(this, getContext(), i13);
            this.v = x1Var;
            x1Var.setVerticalScrollBarEnabled(false);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.v, e(k6.A5));
            this.X0.addView(this.v, k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.w = linearLayout;
            linearLayout.setOrientation(1);
            f10 = 20.0f;
            f11 = 4.0f;
            this.v.addView(this.w, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f10 = 20.0f;
            f11 = 4.0f;
        }
        gu guVar = new gu(getContext());
        this.n = guVar;
        NotificationCenter.listenEmojiLoading(guVar);
        this.n.setTextColor(e(this.T ? k6.y6 : k6.j5));
        this.n.setTextSize(1, 16.0f);
        this.n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.n.setLinkTextColor(e(k6.k5));
        if (!this.c0) {
            this.n.setClickable(false);
            this.n.setEnabled(false);
        }
        this.n.setGravity((this.T ? 1 : LocaleController.isRTL ? 5 : 3) | 48);
        if (i11 == 2) {
            this.X0.addView(this.n, k7.c6.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, this.O == null ? 19 : 0, 24, 20));
            p80 p80Var = new p80(getContext());
            this.r0 = p80Var;
            p80Var.a(this.b0 / 100.0f, false);
            this.r0.setProgressColor(e(k6.F5));
            this.r0.setBackColor(e(k6.G5));
            this.X0.addView(this.r0, k7.c6.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView2 = new TextView(getContext());
            this.s0 = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            this.s0.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            this.s0.setTextColor(e(k6.q5));
            this.s0.setTextSize(1, 14.0f);
            this.X0.addView(this.s0, k7.c6.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 23, 4, 23, 24));
            this.s0.setText(String.format("%d%%", Integer.valueOf(this.b0)));
        } else if (i11 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.r = new FrameLayout(getContext());
            this.R0 = e(k6.M5);
            if (!this.Q0) {
                this.r.setBackgroundDrawable(k6.b0(AndroidUtilities.dp(18.0f), this.R0));
            }
            this.X0.addView(this.r, k7.c6.q(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), g6Var);
            radialProgressView.setSize(AndroidUtilities.dp(32.0f));
            radialProgressView.setProgressColor(e(k6.N5));
            this.r.addView(radialProgressView, k7.c6.e(86, 86, 17));
        } else {
            gu guVar2 = this.d;
            if (guVar2 != null) {
                this.w.addView(guVar2, k7.c6.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            this.w.addView(this.n, k7.c6.t(-2, -2, (this.T ? 1 : LocaleController.isRTL ? 5 : 3) | 48, 24, 0, 24, (this.b == null && this.M == null) ? 0 : this.D));
            TextView textView3 = this.c;
            if (textView3 != null) {
                this.w.addView(textView3, k7.c6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        if (TextUtils.isEmpty(this.Q)) {
            this.n.setVisibility(8);
        } else {
            this.n.setText(this.Q);
            this.n.setVisibility(0);
        }
        if (this.M != null) {
            int i18 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.M;
                if (i18 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i18] != null) {
                    z1 z1Var = new z1(getContext(), g6Var);
                    CharSequence charSequence = this.M[i18];
                    int[] iArr = this.N;
                    z1Var.a(iArr != null ? iArr[i18] : 0, charSequence);
                    z1Var.setTag(Integer.valueOf(i18));
                    this.K0.add(z1Var);
                    this.w.addView(z1Var, k7.c6.n(-1, 50));
                    final int i19 = 2;
                    z1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.u1
                        public final /* synthetic */ d2 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i19) {
                                case 0:
                                    this.b.dismiss();
                                    break;
                                case 1:
                                    d2 d2Var = this.b;
                                    new aa(d2Var.getContext(), d2Var.O0).show();
                                    break;
                                default:
                                    d2 d2Var2 = this.b;
                                    DialogInterface.OnClickListener onClickListener = d2Var2.J;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(d2Var2, ((Integer) view2.getTag()).intValue());
                                    }
                                    d2Var2.dismiss();
                                    break;
                            }
                        }
                    });
                }
                i18++;
            }
        }
        View view2 = this.b;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((ViewGroup) this.b.getParent()).removeView(this.b);
            }
            this.w.addView(this.b, k7.c6.n(-1, this.e));
        }
        if (z13) {
            if (!this.F0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                CharSequence charSequence2 = this.i0;
                int measureText = charSequence2 != null ? (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + AndroidUtilities.dp(24.0f) + 0) : 0;
                if (this.k0 != null) {
                    if (measureText > 0) {
                        measureText += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence3 = this.k0;
                    measureText = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + AndroidUtilities.dp(24.0f) + measureText);
                }
                if (this.m0 != null) {
                    if (measureText > 0) {
                        measureText += AndroidUtilities.dp(8.0f);
                    }
                    String str2 = this.m0;
                    measureText = (int) (textPaint.measureText((CharSequence) str2, 0, str2.length()) + AndroidUtilities.dp(24.0f) + measureText);
                }
                if (this.o0 != null) {
                    if (measureText > 0) {
                        measureText += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence4 = this.o0;
                    measureText = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + AndroidUtilities.dp(24.0f) + measureText);
                }
                if (measureText > AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f)) {
                    if (!this.G0 || this.i0 == null || this.k0 == null || this.m0 == null || this.o0 == null) {
                        this.F0 = true;
                    } else {
                        this.H0 = true;
                    }
                }
            }
            if (this.F0) {
                LinearLayout linearLayout2 = new LinearLayout(getContext());
                linearLayout2.setOrientation(1);
                this.q0 = linearLayout2;
            } else {
                this.q0 = new v2(this, getContext(), i10);
            }
            if (this.c != null) {
                this.q0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f11));
                this.q0.setTranslationY(-AndroidUtilities.dp(6.0f));
            } else {
                this.q0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            this.X0.addView(this.q0, k7.c6.n(-1, this.H0 ? 96 : 52));
            if (this.T) {
                this.q0.setTranslationY(-AndroidUtilities.dp(8.0f));
            }
            if (this.i0 != null) {
                y1 y1Var = new y1(getContext(), i13);
                y1Var.setMinWidth(AndroidUtilities.dp(64.0f));
                y1Var.setTag(-1);
                y1Var.setTextSize(1, 16.0f);
                y1Var.setTextColor(e(this.F));
                y1Var.setGravity(17);
                y1Var.setTypeface(AndroidUtilities.bold());
                y1Var.setText(this.i0);
                f12 = 64.0f;
                y1Var.setBackground(k6.G0(AndroidUtilities.dp(f10), e(this.F)));
                y1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.F0) {
                    f13 = 6.0f;
                    this.q0.addView(y1Var, k7.c6.q(-1, 40, 7));
                } else {
                    f13 = 6.0f;
                    this.q0.addView(y1Var, k7.c6.e(-2, 40, 53));
                }
                y1Var.setOnClickListener(new org.telegram.messenger.video.g(i12, this, y1Var));
            } else {
                f12 = 64.0f;
                f13 = 6.0f;
            }
            if (this.k0 != null) {
                y1 y1Var2 = new y1(getContext(), i10);
                y1Var2.setMinWidth(AndroidUtilities.dp(f12));
                y1Var2.setTag(-2);
                y1Var2.setTextSize(1, 16.0f);
                y1Var2.setTextColor(e(this.F));
                y1Var2.setGravity(17);
                y1Var2.setTypeface(AndroidUtilities.bold());
                y1Var2.setEllipsize(TextUtils.TruncateAt.END);
                y1Var2.setSingleLine(true);
                y1Var2.setText(this.k0.toString());
                y1Var2.setBackground(k6.G0(AndroidUtilities.dp(f10), e(this.F)));
                y1Var2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.F0) {
                    this.q0.addView(y1Var2, 0, k7.c6.q(-1, 40, 7));
                } else {
                    this.q0.addView(y1Var2, k7.c6.e(-2, 40, 53));
                }
                y1Var2.setOnClickListener(new org.telegram.messenger.video.g(4, this, y1Var2));
            }
            if (this.o0 != null) {
                y1 y1Var3 = new y1(getContext(), 2);
                y1Var3.setMinWidth(AndroidUtilities.dp(f12));
                y1Var3.setTag(-3);
                y1Var3.setTextSize(1, 16.0f);
                y1Var3.setTextColor(e(this.F));
                y1Var3.setGravity(17);
                y1Var3.setTypeface(AndroidUtilities.bold());
                y1Var3.setEllipsize(TextUtils.TruncateAt.END);
                y1Var3.setSingleLine(true);
                y1Var3.setText(this.o0.toString());
                y1Var3.setBackground(k6.G0(AndroidUtilities.dp(f10), e(this.F)));
                y1Var3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.F0) {
                    this.q0.addView(y1Var3, 1, k7.c6.q(-1, 40, 7));
                } else {
                    this.q0.addView(y1Var3, k7.c6.e(-2, 40, 51));
                }
                y1Var3.setOnClickListener(new org.telegram.messenger.video.g(i17, this, y1Var3));
            }
            if (this.m0 != null) {
                y1 y1Var4 = new y1(getContext(), i12);
                y1Var4.setMinWidth(AndroidUtilities.dp(f12));
                y1Var4.setTag(-4);
                y1Var4.setTextSize(1, 16.0f);
                y1Var4.setTextColor(e(this.F));
                y1Var4.setGravity(17);
                y1Var4.setTypeface(AndroidUtilities.bold());
                y1Var4.setEllipsize(TextUtils.TruncateAt.END);
                y1Var4.setSingleLine(true);
                y1Var4.setText(this.m0.toString());
                y1Var4.setBackground(k6.G0(AndroidUtilities.dp(f10), e(this.F)));
                y1Var4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.F0) {
                    this.q0.addView(y1Var4, 0, k7.c6.q(-1, 40, 7));
                } else {
                    this.q0.addView(y1Var4, k7.c6.e(-2, 40, 53));
                }
                y1Var4.setOnClickListener(new org.telegram.messenger.video.g(6, this, y1Var4));
            }
            if (this.F0) {
                for (int i20 = 1; i20 < this.q0.getChildCount(); i20++) {
                    ((ViewGroup.MarginLayoutParams) this.q0.getChildAt(i20).getLayoutParams()).topMargin = AndroidUtilities.dp(f13);
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.U0) {
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            window.setWindowAnimations(R.style.DialogNoAnimation);
        } else if (i11 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.M0) {
                layoutParams3.dimAmount = this.N0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags ^= 2;
            }
            int i21 = AndroidUtilities.displaySize.x;
            this.I = i21;
            int min = Math.min(AndroidUtilities.isTablet() ? AndroidUtilities.isSmallTablet() ? AndroidUtilities.dp(446.0f) : AndroidUtilities.dp(496.0f) : AndroidUtilities.dp(356.0f), (i21 - AndroidUtilities.dp(48.0f)) - (this.S0 * 2));
            Rect rect2 = this.x0;
            layoutParams3.width = min + rect2.left + rect2.right;
        }
        View view3 = this.b;
        if (view3 != null && this.v0 && b(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.Q0) {
            AndroidUtilities.makeGlobalBlurBitmap(new y0(this, i10), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final af.f g(int i10, boolean z4, boolean z10) {
        View d = d(i10);
        if (z10) {
            this.e0 = false;
        }
        return new af.f(new p(d, 5), new mh.r5(this, d, z4, 5));
    }

    public final void h() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            textView.setTextColor(e(k6.q7));
        }
    }

    public final void i(int i10) {
        this.R0 = i10;
        Drawable drawable = this.w0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.R0, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.v.invalidate();
        this.w.invalidate();
    }

    public final void j() {
        this.d0 = false;
    }

    public final void k(boolean z4) {
        if (this.E0) {
            return;
        }
        this.E0 = true;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.E0) {
            attributes.softInputMode = 16;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void l(int i10, int i11, int i12) {
        if (i10 >= 0) {
            ArrayList arrayList = this.K0;
            if (i10 >= arrayList.size()) {
                return;
            }
            z1 z1Var = (z1) arrayList.get(i10);
            z1Var.a.setTextColor(i11);
            z1Var.b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void m(String str) {
        this.Q = str;
        if (this.n != null) {
            if (TextUtils.isEmpty(str)) {
                this.n.setVisibility(8);
            } else {
                this.n.setText(this.Q);
                this.n.setVisibility(0);
            }
        }
    }

    public final void n(int i10) {
        this.b0 = i10;
        p80 p80Var = this.r0;
        if (p80Var != null) {
            p80Var.a(i10 / 100.0f, true);
            this.s0.setText(String.format("%d%%", Integer.valueOf(this.b0)));
        }
    }

    public final void o(int i10) {
        jh.s sVar = this.f;
        if (sVar != null) {
            sVar.setTextColor(i10);
        }
        gu guVar = this.n;
        if (guVar != null) {
            guVar.setTextColor(i10);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        r80 r80Var = this.t0;
        if (r80Var != null) {
            r80Var.j(this, -2);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f(true);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public final void p() {
        if (this.d0 && this.H == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.O0);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.StopLoadingTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.StopLoading);
            alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new n(this, 3));
            alertDialog$Builder.j(new t1(this, 0));
            try {
                this.H = alertDialog$Builder.o();
            } catch (Exception unused) {
            }
        }
    }

    public void q(long j10) {
        s1 s1Var = this.J0;
        AndroidUtilities.cancelRunOnUIThread(s1Var);
        AndroidUtilities.runOnUIThread(s1Var, j10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        x1 x1Var = this.v;
        if (x1Var != null) {
            x1Var.postDelayed(runnable, j10);
        }
    }

    @Override // android.app.Dialog
    public final void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.G = onCancelListener;
        super.setOnCancelListener(onCancelListener);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.O = charSequence;
        jh.s sVar = this.f;
        if (sVar != null) {
            sVar.setText(charSequence);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            this.Y0 = false;
            super.show();
            FrameLayout frameLayout = this.r;
            if (frameLayout != null && this.a0 == 3) {
                frameLayout.setScaleX(0.0f);
                this.r.setScaleY(0.0f);
                this.r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
            }
            this.T0 = System.currentTimeMillis();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        x1 x1Var = this.v;
        if (x1Var != null) {
            x1Var.removeCallbacks(runnable);
        }
    }

    public d2(Context context, int i10, g6 g6Var) {
        super(context, R.style.TransparentDialog);
        this.a = -1;
        this.e = -2;
        this.y = new BitmapDrawable[2];
        this.B = new boolean[2];
        this.C = new AnimatorSet[2];
        this.D = 12;
        this.F = k6.H5;
        this.X = 132;
        this.c0 = true;
        this.d0 = true;
        this.e0 = true;
        this.u0 = new int[2];
        this.v0 = true;
        this.I0 = new s1(this, 0);
        this.J0 = new s1(this, 1);
        this.K0 = new ArrayList();
        this.M0 = true;
        this.N0 = 0.5f;
        this.P0 = true;
        this.O0 = g6Var;
        this.a0 = i10;
        int e6 = e(k6.h5);
        this.R0 = e6;
        boolean z4 = AndroidUtilities.computePerceivedBrightness(e6) < 0.721f;
        this.Q0 = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256) && z4;
        Rect rect = new Rect();
        this.x0 = rect;
        if (i10 != 3 || this.Q0) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
            this.w0 = mutate;
            this.y0 = i10 == 3 ? 0.55f : z4 ? 0.8f : 0.985f;
            mutate.setColorFilter(new PorterDuffColorFilter(this.R0, PorterDuff.Mode.MULTIPLY));
            mutate.getPadding(rect);
        }
        this.E = i10 == 3;
    }
}
