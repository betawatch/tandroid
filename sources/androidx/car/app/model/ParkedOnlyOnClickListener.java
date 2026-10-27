package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
