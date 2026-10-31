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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class EditTextBoldCursor extends qt {
    public static Field A1;
    public static boolean B1;
    public static Method C1;
    public static Class D1;
    public static Field E1;
    public static Method F1;
    public static Field y1;
    public static Field z1;
    public float A0;
    public long B0;
    public boolean C0;
    public boolean D0;
    public float E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public int J0;
    public int K0;
    public float L0;
    public boolean M0;
    public float N0;
    public long O0;
    public float P0;
    public float Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public AnimatorSet V0;
    public float W0;
    public org.telegram.ui.ActionBar.s4 X0;
    public org.telegram.ui.ActionBar.d4 Y0;
    public dt Z0;
    public Object a0;
    public View a1;
    public final GradientDrawable b0;
    public View b1;
    public mx0 c0;
    public int c1;
    public float d0;
    public boolean d1;
    public final r5 e0;
    public final ft e1;
    public final Paint f0;
    public final ArrayList f1;
    public final Paint g0;
    public boolean g1;
    public final TextPaint h0;
    public int h1;
    public int i0;
    public final Rect i1;
    public int j0;
    public int j1;
    public int k0;
    public int k1;
    public int l0;
    public Rect l1;
    public float m0;
    public tg.b m1;
    public final Rect n0;
    public Drawable n1;
    public StaticLayout o0;
    public Drawable o1;
    public float p0;
    public Drawable p1;
    public boolean q0;
    public PorterDuffColorFilter q1;
    public boolean r0;
    public int r1;
    public qh.d s0;
    public Runnable s1;
    public et t0;
    public boolean t1;
    public et u0;
    public Paint u1;
    public CharSequence v0;
    public LinearGradient v1;
    public CharSequence w0;
    public Matrix w1;
    public int x0;
    public int x1;
    public int y0;
    public boolean z0;

    public EditTextBoldCursor(Context context) {
        super(context, null, 0, R.style.EditTextNoBackgroundStyle);
        String str;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = new Stack();
        this.c = new ArrayList();
        this.e = true;
        this.n = new Path();
        this.G = true;
        this.H = null;
        this.J = new ot(this, 0);
        this.K = new Rect();
        if (qt.W == null) {
            String str2 = Build.MANUFACTURER;
            qt.W = Boolean.valueOf((str2 == null || !(str2.toLowerCase().contains("honor") || str2.toLowerCase().contains("huawei") || str2.toLowerCase().contains("alps"))) && ((str = Build.MODEL) == null || !str.toLowerCase().contains("mediapad")));
        }
        this.P = qt.W.booleanValue();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f = new nh.n(this, arrayList, new pt(this));
        }
        this.e0 = new r5(this, 1);
        this.n0 = new Rect();
        this.z0 = true;
        this.A0 = 1.0f;
        this.C0 = true;
        this.D0 = false;
        this.E0 = 2.0f;
        this.H0 = false;
        this.M0 = false;
        this.N0 = 0.0f;
        this.P0 = 0.0f;
        this.Q0 = 0.0f;
        this.T0 = true;
        this.f1 = new ArrayList();
        this.g1 = false;
        this.i1 = new Rect();
        this.j1 = -1;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            setImportantForAutofill(2);
        }
        this.f0 = new Paint();
        this.g0 = new Paint();
        TextPaint textPaint = new TextPaint(1);
        this.h0 = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(11.0f));
        if (i10 >= 26) {
            setImportantForAutofill(2);
        }
        if (i10 >= 29) {
            ft ftVar = new ft(this);
            this.e1 = ftVar;
            ftVar.setShape(new RectShape());
            this.b0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
            setTextCursorDrawable(this.e1);
        }
        try {
            if (!B1 && A1 == null) {
                B1 = true;
                Field declaredField = View.class.getDeclaredField("mScrollY");
                A1 = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (Throwable unused) {
        }
        try {
            if (D1 == null) {
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                y1 = declaredField2;
                declaredField2.setAccessible(true);
                Class<?> cls = Class.forName("android.widget.Editor");
                D1 = cls;
                try {
                    Field declaredField3 = cls.getDeclaredField("mShowCursor");
                    z1 = declaredField3;
                    declaredField3.setAccessible(true);
                } catch (Exception unused2) {
                }
                try {
                    Method declaredMethod = D1.getDeclaredMethod("invalidateTextDisplayList", null);
                    F1 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused3) {
                }
                Method declaredMethod2 = TextView.class.getDeclaredMethod("getVerticalOffset", Boolean.TYPE);
                C1 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
        if (this.e1 == null) {
            try {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
                this.b0 = gradientDrawable;
                if (Build.VERSION.SDK_INT >= 29) {
                    setTextCursorDrawable(gradientDrawable);
                }
                this.a0 = y1.get(this);
            } catch (Throwable unused4) {
            }
            try {
                if (E1 == null) {
                    Field declaredField4 = TextView.class.getDeclaredField("mCursorDrawableRes");
                    E1 = declaredField4;
                    declaredField4.setAccessible(true);
                }
                Field field = E1;
                if (field != null) {
                    field.set(this, Integer.valueOf(R.drawable.field_carret_empty));
                }
            } catch (Throwable unused5) {
            }
        }
        this.i0 = org.telegram.messenger.i0.L(24.0f);
    }

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        this.f1.add(textWatcher);
        if (this.g1) {
            return;
        }
        super.addTextChangedListener(textWatcher);
    }

    public int getActionModeStyle() {
        return 1;
    }

    public int getActiveLineColor() {
        return this.J0;
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        return 0;
    }

    public int getCursorColor() {
        return this.h1;
    }

    public int getErrorLineColor() {
        return this.K0;
    }

    @Override // android.widget.TextView
    public int getExtendedPaddingBottom() {
        int i10 = this.k0;
        if (i10 == 0) {
            return super.getExtendedPaddingBottom();
        }
        this.k0 = i10 - 1;
        int i11 = this.l0;
        if (i11 != Integer.MAX_VALUE) {
            return -i11;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getExtendedPaddingTop() {
        int i10 = this.j0;
        if (i10 == 0) {
            return super.getExtendedPaddingTop();
        }
        this.j0 = i10 - 1;
        return 0;
    }

    public int getHandlesColor() {
        return this.r1;
    }

    public float getHeaderAnimationProgress() {
        return this.W0;
    }

    public int getHeaderHintColor() {
        return this.y0;
    }

    public int getHintColor() {
        return this.x0;
    }

    public Layout getHintLayoutEx() {
        return this.o0;
    }

    public int getLineColor() {
        return this.I0;
    }

    @Override // android.widget.TextView
    public float getLineSpacingExtra() {
        return super.getLineSpacingExtra();
    }

    public float getLineY() {
        return this.L0;
    }

    public Runnable getOnPremiumMenuLockClickListener() {
        return this.s1;
    }

    public org.telegram.ui.ActionBar.p6 getResourcesProvider() {
        return null;
    }

    @Override // android.widget.TextView
    public Drawable getTextCursorDrawable() {
        if (this.e1 != null) {
            return super.getTextCursorDrawable();
        }
        ft ftVar = new ft(this, new RectShape());
        ftVar.getPaint().setColor(0);
        return ftVar;
    }

    @Override // android.widget.TextView
    public Drawable getTextSelectHandle() {
        if (this.p1 == null) {
            this.p1 = y(super.getTextSelectHandle(), true);
        }
        return this.p1;
    }

    @Override // android.widget.TextView
    public Drawable getTextSelectHandleLeft() {
        if (this.n1 == null) {
            this.n1 = y(super.getTextSelectHandleLeft(), true);
        }
        return this.n1;
    }

    @Override // android.widget.TextView
    public Drawable getTextSelectHandleRight() {
        if (this.o1 == null) {
            this.o1 = y(super.getTextSelectHandleRight(), true);
        }
        return this.o1;
    }

    public final void l(boolean z10) {
        boolean z11 = this.S0 && (getText().length() > 0 || (this.T0 && isFocused()));
        if (this.U0 != z11) {
            AnimatorSet animatorSet = this.V0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.V0 = null;
            }
            this.U0 = z11;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.V0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "headerAnimationProgress", z11 ? 1.0f : 0.0f));
                this.V0.setDuration(200L);
                this.V0.setInterpolator(gr.h);
                this.V0.start();
            } else {
                this.W0 = z11 ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    public final void m() {
        org.telegram.ui.ActionBar.s4 s4Var = this.X0;
        if (s4Var != null) {
            s4Var.a.removeOnLayoutChangeListener(s4Var.l);
            org.telegram.ui.ActionBar.q4 q4Var = s4Var.b;
            if (!q4Var.F) {
                q4Var.G = false;
                q4Var.F = true;
                q4Var.x.cancel();
                q4Var.w.start();
                q4Var.D.setEmpty();
            }
            this.X0 = null;
        }
        if (this.Z0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.Z0);
            this.Z0 = null;
        }
    }

    public void n(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.draw(canvas);
    }

    @Override // org.telegram.ui.Components.qt, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        this.b1 = getRootView();
        if (Build.VERSION.SDK_INT < 29) {
            rf.g.d().b(this.e0, 2);
        }
    }

    @Override // org.telegram.ui.Components.qt, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b1 = null;
        if (Build.VERSION.SDK_INT < 29) {
            rf.g.d().g(this.e0);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|(4:147|(5:151|(1:253)|155|(2:157|(1:159))(2:250|(1:252))|160)|161|(2:177|(27:183|(1:185)(1:249)|186|(1:248)(1:190)|191|(3:193|(1:(1:246))(1:197)|198)(1:247)|199|(2:241|(1:243)(1:244))(4:203|(8:205|(1:207)(1:239)|208|(1:210)|211|(5:213|(1:215)(1:237)|216|(1:218)|219)(1:238)|220|(8:222|(1:224)(1:235)|225|(1:227)(1:234)|228|(1:230)|231|232))(1:240)|236|232)|233|6|(1:8)|9|10|11|(1:13)(1:145)|14|15|16|17|18|(2:22|23)|26|(5:110|111|(1:140)(2:115|(1:139)(1:119))|120|(2:123|(6:125|(4:127|128|(1:132)|133)|135|128|(2:130|132)|133)(6:136|(4:138|128|(0)|133)|135|128|(0)|133)))(2:28|(3:32|33|(6:35|(4:37|38|(1:42)|43)|45|38|(2:40|42)|43)(6:46|(4:48|38|(0)|43)|45|38|(0)|43)))|50|(17:54|(1:56)(2:100|(1:102)(1:103))|57|(1:59)|60|(4:93|(1:95)(1:99)|96|(1:98))|69|(1:71)(1:92)|72|(1:74)(1:91)|75|76|(1:78)|79|(1:81)|82|(4:84|(1:86)|(1:88)|89)(1:90))|104|(2:106|107)(1:109)))(3:169|(2:171|(1:173)(1:175))(1:176)|174))|5|6|(0)|9|10|11|(0)(0)|14|15|16|17|18|(3:20|22|23)|26|(0)(0)|50|(22:52|54|(0)(0)|57|(0)|60|(2:62|64)|93|(0)(0)|96|(0)|69|(0)(0)|72|(0)(0)|75|76|(0)|79|(0)|82|(0)(0))|104|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0362, code lost:
    
        r2 = org.telegram.messenger.v2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x034d, code lost:
    
        r4 = org.telegram.messenger.v2.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0383 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0428 A[Catch: all -> 0x0449, TryCatch #1 {all -> 0x0449, blocks: (B:111:0x0383, B:113:0x0387, B:115:0x038b, B:117:0x039d, B:120:0x03ab, B:123:0x03b1, B:125:0x03b8, B:127:0x03c0, B:128:0x03e6, B:130:0x0428, B:132:0x042b, B:133:0x0430, B:136:0x03d3, B:138:0x03db, B:140:0x03a7), top: B:110:0x0383 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0336 A[Catch: Exception -> 0x034d, TryCatch #0 {Exception -> 0x034d, blocks: (B:11:0x0332, B:13:0x0336, B:145:0x0346), top: B:10:0x0332 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0346 A[Catch: Exception -> 0x034d, TRY_LEAVE, TryCatch #0 {Exception -> 0x034d, blocks: (B:11:0x0332, B:13:0x0336, B:145:0x0346), top: B:10:0x0332 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04cc A[Catch: all -> 0x04ee, TryCatch #3 {all -> 0x04ee, blocks: (B:33:0x0455, B:35:0x045c, B:37:0x0464, B:38:0x048a, B:40:0x04cc, B:42:0x04cf, B:43:0x04d4, B:46:0x0477, B:48:0x047f), top: B:32:0x0455 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x055a  */
    @Override // org.telegram.ui.Components.qt, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float f7;
        float f10;
        Field field;
        ft ftVar;
        boolean z10;
        int totalPaddingTop;
        int i10;
        float f11;
        Object obj;
        boolean z11;
        boolean isEmpty;
        float elapsedRealtime;
        int i11;
        float f12;
        boolean z12;
        int totalPaddingTop2;
        int i12;
        float f13;
        int i13;
        Field field2;
        Canvas canvas2 = canvas;
        int i14 = 1;
        if (length() == 0 || this.S0) {
            boolean z13 = this.z0;
            if ((z13 && this.A0 != 1.0f) || (!z13 && this.A0 != 0.0f)) {
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.B0;
                if (j10 < 0 || j10 > 17) {
                    j10 = 17;
                }
                this.B0 = currentTimeMillis;
                if (this.z0) {
                    float f14 = (j10 / 150.0f) + this.A0;
                    this.A0 = f14;
                    if (f14 > 1.0f) {
                        this.A0 = 1.0f;
                    }
                } else {
                    float f15 = this.A0 - (j10 / 150.0f);
                    this.A0 = f15;
                    if (f15 < 0.0f) {
                        this.A0 = 0.0f;
                    }
                }
                invalidate();
            }
            et etVar = this.t0;
            if (etVar != null && !TextUtils.isEmpty(etVar.i) && (this.z0 || this.A0 != 0.0f)) {
                if (this.u0 == null) {
                    et etVar2 = this.t0;
                    etVar2.N = 0.0f;
                    etVar2.invalidateSelf();
                } else if (this.u0.c() + this.t0.c() < getMeasuredWidth()) {
                    canvas2.save();
                    canvas2.translate(this.t0.c() + (this.u0.c() - getMeasuredWidth()), 0.0f);
                    this.u0.B = (int) (Color.alpha(this.x0) * this.A0);
                    this.u0.draw(canvas2);
                    canvas2.restore();
                    et etVar3 = this.t0;
                    etVar3.N = 0.0f;
                    etVar3.invalidateSelf();
                } else {
                    canvas2.save();
                    canvas2.translate(this.d0, 0.0f);
                    this.u0.B = (int) (Color.alpha(this.x0) * this.A0);
                    this.u0.draw(canvas2);
                    canvas2.restore();
                    et etVar4 = this.t0;
                    etVar4.N = (this.u0.c() + org.telegram.messenger.i0.L(2.0f)) - this.d0;
                    etVar4.invalidateSelf();
                }
                this.t0.B = (int) (Color.alpha(this.x0) * this.A0);
                this.t0.draw(canvas2);
            } else if (this.o0 != null && (this.z0 || this.A0 != 0.0f)) {
                int color = getPaint().getColor();
                canvas2.save();
                float lineLeft = this.o0.getLineLeft(0);
                float lineWidth = this.o0.getLineWidth(0);
                int i15 = lineLeft != 0.0f ? (int) (0 - lineLeft) : 0;
                if (this.F0 && org.telegram.messenger.cd.X) {
                    float scrollX = getScrollX() + i15 + (getMeasuredWidth() - lineWidth);
                    this.p0 = scrollX;
                    canvas2.translate(scrollX, (this.L0 - this.o0.getHeight()) - org.telegram.messenger.i0.L(7.0f));
                } else {
                    float scrollX2 = getScrollX() + i15 + this.k1;
                    this.p0 = scrollX2;
                    canvas2.translate(scrollX2, (this.L0 - this.o0.getHeight()) - org.telegram.messenger.i0.M(7.0f));
                }
                if (this.S0) {
                    float f16 = 1.0f - (this.W0 * 0.3f);
                    if (this.F0 && org.telegram.messenger.cd.X) {
                        float f17 = lineWidth + lineLeft;
                        canvas2.translate(f17 - (f17 * f16), 0.0f);
                    } else if (lineLeft != 0.0f) {
                        canvas2.translate((1.0f - f16) * lineLeft, 0.0f);
                    }
                    canvas2.scale(f16, f16);
                    canvas2.translate(0.0f, (-org.telegram.messenger.i0.L(22.0f)) * this.W0);
                    getPaint().setColor(i0.b.f(this.W0, this.x0, this.y0));
                } else {
                    getPaint().setColor(this.x0);
                    getPaint().setAlpha((int) ((Color.alpha(this.x0) / 255.0f) * this.A0 * 255.0f));
                }
                mx0 mx0Var = this.c0;
                if (mx0Var == null || !mx0Var.e) {
                    f7 = 2.0f;
                    f10 = 150.0f;
                    qh.d dVar = this.s0;
                    if (dVar != null) {
                        dVar.a(canvas2, new at(i14, this, canvas2));
                    } else {
                        this.o0.draw(canvas2);
                    }
                } else {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    mx0 mx0Var2 = this.c0;
                    TextPaint paint = getPaint();
                    EditTextBoldCursor editTextBoldCursor = mx0Var2.a;
                    if (mx0Var2.e) {
                        float f18 = mx0Var2.h * (mx0Var2.f ? mx0Var2.i : 1.0f - mx0Var2.i);
                        int alpha = paint.getAlpha();
                        if (mx0Var2.d != null) {
                            canvas2.save();
                            canvas2.translate(f18, 0.0f);
                            mx0Var2.d.draw(canvas2);
                            canvas2.restore();
                        }
                        if (mx0Var2.b != null) {
                            float f19 = mx0Var2.f ? 1.0f - mx0Var2.i : mx0Var2.i;
                            canvas2.save();
                            f7 = 2.0f;
                            paint.setAlpha((int) (alpha * f19));
                            canvas2.translate(f18, 0.0f);
                            if (mx0Var2.g) {
                                float f20 = (f19 * 0.1f) + 0.9f;
                                canvas2.scale(f20, f20, f18, editTextBoldCursor.getMeasuredHeight() / 2.0f);
                            }
                            mx0Var2.b.draw(canvas2);
                            canvas2.restore();
                            paint.setAlpha(alpha);
                        } else {
                            f7 = 2.0f;
                        }
                        if (mx0Var2.c != null) {
                            float f21 = mx0Var2.f ? mx0Var2.i : 1.0f - mx0Var2.i;
                            canvas2.save();
                            f10 = 150.0f;
                            paint.setAlpha((int) (alpha * (mx0Var2.f ? mx0Var2.i : 1.0f - mx0Var2.i)));
                            canvas2.translate(f18, 0.0f);
                            if (mx0Var2.g) {
                                float f22 = (f21 * 0.1f) + 0.9f;
                                canvas2.scale(f22, f22, f18, editTextBoldCursor.getMeasuredHeight() / f7);
                            }
                            mx0Var2.c.draw(canvas2);
                            canvas2.restore();
                            paint.setAlpha(alpha);
                            canvas2.restore();
                        }
                    } else {
                        f7 = 2.0f;
                    }
                    f10 = 150.0f;
                    canvas2.restore();
                }
                getPaint().setColor(color);
                canvas2.restore();
                if (this.t1) {
                    canvas2.saveLayerAlpha((getPaddingLeft() + getScrollX()) - this.x1, 0.0f, ((getWidth() + getScrollX()) - getPaddingRight()) + this.x1, getHeight(), org.telegram.messenger.zs.e4, 31);
                }
                int extendedPaddingTop = getExtendedPaddingTop();
                this.l0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                field2 = A1;
                if (field2 == null) {
                    this.l0 = field2.getInt(this);
                    A1.set(this, 0);
                } else {
                    this.l0 = getScrollX();
                }
                this.j0 = 1;
                this.k0 = 1;
                canvas2.save();
                canvas2.translate(0.0f, extendedPaddingTop);
                this.d1 = true;
                super.onDraw(canvas);
                this.d1 = false;
                field = A1;
                if (field != null && (i13 = this.l0) != Integer.MAX_VALUE) {
                    try {
                        field.set(this, Integer.valueOf(i13));
                    } catch (Exception unused) {
                        boolean z14 = org.telegram.messenger.v2.a;
                    }
                }
                canvas2.restore();
                ftVar = this.e1;
                GradientDrawable gradientDrawable = this.b0;
                Rect rect = this.n0;
                if (ftVar != null) {
                    try {
                        Field field3 = z1;
                        if (field3 == null || (obj = this.a0) == null) {
                            z10 = this.G0;
                            this.G0 = false;
                        } else {
                            z10 = (SystemClock.uptimeMillis() - field3.getLong(obj)) % 1000 < 500 && isFocused();
                        }
                        if (this.C0 && z10) {
                            canvas2.save();
                            if (C1 != null) {
                                if ((getGravity() & org.telegram.messenger.zs.x1) != 48) {
                                    totalPaddingTop = ((Integer) C1.invoke(this, Boolean.TRUE)).intValue();
                                    canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                                    Layout layout = getLayout();
                                    int lineForOffset = layout.getLineForOffset(getSelectionStart());
                                    int lineCount = layout.getLineCount();
                                    x();
                                    Rect bounds = gradientDrawable.getBounds();
                                    rect.left = bounds.left;
                                    rect.right = bounds.left + org.telegram.messenger.i0.L(this.E0);
                                    i10 = bounds.bottom;
                                    rect.bottom = i10;
                                    rect.top = bounds.top;
                                    f11 = this.m0;
                                    if (f11 != 0.0f && lineForOffset < lineCount - 1) {
                                        rect.bottom = (int) (i10 - f11);
                                    }
                                    int centerY = rect.centerY();
                                    int i16 = this.i0;
                                    int i17 = centerY - (i16 / 2);
                                    rect.top = i17;
                                    rect.bottom = i17 + i16;
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
                                rect.right = bounds2.left + org.telegram.messenger.i0.L(this.E0);
                                i10 = bounds2.bottom;
                                rect.bottom = i10;
                                rect.top = bounds2.top;
                                f11 = this.m0;
                                if (f11 != 0.0f) {
                                    rect.bottom = (int) (i10 - f11);
                                }
                                int centerY2 = rect.centerY();
                                int i162 = this.i0;
                                int i172 = centerY2 - (i162 / 2);
                                rect.top = i172;
                                rect.bottom = i172 + i162;
                                gradientDrawable.setBounds(rect);
                                n(canvas2, gradientDrawable);
                                canvas2.restore();
                            } else {
                                if ((getGravity() & org.telegram.messenger.zs.x1) != 48) {
                                    totalPaddingTop = getTotalPaddingTop() - getExtendedPaddingTop();
                                    canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                                    Layout layout22 = getLayout();
                                    int lineForOffset22 = layout22.getLineForOffset(getSelectionStart());
                                    int lineCount22 = layout22.getLineCount();
                                    x();
                                    Rect bounds22 = gradientDrawable.getBounds();
                                    rect.left = bounds22.left;
                                    rect.right = bounds22.left + org.telegram.messenger.i0.L(this.E0);
                                    i10 = bounds22.bottom;
                                    rect.bottom = i10;
                                    rect.top = bounds22.top;
                                    f11 = this.m0;
                                    if (f11 != 0.0f) {
                                    }
                                    int centerY22 = rect.centerY();
                                    int i1622 = this.i0;
                                    int i1722 = centerY22 - (i1622 / 2);
                                    rect.top = i1722;
                                    rect.bottom = i1722 + i1622;
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
                                rect.right = bounds222.left + org.telegram.messenger.i0.L(this.E0);
                                i10 = bounds222.bottom;
                                rect.bottom = i10;
                                rect.top = bounds222.top;
                                f11 = this.m0;
                                if (f11 != 0.0f) {
                                }
                                int centerY222 = rect.centerY();
                                int i16222 = this.i0;
                                int i17222 = centerY222 - (i16222 / 2);
                                rect.top = i17222;
                                rect.bottom = i17222 + i16222;
                                gradientDrawable.setBounds(rect);
                                n(canvas2, gradientDrawable);
                                canvas2.restore();
                            }
                        }
                    } catch (Throwable unused2) {
                        boolean z15 = org.telegram.messenger.v2.a;
                    }
                } else if (this.G0 && this.C0) {
                    try {
                        canvas2.save();
                        if (C1 != null) {
                            if ((getGravity() & org.telegram.messenger.zs.x1) != 48) {
                                totalPaddingTop2 = ((Integer) C1.invoke(this, Boolean.TRUE)).intValue();
                                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                                Layout layout3 = getLayout();
                                int lineForOffset3 = layout3.getLineForOffset(getSelectionStart());
                                int lineCount3 = layout3.getLineCount();
                                x();
                                Rect bounds3 = gradientDrawable.getBounds();
                                rect.left = bounds3.left;
                                rect.right = bounds3.left + org.telegram.messenger.i0.L(this.E0);
                                i12 = bounds3.bottom;
                                rect.bottom = i12;
                                rect.top = bounds3.top;
                                f13 = this.m0;
                                if (f13 != 0.0f && lineForOffset3 < lineCount3 - 1) {
                                    rect.bottom = (int) (i12 - f13);
                                }
                                int centerY3 = rect.centerY();
                                int i18 = this.i0;
                                int i19 = centerY3 - (i18 / 2);
                                rect.top = i19;
                                rect.bottom = i19 + i18;
                                gradientDrawable.setBounds(rect);
                                n(canvas2, gradientDrawable);
                                canvas2.restore();
                                this.G0 = false;
                            }
                            totalPaddingTop2 = 0;
                            canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                            Layout layout32 = getLayout();
                            int lineForOffset32 = layout32.getLineForOffset(getSelectionStart());
                            int lineCount32 = layout32.getLineCount();
                            x();
                            Rect bounds32 = gradientDrawable.getBounds();
                            rect.left = bounds32.left;
                            rect.right = bounds32.left + org.telegram.messenger.i0.L(this.E0);
                            i12 = bounds32.bottom;
                            rect.bottom = i12;
                            rect.top = bounds32.top;
                            f13 = this.m0;
                            if (f13 != 0.0f) {
                                rect.bottom = (int) (i12 - f13);
                            }
                            int centerY32 = rect.centerY();
                            int i182 = this.i0;
                            int i192 = centerY32 - (i182 / 2);
                            rect.top = i192;
                            rect.bottom = i192 + i182;
                            gradientDrawable.setBounds(rect);
                            n(canvas2, gradientDrawable);
                            canvas2.restore();
                            this.G0 = false;
                        } else {
                            if ((getGravity() & org.telegram.messenger.zs.x1) != 48) {
                                totalPaddingTop2 = getTotalPaddingTop() - getExtendedPaddingTop();
                                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                                Layout layout322 = getLayout();
                                int lineForOffset322 = layout322.getLineForOffset(getSelectionStart());
                                int lineCount322 = layout322.getLineCount();
                                x();
                                Rect bounds322 = gradientDrawable.getBounds();
                                rect.left = bounds322.left;
                                rect.right = bounds322.left + org.telegram.messenger.i0.L(this.E0);
                                i12 = bounds322.bottom;
                                rect.bottom = i12;
                                rect.top = bounds322.top;
                                f13 = this.m0;
                                if (f13 != 0.0f) {
                                }
                                int centerY322 = rect.centerY();
                                int i1822 = this.i0;
                                int i1922 = centerY322 - (i1822 / 2);
                                rect.top = i1922;
                                rect.bottom = i1922 + i1822;
                                gradientDrawable.setBounds(rect);
                                n(canvas2, gradientDrawable);
                                canvas2.restore();
                                this.G0 = false;
                            }
                            totalPaddingTop2 = 0;
                            canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                            Layout layout3222 = getLayout();
                            int lineForOffset3222 = layout3222.getLineForOffset(getSelectionStart());
                            int lineCount3222 = layout3222.getLineCount();
                            x();
                            Rect bounds3222 = gradientDrawable.getBounds();
                            rect.left = bounds3222.left;
                            rect.right = bounds3222.left + org.telegram.messenger.i0.L(this.E0);
                            i12 = bounds3222.bottom;
                            rect.bottom = i12;
                            rect.top = bounds3222.top;
                            f13 = this.m0;
                            if (f13 != 0.0f) {
                            }
                            int centerY3222 = rect.centerY();
                            int i18222 = this.i0;
                            int i19222 = centerY3222 - (i18222 / 2);
                            rect.top = i19222;
                            rect.bottom = i19222 + i18222;
                            gradientDrawable.setBounds(rect);
                            n(canvas2, gradientDrawable);
                            canvas2.restore();
                            this.G0 = false;
                        }
                    } catch (Throwable unused3) {
                        boolean z16 = org.telegram.messenger.v2.a;
                    }
                }
                if (this.H0 && this.I0 != 0) {
                    int L = org.telegram.messenger.i0.L(1.0f);
                    z11 = this.M0;
                    isEmpty = TextUtils.isEmpty(this.w0);
                    Paint paint2 = this.f0;
                    if (isEmpty) {
                        paint2.setColor(this.K0);
                        L = org.telegram.messenger.i0.L(f7);
                        this.M0 = false;
                    } else if (isFocused()) {
                        this.M0 = true;
                    } else {
                        paint2.setColor(this.I0);
                        this.M0 = false;
                    }
                    if (this.M0 != z11) {
                        this.O0 = SystemClock.elapsedRealtime();
                        this.P0 = this.N0;
                    }
                    elapsedRealtime = (SystemClock.elapsedRealtime() - this.O0) / f10;
                    if (elapsedRealtime >= 1.0f || (((z12 = this.M0) && this.N0 != 1.0f) || (!z12 && this.N0 != 0.0f))) {
                        this.N0 = org.telegram.messenger.i0.T1(this.P0, !this.M0 ? 1.0f : 0.0f, Math.max(0.0f, Math.min(1.0f, elapsedRealtime)));
                        if (elapsedRealtime < 1.0f) {
                            invalidate();
                        }
                    }
                    int measuredHeight = !this.r0 ? getMeasuredHeight() - org.telegram.messenger.i0.L(f7) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() != null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), org.telegram.messenger.i0.L(f7)) + getScrollY() + ((int) this.L0);
                    i11 = this.j1;
                    if (i11 < 0) {
                        i11 = getMeasuredWidth() / 2;
                    }
                    int i20 = i11;
                    int max = Math.max(i20, getMeasuredWidth() - i20) * 2;
                    if (this.N0 < 1.0f) {
                        canvas2.drawRect(getScrollX(), measuredHeight - L, getMeasuredWidth() + getScrollX(), measuredHeight, this.f0);
                    }
                    f12 = this.N0;
                    if (f12 <= 0.0f) {
                        float interpolation = gr.j.getInterpolation(f12);
                        boolean z17 = this.M0;
                        if (z17) {
                            this.Q0 = max * interpolation;
                        }
                        if (z17) {
                            interpolation = 1.0f;
                        }
                        int L2 = (int) (interpolation * org.telegram.messenger.i0.L(f7));
                        float f23 = i20;
                        canvas2 = canvas;
                        canvas2.drawRect(getScrollX() + Math.max(0.0f, f23 - (this.Q0 / f7)), measuredHeight - L2, getScrollX() + Math.min((this.Q0 / f7) + f23, getMeasuredWidth()), measuredHeight, this.g0);
                    } else {
                        canvas2 = canvas;
                    }
                }
                if (this.t1) {
                    return;
                }
                canvas2.save();
                canvas2.translate(getScrollX(), 0.0f);
                this.u1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.w1.reset();
                this.v1.setLocalMatrix(this.w1);
                canvas2.drawRect(getPaddingLeft() - this.x1, 0.0f, getPaddingLeft(), getHeight(), this.u1);
                this.w1.reset();
                this.w1.postScale(-1.0f, 1.0f, this.x1 / f7, 0.0f);
                this.w1.postTranslate(getWidth() - getPaddingRight(), 0.0f);
                this.v1.setLocalMatrix(this.w1);
                canvas.drawRect(getWidth() - getPaddingRight(), 0.0f, (getWidth() - getPaddingRight()) + this.x1, getHeight(), this.u1);
                canvas.restore();
                canvas.restore();
                return;
            }
        }
        f7 = 2.0f;
        f10 = 150.0f;
        if (this.t1) {
        }
        int extendedPaddingTop2 = getExtendedPaddingTop();
        this.l0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        field2 = A1;
        if (field2 == null) {
        }
        this.j0 = 1;
        this.k0 = 1;
        canvas2.save();
        canvas2.translate(0.0f, extendedPaddingTop2);
        this.d1 = true;
        super.onDraw(canvas);
        this.d1 = false;
        field = A1;
        if (field != null) {
            field.set(this, Integer.valueOf(i13));
        }
        canvas2.restore();
        ftVar = this.e1;
        GradientDrawable gradientDrawable2 = this.b0;
        Rect rect2 = this.n0;
        if (ftVar != null) {
        }
        if (this.H0) {
            int L3 = org.telegram.messenger.i0.L(1.0f);
            z11 = this.M0;
            isEmpty = TextUtils.isEmpty(this.w0);
            Paint paint22 = this.f0;
            if (isEmpty) {
            }
            if (this.M0 != z11) {
            }
            elapsedRealtime = (SystemClock.elapsedRealtime() - this.O0) / f10;
            if (elapsedRealtime >= 1.0f) {
            }
            this.N0 = org.telegram.messenger.i0.T1(this.P0, !this.M0 ? 1.0f : 0.0f, Math.max(0.0f, Math.min(1.0f, elapsedRealtime)));
            if (elapsedRealtime < 1.0f) {
            }
            int measuredHeight2 = !this.r0 ? getMeasuredHeight() - org.telegram.messenger.i0.L(f7) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() != null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), org.telegram.messenger.i0.L(f7)) + getScrollY() + ((int) this.L0);
            i11 = this.j1;
            if (i11 < 0) {
            }
            int i202 = i11;
            int max2 = Math.max(i202, getMeasuredWidth() - i202) * 2;
            if (this.N0 < 1.0f) {
            }
            f12 = this.N0;
            if (f12 <= 0.0f) {
            }
        }
        if (this.t1) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        try {
            super.onFocusChanged(z10, i10, rect);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        l(true);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.EditText");
        if (this.o0 != null) {
            if (getText().length() <= 0) {
                accessibilityNodeInfo.setText(this.o0.getText());
            } else {
                new s0.c(accessibilityNodeInfo).l(this.o0.getText());
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        et etVar = this.t0;
        if (etVar != null) {
            etVar.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        et etVar2 = this.u0;
        if (etVar2 != null) {
            etVar2.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        StaticLayout staticLayout = this.o0;
        if (staticLayout == null || this.t0 != null) {
            this.L0 = getMeasuredHeight() - org.telegram.messenger.i0.L(2.0f);
        } else {
            if (this.c1 != measuredHeight) {
                s(this.v0, false, staticLayout.getPaint());
            }
            if (this.q0) {
                this.L0 = ((((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - this.o0.getHeight()) / 2.0f) + (getPaddingTop() + getExtendedPaddingTop())) + this.o0.getHeight()) - org.telegram.messenger.i0.L(1.0f);
            } else {
                this.L0 = ((getMeasuredHeight() - this.o0.getHeight()) / 2.0f) + this.o0.getHeight() + org.telegram.messenger.i0.L(6.0f);
            }
        }
        this.c1 = measuredHeight;
    }

    @Override // android.widget.TextView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // org.telegram.ui.Components.qt, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        if (!this.S0 || this.T0) {
            return;
        }
        l(true);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.j1 = (int) motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final StaticLayout p(int i10) {
        if (TextUtils.isEmpty(this.w0)) {
            return null;
        }
        return new StaticLayout(this.w0, this.h0, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override // android.view.View
    public final boolean postDelayed(Runnable runnable, long j10) {
        if (Build.VERSION.SDK_INT < 29 || runnable == null || j10 != 500 || !"android.widget.Editor$Blink".equals(runnable.getClass().getName()) || Looper.myLooper() != Looper.getMainLooper()) {
            return super.postDelayed(runnable, j10);
        }
        rf.g d = rf.g.d();
        d.getClass();
        rf.g.c();
        int max = Math.max(1, Math.min(2, 60));
        d.h(runnable);
        rf.f e = d.e(max);
        if (e.d == null) {
            e.d = new je.b();
        }
        e.d.add(runnable);
        return true;
    }

    public final void q() {
        invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (F1 != null) {
                    if (this.a0 == null) {
                        this.a0 = y1.get(this);
                    }
                    Object obj = this.a0;
                    if (obj != null) {
                        F1.invoke(obj, null);
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
            rf.g.d().h(runnable);
        }
        return super.removeCallbacks(runnable);
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        this.f1.remove(textWatcher);
        if (this.g1) {
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
        et etVar = this.t0;
        if (etVar != null) {
            etVar.t(charSequence4, !org.telegram.messenger.cd.X, true);
            return;
        }
        if (charSequence4 == null) {
            charSequence4 = "";
        }
        CharSequence charSequence5 = charSequence4;
        boolean z12 = false;
        if (getMeasuredWidth() == 0 ? false : z10) {
            if (this.c0 == null) {
                this.c0 = new mx0(this);
            }
            mx0 mx0Var = this.c0;
            StaticLayout staticLayout = this.o0;
            CharSequence charSequence6 = this.v0;
            mx0Var.getClass();
            if (staticLayout != null && !charSequence6.equals(charSequence5)) {
                ValueAnimator valueAnimator = mx0Var.j;
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
                        spannableStringBuilder2.setSpan(new wy(z12), 0, indexOf, 0);
                    }
                    if (charSequence3.length() + indexOf != charSequence2.length()) {
                        spannableStringBuilder2.setSpan(new wy(z12), charSequence3.length() + indexOf, charSequence2.length(), 0);
                    }
                    spannableStringBuilder.setSpan(new wy(z12), indexOf, charSequence3.length() + indexOf, 0);
                    int L = org.telegram.messenger.i0.L(400.0f);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    mx0Var.b = new StaticLayout(spannableStringBuilder, textPaint, L, alignment, 1.0f, 0.0f, false);
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder2, textPaint, org.telegram.messenger.i0.L(400.0f), alignment, 1.0f, 0.0f, false);
                    mx0Var.d = staticLayout2;
                    mx0Var.e = true;
                    mx0Var.f = z11;
                    mx0Var.h = indexOf == 0 ? 0.0f : -staticLayout2.getPrimaryHorizontal(indexOf);
                    mx0Var.c = null;
                    mx0Var.g = false;
                } else {
                    int L2 = org.telegram.messenger.i0.L(400.0f);
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    mx0Var.b = new StaticLayout(charSequence5, textPaint, L2, alignment2, 1.0f, 0.0f, false);
                    mx0Var.c = new StaticLayout(charSequence6, textPaint, org.telegram.messenger.i0.L(400.0f), alignment2, 1.0f, 0.0f, false);
                    mx0Var.d = null;
                    mx0Var.e = true;
                    mx0Var.g = true;
                    mx0Var.h = 0.0f;
                }
                mx0Var.i = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                mx0Var.j = ofFloat;
                ofFloat.addUpdateListener(new r60(mx0Var, 25));
                mx0Var.j.addListener(new t60(mx0Var, 27));
                mx0Var.j.setDuration(150L);
                mx0Var.j.setInterpolator(gr.f);
                mx0Var.j.start();
            }
        } else {
            mx0 mx0Var2 = this.c0;
            if (mx0Var2 != null) {
                ValueAnimator valueAnimator2 = mx0Var2.j;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                mx0Var2.e = false;
            }
        }
        this.v0 = charSequence5;
        if (getMeasuredWidth() != 0) {
            textPaint2 = textPaint;
            charSequence5 = TextUtils.ellipsize(charSequence5, textPaint2, getMeasuredWidth(), TextUtils.TruncateAt.END);
            StaticLayout staticLayout3 = this.o0;
            if (staticLayout3 != null && TextUtils.equals(staticLayout3.getText(), charSequence5)) {
                return;
            }
        } else {
            textPaint2 = textPaint;
        }
        this.o0 = new StaticLayout(charSequence5, textPaint2, org.telegram.messenger.i0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public void setActiveLineColor(int i10) {
        this.J0 = i10;
        this.g0.setColor(i10);
        invalidate();
    }

    public void setAllowDrawCursor(boolean z10) {
        this.C0 = z10;
        invalidate();
    }

    public void setBlurredBackgroundDrawableViewFactory(tg.b bVar) {
        this.m1 = bVar;
    }

    public void setCursorColor(int i10) {
        this.h1 = i10;
        ft ftVar = this.e1;
        if (ftVar != null) {
            ftVar.getPaint().setColor(i10);
        }
        GradientDrawable gradientDrawable = this.b0;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i10);
        }
        invalidate();
    }

    public void setCursorSize(int i10) {
        this.i0 = i10;
    }

    public void setCursorWidth(float f7) {
        this.E0 = f7;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.t1 = z10;
        if (z10) {
            this.x1 = org.telegram.messenger.i0.L(12.0f);
            this.u1 = new Paint(1);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.x1, 0.0f, new int[]{-1, 16777215}, new float[]{0.4f, 1.0f}, Shader.TileMode.CLAMP);
            this.v1 = linearGradient;
            this.u1.setShader(linearGradient);
            this.w1 = new Matrix();
        }
    }

    public void setErrorLineColor(int i10) {
        this.K0 = i10;
        this.h0.setColor(i10);
        invalidate();
    }

    public void setErrorText(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.w0)) {
            return;
        }
        this.w0 = charSequence;
        requestLayout();
    }

    public void setForceCursorEnd(boolean z10) {
        this.D0 = z10;
        invalidate();
    }

    public void setHandlesColor(int i10) {
        if (Build.VERSION.SDK_INT < 29 || org.telegram.messenger.d6.i() || this.r1 == i10) {
            return;
        }
        this.r1 = i10;
        this.q1 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        y(this.n1, false);
        y(this.o1, false);
        y(this.p1, false);
    }

    public void setHeaderAnimationProgress(float f7) {
        this.W0 = f7;
        invalidate();
    }

    public void setHeaderHintColor(int i10) {
        this.y0 = i10;
        invalidate();
    }

    public void setHintColor(int i10) {
        this.x0 = i10;
        et etVar = this.t0;
        if (etVar != null) {
            etVar.u(i10);
        }
        et etVar2 = this.u0;
        if (etVar2 != null) {
            etVar2.u(this.x0);
        }
        invalidate();
    }

    public void setHintRightOffset(int i10) {
        float f7 = i10;
        if (this.d0 == f7) {
            return;
        }
        this.d0 = f7;
        invalidate();
    }

    public void setHintText(CharSequence charSequence) {
        s(charSequence, false, getPaint());
    }

    public void setLineColor(int i10) {
        this.I0 = i10;
        invalidate();
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f7, float f10) {
        super.setLineSpacing(f7, f10);
        this.m0 = f7;
    }

    public void setNextSetTextAnimated(boolean z10) {
        this.R0 = z10;
    }

    public void setOnPremiumMenuLockClickListener(Runnable runnable) {
        this.s1 = runnable;
    }

    @Override // android.widget.EditText
    public final void setSelection(int i10, int i11) {
        try {
            super.setSelection(i10, i11);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public void setSupportRtlHint(boolean z10) {
        this.F0 = z10;
    }

    @Override // org.telegram.ui.Components.qt, android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        l(this.R0);
        this.R0 = false;
    }

    @Override // android.widget.TextView
    public void setTextSelectHandle(Drawable drawable) {
        Drawable y3 = y(drawable, true);
        this.p1 = y3;
        super.setTextSelectHandle(y3);
    }

    @Override // android.widget.TextView
    public void setTextSelectHandleLeft(Drawable drawable) {
        Drawable y3 = y(drawable, true);
        this.n1 = y3;
        super.setTextSelectHandleLeft(y3);
    }

    @Override // android.widget.TextView
    public void setTextSelectHandleRight(Drawable drawable) {
        Drawable y3 = y(drawable, true);
        this.o1 = y3;
        super.setTextSelectHandleRight(y3);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f7) {
        et etVar = this.t0;
        if (etVar != null) {
            etVar.w(org.telegram.messenger.i0.L(f7));
        }
        et etVar2 = this.u0;
        if (etVar2 != null) {
            etVar2.w(org.telegram.messenger.i0.L(f7));
        }
        super.setTextSize(i10, f7);
    }

    public void setTransformHintToHeader(boolean z10) {
        if (this.S0 == z10) {
            return;
        }
        this.S0 = z10;
        AnimatorSet animatorSet = this.V0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.V0 = null;
        }
    }

    public void setTransformHintToHeaderOnFocus(boolean z10) {
        if (this.T0 == z10) {
            return;
        }
        this.T0 = z10;
        l(false);
    }

    public void setWindowView(View view) {
        this.a1 = view;
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        if (this.a1 == null && this.b1 == null) {
            return super.startActionMode(callback);
        }
        org.telegram.ui.ActionBar.d4 d4Var = this.Y0;
        if (d4Var != null) {
            d4Var.finish();
        }
        m();
        Context context = getContext();
        View view = this.a1;
        if (view == null) {
            view = this.b1;
        }
        org.telegram.ui.ActionBar.s4 s4Var = new org.telegram.ui.ActionBar.s4(context, view, getActionModeStyle(), getResourcesProvider(), this.m1);
        this.X0 = s4Var;
        s4Var.j = this.s1;
        s4Var.k = new ct(this, 0);
        org.telegram.ui.ActionBar.d4 d4Var2 = new org.telegram.ui.ActionBar.d4(getContext(), new org.telegram.ui.Cells.i9(this, callback), this, this.X0);
        this.Y0 = d4Var2;
        this.Z0 = new dt(0, this);
        callback.onCreateActionMode(d4Var2, d4Var2.c);
        org.telegram.ui.ActionBar.d4 d4Var3 = this.Y0;
        o(d4Var3, d4Var3.c);
        this.Y0.invalidate();
        getViewTreeObserver().addOnPreDrawListener(this.Z0);
        invalidate();
        return this.Y0;
    }

    public final void t(boolean z10, boolean z11) {
        if (this.z0 == z10) {
            return;
        }
        this.B0 = System.currentTimeMillis();
        this.z0 = z10;
        if (!z11) {
            this.A0 = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void u(int i10, int i11, int i12) {
        this.H0 = true;
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.search_dark);
        Rect rect = this.i1;
        drawable.getPadding(rect);
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
        this.I0 = i10;
        this.J0 = i11;
        this.g0.setColor(i11);
        this.K0 = i12;
        this.h0.setColor(i12);
        invalidate();
    }

    public final void v(boolean z10, boolean z11) {
        if (this.g1 == z10) {
            return;
        }
        this.g1 = z10;
        ArrayList arrayList = this.f1;
        int i10 = 0;
        if (z10) {
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                super.removeTextChangedListener((TextWatcher) obj);
            }
            return;
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
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
        vh0[] vh0VarArr = (vh0[]) text.getSpans(getSelectionStart(), getSelectionEnd(), vh0.class);
        return vh0VarArr == null || vh0VarArr.length == 0;
    }

    public final void x() {
        int i10;
        Layout layout = getLayout();
        int length = this.D0 ? layout.getText().length() : getSelectionStart();
        int lineForOffset = layout.getLineForOffset(length);
        int lineTop = layout.getLineTop(lineForOffset);
        int lineTop2 = layout.getLineTop(lineForOffset + 1);
        float max = Math.max(0.5f, layout.getPrimaryHorizontal(length) - 0.5f);
        if (this.l1 == null) {
            this.l1 = new Rect();
        }
        GradientDrawable gradientDrawable = this.b0;
        if (gradientDrawable != null) {
            gradientDrawable.getPadding(this.l1);
            i10 = gradientDrawable.getIntrinsicWidth();
        } else {
            this.l1.setEmpty();
            i10 = 0;
        }
        int scrollX = getScrollX();
        float f7 = max - scrollX;
        int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        float f10 = width;
        int i11 = f7 >= f10 - 1.0f ? (width + scrollX) - (i10 - this.l1.right) : (Math.abs(f7) <= 1.0f || (TextUtils.isEmpty(getText()) && ((float) (TLObject.FLAG_20 - scrollX)) <= f10 + 1.0f && max <= 1.0f)) ? scrollX - this.l1.left : ((int) max) - this.l1.left;
        int L = org.telegram.messenger.i0.L(this.E0);
        Rect rect = this.l1;
        this.b0.setBounds(i11, lineTop - rect.top, L + i11, lineTop2 + rect.bottom);
        layout.getText();
    }

    public final Drawable y(Drawable drawable, boolean z10) {
        if (drawable != null) {
            if (z10) {
                drawable = drawable.mutate();
            }
            PorterDuffColorFilter porterDuffColorFilter = this.q1;
            if (porterDuffColorFilter != null) {
                drawable.setColorFilter(porterDuffColorFilter);
            }
        }
        return drawable;
    }

    @Override // android.widget.EditText
    public void setSelection(int i10) {
        try {
            super.setSelection(i10);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        if (this.a1 == null && this.b1 == null) {
            return super.startActionMode(callback, i10);
        }
        return startActionMode(callback);
    }

    public void o(ActionMode actionMode, Menu menu) {
    }
}
