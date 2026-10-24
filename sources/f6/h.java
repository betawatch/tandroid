package f6;

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
import android.support.v4.media.session.b0;
import android.support.v4.media.session.e0;
import android.support.v4.media.session.v;
import android.text.TextUtils;
import android.util.Log;
import c6.o;
import c6.q;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.internal.cast.a0;
import com.google.android.gms.internal.cast.r;
import com.google.android.gms.internal.cast.z5;
import d6.c0;
import e6.p;
import java.util.ArrayList;
import java.util.List;
import n4.s;
import n6.l;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class h {
    public static final g6.b v = new g6.b("MediaSessionManager", null);
    public final Context a;
    public final d6.b b;
    public final r c;
    public final d6.g d;
    public final e6.f e;
    public final ComponentName f;
    public final ComponentName g;
    public final z5 h;
    public final z5 i;
    public final f j;
    public final a0 k;
    public final androidx.activity.i l;
    public final c0 m;
    public e6.h n;
    public CastDevice o;
    public b0 p;
    public boolean q;
    public PlaybackStateCompat.CustomAction r;
    public PlaybackStateCompat.CustomAction s;
    public PlaybackStateCompat.CustomAction t;
    public PlaybackStateCompat.CustomAction u;

    public h(Context context, d6.b bVar, r rVar) {
        e6.f fVar;
        this.a = context;
        this.b = bVar;
        this.c = rVar;
        g6.b bVar2 = d6.a.l;
        l.e("Must be called from the main thread.");
        d6.a aVar = d6.a.n;
        f fVar2 = null;
        this.d = aVar != null ? aVar.b() : null;
        e6.a aVar2 = bVar.f;
        this.e = aVar2 == null ? null : aVar2.d;
        this.m = new c0(this, 2);
        String str = aVar2 == null ? null : aVar2.b;
        this.f = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = aVar2 == null ? null : aVar2.a;
        this.g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        z5 z5Var = new z5(context);
        this.h = z5Var;
        z5Var.e = new ya.c(this, 17);
        z5 z5Var2 = new z5(context);
        this.i = z5Var2;
        z5Var2.e = new a6.i(this, 20);
        this.k = new a0(Looper.getMainLooper(), 0);
        g6.b bVar3 = f.u;
        e6.a aVar3 = bVar.f;
        if (aVar3 != null && (fVar = aVar3.d) != null) {
            p pVar = fVar.V;
            if (pVar != null) {
                ArrayList a2 = i.a(pVar);
                int[] b10 = i.b(pVar);
                int size = a2 == null ? 0 : a2.size();
                if (a2 == null || a2.isEmpty()) {
                    Log.e(bVar3.a, bVar3.d(e6.e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                } else if (a2.size() > 5) {
                    Log.e(bVar3.a, bVar3.d(e6.e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                } else if (b10 == null || (b10.length) == 0) {
                    Log.e(bVar3.a, bVar3.d(e6.e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                } else {
                    for (int i10 : b10) {
                        if (i10 < 0 || i10 >= size) {
                            Log.e(bVar3.a, bVar3.d(e6.e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                            break;
                        }
                    }
                }
            }
            fVar2 = new f(context);
        }
        this.j = fVar2;
        this.l = new androidx.activity.i(this, 19);
    }

    public final void a(e6.h hVar, CastDevice castDevice) {
        ComponentName componentName;
        d6.b bVar = this.b;
        e6.a aVar = bVar == null ? null : bVar.f;
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
            b0 b0Var = new b0(context, "CastMediaSession", componentName, broadcast);
            this.p = b0Var;
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
                b0Var.e(new MediaMetadataCompat(bundle));
            }
            b0Var.d(new g(this), null);
            b0Var.c(true);
            this.c.K0(b0Var);
        }
        this.q = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        MediaInfo d;
        c6.l lVar;
        boolean z10;
        boolean z11;
        af.e eVar;
        Uri uri;
        s sVar;
        o c10;
        MediaInfo mediaInfo;
        e6.h hVar = this.n;
        if (hVar == null) {
            return;
        }
        int s10 = hVar.s();
        MediaInfo d10 = hVar.d();
        if (hVar.k() && (c10 = hVar.c()) != null && (mediaInfo = c10.a) != null) {
            d10 = mediaInfo;
        }
        j(s10, d10);
        if (!hVar.h()) {
            h();
            i();
            return;
        }
        if (s10 != 0) {
            f fVar = this.j;
            if (fVar != null) {
                v.b("Update media notification.", new Object[0]);
                CastDevice castDevice = this.o;
                e6.h hVar2 = this.n;
                b0 b0Var = this.p;
                if (castDevice != null && hVar2 != null && b0Var != null && (d = hVar2.d()) != null && (lVar = d.d) != null) {
                    List list = lVar.a;
                    q e = hVar2.e();
                    if (e != null) {
                        int i10 = e.F;
                        if (i10 == 1 || i10 == 2 || i10 == 3) {
                            z10 = true;
                            z11 = z10;
                            boolean z12 = hVar2.f() == 2;
                            int i11 = d.b;
                            c6.l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                            String string = lVar.b.getString("com.google.android.gms.cast.metadata.TITLE");
                            String str = castDevice.d;
                            af.e eVar2 = new af.e(z12, i11, string, str, b0Var.a.c, z10, z11);
                            boolean z13 = z12;
                            boolean z14 = z10;
                            boolean z15 = z11;
                            eVar = fVar.k;
                            if (eVar != null || z13 != eVar.a || i11 != eVar.b || !g6.a.d(string, (String) eVar.f) || !g6.a.d(str, (String) eVar.g) || z14 != eVar.c || z15 != eVar.d) {
                                fVar.k = eVar2;
                                fVar.b();
                            }
                            s sVar2 = new s((list != null || list.isEmpty()) ? null : (m6.a) list.get(0));
                            uri = (Uri) sVar2.b;
                            sVar = fVar.l;
                            if (sVar != null || !g6.a.d(uri, (Uri) sVar.b)) {
                                z5 z5Var = fVar.i;
                                z5Var.e = new qf.b(fVar, sVar2, false, 16);
                                z5Var.B(uri);
                            }
                        } else {
                            Integer num = (Integer) e.N.get(e.c);
                            if (num != null) {
                                boolean z16 = num.intValue() > 0;
                                z10 = num.intValue() < e.G.size() + (-1);
                                z11 = z16;
                                if (hVar2.f() == 2) {
                                }
                                int i112 = d.b;
                                c6.l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                                String string2 = lVar.b.getString("com.google.android.gms.cast.metadata.TITLE");
                                String str2 = castDevice.d;
                                af.e eVar22 = new af.e(z12, i112, string2, str2, b0Var.a.c, z10, z11);
                                boolean z132 = z12;
                                boolean z142 = z10;
                                boolean z152 = z11;
                                eVar = fVar.k;
                                if (eVar != null) {
                                }
                                fVar.k = eVar22;
                                fVar.b();
                                s sVar22 = new s((list != null || list.isEmpty()) ? null : (m6.a) list.get(0));
                                uri = (Uri) sVar22.b;
                                sVar = fVar.l;
                                if (sVar != null) {
                                }
                                z5 z5Var2 = fVar.i;
                                z5Var2.e = new qf.b(fVar, sVar22, false, 16);
                                z5Var2.B(uri);
                            }
                        }
                    }
                    z10 = false;
                    z11 = z10;
                    if (hVar2.f() == 2) {
                    }
                    int i1122 = d.b;
                    c6.l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string22 = lVar.b.getString("com.google.android.gms.cast.metadata.TITLE");
                    String str22 = castDevice.d;
                    af.e eVar222 = new af.e(z12, i1122, string22, str22, b0Var.a.c, z10, z11);
                    boolean z1322 = z12;
                    boolean z1422 = z10;
                    boolean z1522 = z11;
                    eVar = fVar.k;
                    if (eVar != null) {
                    }
                    fVar.k = eVar222;
                    fVar.b();
                    s sVar222 = new s((list != null || list.isEmpty()) ? null : (m6.a) list.get(0));
                    uri = (Uri) sVar222.b;
                    sVar = fVar.l;
                    if (sVar != null) {
                    }
                    z5 z5Var22 = fVar.i;
                    z5Var22.e = new qf.b(fVar, sVar222, false, 16);
                    z5Var22.B(uri);
                }
            }
            if (hVar.k()) {
                return;
            }
            g(true);
        }
    }

    public final long c(String str, int i10, Bundle bundle) {
        long j10;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    if (i10 == 3) {
                        j10 = 514;
                        i10 = 3;
                    } else {
                        j10 = 512;
                    }
                    if (i10 != 2) {
                        return j10;
                    }
                    return 516L;
                }
            } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                e6.h hVar = this.n;
                if (hVar != null && hVar.h()) {
                    q e = hVar.e();
                    l.h(e);
                    if ((128 & e.n) != 0 || e.F != 0) {
                        return 16L;
                    }
                    Integer num = (Integer) e.N.get(e.c);
                    if (num != null && num.intValue() > 0) {
                        return 16L;
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                return 0L;
            }
        } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
            e6.h hVar2 = this.n;
            if (hVar2 != null && hVar2.h()) {
                q e7 = hVar2.e();
                l.h(e7);
                if ((64 & e7.n) != 0 || e7.F != 0) {
                    return 32L;
                }
                Integer num2 = (Integer) e7.N.get(e7.c);
                if (num2 != null && num2.intValue() < e7.G.size() - 1) {
                    return 32L;
                }
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        return 0L;
    }

    public final Uri d(c6.l lVar) {
        e6.a aVar = this.b.f;
        if (aVar != null) {
            aVar.b();
        }
        List list = lVar.a;
        m6.a aVar2 = (list == null || list.isEmpty()) ? null : (m6.a) lVar.a.get(0);
        if (aVar2 == null) {
            return null;
        }
        return aVar2.b;
    }

    public final void e(Bitmap bitmap, int i10) {
        MediaMetadata metadata;
        b0 b0Var = this.p;
        if (b0Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        b0 b0Var2 = this.p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (b0Var2 != null && (metadata = ((android.support.v4.media.session.h) b0Var2.b.b).a.getMetadata()) != null) {
            a0.f fVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        a4.l lVar = mediaMetadataCompat == null ? new a4.l(2) : new a4.l(mediaMetadataCompat);
        lVar.a0(i10 == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART", bitmap);
        b0Var.e(new MediaMetadataCompat((Bundle) lVar.b));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(e0 e0Var, String str, e6.d dVar) {
        int hashCode = str.hashCode();
        Context context = this.a;
        PlaybackStateCompat.CustomAction customAction = null;
        e6.f fVar = this.e;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    if (this.s == null && fVar != null) {
                        long j10 = fVar.c;
                        g6.b bVar = i.a;
                        int i10 = fVar.R;
                        if (j10 == 10000) {
                            i10 = fVar.S;
                        } else if (j10 == 30000) {
                            i10 = fVar.T;
                        }
                        int i11 = fVar.y;
                        if (j10 == 10000) {
                            i11 = fVar.E;
                        } else if (j10 == 30000) {
                            i11 = fVar.F;
                        }
                        String string = context.getResources().getString(i10);
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_REWIND)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i11 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.s = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_REWIND, string, i11, null);
                    }
                    customAction = this.s;
                    if (customAction != null) {
                        e0Var.a(customAction);
                        return;
                    }
                    return;
                }
                if (dVar != null) {
                    String str2 = dVar.c;
                    int i12 = dVar.b;
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    if (i12 == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction = new PlaybackStateCompat.CustomAction(str, str2, i12, null);
                }
                if (customAction != null) {
                }
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    if (this.t == null && fVar != null) {
                        String string2 = context.getResources().getString(fVar.U);
                        int i13 = fVar.G;
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string2)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i13 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.t = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_STOP_CASTING, string2, i13, null);
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
                        int i14 = fVar.G;
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_DISCONNECT)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string3)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i14 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.u = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_DISCONNECT, string3, i14, null);
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
                        g6.b bVar2 = i.a;
                        int i15 = fVar.O;
                        if (j11 == 10000) {
                            i15 = fVar.P;
                        } else if (j11 == 30000) {
                            i15 = fVar.Q;
                        }
                        int i16 = fVar.v;
                        if (j11 == 10000) {
                            i16 = fVar.w;
                        } else if (j11 == 30000) {
                            i16 = fVar.x;
                        }
                        String string4 = context.getResources().getString(i15);
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_FORWARD)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string4)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i16 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.r = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_FORWARD, string4, i16, null);
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
            a0 a0Var = this.k;
            androidx.activity.i iVar = this.l;
            if (iVar != null) {
                a0Var.removeCallbacks(iVar);
            }
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z10) {
                    a0Var.postDelayed(iVar, 1000L);
                }
            }
        }
    }

    public final void h() {
        f fVar = this.j;
        if (fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            z5 z5Var = fVar.i;
            z5Var.C();
            z5Var.e = null;
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

    public final void j(int i10, MediaInfo mediaInfo) {
        PlaybackStateCompat b10;
        b0 b0Var;
        c6.l lVar;
        MediaMetadata metadata;
        MediaMetadataCompat createFromParcel;
        Bitmap bitmap;
        PendingIntent activity;
        int i11;
        b0 b0Var2 = this.p;
        if (b0Var2 == null) {
            return;
        }
        v vVar = b0Var2.a;
        Bundle bundle = new Bundle();
        e0 e0Var = new e0();
        e6.h hVar = this.n;
        e6.f fVar = this.e;
        if (hVar == null || this.j == null) {
            b10 = e0Var.b();
        } else {
            e0Var.c(i10, (hVar.s() == 0 || hVar.j()) ? 0L : hVar.a(), 1.0f);
            if (i10 == 0) {
                b10 = e0Var.b();
            } else {
                p pVar = fVar != null ? fVar.V : null;
                e6.h hVar2 = this.n;
                long j10 = (hVar2 == null || hVar2.j() || this.n.n()) ? 0L : 256L;
                if (pVar != null) {
                    ArrayList a2 = i.a(pVar);
                    if (a2 != null) {
                        int size = a2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = a2.get(i12);
                            i12++;
                            ArrayList arrayList = a2;
                            e6.d dVar = (e6.d) obj;
                            int i13 = size;
                            String str = dVar.a;
                            if (TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                j10 = c(str, i10, bundle) | j10;
                            } else {
                                f(e0Var, str, dVar);
                            }
                            size = i13;
                            a2 = arrayList;
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
                            j10 = c(str2, i10, bundle) | j10;
                        } else {
                            i11 = size2;
                            f(e0Var, str2, null);
                        }
                        size2 = i11;
                        arrayList2 = arrayList3;
                    }
                }
                e0Var.e = j10;
                b10 = e0Var.b();
            }
        }
        b0Var2.f(b10);
        if (fVar != null && fVar.W) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        if (fVar != null && fVar.X) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            vVar.a.setExtras(bundle);
        }
        if (i10 == 0) {
            b0Var2.e(new MediaMetadataCompat(new Bundle()));
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
                vVar.a.setSessionActivity(activity);
            }
        }
        e6.h hVar3 = this.n;
        if (hVar3 == null || (b0Var = this.p) == null || mediaInfo == null || (lVar = mediaInfo.d) == null) {
            return;
        }
        Bundle bundle2 = lVar.b;
        long j11 = hVar3.j() ? 0L : mediaInfo.e;
        c6.l.c(1, "com.google.android.gms.cast.metadata.TITLE");
        String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
        c6.l.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
        String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
        b0 b0Var3 = this.p;
        if (b0Var3 == null || (metadata = ((android.support.v4.media.session.h) b0Var3.b.b).a.getMetadata()) == null) {
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
        a4.l lVar2 = createFromParcel == null ? new a4.l(2) : new a4.l(createFromParcel);
        lVar2.b0(j11);
        if (string != null) {
            lVar2.c0("android.media.metadata.TITLE", string);
            lVar2.c0("android.media.metadata.DISPLAY_TITLE", string);
        }
        if (string2 != null) {
            lVar2.c0("android.media.metadata.DISPLAY_SUBTITLE", string2);
        }
        b0Var.e(new MediaMetadataCompat((Bundle) lVar2.b));
        Uri d = d(lVar);
        if (d != null) {
            this.h.B(d);
            bitmap = null;
        } else {
            bitmap = null;
            e(null, 0);
        }
        Uri d10 = d(lVar);
        if (d10 != null) {
            this.i.B(d10);
        } else {
            e(bitmap, 3);
        }
    }
}
