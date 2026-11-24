// default package

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ks6 implements Parcelable {
    public static final Parcelable.Creator<ks6> CREATOR = new f41((byte) 26);
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final Bitmap e;
    public byte[] f;
    public final Uri h;
    public final Bundle n;
    public final Uri r;
    public MediaDescription s;

    public ks6(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.h = uri;
        this.n = bundle;
        this.r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.a);
        builder.setTitle(this.b);
        builder.setSubtitle(this.c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.e);
        builder.setIconUri(this.h);
        builder.setExtras(this.n);
        builder.setMediaUri(this.r);
        MediaDescription build = builder.build();
        this.s = build;
        return build;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.b) + ", " + ((Object) this.c) + ", " + ((Object) this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        a().writeToParcel(parcel, i);
    }
}
