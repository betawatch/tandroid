package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import org.telegram.ui.Cells.ja;
import w7.o6;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class t {
    public final TextView a;
    public final ja b;

    public t(TextView textView) {
        this.a = textView;
        this.b = new ja(textView);
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
