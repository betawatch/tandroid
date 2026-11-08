package i6;

import a8.r7;
import a8.ra;
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
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.internal.cast.y;
import f6.l;
import f6.o;
import f6.q;
import g6.c0;
import g6.d0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import q6.m;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class h {
    public static final j6.b v = new j6.b("MediaSessionManager", null);
    public final Context a;
    public final g6.b b;
    public final p c;
    public final g6.g d;
    public final h6.f e;
    public final ComponentName f;
    public final ComponentName g;
    public final r7 h;
    public final r7 i;
    public final f j;
    public final y k;
    public final ra l;
    public final c0 m;
    public h6.h n;
    public CastDevice o;
    public a0 p;
    public boolean q;
    public PlaybackStateCompat.CustomAction r;
    public PlaybackStateCompat.CustomAction s;
    public PlaybackStateCompat.CustomAction t;
    public PlaybackStateCompat.CustomAction u;

    public h(Context context, g6.b bVar, p pVar) {
        h6.f fVar;
        this.a = context;
        this.b = bVar;
        this.c = pVar;
        j6.b bVar2 = g6.a.l;
        m.d("Must be called from the main thread.");
        g6.a aVar = g6.a.n;
        f fVar2 = null;
        this.d = aVar != null ? aVar.b() : null;
        h6.a aVar2 = bVar.f;
        this.e = aVar2 == null ? null : aVar2.d;
        this.m = new c0(this, 2);
        String str = aVar2 == null ? null : aVar2.b;
        this.f = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = aVar2 == null ? null : aVar2.a;
        this.g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        r7 r7Var = new r7(context);
        this.h = r7Var;
        r7Var.f = new d0(this, 5);
        r7 r7Var2 = new r7(context);
        this.i = r7Var2;
        r7Var2.f = new gf.g(this, 4);
        this.k = new y(Looper.getMainLooper(), 0);
        j6.b bVar3 = f.u;
        h6.a aVar3 = bVar.f;
        if (aVar3 != null && (fVar = aVar3.d) != null) {
            h6.p pVar2 = fVar.V;
            if (pVar2 != null) {
                ArrayList a10 = i.a(pVar2);
                int[] b10 = i.b(pVar2);
                int size = a10 == null ? 0 : a10.size();
                if (a10 == null || a10.isEmpty()) {
                    Log.e(bVar3.a, bVar3.d(h6.e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                } else if (a10.size() > 5) {
                    Log.e(bVar3.a, bVar3.d(h6.e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                } else if (b10 == null || (b10.length) == 0) {
                    Log.e(bVar3.a, bVar3.d(h6.e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                } else {
                    for (int i7 : b10) {
                        if (i7 < 0 || i7 >= size) {
                            Log.e(bVar3.a, bVar3.d(h6.e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                            break;
                        }
                    }
                }
            }
            fVar2 = new f(context);
        }
        this.j = fVar2;
        this.l = new ra(this, 26);
    }

    public final void a(h6.h hVar, CastDevice castDevice) {
        ComponentName componentName;
        g6.b bVar = this.b;
        h6.a aVar = bVar == null ? null : bVar.f;
        int i7 = 0;
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
                a0Var.t(new MediaMetadataCompat(bundle));
            }
            a0Var.s(new g(this, i7), null);
            a0Var.r(true);
            this.c.m1(a0Var);
        }
        this.q = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        MediaInfo d;
        l lVar;
        boolean z9;
        boolean z10;
        gf.d dVar;
        Uri uri;
        wf.b bVar;
        o c10;
        MediaInfo mediaInfo;
        h6.h hVar = this.n;
        if (hVar == null) {
            return;
        }
        int s5 = hVar.s();
        MediaInfo d2 = hVar.d();
        if (hVar.k() && (c10 = hVar.c()) != null && (mediaInfo = c10.a) != null) {
            d2 = mediaInfo;
        }
        j(s5, d2);
        if (!hVar.h()) {
            h();
            i();
            return;
        }
        if (s5 != 0) {
            f fVar = this.j;
            if (fVar != null) {
                v.b("Update media notification.", new Object[0]);
                CastDevice castDevice = this.o;
                h6.h hVar2 = this.n;
                a0 a0Var = this.p;
                if (castDevice != null && hVar2 != null && a0Var != null && (d = hVar2.d()) != null && (lVar = d.d) != null) {
                    List list = lVar.a;
                    q e10 = hVar2.e();
                    if (e10 != null) {
                        int i7 = e10.F;
                        if (i7 == 1 || i7 == 2 || i7 == 3) {
                            z9 = true;
                            z10 = z9;
                            boolean z11 = hVar2.f() == 2;
                            int i10 = d.b;
                            l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                            String string = lVar.b.getString("com.google.android.gms.cast.metadata.TITLE");
                            String str = castDevice.d;
                            gf.d dVar2 = new gf.d(z11, i10, string, str, ((u) a0Var.b).c, z9, z10);
                            boolean z12 = z11;
                            boolean z13 = z9;
                            boolean z14 = z10;
                            dVar = fVar.k;
                            if (dVar != null || z12 != dVar.a || i10 != dVar.b || !j6.a.d(string, (String) dVar.f) || !j6.a.d(str, (String) dVar.g) || z13 != dVar.c || z14 != dVar.d) {
                                fVar.k = dVar2;
                                fVar.b();
                            }
                            wf.b bVar2 = new wf.b((list != null || list.isEmpty()) ? null : (p6.a) list.get(0));
                            uri = (Uri) bVar2.b;
                            bVar = fVar.l;
                            if (bVar != null || !j6.a.d(uri, (Uri) bVar.b)) {
                                r7 r7Var = fVar.i;
                                r7Var.f = new q4.q(28, fVar, bVar2);
                                r7Var.I(uri);
                            }
                        } else {
                            Integer num = (Integer) e10.N.get(e10.c);
                            if (num != null) {
                                boolean z15 = num.intValue() > 0;
                                z9 = num.intValue() < e10.G.size() + (-1);
                                z10 = z15;
                                if (hVar2.f() == 2) {
                                }
                                int i102 = d.b;
                                l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                                String string2 = lVar.b.getString("com.google.android.gms.cast.metadata.TITLE");
                                String str2 = castDevice.d;
                                gf.d dVar22 = new gf.d(z11, i102, string2, str2, ((u) a0Var.b).c, z9, z10);
                                boolean z122 = z11;
                                boolean z132 = z9;
                                boolean z142 = z10;
                                dVar = fVar.k;
                                if (dVar != null) {
                                }
                                fVar.k = dVar22;
                                fVar.b();
                                wf.b bVar22 = new wf.b((list != null || list.isEmpty()) ? null : (p6.a) list.get(0));
                                uri = (Uri) bVar22.b;
                                bVar = fVar.l;
                                if (bVar != null) {
                                }
                                r7 r7Var2 = fVar.i;
                                r7Var2.f = new q4.q(28, fVar, bVar22);
                                r7Var2.I(uri);
                            }
                        }
                    }
                    z9 = false;
                    z10 = z9;
                    if (hVar2.f() == 2) {
                    }
                    int i1022 = d.b;
                    l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string22 = lVar.b.getString("com.google.android.gms.cast.metadata.TITLE");
                    String str22 = castDevice.d;
                    gf.d dVar222 = new gf.d(z11, i1022, string22, str22, ((u) a0Var.b).c, z9, z10);
                    boolean z1222 = z11;
                    boolean z1322 = z9;
                    boolean z1422 = z10;
                    dVar = fVar.k;
                    if (dVar != null) {
                    }
                    fVar.k = dVar222;
                    fVar.b();
                    wf.b bVar222 = new wf.b((list != null || list.isEmpty()) ? null : (p6.a) list.get(0));
                    uri = (Uri) bVar222.b;
                    bVar = fVar.l;
                    if (bVar != null) {
                    }
                    r7 r7Var22 = fVar.i;
                    r7Var22.f = new q4.q(28, fVar, bVar222);
                    r7Var22.I(uri);
                }
            }
            if (hVar.k()) {
                return;
            }
            g(true);
        }
    }

    public final long c(String str, int i7, Bundle bundle) {
        long j3;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    if (i7 == 3) {
                        j3 = 514;
                        i7 = 3;
                    } else {
                        j3 = 512;
                    }
                    if (i7 != 2) {
                        return j3;
                    }
                    return 516L;
                }
            } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                h6.h hVar = this.n;
                if (hVar != null && hVar.h()) {
                    q e10 = hVar.e();
                    m.g(e10);
                    if ((128 & e10.n) != 0 || e10.F != 0) {
                        return 16L;
                    }
                    Integer num = (Integer) e10.N.get(e10.c);
                    if (num != null && num.intValue() > 0) {
                        return 16L;
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                return 0L;
            }
        } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
            h6.h hVar2 = this.n;
            if (hVar2 != null && hVar2.h()) {
                q e11 = hVar2.e();
                m.g(e11);
                if ((64 & e11.n) != 0 || e11.F != 0) {
                    return 32L;
                }
                Integer num2 = (Integer) e11.N.get(e11.c);
                if (num2 != null && num2.intValue() < e11.G.size() - 1) {
                    return 32L;
                }
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        return 0L;
    }

    public final Uri d(l lVar) {
        h6.a aVar = this.b.f;
        if (aVar != null) {
            aVar.b();
        }
        List list = lVar.a;
        p6.a aVar2 = (list == null || list.isEmpty()) ? null : (p6.a) lVar.a.get(0);
        if (aVar2 == null) {
            return null;
        }
        return aVar2.b;
    }

    public final void e(int i7, Bitmap bitmap) {
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
        if (a0Var2 != null && (metadata = ((android.support.v4.media.session.h) ((wf.b) a0Var2.c).b).a.getMetadata()) != null) {
            a0.f fVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        cb.c cVar = mediaMetadataCompat == null ? new cb.c(5) : new cb.c(mediaMetadataCompat);
        cVar.y(i7 == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART", bitmap);
        a0Var.t(new MediaMetadataCompat((Bundle) cVar.b));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(android.support.v4.media.session.d0 d0Var, String str, h6.d dVar) {
        int hashCode = str.hashCode();
        Context context = this.a;
        PlaybackStateCompat.CustomAction customAction = null;
        h6.f fVar = this.e;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    if (this.s == null && fVar != null) {
                        long j3 = fVar.c;
                        j6.b bVar = i.a;
                        int i7 = fVar.R;
                        if (j3 == 10000) {
                            i7 = fVar.S;
                        } else if (j3 == 30000) {
                            i7 = fVar.T;
                        }
                        int i10 = fVar.D;
                        if (j3 == 10000) {
                            i10 = fVar.E;
                        } else if (j3 == 30000) {
                            i10 = fVar.F;
                        }
                        String string = context.getResources().getString(i7);
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
                        String string2 = context.getResources().getString(fVar.U);
                        int i12 = fVar.G;
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
                        String string3 = context.getResources().getString(fVar.U);
                        int i13 = fVar.G;
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
                        long j10 = fVar.c;
                        j6.b bVar2 = i.a;
                        int i14 = fVar.O;
                        if (j10 == 10000) {
                            i14 = fVar.P;
                        } else if (j10 == 30000) {
                            i14 = fVar.Q;
                        }
                        int i15 = fVar.w;
                        if (j10 == 10000) {
                            i15 = fVar.x;
                        } else if (j10 == 30000) {
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

    public final void g(boolean z9) {
        if (this.b.h) {
            y yVar = this.k;
            ra raVar = this.l;
            if (raVar != null) {
                yVar.removeCallbacks(raVar);
            }
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z9) {
                    yVar.postDelayed(raVar, 1000L);
                }
            }
        }
    }

    public final void h() {
        f fVar = this.j;
        if (fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            r7 r7Var = fVar.i;
            r7Var.J();
            r7Var.f = null;
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

    public final void j(int i7, MediaInfo mediaInfo) {
        PlaybackStateCompat b10;
        a0 a0Var;
        l lVar;
        MediaMetadata metadata;
        MediaMetadataCompat createFromParcel;
        Bitmap bitmap;
        PendingIntent activity;
        int i10;
        a0 a0Var2 = this.p;
        if (a0Var2 == null) {
            return;
        }
        u uVar = (u) a0Var2.b;
        Bundle bundle = new Bundle();
        android.support.v4.media.session.d0 d0Var = new android.support.v4.media.session.d0();
        h6.h hVar = this.n;
        h6.f fVar = this.e;
        if (hVar == null || this.j == null) {
            b10 = d0Var.b();
        } else {
            d0Var.c(i7, (hVar.s() == 0 || hVar.j()) ? 0L : hVar.a(), 1.0f);
            if (i7 == 0) {
                b10 = d0Var.b();
            } else {
                h6.p pVar = fVar != null ? fVar.V : null;
                h6.h hVar2 = this.n;
                long j3 = (hVar2 == null || hVar2.j() || this.n.n()) ? 0L : 256L;
                if (pVar != null) {
                    ArrayList a10 = i.a(pVar);
                    if (a10 != null) {
                        int size = a10.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = a10.get(i11);
                            i11++;
                            ArrayList arrayList = a10;
                            h6.d dVar = (h6.d) obj;
                            int i12 = size;
                            String str = dVar.a;
                            if (TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                j3 = c(str, i7, bundle) | j3;
                            } else {
                                f(d0Var, str, dVar);
                            }
                            size = i12;
                            a10 = arrayList;
                        }
                    }
                } else if (fVar != null) {
                    ArrayList arrayList2 = fVar.a;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        ArrayList arrayList3 = arrayList2;
                        String str2 = (String) obj2;
                        if (TextUtils.equals(str2, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                            i10 = size2;
                            j3 = c(str2, i7, bundle) | j3;
                        } else {
                            i10 = size2;
                            f(d0Var, str2, null);
                        }
                        size2 = i10;
                        arrayList2 = arrayList3;
                    }
                }
                d0Var.e = j3;
                b10 = d0Var.b();
            }
        }
        a0Var2.u(b10);
        if (fVar != null && fVar.W) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        if (fVar != null && fVar.X) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            uVar.a.setExtras(bundle);
        }
        if (i7 == 0) {
            a0Var2.t(new MediaMetadataCompat(new Bundle()));
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
        h6.h hVar3 = this.n;
        if (hVar3 == null || (a0Var = this.p) == null || mediaInfo == null || (lVar = mediaInfo.d) == null) {
            return;
        }
        Bundle bundle2 = lVar.b;
        long j10 = hVar3.j() ? 0L : mediaInfo.e;
        l.c(1, "com.google.android.gms.cast.metadata.TITLE");
        String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
        l.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
        String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
        a0 a0Var3 = this.p;
        if (a0Var3 == null || (metadata = ((android.support.v4.media.session.h) ((wf.b) a0Var3.c).b).a.getMetadata()) == null) {
            createFromParcel = null;
        } else {
            a0.f fVar2 = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.b = metadata;
        }
        cb.c cVar = createFromParcel == null ? new cb.c(5) : new cb.c(createFromParcel);
        cVar.z(j10);
        if (string != null) {
            cVar.B("android.media.metadata.TITLE", string);
            cVar.B("android.media.metadata.DISPLAY_TITLE", string);
        }
        if (string2 != null) {
            cVar.B("android.media.metadata.DISPLAY_SUBTITLE", string2);
        }
        a0Var.t(new MediaMetadataCompat((Bundle) cVar.b));
        Uri d = d(lVar);
        if (d != null) {
            this.h.I(d);
            bitmap = null;
        } else {
            bitmap = null;
            e(0, null);
        }
        Uri d2 = d(lVar);
        if (d2 != null) {
            this.i.I(d2);
        } else {
            e(3, bitmap);
        }
    }
}
