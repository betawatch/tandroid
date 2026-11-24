// default package

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ip {
    public final TextView a;
    public final gi3 b;

    public ip(TextView textView) {
        this.a = textView;
        gi3 gi3Var = new gi3();
        gi3Var.a = new ey3(textView);
        this.b = gi3Var;
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, jy8.i, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z) {
        ((efe) this.b.a).b(z);
    }

    public final void c(boolean z) {
        ((efe) this.b.a).c(z);
    }
}
