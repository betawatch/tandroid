package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import k7.k6;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class t {
    public final TextView a;
    public final zz b;

    public t(TextView textView) {
        this.a = textView;
        this.b = new zz(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i10, 0);
        try {
            boolean z4 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z4);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void b(boolean z4) {
        ((k6) this.b.b).b(z4);
    }

    public final void c(boolean z4) {
        ((k6) this.b.b).c(z4);
    }
}
