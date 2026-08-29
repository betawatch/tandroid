package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import i7.v6;
import nh.d6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class u {
    public final TextView a;
    public final d6 b;

    public u(TextView textView) {
        this.a = textView;
        this.b = new d6(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i10, 0);
        try {
            boolean z10 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void b(boolean z10) {
        ((v6) this.b.b).b(z10);
    }

    public final void c(boolean z10) {
        ((v6) this.b.b).c(z10);
    }
}
