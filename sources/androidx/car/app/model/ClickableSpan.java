package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
