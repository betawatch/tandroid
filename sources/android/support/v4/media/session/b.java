package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
