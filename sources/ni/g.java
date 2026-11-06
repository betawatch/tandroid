package ni;

import android.text.SpannableString;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public class g extends SpannableString {
    public volatile boolean a;

    public g(CharSequence charSequence) {
        super(charSequence);
        this.a = false;
    }

    public static Object[] a(g gVar, int i7, Class cls) {
        return super.getSpans(0, i7, cls);
    }

    public static int b(g gVar, Object obj) {
        return super.getSpanStart(obj);
    }

    public static int c(g gVar, Object obj) {
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
    public Object[] getSpans(int i7, int i10, Class cls) {
        return !this.a ? (Object[]) Array.newInstance((Class<?>) cls, 0) : super.getSpans(i7, i10, cls);
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int nextSpanTransition(int i7, int i10, Class cls) {
        return !this.a ? i10 : super.nextSpanTransition(i7, i10, cls);
    }
}
