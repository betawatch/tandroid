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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class kgf {
    public static final dc6 v = new dc6("MediaSessionManager", null);
    public final Context a;
    public final dd1 b;
    public final ocd c;
    public final j6a d;
    public final ql7 e;
    public final ComponentName f;
    public final ComponentName g;
    public final gl2 h;
    public final gl2 i;
    public final c5f j;
    public final o59 k;
    public final bod l;
    public final cbf m;
    public i69 n;
    public CastDevice o;
    public mv6 p;
    public boolean q;
    public PlaybackStateCompat.CustomAction r;
    public PlaybackStateCompat.CustomAction s;
    public PlaybackStateCompat.CustomAction t;
    public PlaybackStateCompat.CustomAction u;

    public kgf(Context context, dd1 dd1Var, ocd ocdVar) {
        ql7 ql7Var;
        this.a = context;
        this.b = dd1Var;
        this.c = ocdVar;
        dc6 dc6Var = ad1.l;
        fre.e("Must be called from the main thread.");
        ad1 ad1Var = ad1.n;
        c5f c5fVar = null;
        this.d = ad1Var != null ? ad1Var.b() : null;
        bd1 bd1Var = dd1Var.f;
        this.e = bd1Var == null ? null : bd1Var.d;
        this.m = new cbf(this, (byte) 2);
        String str = bd1Var == null ? null : bd1Var.b;
        this.f = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = bd1Var == null ? null : bd1Var.a;
        this.g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        gl2 gl2Var = new gl2(context);
        this.h = gl2Var;
        gl2Var.f = new sld(this);
        gl2 gl2Var2 = new gl2(context);
        this.i = gl2Var2;
        gl2Var2.f = new xdd(this);
        this.k = new o59(Looper.getMainLooper(), (byte) 3);
        dc6 dc6Var2 = c5f.u;
        bd1 bd1Var2 = dd1Var.f;
        if (bd1Var2 != null && (ql7Var = bd1Var2.d) != null) {
            etd etdVar = ql7Var.W;
            if (etdVar != null) {
                ArrayList a = xgf.a(etdVar);
                int[] b = xgf.b(etdVar);
                int size = a == null ? 0 : a.size();
                if (a == null || a.isEmpty()) {
                    Log.e(dc6Var2.a, dc6Var2.d(xj7.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                } else if (a.size() > 5) {
                    Log.e(dc6Var2.a, dc6Var2.d(xj7.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                } else if (b == null || (b.length) == 0) {
                    Log.e(dc6Var2.a, dc6Var2.d(xj7.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                } else {
                    for (int i : b) {
                        if (i < 0 || i >= size) {
                            Log.e(dc6Var2.a, dc6Var2.d(xj7.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                            break;
                        }
                    }
                }
            }
            c5fVar = new c5f(context);
        }
        this.j = c5fVar;
        this.l = new bod((Object) this, (byte) 4);
    }

    public final void a(i69 i69Var, CastDevice castDevice) {
        ComponentName componentName;
        dd1 dd1Var = this.b;
        bd1 bd1Var = dd1Var == null ? null : dd1Var.f;
        if (this.q || dd1Var == null || bd1Var == null || this.e == null || i69Var == null || castDevice == null || (componentName = this.g) == null) {
            v.b("skip attaching media session", new Object[0]);
            return;
        }
        this.n = i69Var;
        i69Var.p(this.m);
        this.o = castDevice;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        Context context = this.a;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
        boolean z = bd1Var.f;
        byte b = 1;
        if (z) {
            mv6 mv6Var = new mv6(context, "CastMediaSession", componentName, broadcast);
            this.p = mv6Var;
            j(0, null);
            CastDevice castDevice2 = this.o;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                Bundle bundle = new Bundle();
                String string = context.getResources().getString(R.string.cast_casting_to_device, this.o.d);
                ps psVar = MediaMetadataCompat.d;
                if (psVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) psVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                    w26.j("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    return;
                } else {
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    mv6Var.m0(new MediaMetadataCompat(bundle));
                }
            }
            mv6Var.k0(new eh7(this, b), null);
            mv6Var.i0(true);
            this.c.T(mv6Var);
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
        ir6 ir6Var;
        boolean z;
        boolean z2;
        sy0 sy0Var;
        Uri uri;
        v8b v8bVar;
        zr6 c;
        MediaInfo mediaInfo;
        i69 i69Var = this.n;
        if (i69Var != null) {
            int s = i69Var.s();
            MediaInfo d2 = i69Var.d();
            if (i69Var.k() && (c = i69Var.c()) != null && (mediaInfo = c.a) != null) {
                d2 = mediaInfo;
            }
            j(s, d2);
            if (!i69Var.h()) {
                h();
                i();
                return;
            }
            if (s != 0) {
                c5f c5fVar = this.j;
                if (c5fVar != null) {
                    v.b("Update media notification.", new Object[0]);
                    CastDevice castDevice = this.o;
                    i69 i69Var2 = this.n;
                    mv6 mv6Var = this.p;
                    if (castDevice != null && i69Var2 != null && mv6Var != null && (d = i69Var2.d()) != null && (ir6Var = d.d) != null) {
                        ArrayList arrayList = ir6Var.a;
                        fy6 e = i69Var2.e();
                        if (e != null) {
                            int i = e.G;
                            if (i == 1 || i == 2 || i == 3) {
                                z = true;
                                z2 = z;
                                boolean z3 = i69Var2.f() == 2;
                                int i2 = d.b;
                                ir6.c(1, "com.google.android.gms.cast.metadata.TITLE");
                                String string = ir6Var.b.getString("com.google.android.gms.cast.metadata.TITLE");
                                String str = castDevice.d;
                                sy0 sy0Var2 = new sy0(z3, i2, string, str, ((zu6) mv6Var.b).c, z, z2);
                                boolean z4 = z3;
                                boolean z5 = z;
                                boolean z6 = z2;
                                sy0Var = c5fVar.k;
                                if (sy0Var != null || z4 != sy0Var.a || i2 != sy0Var.b || !id1.d(string, (String) sy0Var.f) || !id1.d(str, (String) sy0Var.g) || z5 != sy0Var.c || z6 != sy0Var.d) {
                                    c5fVar.k = sy0Var2;
                                    c5fVar.b();
                                }
                                v8b v8bVar2 = new v8b((arrayList != null || arrayList.isEmpty()) ? null : (vsc) arrayList.get(0));
                                uri = (Uri) v8bVar2.b;
                                v8bVar = c5fVar.l;
                                if (v8bVar != null || !id1.d(uri, (Uri) v8bVar.b)) {
                                    gl2 gl2Var = c5fVar.i;
                                    gl2Var.f = new aec(c5fVar, v8bVar2, (byte) 16);
                                    gl2Var.Q(uri);
                                }
                            } else {
                                Integer num = (Integer) e.O.get(e.c);
                                if (num != null) {
                                    boolean z7 = num.intValue() > 0;
                                    z = num.intValue() < e.H.size() + (-1);
                                    z2 = z7;
                                    if (i69Var2.f() == 2) {
                                    }
                                    int i22 = d.b;
                                    ir6.c(1, "com.google.android.gms.cast.metadata.TITLE");
                                    String string2 = ir6Var.b.getString("com.google.android.gms.cast.metadata.TITLE");
                                    String str2 = castDevice.d;
                                    sy0 sy0Var22 = new sy0(z3, i22, string2, str2, ((zu6) mv6Var.b).c, z, z2);
                                    boolean z42 = z3;
                                    boolean z52 = z;
                                    boolean z62 = z2;
                                    sy0Var = c5fVar.k;
                                    if (sy0Var != null) {
                                    }
                                    c5fVar.k = sy0Var22;
                                    c5fVar.b();
                                    v8b v8bVar22 = new v8b((arrayList != null || arrayList.isEmpty()) ? null : (vsc) arrayList.get(0));
                                    uri = (Uri) v8bVar22.b;
                                    v8bVar = c5fVar.l;
                                    if (v8bVar != null) {
                                    }
                                    gl2 gl2Var2 = c5fVar.i;
                                    gl2Var2.f = new aec(c5fVar, v8bVar22, (byte) 16);
                                    gl2Var2.Q(uri);
                                }
                            }
                        }
                        z = false;
                        z2 = z;
                        if (i69Var2.f() == 2) {
                        }
                        int i222 = d.b;
                        ir6.c(1, "com.google.android.gms.cast.metadata.TITLE");
                        String string22 = ir6Var.b.getString("com.google.android.gms.cast.metadata.TITLE");
                        String str22 = castDevice.d;
                        sy0 sy0Var222 = new sy0(z3, i222, string22, str22, ((zu6) mv6Var.b).c, z, z2);
                        boolean z422 = z3;
                        boolean z522 = z;
                        boolean z622 = z2;
                        sy0Var = c5fVar.k;
                        if (sy0Var != null) {
                        }
                        c5fVar.k = sy0Var222;
                        c5fVar.b();
                        v8b v8bVar222 = new v8b((arrayList != null || arrayList.isEmpty()) ? null : (vsc) arrayList.get(0));
                        uri = (Uri) v8bVar222.b;
                        v8bVar = c5fVar.l;
                        if (v8bVar != null) {
                        }
                        gl2 gl2Var22 = c5fVar.i;
                        gl2Var22.f = new aec(c5fVar, v8bVar222, (byte) 16);
                        gl2Var22.Q(uri);
                    }
                }
                if (i69Var.k()) {
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
                i69 i69Var = this.n;
                if (i69Var != null && i69Var.h()) {
                    fy6 e = i69Var.e();
                    fre.h(e);
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
            i69 i69Var2 = this.n;
            if (i69Var2 != null && i69Var2.h()) {
                fy6 e2 = i69Var2.e();
                fre.h(e2);
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

    public final Uri d(ir6 ir6Var) {
        bd1 bd1Var = this.b.f;
        if (bd1Var != null) {
            bd1Var.b();
        }
        ArrayList arrayList = ir6Var.a;
        vsc vscVar = (arrayList == null || arrayList.isEmpty()) ? null : (vsc) ir6Var.a.get(0);
        if (vscVar == null) {
            return null;
        }
        return vscVar.b;
    }

    public final void e(int i, Bitmap bitmap) {
        MediaMetadata metadata;
        mv6 mv6Var = this.p;
        if (mv6Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        mv6 mv6Var2 = this.p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (mv6Var2 != null && (metadata = ((a) ((wk4) mv6Var2.c).b).a.getMetadata()) != null) {
            ps psVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        pj4 pj4Var = mediaMetadataCompat == null ? new pj4((byte) 15) : new pj4(mediaMetadataCompat);
        pj4Var.W(i == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART", bitmap);
        mv6Var.m0(new MediaMetadataCompat((Bundle) pj4Var.b));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(f fVar, String str, wj7 wj7Var) {
        PlaybackStateCompat.CustomAction customAction;
        PlaybackStateCompat.CustomAction customAction2;
        PlaybackStateCompat.CustomAction customAction3;
        int hashCode = str.hashCode();
        Context context = this.a;
        PlaybackStateCompat.CustomAction customAction4 = null;
        ql7 ql7Var = this.e;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    customAction = this.s;
                    if (customAction == null && ql7Var != null) {
                        long j = ql7Var.c;
                        dc6 dc6Var = xgf.a;
                        int i = ql7Var.S;
                        if (j == 10000) {
                            i = ql7Var.T;
                        } else if (j == 30000) {
                            i = ql7Var.U;
                        }
                        int i2 = ql7Var.E;
                        if (j == 10000) {
                            i2 = ql7Var.F;
                        } else if (j == 30000) {
                            i2 = ql7Var.G;
                        }
                        String string = context.getResources().getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            if (i2 == 0) {
                                w26.j("You must specify an icon resource id to build a CustomAction");
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
                            w26.j("You must specify a name to build a CustomAction");
                            break;
                        }
                    }
                    customAction4 = customAction;
                    if (customAction4 != null) {
                    }
                }
                if (wj7Var != null) {
                    String str2 = wj7Var.c;
                    int i3 = wj7Var.b;
                    if (!TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            if (i3 == 0) {
                                w26.j("You must specify an icon resource id to build a CustomAction");
                                break;
                            } else {
                                customAction4 = new PlaybackStateCompat.CustomAction(str, str2, i3, null);
                            }
                        } else {
                            w26.j("You must specify a name to build a CustomAction");
                            break;
                        }
                    } else {
                        w26.j("You must specify an action to build a CustomAction");
                        break;
                    }
                }
                if (customAction4 != null) {
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    customAction = this.t;
                    if (customAction == null && ql7Var != null) {
                        String string2 = context.getResources().getString(ql7Var.V);
                        int i4 = ql7Var.H;
                        if (!TextUtils.isEmpty(string2)) {
                            if (i4 == 0) {
                                w26.j("You must specify an icon resource id to build a CustomAction");
                                break;
                            } else {
                                customAction3 = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_STOP_CASTING, string2, i4, null);
                                this.t = customAction3;
                                customAction4 = customAction3;
                                if (customAction4 != null) {
                                }
                            }
                        } else {
                            w26.j("You must specify a name to build a CustomAction");
                            break;
                        }
                    }
                    customAction4 = customAction;
                    if (customAction4 != null) {
                    }
                }
                if (wj7Var != null) {
                }
                if (customAction4 != null) {
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    customAction = this.u;
                    if (customAction == null && ql7Var != null) {
                        String string3 = context.getResources().getString(ql7Var.V);
                        int i5 = ql7Var.H;
                        if (!TextUtils.isEmpty(string3)) {
                            if (i5 == 0) {
                                w26.j("You must specify an icon resource id to build a CustomAction");
                                break;
                            } else {
                                customAction3 = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_DISCONNECT, string3, i5, null);
                                this.u = customAction3;
                                customAction4 = customAction3;
                                if (customAction4 != null) {
                                }
                            }
                        } else {
                            w26.j("You must specify a name to build a CustomAction");
                            break;
                        }
                    }
                    customAction4 = customAction;
                    if (customAction4 != null) {
                    }
                }
                if (wj7Var != null) {
                }
                if (customAction4 != null) {
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    customAction = this.r;
                    if (customAction == null && ql7Var != null) {
                        long j2 = ql7Var.c;
                        dc6 dc6Var2 = xgf.a;
                        int i6 = ql7Var.P;
                        if (j2 == 10000) {
                            i6 = ql7Var.Q;
                        } else if (j2 == 30000) {
                            i6 = ql7Var.R;
                        }
                        int i7 = ql7Var.w;
                        if (j2 == 10000) {
                            i7 = ql7Var.x;
                        } else if (j2 == 30000) {
                            i7 = ql7Var.y;
                        }
                        String string4 = context.getResources().getString(i6);
                        if (!TextUtils.isEmpty(string4)) {
                            if (i7 == 0) {
                                w26.j("You must specify an icon resource id to build a CustomAction");
                                break;
                            } else {
                                customAction2 = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_FORWARD, string4, i7, null);
                                this.r = customAction2;
                                customAction4 = customAction2;
                                if (customAction4 != null) {
                                }
                            }
                        } else {
                            w26.j("You must specify a name to build a CustomAction");
                            break;
                        }
                    }
                    customAction4 = customAction;
                    if (customAction4 != null) {
                    }
                }
                if (wj7Var != null) {
                }
                if (customAction4 != null) {
                }
                break;
            default:
                if (wj7Var != null) {
                }
                if (customAction4 != null) {
                }
                break;
        }
    }

    public final void g(boolean z) {
        if (this.b.h) {
            o59 o59Var = this.k;
            bod bodVar = this.l;
            if (bodVar != null) {
                o59Var.removeCallbacks(bodVar);
            }
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    o59Var.postDelayed(bodVar, 1000L);
                }
            }
        }
    }

    public final void h() {
        c5f c5fVar = this.j;
        if (c5fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            gl2 gl2Var = c5fVar.i;
            gl2Var.R();
            gl2Var.f = null;
            NotificationManager notificationManager = c5fVar.b;
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
        mv6 mv6Var;
        ir6 ir6Var;
        MediaMetadataCompat mediaMetadataCompat;
        Bitmap bitmap;
        MediaMetadata metadata;
        PendingIntent activity;
        int i2;
        mv6 mv6Var2 = this.p;
        if (mv6Var2 != null) {
            zu6 zu6Var = (zu6) mv6Var2.b;
            Bundle bundle = new Bundle();
            f fVar = new f();
            i69 i69Var = this.n;
            ql7 ql7Var = this.e;
            if (i69Var == null || this.j == null) {
                b = fVar.b();
            } else {
                fVar.c(i, (i69Var.s() == 0 || i69Var.j()) ? 0L : i69Var.a(), 1.0f);
                if (i == 0) {
                    b = fVar.b();
                } else {
                    etd etdVar = ql7Var != null ? ql7Var.W : null;
                    i69 i69Var2 = this.n;
                    long j = (i69Var2 == null || i69Var2.j() || this.n.n()) ? 0L : 256L;
                    if (etdVar != null) {
                        ArrayList a = xgf.a(etdVar);
                        if (a != null) {
                            int size = a.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj = a.get(i3);
                                i3++;
                                ArrayList arrayList = a;
                                wj7 wj7Var = (wj7) obj;
                                int i4 = size;
                                String str = wj7Var.a;
                                if (TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                    j |= c(str, i, bundle);
                                } else {
                                    f(fVar, str, wj7Var);
                                }
                                size = i4;
                                a = arrayList;
                            }
                        }
                    } else if (ql7Var != null) {
                        ArrayList arrayList2 = ql7Var.a;
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
            mv6Var2.n0(b);
            if (ql7Var != null && ql7Var.X) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            }
            if (ql7Var != null && ql7Var.Y) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
            }
            if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
                zu6Var.a.setExtras(bundle);
            }
            if (i == 0) {
                mv6Var2.m0(new MediaMetadataCompat(new Bundle()));
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
                    zu6Var.a.setSessionActivity(activity);
                }
            }
            i69 i69Var3 = this.n;
            if (i69Var3 == null || (mv6Var = this.p) == null || mediaInfo == null || (ir6Var = mediaInfo.d) == null) {
                return;
            }
            Bundle bundle2 = ir6Var.b;
            long j2 = i69Var3.j() ? 0L : mediaInfo.e;
            ir6.c(1, "com.google.android.gms.cast.metadata.TITLE");
            String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
            ir6.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
            String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
            mv6 mv6Var3 = this.p;
            if (mv6Var3 == null || (metadata = ((a) ((wk4) mv6Var3.c).b).a.getMetadata()) == null) {
                mediaMetadataCompat = null;
            } else {
                ps psVar = MediaMetadataCompat.d;
                Parcel obtain = Parcel.obtain();
                metadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                mediaMetadataCompat.b = metadata;
            }
            pj4 pj4Var = mediaMetadataCompat == null ? new pj4((byte) 15) : new pj4(mediaMetadataCompat);
            pj4Var.X(j2);
            if (string != null) {
                pj4Var.Y("android.media.metadata.TITLE", string);
                pj4Var.Y("android.media.metadata.DISPLAY_TITLE", string);
            }
            if (string2 != null) {
                pj4Var.Y("android.media.metadata.DISPLAY_SUBTITLE", string2);
            }
            mv6Var.m0(new MediaMetadataCompat((Bundle) pj4Var.b));
            Uri d = d(ir6Var);
            if (d != null) {
                this.h.Q(d);
                bitmap = null;
            } else {
                bitmap = null;
                e(0, null);
            }
            Uri d2 = d(ir6Var);
            if (d2 != null) {
                this.i.Q(d2);
            } else {
                e(3, bitmap);
            }
        }
    }
}
