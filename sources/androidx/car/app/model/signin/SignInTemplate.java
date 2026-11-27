package androidx.car.app.model.signin;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class SignInTemplate implements kkb {
    private final List<Action> mActionList;
    private final ActionStrip mActionStrip;
    private final CarText mAdditionalText;
    private final Action mHeaderAction;
    private final CarText mInstructions;
    private final boolean mIsLoading;
    private final bla mSignInMethod;
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

    public bla getSignInMethod() {
        bla blaVar = this.mSignInMethod;
        Objects.requireNonNull(blaVar);
        return blaVar;
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

    public SignInTemplate(ala alaVar) {
        throw null;
    }
}
