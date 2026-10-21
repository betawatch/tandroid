package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
