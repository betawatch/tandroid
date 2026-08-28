package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import g7.q6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u {
    public final TextView a;
    public final n5.e0 b;

    public u(TextView textView) {
        this.a = textView;
        this.b = new n5.e0(textView);
    }

    public final void a(AttributeSet attributeSet, int i9) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i9, 0);
        try {
            boolean z10 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z10) {
        ((q6) this.b.b).b(z10);
    }

    public final void c(boolean z10) {
        ((q6) this.b.b).c(z10);
    }
}
