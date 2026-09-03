package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public interface b extends IInterface {
    void C0(PlaybackStateCompat playbackStateCompat);

    void D0(ParcelableVolumeInfo parcelableVolumeInfo);

    void a0(CharSequence charSequence);

    void c0();

    void e0(MediaMetadataCompat mediaMetadataCompat);

    void o0(int i10);

    void onRepeatModeChanged(int i10);

    void u(Bundle bundle);

    void x(List list);
}
