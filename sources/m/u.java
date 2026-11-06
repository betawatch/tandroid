package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import c8.fc;
import org.telegram.ui.Components.uy;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        ((fc) this.b.b).b(z9);
    }

    public final void c(boolean z9) {
        ((fc) this.b.b).c(z9);
    }
}
