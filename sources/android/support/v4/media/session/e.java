package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class e extends MediaController.Callback {
    public final WeakReference a;

    public e(androidx.mediarouter.app.r rVar) {
        this.a = new WeakReference(rVar);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        if (((androidx.mediarouter.app.r) this.a.get()) != null) {
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
        c0.a(bundle);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        MediaMetadataCompat mediaMetadataCompat;
        androidx.mediarouter.app.r rVar = (androidx.mediarouter.app.r) this.a.get();
        if (rVar != null) {
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
            rVar.a(mediaMetadataCompat);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        androidx.mediarouter.app.r rVar = (androidx.mediarouter.app.r) this.a.get();
        if (rVar == null || rVar.c != null) {
            return;
        }
        rVar.b(PlaybackStateCompat.a(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        if (((androidx.mediarouter.app.r) this.a.get()) == null || list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj != null) {
                MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(queueItem, MediaDescriptionCompat.a(a0.b(queueItem)), a0.c(queueItem));
            } else {
                mediaSessionCompat$QueueItem = null;
            }
            arrayList.add(mediaSessionCompat$QueueItem);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        androidx.mediarouter.app.r rVar = (androidx.mediarouter.app.r) this.a.get();
        if (rVar != null) {
            rVar.d();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        c0.a(bundle);
    }
}
