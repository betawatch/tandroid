package ai;

import a8.sa;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.Editable;
import android.view.inputmethod.BaseInputConnection;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class j2 {
    public final TextView a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean g;
    public a0 h;
    public f2 i;
    public i2 j;
    public LinearGradient k;
    public float m;
    public float f = 0.5f;
    public final Matrix l = new Matrix();
    public final sa n = new sa(this, 3);

    public j2(TextView textView) {
        this.a = textView;
    }

    public static float b(float f10) {
        return f10 < 0.5f ? com.google.android.gms.internal.vision.e2.D(f10, 4.0f, f10, f10) : 1.0f - (((float) Math.pow((f10 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
    }

    public final void a() {
        Editable editableText = this.a.getEditableText();
        if (editableText == null) {
            return;
        }
        for (g2 g2Var : (g2[]) editableText.getSpans(0, editableText.length(), g2.class)) {
            editableText.removeSpan(g2Var);
        }
        for (h2 h2Var : (h2[]) editableText.getSpans(0, editableText.length(), h2.class)) {
            editableText.removeSpan(h2Var);
        }
        for (f2 f2Var : (f2[]) editableText.getSpans(0, editableText.length(), f2.class)) {
            editableText.removeSpan(f2Var);
        }
        this.i = null;
    }

    public final void c(int i7, int i10, boolean z10) {
        this.b = i7;
        this.c = i10;
        this.d = u0.e(z10 ? -10777345 : -15374904);
        this.e = u0.e(z10 ? -6128385 : -15823740);
        this.f = z10 ? 0.6f : 0.75f;
        this.k = null;
    }

    public final void d(Editable editable, int i7) {
        int length = editable.length();
        int max = Math.max(0, Math.min(i7, length));
        long uptimeMillis = SystemClock.uptimeMillis();
        Object obj = this.i;
        if (obj != null) {
            int spanStart = editable.getSpanStart(obj);
            if (spanStart >= 0 && spanStart < max) {
                f2 f2Var = new f2();
                f2Var.a = uptimeMillis;
                editable.setSpan(f2Var, spanStart, max, 33);
            }
            editable.removeSpan(this.i);
            this.i = null;
        }
        for (Object obj2 : (f2[]) editable.getSpans(0, length, f2.class)) {
            int spanStart2 = editable.getSpanStart(obj2);
            int spanEnd = editable.getSpanEnd(obj2);
            editable.removeSpan(obj2);
            if (spanEnd > spanStart2) {
                editable.setSpan(obj2, spanStart2, spanEnd, 33);
            }
        }
        if (max < length) {
            f2 f2Var2 = new f2();
            this.i = f2Var2;
            editable.setSpan(f2Var2, max, length, 33);
        }
        g();
    }

    public final void e(int i7, int i10, String str) {
        long j3;
        TextView textView = this.a;
        Editable editableText = textView.getEditableText();
        if (editableText == null) {
            return;
        }
        boolean z10 = false;
        int max = Math.max(0, Math.min(i7, editableText.length()));
        String charSequence = editableText.subSequence(max, editableText.length()).toString();
        if (charSequence.equals(str)) {
            d(editableText, i10 < 0 ? editableText.length() : max + i10);
            return;
        }
        int min = Math.min(charSequence.length(), str.length());
        int i11 = 0;
        while (i11 < min && charSequence.charAt(i11) == str.charAt(i11)) {
            i11++;
        }
        String substring = str.substring(i11);
        int i12 = 0;
        for (String str2 : charSequence.substring(i11).trim().split("\\s+")) {
            int length = str2.length();
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                if (Character.isLetterOrDigit(str2.charAt(i13))) {
                    i12++;
                    break;
                }
                i13++;
            }
        }
        BaseInputConnection.removeComposingSpans(editableText);
        int i14 = i11 + max;
        boolean z11 = i14 == editableText.length();
        if (z11) {
            editableText.append((CharSequence) substring);
        } else {
            editableText.replace(i14, editableText.length(), substring);
        }
        int length2 = substring.length() + i14;
        if (z11) {
            i12 = 0;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        int i15 = 0;
        int i16 = 0;
        while (i14 < length2) {
            while (i14 < length2 && Character.isWhitespace(editableText.charAt(i14))) {
                i14++;
            }
            if (i14 >= length2) {
                break;
            }
            int i17 = i14;
            while (i17 < length2 && !Character.isWhitespace(editableText.charAt(i17))) {
                i17++;
            }
            boolean z12 = i15 < i12 ? true : z10;
            int i18 = i14;
            while (true) {
                if (i18 >= i17) {
                    break;
                }
                if (Character.isLetterOrDigit(editableText.charAt(i18))) {
                    i15++;
                    break;
                }
                i18++;
            }
            int i19 = i15;
            long j10 = z12 ? 0L : (i16 * 22) + uptimeMillis;
            int i20 = i14;
            while (true) {
                if (i20 <= 0) {
                    j3 = 0;
                    break;
                }
                j3 = 0;
                if (Character.isWhitespace(editableText.charAt(i20 - 1))) {
                    break;
                } else {
                    i20--;
                }
            }
            int i21 = length2;
            int i22 = i17;
            while (i22 < editableText.length() && !Character.isWhitespace(editableText.charAt(i22))) {
                i22++;
            }
            Object[] objArr = (g2[]) editableText.getSpans(i20, i22, g2.class);
            int i23 = max;
            int length3 = objArr.length;
            int i24 = 0;
            while (i24 < length3) {
                int i25 = i24;
                Object obj = objArr[i25];
                int i26 = length3;
                if (editableText.getSpanStart(obj) < i22 && editableText.getSpanEnd(obj) > i20) {
                    editableText.removeSpan(obj);
                }
                i24 = i25 + 1;
                length3 = i26;
            }
            if (j10 > j3) {
                h2 h2Var = new h2(j10, this.b);
                h2Var.c = i17 - i14;
                editableText.setSpan(h2Var, i14, i17, 33);
            }
            int i27 = i14;
            editableText.setSpan(new g2(Math.max(uptimeMillis, j10), this.b, this.c), i20, i22, 33);
            if (!z12) {
                i16 += i17 - i27;
            }
            i15 = i19;
            i14 = i17;
            length2 = i21;
            max = i23;
            z10 = false;
        }
        d(editableText, i10 < 0 ? editableText.length() : max + i10);
        if (textView instanceof EditText) {
            ((EditText) textView).setSelection(editableText.length());
        }
        g();
    }

    public final void f(boolean z10) {
        Editable editableText = this.a.getEditableText();
        if (editableText == null) {
            return;
        }
        if (!z10) {
            i2 i2Var = this.j;
            if (i2Var != null) {
                this.m = 0.0f;
                editableText.removeSpan(i2Var);
                return;
            }
            return;
        }
        if (this.k == null) {
            float L = org.telegram.messenger.g0.L(150.0f);
            int f10 = i0.a.f(this.f, this.c, this.d);
            int f11 = i0.a.f(this.f, this.c, this.e);
            this.k = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{this.c, f10, i0.a.f(0.5f, f10, f11), f11, this.c}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.MIRROR);
        }
        int i7 = 0;
        if (this.j == null) {
            this.j = new i2(this, i7);
        }
        this.m = 1.0f;
        editableText.setSpan(this.j, 0, editableText.length(), 18);
        g();
    }

    public final void g() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.a.postOnAnimation(this.n);
    }
}
