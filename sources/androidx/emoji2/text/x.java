package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x implements Spannable {
    public boolean a = false;
    public Spannable b;

    public x(Spannable spannable) {
        this.b = spannable;
    }

    public final void a() {
        Spannable spannable = this.b;
        if (!this.a) {
            if ((Build.VERSION.SDK_INT < 28 ? new wa.a(2) : new w(2)).A3(spannable)) {
                this.b = new SpannableString(spannable);
            }
        }
        this.a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i9) {
        return this.b.charAt(i9);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i9, int i10, Class cls) {
        return this.b.getSpans(i9, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i9, int i10, Class cls) {
        return this.b.nextSpanTransition(i9, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i9, int i10, int i11) {
        a();
        this.b.setSpan(obj, i9, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i9, int i10) {
        return this.b.subSequence(i9, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b.toString();
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream chars() {
        return v.b(this.b);
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream codePoints() {
        return v.c(this.b);
    }

    public x(CharSequence charSequence) {
        this.b = new SpannableString(charSequence);
    }
}
