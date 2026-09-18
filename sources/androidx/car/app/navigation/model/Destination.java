package androidx.car.app.navigation.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import j$.util.Objects;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class Destination {
    private final CarText mAddress;
    private final CarIcon mImage;
    private final CarText mName;

    public Destination(a aVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Destination)) {
            return false;
        }
        Destination destination = (Destination) obj;
        return Objects.equals(this.mName, destination.mName) && Objects.equals(this.mAddress, destination.mAddress) && Objects.equals(this.mImage, destination.mImage);
    }

    public CarText getAddress() {
        return this.mAddress;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public CarText getName() {
        return this.mName;
    }

    public int hashCode() {
        return Objects.hash(this.mName, this.mAddress, this.mImage);
    }

    public String toString() {
        return "[name: " + CarText.toShortString(this.mName) + ", address: " + CarText.toShortString(this.mAddress) + ", image: " + this.mImage + "]";
    }

    private Destination() {
        this.mName = null;
        this.mAddress = null;
        this.mImage = null;
    }
}
