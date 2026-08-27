package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public interface b extends IInterface {
    void C0(PlaybackStateCompat playbackStateCompat);

    void D0(ParcelableVolumeInfo parcelableVolumeInfo);

    void c0(CharSequence charSequence);

    void f0();

    void h0(MediaMetadataCompat mediaMetadataCompat);

    void onRepeatModeChanged(int i10);

    void q0(int i10);

    void v(Bundle bundle);

    void z(List list);
}
