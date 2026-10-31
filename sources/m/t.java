package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import w7.r6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t {
    public final TextView a;
    public final k2.m0 b;

    public t(TextView textView) {
        this.a = textView;
        k2.m0 m0Var = new k2.m0();
        m0Var.a = new q1.g(textView);
        this.b = m0Var;
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
        ((r6) this.b.a).b(z10);
    }

    public final void c(boolean z10) {
        ((r6) this.b.a).c(z10);
    }
}
