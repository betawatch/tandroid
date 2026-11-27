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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class EditTextBoldCursor extends cu3 {
    public static Field F1;
    public static Field G1;
    public static Field H1;
    public static boolean I1;
    public static Method J1;
    public static Class K1;
    public static Field L1;
    public static Method M1;
    public boolean A0;
    public boolean A1;
    public float B0;
    public Paint B1;
    public long C0;
    public LinearGradient C1;
    public boolean D0;
    public Matrix D1;
    public boolean E0;
    public int E1;
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
    public lm4 Y0;
    public cl4 Z0;
    public es1 a1;
    public Object b0;
    public View b1;
    public final GradientDrawable c0;
    public View c1;
    public geb d0;
    public int d1;
    public float e0;
    public boolean e1;
    public final km f0;
    public final qt3 f1;
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
    public LinearGradient m1;
    public float n0;
    public rx n1;
    public final Rect o0;
    public boolean o1;
    public StaticLayout p0;
    public float p1;
    public float q0;
    public float q1;
    public boolean r0;
    public long r1;
    public boolean s0;
    public Rect s1;
    public c t0;
    public ll0 t1;
    public pt3 u0;
    public Drawable u1;
    public pt3 v0;
    public Drawable v1;
    public CharSequence w0;
    public Drawable w1;
    public CharSequence x0;
    public PorterDuffColorFilter x1;
    public int y0;
    public int y1;
    public int z0;
    public Runnable z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditTextBoldCursor(Context context) {
        super(context, null, 0, R.style.EditTextNoBackgroundStyle);
        String str;
        byte b = 0;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = new Stack();
        this.c = new ArrayList();
        this.e = true;
        this.n = new Path();
        this.H = true;
        this.I = null;
        this.K = new l(this, (byte) 1);
        this.L = new Rect();
        Boolean bool = cu3.a0;
        if (bool == null) {
            String str2 = Build.MANUFACTURER;
            bool = Boolean.valueOf((str2 == null || !(str2.toLowerCase().contains("honor") || str2.toLowerCase().contains("huawei") || str2.toLowerCase().contains("alps") || str2.toLowerCase().contains("vivo") || str2.toLowerCase().contains("oppo") || str2.toLowerCase().contains("oneplus") || str2.toLowerCase().contains("realme"))) && ((str = Build.MODEL) == null || !str.toLowerCase().contains("mediapad")));
            cu3.a0 = bool;
        }
        this.Q = bool.booleanValue();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f = new nk0(this, arrayList, new bu3(this, b));
        }
        this.f0 = new km(this, (byte) 1);
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
        this.p1 = Float.NaN;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            setImportantForAutofill(2);
        }
        this.g0 = new Paint();
        this.h0 = new Paint();
        TextPaint textPaint = new TextPaint(1);
        this.i0 = textPaint;
        textPaint.setTextSize(hl.L(11.0f));
        if (i >= 26) {
            setImportantForAutofill(2);
        }
        if (i >= 29) {
            qt3 qt3Var = new qt3(this);
            this.f1 = qt3Var;
            qt3Var.setShape(new RectShape());
            this.c0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
            setTextCursorDrawable(this.f1);
        }
        try {
            if (!I1 && H1 == null) {
                I1 = true;
                Field declaredField = View.class.getDeclaredField("mScrollY");
                H1 = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (Throwable unused) {
        }
        try {
            if (K1 == null) {
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                F1 = declaredField2;
                declaredField2.setAccessible(true);
                Class<?> cls = Class.forName("android.widget.Editor");
                K1 = cls;
                try {
                    Field declaredField3 = cls.getDeclaredField("mShowCursor");
                    G1 = declaredField3;
                    declaredField3.setAccessible(true);
                } catch (Exception unused2) {
                }
                try {
                    Method declaredMethod = K1.getDeclaredMethod("invalidateTextDisplayList", null);
                    M1 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused3) {
                }
                Method declaredMethod2 = TextView.class.getDeclaredMethod("getVerticalOffset", Boolean.TYPE);
                J1 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        if (this.f1 == null) {
            try {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
                this.c0 = gradientDrawable;
                if (Build.VERSION.SDK_INT >= 29) {
                    setTextCursorDrawable(gradientDrawable);
                }
                this.b0 = F1.get(this);
            } catch (Throwable unused4) {
            }
            try {
                if (L1 == null) {
                    Field declaredField4 = TextView.class.getDeclaredField("mCursorDrawableRes");
                    L1 = declaredField4;
                    declaredField4.setAccessible(true);
                }
                Field field = L1;
                if (field != null) {
                    field.set(this, Integer.valueOf(R.drawable.field_carret_empty));
                }
            } catch (Throwable unused5) {
            }
        }
        this.j0 = hl.L(24.0f);
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
        int i = this.l0;
        if (i == 0) {
            return super.getExtendedPaddingBottom();
        }
        this.l0 = i - 1;
        int i2 = this.m0;
        if (i2 != Integer.MAX_VALUE) {
            return -i2;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getExtendedPaddingTop() {
        int i = this.k0;
        if (i == 0) {
            return super.getExtendedPaddingTop();
        }
        this.k0 = i - 1;
        return 0;
    }

    public int getHandlesColor() {
        return this.y1;
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
        return this.z1;
    }

    public vnb getResourcesProvider() {
        return null;
    }

    @Override // android.widget.TextView
    public Drawable getTextCursorDrawable() {
        if (this.f1 != null) {
            return super.getTextCursorDrawable();
        }
        qt3 qt3Var = new qt3(this, new RectShape());
        qt3Var.getPaint().setColor(0);
        return qt3Var;
    }

    @Override // android.widget.TextView
    public Drawable getTextSelectHandle() {
        Drawable drawable = this.w1;
        if (drawable != null) {
            return drawable;
        }
        Drawable z = z(super.getTextSelectHandle(), true);
        this.w1 = z;
        return z;
    }

    @Override // android.widget.TextView
    public Drawable getTextSelectHandleLeft() {
        Drawable drawable = this.u1;
        if (drawable != null) {
            return drawable;
        }
        Drawable z = z(super.getTextSelectHandleLeft(), true);
        this.u1 = z;
        return z;
    }

    @Override // android.widget.TextView
    public Drawable getTextSelectHandleRight() {
        Drawable drawable = this.v1;
        if (drawable != null) {
            return drawable;
        }
        Drawable z = z(super.getTextSelectHandleRight(), true);
        this.v1 = z;
        return z;
    }

    public final void l(boolean z) {
        boolean z2 = this.T0 && (getText().length() > 0 || (this.U0 && isFocused()));
        if (this.V0 != z2) {
            AnimatorSet animatorSet = this.W0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W0 = null;
            }
            this.V0 = z2;
            if (z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.W0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "headerAnimationProgress", z2 ? 1.0f : 0.0f));
                this.W0.setDuration(200L);
                this.W0.setInterpolator(k43.h);
                this.W0.start();
            } else {
                this.X0 = z2 ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    public final void m() {
        lm4 lm4Var = this.Y0;
        if (lm4Var != null) {
            lm4Var.a.removeOnLayoutChangeListener(lm4Var.l);
            jm4 jm4Var = lm4Var.b;
            if (!jm4Var.F) {
                jm4Var.G = false;
                jm4Var.F = true;
                jm4Var.x.cancel();
                jm4Var.w.start();
                jm4Var.D.setEmpty();
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

    @Override // cu3, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        this.c1 = getRootView();
        if (Build.VERSION.SDK_INT < 29) {
            jh2.d().b(this.f0, 2);
        }
    }

    @Override // cu3, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c1 = null;
        if (Build.VERSION.SDK_INT < 29) {
            jh2.d().f(this.f0);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|(6:145|(1:272)(1:153)|154|(5:158|(1:171)|162|(2:164|(1:166))(2:168|(1:170))|167)|172|(2:193|(31:199|(1:201)(1:269)|202|(1:268)(1:206)|207|(3:209|(1:(1:266))(1:213)|214)(1:267)|215|(1:219)|220|(2:261|(1:263)(1:264))(4:224|(8:226|(1:228)|229|(1:231)|232|(5:234|(1:236)|237|(1:239)|240)(1:259)|241|(8:243|(1:245)|246|(1:248)|249|(1:251)|252|253))(1:260)|258|253)|254|(1:256)|257|7|(1:9)|10|11|12|(1:14)(1:143)|15|16|17|18|19|(2:23|24)|27|(5:108|109|(1:138)(2:113|(1:137)(1:117))|118|(2:121|(6:123|(4:125|126|(1:130)|131)|133|126|(2:128|130)|131)(6:134|(4:136|126|(0)|131)|133|126|(0)|131)))(2:29|(3:33|34|(6:36|(4:38|39|(1:43)|44)|46|39|(2:41|43)|44)(6:47|(4:49|39|(0)|44)|46|39|(0)|44)))|51|(21:55|(1:57)(2:98|(19:100|(1:60)|61|(2:63|(12:89|67|(1:69)(1:88)|70|(1:72)(1:87)|73|74|(1:76)|77|(1:79)|80|(3:82|(1:84)|85)(1:86))(12:65|67|(0)(0)|70|(0)(0)|73|74|(0)|77|(0)|80|(0)(0)))|91|(1:93)(1:97)|94|(1:96)|67|(0)(0)|70|(0)(0)|73|74|(0)|77|(0)|80|(0)(0))(1:101))|58|(0)|61|(0)|91|(0)(0)|94|(0)|67|(0)(0)|70|(0)(0)|73|74|(0)|77|(0)|80|(0)(0))|102|(2:104|105)(1:107)))(6:180|(2:182|(1:184)(1:191))(1:192)|185|(1:187)|188|(1:190)))(1:5)|6|7|(0)|10|11|12|(0)(0)|15|16|17|18|19|(3:21|23|24)|27|(0)(0)|51|(22:53|55|(0)(0)|58|(0)|61|(0)|91|(0)(0)|94|(0)|67|(0)(0)|70|(0)(0)|73|74|(0)|77|(0)|80|(0)(0))|102|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03f1, code lost:
    
        r2 = f11.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03db, code lost:
    
        r4 = f11.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0412 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04b7 A[Catch: all -> 0x04db, TryCatch #2 {all -> 0x04db, blocks: (B:109:0x0412, B:111:0x0416, B:113:0x041a, B:115:0x042c, B:118:0x043a, B:121:0x0440, B:123:0x0447, B:125:0x044f, B:126:0x0475, B:128:0x04b7, B:130:0x04ba, B:131:0x04bf, B:134:0x0462, B:136:0x046a, B:138:0x0436), top: B:108:0x0412 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03d4 A[Catch: Exception -> 0x03db, TRY_LEAVE, TryCatch #1 {Exception -> 0x03db, blocks: (B:12:0x03c0, B:14:0x03c4, B:143:0x03d4), top: B:11:0x03c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x03c4 A[Catch: Exception -> 0x03db, TryCatch #1 {Exception -> 0x03db, blocks: (B:12:0x03c0, B:14:0x03c4, B:143:0x03d4), top: B:11:0x03c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x055e A[Catch: all -> 0x0583, TryCatch #0 {all -> 0x0583, blocks: (B:34:0x04e7, B:36:0x04ee, B:38:0x04f6, B:39:0x051c, B:41:0x055e, B:43:0x0561, B:44:0x0566, B:47:0x0509, B:49:0x0511), top: B:33:0x04e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x038b  */
    @Override // cu3, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        Field field;
        qt3 qt3Var;
        boolean z;
        int totalPaddingTop;
        int i;
        float f3;
        Object obj;
        boolean z2;
        boolean isEmpty;
        boolean z3;
        float elapsedRealtime;
        int i2;
        float f4;
        int totalPaddingTop2;
        int i3;
        float f5;
        int i4;
        Field field2;
        if (length() == 0 || this.T0) {
            rx rxVar = this.n1;
            if (rxVar == null || ((mm) rxVar.d).d(rxVar.b) <= 0.0f || (!this.A0 && this.B0 == 0.0f)) {
                canvas2 = canvas;
            } else {
                this.n1.d(canvas, getPaddingLeft(), getMeasuredWidth() - getPaddingRight(), ((getMeasuredHeight() + getPaddingTop()) - getPaddingBottom()) / 2.0f, getPaint().getTextSize(), this.y0, this.m1, (int) (Color.alpha(r7) * this.B0));
                canvas2 = canvas;
            }
            boolean z4 = this.A0;
            float f6 = this.B0;
            if (!z4 ? f6 != 0.0f : f6 != 1.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - this.C0;
                if (j < 0 || j > 17) {
                    j = 17;
                }
                this.C0 = currentTimeMillis;
                boolean z5 = this.A0;
                float f7 = this.B0;
                if (z5) {
                    float f8 = (j / 150.0f) + f7;
                    this.B0 = f8;
                    if (f8 > 1.0f) {
                        this.B0 = 1.0f;
                    }
                } else {
                    float f9 = f7 - (j / 150.0f);
                    this.B0 = f9;
                    if (f9 < 0.0f) {
                        this.B0 = 0.0f;
                    }
                }
                invalidate();
            }
            pt3 pt3Var = this.u0;
            if (pt3Var != null && !TextUtils.isEmpty(pt3Var.i) && (this.A0 || this.B0 != 0.0f)) {
                pt3 pt3Var2 = this.v0;
                pt3 pt3Var3 = this.u0;
                if (pt3Var2 == null) {
                    pt3Var3.O = 0.0f;
                    pt3Var3.invalidateSelf();
                } else if (this.v0.c() + pt3Var3.c() < getMeasuredWidth()) {
                    canvas2.save();
                    canvas2.translate(this.u0.c() + (this.v0.c() - getMeasuredWidth()), 0.0f);
                    this.v0.C = (int) (Color.alpha(this.y0) * this.B0);
                    this.v0.draw(canvas2);
                    canvas2.restore();
                    pt3 pt3Var4 = this.u0;
                    pt3Var4.O = 0.0f;
                    pt3Var4.invalidateSelf();
                } else {
                    canvas2.save();
                    canvas2.translate(this.e0, 0.0f);
                    this.v0.C = (int) (Color.alpha(this.y0) * this.B0);
                    this.v0.draw(canvas2);
                    canvas2.restore();
                    pt3 pt3Var5 = this.u0;
                    pt3Var5.O = (this.v0.c() + hl.L(2.0f)) - this.e0;
                    pt3Var5.invalidateSelf();
                }
                this.u0.C = (int) (Color.alpha(this.y0) * this.B0);
                Shader shader = this.u0.a.getShader();
                LinearGradient linearGradient = this.m1;
                if (linearGradient != null) {
                    this.u0.a.setShader(linearGradient);
                }
                this.u0.draw(canvas2);
                if (this.m1 != null) {
                    this.u0.a.setShader(shader);
                }
            } else if (this.p0 != null && (this.A0 || this.B0 != 0.0f)) {
                int color = getPaint().getColor();
                canvas2.save();
                float lineLeft = this.p0.getLineLeft(0);
                float lineWidth = this.p0.getLineWidth(0);
                int i5 = lineLeft != 0.0f ? (int) (0.0f - lineLeft) : 0;
                if (this.G0 && ob6.a0) {
                    float scrollX = getScrollX() + i5 + (getMeasuredWidth() - lineWidth);
                    this.q0 = scrollX;
                    canvas2.translate(scrollX, (this.M0 - this.p0.getHeight()) - hl.L(7.0f));
                } else {
                    float scrollX2 = getScrollX() + i5 + this.l1;
                    this.q0 = scrollX2;
                    canvas2.translate(scrollX2, (this.M0 - this.p0.getHeight()) - hl.M(7.0f));
                }
                if (this.T0) {
                    float f10 = 1.0f - (this.X0 * 0.3f);
                    if (this.G0 && ob6.a0) {
                        float f11 = lineWidth + lineLeft;
                        canvas2.translate(f11 - (f11 * f10), 0.0f);
                    } else if (lineLeft != 0.0f) {
                        canvas2.translate((1.0f - f10) * lineLeft, 0.0f);
                    }
                    canvas2.scale(f10, f10);
                    canvas2.translate(0.0f, (-hl.L(22.0f)) * this.X0);
                    getPaint().setColor(vm2.f(this.X0, this.y0, this.z0));
                } else {
                    getPaint().setColor(this.y0);
                    getPaint().setAlpha((int) ((Color.alpha(this.y0) / 255.0f) * this.B0 * 255.0f));
                }
                Shader shader2 = getPaint().getShader();
                if (this.m1 != null && !this.T0) {
                    getPaint().setShader(this.m1);
                }
                geb gebVar = this.d0;
                if (gebVar == null || !gebVar.e) {
                    f = 150.0f;
                    f2 = 2.0f;
                    c cVar = this.t0;
                    if (cVar != null) {
                        cVar.a(canvas2, new wd3(this, canvas2, (byte) 25));
                    } else {
                        this.p0.draw(canvas2);
                    }
                } else {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    geb gebVar2 = this.d0;
                    TextPaint paint = getPaint();
                    EditTextBoldCursor editTextBoldCursor = gebVar2.a;
                    if (gebVar2.e) {
                        float f12 = gebVar2.h;
                        boolean z6 = gebVar2.f;
                        float f13 = gebVar2.i;
                        if (!z6) {
                            f13 = 1.0f - f13;
                        }
                        float f14 = f12 * f13;
                        int alpha = paint.getAlpha();
                        if (gebVar2.d != null) {
                            canvas2.save();
                            canvas2.translate(f14, 0.0f);
                            gebVar2.d.draw(canvas2);
                            canvas2.restore();
                        }
                        if (gebVar2.b != null) {
                            boolean z7 = gebVar2.f;
                            f = 150.0f;
                            float f15 = gebVar2.i;
                            if (z7) {
                                f15 = 1.0f - f15;
                            }
                            canvas2.save();
                            paint.setAlpha((int) (alpha * f15));
                            canvas2.translate(f14, 0.0f);
                            if (gebVar2.g) {
                                float f16 = (f15 * 0.1f) + 0.9f;
                                canvas2.scale(f16, f16, f14, editTextBoldCursor.getMeasuredHeight() / 2.0f);
                            }
                            gebVar2.b.draw(canvas2);
                            canvas2.restore();
                            paint.setAlpha(alpha);
                        } else {
                            f = 150.0f;
                        }
                        if (gebVar2.c != null) {
                            boolean z8 = gebVar2.f;
                            float f17 = gebVar2.i;
                            if (!z8) {
                                f17 = 1.0f - f17;
                            }
                            canvas2.save();
                            float f18 = alpha;
                            f2 = 2.0f;
                            boolean z9 = gebVar2.f;
                            float f19 = gebVar2.i;
                            if (!z9) {
                                f19 = 1.0f - f19;
                            }
                            paint.setAlpha((int) (f18 * f19));
                            canvas2.translate(f14, 0.0f);
                            if (gebVar2.g) {
                                float f20 = (f17 * 0.1f) + 0.9f;
                                canvas2.scale(f20, f20, f14, editTextBoldCursor.getMeasuredHeight() / 2.0f);
                            }
                            gebVar2.c.draw(canvas2);
                            canvas2.restore();
                            paint.setAlpha(alpha);
                            canvas2.restore();
                        }
                    } else {
                        f = 150.0f;
                    }
                    f2 = 2.0f;
                    canvas2.restore();
                }
                if (this.m1 != null) {
                    getPaint().setShader(shader2);
                }
                getPaint().setColor(color);
                canvas2.restore();
                if (this.A1) {
                    canvas2.saveLayerAlpha((getPaddingLeft() + getScrollX()) - this.E1, 0.0f, ((getWidth() + getScrollX()) - getPaddingRight()) + this.E1, getHeight(), jn7.d4, 31);
                }
                int extendedPaddingTop = getExtendedPaddingTop();
                this.m0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                field2 = H1;
                if (field2 == null) {
                    this.m0 = field2.getInt(this);
                    H1.set(this, 0);
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
                field = H1;
                if (field != null && (i4 = this.m0) != Integer.MAX_VALUE) {
                    try {
                        field.set(this, Integer.valueOf(i4));
                    } catch (Exception unused) {
                        boolean z10 = f11.a;
                    }
                }
                canvas2.restore();
                qt3Var = this.f1;
                GradientDrawable gradientDrawable = this.c0;
                Rect rect = this.o0;
                if (qt3Var != null) {
                    try {
                        Field field3 = G1;
                        if (field3 == null || (obj = this.b0) == null) {
                            z = this.H0;
                            this.H0 = false;
                        } else {
                            z = (SystemClock.uptimeMillis() - field3.getLong(obj)) % 1000 < 500 && isFocused();
                        }
                        if (this.D0 && z) {
                            canvas2.save();
                            if (J1 != null) {
                                if ((getGravity() & jn7.w1) != 48) {
                                    totalPaddingTop = ((Integer) J1.invoke(this, Boolean.TRUE)).intValue();
                                    canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                                    Layout layout = getLayout();
                                    int lineForOffset = layout.getLineForOffset(getSelectionStart());
                                    int lineCount = layout.getLineCount();
                                    y();
                                    Rect bounds = gradientDrawable.getBounds();
                                    rect.left = bounds.left;
                                    rect.right = bounds.left + hl.L(this.F0);
                                    i = bounds.bottom;
                                    rect.bottom = i;
                                    rect.top = bounds.top;
                                    f3 = this.n0;
                                    if (f3 != 0.0f && lineForOffset < lineCount - 1) {
                                        rect.bottom = (int) (i - f3);
                                    }
                                    int centerY = rect.centerY();
                                    int i6 = this.j0;
                                    int i7 = centerY - (i6 / 2);
                                    rect.top = i7;
                                    rect.bottom = i7 + i6;
                                    gradientDrawable.setBounds(rect);
                                    x(canvas2, rect);
                                    n(canvas2, gradientDrawable);
                                    canvas2.restore();
                                }
                                totalPaddingTop = 0;
                                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                                Layout layout2 = getLayout();
                                int lineForOffset2 = layout2.getLineForOffset(getSelectionStart());
                                int lineCount2 = layout2.getLineCount();
                                y();
                                Rect bounds2 = gradientDrawable.getBounds();
                                rect.left = bounds2.left;
                                rect.right = bounds2.left + hl.L(this.F0);
                                i = bounds2.bottom;
                                rect.bottom = i;
                                rect.top = bounds2.top;
                                f3 = this.n0;
                                if (f3 != 0.0f) {
                                    rect.bottom = (int) (i - f3);
                                }
                                int centerY2 = rect.centerY();
                                int i62 = this.j0;
                                int i72 = centerY2 - (i62 / 2);
                                rect.top = i72;
                                rect.bottom = i72 + i62;
                                gradientDrawable.setBounds(rect);
                                x(canvas2, rect);
                                n(canvas2, gradientDrawable);
                                canvas2.restore();
                            } else {
                                if ((getGravity() & jn7.w1) != 48) {
                                    totalPaddingTop = getTotalPaddingTop() - getExtendedPaddingTop();
                                    canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                                    Layout layout22 = getLayout();
                                    int lineForOffset22 = layout22.getLineForOffset(getSelectionStart());
                                    int lineCount22 = layout22.getLineCount();
                                    y();
                                    Rect bounds22 = gradientDrawable.getBounds();
                                    rect.left = bounds22.left;
                                    rect.right = bounds22.left + hl.L(this.F0);
                                    i = bounds22.bottom;
                                    rect.bottom = i;
                                    rect.top = bounds22.top;
                                    f3 = this.n0;
                                    if (f3 != 0.0f) {
                                    }
                                    int centerY22 = rect.centerY();
                                    int i622 = this.j0;
                                    int i722 = centerY22 - (i622 / 2);
                                    rect.top = i722;
                                    rect.bottom = i722 + i622;
                                    gradientDrawable.setBounds(rect);
                                    x(canvas2, rect);
                                    n(canvas2, gradientDrawable);
                                    canvas2.restore();
                                }
                                totalPaddingTop = 0;
                                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                                Layout layout222 = getLayout();
                                int lineForOffset222 = layout222.getLineForOffset(getSelectionStart());
                                int lineCount222 = layout222.getLineCount();
                                y();
                                Rect bounds222 = gradientDrawable.getBounds();
                                rect.left = bounds222.left;
                                rect.right = bounds222.left + hl.L(this.F0);
                                i = bounds222.bottom;
                                rect.bottom = i;
                                rect.top = bounds222.top;
                                f3 = this.n0;
                                if (f3 != 0.0f) {
                                }
                                int centerY222 = rect.centerY();
                                int i6222 = this.j0;
                                int i7222 = centerY222 - (i6222 / 2);
                                rect.top = i7222;
                                rect.bottom = i7222 + i6222;
                                gradientDrawable.setBounds(rect);
                                x(canvas2, rect);
                                n(canvas2, gradientDrawable);
                                canvas2.restore();
                            }
                        }
                    } catch (Throwable unused2) {
                        boolean z11 = f11.a;
                    }
                } else if (this.H0 && this.D0) {
                    try {
                        canvas2.save();
                        if (J1 != null) {
                            if ((getGravity() & jn7.w1) != 48) {
                                totalPaddingTop2 = ((Integer) J1.invoke(this, Boolean.TRUE)).intValue();
                                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                                Layout layout3 = getLayout();
                                int lineForOffset3 = layout3.getLineForOffset(getSelectionStart());
                                int lineCount3 = layout3.getLineCount();
                                y();
                                Rect bounds3 = gradientDrawable.getBounds();
                                rect.left = bounds3.left;
                                rect.right = bounds3.left + hl.L(this.F0);
                                i3 = bounds3.bottom;
                                rect.bottom = i3;
                                rect.top = bounds3.top;
                                f5 = this.n0;
                                if (f5 != 0.0f && lineForOffset3 < lineCount3 - 1) {
                                    rect.bottom = (int) (i3 - f5);
                                }
                                int centerY3 = rect.centerY();
                                int i8 = this.j0;
                                int i9 = centerY3 - (i8 / 2);
                                rect.top = i9;
                                rect.bottom = i9 + i8;
                                gradientDrawable.setBounds(rect);
                                x(canvas2, rect);
                                n(canvas2, gradientDrawable);
                                canvas2.restore();
                                this.H0 = false;
                            }
                            totalPaddingTop2 = 0;
                            canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                            Layout layout32 = getLayout();
                            int lineForOffset32 = layout32.getLineForOffset(getSelectionStart());
                            int lineCount32 = layout32.getLineCount();
                            y();
                            Rect bounds32 = gradientDrawable.getBounds();
                            rect.left = bounds32.left;
                            rect.right = bounds32.left + hl.L(this.F0);
                            i3 = bounds32.bottom;
                            rect.bottom = i3;
                            rect.top = bounds32.top;
                            f5 = this.n0;
                            if (f5 != 0.0f) {
                                rect.bottom = (int) (i3 - f5);
                            }
                            int centerY32 = rect.centerY();
                            int i82 = this.j0;
                            int i92 = centerY32 - (i82 / 2);
                            rect.top = i92;
                            rect.bottom = i92 + i82;
                            gradientDrawable.setBounds(rect);
                            x(canvas2, rect);
                            n(canvas2, gradientDrawable);
                            canvas2.restore();
                            this.H0 = false;
                        } else {
                            if ((getGravity() & jn7.w1) != 48) {
                                totalPaddingTop2 = getTotalPaddingTop() - getExtendedPaddingTop();
                                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                                Layout layout322 = getLayout();
                                int lineForOffset322 = layout322.getLineForOffset(getSelectionStart());
                                int lineCount322 = layout322.getLineCount();
                                y();
                                Rect bounds322 = gradientDrawable.getBounds();
                                rect.left = bounds322.left;
                                rect.right = bounds322.left + hl.L(this.F0);
                                i3 = bounds322.bottom;
                                rect.bottom = i3;
                                rect.top = bounds322.top;
                                f5 = this.n0;
                                if (f5 != 0.0f) {
                                }
                                int centerY322 = rect.centerY();
                                int i822 = this.j0;
                                int i922 = centerY322 - (i822 / 2);
                                rect.top = i922;
                                rect.bottom = i922 + i822;
                                gradientDrawable.setBounds(rect);
                                x(canvas2, rect);
                                n(canvas2, gradientDrawable);
                                canvas2.restore();
                                this.H0 = false;
                            }
                            totalPaddingTop2 = 0;
                            canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                            Layout layout3222 = getLayout();
                            int lineForOffset3222 = layout3222.getLineForOffset(getSelectionStart());
                            int lineCount3222 = layout3222.getLineCount();
                            y();
                            Rect bounds3222 = gradientDrawable.getBounds();
                            rect.left = bounds3222.left;
                            rect.right = bounds3222.left + hl.L(this.F0);
                            i3 = bounds3222.bottom;
                            rect.bottom = i3;
                            rect.top = bounds3222.top;
                            f5 = this.n0;
                            if (f5 != 0.0f) {
                            }
                            int centerY3222 = rect.centerY();
                            int i8222 = this.j0;
                            int i9222 = centerY3222 - (i8222 / 2);
                            rect.top = i9222;
                            rect.bottom = i9222 + i8222;
                            gradientDrawable.setBounds(rect);
                            x(canvas2, rect);
                            n(canvas2, gradientDrawable);
                            canvas2.restore();
                            this.H0 = false;
                        }
                    } catch (Throwable unused3) {
                        boolean z12 = f11.a;
                    }
                }
                if (this.I0 && this.J0 != 0) {
                    int L = hl.L(1.0f);
                    z2 = this.N0;
                    isEmpty = TextUtils.isEmpty(this.x0);
                    Paint paint2 = this.g0;
                    if (isEmpty) {
                        paint2.setColor(this.L0);
                        L = hl.L(f2);
                        this.N0 = false;
                    } else if (isFocused()) {
                        this.N0 = true;
                        z3 = true;
                        if (z3 != z2) {
                            this.P0 = SystemClock.elapsedRealtime();
                            this.Q0 = this.O0;
                        }
                        elapsedRealtime = (SystemClock.elapsedRealtime() - this.P0) / f;
                        if (elapsedRealtime >= 1.0f) {
                            boolean z13 = this.N0;
                            float f21 = this.O0;
                            if (z13) {
                                int measuredHeight = this.s0 ? getMeasuredHeight() - hl.L(f2) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() == null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), hl.L(f2)) + getScrollY() + ((int) this.M0);
                                i2 = this.k1;
                                if (i2 < 0) {
                                }
                                int i10 = i2;
                                int max = Math.max(i10, getMeasuredWidth() - i10) << 1;
                                if (this.O0 < 1.0f) {
                                }
                                f4 = this.O0;
                                if (f4 > 0.0f) {
                                }
                            } else {
                                int measuredHeight2 = this.s0 ? getMeasuredHeight() - hl.L(f2) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() == null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), hl.L(f2)) + getScrollY() + ((int) this.M0);
                                i2 = this.k1;
                                if (i2 < 0) {
                                    i2 = getMeasuredWidth() / 2;
                                }
                                int i102 = i2;
                                int max2 = Math.max(i102, getMeasuredWidth() - i102) << 1;
                                if (this.O0 < 1.0f) {
                                    canvas2.drawRect(getScrollX(), measuredHeight2 - L, getMeasuredWidth() + getScrollX(), measuredHeight2, this.g0);
                                }
                                f4 = this.O0;
                                if (f4 > 0.0f) {
                                    float interpolation = k43.j.getInterpolation(f4);
                                    if (this.N0) {
                                        this.R0 = max2 * interpolation;
                                        interpolation = 1.0f;
                                    }
                                    int L2 = (int) (interpolation * hl.L(f2));
                                    float f22 = i102;
                                    canvas2 = canvas;
                                    canvas2.drawRect(getScrollX() + Math.max(0.0f, f22 - (this.R0 / f2)), measuredHeight2 - L2, getScrollX() + Math.min((this.R0 / f2) + f22, getMeasuredWidth()), measuredHeight2, this.h0);
                                } else {
                                    canvas2 = canvas;
                                }
                            }
                        }
                        this.O0 = hl.R1(this.Q0, this.N0 ? 1.0f : 0.0f, Math.max(0.0f, Math.min(1.0f, elapsedRealtime)));
                        if (elapsedRealtime < 1.0f) {
                            invalidate();
                        }
                        int measuredHeight22 = this.s0 ? getMeasuredHeight() - hl.L(f2) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() == null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), hl.L(f2)) + getScrollY() + ((int) this.M0);
                        i2 = this.k1;
                        if (i2 < 0) {
                        }
                        int i1022 = i2;
                        int max22 = Math.max(i1022, getMeasuredWidth() - i1022) << 1;
                        if (this.O0 < 1.0f) {
                        }
                        f4 = this.O0;
                        if (f4 > 0.0f) {
                        }
                    } else {
                        paint2.setColor(this.J0);
                        this.N0 = false;
                    }
                    z3 = false;
                    if (z3 != z2) {
                    }
                    elapsedRealtime = (SystemClock.elapsedRealtime() - this.P0) / f;
                    if (elapsedRealtime >= 1.0f) {
                    }
                    this.O0 = hl.R1(this.Q0, this.N0 ? 1.0f : 0.0f, Math.max(0.0f, Math.min(1.0f, elapsedRealtime)));
                    if (elapsedRealtime < 1.0f) {
                    }
                    int measuredHeight222 = this.s0 ? getMeasuredHeight() - hl.L(f2) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() == null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), hl.L(f2)) + getScrollY() + ((int) this.M0);
                    i2 = this.k1;
                    if (i2 < 0) {
                    }
                    int i10222 = i2;
                    int max222 = Math.max(i10222, getMeasuredWidth() - i10222) << 1;
                    if (this.O0 < 1.0f) {
                    }
                    f4 = this.O0;
                    if (f4 > 0.0f) {
                    }
                }
                if (this.A1) {
                    return;
                }
                canvas2.save();
                canvas2.translate(getScrollX(), 0.0f);
                this.B1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.D1.reset();
                this.C1.setLocalMatrix(this.D1);
                canvas2.drawRect(getPaddingLeft() - this.E1, 0.0f, getPaddingLeft(), getHeight(), this.B1);
                this.D1.reset();
                this.D1.postScale(-1.0f, 1.0f, this.E1 / f2, 0.0f);
                this.D1.postTranslate(getWidth() - getPaddingRight(), 0.0f);
                this.C1.setLocalMatrix(this.D1);
                canvas.drawRect(getWidth() - getPaddingRight(), 0.0f, (getWidth() - getPaddingRight()) + this.E1, getHeight(), this.B1);
                canvas.restore();
                canvas.restore();
                return;
            }
        } else {
            canvas2 = canvas;
        }
        f = 150.0f;
        f2 = 2.0f;
        if (this.A1) {
        }
        int extendedPaddingTop2 = getExtendedPaddingTop();
        this.m0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        field2 = H1;
        if (field2 == null) {
        }
        this.k0 = 1;
        this.l0 = 1;
        canvas2.save();
        canvas2.translate(0.0f, extendedPaddingTop2);
        this.e1 = true;
        super.onDraw(canvas);
        this.e1 = false;
        field = H1;
        if (field != null) {
            field.set(this, Integer.valueOf(i4));
        }
        canvas2.restore();
        qt3Var = this.f1;
        GradientDrawable gradientDrawable2 = this.c0;
        Rect rect2 = this.o0;
        if (qt3Var != null) {
        }
        if (this.I0) {
            int L3 = hl.L(1.0f);
            z2 = this.N0;
            isEmpty = TextUtils.isEmpty(this.x0);
            Paint paint22 = this.g0;
            if (isEmpty) {
            }
            z3 = false;
            if (z3 != z2) {
            }
            elapsedRealtime = (SystemClock.elapsedRealtime() - this.P0) / f;
            if (elapsedRealtime >= 1.0f) {
            }
            this.O0 = hl.R1(this.Q0, this.N0 ? 1.0f : 0.0f, Math.max(0.0f, Math.min(1.0f, elapsedRealtime)));
            if (elapsedRealtime < 1.0f) {
            }
            int measuredHeight2222 = this.s0 ? getMeasuredHeight() - hl.L(f2) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() == null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), hl.L(f2)) + getScrollY() + ((int) this.M0);
            i2 = this.k1;
            if (i2 < 0) {
            }
            int i102222 = i2;
            int max2222 = Math.max(i102222, getMeasuredWidth() - i102222) << 1;
            if (this.O0 < 1.0f) {
            }
            f4 = this.O0;
            if (f4 > 0.0f) {
            }
        }
        if (this.A1) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        try {
            super.onFocusChanged(z, i, rect);
        } catch (Exception e) {
            cc4.g(e, true);
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
                new v4(accessibilityNodeInfo).l(this.p0.getText());
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        pt3 pt3Var = this.u0;
        if (pt3Var != null) {
            pt3Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        pt3 pt3Var2 = this.v0;
        if (pt3Var2 != null) {
            pt3Var2.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        StaticLayout staticLayout = this.p0;
        if (staticLayout == null || this.u0 != null) {
            this.M0 = getMeasuredHeight() - hl.L(2.0f);
        } else {
            if (this.d1 != measuredHeight) {
                s(this.w0, false, staticLayout.getPaint());
            }
            if (this.r0) {
                this.M0 = ((((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - this.p0.getHeight()) / 2.0f) + (getPaddingTop() + getExtendedPaddingTop())) + this.p0.getHeight()) - hl.L(1.0f);
            } else {
                this.M0 = ((getMeasuredHeight() - this.p0.getHeight()) / 2.0f) + this.p0.getHeight() + hl.L(6.0f);
            }
        }
        this.d1 = measuredHeight;
    }

    @Override // android.widget.TextView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i != i3) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // cu3, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
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

    public final StaticLayout p(int i) {
        if (TextUtils.isEmpty(this.x0)) {
            return null;
        }
        return new StaticLayout(this.x0, this.i0, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override // android.view.View
    public final boolean postDelayed(Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT < 29 || runnable == null || j != 500 || !"android.widget.Editor$Blink".equals(runnable.getClass().getName()) || Looper.myLooper() != Looper.getMainLooper()) {
            return super.postDelayed(runnable, j);
        }
        jh2 d = jh2.d();
        jh2.c();
        d.h(runnable);
        ih2 e = d.e(2);
        r89 r89Var = e.d;
        if (r89Var == null) {
            r89Var = new r89(0, false);
            e.d = r89Var;
        }
        r89Var.add(runnable);
        return true;
    }

    public final void q() {
        invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (M1 != null) {
                    Object obj = this.b0;
                    if (obj == null) {
                        obj = F1.get(this);
                        this.b0 = obj;
                    }
                    if (obj != null) {
                        M1.invoke(obj, null);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void r(CharSequence charSequence, boolean z) {
        s(charSequence, z, getPaint());
    }

    @Override // android.view.View
    public final boolean removeCallbacks(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jh2.d().h(runnable);
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

    public final void s(CharSequence charSequence, boolean z, TextPaint textPaint) {
        TextPaint textPaint2;
        String charSequence2;
        String charSequence3;
        boolean z2;
        CharSequence charSequence4 = charSequence;
        pt3 pt3Var = this.u0;
        byte b = 1;
        if (pt3Var != null) {
            pt3Var.t(charSequence4, !ob6.a0, true);
            return;
        }
        if (charSequence4 == null) {
            charSequence4 = "";
        }
        CharSequence charSequence5 = charSequence4;
        boolean z3 = getMeasuredWidth() == 0 ? false : z;
        geb gebVar = this.d0;
        if (z3) {
            if (gebVar == null) {
                gebVar = new geb(this);
                this.d0 = gebVar;
            }
            geb gebVar2 = gebVar;
            StaticLayout staticLayout = this.p0;
            CharSequence charSequence6 = this.w0;
            if (staticLayout != null && !charSequence6.equals(charSequence5)) {
                ValueAnimator valueAnimator = gebVar2.j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (charSequence6.length() > charSequence5.length()) {
                    charSequence2 = charSequence6.toString();
                    charSequence3 = charSequence5.toString();
                    z2 = true;
                } else {
                    charSequence2 = charSequence5.toString();
                    charSequence3 = charSequence6.toString();
                    z2 = false;
                }
                int indexOf = charSequence2.indexOf(charSequence3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence2);
                    if (indexOf != 0) {
                        spannableStringBuilder2.setSpan(new fy2(b), 0, indexOf, 0);
                    }
                    if (charSequence3.length() + indexOf != charSequence2.length()) {
                        spannableStringBuilder2.setSpan(new fy2(b), charSequence3.length() + indexOf, charSequence2.length(), 0);
                    }
                    spannableStringBuilder.setSpan(new fy2(b), indexOf, charSequence3.length() + indexOf, 0);
                    int L = hl.L(400.0f);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    gebVar2.b = new StaticLayout(spannableStringBuilder, textPaint, L, alignment, 1.0f, 0.0f, false);
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder2, textPaint, hl.L(400.0f), alignment, 1.0f, 0.0f, false);
                    gebVar2.d = staticLayout2;
                    gebVar2.e = true;
                    gebVar2.f = z2;
                    gebVar2.h = indexOf == 0 ? 0.0f : -staticLayout2.getPrimaryHorizontal(indexOf);
                    gebVar2.c = null;
                    gebVar2.g = false;
                } else {
                    int L2 = hl.L(400.0f);
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    gebVar2.b = new StaticLayout(charSequence5, textPaint, L2, alignment2, 1.0f, 0.0f, false);
                    gebVar2.c = new StaticLayout(charSequence6, textPaint, hl.L(400.0f), alignment2, 1.0f, 0.0f, false);
                    gebVar2.d = null;
                    gebVar2.e = true;
                    gebVar2.g = true;
                    gebVar2.h = 0.0f;
                }
                gebVar2.i = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                gebVar2.j = ofFloat;
                ofFloat.addUpdateListener(new ija(gebVar2, (byte) 21));
                gebVar2.j.addListener(new po9((Object) gebVar2, (byte) 29));
                gebVar2.j.setDuration(150L);
                gebVar2.j.setInterpolator(k43.f);
                gebVar2.j.start();
            }
        } else if (gebVar != null) {
            ValueAnimator valueAnimator2 = gebVar.j;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            gebVar.e = false;
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
        this.p0 = new StaticLayout(charSequence5, textPaint2, hl.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public void setActiveLineColor(int i) {
        this.K0 = i;
        this.h0.setColor(i);
        invalidate();
    }

    public void setAllowDrawCursor(boolean z) {
        this.D0 = z;
        invalidate();
    }

    public void setBlurredBackgroundDrawableViewFactory(ll0 ll0Var) {
        this.t1 = ll0Var;
    }

    public void setCursorColor(int i) {
        this.i1 = i;
        qt3 qt3Var = this.f1;
        if (qt3Var != null) {
            qt3Var.getPaint().setColor(i);
        }
        GradientDrawable gradientDrawable = this.c0;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i);
        }
        invalidate();
    }

    public void setCursorSize(int i) {
        this.j0 = i;
    }

    public void setCursorWidth(float f) {
        this.F0 = f;
    }

    public void setEllipsizeByGradient(boolean z) {
        this.A1 = z;
        if (z) {
            this.E1 = hl.L(12.0f);
            this.B1 = new Paint(1);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.E1, 0.0f, new int[]{-1, 16777215}, new float[]{0.4f, 1.0f}, Shader.TileMode.CLAMP);
            this.C1 = linearGradient;
            this.B1.setShader(linearGradient);
            this.D1 = new Matrix();
        }
    }

    public void setErrorLineColor(int i) {
        this.L0 = i;
        this.i0.setColor(i);
        invalidate();
    }

    public void setErrorText(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.x0)) {
            return;
        }
        this.x0 = charSequence;
        requestLayout();
    }

    public void setForceCursorEnd(boolean z) {
        this.E0 = z;
        invalidate();
    }

    public void setHandlesColor(int i) {
        if (Build.VERSION.SDK_INT < 29 || f3f.b() || this.y1 == i) {
            return;
        }
        this.y1 = i;
        this.x1 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        z(this.u1, false);
        z(this.v1, false);
        z(this.w1, false);
    }

    public void setHeaderAnimationProgress(float f) {
        this.X0 = f;
        invalidate();
    }

    public void setHeaderHintColor(int i) {
        this.z0 = i;
        invalidate();
    }

    public void setHintColor(int i) {
        this.y0 = i;
        pt3 pt3Var = this.u0;
        if (pt3Var != null) {
            pt3Var.u(i);
        }
        pt3 pt3Var2 = this.v0;
        if (pt3Var2 != null) {
            pt3Var2.u(this.y0);
        }
        invalidate();
    }

    public void setHintRightOffset(int i) {
        float f = i;
        if (this.e0 == f) {
            return;
        }
        this.e0 = f;
        invalidate();
    }

    public void setHintText(CharSequence charSequence) {
        s(charSequence, false, getPaint());
    }

    public void setLineColor(int i) {
        this.J0 = i;
        invalidate();
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.n0 = f;
    }

    public void setNextSetTextAnimated(boolean z) {
        this.S0 = z;
    }

    public void setOnPremiumMenuLockClickListener(Runnable runnable) {
        this.z1 = runnable;
    }

    @Override // android.widget.EditText
    public final void setSelection(int i, int i2) {
        try {
            super.setSelection(i, i2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public void setSupportRtlHint(boolean z) {
        this.G0 = z;
    }

    @Override // cu3, android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        l(this.S0);
        this.S0 = false;
    }

    @Override // android.widget.TextView
    public void setTextSelectHandle(Drawable drawable) {
        Drawable z = z(drawable, true);
        this.w1 = z;
        super.setTextSelectHandle(z);
    }

    @Override // android.widget.TextView
    public void setTextSelectHandleLeft(Drawable drawable) {
        Drawable z = z(drawable, true);
        this.u1 = z;
        super.setTextSelectHandleLeft(z);
    }

    @Override // android.widget.TextView
    public void setTextSelectHandleRight(Drawable drawable) {
        Drawable z = z(drawable, true);
        this.v1 = z;
        super.setTextSelectHandleRight(z);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        pt3 pt3Var = this.u0;
        if (pt3Var != null) {
            pt3Var.w(hl.L(f));
        }
        pt3 pt3Var2 = this.v0;
        if (pt3Var2 != null) {
            pt3Var2.w(hl.L(f));
        }
        super.setTextSize(i, f);
    }

    public void setTransformHintToHeader(boolean z) {
        if (this.T0 != z) {
            this.T0 = z;
            AnimatorSet animatorSet = this.W0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W0 = null;
            }
        }
    }

    public void setTransformHintToHeaderOnFocus(boolean z) {
        if (this.U0 == z) {
            return;
        }
        this.U0 = z;
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
        cl4 cl4Var = this.Z0;
        if (cl4Var != null) {
            cl4Var.finish();
        }
        m();
        Context context = getContext();
        View view = this.b1;
        if (view == null) {
            view = this.c1;
        }
        lm4 lm4Var = new lm4(context, view, getActionModeStyle(), getResourcesProvider(), this.t1);
        this.Y0 = lm4Var;
        lm4Var.j = this.z1;
        lm4Var.k = new yf0(this, (byte) 1);
        cl4 cl4Var2 = new cl4(getContext(), new rt3(this, callback), this, this.Y0);
        this.Z0 = cl4Var2;
        this.a1 = new es1(this, (byte) 2);
        callback.onCreateActionMode(cl4Var2, cl4Var2.c);
        cl4 cl4Var3 = this.Z0;
        o(cl4Var3, cl4Var3.c);
        this.Z0.invalidate();
        getViewTreeObserver().addOnPreDrawListener(this.a1);
        invalidate();
        return this.Z0;
    }

    public final void t(boolean z, boolean z2) {
        if (this.A0 == z) {
            return;
        }
        this.C0 = System.currentTimeMillis();
        this.A0 = z;
        if (!z2) {
            this.B0 = z ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void u(int i, int i2, int i3) {
        this.I0 = true;
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.search_dark);
        Rect rect = this.j1;
        drawable.getPadding(rect);
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
        this.J0 = i;
        this.K0 = i2;
        this.h0.setColor(i2);
        this.L0 = i3;
        this.i0.setColor(i3);
        invalidate();
    }

    public final void v(boolean z, boolean z2) {
        if (this.h1 != z) {
            this.h1 = z;
            int i = 0;
            ArrayList arrayList = this.g1;
            if (z) {
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    super.removeTextChangedListener((TextWatcher) obj);
                }
                return;
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                TextWatcher textWatcher = (TextWatcher) obj2;
                super.addTextChangedListener(textWatcher);
                if (z2) {
                    textWatcher.beforeTextChanged("", 0, length(), length());
                    textWatcher.onTextChanged(getText(), 0, length(), length());
                    textWatcher.afterTextChanged(getText());
                }
            }
        }
    }

    public final boolean w() {
        Editable text;
        if (!hasSelection() || getSelectionStart() < 0 || getSelectionEnd() < 0 || getSelectionStart() == getSelectionEnd() || (text = getText()) == null) {
            return false;
        }
        q19[] q19VarArr = (q19[]) text.getSpans(getSelectionStart(), getSelectionEnd(), q19.class);
        return q19VarArr == null || q19VarArr.length == 0;
    }

    public final void x(Canvas canvas, Rect rect) {
        if (!this.o1) {
            this.p1 = Float.NaN;
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (Float.isNaN(this.p1)) {
            this.p1 = rect.left;
            this.q1 = rect.top;
        } else {
            float exp = 1.0f - ((float) Math.exp((-Math.min(64L, uptimeMillis - this.r1)) / 60.0f));
            float f = this.p1;
            float f2 = rect.left;
            float A = qd4.A(f2, f, exp, f);
            this.p1 = A;
            float f3 = this.q1;
            this.q1 = qd4.A(rect.top, f3, exp, f3);
            if (Math.abs(f2 - A) >= 0.5f || Math.abs(rect.top - this.q1) >= 0.5f) {
                postInvalidateOnAnimation();
            } else {
                this.p1 = rect.left;
                this.q1 = rect.top;
            }
        }
        this.r1 = uptimeMillis;
        canvas.translate(this.p1 - rect.left, this.q1 - rect.top);
    }

    public final void y() {
        int i;
        Layout layout = getLayout();
        int length = this.E0 ? layout.getText().length() : getSelectionStart();
        int lineForOffset = layout.getLineForOffset(length);
        int lineTop = layout.getLineTop(lineForOffset);
        int lineTop2 = layout.getLineTop(lineForOffset + 1);
        float max = Math.max(0.5f, layout.getPrimaryHorizontal(length) - 0.5f);
        Rect rect = this.s1;
        if (rect == null) {
            rect = new Rect();
            this.s1 = rect;
        }
        GradientDrawable gradientDrawable = this.c0;
        if (gradientDrawable != null) {
            gradientDrawable.getPadding(rect);
            i = gradientDrawable.getIntrinsicWidth();
        } else {
            rect.setEmpty();
            i = 0;
        }
        int scrollX = getScrollX();
        float f = max - scrollX;
        int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        float f2 = width;
        int i2 = f >= f2 - 1.0f ? (width + scrollX) - (i - this.s1.right) : (Math.abs(f) <= 1.0f || (TextUtils.isEmpty(getText()) && ((float) (TLObject.FLAG_20 - scrollX)) <= f2 + 1.0f && max <= 1.0f)) ? scrollX - this.s1.left : ((int) max) - this.s1.left;
        int L = hl.L(this.F0);
        Rect rect2 = this.s1;
        gradientDrawable.setBounds(i2, lineTop - rect2.top, L + i2, lineTop2 + rect2.bottom);
        layout.getText();
    }

    public final Drawable z(Drawable drawable, boolean z) {
        if (drawable != null) {
            if (z) {
                drawable = drawable.mutate();
            }
            PorterDuffColorFilter porterDuffColorFilter = this.x1;
            if (porterDuffColorFilter != null) {
                drawable.setColorFilter(porterDuffColorFilter);
            }
        }
        return drawable;
    }

    @Override // android.widget.EditText
    public void setSelection(int i) {
        try {
            super.setSelection(i);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public void o(ActionMode actionMode, Menu menu) {
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        if (this.b1 == null && this.c1 == null) {
            return super.startActionMode(callback, i);
        }
        return startActionMode(callback);
    }
}
