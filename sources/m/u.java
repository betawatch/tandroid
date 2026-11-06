package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import c8.gc;
import org.telegram.ui.Components.uy;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class u {
    public final TextView a;
    public final uy b;

    public u(TextView textView) {
        this.a = textView;
        this.b = new uy(textView);
    }

    public final void a(AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i7, 0);
        try {
            boolean z9 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z9);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void b(boolean z9) {
        ((gc) this.b.b).b(z9);
    }

    public final void c(boolean z9) {
        ((gc) this.b.b).c(z9);
    }
}
