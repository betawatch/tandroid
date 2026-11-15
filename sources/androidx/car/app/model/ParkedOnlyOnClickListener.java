package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
