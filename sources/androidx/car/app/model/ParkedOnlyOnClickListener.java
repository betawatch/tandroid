package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ParkedOnlyOnClickListener implements cr7 {
    private final cr7 mListener;

    private ParkedOnlyOnClickListener(cr7 cr7Var) {
        this.mListener = cr7Var;
    }

    public static ParkedOnlyOnClickListener create(cr7 cr7Var) {
        Objects.requireNonNull(cr7Var);
        return new ParkedOnlyOnClickListener(cr7Var);
    }

    @Override // cr7
    public void onClick() {
        this.mListener.onClick();
    }
}
