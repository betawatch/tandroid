package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ClickableSpan extends CarSpan {
    private final yo7 mOnClickDelegate;

    private ClickableSpan(zo7 zo7Var) {
        this.mOnClickDelegate = OnClickDelegateImpl.create(zo7Var);
    }

    public static ClickableSpan create(zo7 zo7Var) {
        Objects.requireNonNull(zo7Var);
        return new ClickableSpan(zo7Var);
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

    public yo7 getOnClickDelegate() {
        yo7 yo7Var = this.mOnClickDelegate;
        Objects.requireNonNull(yo7Var);
        return yo7Var;
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
