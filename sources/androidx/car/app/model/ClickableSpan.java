package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
