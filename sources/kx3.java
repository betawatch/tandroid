// default package

import android.text.Editable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class kx3 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile kx3 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new joa(cls, charSequence) : super.newEditable(charSequence);
    }
}
