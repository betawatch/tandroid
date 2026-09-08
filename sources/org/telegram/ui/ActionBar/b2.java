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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.y6;
import org.telegram.ui.z80;
import zh.l7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class b2 extends Dialog implements Drawable.Callback, NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int c1 = 0;
    public final Rect A0;
    public final float B0;
    public Bitmap C0;
    public Matrix D0;
    public final boolean[] E;
    public BitmapShader E0;
    public final AnimatorSet[] F;
    public Paint F0;
    public int G;
    public Paint G0;
    public boolean H;
    public boolean H0;
    public int I;
    public boolean I0;
    public DialogInterface.OnCancelListener J;
    public boolean J0;
    public b2 K;
    public boolean K0;
    public int L;
    public final q1 L0;
    public DialogInterface.OnClickListener M;
    public final q1 M0;
    public DialogInterface.OnDismissListener N;
    public final ArrayList N0;
    public Utilities.Callback O;
    public float O0;
    public CharSequence[] P;
    public boolean P0;
    public int[] Q;
    public float Q0;
    public CharSequence R;
    public final f6 R0;
    public String S;
    public boolean S0;
    public CharSequence T;
    public boolean T0;
    public int U;
    public int U0;
    public View V;
    public int V0;
    public boolean W;
    public long W0;
    public int X;
    public boolean X0;
    public int Y;
    public FrameLayout Y0;
    public Map Z;
    public zh.a Z0;
    public int a;
    public int a0;
    public z1 a1;
    public View b;
    public Drawable b0;
    public boolean b1;
    public TextView c;
    public int c0;
    public iu d;
    public final int d0;
    public int e;
    public int e0;
    public wh.p f;
    public boolean f0;
    public boolean g0;
    public TextView h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public aj0 k0;
    public CharSequence l0;
    public a2 m0;
    public iu n;
    public CharSequence n0;
    public a2 o0;
    public String p0;
    public ji.e4 q0;
    public FrameLayout r;
    public CharSequence r0;
    public FrameLayout s;
    public a2 s0;
    public ViewGroup t0;
    public m80 u0;
    public v1 v;
    public TextView v0;
    public LinearLayout w;
    public z80 w0;
    public y1 x;
    public final int[] x0;
    public final BitmapDrawable[] y;
    public boolean y0;
    public final Drawable z0;

    public b2(Context context) {
        this(context, 3, null);
    }

    public static void a(b2 b2Var, int i10, boolean z10) {
        boolean[] zArr = b2Var.E;
        AnimatorSet[] animatorSetArr = b2Var.F;
        if ((!z10 || zArr[i10]) && (z10 || !zArr[i10])) {
            return;
        }
        zArr[i10] = z10;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i10] = animatorSet2;
        BitmapDrawable bitmapDrawable = b2Var.y[i10];
        int i11 = 1;
        if (bitmapDrawable != null) {
            animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", z10 ? 255 : 0));
        }
        animatorSetArr[i10].setDuration(150L);
        animatorSetArr[i10].addListener(new x2(b2Var, i10, i11));
        try {
            animatorSetArr[i10].start();
        } catch (Exception e7) {
            FileLog.e(e7);
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

    public final void c(long j3) {
        long currentTimeMillis = System.currentTimeMillis() - this.W0;
        if (currentTimeMillis < j3) {
            AndroidUtilities.runOnUIThread(new q1(this, 0), currentTimeMillis - j3);
        } else {
            dismiss();
        }
    }

    public final View d(int i10) {
        ViewGroup viewGroup = this.t0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i10));
        }
        return null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        iu iuVar;
        if (i10 != NotificationCenter.emojiLoaded || (iuVar = this.n) == null) {
            return;
        }
        iuVar.invalidate();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Bitmap bitmap;
        Utilities.Callback callback = this.O;
        if (callback != null) {
            this.O = null;
            callback.run(new q1(this, 0));
            return;
        }
        if (this.b1) {
            return;
        }
        this.b1 = true;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        DialogInterface.OnDismissListener onDismissListener = this.N;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        b2 b2Var = this.K;
        if (b2Var != null) {
            b2Var.dismiss();
        }
        try {
            super.dismiss();
        } catch (Throwable unused) {
        }
        AndroidUtilities.cancelRunOnUIThread(this.M0);
        if (this.E0 == null || (bitmap = this.C0) == null) {
            return;
        }
        bitmap.recycle();
        this.E0 = null;
        this.F0 = null;
        this.C0 = null;
    }

    public int e(int i10) {
        return j6.v0(i10, this.R0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ViewGroup f(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        z1 z1Var = new z1(getContext(), this);
        this.a1 = z1Var;
        final int i10 = 1;
        z1Var.setOrientation(1);
        boolean z11 = this.T0;
        int i11 = this.d0;
        int i12 = 3;
        final int i13 = 0;
        if ((z11 || i11 == 3) && i11 != 2) {
            this.a1.setBackground(null);
            this.a1.setPadding(0, 0, 0, 0);
            if (this.T0) {
                this.a1.setWillNotDraw(false);
            }
            this.i0 = false;
        } else {
            boolean z12 = this.j0;
            Drawable drawable = this.z0;
            if (z12) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.a1.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                this.i0 = true;
            } else {
                this.a1.setBackground(null);
                this.a1.setPadding(0, 0, 0, 0);
                this.a1.setBackground(drawable);
                z1 z1Var2 = this.a1;
                int dp = AndroidUtilities.dp(8.0f);
                float dp2 = AndroidUtilities.dp(20.0f);
                bi.z1 z1Var3 = yf.j0.a;
                z1Var2.setOutlineProvider(new yf.i0(dp, dp2));
                this.a1.setClipToOutline(true);
                this.i0 = false;
            }
        }
        ViewGroup viewGroup = this.a1;
        boolean z13 = this.X0;
        f6 f6Var = this.R0;
        if (z13) {
            if (this.Y0 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.Y0 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.s1
                    public final /* synthetic */ b2 b;

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
                                b2 b2Var = this.b;
                                new l7(b2Var.getContext(), b2Var.R0).show();
                                break;
                            default:
                                b2 b2Var2 = this.b;
                                DialogInterface.OnClickListener onClickListener = b2Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(b2Var2, ((Integer) view.getTag()).intValue());
                                }
                                b2Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            if (this.Z0 == null) {
                zh.a aVar = new zh.a(getContext(), UserConfig.selectedAccount, f6Var);
                this.Z0 = aVar;
                w7.z5.a(aVar);
                this.Z0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.s1
                    public final /* synthetic */ b2 b;

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
                                b2 b2Var = this.b;
                                new l7(b2Var.getContext(), b2Var.R0).show();
                                break;
                            default:
                                b2 b2Var2 = this.b;
                                DialogInterface.OnClickListener onClickListener = b2Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(b2Var2, ((Integer) view.getTag()).intValue());
                                }
                                b2Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            AndroidUtilities.removeFromParent(this.a1);
            AndroidUtilities.removeFromParent(this.Z0);
            this.Y0.addView(this.a1, w7.x5.e(-2, -2, 17));
            this.Y0.addView(this.Z0, w7.x5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.Y0;
        }
        if (z10) {
            if (this.X0) {
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
        boolean z14 = (this.l0 == null && this.n0 == null && this.p0 == null && this.r0 == null) ? false : true;
        if (this.U == 0 && this.X == 0 && this.b0 == null) {
            View view = this.V;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                this.a1.addView(this.V, w7.x5.t(-1, this.a0, 51, 0, 0, 0, 0));
            }
        } else {
            aj0 aj0Var = new aj0(getContext());
            this.k0 = aj0Var;
            Drawable drawable2 = this.b0;
            if (drawable2 != null) {
                aj0Var.setImageDrawable(drawable2);
                Drawable drawable3 = this.b0;
                if (drawable3 instanceof y6) {
                    y6 y6Var = (y6) drawable3;
                    this.k0.addOnAttachStateChangeListener(new t1(y6Var));
                    y6Var.a(this.k0);
                }
            } else {
                int i14 = this.U;
                if (i14 != 0) {
                    aj0Var.setImageResource(i14);
                } else {
                    aj0Var.setAutoRepeat(this.S0);
                    aj0 aj0Var2 = this.k0;
                    int i15 = this.X;
                    int i16 = this.Y;
                    aj0Var2.f(i15, i16, i16, null);
                    if (this.Z != null) {
                        xi0 animatedDrawable = this.k0.getAnimatedDrawable();
                        for (Map.Entry entry : this.Z.entrySet()) {
                            String str = (String) entry.getKey();
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.s.put(str, num);
                            animatedDrawable.E();
                        }
                    }
                    this.k0.d();
                }
            }
            this.k0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.W) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.c0);
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(128.0f));
                this.k0.setBackground(new u1(this, gradientDrawable));
                this.a0 = 92;
            } else {
                this.k0.setBackground(j6.c0(AndroidUtilities.dp(10.0f), 0, this.c0));
            }
            if (this.W) {
                this.k0.setTranslationY(AndroidUtilities.dp(16.0f));
            } else {
                this.k0.setTranslationY(0.0f);
            }
            this.k0.setPadding(0, 0, 0, 0);
            this.a1.addView(this.k0, w7.x5.t(-1, this.a0, 51, 0, 0, 0, 0));
        }
        if (this.R != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.s = frameLayout2;
            this.a1.addView(frameLayout2, w7.x5.t(-2, -2, this.W ? 1 : 0, 24, 0, 24, 0));
            wh.p pVar = new wh.p(getContext(), null, false);
            this.f = pVar;
            NotificationCenter.listenEmojiLoading(pVar);
            wh.p pVar2 = this.f;
            pVar2.h = 3;
            pVar2.setText(this.R);
            this.f.setTextColor(e(j6.j5));
            this.f.setTextSize(1, 20.0f);
            this.f.setTypeface(AndroidUtilities.bold());
            this.f.setGravity((this.W ? 1 : LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout3 = this.s;
            wh.p pVar3 = this.f;
            boolean z15 = this.W;
            frameLayout3.addView(pVar3, w7.x5.d(-2, -2.0f, (z15 ? 1 : LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 19.0f, 0.0f, z15 ? 4.0f : this.S != null ? 2 : this.P != null ? 14 : 10));
        }
        if (this.S != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.S);
            this.h.setTextColor(e(j6.J5));
            this.h.setTextSize(1, 14.0f);
            this.h.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            this.a1.addView(this.h, w7.x5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, 0, 24, this.P != null ? 14 : 10));
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
            v1 v1Var = new v1(this, getContext(), i13);
            this.v = v1Var;
            v1Var.setVerticalScrollBarEnabled(false);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.v, e(j6.A5));
            this.a1.addView(this.v, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.w = linearLayout;
            linearLayout.setOrientation(1);
            f7 = 20.0f;
            f10 = 4.0f;
            this.v.addView(this.w, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f7 = 20.0f;
            f10 = 4.0f;
        }
        iu iuVar = new iu(getContext());
        this.n = iuVar;
        NotificationCenter.listenEmojiLoading(iuVar);
        this.n.setTextColor(e(this.W ? j6.y6 : j6.j5));
        this.n.setTextSize(1, 16.0f);
        this.n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.n.setLinkTextColor(e(j6.k5));
        if (!this.f0) {
            this.n.setClickable(false);
            this.n.setEnabled(false);
        }
        this.n.setGravity((this.W ? 1 : LocaleController.isRTL ? 5 : 3) | 48);
        int i17 = 19;
        if (i11 == 2) {
            this.a1.addView(this.n, w7.x5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, this.R == null ? 19 : 0, 24, 20));
            m80 m80Var = new m80(getContext());
            this.u0 = m80Var;
            m80Var.a(this.e0 / 100.0f, false);
            this.u0.setProgressColor(e(j6.F5));
            this.u0.setBackColor(e(j6.G5));
            this.a1.addView(this.u0, w7.x5.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView2 = new TextView(getContext());
            this.v0 = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            this.v0.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            this.v0.setTextColor(e(j6.q5));
            this.v0.setTextSize(1, 14.0f);
            this.a1.addView(this.v0, w7.x5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 23, 4, 23, 24));
            this.v0.setText(String.format("%d%%", Integer.valueOf(this.e0)));
        } else if (i11 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.r = new FrameLayout(getContext());
            this.U0 = e(j6.M5);
            if (!this.T0) {
                this.r.setBackgroundDrawable(j6.b0(AndroidUtilities.dp(18.0f), this.U0));
            }
            this.a1.addView(this.r, w7.x5.q(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), f6Var);
            radialProgressView.setSize(AndroidUtilities.dp(32.0f));
            radialProgressView.setProgressColor(e(j6.N5));
            this.r.addView(radialProgressView, w7.x5.e(86, 86, 17));
        } else {
            iu iuVar2 = this.d;
            if (iuVar2 != null) {
                this.w.addView(iuVar2, w7.x5.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            LinearLayout linearLayout2 = this.w;
            iu iuVar3 = this.n;
            if (this.W) {
                r15 = 1;
            } else if (!LocaleController.isRTL) {
                r15 = 3;
            }
            linearLayout2.addView(iuVar3, w7.x5.t(-2, -2, r15 | 48, 24, 0, 24, (this.b == null && this.P == null) ? 0 : this.G));
            TextView textView3 = this.c;
            if (textView3 != null) {
                this.w.addView(textView3, w7.x5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        if (TextUtils.isEmpty(this.T)) {
            this.n.setVisibility(8);
        } else {
            this.n.setText(this.T);
            this.n.setVisibility(0);
        }
        if (this.P != null) {
            int i18 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.P;
                if (i18 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i18] != null) {
                    x1 x1Var = new x1(getContext(), f6Var);
                    CharSequence charSequence = this.P[i18];
                    int[] iArr = this.Q;
                    x1Var.a(iArr != null ? iArr[i18] : 0, charSequence);
                    x1Var.setTag(Integer.valueOf(i18));
                    this.N0.add(x1Var);
                    this.w.addView(x1Var, w7.x5.n(-1, 50));
                    final int i19 = 2;
                    x1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.s1
                        public final /* synthetic */ b2 b;

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
                                    b2 b2Var = this.b;
                                    new l7(b2Var.getContext(), b2Var.R0).show();
                                    break;
                                default:
                                    b2 b2Var2 = this.b;
                                    DialogInterface.OnClickListener onClickListener = b2Var2.M;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(b2Var2, ((Integer) view2.getTag()).intValue());
                                    }
                                    b2Var2.dismiss();
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
            this.w.addView(this.b, w7.x5.n(-1, this.e));
        }
        if (z14) {
            if (!this.I0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                CharSequence charSequence2 = this.l0;
                int measureText = charSequence2 != null ? (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + AndroidUtilities.dp(24.0f) + 0) : 0;
                if (this.n0 != null) {
                    if (measureText > 0) {
                        measureText += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence3 = this.n0;
                    measureText = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + AndroidUtilities.dp(24.0f) + measureText);
                }
                if (this.p0 != null) {
                    if (measureText > 0) {
                        measureText += AndroidUtilities.dp(8.0f);
                    }
                    String str2 = this.p0;
                    measureText = (int) (textPaint.measureText((CharSequence) str2, 0, str2.length()) + AndroidUtilities.dp(24.0f) + measureText);
                }
                if (this.r0 != null) {
                    if (measureText > 0) {
                        measureText += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence4 = this.r0;
                    measureText = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + AndroidUtilities.dp(24.0f) + measureText);
                }
                if (measureText > AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f)) {
                    if (!this.J0 || this.l0 == null || this.n0 == null || this.p0 == null || this.r0 == null) {
                        this.I0 = true;
                    } else {
                        this.K0 = true;
                    }
                }
            }
            if (this.I0) {
                LinearLayout linearLayout3 = new LinearLayout(getContext());
                linearLayout3.setOrientation(1);
                this.t0 = linearLayout3;
            } else {
                this.t0 = new t2(this, getContext(), i10);
            }
            if (this.c != null) {
                this.t0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f10));
                this.t0.setTranslationY(-AndroidUtilities.dp(6.0f));
            } else {
                this.t0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            this.a1.addView(this.t0, w7.x5.n(-1, this.K0 ? 96 : 52));
            if (this.W) {
                this.t0.setTranslationY(-AndroidUtilities.dp(8.0f));
            }
            if (this.l0 != null) {
                w1 w1Var = new w1(getContext(), i13);
                w1Var.setMinWidth(AndroidUtilities.dp(64.0f));
                w1Var.setTag(-1);
                w1Var.setTextSize(1, 16.0f);
                w1Var.setTextColor(e(this.I));
                w1Var.setGravity(17);
                w1Var.setTypeface(AndroidUtilities.bold());
                w1Var.setText(this.l0);
                f11 = 64.0f;
                w1Var.setBackground(j6.G0(AndroidUtilities.dp(f7), e(this.I)));
                w1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.I0) {
                    f12 = 6.0f;
                    this.t0.addView(w1Var, w7.x5.q(-1, 40, 7));
                } else {
                    f12 = 6.0f;
                    this.t0.addView(w1Var, w7.x5.e(-2, 40, 53));
                }
                w1Var.setOnClickListener(new bi.u1(18, this, w1Var));
            } else {
                f11 = 64.0f;
                f12 = 6.0f;
            }
            if (this.n0 != null) {
                w1 w1Var2 = new w1(getContext(), i10);
                w1Var2.setMinWidth(AndroidUtilities.dp(f11));
                w1Var2.setTag(-2);
                w1Var2.setTextSize(1, 16.0f);
                w1Var2.setTextColor(e(this.I));
                w1Var2.setGravity(17);
                w1Var2.setTypeface(AndroidUtilities.bold());
                w1Var2.setEllipsize(TextUtils.TruncateAt.END);
                w1Var2.setSingleLine(true);
                w1Var2.setText(this.n0.toString());
                w1Var2.setBackground(j6.G0(AndroidUtilities.dp(f7), e(this.I)));
                w1Var2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.I0) {
                    this.t0.addView(w1Var2, 0, w7.x5.q(-1, 40, 7));
                } else {
                    this.t0.addView(w1Var2, w7.x5.e(-2, 40, 53));
                }
                w1Var2.setOnClickListener(new bi.u1(i17, this, w1Var2));
            }
            if (this.r0 != null) {
                w1 w1Var3 = new w1(getContext(), 2);
                w1Var3.setMinWidth(AndroidUtilities.dp(f11));
                w1Var3.setTag(-3);
                w1Var3.setTextSize(1, 16.0f);
                w1Var3.setTextColor(e(this.I));
                w1Var3.setGravity(17);
                w1Var3.setTypeface(AndroidUtilities.bold());
                w1Var3.setEllipsize(TextUtils.TruncateAt.END);
                w1Var3.setSingleLine(true);
                w1Var3.setText(this.r0.toString());
                w1Var3.setBackground(j6.G0(AndroidUtilities.dp(f7), e(this.I)));
                w1Var3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.I0) {
                    this.t0.addView(w1Var3, 1, w7.x5.q(-1, 40, 7));
                } else {
                    this.t0.addView(w1Var3, w7.x5.e(-2, 40, 51));
                }
                w1Var3.setOnClickListener(new bi.u1(20, this, w1Var3));
            }
            if (this.p0 != null) {
                w1 w1Var4 = new w1(getContext(), i12);
                w1Var4.setMinWidth(AndroidUtilities.dp(f11));
                w1Var4.setTag(-4);
                w1Var4.setTextSize(1, 16.0f);
                w1Var4.setTextColor(e(this.I));
                w1Var4.setGravity(17);
                w1Var4.setTypeface(AndroidUtilities.bold());
                w1Var4.setEllipsize(TextUtils.TruncateAt.END);
                w1Var4.setSingleLine(true);
                w1Var4.setText(this.p0.toString());
                w1Var4.setBackground(j6.G0(AndroidUtilities.dp(f7), e(this.I)));
                w1Var4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.I0) {
                    this.t0.addView(w1Var4, 0, w7.x5.q(-1, 40, 7));
                } else {
                    this.t0.addView(w1Var4, w7.x5.e(-2, 40, 53));
                }
                w1Var4.setOnClickListener(new bi.u1(21, this, w1Var4));
            }
            if (this.I0) {
                for (int i20 = 1; i20 < this.t0.getChildCount(); i20++) {
                    ((ViewGroup.MarginLayoutParams) this.t0.getChildAt(i20).getLayoutParams()).topMargin = AndroidUtilities.dp(f12);
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.X0) {
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            window.setWindowAnimations(R.style.DialogNoAnimation);
        } else if (i11 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.P0) {
                layoutParams3.dimAmount = this.Q0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags ^= 2;
            }
            int i21 = AndroidUtilities.displaySize.x;
            this.L = i21;
            int min = Math.min(AndroidUtilities.isTablet() ? AndroidUtilities.isSmallTablet() ? AndroidUtilities.dp(446.0f) : AndroidUtilities.dp(496.0f) : AndroidUtilities.dp(356.0f), (i21 - AndroidUtilities.dp(48.0f)) - (this.V0 * 2));
            Rect rect2 = this.A0;
            layoutParams3.width = min + rect2.left + rect2.right;
        }
        View view3 = this.b;
        if (view3 != null && this.y0 && b(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.T0) {
            AndroidUtilities.makeGlobalBlurBitmap(new x0(this, i10), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final of.e g(int i10, boolean z10, boolean z11) {
        View d = d(i10);
        if (z11) {
            this.h0 = false;
        }
        return new of.e(new q(d, 5), new di.y0(this, d, z10, 9));
    }

    public final void h() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            textView.setTextColor(e(j6.q7));
        }
    }

    public final void i(int i10) {
        this.U0 = i10;
        Drawable drawable = this.z0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.U0, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.v.invalidate();
        this.w.invalidate();
    }

    public final void j() {
        this.g0 = false;
    }

    public final void k(boolean z10) {
        if (this.H0) {
            return;
        }
        this.H0 = true;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.H0) {
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
            ArrayList arrayList = this.N0;
            if (i10 >= arrayList.size()) {
                return;
            }
            x1 x1Var = (x1) arrayList.get(i10);
            x1Var.a.setTextColor(i11);
            x1Var.b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void m(String str) {
        this.T = str;
        if (this.n != null) {
            if (TextUtils.isEmpty(str)) {
                this.n.setVisibility(8);
            } else {
                this.n.setText(this.T);
                this.n.setVisibility(0);
            }
        }
    }

    public final void n(int i10) {
        this.e0 = i10;
        m80 m80Var = this.u0;
        if (m80Var != null) {
            m80Var.a(i10 / 100.0f, true);
            this.v0.setText(String.format("%d%%", Integer.valueOf(this.e0)));
        }
    }

    public final void o(int i10) {
        wh.p pVar = this.f;
        if (pVar != null) {
            pVar.setTextColor(i10);
        }
        iu iuVar = this.n;
        if (iuVar != null) {
            iuVar.setTextColor(i10);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        z80 z80Var = this.w0;
        if (z80Var != null) {
            z80Var.g(this, -2);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f(true);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public final void p() {
        if (this.g0 && this.K == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.R0);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.StopLoadingTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.StopLoading);
            alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new n(this, 3));
            alertDialog$Builder.j(new r1(this, 0));
            try {
                this.K = alertDialog$Builder.o();
            } catch (Exception unused) {
            }
        }
    }

    public void q(long j3) {
        q1 q1Var = this.M0;
        AndroidUtilities.cancelRunOnUIThread(q1Var);
        AndroidUtilities.runOnUIThread(q1Var, j3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        v1 v1Var = this.v;
        if (v1Var != null) {
            v1Var.postDelayed(runnable, j3);
        }
    }

    @Override // android.app.Dialog
    public final void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.J = onCancelListener;
        super.setOnCancelListener(onCancelListener);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.R = charSequence;
        wh.p pVar = this.f;
        if (pVar != null) {
            pVar.setText(charSequence);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            this.b1 = false;
            super.show();
            FrameLayout frameLayout = this.r;
            if (frameLayout != null && this.d0 == 3) {
                frameLayout.setScaleX(0.0f);
                this.r.setScaleY(0.0f);
                this.r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
            }
            this.W0 = System.currentTimeMillis();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        v1 v1Var = this.v;
        if (v1Var != null) {
            v1Var.removeCallbacks(runnable);
        }
    }

    public b2(Context context, int i10, f6 f6Var) {
        super(context, R.style.TransparentDialog);
        this.a = -1;
        this.e = -2;
        this.y = new BitmapDrawable[2];
        this.E = new boolean[2];
        this.F = new AnimatorSet[2];
        this.G = 12;
        this.I = j6.H5;
        this.a0 = 132;
        this.f0 = true;
        this.g0 = true;
        this.h0 = true;
        this.x0 = new int[2];
        this.y0 = true;
        this.L0 = new q1(this, 0);
        this.M0 = new q1(this, 1);
        this.N0 = new ArrayList();
        this.P0 = true;
        this.Q0 = 0.5f;
        this.S0 = true;
        this.R0 = f6Var;
        this.d0 = i10;
        int e7 = e(j6.h5);
        this.U0 = e7;
        boolean z10 = AndroidUtilities.computePerceivedBrightness(e7) < 0.721f;
        this.T0 = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256) && z10;
        Rect rect = new Rect();
        this.A0 = rect;
        if (i10 != 3 || this.T0) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
            this.z0 = mutate;
            this.B0 = i10 == 3 ? 0.55f : z10 ? 0.8f : 0.985f;
            mutate.setColorFilter(new PorterDuffColorFilter(this.U0, PorterDuff.Mode.MULTIPLY));
            mutate.getPadding(rect);
        }
        this.H = i10 == 3;
    }
}
