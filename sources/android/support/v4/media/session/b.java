package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public interface b extends IInterface {
    void C(Bundle bundle);

    void D0(PlaybackStateCompat playbackStateCompat);

    void F(List list);

    void F0(ParcelableVolumeInfo parcelableVolumeInfo);

    void c0(CharSequence charSequence);

    void e0();

    void g0(MediaMetadataCompat mediaMetadataCompat);

    void h(int i10);

    void onRepeatModeChanged(int i10);
}
