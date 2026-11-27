// default package

import android.text.Editable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
