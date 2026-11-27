package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
