package n4;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import androidx.versionedparcelable.ParcelImpl;
import e2.m0;
import java.util.List;
import w7.b0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class k extends MediaSession.Callback {
    public final /* synthetic */ l a;

    public k(l lVar) {
        this.a = lVar;
    }

    public static void b(n nVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        MediaSession mediaSession = nVar.a;
        String str = null;
        if (i10 >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e) {
                e2.a.d("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        nVar.d(new t(str, -1, -1));
    }

    public final n a() {
        n nVar;
        synchronized (this.a.a) {
            nVar = (n) this.a.d.get();
        }
        if (nVar == null || this.a != nVar.b()) {
            return null;
        }
        return nVar;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        y4.d dVar;
        n a2 = a();
        if (a2 == null) {
            return;
        }
        Bundle o10 = m0.o(bundle);
        b(a2);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    r rVar = a2.c;
                    d a10 = rVar.a();
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", a10 == null ? null : a10.asBinder());
                    synchronized (rVar.a) {
                        dVar = rVar.d;
                    }
                    if (dVar != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("a", new ParcelImpl(dVar));
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                    }
                    resultReceiver.send(0, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                if (o10 != null) {
                    this.a.b((h) b0.a(o10.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), h.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                if (o10 != null) {
                    this.a.c((h) b0.a(o10.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), h.CREATOR), o10.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                if (o10 != null) {
                    this.a.q((h) b0.a(o10.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), h.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                List list = a2.h;
                if (list != null && o10 != null) {
                    int i10 = o10.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                    q qVar = (i10 < 0 || i10 >= list.size()) ? null : (q) list.get(i10);
                    if (qVar != null) {
                        this.a.q(qVar.a);
                    }
                }
            } else {
                this.a.d(str, o10, resultReceiver);
            }
        } catch (BadParcelableException unused) {
            e2.a.c("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        Bundle o10 = m0.o(bundle);
        b(a2);
        try {
            boolean equals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            l lVar = this.a;
            if (equals) {
                if (o10 != null) {
                    lVar.l((Uri) o10.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), m0.o(o10.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                lVar.m();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                if (o10 != null) {
                    lVar.n(o10.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), m0.o(o10.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                if (o10 != null) {
                    lVar.o(o10.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), m0.o(o10.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                if (o10 != null) {
                    lVar.p((Uri) o10.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), m0.o(o10.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                if (o10 != null) {
                    o10.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                if (o10 != null) {
                    lVar.w(o10.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                if (o10 != null) {
                    lVar.x(o10.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                if (o10 != null) {
                    z zVar = (z) b0.a(o10.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), z.CREATOR);
                    m0.o(o10.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    lVar.v(zVar);
                }
            } else if (!str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                lVar.e(str, o10);
            } else if (o10 != null) {
                lVar.t(o10.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
            }
        } catch (BadParcelableException unused) {
            e2.a.c("MediaSessionCompat", "Could not unparcel the data.");
        }
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.f();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        n a2 = a();
        if (a2 == null) {
            return false;
        }
        b(a2);
        boolean g10 = this.a.g(intent);
        a2.d(null);
        return g10 || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.h();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.i();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        Bundle o10 = m0.o(bundle);
        b(a2);
        this.a.j(str, o10);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        Bundle o10 = m0.o(bundle);
        b(a2);
        this.a.k(str, o10);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        Bundle o10 = m0.o(bundle);
        b(a2);
        this.a.l(uri, o10);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.m();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        Bundle o10 = m0.o(bundle);
        b(a2);
        this.a.n(str, o10);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        Bundle o10 = m0.o(bundle);
        b(a2);
        this.a.o(str, o10);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        Bundle o10 = m0.o(bundle);
        b(a2);
        this.a.p(uri, o10);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.r();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j10) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.s(j10);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f7) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.t(f7);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        z zVar;
        z zVar2;
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        if (rating != null) {
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zVar = new z(ratingStyle, -1.0f);
                        break;
                    default:
                        zVar = null;
                        break;
                }
            } else {
                switch (ratingStyle) {
                    case 1:
                        zVar2 = new z(1, rating.hasHeart() ? 1.0f : 0.0f);
                        zVar = zVar2;
                        break;
                    case 2:
                        zVar2 = new z(2, rating.isThumbUp() ? 1.0f : 0.0f);
                        zVar = zVar2;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        zVar = z.d(rating.getStarRating(), ratingStyle);
                        break;
                    case 6:
                        zVar = z.c(rating.getPercentRating());
                        break;
                }
                this.a.u(zVar);
                a2.d(null);
            }
            zVar.getClass();
            zVar.c = rating;
            this.a.u(zVar);
            a2.d(null);
        }
        zVar = null;
        this.a.u(zVar);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.y();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.z();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j10) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.A(j10);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.B();
        a2.d(null);
    }
}
