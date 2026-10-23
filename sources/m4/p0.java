package m4;

import ai.eb;
import ai.u2;
import ai.vb;
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
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import e9.x1;
import hg.b2;
import ig.d2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import v7.u6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class p0 extends n4.l {
    public static final int y;
    public final qi.e f;
    public final f0 g;
    public final n4.w h;
    public final n0 i;
    public final ab.o0 j;
    public final boolean k;
    public final b l;
    public final n4.s m;
    public final androidx.mediarouter.app.f n;
    public final ComponentName o;
    public final boolean p;
    public volatile long q;
    public n0 r;
    public int s;
    public final Bundle t;
    public e9.n0 u;
    public e9.n0 v;
    public p1 w;
    public b2.b1 x;

    static {
        y = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p0(f0 f0Var, Uri uri, Handler handler, Bundle bundle, boolean z10, e9.n0 n0Var, e9.n0 n0Var2, p1 p1Var, b2.b1 b1Var, Bundle bundle2) {
        boolean z11;
        List<ResolveInfo> queryBroadcastReceivers;
        ComponentName componentName;
        ComponentName J;
        PendingIntent foregroundService;
        n4.s sVar;
        this.g = f0Var;
        this.p = z10;
        this.u = n0Var;
        this.v = n0Var2;
        this.w = p1Var;
        this.x = b1Var;
        this.t = new Bundle(bundle2);
        Context context = f0Var.f;
        this.h = n4.w.a(context);
        this.i = new n0(this);
        qi.e eVar = new qi.e(f0Var);
        this.f = eVar;
        this.q = 300000L;
        this.j = new ab.o0(f0Var.l.getLooper(), eVar);
        int i10 = Build.VERSION.SDK_INT;
        boolean z12 = true;
        if (i10 >= 33) {
            String str = e2.m0.a;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                String str2 = Build.MANUFACTURER;
                if (str2.equals("Google") || str2.equals("motorola") || str2.equals("vivo") || str2.equals("Sony") || str2.equals("Nothing") || str2.equals("unknown")) {
                    z11 = true;
                    this.k = z11;
                    if (!n0Var2.isEmpty()) {
                        M();
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
                    this.o = componentName;
                    if (componentName != null || i10 < 31) {
                        J = J(context, "androidx.media3.session.MediaLibraryService");
                        J = J == null ? J(context, "androidx.media3.session.MediaSessionService") : J;
                        if (J != null || J.equals(componentName)) {
                            z12 = false;
                        }
                    } else {
                        z12 = false;
                        J = componentName;
                    }
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
                    if (J != null) {
                        androidx.mediarouter.app.f fVar = new androidx.mediarouter.app.f(this, 7);
                        this.n = fVar;
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
                        String scheme = uri.getScheme();
                        String str3 = e2.m0.a;
                        intentFilter.addDataScheme(scheme);
                        if (i10 < 33) {
                            context.registerReceiver(fVar, intentFilter);
                        } else {
                            context.registerReceiver(fVar, intentFilter, 4);
                        }
                        intent2.setPackage(context.getPackageName());
                        foregroundService = PendingIntent.getBroadcast(context, 0, intent2, y);
                        J = new ComponentName(context, context.getClass());
                    } else {
                        intent2.setComponent(J);
                        foregroundService = z12 ? i10 >= 26 ? PendingIntent.getForegroundService(context, 0, intent2, y) : PendingIntent.getService(context, 0, intent2, y) : PendingIntent.getBroadcast(context, 0, intent2, y);
                        this.n = null;
                    }
                    sVar = new n4.s(context, TextUtils.join(".", new String[]{"androidx.media3.session.id", f0Var.i}), i10 >= 31 ? null : J, i10 >= 31 ? foregroundService : null, bundle);
                    this.m = sVar;
                    if (i10 >= 31 && componentName != null) {
                        e0.e0.h(sVar, componentName);
                    }
                    sVar.D(this, handler);
                    this.l = z11 ? new b(context, new g0(this, 0)) : null;
                }
            }
        }
        z11 = false;
        this.k = z11;
        if (!n0Var2.isEmpty()) {
        }
        PackageManager packageManager2 = context.getPackageManager();
        Intent intent3 = new Intent("android.intent.action.MEDIA_BUTTON");
        intent3.setPackage(context.getPackageName());
        queryBroadcastReceivers = packageManager2.queryBroadcastReceivers(intent3, 0);
        if (queryBroadcastReceivers.size() != 1) {
        }
        this.o = componentName;
        if (componentName != null) {
        }
        J = J(context, "androidx.media3.session.MediaLibraryService");
        if (J == null) {
        }
        if (J != null) {
        }
        z12 = false;
        Intent intent22 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
        if (J != null) {
        }
        sVar = new n4.s(context, TextUtils.join(".", new String[]{"androidx.media3.session.id", f0Var.i}), i10 >= 31 ? null : J, i10 >= 31 ? foregroundService : null, bundle);
        this.m = sVar;
        if (i10 >= 31) {
            e0.e0.h(sVar, componentName);
        }
        sVar.D(this, handler);
        this.l = z11 ? new b(context, new g0(this, 0)) : null;
    }

    public static void D(n4.s sVar, ArrayList arrayList) {
        int i10 = 0;
        if (arrayList != null) {
            sVar.getClass();
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                long j10 = ((n4.q) obj).b;
                if (hashSet.contains(Long.valueOf(j10))) {
                    e2.a.d("MediaSessionCompat", a1.g.o(j10, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j10));
            }
        }
        n4.n nVar = (n4.n) sVar.b;
        MediaSession mediaSession = nVar.a;
        nVar.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            n4.q qVar = (n4.q) obj2;
            MediaSession.QueueItem queueItem = qVar.c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(qVar.a.a(), qVar.b);
                qVar.c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static void E(n4.s sVar, n4.i iVar) {
        n4.n nVar = (n4.n) sVar.b;
        nVar.i = iVar;
        MediaSession mediaSession = nVar.a;
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

    public static b2.o0 F(String str, Uri uri, String str2, Bundle bundle) {
        b2.c0 c0Var = new b2.c0();
        e9.l0 l0Var = e9.n0.b;
        x1 x1Var = x1.e;
        List list = Collections.EMPTY_LIST;
        x1 x1Var2 = x1.e;
        b2.h0 h0Var = new b2.h0();
        b2.k0 k0Var = b2.k0.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        androidx.biometric.e eVar = new androidx.biometric.e(3);
        eVar.b = uri;
        eVar.c = str2;
        eVar.d = bundle;
        return new b2.o0(str3, new b2.e0(c0Var), null, new b2.i0(h0Var), b2.r0.L, new b2.k0(eVar));
    }

    public static ComponentName J(Context context, String str) {
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

    @Override // n4.l
    public final void A(long j10) {
        if (j10 < 0) {
            return;
        }
        H(10, new h0(this, j10, 0), ((n4.n) this.m.b).c(), true);
    }

    @Override // n4.l
    public final void B() {
        H(3, new i0(this, 8), ((n4.n) this.m.b).c(), true);
    }

    public final n4.y G(m1 m1Var) {
        int i10;
        int i11;
        long j10;
        String str;
        int i12;
        int i13;
        int i14;
        long j11;
        b2.y0 W = m1Var.W();
        boolean z10 = m1Var.o0(16) && !m1Var.P0();
        boolean z11 = W != null || e2.m0.c0(m1Var, this.p);
        if (W != null) {
            i11 = 7;
        } else {
            int i15 = n.a;
            if (m1Var.W() != null) {
                i10 = 7;
            } else {
                int d = m1Var.d();
                if (d == 1) {
                    i10 = 0;
                } else if (d == 2) {
                    if (!z11) {
                        i10 = 6;
                    }
                    i10 = 2;
                } else if (d == 3) {
                    if (!z11) {
                        i10 = 3;
                    }
                    i10 = 2;
                } else {
                    if (d != 4) {
                        throw new IllegalArgumentException(i2.o1.k(d, "Unrecognized State: "));
                    }
                    i10 = 1;
                }
            }
            i11 = i10;
        }
        b2.b1 a2 = w7.v.a(this.x, m1Var.s());
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
        if (!this.v.isEmpty() && d.c(2, this.u)) {
            j12 &= -17;
        }
        if (!this.v.isEmpty() && d.c(3, this.u)) {
            j12 &= -33;
        }
        if (!z10) {
            j12 &= -257;
        }
        long j13 = j12;
        if (m1Var.o0(17)) {
            int n02 = m1Var.n0();
            int i17 = n.a;
            j10 = n02 == -1 ? -1L : n02;
        } else {
            j10 = -1;
        }
        float f7 = m1Var.h().a;
        float f10 = (m1Var.j0() && z10) ? f7 : 0.0f;
        Bundle bundle = W != null ? new Bundle(W.c) : new Bundle();
        bundle.putAll(this.t);
        bundle.putFloat("EXO_SPEED", f7);
        b2.o0 S0 = m1Var.S0();
        if (S0 != null) {
            String str2 = S0.a;
            if (!"".equals(str2)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        long M0 = z10 ? m1Var.M0() : -1L;
        long d02 = z10 ? m1Var.d0() : -1L;
        ArrayList arrayList = new ArrayList();
        long j14 = d02;
        long j15 = M0;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i18 = 0; i18 < this.u.size(); i18++) {
            d dVar = (d) this.u.get(i18);
            o1 o1Var = dVar.a;
            Bundle bundle2 = dVar.d;
            if (o1Var != null) {
                Bundle bundle3 = o1Var.c;
                String str3 = o1Var.b;
                if (dVar.f && o1Var.a == 0) {
                    p1 p1Var = this.w;
                    if ((o1Var != null && p1Var.a.contains(o1Var)) || (((i14 = dVar.b) != -1 && a2.a(i14)) || d.j(str3))) {
                        if (!bundle2.isEmpty()) {
                            bundle3 = new Bundle(bundle3);
                        }
                        if (!bundle2.isEmpty()) {
                            bundle3.putAll(bundle2);
                        }
                        int i19 = dVar.c;
                        if (TextUtils.isEmpty(str3)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty("")) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i19 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        arrayList.add(new n4.x(str3, i19, bundle3));
                    }
                }
            }
        }
        if (W != null) {
            int i20 = n.a;
            int i21 = W.a;
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
            str = W.getMessage();
            i12 = i13;
        } else {
            str = null;
            i12 = 0;
        }
        return new n4.y(i11, j15, j14, f10, j13, i12, str, elapsedRealtime, arrayList, j10, bundle);
    }

    public final void H(int i10, o0 o0Var, n4.t tVar, boolean z10) {
        f0 f0Var = this.g;
        if (f0Var.j()) {
            return;
        }
        if (tVar != null) {
            e2.m0.W(f0Var.l, new eb(this, i10, tVar, o0Var, z10));
            return;
        }
        e2.a.b("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i10);
    }

    public final void I(o1 o1Var, int i10, o0 o0Var, n4.t tVar) {
        if (tVar != null) {
            e2.m0.W(this.g.l, new vb(this, o1Var, i10, tVar, o0Var, 6));
            return;
        }
        StringBuilder sb2 = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        Object obj = o1Var;
        if (o1Var == null) {
            obj = Integer.valueOf(i10);
        }
        sb2.append(obj);
        e2.a.b("MediaSessionLegacyStub", sb2.toString());
    }

    public final void K(b2.o0 o0Var, boolean z10, boolean z11) {
        H(31, new a0(this, o0Var, z10, z11), ((n4.n) this.m.b).c(), false);
    }

    public final v L(n4.t tVar) {
        v q6 = this.f.q(tVar);
        if (q6 == null) {
            v vVar = new v(tVar, 0, 0, this.h.b(tVar), new m0(tVar), Bundle.EMPTY);
            t m10 = this.g.m(vVar);
            this.f.b(tVar, vVar, m10.a, m10.b);
            f0 f0Var = this.g;
            if (!f0Var.x || !f0.k(vVar)) {
                f0Var.e.getClass();
            }
            q6 = vVar;
        }
        ab.o0 o0Var = this.j;
        long j10 = this.q;
        o0Var.removeMessages(1001, q6);
        o0Var.sendMessageDelayed(o0Var.obtainMessage(1001, q6), j10);
        return q6;
    }

    public final void M() {
        b bVar;
        int i10;
        e9.n0 n0Var = this.v;
        p1 p1Var = this.w;
        b2.b1 b1Var = this.x;
        String str = d.h;
        e9.k0 k0Var = new e9.k0(4);
        for (int i11 = 0; i11 < n0Var.size(); i11++) {
            d dVar = (d) n0Var.get(i11);
            o1 o1Var = dVar.a;
            if ((o1Var == null || !p1Var.a.contains(o1Var)) && ((i10 = dVar.b) == -1 || !b1Var.a(i10))) {
                if (dVar.f) {
                    dVar = new d(dVar.a, dVar.b, dVar.c, new Bundle(dVar.d), false, dVar.e, dVar.g);
                }
                k0Var.c(dVar);
            } else {
                k0Var.c(dVar);
            }
        }
        this.u = d.g(k0Var.f());
        boolean z10 = this.k;
        Bundle bundle = this.t;
        if (z10 && ((bVar = this.l) == null || !bVar.e.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.u.isEmpty() || d.c(2, this.u)) ? false : true);
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        } else {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !d.c(2, this.u));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !d.c(3, this.u));
        }
    }

    public final void N() {
        Bundle bundle = this.t;
        boolean z10 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z11 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        M();
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z10 && bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z11) {
            return;
        }
        ((n4.n) this.m.b).a.setExtras(bundle);
    }

    public final void O(m1 m1Var) {
        e2.m0.W(this.g.l, new j0(this, m1Var, 1));
    }

    @Override // n4.l
    public final void b(n4.h hVar) {
        if (hVar != null) {
            H(20, new b2(this, hVar, -1, 3), ((n4.n) this.m.b).c(), false);
        }
    }

    @Override // n4.l
    public final void c(n4.h hVar, int i10) {
        if (hVar != null) {
            if (i10 == -1 || i10 >= 0) {
                H(20, new b2(this, hVar, i10, 3), ((n4.n) this.m.b).c(), false);
            }
        }
    }

    @Override // n4.l
    public final void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (!str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") || resultReceiver == null) {
            o1 o1Var = new o1(str, Bundle.EMPTY);
            I(o1Var, 0, new u2(this, o1Var, bundle, resultReceiver), ((n4.n) this.m.b).c());
            return;
        }
        t1 t1Var = this.g.j;
        t1Var.getClass();
        String str2 = t1.b;
        Bundle bundle2 = new Bundle();
        u1 u1Var = t1Var.a;
        if (u1Var != null) {
            bundle2.putInt(str2, 0);
        } else {
            bundle2.putInt(str2, 1);
        }
        String str3 = t1.c;
        u1Var.getClass();
        Bundle bundle3 = new Bundle();
        bundle3.putInt(u1.i, u1Var.a);
        bundle3.putInt(u1.j, 0);
        bundle3.putInt(u1.k, u1Var.b);
        bundle3.putString(u1.l, u1Var.d);
        bundle3.putString(u1.m, u1Var.e);
        bundle3.putBinder(u1.o, u1Var.f);
        bundle3.putParcelable(u1.n, null);
        bundle3.putBundle(u1.p, u1Var.g);
        bundle3.putInt(u1.q, u1Var.c);
        MediaSession.Token token = u1Var.h;
        if (token != null) {
            bundle3.putParcelable(u1.r, token);
        }
        bundle2.putBundle(str3, bundle3);
        resultReceiver.send(0, bundle2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    @Override // n4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(String str, Bundle bundle) {
        boolean booleanValue;
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        o1 o1Var = new o1(str, bundle);
        boolean j10 = d.j(str);
        n4.s sVar = this.m;
        if (!j10) {
            I(o1Var, 0, new i0(this, o1Var, bundle), ((n4.n) sVar.b).c());
            return;
        }
        try {
            d d = d.d(o1Var);
            int i10 = d.b;
            Object obj = d.g;
            if (!d.b()) {
                e2.a.l("MediaSessionLegacyStub", "Can't execute predefined custom command: ".concat(str));
                return;
            }
            o1 o1Var2 = d.a;
            if (o1Var2 != null) {
                u6.p(o1Var2.a == 40010);
                obj.getClass();
                I(null, 40010, new i0(this, (b2.g1) obj), ((n4.n) sVar.b).c());
                return;
            }
            m1 m1Var = this.g.t;
            if (i10 == 1) {
                if (obj != null) {
                    booleanValue = ((Boolean) obj).booleanValue();
                } else if (!m1Var.t()) {
                    booleanValue = true;
                }
                if (!booleanValue) {
                    H(1, new i0(this, 6), ((n4.n) sVar.b).c(), false);
                    return;
                } else if (i10 != 31) {
                    H(i10, new ah.h0(26, this, d), ((n4.n) sVar.b).c(), true);
                    return;
                } else {
                    obj.getClass();
                    K((b2.o0) obj, false, false);
                    return;
                }
            }
            booleanValue = false;
            if (!booleanValue) {
            }
        } catch (RuntimeException e) {
            e2.a.m("MediaSessionLegacyStub", "Failed to convert predefined custom command: " + o1Var.b, e);
        }
    }

    @Override // n4.l
    public final void f() {
        H(12, new i0(this, 4), ((n4.n) this.m.b).c(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    @Override // n4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(Intent intent) {
        boolean z10;
        n4.t c10 = ((n4.n) this.m.b).c();
        c10.getClass();
        v vVar = new v(c10, 0, 0, false, null, Bundle.EMPTY);
        f0 f0Var = this.g;
        p0 p0Var = f0Var.h;
        Context context = f0Var.f;
        b0 b0Var = f0Var.d;
        Bundle extras = intent.getExtras();
        d2 d2Var = null;
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
                d2 d2Var2 = b0Var.a;
                if (d2Var2 != null) {
                    b0Var.removeCallbacks(d2Var2);
                    d2 d2Var3 = b0Var.a;
                    b0Var.a = null;
                    d2Var = d2Var3;
                }
                if (d2Var != null) {
                    e2.m0.W(b0Var, d2Var);
                }
            } else if (hasSystemFeature || keyEvent.getRepeatCount() != 0) {
                d2 d2Var4 = b0Var.a;
                if (d2Var4 != null) {
                    b0Var.removeCallbacks(d2Var4);
                    d2 d2Var5 = b0Var.a;
                    b0Var.a = null;
                    d2Var = d2Var5;
                }
                if (d2Var != null) {
                    e2.m0.W(b0Var, d2Var);
                }
            } else {
                d2 d2Var6 = b0Var.a;
                if (d2Var6 == null) {
                    d2 d2Var7 = new d2(b0Var, vVar, keyEvent, 9);
                    b0Var.a = d2Var7;
                    b0Var.postDelayed(d2Var7, ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                if (d2Var6 != null) {
                    b0Var.removeCallbacks(d2Var6);
                    b0Var.a = null;
                }
                z10 = true;
                if (!f0Var.x) {
                    boolean booleanExtra = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                    if (keyEvent.getRepeatCount() > 0 || f0Var.b(keyEvent, z10, booleanExtra)) {
                        return true;
                    }
                } else if ((keyCode2 == 85 || keyCode2 == 79) && z10) {
                    p0Var.y();
                    return true;
                }
            }
            z10 = false;
            if (!f0Var.x) {
            }
        }
        return false;
    }

    @Override // n4.l
    public final void h() {
        H(1, new i0(this, 12), ((n4.n) this.m.b).c(), true);
    }

    @Override // n4.l
    public final void i() {
        H(1, new i0(this, 6), ((n4.n) this.m.b).c(), false);
    }

    @Override // n4.l
    public final void j(String str, Bundle bundle) {
        K(F(str, null, null, bundle), true, true);
    }

    @Override // n4.l
    public final void k(String str, Bundle bundle) {
        K(F(null, null, str, bundle), true, true);
    }

    @Override // n4.l
    public final void l(Uri uri, Bundle bundle) {
        K(F(null, uri, null, bundle), true, true);
    }

    @Override // n4.l
    public final void m() {
        H(2, new i0(this, 7), ((n4.n) this.m.b).c(), true);
    }

    @Override // n4.l
    public final void n(String str, Bundle bundle) {
        K(F(str, null, null, bundle), true, false);
    }

    @Override // n4.l
    public final void o(String str, Bundle bundle) {
        K(F(null, null, str, bundle), true, false);
    }

    @Override // n4.l
    public final void p(Uri uri, Bundle bundle) {
        K(F(null, uri, null, bundle), true, false);
    }

    @Override // n4.l
    public final void q(n4.h hVar) {
        if (hVar == null) {
            return;
        }
        H(20, new ah.h0(27, this, hVar), ((n4.n) this.m.b).c(), true);
    }

    @Override // n4.l
    public final void r() {
        H(11, new i0(this, 5), ((n4.n) this.m.b).c(), true);
    }

    @Override // n4.l
    public final void s(long j10) {
        H(5, new h0(this, j10, 1), ((n4.n) this.m.b).c(), true);
    }

    @Override // n4.l
    public final void t(float f7) {
        if (f7 <= 0.0f) {
            return;
        }
        H(13, new l0(this, f7), ((n4.n) this.m.b).c(), true);
    }

    @Override // n4.l
    public final void u(n4.z zVar) {
        v(zVar);
    }

    @Override // n4.l
    public final void v(n4.z zVar) {
        b2.g1 c10 = n.c(zVar);
        if (c10 != null) {
            I(null, 40010, new i0(this, c10), ((n4.n) this.m.b).c());
            return;
        }
        e2.a.l("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + zVar);
    }

    @Override // n4.l
    public final void w(int i10) {
        H(15, new k0(this, i10, 0), ((n4.n) this.m.b).c(), true);
    }

    @Override // n4.l
    public final void x(int i10) {
        H(14, new k0(this, i10, 1), ((n4.n) this.m.b).c(), true);
    }

    @Override // n4.l
    public final void y() {
        boolean o02 = this.g.t.o0(9);
        n4.s sVar = this.m;
        if (o02) {
            H(9, new i0(this, 10), ((n4.n) sVar.b).c(), true);
        } else {
            H(8, new i0(this, 11), ((n4.n) sVar.b).c(), true);
        }
    }

    @Override // n4.l
    public final void z() {
        boolean o02 = this.g.t.o0(7);
        n4.s sVar = this.m;
        if (o02) {
            H(7, new i0(this, 2), ((n4.n) sVar.b).c(), true);
        } else {
            H(6, new i0(this, 3), ((n4.n) sVar.b).c(), true);
        }
    }
}
