package androidx.car.app.serialization;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class Bundleable implements Parcelable {
    public static final Parcelable.Creator<Bundleable> CREATOR = new Parcelable.Creator() { // from class: androidx.car.app.serialization.Bundleable.1
        @Override // android.os.Parcelable.Creator
        public Bundleable createFromParcel(Parcel parcel) {
            Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
            Objects.requireNonNull(readBundle);
            return new Bundleable(readBundle);
        }

        @Override // android.os.Parcelable.Creator
        public Bundleable[] newArray(int i) {
            return new Bundleable[i];
        }
    };
    private final Bundle mBundle;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static Bundleable create(Object obj) {
        return new Bundleable(obj);
    }

    public Object get() {
        return Bundler.fromBundle(this.mBundle);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.mBundle);
    }

    private Bundleable(Object obj) {
        this.mBundle = Bundler.toBundle(obj);
    }

    Bundleable(Bundle bundle) {
        this.mBundle = bundle;
    }
}
