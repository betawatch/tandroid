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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class EditTextBoldCursor extends vu3 {
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
    public hm4 Y0;
    public cl4 Z0;
    public cc a1;
    public Object b0;
    public View b1;
    public final GradientDrawable c0;
    public View c1;
    public kcb d0;
    public int d1;
    public float e0;
    public boolean e1;
    public final jn f0;
    public final iu3 f1;
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
    public km0 s1;
    public f t0;
    public Drawable t1;
    public hu3 u0;
    public Drawable u1;
    public hu3 v0;
    public Drawable v1;
    public CharSequence w0;
    public PorterDuffColorFilter w1;
    public CharSequence x0;
    public int x1;
    public int y0;
    public Runnable y1;
    public int z0;
    public boolean z1;

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
        Boolean bool = vu3.a0;
        if (bool == null) {
            String str2 = Build.MANUFACTURER;
            bool = Boolean.valueOf((str2 == null || !(str2.toLowerCase().contains("honor") || str2.toLowerCase().contains("huawei") || str2.toLowerCase().contains("alps") || str2.toLowerCase().contains("vivo") || str2.toLowerCase().contains("oppo") || str2.toLowerCase().contains("oneplus") || str2.toLowerCase().contains("realme"))) && ((str = Build.MODEL) == null || !str.toLowerCase().contains("mediapad")));
            vu3.a0 = bool;
        }
        this.Q = bool.booleanValue();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f = new ml0(this, arrayList, new uu3(this, b));
        }
        this.f0 = new jn(this, (byte) 1);
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
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            setImportantForAutofill(2);
        }
        this.g0 = new Paint();
        this.h0 = new Paint();
        TextPaint textPaint = new TextPaint(1);
        this.i0 = textPaint;
        textPaint.setTextSize(gm.L(11.0f));
        if (i >= 26) {
            setImportantForAutofill(2);
        }
        if (i >= 29) {
            iu3 iu3Var = new iu3(this);
            this.f1 = iu3Var;
            iu3Var.setShape(new RectShape());
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
        } catch (Throwable th) {
            fc4.g(th, true);
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
        this.j0 = gm.L(24.0f);
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

    public ylb getResourcesProvider() {
        return null;
    }

    @Override // android.widget.TextView
    public Drawable getTextCursorDrawable() {
        if (this.f1 != null) {
            return super.getTextCursorDrawable();
        }
        iu3 iu3Var = new iu3(this, new RectShape());
        iu3Var.getPaint().setColor(0);
        return iu3Var;
    }

    @Override // android.widget.TextView
    public Drawable getTextSelectHandle() {
        Drawable drawable = this.v1;
        if (drawable != null) {
            return drawable;
        }
        Drawable z = z(super.getTextSelectHandle(), true);
        this.v1 = z;
        return z;
    }

    @Override // android.widget.TextView
    public Drawable getTextSelectHandleLeft() {
        Drawable drawable = this.t1;
        if (drawable != null) {
            return drawable;
        }
        Drawable z = z(super.getTextSelectHandleLeft(), true);
        this.t1 = z;
        return z;
    }

    @Override // android.widget.TextView
    public Drawable getTextSelectHandleRight() {
        Drawable drawable = this.u1;
        if (drawable != null) {
            return drawable;
        }
        Drawable z = z(super.getTextSelectHandleRight(), true);
        this.u1 = z;
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
                this.W0.setInterpolator(d53.h);
                this.W0.start();
            } else {
                this.X0 = z2 ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    public final void m() {
        hm4 hm4Var = this.Y0;
        if (hm4Var != null) {
            hm4Var.a.removeOnLayoutChangeListener(hm4Var.l);
            fm4 fm4Var = hm4Var.b;
            if (!fm4Var.F) {
                fm4Var.G = false;
                fm4Var.F = true;
                fm4Var.x.cancel();
                fm4Var.w.start();
                fm4Var.D.setEmpty();
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

    @Override // vu3, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        this.c1 = getRootView();
        if (Build.VERSION.SDK_INT < 29) {
            fi2.d().b(this.f0, 2);
        }
    }

    @Override // vu3, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c1 = null;
        if (Build.VERSION.SDK_INT < 29) {
            fi2.d().f(this.f0);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|(4:144|(5:148|(1:161)|152|(2:154|(1:156))(2:158|(1:160))|157)|162|(2:183|(31:189|(1:191)(1:259)|192|(1:258)(1:196)|197|(3:199|(1:(1:256))(1:203)|204)(1:257)|205|(1:209)|210|(2:251|(1:253)(1:254))(4:214|(8:216|(1:218)|219|(1:221)|222|(5:224|(1:226)|227|(1:229)|230)(1:249)|231|(8:233|(1:235)|236|(1:238)|239|(1:241)|242|243))(1:250)|248|243)|244|(1:246)|247|6|(1:8)|9|10|11|(1:13)(1:142)|14|15|16|17|18|(2:22|23)|26|(5:107|108|(1:137)(2:112|(1:136)(1:116))|117|(2:120|(6:122|(4:124|125|(1:129)|130)|132|125|(2:127|129)|130)(6:133|(4:135|125|(0)|130)|132|125|(0)|130)))(2:28|(3:32|33|(6:35|(4:37|38|(1:42)|43)|45|38|(2:40|42)|43)(6:46|(4:48|38|(0)|43)|45|38|(0)|43)))|50|(21:54|(1:56)(2:97|(19:99|(1:59)|60|(2:62|(12:88|66|(1:68)(1:87)|69|(1:71)(1:86)|72|73|(1:75)|76|(1:78)|79|(3:81|(1:83)|84)(1:85))(12:64|66|(0)(0)|69|(0)(0)|72|73|(0)|76|(0)|79|(0)(0)))|90|(1:92)(1:96)|93|(1:95)|66|(0)(0)|69|(0)(0)|72|73|(0)|76|(0)|79|(0)(0))(1:100))|57|(0)|60|(0)|90|(0)(0)|93|(0)|66|(0)(0)|69|(0)(0)|72|73|(0)|76|(0)|79|(0)(0))|101|(2:103|104)(1:106)))(6:170|(2:172|(1:174)(1:181))(1:182)|175|(1:177)|178|(1:180)))|5|6|(0)|9|10|11|(0)(0)|14|15|16|17|18|(3:20|22|23)|26|(0)(0)|50|(22:52|54|(0)(0)|57|(0)|60|(0)|90|(0)(0)|93|(0)|66|(0)(0)|69|(0)(0)|72|73|(0)|76|(0)|79|(0)(0))|101|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0394, code lost:
    
        r2 = e21.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x037e, code lost:
    
        r4 = e21.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x045a A[Catch: all -> 0x047e, TryCatch #4 {all -> 0x047e, blocks: (B:108:0x03b5, B:110:0x03b9, B:112:0x03bd, B:114:0x03cf, B:117:0x03dd, B:120:0x03e3, B:122:0x03ea, B:124:0x03f2, B:125:0x0418, B:127:0x045a, B:129:0x045d, B:130:0x0462, B:133:0x0405, B:135:0x040d, B:137:0x03d9), top: B:107:0x03b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0367 A[Catch: Exception -> 0x037e, TryCatch #0 {Exception -> 0x037e, blocks: (B:11:0x0363, B:13:0x0367, B:142:0x0377), top: B:10:0x0363 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0377 A[Catch: Exception -> 0x037e, TRY_LEAVE, TryCatch #0 {Exception -> 0x037e, blocks: (B:11:0x0363, B:13:0x0367, B:142:0x0377), top: B:10:0x0363 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0501 A[Catch: all -> 0x0526, TryCatch #1 {all -> 0x0526, blocks: (B:33:0x048a, B:35:0x0491, B:37:0x0499, B:38:0x04bf, B:40:0x0501, B:42:0x0504, B:43:0x0509, B:46:0x04ac, B:48:0x04b4), top: B:32:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x054d  */
    @Override // vu3, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        Field field;
        iu3 iu3Var;
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
        Canvas canvas2 = canvas;
        if (length() == 0 || this.T0) {
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
            hu3 hu3Var = this.u0;
            if (hu3Var != null && !TextUtils.isEmpty(hu3Var.i) && (this.A0 || this.B0 != 0.0f)) {
                hu3 hu3Var2 = this.v0;
                hu3 hu3Var3 = this.u0;
                if (hu3Var2 == null) {
                    hu3Var3.O = 0.0f;
                    hu3Var3.invalidateSelf();
                } else if (this.v0.c() + hu3Var3.c() < getMeasuredWidth()) {
                    canvas2.save();
                    canvas2.translate(this.u0.c() + (this.v0.c() - getMeasuredWidth()), 0.0f);
                    this.v0.C = (int) (Color.alpha(this.y0) * this.B0);
                    this.v0.draw(canvas2);
                    canvas2.restore();
                    hu3 hu3Var4 = this.u0;
                    hu3Var4.O = 0.0f;
                    hu3Var4.invalidateSelf();
                } else {
                    canvas2.save();
                    canvas2.translate(this.e0, 0.0f);
                    this.v0.C = (int) (Color.alpha(this.y0) * this.B0);
                    this.v0.draw(canvas2);
                    canvas2.restore();
                    hu3 hu3Var5 = this.u0;
                    hu3Var5.O = (this.v0.c() + gm.L(2.0f)) - this.e0;
                    hu3Var5.invalidateSelf();
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
                if (this.G0 && jb6.a0) {
                    float scrollX = getScrollX() + i5 + (getMeasuredWidth() - lineWidth);
                    this.q0 = scrollX;
                    canvas2.translate(scrollX, (this.M0 - this.p0.getHeight()) - gm.L(7.0f));
                } else {
                    float scrollX2 = getScrollX() + i5 + this.l1;
                    this.q0 = scrollX2;
                    canvas2.translate(scrollX2, (this.M0 - this.p0.getHeight()) - gm.M(7.0f));
                }
                if (this.T0) {
                    float f10 = 1.0f - (this.X0 * 0.3f);
                    if (this.G0 && jb6.a0) {
                        float f11 = lineWidth + lineLeft;
                        canvas2.translate(f11 - (f11 * f10), 0.0f);
                    } else if (lineLeft != 0.0f) {
                        canvas2.translate((1.0f - f10) * lineLeft, 0.0f);
                    }
                    canvas2.scale(f10, f10);
                    canvas2.translate(0.0f, (-gm.L(22.0f)) * this.X0);
                    getPaint().setColor(on2.f(this.X0, this.y0, this.z0));
                } else {
                    getPaint().setColor(this.y0);
                    getPaint().setAlpha((int) ((Color.alpha(this.y0) / 255.0f) * this.B0 * 255.0f));
                }
                Shader shader2 = getPaint().getShader();
                if (this.m1 != null && !this.T0) {
                    getPaint().setShader(this.m1);
                }
                kcb kcbVar = this.d0;
                if (kcbVar == null || !kcbVar.e) {
                    f = 2.0f;
                    f2 = 150.0f;
                    f fVar = this.t0;
                    if (fVar != null) {
                        fVar.a(canvas2, new rd3(this, canvas2, (byte) 28));
                    } else {
                        this.p0.draw(canvas2);
                    }
                } else {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    kcb kcbVar2 = this.d0;
                    TextPaint paint = getPaint();
                    EditTextBoldCursor editTextBoldCursor = kcbVar2.a;
                    if (kcbVar2.e) {
                        float f12 = kcbVar2.h;
                        boolean z6 = kcbVar2.f;
                        float f13 = kcbVar2.i;
                        if (!z6) {
                            f13 = 1.0f - f13;
                        }
                        float f14 = f12 * f13;
                        int alpha = paint.getAlpha();
                        if (kcbVar2.d != null) {
                            canvas2.save();
                            canvas2.translate(f14, 0.0f);
                            kcbVar2.d.draw(canvas2);
                            canvas2.restore();
                        }
                        if (kcbVar2.b != null) {
                            boolean z7 = kcbVar2.f;
                            f = 2.0f;
                            float f15 = kcbVar2.i;
                            if (z7) {
                                f15 = 1.0f - f15;
                            }
                            canvas2.save();
                            paint.setAlpha((int) (alpha * f15));
                            canvas2.translate(f14, 0.0f);
                            if (kcbVar2.g) {
                                float f16 = (f15 * 0.1f) + 0.9f;
                                canvas2.scale(f16, f16, f14, editTextBoldCursor.getMeasuredHeight() / 2.0f);
                            }
                            kcbVar2.b.draw(canvas2);
                            canvas2.restore();
                            paint.setAlpha(alpha);
                        } else {
                            f = 2.0f;
                        }
                        if (kcbVar2.c != null) {
                            boolean z8 = kcbVar2.f;
                            float f17 = kcbVar2.i;
                            if (!z8) {
                                f17 = 1.0f - f17;
                            }
                            canvas2.save();
                            float f18 = alpha;
                            f2 = 150.0f;
                            boolean z9 = kcbVar2.f;
                            float f19 = kcbVar2.i;
                            if (!z9) {
                                f19 = 1.0f - f19;
                            }
                            paint.setAlpha((int) (f18 * f19));
                            canvas2.translate(f14, 0.0f);
                            if (kcbVar2.g) {
                                float f20 = (f17 * 0.1f) + 0.9f;
                                canvas2.scale(f20, f20, f14, editTextBoldCursor.getMeasuredHeight() / f);
                            }
                            kcbVar2.c.draw(canvas2);
                            canvas2.restore();
                            paint.setAlpha(alpha);
                            canvas2.restore();
                        }
                    } else {
                        f = 2.0f;
                    }
                    f2 = 150.0f;
                    canvas2.restore();
                }
                if (this.m1 != null) {
                    getPaint().setShader(shader2);
                }
                getPaint().setColor(color);
                canvas2.restore();
                if (this.z1) {
                    canvas2.saveLayerAlpha((getPaddingLeft() + getScrollX()) - this.D1, 0.0f, ((getWidth() + getScrollX()) - getPaddingRight()) + this.D1, getHeight(), nm7.d4, 31);
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
                if (field != null && (i4 = this.m0) != Integer.MAX_VALUE) {
                    try {
                        field.set(this, Integer.valueOf(i4));
                    } catch (Exception unused) {
                        boolean z10 = e21.a;
                    }
                }
                canvas2.restore();
                iu3Var = this.f1;
                GradientDrawable gradientDrawable = this.c0;
                Rect rect = this.o0;
                if (iu3Var != null) {
                    try {
                        Field field3 = F1;
                        if (field3 == null || (obj = this.b0) == null) {
                            z = this.H0;
                            this.H0 = false;
                        } else {
                            z = (SystemClock.uptimeMillis() - field3.getLong(obj)) % 1000 < 500 && isFocused();
                        }
                        if (this.D0 && z) {
                            canvas2.save();
                            if (I1 != null) {
                                if ((getGravity() & nm7.w1) != 48) {
                                    totalPaddingTop = ((Integer) I1.invoke(this, Boolean.TRUE)).intValue();
                                    canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                                    Layout layout = getLayout();
                                    int lineForOffset = layout.getLineForOffset(getSelectionStart());
                                    int lineCount = layout.getLineCount();
                                    y();
                                    Rect bounds = gradientDrawable.getBounds();
                                    rect.left = bounds.left;
                                    rect.right = bounds.left + gm.L(this.F0);
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
                                rect.right = bounds2.left + gm.L(this.F0);
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
                                if ((getGravity() & nm7.w1) != 48) {
                                    totalPaddingTop = getTotalPaddingTop() - getExtendedPaddingTop();
                                    canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                                    Layout layout22 = getLayout();
                                    int lineForOffset22 = layout22.getLineForOffset(getSelectionStart());
                                    int lineCount22 = layout22.getLineCount();
                                    y();
                                    Rect bounds22 = gradientDrawable.getBounds();
                                    rect.left = bounds22.left;
                                    rect.right = bounds22.left + gm.L(this.F0);
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
                                rect.right = bounds222.left + gm.L(this.F0);
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
                        boolean z11 = e21.a;
                    }
                } else if (this.H0 && this.D0) {
                    try {
                        canvas2.save();
                        if (I1 != null) {
                            if ((getGravity() & nm7.w1) != 48) {
                                totalPaddingTop2 = ((Integer) I1.invoke(this, Boolean.TRUE)).intValue();
                                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                                Layout layout3 = getLayout();
                                int lineForOffset3 = layout3.getLineForOffset(getSelectionStart());
                                int lineCount3 = layout3.getLineCount();
                                y();
                                Rect bounds3 = gradientDrawable.getBounds();
                                rect.left = bounds3.left;
                                rect.right = bounds3.left + gm.L(this.F0);
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
                            rect.right = bounds32.left + gm.L(this.F0);
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
                            if ((getGravity() & nm7.w1) != 48) {
                                totalPaddingTop2 = getTotalPaddingTop() - getExtendedPaddingTop();
                                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                                Layout layout322 = getLayout();
                                int lineForOffset322 = layout322.getLineForOffset(getSelectionStart());
                                int lineCount322 = layout322.getLineCount();
                                y();
                                Rect bounds322 = gradientDrawable.getBounds();
                                rect.left = bounds322.left;
                                rect.right = bounds322.left + gm.L(this.F0);
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
                            rect.right = bounds3222.left + gm.L(this.F0);
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
                        boolean z12 = e21.a;
                    }
                }
                if (this.I0 && this.J0 != 0) {
                    int L = gm.L(1.0f);
                    z2 = this.N0;
                    isEmpty = TextUtils.isEmpty(this.x0);
                    Paint paint2 = this.g0;
                    if (isEmpty) {
                        paint2.setColor(this.L0);
                        L = gm.L(f);
                        this.N0 = false;
                    } else if (isFocused()) {
                        this.N0 = true;
                        z3 = true;
                        if (z3 != z2) {
                            this.P0 = SystemClock.elapsedRealtime();
                            this.Q0 = this.O0;
                        }
                        elapsedRealtime = (SystemClock.elapsedRealtime() - this.P0) / f2;
                        if (elapsedRealtime >= 1.0f) {
                            boolean z13 = this.N0;
                            float f21 = this.O0;
                            if (z13) {
                                int measuredHeight = this.s0 ? getMeasuredHeight() - gm.L(f) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() == null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), gm.L(f)) + getScrollY() + ((int) this.M0);
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
                                int measuredHeight2 = this.s0 ? getMeasuredHeight() - gm.L(f) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() == null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), gm.L(f)) + getScrollY() + ((int) this.M0);
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
                                    float interpolation = d53.j.getInterpolation(f4);
                                    if (this.N0) {
                                        this.R0 = max2 * interpolation;
                                        interpolation = 1.0f;
                                    }
                                    int L2 = (int) (interpolation * gm.L(f));
                                    float f22 = i102;
                                    canvas2 = canvas;
                                    canvas2.drawRect(getScrollX() + Math.max(0.0f, f22 - (this.R0 / f)), measuredHeight2 - L2, getScrollX() + Math.min((this.R0 / f) + f22, getMeasuredWidth()), measuredHeight2, this.h0);
                                } else {
                                    canvas2 = canvas;
                                }
                            }
                        }
                        this.O0 = gm.R1(this.Q0, this.N0 ? 1.0f : 0.0f, Math.max(0.0f, Math.min(1.0f, elapsedRealtime)));
                        if (elapsedRealtime < 1.0f) {
                            invalidate();
                        }
                        int measuredHeight22 = this.s0 ? getMeasuredHeight() - gm.L(f) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() == null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), gm.L(f)) + getScrollY() + ((int) this.M0);
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
                    elapsedRealtime = (SystemClock.elapsedRealtime() - this.P0) / f2;
                    if (elapsedRealtime >= 1.0f) {
                    }
                    this.O0 = gm.R1(this.Q0, this.N0 ? 1.0f : 0.0f, Math.max(0.0f, Math.min(1.0f, elapsedRealtime)));
                    if (elapsedRealtime < 1.0f) {
                    }
                    int measuredHeight222 = this.s0 ? getMeasuredHeight() - gm.L(f) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() == null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), gm.L(f)) + getScrollY() + ((int) this.M0);
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
                this.C1.postScale(-1.0f, 1.0f, this.D1 / f, 0.0f);
                this.C1.postTranslate(getWidth() - getPaddingRight(), 0.0f);
                this.B1.setLocalMatrix(this.C1);
                canvas.drawRect(getWidth() - getPaddingRight(), 0.0f, (getWidth() - getPaddingRight()) + this.D1, getHeight(), this.A1);
                canvas.restore();
                canvas.restore();
                return;
            }
        }
        f = 2.0f;
        f2 = 150.0f;
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
            field.set(this, Integer.valueOf(i4));
        }
        canvas2.restore();
        iu3Var = this.f1;
        GradientDrawable gradientDrawable2 = this.c0;
        Rect rect2 = this.o0;
        if (iu3Var != null) {
        }
        if (this.I0) {
            int L3 = gm.L(1.0f);
            z2 = this.N0;
            isEmpty = TextUtils.isEmpty(this.x0);
            Paint paint22 = this.g0;
            if (isEmpty) {
            }
            z3 = false;
            if (z3 != z2) {
            }
            elapsedRealtime = (SystemClock.elapsedRealtime() - this.P0) / f2;
            if (elapsedRealtime >= 1.0f) {
            }
            this.O0 = gm.R1(this.Q0, this.N0 ? 1.0f : 0.0f, Math.max(0.0f, Math.min(1.0f, elapsedRealtime)));
            if (elapsedRealtime < 1.0f) {
            }
            int measuredHeight2222 = this.s0 ? getMeasuredHeight() - gm.L(f) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() == null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), gm.L(f)) + getScrollY() + ((int) this.M0);
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
        if (this.z1) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        try {
            super.onFocusChanged(z, i, rect);
        } catch (Exception e) {
            fc4.g(e, true);
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
                new u4(accessibilityNodeInfo).l(this.p0.getText());
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        hu3 hu3Var = this.u0;
        if (hu3Var != null) {
            hu3Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        hu3 hu3Var2 = this.v0;
        if (hu3Var2 != null) {
            hu3Var2.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        StaticLayout staticLayout = this.p0;
        if (staticLayout == null || this.u0 != null) {
            this.M0 = getMeasuredHeight() - gm.L(2.0f);
        } else {
            if (this.d1 != measuredHeight) {
                s(this.w0, false, staticLayout.getPaint());
            }
            if (this.r0) {
                this.M0 = ((((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - this.p0.getHeight()) / 2.0f) + (getPaddingTop() + getExtendedPaddingTop())) + this.p0.getHeight()) - gm.L(1.0f);
            } else {
                this.M0 = ((getMeasuredHeight() - this.p0.getHeight()) / 2.0f) + this.p0.getHeight() + gm.L(6.0f);
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

    @Override // vu3, android.widget.TextView
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
        fi2 d = fi2.d();
        fi2.c();
        d.h(runnable);
        ei2 e = d.e(2);
        g79 g79Var = e.d;
        if (g79Var == null) {
            g79Var = new g79(0, false);
            e.d = g79Var;
        }
        g79Var.add(runnable);
        return true;
    }

    public final void q() {
        invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (L1 != null) {
                    Object obj = this.b0;
                    if (obj == null) {
                        obj = E1.get(this);
                        this.b0 = obj;
                    }
                    if (obj != null) {
                        L1.invoke(obj, null);
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
            fi2.d().h(runnable);
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
        hu3 hu3Var = this.u0;
        byte b = 1;
        if (hu3Var != null) {
            hu3Var.t(charSequence4, !jb6.a0, true);
            return;
        }
        if (charSequence4 == null) {
            charSequence4 = "";
        }
        CharSequence charSequence5 = charSequence4;
        boolean z3 = getMeasuredWidth() == 0 ? false : z;
        kcb kcbVar = this.d0;
        if (z3) {
            if (kcbVar == null) {
                kcbVar = new kcb(this);
                this.d0 = kcbVar;
            }
            kcb kcbVar2 = kcbVar;
            StaticLayout staticLayout = this.p0;
            CharSequence charSequence6 = this.w0;
            if (staticLayout != null && !charSequence6.equals(charSequence5)) {
                ValueAnimator valueAnimator = kcbVar2.j;
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
                        spannableStringBuilder2.setSpan(new vy2(b), 0, indexOf, 0);
                    }
                    if (charSequence3.length() + indexOf != charSequence2.length()) {
                        spannableStringBuilder2.setSpan(new vy2(b), charSequence3.length() + indexOf, charSequence2.length(), 0);
                    }
                    spannableStringBuilder.setSpan(new vy2(b), indexOf, charSequence3.length() + indexOf, 0);
                    int L = gm.L(400.0f);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    kcbVar2.b = new StaticLayout(spannableStringBuilder, textPaint, L, alignment, 1.0f, 0.0f, false);
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder2, textPaint, gm.L(400.0f), alignment, 1.0f, 0.0f, false);
                    kcbVar2.d = staticLayout2;
                    kcbVar2.e = true;
                    kcbVar2.f = z2;
                    kcbVar2.h = indexOf == 0 ? 0.0f : -staticLayout2.getPrimaryHorizontal(indexOf);
                    kcbVar2.c = null;
                    kcbVar2.g = false;
                } else {
                    int L2 = gm.L(400.0f);
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    kcbVar2.b = new StaticLayout(charSequence5, textPaint, L2, alignment2, 1.0f, 0.0f, false);
                    kcbVar2.c = new StaticLayout(charSequence6, textPaint, gm.L(400.0f), alignment2, 1.0f, 0.0f, false);
                    kcbVar2.d = null;
                    kcbVar2.e = true;
                    kcbVar2.g = true;
                    kcbVar2.h = 0.0f;
                }
                kcbVar2.i = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                kcbVar2.j = ofFloat;
                ofFloat.addUpdateListener(new rha(kcbVar2, (byte) 21));
                kcbVar2.j.addListener(new q7b(kcbVar2, (byte) 2));
                kcbVar2.j.setDuration(150L);
                kcbVar2.j.setInterpolator(d53.f);
                kcbVar2.j.start();
            }
        } else if (kcbVar != null) {
            ValueAnimator valueAnimator2 = kcbVar.j;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            kcbVar.e = false;
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
        this.p0 = new StaticLayout(charSequence5, textPaint2, gm.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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

    public void setBlurredBackgroundDrawableViewFactory(km0 km0Var) {
        this.s1 = km0Var;
    }

    public void setCursorColor(int i) {
        this.i1 = i;
        iu3 iu3Var = this.f1;
        if (iu3Var != null) {
            iu3Var.getPaint().setColor(i);
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
        this.z1 = z;
        if (z) {
            this.D1 = gm.L(12.0f);
            this.A1 = new Paint(1);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.D1, 0.0f, new int[]{-1, 16777215}, new float[]{0.4f, 1.0f}, Shader.TileMode.CLAMP);
            this.B1 = linearGradient;
            this.A1.setShader(linearGradient);
            this.C1 = new Matrix();
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
        if (Build.VERSION.SDK_INT < 29 || p0f.b() || this.x1 == i) {
            return;
        }
        this.x1 = i;
        this.w1 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        z(this.t1, false);
        z(this.u1, false);
        z(this.v1, false);
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
        hu3 hu3Var = this.u0;
        if (hu3Var != null) {
            hu3Var.u(i);
        }
        hu3 hu3Var2 = this.v0;
        if (hu3Var2 != null) {
            hu3Var2.u(this.y0);
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
        this.y1 = runnable;
    }

    @Override // android.widget.EditText
    public final void setSelection(int i, int i2) {
        try {
            super.setSelection(i, i2);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public void setSupportRtlHint(boolean z) {
        this.G0 = z;
    }

    @Override // vu3, android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        l(this.S0);
        this.S0 = false;
    }

    @Override // android.widget.TextView
    public void setTextSelectHandle(Drawable drawable) {
        Drawable z = z(drawable, true);
        this.v1 = z;
        super.setTextSelectHandle(z);
    }

    @Override // android.widget.TextView
    public void setTextSelectHandleLeft(Drawable drawable) {
        Drawable z = z(drawable, true);
        this.t1 = z;
        super.setTextSelectHandleLeft(z);
    }

    @Override // android.widget.TextView
    public void setTextSelectHandleRight(Drawable drawable) {
        Drawable z = z(drawable, true);
        this.u1 = z;
        super.setTextSelectHandleRight(z);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        hu3 hu3Var = this.u0;
        if (hu3Var != null) {
            hu3Var.w(gm.L(f));
        }
        hu3 hu3Var2 = this.v0;
        if (hu3Var2 != null) {
            hu3Var2.w(gm.L(f));
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
        hm4 hm4Var = new hm4(context, view, getActionModeStyle(), getResourcesProvider(), this.s1);
        this.Y0 = hm4Var;
        hm4Var.j = this.y1;
        hm4Var.k = new wg0(this, (byte) 1);
        cl4 cl4Var2 = new cl4(getContext(), new ju3(this, callback), this, this.Y0);
        this.Z0 = cl4Var2;
        this.a1 = new cc(this, (byte) 4);
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
        e09[] e09VarArr = (e09[]) text.getSpans(getSelectionStart(), getSelectionEnd(), e09.class);
        return e09VarArr == null || e09VarArr.length == 0;
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
            float f = this.o1;
            float f2 = rect.left;
            float A = td4.A(f2, f, exp, f);
            this.o1 = A;
            float f3 = this.p1;
            this.p1 = td4.A(rect.top, f3, exp, f3);
            if (Math.abs(f2 - A) >= 0.5f || Math.abs(rect.top - this.p1) >= 0.5f) {
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
        int i;
        Layout layout = getLayout();
        int length = this.E0 ? layout.getText().length() : getSelectionStart();
        int lineForOffset = layout.getLineForOffset(length);
        int lineTop = layout.getLineTop(lineForOffset);
        int lineTop2 = layout.getLineTop(lineForOffset + 1);
        float max = Math.max(0.5f, layout.getPrimaryHorizontal(length) - 0.5f);
        Rect rect = this.r1;
        if (rect == null) {
            rect = new Rect();
            this.r1 = rect;
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
        int i2 = f >= f2 - 1.0f ? (width + scrollX) - (i - this.r1.right) : (Math.abs(f) <= 1.0f || (TextUtils.isEmpty(getText()) && ((float) (TLObject.FLAG_20 - scrollX)) <= f2 + 1.0f && max <= 1.0f)) ? scrollX - this.r1.left : ((int) max) - this.r1.left;
        int L = gm.L(this.F0);
        Rect rect2 = this.r1;
        gradientDrawable.setBounds(i2, lineTop - rect2.top, L + i2, lineTop2 + rect2.bottom);
        layout.getText();
    }

    public final Drawable z(Drawable drawable, boolean z) {
        if (drawable != null) {
            if (z) {
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
    public void setSelection(int i) {
        try {
            super.setSelection(i);
        } catch (Exception e) {
            fc4.g(e, true);
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
