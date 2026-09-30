package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class Toggle {
    private final boolean mIsChecked;
    private final boolean mIsEnabled;
    private final z mOnCheckedChangeDelegate;

    public Toggle(y0 y0Var) {
        throw null;
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

    public z getOnCheckedChangeDelegate() {
        z zVar = this.mOnCheckedChangeDelegate;
        Objects.requireNonNull(zVar);
        return zVar;
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

    private Toggle() {
        this.mOnCheckedChangeDelegate = null;
        this.mIsChecked = false;
        this.mIsEnabled = true;
    }
}
