// default package

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.Editable;
import android.view.inputmethod.BaseInputConnection;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ho3 {
    public final TextView a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean g;
    public um3 h;
    public do3 i;
    public go3 j;
    public LinearGradient k;
    public float m;
    public float f = 0.5f;
    public final Matrix l = new Matrix();
    public final p1 n = new p1(this, 23);

    public ho3(TextView textView) {
        this.a = textView;
    }

    public static float b(float f) {
        return f < 0.5f ? xnb.C(f, 4.0f, f, f) : 1.0f - (((float) Math.pow((f * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
    }

    public final void a() {
        Editable editableText = this.a.getEditableText();
        if (editableText == null) {
            return;
        }
        for (eo3 eo3Var : (eo3[]) editableText.getSpans(0, editableText.length(), eo3.class)) {
            editableText.removeSpan(eo3Var);
        }
        for (fo3 fo3Var : (fo3[]) editableText.getSpans(0, editableText.length(), fo3.class)) {
            editableText.removeSpan(fo3Var);
        }
        for (do3 do3Var : (do3[]) editableText.getSpans(0, editableText.length(), do3.class)) {
            editableText.removeSpan(do3Var);
        }
        this.i = null;
    }

    public final void c(int i, int i2, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = gn3.e(z ? -10777345 : -15374904);
        this.e = gn3.e(z ? -6128385 : -15823740);
        this.f = z ? 0.6f : 0.75f;
        this.k = null;
    }

    public final void d(Editable editable, int i) {
        int length = editable.length();
        int max = Math.max(0, Math.min(i, length));
        long uptimeMillis = SystemClock.uptimeMillis();
        Object obj = this.i;
        if (obj != null) {
            int spanStart = editable.getSpanStart(obj);
            if (spanStart >= 0 && spanStart < max) {
                do3 do3Var = new do3();
                do3Var.a = uptimeMillis;
                editable.setSpan(do3Var, spanStart, max, 33);
            }
            editable.removeSpan(this.i);
            this.i = null;
        }
        for (Object obj2 : (do3[]) editable.getSpans(0, length, do3.class)) {
            int spanStart2 = editable.getSpanStart(obj2);
            int spanEnd = editable.getSpanEnd(obj2);
            editable.removeSpan(obj2);
            if (spanEnd > spanStart2) {
                editable.setSpan(obj2, spanStart2, spanEnd, 33);
            }
        }
        if (max < length) {
            do3 do3Var2 = new do3();
            this.i = do3Var2;
            editable.setSpan(do3Var2, max, length, 33);
        }
        g();
    }

    public final void e(int i, int i2, String str) {
        long j;
        TextView textView = this.a;
        Editable editableText = textView.getEditableText();
        if (editableText == null) {
            return;
        }
        boolean z = false;
        int max = Math.max(0, Math.min(i, editableText.length()));
        String charSequence = editableText.subSequence(max, editableText.length()).toString();
        if (charSequence.equals(str)) {
            d(editableText, i2 < 0 ? editableText.length() : max + i2);
            return;
        }
        int min = Math.min(charSequence.length(), str.length());
        int i3 = 0;
        while (i3 < min && charSequence.charAt(i3) == str.charAt(i3)) {
            i3++;
        }
        String substring = str.substring(i3);
        int i4 = 0;
        for (String str2 : charSequence.substring(i3).trim().split("\\s+")) {
            int length = str2.length();
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (Character.isLetterOrDigit(str2.charAt(i5))) {
                    i4++;
                    break;
                }
                i5++;
            }
        }
        BaseInputConnection.removeComposingSpans(editableText);
        int i6 = i3 + max;
        boolean z2 = i6 == editableText.length();
        if (z2) {
            editableText.append((CharSequence) substring);
        } else {
            editableText.replace(i6, editableText.length(), substring);
        }
        int length2 = substring.length() + i6;
        if (z2) {
            i4 = 0;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        int i7 = 0;
        int i8 = 0;
        loop3: while (i6 < length2) {
            while (i6 < length2) {
                if (Character.isWhitespace(editableText.charAt(i6))) {
                    i6++;
                } else {
                    int i9 = i6;
                    while (i9 < length2 && !Character.isWhitespace(editableText.charAt(i9))) {
                        i9++;
                    }
                    boolean z3 = i7 < i4 ? true : z;
                    int i10 = i6;
                    while (true) {
                        if (i10 >= i9) {
                            break;
                        }
                        if (Character.isLetterOrDigit(editableText.charAt(i10))) {
                            i7++;
                            break;
                        }
                        i10++;
                    }
                    int i11 = i7;
                    long j2 = z3 ? 0L : (i8 * 22) + uptimeMillis;
                    int i12 = i6;
                    while (true) {
                        if (i12 <= 0) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (Character.isWhitespace(editableText.charAt(i12 - 1))) {
                            break;
                        } else {
                            i12--;
                        }
                    }
                    int i13 = length2;
                    int i14 = i9;
                    while (i14 < editableText.length() && !Character.isWhitespace(editableText.charAt(i14))) {
                        i14++;
                    }
                    Object[] objArr = (eo3[]) editableText.getSpans(i12, i14, eo3.class);
                    int i15 = max;
                    int length3 = objArr.length;
                    int i16 = 0;
                    while (i16 < length3) {
                        int i17 = i16;
                        Object obj = objArr[i17];
                        int i18 = length3;
                        if (editableText.getSpanStart(obj) < i14 && editableText.getSpanEnd(obj) > i12) {
                            editableText.removeSpan(obj);
                        }
                        i16 = i17 + 1;
                        length3 = i18;
                    }
                    if (j2 > j) {
                        fo3 fo3Var = new fo3(j2, this.b);
                        fo3Var.c = i9 - i6;
                        editableText.setSpan(fo3Var, i6, i9, 33);
                    }
                    int i19 = i6;
                    editableText.setSpan(new eo3(Math.max(uptimeMillis, j2), this.b, this.c), i12, i14, 33);
                    if (!z3) {
                        i8 += i9 - i19;
                    }
                    i7 = i11;
                    i6 = i9;
                    length2 = i13;
                    max = i15;
                    z = false;
                }
            }
            break loop3;
        }
        d(editableText, i2 < 0 ? editableText.length() : max + i2);
        if (textView instanceof EditText) {
            ((EditText) textView).setSelection(editableText.length());
        }
        g();
    }

    public final void f(boolean z) {
        Editable editableText = this.a.getEditableText();
        if (editableText != null) {
            if (!z) {
                go3 go3Var = this.j;
                if (go3Var != null) {
                    this.m = 0.0f;
                    editableText.removeSpan(go3Var);
                    return;
                }
                return;
            }
            if (this.k == null) {
                float L = hl.L(150.0f);
                int f = vm2.f(this.f, this.c, this.d);
                int f2 = vm2.f(this.f, this.c, this.e);
                this.k = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{this.c, f, vm2.f(0.5f, f, f2), f2, this.c}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.MIRROR);
            }
            go3 go3Var2 = this.j;
            byte b = 0;
            if (go3Var2 == null) {
                go3Var2 = new go3(this, b);
                this.j = go3Var2;
            }
            this.m = 1.0f;
            editableText.setSpan(go3Var2, 0, editableText.length(), 18);
            g();
        }
    }

    public final void g() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.a.postOnAnimation(this.n);
    }
}
