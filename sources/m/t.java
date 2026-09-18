package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import org.telegram.ui.Cells.ia;
import w7.o6;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
