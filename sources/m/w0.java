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
import v7.u7;
import w7.q7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class w0 {
    public final TextView a;
    public c3 b;
    public c3 c;
    public c3 d;
    public c3 e;
    public c3 f;
    public c3 g;
    public c3 h;
    public final g1 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public w0(TextView textView) {
        this.a = textView;
        this.i = new g1(textView);
    }

    public static c3 c(Context context, q qVar, int i10) {
        ColorStateList i11;
        synchronized (qVar) {
            i11 = qVar.a.i(context, i10);
        }
        if (i11 == null) {
            return null;
        }
        c3 c3Var = new c3();
        c3Var.b = true;
        c3Var.c = i11;
        return c3Var;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i10 >= 30) {
            t0.b.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i10 >= 30) {
            t0.b.a(editorInfo, text);
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
            t0.c.c(editorInfo, null, 0, 0);
            return;
        }
        int i14 = editorInfo.inputType & 4095;
        if (i14 == 129 || i14 == 225 || i14 == 18) {
            t0.c.c(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            t0.c.c(editorInfo, text, i13, i11);
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
        t0.c.c(editorInfo, i16 != i15 ? TextUtils.concat(text.subSequence(i18, i18 + min2), text.subSequence(i11, min + i11)) : text.subSequence(i18, i19 + min + i18), min2, i19);
    }

    public final void a(Drawable drawable, c3 c3Var) {
        if (drawable == null || c3Var == null) {
            return;
        }
        q.d(drawable, c3Var, this.a.getDrawableState());
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
        Drawable[] a2 = r0.a(textView);
        a(a2[0], this.f);
        a(a2[2], this.g);
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
        boolean z10;
        boolean z11;
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
        aa.a y3 = aa.a.y(context, attributeSet, iArr2, i10);
        r0.i0.j(textView, textView.getContext(), iArr2, attributeSet, (TypedArray) y3.c, i10);
        TypedArray typedArray = (TypedArray) y3.c;
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
        y3.A();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr3 = f.a.w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(resourceId3, iArr3);
            aa.a aVar = new aa.a(context, obtainStyledAttributes3);
            if (z12 || !obtainStyledAttributes3.hasValue(14)) {
                z10 = false;
                z11 = false;
            } else {
                z11 = obtainStyledAttributes3.getBoolean(14, false);
                z10 = true;
            }
            n(context, aVar);
            if (i14 < 23) {
                colorStateList = obtainStyledAttributes3.hasValue(3) ? aVar.q(3) : null;
                colorStateList2 = obtainStyledAttributes3.hasValue(4) ? aVar.q(4) : null;
                if (obtainStyledAttributes3.hasValue(5)) {
                    colorStateList3 = aVar.q(5);
                    i13 = 15;
                    str2 = !obtainStyledAttributes3.hasValue(i13) ? obtainStyledAttributes3.getString(i13) : null;
                    str = (i14 >= 26 || !obtainStyledAttributes3.hasValue(13)) ? null : obtainStyledAttributes3.getString(13);
                    aVar.A();
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
            aVar.A();
        } else {
            str = null;
            z10 = false;
            z11 = false;
            colorStateList = null;
            colorStateList2 = null;
            colorStateList3 = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        aa.a aVar2 = new aa.a(context, obtainStyledAttributes4);
        if (!z12 && obtainStyledAttributes4.hasValue(14)) {
            z11 = obtainStyledAttributes4.getBoolean(14, false);
            z10 = true;
        }
        boolean z13 = z11;
        if (i14 < 23) {
            if (obtainStyledAttributes4.hasValue(3)) {
                colorStateList = aVar2.q(3);
            }
            if (obtainStyledAttributes4.hasValue(4)) {
                colorStateList2 = aVar2.q(4);
            }
            if (obtainStyledAttributes4.hasValue(5)) {
                colorStateList3 = aVar2.q(5);
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
        n(context, aVar2);
        aVar2.A();
        if (colorStateList5 != null) {
            textView.setTextColor(colorStateList5);
        }
        if (colorStateList6 != null) {
            textView.setHintTextColor(colorStateList6);
        }
        if (colorStateList7 != null) {
            textView.setLinkTextColor(colorStateList7);
        }
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
            if (i14 < 24) {
                i11 = 0;
                r0.c(textView, s0.a(str3.split(",")[0]));
                g1Var = this.i;
                Context context2 = g1Var.j;
                int[] iArr4 = f.a.i;
                obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr4, i10, i11);
                TextView textView2 = g1Var.i;
                r0.i0.j(textView2, textView2.getContext(), iArr4, attributeSet, obtainStyledAttributes, i10);
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
                if (s3.b && g1Var.a != 0) {
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
                    if (!obtainStyledAttributes2.hasValue(11) || (resourceId = obtainStyledAttributes2.getResourceId(11, 0)) == 0 || (colorStateList4 = u7.a(context, resourceId)) == null) {
                        colorStateList4 = obtainStyledAttributes2.getColorStateList(11);
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        e0.b.z(textView, colorStateList4);
                    } else if (textView instanceof u0.k) {
                        ((u0.k) textView).setSupportCompoundDrawablesTintList(colorStateList4);
                    }
                }
                if (obtainStyledAttributes2.hasValue(12)) {
                    PorterDuff.Mode b16 = l1.b(obtainStyledAttributes2.getInt(12, -1), null);
                    if (Build.VERSION.SDK_INT >= 24) {
                        e0.b.A(textView, b16);
                    } else if (textView instanceof u0.k) {
                        ((u0.k) textView).setSupportCompoundDrawablesTintMode(b16);
                    }
                }
                dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(15, -1);
                dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(18, -1);
                dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(19, -1);
                obtainStyledAttributes2.recycle();
                if (dimensionPixelSize != -1) {
                    q7.b(dimensionPixelSize, textView);
                }
                if (dimensionPixelSize2 != -1) {
                    q7.c(dimensionPixelSize2, textView);
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
        r0.i0.j(textView22, textView22.getContext(), iArr42, attributeSet, obtainStyledAttributes, i10);
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
        if (s3.b) {
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
        ColorStateList q6;
        ColorStateList q10;
        ColorStateList q11;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, f.a.w);
        aa.a aVar = new aa.a(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            if (obtainStyledAttributes.hasValue(3) && (q11 = aVar.q(3)) != null) {
                textView.setTextColor(q11);
            }
            if (obtainStyledAttributes.hasValue(5) && (q10 = aVar.q(5)) != null) {
                textView.setLinkTextColor(q10);
            }
            if (obtainStyledAttributes.hasValue(4) && (q6 = aVar.q(4)) != null) {
                textView.setHintTextColor(q6);
            }
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, aVar);
        if (i11 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            u0.d(textView, string);
        }
        aVar.A();
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
                throw new IllegalArgumentException(i2.g.i(i10, "Unknown auto-size text type: "));
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

    public final void n(Context context, aa.a aVar) {
        String string;
        int i10 = this.j;
        TypedArray typedArray = (TypedArray) aVar.c;
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
            e2.a0 a0Var = new e2.a0();
            a0Var.d = this;
            a0Var.a = i15;
            a0Var.b = i16;
            a0Var.c = weakReference;
            try {
                Typeface t10 = aVar.t(i14, this.j, a0Var);
                if (t10 != null) {
                    if (i11 < 28 || this.k == -1) {
                        this.l = t10;
                    } else {
                        this.l = v0.a(Typeface.create(t10, 0), this.k, (this.j & 2) != 0);
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
