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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class EditTextBoldCursor extends pt {
    public static Field E1;
    public static Field F1;
    public static Field G1;
    public static boolean H1;
    public static Method I1;
    public static Class J1;
    public static Field K1;
    public static Method L1;
    public boolean A0;
    public Paint A1;
    public float B0;
    public LinearGradient B1;
    public long C0;
    public Matrix C1;
    public boolean D0;
    public int D1;
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
    public org.telegram.ui.ActionBar.m4 Y0;
    public org.telegram.ui.ActionBar.y3 Z0;
    public fl a1;
    public Object b0;
    public View b1;
    public final GradientDrawable c0;
    public View c1;
    public sw0 d0;
    public int d1;
    public float e0;
    public boolean e1;
    public final a6 f0;
    public final ft f1;
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
    public boolean n1;
    public final Rect o0;
    public float o1;
    public StaticLayout p0;
    public float p1;
    public float q0;
    public long q1;
    public boolean r0;
    public Rect r1;
    public boolean s0;
    public dh.c s1;
    public bi.b t0;
    public Drawable t1;
    public et u0;
    public Drawable u1;
    public et v0;
    public Drawable v1;
    public CharSequence w0;
    public PorterDuffColorFilter w1;
    public CharSequence x0;
    public int x1;
    public int y0;
    public Runnable y1;
    public int z0;
    public boolean z1;

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
        this.K = new i(this, 1);
        this.L = new Rect();
        if (pt.a0 == null) {
            String str2 = Build.MANUFACTURER;
            pt.a0 = Boolean.valueOf((str2 == null || !(str2.toLowerCase().contains("honor") || str2.toLowerCase().contains("huawei") || str2.toLowerCase().contains("alps") || str2.toLowerCase().contains("vivo") || str2.toLowerCase().contains("oppo") || str2.toLowerCase().contains("oneplus") || str2.toLowerCase().contains("realme"))) && ((str = Build.MODEL) == null || !str.toLowerCase().contains("mediapad")));
        }
        this.Q = pt.a0.booleanValue();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f = new gf.c(this, arrayList, new ot(this));
        }
        this.f0 = new a6(this, 1);
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
        this.o1 = Float.NaN;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            setImportantForAutofill(2);
        }
        this.g0 = new Paint();
        this.h0 = new Paint();
        TextPaint textPaint = new TextPaint(1);
        this.i0 = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
        if (i7 >= 26) {
            setImportantForAutofill(2);
        }
        if (i7 >= 29) {
            ft ftVar = new ft(this);
            this.f1 = ftVar;
            ftVar.setShape(new RectShape());
            this.c0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
            setTextCursorDrawable(this.f1);
        }
        try {
            if (!H1 && G1 == null) {
                H1 = true;
                Field declaredField = View.class.getDeclaredField("mScrollY");
                G1 = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (Throwable unused) {
        }
        try {
            if (J1 == null) {
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                E1 = declaredField2;
                declaredField2.setAccessible(true);
                Class<?> cls = Class.forName("android.widget.Editor");
                J1 = cls;
                try {
                    Field declaredField3 = cls.getDeclaredField("mShowCursor");
                    F1 = declaredField3;
                    declaredField3.setAccessible(true);
                } catch (Exception unused2) {
                }
                try {
                    Method declaredMethod = J1.getDeclaredMethod("invalidateTextDisplayList", null);
                    L1 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused3) {
                }
                Method declaredMethod2 = TextView.class.getDeclaredMethod("getVerticalOffset", Boolean.TYPE);
                I1 = declaredMethod2;
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
                this.b0 = E1.get(this);
            } catch (Throwable unused4) {
            }
            try {
                if (K1 == null) {
                    Field declaredField4 = TextView.class.getDeclaredField("mCursorDrawableRes");
                    K1 = declaredField4;
                    declaredField4.setAccessible(true);
                }
                Field field = K1;
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
        int i7 = this.l0;
        if (i7 == 0) {
            return super.getExtendedPaddingBottom();
        }
        this.l0 = i7 - 1;
        int i10 = this.m0;
        if (i10 != Integer.MAX_VALUE) {
            return -i10;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getExtendedPaddingTop() {
        int i7 = this.k0;
        if (i7 == 0) {
            return super.getExtendedPaddingTop();
        }
        this.k0 = i7 - 1;
        return 0;
    }

    public int getHandlesColor() {
        return this.x1;
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
        return this.y1;
    }

    public org.telegram.ui.ActionBar.i6 getResourcesProvider() {
        return null;
    }

    @Override // android.widget.TextView
    public Drawable getTextCursorDrawable() {
        if (this.f1 != null) {
            return super.getTextCursorDrawable();
        }
        ft ftVar = new ft(this, new RectShape());
        ftVar.getPaint().setColor(0);
        return ftVar;
    }

    @Override // android.widget.TextView
    public Drawable getTextSelectHandle() {
        if (this.v1 == null) {
            this.v1 = z(super.getTextSelectHandle(), true);
        }
        return this.v1;
    }

    @Override // android.widget.TextView
    public Drawable getTextSelectHandleLeft() {
        if (this.t1 == null) {
            this.t1 = z(super.getTextSelectHandleLeft(), true);
        }
        return this.t1;
    }

    @Override // android.widget.TextView
    public Drawable getTextSelectHandleRight() {
        if (this.u1 == null) {
            this.u1 = z(super.getTextSelectHandleRight(), true);
        }
        return this.u1;
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
                this.W0.setInterpolator(lr.h);
                this.W0.start();
            } else {
                this.X0 = z11 ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    public final void m() {
        org.telegram.ui.ActionBar.m4 m4Var = this.Y0;
        if (m4Var != null) {
            m4Var.a.removeOnLayoutChangeListener(m4Var.l);
            org.telegram.ui.ActionBar.k4 k4Var = m4Var.b;
            if (!k4Var.F) {
                k4Var.G = false;
                k4Var.F = true;
                k4Var.x.cancel();
                k4Var.w.start();
                k4Var.D.setEmpty();
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

    @Override // org.telegram.ui.Components.pt, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.c1 = getRootView();
        if (Build.VERSION.SDK_INT < 29) {
            bg.k.d().b(this.f0, 2);
        }
    }

    @Override // org.telegram.ui.Components.pt, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c1 = null;
        if (Build.VERSION.SDK_INT < 29) {
            bg.k.d().g(this.f0);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|(4:147|(5:151|(1:266)|155|(2:157|(1:159))(2:263|(1:265))|160)|161|(2:182|(31:188|(1:190)(1:262)|191|(1:261)(1:195)|196|(3:198|(1:(1:259))(1:202)|203)(1:260)|204|(1:208)|209|(2:254|(1:256)(1:257))(4:213|(8:215|(1:217)(1:252)|218|(1:220)|221|(5:223|(1:225)(1:250)|226|(1:228)|229)(1:251)|230|(8:232|(1:234)(1:248)|235|(1:237)(1:247)|238|(1:240)|241|242))(1:253)|249|242)|243|(1:245)|246|6|(1:8)|9|10|11|(1:13)(1:145)|14|15|16|17|18|(2:22|23)|26|(5:110|111|(1:140)(2:115|(1:139)(1:119))|120|(2:123|(6:125|(4:127|128|(1:132)|133)|135|128|(2:130|132)|133)(6:136|(4:138|128|(0)|133)|135|128|(0)|133)))(2:28|(3:32|33|(6:35|(4:37|38|(1:42)|43)|45|38|(2:40|42)|43)(6:46|(4:48|38|(0)|43)|45|38|(0)|43)))|50|(17:54|(1:56)(2:100|(1:102)(1:103))|57|(1:59)|60|(4:93|(1:95)(1:99)|96|(1:98))|69|(1:71)(1:92)|72|(1:74)(1:91)|75|76|(1:78)|79|(1:81)|82|(4:84|(1:86)|(1:88)|89)(1:90))|104|(2:106|107)(1:109)))(6:169|(2:171|(1:173)(1:180))(1:181)|174|(1:176)|177|(1:179)))|5|6|(0)|9|10|11|(0)(0)|14|15|16|17|18|(3:20|22|23)|26|(0)(0)|50|(22:52|54|(0)(0)|57|(0)|60|(2:62|64)|93|(0)(0)|96|(0)|69|(0)(0)|72|(0)(0)|75|76|(0)|79|(0)|82|(0)(0))|104|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03a6, code lost:
    
        r2 = org.telegram.messenger.s2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0390, code lost:
    
        r4 = org.telegram.messenger.s2.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x046c A[Catch: all -> 0x0490, TryCatch #0 {all -> 0x0490, blocks: (B:111:0x03c7, B:113:0x03cb, B:115:0x03cf, B:117:0x03e1, B:120:0x03ef, B:123:0x03f5, B:125:0x03fc, B:127:0x0404, B:128:0x042a, B:130:0x046c, B:132:0x046f, B:133:0x0474, B:136:0x0417, B:138:0x041f, B:140:0x03eb), top: B:110:0x03c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0379 A[Catch: Exception -> 0x0390, TryCatch #1 {Exception -> 0x0390, blocks: (B:11:0x0375, B:13:0x0379, B:145:0x0389), top: B:10:0x0375 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0389 A[Catch: Exception -> 0x0390, TRY_LEAVE, TryCatch #1 {Exception -> 0x0390, blocks: (B:11:0x0375, B:13:0x0379, B:145:0x0389), top: B:10:0x0375 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0513 A[Catch: all -> 0x0538, TryCatch #2 {all -> 0x0538, blocks: (B:33:0x049c, B:35:0x04a3, B:37:0x04ab, B:38:0x04d1, B:40:0x0513, B:42:0x0516, B:43:0x051b, B:46:0x04be, B:48:0x04c6), top: B:32:0x049c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05a4  */
    @Override // org.telegram.ui.Components.pt, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float f10;
        float f11;
        Field field;
        ft ftVar;
        boolean z10;
        int totalPaddingTop;
        int i7;
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
                long j3 = currentTimeMillis - this.C0;
                if (j3 < 0 || j3 > 17) {
                    j3 = 17;
                }
                this.C0 = currentTimeMillis;
                if (this.A0) {
                    float f15 = (j3 / 150.0f) + this.B0;
                    this.B0 = f15;
                    if (f15 > 1.0f) {
                        this.B0 = 1.0f;
                    }
                } else {
                    float f16 = this.B0 - (j3 / 150.0f);
                    this.B0 = f16;
                    if (f16 < 0.0f) {
                        this.B0 = 0.0f;
                    }
                }
                invalidate();
            }
            et etVar = this.u0;
            if (etVar != null && !TextUtils.isEmpty(etVar.i) && (this.A0 || this.B0 != 0.0f)) {
                if (this.v0 == null) {
                    et etVar2 = this.u0;
                    etVar2.O = 0.0f;
                    etVar2.invalidateSelf();
                } else if (this.v0.c() + this.u0.c() < getMeasuredWidth()) {
                    canvas2.save();
                    canvas2.translate(this.u0.c() + (this.v0.c() - getMeasuredWidth()), 0.0f);
                    this.v0.C = (int) (Color.alpha(this.y0) * this.B0);
                    this.v0.draw(canvas2);
                    canvas2.restore();
                    et etVar3 = this.u0;
                    etVar3.O = 0.0f;
                    etVar3.invalidateSelf();
                } else {
                    canvas2.save();
                    canvas2.translate(this.e0, 0.0f);
                    this.v0.C = (int) (Color.alpha(this.y0) * this.B0);
                    this.v0.draw(canvas2);
                    canvas2.restore();
                    et etVar4 = this.u0;
                    etVar4.O = (this.v0.c() + org.telegram.messenger.g0.L(2.0f)) - this.e0;
                    etVar4.invalidateSelf();
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
                int i13 = lineLeft != 0.0f ? (int) (0 - lineLeft) : 0;
                if (this.G0 && org.telegram.messenger.gd.a0) {
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
                    if (this.G0 && org.telegram.messenger.gd.a0) {
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
                Shader shader2 = getPaint().getShader();
                if (this.m1 != null && !this.T0) {
                    getPaint().setShader(this.m1);
                }
                sw0 sw0Var = this.d0;
                if (sw0Var == null || !sw0Var.e) {
                    f10 = 2.0f;
                    f11 = 150.0f;
                    bi.b bVar = this.t0;
                    if (bVar != null) {
                        bVar.a(canvas2, new mg(27, this, canvas2));
                    } else {
                        this.p0.draw(canvas2);
                    }
                } else {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    sw0 sw0Var2 = this.d0;
                    TextPaint paint = getPaint();
                    EditTextBoldCursor editTextBoldCursor = sw0Var2.a;
                    if (sw0Var2.e) {
                        float f19 = sw0Var2.h * (sw0Var2.f ? sw0Var2.i : 1.0f - sw0Var2.i);
                        int alpha = paint.getAlpha();
                        if (sw0Var2.d != null) {
                            canvas2.save();
                            canvas2.translate(f19, 0.0f);
                            sw0Var2.d.draw(canvas2);
                            canvas2.restore();
                        }
                        if (sw0Var2.b != null) {
                            float f20 = sw0Var2.f ? 1.0f - sw0Var2.i : sw0Var2.i;
                            canvas2.save();
                            f10 = 2.0f;
                            paint.setAlpha((int) (alpha * f20));
                            canvas2.translate(f19, 0.0f);
                            if (sw0Var2.g) {
                                float f21 = (f20 * 0.1f) + 0.9f;
                                canvas2.scale(f21, f21, f19, editTextBoldCursor.getMeasuredHeight() / 2.0f);
                            }
                            sw0Var2.b.draw(canvas2);
                            canvas2.restore();
                            paint.setAlpha(alpha);
                        } else {
                            f10 = 2.0f;
                        }
                        if (sw0Var2.c != null) {
                            float f22 = sw0Var2.f ? sw0Var2.i : 1.0f - sw0Var2.i;
                            canvas2.save();
                            f11 = 150.0f;
                            paint.setAlpha((int) (alpha * (sw0Var2.f ? sw0Var2.i : 1.0f - sw0Var2.i)));
                            canvas2.translate(f19, 0.0f);
                            if (sw0Var2.g) {
                                float f23 = (f22 * 0.1f) + 0.9f;
                                canvas2.scale(f23, f23, f19, editTextBoldCursor.getMeasuredHeight() / f10);
                            }
                            sw0Var2.c.draw(canvas2);
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
                if (this.m1 != null) {
                    getPaint().setShader(shader2);
                }
                getPaint().setColor(color);
                canvas2.restore();
                if (this.z1) {
                    canvas2.saveLayerAlpha((getPaddingLeft() + getScrollX()) - this.D1, 0.0f, ((getWidth() + getScrollX()) - getPaddingRight()) + this.D1, getHeight(), org.telegram.messenger.ks.e4, 31);
                }
                int extendedPaddingTop = getExtendedPaddingTop();
                this.m0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                field2 = G1;
                if (field2 == null) {
                    this.m0 = field2.getInt(this);
                    G1.set(this, 0);
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
                field = G1;
                if (field != null && (i12 = this.m0) != Integer.MAX_VALUE) {
                    try {
                        field.set(this, Integer.valueOf(i12));
                    } catch (Exception unused) {
                        boolean z14 = org.telegram.messenger.s2.a;
                    }
                }
                canvas2.restore();
                ftVar = this.f1;
                GradientDrawable gradientDrawable = this.c0;
                Rect rect = this.o0;
                if (ftVar != null) {
                    try {
                        Field field3 = F1;
                        if (field3 == null || (obj = this.b0) == null) {
                            z10 = this.H0;
                            this.H0 = false;
                        } else {
                            z10 = (SystemClock.uptimeMillis() - field3.getLong(obj)) % 1000 < 500 && isFocused();
                        }
                        if (this.D0 && z10) {
                            canvas2.save();
                            if (I1 != null) {
                                if ((getGravity() & org.telegram.messenger.ks.x1) != 48) {
                                    totalPaddingTop = ((Integer) I1.invoke(this, Boolean.TRUE)).intValue();
                                    canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                                    Layout layout = getLayout();
                                    int lineForOffset = layout.getLineForOffset(getSelectionStart());
                                    int lineCount = layout.getLineCount();
                                    y();
                                    Rect bounds = gradientDrawable.getBounds();
                                    rect.left = bounds.left;
                                    rect.right = bounds.left + org.telegram.messenger.g0.L(this.F0);
                                    i7 = bounds.bottom;
                                    rect.bottom = i7;
                                    rect.top = bounds.top;
                                    f12 = this.n0;
                                    if (f12 != 0.0f && lineForOffset < lineCount - 1) {
                                        rect.bottom = (int) (i7 - f12);
                                    }
                                    int centerY = rect.centerY();
                                    int i14 = this.j0;
                                    int i15 = centerY - (i14 / 2);
                                    rect.top = i15;
                                    rect.bottom = i15 + i14;
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
                                rect.right = bounds2.left + org.telegram.messenger.g0.L(this.F0);
                                i7 = bounds2.bottom;
                                rect.bottom = i7;
                                rect.top = bounds2.top;
                                f12 = this.n0;
                                if (f12 != 0.0f) {
                                    rect.bottom = (int) (i7 - f12);
                                }
                                int centerY2 = rect.centerY();
                                int i142 = this.j0;
                                int i152 = centerY2 - (i142 / 2);
                                rect.top = i152;
                                rect.bottom = i152 + i142;
                                gradientDrawable.setBounds(rect);
                                x(canvas2, rect);
                                n(canvas2, gradientDrawable);
                                canvas2.restore();
                            } else {
                                if ((getGravity() & org.telegram.messenger.ks.x1) != 48) {
                                    totalPaddingTop = getTotalPaddingTop() - getExtendedPaddingTop();
                                    canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                                    Layout layout22 = getLayout();
                                    int lineForOffset22 = layout22.getLineForOffset(getSelectionStart());
                                    int lineCount22 = layout22.getLineCount();
                                    y();
                                    Rect bounds22 = gradientDrawable.getBounds();
                                    rect.left = bounds22.left;
                                    rect.right = bounds22.left + org.telegram.messenger.g0.L(this.F0);
                                    i7 = bounds22.bottom;
                                    rect.bottom = i7;
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
                                rect.right = bounds222.left + org.telegram.messenger.g0.L(this.F0);
                                i7 = bounds222.bottom;
                                rect.bottom = i7;
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
                                x(canvas2, rect);
                                n(canvas2, gradientDrawable);
                                canvas2.restore();
                            }
                        }
                    } catch (Throwable unused2) {
                        boolean z15 = org.telegram.messenger.s2.a;
                    }
                } else if (this.H0 && this.D0) {
                    try {
                        canvas2.save();
                        if (I1 != null) {
                            if ((getGravity() & org.telegram.messenger.ks.x1) != 48) {
                                totalPaddingTop2 = ((Integer) I1.invoke(this, Boolean.TRUE)).intValue();
                                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                                Layout layout3 = getLayout();
                                int lineForOffset3 = layout3.getLineForOffset(getSelectionStart());
                                int lineCount3 = layout3.getLineCount();
                                y();
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
                            x(canvas2, rect);
                            n(canvas2, gradientDrawable);
                            canvas2.restore();
                            this.H0 = false;
                        } else {
                            if ((getGravity() & org.telegram.messenger.ks.x1) != 48) {
                                totalPaddingTop2 = getTotalPaddingTop() - getExtendedPaddingTop();
                                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                                Layout layout322 = getLayout();
                                int lineForOffset322 = layout322.getLineForOffset(getSelectionStart());
                                int lineCount322 = layout322.getLineCount();
                                y();
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
                            x(canvas2, rect);
                            n(canvas2, gradientDrawable);
                            canvas2.restore();
                            this.H0 = false;
                        }
                    } catch (Throwable unused3) {
                        boolean z16 = org.telegram.messenger.s2.a;
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
                        float interpolation = lr.j.getInterpolation(f13);
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
                if (this.z1) {
                    return;
                }
                canvas2.save();
                canvas2.translate(getScrollX(), 0.0f);
                this.A1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.C1.reset();
                this.B1.setLocalMatrix(this.C1);
                canvas2.drawRect(getPaddingLeft() - this.D1, 0.0f, getPaddingLeft(), getHeight(), this.A1);
                this.C1.reset();
                this.C1.postScale(-1.0f, 1.0f, this.D1 / f10, 0.0f);
                this.C1.postTranslate(getWidth() - getPaddingRight(), 0.0f);
                this.B1.setLocalMatrix(this.C1);
                canvas.drawRect(getWidth() - getPaddingRight(), 0.0f, (getWidth() - getPaddingRight()) + this.D1, getHeight(), this.A1);
                canvas.restore();
                canvas.restore();
                return;
            }
        }
        f10 = 2.0f;
        f11 = 150.0f;
        if (this.z1) {
        }
        int extendedPaddingTop2 = getExtendedPaddingTop();
        this.m0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        field2 = G1;
        if (field2 == null) {
        }
        this.k0 = 1;
        this.l0 = 1;
        canvas2.save();
        canvas2.translate(0.0f, extendedPaddingTop2);
        this.e1 = true;
        super.onDraw(canvas);
        this.e1 = false;
        field = G1;
        if (field != null) {
            field.set(this, Integer.valueOf(i12));
        }
        canvas2.restore();
        ftVar = this.f1;
        GradientDrawable gradientDrawable2 = this.c0;
        Rect rect2 = this.o0;
        if (ftVar != null) {
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
        if (this.z1) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i7, Rect rect) {
        try {
            super.onFocusChanged(z10, i7, rect);
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
                new s0.c(accessibilityNodeInfo).l(this.p0.getText());
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        et etVar = this.u0;
        if (etVar != null) {
            etVar.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        et etVar2 = this.v0;
        if (etVar2 != null) {
            etVar2.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
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
    public void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        if (i7 != i11) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // org.telegram.ui.Components.pt, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
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

    public final StaticLayout p(int i7) {
        if (TextUtils.isEmpty(this.x0)) {
            return null;
        }
        return new StaticLayout(this.x0, this.i0, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override // android.view.View
    public final boolean postDelayed(Runnable runnable, long j3) {
        if (Build.VERSION.SDK_INT < 29 || runnable == null || j3 != 500 || !"android.widget.Editor$Blink".equals(runnable.getClass().getName()) || Looper.myLooper() != Looper.getMainLooper()) {
            return super.postDelayed(runnable, j3);
        }
        bg.k d = bg.k.d();
        d.getClass();
        bg.k.c();
        int max = Math.max(1, Math.min(2, 60));
        d.h(runnable);
        bg.j e10 = d.e(max);
        if (e10.d == null) {
            e10.d = new xe.b();
        }
        e10.d.add(runnable);
        return true;
    }

    public final void q() {
        invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (L1 != null) {
                    if (this.b0 == null) {
                        this.b0 = E1.get(this);
                    }
                    Object obj = this.b0;
                    if (obj != null) {
                        L1.invoke(obj, null);
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
            bg.k.d().h(runnable);
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
        et etVar = this.u0;
        if (etVar != null) {
            etVar.t(charSequence4, !org.telegram.messenger.gd.a0, true);
            return;
        }
        if (charSequence4 == null) {
            charSequence4 = "";
        }
        CharSequence charSequence5 = charSequence4;
        boolean z12 = false;
        if (getMeasuredWidth() == 0 ? false : z10) {
            if (this.d0 == null) {
                this.d0 = new sw0(this);
            }
            sw0 sw0Var = this.d0;
            StaticLayout staticLayout = this.p0;
            CharSequence charSequence6 = this.w0;
            sw0Var.getClass();
            if (staticLayout != null && !charSequence6.equals(charSequence5)) {
                ValueAnimator valueAnimator = sw0Var.j;
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
                        spannableStringBuilder2.setSpan(new sy(z12), 0, indexOf, 0);
                    }
                    if (charSequence3.length() + indexOf != charSequence2.length()) {
                        spannableStringBuilder2.setSpan(new sy(z12), charSequence3.length() + indexOf, charSequence2.length(), 0);
                    }
                    spannableStringBuilder.setSpan(new sy(z12), indexOf, charSequence3.length() + indexOf, 0);
                    int L = org.telegram.messenger.g0.L(400.0f);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    sw0Var.b = new StaticLayout(spannableStringBuilder, textPaint, L, alignment, 1.0f, 0.0f, false);
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder2, textPaint, org.telegram.messenger.g0.L(400.0f), alignment, 1.0f, 0.0f, false);
                    sw0Var.d = staticLayout2;
                    sw0Var.e = true;
                    sw0Var.f = z11;
                    sw0Var.h = indexOf == 0 ? 0.0f : -staticLayout2.getPrimaryHorizontal(indexOf);
                    sw0Var.c = null;
                    sw0Var.g = false;
                } else {
                    int L2 = org.telegram.messenger.g0.L(400.0f);
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    sw0Var.b = new StaticLayout(charSequence5, textPaint, L2, alignment2, 1.0f, 0.0f, false);
                    sw0Var.c = new StaticLayout(charSequence6, textPaint, org.telegram.messenger.g0.L(400.0f), alignment2, 1.0f, 0.0f, false);
                    sw0Var.d = null;
                    sw0Var.e = true;
                    sw0Var.g = true;
                    sw0Var.h = 0.0f;
                }
                sw0Var.i = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                sw0Var.j = ofFloat;
                ofFloat.addUpdateListener(new e60(sw0Var, 26));
                sw0Var.j.addListener(new q60(sw0Var, 27));
                sw0Var.j.setDuration(150L);
                sw0Var.j.setInterpolator(lr.f);
                sw0Var.j.start();
            }
        } else {
            sw0 sw0Var2 = this.d0;
            if (sw0Var2 != null) {
                ValueAnimator valueAnimator2 = sw0Var2.j;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                sw0Var2.e = false;
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

    public void setActiveLineColor(int i7) {
        this.K0 = i7;
        this.h0.setColor(i7);
        invalidate();
    }

    public void setAllowDrawCursor(boolean z10) {
        this.D0 = z10;
        invalidate();
    }

    public void setBlurredBackgroundDrawableViewFactory(dh.c cVar) {
        this.s1 = cVar;
    }

    public void setCursorColor(int i7) {
        this.i1 = i7;
        ft ftVar = this.f1;
        if (ftVar != null) {
            ftVar.getPaint().setColor(i7);
        }
        GradientDrawable gradientDrawable = this.c0;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i7);
        }
        invalidate();
    }

    public void setCursorSize(int i7) {
        this.j0 = i7;
    }

    public void setCursorWidth(float f10) {
        this.F0 = f10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.z1 = z10;
        if (z10) {
            this.D1 = org.telegram.messenger.g0.L(12.0f);
            this.A1 = new Paint(1);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.D1, 0.0f, new int[]{-1, 16777215}, new float[]{0.4f, 1.0f}, Shader.TileMode.CLAMP);
            this.B1 = linearGradient;
            this.A1.setShader(linearGradient);
            this.C1 = new Matrix();
        }
    }

    public void setErrorLineColor(int i7) {
        this.L0 = i7;
        this.i0.setColor(i7);
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

    public void setHandlesColor(int i7) {
        if (Build.VERSION.SDK_INT < 29 || org.telegram.messenger.c6.i() || this.x1 == i7) {
            return;
        }
        this.x1 = i7;
        this.w1 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        z(this.t1, false);
        z(this.u1, false);
        z(this.v1, false);
    }

    public void setHeaderAnimationProgress(float f10) {
        this.X0 = f10;
        invalidate();
    }

    public void setHeaderHintColor(int i7) {
        this.z0 = i7;
        invalidate();
    }

    public void setHintColor(int i7) {
        this.y0 = i7;
        et etVar = this.u0;
        if (etVar != null) {
            etVar.u(i7);
        }
        et etVar2 = this.v0;
        if (etVar2 != null) {
            etVar2.u(this.y0);
        }
        invalidate();
    }

    public void setHintRightOffset(int i7) {
        float f10 = i7;
        if (this.e0 == f10) {
            return;
        }
        this.e0 = f10;
        invalidate();
    }

    public void setHintText(CharSequence charSequence) {
        s(charSequence, false, getPaint());
    }

    public void setLineColor(int i7) {
        this.J0 = i7;
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
        this.y1 = runnable;
    }

    @Override // android.widget.EditText
    public final void setSelection(int i7, int i10) {
        try {
            super.setSelection(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void setSupportRtlHint(boolean z10) {
        this.G0 = z10;
    }

    @Override // org.telegram.ui.Components.pt, android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        l(this.S0);
        this.S0 = false;
    }

    @Override // android.widget.TextView
    public void setTextSelectHandle(Drawable drawable) {
        Drawable z10 = z(drawable, true);
        this.v1 = z10;
        super.setTextSelectHandle(z10);
    }

    @Override // android.widget.TextView
    public void setTextSelectHandleLeft(Drawable drawable) {
        Drawable z10 = z(drawable, true);
        this.t1 = z10;
        super.setTextSelectHandleLeft(z10);
    }

    @Override // android.widget.TextView
    public void setTextSelectHandleRight(Drawable drawable) {
        Drawable z10 = z(drawable, true);
        this.u1 = z10;
        super.setTextSelectHandleRight(z10);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i7, float f10) {
        et etVar = this.u0;
        if (etVar != null) {
            etVar.w(org.telegram.messenger.g0.L(f10));
        }
        et etVar2 = this.v0;
        if (etVar2 != null) {
            etVar2.w(org.telegram.messenger.g0.L(f10));
        }
        super.setTextSize(i7, f10);
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
        org.telegram.ui.ActionBar.y3 y3Var = this.Z0;
        if (y3Var != null) {
            y3Var.finish();
        }
        m();
        Context context = getContext();
        View view = this.b1;
        if (view == null) {
            view = this.c1;
        }
        org.telegram.ui.ActionBar.m4 m4Var = new org.telegram.ui.ActionBar.m4(context, view, getActionModeStyle(), getResourcesProvider(), this.s1);
        this.Y0 = m4Var;
        m4Var.j = this.y1;
        m4Var.k = new dt(this, 0);
        org.telegram.ui.ActionBar.y3 y3Var2 = new org.telegram.ui.ActionBar.y3(getContext(), new org.telegram.ui.Cells.h9(this, callback), this, this.Y0);
        this.Z0 = y3Var2;
        this.a1 = new fl(1, this);
        callback.onCreateActionMode(y3Var2, y3Var2.c);
        org.telegram.ui.ActionBar.y3 y3Var3 = this.Z0;
        o(y3Var3, y3Var3.c);
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

    public final void u(int i7, int i10, int i11) {
        this.I0 = true;
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.search_dark);
        Rect rect = this.j1;
        drawable.getPadding(rect);
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
        this.J0 = i7;
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
        int i7 = 0;
        if (z10) {
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
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
        gh0[] gh0VarArr = (gh0[]) text.getSpans(getSelectionStart(), getSelectionEnd(), gh0.class);
        return gh0VarArr == null || gh0VarArr.length == 0;
    }

    public final void x(Canvas canvas, Rect rect) {
        if (!this.n1) {
            this.o1 = Float.NaN;
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (Float.isNaN(this.o1)) {
            this.o1 = rect.left;
            this.p1 = rect.top;
        } else {
            float exp = 1.0f - ((float) Math.exp((-Math.min(64L, uptimeMillis - this.q1)) / 60.0f));
            float f10 = this.o1;
            float f11 = rect.left;
            float z10 = com.google.android.gms.internal.vision.e2.z(f11, f10, exp, f10);
            this.o1 = z10;
            float f12 = this.p1;
            this.p1 = com.google.android.gms.internal.vision.e2.z(rect.top, f12, exp, f12);
            if (Math.abs(f11 - z10) >= 0.5f || Math.abs(rect.top - this.p1) >= 0.5f) {
                postInvalidateOnAnimation();
            } else {
                this.o1 = rect.left;
                this.p1 = rect.top;
            }
        }
        this.q1 = uptimeMillis;
        canvas.translate(this.o1 - rect.left, this.p1 - rect.top);
    }

    public final void y() {
        int i7;
        Layout layout = getLayout();
        int length = this.E0 ? layout.getText().length() : getSelectionStart();
        int lineForOffset = layout.getLineForOffset(length);
        int lineTop = layout.getLineTop(lineForOffset);
        int lineTop2 = layout.getLineTop(lineForOffset + 1);
        float max = Math.max(0.5f, layout.getPrimaryHorizontal(length) - 0.5f);
        if (this.r1 == null) {
            this.r1 = new Rect();
        }
        GradientDrawable gradientDrawable = this.c0;
        if (gradientDrawable != null) {
            gradientDrawable.getPadding(this.r1);
            i7 = gradientDrawable.getIntrinsicWidth();
        } else {
            this.r1.setEmpty();
            i7 = 0;
        }
        int scrollX = getScrollX();
        float f10 = max - scrollX;
        int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        float f11 = width;
        int i10 = f10 >= f11 - 1.0f ? (width + scrollX) - (i7 - this.r1.right) : (Math.abs(f10) <= 1.0f || (TextUtils.isEmpty(getText()) && ((float) (TLObject.FLAG_20 - scrollX)) <= f11 + 1.0f && max <= 1.0f)) ? scrollX - this.r1.left : ((int) max) - this.r1.left;
        int L = org.telegram.messenger.g0.L(this.F0);
        Rect rect = this.r1;
        this.c0.setBounds(i10, lineTop - rect.top, L + i10, lineTop2 + rect.bottom);
        layout.getText();
    }

    public final Drawable z(Drawable drawable, boolean z10) {
        if (drawable != null) {
            if (z10) {
                drawable = drawable.mutate();
            }
            PorterDuffColorFilter porterDuffColorFilter = this.w1;
            if (porterDuffColorFilter != null) {
                drawable.setColorFilter(porterDuffColorFilter);
            }
        }
        return drawable;
    }

    @Override // android.widget.EditText
    public void setSelection(int i7) {
        try {
            super.setSelection(i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i7) {
        if (this.b1 == null && this.c1 == null) {
            return super.startActionMode(callback, i7);
        }
        return startActionMode(callback);
    }

    public void o(ActionMode actionMode, Menu menu) {
    }
}
