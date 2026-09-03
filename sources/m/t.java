package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import k7.l6;
import org.telegram.ui.Components.ai;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class t {
    public final TextView a;
    public final ai b;

    public t(TextView textView) {
        this.a = textView;
        this.b = new ai(textView);
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
        ((l6) this.b.b).b(z4);
    }

    public final void c(boolean z4) {
        ((l6) this.b.b).c(z4);
    }
}
