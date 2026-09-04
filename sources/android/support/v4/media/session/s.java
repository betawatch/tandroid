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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class s {
    q mCallbackHandler;
    private boolean mMediaPlayPausePendingOnHandler;
    final Object mLock = new Object();
    final MediaSession.Callback mCallbackFwk = new r(this);
    WeakReference<t> mSessionImpl = new WeakReference<>(null);

    public void handleMediaPlayPauseIfPendingOnHandler(t tVar, Handler handler) {
        if (this.mMediaPlayPausePendingOnHandler) {
            this.mMediaPlayPausePendingOnHandler = false;
            handler.removeMessages(1);
            PlaybackStateCompat d = tVar.d();
            long j3 = d == null ? 0L : d.e;
            boolean z10 = d != null && d.a == 3;
            boolean z11 = (516 & j3) != 0;
            boolean z12 = (j3 & 514) != 0;
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
        t tVar;
        q qVar;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.mLock) {
                tVar = this.mSessionImpl.get();
                qVar = this.mCallbackHandler;
            }
            if (tVar != null && qVar != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                y1.a b10 = tVar.b();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    handleMediaPlayPauseIfPendingOnHandler(tVar, qVar);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    handleMediaPlayPauseIfPendingOnHandler(tVar, qVar);
                    return true;
                }
                if (!this.mMediaPlayPausePendingOnHandler) {
                    this.mMediaPlayPausePendingOnHandler = true;
                    qVar.sendMessageDelayed(qVar.obtainMessage(1, b10), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                qVar.removeMessages(1);
                this.mMediaPlayPausePendingOnHandler = false;
                PlaybackStateCompat d = tVar.d();
                if (((d == null ? 0L : d.e) & 32) != 0) {
                    onSkipToNext();
                }
                return true;
            }
        }
        return false;
    }

    public void onSetRating(RatingCompat ratingCompat) {
    }

    public void setSessionImpl(t tVar, Handler handler) {
        synchronized (this.mLock) {
            try {
                this.mSessionImpl = new WeakReference<>(tVar);
                q qVar = this.mCallbackHandler;
                q qVar2 = null;
                if (qVar != null) {
                    qVar.removeCallbacksAndMessages(null);
                }
                if (tVar != null && handler != null) {
                    qVar2 = new q(this, handler.getLooper());
                }
                this.mCallbackHandler = qVar2;
            } catch (Throwable th2) {
                throw th2;
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

    public void onSeekTo(long j3) {
    }

    public void onSetCaptioningEnabled(boolean z10) {
    }

    public void onSetPlaybackSpeed(float f7) {
    }

    public void onSetRepeatMode(int i10) {
    }

    public void onSetShuffleMode(int i10) {
    }

    public void onSkipToQueueItem(long j3) {
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
