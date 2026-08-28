package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public interface b extends IInterface {
    void B(List list);

    void C0(PlaybackStateCompat playbackStateCompat);

    void D0(ParcelableVolumeInfo parcelableVolumeInfo);

    void Z(CharSequence charSequence);

    void b0();

    void d0(MediaMetadataCompat mediaMetadataCompat);

    void l0(int i9);

    void onRepeatModeChanged(int i9);

    void w(Bundle bundle);
}
