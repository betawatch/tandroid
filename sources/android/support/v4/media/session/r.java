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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class r extends MediaSession.Callback {
    public final /* synthetic */ s a;

    public r(s sVar) {
        this.a = sVar;
    }

    public static void b(v vVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        MediaSession mediaSession = vVar.a;
        String str = null;
        if (i10 >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e7) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e7);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        vVar.c(new y1.a(str, -1, -1));
    }

    public final v a() {
        v vVar;
        synchronized (this.a.mLock) {
            vVar = (v) this.a.mSessionImpl.get();
        }
        if (vVar == null || this.a != vVar.a()) {
            return null;
        }
        return vVar;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        y4.d dVar;
        v a2 = a();
        if (a2 == null) {
            return;
        }
        c0.a(bundle);
        b(a2);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat$Token mediaSessionCompat$Token = a2.c;
                d a10 = mediaSessionCompat$Token.a();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", a10 == null ? null : a10.asBinder());
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
                int i10 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (i10 < 0 || i10 >= a2.g.size()) ? null : (MediaSessionCompat$QueueItem) a2.g.get(i10);
                if (mediaSessionCompat$QueueItem != null) {
                    this.a.onRemoveQueueItem(mediaSessionCompat$QueueItem.a);
                }
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        v a2 = a();
        if (a2 == null) {
            return;
        }
        c0.a(bundle);
        b(a2);
        try {
            boolean equals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            s sVar = this.a;
            if (equals) {
                Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                c0.a(bundle2);
                sVar.onPlayFromUri(uri, bundle2);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                sVar.onPrepare();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                c0.a(bundle3);
                sVar.onPrepareFromMediaId(string, bundle3);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                c0.a(bundle4);
                sVar.onPrepareFromSearch(string2, bundle4);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                c0.a(bundle5);
                sVar.onPrepareFromUri(uri2, bundle5);
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                sVar.onSetCaptioningEnabled(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                sVar.onSetRepeatMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                sVar.onSetShuffleMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                c0.a(bundle6);
                sVar.onSetRating(ratingCompat, bundle6);
            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                sVar.onSetPlaybackSpeed(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
            } else {
                sVar.onCustomAction(str, bundle);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        v a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onFastForward();
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        v a2 = a();
        if (a2 == null) {
            return false;
        }
        b(a2);
        boolean onMediaButtonEvent = this.a.onMediaButtonEvent(intent);
        a2.c(null);
        return onMediaButtonEvent || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        v a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onPause();
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        v a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onPlay();
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        v a2 = a();
        if (a2 == null) {
            return;
        }
        c0.a(bundle);
        b(a2);
        this.a.onPlayFromMediaId(str, bundle);
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        v a2 = a();
        if (a2 == null) {
            return;
        }
        c0.a(bundle);
        b(a2);
        this.a.onPlayFromSearch(str, bundle);
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        v a2 = a();
        if (a2 == null) {
            return;
        }
        c0.a(bundle);
        b(a2);
        this.a.onPlayFromUri(uri, bundle);
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        v a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onPrepare();
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        v a2 = a();
        if (a2 == null) {
            return;
        }
        c0.a(bundle);
        b(a2);
        this.a.onPrepareFromMediaId(str, bundle);
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        v a2 = a();
        if (a2 == null) {
            return;
        }
        c0.a(bundle);
        b(a2);
        this.a.onPrepareFromSearch(str, bundle);
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        v a2 = a();
        if (a2 == null) {
            return;
        }
        c0.a(bundle);
        b(a2);
        this.a.onPrepareFromUri(uri, bundle);
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        v a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onRewind();
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j3) {
        v a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onSeekTo(j3);
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f7) {
        v a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onSetPlaybackSpeed(f7);
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        float f7;
        v a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        RatingCompat ratingCompat = null;
        if (rating != null) {
            int b10 = android.support.v4.media.c.b(rating);
            if (!android.support.v4.media.c.e(rating)) {
                switch (b10) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat = new RatingCompat(b10, -1.0f);
                        break;
                }
            } else {
                switch (b10) {
                    case 1:
                        ratingCompat = new RatingCompat(1, android.support.v4.media.c.d(rating) ? 1.0f : 0.0f);
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, android.support.v4.media.c.f(rating) ? 1.0f : 0.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float c10 = android.support.v4.media.c.c(rating);
                        if (b10 == 3) {
                            f7 = 3.0f;
                        } else if (b10 == 4) {
                            f7 = 4.0f;
                        } else if (b10 != 5) {
                            Log.e("Rating", "Invalid rating style (" + b10 + ") for a star rating");
                            break;
                        } else {
                            f7 = 5.0f;
                        }
                        if (c10 >= 0.0f && c10 <= f7) {
                            ratingCompat = new RatingCompat(b10, c10);
                            break;
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                            break;
                        }
                        break;
                    case 6:
                        float a10 = android.support.v4.media.c.a(rating);
                        if (a10 >= 0.0f && a10 <= 100.0f) {
                            ratingCompat = new RatingCompat(6, a10);
                            break;
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                            break;
                        }
                        break;
                }
            }
            ratingCompat.getClass();
        }
        this.a.onSetRating(ratingCompat);
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        v a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onSkipToNext();
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        v a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onSkipToPrevious();
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j3) {
        v a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onSkipToQueueItem(j3);
        a2.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        v a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.onStop();
        a2.c(null);
    }
}
