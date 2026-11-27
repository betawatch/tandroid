// default package

import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ahd implements tq2, pjf {
    public static final CharSequence a(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // tq2
    public final Object b0(am2 am2Var) {
        return new rj2((byte) 0);
    }
}
