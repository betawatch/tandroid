package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import org.telegram.ui.Cells.ia;
import w7.o6;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class t {
    public final TextView a;
    public final ia b;

    public t(TextView textView) {
        this.a = textView;
        this.b = new ia(textView);
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
        ((o6) this.b.b).b(z10);
    }

    public final void c(boolean z10) {
        ((o6) this.b.b).c(z10);
    }
}
