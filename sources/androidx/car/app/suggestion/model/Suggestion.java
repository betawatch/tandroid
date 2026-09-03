package androidx.car.app.suggestion.model;

import android.app.PendingIntent;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import j$.util.Objects;
import x.a;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class Suggestion {
    private final PendingIntent mAction;
    private final CarIcon mIcon;
    private final String mIdentifier;
    private final CarText mSubtitle;
    private final CarText mTitle;

    public Suggestion(a aVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Suggestion)) {
            return false;
        }
        Suggestion suggestion = (Suggestion) obj;
        return Objects.equals(this.mIdentifier, suggestion.mIdentifier) && Objects.equals(this.mTitle, suggestion.mTitle) && Objects.equals(this.mSubtitle, suggestion.mSubtitle) && Objects.equals(this.mAction, suggestion.mAction) && Objects.equals(this.mIcon, suggestion.mIcon);
    }

    public PendingIntent getAction() {
        return this.mAction;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public String getIdentifier() {
        return this.mIdentifier;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mIdentifier, this.mTitle, this.mSubtitle, this.mIcon, this.mAction);
    }

    public String toString() {
        return "[id: " + this.mIdentifier + ", title: " + CarText.toShortString(this.mTitle) + ", subtitle: " + CarText.toShortString(this.mSubtitle) + ", pendingIntent: " + this.mAction + ", icon: " + this.mIcon + "]";
    }

    private Suggestion() {
        this.mIdentifier = "";
        this.mTitle = CarText.create("");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mAction = null;
    }
}
