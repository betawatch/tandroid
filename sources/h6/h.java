package h6;

import a3.o;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a0;
import android.support.v4.media.session.u;
import android.text.TextUtils;
import android.util.Log;
import b8.ke;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.internal.cast.q;
import com.google.android.gms.internal.cast.z;
import e6.l;
import f6.d0;
import gi.v5;
import gi.w5;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import p6.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h {
    public static final i6.b v = new i6.b("MediaSessionManager", null);
    public final Context a;
    public final f6.b b;
    public final q c;
    public final f6.g d;
    public final g6.f e;
    public final ComponentName f;
    public final ComponentName g;
    public final ke h;
    public final ke i;
    public final f j;
    public final z k;
    public final o l;
    public final d0 m;
    public g6.h n;
    public CastDevice o;
    public a0 p;
    public boolean q;
    public PlaybackStateCompat.CustomAction r;
    public PlaybackStateCompat.CustomAction s;
    public PlaybackStateCompat.CustomAction t;
    public PlaybackStateCompat.CustomAction u;

    public h(Context context, f6.b bVar, q qVar) {
        g6.f fVar;
        this.a = context;
        this.b = bVar;
        this.c = qVar;
        i6.b bVar2 = f6.a.l;
        m.d("Must be called from the main thread.");
        f6.a aVar = f6.a.n;
        f fVar2 = null;
        this.d = aVar != null ? aVar.b() : null;
        g6.a aVar2 = bVar.f;
        this.e = aVar2 == null ? null : aVar2.d;
        int i3 = 2;
        this.m = new d0(this, i3);
        String str = aVar2 == null ? null : aVar2.b;
        this.f = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = aVar2 == null ? null : aVar2.a;
        this.g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        ke keVar = new ke(context);
        this.h = keVar;
        keVar.f = new w5(this, 1);
        ke keVar2 = new ke(context);
        this.i = keVar2;
        keVar2.f = new v5(this, i3);
        this.k = new z(Looper.getMainLooper(), 0);
        i6.b bVar3 = f.u;
        g6.a aVar3 = bVar.f;
        if (aVar3 != null && (fVar = aVar3.d) != null) {
            g6.o oVar = fVar.W;
            if (oVar != null) {
                ArrayList a10 = i.a(oVar);
                int[] b10 = i.b(oVar);
                int size = a10 == null ? 0 : a10.size();
                if (a10 == null || a10.isEmpty()) {
                    Log.e(bVar3.a, bVar3.d(g6.e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                } else if (a10.size() > 5) {
                    Log.e(bVar3.a, bVar3.d(g6.e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                } else if (b10 == null || (b10.length) == 0) {
                    Log.e(bVar3.a, bVar3.d(g6.e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                } else {
                    for (int i10 : b10) {
                        if (i10 < 0 || i10 >= size) {
                            Log.e(bVar3.a, bVar3.d(g6.e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                            break;
                        }
                    }
                }
            }
            fVar2 = new f(context);
        }
        this.j = fVar2;
        this.l = new o(this, 24);
    }

    public final void a(g6.h hVar, CastDevice castDevice) {
        ComponentName componentName;
        f6.b bVar = this.b;
        g6.a aVar = bVar == null ? null : bVar.f;
        int i3 = 0;
        if (this.q || bVar == null || aVar == null || this.e == null || hVar == null || castDevice == null || (componentName = this.g) == null) {
            v.b("skip attaching media session", new Object[0]);
            return;
        }
        this.n = hVar;
        hVar.p(this.m);
        this.o = castDevice;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        Context context = this.a;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
        if (aVar.f) {
            a0 a0Var = new a0(context, "CastMediaSession", componentName, broadcast);
            this.p = a0Var;
            j(0, null);
            CastDevice castDevice2 = this.o;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                Bundle bundle = new Bundle();
                String string = context.getResources().getString(R.string.cast_casting_to_device, this.o.d);
                a0.f fVar = MediaMetadataCompat.d;
                if (fVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) fVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                    throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                }
                bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                a0Var.s(new MediaMetadataCompat(bundle));
            }
            a0Var.r(new g(this, i3), null);
            a0Var.q(true);
            this.c.M0(a0Var);
        }
        this.q = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        MediaInfo d;
        l lVar;
        boolean z10;
        boolean z11;
        df.d dVar;
        Uri uri;
        tf.b bVar;
        e6.o c2;
        MediaInfo mediaInfo;
        g6.h hVar = this.n;
        if (hVar == null) {
            return;
        }
        int s6 = hVar.s();
        MediaInfo d10 = hVar.d();
        if (hVar.k() && (c2 = hVar.c()) != null && (mediaInfo = c2.a) != null) {
            d10 = mediaInfo;
        }
        j(s6, d10);
        if (!hVar.h()) {
            h();
            i();
            return;
        }
        if (s6 != 0) {
            f fVar = this.j;
            if (fVar != null) {
                v.b("Update media notification.", new Object[0]);
                CastDevice castDevice = this.o;
                g6.h hVar2 = this.n;
                a0 a0Var = this.p;
                if (castDevice != null && hVar2 != null && a0Var != null && (d = hVar2.d()) != null && (lVar = d.d) != null) {
                    List list = lVar.a;
                    e6.q e10 = hVar2.e();
                    if (e10 != null) {
                        int i3 = e10.G;
                        if (i3 == 1 || i3 == 2 || i3 == 3) {
                            z10 = true;
                            z11 = z10;
                            boolean z12 = hVar2.f() == 2;
                            int i10 = d.b;
                            l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                            String string = lVar.b.getString("com.google.android.gms.cast.metadata.TITLE");
                            String str = castDevice.d;
                            df.d dVar2 = new df.d(z12, i10, string, str, ((u) a0Var.b).c, z10, z11);
                            boolean z13 = z12;
                            boolean z14 = z10;
                            boolean z15 = z11;
                            dVar = fVar.k;
                            if (dVar != null || z13 != dVar.a || i10 != dVar.b || !i6.a.d(string, (String) dVar.f) || !i6.a.d(str, (String) dVar.g) || z14 != dVar.c || z15 != dVar.d) {
                                fVar.k = dVar2;
                                fVar.b();
                            }
                            o6.a aVar = (list != null || list.isEmpty()) ? null : (o6.a) list.get(0);
                            tf.b bVar2 = new tf.b();
                            bVar2.a = aVar == null ? null : aVar.b;
                            uri = (Uri) bVar2.a;
                            bVar = fVar.l;
                            if (bVar != null || !i6.a.d(uri, (Uri) bVar.a)) {
                                ke keVar = fVar.i;
                                keVar.f = new p4.q(fVar, bVar2, false);
                                keVar.M(uri);
                            }
                        } else {
                            Integer num = (Integer) e10.O.get(e10.c);
                            if (num != null) {
                                boolean z16 = num.intValue() > 0;
                                z10 = num.intValue() < e10.H.size() + (-1);
                                z11 = z16;
                                if (hVar2.f() == 2) {
                                }
                                int i102 = d.b;
                                l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                                String string2 = lVar.b.getString("com.google.android.gms.cast.metadata.TITLE");
                                String str2 = castDevice.d;
                                df.d dVar22 = new df.d(z12, i102, string2, str2, ((u) a0Var.b).c, z10, z11);
                                boolean z132 = z12;
                                boolean z142 = z10;
                                boolean z152 = z11;
                                dVar = fVar.k;
                                if (dVar != null) {
                                }
                                fVar.k = dVar22;
                                fVar.b();
                                if (list != null) {
                                }
                                tf.b bVar22 = new tf.b();
                                bVar22.a = aVar == null ? null : aVar.b;
                                uri = (Uri) bVar22.a;
                                bVar = fVar.l;
                                if (bVar != null) {
                                }
                                ke keVar2 = fVar.i;
                                keVar2.f = new p4.q(fVar, bVar22, false);
                                keVar2.M(uri);
                            }
                        }
                    }
                    z10 = false;
                    z11 = z10;
                    if (hVar2.f() == 2) {
                    }
                    int i1022 = d.b;
                    l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string22 = lVar.b.getString("com.google.android.gms.cast.metadata.TITLE");
                    String str22 = castDevice.d;
                    df.d dVar222 = new df.d(z12, i1022, string22, str22, ((u) a0Var.b).c, z10, z11);
                    boolean z1322 = z12;
                    boolean z1422 = z10;
                    boolean z1522 = z11;
                    dVar = fVar.k;
                    if (dVar != null) {
                    }
                    fVar.k = dVar222;
                    fVar.b();
                    if (list != null) {
                    }
                    tf.b bVar222 = new tf.b();
                    bVar222.a = aVar == null ? null : aVar.b;
                    uri = (Uri) bVar222.a;
                    bVar = fVar.l;
                    if (bVar != null) {
                    }
                    ke keVar22 = fVar.i;
                    keVar22.f = new p4.q(fVar, bVar222, false);
                    keVar22.M(uri);
                }
            }
            if (hVar.k()) {
                return;
            }
            g(true);
        }
    }

    public final long c(String str, int i3, Bundle bundle) {
        long j10;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    if (i3 == 3) {
                        j10 = 514;
                        i3 = 3;
                    } else {
                        j10 = 512;
                    }
                    if (i3 != 2) {
                        return j10;
                    }
                    return 516L;
                }
            } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                g6.h hVar = this.n;
                if (hVar != null && hVar.h()) {
                    e6.q e10 = hVar.e();
                    m.g(e10);
                    if ((128 & e10.n) != 0 || e10.G != 0) {
                        return 16L;
                    }
                    Integer num = (Integer) e10.O.get(e10.c);
                    if (num != null && num.intValue() > 0) {
                        return 16L;
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                return 0L;
            }
        } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
            g6.h hVar2 = this.n;
            if (hVar2 != null && hVar2.h()) {
                e6.q e11 = hVar2.e();
                m.g(e11);
                if ((64 & e11.n) != 0 || e11.G != 0) {
                    return 32L;
                }
                Integer num2 = (Integer) e11.O.get(e11.c);
                if (num2 != null && num2.intValue() < e11.H.size() - 1) {
                    return 32L;
                }
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        return 0L;
    }

    public final Uri d(l lVar) {
        g6.a aVar = this.b.f;
        if (aVar != null) {
            aVar.b();
        }
        List list = lVar.a;
        o6.a aVar2 = (list == null || list.isEmpty()) ? null : (o6.a) lVar.a.get(0);
        if (aVar2 == null) {
            return null;
        }
        return aVar2.b;
    }

    public final void e(Bitmap bitmap, int i3) {
        MediaMetadata metadata;
        a0 a0Var = this.p;
        if (a0Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        a0 a0Var2 = this.p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (a0Var2 != null && (metadata = ((android.support.v4.media.session.h) ((p4.q) a0Var2.c).a).a.getMetadata()) != null) {
            a0.f fVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        android.support.v4.media.c cVar = mediaMetadataCompat == null ? new android.support.v4.media.c(0) : new android.support.v4.media.c(mediaMetadataCompat);
        cVar.k0(i3 == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART", bitmap);
        a0Var.s(new MediaMetadataCompat((Bundle) cVar.b));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(android.support.v4.media.session.d0 d0Var, String str, g6.d dVar) {
        int hashCode = str.hashCode();
        Context context = this.a;
        PlaybackStateCompat.CustomAction customAction = null;
        g6.f fVar = this.e;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    if (this.s == null && fVar != null) {
                        long j10 = fVar.c;
                        i6.b bVar = i.a;
                        int i3 = fVar.S;
                        if (j10 == 10000) {
                            i3 = fVar.T;
                        } else if (j10 == 30000) {
                            i3 = fVar.U;
                        }
                        int i10 = fVar.E;
                        if (j10 == 10000) {
                            i10 = fVar.F;
                        } else if (j10 == 30000) {
                            i10 = fVar.G;
                        }
                        String string = context.getResources().getString(i3);
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_REWIND)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i10 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.s = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_REWIND, string, i10, null);
                    }
                    customAction = this.s;
                    if (customAction != null) {
                        d0Var.a(customAction);
                        return;
                    }
                    return;
                }
                if (dVar != null) {
                    String str2 = dVar.c;
                    int i11 = dVar.b;
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    if (i11 == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction = new PlaybackStateCompat.CustomAction(str, str2, i11, null);
                }
                if (customAction != null) {
                }
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    if (this.t == null && fVar != null) {
                        String string2 = context.getResources().getString(fVar.V);
                        int i12 = fVar.H;
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string2)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i12 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.t = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_STOP_CASTING, string2, i12, null);
                    }
                    customAction = this.t;
                    if (customAction != null) {
                    }
                }
                if (dVar != null) {
                }
                if (customAction != null) {
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    if (this.u == null && fVar != null) {
                        String string3 = context.getResources().getString(fVar.V);
                        int i13 = fVar.H;
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_DISCONNECT)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string3)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i13 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.u = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_DISCONNECT, string3, i13, null);
                    }
                    customAction = this.u;
                    if (customAction != null) {
                    }
                }
                if (dVar != null) {
                }
                if (customAction != null) {
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    if (this.r == null && fVar != null) {
                        long j11 = fVar.c;
                        i6.b bVar2 = i.a;
                        int i14 = fVar.P;
                        if (j11 == 10000) {
                            i14 = fVar.Q;
                        } else if (j11 == 30000) {
                            i14 = fVar.R;
                        }
                        int i15 = fVar.w;
                        if (j11 == 10000) {
                            i15 = fVar.x;
                        } else if (j11 == 30000) {
                            i15 = fVar.y;
                        }
                        String string4 = context.getResources().getString(i14);
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_FORWARD)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string4)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i15 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.r = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_FORWARD, string4, i15, null);
                    }
                    customAction = this.r;
                    if (customAction != null) {
                    }
                }
                if (dVar != null) {
                }
                if (customAction != null) {
                }
                break;
            default:
                if (dVar != null) {
                }
                if (customAction != null) {
                }
                break;
        }
    }

    public final void g(boolean z10) {
        if (this.b.h) {
            z zVar = this.k;
            o oVar = this.l;
            if (oVar != null) {
                zVar.removeCallbacks(oVar);
            }
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z10) {
                    zVar.postDelayed(oVar, 1000L);
                }
            }
        }
    }

    public final void h() {
        f fVar = this.j;
        if (fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            ke keVar = fVar.i;
            keVar.N();
            keVar.f = null;
            NotificationManager notificationManager = fVar.b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i() {
        if (this.b.h) {
            this.k.removeCallbacks(this.l);
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            context.stopService(intent);
        }
    }

    public final void j(int i3, MediaInfo mediaInfo) {
        PlaybackStateCompat b10;
        a0 a0Var;
        l lVar;
        MediaMetadata metadata;
        int i10;
        MediaMetadataCompat createFromParcel;
        Bitmap bitmap;
        PendingIntent activity;
        int i11;
        a0 a0Var2 = this.p;
        if (a0Var2 == null) {
            return;
        }
        u uVar = (u) a0Var2.b;
        Bundle bundle = new Bundle();
        android.support.v4.media.session.d0 d0Var = new android.support.v4.media.session.d0();
        g6.h hVar = this.n;
        g6.f fVar = this.e;
        if (hVar == null || this.j == null) {
            b10 = d0Var.b();
        } else {
            d0Var.c(i3, (hVar.s() == 0 || hVar.j()) ? 0L : hVar.a(), 1.0f);
            if (i3 == 0) {
                b10 = d0Var.b();
            } else {
                g6.o oVar = fVar != null ? fVar.W : null;
                g6.h hVar2 = this.n;
                long j10 = (hVar2 == null || hVar2.j() || this.n.n()) ? 0L : 256L;
                if (oVar != null) {
                    ArrayList a10 = i.a(oVar);
                    if (a10 != null) {
                        int size = a10.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = a10.get(i12);
                            i12++;
                            ArrayList arrayList = a10;
                            g6.d dVar = (g6.d) obj;
                            int i13 = size;
                            String str = dVar.a;
                            if (TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                j10 = c(str, i3, bundle) | j10;
                            } else {
                                f(d0Var, str, dVar);
                            }
                            size = i13;
                            a10 = arrayList;
                        }
                    }
                } else if (fVar != null) {
                    ArrayList arrayList2 = fVar.a;
                    int size2 = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = arrayList2.get(i14);
                        i14++;
                        ArrayList arrayList3 = arrayList2;
                        String str2 = (String) obj2;
                        if (TextUtils.equals(str2, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                            i11 = size2;
                            j10 = c(str2, i3, bundle) | j10;
                        } else {
                            i11 = size2;
                            f(d0Var, str2, null);
                        }
                        size2 = i11;
                        arrayList2 = arrayList3;
                    }
                }
                d0Var.e = j10;
                b10 = d0Var.b();
            }
        }
        a0Var2.t(b10);
        if (fVar != null && fVar.X) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        if (fVar != null && fVar.Y) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            uVar.a.setExtras(bundle);
        }
        if (i3 == 0) {
            a0Var2.s(new MediaMetadataCompat(new Bundle()));
            return;
        }
        if (this.n != null) {
            ComponentName componentName = this.f;
            if (componentName == null) {
                activity = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(componentName);
                activity = PendingIntent.getActivity(this.a, 0, intent, 201326592);
            }
            if (activity != null) {
                uVar.a.setSessionActivity(activity);
            }
        }
        g6.h hVar3 = this.n;
        if (hVar3 == null || (a0Var = this.p) == null || mediaInfo == null || (lVar = mediaInfo.d) == null) {
            return;
        }
        Bundle bundle2 = lVar.b;
        long j11 = hVar3.j() ? 0L : mediaInfo.e;
        l.c(1, "com.google.android.gms.cast.metadata.TITLE");
        String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
        l.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
        String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
        a0 a0Var3 = this.p;
        if (a0Var3 == null || (metadata = ((android.support.v4.media.session.h) ((p4.q) a0Var3.c).a).a.getMetadata()) == null) {
            i10 = 0;
            createFromParcel = null;
        } else {
            a0.f fVar2 = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            i10 = 0;
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.b = metadata;
        }
        android.support.v4.media.c cVar = createFromParcel == null ? new android.support.v4.media.c(i10) : new android.support.v4.media.c(createFromParcel);
        cVar.l0(j11);
        if (string != null) {
            cVar.m0("android.media.metadata.TITLE", string);
            cVar.m0("android.media.metadata.DISPLAY_TITLE", string);
        }
        if (string2 != null) {
            cVar.m0("android.media.metadata.DISPLAY_SUBTITLE", string2);
        }
        a0Var.s(new MediaMetadataCompat((Bundle) cVar.b));
        Uri d = d(lVar);
        if (d != null) {
            this.h.M(d);
            bitmap = null;
        } else {
            bitmap = null;
            e(null, 0);
        }
        Uri d10 = d(lVar);
        if (d10 != null) {
            this.i.M(d10);
        } else {
            e(bitmap, 3);
        }
    }
}
