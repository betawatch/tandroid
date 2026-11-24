// default package

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ly6 extends yw6 {
    public static final int B;
    public ne8 A;
    public final mx6 g;
    public final qt h;
    public final qt i;
    public final tx6 j;
    public final nl9 k;
    public final trc l;
    public final c1 m;
    public final boolean n;
    public final al o;
    public final lx6 p;
    public final zk q;
    public final ComponentName r;
    public final boolean s;
    public volatile int t;
    public trc u;
    public byte v;
    public final Bundle w;
    public mo5 x;
    public mo5 y;
    public s7a z;

    static {
        B = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ly6(tx6 tx6Var, Uri uri, Handler handler, Bundle bundle, y79 y79Var, y79 y79Var2, s7a s7aVar, ne8 ne8Var, Bundle bundle2) {
        super((byte) 0);
        boolean z;
        List<ResolveInfo> queryBroadcastReceivers;
        ComponentName componentName;
        ComponentName i0;
        PendingIntent foregroundService;
        lx6 lx6Var;
        ComponentName componentName2;
        PendingIntent pendingIntent;
        String str;
        Bundle bundle3;
        this.j = tx6Var;
        boolean z2 = true;
        this.s = true;
        this.x = y79Var;
        this.y = y79Var2;
        this.z = s7aVar;
        this.A = ne8Var;
        this.w = new Bundle(bundle2);
        this.h = new qt(0);
        this.i = new qt(0);
        Context context = tx6Var.f;
        this.k = nl9.D0(context);
        this.l = new trc(this);
        mx6 mx6Var = new mx6(tx6Var);
        this.g = mx6Var;
        this.t = 300000;
        this.m = new c1(tx6Var.l.getLooper(), mx6Var);
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            String str2 = hac.a;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                String str3 = Build.MANUFACTURER;
                if (str3.equals("Google") || str3.equals("motorola") || str3.equals("vivo") || str3.equals("Sony") || str3.equals("Nothing") || str3.equals("unknown")) {
                    z = true;
                    this.n = z;
                    if (!y79Var2.isEmpty()) {
                        o0();
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
                            ncd.f("MediaSessionLegacyStub", "Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found " + queryBroadcastReceivers.size() + ". Using runtime media button receiver instead.");
                        }
                        componentName = null;
                    }
                    this.r = componentName;
                    if (componentName != null || i < 31) {
                        i0 = i0(context, "androidx.media3.session.MediaLibraryService");
                        i0 = i0 == null ? i0(context, "androidx.media3.session.MediaSessionService") : i0;
                        if (i0 != null || i0.equals(componentName)) {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                        i0 = componentName;
                    }
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
                    if (i0 != null) {
                        zk zkVar = new zk(this, (byte) 9);
                        this.q = zkVar;
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
                        String scheme = uri.getScheme();
                        String str4 = hac.a;
                        intentFilter.addDataScheme(scheme);
                        if (i < 33) {
                            context.registerReceiver(zkVar, intentFilter);
                        } else {
                            context.registerReceiver(zkVar, intentFilter, 4);
                        }
                        intent2.setPackage(context.getPackageName());
                        foregroundService = PendingIntent.getBroadcast(context, 0, intent2, B);
                        i0 = new ComponentName(context, context.getClass());
                    } else {
                        intent2.setComponent(i0);
                        int i2 = B;
                        foregroundService = z2 ? i >= 26 ? PendingIntent.getForegroundService(context, 0, intent2, i2) : PendingIntent.getService(context, 0, intent2, i2) : PendingIntent.getBroadcast(context, 0, intent2, i2);
                        this.q = null;
                    }
                    String join = TextUtils.join(".", new String[]{"androidx.media3.session.id", tx6Var.i});
                    if (i >= 31) {
                        pendingIntent = foregroundService;
                        componentName2 = i0;
                        bundle3 = bundle;
                        str = join;
                    } else {
                        componentName2 = null;
                        pendingIntent = null;
                        str = join;
                        bundle3 = bundle;
                    }
                    lx6Var = new lx6(context, str, componentName2, pendingIntent, bundle3);
                    this.p = lx6Var;
                    if (i >= 31 && componentName != null) {
                        y00.z(lx6Var, componentName);
                    }
                    lx6Var.M(this, handler);
                    this.o = z ? new al(context, new ux6(this, (byte) 0)) : null;
                }
            }
        }
        z = false;
        this.n = z;
        if (!y79Var2.isEmpty()) {
        }
        PackageManager packageManager2 = context.getPackageManager();
        Intent intent3 = new Intent("android.intent.action.MEDIA_BUTTON");
        intent3.setPackage(context.getPackageName());
        queryBroadcastReceivers = packageManager2.queryBroadcastReceivers(intent3, 0);
        if (queryBroadcastReceivers.size() != 1) {
        }
        this.r = componentName;
        if (componentName != null) {
        }
        i0 = i0(context, "androidx.media3.session.MediaLibraryService");
        if (i0 == null) {
        }
        if (i0 != null) {
        }
        z2 = false;
        Intent intent22 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
        if (i0 != null) {
        }
        String join2 = TextUtils.join(".", new String[]{"androidx.media3.session.id", tx6Var.i});
        if (i >= 31) {
        }
        lx6Var = new lx6(context, str, componentName2, pendingIntent, bundle3);
        this.p = lx6Var;
        if (i >= 31) {
            y00.z(lx6Var, componentName);
        }
        lx6Var.M(this, handler);
        this.o = z ? new al(context, new ux6(this, (byte) 0)) : null;
    }

    public static bt6 e0(String str, Uri uri, String str2, Bundle bundle) {
        ps6 ps6Var = new ps6();
        if (str == null) {
            str = "";
        }
        ps6Var.a = str;
        in3 in3Var = new in3((byte) 16, false);
        in3Var.b = uri;
        in3Var.c = str2;
        in3Var.d = bundle;
        ps6Var.i = new ys6(in3Var);
        return ps6Var.a();
    }

    public static ComponentName i0(Context context, String str) {
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

    @Override // yw6
    public final void A(String str, Bundle bundle) {
        k0(e0(null, null, str, bundle), true, false);
    }

    @Override // yw6
    public final void D(Uri uri, Bundle bundle) {
        k0(e0(null, uri, null, bundle), true, false);
    }

    @Override // yw6
    public final void E(ks6 ks6Var) {
        if (ks6Var == null) {
            return;
        }
        g0(20, new cy6(this, ks6Var, (byte) 1), ((bx6) this.p.b).c(), true);
    }

    @Override // yw6
    public final void F() {
        g0(11, new xx6(this, (byte) 4), ((bx6) this.p.b).c(), true);
    }

    @Override // yw6
    public final void G(long j) {
        g0(5, new wx6(this, j, (byte) 1), ((bx6) this.p.b).c(), true);
    }

    @Override // yw6
    public final void J(final float f) {
        if (f <= 0.0f) {
            return;
        }
        g0(13, new ky6() { // from class: gy6
            @Override // ky6
            public final void a(sw6 sw6Var) {
                tx6 tx6Var = ly6.this.j;
                tx6Var.t();
                tx6Var.t.d(f);
            }
        }, ((bx6) this.p.b).c(), true);
    }

    @Override // yw6
    public final void K(i19 i19Var) {
        L(i19Var);
    }

    @Override // yw6
    public final void L(i19 i19Var) {
        g19 c = j26.c(i19Var);
        if (c != null) {
            h0(null, 40010, new xx6(this, c), ((bx6) this.p.b).c());
            return;
        }
        ncd.f("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + i19Var);
    }

    @Override // yw6
    public final void M(int i) {
        g0(15, new zx6(this, i, (byte) 0), ((bx6) this.p.b).c(), true);
    }

    @Override // yw6
    public final void P(int i) {
        g0(14, new zx6(this, i, (byte) 1), ((bx6) this.p.b).c(), true);
    }

    @Override // yw6
    public final void S() {
        tx6 tx6Var = this.j;
        tx6Var.t();
        boolean m0 = tx6Var.t.m0(9);
        lx6 lx6Var = this.p;
        if (m0) {
            g0(9, new xx6(this, (byte) 10), ((bx6) lx6Var.b).c(), true);
        } else {
            g0(8, new xx6(this, (byte) 11), ((bx6) lx6Var.b).c(), true);
        }
    }

    @Override // yw6
    public final void V() {
        tx6 tx6Var = this.j;
        tx6Var.t();
        boolean m0 = tx6Var.t.m0(7);
        lx6 lx6Var = this.p;
        if (m0) {
            g0(7, new xx6(this, (byte) 2), ((bx6) lx6Var.b).c(), true);
        } else {
            g0(6, new xx6(this, (byte) 3), ((bx6) lx6Var.b).c(), true);
        }
    }

    @Override // yw6
    public final void Y(long j) {
        if (j < 0) {
            return;
        }
        g0(10, new wx6(this, j, (byte) 0), ((bx6) this.p.b).c(), true);
    }

    @Override // yw6
    public final void b0() {
        g0(3, new xx6(this, (byte) 8), ((bx6) this.p.b).c(), true);
    }

    @Override // yw6
    public final void c(ks6 ks6Var) {
        if (ks6Var != null) {
            g0(20, new yx6(this, ks6Var, -1), ((bx6) this.p.b).c(), false);
        }
    }

    @Override // yw6
    public final void d(ks6 ks6Var, int i) {
        if (ks6Var != null) {
            if (i == -1 || i >= 0) {
                g0(20, new yx6(this, ks6Var, i), ((bx6) this.p.b).c(), false);
            }
        }
    }

    @Override // yw6
    public final void e(String str, final Bundle bundle, final ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (!str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") || resultReceiver == null) {
            final r7a r7aVar = new r7a(str, Bundle.EMPTY);
            h0(r7aVar, 0, new ky6(r7aVar, bundle, resultReceiver) { // from class: ay6
                public final /* synthetic */ Bundle b;
                public final /* synthetic */ ResultReceiver c;

                {
                    this.b = bundle;
                    this.c = resultReceiver;
                }

                @Override // ky6
                public final void a(sw6 sw6Var) {
                    tx6 tx6Var = ly6.this.j;
                    if (this.b == null) {
                        Bundle bundle2 = Bundle.EMPTY;
                    }
                    ao5 m = tx6Var.m(sw6Var);
                    ResultReceiver resultReceiver2 = this.c;
                    if (resultReceiver2 != null) {
                        m.b(new lj6(m, resultReceiver2, (byte) 17), fp3.a);
                    }
                }
            }, ((bx6) this.p.b).c());
            return;
        }
        u8a u8aVar = this.j.j;
        u8aVar.getClass();
        Bundle bundle2 = new Bundle();
        v8a v8aVar = u8aVar.a;
        bundle2.putInt(u8a.b, 0);
        String str2 = u8a.c;
        Bundle bundle3 = new Bundle();
        bundle3.putInt(v8a.f, v8aVar.a);
        bundle3.putInt(v8a.g, 0);
        bundle3.putInt(v8a.h, 1011001300);
        bundle3.putString(v8a.i, v8aVar.b);
        bundle3.putString(v8a.j, "");
        bundle3.putBinder(v8a.l, v8aVar.c);
        bundle3.putParcelable(v8a.k, null);
        bundle3.putBundle(v8a.m, v8aVar.d);
        bundle3.putInt(v8a.n, 10);
        MediaSession.Token token = v8aVar.e;
        if (token != null) {
            bundle3.putParcelable(v8a.o, token);
        }
        bundle2.putBundle(str2, bundle3);
        resultReceiver.send(0, bundle2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ge8 f0(cf8 cf8Var) {
        int i;
        int i2;
        long j;
        long j2;
        String str;
        int i3;
        int i4;
        int i5;
        long j3;
        u64 U = cf8Var.U();
        boolean z = cf8Var.m0(16) && !cf8Var.P0();
        boolean z2 = U != null || hac.d0(cf8Var, this.s);
        Object obj = null;
        if (U != null) {
            i2 = 7;
        } else {
            int i6 = j26.a;
            if (cf8Var.U() != null) {
                i = 7;
            } else {
                int h = cf8Var.h();
                if (h == 1) {
                    i = 0;
                } else if (h == 2) {
                    if (!z2) {
                        i = 6;
                    }
                    i = 2;
                } else if (h == 3) {
                    if (!z2) {
                        i = 3;
                    }
                    i = 2;
                } else {
                    if (h != 4) {
                        u36.j(hg9.j(h, "Unrecognized State: "));
                        return null;
                    }
                    i = 1;
                }
            }
            i2 = i;
        }
        ne8 a = zqe.a(this.A, cf8Var.q());
        long j4 = 128;
        int i7 = 0;
        while (i7 < a.a.a.size()) {
            int a2 = a.a.a(i7);
            Object obj2 = obj;
            if (a2 == 1) {
                j3 = z2 ? 516L : 514L;
            } else if (a2 == 2) {
                j3 = 16384;
            } else if (a2 == 3) {
                j3 = 1;
            } else if (a2 != 31) {
                switch (a2) {
                    case 5:
                        j3 = 256;
                        break;
                    case 6:
                    case 7:
                        j3 = 16;
                        break;
                    case 8:
                    case 9:
                        j3 = 32;
                        break;
                    case 10:
                        j3 = 4096;
                        break;
                    case 11:
                        j3 = 8;
                        break;
                    case 12:
                        j3 = 64;
                        break;
                    case 13:
                        j3 = 4194304;
                        break;
                    case 14:
                        j3 = 2621440;
                        break;
                    case 15:
                        j3 = 262144;
                        break;
                    default:
                        j3 = 0;
                        break;
                }
            } else {
                j3 = 240640;
            }
            j4 |= j3;
            i7++;
            obj = obj2;
        }
        ge8 ge8Var = obj;
        if (!this.y.isEmpty() && un2.b(2, this.x)) {
            j4 &= -17;
        }
        if (!this.y.isEmpty() && un2.b(3, this.x)) {
            j4 &= -33;
        }
        if (!z) {
            j4 &= -257;
        }
        long j5 = j4;
        long j6 = -1;
        if (cf8Var.m0(17)) {
            int l0 = cf8Var.l0();
            int i8 = j26.a;
            j = l0 == -1 ? -1L : l0;
        } else {
            j = -1;
        }
        float f = cf8Var.g().a;
        float f2 = (cf8Var.i() && z) ? f : 0.0f;
        Bundle bundle = U != null ? new Bundle(U.c) : new Bundle();
        bundle.putAll(this.w);
        bundle.putFloat("EXO_SPEED", f);
        bt6 S0 = cf8Var.S0();
        if (S0 != null) {
            String str2 = S0.a;
            if (!"".equals(str2)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        if (z) {
            long k = cf8Var.k();
            j6 = cf8Var.b0();
            j2 = k;
        } else {
            j2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i9 = 0; i9 < this.x.size(); i9++) {
            un2 un2Var = (un2) this.x.get(i9);
            r7a r7aVar = un2Var.a;
            Bundle bundle2 = un2Var.d;
            if (r7aVar != null) {
                Bundle bundle3 = r7aVar.c;
                String str3 = r7aVar.b;
                if (un2Var.f && r7aVar.a == 0) {
                    s7a s7aVar = this.z;
                    if ((r7aVar != null && s7aVar.a.contains(r7aVar)) || (((i5 = un2Var.b) != -1 && a.a(i5)) || un2.i(str3))) {
                        if (!bundle2.isEmpty()) {
                            bundle3 = new Bundle(bundle3);
                        }
                        if (!bundle2.isEmpty()) {
                            bundle3.putAll(bundle2);
                        }
                        if (TextUtils.isEmpty(str3)) {
                            u36.j("You must specify an action to build a CustomAction");
                            return ge8Var;
                        }
                        u36.j("You must specify a name to build a CustomAction");
                        return ge8Var;
                    }
                }
            }
        }
        if (U != null) {
            int i10 = j26.a;
            int i11 = U.a;
            if (i11 == -110) {
                i4 = 8;
            } else if (i11 == -109) {
                i4 = 11;
            } else if (i11 == -6) {
                i4 = 2;
            } else if (i11 == -2) {
                i4 = 1;
            } else if (i11 != 1) {
                switch (i11) {
                    case -107:
                        i4 = 9;
                        break;
                    case -106:
                        i4 = 7;
                        break;
                    case -105:
                        i4 = 6;
                        break;
                    case -104:
                        i4 = 5;
                        break;
                    case -103:
                        i4 = 4;
                        break;
                    case -102:
                        i4 = 3;
                        break;
                    default:
                        i4 = 0;
                        break;
                }
            } else {
                i4 = 10;
            }
            i3 = i4;
            str = U.getMessage();
        } else {
            str = ge8Var;
            i3 = 0;
        }
        return new ge8(i2, j2, j6, f2, j5, i3, str, elapsedRealtime, arrayList, j, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    @Override // yw6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(String str, Bundle bundle) {
        boolean z;
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        r7a r7aVar = new r7a(str, bundle);
        boolean i = un2.i(str);
        lx6 lx6Var = this.p;
        Object[] objArr = 0;
        if (!i) {
            h0(r7aVar, 0, new xx6(this, r7aVar, bundle), ((bx6) lx6Var.b).c());
            return;
        }
        try {
            un2 c = un2.c(r7aVar);
            int i2 = c.b;
            Object obj = c.g;
            if (!c.a()) {
                ncd.f("MediaSessionLegacyStub", "Can't execute predefined custom command: ".concat(str));
                return;
            }
            r7a r7aVar2 = c.a;
            if (r7aVar2 != null) {
                jte.p(r7aVar2.a == 40010);
                obj.getClass();
                h0(null, 40010, new xx6(this, (g19) obj), ((bx6) lx6Var.b).c());
                return;
            }
            tx6 tx6Var = this.j;
            tx6Var.t();
            cf8 cf8Var = tx6Var.t;
            if (i2 == 1) {
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                } else if (!cf8Var.s()) {
                    z = true;
                }
                if (!z) {
                    g0(1, new xx6(this, (byte) 6), ((bx6) lx6Var.b).c(), false);
                    return;
                } else if (i2 != 31) {
                    g0(i2, new cy6(this, c, objArr == true ? 1 : 0), ((bx6) lx6Var.b).c(), true);
                    return;
                } else {
                    obj.getClass();
                    k0((bt6) obj, false, false);
                    return;
                }
            }
            z = false;
            if (!z) {
            }
        } catch (RuntimeException e) {
            ncd.g("MediaSessionLegacyStub", "Failed to convert predefined custom command: ".concat(r7aVar.b), e);
        }
    }

    public final void g0(int i, ky6 ky6Var, my6 my6Var, boolean z) {
        if (this.j.i()) {
            return;
        }
        if (my6Var != null) {
            m0(new al3(this, my6Var, i, ky6Var, z));
            return;
        }
        ncd.b("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i);
    }

    @Override // yw6
    public final void h() {
        g0(12, new xx6(this, (byte) 5), ((bx6) this.p.b).c(), true);
    }

    public final void h0(final r7a r7aVar, final int i, final ky6 ky6Var, final my6 my6Var) {
        if (my6Var != null) {
            m0(new Runnable() { // from class: by6
                @Override // java.lang.Runnable
                public final void run() {
                    final ly6 ly6Var = ly6.this;
                    final r7a r7aVar2 = r7aVar;
                    final char c = i;
                    final ky6 ky6Var2 = ky6Var;
                    ly6Var.j0(my6Var, new ky6() { // from class: ey6
                        @Override // ky6
                        public final void a(sw6 sw6Var) {
                            ky6 ky6Var3 = ky6Var2;
                            mx6 mx6Var = ly6.this.g;
                            r7a r7aVar3 = r7aVar2;
                            if (r7aVar3 != null) {
                                if (!mx6Var.c0(sw6Var, r7aVar3)) {
                                    return;
                                }
                            } else if (!mx6Var.a0(sw6Var, c)) {
                                return;
                            }
                            try {
                                ky6Var3.a(sw6Var);
                            } catch (RemoteException e) {
                                ncd.g("MediaSessionLegacyStub", "Exception in " + sw6Var, e);
                            }
                        }
                    });
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        Object obj = r7aVar;
        if (r7aVar == null) {
            obj = Integer.valueOf(i);
        }
        sb.append(obj);
        ncd.b("MediaSessionLegacyStub", sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    @Override // yw6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Intent intent) {
        boolean z;
        my6 c = ((bx6) this.p.b).c();
        c.getClass();
        sw6 sw6Var = new sw6(c, 0, 0, false, null, Bundle.EMPTY);
        tx6 tx6Var = this.j;
        ly6 ly6Var = tx6Var.h;
        Context context = tx6Var.f;
        qx6 qx6Var = tx6Var.d;
        KeyEvent a = bfe.a(intent);
        ComponentName component = intent.getComponent();
        if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && ((component == null || Objects.equals(component.getPackageName(), context.getPackageName())) && a != null)) {
            tx6Var.t();
            tx6Var.e.getClass();
            if (a.getAction() != 0) {
                int keyCode = a.getKeyCode();
                if (keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 272 && keyCode != 273) {
                    switch (keyCode) {
                    }
                    return true;
                }
                return true;
            }
            int keyCode2 = a.getKeyCode();
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.software.leanback");
            fp6 fp6Var = null;
            if (keyCode2 != 79 && keyCode2 != 85) {
                fp6 fp6Var2 = qx6Var.a;
                if (fp6Var2 != null) {
                    qx6Var.removeCallbacks(fp6Var2);
                    fp6 fp6Var3 = qx6Var.a;
                    qx6Var.a = null;
                    fp6Var = fp6Var3;
                }
                if (fp6Var != null) {
                    hac.X(qx6Var, fp6Var);
                }
            } else if (hasSystemFeature || a.getRepeatCount() != 0) {
                fp6 fp6Var4 = qx6Var.a;
                if (fp6Var4 != null) {
                    qx6Var.removeCallbacks(fp6Var4);
                    fp6 fp6Var5 = qx6Var.a;
                    qx6Var.a = null;
                    fp6Var = fp6Var5;
                }
                if (fp6Var != null) {
                    hac.X(qx6Var, fp6Var);
                }
            } else {
                fp6 fp6Var6 = qx6Var.a;
                if (fp6Var6 == null) {
                    fp6 fp6Var7 = new fp6((Object) qx6Var, (Object) sw6Var, (Object) a, (byte) 8);
                    qx6Var.a = fp6Var7;
                    qx6Var.postDelayed(fp6Var7, ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                if (fp6Var6 != null) {
                    qx6Var.removeCallbacks(fp6Var6);
                    qx6Var.a = null;
                }
                z = true;
                if (!tx6Var.x) {
                    boolean booleanExtra = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                    if (a.getRepeatCount() > 0 || tx6Var.a(a, z, booleanExtra)) {
                        return true;
                    }
                } else if ((keyCode2 == 85 || keyCode2 == 79) && z) {
                    ly6Var.S();
                    return true;
                }
            }
            z = false;
            if (!tx6Var.x) {
            }
        }
        return false;
    }

    public final void j0(my6 my6Var, ky6 ky6Var) {
        if (this.j.i()) {
            return;
        }
        if (!((bx6) this.p.b).a.isActive()) {
            ncd.f("MediaSessionLegacyStub", "Ignore incoming command before initialization. pid=" + my6Var.a.b);
            return;
        }
        sw6 N = this.g.N(my6Var);
        if (N != null) {
            c1 c1Var = this.m;
            long j = this.t;
            c1Var.removeMessages(1001, N);
            c1Var.sendMessageDelayed(c1Var.obtainMessage(1001, N), j);
            try {
                ky6Var.a(N);
                return;
            } catch (RemoteException e) {
                ncd.g("MediaSessionLegacyStub", "Exception in " + N, e);
                return;
            }
        }
        if (this.h.containsKey(my6Var)) {
            List list = (List) this.i.get(my6Var);
            list.getClass();
            list.add(ky6Var);
            return;
        }
        iy6 iy6Var = new iy6(my6Var);
        sw6 sw6Var = new sw6(my6Var, 0, 0, this.k.E0(my6Var), iy6Var, Bundle.EMPTY);
        t76 l = this.j.l(sw6Var);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ky6Var);
        this.i.put(my6Var, arrayList);
        l.b(new us4((Object) l, (Object) new in3(this, my6Var, iy6Var, sw6Var), (byte) 0), new rf2(this, (byte) 4));
    }

    @Override // yw6
    public final void k() {
        g0(1, new xx6(this, (byte) 12), ((bx6) this.p.b).c(), true);
    }

    public final void k0(final bt6 bt6Var, final boolean z, final boolean z2) {
        g0(31, new ky6() { // from class: vx6
            @Override // ky6
            public final void a(sw6 sw6Var) {
                ly6 ly6Var = ly6.this;
                q9a o = ly6Var.j.o(sw6Var, mo5.u(bt6Var), -1, -9223372036854775807L);
                s34 s34Var = new s34();
                s34Var.d = ly6Var;
                s34Var.c = sw6Var;
                s34Var.a = z;
                s34Var.b = z2;
                o.b(new us4(o, s34Var, (byte) 0), new rf2(ly6Var, (byte) 4));
            }
        }, ((bx6) this.p.b).c(), false);
    }

    public final boolean l0() {
        tx6 tx6Var = this.j;
        tx6Var.t();
        return this.A.a(17) && tx6Var.t.q().a(17);
    }

    public final void m0(Runnable runnable) {
        hac.X(this.j.l, runnable);
    }

    @Override // yw6
    public final void n() {
        g0(1, new xx6(this, (byte) 6), ((bx6) this.p.b).c(), false);
    }

    public final void n0() {
        int i = Build.VERSION.SDK_INT;
        tx6 tx6Var = this.j;
        lx6 lx6Var = this.p;
        if (i < 31) {
            ComponentName componentName = this.r;
            if (componentName == null) {
                ((bx6) lx6Var.b).a.setMediaButtonReceiver(null);
            } else {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", tx6Var.b);
                intent.setComponent(componentName);
                ((bx6) lx6Var.b).a.setMediaButtonReceiver(PendingIntent.getBroadcast(tx6Var.f, 0, intent, B));
            }
        }
        zk zkVar = this.q;
        if (zkVar != null) {
            tx6Var.f.unregisterReceiver(zkVar);
        }
        al alVar = this.o;
        if (alVar != null && !alVar.f.getAndSet(true)) {
            alVar.c.execute(new yk(alVar, (byte) 0));
        }
        bx6 bx6Var = (bx6) lx6Var.b;
        MediaSession mediaSession = bx6Var.a;
        bx6Var.f.kill();
        if (i == 27) {
            try {
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e) {
                ncd.g("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
            }
        }
        mediaSession.setCallback(null);
        bx6Var.b.a.clear();
        mediaSession.release();
        ((WeakReference) this.g.d).clear();
    }

    public final void o0() {
        al alVar;
        int i;
        mo5 mo5Var = this.y;
        s7a s7aVar = this.z;
        ne8 ne8Var = this.A;
        String str = un2.h;
        jo5 jo5Var = new jo5(4);
        for (int i2 = 0; i2 < mo5Var.size(); i2++) {
            un2 un2Var = (un2) mo5Var.get(i2);
            r7a r7aVar = un2Var.a;
            if ((r7aVar == null || !s7aVar.a.contains(r7aVar)) && ((i = un2Var.b) == -1 || !ne8Var.a(i))) {
                if (un2Var.f) {
                    un2Var = new un2(un2Var.a, un2Var.b, un2Var.c, new Bundle(un2Var.d), false, un2Var.e, un2Var.g);
                }
                jo5Var.c(un2Var);
            } else {
                jo5Var.c(un2Var);
            }
        }
        this.x = un2.f(jo5Var.f());
        boolean z = this.n;
        Bundle bundle = this.w;
        if (!z || ((alVar = this.o) != null && alVar.e.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !un2.b(2, this.x));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !un2.b(3, this.x));
        } else {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.x.isEmpty() || un2.b(2, this.x)) ? false : true);
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        }
    }

    public final void p0() {
        Bundle bundle = this.w;
        boolean z = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        o0();
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z && bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z2) {
            return;
        }
        ((bx6) this.p.b).a.setExtras(bundle);
    }

    @Override // yw6
    public final void q(String str, Bundle bundle) {
        k0(e0(str, null, null, bundle), true, true);
    }

    public final void q0(cf8 cf8Var) {
        m0(new fy6(this, cf8Var, (byte) 1));
    }

    @Override // yw6
    public final void u(String str, Bundle bundle) {
        k0(e0(null, null, str, bundle), true, true);
    }

    @Override // yw6
    public final void v(Uri uri, Bundle bundle) {
        k0(e0(null, uri, null, bundle), true, true);
    }

    @Override // yw6
    public final void w() {
        g0(2, new xx6(this, (byte) 7), ((bx6) this.p.b).c(), true);
    }

    @Override // yw6
    public final void x(String str, Bundle bundle) {
        k0(e0(str, null, null, bundle), true, false);
    }
}
