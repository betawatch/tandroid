package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class Badge {
    private final CarColor mBackgroundColor;
    private final boolean mHasDot;
    private final CarIcon mIcon;

    public Badge(h hVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        return this.mHasDot == badge.mHasDot && Objects.equals(this.mBackgroundColor, badge.mBackgroundColor) && Objects.equals(this.mIcon, badge.mIcon);
    }

    public CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public boolean hasDot() {
        return this.mHasDot;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mHasDot), this.mBackgroundColor, this.mIcon);
    }

    public String toString() {
        return "[hasDot: " + this.mHasDot + ", backgroundColor: " + this.mBackgroundColor + ", icon: " + this.mIcon + "]";
    }

    private Badge() {
        this.mHasDot = false;
        this.mBackgroundColor = null;
        this.mIcon = null;
    }
}
