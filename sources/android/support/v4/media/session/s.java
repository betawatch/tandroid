package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s extends MediaSession.Callback {
    public final /* synthetic */ t a;

    public s(t tVar) {
        this.a = tVar;
    }

    public static void b(w wVar) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 28) {
            return;
        }
        MediaSession mediaSession = wVar.a;
        String str = null;
        if (i9 >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e10) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e10);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        wVar.d(new y1.a(str, -1, -1));
    }

    public final w a() {
        w wVar;
        synchronized (this.a.mLock) {
            wVar = (w) this.a.mSessionImpl.get();
        }
        if (wVar == null || this.a != wVar.a()) {
            return null;
        }
        return wVar;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        l2.d dVar;
        w a2 = a();
        if (a2 == null) {
            return;
        }
        d0.a(bundle);
        b(a2);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat$Token mediaSessionCompat$Token = a2.b;
                d a3 = mediaSessionCompat$Token.a();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", a3 == null ? null : a3.asBinder());
                synchronized (mediaSessionCompat$Token.a) {
                    dVar = mediaSessionCompat$Token.d;
                }
                if (dVar != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("a", new ParcelImpl(dVar));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                this.a.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                this.a.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                this.a.onRemoveQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
            } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                this.a.onCommand(str, bundle, resultReceiver);
            } else if (a2.g != null) {
                int i9 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (i9 < 0 || i9 >= a2.g.size()) ? null : (MediaSessionCompat$QueueItem) a2.g.get(i9);
                if (mediaSessionCompat$QueueItem != null) {
                    this.a.onRemoveQueueItem(mediaSessionCompat$QueueItem.a);
                }
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        w a2 = a();
        if (a2 == null) {
            return;
        }
        d0.a(bundle);
        b(a2);
        try {
            boolean equals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            t tVar = this.a;
            if (equals) {
                Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                d0.a(bundle2);
                tVar.onPlayFromUri(uri, bundle2);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                tVar.onPrepare();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                d0.a(bundle3);
                tVar.onPrepareFromMediaId(string, bundle3);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                d0.a(bundle4);
                tVar.onPrepareFromSearch(string2, bundle4);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                d0.a(bundle5);
                tVar.onPrepareFromUri(uri2, bundle5);
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                tVar.onSetCaptioningEnabled(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                tVar.onSetRepeatMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                tVar.onSetShuffleMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                d0.a(bundle6);
                tVar.onSetRating(ratingCompat, bundle6);
            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                tVar.onSetPlaybackSpeed(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
            } else {
                tVar.onCustomAction(str, bundle);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        w a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onFastForward();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        w a2 = a();
        if (a2 == null) {
            return false;
        }
        b(a2);
        boolean onMediaButtonEvent = this.a.onMediaButtonEvent(intent);
        a2.d(null);
        return onMediaButtonEvent || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        w a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onPause();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        w a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onPlay();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        w a2 = a();
        if (a2 == null) {
            return;
        }
        d0.a(bundle);
        b(a2);
        this.a.onPlayFromMediaId(str, bundle);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        w a2 = a();
        if (a2 == null) {
            return;
        }
        d0.a(bundle);
        b(a2);
        this.a.onPlayFromSearch(str, bundle);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        w a2 = a();
        if (a2 == null) {
            return;
        }
        d0.a(bundle);
        b(a2);
        this.a.onPlayFromUri(uri, bundle);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        w a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onPrepare();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        w a2 = a();
        if (a2 == null) {
            return;
        }
        d0.a(bundle);
        b(a2);
        this.a.onPrepareFromMediaId(str, bundle);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        w a2 = a();
        if (a2 == null) {
            return;
        }
        d0.a(bundle);
        b(a2);
        this.a.onPrepareFromSearch(str, bundle);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        w a2 = a();
        if (a2 == null) {
            return;
        }
        d0.a(bundle);
        b(a2);
        this.a.onPrepareFromUri(uri, bundle);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        w a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onRewind();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j10) {
        w a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onSeekTo(j10);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f10) {
        w a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onSetPlaybackSpeed(f10);
        a2.d(null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x001c. Please report as an issue. */
    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        RatingCompat ratingCompat;
        float f10;
        w a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        RatingCompat ratingCompat2 = null;
        if (rating != null) {
            int b10 = android.support.v4.media.d.b(rating);
            if (!android.support.v4.media.d.e(rating)) {
                switch (b10) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat2 = new RatingCompat(b10, -1.0f);
                        break;
                }
            } else {
                switch (b10) {
                    case 1:
                        ratingCompat = new RatingCompat(1, android.support.v4.media.d.d(rating) ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, android.support.v4.media.d.f(rating) ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float c10 = android.support.v4.media.d.c(rating);
                        if (b10 == 3) {
                            f10 = 3.0f;
                        } else if (b10 == 4) {
                            f10 = 4.0f;
                        } else if (b10 != 5) {
                            Log.e("Rating", "Invalid rating style (" + b10 + ") for a star rating");
                            break;
                        } else {
                            f10 = 5.0f;
                        }
                        if (c10 >= 0.0f && c10 <= f10) {
                            ratingCompat2 = new RatingCompat(b10, c10);
                            break;
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                            break;
                        }
                        break;
                    case 6:
                        float a3 = android.support.v4.media.d.a(rating);
                        if (a3 >= 0.0f && a3 <= 100.0f) {
                            ratingCompat2 = new RatingCompat(6, a3);
                            break;
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                            break;
                        }
                        break;
                }
            }
            ratingCompat2.c = rating;
        }
        this.a.onSetRating(ratingCompat2);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        w a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onSkipToNext();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        w a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onSkipToPrevious();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j10) {
        w a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onSkipToQueueItem(j10);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        w a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onStop();
        a2.d(null);
    }
}
