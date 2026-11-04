package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t {
    public final TextView a;
    public final y00 b;

    public t(TextView textView) {
        this.a = textView;
        y00 y00Var = new y00();
        y00Var.a = new s1.g(textView);
        this.b = y00Var;
    }

    public final void a(AttributeSet attributeSet, int i3) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i3, 0);
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
        ((x7.p) this.b.a).b(z10);
    }

    public final void c(boolean z10) {
        ((x7.p) this.b.a).c(z10);
    }
}
