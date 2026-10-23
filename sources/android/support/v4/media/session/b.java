package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public interface b extends IInterface {
    void C(Bundle bundle);

    void C0(PlaybackStateCompat playbackStateCompat);

    void E0(ParcelableVolumeInfo parcelableVolumeInfo);

    void F(List list);

    void c0(CharSequence charSequence);

    void e0();

    void g0(MediaMetadataCompat mediaMetadataCompat);

    void h(int i10);

    void onRepeatModeChanged(int i10);
}
