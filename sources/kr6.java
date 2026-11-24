// default package

import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class kr6 implements Parcelable {
    public static final Parcelable.Creator<kr6> CREATOR;
    public static final ps c;
    public static final String[] d;
    public final Bundle a;
    public MediaMetadata b;

    static {
        ps psVar = new ps(0);
        c = psVar;
        psVar.put("android.media.metadata.TITLE", 1);
        psVar.put("android.media.metadata.ARTIST", 1);
        psVar.put("android.media.metadata.DURATION", 0);
        psVar.put("android.media.metadata.ALBUM", 1);
        psVar.put("android.media.metadata.AUTHOR", 1);
        psVar.put("android.media.metadata.WRITER", 1);
        psVar.put("android.media.metadata.COMPOSER", 1);
        psVar.put("android.media.metadata.COMPILATION", 1);
        psVar.put("android.media.metadata.DATE", 1);
        psVar.put("android.media.metadata.YEAR", 0);
        psVar.put("android.media.metadata.GENRE", 1);
        psVar.put("android.media.metadata.TRACK_NUMBER", 0);
        psVar.put("android.media.metadata.NUM_TRACKS", 0);
        psVar.put("android.media.metadata.DISC_NUMBER", 0);
        psVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        psVar.put("android.media.metadata.ART", 2);
        psVar.put("android.media.metadata.ART_URI", 1);
        psVar.put("android.media.metadata.ALBUM_ART", 2);
        psVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        psVar.put("android.media.metadata.USER_RATING", 3);
        psVar.put("android.media.metadata.RATING", 3);
        psVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        psVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        psVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        psVar.put("android.media.metadata.DISPLAY_ICON", 2);
        psVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        psVar.put("android.media.metadata.MEDIA_ID", 1);
        psVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        psVar.put("android.media.metadata.MEDIA_URI", 1);
        psVar.put("android.media.metadata.ADVERTISEMENT", 0);
        psVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        d = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION"};
        CREATOR = new x21((byte) 28);
    }

    public kr6(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.a = bundle2;
        ClassLoader classLoader = lv6.class.getClassLoader();
        classLoader.getClass();
        bundle2.setClassLoader(classLoader);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public kr6(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(lv6.class.getClassLoader());
        readBundle.getClass();
        this.a = readBundle;
    }
}
