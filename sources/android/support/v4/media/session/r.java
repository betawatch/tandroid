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
import c8.sb;
import h2.m0;
import java.util.List;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class r extends MediaSession.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void c(String str, Bundle bundle, ResultReceiver resultReceiver) {
        int i7;
        b5.d dVar;
        u a10 = a();
        if (a10 == null) {
            return;
        }
        a0.g(bundle);
        d(a10);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat$Token mediaSessionCompat$Token = a10.c;
                d a11 = mediaSessionCompat$Token.a();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", a11 == null ? null : a11.asBinder());
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
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT") && a10.g != null && (i7 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1)) >= 0 && i7 < a10.g.size()) {
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        a10.f(null);
    }

    public static void d(u uVar) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            return;
        }
        MediaSession mediaSession = uVar.a;
        String str = null;
        if (i7 >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e10) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e10);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        uVar.f(new b2.a(str, -1, -1));
    }

    public static void e(q4.l lVar) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            return;
        }
        MediaSession mediaSession = lVar.a;
        String str = null;
        if (i7 >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e10) {
                h2.a.d("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e10);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        lVar.d(new q4.r(str, -1, -1));
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

    public q4.l b() {
        q4.l lVar;
        synchronized (((s) this.b).b) {
            lVar = (q4.l) ((s) this.b).d.get();
        }
        if (lVar == null || ((s) this.b) != lVar.b()) {
            return null;
        }
        return lVar;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        b5.d dVar;
        switch (this.a) {
            case 0:
                c(str, bundle, resultReceiver);
                return;
            default:
                q4.l b10 = b();
                if (b10 == null) {
                    return;
                }
                Bundle o4 = m0.o(bundle);
                e(b10);
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        if (resultReceiver != null) {
                            Bundle bundle2 = new Bundle();
                            q4.p pVar = b10.c;
                            q4.d a10 = pVar.a();
                            bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", a10 == null ? null : a10.asBinder());
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
                        if (o4 != null) {
                            ((s) this.b).c((q4.h) sb.a(o4.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), q4.h.CREATOR));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        if (o4 != null) {
                            ((s) this.b).d((q4.h) sb.a(o4.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), q4.h.CREATOR), o4.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        if (o4 != null) {
                            ((s) this.b).E((q4.h) sb.a(o4.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), q4.h.CREATOR));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        List list = b10.h;
                        if (list != null && o4 != null) {
                            int i7 = o4.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            q4.o oVar = (i7 < 0 || i7 >= list.size()) ? null : (q4.o) list.get(i7);
                            if (oVar != null) {
                                ((s) this.b).E(oVar.a);
                            }
                        }
                    } else {
                        ((s) this.b).e(str, o4, resultReceiver);
                    }
                } catch (BadParcelableException unused) {
                    h2.a.c("MediaSessionCompat", "Could not unparcel the extra data.");
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
                u a10 = a();
                if (a10 != null) {
                    a0.g(bundle);
                    d(a10);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            a0.g(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                            if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                                String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                                a0.g(bundle2);
                                sVar.x(string, bundle2);
                            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                                String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                                Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                                a0.g(bundle3);
                                sVar.A(string2, bundle3);
                            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                                a0.g(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                                bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                                sVar.M(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                                sVar.P(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                                a0.g(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                                bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                            } else {
                                sVar.f(str);
                            }
                        }
                    } catch (BadParcelableException unused) {
                        Log.e("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    a10.f(null);
                    break;
                }
                break;
            default:
                s sVar2 = (s) this.b;
                q4.l b10 = b();
                if (b10 != null) {
                    Bundle o4 = m0.o(bundle);
                    e(b10);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            if (o4 != null) {
                                sVar2.v((Uri) o4.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), m0.o(o4.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            sVar2.w();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            if (o4 != null) {
                                sVar2.x(o4.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), m0.o(o4.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            if (o4 != null) {
                                sVar2.A(o4.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), m0.o(o4.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            if (o4 != null) {
                                sVar2.D((Uri) o4.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), m0.o(o4.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            if (o4 != null) {
                                o4.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            if (o4 != null) {
                                sVar2.M(o4.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            if (o4 != null) {
                                sVar2.P(o4.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            if (o4 != null) {
                                q4.y yVar = (q4.y) sb.a(o4.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), q4.y.CREATOR);
                                m0.o(o4.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                                sVar2.L(yVar);
                            }
                        } else if (!str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            sVar2.g(str, o4);
                        } else if (o4 != null) {
                            sVar2.J(o4.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                        }
                    } catch (BadParcelableException unused2) {
                        h2.a.c("MediaSessionCompat", "Could not unparcel the data.");
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
                u a10 = a();
                if (a10 != null) {
                    d(a10);
                    a10.f(null);
                    break;
                }
                break;
            default:
                q4.l b10 = b();
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
                u a10 = a();
                if (a10 != null) {
                    d(a10);
                    boolean i7 = ((s) this.b).i(intent);
                    a10.f(null);
                    if (i7 || super.onMediaButtonEvent(intent)) {
                    }
                }
                break;
            default:
                q4.l b10 = b();
                if (b10 != null) {
                    e(b10);
                    boolean i10 = ((s) this.b).i(intent);
                    b10.d(null);
                    if (i10 || super.onMediaButtonEvent(intent)) {
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
                u a10 = a();
                if (a10 != null) {
                    d(a10);
                    ((s) this.b).k();
                    a10.f(null);
                    break;
                }
                break;
            default:
                q4.l b10 = b();
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
                u a10 = a();
                if (a10 != null) {
                    d(a10);
                    ((s) this.b).n();
                    a10.f(null);
                    break;
                }
                break;
            default:
                q4.l b10 = b();
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
                u a10 = a();
                if (a10 != null) {
                    a0.g(bundle);
                    d(a10);
                    ((s) this.b).q(str, bundle);
                    a10.f(null);
                    break;
                }
                break;
            default:
                q4.l b10 = b();
                if (b10 != null) {
                    Bundle o4 = m0.o(bundle);
                    e(b10);
                    ((s) this.b).q(str, o4);
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
                u a10 = a();
                if (a10 != null) {
                    a0.g(bundle);
                    d(a10);
                    ((s) this.b).t(str);
                    a10.f(null);
                    break;
                }
                break;
            default:
                q4.l b10 = b();
                if (b10 != null) {
                    Bundle o4 = m0.o(bundle);
                    e(b10);
                    ((s) this.b).u(str, o4);
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
                u a10 = a();
                if (a10 != null) {
                    a0.g(bundle);
                    d(a10);
                    a10.f(null);
                    break;
                }
                break;
            default:
                q4.l b10 = b();
                if (b10 != null) {
                    Bundle o4 = m0.o(bundle);
                    e(b10);
                    ((s) this.b).v(uri, o4);
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
                u a10 = a();
                if (a10 != null) {
                    d(a10);
                    a10.f(null);
                    break;
                }
                break;
            default:
                q4.l b10 = b();
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
                u a10 = a();
                if (a10 != null) {
                    a0.g(bundle);
                    d(a10);
                    ((s) this.b).x(str, bundle);
                    a10.f(null);
                    break;
                }
                break;
            default:
                q4.l b10 = b();
                if (b10 != null) {
                    Bundle o4 = m0.o(bundle);
                    e(b10);
                    ((s) this.b).x(str, o4);
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
                u a10 = a();
                if (a10 != null) {
                    a0.g(bundle);
                    d(a10);
                    ((s) this.b).A(str, bundle);
                    a10.f(null);
                    break;
                }
                break;
            default:
                q4.l b10 = b();
                if (b10 != null) {
                    Bundle o4 = m0.o(bundle);
                    e(b10);
                    ((s) this.b).A(str, o4);
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
                u a10 = a();
                if (a10 != null) {
                    a0.g(bundle);
                    d(a10);
                    a10.f(null);
                    break;
                }
                break;
            default:
                q4.l b10 = b();
                if (b10 != null) {
                    Bundle o4 = m0.o(bundle);
                    e(b10);
                    ((s) this.b).D(uri, o4);
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
                u a10 = a();
                if (a10 != null) {
                    d(a10);
                    a10.f(null);
                    break;
                }
                break;
            default:
                q4.l b10 = b();
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
    public final void onSeekTo(long j3) {
        switch (this.a) {
            case 0:
                u a10 = a();
                if (a10 != null) {
                    d(a10);
                    ((s) this.b).G(j3);
                    a10.f(null);
                    break;
                }
                break;
            default:
                q4.l b10 = b();
                if (b10 != null) {
                    e(b10);
                    ((s) this.b).G(j3);
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f10) {
        switch (this.a) {
            case 0:
                u a10 = a();
                if (a10 != null) {
                    d(a10);
                    a10.f(null);
                    break;
                }
                break;
            default:
                q4.l b10 = b();
                if (b10 != null) {
                    e(b10);
                    ((s) this.b).J(f10);
                    b10.d(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        float f10;
        q4.y yVar;
        q4.y yVar2;
        switch (this.a) {
            case 0:
                u a10 = a();
                if (a10 != null) {
                    d(a10);
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
                                        ratingCompat = new RatingCompat(b10, c10);
                                        break;
                                    } else {
                                        Log.e("Rating", "Trying to set out of range star-based rating");
                                        break;
                                    }
                                case 6:
                                    float a11 = android.support.v4.media.c.a(rating);
                                    if (a11 >= 0.0f && a11 <= 100.0f) {
                                        ratingCompat = new RatingCompat(6, a11);
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
                    a10.f(null);
                    break;
                }
                break;
            default:
                q4.l b11 = b();
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
                                    yVar = new q4.y(ratingStyle, -1.0f);
                                    break;
                                default:
                                    yVar = null;
                                    break;
                            }
                        } else {
                            switch (ratingStyle) {
                                case 1:
                                    yVar2 = new q4.y(1, rating.hasHeart() ? 1.0f : 0.0f);
                                    yVar = yVar2;
                                    break;
                                case 2:
                                    yVar2 = new q4.y(2, rating.isThumbUp() ? 1.0f : 0.0f);
                                    yVar = yVar2;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    yVar = q4.y.d(rating.getStarRating(), ratingStyle);
                                    break;
                                case 6:
                                    yVar = q4.y.c(rating.getPercentRating());
                                    break;
                            }
                            sVar.K(yVar);
                            b11.d(null);
                            break;
                        }
                        yVar.getClass();
                        yVar.c = rating;
                        sVar.K(yVar);
                        b11.d(null);
                    }
                    yVar = null;
                    sVar.K(yVar);
                    b11.d(null);
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        switch (this.a) {
            case 0:
                u a10 = a();
                if (a10 != null) {
                    d(a10);
                    ((s) this.b).S();
                    a10.f(null);
                    break;
                }
                break;
            default:
                q4.l b10 = b();
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
                u a10 = a();
                if (a10 != null) {
                    d(a10);
                    ((s) this.b).V();
                    a10.f(null);
                    break;
                }
                break;
            default:
                q4.l b10 = b();
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
    public final void onSkipToQueueItem(long j3) {
        switch (this.a) {
            case 0:
                u a10 = a();
                if (a10 != null) {
                    d(a10);
                    ((s) this.b).Y(j3);
                    a10.f(null);
                    break;
                }
                break;
            default:
                q4.l b10 = b();
                if (b10 != null) {
                    e(b10);
                    ((s) this.b).Y(j3);
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
                u a10 = a();
                if (a10 != null) {
                    d(a10);
                    a10.f(null);
                    break;
                }
                break;
            default:
                q4.l b10 = b();
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
