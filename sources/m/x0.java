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
import java.lang.ref.WeakReference;
import java.util.Arrays;
import v7.q7;
import w7.w7;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class x0 {
    public final TextView a;
    public e3 b;
    public e3 c;
    public e3 d;
    public e3 e;
    public e3 f;
    public e3 g;
    public e3 h;
    public final h1 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public x0(TextView textView) {
        this.a = textView;
        this.i = new h1(textView);
    }

    public static e3 c(Context context, r rVar, int i10) {
        ColorStateList i11;
        synchronized (rVar) {
            i11 = rVar.a.i(context, i10);
        }
        if (i11 == null) {
            return null;
        }
        e3 e3Var = new e3();
        e3Var.b = true;
        e3Var.c = i11;
        return e3Var;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i10 >= 30) {
            t0.a.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i10 >= 30) {
            t0.a.a(editorInfo, text);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 : i11;
        if (i11 <= i12) {
            i11 = i12;
        }
        int length = text.length();
        if (i13 < 0 || i11 > length) {
            t0.b.c(editorInfo, null, 0, 0);
            return;
        }
        int i14 = editorInfo.inputType & 4095;
        if (i14 == 129 || i14 == 225 || i14 == 18) {
            t0.b.c(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            t0.b.c(editorInfo, text, i13, i11);
            return;
        }
        int i15 = i11 - i13;
        int i16 = i15 > 1024 ? 0 : i15;
        int i17 = 2048 - i16;
        int min = Math.min(text.length() - i11, i17 - Math.min(i13, (int) (i17 * 0.8d)));
        int min2 = Math.min(i13, i17 - min);
        int i18 = i13 - min2;
        if (Character.isLowSurrogate(text.charAt(i18))) {
            i18++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i11 + min) - 1))) {
            min--;
        }
        int i19 = min2 + i16;
        t0.b.c(editorInfo, i16 != i15 ? TextUtils.concat(text.subSequence(i18, i18 + min2), text.subSequence(i11, min + i11)) : text.subSequence(i18, i19 + min + i18), min2, i19);
    }

    public final void a(Drawable drawable, e3 e3Var) {
        if (drawable == null || e3Var == null) {
            return;
        }
        r.d(drawable, e3Var, this.a.getDrawableState());
    }

    public final void b() {
        e3 e3Var = this.b;
        TextView textView = this.a;
        if (e3Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] a2 = s0.a(textView);
        a(a2[0], this.f);
        a(a2[2], this.g);
    }

    public final ColorStateList d() {
        e3 e3Var = this.h;
        if (e3Var != null) {
            return (ColorStateList) e3Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        e3 e3Var = this.h;
        if (e3Var != null) {
            return (PorterDuff.Mode) e3Var.d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        ColorStateList colorStateList;
        int resourceId;
        int i11;
        int resourceId2;
        TextView textView = this.a;
        Context context = textView.getContext();
        r a2 = r.a();
        int[] iArr = f.a.h;
        g3 P = g3.P(context, attributeSet, iArr, i10);
        r0.i0.i(textView, textView.getContext(), iArr, attributeSet, (TypedArray) P.c, i10);
        TypedArray typedArray = (TypedArray) P.c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, a2, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, a2, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a2, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, a2, typedArray.getResourceId(2, 0));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f = c(context, a2, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, a2, typedArray.getResourceId(6, 0));
        }
        P.Q();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = f.a.w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            g3 g3Var = new g3(context, obtainStyledAttributes);
            if (z12 || !obtainStyledAttributes.hasValue(14)) {
                z10 = false;
                z11 = false;
            } else {
                z11 = obtainStyledAttributes.getBoolean(14, false);
                z10 = true;
            }
            n(context, g3Var);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i12 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            g3Var.Q();
        } else {
            z10 = false;
            z11 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        g3 g3Var2 = new g3(context, obtainStyledAttributes2);
        if (!z12 && obtainStyledAttributes2.hasValue(14)) {
            z11 = obtainStyledAttributes2.getBoolean(14, false);
            z10 = true;
        }
        boolean z13 = z11;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        String str3 = str2;
        if (i12 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i12 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, g3Var2);
        g3Var2.Q();
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
            v0.d(textView, str);
        }
        if (str3 != null) {
            if (i12 >= 24) {
                u0.b(textView, u0.a(str3));
            } else {
                s0.c(textView, t0.a(str3.split(",")[0]));
            }
        }
        h1 h1Var = this.i;
        Context context2 = h1Var.j;
        int[] iArr3 = f.a.i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = h1Var.i;
        r0.i0.i(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i10);
        if (obtainStyledAttributes3.hasValue(5)) {
            h1Var.a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i13 = 0; i13 < length; i13++) {
                    iArr4[i13] = obtainTypedArray.getDimensionPixelSize(i13, -1);
                }
                h1Var.f = h1.b(iArr4);
                h1Var.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!h1Var.j()) {
            h1Var.a = 0;
        } else if (h1Var.a == 1) {
            if (!h1Var.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i11 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i11 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i11, 112.0f, displayMetrics);
                }
                float f7 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                h1Var.k(dimension2, f7, dimension);
            }
            h1Var.h();
        }
        if (v3.b && h1Var.a != 0) {
            int[] iArr5 = h1Var.f;
            if (iArr5.length > 0) {
                if (v0.a(textView) != -1.0f) {
                    v0.b(textView, Math.round(h1Var.d), Math.round(h1Var.e), Math.round(h1Var.c), 0);
                } else {
                    v0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b10 = resourceId4 != -1 ? a2.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b11 = resourceId5 != -1 ? a2.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b12 = resourceId6 != -1 ? a2.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b13 = resourceId7 != -1 ? a2.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b14 = resourceId8 != -1 ? a2.b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b15 = resourceId9 != -1 ? a2.b(context, resourceId9) : null;
        if (b14 != null || b15 != null) {
            Drawable[] a10 = s0.a(textView);
            if (b14 == null) {
                b14 = a10[0];
            }
            if (b11 == null) {
                b11 = a10[1];
            }
            if (b15 == null) {
                b15 = a10[2];
            }
            if (b13 == null) {
                b13 = a10[3];
            }
            s0.b(textView, b14, b11, b15, b13);
        } else if (b10 != null || b11 != null || b12 != null || b13 != null) {
            Drawable[] a11 = s0.a(textView);
            Drawable drawable = a11[0];
            if (drawable == null && a11[2] == null) {
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
                    b11 = a11[1];
                }
                Drawable drawable2 = a11[2];
                if (b13 == null) {
                    b13 = a11[3];
                }
                s0.b(textView, drawable, b11, drawable2, b13);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = q7.a(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintList(colorStateList);
            } else if (textView instanceof u0.k) {
                ((u0.k) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode b16 = m1.b(obtainStyledAttributes4.getInt(12, -1), null);
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
            w7.b(dimensionPixelSize, textView);
        }
        if (dimensionPixelSize2 != -1) {
            w7.c(dimensionPixelSize2, textView);
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

    public final void g(Context context, int i10) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, f.a.w);
        g3 g3Var = new g3(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, g3Var);
        if (i11 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            v0.d(textView, string);
        }
        g3Var.Q();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        h1 h1Var = this.i;
        if (h1Var.j()) {
            DisplayMetrics displayMetrics = h1Var.j.getResources().getDisplayMetrics();
            h1Var.k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i10) {
        h1 h1Var = this.i;
        if (h1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = h1Var.j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                h1Var.f = h1.b(iArr2);
                if (!h1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                h1Var.g = false;
            }
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void k(int i10) {
        h1 h1Var = this.i;
        if (h1Var.j()) {
            if (i10 == 0) {
                h1Var.a = 0;
                h1Var.d = -1.0f;
                h1Var.e = -1.0f;
                h1Var.c = -1.0f;
                h1Var.f = new int[0];
                h1Var.b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(i2.o1.k(i10, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = h1Var.j.getResources().getDisplayMetrics();
            h1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new e3();
        }
        e3 e3Var = this.h;
        e3Var.c = colorStateList;
        e3Var.b = colorStateList != null;
        this.b = e3Var;
        this.c = e3Var;
        this.d = e3Var;
        this.e = e3Var;
        this.f = e3Var;
        this.g = e3Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new e3();
        }
        e3 e3Var = this.h;
        e3Var.d = mode;
        e3Var.a = mode != null;
        this.b = e3Var;
        this.c = e3Var;
        this.d = e3Var;
        this.e = e3Var;
        this.f = e3Var;
        this.g = e3Var;
    }

    public final void n(Context context, g3 g3Var) {
        String string;
        int i10 = this.j;
        TypedArray typedArray = (TypedArray) g3Var.c;
        this.j = typedArray.getInt(2, i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = typedArray.getInt(11, -1);
            this.k = i12;
            if (i12 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i13 = typedArray.getInt(1, 1);
                if (i13 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i13 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i14 = typedArray.hasValue(12) ? 12 : 10;
        int i15 = this.k;
        int i16 = this.j;
        if (!context.isRestricted()) {
            WeakReference weakReference = new WeakReference(this.a);
            e2.j0 j0Var = new e2.j0();
            j0Var.d = this;
            j0Var.a = i15;
            j0Var.b = i16;
            j0Var.c = weakReference;
            try {
                Typeface H = g3Var.H(i14, this.j, j0Var);
                if (H != null) {
                    if (i11 < 28 || this.k == -1) {
                        this.l = H;
                    } else {
                        this.l = w0.a(Typeface.create(H, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i14)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = w0.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
