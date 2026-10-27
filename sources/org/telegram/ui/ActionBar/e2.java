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
import bi.u7;
import bi.uc;
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
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.l80;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class e2 extends Dialog implements Drawable.Callback, NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int l1 = 0;
    public boolean A0;
    public final Drawable B0;
    public final Rect C0;
    public final float D0;
    public final boolean[] E;
    public Bitmap E0;
    public final AnimatorSet[] F;
    public Matrix F0;
    public int G;
    public BitmapShader G0;
    public boolean H;
    public Paint H0;
    public int I;
    public Paint I0;
    public DialogInterface.OnCancelListener J;
    public boolean J0;
    public e2 K;
    public boolean K0;
    public int L;
    public boolean L0;
    public DialogInterface.OnClickListener M;
    public boolean M0;
    public DialogInterface.OnDismissListener N;
    public final r1 N0;
    public Utilities.Callback O;
    public final r1 O0;
    public CharSequence[] P;
    public final ArrayList P0;
    public int[] Q;
    public float Q0;
    public CharSequence R;
    public boolean R0;
    public String S;
    public float S0;
    public CharSequence T;
    public final u6 T0;
    public int U;
    public boolean U0;
    public View V;
    public boolean V0;
    public boolean W;
    public int W0;
    public int X;
    public int X0;
    public int Y;
    public long Y0;
    public Map Z;
    public boolean Z0;
    public int a;
    public int a0;
    public FrameLayout a1;
    public View b;
    public Drawable b0;
    public bi.c b1;
    public TextView c;
    public int c0;
    public a2 c1;
    public su d;
    public int d0;
    public int d1;
    public int e;
    public u6 e0;
    public int e1;
    public xh.n f;
    public final int f0;
    public int f1;
    public int g0;
    public int g1;
    public TextView h;
    public boolean h0;
    public int h1;
    public boolean i0;
    public boolean i1;
    public boolean j0;
    public boolean j1;
    public boolean k0;
    public final c2 k1;
    public boolean l0;
    public bk0 m0;
    public su n;
    public CharSequence n0;
    public b2 o0;
    public CharSequence p0;
    public b2 q0;
    public FrameLayout r;
    public String r0;
    public FrameLayout s;
    public li.e4 s0;
    public CharSequence t0;
    public b2 u0;
    public w1 v;
    public ViewGroup v0;
    public LinearLayout w;
    public j90 w0;
    public z1 x;
    public TextView x0;
    public final BitmapDrawable[] y;
    public l80 y0;
    public final int[] z0;

    public e2(Context context) {
        this(context, 3, null);
    }

    public static void a(e2 e2Var, int i10, boolean z10) {
        boolean[] zArr = e2Var.E;
        AnimatorSet[] animatorSetArr = e2Var.F;
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
        BitmapDrawable bitmapDrawable = e2Var.y[i10];
        int i11 = 1;
        if (bitmapDrawable != null) {
            animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", z10 ? 255 : 0));
        }
        animatorSetArr[i10].setDuration(150L);
        animatorSetArr[i10].addListener(new b3(e2Var, i10, i11));
        try {
            animatorSetArr[i10].start();
        } catch (Exception e) {
            FileLog.e(e);
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
        long currentTimeMillis = System.currentTimeMillis() - this.Y0;
        if (currentTimeMillis < j10) {
            AndroidUtilities.runOnUIThread(new r1(this, 0), currentTimeMillis - j10);
        } else {
            dismiss();
        }
    }

    public final View d(int i10) {
        ViewGroup viewGroup = this.v0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i10));
        }
        return null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        su suVar;
        if (i10 != NotificationCenter.emojiLoaded || (suVar = this.n) == null) {
            return;
        }
        suVar.invalidate();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Bitmap bitmap;
        Utilities.Callback callback = this.O;
        if (callback != null) {
            this.O = null;
            callback.run(new r1(this, 0));
            return;
        }
        if (this.j1) {
            return;
        }
        this.j1 = true;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        DialogInterface.OnDismissListener onDismissListener = this.N;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        e2 e2Var = this.K;
        if (e2Var != null) {
            e2Var.dismiss();
        }
        try {
            super.dismiss();
        } catch (Throwable unused) {
        }
        AndroidUtilities.cancelRunOnUIThread(this.O0);
        if (this.G0 == null || (bitmap = this.E0) == null) {
            return;
        }
        bitmap.recycle();
        this.G0 = null;
        this.H0 = null;
        this.E0 = null;
    }

    public final int e() {
        int min = Math.min(AndroidUtilities.isTablet() ? AndroidUtilities.isSmallTablet() ? AndroidUtilities.dp(446.0f) : AndroidUtilities.dp(496.0f) : AndroidUtilities.dp(356.0f), (AndroidUtilities.displaySize.x - AndroidUtilities.dp(48.0f)) - (this.X0 * 2));
        Rect rect = this.C0;
        return min + rect.left + rect.right;
    }

    public int f(int i10) {
        return y6.w0(i10, this.T0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ViewGroup g(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        a2 a2Var = new a2(getContext(), this);
        this.c1 = a2Var;
        final int i10 = 1;
        a2Var.setOrientation(1);
        boolean z11 = this.V0;
        int i11 = this.f0;
        int i12 = 3;
        final int i13 = 0;
        if ((z11 || i11 == 3) && i11 != 2) {
            this.c1.setBackground(null);
            this.c1.setPadding(0, 0, 0, 0);
            if (this.V0) {
                this.c1.setWillNotDraw(false);
            }
            this.k0 = false;
        } else {
            boolean z12 = this.l0;
            Drawable drawable = this.B0;
            if (z12) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.c1.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                this.k0 = true;
            } else {
                this.c1.setBackground(null);
                this.c1.setPadding(0, 0, 0, 0);
                this.c1.setBackground(drawable);
                a2 a2Var2 = this.c1;
                int dp = AndroidUtilities.dp(8.0f);
                float dp2 = AndroidUtilities.dp(20.0f);
                ag.v0 v0Var = ag.z0.a;
                a2Var2.setOutlineProvider(new ag.x0(dp, dp2));
                this.c1.setClipToOutline(true);
                this.k0 = false;
            }
        }
        ViewGroup viewGroup = this.c1;
        boolean z13 = this.Z0;
        u6 u6Var = this.T0;
        if (z13) {
            if (this.a1 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.a1 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.t1
                    public final /* synthetic */ e2 b;

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
                                e2 e2Var = this.b;
                                new uc(e2Var.getContext(), e2Var.T0).show();
                                break;
                            default:
                                e2 e2Var2 = this.b;
                                DialogInterface.OnClickListener onClickListener = e2Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(e2Var2, ((Integer) view.getTag()).intValue());
                                }
                                e2Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            if (this.b1 == null) {
                bi.c cVar = new bi.c(getContext(), UserConfig.selectedAccount, u6Var);
                this.b1 = cVar;
                kb1.b(cVar);
                this.b1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.t1
                    public final /* synthetic */ e2 b;

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
                                e2 e2Var = this.b;
                                new uc(e2Var.getContext(), e2Var.T0).show();
                                break;
                            default:
                                e2 e2Var2 = this.b;
                                DialogInterface.OnClickListener onClickListener = e2Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(e2Var2, ((Integer) view.getTag()).intValue());
                                }
                                e2Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            AndroidUtilities.removeFromParent(this.c1);
            AndroidUtilities.removeFromParent(this.b1);
            this.a1.addView(this.c1, kb1.i(-2, -2, 17));
            this.a1.addView(this.b1, kb1.h(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.a1;
        }
        if (z10) {
            if (this.Z0) {
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
        Object[] objArr = (this.n0 == null && this.p0 == null && this.r0 == null && this.t0 == null) ? false : true;
        if (this.U == 0 && this.X == 0 && this.b0 == null) {
            View view = this.V;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                f7 = 16.0f;
                this.c1.addView(this.V, kb1.x(-1, this.a0, 51, 0, 0, 0, 0));
            } else {
                f7 = 16.0f;
            }
        } else {
            f7 = 16.0f;
            bk0 bk0Var = new bk0(getContext());
            this.m0 = bk0Var;
            Drawable drawable2 = this.b0;
            if (drawable2 != null) {
                bk0Var.setImageDrawable(drawable2);
                Drawable drawable3 = this.b0;
                if (drawable3 instanceof org.telegram.ui.Components.a7) {
                    org.telegram.ui.Components.a7 a7Var = (org.telegram.ui.Components.a7) drawable3;
                    this.m0.addOnAttachStateChangeListener(new v1(a7Var));
                    a7Var.a(this.m0);
                }
            } else {
                int i14 = this.U;
                if (i14 != 0) {
                    bk0Var.setImageResource(i14);
                } else {
                    bk0Var.setAutoRepeat(this.U0);
                    bk0 bk0Var2 = this.m0;
                    int i15 = this.X;
                    int i16 = this.Y;
                    bk0Var2.f(i15, i16, i16, null);
                    if (this.Z != null) {
                        yj0 animatedDrawable = this.m0.getAnimatedDrawable();
                        for (Map.Entry entry : this.Z.entrySet()) {
                            String str = (String) entry.getKey();
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.s.put(str, num);
                            animatedDrawable.G();
                        }
                        this.e1 = this.c0;
                    }
                    this.m0.d();
                }
            }
            this.m0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.W) {
                this.m0.setBackground(new d2(this.m0, this.c0, AndroidUtilities.dp(52.0f) + this.Y, this.d0, this.e0));
                this.a0 = 92;
            } else if (this.d0 >= 0) {
                f7.C(this.m0, y6.d0(AndroidUtilities.dp(10.0f), 0, this.c0), f7.N(this.d0), this.e0);
            } else {
                this.m0.setBackground(y6.d0(AndroidUtilities.dp(10.0f), 0, this.c0));
            }
            if (this.W) {
                this.m0.setTranslationY(AndroidUtilities.dp(16.0f));
            } else {
                this.m0.setTranslationY(0.0f);
            }
            this.m0.setPadding(0, 0, 0, 0);
            this.c1.addView(this.m0, kb1.x(-1, this.a0, 51, 0, 0, 0, 0));
        }
        if (this.R != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.s = frameLayout2;
            this.c1.addView(frameLayout2, kb1.x(-2, -2, this.W ? 1 : 0, 24, 0, 24, 0));
            xh.n nVar = new xh.n(getContext(), null, false);
            this.f = nVar;
            NotificationCenter.listenEmojiLoading(nVar);
            xh.n nVar2 = this.f;
            nVar2.s = 3;
            nVar2.setText(this.R);
            xh.n nVar3 = this.f;
            int f15 = f(y6.j5);
            this.g1 = f15;
            nVar3.setTextColor(f15);
            this.f.setTextSize(1, 20.0f);
            this.f.setTypeface(AndroidUtilities.bold());
            this.f.setGravity((this.W ? 1 : LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout3 = this.s;
            xh.n nVar4 = this.f;
            boolean z14 = this.W;
            frameLayout3.addView(nVar4, kb1.h(-2, -2.0f, (z14 ? 1 : LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 19.0f, 0.0f, z14 ? 4.0f : this.S != null ? 2 : this.P != null ? 14 : 10));
        }
        String str2 = this.S;
        c2 c2Var = this.k1;
        if (str2 != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.S);
            f7.V(this.h, y6.J5, c2Var);
            this.h.setTextSize(1, 14.0f);
            this.h.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            f10 = 20.0f;
            this.c1.addView(this.h, kb1.x(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, 0, 24, this.P != null ? 14 : 10));
        } else {
            f10 = 20.0f;
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
            w1 w1Var = new w1(this, getContext(), i13);
            this.v = w1Var;
            w1Var.setVerticalScrollBarEnabled(false);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.v, f(y6.A5));
            this.c1.addView(this.v, kb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.w = linearLayout;
            linearLayout.setOrientation(1);
            f11 = 4.0f;
            this.v.addView(this.w, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f11 = 4.0f;
        }
        su suVar = new su(getContext());
        this.n = suVar;
        NotificationCenter.listenEmojiLoading(suVar);
        su suVar2 = this.n;
        int f16 = f(this.W ? y6.y6 : y6.j5);
        this.h1 = f16;
        suVar2.setTextColor(f16);
        this.n.setTextSize(1, f7);
        this.n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        f7.H(this.n, y6.k5, c2Var);
        if (!this.h0) {
            this.n.setClickable(false);
            this.n.setEnabled(false);
        }
        this.n.setGravity((this.W ? 1 : LocaleController.isRTL ? 5 : 3) | 48);
        if (i11 == 2) {
            this.c1.addView(this.n, kb1.x(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, this.R == null ? 19 : 0, 24, 20));
            j90 j90Var = new j90(getContext());
            this.w0 = j90Var;
            j90Var.a(this.g0 / 100.0f, false);
            this.w0.setProgressColor(f(y6.F5));
            this.w0.setBackColor(f(y6.G5));
            this.c1.addView(this.w0, kb1.x(-1, 4, 19, 24, 0, 24, 0));
            TextView textView2 = new TextView(getContext());
            this.x0 = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            this.x0.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            f7.V(this.x0, y6.q5, c2Var);
            this.x0.setTextSize(1, 14.0f);
            this.c1.addView(this.x0, kb1.x(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 23, 4, 23, 24));
            this.x0.setText(String.format("%d%%", Integer.valueOf(this.g0)));
        } else if (i11 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.r = new FrameLayout(getContext());
            int i17 = y6.M5;
            this.d1 = i17;
            this.W0 = f(i17);
            if (!this.V0) {
                this.r.setBackgroundDrawable(y6.c0(AndroidUtilities.dp(18.0f), this.W0));
            }
            this.c1.addView(this.r, kb1.u(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), u6Var);
            radialProgressView.setSize(AndroidUtilities.dp(32.0f));
            radialProgressView.setProgressColor(f(y6.N5));
            this.r.addView(radialProgressView, kb1.i(86, 86, 17));
        } else {
            su suVar3 = this.d;
            if (suVar3 != null) {
                this.w.addView(suVar3, kb1.o(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            this.w.addView(this.n, kb1.x(-2, -2, (this.W ? 1 : LocaleController.isRTL ? 5 : 3) | 48, 24, 0, 24, (this.b == null && this.P == null) ? 0 : this.G));
            TextView textView3 = this.c;
            if (textView3 != null) {
                this.w.addView(textView3, kb1.o(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
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
                    y1 y1Var = new y1(getContext(), u6Var);
                    CharSequence charSequence = this.P[i18];
                    int[] iArr = this.Q;
                    y1Var.a(iArr != null ? iArr[i18] : 0, charSequence);
                    y1Var.setTag(Integer.valueOf(i18));
                    this.P0.add(y1Var);
                    this.w.addView(y1Var, kb1.r(-1, 50));
                    final int i19 = 2;
                    y1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ActionBar.t1
                        public final /* synthetic */ e2 b;

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
                                    e2 e2Var = this.b;
                                    new uc(e2Var.getContext(), e2Var.T0).show();
                                    break;
                                default:
                                    e2 e2Var2 = this.b;
                                    DialogInterface.OnClickListener onClickListener = e2Var2.M;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(e2Var2, ((Integer) view2.getTag()).intValue());
                                    }
                                    e2Var2.dismiss();
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
            this.w.addView(this.b, kb1.r(-1, this.e));
        }
        int i20 = 28;
        if (objArr != false) {
            if (!this.K0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                CharSequence charSequence2 = this.n0;
                int measureText = charSequence2 != null ? (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + AndroidUtilities.dp(24.0f) + 0) : 0;
                if (this.p0 != null) {
                    if (measureText > 0) {
                        measureText += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence3 = this.p0;
                    measureText = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + AndroidUtilities.dp(24.0f) + measureText);
                }
                if (this.r0 != null) {
                    if (measureText > 0) {
                        measureText += AndroidUtilities.dp(8.0f);
                    }
                    String str3 = this.r0;
                    measureText = (int) (textPaint.measureText((CharSequence) str3, 0, str3.length()) + AndroidUtilities.dp(24.0f) + measureText);
                }
                if (this.t0 != null) {
                    if (measureText > 0) {
                        measureText += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence4 = this.t0;
                    measureText = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + AndroidUtilities.dp(24.0f) + measureText);
                }
                if (measureText > AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f)) {
                    if (!this.L0 || this.n0 == null || this.p0 == null || this.r0 == null || this.t0 == null) {
                        this.K0 = true;
                    } else {
                        this.M0 = true;
                    }
                }
            }
            if (this.K0) {
                LinearLayout linearLayout2 = new LinearLayout(getContext());
                linearLayout2.setOrientation(1);
                this.v0 = linearLayout2;
            } else {
                this.v0 = new x2(this, getContext(), i10);
            }
            if (this.c != null) {
                this.v0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f11));
                this.v0.setTranslationY(-AndroidUtilities.dp(6.0f));
            } else {
                this.v0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            this.c1.addView(this.v0, kb1.r(-1, this.M0 ? 96 : 52));
            if (this.W) {
                this.v0.setTranslationY(-AndroidUtilities.dp(8.0f));
            }
            if (this.n0 != null) {
                f12 = 64.0f;
                x1 x1Var = new x1(getContext(), i13);
                x1Var.setMinWidth(AndroidUtilities.dp(64.0f));
                x1Var.setTag(-1);
                x1Var.setTextSize(1, 16.0f);
                f7.V(x1Var, this.I, c2Var);
                x1Var.setGravity(17);
                x1Var.setTypeface(AndroidUtilities.bold());
                x1Var.setText(this.n0);
                f13 = 6.0f;
                x1Var.setBackground(y6.I0(AndroidUtilities.dp(f10), f(this.I)));
                x1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.K0) {
                    f14 = 12.0f;
                    this.v0.addView(x1Var, kb1.u(-1, 40, 7));
                } else {
                    f14 = 12.0f;
                    this.v0.addView(x1Var, kb1.i(-2, 40, 53));
                }
                x1Var.setOnClickListener(new bi.q(i20, this, x1Var));
            } else {
                f12 = 64.0f;
                f13 = 6.0f;
                f14 = 12.0f;
            }
            if (this.p0 != null) {
                x1 x1Var2 = new x1(getContext(), i10);
                x1Var2.setMinWidth(AndroidUtilities.dp(f12));
                x1Var2.setTag(-2);
                x1Var2.setTextSize(1, 16.0f);
                f7.V(x1Var2, this.I, c2Var);
                x1Var2.setGravity(17);
                x1Var2.setTypeface(AndroidUtilities.bold());
                x1Var2.setEllipsize(TextUtils.TruncateAt.END);
                x1Var2.setSingleLine(true);
                x1Var2.setText(this.p0.toString());
                x1Var2.setBackground(y6.I0(AndroidUtilities.dp(f10), f(this.I)));
                x1Var2.setPadding(AndroidUtilities.dp(f14), 0, AndroidUtilities.dp(f14), 0);
                if (this.K0) {
                    this.v0.addView(x1Var2, 0, kb1.u(-1, 40, 7));
                } else {
                    this.v0.addView(x1Var2, kb1.i(-2, 40, 53));
                }
                x1Var2.setOnClickListener(new bi.q(29, this, x1Var2));
            }
            if (this.t0 != null) {
                x1 x1Var3 = new x1(getContext(), 2);
                x1Var3.setMinWidth(AndroidUtilities.dp(f12));
                x1Var3.setTag(-3);
                x1Var3.setTextSize(1, 16.0f);
                f7.V(x1Var3, this.I, c2Var);
                x1Var3.setGravity(17);
                x1Var3.setTypeface(AndroidUtilities.bold());
                x1Var3.setEllipsize(TextUtils.TruncateAt.END);
                x1Var3.setSingleLine(true);
                x1Var3.setText(this.t0.toString());
                x1Var3.setBackground(y6.I0(AndroidUtilities.dp(f10), f(this.I)));
                x1Var3.setPadding(AndroidUtilities.dp(f14), 0, AndroidUtilities.dp(f14), 0);
                if (this.K0) {
                    this.v0.addView(x1Var3, 1, kb1.u(-1, 40, 7));
                } else {
                    this.v0.addView(x1Var3, kb1.i(-2, 40, 51));
                }
                x1Var3.setOnClickListener(new u1(i13, this, x1Var3));
            }
            if (this.r0 != null) {
                x1 x1Var4 = new x1(getContext(), i12);
                x1Var4.setMinWidth(AndroidUtilities.dp(f12));
                x1Var4.setTag(-4);
                x1Var4.setTextSize(1, 16.0f);
                f7.V(x1Var4, this.I, c2Var);
                x1Var4.setGravity(17);
                x1Var4.setTypeface(AndroidUtilities.bold());
                x1Var4.setEllipsize(TextUtils.TruncateAt.END);
                x1Var4.setSingleLine(true);
                x1Var4.setText(this.r0.toString());
                x1Var4.setBackground(y6.I0(AndroidUtilities.dp(f10), f(this.I)));
                x1Var4.setPadding(AndroidUtilities.dp(f14), 0, AndroidUtilities.dp(f14), 0);
                if (this.K0) {
                    this.v0.addView(x1Var4, 0, kb1.u(-1, 40, 7));
                } else {
                    this.v0.addView(x1Var4, kb1.i(-2, 40, 53));
                }
                x1Var4.setOnClickListener(new u1(i10, this, x1Var4));
            }
            if (this.K0) {
                for (int i21 = 1; i21 < this.v0.getChildCount(); i21++) {
                    ((ViewGroup.MarginLayoutParams) this.v0.getChildAt(i21).getLayoutParams()).topMargin = AndroidUtilities.dp(f13);
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.Z0) {
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            this.L = AndroidUtilities.displaySize.x;
            this.c1.getLayoutParams().width = e();
            window.setWindowAnimations(R.style.DialogNoAnimation);
        } else if (i11 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.R0) {
                layoutParams3.dimAmount = this.S0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags ^= 2;
            }
            this.L = AndroidUtilities.displaySize.x;
            layoutParams3.width = e();
        }
        View view3 = this.b;
        if (view3 != null && this.A0 && b(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.V0) {
            AndroidUtilities.makeGlobalBlurBitmap(new y0(this, i10), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final qf.c h(int i10, boolean z10, boolean z11) {
        View d = d(i10);
        if (z11) {
            this.j0 = false;
        }
        return new qf.c(new q(d, 5), new u7(this, d, z10, 12));
    }

    public final void i() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            f7.V(textView, y6.q7, this.k1);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.v.invalidate();
        this.w.invalidate();
    }

    public final void j(int i10) {
        this.d1 = -1;
        this.W0 = i10;
        Drawable drawable = this.B0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.W0, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void k() {
        this.i0 = false;
    }

    public final void l(boolean z10) {
        if (this.J0) {
            return;
        }
        this.J0 = true;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.J0) {
            attributes.softInputMode = 16;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void m(int i10, int i11, int i12) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P0;
            if (i10 >= arrayList.size()) {
                return;
            }
            y1 y1Var = (y1) arrayList.get(i10);
            y1Var.a.setTextColor(i11);
            y1Var.b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void n(String str) {
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

    public final void o(int i10) {
        this.g0 = i10;
        j90 j90Var = this.w0;
        if (j90Var != null) {
            j90Var.a(i10 / 100.0f, true);
            this.x0.setText(String.format("%d%%", Integer.valueOf(this.g0)));
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        l80 l80Var = this.y0;
        if (l80Var != null) {
            l80Var.h(this, -2);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g(true);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
    }

    public final void p(int i10) {
        this.i1 = true;
        xh.n nVar = this.f;
        if (nVar != null) {
            nVar.setTextColor(i10);
        }
        su suVar = this.n;
        if (suVar != null) {
            suVar.setTextColor(i10);
        }
    }

    public final void q() {
        if (this.i0 && this.K == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.T0);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.StopLoadingTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.StopLoading);
            alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new p(this, 2));
            alertDialog$Builder.j(new s1(this, 0));
            try {
                this.K = alertDialog$Builder.p();
            } catch (Exception unused) {
            }
        }
    }

    public void r(long j10) {
        r1 r1Var = this.O0;
        AndroidUtilities.cancelRunOnUIThread(r1Var);
        AndroidUtilities.runOnUIThread(r1Var, j10);
    }

    public final void s() {
        bk0 bk0Var;
        int w02;
        if (this.d0 < 0 || this.Z == null || (bk0Var = this.m0) == null || bk0Var.getAnimatedDrawable() == null || (w02 = y6.w0(this.d0, this.e0)) == this.e1) {
            return;
        }
        yj0 animatedDrawable = this.m0.getAnimatedDrawable();
        for (Map.Entry entry : this.Z.entrySet()) {
            if (entry.getValue() != null && ((Integer) entry.getValue()).intValue() == this.e1) {
                entry.setValue(Integer.valueOf(w02));
                animatedDrawable.Q(w02, (String) entry.getKey());
            }
        }
        this.e1 = w02;
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
        this.J = onCancelListener;
        super.setOnCancelListener(onCancelListener);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.R = charSequence;
        xh.n nVar = this.f;
        if (nVar != null) {
            nVar.setText(charSequence);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            this.j1 = false;
            super.show();
            FrameLayout frameLayout = this.r;
            if (frameLayout != null && this.f0 == 3) {
                frameLayout.setScaleX(0.0f);
                this.r.setScaleY(0.0f);
                this.r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
            }
            this.Y0 = System.currentTimeMillis();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        w1 w1Var = this.v;
        if (w1Var != null) {
            w1Var.removeCallbacks(runnable);
        }
    }

    public e2(Context context, int i10, u6 u6Var) {
        super(context, R.style.TransparentDialog);
        this.a = -1;
        this.e = -2;
        this.y = new BitmapDrawable[2];
        this.E = new boolean[2];
        this.F = new AnimatorSet[2];
        this.G = 12;
        this.I = y6.H5;
        this.a0 = 132;
        this.d0 = -1;
        this.h0 = true;
        this.i0 = true;
        this.j0 = true;
        this.z0 = new int[2];
        this.A0 = true;
        this.N0 = new r1(this, 0);
        this.O0 = new r1(this, 1);
        this.P0 = new ArrayList();
        this.R0 = true;
        this.S0 = 0.5f;
        this.U0 = true;
        this.d1 = -1;
        this.k1 = new c2(this, 0);
        this.T0 = u6Var;
        this.f0 = i10;
        int i11 = y6.h5;
        this.d1 = i11;
        int f7 = f(i11);
        this.W0 = f7;
        boolean z10 = AndroidUtilities.computePerceivedBrightness(f7) < 0.721f;
        this.V0 = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256) && z10;
        Rect rect = new Rect();
        this.C0 = rect;
        if (i10 != 3 || this.V0) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
            this.B0 = mutate;
            this.D0 = i10 == 3 ? 0.55f : z10 ? 0.8f : 0.985f;
            mutate.setColorFilter(new PorterDuffColorFilter(this.W0, PorterDuff.Mode.MULTIPLY));
            mutate.getPadding(rect);
        }
        this.H = i10 == 3;
    }
}
