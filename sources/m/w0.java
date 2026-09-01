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
import j7.s7;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import k7.x7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class w0 {
    public final TextView a;
    public e3 b;
    public e3 c;
    public e3 d;
    public e3 e;
    public e3 f;
    public e3 g;
    public e3 h;
    public final g1 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public w0(TextView textView) {
        this.a = textView;
        this.i = new g1(textView);
    }

    public static e3 c(Context context, q qVar, int i10) {
        ColorStateList i11;
        synchronized (qVar) {
            i11 = qVar.a.i(context, i10);
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
        q.d(drawable, e3Var, this.a.getDrawableState());
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
        Drawable[] a2 = r0.a(textView);
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
    /* JADX WARN: Removed duplicated region for block: B:104:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0465 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AttributeSet attributeSet, int i10) {
        String str;
        boolean z4;
        boolean z10;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        String str2;
        q qVar;
        int i11;
        g1 g1Var;
        TypedArray obtainStyledAttributes;
        TypedArray obtainStyledAttributes2;
        Drawable b10;
        Drawable b11;
        Drawable b12;
        Drawable b13;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        ColorStateList colorStateList4;
        int resourceId;
        int[] iArr;
        int i12;
        int resourceId2;
        int length;
        int i13;
        TextView textView = this.a;
        Context context = textView.getContext();
        q a2 = q.a();
        int[] iArr2 = f.a.h;
        l7.w0 y10 = l7.w0.y(context, attributeSet, iArr2, i10);
        r0.j0.j(textView, textView.getContext(), iArr2, attributeSet, (TypedArray) y10.c, i10);
        TypedArray typedArray = (TypedArray) y10.c;
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
        int i14 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f = c(context, a2, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, a2, typedArray.getResourceId(6, 0));
        }
        y10.A();
        boolean z11 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr3 = f.a.w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(resourceId3, iArr3);
            l7.w0 w0Var = new l7.w0(context, obtainStyledAttributes3);
            if (z11 || !obtainStyledAttributes3.hasValue(14)) {
                z4 = false;
                z10 = false;
            } else {
                z10 = obtainStyledAttributes3.getBoolean(14, false);
                z4 = true;
            }
            n(context, w0Var);
            if (i14 < 23) {
                colorStateList = obtainStyledAttributes3.hasValue(3) ? w0Var.r(3) : null;
                colorStateList2 = obtainStyledAttributes3.hasValue(4) ? w0Var.r(4) : null;
                if (obtainStyledAttributes3.hasValue(5)) {
                    colorStateList3 = w0Var.r(5);
                    i13 = 15;
                    str2 = !obtainStyledAttributes3.hasValue(i13) ? obtainStyledAttributes3.getString(i13) : null;
                    str = (i14 >= 26 || !obtainStyledAttributes3.hasValue(13)) ? null : obtainStyledAttributes3.getString(13);
                    w0Var.A();
                } else {
                    i13 = 15;
                }
            } else {
                i13 = 15;
                colorStateList = null;
                colorStateList2 = null;
            }
            colorStateList3 = null;
            if (!obtainStyledAttributes3.hasValue(i13)) {
            }
            if (i14 >= 26) {
            }
            w0Var.A();
        } else {
            str = null;
            z4 = false;
            z10 = false;
            colorStateList = null;
            colorStateList2 = null;
            colorStateList3 = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        l7.w0 w0Var2 = new l7.w0(context, obtainStyledAttributes4);
        if (!z11 && obtainStyledAttributes4.hasValue(14)) {
            z10 = obtainStyledAttributes4.getBoolean(14, false);
            z4 = true;
        }
        boolean z12 = z10;
        if (i14 < 23) {
            if (obtainStyledAttributes4.hasValue(3)) {
                colorStateList = w0Var2.r(3);
            }
            if (obtainStyledAttributes4.hasValue(4)) {
                colorStateList2 = w0Var2.r(4);
            }
            if (obtainStyledAttributes4.hasValue(5)) {
                colorStateList3 = w0Var2.r(5);
            }
        }
        ColorStateList colorStateList5 = colorStateList;
        ColorStateList colorStateList6 = colorStateList2;
        ColorStateList colorStateList7 = colorStateList3;
        if (obtainStyledAttributes4.hasValue(15)) {
            str2 = obtainStyledAttributes4.getString(15);
        }
        String str3 = str2;
        if (i14 >= 26 && obtainStyledAttributes4.hasValue(13)) {
            str = obtainStyledAttributes4.getString(13);
        }
        if (i14 < 28 || !obtainStyledAttributes4.hasValue(0)) {
            qVar = a2;
        } else {
            qVar = a2;
            if (obtainStyledAttributes4.getDimensionPixelSize(0, -1) == 0) {
                textView.setTextSize(0, 0.0f);
            }
        }
        n(context, w0Var2);
        w0Var2.A();
        if (colorStateList5 != null) {
            textView.setTextColor(colorStateList5);
        }
        if (colorStateList6 != null) {
            textView.setHintTextColor(colorStateList6);
        }
        if (colorStateList7 != null) {
            textView.setLinkTextColor(colorStateList7);
        }
        if (!z11 && z4) {
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
            u0.d(textView, str);
        }
        if (str3 != null) {
            if (i14 < 24) {
                i11 = 0;
                r0.c(textView, s0.a(str3.split(",")[0]));
                g1Var = this.i;
                Context context2 = g1Var.j;
                int[] iArr4 = f.a.i;
                obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr4, i10, i11);
                TextView textView2 = g1Var.i;
                r0.j0.j(textView2, textView2.getContext(), iArr4, attributeSet, obtainStyledAttributes, i10);
                if (obtainStyledAttributes.hasValue(5)) {
                    g1Var.a = obtainStyledAttributes.getInt(5, i11);
                }
                float dimension = !obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
                float dimension2 = !obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
                float dimension3 = !obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
                if (obtainStyledAttributes.hasValue(3) && (resourceId2 = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
                    TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId2);
                    length = obtainTypedArray.length();
                    int[] iArr5 = new int[length];
                    if (length > 0) {
                        for (int i15 = 0; i15 < length; i15++) {
                            iArr5[i15] = obtainTypedArray.getDimensionPixelSize(i15, -1);
                        }
                        g1Var.f = g1.b(iArr5);
                        g1Var.i();
                    }
                    obtainTypedArray.recycle();
                }
                obtainStyledAttributes.recycle();
                if (g1Var.j()) {
                    g1Var.a = 0;
                } else if (g1Var.a == 1) {
                    if (!g1Var.g) {
                        DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                        if (dimension2 == -1.0f) {
                            i12 = 2;
                            dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                        } else {
                            i12 = 2;
                        }
                        if (dimension3 == -1.0f) {
                            dimension3 = TypedValue.applyDimension(i12, 112.0f, displayMetrics);
                        }
                        if (dimension == -1.0f) {
                            dimension = 1.0f;
                        }
                        g1Var.k(dimension2, dimension3, dimension);
                    }
                    g1Var.h();
                }
                if (u3.b && g1Var.a != 0) {
                    iArr = g1Var.f;
                    if (iArr.length > 0) {
                        if (u0.a(textView) != -1.0f) {
                            u0.b(textView, Math.round(g1Var.d), Math.round(g1Var.e), Math.round(g1Var.c), 0);
                        } else {
                            u0.c(textView, iArr, 0);
                        }
                    }
                }
                obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr4);
                int resourceId4 = obtainStyledAttributes2.getResourceId(8, -1);
                q qVar2 = qVar;
                Drawable b14 = resourceId4 == -1 ? qVar2.b(context, resourceId4) : null;
                int resourceId5 = obtainStyledAttributes2.getResourceId(13, -1);
                b10 = resourceId5 == -1 ? qVar2.b(context, resourceId5) : null;
                int resourceId6 = obtainStyledAttributes2.getResourceId(9, -1);
                Drawable b15 = resourceId6 == -1 ? qVar2.b(context, resourceId6) : null;
                int resourceId7 = obtainStyledAttributes2.getResourceId(6, -1);
                b11 = resourceId7 == -1 ? qVar2.b(context, resourceId7) : null;
                int resourceId8 = obtainStyledAttributes2.getResourceId(10, -1);
                b12 = resourceId8 == -1 ? qVar2.b(context, resourceId8) : null;
                int resourceId9 = obtainStyledAttributes2.getResourceId(7, -1);
                b13 = resourceId9 == -1 ? qVar2.b(context, resourceId9) : null;
                if (b12 == null || b13 != null) {
                    Drawable[] a10 = r0.a(textView);
                    if (b12 == null) {
                        b12 = a10[0];
                    }
                    if (b10 == null) {
                        b10 = a10[1];
                    }
                    if (b13 == null) {
                        b13 = a10[2];
                    }
                    if (b11 == null) {
                        b11 = a10[3];
                    }
                    r0.b(textView, b12, b10, b13, b11);
                } else if (b14 != null || b10 != null || b15 != null || b11 != null) {
                    Drawable[] a11 = r0.a(textView);
                    Drawable drawable = a11[0];
                    if (drawable == null && a11[2] == null) {
                        Drawable[] compoundDrawables = textView.getCompoundDrawables();
                        if (b14 == null) {
                            b14 = compoundDrawables[0];
                        }
                        if (b10 == null) {
                            b10 = compoundDrawables[1];
                        }
                        if (b15 == null) {
                            b15 = compoundDrawables[2];
                        }
                        if (b11 == null) {
                            b11 = compoundDrawables[3];
                        }
                        textView.setCompoundDrawablesWithIntrinsicBounds(b14, b10, b15, b11);
                    } else {
                        if (b10 == null) {
                            b10 = a11[1];
                        }
                        Drawable drawable2 = a11[2];
                        if (b11 == null) {
                            b11 = a11[3];
                        }
                        r0.b(textView, drawable, b10, drawable2, b11);
                    }
                }
                if (obtainStyledAttributes2.hasValue(11)) {
                    if (!obtainStyledAttributes2.hasValue(11) || (resourceId = obtainStyledAttributes2.getResourceId(11, 0)) == 0 || (colorStateList4 = s7.a(context, resourceId)) == null) {
                        colorStateList4 = obtainStyledAttributes2.getColorStateList(11);
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        e0.b.s(textView, colorStateList4);
                    } else if (textView instanceof u0.k) {
                        ((u0.k) textView).setSupportCompoundDrawablesTintList(colorStateList4);
                    }
                }
                if (obtainStyledAttributes2.hasValue(12)) {
                    PorterDuff.Mode b16 = l1.b(obtainStyledAttributes2.getInt(12, -1), null);
                    if (Build.VERSION.SDK_INT >= 24) {
                        e0.b.t(textView, b16);
                    } else if (textView instanceof u0.k) {
                        ((u0.k) textView).setSupportCompoundDrawablesTintMode(b16);
                    }
                }
                dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(15, -1);
                dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(18, -1);
                dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(19, -1);
                obtainStyledAttributes2.recycle();
                if (dimensionPixelSize != -1) {
                    x7.b(dimensionPixelSize, textView);
                }
                if (dimensionPixelSize2 != -1) {
                    x7.c(dimensionPixelSize2, textView);
                }
                if (dimensionPixelSize3 == -1) {
                    if (dimensionPixelSize3 < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                        textView.setLineSpacing(dimensionPixelSize3 - r1, 1.0f);
                        return;
                    }
                    return;
                }
                return;
            }
            t0.b(textView, t0.a(str3));
        }
        i11 = 0;
        g1Var = this.i;
        Context context22 = g1Var.j;
        int[] iArr42 = f.a.i;
        obtainStyledAttributes = context22.obtainStyledAttributes(attributeSet, iArr42, i10, i11);
        TextView textView22 = g1Var.i;
        r0.j0.j(textView22, textView22.getContext(), iArr42, attributeSet, obtainStyledAttributes, i10);
        if (obtainStyledAttributes.hasValue(5)) {
        }
        if (!obtainStyledAttributes.hasValue(4)) {
        }
        if (!obtainStyledAttributes.hasValue(2)) {
        }
        if (!obtainStyledAttributes.hasValue(1)) {
        }
        if (obtainStyledAttributes.hasValue(3)) {
            TypedArray obtainTypedArray2 = obtainStyledAttributes.getResources().obtainTypedArray(resourceId2);
            length = obtainTypedArray2.length();
            int[] iArr52 = new int[length];
            if (length > 0) {
            }
            obtainTypedArray2.recycle();
        }
        obtainStyledAttributes.recycle();
        if (g1Var.j()) {
        }
        if (u3.b) {
            iArr = g1Var.f;
            if (iArr.length > 0) {
            }
        }
        obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr42);
        int resourceId42 = obtainStyledAttributes2.getResourceId(8, -1);
        q qVar22 = qVar;
        if (resourceId42 == -1) {
        }
        int resourceId52 = obtainStyledAttributes2.getResourceId(13, -1);
        if (resourceId52 == -1) {
        }
        int resourceId62 = obtainStyledAttributes2.getResourceId(9, -1);
        if (resourceId62 == -1) {
        }
        int resourceId72 = obtainStyledAttributes2.getResourceId(6, -1);
        if (resourceId72 == -1) {
        }
        int resourceId82 = obtainStyledAttributes2.getResourceId(10, -1);
        if (resourceId82 == -1) {
        }
        int resourceId92 = obtainStyledAttributes2.getResourceId(7, -1);
        if (resourceId92 == -1) {
        }
        if (b12 == null) {
        }
        Drawable[] a102 = r0.a(textView);
        if (b12 == null) {
        }
        if (b10 == null) {
        }
        if (b13 == null) {
        }
        if (b11 == null) {
        }
        r0.b(textView, b12, b10, b13, b11);
        if (obtainStyledAttributes2.hasValue(11)) {
        }
        if (obtainStyledAttributes2.hasValue(12)) {
        }
        dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(15, -1);
        dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(18, -1);
        dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(19, -1);
        obtainStyledAttributes2.recycle();
        if (dimensionPixelSize != -1) {
        }
        if (dimensionPixelSize2 != -1) {
        }
        if (dimensionPixelSize3 == -1) {
        }
    }

    public final void g(Context context, int i10) {
        String string;
        ColorStateList r10;
        ColorStateList r11;
        ColorStateList r12;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, f.a.w);
        l7.w0 w0Var = new l7.w0(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            if (obtainStyledAttributes.hasValue(3) && (r12 = w0Var.r(3)) != null) {
                textView.setTextColor(r12);
            }
            if (obtainStyledAttributes.hasValue(5) && (r11 = w0Var.r(5)) != null) {
                textView.setLinkTextColor(r11);
            }
            if (obtainStyledAttributes.hasValue(4) && (r10 = w0Var.r(4)) != null) {
                textView.setHintTextColor(r10);
            }
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, w0Var);
        if (i11 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            u0.d(textView, string);
        }
        w0Var.A();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        g1 g1Var = this.i;
        if (g1Var.j()) {
            DisplayMetrics displayMetrics = g1Var.j.getResources().getDisplayMetrics();
            g1Var.k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (g1Var.h()) {
                g1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i10) {
        g1 g1Var = this.i;
        if (g1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = g1Var.j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
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

    public final void k(int i10) {
        g1 g1Var = this.i;
        if (g1Var.j()) {
            if (i10 == 0) {
                g1Var.a = 0;
                g1Var.d = -1.0f;
                g1Var.e = -1.0f;
                g1Var.c = -1.0f;
                g1Var.f = new int[0];
                g1Var.b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(l.d.j(i10, "Unknown auto-size text type: "));
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

    public final void n(Context context, l7.w0 w0Var) {
        String string;
        int i10 = this.j;
        TypedArray typedArray = (TypedArray) w0Var.c;
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
            h5.b0 b0Var = new h5.b0();
            b0Var.d = this;
            b0Var.a = i15;
            b0Var.b = i16;
            b0Var.c = weakReference;
            try {
                Typeface v = w0Var.v(i14, this.j, b0Var);
                if (v != null) {
                    if (i11 < 28 || this.k == -1) {
                        this.l = v;
                    } else {
                        this.l = v0.a(Typeface.create(v, 0), this.k, (this.j & 2) != 0);
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
            this.l = v0.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
