package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import h7.n6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class u {
    public final TextView a;
    public final n2.b0 b;

    public u(TextView textView) {
        this.a = textView;
        this.b = new n2.b0(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i10, 0);
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
        ((n6) this.b.b).b(z10);
    }

    public final void c(boolean z10) {
        ((n6) this.b.b).c(z10);
    }
}
