package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import c8.ic;
import org.telegram.messenger.ou;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class t {
    public final TextView a;
    public final ou b;

    public t(TextView textView) {
        this.a = textView;
        this.b = new ou(textView);
    }

    public final void a(AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i7, 0);
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
        ((ic) this.b.b).b(z10);
    }

    public final void c(boolean z10) {
        ((ic) this.b.b).c(z10);
    }
}
