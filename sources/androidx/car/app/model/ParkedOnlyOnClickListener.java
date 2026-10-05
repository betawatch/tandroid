package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class ParkedOnlyOnClickListener implements c0 {
    private final c0 mListener;

    private ParkedOnlyOnClickListener(c0 c0Var) {
        this.mListener = c0Var;
    }

    public static ParkedOnlyOnClickListener create(c0 c0Var) {
        Objects.requireNonNull(c0Var);
        return new ParkedOnlyOnClickListener(c0Var);
    }

    @Override // androidx.car.app.model.c0
    public void onClick() {
        this.mListener.onClick();
    }
}
