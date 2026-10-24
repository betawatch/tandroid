package mi;

import android.text.SpannableString;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public class e extends SpannableString {
    public volatile boolean a;

    public e(CharSequence charSequence) {
        super(charSequence);
        this.a = false;
    }

    public static Object[] a(e eVar, int i10, Class cls) {
        return super.getSpans(0, i10, cls);
    }

    public static int b(e eVar, Object obj) {
        return super.getSpanStart(obj);
    }

    public static int c(e eVar, Object obj) {
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
