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
import gh.fa;
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
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.vt;
import org.telegram.ui.e80;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class c2 extends Dialog implements Drawable.Callback, NotificationCenter.NotificationCenterDelegate {
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
    public c2 G;
    public boolean G0;
    public int H;
    public final r1 H0;
    public DialogInterface.OnClickListener I;
    public final r1 I0;
    public DialogInterface.OnDismissListener J;
    public final ArrayList J0;
    public Utilities.Callback K;
    public float K0;
    public CharSequence[] L;
    public boolean L0;
    public int[] M;
    public float M0;
    public CharSequence N;
    public final b6 N0;
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
    public gh.b V0;
    public int W;
    public a2 W0;
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
    public vt d;
    public boolean d0;
    public int e;
    public boolean e0;
    public dh.u f;
    public boolean f0;
    public pi0 g0;
    public TextView h;
    public CharSequence h0;
    public b2 i0;
    public CharSequence j0;
    public b2 k0;
    public String l0;
    public qh.v3 m0;
    public vt n;
    public CharSequence n0;
    public b2 o0;
    public ViewGroup p0;
    public v70 q0;
    public FrameLayout r;
    public TextView r0;
    public FrameLayout s;
    public e80 s0;
    public final int[] t0;
    public boolean u0;
    public w1 v;
    public final Drawable v0;
    public LinearLayout w;
    public final Rect w0;
    public z1 x;
    public final float x0;
    public final BitmapDrawable[] y;
    public Bitmap y0;
    public Matrix z0;

    public c2(Context context) {
        this(context, 3, null);
    }

    public static void a(c2 c2Var, int i9, boolean z10) {
        boolean[] zArr = c2Var.A;
        AnimatorSet[] animatorSetArr = c2Var.B;
        if ((!z10 || zArr[i9]) && (z10 || !zArr[i9])) {
            return;
        }
        zArr[i9] = z10;
        AnimatorSet animatorSet = animatorSetArr[i9];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i9] = animatorSet2;
        BitmapDrawable bitmapDrawable = c2Var.y[i9];
        int i10 = 1;
        if (bitmapDrawable != null) {
            animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", z10 ? 255 : 0));
        }
        animatorSetArr[i9].setDuration(150L);
        animatorSetArr[i9].addListener(new x2(c2Var, i9, i10));
        try {
            animatorSetArr[i9].start();
        } catch (Exception e10) {
            FileLog.e(e10);
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
            AndroidUtilities.runOnUIThread(new r1(this, 0), currentTimeMillis - j10);
        } else {
            dismiss();
        }
    }

    public final View d(int i9) {
        ViewGroup viewGroup = this.p0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i9));
        }
        return null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        vt vtVar;
        if (i9 != NotificationCenter.emojiLoaded || (vtVar = this.n) == null) {
            return;
        }
        vtVar.invalidate();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Bitmap bitmap;
        Utilities.Callback callback = this.K;
        if (callback != null) {
            this.K = null;
            callback.run(new r1(this, 0));
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
        c2 c2Var = this.G;
        if (c2Var != null) {
            c2Var.dismiss();
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

    public int e(int i9) {
        return f6.v0(i9, this.N0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ViewGroup f(boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        a2 a2Var = new a2(getContext(), this);
        this.W0 = a2Var;
        final int i9 = 1;
        a2Var.setOrientation(1);
        boolean z11 = this.P0;
        int i10 = this.Z;
        int i11 = 3;
        final int i12 = 0;
        if ((z11 || i10 == 3) && i10 != 2) {
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
                a2 a2Var2 = this.W0;
                int dp = AndroidUtilities.dp(8.0f);
                float dp2 = AndroidUtilities.dp(20.0f);
                bg.q1 q1Var = ff.r0.a;
                a2Var2.setOutlineProvider(new ff.q0(dp, dp2));
                this.W0.setClipToOutline(true);
                this.e0 = false;
            }
        }
        ViewGroup viewGroup = this.W0;
        boolean z13 = this.T0;
        b6 b6Var = this.N0;
        if (z13) {
            if (this.U0 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.U0 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.t1
                    public final /* synthetic */ c2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                this.b.dismiss();
                                break;
                            case 1:
                                c2 c2Var = this.b;
                                new fa(c2Var.getContext(), c2Var.N0).show();
                                break;
                            default:
                                c2 c2Var2 = this.b;
                                DialogInterface.OnClickListener onClickListener = c2Var2.I;
                                if (onClickListener != null) {
                                    onClickListener.onClick(c2Var2, ((Integer) view.getTag()).intValue());
                                }
                                c2Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            if (this.V0 == null) {
                gh.b bVar = new gh.b(getContext(), UserConfig.selectedAccount, b6Var);
                this.V0 = bVar;
                g7.g6.a(bVar);
                this.V0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.t1
                    public final /* synthetic */ c2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i9) {
                            case 0:
                                this.b.dismiss();
                                break;
                            case 1:
                                c2 c2Var = this.b;
                                new fa(c2Var.getContext(), c2Var.N0).show();
                                break;
                            default:
                                c2 c2Var2 = this.b;
                                DialogInterface.OnClickListener onClickListener = c2Var2.I;
                                if (onClickListener != null) {
                                    onClickListener.onClick(c2Var2, ((Integer) view.getTag()).intValue());
                                }
                                c2Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            AndroidUtilities.removeFromParent(this.W0);
            AndroidUtilities.removeFromParent(this.V0);
            this.U0.addView(this.W0, g7.e6.e(-2, -2, 17));
            this.U0.addView(this.V0, g7.e6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
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
                this.W0.addView(this.R, g7.e6.t(-1, this.W, 51, 0, 0, 0, 0));
            }
        } else {
            pi0 pi0Var = new pi0(getContext());
            this.g0 = pi0Var;
            Drawable drawable2 = this.X;
            if (drawable2 != null) {
                pi0Var.setImageDrawable(drawable2);
                Drawable drawable3 = this.X;
                if (drawable3 instanceof r6) {
                    r6 r6Var = (r6) drawable3;
                    this.g0.addOnAttachStateChangeListener(new u1(r6Var));
                    r6Var.a(this.g0);
                }
            } else {
                int i13 = this.Q;
                if (i13 != 0) {
                    pi0Var.setImageResource(i13);
                } else {
                    pi0Var.setAutoRepeat(this.O0);
                    pi0 pi0Var2 = this.g0;
                    int i14 = this.T;
                    int i15 = this.U;
                    pi0Var2.f(i14, i15, i15, null);
                    if (this.V != null) {
                        mi0 animatedDrawable = this.g0.getAnimatedDrawable();
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
                this.g0.setBackground(new v1(this, gradientDrawable));
                this.W = 92;
            } else {
                this.g0.setBackground(f6.c0(AndroidUtilities.dp(10.0f), 0, this.Y));
            }
            if (this.S) {
                this.g0.setTranslationY(AndroidUtilities.dp(16.0f));
            } else {
                this.g0.setTranslationY(0.0f);
            }
            this.g0.setPadding(0, 0, 0, 0);
            this.W0.addView(this.g0, g7.e6.t(-1, this.W, 51, 0, 0, 0, 0));
        }
        int i16 = 5;
        if (this.N != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.s = frameLayout2;
            this.W0.addView(frameLayout2, g7.e6.t(-2, -2, this.S ? 1 : 0, 24, 0, 24, 0));
            dh.u uVar = new dh.u(getContext(), null, false);
            this.f = uVar;
            NotificationCenter.listenEmojiLoading(uVar);
            dh.u uVar2 = this.f;
            uVar2.h = 3;
            uVar2.setText(this.N);
            this.f.setTextColor(e(f6.j5));
            this.f.setTextSize(1, 20.0f);
            this.f.setTypeface(AndroidUtilities.bold());
            this.f.setGravity((this.S ? 1 : LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout3 = this.s;
            dh.u uVar3 = this.f;
            boolean z15 = this.S;
            frameLayout3.addView(uVar3, g7.e6.d(-2, -2.0f, (z15 ? 1 : LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 19.0f, 0.0f, z15 ? 4.0f : this.O != null ? 2 : this.L != null ? 14 : 10));
        }
        if (this.O != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.O);
            this.h.setTextColor(e(f6.J5));
            this.h.setTextSize(1, 14.0f);
            this.h.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            this.W0.addView(this.h, g7.e6.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, 0, 24, this.L != null ? 14 : 10));
        }
        if (i10 == 0) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow).mutate();
            BitmapDrawable[] bitmapDrawableArr = this.y;
            bitmapDrawableArr[0] = bitmapDrawable;
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow_reverse).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            w1 w1Var = new w1(this, getContext(), i12);
            this.v = w1Var;
            w1Var.setVerticalScrollBarEnabled(false);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.v, e(f6.A5));
            this.W0.addView(this.v, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
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
        vt vtVar = new vt(getContext());
        this.n = vtVar;
        NotificationCenter.listenEmojiLoading(vtVar);
        this.n.setTextColor(e(this.S ? f6.y6 : f6.j5));
        this.n.setTextSize(1, 16.0f);
        this.n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.n.setLinkTextColor(e(f6.k5));
        if (!this.b0) {
            this.n.setClickable(false);
            this.n.setEnabled(false);
        }
        this.n.setGravity((this.S ? 1 : LocaleController.isRTL ? 5 : 3) | 48);
        if (i10 == 2) {
            this.W0.addView(this.n, g7.e6.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, this.N == null ? 19 : 0, 24, 20));
            v70 v70Var = new v70(getContext());
            this.q0 = v70Var;
            v70Var.a(this.a0 / 100.0f, false);
            this.q0.setProgressColor(e(f6.F5));
            this.q0.setBackColor(e(f6.G5));
            this.W0.addView(this.q0, g7.e6.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView2 = new TextView(getContext());
            this.r0 = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            this.r0.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            this.r0.setTextColor(e(f6.q5));
            this.r0.setTextSize(1, 14.0f);
            this.W0.addView(this.r0, g7.e6.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 23, 4, 23, 24));
            this.r0.setText(String.format("%d%%", Integer.valueOf(this.a0)));
        } else if (i10 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.r = new FrameLayout(getContext());
            this.Q0 = e(f6.M5);
            if (!this.P0) {
                this.r.setBackgroundDrawable(f6.b0(AndroidUtilities.dp(18.0f), this.Q0));
            }
            this.W0.addView(this.r, g7.e6.q(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), b6Var);
            radialProgressView.setSize(AndroidUtilities.dp(32.0f));
            radialProgressView.setProgressColor(e(f6.N5));
            this.r.addView(radialProgressView, g7.e6.e(86, 86, 17));
        } else {
            vt vtVar2 = this.d;
            if (vtVar2 != null) {
                this.w.addView(vtVar2, g7.e6.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            this.w.addView(this.n, g7.e6.t(-2, -2, (this.S ? 1 : LocaleController.isRTL ? 5 : 3) | 48, 24, 0, 24, (this.b == null && this.L == null) ? 0 : this.C));
            TextView textView3 = this.c;
            if (textView3 != null) {
                this.w.addView(textView3, g7.e6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
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
                    y1 y1Var = new y1(getContext(), b6Var);
                    CharSequence charSequence = this.L[i18];
                    int[] iArr = this.M;
                    y1Var.a(iArr != null ? iArr[i18] : 0, charSequence);
                    y1Var.setTag(Integer.valueOf(i18));
                    this.J0.add(y1Var);
                    this.w.addView(y1Var, g7.e6.n(-1, 50));
                    final int i19 = 2;
                    y1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.t1
                        public final /* synthetic */ c2 b;

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
                                    c2 c2Var = this.b;
                                    new fa(c2Var.getContext(), c2Var.N0).show();
                                    break;
                                default:
                                    c2 c2Var2 = this.b;
                                    DialogInterface.OnClickListener onClickListener = c2Var2.I;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(c2Var2, ((Integer) view2.getTag()).intValue());
                                    }
                                    c2Var2.dismiss();
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
            this.w.addView(this.b, g7.e6.n(-1, this.e));
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
                LinearLayout linearLayout2 = new LinearLayout(getContext());
                linearLayout2.setOrientation(1);
                this.p0 = linearLayout2;
            } else {
                this.p0 = new t2(this, getContext(), i9);
            }
            if (this.c != null) {
                this.p0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f11));
                this.p0.setTranslationY(-AndroidUtilities.dp(6.0f));
            } else {
                this.p0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            this.W0.addView(this.p0, g7.e6.n(-1, this.G0 ? 96 : 52));
            if (this.S) {
                this.p0.setTranslationY(-AndroidUtilities.dp(8.0f));
            }
            int i20 = 7;
            if (this.h0 != null) {
                f12 = 64.0f;
                x1 x1Var = new x1(getContext(), i12);
                x1Var.setMinWidth(AndroidUtilities.dp(64.0f));
                x1Var.setTag(-1);
                x1Var.setTextSize(1, 16.0f);
                x1Var.setTextColor(e(this.E));
                x1Var.setGravity(17);
                x1Var.setTypeface(AndroidUtilities.bold());
                x1Var.setText(this.h0);
                f13 = 6.0f;
                x1Var.setBackground(f6.G0(AndroidUtilities.dp(f10), e(this.E)));
                x1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.E0) {
                    f14 = 12.0f;
                    this.p0.addView(x1Var, g7.e6.q(-1, 40, 7));
                } else {
                    f14 = 12.0f;
                    this.p0.addView(x1Var, g7.e6.e(-2, 40, 53));
                }
                x1Var.setOnClickListener(new mh.k3(i16, this, x1Var));
            } else {
                f12 = 64.0f;
                f13 = 6.0f;
                f14 = 12.0f;
            }
            if (this.j0 != null) {
                x1 x1Var2 = new x1(getContext(), i9);
                x1Var2.setMinWidth(AndroidUtilities.dp(f12));
                x1Var2.setTag(-2);
                x1Var2.setTextSize(1, 16.0f);
                x1Var2.setTextColor(e(this.E));
                x1Var2.setGravity(17);
                x1Var2.setTypeface(AndroidUtilities.bold());
                x1Var2.setEllipsize(TextUtils.TruncateAt.END);
                x1Var2.setSingleLine(true);
                x1Var2.setText(this.j0.toString());
                x1Var2.setBackground(f6.G0(AndroidUtilities.dp(f10), e(this.E)));
                x1Var2.setPadding(AndroidUtilities.dp(f14), 0, AndroidUtilities.dp(f14), 0);
                if (this.E0) {
                    this.p0.addView(x1Var2, 0, g7.e6.q(-1, 40, 7));
                } else {
                    this.p0.addView(x1Var2, g7.e6.e(-2, 40, 53));
                }
                x1Var2.setOnClickListener(new mh.k3(6, this, x1Var2));
            }
            if (this.n0 != null) {
                x1 x1Var3 = new x1(getContext(), 2);
                x1Var3.setMinWidth(AndroidUtilities.dp(f12));
                x1Var3.setTag(-3);
                x1Var3.setTextSize(1, 16.0f);
                x1Var3.setTextColor(e(this.E));
                x1Var3.setGravity(17);
                x1Var3.setTypeface(AndroidUtilities.bold());
                x1Var3.setEllipsize(TextUtils.TruncateAt.END);
                x1Var3.setSingleLine(true);
                x1Var3.setText(this.n0.toString());
                x1Var3.setBackground(f6.G0(AndroidUtilities.dp(f10), e(this.E)));
                x1Var3.setPadding(AndroidUtilities.dp(f14), 0, AndroidUtilities.dp(f14), 0);
                if (this.E0) {
                    this.p0.addView(x1Var3, 1, g7.e6.q(-1, 40, 7));
                } else {
                    this.p0.addView(x1Var3, g7.e6.e(-2, 40, 51));
                }
                x1Var3.setOnClickListener(new mh.k3(i20, this, x1Var3));
            }
            if (this.l0 != null) {
                x1 x1Var4 = new x1(getContext(), i11);
                x1Var4.setMinWidth(AndroidUtilities.dp(f12));
                x1Var4.setTag(-4);
                x1Var4.setTextSize(1, 16.0f);
                x1Var4.setTextColor(e(this.E));
                x1Var4.setGravity(17);
                x1Var4.setTypeface(AndroidUtilities.bold());
                x1Var4.setEllipsize(TextUtils.TruncateAt.END);
                x1Var4.setSingleLine(true);
                x1Var4.setText(this.l0.toString());
                x1Var4.setBackground(f6.G0(AndroidUtilities.dp(f10), e(this.E)));
                x1Var4.setPadding(AndroidUtilities.dp(f14), 0, AndroidUtilities.dp(f14), 0);
                if (this.E0) {
                    this.p0.addView(x1Var4, 0, g7.e6.q(-1, 40, 7));
                } else {
                    this.p0.addView(x1Var4, g7.e6.e(-2, 40, 53));
                }
                x1Var4.setOnClickListener(new mh.k3(i17, this, x1Var4));
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
        } else if (i10 == 3) {
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
            AndroidUtilities.makeGlobalBlurBitmap(new y0(this, i9), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final ve.d g(int i9, boolean z10, boolean z11) {
        View d = d(i9);
        if (z11) {
            this.d0 = false;
        }
        return new ve.d(new p(d, 5), new gh.u5(this, d, z10, 7));
    }

    public final void h() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            textView.setTextColor(e(f6.q7));
        }
    }

    public final void i(int i9) {
        this.Q0 = i9;
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

    public final void l(int i9, int i10, int i11) {
        if (i9 >= 0) {
            ArrayList arrayList = this.J0;
            if (i9 >= arrayList.size()) {
                return;
            }
            y1 y1Var = (y1) arrayList.get(i9);
            y1Var.a.setTextColor(i10);
            y1Var.b.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
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

    public final void n(int i9) {
        this.a0 = i9;
        v70 v70Var = this.q0;
        if (v70Var != null) {
            v70Var.a(i9 / 100.0f, true);
            this.r0.setText(String.format("%d%%", Integer.valueOf(this.a0)));
        }
    }

    public final void o(int i9) {
        dh.u uVar = this.f;
        if (uVar != null) {
            uVar.setTextColor(i9);
        }
        vt vtVar = this.n;
        if (vtVar != null) {
            vtVar.setTextColor(i9);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        e80 e80Var = this.s0;
        if (e80Var != null) {
            e80Var.f(this, -2);
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
            alertDialog$Builder.j(new s1(this, 0));
            try {
                this.G = alertDialog$Builder.o();
            } catch (Exception unused) {
            }
        }
    }

    public void q(long j10) {
        r1 r1Var = this.I0;
        AndroidUtilities.cancelRunOnUIThread(r1Var);
        AndroidUtilities.runOnUIThread(r1Var, j10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        w1 w1Var = this.v;
        if (w1Var != null) {
            w1Var.postDelayed(runnable, j10);
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
        dh.u uVar = this.f;
        if (uVar != null) {
            uVar.setText(charSequence);
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
        w1 w1Var = this.v;
        if (w1Var != null) {
            w1Var.removeCallbacks(runnable);
        }
    }

    public c2(Context context, int i9, b6 b6Var) {
        super(context, R.style.TransparentDialog);
        this.a = -1;
        this.e = -2;
        this.y = new BitmapDrawable[2];
        this.A = new boolean[2];
        this.B = new AnimatorSet[2];
        this.C = 12;
        this.E = f6.H5;
        this.W = 132;
        this.b0 = true;
        this.c0 = true;
        this.d0 = true;
        this.t0 = new int[2];
        this.u0 = true;
        this.H0 = new r1(this, 0);
        this.I0 = new r1(this, 1);
        this.J0 = new ArrayList();
        this.L0 = true;
        this.M0 = 0.5f;
        this.O0 = true;
        this.N0 = b6Var;
        this.Z = i9;
        int e10 = e(f6.h5);
        this.Q0 = e10;
        boolean z10 = AndroidUtilities.computePerceivedBrightness(e10) < 0.721f;
        this.P0 = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256) && z10;
        Rect rect = new Rect();
        this.w0 = rect;
        if (i9 != 3 || this.P0) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
            this.v0 = mutate;
            this.x0 = i9 == 3 ? 0.55f : z10 ? 0.8f : 0.985f;
            mutate.setColorFilter(new PorterDuffColorFilter(this.Q0, PorterDuff.Mode.MULTIPLY));
            mutate.getPadding(rect);
        }
        this.D = i9 == 3;
    }
}
