package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import e2.l0;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class r extends MediaSession.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void c(String str, Bundle bundle, ResultReceiver resultReceiver) {
        int i10;
        y4.d dVar;
        u a2 = a();
        if (a2 == null) {
            return;
        }
        a0.k(bundle);
        d(a2);
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
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT") && a2.g != null && (i10 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1)) >= 0 && i10 < a2.g.size()) {
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        a2.f(null);
    }

    public static void d(u uVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        MediaSession mediaSession = uVar.a;
        String str = null;
        if (i10 >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        uVar.f(new y1.a(str, -1, -1));
    }

    public static void e(n4.l lVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        MediaSession mediaSession = lVar.a;
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
        lVar.d(new n4.r(str, -1, -1));
    }

    public u a() {
        u uVar;
        synchronized (((s) this.b).b) {
            uVar = (u) ((s) this.b).d.get();
        }
        if (uVar == null || ((s) this.b) != uVar.b()) {
            return null;
        }
        return uVar;
    }

    public n4.l b() {
        n4.l lVar;
        synchronized (((s) this.b).b) {
            lVar = (n4.l) ((s) this.b).d.get();
        }
        if (lVar == null || ((s) this.b) != lVar.b()) {
            return null;
        }
        return lVar;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        y4.d dVar;
        switch (this.a) {
            case 0:
                c(str, bundle, resultReceiver);
                return;
            default:
                n4.l b10 = b();
                if (b10 == null) {
                    return;
                }
                Bundle o10 = l0.o(bundle);
                e(b10);
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        if (resultReceiver != null) {
                            Bundle bundle2 = new Bundle();
                            n4.p pVar = b10.c;
                            n4.d a2 = pVar.a();
                            bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", a2 == null ? null : a2.asBinder());
                            synchronized (pVar.a) {
                                dVar = pVar.d;
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
                            ((s) this.b).c((n4.h) w7.e0.a(o10.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), n4.h.CREATOR));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        if (o10 != null) {
                            ((s) this.b).d((n4.h) w7.e0.a(o10.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), n4.h.CREATOR), o10.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        if (o10 != null) {
                            ((s) this.b).E((n4.h) w7.e0.a(o10.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), n4.h.CREATOR));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        List list = b10.h;
                        if (list != null && o10 != null) {
                            int i10 = o10.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            n4.o oVar = (i10 < 0 || i10 >= list.size()) ? null : (n4.o) list.get(i10);
                            if (oVar != null) {
                                ((s) this.b).E(oVar.a);
                            }
                        }
                    } else {
                        ((s) this.b).e(str, o10, resultReceiver);
                    }
                } catch (BadParcelableException unused) {
                    e2.a.c("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                b10.d(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        switch (this.a) {
            case 0:
                s sVar = (s) this.b;
                u a2 = a();
                if (a2 != null) {
                    a0.k(bundle);
                    d(a2);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            a0.k(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                            if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                                String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                                a0.k(bundle2);
                                sVar.x(string, bundle2);
                            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                                String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                                Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                                a0.k(bundle3);
                                sVar.A(string2, bundle3);
                            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                                a0.k(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                                bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                                sVar.M(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                                sVar.P(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                                a0.k(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                                bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                            } else {
                                sVar.f(str);
                            }
                        }
                    } catch (BadParcelableException unused) {
                        Log.e("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    a2.f(null);
                    break;
                }
                break;
            default:
                s sVar2 = (s) this.b;
                n4.l b10 = b();
                if (b10 != null) {
                    Bundle o10 = l0.o(bundle);
                    e(b10);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            if (o10 != null) {
                                sVar2.v((Uri) o10.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), l0.o(o10.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            sVar2.w();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            if (o10 != null) {
                                sVar2.x(o10.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), l0.o(o10.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            if (o10 != null) {
                                sVar2.A(o10.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), l0.o(o10.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            if (o10 != null) {
                                sVar2.D((Uri) o10.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), l0.o(o10.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            if (o10 != null) {
                                o10.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            if (o10 != null) {
                                sVar2.M(o10.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            if (o10 != null) {
                                sVar2.P(o10.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            if (o10 != null) {
                                n4.x xVar = (n4.x) w7.e0.a(o10.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), n4.x.CREATOR);
                                l0.o(o10.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                                sVar2.L(xVar);
                            }
                        } else if (!str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            sVar2.g(str, o10);
                        } else if (o10 != null) {
                            sVar2.J(o10.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                        }
                    } catch (BadParcelableException unused2) {
                        e2.a.c("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    d(a2);
                    a2.f(null);
                    break;
                }
                break;
            default:
                n4.l b10 = b();
                if (b10 != null) {
                    e(b10);
                    ((s) this.b).h();
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    d(a2);
                    boolean i10 = ((s) this.b).i(intent);
                    a2.f(null);
                    if (i10 || super.onMediaButtonEvent(intent)) {
                    }
                }
                break;
            default:
                n4.l b10 = b();
                if (b10 != null) {
                    e(b10);
                    boolean i11 = ((s) this.b).i(intent);
                    b10.d(null);
                    if (i11 || super.onMediaButtonEvent(intent)) {
                    }
                }
                break;
        }
        return true;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    d(a2);
                    ((s) this.b).k();
                    a2.f(null);
                    break;
                }
                break;
            default:
                n4.l b10 = b();
                if (b10 != null) {
                    e(b10);
                    ((s) this.b).k();
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    d(a2);
                    ((s) this.b).n();
                    a2.f(null);
                    break;
                }
                break;
            default:
                n4.l b10 = b();
                if (b10 != null) {
                    e(b10);
                    ((s) this.b).n();
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    a0.k(bundle);
                    d(a2);
                    ((s) this.b).q(str, bundle);
                    a2.f(null);
                    break;
                }
                break;
            default:
                n4.l b10 = b();
                if (b10 != null) {
                    Bundle o10 = l0.o(bundle);
                    e(b10);
                    ((s) this.b).q(str, o10);
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    a0.k(bundle);
                    d(a2);
                    ((s) this.b).t(str);
                    a2.f(null);
                    break;
                }
                break;
            default:
                n4.l b10 = b();
                if (b10 != null) {
                    Bundle o10 = l0.o(bundle);
                    e(b10);
                    ((s) this.b).u(str, o10);
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    a0.k(bundle);
                    d(a2);
                    a2.f(null);
                    break;
                }
                break;
            default:
                n4.l b10 = b();
                if (b10 != null) {
                    Bundle o10 = l0.o(bundle);
                    e(b10);
                    ((s) this.b).v(uri, o10);
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    d(a2);
                    a2.f(null);
                    break;
                }
                break;
            default:
                n4.l b10 = b();
                if (b10 != null) {
                    e(b10);
                    ((s) this.b).w();
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    a0.k(bundle);
                    d(a2);
                    ((s) this.b).x(str, bundle);
                    a2.f(null);
                    break;
                }
                break;
            default:
                n4.l b10 = b();
                if (b10 != null) {
                    Bundle o10 = l0.o(bundle);
                    e(b10);
                    ((s) this.b).x(str, o10);
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    a0.k(bundle);
                    d(a2);
                    ((s) this.b).A(str, bundle);
                    a2.f(null);
                    break;
                }
                break;
            default:
                n4.l b10 = b();
                if (b10 != null) {
                    Bundle o10 = l0.o(bundle);
                    e(b10);
                    ((s) this.b).A(str, o10);
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    a0.k(bundle);
                    d(a2);
                    a2.f(null);
                    break;
                }
                break;
            default:
                n4.l b10 = b();
                if (b10 != null) {
                    Bundle o10 = l0.o(bundle);
                    e(b10);
                    ((s) this.b).D(uri, o10);
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    d(a2);
                    a2.f(null);
                    break;
                }
                break;
            default:
                n4.l b10 = b();
                if (b10 != null) {
                    e(b10);
                    ((s) this.b).F();
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j10) {
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    d(a2);
                    ((s) this.b).G(j10);
                    a2.f(null);
                    break;
                }
                break;
            default:
                n4.l b10 = b();
                if (b10 != null) {
                    e(b10);
                    ((s) this.b).G(j10);
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f7) {
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    d(a2);
                    a2.f(null);
                    break;
                }
                break;
            default:
                n4.l b10 = b();
                if (b10 != null) {
                    e(b10);
                    ((s) this.b).J(f7);
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        float f7;
        n4.x xVar;
        n4.x xVar2;
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    d(a2);
                    if (rating != null) {
                        int b10 = android.support.v4.media.c.b(rating);
                        RatingCompat ratingCompat = null;
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
                    a2.f(null);
                    break;
                }
                break;
            default:
                n4.l b11 = b();
                if (b11 != null) {
                    e(b11);
                    s sVar = (s) this.b;
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
                                    xVar = new n4.x(ratingStyle, -1.0f);
                                    break;
                                default:
                                    xVar = null;
                                    break;
                            }
                        } else {
                            switch (ratingStyle) {
                                case 1:
                                    xVar2 = new n4.x(1, rating.hasHeart() ? 1.0f : 0.0f);
                                    xVar = xVar2;
                                    break;
                                case 2:
                                    xVar2 = new n4.x(2, rating.isThumbUp() ? 1.0f : 0.0f);
                                    xVar = xVar2;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    xVar = n4.x.d(rating.getStarRating(), ratingStyle);
                                    break;
                                case 6:
                                    xVar = n4.x.c(rating.getPercentRating());
                                    break;
                            }
                            sVar.K(xVar);
                            b11.d(null);
                            break;
                        }
                        xVar.getClass();
                        xVar.c = rating;
                        sVar.K(xVar);
                        b11.d(null);
                    }
                    xVar = null;
                    sVar.K(xVar);
                    b11.d(null);
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    d(a2);
                    ((s) this.b).S();
                    a2.f(null);
                    break;
                }
                break;
            default:
                n4.l b10 = b();
                if (b10 != null) {
                    e(b10);
                    ((s) this.b).S();
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    d(a2);
                    ((s) this.b).V();
                    a2.f(null);
                    break;
                }
                break;
            default:
                n4.l b10 = b();
                if (b10 != null) {
                    e(b10);
                    ((s) this.b).V();
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j10) {
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    d(a2);
                    ((s) this.b).Y(j10);
                    a2.f(null);
                    break;
                }
                break;
            default:
                n4.l b10 = b();
                if (b10 != null) {
                    e(b10);
                    ((s) this.b).Y(j10);
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        switch (this.a) {
            case 0:
                u a2 = a();
                if (a2 != null) {
                    d(a2);
                    a2.f(null);
                    break;
                }
                break;
            default:
                n4.l b10 = b();
                if (b10 != null) {
                    e(b10);
                    ((s) this.b).b0();
                    b10.d(null);
                    break;
                }
                break;
        }
    }
}
