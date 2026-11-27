package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ParkedOnlyOnClickListener implements zr7 {
    private final zr7 mListener;

    private ParkedOnlyOnClickListener(zr7 zr7Var) {
        this.mListener = zr7Var;
    }

    public static ParkedOnlyOnClickListener create(zr7 zr7Var) {
        Objects.requireNonNull(zr7Var);
        return new ParkedOnlyOnClickListener(zr7Var);
    }

    @Override // zr7
    public void onClick() {
        this.mListener.onClick();
    }
}
