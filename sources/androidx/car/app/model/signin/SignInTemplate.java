package androidx.car.app.model.signin;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class SignInTemplate implements pib {
    private final List<Action> mActionList;
    private final ActionStrip mActionStrip;
    private final CarText mAdditionalText;
    private final Action mHeaderAction;
    private final CarText mInstructions;
    private final boolean mIsLoading;
    private final kja mSignInMethod;
    private final CarText mTitle;

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

    public kja getSignInMethod() {
        kja kjaVar = this.mSignInMethod;
        Objects.requireNonNull(kjaVar);
        return kjaVar;
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

    public SignInTemplate(jja jjaVar) {
        throw null;
    }
}
