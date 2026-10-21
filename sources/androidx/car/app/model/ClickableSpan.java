package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class ClickableSpan extends CarSpan {
    private final b0 mOnClickDelegate;

    private ClickableSpan(c0 c0Var) {
        this.mOnClickDelegate = OnClickDelegateImpl.create(c0Var);
    }

    public static ClickableSpan create(c0 c0Var) {
        Objects.requireNonNull(c0Var);
        return new ClickableSpan(c0Var);
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

    public b0 getOnClickDelegate() {
        b0 b0Var = this.mOnClickDelegate;
        Objects.requireNonNull(b0Var);
        return b0Var;
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
