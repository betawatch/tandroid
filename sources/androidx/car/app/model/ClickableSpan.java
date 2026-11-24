package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
