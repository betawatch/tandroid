package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Stack;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class EditTextBoldCursor extends bt {
    public static Field A1;
    public static Field B1;
    public static boolean C1;
    public static Method D1;
    public static Class E1;
    public static Field F1;
    public static Method G1;
    public static Field z1;
    public boolean A0;
    public float B0;
    public long C0;
    public boolean D0;
    public boolean E0;
    public float F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public int J0;
    public int K0;
    public int L0;
    public float M0;
    public boolean N0;
    public float O0;
    public long P0;
    public float Q0;
    public float R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public AnimatorSet W0;
    public float X0;
    public org.telegram.ui.ActionBar.k4 Y0;
    public org.telegram.ui.ActionBar.u3 Z0;
    public pk a1;
    public Object b0;
    public View b1;
    public final GradientDrawable c0;
    public View c1;
    public hw0 d0;
    public int d1;
    public float e0;
    public boolean e1;
    public final s5 f0;
    public final ss f1;
    public final Paint g0;
    public final ArrayList g1;
    public final Paint h0;
    public boolean h1;
    public final TextPaint i0;
    public int i1;
    public int j0;
    public final Rect j1;
    public int k0;
    public int k1;
    public int l0;
    public int l1;
    public int m0;
    public Rect m1;
    public float n0;
    public eh.c n1;
    public final Rect o0;
    public Drawable o1;
    public StaticLayout p0;
    public Drawable p1;
    public float q0;
    public Drawable q1;
    public boolean r0;
    public PorterDuffColorFilter r1;
    public boolean s0;
    public int s1;
    public ai.c t0;
    public Runnable t1;
    public rs u0;
    public boolean u1;
    public rs v0;
    public Paint v1;
    public CharSequence w0;
    public LinearGradient w1;
    public CharSequence x0;
    public Matrix x1;
    public int y0;
    public int y1;
    public int z0;

    public EditTextBoldCursor(Context context) {
        super(context, null, 0, R.style.EditTextNoBackgroundStyle);
        String str;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = new Stack();
        this.c = new ArrayList();
        this.e = true;
        this.n = new Path();
        this.H = true;
        this.I = null;
        this.K = new zs(this, 0);
        this.L = new Rect();
        if (bt.a0 == null) {
            String str2 = Build.MANUFACTURER;
            bt.a0 = Boolean.valueOf((str2 == null || !(str2.toLowerCase().contains("honor") || str2.toLowerCase().contains("huawei") || str2.toLowerCase().contains("alps") || str2.toLowerCase().contains("vivo"))) && ((str = Build.MODEL) == null || !str.toLowerCase().contains("mediapad")));
        }
        this.Q = bt.a0.booleanValue();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f = new df.c(this, arrayList, new at(this));
        }
        this.f0 = new s5(this, 1);
        this.o0 = new Rect();
        this.A0 = true;
        this.B0 = 1.0f;
        this.D0 = true;
        this.E0 = false;
        this.F0 = 2.0f;
        this.I0 = false;
        this.N0 = false;
        this.O0 = 0.0f;
        this.Q0 = 0.0f;
        this.R0 = 0.0f;
        this.U0 = true;
        this.g1 = new ArrayList();
        this.h1 = false;
        this.j1 = new Rect();
        this.k1 = -1;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            setImportantForAutofill(2);
        }
        this.g0 = new Paint();
        this.h0 = new Paint();
        TextPaint textPaint = new TextPaint(1);
        this.i0 = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
        if (i3 >= 26) {
            setImportantForAutofill(2);
        }
        if (i3 >= 29) {
            ss ssVar = new ss(this);
            this.f1 = ssVar;
            ssVar.setShape(new RectShape());
            this.c0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
            setTextCursorDrawable(this.f1);
        }
        try {
            if (!C1 && B1 == null) {
                C1 = true;
                Field declaredField = View.class.getDeclaredField("mScrollY");
                B1 = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (Throwable unused) {
        }
        try {
            if (E1 == null) {
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                z1 = declaredField2;
                declaredField2.setAccessible(true);
                Class<?> cls = Class.forName("android.widget.Editor");
                E1 = cls;
                try {
                    Field declaredField3 = cls.getDeclaredField("mShowCursor");
                    A1 = declaredField3;
                    declaredField3.setAccessible(true);
                } catch (Exception unused2) {
                }
                try {
                    Method declaredMethod = E1.getDeclaredMethod("invalidateTextDisplayList", null);
                    G1 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused3) {
                }
                Method declaredMethod2 = TextView.class.getDeclaredMethod("getVerticalOffset", Boolean.TYPE);
                D1 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        if (this.f1 == null) {
            try {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
                this.c0 = gradientDrawable;
                if (Build.VERSION.SDK_INT >= 29) {
                    setTextCursorDrawable(gradientDrawable);
                }
                this.b0 = z1.get(this);
            } catch (Throwable unused4) {
            }
            try {
                if (F1 == null) {
                    Field declaredField4 = TextView.class.getDeclaredField("mCursorDrawableRes");
                    F1 = declaredField4;
                    declaredField4.setAccessible(true);
                }
                Field field = F1;
                if (field != null) {
                    field.set(this, Integer.valueOf(R.drawable.field_carret_empty));
                }
            } catch (Throwable unused5) {
            }
        }
        this.j0 = org.telegram.messenger.g0.L(24.0f);
    }

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        this.g1.add(textWatcher);
        if (this.h1) {
            return;
        }
        super.addTextChangedListener(textWatcher);
    }

    public int getActionModeStyle() {
        return 1;
    }

    public int getActiveLineColor() {
        return this.K0;
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        return 0;
    }

    public int getCursorColor() {
        return this.i1;
    }

    public int getErrorLineColor() {
        return this.L0;
    }

    @Override // android.widget.TextView
    public int getExtendedPaddingBottom() {
        int i3 = this.l0;
        if (i3 == 0) {
            return super.getExtendedPaddingBottom();
        }
        this.l0 = i3 - 1;
        int i10 = this.m0;
        if (i10 != Integer.MAX_VALUE) {
            return -i10;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getExtendedPaddingTop() {
        int i3 = this.k0;
        if (i3 == 0) {
            return super.getExtendedPaddingTop();
        }
        this.k0 = i3 - 1;
        return 0;
    }

    public int getHandlesColor() {
        return this.s1;
    }

    public float getHeaderAnimationProgress() {
        return this.X0;
    }

    public int getHeaderHintColor() {
        return this.z0;
    }

    public int getHintColor() {
        return this.y0;
    }

    public Layout getHintLayoutEx() {
        return this.p0;
    }

    public int getLineColor() {
        return this.J0;
    }

    @Override // android.widget.TextView
    public float getLineSpacingExtra() {
        return super.getLineSpacingExtra();
    }

    public float getLineY() {
        return this.M0;
    }

    public Runnable getOnPremiumMenuLockClickListener() {
        return this.t1;
    }

    public org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        return null;
    }

    @Override // android.widget.TextView
    public Drawable getTextCursorDrawable() {
        if (this.f1 != null) {
            return super.getTextCursorDrawable();
        }
        ss ssVar = new ss(this, new RectShape());
        ssVar.getPaint().setColor(0);
        return ssVar;
    }

    @Override // android.widget.TextView
    public Drawable getTextSelectHandle() {
        if (this.q1 == null) {
            this.q1 = y(super.getTextSelectHandle(), true);
        }
        return this.q1;
    }

    @Override // android.widget.TextView
    public Drawable getTextSelectHandleLeft() {
        if (this.o1 == null) {
            this.o1 = y(super.getTextSelectHandleLeft(), true);
        }
        return this.o1;
    }

    @Override // android.widget.TextView
    public Drawable getTextSelectHandleRight() {
        if (this.p1 == null) {
            this.p1 = y(super.getTextSelectHandleRight(), true);
        }
        return this.p1;
    }

    public final void l(boolean z10) {
        boolean z11 = this.T0 && (getText().length() > 0 || (this.U0 && isFocused()));
        if (this.V0 != z11) {
            AnimatorSet animatorSet = this.W0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W0 = null;
            }
            this.V0 = z11;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.W0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "headerAnimationProgress", z11 ? 1.0f : 0.0f));
                this.W0.setDuration(200L);
                this.W0.setInterpolator(xq.h);
                this.W0.start();
            } else {
                this.X0 = z11 ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    public final void m() {
        org.telegram.ui.ActionBar.k4 k4Var = this.Y0;
        if (k4Var != null) {
            k4Var.a.removeOnLayoutChangeListener(k4Var.l);
            org.telegram.ui.ActionBar.i4 i4Var = k4Var.b;
            if (!i4Var.F) {
                i4Var.G = false;
                i4Var.F = true;
                i4Var.x.cancel();
                i4Var.w.start();
                i4Var.D.setEmpty();
            }
            this.Y0 = null;
        }
        if (this.a1 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.a1);
            this.a1 = null;
        }
    }

    public void n(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.draw(canvas);
    }

    @Override // org.telegram.ui.Components.bt, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.c1 = getRootView();
        if (Build.VERSION.SDK_INT < 29) {
            cg.j.d().b(this.f0, 2);
        }
    }

    @Override // org.telegram.ui.Components.bt, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c1 = null;
        if (Build.VERSION.SDK_INT < 29) {
            cg.j.d().g(this.f0);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|(4:147|(5:151|(1:253)|155|(2:157|(1:159))(2:250|(1:252))|160)|161|(2:177|(27:183|(1:185)(1:249)|186|(1:248)(1:190)|191|(3:193|(1:(1:246))(1:197)|198)(1:247)|199|(2:241|(1:243)(1:244))(4:203|(8:205|(1:207)(1:239)|208|(1:210)|211|(5:213|(1:215)(1:237)|216|(1:218)|219)(1:238)|220|(8:222|(1:224)(1:235)|225|(1:227)(1:234)|228|(1:230)|231|232))(1:240)|236|232)|233|6|(1:8)|9|10|11|(1:13)(1:145)|14|15|16|17|18|(2:22|23)|26|(5:110|111|(1:140)(2:115|(1:139)(1:119))|120|(2:123|(6:125|(4:127|128|(1:132)|133)|135|128|(2:130|132)|133)(6:136|(4:138|128|(0)|133)|135|128|(0)|133)))(2:28|(3:32|33|(6:35|(4:37|38|(1:42)|43)|45|38|(2:40|42)|43)(6:46|(4:48|38|(0)|43)|45|38|(0)|43)))|50|(17:54|(1:56)(2:100|(1:102)(1:103))|57|(1:59)|60|(4:93|(1:95)(1:99)|96|(1:98))|69|(1:71)(1:92)|72|(1:74)(1:91)|75|76|(1:78)|79|(1:81)|82|(4:84|(1:86)|(1:88)|89)(1:90))|104|(2:106|107)(1:109)))(3:169|(2:171|(1:173)(1:175))(1:176)|174))|5|6|(0)|9|10|11|(0)(0)|14|15|16|17|18|(3:20|22|23)|26|(0)(0)|50|(22:52|54|(0)(0)|57|(0)|60|(2:62|64)|93|(0)(0)|96|(0)|69|(0)(0)|72|(0)(0)|75|76|(0)|79|(0)|82|(0)(0))|104|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0362, code lost:
    
        r2 = org.telegram.messenger.r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x034c, code lost:
    
        r4 = org.telegram.messenger.r2.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0383 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0428 A[Catch: all -> 0x0449, TryCatch #1 {all -> 0x0449, blocks: (B:111:0x0383, B:113:0x0387, B:115:0x038b, B:117:0x039d, B:120:0x03ab, B:123:0x03b1, B:125:0x03b8, B:127:0x03c0, B:128:0x03e6, B:130:0x0428, B:132:0x042b, B:133:0x0430, B:136:0x03d3, B:138:0x03db, B:140:0x03a7), top: B:110:0x0383 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0335 A[Catch: Exception -> 0x034c, TryCatch #0 {Exception -> 0x034c, blocks: (B:11:0x0331, B:13:0x0335, B:145:0x0345), top: B:10:0x0331 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0345 A[Catch: Exception -> 0x034c, TRY_LEAVE, TryCatch #0 {Exception -> 0x034c, blocks: (B:11:0x0331, B:13:0x0335, B:145:0x0345), top: B:10:0x0331 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04cc A[Catch: all -> 0x04ee, TryCatch #3 {all -> 0x04ee, blocks: (B:33:0x0455, B:35:0x045c, B:37:0x0464, B:38:0x048a, B:40:0x04cc, B:42:0x04cf, B:43:0x04d4, B:46:0x0477, B:48:0x047f), top: B:32:0x0455 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x055a  */
    @Override // org.telegram.ui.Components.bt, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float f10;
        float f11;
        Field field;
        ss ssVar;
        boolean z10;
        int totalPaddingTop;
        int i3;
        float f12;
        Object obj;
        boolean z11;
        boolean isEmpty;
        float elapsedRealtime;
        int i10;
        float f13;
        boolean z12;
        int totalPaddingTop2;
        int i11;
        float f14;
        int i12;
        Field field2;
        Canvas canvas2 = canvas;
        if (length() == 0 || this.T0) {
            boolean z13 = this.A0;
            if ((z13 && this.B0 != 1.0f) || (!z13 && this.B0 != 0.0f)) {
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.C0;
                if (j10 < 0 || j10 > 17) {
                    j10 = 17;
                }
                this.C0 = currentTimeMillis;
                if (this.A0) {
                    float f15 = (j10 / 150.0f) + this.B0;
                    this.B0 = f15;
                    if (f15 > 1.0f) {
                        this.B0 = 1.0f;
                    }
                } else {
                    float f16 = this.B0 - (j10 / 150.0f);
                    this.B0 = f16;
                    if (f16 < 0.0f) {
                        this.B0 = 0.0f;
                    }
                }
                invalidate();
            }
            rs rsVar = this.u0;
            if (rsVar != null && !TextUtils.isEmpty(rsVar.i) && (this.A0 || this.B0 != 0.0f)) {
                if (this.v0 == null) {
                    rs rsVar2 = this.u0;
                    rsVar2.N = 0.0f;
                    rsVar2.invalidateSelf();
                } else if (this.v0.c() + this.u0.c() < getMeasuredWidth()) {
                    canvas2.save();
                    canvas2.translate(this.u0.c() + (this.v0.c() - getMeasuredWidth()), 0.0f);
                    this.v0.B = (int) (Color.alpha(this.y0) * this.B0);
                    this.v0.draw(canvas2);
                    canvas2.restore();
                    rs rsVar3 = this.u0;
                    rsVar3.N = 0.0f;
                    rsVar3.invalidateSelf();
                } else {
                    canvas2.save();
                    canvas2.translate(this.e0, 0.0f);
                    this.v0.B = (int) (Color.alpha(this.y0) * this.B0);
                    this.v0.draw(canvas2);
                    canvas2.restore();
                    rs rsVar4 = this.u0;
                    rsVar4.N = (this.v0.c() + org.telegram.messenger.g0.L(2.0f)) - this.e0;
                    rsVar4.invalidateSelf();
                }
                this.u0.B = (int) (Color.alpha(this.y0) * this.B0);
                this.u0.draw(canvas2);
            } else if (this.p0 != null && (this.A0 || this.B0 != 0.0f)) {
                int color = getPaint().getColor();
                canvas2.save();
                float lineLeft = this.p0.getLineLeft(0);
                float lineWidth = this.p0.getLineWidth(0);
                int i13 = lineLeft != 0.0f ? (int) (0 - lineLeft) : 0;
                if (this.G0 && org.telegram.messenger.bd.a0) {
                    float scrollX = getScrollX() + i13 + (getMeasuredWidth() - lineWidth);
                    this.q0 = scrollX;
                    canvas2.translate(scrollX, (this.M0 - this.p0.getHeight()) - org.telegram.messenger.g0.L(7.0f));
                } else {
                    float scrollX2 = getScrollX() + i13 + this.l1;
                    this.q0 = scrollX2;
                    canvas2.translate(scrollX2, (this.M0 - this.p0.getHeight()) - org.telegram.messenger.g0.M(7.0f));
                }
                if (this.T0) {
                    float f17 = 1.0f - (this.X0 * 0.3f);
                    if (this.G0 && org.telegram.messenger.bd.a0) {
                        float f18 = lineWidth + lineLeft;
                        canvas2.translate(f18 - (f18 * f17), 0.0f);
                    } else if (lineLeft != 0.0f) {
                        canvas2.translate((1.0f - f17) * lineLeft, 0.0f);
                    }
                    canvas2.scale(f17, f17);
                    canvas2.translate(0.0f, (-org.telegram.messenger.g0.L(22.0f)) * this.X0);
                    getPaint().setColor(i0.a.f(this.X0, this.y0, this.z0));
                } else {
                    getPaint().setColor(this.y0);
                    getPaint().setAlpha((int) ((Color.alpha(this.y0) / 255.0f) * this.B0 * 255.0f));
                }
                hw0 hw0Var = this.d0;
                if (hw0Var == null || !hw0Var.e) {
                    f10 = 2.0f;
                    f11 = 150.0f;
                    ai.c cVar = this.t0;
                    if (cVar != null) {
                        cVar.a(canvas2, new cl(12, this, canvas2));
                    } else {
                        this.p0.draw(canvas2);
                    }
                } else {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    hw0 hw0Var2 = this.d0;
                    TextPaint paint = getPaint();
                    EditTextBoldCursor editTextBoldCursor = hw0Var2.a;
                    if (hw0Var2.e) {
                        float f19 = hw0Var2.h * (hw0Var2.f ? hw0Var2.i : 1.0f - hw0Var2.i);
                        int alpha = paint.getAlpha();
                        if (hw0Var2.d != null) {
                            canvas2.save();
                            canvas2.translate(f19, 0.0f);
                            hw0Var2.d.draw(canvas2);
                            canvas2.restore();
                        }
                        if (hw0Var2.b != null) {
                            float f20 = hw0Var2.f ? 1.0f - hw0Var2.i : hw0Var2.i;
                            canvas2.save();
                            f10 = 2.0f;
                            paint.setAlpha((int) (alpha * f20));
                            canvas2.translate(f19, 0.0f);
                            if (hw0Var2.g) {
                                float f21 = (f20 * 0.1f) + 0.9f;
                                canvas2.scale(f21, f21, f19, editTextBoldCursor.getMeasuredHeight() / 2.0f);
                            }
                            hw0Var2.b.draw(canvas2);
                            canvas2.restore();
                            paint.setAlpha(alpha);
                        } else {
                            f10 = 2.0f;
                        }
                        if (hw0Var2.c != null) {
                            float f22 = hw0Var2.f ? hw0Var2.i : 1.0f - hw0Var2.i;
                            canvas2.save();
                            f11 = 150.0f;
                            paint.setAlpha((int) (alpha * (hw0Var2.f ? hw0Var2.i : 1.0f - hw0Var2.i)));
                            canvas2.translate(f19, 0.0f);
                            if (hw0Var2.g) {
                                float f23 = (f22 * 0.1f) + 0.9f;
                                canvas2.scale(f23, f23, f19, editTextBoldCursor.getMeasuredHeight() / f10);
                            }
                            hw0Var2.c.draw(canvas2);
                            canvas2.restore();
                            paint.setAlpha(alpha);
                            canvas2.restore();
                        }
                    } else {
                        f10 = 2.0f;
                    }
                    f11 = 150.0f;
                    canvas2.restore();
                }
                getPaint().setColor(color);
                canvas2.restore();
                if (this.u1) {
                    canvas2.saveLayerAlpha((getPaddingLeft() + getScrollX()) - this.y1, 0.0f, ((getWidth() + getScrollX()) - getPaddingRight()) + this.y1, getHeight(), org.telegram.messenger.hs.e4, 31);
                }
                int extendedPaddingTop = getExtendedPaddingTop();
                this.m0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                field2 = B1;
                if (field2 == null) {
                    this.m0 = field2.getInt(this);
                    B1.set(this, 0);
                } else {
                    this.m0 = getScrollX();
                }
                this.k0 = 1;
                this.l0 = 1;
                canvas2.save();
                canvas2.translate(0.0f, extendedPaddingTop);
                this.e1 = true;
                super.onDraw(canvas);
                this.e1 = false;
                field = B1;
                if (field != null && (i12 = this.m0) != Integer.MAX_VALUE) {
                    try {
                        field.set(this, Integer.valueOf(i12));
                    } catch (Exception unused) {
                        boolean z14 = org.telegram.messenger.r2.a;
                    }
                }
                canvas2.restore();
                ssVar = this.f1;
                GradientDrawable gradientDrawable = this.c0;
                Rect rect = this.o0;
                if (ssVar != null) {
                    try {
                        Field field3 = A1;
                        if (field3 == null || (obj = this.b0) == null) {
                            z10 = this.H0;
                            this.H0 = false;
                        } else {
                            z10 = (SystemClock.uptimeMillis() - field3.getLong(obj)) % 1000 < 500 && isFocused();
                        }
                        if (this.D0 && z10) {
                            canvas2.save();
                            if (D1 != null) {
                                if ((getGravity() & org.telegram.messenger.hs.x1) != 48) {
                                    totalPaddingTop = ((Integer) D1.invoke(this, Boolean.TRUE)).intValue();
                                    canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                                    Layout layout = getLayout();
                                    int lineForOffset = layout.getLineForOffset(getSelectionStart());
                                    int lineCount = layout.getLineCount();
                                    x();
                                    Rect bounds = gradientDrawable.getBounds();
                                    rect.left = bounds.left;
                                    rect.right = bounds.left + org.telegram.messenger.g0.L(this.F0);
                                    i3 = bounds.bottom;
                                    rect.bottom = i3;
                                    rect.top = bounds.top;
                                    f12 = this.n0;
                                    if (f12 != 0.0f && lineForOffset < lineCount - 1) {
                                        rect.bottom = (int) (i3 - f12);
                                    }
                                    int centerY = rect.centerY();
                                    int i14 = this.j0;
                                    int i15 = centerY - (i14 / 2);
                                    rect.top = i15;
                                    rect.bottom = i15 + i14;
                                    gradientDrawable.setBounds(rect);
                                    n(canvas2, gradientDrawable);
                                    canvas2.restore();
                                }
                                totalPaddingTop = 0;
                                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                                Layout layout2 = getLayout();
                                int lineForOffset2 = layout2.getLineForOffset(getSelectionStart());
                                int lineCount2 = layout2.getLineCount();
                                x();
                                Rect bounds2 = gradientDrawable.getBounds();
                                rect.left = bounds2.left;
                                rect.right = bounds2.left + org.telegram.messenger.g0.L(this.F0);
                                i3 = bounds2.bottom;
                                rect.bottom = i3;
                                rect.top = bounds2.top;
                                f12 = this.n0;
                                if (f12 != 0.0f) {
                                    rect.bottom = (int) (i3 - f12);
                                }
                                int centerY2 = rect.centerY();
                                int i142 = this.j0;
                                int i152 = centerY2 - (i142 / 2);
                                rect.top = i152;
                                rect.bottom = i152 + i142;
                                gradientDrawable.setBounds(rect);
                                n(canvas2, gradientDrawable);
                                canvas2.restore();
                            } else {
                                if ((getGravity() & org.telegram.messenger.hs.x1) != 48) {
                                    totalPaddingTop = getTotalPaddingTop() - getExtendedPaddingTop();
                                    canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                                    Layout layout22 = getLayout();
                                    int lineForOffset22 = layout22.getLineForOffset(getSelectionStart());
                                    int lineCount22 = layout22.getLineCount();
                                    x();
                                    Rect bounds22 = gradientDrawable.getBounds();
                                    rect.left = bounds22.left;
                                    rect.right = bounds22.left + org.telegram.messenger.g0.L(this.F0);
                                    i3 = bounds22.bottom;
                                    rect.bottom = i3;
                                    rect.top = bounds22.top;
                                    f12 = this.n0;
                                    if (f12 != 0.0f) {
                                    }
                                    int centerY22 = rect.centerY();
                                    int i1422 = this.j0;
                                    int i1522 = centerY22 - (i1422 / 2);
                                    rect.top = i1522;
                                    rect.bottom = i1522 + i1422;
                                    gradientDrawable.setBounds(rect);
                                    n(canvas2, gradientDrawable);
                                    canvas2.restore();
                                }
                                totalPaddingTop = 0;
                                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                                Layout layout222 = getLayout();
                                int lineForOffset222 = layout222.getLineForOffset(getSelectionStart());
                                int lineCount222 = layout222.getLineCount();
                                x();
                                Rect bounds222 = gradientDrawable.getBounds();
                                rect.left = bounds222.left;
                                rect.right = bounds222.left + org.telegram.messenger.g0.L(this.F0);
                                i3 = bounds222.bottom;
                                rect.bottom = i3;
                                rect.top = bounds222.top;
                                f12 = this.n0;
                                if (f12 != 0.0f) {
                                }
                                int centerY222 = rect.centerY();
                                int i14222 = this.j0;
                                int i15222 = centerY222 - (i14222 / 2);
                                rect.top = i15222;
                                rect.bottom = i15222 + i14222;
                                gradientDrawable.setBounds(rect);
                                n(canvas2, gradientDrawable);
                                canvas2.restore();
                            }
                        }
                    } catch (Throwable unused2) {
                        boolean z15 = org.telegram.messenger.r2.a;
                    }
                } else if (this.H0 && this.D0) {
                    try {
                        canvas2.save();
                        if (D1 != null) {
                            if ((getGravity() & org.telegram.messenger.hs.x1) != 48) {
                                totalPaddingTop2 = ((Integer) D1.invoke(this, Boolean.TRUE)).intValue();
                                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                                Layout layout3 = getLayout();
                                int lineForOffset3 = layout3.getLineForOffset(getSelectionStart());
                                int lineCount3 = layout3.getLineCount();
                                x();
                                Rect bounds3 = gradientDrawable.getBounds();
                                rect.left = bounds3.left;
                                rect.right = bounds3.left + org.telegram.messenger.g0.L(this.F0);
                                i11 = bounds3.bottom;
                                rect.bottom = i11;
                                rect.top = bounds3.top;
                                f14 = this.n0;
                                if (f14 != 0.0f && lineForOffset3 < lineCount3 - 1) {
                                    rect.bottom = (int) (i11 - f14);
                                }
                                int centerY3 = rect.centerY();
                                int i16 = this.j0;
                                int i17 = centerY3 - (i16 / 2);
                                rect.top = i17;
                                rect.bottom = i17 + i16;
                                gradientDrawable.setBounds(rect);
                                n(canvas2, gradientDrawable);
                                canvas2.restore();
                                this.H0 = false;
                            }
                            totalPaddingTop2 = 0;
                            canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                            Layout layout32 = getLayout();
                            int lineForOffset32 = layout32.getLineForOffset(getSelectionStart());
                            int lineCount32 = layout32.getLineCount();
                            x();
                            Rect bounds32 = gradientDrawable.getBounds();
                            rect.left = bounds32.left;
                            rect.right = bounds32.left + org.telegram.messenger.g0.L(this.F0);
                            i11 = bounds32.bottom;
                            rect.bottom = i11;
                            rect.top = bounds32.top;
                            f14 = this.n0;
                            if (f14 != 0.0f) {
                                rect.bottom = (int) (i11 - f14);
                            }
                            int centerY32 = rect.centerY();
                            int i162 = this.j0;
                            int i172 = centerY32 - (i162 / 2);
                            rect.top = i172;
                            rect.bottom = i172 + i162;
                            gradientDrawable.setBounds(rect);
                            n(canvas2, gradientDrawable);
                            canvas2.restore();
                            this.H0 = false;
                        } else {
                            if ((getGravity() & org.telegram.messenger.hs.x1) != 48) {
                                totalPaddingTop2 = getTotalPaddingTop() - getExtendedPaddingTop();
                                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                                Layout layout322 = getLayout();
                                int lineForOffset322 = layout322.getLineForOffset(getSelectionStart());
                                int lineCount322 = layout322.getLineCount();
                                x();
                                Rect bounds322 = gradientDrawable.getBounds();
                                rect.left = bounds322.left;
                                rect.right = bounds322.left + org.telegram.messenger.g0.L(this.F0);
                                i11 = bounds322.bottom;
                                rect.bottom = i11;
                                rect.top = bounds322.top;
                                f14 = this.n0;
                                if (f14 != 0.0f) {
                                }
                                int centerY322 = rect.centerY();
                                int i1622 = this.j0;
                                int i1722 = centerY322 - (i1622 / 2);
                                rect.top = i1722;
                                rect.bottom = i1722 + i1622;
                                gradientDrawable.setBounds(rect);
                                n(canvas2, gradientDrawable);
                                canvas2.restore();
                                this.H0 = false;
                            }
                            totalPaddingTop2 = 0;
                            canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                            Layout layout3222 = getLayout();
                            int lineForOffset3222 = layout3222.getLineForOffset(getSelectionStart());
                            int lineCount3222 = layout3222.getLineCount();
                            x();
                            Rect bounds3222 = gradientDrawable.getBounds();
                            rect.left = bounds3222.left;
                            rect.right = bounds3222.left + org.telegram.messenger.g0.L(this.F0);
                            i11 = bounds3222.bottom;
                            rect.bottom = i11;
                            rect.top = bounds3222.top;
                            f14 = this.n0;
                            if (f14 != 0.0f) {
                            }
                            int centerY3222 = rect.centerY();
                            int i16222 = this.j0;
                            int i17222 = centerY3222 - (i16222 / 2);
                            rect.top = i17222;
                            rect.bottom = i17222 + i16222;
                            gradientDrawable.setBounds(rect);
                            n(canvas2, gradientDrawable);
                            canvas2.restore();
                            this.H0 = false;
                        }
                    } catch (Throwable unused3) {
                        boolean z16 = org.telegram.messenger.r2.a;
                    }
                }
                if (this.I0 && this.J0 != 0) {
                    int L = org.telegram.messenger.g0.L(1.0f);
                    z11 = this.N0;
                    isEmpty = TextUtils.isEmpty(this.x0);
                    Paint paint2 = this.g0;
                    if (isEmpty) {
                        paint2.setColor(this.L0);
                        L = org.telegram.messenger.g0.L(f10);
                        this.N0 = false;
                    } else if (isFocused()) {
                        this.N0 = true;
                    } else {
                        paint2.setColor(this.J0);
                        this.N0 = false;
                    }
                    if (this.N0 != z11) {
                        this.P0 = SystemClock.elapsedRealtime();
                        this.Q0 = this.O0;
                    }
                    elapsedRealtime = (SystemClock.elapsedRealtime() - this.P0) / f11;
                    if (elapsedRealtime >= 1.0f || (((z12 = this.N0) && this.O0 != 1.0f) || (!z12 && this.O0 != 0.0f))) {
                        this.O0 = org.telegram.messenger.g0.T1(this.Q0, !this.N0 ? 1.0f : 0.0f, Math.max(0.0f, Math.min(1.0f, elapsedRealtime)));
                        if (elapsedRealtime < 1.0f) {
                            invalidate();
                        }
                    }
                    int measuredHeight = !this.s0 ? getMeasuredHeight() - org.telegram.messenger.g0.L(f10) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() != null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), org.telegram.messenger.g0.L(f10)) + getScrollY() + ((int) this.M0);
                    i10 = this.k1;
                    if (i10 < 0) {
                        i10 = getMeasuredWidth() / 2;
                    }
                    int i18 = i10;
                    int max = Math.max(i18, getMeasuredWidth() - i18) * 2;
                    if (this.O0 < 1.0f) {
                        canvas2.drawRect(getScrollX(), measuredHeight - L, getMeasuredWidth() + getScrollX(), measuredHeight, this.g0);
                    }
                    f13 = this.O0;
                    if (f13 <= 0.0f) {
                        float interpolation = xq.j.getInterpolation(f13);
                        boolean z17 = this.N0;
                        if (z17) {
                            this.R0 = max * interpolation;
                        }
                        if (z17) {
                            interpolation = 1.0f;
                        }
                        int L2 = (int) (interpolation * org.telegram.messenger.g0.L(f10));
                        float f24 = i18;
                        canvas2 = canvas;
                        canvas2.drawRect(getScrollX() + Math.max(0.0f, f24 - (this.R0 / f10)), measuredHeight - L2, getScrollX() + Math.min((this.R0 / f10) + f24, getMeasuredWidth()), measuredHeight, this.h0);
                    } else {
                        canvas2 = canvas;
                    }
                }
                if (this.u1) {
                    return;
                }
                canvas2.save();
                canvas2.translate(getScrollX(), 0.0f);
                this.v1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.x1.reset();
                this.w1.setLocalMatrix(this.x1);
                canvas2.drawRect(getPaddingLeft() - this.y1, 0.0f, getPaddingLeft(), getHeight(), this.v1);
                this.x1.reset();
                this.x1.postScale(-1.0f, 1.0f, this.y1 / f10, 0.0f);
                this.x1.postTranslate(getWidth() - getPaddingRight(), 0.0f);
                this.w1.setLocalMatrix(this.x1);
                canvas.drawRect(getWidth() - getPaddingRight(), 0.0f, (getWidth() - getPaddingRight()) + this.y1, getHeight(), this.v1);
                canvas.restore();
                canvas.restore();
                return;
            }
        }
        f10 = 2.0f;
        f11 = 150.0f;
        if (this.u1) {
        }
        int extendedPaddingTop2 = getExtendedPaddingTop();
        this.m0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        field2 = B1;
        if (field2 == null) {
        }
        this.k0 = 1;
        this.l0 = 1;
        canvas2.save();
        canvas2.translate(0.0f, extendedPaddingTop2);
        this.e1 = true;
        super.onDraw(canvas);
        this.e1 = false;
        field = B1;
        if (field != null) {
            field.set(this, Integer.valueOf(i12));
        }
        canvas2.restore();
        ssVar = this.f1;
        GradientDrawable gradientDrawable2 = this.c0;
        Rect rect2 = this.o0;
        if (ssVar != null) {
        }
        if (this.I0) {
            int L3 = org.telegram.messenger.g0.L(1.0f);
            z11 = this.N0;
            isEmpty = TextUtils.isEmpty(this.x0);
            Paint paint22 = this.g0;
            if (isEmpty) {
            }
            if (this.N0 != z11) {
            }
            elapsedRealtime = (SystemClock.elapsedRealtime() - this.P0) / f11;
            if (elapsedRealtime >= 1.0f) {
            }
            this.O0 = org.telegram.messenger.g0.T1(this.Q0, !this.N0 ? 1.0f : 0.0f, Math.max(0.0f, Math.min(1.0f, elapsedRealtime)));
            if (elapsedRealtime < 1.0f) {
            }
            int measuredHeight2 = !this.s0 ? getMeasuredHeight() - org.telegram.messenger.g0.L(f10) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() != null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), org.telegram.messenger.g0.L(f10)) + getScrollY() + ((int) this.M0);
            i10 = this.k1;
            if (i10 < 0) {
            }
            int i182 = i10;
            int max2 = Math.max(i182, getMeasuredWidth() - i182) * 2;
            if (this.O0 < 1.0f) {
            }
            f13 = this.O0;
            if (f13 <= 0.0f) {
            }
        }
        if (this.u1) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i3, Rect rect) {
        try {
            super.onFocusChanged(z10, i3, rect);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        l(true);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.EditText");
        if (this.p0 != null) {
            if (getText().length() <= 0) {
                accessibilityNodeInfo.setText(this.p0.getText());
            } else {
                new s0.d(accessibilityNodeInfo).l(this.p0.getText());
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        rs rsVar = this.u0;
        if (rsVar != null) {
            rsVar.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        rs rsVar2 = this.v0;
        if (rsVar2 != null) {
            rsVar2.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        StaticLayout staticLayout = this.p0;
        if (staticLayout == null || this.u0 != null) {
            this.M0 = getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
        } else {
            if (this.d1 != measuredHeight) {
                s(this.w0, false, staticLayout.getPaint());
            }
            if (this.r0) {
                this.M0 = ((((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - this.p0.getHeight()) / 2.0f) + (getPaddingTop() + getExtendedPaddingTop())) + this.p0.getHeight()) - org.telegram.messenger.g0.L(1.0f);
            } else {
                this.M0 = ((getMeasuredHeight() - this.p0.getHeight()) / 2.0f) + this.p0.getHeight() + org.telegram.messenger.g0.L(6.0f);
            }
        }
        this.d1 = measuredHeight;
    }

    @Override // android.widget.TextView, android.view.View
    public void onScrollChanged(int i3, int i10, int i11, int i12) {
        super.onScrollChanged(i3, i10, i11, i12);
        if (i3 != i11) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // org.telegram.ui.Components.bt, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        super.onTextChanged(charSequence, i3, i10, i11);
        if (!this.T0 || this.U0) {
            return;
        }
        l(true);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.k1 = (int) motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final StaticLayout p(int i3) {
        if (TextUtils.isEmpty(this.x0)) {
            return null;
        }
        return new StaticLayout(this.x0, this.i0, i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override // android.view.View
    public final boolean postDelayed(Runnable runnable, long j10) {
        if (Build.VERSION.SDK_INT < 29 || runnable == null || j10 != 500 || !"android.widget.Editor$Blink".equals(runnable.getClass().getName()) || Looper.myLooper() != Looper.getMainLooper()) {
            return super.postDelayed(runnable, j10);
        }
        cg.j d = cg.j.d();
        d.getClass();
        cg.j.c();
        int max = Math.max(1, Math.min(2, 60));
        d.h(runnable);
        cg.i e10 = d.e(max);
        if (e10.d == null) {
            e10.d = new ue.b();
        }
        e10.d.add(runnable);
        return true;
    }

    public final void q() {
        invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (G1 != null) {
                    if (this.b0 == null) {
                        this.b0 = z1.get(this);
                    }
                    Object obj = this.b0;
                    if (obj != null) {
                        G1.invoke(obj, null);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void r(CharSequence charSequence, boolean z10) {
        s(charSequence, z10, getPaint());
    }

    @Override // android.view.View
    public final boolean removeCallbacks(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            cg.j.d().h(runnable);
        }
        return super.removeCallbacks(runnable);
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        this.g1.remove(textWatcher);
        if (this.h1) {
            return;
        }
        super.removeTextChangedListener(textWatcher);
    }

    public final void s(CharSequence charSequence, boolean z10, TextPaint textPaint) {
        TextPaint textPaint2;
        String charSequence2;
        String charSequence3;
        boolean z11;
        CharSequence charSequence4 = charSequence;
        rs rsVar = this.u0;
        if (rsVar != null) {
            rsVar.t(charSequence4, !org.telegram.messenger.bd.a0, true);
            return;
        }
        if (charSequence4 == null) {
            charSequence4 = "";
        }
        CharSequence charSequence5 = charSequence4;
        boolean z12 = false;
        if (getMeasuredWidth() == 0 ? false : z10) {
            if (this.d0 == null) {
                this.d0 = new hw0(this);
            }
            hw0 hw0Var = this.d0;
            StaticLayout staticLayout = this.p0;
            CharSequence charSequence6 = this.w0;
            hw0Var.getClass();
            if (staticLayout != null && !charSequence6.equals(charSequence5)) {
                ValueAnimator valueAnimator = hw0Var.j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (charSequence6.length() > charSequence5.length()) {
                    charSequence2 = charSequence6.toString();
                    charSequence3 = charSequence5.toString();
                    z11 = true;
                } else {
                    charSequence2 = charSequence5.toString();
                    charSequence3 = charSequence6.toString();
                    z11 = false;
                }
                int indexOf = charSequence2.indexOf(charSequence3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence2);
                    if (indexOf != 0) {
                        spannableStringBuilder2.setSpan(new fy(z12), 0, indexOf, 0);
                    }
                    if (charSequence3.length() + indexOf != charSequence2.length()) {
                        spannableStringBuilder2.setSpan(new fy(z12), charSequence3.length() + indexOf, charSequence2.length(), 0);
                    }
                    spannableStringBuilder.setSpan(new fy(z12), indexOf, charSequence3.length() + indexOf, 0);
                    int L = org.telegram.messenger.g0.L(400.0f);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    hw0Var.b = new StaticLayout(spannableStringBuilder, textPaint, L, alignment, 1.0f, 0.0f, false);
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder2, textPaint, org.telegram.messenger.g0.L(400.0f), alignment, 1.0f, 0.0f, false);
                    hw0Var.d = staticLayout2;
                    hw0Var.e = true;
                    hw0Var.f = z11;
                    hw0Var.h = indexOf == 0 ? 0.0f : -staticLayout2.getPrimaryHorizontal(indexOf);
                    hw0Var.c = null;
                    hw0Var.g = false;
                } else {
                    int L2 = org.telegram.messenger.g0.L(400.0f);
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    hw0Var.b = new StaticLayout(charSequence5, textPaint, L2, alignment2, 1.0f, 0.0f, false);
                    hw0Var.c = new StaticLayout(charSequence6, textPaint, org.telegram.messenger.g0.L(400.0f), alignment2, 1.0f, 0.0f, false);
                    hw0Var.d = null;
                    hw0Var.e = true;
                    hw0Var.g = true;
                    hw0Var.h = 0.0f;
                }
                hw0Var.i = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                hw0Var.j = ofFloat;
                ofFloat.addUpdateListener(new y50(hw0Var, 25));
                hw0Var.j.addListener(new a60(hw0Var, 27));
                hw0Var.j.setDuration(150L);
                hw0Var.j.setInterpolator(xq.f);
                hw0Var.j.start();
            }
        } else {
            hw0 hw0Var2 = this.d0;
            if (hw0Var2 != null) {
                ValueAnimator valueAnimator2 = hw0Var2.j;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                hw0Var2.e = false;
            }
        }
        this.w0 = charSequence5;
        if (getMeasuredWidth() != 0) {
            textPaint2 = textPaint;
            charSequence5 = TextUtils.ellipsize(charSequence5, textPaint2, getMeasuredWidth(), TextUtils.TruncateAt.END);
            StaticLayout staticLayout3 = this.p0;
            if (staticLayout3 != null && TextUtils.equals(staticLayout3.getText(), charSequence5)) {
                return;
            }
        } else {
            textPaint2 = textPaint;
        }
        this.p0 = new StaticLayout(charSequence5, textPaint2, org.telegram.messenger.g0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public void setActiveLineColor(int i3) {
        this.K0 = i3;
        this.h0.setColor(i3);
        invalidate();
    }

    public void setAllowDrawCursor(boolean z10) {
        this.D0 = z10;
        invalidate();
    }

    public void setBlurredBackgroundDrawableViewFactory(eh.c cVar) {
        this.n1 = cVar;
    }

    public void setCursorColor(int i3) {
        this.i1 = i3;
        ss ssVar = this.f1;
        if (ssVar != null) {
            ssVar.getPaint().setColor(i3);
        }
        GradientDrawable gradientDrawable = this.c0;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i3);
        }
        invalidate();
    }

    public void setCursorSize(int i3) {
        this.j0 = i3;
    }

    public void setCursorWidth(float f10) {
        this.F0 = f10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.u1 = z10;
        if (z10) {
            this.y1 = org.telegram.messenger.g0.L(12.0f);
            this.v1 = new Paint(1);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.y1, 0.0f, new int[]{-1, 16777215}, new float[]{0.4f, 1.0f}, Shader.TileMode.CLAMP);
            this.w1 = linearGradient;
            this.v1.setShader(linearGradient);
            this.x1 = new Matrix();
        }
    }

    public void setErrorLineColor(int i3) {
        this.L0 = i3;
        this.i0.setColor(i3);
        invalidate();
    }

    public void setErrorText(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.x0)) {
            return;
        }
        this.x0 = charSequence;
        requestLayout();
    }

    public void setForceCursorEnd(boolean z10) {
        this.E0 = z10;
        invalidate();
    }

    public void setHandlesColor(int i3) {
        if (Build.VERSION.SDK_INT < 29 || org.telegram.messenger.sr.i() || this.s1 == i3) {
            return;
        }
        this.s1 = i3;
        this.r1 = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
        y(this.o1, false);
        y(this.p1, false);
        y(this.q1, false);
    }

    public void setHeaderAnimationProgress(float f10) {
        this.X0 = f10;
        invalidate();
    }

    public void setHeaderHintColor(int i3) {
        this.z0 = i3;
        invalidate();
    }

    public void setHintColor(int i3) {
        this.y0 = i3;
        rs rsVar = this.u0;
        if (rsVar != null) {
            rsVar.u(i3);
        }
        rs rsVar2 = this.v0;
        if (rsVar2 != null) {
            rsVar2.u(this.y0);
        }
        invalidate();
    }

    public void setHintRightOffset(int i3) {
        float f10 = i3;
        if (this.e0 == f10) {
            return;
        }
        this.e0 = f10;
        invalidate();
    }

    public void setHintText(CharSequence charSequence) {
        s(charSequence, false, getPaint());
    }

    public void setLineColor(int i3) {
        this.J0 = i3;
        invalidate();
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.n0 = f10;
    }

    public void setNextSetTextAnimated(boolean z10) {
        this.S0 = z10;
    }

    public void setOnPremiumMenuLockClickListener(Runnable runnable) {
        this.t1 = runnable;
    }

    @Override // android.widget.EditText
    public final void setSelection(int i3, int i10) {
        try {
            super.setSelection(i3, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void setSupportRtlHint(boolean z10) {
        this.G0 = z10;
    }

    @Override // org.telegram.ui.Components.bt, android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        l(this.S0);
        this.S0 = false;
    }

    @Override // android.widget.TextView
    public void setTextSelectHandle(Drawable drawable) {
        Drawable y9 = y(drawable, true);
        this.q1 = y9;
        super.setTextSelectHandle(y9);
    }

    @Override // android.widget.TextView
    public void setTextSelectHandleLeft(Drawable drawable) {
        Drawable y9 = y(drawable, true);
        this.o1 = y9;
        super.setTextSelectHandleLeft(y9);
    }

    @Override // android.widget.TextView
    public void setTextSelectHandleRight(Drawable drawable) {
        Drawable y9 = y(drawable, true);
        this.p1 = y9;
        super.setTextSelectHandleRight(y9);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i3, float f10) {
        rs rsVar = this.u0;
        if (rsVar != null) {
            rsVar.w(org.telegram.messenger.g0.L(f10));
        }
        rs rsVar2 = this.v0;
        if (rsVar2 != null) {
            rsVar2.w(org.telegram.messenger.g0.L(f10));
        }
        super.setTextSize(i3, f10);
    }

    public void setTransformHintToHeader(boolean z10) {
        if (this.T0 == z10) {
            return;
        }
        this.T0 = z10;
        AnimatorSet animatorSet = this.W0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.W0 = null;
        }
    }

    public void setTransformHintToHeaderOnFocus(boolean z10) {
        if (this.U0 == z10) {
            return;
        }
        this.U0 = z10;
        l(false);
    }

    public void setWindowView(View view) {
        this.b1 = view;
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        if (this.b1 == null && this.c1 == null) {
            return super.startActionMode(callback);
        }
        org.telegram.ui.ActionBar.u3 u3Var = this.Z0;
        if (u3Var != null) {
            u3Var.finish();
        }
        m();
        Context context = getContext();
        View view = this.b1;
        if (view == null) {
            view = this.c1;
        }
        org.telegram.ui.ActionBar.k4 k4Var = new org.telegram.ui.ActionBar.k4(context, view, getActionModeStyle(), getResourcesProvider(), this.n1);
        this.Y0 = k4Var;
        k4Var.j = this.t1;
        k4Var.k = new qs(this, 0);
        org.telegram.ui.ActionBar.u3 u3Var2 = new org.telegram.ui.ActionBar.u3(getContext(), new org.telegram.ui.Cells.f9(this, callback), this, this.Y0);
        this.Z0 = u3Var2;
        this.a1 = new pk(1, this);
        callback.onCreateActionMode(u3Var2, u3Var2.c);
        org.telegram.ui.ActionBar.u3 u3Var3 = this.Z0;
        o(u3Var3, u3Var3.c);
        this.Z0.invalidate();
        getViewTreeObserver().addOnPreDrawListener(this.a1);
        invalidate();
        return this.Z0;
    }

    public final void t(boolean z10, boolean z11) {
        if (this.A0 == z10) {
            return;
        }
        this.C0 = System.currentTimeMillis();
        this.A0 = z10;
        if (!z11) {
            this.B0 = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void u(int i3, int i10, int i11) {
        this.I0 = true;
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.search_dark);
        Rect rect = this.j1;
        drawable.getPadding(rect);
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
        this.J0 = i3;
        this.K0 = i10;
        this.h0.setColor(i10);
        this.L0 = i11;
        this.i0.setColor(i11);
        invalidate();
    }

    public final void v(boolean z10, boolean z11) {
        if (this.h1 == z10) {
            return;
        }
        this.h1 = z10;
        ArrayList arrayList = this.g1;
        int i3 = 0;
        if (z10) {
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                super.removeTextChangedListener((TextWatcher) obj);
            }
            return;
        }
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            TextWatcher textWatcher = (TextWatcher) obj2;
            super.addTextChangedListener(textWatcher);
            if (z11) {
                textWatcher.beforeTextChanged("", 0, length(), length());
                textWatcher.onTextChanged(getText(), 0, length(), length());
                textWatcher.afterTextChanged(getText());
            }
        }
    }

    public final boolean w() {
        Editable text;
        if (!hasSelection() || getSelectionStart() < 0 || getSelectionEnd() < 0 || getSelectionStart() == getSelectionEnd() || (text = getText()) == null) {
            return false;
        }
        wg0[] wg0VarArr = (wg0[]) text.getSpans(getSelectionStart(), getSelectionEnd(), wg0.class);
        return wg0VarArr == null || wg0VarArr.length == 0;
    }

    public final void x() {
        int i3;
        Layout layout = getLayout();
        int length = this.E0 ? layout.getText().length() : getSelectionStart();
        int lineForOffset = layout.getLineForOffset(length);
        int lineTop = layout.getLineTop(lineForOffset);
        int lineTop2 = layout.getLineTop(lineForOffset + 1);
        float max = Math.max(0.5f, layout.getPrimaryHorizontal(length) - 0.5f);
        if (this.m1 == null) {
            this.m1 = new Rect();
        }
        GradientDrawable gradientDrawable = this.c0;
        if (gradientDrawable != null) {
            gradientDrawable.getPadding(this.m1);
            i3 = gradientDrawable.getIntrinsicWidth();
        } else {
            this.m1.setEmpty();
            i3 = 0;
        }
        int scrollX = getScrollX();
        float f10 = max - scrollX;
        int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        float f11 = width;
        int i10 = f10 >= f11 - 1.0f ? (width + scrollX) - (i3 - this.m1.right) : (Math.abs(f10) <= 1.0f || (TextUtils.isEmpty(getText()) && ((float) (TLObject.FLAG_20 - scrollX)) <= f11 + 1.0f && max <= 1.0f)) ? scrollX - this.m1.left : ((int) max) - this.m1.left;
        int L = org.telegram.messenger.g0.L(this.F0);
        Rect rect = this.m1;
        this.c0.setBounds(i10, lineTop - rect.top, L + i10, lineTop2 + rect.bottom);
        layout.getText();
    }

    public final Drawable y(Drawable drawable, boolean z10) {
        if (drawable != null) {
            if (z10) {
                drawable = drawable.mutate();
            }
            PorterDuffColorFilter porterDuffColorFilter = this.r1;
            if (porterDuffColorFilter != null) {
                drawable.setColorFilter(porterDuffColorFilter);
            }
        }
        return drawable;
    }

    @Override // android.widget.EditText
    public void setSelection(int i3) {
        try {
            super.setSelection(i3);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i3) {
        if (this.b1 == null && this.c1 == null) {
            return super.startActionMode(callback, i3);
        }
        return startActionMode(callback);
    }

    public void o(ActionMode actionMode, Menu menu) {
    }
}
