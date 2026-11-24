package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ParkedOnlyOnClickListener implements zo7 {
    private final zo7 mListener;

    private ParkedOnlyOnClickListener(zo7 zo7Var) {
        this.mListener = zo7Var;
    }

    public static ParkedOnlyOnClickListener create(zo7 zo7Var) {
        Objects.requireNonNull(zo7Var);
        return new ParkedOnlyOnClickListener(zo7Var);
    }

    @Override // zo7
    public void onClick() {
        this.mListener.onClick();
    }
}
