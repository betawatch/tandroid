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
import c8.mc;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class x0 {
    public final TextView a;
    public c3 b;
    public c3 c;
    public c3 d;
    public c3 e;
    public c3 f;
    public c3 g;
    public c3 h;
    public final h1 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public x0(TextView textView) {
        this.a = textView;
        this.i = new h1(textView);
    }

    public static c3 c(Context context, r rVar, int i7) {
        ColorStateList i10;
        synchronized (rVar) {
            i10 = rVar.a.i(context, i7);
        }
        if (i10 == null) {
            return null;
        }
        c3 c3Var = new c3();
        c3Var.b = true;
        c3Var.c = i10;
        return c3Var;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i7 >= 30) {
            t0.a.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i7 >= 30) {
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

    public final void a(Drawable drawable, c3 c3Var) {
        if (drawable == null || c3Var == null) {
            return;
        }
        r.d(drawable, c3Var, this.a.getDrawableState());
    }

    public final void b() {
        c3 c3Var = this.b;
        TextView textView = this.a;
        if (c3Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] a10 = s0.a(textView);
        a(a10[0], this.f);
        a(a10[2], this.g);
    }

    public final ColorStateList d() {
        c3 c3Var = this.h;
        if (c3Var != null) {
            return (ColorStateList) c3Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        c3 c3Var = this.h;
        if (c3Var != null) {
            return (PorterDuff.Mode) c3Var.d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AttributeSet attributeSet, int i7) {
        boolean z9;
        boolean z10;
        String str;
        String str2;
        ColorStateList colorStateList;
        int resourceId;
        int i10;
        int resourceId2;
        TextView textView = this.a;
        Context context = textView.getContext();
        r a10 = r.a();
        int[] iArr = f.a.h;
        h6.m x10 = h6.m.x(context, attributeSet, iArr, i7);
        r0.i0.i(textView, textView.getContext(), iArr, attributeSet, (TypedArray) x10.c, i7);
        TypedArray typedArray = (TypedArray) x10.c;
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
        x10.C();
        boolean z11 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = f.a.w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            h6.m mVar = new h6.m(context, obtainStyledAttributes);
            if (z11 || !obtainStyledAttributes.hasValue(14)) {
                z9 = false;
                z10 = false;
            } else {
                z10 = obtainStyledAttributes.getBoolean(14, false);
                z9 = true;
            }
            n(context, mVar);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i11 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            mVar.C();
        } else {
            z9 = false;
            z10 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i7, 0);
        h6.m mVar2 = new h6.m(context, obtainStyledAttributes2);
        if (!z11 && obtainStyledAttributes2.hasValue(14)) {
            z10 = obtainStyledAttributes2.getBoolean(14, false);
            z9 = true;
        }
        boolean z12 = z10;
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
        n(context, mVar2);
        mVar2.C();
        if (!z11 && z9) {
            textView.setAllCaps(z12);
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
            if (i11 >= 24) {
                u0.b(textView, u0.a(str3));
            } else {
                s0.c(textView, t0.a(str3.split(",")[0]));
            }
        }
        h1 h1Var = this.i;
        Context context2 = h1Var.j;
        int[] iArr3 = f.a.i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i7, 0);
        TextView textView2 = h1Var.i;
        r0.i0.i(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i7);
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
                for (int i12 = 0; i12 < length; i12++) {
                    iArr4[i12] = obtainTypedArray.getDimensionPixelSize(i12, -1);
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
                h1Var.k(dimension2, f10, dimension);
            }
            h1Var.h();
        }
        if (t3.b && h1Var.a != 0) {
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
            Drawable[] a11 = s0.a(textView);
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
            s0.b(textView, b14, b11, b15, b13);
        } else if (b10 != null || b11 != null || b12 != null || b13 != null) {
            Drawable[] a12 = s0.a(textView);
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
                s0.b(textView, drawable, b11, drawable2, b13);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = b5.a.a(context, resourceId)) == null) {
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
            mc.b(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            mc.c(textView, dimensionPixelSize2);
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

    public final void g(Context context, int i7) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i7, f.a.w);
        h6.m mVar = new h6.m(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, mVar);
        if (i10 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            v0.d(textView, string);
        }
        mVar.C();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i7, int i10, int i11, int i12) {
        h1 h1Var = this.i;
        if (h1Var.j()) {
            DisplayMetrics displayMetrics = h1Var.j.getResources().getDisplayMetrics();
            h1Var.k(TypedValue.applyDimension(i12, i7, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i7) {
        h1 h1Var = this.i;
        if (h1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i7 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = h1Var.j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArr2[i10] = Math.round(TypedValue.applyDimension(i7, iArr[i10], displayMetrics));
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

    public final void k(int i7) {
        h1 h1Var = this.i;
        if (h1Var.j()) {
            if (i7 == 0) {
                h1Var.a = 0;
                h1Var.d = -1.0f;
                h1Var.e = -1.0f;
                h1Var.c = -1.0f;
                h1Var.f = new int[0];
                h1Var.b = false;
                return;
            }
            if (i7 != 1) {
                throw new IllegalArgumentException(jg.g.j(i7, "Unknown auto-size text type: "));
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
            this.h = new c3();
        }
        c3 c3Var = this.h;
        c3Var.c = colorStateList;
        c3Var.b = colorStateList != null;
        this.b = c3Var;
        this.c = c3Var;
        this.d = c3Var;
        this.e = c3Var;
        this.f = c3Var;
        this.g = c3Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new c3();
        }
        c3 c3Var = this.h;
        c3Var.d = mode;
        c3Var.a = mode != null;
        this.b = c3Var;
        this.c = c3Var;
        this.d = c3Var;
        this.e = c3Var;
        this.f = c3Var;
        this.g = c3Var;
    }

    public final void n(Context context, h6.m mVar) {
        String string;
        int i7 = this.j;
        TypedArray typedArray = (TypedArray) mVar.c;
        this.j = typedArray.getInt(2, i7);
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
            h2.j0 j0Var = new h2.j0();
            j0Var.d = this;
            j0Var.a = i14;
            j0Var.b = i15;
            j0Var.c = weakReference;
            try {
                Typeface r10 = mVar.r(i13, this.j, j0Var);
                if (r10 != null) {
                    if (i10 < 28 || this.k == -1) {
                        this.l = r10;
                    } else {
                        this.l = w0.a(Typeface.create(r10, 0), this.k, (this.j & 2) != 0);
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
            this.l = w0.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
