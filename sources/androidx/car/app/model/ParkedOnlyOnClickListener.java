package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
