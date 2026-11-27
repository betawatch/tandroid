// default package

import android.text.Editable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
