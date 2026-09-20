package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
