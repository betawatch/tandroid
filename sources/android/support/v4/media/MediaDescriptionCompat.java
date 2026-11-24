package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new x21((byte) 27);
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final Bitmap e;
    public final Uri f;
    public final Bundle h;
    public final Uri n;
    public MediaDescription r;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.f = uri;
        this.h = bundle;
        this.n = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String g = iq6.g(mediaDescription);
        CharSequence i = iq6.i(mediaDescription);
        CharSequence h = iq6.h(mediaDescription);
        CharSequence c = iq6.c(mediaDescription);
        Bitmap e = iq6.e(mediaDescription);
        Uri f = iq6.f(mediaDescription);
        Bundle d = iq6.d(mediaDescription);
        if (d != null) {
            d = mv6.v0(d);
        }
        Uri uri = d != null ? (Uri) d.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri != null) {
            if (d.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && d.size() == 2) {
                bundle = null;
                if (uri == null) {
                    uri = jq6.a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(g, i, h, c, e, f, bundle, uri);
                mediaDescriptionCompat.r = mediaDescription;
                return mediaDescriptionCompat;
            }
            d.remove("android.support.v4.media.description.MEDIA_URI");
            d.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        }
        bundle = d;
        if (uri == null) {
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(g, i, h, c, e, f, bundle, uri);
        mediaDescriptionCompat2.r = mediaDescription;
        return mediaDescriptionCompat2;
    }

    public final MediaDescription b() {
        MediaDescription mediaDescription = this.r;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder b = iq6.b();
        iq6.n(b, this.a);
        iq6.p(b, this.b);
        iq6.o(b, this.c);
        iq6.j(b, this.d);
        iq6.l(b, this.e);
        iq6.m(b, this.f);
        iq6.k(b, this.h);
        jq6.b(b, this.n);
        MediaDescription a = iq6.a(b);
        this.r = a;
        return a;
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
        b().writeToParcel(parcel, i);
    }
}
