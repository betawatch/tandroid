package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public interface b extends IInterface {
    void C0(PlaybackStateCompat playbackStateCompat);

    void D0(ParcelableVolumeInfo parcelableVolumeInfo);

    void Y(CharSequence charSequence);

    void a0();

    void c0(MediaMetadataCompat mediaMetadataCompat);

    void n0(int i10);

    void onRepeatModeChanged(int i10);

    void v(Bundle bundle);

    void y(List list);
}
