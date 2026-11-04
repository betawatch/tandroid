package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import b8.oc;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w0 {
    public final TextView a;
    public b3 b;
    public b3 c;
    public b3 d;
    public b3 e;
    public b3 f;
    public b3 g;
    public b3 h;
    public final g1 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public w0(TextView textView) {
        this.a = textView;
        this.i = new g1(textView);
    }

    public static b3 c(Context context, q qVar, int i3) {
        ColorStateList i10;
        synchronized (qVar) {
            i10 = qVar.a.i(context, i3);
        }
        if (i10 == null) {
            return null;
        }
        b3 b3Var = new b3();
        b3Var.b = true;
        b3Var.c = i10;
        return b3Var;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i3 >= 30) {
            t0.a.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i3 >= 30) {
            t0.a.a(editorInfo, text);
            return;
        }
        int i10 = editorInfo.initialSelStart;
        int i11 = editorInfo.initialSelEnd;
        int i12 = i10 > i11 ? i11 : i10;
        if (i10 <= i11) {
            i10 = i11;
        }
        int length = text.length();
        if (i12 < 0 || i10 > length) {
            t0.b.c(editorInfo, null, 0, 0);
            return;
        }
        int i13 = editorInfo.inputType & 4095;
        if (i13 == 129 || i13 == 225 || i13 == 18) {
            t0.b.c(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            t0.b.c(editorInfo, text, i12, i10);
            return;
        }
        int i14 = i10 - i12;
        int i15 = i14 > 1024 ? 0 : i14;
        int i16 = 2048 - i15;
        int min = Math.min(text.length() - i10, i16 - Math.min(i12, (int) (i16 * 0.8d)));
        int min2 = Math.min(i12, i16 - min);
        int i17 = i12 - min2;
        if (Character.isLowSurrogate(text.charAt(i17))) {
            i17++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i10 + min) - 1))) {
            min--;
        }
        int i18 = min2 + i15;
        t0.b.c(editorInfo, i15 != i14 ? TextUtils.concat(text.subSequence(i17, i17 + min2), text.subSequence(i10, min + i10)) : text.subSequence(i17, i18 + min + i17), min2, i18);
    }

    public final void a(Drawable drawable, b3 b3Var) {
        if (drawable == null || b3Var == null) {
            return;
        }
        q.d(drawable, b3Var, this.a.getDrawableState());
    }

    public final void b() {
        b3 b3Var = this.b;
        TextView textView = this.a;
        if (b3Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] a10 = r0.a(textView);
        a(a10[0], this.f);
        a(a10[2], this.g);
    }

    public final ColorStateList d() {
        b3 b3Var = this.h;
        if (b3Var != null) {
            return (ColorStateList) b3Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        b3 b3Var = this.h;
        if (b3Var != null) {
            return (PorterDuff.Mode) b3Var.d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AttributeSet attributeSet, int i3) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        ColorStateList colorStateList;
        int resourceId;
        int i10;
        int resourceId2;
        TextView textView = this.a;
        Context context = textView.getContext();
        q a10 = q.a();
        int[] iArr = f.a.h;
        k4.j F = k4.j.F(context, attributeSet, iArr, i3);
        r0.i0.i(textView, textView.getContext(), iArr, attributeSet, (TypedArray) F.b, i3);
        TypedArray typedArray = (TypedArray) F.b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, a10, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, a10, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a10, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, a10, typedArray.getResourceId(2, 0));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f = c(context, a10, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, a10, typedArray.getResourceId(6, 0));
        }
        F.H();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = f.a.w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            k4.j jVar = new k4.j(context, obtainStyledAttributes);
            if (z12 || !obtainStyledAttributes.hasValue(14)) {
                z10 = false;
                z11 = false;
            } else {
                z11 = obtainStyledAttributes.getBoolean(14, false);
                z10 = true;
            }
            n(context, jVar);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i11 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            jVar.H();
        } else {
            z10 = false;
            z11 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i3, 0);
        k4.j jVar2 = new k4.j(context, obtainStyledAttributes2);
        if (!z12 && obtainStyledAttributes2.hasValue(14)) {
            z11 = obtainStyledAttributes2.getBoolean(14, false);
            z10 = true;
        }
        boolean z13 = z11;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        String str3 = str2;
        if (i11 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i11 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, jVar2);
        jVar2.H();
        if (!z12 && z10) {
            textView.setAllCaps(z13);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            u0.d(textView, str);
        }
        if (str3 != null) {
            if (i11 >= 24) {
                t0.b(textView, t0.a(str3));
            } else {
                r0.c(textView, s0.a(str3.split(",")[0]));
            }
        }
        g1 g1Var = this.i;
        Context context2 = g1Var.j;
        int[] iArr3 = f.a.i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i3, 0);
        TextView textView2 = g1Var.i;
        r0.i0.i(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i3);
        if (obtainStyledAttributes3.hasValue(5)) {
            g1Var.a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i12 = 0; i12 < length; i12++) {
                    iArr4[i12] = obtainTypedArray.getDimensionPixelSize(i12, -1);
                }
                g1Var.f = g1.b(iArr4);
                g1Var.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!g1Var.j()) {
            g1Var.a = 0;
        } else if (g1Var.a == 1) {
            if (!g1Var.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i10 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i10 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i10, 112.0f, displayMetrics);
                }
                float f10 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                g1Var.k(dimension2, f10, dimension);
            }
            g1Var.h();
        }
        if (r3.b && g1Var.a != 0) {
            int[] iArr5 = g1Var.f;
            if (iArr5.length > 0) {
                if (u0.a(textView) != -1.0f) {
                    u0.b(textView, Math.round(g1Var.d), Math.round(g1Var.e), Math.round(g1Var.c), 0);
                } else {
                    u0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b10 = resourceId4 != -1 ? a10.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b11 = resourceId5 != -1 ? a10.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b12 = resourceId6 != -1 ? a10.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b13 = resourceId7 != -1 ? a10.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b14 = resourceId8 != -1 ? a10.b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b15 = resourceId9 != -1 ? a10.b(context, resourceId9) : null;
        if (b14 != null || b15 != null) {
            Drawable[] a11 = r0.a(textView);
            if (b14 == null) {
                b14 = a11[0];
            }
            if (b11 == null) {
                b11 = a11[1];
            }
            if (b15 == null) {
                b15 = a11[2];
            }
            if (b13 == null) {
                b13 = a11[3];
            }
            r0.b(textView, b14, b11, b15, b13);
        } else if (b10 != null || b11 != null || b12 != null || b13 != null) {
            Drawable[] a12 = r0.a(textView);
            Drawable drawable = a12[0];
            if (drawable == null && a12[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b10 == null) {
                    b10 = compoundDrawables[0];
                }
                if (b11 == null) {
                    b11 = compoundDrawables[1];
                }
                if (b12 == null) {
                    b12 = compoundDrawables[2];
                }
                if (b13 == null) {
                    b13 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b10, b11, b12, b13);
            } else {
                if (b11 == null) {
                    b11 = a12[1];
                }
                Drawable drawable2 = a12[2];
                if (b13 == null) {
                    b13 = a12[3];
                }
                r0.b(textView, drawable, b11, drawable2, b13);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = oc.a(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintList(colorStateList);
            } else if (textView instanceof u0.k) {
                ((u0.k) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode b16 = l1.b(obtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintMode(b16);
            } else if (textView instanceof u0.k) {
                ((u0.k) textView).setSupportCompoundDrawablesTintMode(b16);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            x7.g0.b(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            x7.g0.c(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r1, 1.0f);
            }
        }
    }

    public final void g(Context context, int i3) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, f.a.w);
        k4.j jVar = new k4.j(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, jVar);
        if (i10 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            u0.d(textView, string);
        }
        jVar.H();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i3, int i10, int i11, int i12) {
        g1 g1Var = this.i;
        if (g1Var.j()) {
            DisplayMetrics displayMetrics = g1Var.j.getResources().getDisplayMetrics();
            g1Var.k(TypedValue.applyDimension(i12, i3, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (g1Var.h()) {
                g1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i3) {
        g1 g1Var = this.i;
        if (g1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i3 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = g1Var.j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArr2[i10] = Math.round(TypedValue.applyDimension(i3, iArr[i10], displayMetrics));
                    }
                }
                g1Var.f = g1.b(iArr2);
                if (!g1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                g1Var.g = false;
            }
            if (g1Var.h()) {
                g1Var.a();
            }
        }
    }

    public final void k(int i3) {
        g1 g1Var = this.i;
        if (g1Var.j()) {
            if (i3 == 0) {
                g1Var.a = 0;
                g1Var.d = -1.0f;
                g1Var.e = -1.0f;
                g1Var.c = -1.0f;
                g1Var.f = new int[0];
                g1Var.b = false;
                return;
            }
            if (i3 != 1) {
                throw new IllegalArgumentException(k2.p1.i(i3, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = g1Var.j.getResources().getDisplayMetrics();
            g1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (g1Var.h()) {
                g1Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new b3();
        }
        b3 b3Var = this.h;
        b3Var.c = colorStateList;
        b3Var.b = colorStateList != null;
        this.b = b3Var;
        this.c = b3Var;
        this.d = b3Var;
        this.e = b3Var;
        this.f = b3Var;
        this.g = b3Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new b3();
        }
        b3 b3Var = this.h;
        b3Var.d = mode;
        b3Var.a = mode != null;
        this.b = b3Var;
        this.c = b3Var;
        this.d = b3Var;
        this.e = b3Var;
        this.f = b3Var;
        this.g = b3Var;
    }

    public final void n(Context context, k4.j jVar) {
        String string;
        int i3 = this.j;
        TypedArray typedArray = (TypedArray) jVar.b;
        this.j = typedArray.getInt(2, i3);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.k = i11;
            if (i11 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i12 = typedArray.getInt(1, 1);
                if (i12 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i12 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i13 = typedArray.hasValue(12) ? 12 : 10;
        int i14 = this.k;
        int i15 = this.j;
        if (!context.isRestricted()) {
            WeakReference weakReference = new WeakReference(this.a);
            g2.k0 k0Var = new g2.k0();
            k0Var.d = this;
            k0Var.a = i14;
            k0Var.b = i15;
            k0Var.c = weakReference;
            try {
                Typeface C = jVar.C(i13, this.j, k0Var);
                if (C != null) {
                    if (i10 < 28 || this.k == -1) {
                        this.l = C;
                    } else {
                        this.l = v0.a(Typeface.create(C, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i13)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = v0.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
