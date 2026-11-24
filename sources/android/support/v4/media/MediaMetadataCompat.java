package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final qt d;
    public static final String[] e;
    public static final String[] f;
    public static final String[] h;
    public final Bundle a;
    public MediaMetadata b;
    public MediaDescriptionCompat c;

    static {
        qt qtVar = new qt(0);
        d = qtVar;
        qtVar.put("android.media.metadata.TITLE", 1);
        qtVar.put("android.media.metadata.ARTIST", 1);
        qtVar.put("android.media.metadata.DURATION", 0);
        qtVar.put("android.media.metadata.ALBUM", 1);
        qtVar.put("android.media.metadata.AUTHOR", 1);
        qtVar.put("android.media.metadata.WRITER", 1);
        qtVar.put("android.media.metadata.COMPOSER", 1);
        qtVar.put("android.media.metadata.COMPILATION", 1);
        qtVar.put("android.media.metadata.DATE", 1);
        qtVar.put("android.media.metadata.YEAR", 0);
        qtVar.put("android.media.metadata.GENRE", 1);
        qtVar.put("android.media.metadata.TRACK_NUMBER", 0);
        qtVar.put("android.media.metadata.NUM_TRACKS", 0);
        qtVar.put("android.media.metadata.DISC_NUMBER", 0);
        qtVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        qtVar.put("android.media.metadata.ART", 2);
        qtVar.put("android.media.metadata.ART_URI", 1);
        qtVar.put("android.media.metadata.ALBUM_ART", 2);
        qtVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        qtVar.put("android.media.metadata.USER_RATING", 3);
        qtVar.put("android.media.metadata.RATING", 3);
        qtVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        qtVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        qtVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        qtVar.put("android.media.metadata.DISPLAY_ICON", 2);
        qtVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        qtVar.put("android.media.metadata.MEDIA_ID", 1);
        qtVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        qtVar.put("android.media.metadata.MEDIA_URI", 1);
        qtVar.put("android.media.metadata.ADVERTISEMENT", 0);
        qtVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        e = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        h = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new f41((byte) 29);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.a = parcel.readBundle(mx6.class.getClassLoader());
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
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                String[] strArr = e;
                if (i2 >= strArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence charSequence4 = bundle.getCharSequence(strArr[i2]);
                if (!TextUtils.isEmpty(charSequence4)) {
                    charSequenceArr[i] = charSequence4;
                    i++;
                }
                i2 = i3;
            }
        } else {
            charSequenceArr[0] = charSequence3;
            charSequenceArr[1] = bundle.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = bundle.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i4 = 0;
        while (true) {
            String[] strArr2 = f;
            if (i4 >= strArr2.length) {
                bitmap = null;
                break;
            }
            try {
                bitmap = (Bitmap) bundle.getParcelable(strArr2[i4]);
            } catch (Exception e2) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e2);
                bitmap = null;
            }
            if (bitmap != null) {
                break;
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            String[] strArr3 = h;
            if (i5 >= strArr3.length) {
                uri = null;
                break;
            }
            CharSequence charSequence5 = bundle.getCharSequence(strArr3[i5]);
            String charSequence6 = charSequence5 != null ? charSequence5.toString() : null;
            if (!TextUtils.isEmpty(charSequence6)) {
                uri = Uri.parse(charSequence6);
                break;
            }
            i5++;
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
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.a = bundle2;
        mx6.D(bundle2);
    }
}
