package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class Tab {
    private static final String EMPTY_TAB_CONTENT_ID = "EMPTY_TAB_CONTENT_ID";
    private final String mContentId;
    private final CarIcon mIcon;
    private final CarText mTitle;

    public Tab(s0 s0Var) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tab)) {
            return false;
        }
        Tab tab = (Tab) obj;
        return Objects.equals(this.mTitle, tab.mTitle) && Objects.equals(this.mContentId, tab.mContentId) && Objects.equals(this.mIcon, tab.mIcon);
    }

    public String getContentId() {
        String str = this.mContentId;
        Objects.requireNonNull(str);
        return str;
    }

    public CarIcon getIcon() {
        CarIcon carIcon = this.mIcon;
        Objects.requireNonNull(carIcon);
        return carIcon;
    }

    public CarText getTitle() {
        CarText carText = this.mTitle;
        Objects.requireNonNull(carText);
        return carText;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mContentId, this.mIcon);
    }

    public String toString() {
        return "[title: " + CarText.toShortString(this.mTitle) + ", contentId: " + this.mContentId + ", icon: " + this.mIcon + "]";
    }

    private Tab() {
        this.mTitle = null;
        this.mContentId = EMPTY_TAB_CONTENT_ID;
        this.mIcon = null;
    }
}
