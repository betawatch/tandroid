package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class Toggle {
    private final boolean mIsChecked;
    private final boolean mIsEnabled;
    private final xr7 mOnCheckedChangeDelegate;

    private Toggle() {
        this.mOnCheckedChangeDelegate = null;
        this.mIsChecked = false;
        this.mIsEnabled = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Toggle)) {
            return false;
        }
        Toggle toggle = (Toggle) obj;
        return this.mIsChecked == toggle.mIsChecked && this.mIsEnabled == toggle.mIsEnabled;
    }

    public xr7 getOnCheckedChangeDelegate() {
        xr7 xr7Var = this.mOnCheckedChangeDelegate;
        Objects.requireNonNull(xr7Var);
        return xr7Var;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsChecked), Boolean.valueOf(this.mIsEnabled));
    }

    public boolean isChecked() {
        return this.mIsChecked;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public String toString() {
        return "[ isChecked: " + this.mIsChecked + ", isEnabled: " + this.mIsEnabled + "]";
    }

    public Toggle(ltb ltbVar) {
        throw null;
    }
}
