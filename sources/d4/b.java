package d4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b {
    public final ArrayList a;
    public final ArrayList b;
    public final StringBuilder c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public b(int i7, int i10) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.c = sb2;
        this.g = i7;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
        this.h = i10;
    }

    public final void a(char c10) {
        StringBuilder sb2 = this.c;
        if (sb2.length() < 32) {
            sb2.append(c10);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i7 = aVar.c;
                if (i7 != length) {
                    return;
                }
                aVar.c = i7 - 1;
            }
        }
    }

    public final g2.b c(int i7) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i10));
            spannableStringBuilder.append('\n');
            i10++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i11 = this.e + this.f;
        int length = (32 - i11) - spannableStringBuilder.length();
        int i12 = i11 - length;
        int i13 = i7 != Integer.MIN_VALUE ? i7 : (this.g != 2 || (Math.abs(i12) >= 3 && length >= 0)) ? (this.g != 2 || i12 <= 0) ? 0 : 2 : 1;
        float c10 = i13 != 1 ? i13 != 2 ? com.google.android.recaptcha.internal.a.c(i11, 32.0f, 0.8f, 0.1f) : com.google.android.recaptcha.internal.a.c(32 - length, 32.0f, 0.8f, 0.1f) : 0.5f;
        int i14 = this.d;
        if (i14 > 7) {
            i14 -= 17;
        } else if (this.g == 1) {
            i14 -= this.h - 1;
        }
        return new g2.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i14, 1, TLObject.FLAG_31, c10, i13, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
        int length = spannableStringBuilder.length();
        int i7 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = this.a;
            if (i13 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i13);
            boolean z10 = aVar.b;
            int i15 = aVar.a;
            if (i15 != 8) {
                boolean z11 = i15 == 7;
                if (i15 != 7) {
                    i12 = c.B[i15];
                }
                z9 = z11;
            }
            int i16 = aVar.c;
            i13++;
            if (i16 != (i13 < arrayList.size() ? ((a) arrayList.get(i13)).c : length)) {
                if (i7 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i7, i16, 33);
                    i7 = -1;
                } else if (i7 == -1 && z10) {
                    i7 = i16;
                }
                if (i10 != -1 && !z9) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i10, i16, 33);
                    i10 = -1;
                } else if (i10 == -1 && z9) {
                    i10 = i16;
                }
                if (i12 != i11) {
                    if (i11 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i14, i16, 33);
                    }
                    i11 = i12;
                    i14 = i16;
                }
            }
        }
        if (i7 != -1 && i7 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
        }
        if (i10 != -1 && i10 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
        }
        if (i14 != length && i11 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i14, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
    }
}
