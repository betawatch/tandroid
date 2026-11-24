package androidx.car.app.navigation.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class Destination {
    private final CarText mAddress;
    private final CarIcon mImage;
    private final CarText mName;

    private Destination() {
        this.mName = null;
        this.mAddress = null;
        this.mImage = null;
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

    public Destination(mf3 mf3Var) {
        throw null;
    }
}
