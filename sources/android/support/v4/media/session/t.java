package android.support.v4.media.session;

import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class t {
    r mCallbackHandler;
    private boolean mMediaPlayPausePendingOnHandler;
    final Object mLock = new Object();
    final MediaSession.Callback mCallbackFwk = new s(this);
    WeakReference<u> mSessionImpl = new WeakReference<>(null);

    public void handleMediaPlayPauseIfPendingOnHandler(u uVar, Handler handler) {
        if (this.mMediaPlayPausePendingOnHandler) {
            this.mMediaPlayPausePendingOnHandler = false;
            handler.removeMessages(1);
            PlaybackStateCompat b10 = uVar.b();
            long j10 = b10 == null ? 0L : b10.e;
            boolean z10 = b10 != null && b10.a == 3;
            boolean z11 = (516 & j10) != 0;
            boolean z12 = (j10 & 514) != 0;
            if (z10 && z12) {
                onPause();
            } else {
                if (z10 || !z11) {
                    return;
                }
                onPlay();
            }
        }
    }

    public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    public boolean onMediaButtonEvent(Intent intent) {
        u uVar;
        r rVar;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.mLock) {
                uVar = this.mSessionImpl.get();
                rVar = this.mCallbackHandler;
            }
            if (uVar != null && rVar != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                y1.a c10 = uVar.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    handleMediaPlayPauseIfPendingOnHandler(uVar, rVar);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    handleMediaPlayPauseIfPendingOnHandler(uVar, rVar);
                    return true;
                }
                if (!this.mMediaPlayPausePendingOnHandler) {
                    this.mMediaPlayPausePendingOnHandler = true;
                    rVar.sendMessageDelayed(rVar.obtainMessage(1, c10), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                rVar.removeMessages(1);
                this.mMediaPlayPausePendingOnHandler = false;
                PlaybackStateCompat b10 = uVar.b();
                if (((b10 == null ? 0L : b10.e) & 32) != 0) {
                    onSkipToNext();
                }
                return true;
            }
        }
        return false;
    }

    public void onSetRating(RatingCompat ratingCompat) {
    }

    public void setSessionImpl(u uVar, Handler handler) {
        synchronized (this.mLock) {
            try {
                this.mSessionImpl = new WeakReference<>(uVar);
                r rVar = this.mCallbackHandler;
                r rVar2 = null;
                if (rVar != null) {
                    rVar.removeCallbacksAndMessages(null);
                }
                if (uVar != null && handler != null) {
                    rVar2 = new r(this, handler.getLooper());
                }
                this.mCallbackHandler = rVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
    }

    public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
    }

    public void onFastForward() {
    }

    public void onPause() {
    }

    public void onPlay() {
    }

    public void onPrepare() {
    }

    public void onRewind() {
    }

    public void onSkipToNext() {
    }

    public void onSkipToPrevious() {
    }

    public void onStop() {
    }

    public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    @Deprecated
    public void onRemoveQueueItemAt(int i10) {
    }

    public void onSeekTo(long j10) {
    }

    public void onSetCaptioningEnabled(boolean z10) {
    }

    public void onSetPlaybackSpeed(float f10) {
    }

    public void onSetRepeatMode(int i10) {
    }

    public void onSetShuffleMode(int i10) {
    }

    public void onSkipToQueueItem(long j10) {
    }

    public void onCustomAction(String str, Bundle bundle) {
    }

    public void onPlayFromMediaId(String str, Bundle bundle) {
    }

    public void onPlayFromSearch(String str, Bundle bundle) {
    }

    public void onPlayFromUri(Uri uri, Bundle bundle) {
    }

    public void onPrepareFromMediaId(String str, Bundle bundle) {
    }

    public void onPrepareFromSearch(String str, Bundle bundle) {
    }

    public void onPrepareFromUri(Uri uri, Bundle bundle) {
    }

    public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }
}
