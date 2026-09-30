package androidx.car.app.navigation.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import j$.util.Objects;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class MessageInfo implements f {
    private final CarIcon mImage;
    private final CarText mText;
    private final CarText mTitle;

    public MessageInfo(d dVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageInfo)) {
            return false;
        }
        MessageInfo messageInfo = (MessageInfo) obj;
        return Objects.equals(this.mTitle, messageInfo.mTitle) && Objects.equals(this.mText, messageInfo.mText) && Objects.equals(this.mImage, messageInfo.mImage);
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public CarText getText() {
        return this.mText;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mText, this.mImage);
    }

    public String toString() {
        return "MessageInfo";
    }

    private MessageInfo() {
        this.mTitle = null;
        this.mText = null;
        this.mImage = null;
    }
}
