package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ClickableSpan extends CarSpan {
    private final yr7 mOnClickDelegate;

    private ClickableSpan(zr7 zr7Var) {
        this.mOnClickDelegate = OnClickDelegateImpl.create(zr7Var);
    }

    public static ClickableSpan create(zr7 zr7Var) {
        Objects.requireNonNull(zr7Var);
        return new ClickableSpan(zr7Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSpan)) {
            return false;
        }
        return Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(((ClickableSpan) obj).mOnClickDelegate == null));
    }

    public yr7 getOnClickDelegate() {
        yr7 yr7Var = this.mOnClickDelegate;
        Objects.requireNonNull(yr7Var);
        return yr7Var;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mOnClickDelegate == null));
    }

    public String toString() {
        return "[clickable]";
    }

    private ClickableSpan() {
        this.mOnClickDelegate = null;
    }
}
