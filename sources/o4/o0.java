package o4;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import b8.xe;
import b8.zb;
import ci.ka;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import mi.d4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o0 extends android.support.v4.media.session.s {
    public static final int z;
    public final ui.f g;
    public final e0 h;
    public final p4.u i;
    public final m0 j;
    public final android.support.v4.media.session.q k;
    public final boolean l;
    public final b m;
    public final p4.q n;
    public final androidx.mediarouter.app.f o;
    public final ComponentName p;
    public final boolean q;
    public volatile long r;
    public m0 s;
    public int t;
    public final Bundle u;
    public g9.i0 v;
    public g9.i0 w;
    public o1 x;
    public d2.a1 y;

    static {
        z = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o0(e0 e0Var, Uri uri, Handler handler, Bundle bundle, boolean z10, g9.i0 i0Var, g9.i0 i0Var2, o1 o1Var, d2.a1 a1Var, Bundle bundle2) {
        super(1);
        boolean z11;
        List<ResolveInfo> queryBroadcastReceivers;
        ComponentName componentName;
        ComponentName k02;
        boolean z12;
        PendingIntent foregroundService;
        String join;
        this.h = e0Var;
        this.q = z10;
        this.v = i0Var;
        this.w = i0Var2;
        this.x = o1Var;
        this.y = a1Var;
        this.u = new Bundle(bundle2);
        Context context = e0Var.f;
        this.i = p4.u.a(context);
        this.j = new m0(this);
        ui.f fVar = new ui.f(e0Var);
        this.g = fVar;
        this.r = 300000L;
        this.k = new android.support.v4.media.session.q(e0Var.l.getLooper(), fVar);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            String str = g2.n0.a;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                String str2 = Build.MANUFACTURER;
                if (str2.equals("Google") || str2.equals("motorola") || str2.equals("vivo") || str2.equals("Sony") || str2.equals("Nothing") || str2.equals("unknown")) {
                    z11 = true;
                    this.l = z11;
                    if (!i0Var2.isEmpty()) {
                        n0();
                    }
                    PackageManager packageManager = context.getPackageManager();
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setPackage(context.getPackageName());
                    queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (queryBroadcastReceivers.size() != 1) {
                        ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                        componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                    } else {
                        if (queryBroadcastReceivers.size() > 1) {
                            g2.a.l("MediaSessionLegacyStub", "Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found " + queryBroadcastReceivers.size() + ". Using runtime media button receiver instead.");
                        }
                        componentName = null;
                    }
                    this.p = componentName;
                    if (componentName != null || i3 < 31) {
                        k02 = k0(context, "androidx.media3.session.MediaLibraryService");
                        k02 = k02 == null ? k0(context, "androidx.media3.session.MediaSessionService") : k02;
                        z12 = k02 == null && !k02.equals(componentName);
                    } else {
                        z12 = false;
                        k02 = componentName;
                    }
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
                    if (k02 != null) {
                        androidx.mediarouter.app.f fVar2 = new androidx.mediarouter.app.f(this, 6);
                        this.o = fVar2;
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
                        String scheme = uri.getScheme();
                        String str3 = g2.n0.a;
                        intentFilter.addDataScheme(scheme);
                        if (i3 < 33) {
                            context.registerReceiver(fVar2, intentFilter);
                        } else {
                            context.registerReceiver(fVar2, intentFilter, 4);
                        }
                        intent2.setPackage(context.getPackageName());
                        foregroundService = PendingIntent.getBroadcast(context, 0, intent2, z);
                        k02 = new ComponentName(context, context.getClass());
                    } else {
                        intent2.setComponent(k02);
                        foregroundService = z12 ? i3 >= 26 ? PendingIntent.getForegroundService(context, 0, intent2, z) : PendingIntent.getService(context, 0, intent2, z) : PendingIntent.getBroadcast(context, 0, intent2, z);
                        this.o = null;
                    }
                    join = TextUtils.join(".", new String[]{"androidx.media3.session.id", e0Var.i});
                    k02 = i3 >= 31 ? null : k02;
                    foregroundService = i3 >= 31 ? null : foregroundService;
                    p4.q qVar = new p4.q();
                    if (!TextUtils.isEmpty(join)) {
                        throw new IllegalArgumentException("tag must not be null or empty");
                    }
                    if (k02 == null) {
                        int i10 = r4.t0.b;
                        Intent intent3 = new Intent("android.intent.action.MEDIA_BUTTON");
                        intent3.setPackage(context.getPackageName());
                        List<ResolveInfo> queryBroadcastReceivers2 = context.getPackageManager().queryBroadcastReceivers(intent3, 0);
                        if (queryBroadcastReceivers2.size() == 1) {
                            ActivityInfo activityInfo2 = queryBroadcastReceivers2.get(0).activityInfo;
                            k02 = new ComponentName(activityInfo2.packageName, activityInfo2.name);
                        } else {
                            if (queryBroadcastReceivers2.size() > 1) {
                                g2.a.l("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                            }
                            k02 = null;
                        }
                        if (k02 == null) {
                            g2.a.g("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                        }
                    }
                    if (k02 != null && foregroundService == null) {
                        Intent intent4 = new Intent("android.intent.action.MEDIA_BUTTON");
                        intent4.setComponent(k02);
                        foregroundService = PendingIntent.getBroadcast(context, 0, intent4, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
                    }
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 29) {
                        qVar.a = new p4.n(context, join, bundle);
                    } else if (i11 >= 28) {
                        qVar.a = new p4.m(context, join, bundle);
                    } else {
                        qVar.a = new p4.l(context, join, bundle);
                    }
                    Looper myLooper = Looper.myLooper();
                    qVar.D(new p4.j(1), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
                    ((p4.l) qVar.a).a.setMediaButtonReceiver(foregroundService);
                    p4.p pVar = ((p4.l) qVar.a).c;
                    p4.u uVar = new p4.u();
                    DesugarCollections.synchronizedSet(new HashSet());
                    if (Build.VERSION.SDK_INT >= 29) {
                        uVar.a = new p4.g(context, pVar);
                    } else {
                        uVar.a = new p4.f(context, pVar);
                    }
                    qVar.b = uVar;
                    this.n = qVar;
                    if (i3 >= 31 && componentName != null) {
                        cg.n0.j(qVar, componentName);
                    }
                    qVar.D(this, handler);
                    this.m = z11 ? new b(context, new f0(this, 0)) : null;
                    return;
                }
            }
        }
        z11 = false;
        this.l = z11;
        if (!i0Var2.isEmpty()) {
        }
        PackageManager packageManager2 = context.getPackageManager();
        Intent intent5 = new Intent("android.intent.action.MEDIA_BUTTON");
        intent5.setPackage(context.getPackageName());
        queryBroadcastReceivers = packageManager2.queryBroadcastReceivers(intent5, 0);
        if (queryBroadcastReceivers.size() != 1) {
        }
        this.p = componentName;
        if (componentName != null) {
        }
        k02 = k0(context, "androidx.media3.session.MediaLibraryService");
        if (k02 == null) {
        }
        if (k02 == null) {
        }
        Intent intent22 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
        if (k02 != null) {
        }
        join = TextUtils.join(".", new String[]{"androidx.media3.session.id", e0Var.i});
        if (i3 >= 31) {
        }
        if (i3 >= 31) {
        }
        p4.q qVar2 = new p4.q();
        if (!TextUtils.isEmpty(join)) {
        }
    }

    public static void e0(p4.q qVar, ArrayList arrayList) {
        int i3 = 0;
        if (arrayList != null) {
            qVar.getClass();
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                long j10 = ((p4.o) obj).b;
                if (hashSet.contains(Long.valueOf(j10))) {
                    g2.a.d("MediaSessionCompat", a1.g.p(j10, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j10));
            }
        }
        p4.l lVar = (p4.l) qVar.a;
        MediaSession mediaSession = lVar.a;
        lVar.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            p4.o oVar = (p4.o) obj2;
            MediaSession.QueueItem queueItem = oVar.c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(oVar.a.a(), oVar.b);
                oVar.c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static void f0(p4.q qVar, p4.i iVar) {
        p4.l lVar = (p4.l) qVar.a;
        lVar.i = iVar;
        MediaSession mediaSession = lVar.a;
        Bundle bundle = iVar.a;
        if (iVar.b == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) p4.i.c.get(str);
                if (num == null) {
                    num = -1;
                }
                int intValue = num.intValue();
                if (intValue == 0) {
                    builder.putLong(str, bundle.getLong(str));
                } else if (intValue == 1) {
                    builder.putText(str, bundle.getCharSequence(str));
                } else if (intValue == 2) {
                    builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                } else if (intValue != 3) {
                    Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    }
                } else {
                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                }
            }
            iVar.b = builder.build();
        }
        mediaSession.setMetadata(iVar.b);
    }

    public static d2.n0 g0(String str, Uri uri, String str2, Bundle bundle) {
        d2.b0 b0Var = new d2.b0();
        g9.g0 g0Var = g9.i0.b;
        g9.s1 s1Var = g9.s1.e;
        List list = Collections.EMPTY_LIST;
        g9.s1 s1Var2 = g9.s1.e;
        d2.g0 g0Var2 = new d2.g0();
        d2.j0 j0Var = d2.j0.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(13, false);
        a0Var.b = uri;
        a0Var.c = str2;
        a0Var.d = bundle;
        return new d2.n0(str3, new d2.d0(b0Var), null, new d2.h0(g0Var2), d2.q0.L, new d2.j0(a0Var));
    }

    public static ComponentName k0(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    @Override // android.support.v4.media.session.s
    public final void A(String str, Bundle bundle) {
        l0(g0(null, null, str, bundle), true, false);
    }

    @Override // android.support.v4.media.session.s
    public final void D(Uri uri, Bundle bundle) {
        l0(g0(null, uri, null, bundle), true, false);
    }

    @Override // android.support.v4.media.session.s
    public final void E(p4.h hVar) {
        if (hVar == null) {
            return;
        }
        i0(20, new d4(3, this, hVar), ((p4.l) this.n.a).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void F() {
        i0(11, new h0(this, 5), ((p4.l) this.n.a).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void G(long j10) {
        i0(5, new g0(this, j10, 1), ((p4.l) this.n.a).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void J(final float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        i0(13, new n0() { // from class: o4.k0
            @Override // o4.n0
            public final void c(v vVar) {
                o0.this.h.t.b(f10);
            }
        }, ((p4.l) this.n.a).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void K(p4.x xVar) {
        L(xVar);
    }

    @Override // android.support.v4.media.session.s
    public final void L(p4.x xVar) {
        d2.f1 c2 = n.c(xVar);
        if (c2 != null) {
            j0(null, 40010, new h0(this, c2), ((p4.l) this.n.a).c());
            return;
        }
        g2.a.l("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + xVar);
    }

    @Override // android.support.v4.media.session.s
    public final void M(int i3) {
        i0(15, new j0(this, i3, 0), ((p4.l) this.n.a).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void P(int i3) {
        i0(14, new j0(this, i3, 1), ((p4.l) this.n.a).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void S() {
        boolean m0 = this.h.t.m0(9);
        p4.q qVar = this.n;
        if (m0) {
            i0(9, new h0(this, 10), ((p4.l) qVar.a).c(), true);
        } else {
            i0(8, new h0(this, 11), ((p4.l) qVar.a).c(), true);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void V() {
        boolean m0 = this.h.t.m0(7);
        p4.q qVar = this.n;
        if (m0) {
            i0(7, new h0(this, 2), ((p4.l) qVar.a).c(), true);
        } else {
            i0(6, new h0(this, 3), ((p4.l) qVar.a).c(), true);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void Y(long j10) {
        if (j10 < 0) {
            return;
        }
        i0(10, new g0(this, j10, 0), ((p4.l) this.n.a).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void b0() {
        i0(3, new h0(this, 8), ((p4.l) this.n.a).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void c(p4.h hVar) {
        if (hVar != null) {
            i0(20, new k2.y(this, hVar, -1, 3), ((p4.l) this.n.a).c(), false);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void d(p4.h hVar, int i3) {
        if (hVar != null) {
            if (i3 == -1 || i3 >= 0) {
                i0(20, new k2.y(this, hVar, i3, 3), ((p4.l) this.n.a).c(), false);
            }
        }
    }

    @Override // android.support.v4.media.session.s
    public final void e(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (!str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") || resultReceiver == null) {
            n1 n1Var = new n1(str, Bundle.EMPTY);
            j0(n1Var, 0, new aa.a(this, n1Var, bundle, resultReceiver), ((p4.l) this.n.a).c());
            return;
        }
        s1 s1Var = this.h.j;
        s1Var.getClass();
        String str2 = s1.b;
        Bundle bundle2 = new Bundle();
        t1 t1Var = s1Var.a;
        if (t1Var != null) {
            bundle2.putInt(str2, 0);
        } else {
            bundle2.putInt(str2, 1);
        }
        String str3 = s1.c;
        t1Var.getClass();
        Bundle bundle3 = new Bundle();
        bundle3.putInt(t1.i, t1Var.a);
        bundle3.putInt(t1.j, 0);
        bundle3.putInt(t1.k, t1Var.b);
        bundle3.putString(t1.l, t1Var.d);
        bundle3.putString(t1.m, t1Var.e);
        bundle3.putBinder(t1.o, t1Var.f);
        bundle3.putParcelable(t1.n, null);
        bundle3.putBundle(t1.p, t1Var.g);
        bundle3.putInt(t1.q, t1Var.c);
        MediaSession.Token token = t1Var.h;
        if (token != null) {
            bundle3.putParcelable(t1.r, token);
        }
        bundle2.putBundle(str3, bundle3);
        resultReceiver.send(0, bundle2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    @Override // android.support.v4.media.session.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(String str, Bundle bundle) {
        boolean booleanValue;
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        n1 n1Var = new n1(str, bundle);
        boolean j10 = d.j(str);
        p4.q qVar = this.n;
        if (!j10) {
            j0(n1Var, 0, new h0(this, n1Var, bundle), ((p4.l) qVar.a).c());
            return;
        }
        try {
            d d = d.d(n1Var);
            int i3 = d.b;
            Object obj = d.g;
            if (!d.b()) {
                g2.a.l("MediaSessionLegacyStub", "Can't execute predefined custom command: ".concat(str));
                return;
            }
            n1 n1Var2 = d.a;
            if (n1Var2 != null) {
                zb.p(n1Var2.a == 40010);
                obj.getClass();
                j0(null, 40010, new h0(this, (d2.f1) obj), ((p4.l) qVar.a).c());
                return;
            }
            l1 l1Var = this.h.t;
            if (i3 == 1) {
                if (obj != null) {
                    booleanValue = ((Boolean) obj).booleanValue();
                } else if (!l1Var.u()) {
                    booleanValue = true;
                }
                if (!booleanValue) {
                    i0(1, new h0(this, 6), ((p4.l) qVar.a).c(), false);
                    return;
                } else if (i3 != 31) {
                    i0(i3, new d4(2, this, d), ((p4.l) qVar.a).c(), true);
                    return;
                } else {
                    obj.getClass();
                    l0((d2.n0) obj, false, false);
                    return;
                }
            }
            booleanValue = false;
            if (!booleanValue) {
            }
        } catch (RuntimeException e10) {
            g2.a.m("MediaSessionLegacyStub", "Failed to convert predefined custom command: " + n1Var.b, e10);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void h() {
        i0(12, new h0(this, 4), ((p4.l) this.n.a).c(), true);
    }

    public final p4.w h0(l1 l1Var) {
        int i3;
        int i10;
        long j10;
        String str;
        int i11;
        int i12;
        int i13;
        long j11;
        d2.x0 U = l1Var.U();
        boolean z10 = l1Var.m0(16) && !l1Var.P0();
        boolean z11 = U != null || g2.n0.c0(l1Var, this.q);
        if (U != null) {
            i10 = 7;
        } else {
            int i14 = n.a;
            if (l1Var.U() != null) {
                i3 = 7;
            } else {
                int h = l1Var.h();
                if (h == 1) {
                    i3 = 0;
                } else if (h == 2) {
                    if (!z11) {
                        i3 = 6;
                    }
                    i3 = 2;
                } else if (h == 3) {
                    if (!z11) {
                        i3 = 3;
                    }
                    i3 = 2;
                } else {
                    if (h != 4) {
                        throw new IllegalArgumentException(k2.p1.i(h, "Unrecognized State: "));
                    }
                    i3 = 1;
                }
            }
            i10 = i3;
        }
        d2.a1 a10 = xe.a(this.y, l1Var.t());
        long j12 = 128;
        for (int i15 = 0; i15 < a10.a.a.size(); i15++) {
            int a11 = a10.a.a(i15);
            if (a11 == 1) {
                j11 = z11 ? 516L : 514L;
            } else if (a11 == 2) {
                j11 = 16384;
            } else if (a11 == 3) {
                j11 = 1;
            } else if (a11 != 31) {
                switch (a11) {
                    case 5:
                        j11 = 256;
                        break;
                    case 6:
                    case 7:
                        j11 = 16;
                        break;
                    case 8:
                    case 9:
                        j11 = 32;
                        break;
                    case 10:
                        j11 = 4096;
                        break;
                    case 11:
                        j11 = 8;
                        break;
                    case 12:
                        j11 = 64;
                        break;
                    case 13:
                        j11 = 4194304;
                        break;
                    case 14:
                        j11 = 2621440;
                        break;
                    case 15:
                        j11 = 262144;
                        break;
                    default:
                        j11 = 0;
                        break;
                }
            } else {
                j11 = 240640;
            }
            j12 |= j11;
        }
        if (!this.w.isEmpty() && d.c(2, this.v)) {
            j12 &= -17;
        }
        if (!this.w.isEmpty() && d.c(3, this.v)) {
            j12 &= -33;
        }
        if (!z10) {
            j12 &= -257;
        }
        long j13 = j12;
        if (l1Var.m0(17)) {
            int l02 = l1Var.l0();
            int i16 = n.a;
            j10 = l02 == -1 ? -1L : l02;
        } else {
            j10 = -1;
        }
        float f10 = l1Var.g().a;
        float f11 = (l1Var.i0() && z10) ? f10 : 0.0f;
        Bundle bundle = U != null ? new Bundle(U.c) : new Bundle();
        bundle.putAll(this.u);
        bundle.putFloat("EXO_SPEED", f10);
        d2.n0 S0 = l1Var.S0();
        if (S0 != null) {
            String str2 = S0.a;
            if (!"".equals(str2)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        long N0 = z10 ? l1Var.N0() : -1L;
        long b02 = z10 ? l1Var.b0() : -1L;
        ArrayList arrayList = new ArrayList();
        long j14 = b02;
        long j15 = N0;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i17 = 0; i17 < this.v.size(); i17++) {
            d dVar = (d) this.v.get(i17);
            n1 n1Var = dVar.a;
            Bundle bundle2 = dVar.d;
            if (n1Var != null) {
                Bundle bundle3 = n1Var.c;
                String str3 = n1Var.b;
                if (dVar.f && n1Var.a == 0) {
                    o1 o1Var = this.x;
                    if ((n1Var != null && o1Var.a.contains(n1Var)) || (((i13 = dVar.b) != -1 && a10.a(i13)) || d.j(str3))) {
                        if (!bundle2.isEmpty()) {
                            bundle3 = new Bundle(bundle3);
                        }
                        if (!bundle2.isEmpty()) {
                            bundle3.putAll(bundle2);
                        }
                        int i18 = dVar.c;
                        if (TextUtils.isEmpty(str3)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty("")) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i18 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        arrayList.add(new p4.v(str3, i18, bundle3));
                    }
                }
            }
        }
        if (U != null) {
            int i19 = n.a;
            int i20 = U.a;
            if (i20 == -110) {
                i12 = 8;
            } else if (i20 == -109) {
                i12 = 11;
            } else if (i20 == -6) {
                i12 = 2;
            } else if (i20 == -2) {
                i12 = 1;
            } else if (i20 != 1) {
                switch (i20) {
                    case -107:
                        i12 = 9;
                        break;
                    case -106:
                        i12 = 7;
                        break;
                    case -105:
                        i12 = 6;
                        break;
                    case -104:
                        i12 = 5;
                        break;
                    case -103:
                        i12 = 4;
                        break;
                    case -102:
                        i12 = 3;
                        break;
                    default:
                        i12 = 0;
                        break;
                }
            } else {
                i12 = 10;
            }
            str = U.getMessage();
            i11 = i12;
        } else {
            str = null;
            i11 = 0;
        }
        return new p4.w(i10, j15, j14, f11, j13, i11, str, elapsedRealtime, arrayList, j10, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    @Override // android.support.v4.media.session.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Intent intent) {
        boolean z10;
        p4.r c2 = ((p4.l) this.n.a).c();
        c2.getClass();
        v vVar = new v(c2, 0, 0, false, null, Bundle.EMPTY);
        e0 e0Var = this.h;
        o0 o0Var = e0Var.h;
        Context context = e0Var.f;
        a0 a0Var = e0Var.d;
        Bundle extras = intent.getExtras();
        lg.y yVar = null;
        KeyEvent keyEvent = (extras == null || !extras.containsKey("android.intent.extra.KEY_EVENT")) ? null : (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
        ComponentName component = intent.getComponent();
        if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && ((component == null || Objects.equals(component.getPackageName(), context.getPackageName())) && keyEvent != null)) {
            e0Var.v();
            e0Var.e.getClass();
            if (keyEvent.getAction() != 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 272 && keyCode != 273) {
                    switch (keyCode) {
                    }
                    return true;
                }
                return true;
            }
            int keyCode2 = keyEvent.getKeyCode();
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.software.leanback");
            if (keyCode2 != 79 && keyCode2 != 85) {
                lg.y yVar2 = a0Var.a;
                if (yVar2 != null) {
                    a0Var.removeCallbacks(yVar2);
                    lg.y yVar3 = a0Var.a;
                    a0Var.a = null;
                    yVar = yVar3;
                }
                if (yVar != null) {
                    g2.n0.W(a0Var, yVar);
                }
            } else if (hasSystemFeature || keyEvent.getRepeatCount() != 0) {
                lg.y yVar4 = a0Var.a;
                if (yVar4 != null) {
                    a0Var.removeCallbacks(yVar4);
                    lg.y yVar5 = a0Var.a;
                    a0Var.a = null;
                    yVar = yVar5;
                }
                if (yVar != null) {
                    g2.n0.W(a0Var, yVar);
                }
            } else {
                lg.y yVar6 = a0Var.a;
                if (yVar6 == null) {
                    lg.y yVar7 = new lg.y(a0Var, vVar, keyEvent, 13);
                    a0Var.a = yVar7;
                    a0Var.postDelayed(yVar7, ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                if (yVar6 != null) {
                    a0Var.removeCallbacks(yVar6);
                    a0Var.a = null;
                }
                z10 = true;
                if (!e0Var.x) {
                    boolean booleanExtra = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                    if (keyEvent.getRepeatCount() > 0 || e0Var.b(keyEvent, z10, booleanExtra)) {
                        return true;
                    }
                } else if ((keyCode2 == 85 || keyCode2 == 79) && z10) {
                    o0Var.S();
                    return true;
                }
            }
            z10 = false;
            if (!e0Var.x) {
            }
        }
        return false;
    }

    public final void i0(int i3, n0 n0Var, p4.r rVar, boolean z10) {
        e0 e0Var = this.h;
        if (e0Var.j()) {
            return;
        }
        if (rVar != null) {
            g2.n0.W(e0Var.l, new ka(this, i3, rVar, n0Var, z10));
            return;
        }
        g2.a.b("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i3);
    }

    public final void j0(n1 n1Var, int i3, n0 n0Var, p4.r rVar) {
        if (rVar != null) {
            g2.n0.W(this.h.l, new ai.p1(this, n1Var, i3, rVar, n0Var, 8));
            return;
        }
        StringBuilder sb2 = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        Object obj = n1Var;
        if (n1Var == null) {
            obj = Integer.valueOf(i3);
        }
        sb2.append(obj);
        g2.a.b("MediaSessionLegacyStub", sb2.toString());
    }

    @Override // android.support.v4.media.session.s
    public final void k() {
        i0(1, new h0(this, 12), ((p4.l) this.n.a).c(), true);
    }

    public final void l0(d2.n0 n0Var, boolean z10, boolean z11) {
        i0(31, new z(this, n0Var, z10, z11), ((p4.l) this.n.a).c(), false);
    }

    public final v m0(p4.r rVar) {
        v o10 = this.g.o(rVar);
        if (o10 == null) {
            v vVar = new v(rVar, 0, 0, this.i.b(rVar), new l0(rVar), Bundle.EMPTY);
            t m10 = this.h.m(vVar);
            this.g.a(rVar, vVar, m10.a, m10.b);
            e0 e0Var = this.h;
            if (!e0Var.x || !e0.k(vVar)) {
                e0Var.e.getClass();
            }
            o10 = vVar;
        }
        android.support.v4.media.session.q qVar = this.k;
        long j10 = this.r;
        qVar.removeMessages(1001, o10);
        qVar.sendMessageDelayed(qVar.obtainMessage(1001, o10), j10);
        return o10;
    }

    @Override // android.support.v4.media.session.s
    public final void n() {
        i0(1, new h0(this, 6), ((p4.l) this.n.a).c(), false);
    }

    public final void n0() {
        b bVar;
        int i3;
        g9.i0 i0Var = this.w;
        o1 o1Var = this.x;
        d2.a1 a1Var = this.y;
        String str = d.h;
        g9.f0 f0Var = new g9.f0(4);
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            d dVar = (d) i0Var.get(i10);
            n1 n1Var = dVar.a;
            if ((n1Var == null || !o1Var.a.contains(n1Var)) && ((i3 = dVar.b) == -1 || !a1Var.a(i3))) {
                if (dVar.f) {
                    dVar = new d(dVar.a, dVar.b, dVar.c, new Bundle(dVar.d), false, dVar.e, dVar.g);
                }
                f0Var.c(dVar);
            } else {
                f0Var.c(dVar);
            }
        }
        this.v = d.g(f0Var.f());
        boolean z10 = this.l;
        Bundle bundle = this.u;
        if (z10 && ((bVar = this.m) == null || !bVar.e.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.v.isEmpty() || d.c(2, this.v)) ? false : true);
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        } else {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !d.c(2, this.v));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !d.c(3, this.v));
        }
    }

    public final void o0() {
        Bundle bundle = this.u;
        boolean z10 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z11 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        n0();
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z10 && bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z11) {
            return;
        }
        ((p4.l) this.n.a).a.setExtras(bundle);
    }

    public final void p0(l1 l1Var) {
        g2.n0.W(this.h.l, new i0(this, l1Var, 1));
    }

    @Override // android.support.v4.media.session.s
    public final void q(String str, Bundle bundle) {
        l0(g0(str, null, null, bundle), true, true);
    }

    @Override // android.support.v4.media.session.s
    public final void u(String str, Bundle bundle) {
        l0(g0(null, null, str, bundle), true, true);
    }

    @Override // android.support.v4.media.session.s
    public final void v(Uri uri, Bundle bundle) {
        l0(g0(null, uri, null, bundle), true, true);
    }

    @Override // android.support.v4.media.session.s
    public final void w() {
        i0(2, new h0(this, 7), ((p4.l) this.n.a).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void x(String str, Bundle bundle) {
        l0(g0(str, null, null, bundle), true, false);
    }
}
