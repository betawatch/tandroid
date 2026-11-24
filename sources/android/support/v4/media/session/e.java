package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
        mediaSessionCompat$ResultReceiverWrapper.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        return mediaSessionCompat$ResultReceiverWrapper;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MediaSessionCompat$ResultReceiverWrapper[i];
    }
}
