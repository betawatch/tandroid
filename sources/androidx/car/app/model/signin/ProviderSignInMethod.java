package androidx.car.app.model.signin;

import androidx.car.app.model.Action;
import androidx.car.app.model.OnClickDelegate;
import androidx.car.app.model.signin.SignInTemplate;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class ProviderSignInMethod implements SignInTemplate.SignInMethod {
    private final Action mAction;

    public ProviderSignInMethod(Action action) {
        Objects.requireNonNull(action);
        if (action.getType() != 1) {
            throw new IllegalArgumentException("The action must not be a standard action");
        }
        OnClickDelegate onClickDelegate = action.getOnClickDelegate();
        Objects.requireNonNull(onClickDelegate);
        if (!onClickDelegate.isParkedOnly()) {
            throw new IllegalArgumentException("The action must use a ParkedOnlyOnClickListener");
        }
        this.mAction = action;
    }

    public Action getAction() {
        Action action = this.mAction;
        Objects.requireNonNull(action);
        return action;
    }

    public String toString() {
        return "[action:" + this.mAction + "]";
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

    public int hashCode() {
        return Objects.hash(this.mAction);
    }

    private ProviderSignInMethod() {
        this.mAction = null;
    }
}
