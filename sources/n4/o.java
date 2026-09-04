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
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class o extends MediaSession.Callback {
    public final /* synthetic */ p a;

    public o(p pVar) {
        this.a = pVar;
    }

    public static void b(r rVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        MediaSession mediaSession = rVar.a;
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
        rVar.d(new a0(str, -1, -1));
    }

    public final r a() {
        r rVar;
        synchronized (this.a.a) {
            rVar = (r) this.a.d.get();
        }
        if (rVar == null || this.a != rVar.b()) {
            return null;
        }
        return rVar;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        y4.d dVar;
        r a2 = a();
        if (a2 == null) {
            return;
        }
        y.F(bundle);
        b(a2);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    x xVar = a2.c;
                    h a10 = xVar.a();
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", a10 == null ? null : a10.asBinder());
                    synchronized (xVar.a) {
                        dVar = xVar.d;
                    }
                    if (dVar != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("a", new ParcelImpl(dVar));
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                    }
                    resultReceiver.send(0, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                if (bundle != null) {
                    this.a.b((l) w7.a0.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), l.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                if (bundle != null) {
                    this.a.c((l) w7.a0.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), l.CREATOR), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                if (bundle != null) {
                    this.a.q((l) w7.a0.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), l.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                List list = a2.h;
                if (list != null && bundle != null) {
                    int i10 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                    v vVar = (i10 < 0 || i10 >= list.size()) ? null : (v) list.get(i10);
                    if (vVar != null) {
                        this.a.q(vVar.a);
                    }
                }
            } else {
                this.a.d(str, bundle, resultReceiver);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        y.F(bundle);
        b(a2);
        try {
            boolean equals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            p pVar = this.a;
            if (equals) {
                if (bundle != null) {
                    Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    y.F(bundle2);
                    pVar.l(uri, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                pVar.m();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                if (bundle != null) {
                    String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    y.F(bundle3);
                    pVar.n(string, bundle3);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                if (bundle != null) {
                    String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    y.F(bundle4);
                    pVar.o(string2, bundle4);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                if (bundle != null) {
                    Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    y.F(bundle5);
                    pVar.p(uri2, bundle5);
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                if (bundle != null) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                if (bundle != null) {
                    pVar.w(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                if (bundle != null) {
                    pVar.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                if (bundle != null) {
                    i0 i0Var = (i0) w7.a0.a(bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), i0.CREATOR);
                    y.F(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    pVar.v(i0Var);
                }
            } else if (!str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                pVar.e(str, bundle);
            } else if (bundle != null) {
                pVar.t(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.f();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        r a2 = a();
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
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.h();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.i();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        y.F(bundle);
        b(a2);
        this.a.j(str, bundle);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        y.F(bundle);
        b(a2);
        this.a.k(str, bundle);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        y.F(bundle);
        b(a2);
        this.a.l(uri, bundle);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.m();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        y.F(bundle);
        b(a2);
        this.a.n(str, bundle);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        y.F(bundle);
        b(a2);
        this.a.o(str, bundle);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        y.F(bundle);
        b(a2);
        this.a.p(uri, bundle);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.r();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j3) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.s(j3);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f7) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.t(f7);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        i0 i0Var;
        i0 i0Var2;
        r a2 = a();
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
                        i0Var = new i0(ratingStyle, -1.0f);
                        break;
                    default:
                        i0Var = null;
                        break;
                }
            } else {
                switch (ratingStyle) {
                    case 1:
                        i0Var2 = new i0(1, rating.hasHeart() ? 1.0f : 0.0f);
                        i0Var = i0Var2;
                        break;
                    case 2:
                        i0Var2 = new i0(2, rating.isThumbUp() ? 1.0f : 0.0f);
                        i0Var = i0Var2;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        i0Var = i0.d(rating.getStarRating(), ratingStyle);
                        break;
                    case 6:
                        i0Var = i0.c(rating.getPercentRating());
                        break;
                }
                this.a.u(i0Var);
                a2.d(null);
            }
            i0Var.getClass();
            i0Var.c = rating;
            this.a.u(i0Var);
            a2.d(null);
        }
        i0Var = null;
        this.a.u(i0Var);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.y();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.z();
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j3) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.A(j3);
        a2.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.a.B();
        a2.d(null);
    }
}
