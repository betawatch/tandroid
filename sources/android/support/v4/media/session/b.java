package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
