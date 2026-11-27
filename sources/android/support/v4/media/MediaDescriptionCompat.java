package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new g31((byte) 27);
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
        String g = ms6.g(mediaDescription);
        CharSequence i = ms6.i(mediaDescription);
        CharSequence h = ms6.h(mediaDescription);
        CharSequence c = ms6.c(mediaDescription);
        Bitmap e = ms6.e(mediaDescription);
        Uri f = ms6.f(mediaDescription);
        Bundle d = ms6.d(mediaDescription);
        if (d != null) {
            d = rx6.B0(d);
        }
        Uri uri = d != null ? (Uri) d.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri != null) {
            if (d.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && d.size() == 2) {
                bundle = null;
                if (uri == null) {
                    uri = ns6.a(mediaDescription);
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
        MediaDescription.Builder b = ms6.b();
        ms6.n(b, this.a);
        ms6.p(b, this.b);
        ms6.o(b, this.c);
        ms6.j(b, this.d);
        ms6.l(b, this.e);
        ms6.m(b, this.f);
        ms6.k(b, this.h);
        ns6.b(b, this.n);
        MediaDescription a = ms6.a(b);
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
