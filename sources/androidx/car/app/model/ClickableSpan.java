package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
