package androidx.car.app.navigation.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Distance;
import j$.util.Objects;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class RoutingInfo implements f {
    private final Distance mCurrentDistance;
    private final Step mCurrentStep;
    private final boolean mIsLoading;
    private final CarIcon mJunctionImage;
    private final Step mNextStep;

    public RoutingInfo(l lVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutingInfo)) {
            return false;
        }
        RoutingInfo routingInfo = (RoutingInfo) obj;
        return this.mIsLoading == routingInfo.mIsLoading && Objects.equals(this.mCurrentStep, routingInfo.mCurrentStep) && Objects.equals(this.mCurrentDistance, routingInfo.mCurrentDistance) && Objects.equals(this.mNextStep, routingInfo.mNextStep) && Objects.equals(this.mJunctionImage, routingInfo.mJunctionImage);
    }

    public Distance getCurrentDistance() {
        return this.mCurrentDistance;
    }

    public Step getCurrentStep() {
        return this.mCurrentStep;
    }

    public CarIcon getJunctionImage() {
        return this.mJunctionImage;
    }

    public Step getNextStep() {
        return this.mNextStep;
    }

    public int hashCode() {
        return Objects.hash(this.mCurrentStep, this.mCurrentDistance, this.mNextStep, this.mJunctionImage, Boolean.valueOf(this.mIsLoading));
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "RoutingInfo";
    }

    private RoutingInfo() {
        this.mCurrentStep = null;
        this.mCurrentDistance = null;
        this.mNextStep = null;
        this.mJunctionImage = null;
        this.mIsLoading = false;
    }
}
