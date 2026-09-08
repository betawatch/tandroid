package androidx.car.app.model.signin;

import androidx.car.app.model.Action;
import androidx.car.app.model.b0;
import j$.util.Objects;
import u.c;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class ProviderSignInMethod implements c {
    private final Action mAction;

    public ProviderSignInMethod(Action action) {
        Objects.requireNonNull(action);
        if (action.getType() != 1) {
            throw new IllegalArgumentException("The action must not be a standard action");
        }
        b0 onClickDelegate = action.getOnClickDelegate();
        Objects.requireNonNull(onClickDelegate);
        if (!onClickDelegate.isParkedOnly()) {
            throw new IllegalArgumentException("The action must use a ParkedOnlyOnClickListener");
        }
        this.mAction = action;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderSignInMethod) {
            return Objects.equals(this.mAction, ((ProviderSignInMethod) obj).mAction);
        }
        return false;
    }

    public Action getAction() {
        Action action = this.mAction;
        Objects.requireNonNull(action);
        return action;
    }

    public int hashCode() {
        return Objects.hash(this.mAction);
    }

    public String toString() {
        return "[action:" + this.mAction + "]";
    }

    private ProviderSignInMethod() {
        this.mAction = null;
    }
}
