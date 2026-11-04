package oi;

import android.text.SpannableString;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public class e extends SpannableString {
    public volatile boolean a;

    public e(CharSequence charSequence) {
        super(charSequence);
        this.a = false;
    }

    public static Object[] a(e eVar, int i3, Class cls) {
        return super.getSpans(0, i3, cls);
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
    public Object[] getSpans(int i3, int i10, Class cls) {
        return !this.a ? (Object[]) Array.newInstance((Class<?>) cls, 0) : super.getSpans(i3, i10, cls);
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int nextSpanTransition(int i3, int i10, Class cls) {
        return !this.a ? i10 : super.nextSpanTransition(i3, i10, cls);
    }
}
