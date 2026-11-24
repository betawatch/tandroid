// default package

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class iq {
    public final TextView a;
    public final fk3 b;

    public iq(TextView textView) {
        this.a = textView;
        fk3 fk3Var = new fk3();
        fk3Var.a = new oz3(textView);
        this.b = fk3Var;
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, k09.i, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z) {
        ((fhe) this.b.a).b(z);
    }

    public final void c(boolean z) {
        ((fhe) this.b.a).c(z);
    }
}
