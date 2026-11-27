package androidx.car.app.model.signin;

import androidx.car.app.model.Action;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ProviderSignInMethod implements bla {
    private final Action mAction;

    public ProviderSignInMethod(Action action) {
        Objects.requireNonNull(action);
        if (action.getType() != 1) {
            lq5.j("The action must not be a standard action");
            throw null;
        }
        yr7 onClickDelegate = action.getOnClickDelegate();
        Objects.requireNonNull(onClickDelegate);
        if (onClickDelegate.isParkedOnly()) {
            this.mAction = action;
        } else {
            lq5.j("The action must use a ParkedOnlyOnClickListener");
            throw null;
        }
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
