package androidx.car.app.model.signin;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.x0;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import u.b;
import u.c;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class SignInTemplate implements x0 {
    private final List<Action> mActionList;
    private final ActionStrip mActionStrip;
    private final CarText mAdditionalText;
    private final Action mHeaderAction;
    private final CarText mInstructions;
    private final boolean mIsLoading;
    private final c mSignInMethod;
    private final CarText mTitle;

    public SignInTemplate(b bVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignInTemplate)) {
            return false;
        }
        SignInTemplate signInTemplate = (SignInTemplate) obj;
        return this.mIsLoading == signInTemplate.mIsLoading && Objects.equals(this.mHeaderAction, signInTemplate.mHeaderAction) && Objects.equals(this.mTitle, signInTemplate.mTitle) && Objects.equals(this.mInstructions, signInTemplate.mInstructions) && Objects.equals(this.mAdditionalText, signInTemplate.mAdditionalText) && Objects.equals(this.mActionStrip, signInTemplate.mActionStrip) && Objects.equals(this.mActionList, signInTemplate.mActionList) && Objects.equals(this.mSignInMethod, signInTemplate.mSignInMethod);
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List<Action> getActions() {
        List<Action> list = this.mActionList;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public CarText getAdditionalText() {
        return this.mAdditionalText;
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public CarText getInstructions() {
        return this.mInstructions;
    }

    public c getSignInMethod() {
        c cVar = this.mSignInMethod;
        Objects.requireNonNull(cVar);
        return cVar;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mHeaderAction, this.mTitle, this.mInstructions, this.mAdditionalText, this.mActionStrip, this.mActionList, this.mSignInMethod);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "SignInTemplate";
    }

    private SignInTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTitle = null;
        this.mInstructions = null;
        this.mAdditionalText = null;
        this.mActionStrip = null;
        this.mActionList = Collections.EMPTY_LIST;
        this.mSignInMethod = null;
    }
}
