package androidx.car.app.model;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class ParkedOnlyOnClickListener implements OnClickListener {
    private final OnClickListener mListener;

    @Override // androidx.car.app.model.OnClickListener
    public void onClick() {
        this.mListener.onClick();
    }

    public static ParkedOnlyOnClickListener create(OnClickListener onClickListener) {
        Objects.requireNonNull(onClickListener);
        return new ParkedOnlyOnClickListener(onClickListener);
    }

    private ParkedOnlyOnClickListener(OnClickListener onClickListener) {
        this.mListener = onClickListener;
    }
}
