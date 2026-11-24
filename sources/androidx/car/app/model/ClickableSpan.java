package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ClickableSpan extends CarSpan {
    private final br7 mOnClickDelegate;

    private ClickableSpan(cr7 cr7Var) {
        this.mOnClickDelegate = OnClickDelegateImpl.create(cr7Var);
    }

    public static ClickableSpan create(cr7 cr7Var) {
        Objects.requireNonNull(cr7Var);
        return new ClickableSpan(cr7Var);
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

    public br7 getOnClickDelegate() {
        br7 br7Var = this.mOnClickDelegate;
        Objects.requireNonNull(br7Var);
        return br7Var;
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
