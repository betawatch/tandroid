package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
