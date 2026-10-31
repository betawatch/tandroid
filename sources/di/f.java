package di;

import android.text.SpannableString;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public class f extends SpannableString {
    public volatile boolean a;

    public f(CharSequence charSequence) {
        super(charSequence);
        this.a = false;
    }

    public static Object[] a(f fVar, int i10, Class cls) {
        return super.getSpans(0, i10, cls);
    }

    public static int b(f fVar, Object obj) {
        return super.getSpanStart(obj);
    }

    public static int c(f fVar, Object obj) {
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int getSpanEnd(Object obj) {
        if (this.a) {
            return super.getSpanEnd(obj);
        }
        return -1;
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int getSpanFlags(Object obj) {
        if (this.a) {
            return super.getSpanFlags(obj);
        }
        return 0;
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int getSpanStart(Object obj) {
        if (this.a) {
            return super.getSpanStart(obj);
        }
        return -1;
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public Object[] getSpans(int i10, int i11, Class cls) {
        return !this.a ? (Object[]) Array.newInstance((Class<?>) cls, 0) : super.getSpans(i10, i11, cls);
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return !this.a ? i11 : super.nextSpanTransition(i10, i11, cls);
    }
}
