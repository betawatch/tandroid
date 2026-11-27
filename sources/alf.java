// default package

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
import android.support.v4.media.session.a;
import android.support.v4.media.session.f;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class alf {
    public static final he6 v = new he6("MediaSessionManager", null);
    public final Context a;
    public final ld1 b;
    public final hhd c;
    public final baa d;
    public final po7 e;
    public final ComponentName f;
    public final ComponentName g;
    public final am2 h;
    public final am2 i;
    public final t9f j;
    public final b99 k;
    public final dhe l;
    public final sff m;
    public v99 n;
    public CastDevice o;
    public rx6 p;
    public boolean q;
    public PlaybackStateCompat.CustomAction r;
    public PlaybackStateCompat.CustomAction s;
    public PlaybackStateCompat.CustomAction t;
    public PlaybackStateCompat.CustomAction u;

    public alf(Context context, ld1 ld1Var, hhd hhdVar) {
        po7 po7Var;
        this.a = context;
        this.b = ld1Var;
        this.c = hhdVar;
        he6 he6Var = id1.l;
        xve.e("Must be called from the main thread.");
        id1 id1Var = id1.n;
        t9f t9fVar = null;
        this.d = id1Var != null ? id1Var.b() : null;
        jd1 jd1Var = ld1Var.f;
        this.e = jd1Var == null ? null : jd1Var.d;
        this.m = new sff(this, (byte) 2);
        String str = jd1Var == null ? null : jd1Var.b;
        this.f = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = jd1Var == null ? null : jd1Var.a;
        this.g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        am2 am2Var = new am2(context);
        this.h = am2Var;
        am2Var.f = new xae(this);
        am2 am2Var2 = new am2(context);
        this.i = am2Var2;
        am2Var2.f = new oqd(this);
        byte b = 3;
        this.k = new b99(Looper.getMainLooper(), (byte) 3);
        he6 he6Var2 = t9f.u;
        jd1 jd1Var2 = ld1Var.f;
        if (jd1Var2 != null && (po7Var = jd1Var2.d) != null) {
            uxd uxdVar = po7Var.W;
            if (uxdVar != null) {
                ArrayList a = nlf.a(uxdVar);
                int[] b2 = nlf.b(uxdVar);
                int size = a == null ? 0 : a.size();
                if (a == null || a.isEmpty()) {
                    Log.e(he6Var2.a, he6Var2.d(wm7.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                } else if (a.size() > 5) {
                    Log.e(he6Var2.a, he6Var2.d(wm7.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                } else if (b2 == null || (b2.length) == 0) {
                    Log.e(he6Var2.a, he6Var2.d(wm7.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                } else {
                    for (int i : b2) {
                        if (i < 0 || i >= size) {
                            Log.e(he6Var2.a, he6Var2.d(wm7.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                            break;
                        }
                    }
                }
            }
            t9fVar = new t9f(context);
        }
        this.j = t9fVar;
        this.l = new dhe(this, b);
    }

    public final void a(v99 v99Var, CastDevice castDevice) {
        ComponentName componentName;
        ld1 ld1Var = this.b;
        jd1 jd1Var = ld1Var == null ? null : ld1Var.f;
        if (this.q || ld1Var == null || jd1Var == null || this.e == null || v99Var == null || castDevice == null || (componentName = this.g) == null) {
            v.b("skip attaching media session", new Object[0]);
            return;
        }
        this.n = v99Var;
        v99Var.p(this.m);
        this.o = castDevice;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        Context context = this.a;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
        boolean z = jd1Var.f;
        byte b = 1;
        if (z) {
            rx6 rx6Var = new rx6(context, "CastMediaSession", componentName, broadcast);
            this.p = rx6Var;
            j(0, null);
            CastDevice castDevice2 = this.o;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                Bundle bundle = new Bundle();
                String string = context.getResources().getString(R.string.cast_casting_to_device, this.o.d);
                qs qsVar = MediaMetadataCompat.d;
                if (qsVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) qsVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                    lq5.j("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    return;
                } else {
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    rx6Var.r0(new MediaMetadataCompat(bundle));
                }
            }
            rx6Var.p0(new nj7(this, b), null);
            rx6Var.n0(true);
            this.c.T(rx6Var);
        }
        this.q = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        MediaInfo d;
        mt6 mt6Var;
        boolean z;
        boolean z2;
        az0 az0Var;
        Uri uri;
        k7b k7bVar;
        eu6 c;
        MediaInfo mediaInfo;
        v99 v99Var = this.n;
        if (v99Var != null) {
            int s = v99Var.s();
            MediaInfo d2 = v99Var.d();
            if (v99Var.k() && (c = v99Var.c()) != null && (mediaInfo = c.a) != null) {
                d2 = mediaInfo;
            }
            j(s, d2);
            if (!v99Var.h()) {
                h();
                i();
                return;
            }
            if (s != 0) {
                t9f t9fVar = this.j;
                if (t9fVar != null) {
                    v.b("Update media notification.", new Object[0]);
                    CastDevice castDevice = this.o;
                    v99 v99Var2 = this.n;
                    rx6 rx6Var = this.p;
                    if (castDevice != null && v99Var2 != null && rx6Var != null && (d = v99Var2.d()) != null && (mt6Var = d.d) != null) {
                        ArrayList arrayList = mt6Var.a;
                        j07 e = v99Var2.e();
                        if (e != null) {
                            int i = e.G;
                            if (i == 1 || i == 2 || i == 3) {
                                z = true;
                                z2 = z;
                                boolean z3 = v99Var2.f() == 2;
                                int i2 = d.b;
                                mt6.c(1, "com.google.android.gms.cast.metadata.TITLE");
                                String string = mt6Var.b.getString("com.google.android.gms.cast.metadata.TITLE");
                                String str = castDevice.d;
                                az0 az0Var2 = new az0(z3, i2, string, str, ((ex6) rx6Var.b).c, z, z2);
                                boolean z4 = z3;
                                boolean z5 = z;
                                boolean z6 = z2;
                                az0Var = t9fVar.k;
                                if (az0Var != null || z4 != az0Var.a || i2 != az0Var.b || !qd1.d(string, (String) az0Var.f) || !qd1.d(str, (String) az0Var.g) || z5 != az0Var.c || z6 != az0Var.d) {
                                    t9fVar.k = az0Var2;
                                    t9fVar.b();
                                }
                                k7b k7bVar2 = new k7b((arrayList != null || arrayList.isEmpty()) ? null : (kxc) arrayList.get(0));
                                uri = (Uri) k7bVar2.b;
                                k7bVar = t9fVar.l;
                                if (k7bVar != null || !qd1.d(uri, (Uri) k7bVar.b)) {
                                    am2 am2Var = t9fVar.i;
                                    am2Var.f = new zhc(t9fVar, k7bVar2, (byte) 16);
                                    am2Var.P(uri);
                                }
                            } else {
                                Integer num = (Integer) e.O.get(e.c);
                                if (num != null) {
                                    boolean z7 = num.intValue() > 0;
                                    z = num.intValue() < e.H.size() + (-1);
                                    z2 = z7;
                                    if (v99Var2.f() == 2) {
                                    }
                                    int i22 = d.b;
                                    mt6.c(1, "com.google.android.gms.cast.metadata.TITLE");
                                    String string2 = mt6Var.b.getString("com.google.android.gms.cast.metadata.TITLE");
                                    String str2 = castDevice.d;
                                    az0 az0Var22 = new az0(z3, i22, string2, str2, ((ex6) rx6Var.b).c, z, z2);
                                    boolean z42 = z3;
                                    boolean z52 = z;
                                    boolean z62 = z2;
                                    az0Var = t9fVar.k;
                                    if (az0Var != null) {
                                    }
                                    t9fVar.k = az0Var22;
                                    t9fVar.b();
                                    k7b k7bVar22 = new k7b((arrayList != null || arrayList.isEmpty()) ? null : (kxc) arrayList.get(0));
                                    uri = (Uri) k7bVar22.b;
                                    k7bVar = t9fVar.l;
                                    if (k7bVar != null) {
                                    }
                                    am2 am2Var2 = t9fVar.i;
                                    am2Var2.f = new zhc(t9fVar, k7bVar22, (byte) 16);
                                    am2Var2.P(uri);
                                }
                            }
                        }
                        z = false;
                        z2 = z;
                        if (v99Var2.f() == 2) {
                        }
                        int i222 = d.b;
                        mt6.c(1, "com.google.android.gms.cast.metadata.TITLE");
                        String string22 = mt6Var.b.getString("com.google.android.gms.cast.metadata.TITLE");
                        String str22 = castDevice.d;
                        az0 az0Var222 = new az0(z3, i222, string22, str22, ((ex6) rx6Var.b).c, z, z2);
                        boolean z422 = z3;
                        boolean z522 = z;
                        boolean z622 = z2;
                        az0Var = t9fVar.k;
                        if (az0Var != null) {
                        }
                        t9fVar.k = az0Var222;
                        t9fVar.b();
                        k7b k7bVar222 = new k7b((arrayList != null || arrayList.isEmpty()) ? null : (kxc) arrayList.get(0));
                        uri = (Uri) k7bVar222.b;
                        k7bVar = t9fVar.l;
                        if (k7bVar != null) {
                        }
                        am2 am2Var22 = t9fVar.i;
                        am2Var22.f = new zhc(t9fVar, k7bVar222, (byte) 16);
                        am2Var22.P(uri);
                    }
                }
                if (v99Var.k()) {
                    return;
                }
                g(true);
            }
        }
    }

    public final long c(String str, int i, Bundle bundle) {
        long j;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    int i2 = 3;
                    if (i == 3) {
                        j = 514;
                    } else {
                        i2 = i;
                        j = 512;
                    }
                    if (i2 != 2) {
                        return j;
                    }
                    return 516L;
                }
            } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                v99 v99Var = this.n;
                if (v99Var != null && v99Var.h()) {
                    j07 e = v99Var.e();
                    xve.h(e);
                    if ((e.n & 128) != 0 || e.G != 0) {
                        return 16L;
                    }
                    Integer num = (Integer) e.O.get(e.c);
                    if (num != null && num.intValue() > 0) {
                        return 16L;
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                return 0L;
            }
        } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
            v99 v99Var2 = this.n;
            if (v99Var2 != null && v99Var2.h()) {
                j07 e2 = v99Var2.e();
                xve.h(e2);
                if ((e2.n & 64) != 0 || e2.G != 0) {
                    return 32L;
                }
                Integer num2 = (Integer) e2.O.get(e2.c);
                if (num2 != null && num2.intValue() < e2.H.size() - 1) {
                    return 32L;
                }
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        return 0L;
    }

    public final Uri d(mt6 mt6Var) {
        jd1 jd1Var = this.b.f;
        if (jd1Var != null) {
            jd1Var.b();
        }
        ArrayList arrayList = mt6Var.a;
        kxc kxcVar = (arrayList == null || arrayList.isEmpty()) ? null : (kxc) mt6Var.a.get(0);
        if (kxcVar == null) {
            return null;
        }
        return kxcVar.b;
    }

    public final void e(int i, Bitmap bitmap) {
        MediaMetadata metadata;
        rx6 rx6Var = this.p;
        if (rx6Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        rx6 rx6Var2 = this.p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (rx6Var2 != null && (metadata = ((a) ((um4) rx6Var2.c).b).a.getMetadata()) != null) {
            qs qsVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        v34 v34Var = mediaMetadataCompat == null ? new v34((byte) 16) : new v34(mediaMetadataCompat);
        v34Var.Q(i == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART", bitmap);
        rx6Var.r0(new MediaMetadataCompat((Bundle) v34Var.b));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(f fVar, String str, vm7 vm7Var) {
        PlaybackStateCompat.CustomAction customAction;
        PlaybackStateCompat.CustomAction customAction2;
        PlaybackStateCompat.CustomAction customAction3;
        int hashCode = str.hashCode();
        Context context = this.a;
        PlaybackStateCompat.CustomAction customAction4 = null;
        po7 po7Var = this.e;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    customAction = this.s;
                    if (customAction == null && po7Var != null) {
                        long j = po7Var.c;
                        he6 he6Var = nlf.a;
                        int i = po7Var.S;
                        if (j == 10000) {
                            i = po7Var.T;
                        } else if (j == 30000) {
                            i = po7Var.U;
                        }
                        int i2 = po7Var.E;
                        if (j == 10000) {
                            i2 = po7Var.F;
                        } else if (j == 30000) {
                            i2 = po7Var.G;
                        }
                        String string = context.getResources().getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            if (i2 == 0) {
                                lq5.j("You must specify an icon resource id to build a CustomAction");
                                break;
                            } else {
                                customAction2 = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_REWIND, string, i2, null);
                                this.s = customAction2;
                                customAction4 = customAction2;
                                if (customAction4 != null) {
                                    fVar.a(customAction4);
                                    break;
                                }
                            }
                        } else {
                            lq5.j("You must specify a name to build a CustomAction");
                            break;
                        }
                    }
                    customAction4 = customAction;
                    if (customAction4 != null) {
                    }
                }
                if (vm7Var != null) {
                    String str2 = vm7Var.c;
                    int i3 = vm7Var.b;
                    if (!TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            if (i3 == 0) {
                                lq5.j("You must specify an icon resource id to build a CustomAction");
                                break;
                            } else {
                                customAction4 = new PlaybackStateCompat.CustomAction(str, str2, i3, null);
                            }
                        } else {
                            lq5.j("You must specify a name to build a CustomAction");
                            break;
                        }
                    } else {
                        lq5.j("You must specify an action to build a CustomAction");
                        break;
                    }
                }
                if (customAction4 != null) {
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    customAction = this.t;
                    if (customAction == null && po7Var != null) {
                        String string2 = context.getResources().getString(po7Var.V);
                        int i4 = po7Var.H;
                        if (!TextUtils.isEmpty(string2)) {
                            if (i4 == 0) {
                                lq5.j("You must specify an icon resource id to build a CustomAction");
                                break;
                            } else {
                                customAction3 = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_STOP_CASTING, string2, i4, null);
                                this.t = customAction3;
                                customAction4 = customAction3;
                                if (customAction4 != null) {
                                }
                            }
                        } else {
                            lq5.j("You must specify a name to build a CustomAction");
                            break;
                        }
                    }
                    customAction4 = customAction;
                    if (customAction4 != null) {
                    }
                }
                if (vm7Var != null) {
                }
                if (customAction4 != null) {
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    customAction = this.u;
                    if (customAction == null && po7Var != null) {
                        String string3 = context.getResources().getString(po7Var.V);
                        int i5 = po7Var.H;
                        if (!TextUtils.isEmpty(string3)) {
                            if (i5 == 0) {
                                lq5.j("You must specify an icon resource id to build a CustomAction");
                                break;
                            } else {
                                customAction3 = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_DISCONNECT, string3, i5, null);
                                this.u = customAction3;
                                customAction4 = customAction3;
                                if (customAction4 != null) {
                                }
                            }
                        } else {
                            lq5.j("You must specify a name to build a CustomAction");
                            break;
                        }
                    }
                    customAction4 = customAction;
                    if (customAction4 != null) {
                    }
                }
                if (vm7Var != null) {
                }
                if (customAction4 != null) {
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    customAction = this.r;
                    if (customAction == null && po7Var != null) {
                        long j2 = po7Var.c;
                        he6 he6Var2 = nlf.a;
                        int i6 = po7Var.P;
                        if (j2 == 10000) {
                            i6 = po7Var.Q;
                        } else if (j2 == 30000) {
                            i6 = po7Var.R;
                        }
                        int i7 = po7Var.w;
                        if (j2 == 10000) {
                            i7 = po7Var.x;
                        } else if (j2 == 30000) {
                            i7 = po7Var.y;
                        }
                        String string4 = context.getResources().getString(i6);
                        if (!TextUtils.isEmpty(string4)) {
                            if (i7 == 0) {
                                lq5.j("You must specify an icon resource id to build a CustomAction");
                                break;
                            } else {
                                customAction2 = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_FORWARD, string4, i7, null);
                                this.r = customAction2;
                                customAction4 = customAction2;
                                if (customAction4 != null) {
                                }
                            }
                        } else {
                            lq5.j("You must specify a name to build a CustomAction");
                            break;
                        }
                    }
                    customAction4 = customAction;
                    if (customAction4 != null) {
                    }
                }
                if (vm7Var != null) {
                }
                if (customAction4 != null) {
                }
                break;
            default:
                if (vm7Var != null) {
                }
                if (customAction4 != null) {
                }
                break;
        }
    }

    public final void g(boolean z) {
        if (this.b.h) {
            b99 b99Var = this.k;
            dhe dheVar = this.l;
            if (dheVar != null) {
                b99Var.removeCallbacks(dheVar);
            }
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    b99Var.postDelayed(dheVar, 1000L);
                }
            }
        }
    }

    public final void h() {
        t9f t9fVar = this.j;
        if (t9fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            am2 am2Var = t9fVar.i;
            am2Var.Q();
            am2Var.f = null;
            NotificationManager notificationManager = t9fVar.b;
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

    public final void j(int i, MediaInfo mediaInfo) {
        PlaybackStateCompat b;
        rx6 rx6Var;
        mt6 mt6Var;
        MediaMetadataCompat mediaMetadataCompat;
        Bitmap bitmap;
        MediaMetadata metadata;
        PendingIntent activity;
        int i2;
        rx6 rx6Var2 = this.p;
        if (rx6Var2 != null) {
            ex6 ex6Var = (ex6) rx6Var2.b;
            Bundle bundle = new Bundle();
            f fVar = new f();
            v99 v99Var = this.n;
            po7 po7Var = this.e;
            if (v99Var == null || this.j == null) {
                b = fVar.b();
            } else {
                fVar.c(i, (v99Var.s() == 0 || v99Var.j()) ? 0L : v99Var.a(), 1.0f);
                if (i == 0) {
                    b = fVar.b();
                } else {
                    uxd uxdVar = po7Var != null ? po7Var.W : null;
                    v99 v99Var2 = this.n;
                    long j = (v99Var2 == null || v99Var2.j() || this.n.n()) ? 0L : 256L;
                    if (uxdVar != null) {
                        ArrayList a = nlf.a(uxdVar);
                        if (a != null) {
                            int size = a.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj = a.get(i3);
                                i3++;
                                ArrayList arrayList = a;
                                vm7 vm7Var = (vm7) obj;
                                int i4 = size;
                                String str = vm7Var.a;
                                if (TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                    j |= c(str, i, bundle);
                                } else {
                                    f(fVar, str, vm7Var);
                                }
                                size = i4;
                                a = arrayList;
                            }
                        }
                    } else if (po7Var != null) {
                        ArrayList arrayList2 = po7Var.a;
                        int size2 = arrayList2.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj2 = arrayList2.get(i5);
                            i5++;
                            ArrayList arrayList3 = arrayList2;
                            String str2 = (String) obj2;
                            if (TextUtils.equals(str2, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                i2 = size2;
                                j |= c(str2, i, bundle);
                            } else {
                                i2 = size2;
                                f(fVar, str2, null);
                            }
                            size2 = i2;
                            arrayList2 = arrayList3;
                        }
                    }
                    fVar.e = j;
                    b = fVar.b();
                }
            }
            rx6Var2.s0(b);
            if (po7Var != null && po7Var.X) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            }
            if (po7Var != null && po7Var.Y) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
            }
            if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
                ex6Var.a.setExtras(bundle);
            }
            if (i == 0) {
                rx6Var2.r0(new MediaMetadataCompat(new Bundle()));
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
                    ex6Var.a.setSessionActivity(activity);
                }
            }
            v99 v99Var3 = this.n;
            if (v99Var3 == null || (rx6Var = this.p) == null || mediaInfo == null || (mt6Var = mediaInfo.d) == null) {
                return;
            }
            Bundle bundle2 = mt6Var.b;
            long j2 = v99Var3.j() ? 0L : mediaInfo.e;
            mt6.c(1, "com.google.android.gms.cast.metadata.TITLE");
            String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
            mt6.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
            String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
            rx6 rx6Var3 = this.p;
            if (rx6Var3 == null || (metadata = ((a) ((um4) rx6Var3.c).b).a.getMetadata()) == null) {
                mediaMetadataCompat = null;
            } else {
                qs qsVar = MediaMetadataCompat.d;
                Parcel obtain = Parcel.obtain();
                metadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                mediaMetadataCompat.b = metadata;
            }
            v34 v34Var = mediaMetadataCompat == null ? new v34((byte) 16) : new v34(mediaMetadataCompat);
            v34Var.R(j2);
            if (string != null) {
                v34Var.S("android.media.metadata.TITLE", string);
                v34Var.S("android.media.metadata.DISPLAY_TITLE", string);
            }
            if (string2 != null) {
                v34Var.S("android.media.metadata.DISPLAY_SUBTITLE", string2);
            }
            rx6Var.r0(new MediaMetadataCompat((Bundle) v34Var.b));
            Uri d = d(mt6Var);
            if (d != null) {
                this.h.P(d);
                bitmap = null;
            } else {
                bitmap = null;
                e(0, null);
            }
            Uri d2 = d(mt6Var);
            if (d2 != null) {
                this.i.P(d2);
            } else {
                e(3, bitmap);
            }
        }
    }
}
