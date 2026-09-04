package androidx.car.app.navigation.model;

import androidx.car.app.model.CarText;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class Trip {
    private final CarText mCurrentRoad;
    private final List<TravelEstimate> mDestinationTravelEstimates;
    private final List<Destination> mDestinations;
    private final boolean mIsLoading;
    private final List<TravelEstimate> mStepTravelEstimates;
    private final List<Step> mSteps;

    public Trip(n nVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Trip)) {
            return false;
        }
        Trip trip = (Trip) obj;
        return Objects.equals(this.mDestinations, trip.mDestinations) && Objects.equals(this.mSteps, trip.mSteps) && Objects.equals(this.mDestinationTravelEstimates, trip.mDestinationTravelEstimates) && Objects.equals(this.mStepTravelEstimates, trip.mStepTravelEstimates) && Objects.equals(this.mCurrentRoad, trip.mCurrentRoad) && Boolean.valueOf(this.mIsLoading).equals(Boolean.valueOf(trip.mIsLoading));
    }

    public CarText getCurrentRoad() {
        return this.mCurrentRoad;
    }

    public List<TravelEstimate> getDestinationTravelEstimates() {
        List<TravelEstimate> list = this.mDestinationTravelEstimates;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public List<Destination> getDestinations() {
        List<Destination> list = this.mDestinations;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public List<TravelEstimate> getStepTravelEstimates() {
        List<TravelEstimate> list = this.mStepTravelEstimates;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public List<Step> getSteps() {
        List<Step> list = this.mSteps;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public int hashCode() {
        return Objects.hash(this.mDestinations, this.mSteps, this.mDestinationTravelEstimates, this.mStepTravelEstimates, this.mCurrentRoad);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "[ destinations : " + this.mDestinations.toString() + ", steps: " + this.mSteps.toString() + ", dest estimates: " + this.mDestinationTravelEstimates.toString() + ", step estimates: " + this.mStepTravelEstimates.toString() + ", road: " + CarText.toShortString(this.mCurrentRoad) + ", isLoading: " + this.mIsLoading + "]";
    }

    private Trip() {
        List list = Collections.EMPTY_LIST;
        this.mDestinations = list;
        this.mSteps = list;
        this.mDestinationTravelEstimates = list;
        this.mStepTravelEstimates = list;
        this.mCurrentRoad = null;
        this.mIsLoading = false;
    }
}
