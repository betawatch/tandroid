package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends MediaController.Callback {
    public final WeakReference a;

    public e(androidx.mediarouter.app.s sVar) {
        this.a = new WeakReference(sVar);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        if (((androidx.mediarouter.app.s) this.a.get()) != null) {
            playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            if (Build.VERSION.SDK_INT >= 26) {
            }
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        d0.a(bundle);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        MediaMetadataCompat mediaMetadataCompat;
        androidx.mediarouter.app.s sVar = (androidx.mediarouter.app.s) this.a.get();
        if (sVar != null) {
            a0.f fVar = MediaMetadataCompat.d;
            if (mediaMetadata != null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                mediaMetadataCompat.b = mediaMetadata;
            } else {
                mediaMetadataCompat = null;
            }
            sVar.a(mediaMetadataCompat);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        androidx.mediarouter.app.s sVar = (androidx.mediarouter.app.s) this.a.get();
        if (sVar == null || sVar.c != null) {
            return;
        }
        sVar.b(PlaybackStateCompat.a(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        if (((androidx.mediarouter.app.s) this.a.get()) != null) {
            MediaSessionCompat$QueueItem.a(list);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        androidx.mediarouter.app.s sVar = (androidx.mediarouter.app.s) this.a.get();
        if (sVar != null) {
            sVar.d();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        d0.a(bundle);
    }
}
