package android.support.v4.media;

import a4.w;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.d0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new w.a(6);
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescription = (MediaDescription) obj;
        String g10 = a.g(mediaDescription);
        CharSequence i11 = a.i(mediaDescription);
        CharSequence h = a.h(mediaDescription);
        CharSequence c3 = a.c(mediaDescription);
        Bitmap e10 = a.e(mediaDescription);
        Uri f9 = a.f(mediaDescription);
        Bundle d = a.d(mediaDescription);
        if (d != null) {
            d = d0.j(d);
        }
        Uri uri = d != null ? (Uri) d.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri != null) {
            if (d.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && d.size() == 2) {
                bundle = null;
                if (uri == null) {
                    uri = i10 >= 23 ? b.a(mediaDescription) : null;
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(g10, i11, h, c3, e10, f9, bundle, uri);
                mediaDescriptionCompat.r = mediaDescription;
                return mediaDescriptionCompat;
            }
            d.remove("android.support.v4.media.description.MEDIA_URI");
            d.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        }
        bundle = d;
        if (uri == null) {
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(g10, i11, h, c3, e10, f9, bundle, uri);
        mediaDescriptionCompat2.r = mediaDescription;
        return mediaDescriptionCompat2;
    }

    public final MediaDescription b() {
        MediaDescription mediaDescription = this.r;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        int i10 = Build.VERSION.SDK_INT;
        MediaDescription.Builder b10 = a.b();
        a.n(b10, this.a);
        a.p(b10, this.b);
        a.o(b10, this.c);
        a.j(b10, this.d);
        a.l(b10, this.e);
        a.m(b10, this.f);
        Bundle bundle = this.h;
        Uri uri = this.n;
        if (i10 >= 23 || uri == null) {
            a.k(b10, bundle);
        } else {
            Bundle i11 = bundle == null ? w.i("android.support.v4.media.description.NULL_BUNDLE_FLAG", true) : new Bundle(bundle);
            i11.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
            a.k(b10, i11);
        }
        if (i10 >= 23) {
            b.b(b10, uri);
        }
        MediaDescription a2 = a.a(b10);
        this.r = a2;
        return a2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.b) + ", " + ((Object) this.c) + ", " + ((Object) this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        b().writeToParcel(parcel, i10);
    }
}
