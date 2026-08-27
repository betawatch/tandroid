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
import hh.fa;
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
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.z70;
import org.telegram.ui.i80;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class b2 extends Dialog implements Drawable.Callback, NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int Y0 = 0;
    public final boolean[] A;
    public BitmapShader A0;
    public final AnimatorSet[] B;
    public Paint B0;
    public int C;
    public Paint C0;
    public boolean D;
    public boolean D0;
    public int E;
    public boolean E0;
    public DialogInterface.OnCancelListener F;
    public boolean F0;
    public b2 G;
    public boolean G0;
    public int H;
    public final q1 H0;
    public DialogInterface.OnClickListener I;
    public final q1 I0;
    public DialogInterface.OnDismissListener J;
    public final ArrayList J0;
    public Utilities.Callback K;
    public float K0;
    public CharSequence[] L;
    public boolean L0;
    public int[] M;
    public float M0;
    public CharSequence N;
    public final c6 N0;
    public String O;
    public boolean O0;
    public CharSequence P;
    public boolean P0;
    public int Q;
    public int Q0;
    public View R;
    public int R0;
    public boolean S;
    public long S0;
    public int T;
    public boolean T0;
    public int U;
    public FrameLayout U0;
    public Map V;
    public hh.b V0;
    public int W;
    public z1 W0;
    public Drawable X;
    public boolean X0;
    public int Y;
    public final int Z;
    public int a;
    public int a0;
    public View b;
    public boolean b0;
    public TextView c;
    public boolean c0;
    public ut d;
    public boolean d0;
    public int e;
    public boolean e0;
    public eh.s f;
    public boolean f0;
    public ri0 g0;
    public TextView h;
    public CharSequence h0;
    public a2 i0;
    public CharSequence j0;
    public a2 k0;
    public String l0;
    public rh.w3 m0;
    public ut n;
    public CharSequence n0;
    public a2 o0;
    public ViewGroup p0;
    public z70 q0;
    public FrameLayout r;
    public TextView r0;
    public FrameLayout s;
    public i80 s0;
    public final int[] t0;
    public boolean u0;
    public v1 v;
    public final Drawable v0;
    public LinearLayout w;
    public final Rect w0;
    public y1 x;
    public final float x0;
    public final BitmapDrawable[] y;
    public Bitmap y0;
    public Matrix z0;

    public b2(Context context) {
        this(context, 3, null);
    }

    public static void a(b2 b2Var, int i10, boolean z10) {
        boolean[] zArr = b2Var.A;
        AnimatorSet[] animatorSetArr = b2Var.B;
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
        animatorSetArr[i10].addListener(new w2(b2Var, i10, i11));
        try {
            animatorSetArr[i10].start();
        } catch (Exception e9) {
            FileLog.e(e9);
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
        long currentTimeMillis = System.currentTimeMillis() - this.S0;
        if (currentTimeMillis < j10) {
            AndroidUtilities.runOnUIThread(new q1(this, 0), currentTimeMillis - j10);
        } else {
            dismiss();
        }
    }

    public final View d(int i10) {
        ViewGroup viewGroup = this.p0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i10));
        }
        return null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ut utVar;
        if (i10 != NotificationCenter.emojiLoaded || (utVar = this.n) == null) {
            return;
        }
        utVar.invalidate();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Bitmap bitmap;
        Utilities.Callback callback = this.K;
        if (callback != null) {
            this.K = null;
            callback.run(new q1(this, 0));
            return;
        }
        if (this.X0) {
            return;
        }
        this.X0 = true;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        DialogInterface.OnDismissListener onDismissListener = this.J;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        b2 b2Var = this.G;
        if (b2Var != null) {
            b2Var.dismiss();
        }
        try {
            super.dismiss();
        } catch (Throwable unused) {
        }
        AndroidUtilities.cancelRunOnUIThread(this.I0);
        if (this.A0 == null || (bitmap = this.y0) == null) {
            return;
        }
        bitmap.recycle();
        this.A0 = null;
        this.B0 = null;
        this.y0 = null;
    }

    public int e(int i10) {
        return g6.v0(i10, this.N0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ViewGroup f(boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        z1 z1Var = new z1(getContext(), this);
        this.W0 = z1Var;
        final int i10 = 1;
        z1Var.setOrientation(1);
        boolean z11 = this.P0;
        int i11 = this.Z;
        int i12 = 3;
        final int i13 = 0;
        if ((z11 || i11 == 3) && i11 != 2) {
            this.W0.setBackground(null);
            this.W0.setPadding(0, 0, 0, 0);
            if (this.P0) {
                this.W0.setWillNotDraw(false);
            }
            this.e0 = false;
        } else {
            boolean z12 = this.f0;
            Drawable drawable = this.v0;
            if (z12) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.W0.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                this.e0 = true;
            } else {
                this.W0.setBackground(null);
                this.W0.setPadding(0, 0, 0, 0);
                this.W0.setBackground(drawable);
                z1 z1Var2 = this.W0;
                int dp = AndroidUtilities.dp(8.0f);
                float dp2 = AndroidUtilities.dp(20.0f);
                cg.l1 l1Var = gf.r0.a;
                z1Var2.setOutlineProvider(new gf.q0(dp, dp2));
                this.W0.setClipToOutline(true);
                this.e0 = false;
            }
        }
        ViewGroup viewGroup = this.W0;
        boolean z13 = this.T0;
        c6 c6Var = this.N0;
        if (z13) {
            if (this.U0 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.U0 = frameLayout;
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
                                new fa(b2Var.getContext(), b2Var.N0).show();
                                break;
                            default:
                                b2 b2Var2 = this.b;
                                DialogInterface.OnClickListener onClickListener = b2Var2.I;
                                if (onClickListener != null) {
                                    onClickListener.onClick(b2Var2, ((Integer) view.getTag()).intValue());
                                }
                                b2Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            if (this.V0 == null) {
                hh.b bVar = new hh.b(getContext(), UserConfig.selectedAccount, c6Var);
                this.V0 = bVar;
                h7.b6.a(bVar);
                this.V0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.s1
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
                                new fa(b2Var.getContext(), b2Var.N0).show();
                                break;
                            default:
                                b2 b2Var2 = this.b;
                                DialogInterface.OnClickListener onClickListener = b2Var2.I;
                                if (onClickListener != null) {
                                    onClickListener.onClick(b2Var2, ((Integer) view.getTag()).intValue());
                                }
                                b2Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            AndroidUtilities.removeFromParent(this.W0);
            AndroidUtilities.removeFromParent(this.V0);
            this.U0.addView(this.W0, h7.z5.e(-2, -2, 17));
            this.U0.addView(this.V0, h7.z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.U0;
        }
        if (z10) {
            if (this.T0) {
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
        boolean z14 = (this.h0 == null && this.j0 == null && this.l0 == null && this.n0 == null) ? false : true;
        if (this.Q == 0 && this.T == 0 && this.X == null) {
            View view = this.R;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                this.W0.addView(this.R, h7.z5.t(-1, this.W, 51, 0, 0, 0, 0));
            }
        } else {
            ri0 ri0Var = new ri0(getContext());
            this.g0 = ri0Var;
            Drawable drawable2 = this.X;
            if (drawable2 != null) {
                ri0Var.setImageDrawable(drawable2);
                Drawable drawable3 = this.X;
                if (drawable3 instanceof r6) {
                    r6 r6Var = (r6) drawable3;
                    this.g0.addOnAttachStateChangeListener(new t1(r6Var));
                    r6Var.a(this.g0);
                }
            } else {
                int i14 = this.Q;
                if (i14 != 0) {
                    ri0Var.setImageResource(i14);
                } else {
                    ri0Var.setAutoRepeat(this.O0);
                    ri0 ri0Var2 = this.g0;
                    int i15 = this.T;
                    int i16 = this.U;
                    ri0Var2.f(i15, i16, i16, null);
                    if (this.V != null) {
                        oi0 animatedDrawable = this.g0.getAnimatedDrawable();
                        for (Map.Entry entry : this.V.entrySet()) {
                            String str = (String) entry.getKey();
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.s.put(str, num);
                            animatedDrawable.E();
                        }
                    }
                    this.g0.d();
                }
            }
            this.g0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.S) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.Y);
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(128.0f));
                this.g0.setBackground(new u1(this, gradientDrawable));
                this.W = 92;
            } else {
                this.g0.setBackground(g6.c0(AndroidUtilities.dp(10.0f), 0, this.Y));
            }
            if (this.S) {
                this.g0.setTranslationY(AndroidUtilities.dp(16.0f));
            } else {
                this.g0.setTranslationY(0.0f);
            }
            this.g0.setPadding(0, 0, 0, 0);
            this.W0.addView(this.g0, h7.z5.t(-1, this.W, 51, 0, 0, 0, 0));
        }
        if (this.N != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.s = frameLayout2;
            this.W0.addView(frameLayout2, h7.z5.t(-2, -2, this.S ? 1 : 0, 24, 0, 24, 0));
            eh.s sVar = new eh.s(getContext(), null, false);
            this.f = sVar;
            NotificationCenter.listenEmojiLoading(sVar);
            eh.s sVar2 = this.f;
            sVar2.h = 3;
            sVar2.setText(this.N);
            this.f.setTextColor(e(g6.j5));
            this.f.setTextSize(1, 20.0f);
            this.f.setTypeface(AndroidUtilities.bold());
            this.f.setGravity((this.S ? 1 : LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout3 = this.s;
            eh.s sVar3 = this.f;
            boolean z15 = this.S;
            frameLayout3.addView(sVar3, h7.z5.d(-2, -2.0f, (z15 ? 1 : LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 19.0f, 0.0f, z15 ? 4.0f : this.O != null ? 2 : this.L != null ? 14 : 10));
        }
        if (this.O != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.O);
            this.h.setTextColor(e(g6.J5));
            this.h.setTextSize(1, 14.0f);
            this.h.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            this.W0.addView(this.h, h7.z5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, 0, 24, this.L != null ? 14 : 10));
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
            AndroidUtilities.setScrollViewEdgeEffectColor(this.v, e(g6.A5));
            this.W0.addView(this.v, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
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
        ut utVar = new ut(getContext());
        this.n = utVar;
        NotificationCenter.listenEmojiLoading(utVar);
        this.n.setTextColor(e(this.S ? g6.y6 : g6.j5));
        this.n.setTextSize(1, 16.0f);
        this.n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.n.setLinkTextColor(e(g6.k5));
        if (!this.b0) {
            this.n.setClickable(false);
            this.n.setEnabled(false);
        }
        this.n.setGravity((this.S ? 1 : LocaleController.isRTL ? 5 : 3) | 48);
        if (i11 == 2) {
            this.W0.addView(this.n, h7.z5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, this.N == null ? 19 : 0, 24, 20));
            z70 z70Var = new z70(getContext());
            this.q0 = z70Var;
            z70Var.a(this.a0 / 100.0f, false);
            this.q0.setProgressColor(e(g6.F5));
            this.q0.setBackColor(e(g6.G5));
            this.W0.addView(this.q0, h7.z5.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView2 = new TextView(getContext());
            this.r0 = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            this.r0.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            this.r0.setTextColor(e(g6.q5));
            this.r0.setTextSize(1, 14.0f);
            this.W0.addView(this.r0, h7.z5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 23, 4, 23, 24));
            this.r0.setText(String.format("%d%%", Integer.valueOf(this.a0)));
        } else if (i11 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.r = new FrameLayout(getContext());
            this.Q0 = e(g6.M5);
            if (!this.P0) {
                this.r.setBackgroundDrawable(g6.b0(AndroidUtilities.dp(18.0f), this.Q0));
            }
            this.W0.addView(this.r, h7.z5.q(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), c6Var);
            radialProgressView.setSize(AndroidUtilities.dp(32.0f));
            radialProgressView.setProgressColor(e(g6.N5));
            this.r.addView(radialProgressView, h7.z5.e(86, 86, 17));
        } else {
            ut utVar2 = this.d;
            if (utVar2 != null) {
                this.w.addView(utVar2, h7.z5.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            LinearLayout linearLayout2 = this.w;
            ut utVar3 = this.n;
            if (this.S) {
                r15 = 1;
            } else if (!LocaleController.isRTL) {
                r15 = 3;
            }
            linearLayout2.addView(utVar3, h7.z5.t(-2, -2, r15 | 48, 24, 0, 24, (this.b == null && this.L == null) ? 0 : this.C));
            TextView textView3 = this.c;
            if (textView3 != null) {
                this.w.addView(textView3, h7.z5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        int i17 = 8;
        if (TextUtils.isEmpty(this.P)) {
            this.n.setVisibility(8);
        } else {
            this.n.setText(this.P);
            this.n.setVisibility(0);
        }
        if (this.L != null) {
            int i18 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.L;
                if (i18 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i18] != null) {
                    x1 x1Var = new x1(getContext(), c6Var);
                    CharSequence charSequence = this.L[i18];
                    int[] iArr = this.M;
                    x1Var.a(iArr != null ? iArr[i18] : 0, charSequence);
                    x1Var.setTag(Integer.valueOf(i18));
                    this.J0.add(x1Var);
                    this.w.addView(x1Var, h7.z5.n(-1, 50));
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
                                    new fa(b2Var.getContext(), b2Var.N0).show();
                                    break;
                                default:
                                    b2 b2Var2 = this.b;
                                    DialogInterface.OnClickListener onClickListener = b2Var2.I;
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
            this.w.addView(this.b, h7.z5.n(-1, this.e));
        }
        if (z14) {
            if (!this.E0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                CharSequence charSequence2 = this.h0;
                int measureText = charSequence2 != null ? (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + AndroidUtilities.dp(24.0f) + 0) : 0;
                if (this.j0 != null) {
                    if (measureText > 0) {
                        measureText += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence3 = this.j0;
                    measureText = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + AndroidUtilities.dp(24.0f) + measureText);
                }
                if (this.l0 != null) {
                    if (measureText > 0) {
                        measureText += AndroidUtilities.dp(8.0f);
                    }
                    String str2 = this.l0;
                    measureText = (int) (textPaint.measureText((CharSequence) str2, 0, str2.length()) + AndroidUtilities.dp(24.0f) + measureText);
                }
                if (this.n0 != null) {
                    if (measureText > 0) {
                        measureText += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence4 = this.n0;
                    measureText = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + AndroidUtilities.dp(24.0f) + measureText);
                }
                if (measureText > AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f)) {
                    if (!this.F0 || this.h0 == null || this.j0 == null || this.l0 == null || this.n0 == null) {
                        this.E0 = true;
                    } else {
                        this.G0 = true;
                    }
                }
            }
            if (this.E0) {
                LinearLayout linearLayout3 = new LinearLayout(getContext());
                linearLayout3.setOrientation(1);
                this.p0 = linearLayout3;
            } else {
                this.p0 = new s2(this, getContext(), i10);
            }
            if (this.c != null) {
                this.p0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f11));
                this.p0.setTranslationY(-AndroidUtilities.dp(6.0f));
            } else {
                this.p0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            this.W0.addView(this.p0, h7.z5.n(-1, this.G0 ? 96 : 52));
            if (this.S) {
                this.p0.setTranslationY(-AndroidUtilities.dp(8.0f));
            }
            int i20 = 7;
            if (this.h0 != null) {
                w1 w1Var = new w1(getContext(), i13);
                w1Var.setMinWidth(AndroidUtilities.dp(64.0f));
                w1Var.setTag(-1);
                w1Var.setTextSize(1, 16.0f);
                w1Var.setTextColor(e(this.E));
                w1Var.setGravity(17);
                w1Var.setTypeface(AndroidUtilities.bold());
                w1Var.setText(this.h0);
                f12 = 64.0f;
                w1Var.setBackground(g6.G0(AndroidUtilities.dp(f10), e(this.E)));
                w1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.E0) {
                    f13 = 6.0f;
                    this.p0.addView(w1Var, h7.z5.q(-1, 40, 7));
                } else {
                    f13 = 6.0f;
                    this.p0.addView(w1Var, h7.z5.e(-2, 40, 53));
                }
                w1Var.setOnClickListener(new nh.x1(6, this, w1Var));
            } else {
                f12 = 64.0f;
                f13 = 6.0f;
            }
            if (this.j0 != null) {
                w1 w1Var2 = new w1(getContext(), i10);
                w1Var2.setMinWidth(AndroidUtilities.dp(f12));
                w1Var2.setTag(-2);
                w1Var2.setTextSize(1, 16.0f);
                w1Var2.setTextColor(e(this.E));
                w1Var2.setGravity(17);
                w1Var2.setTypeface(AndroidUtilities.bold());
                w1Var2.setEllipsize(TextUtils.TruncateAt.END);
                w1Var2.setSingleLine(true);
                w1Var2.setText(this.j0.toString());
                w1Var2.setBackground(g6.G0(AndroidUtilities.dp(f10), e(this.E)));
                w1Var2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.E0) {
                    this.p0.addView(w1Var2, 0, h7.z5.q(-1, 40, 7));
                } else {
                    this.p0.addView(w1Var2, h7.z5.e(-2, 40, 53));
                }
                w1Var2.setOnClickListener(new nh.x1(i20, this, w1Var2));
            }
            if (this.n0 != null) {
                w1 w1Var3 = new w1(getContext(), 2);
                w1Var3.setMinWidth(AndroidUtilities.dp(f12));
                w1Var3.setTag(-3);
                w1Var3.setTextSize(1, 16.0f);
                w1Var3.setTextColor(e(this.E));
                w1Var3.setGravity(17);
                w1Var3.setTypeface(AndroidUtilities.bold());
                w1Var3.setEllipsize(TextUtils.TruncateAt.END);
                w1Var3.setSingleLine(true);
                w1Var3.setText(this.n0.toString());
                w1Var3.setBackground(g6.G0(AndroidUtilities.dp(f10), e(this.E)));
                w1Var3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.E0) {
                    this.p0.addView(w1Var3, 1, h7.z5.q(-1, 40, 7));
                } else {
                    this.p0.addView(w1Var3, h7.z5.e(-2, 40, 51));
                }
                w1Var3.setOnClickListener(new nh.x1(i17, this, w1Var3));
            }
            if (this.l0 != null) {
                w1 w1Var4 = new w1(getContext(), i12);
                w1Var4.setMinWidth(AndroidUtilities.dp(f12));
                w1Var4.setTag(-4);
                w1Var4.setTextSize(1, 16.0f);
                w1Var4.setTextColor(e(this.E));
                w1Var4.setGravity(17);
                w1Var4.setTypeface(AndroidUtilities.bold());
                w1Var4.setEllipsize(TextUtils.TruncateAt.END);
                w1Var4.setSingleLine(true);
                w1Var4.setText(this.l0.toString());
                w1Var4.setBackground(g6.G0(AndroidUtilities.dp(f10), e(this.E)));
                w1Var4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.E0) {
                    this.p0.addView(w1Var4, 0, h7.z5.q(-1, 40, 7));
                } else {
                    this.p0.addView(w1Var4, h7.z5.e(-2, 40, 53));
                }
                w1Var4.setOnClickListener(new nh.x1(9, this, w1Var4));
            }
            if (this.E0) {
                for (int i21 = 1; i21 < this.p0.getChildCount(); i21++) {
                    ((ViewGroup.MarginLayoutParams) this.p0.getChildAt(i21).getLayoutParams()).topMargin = AndroidUtilities.dp(f13);
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.T0) {
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            window.setWindowAnimations(R.style.DialogNoAnimation);
        } else if (i11 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.L0) {
                layoutParams3.dimAmount = this.M0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags ^= 2;
            }
            int i22 = AndroidUtilities.displaySize.x;
            this.H = i22;
            int min = Math.min(AndroidUtilities.isTablet() ? AndroidUtilities.isSmallTablet() ? AndroidUtilities.dp(446.0f) : AndroidUtilities.dp(496.0f) : AndroidUtilities.dp(356.0f), (i22 - AndroidUtilities.dp(48.0f)) - (this.R0 * 2));
            Rect rect2 = this.w0;
            layoutParams3.width = min + rect2.left + rect2.right;
        }
        View view3 = this.b;
        if (view3 != null && this.u0 && b(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.P0) {
            AndroidUtilities.makeGlobalBlurBitmap(new x0(this, i10), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final we.d g(int i10, boolean z10, boolean z11) {
        View d = d(i10);
        if (z11) {
            this.d0 = false;
        }
        return new we.d(new p(d, 5), new hh.t5(this, d, z10, 7));
    }

    public final void h() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            textView.setTextColor(e(g6.q7));
        }
    }

    public final void i(int i10) {
        this.Q0 = i10;
        Drawable drawable = this.v0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.Q0, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.v.invalidate();
        this.w.invalidate();
    }

    public final void j() {
        this.c0 = false;
    }

    public final void k(boolean z10) {
        if (this.D0) {
            return;
        }
        this.D0 = true;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.D0) {
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
            ArrayList arrayList = this.J0;
            if (i10 >= arrayList.size()) {
                return;
            }
            x1 x1Var = (x1) arrayList.get(i10);
            x1Var.a.setTextColor(i11);
            x1Var.b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void m(String str) {
        this.P = str;
        if (this.n != null) {
            if (TextUtils.isEmpty(str)) {
                this.n.setVisibility(8);
            } else {
                this.n.setText(this.P);
                this.n.setVisibility(0);
            }
        }
    }

    public final void n(int i10) {
        this.a0 = i10;
        z70 z70Var = this.q0;
        if (z70Var != null) {
            z70Var.a(i10 / 100.0f, true);
            this.r0.setText(String.format("%d%%", Integer.valueOf(this.a0)));
        }
    }

    public final void o(int i10) {
        eh.s sVar = this.f;
        if (sVar != null) {
            sVar.setTextColor(i10);
        }
        ut utVar = this.n;
        if (utVar != null) {
            utVar.setTextColor(i10);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        i80 i80Var = this.s0;
        if (i80Var != null) {
            i80Var.f(this, -2);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f(true);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public final void p() {
        if (this.c0 && this.G == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.N0);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.StopLoadingTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.StopLoading);
            alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new n(this, 3));
            alertDialog$Builder.j(new r1(this, 0));
            try {
                this.G = alertDialog$Builder.o();
            } catch (Exception unused) {
            }
        }
    }

    public void q(long j10) {
        q1 q1Var = this.I0;
        AndroidUtilities.cancelRunOnUIThread(q1Var);
        AndroidUtilities.runOnUIThread(q1Var, j10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        v1 v1Var = this.v;
        if (v1Var != null) {
            v1Var.postDelayed(runnable, j10);
        }
    }

    @Override // android.app.Dialog
    public final void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.F = onCancelListener;
        super.setOnCancelListener(onCancelListener);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.N = charSequence;
        eh.s sVar = this.f;
        if (sVar != null) {
            sVar.setText(charSequence);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            this.X0 = false;
            super.show();
            FrameLayout frameLayout = this.r;
            if (frameLayout != null && this.Z == 3) {
                frameLayout.setScaleX(0.0f);
                this.r.setScaleY(0.0f);
                this.r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
            }
            this.S0 = System.currentTimeMillis();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        v1 v1Var = this.v;
        if (v1Var != null) {
            v1Var.removeCallbacks(runnable);
        }
    }

    public b2(Context context, int i10, c6 c6Var) {
        super(context, R.style.TransparentDialog);
        this.a = -1;
        this.e = -2;
        this.y = new BitmapDrawable[2];
        this.A = new boolean[2];
        this.B = new AnimatorSet[2];
        this.C = 12;
        this.E = g6.H5;
        this.W = 132;
        this.b0 = true;
        this.c0 = true;
        this.d0 = true;
        this.t0 = new int[2];
        this.u0 = true;
        this.H0 = new q1(this, 0);
        this.I0 = new q1(this, 1);
        this.J0 = new ArrayList();
        this.L0 = true;
        this.M0 = 0.5f;
        this.O0 = true;
        this.N0 = c6Var;
        this.Z = i10;
        int e9 = e(g6.h5);
        this.Q0 = e9;
        boolean z10 = AndroidUtilities.computePerceivedBrightness(e9) < 0.721f;
        this.P0 = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256) && z10;
        Rect rect = new Rect();
        this.w0 = rect;
        if (i10 != 3 || this.P0) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
            this.v0 = mutate;
            this.x0 = i10 == 3 ? 0.55f : z10 ? 0.8f : 0.985f;
            mutate.setColorFilter(new PorterDuffColorFilter(this.Q0, PorterDuff.Mode.MULTIPLY));
            mutate.getPadding(rect);
        }
        this.D = i10 == 3;
    }
}
