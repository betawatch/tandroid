package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
