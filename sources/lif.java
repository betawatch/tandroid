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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lif {
    public static final ce6 v = new ce6("MediaSessionManager", null);
    public final Context a;
    public final le1 b;
    public final qed c;
    public final l8a d;
    public final tn7 e;
    public final ComponentName f;
    public final ComponentName g;
    public final sm2 h;
    public final sm2 i;
    public final e7f j;
    public final q79 k;
    public final eqd l;
    public final ddf m;
    public k89 n;
    public CastDevice o;
    public mx6 p;
    public boolean q;
    public PlaybackStateCompat.CustomAction r;
    public PlaybackStateCompat.CustomAction s;
    public PlaybackStateCompat.CustomAction t;
    public PlaybackStateCompat.CustomAction u;

    public lif(Context context, le1 le1Var, qed qedVar) {
        tn7 tn7Var;
        this.a = context;
        this.b = le1Var;
        this.c = qedVar;
        ce6 ce6Var = ie1.l;
        ite.e("Must be called from the main thread.");
        ie1 ie1Var = ie1.n;
        e7f e7fVar = null;
        this.d = ie1Var != null ? ie1Var.b() : null;
        je1 je1Var = le1Var.f;
        this.e = je1Var == null ? null : je1Var.d;
        this.m = new ddf(this, (byte) 2);
        String str = je1Var == null ? null : je1Var.b;
        this.f = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = je1Var == null ? null : je1Var.a;
        this.g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        sm2 sm2Var = new sm2(context);
        this.h = sm2Var;
        sm2Var.f = new und(this);
        sm2 sm2Var2 = new sm2(context);
        this.i = sm2Var2;
        hoe hoeVar = new hoe();
        hoeVar.a = this;
        sm2Var2.f = hoeVar;
        this.k = new q79(Looper.getMainLooper(), (byte) 3);
        ce6 ce6Var2 = e7f.u;
        je1 je1Var2 = le1Var.f;
        if (je1Var2 != null && (tn7Var = je1Var2.d) != null) {
            hvd hvdVar = tn7Var.W;
            if (hvdVar != null) {
                ArrayList a = yif.a(hvdVar);
                int[] b = yif.b(hvdVar);
                int size = a == null ? 0 : a.size();
                if (a == null || a.isEmpty()) {
                    Log.e(ce6Var2.a, ce6Var2.d(am7.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                } else if (a.size() > 5) {
                    Log.e(ce6Var2.a, ce6Var2.d(am7.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                } else if (b == null || (b.length) == 0) {
                    Log.e(ce6Var2.a, ce6Var2.d(am7.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                } else {
                    for (int i : b) {
                        if (i < 0 || i >= size) {
                            Log.e(ce6Var2.a, ce6Var2.d(am7.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                            break;
                        }
                    }
                }
            }
            e7fVar = new e7f(context);
        }
        this.j = e7fVar;
        this.l = new eqd((Object) this, (byte) 4);
    }

    public final void a(k89 k89Var, CastDevice castDevice) {
        ComponentName componentName;
        le1 le1Var = this.b;
        je1 je1Var = le1Var == null ? null : le1Var.f;
        if (this.q || le1Var == null || je1Var == null || this.e == null || k89Var == null || castDevice == null || (componentName = this.g) == null) {
            v.b("skip attaching media session", new Object[0]);
            return;
        }
        this.n = k89Var;
        k89Var.p(this.m);
        this.o = castDevice;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        Context context = this.a;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
        boolean z = je1Var.f;
        byte b = 1;
        if (z) {
            mx6 mx6Var = new mx6(context, "CastMediaSession", componentName, broadcast);
            this.p = mx6Var;
            j(0, null);
            CastDevice castDevice2 = this.o;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                Bundle bundle = new Bundle();
                String string = context.getResources().getString(R.string.cast_casting_to_device, this.o.d);
                qt qtVar = MediaMetadataCompat.d;
                if (qtVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) qtVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                    u36.j("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    return;
                } else {
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    mx6Var.q0(new MediaMetadataCompat(bundle));
                }
            }
            mx6Var.o0(new hj7(this, b), null);
            mx6Var.l0(true);
            this.c.T(mx6Var);
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
        it6 it6Var;
        boolean z;
        boolean z2;
        zz0 zz0Var;
        Uri uri;
        xab xabVar;
        au6 c;
        MediaInfo mediaInfo;
        k89 k89Var = this.n;
        if (k89Var != null) {
            int s = k89Var.s();
            MediaInfo d2 = k89Var.d();
            if (k89Var.k() && (c = k89Var.c()) != null && (mediaInfo = c.a) != null) {
                d2 = mediaInfo;
            }
            j(s, d2);
            if (!k89Var.h()) {
                h();
                i();
                return;
            }
            if (s != 0) {
                e7f e7fVar = this.j;
                if (e7fVar != null) {
                    v.b("Update media notification.", new Object[0]);
                    CastDevice castDevice = this.o;
                    k89 k89Var2 = this.n;
                    mx6 mx6Var = this.p;
                    if (castDevice != null && k89Var2 != null && mx6Var != null && (d = k89Var2.d()) != null && (it6Var = d.d) != null) {
                        ArrayList arrayList = it6Var.a;
                        f07 e = k89Var2.e();
                        if (e != null) {
                            int i = e.G;
                            if (i == 1 || i == 2 || i == 3) {
                                z = true;
                                z2 = z;
                                boolean z3 = k89Var2.f() == 2;
                                int i2 = d.b;
                                it6.c(1, "com.google.android.gms.cast.metadata.TITLE");
                                String string = it6Var.b.getString("com.google.android.gms.cast.metadata.TITLE");
                                String str = castDevice.d;
                                zz0 zz0Var2 = new zz0(z3, i2, string, str, ((zw6) mx6Var.b).c, z, z2);
                                boolean z4 = z3;
                                boolean z5 = z;
                                boolean z6 = z2;
                                zz0Var = e7fVar.k;
                                if (zz0Var != null || z4 != zz0Var.a || i2 != zz0Var.b || !qe1.d(string, (String) zz0Var.f) || !qe1.d(str, (String) zz0Var.g) || z5 != zz0Var.c || z6 != zz0Var.d) {
                                    e7fVar.k = zz0Var2;
                                    e7fVar.b();
                                }
                                xab xabVar2 = new xab((arrayList != null || arrayList.isEmpty()) ? null : (wuc) arrayList.get(0));
                                uri = (Uri) xabVar2.b;
                                xabVar = e7fVar.l;
                                if (xabVar != null || !qe1.d(uri, (Uri) xabVar.b)) {
                                    sm2 sm2Var = e7fVar.i;
                                    sm2Var.f = new rhb(e7fVar, xabVar2, (byte) 18);
                                    sm2Var.P(uri);
                                }
                            } else {
                                Integer num = (Integer) e.O.get(e.c);
                                if (num != null) {
                                    boolean z7 = num.intValue() > 0;
                                    z = num.intValue() < e.H.size() + (-1);
                                    z2 = z7;
                                    if (k89Var2.f() == 2) {
                                    }
                                    int i22 = d.b;
                                    it6.c(1, "com.google.android.gms.cast.metadata.TITLE");
                                    String string2 = it6Var.b.getString("com.google.android.gms.cast.metadata.TITLE");
                                    String str2 = castDevice.d;
                                    zz0 zz0Var22 = new zz0(z3, i22, string2, str2, ((zw6) mx6Var.b).c, z, z2);
                                    boolean z42 = z3;
                                    boolean z52 = z;
                                    boolean z62 = z2;
                                    zz0Var = e7fVar.k;
                                    if (zz0Var != null) {
                                    }
                                    e7fVar.k = zz0Var22;
                                    e7fVar.b();
                                    xab xabVar22 = new xab((arrayList != null || arrayList.isEmpty()) ? null : (wuc) arrayList.get(0));
                                    uri = (Uri) xabVar22.b;
                                    xabVar = e7fVar.l;
                                    if (xabVar != null) {
                                    }
                                    sm2 sm2Var2 = e7fVar.i;
                                    sm2Var2.f = new rhb(e7fVar, xabVar22, (byte) 18);
                                    sm2Var2.P(uri);
                                }
                            }
                        }
                        z = false;
                        z2 = z;
                        if (k89Var2.f() == 2) {
                        }
                        int i222 = d.b;
                        it6.c(1, "com.google.android.gms.cast.metadata.TITLE");
                        String string22 = it6Var.b.getString("com.google.android.gms.cast.metadata.TITLE");
                        String str22 = castDevice.d;
                        zz0 zz0Var222 = new zz0(z3, i222, string22, str22, ((zw6) mx6Var.b).c, z, z2);
                        boolean z422 = z3;
                        boolean z522 = z;
                        boolean z622 = z2;
                        zz0Var = e7fVar.k;
                        if (zz0Var != null) {
                        }
                        e7fVar.k = zz0Var222;
                        e7fVar.b();
                        xab xabVar222 = new xab((arrayList != null || arrayList.isEmpty()) ? null : (wuc) arrayList.get(0));
                        uri = (Uri) xabVar222.b;
                        xabVar = e7fVar.l;
                        if (xabVar != null) {
                        }
                        sm2 sm2Var22 = e7fVar.i;
                        sm2Var22.f = new rhb(e7fVar, xabVar222, (byte) 18);
                        sm2Var22.P(uri);
                    }
                }
                if (k89Var.k()) {
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
                k89 k89Var = this.n;
                if (k89Var != null && k89Var.h()) {
                    f07 e = k89Var.e();
                    ite.h(e);
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
            k89 k89Var2 = this.n;
            if (k89Var2 != null && k89Var2.h()) {
                f07 e2 = k89Var2.e();
                ite.h(e2);
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

    public final Uri d(it6 it6Var) {
        je1 je1Var = this.b.f;
        if (je1Var != null) {
            je1Var.b();
        }
        ArrayList arrayList = it6Var.a;
        wuc wucVar = (arrayList == null || arrayList.isEmpty()) ? null : (wuc) it6Var.a.get(0);
        if (wucVar == null) {
            return null;
        }
        return wucVar.b;
    }

    public final void e(int i, Bitmap bitmap) {
        MediaMetadata metadata;
        mx6 mx6Var = this.p;
        if (mx6Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        mx6 mx6Var2 = this.p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (mx6Var2 != null && (metadata = ((a) ((wm4) mx6Var2.c).b).a.getMetadata()) != null) {
            qt qtVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        k44 k44Var = mediaMetadataCompat == null ? new k44((byte) 17) : new k44(mediaMetadataCompat);
        k44Var.Q(i == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART", bitmap);
        mx6Var.q0(new MediaMetadataCompat((Bundle) k44Var.b));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(f fVar, String str, zl7 zl7Var) {
        PlaybackStateCompat.CustomAction customAction;
        PlaybackStateCompat.CustomAction customAction2;
        PlaybackStateCompat.CustomAction customAction3;
        int hashCode = str.hashCode();
        Context context = this.a;
        PlaybackStateCompat.CustomAction customAction4 = null;
        tn7 tn7Var = this.e;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    customAction = this.s;
                    if (customAction == null && tn7Var != null) {
                        long j = tn7Var.c;
                        ce6 ce6Var = yif.a;
                        int i = tn7Var.S;
                        if (j == 10000) {
                            i = tn7Var.T;
                        } else if (j == 30000) {
                            i = tn7Var.U;
                        }
                        int i2 = tn7Var.E;
                        if (j == 10000) {
                            i2 = tn7Var.F;
                        } else if (j == 30000) {
                            i2 = tn7Var.G;
                        }
                        String string = context.getResources().getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            if (i2 == 0) {
                                u36.j("You must specify an icon resource id to build a CustomAction");
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
                            u36.j("You must specify a name to build a CustomAction");
                            break;
                        }
                    }
                    customAction4 = customAction;
                    if (customAction4 != null) {
                    }
                }
                if (zl7Var != null) {
                    String str2 = zl7Var.c;
                    int i3 = zl7Var.b;
                    if (!TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            if (i3 == 0) {
                                u36.j("You must specify an icon resource id to build a CustomAction");
                                break;
                            } else {
                                customAction4 = new PlaybackStateCompat.CustomAction(str, str2, i3, null);
                            }
                        } else {
                            u36.j("You must specify a name to build a CustomAction");
                            break;
                        }
                    } else {
                        u36.j("You must specify an action to build a CustomAction");
                        break;
                    }
                }
                if (customAction4 != null) {
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    customAction = this.t;
                    if (customAction == null && tn7Var != null) {
                        String string2 = context.getResources().getString(tn7Var.V);
                        int i4 = tn7Var.H;
                        if (!TextUtils.isEmpty(string2)) {
                            if (i4 == 0) {
                                u36.j("You must specify an icon resource id to build a CustomAction");
                                break;
                            } else {
                                customAction3 = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_STOP_CASTING, string2, i4, null);
                                this.t = customAction3;
                                customAction4 = customAction3;
                                if (customAction4 != null) {
                                }
                            }
                        } else {
                            u36.j("You must specify a name to build a CustomAction");
                            break;
                        }
                    }
                    customAction4 = customAction;
                    if (customAction4 != null) {
                    }
                }
                if (zl7Var != null) {
                }
                if (customAction4 != null) {
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    customAction = this.u;
                    if (customAction == null && tn7Var != null) {
                        String string3 = context.getResources().getString(tn7Var.V);
                        int i5 = tn7Var.H;
                        if (!TextUtils.isEmpty(string3)) {
                            if (i5 == 0) {
                                u36.j("You must specify an icon resource id to build a CustomAction");
                                break;
                            } else {
                                customAction3 = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_DISCONNECT, string3, i5, null);
                                this.u = customAction3;
                                customAction4 = customAction3;
                                if (customAction4 != null) {
                                }
                            }
                        } else {
                            u36.j("You must specify a name to build a CustomAction");
                            break;
                        }
                    }
                    customAction4 = customAction;
                    if (customAction4 != null) {
                    }
                }
                if (zl7Var != null) {
                }
                if (customAction4 != null) {
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    customAction = this.r;
                    if (customAction == null && tn7Var != null) {
                        long j2 = tn7Var.c;
                        ce6 ce6Var2 = yif.a;
                        int i6 = tn7Var.P;
                        if (j2 == 10000) {
                            i6 = tn7Var.Q;
                        } else if (j2 == 30000) {
                            i6 = tn7Var.R;
                        }
                        int i7 = tn7Var.w;
                        if (j2 == 10000) {
                            i7 = tn7Var.x;
                        } else if (j2 == 30000) {
                            i7 = tn7Var.y;
                        }
                        String string4 = context.getResources().getString(i6);
                        if (!TextUtils.isEmpty(string4)) {
                            if (i7 == 0) {
                                u36.j("You must specify an icon resource id to build a CustomAction");
                                break;
                            } else {
                                customAction2 = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_FORWARD, string4, i7, null);
                                this.r = customAction2;
                                customAction4 = customAction2;
                                if (customAction4 != null) {
                                }
                            }
                        } else {
                            u36.j("You must specify a name to build a CustomAction");
                            break;
                        }
                    }
                    customAction4 = customAction;
                    if (customAction4 != null) {
                    }
                }
                if (zl7Var != null) {
                }
                if (customAction4 != null) {
                }
                break;
            default:
                if (zl7Var != null) {
                }
                if (customAction4 != null) {
                }
                break;
        }
    }

    public final void g(boolean z) {
        if (this.b.h) {
            q79 q79Var = this.k;
            eqd eqdVar = this.l;
            if (eqdVar != null) {
                q79Var.removeCallbacks(eqdVar);
            }
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    q79Var.postDelayed(eqdVar, 1000L);
                }
            }
        }
    }

    public final void h() {
        e7f e7fVar = this.j;
        if (e7fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            sm2 sm2Var = e7fVar.i;
            sm2Var.Q();
            sm2Var.f = null;
            NotificationManager notificationManager = e7fVar.b;
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
        mx6 mx6Var;
        it6 it6Var;
        MediaMetadataCompat mediaMetadataCompat;
        Bitmap bitmap;
        MediaMetadata metadata;
        PendingIntent activity;
        int i2;
        mx6 mx6Var2 = this.p;
        if (mx6Var2 != null) {
            zw6 zw6Var = (zw6) mx6Var2.b;
            Bundle bundle = new Bundle();
            f fVar = new f();
            k89 k89Var = this.n;
            tn7 tn7Var = this.e;
            if (k89Var == null || this.j == null) {
                b = fVar.b();
            } else {
                fVar.c(i, (k89Var.s() == 0 || k89Var.j()) ? 0L : k89Var.a(), 1.0f);
                if (i == 0) {
                    b = fVar.b();
                } else {
                    hvd hvdVar = tn7Var != null ? tn7Var.W : null;
                    k89 k89Var2 = this.n;
                    long j = (k89Var2 == null || k89Var2.j() || this.n.n()) ? 0L : 256L;
                    if (hvdVar != null) {
                        ArrayList a = yif.a(hvdVar);
                        if (a != null) {
                            int size = a.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj = a.get(i3);
                                i3++;
                                ArrayList arrayList = a;
                                zl7 zl7Var = (zl7) obj;
                                int i4 = size;
                                String str = zl7Var.a;
                                if (TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                    j |= c(str, i, bundle);
                                } else {
                                    f(fVar, str, zl7Var);
                                }
                                size = i4;
                                a = arrayList;
                            }
                        }
                    } else if (tn7Var != null) {
                        ArrayList arrayList2 = tn7Var.a;
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
            mx6Var2.r0(b);
            if (tn7Var != null && tn7Var.X) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            }
            if (tn7Var != null && tn7Var.Y) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
            }
            if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
                zw6Var.a.setExtras(bundle);
            }
            if (i == 0) {
                mx6Var2.q0(new MediaMetadataCompat(new Bundle()));
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
                    zw6Var.a.setSessionActivity(activity);
                }
            }
            k89 k89Var3 = this.n;
            if (k89Var3 == null || (mx6Var = this.p) == null || mediaInfo == null || (it6Var = mediaInfo.d) == null) {
                return;
            }
            Bundle bundle2 = it6Var.b;
            long j2 = k89Var3.j() ? 0L : mediaInfo.e;
            it6.c(1, "com.google.android.gms.cast.metadata.TITLE");
            String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
            it6.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
            String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
            mx6 mx6Var3 = this.p;
            if (mx6Var3 == null || (metadata = ((a) ((wm4) mx6Var3.c).b).a.getMetadata()) == null) {
                mediaMetadataCompat = null;
            } else {
                qt qtVar = MediaMetadataCompat.d;
                Parcel obtain = Parcel.obtain();
                metadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                mediaMetadataCompat.b = metadata;
            }
            k44 k44Var = mediaMetadataCompat == null ? new k44((byte) 17) : new k44(mediaMetadataCompat);
            k44Var.T(j2);
            if (string != null) {
                k44Var.U("android.media.metadata.TITLE", string);
                k44Var.U("android.media.metadata.DISPLAY_TITLE", string);
            }
            if (string2 != null) {
                k44Var.U("android.media.metadata.DISPLAY_SUBTITLE", string2);
            }
            mx6Var.q0(new MediaMetadataCompat((Bundle) k44Var.b));
            Uri d = d(it6Var);
            if (d != null) {
                this.h.P(d);
                bitmap = null;
            } else {
                bitmap = null;
                e(0, null);
            }
            Uri d2 = d(it6Var);
            if (d2 != null) {
                this.i.P(d2);
            } else {
                e(3, bitmap);
            }
        }
    }
}
