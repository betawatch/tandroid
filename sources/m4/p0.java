package m4;

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
import e9.x1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p0 extends android.support.v4.media.session.s {
    public static final int z;
    public final xa.n g;
    public final f0 h;
    public final n4.u i;
    public final n0 j;
    public final android.support.v4.media.session.q k;
    public final boolean l;
    public final b m;
    public final n4.q n;
    public final androidx.mediarouter.app.f o;
    public final ComponentName p;
    public final boolean q;
    public volatile long r;
    public n0 s;
    public int t;
    public final Bundle u;
    public e9.n0 v;
    public e9.n0 w;
    public q1 x;
    public b2.b1 y;

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
    public p0(f0 f0Var, Uri uri, Handler handler, Bundle bundle, boolean z10, e9.n0 n0Var, e9.n0 n0Var2, q1 q1Var, b2.b1 b1Var, Bundle bundle2) {
        super(1);
        boolean z11;
        List<ResolveInfo> queryBroadcastReceivers;
        ComponentName componentName;
        ComponentName k02;
        boolean z12;
        PendingIntent foregroundService;
        String join;
        this.h = f0Var;
        this.q = z10;
        this.v = n0Var;
        this.w = n0Var2;
        this.x = q1Var;
        this.y = b1Var;
        this.u = new Bundle(bundle2);
        Context context = f0Var.f;
        this.i = n4.u.a(context);
        this.j = new n0(this);
        xa.n nVar = new xa.n(f0Var);
        this.g = nVar;
        this.r = 300000L;
        this.k = new android.support.v4.media.session.q(f0Var.l.getLooper(), nVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            String str = e2.l0.a;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                String str2 = Build.MANUFACTURER;
                if (str2.equals("Google") || str2.equals("motorola") || str2.equals("vivo") || str2.equals("Sony") || str2.equals("Nothing") || str2.equals("unknown")) {
                    z11 = true;
                    this.l = z11;
                    if (!n0Var2.isEmpty()) {
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
                            e2.a.l("MediaSessionLegacyStub", "Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found " + queryBroadcastReceivers.size() + ". Using runtime media button receiver instead.");
                        }
                        componentName = null;
                    }
                    this.p = componentName;
                    if (componentName != null || i10 < 31) {
                        k02 = k0(context, "androidx.media3.session.MediaLibraryService");
                        k02 = k02 == null ? k0(context, "androidx.media3.session.MediaSessionService") : k02;
                        z12 = k02 == null && !k02.equals(componentName);
                    } else {
                        z12 = false;
                        k02 = componentName;
                    }
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
                    if (k02 != null) {
                        androidx.mediarouter.app.f fVar = new androidx.mediarouter.app.f(this, 7);
                        this.o = fVar;
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
                        String scheme = uri.getScheme();
                        String str3 = e2.l0.a;
                        intentFilter.addDataScheme(scheme);
                        if (i10 < 33) {
                            context.registerReceiver(fVar, intentFilter);
                        } else {
                            context.registerReceiver(fVar, intentFilter, 4);
                        }
                        intent2.setPackage(context.getPackageName());
                        foregroundService = PendingIntent.getBroadcast(context, 0, intent2, z);
                        k02 = new ComponentName(context, context.getClass());
                    } else {
                        intent2.setComponent(k02);
                        foregroundService = z12 ? i10 >= 26 ? PendingIntent.getForegroundService(context, 0, intent2, z) : PendingIntent.getService(context, 0, intent2, z) : PendingIntent.getBroadcast(context, 0, intent2, z);
                        this.o = null;
                    }
                    join = TextUtils.join(".", new String[]{"androidx.media3.session.id", f0Var.i});
                    k02 = i10 >= 31 ? null : k02;
                    foregroundService = i10 >= 31 ? null : foregroundService;
                    n4.q qVar = new n4.q();
                    if (!TextUtils.isEmpty(join)) {
                        throw new IllegalArgumentException("tag must not be null or empty");
                    }
                    if (k02 == null) {
                        int i11 = p4.u0.b;
                        Intent intent3 = new Intent("android.intent.action.MEDIA_BUTTON");
                        intent3.setPackage(context.getPackageName());
                        List<ResolveInfo> queryBroadcastReceivers2 = context.getPackageManager().queryBroadcastReceivers(intent3, 0);
                        if (queryBroadcastReceivers2.size() == 1) {
                            ActivityInfo activityInfo2 = queryBroadcastReceivers2.get(0).activityInfo;
                            k02 = new ComponentName(activityInfo2.packageName, activityInfo2.name);
                        } else {
                            if (queryBroadcastReceivers2.size() > 1) {
                                e2.a.l("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                            }
                            k02 = null;
                        }
                        if (k02 == null) {
                            e2.a.g("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                        }
                    }
                    if (k02 != null && foregroundService == null) {
                        Intent intent4 = new Intent("android.intent.action.MEDIA_BUTTON");
                        intent4.setComponent(k02);
                        foregroundService = PendingIntent.getBroadcast(context, 0, intent4, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
                    }
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 29) {
                        qVar.a = new n4.n(context, join, bundle);
                    } else if (i12 >= 28) {
                        qVar.a = new n4.m(context, join, bundle);
                    } else {
                        qVar.a = new n4.l(context, join, bundle);
                    }
                    Looper myLooper = Looper.myLooper();
                    qVar.F(new n4.j(1), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
                    ((n4.l) qVar.a).a.setMediaButtonReceiver(foregroundService);
                    n4.p pVar = ((n4.l) qVar.a).c;
                    n4.u uVar = new n4.u();
                    DesugarCollections.synchronizedSet(new HashSet());
                    if (Build.VERSION.SDK_INT >= 29) {
                        uVar.a = new n4.g(context, pVar);
                    } else {
                        uVar.a = new n4.f(context, pVar);
                    }
                    qVar.b = uVar;
                    this.n = qVar;
                    if (i10 >= 31 && componentName != null) {
                        e0.f0.j(qVar, componentName);
                    }
                    qVar.F(this, handler);
                    this.m = z11 ? new b(context, new g0(this, 0)) : null;
                    return;
                }
            }
        }
        z11 = false;
        this.l = z11;
        if (!n0Var2.isEmpty()) {
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
        join = TextUtils.join(".", new String[]{"androidx.media3.session.id", f0Var.i});
        if (i10 >= 31) {
        }
        if (i10 >= 31) {
        }
        n4.q qVar2 = new n4.q();
        if (!TextUtils.isEmpty(join)) {
        }
    }

    public static void e0(n4.q qVar, ArrayList arrayList) {
        int i10 = 0;
        if (arrayList != null) {
            qVar.getClass();
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                long j10 = ((n4.o) obj).b;
                if (hashSet.contains(Long.valueOf(j10))) {
                    e2.a.d("MediaSessionCompat", a1.g.l(j10, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j10));
            }
        }
        n4.l lVar = (n4.l) qVar.a;
        MediaSession mediaSession = lVar.a;
        lVar.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            n4.o oVar = (n4.o) obj2;
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

    public static void f0(n4.q qVar, n4.i iVar) {
        n4.l lVar = (n4.l) qVar.a;
        lVar.i = iVar;
        MediaSession mediaSession = lVar.a;
        Bundle bundle = iVar.a;
        if (iVar.b == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) n4.i.c.get(str);
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

    public static b2.p0 g0(String str, Uri uri, String str2, Bundle bundle) {
        b2.d0 d0Var = new b2.d0();
        e9.l0 l0Var = e9.n0.b;
        x1 x1Var = x1.e;
        List list = Collections.EMPTY_LIST;
        x1 x1Var2 = x1.e;
        b2.i0 i0Var = new b2.i0();
        b2.l0 l0Var2 = b2.l0.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(4);
        a0Var.b = uri;
        a0Var.c = str2;
        a0Var.d = bundle;
        return new b2.p0(str3, new b2.f0(d0Var), null, new b2.j0(i0Var), b2.s0.L, new b2.l0(a0Var));
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
    public final void E(n4.h hVar) {
        if (hVar == null) {
            return;
        }
        i0(20, new ag.m(19, this, hVar), ((n4.l) this.n.a).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void F() {
        i0(11, new i0(this, 5), ((n4.l) this.n.a).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void G(long j10) {
        i0(5, new h0(this, j10, 1), ((n4.l) this.n.a).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void J(float f7) {
        if (f7 <= 0.0f) {
            return;
        }
        i0(13, new l0(this, f7), ((n4.l) this.n.a).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void K(n4.x xVar) {
        L(xVar);
    }

    @Override // android.support.v4.media.session.s
    public final void L(n4.x xVar) {
        b2.g1 c10 = o.c(xVar);
        if (c10 != null) {
            j0(null, 40010, new i0(this, c10), ((n4.l) this.n.a).c());
            return;
        }
        e2.a.l("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + xVar);
    }

    @Override // android.support.v4.media.session.s
    public final void M(int i10) {
        i0(15, new k0(this, i10, 0), ((n4.l) this.n.a).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void P(int i10) {
        i0(14, new k0(this, i10, 1), ((n4.l) this.n.a).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void S() {
        boolean n02 = this.h.t.n0(9);
        n4.q qVar = this.n;
        if (n02) {
            i0(9, new i0(this, 10), ((n4.l) qVar.a).c(), true);
        } else {
            i0(8, new i0(this, 11), ((n4.l) qVar.a).c(), true);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void V() {
        boolean n02 = this.h.t.n0(7);
        n4.q qVar = this.n;
        if (n02) {
            i0(7, new i0(this, 2), ((n4.l) qVar.a).c(), true);
        } else {
            i0(6, new i0(this, 3), ((n4.l) qVar.a).c(), true);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void Y(long j10) {
        if (j10 < 0) {
            return;
        }
        i0(10, new h0(this, j10, 0), ((n4.l) this.n.a).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void b0() {
        i0(3, new i0(this, 8), ((n4.l) this.n.a).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void c(n4.h hVar) {
        if (hVar != null) {
            i0(20, new ag.b0(this, hVar, -1, 2), ((n4.l) this.n.a).c(), false);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void d(n4.h hVar, int i10) {
        if (hVar != null) {
            if (i10 == -1 || i10 >= 0) {
                i0(20, new ag.b0(this, hVar, i10, 2), ((n4.l) this.n.a).c(), false);
            }
        }
    }

    @Override // android.support.v4.media.session.s
    public final void e(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (!str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") || resultReceiver == null) {
            p1 p1Var = new p1(str, Bundle.EMPTY);
            j0(p1Var, 0, new androidx.car.app.utils.a(this, p1Var, bundle, resultReceiver), ((n4.l) this.n.a).c());
            return;
        }
        u1 u1Var = this.h.j;
        u1Var.getClass();
        String str2 = u1.b;
        Bundle bundle2 = new Bundle();
        v1 v1Var = u1Var.a;
        if (v1Var != null) {
            bundle2.putInt(str2, 0);
        } else {
            bundle2.putInt(str2, 1);
        }
        String str3 = u1.c;
        v1Var.getClass();
        Bundle bundle3 = new Bundle();
        bundle3.putInt(v1.i, v1Var.a);
        bundle3.putInt(v1.j, 0);
        bundle3.putInt(v1.k, v1Var.b);
        bundle3.putString(v1.l, v1Var.d);
        bundle3.putString(v1.m, v1Var.e);
        bundle3.putBinder(v1.o, v1Var.f);
        bundle3.putParcelable(v1.n, null);
        bundle3.putBundle(v1.p, v1Var.g);
        bundle3.putInt(v1.q, v1Var.c);
        MediaSession.Token token = v1Var.h;
        if (token != null) {
            bundle3.putParcelable(v1.r, token);
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
        p1 p1Var = new p1(str, bundle);
        boolean j10 = e.j(str);
        n4.q qVar = this.n;
        if (!j10) {
            j0(p1Var, 0, new i0(this, p1Var, bundle), ((n4.l) qVar.a).c());
            return;
        }
        try {
            e d = e.d(p1Var);
            int i10 = d.b;
            Object obj = d.g;
            if (!d.b()) {
                e2.a.l("MediaSessionLegacyStub", "Can't execute predefined custom command: ".concat(str));
                return;
            }
            p1 p1Var2 = d.a;
            if (p1Var2 != null) {
                t6.p(p1Var2.a == 40010);
                obj.getClass();
                j0(null, 40010, new i0(this, (b2.g1) obj), ((n4.l) qVar.a).c());
                return;
            }
            n1 n1Var = this.h.t;
            if (i10 == 1) {
                if (obj != null) {
                    booleanValue = ((Boolean) obj).booleanValue();
                } else if (!n1Var.t()) {
                    booleanValue = true;
                }
                if (!booleanValue) {
                    i0(1, new i0(this, 6), ((n4.l) qVar.a).c(), false);
                    return;
                } else if (i10 != 31) {
                    i0(i10, new ag.m(18, this, d), ((n4.l) qVar.a).c(), true);
                    return;
                } else {
                    obj.getClass();
                    l0((b2.p0) obj, false, false);
                    return;
                }
            }
            booleanValue = false;
            if (!booleanValue) {
            }
        } catch (RuntimeException e) {
            e2.a.m("MediaSessionLegacyStub", "Failed to convert predefined custom command: " + p1Var.b, e);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void h() {
        i0(12, new i0(this, 4), ((n4.l) this.n.a).c(), true);
    }

    public final n4.w h0(n1 n1Var) {
        int i10;
        int i11;
        long j10;
        String str;
        int i12;
        int i13;
        int i14;
        long j11;
        b2.y0 V = n1Var.V();
        boolean z10 = n1Var.n0(16) && !n1Var.P0();
        boolean z11 = V != null || e2.l0.c0(n1Var, this.q);
        if (V != null) {
            i11 = 7;
        } else {
            int i15 = o.a;
            if (n1Var.V() != null) {
                i10 = 7;
            } else {
                int h = n1Var.h();
                if (h == 1) {
                    i10 = 0;
                } else if (h == 2) {
                    if (!z11) {
                        i10 = 6;
                    }
                    i10 = 2;
                } else if (h == 3) {
                    if (!z11) {
                        i10 = 3;
                    }
                    i10 = 2;
                } else {
                    if (h != 4) {
                        throw new IllegalArgumentException(i0.a.i(h, "Unrecognized State: "));
                    }
                    i10 = 1;
                }
            }
            i11 = i10;
        }
        b2.b1 a2 = w7.y.a(this.y, n1Var.s());
        long j12 = 128;
        for (int i16 = 0; i16 < a2.a.a.size(); i16++) {
            int a10 = a2.a.a(i16);
            if (a10 == 1) {
                j11 = z11 ? 516L : 514L;
            } else if (a10 == 2) {
                j11 = 16384;
            } else if (a10 == 3) {
                j11 = 1;
            } else if (a10 != 31) {
                switch (a10) {
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
        if (!this.w.isEmpty() && e.c(2, this.v)) {
            j12 &= -17;
        }
        if (!this.w.isEmpty() && e.c(3, this.v)) {
            j12 &= -33;
        }
        if (!z10) {
            j12 &= -257;
        }
        long j13 = j12;
        if (n1Var.n0(17)) {
            int m0 = n1Var.m0();
            int i17 = o.a;
            j10 = m0 == -1 ? -1L : m0;
        } else {
            j10 = -1;
        }
        float f7 = n1Var.g().a;
        float f10 = (n1Var.i0() && z10) ? f7 : 0.0f;
        Bundle bundle = V != null ? new Bundle(V.c) : new Bundle();
        bundle.putAll(this.u);
        bundle.putFloat("EXO_SPEED", f7);
        b2.p0 S0 = n1Var.S0();
        if (S0 != null) {
            String str2 = S0.a;
            if (!"".equals(str2)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        long M0 = z10 ? n1Var.M0() : -1L;
        long c02 = z10 ? n1Var.c0() : -1L;
        ArrayList arrayList = new ArrayList();
        long j14 = c02;
        long j15 = M0;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i18 = 0; i18 < this.v.size(); i18++) {
            e eVar = (e) this.v.get(i18);
            p1 p1Var = eVar.a;
            Bundle bundle2 = eVar.d;
            if (p1Var != null) {
                Bundle bundle3 = p1Var.c;
                String str3 = p1Var.b;
                if (eVar.f && p1Var.a == 0) {
                    q1 q1Var = this.x;
                    if ((p1Var != null && q1Var.a.contains(p1Var)) || (((i14 = eVar.b) != -1 && a2.a(i14)) || e.j(str3))) {
                        if (!bundle2.isEmpty()) {
                            bundle3 = new Bundle(bundle3);
                        }
                        if (!bundle2.isEmpty()) {
                            bundle3.putAll(bundle2);
                        }
                        int i19 = eVar.c;
                        if (TextUtils.isEmpty(str3)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty("")) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i19 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        arrayList.add(new n4.v(str3, i19, bundle3));
                    }
                }
            }
        }
        if (V != null) {
            int i20 = o.a;
            int i21 = V.a;
            if (i21 == -110) {
                i13 = 8;
            } else if (i21 == -109) {
                i13 = 11;
            } else if (i21 == -6) {
                i13 = 2;
            } else if (i21 == -2) {
                i13 = 1;
            } else if (i21 != 1) {
                switch (i21) {
                    case -107:
                        i13 = 9;
                        break;
                    case -106:
                        i13 = 7;
                        break;
                    case -105:
                        i13 = 6;
                        break;
                    case -104:
                        i13 = 5;
                        break;
                    case -103:
                        i13 = 4;
                        break;
                    case -102:
                        i13 = 3;
                        break;
                    default:
                        i13 = 0;
                        break;
                }
            } else {
                i13 = 10;
            }
            str = V.getMessage();
            i12 = i13;
        } else {
            str = null;
            i12 = 0;
        }
        return new n4.w(i11, j15, j14, f10, j13, i12, str, elapsedRealtime, arrayList, j10, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
    @Override // android.support.v4.media.session.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Intent intent) {
        boolean z10;
        n4.r c10 = ((n4.l) this.n.a).c();
        c10.getClass();
        w wVar = new w(c10, 0, 0, false, null, Bundle.EMPTY);
        f0 f0Var = this.h;
        p0 p0Var = f0Var.h;
        Context context = f0Var.f;
        b0 b0Var = f0Var.d;
        Bundle extras = intent.getExtras();
        li.s sVar = null;
        KeyEvent keyEvent = (extras == null || !extras.containsKey("android.intent.extra.KEY_EVENT")) ? null : (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
        ComponentName component = intent.getComponent();
        if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && ((component == null || Objects.equals(component.getPackageName(), context.getPackageName())) && keyEvent != null)) {
            f0Var.v();
            f0Var.e.getClass();
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
                li.s sVar2 = b0Var.a;
                if (sVar2 != null) {
                    b0Var.removeCallbacks(sVar2);
                    li.s sVar3 = b0Var.a;
                    b0Var.a = null;
                    sVar = sVar3;
                }
                if (sVar != null) {
                    e2.l0.W(b0Var, sVar);
                }
            } else if (hasSystemFeature || keyEvent.getRepeatCount() != 0) {
                li.s sVar4 = b0Var.a;
                if (sVar4 != null) {
                    b0Var.removeCallbacks(sVar4);
                    li.s sVar5 = b0Var.a;
                    b0Var.a = null;
                    sVar = sVar5;
                }
                if (sVar != null) {
                    e2.l0.W(b0Var, sVar);
                }
            } else {
                li.s sVar6 = b0Var.a;
                if (sVar6 == null) {
                    li.s sVar7 = new li.s(b0Var, wVar, keyEvent, 3);
                    b0Var.a = sVar7;
                    b0Var.postDelayed(sVar7, ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                if (sVar6 != null) {
                    b0Var.removeCallbacks(sVar6);
                    b0Var.a = null;
                }
                z10 = true;
                if (!f0Var.x) {
                    boolean booleanExtra = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                    if (keyEvent.getRepeatCount() > 0 || f0Var.b(keyEvent, z10, booleanExtra)) {
                        return true;
                    }
                } else if ((keyCode2 == 85 || keyCode2 == 79) && z10) {
                    p0Var.S();
                    return true;
                }
            }
            z10 = false;
            if (!f0Var.x) {
            }
        }
        return false;
    }

    public final void i0(int i10, o0 o0Var, n4.r rVar, boolean z10) {
        f0 f0Var = this.h;
        if (f0Var.j()) {
            return;
        }
        if (rVar != null) {
            e2.l0.W(f0Var.l, new ig.o0(this, i10, rVar, o0Var, z10));
            return;
        }
        e2.a.b("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i10);
    }

    public final void j0(p1 p1Var, int i10, o0 o0Var, n4.r rVar) {
        if (rVar != null) {
            e2.l0.W(this.h.l, new i2.g1(this, p1Var, i10, rVar, o0Var, 2));
            return;
        }
        StringBuilder sb2 = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        Object obj = p1Var;
        if (p1Var == null) {
            obj = Integer.valueOf(i10);
        }
        sb2.append(obj);
        e2.a.b("MediaSessionLegacyStub", sb2.toString());
    }

    @Override // android.support.v4.media.session.s
    public final void k() {
        i0(1, new i0(this, 12), ((n4.l) this.n.a).c(), true);
    }

    public final void l0(b2.p0 p0Var, boolean z10, boolean z11) {
        i0(31, new a0(this, p0Var, z10, z11), ((n4.l) this.n.a).c(), false);
    }

    public final w m0(n4.r rVar) {
        w B = this.g.B(rVar);
        if (B == null) {
            w wVar = new w(rVar, 0, 0, this.i.b(rVar), new m0(rVar), Bundle.EMPTY);
            u m10 = this.h.m(wVar);
            this.g.f(rVar, wVar, m10.a, m10.b);
            f0 f0Var = this.h;
            if (!f0Var.x || !f0.k(wVar)) {
                f0Var.e.getClass();
            }
            B = wVar;
        }
        android.support.v4.media.session.q qVar = this.k;
        long j10 = this.r;
        qVar.removeMessages(1001, B);
        qVar.sendMessageDelayed(qVar.obtainMessage(1001, B), j10);
        return B;
    }

    @Override // android.support.v4.media.session.s
    public final void n() {
        i0(1, new i0(this, 6), ((n4.l) this.n.a).c(), false);
    }

    public final void n0() {
        b bVar;
        int i10;
        e9.n0 n0Var = this.w;
        q1 q1Var = this.x;
        b2.b1 b1Var = this.y;
        String str = e.h;
        e9.k0 k0Var = new e9.k0(4);
        for (int i11 = 0; i11 < n0Var.size(); i11++) {
            e eVar = (e) n0Var.get(i11);
            p1 p1Var = eVar.a;
            if ((p1Var == null || !q1Var.a.contains(p1Var)) && ((i10 = eVar.b) == -1 || !b1Var.a(i10))) {
                if (eVar.f) {
                    eVar = new e(eVar.a, eVar.b, eVar.c, new Bundle(eVar.d), false, eVar.e, eVar.g);
                }
                k0Var.c(eVar);
            } else {
                k0Var.c(eVar);
            }
        }
        this.v = e.g(k0Var.f());
        boolean z10 = this.l;
        Bundle bundle = this.u;
        if (z10 && ((bVar = this.m) == null || !bVar.e.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.v.isEmpty() || e.c(2, this.v)) ? false : true);
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        } else {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !e.c(2, this.v));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !e.c(3, this.v));
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
        ((n4.l) this.n.a).a.setExtras(bundle);
    }

    public final void p0(n1 n1Var) {
        e2.l0.W(this.h.l, new j0(this, n1Var, 1));
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
        i0(2, new i0(this, 7), ((n4.l) this.n.a).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void x(String str, Bundle bundle) {
        l0(g0(str, null, null, bundle), true, false);
    }
}
