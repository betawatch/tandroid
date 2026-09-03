package android.support.v4.media;

import a0.f;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.c0;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final f d;
    public static final String[] e;
    public static final String[] f;
    public static final String[] h;
    public final Bundle a;
    public MediaMetadata b;
    public MediaDescriptionCompat c;

    static {
        f fVar = new f(0);
        d = fVar;
        fVar.put("android.media.metadata.TITLE", 1);
        fVar.put("android.media.metadata.ARTIST", 1);
        fVar.put("android.media.metadata.DURATION", 0);
        fVar.put("android.media.metadata.ALBUM", 1);
        fVar.put("android.media.metadata.AUTHOR", 1);
        fVar.put("android.media.metadata.WRITER", 1);
        fVar.put("android.media.metadata.COMPOSER", 1);
        fVar.put("android.media.metadata.COMPILATION", 1);
        fVar.put("android.media.metadata.DATE", 1);
        fVar.put("android.media.metadata.YEAR", 0);
        fVar.put("android.media.metadata.GENRE", 1);
        fVar.put("android.media.metadata.TRACK_NUMBER", 0);
        fVar.put("android.media.metadata.NUM_TRACKS", 0);
        fVar.put("android.media.metadata.DISC_NUMBER", 0);
        fVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        fVar.put("android.media.metadata.ART", 2);
        fVar.put("android.media.metadata.ART_URI", 1);
        fVar.put("android.media.metadata.ALBUM_ART", 2);
        fVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        fVar.put("android.media.metadata.USER_RATING", 3);
        fVar.put("android.media.metadata.RATING", 3);
        fVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        fVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        fVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        fVar.put("android.media.metadata.DISPLAY_ICON", 2);
        fVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        fVar.put("android.media.metadata.MEDIA_ID", 1);
        fVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        fVar.put("android.media.metadata.MEDIA_URI", 1);
        fVar.put("android.media.metadata.ADVERTISEMENT", 0);
        fVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        e = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        h = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new w.a(10);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.a = bundle2;
        c0.a(bundle2);
    }

    public final MediaDescriptionCompat a() {
        Bitmap bitmap;
        Uri uri;
        String str;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.c;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        Bundle bundle = this.a;
        CharSequence charSequence = bundle.getCharSequence("android.media.metadata.MEDIA_ID");
        String charSequence2 = charSequence != null ? charSequence.toString() : null;
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence charSequence3 = bundle.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(charSequence3)) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < 3) {
                String[] strArr = e;
                if (i11 >= strArr.length) {
                    break;
                }
                int i12 = i11 + 1;
                CharSequence charSequence4 = bundle.getCharSequence(strArr[i11]);
                if (!TextUtils.isEmpty(charSequence4)) {
                    charSequenceArr[i10] = charSequence4;
                    i10++;
                }
                i11 = i12;
            }
        } else {
            charSequenceArr[0] = charSequence3;
            charSequenceArr[1] = bundle.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = bundle.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i13 = 0;
        while (true) {
            String[] strArr2 = f;
            if (i13 >= strArr2.length) {
                bitmap = null;
                break;
            }
            try {
                bitmap = (Bitmap) bundle.getParcelable(strArr2[i13]);
            } catch (Exception e6) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e6);
                bitmap = null;
            }
            if (bitmap != null) {
                break;
            }
            i13++;
        }
        int i14 = 0;
        while (true) {
            String[] strArr3 = h;
            if (i14 >= strArr3.length) {
                uri = null;
                break;
            }
            CharSequence charSequence5 = bundle.getCharSequence(strArr3[i14]);
            String charSequence6 = charSequence5 != null ? charSequence5.toString() : null;
            if (!TextUtils.isEmpty(charSequence6)) {
                uri = Uri.parse(charSequence6);
                break;
            }
            i14++;
        }
        CharSequence charSequence7 = bundle.getCharSequence("android.media.metadata.MEDIA_URI");
        String charSequence8 = charSequence7 != null ? charSequence7.toString() : null;
        Uri parse = !TextUtils.isEmpty(charSequence8) ? Uri.parse(charSequence8) : null;
        CharSequence charSequence9 = charSequenceArr[0];
        CharSequence charSequence10 = charSequenceArr[1];
        CharSequence charSequence11 = charSequenceArr[2];
        Bundle bundle2 = new Bundle();
        if (bundle.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            str = charSequence2;
            uri2 = uri;
            bundle2.putLong("android.media.extra.BT_FOLDER_TYPE", bundle.getLong("android.media.metadata.BT_FOLDER_TYPE", 0L));
        } else {
            str = charSequence2;
            uri2 = uri;
        }
        if (bundle.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle2.putLong("android.media.extra.DOWNLOAD_STATUS", bundle.getLong("android.media.metadata.DOWNLOAD_STATUS", 0L));
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(str, charSequence9, charSequence10, charSequence11, bitmap, uri2, !bundle2.isEmpty() ? bundle2 : null, parse);
        this.c = mediaDescriptionCompat2;
        return mediaDescriptionCompat2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.a);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.a = parcel.readBundle(c0.class.getClassLoader());
    }
}
