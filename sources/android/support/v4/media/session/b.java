package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public interface b extends IInterface {
    void C(List list);

    void C0(PlaybackStateCompat playbackStateCompat);

    void E0(ParcelableVolumeInfo parcelableVolumeInfo);

    void a0(CharSequence charSequence);

    void c0();

    void f0(MediaMetadataCompat mediaMetadataCompat);

    void h(int i10);

    void onRepeatModeChanged(int i10);

    void z(Bundle bundle);
}
