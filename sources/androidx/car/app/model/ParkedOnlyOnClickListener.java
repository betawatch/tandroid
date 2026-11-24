package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
