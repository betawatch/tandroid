// default package

import android.text.Editable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ay3 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile ay3 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new qma(cls, charSequence) : super.newEditable(charSequence);
    }
}
