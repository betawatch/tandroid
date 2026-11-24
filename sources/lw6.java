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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class lw6 extends yu6 {
    public static final int B;
    public kc8 A;
    public final mv6 g;
    public final ps h;
    public final ps i;
    public final tv6 j;
    public final lj9 k;
    public final spc l;
    public final c1 m;
    public final boolean n;
    public final ak o;
    public final lv6 p;
    public final zj q;
    public final ComponentName r;
    public final boolean s;
    public volatile int t;
    public spc u;
    public byte v;
    public final Bundle w;
    public mm5 x;
    public mm5 y;
    public q5a z;

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
    public lw6(tv6 tv6Var, Uri uri, Handler handler, Bundle bundle, w59 w59Var, w59 w59Var2, q5a q5aVar, kc8 kc8Var, Bundle bundle2) {
        super((byte) 0);
        boolean z;
        List<ResolveInfo> queryBroadcastReceivers;
        ComponentName componentName;
        ComponentName i0;
        PendingIntent foregroundService;
        lv6 lv6Var;
        ComponentName componentName2;
        PendingIntent pendingIntent;
        String str;
        Bundle bundle3;
        this.j = tv6Var;
        boolean z2 = true;
        this.s = true;
        this.x = w59Var;
        this.y = w59Var2;
        this.z = q5aVar;
        this.A = kc8Var;
        this.w = new Bundle(bundle2);
        this.h = new ps(0);
        this.i = new ps(0);
        Context context = tv6Var.f;
        this.k = lj9.A(context);
        this.l = new spc(this);
        mv6 mv6Var = new mv6(tv6Var);
        this.g = mv6Var;
        this.t = 300000;
        this.m = new c1(tv6Var.l.getLooper(), mv6Var);
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            String str2 = g8c.a;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                String str3 = Build.MANUFACTURER;
                if (str3.equals("Google") || str3.equals("motorola") || str3.equals("vivo") || str3.equals("Sony") || str3.equals("Nothing") || str3.equals("unknown")) {
                    z = true;
                    this.n = z;
                    if (!w59Var2.isEmpty()) {
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
                            lad.f("MediaSessionLegacyStub", "Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found " + queryBroadcastReceivers.size() + ". Using runtime media button receiver instead.");
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
                        zj zjVar = new zj(this, (byte) 9);
                        this.q = zjVar;
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
                        String scheme = uri.getScheme();
                        String str4 = g8c.a;
                        intentFilter.addDataScheme(scheme);
                        if (i < 33) {
                            context.registerReceiver(zjVar, intentFilter);
                        } else {
                            context.registerReceiver(zjVar, intentFilter, 4);
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
                    String join = TextUtils.join(".", new String[]{"androidx.media3.session.id", tv6Var.i});
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
                    lv6Var = new lv6(context, str, componentName2, pendingIntent, bundle3);
                    this.p = lv6Var;
                    if (i >= 31 && componentName != null) {
                        yz.z(lv6Var, componentName);
                    }
                    lv6Var.H(this, handler);
                    this.o = z ? new ak(context, new uv6(this, (byte) 0)) : null;
                }
            }
        }
        z = false;
        this.n = z;
        if (!w59Var2.isEmpty()) {
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
        String join2 = TextUtils.join(".", new String[]{"androidx.media3.session.id", tv6Var.i});
        if (i >= 31) {
        }
        lv6Var = new lv6(context, str, componentName2, pendingIntent, bundle3);
        this.p = lv6Var;
        if (i >= 31) {
            yz.z(lv6Var, componentName);
        }
        lv6Var.H(this, handler);
        this.o = z ? new ak(context, new uv6(this, (byte) 0)) : null;
    }

    public static br6 e0(String str, Uri uri, String str2, Bundle bundle) {
        pq6 pq6Var = new pq6();
        if (str == null) {
            str = "";
        }
        pq6Var.a = str;
        xl3 xl3Var = new xl3((byte) 16, false);
        xl3Var.b = uri;
        xl3Var.c = str2;
        xl3Var.d = bundle;
        pq6Var.i = new yq6(xl3Var);
        return pq6Var.a();
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

    @Override // yu6
    public final void A(String str, Bundle bundle) {
        k0(e0(null, null, str, bundle), true, false);
    }

    @Override // yu6
    public final void D(Uri uri, Bundle bundle) {
        k0(e0(null, uri, null, bundle), true, false);
    }

    @Override // yu6
    public final void E(kq6 kq6Var) {
        if (kq6Var == null) {
            return;
        }
        g0(20, new cw6(this, kq6Var, (byte) 1), ((bv6) this.p.b).c(), true);
    }

    @Override // yu6
    public final void F() {
        g0(11, new xv6(this, (byte) 4), ((bv6) this.p.b).c(), true);
    }

    @Override // yu6
    public final void G(long j) {
        g0(5, new wv6(this, j, (byte) 1), ((bv6) this.p.b).c(), true);
    }

    @Override // yu6
    public final void J(final float f) {
        if (f <= 0.0f) {
            return;
        }
        g0(13, new kw6() { // from class: gw6
            @Override // kw6
            public final void a(su6 su6Var) {
                tv6 tv6Var = lw6.this.j;
                tv6Var.t();
                tv6Var.t.c(f);
            }
        }, ((bv6) this.p.b).c(), true);
    }

    @Override // yu6
    public final void K(hz8 hz8Var) {
        L(hz8Var);
    }

    @Override // yu6
    public final void L(hz8 hz8Var) {
        fz8 c = j06.c(hz8Var);
        if (c != null) {
            h0(null, 40010, new xv6(this, c), ((bv6) this.p.b).c());
            return;
        }
        lad.f("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + hz8Var);
    }

    @Override // yu6
    public final void M(int i) {
        g0(15, new zv6(this, i, (byte) 0), ((bv6) this.p.b).c(), true);
    }

    @Override // yu6
    public final void P(int i) {
        g0(14, new zv6(this, i, (byte) 1), ((bv6) this.p.b).c(), true);
    }

    @Override // yu6
    public final void S() {
        tv6 tv6Var = this.j;
        tv6Var.t();
        boolean m0 = tv6Var.t.m0(9);
        lv6 lv6Var = this.p;
        if (m0) {
            g0(9, new xv6(this, (byte) 10), ((bv6) lv6Var.b).c(), true);
        } else {
            g0(8, new xv6(this, (byte) 11), ((bv6) lv6Var.b).c(), true);
        }
    }

    @Override // yu6
    public final void V() {
        tv6 tv6Var = this.j;
        tv6Var.t();
        boolean m0 = tv6Var.t.m0(7);
        lv6 lv6Var = this.p;
        if (m0) {
            g0(7, new xv6(this, (byte) 2), ((bv6) lv6Var.b).c(), true);
        } else {
            g0(6, new xv6(this, (byte) 3), ((bv6) lv6Var.b).c(), true);
        }
    }

    @Override // yu6
    public final void Y(long j) {
        if (j < 0) {
            return;
        }
        g0(10, new wv6(this, j, (byte) 0), ((bv6) this.p.b).c(), true);
    }

    @Override // yu6
    public final void b0() {
        g0(3, new xv6(this, (byte) 8), ((bv6) this.p.b).c(), true);
    }

    @Override // yu6
    public final void c(kq6 kq6Var) {
        if (kq6Var != null) {
            g0(20, new yv6(this, kq6Var, -1), ((bv6) this.p.b).c(), false);
        }
    }

    @Override // yu6
    public final void d(kq6 kq6Var, int i) {
        if (kq6Var != null) {
            if (i == -1 || i >= 0) {
                g0(20, new yv6(this, kq6Var, i), ((bv6) this.p.b).c(), false);
            }
        }
    }

    @Override // yu6
    public final void e(String str, final Bundle bundle, final ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (!str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") || resultReceiver == null) {
            final p5a p5aVar = new p5a(str, Bundle.EMPTY);
            h0(p5aVar, 0, new kw6(p5aVar, bundle, resultReceiver) { // from class: aw6
                public final /* synthetic */ Bundle b;
                public final /* synthetic */ ResultReceiver c;

                {
                    this.b = bundle;
                    this.c = resultReceiver;
                }

                @Override // kw6
                public final void a(su6 su6Var) {
                    tv6 tv6Var = lw6.this.j;
                    if (this.b == null) {
                        Bundle bundle2 = Bundle.EMPTY;
                    }
                    am5 m = tv6Var.m(su6Var);
                    ResultReceiver resultReceiver2 = this.c;
                    if (resultReceiver2 != null) {
                        m.b(new oh6(m, resultReceiver2, (byte) 16), vn3.a);
                    }
                }
            }, ((bv6) this.p.b).c());
            return;
        }
        s6a s6aVar = this.j.j;
        s6aVar.getClass();
        Bundle bundle2 = new Bundle();
        t6a t6aVar = s6aVar.a;
        bundle2.putInt(s6a.b, 0);
        String str2 = s6a.c;
        Bundle bundle3 = new Bundle();
        bundle3.putInt(t6a.f, t6aVar.a);
        bundle3.putInt(t6a.g, 0);
        bundle3.putInt(t6a.h, 1011001300);
        bundle3.putString(t6a.i, t6aVar.b);
        bundle3.putString(t6a.j, "");
        bundle3.putBinder(t6a.l, t6aVar.c);
        bundle3.putParcelable(t6a.k, null);
        bundle3.putBundle(t6a.m, t6aVar.d);
        bundle3.putInt(t6a.n, 10);
        MediaSession.Token token = t6aVar.e;
        if (token != null) {
            bundle3.putParcelable(t6a.o, token);
        }
        bundle2.putBundle(str2, bundle3);
        resultReceiver.send(0, bundle2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dc8 f0(ad8 ad8Var) {
        int i;
        int i2;
        long j;
        long j2;
        String str;
        int i3;
        int i4;
        int i5;
        long j3;
        j54 U = ad8Var.U();
        boolean z = ad8Var.m0(16) && !ad8Var.P0();
        boolean z2 = U != null || g8c.d0(ad8Var, this.s);
        Object obj = null;
        if (U != null) {
            i2 = 7;
        } else {
            int i6 = j06.a;
            if (ad8Var.U() != null) {
                i = 7;
            } else {
                int h = ad8Var.h();
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
                        w26.j(de9.k(h, "Unrecognized State: "));
                        return null;
                    }
                    i = 1;
                }
            }
            i2 = i;
        }
        kc8 a = woe.a(this.A, ad8Var.q());
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
        dc8 dc8Var = obj;
        if (!this.y.isEmpty() && hm2.b(2, this.x)) {
            j4 &= -17;
        }
        if (!this.y.isEmpty() && hm2.b(3, this.x)) {
            j4 &= -33;
        }
        if (!z) {
            j4 &= -257;
        }
        long j5 = j4;
        long j6 = -1;
        if (ad8Var.m0(17)) {
            int l0 = ad8Var.l0();
            int i8 = j06.a;
            j = l0 == -1 ? -1L : l0;
        } else {
            j = -1;
        }
        float f = ad8Var.g().a;
        float f2 = (ad8Var.j() && z) ? f : 0.0f;
        Bundle bundle = U != null ? new Bundle(U.c) : new Bundle();
        bundle.putAll(this.w);
        bundle.putFloat("EXO_SPEED", f);
        br6 S0 = ad8Var.S0();
        if (S0 != null) {
            String str2 = S0.a;
            if (!"".equals(str2)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        if (z) {
            long m = ad8Var.m();
            j6 = ad8Var.b0();
            j2 = m;
        } else {
            j2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i9 = 0; i9 < this.x.size(); i9++) {
            hm2 hm2Var = (hm2) this.x.get(i9);
            p5a p5aVar = hm2Var.a;
            Bundle bundle2 = hm2Var.d;
            if (p5aVar != null) {
                Bundle bundle3 = p5aVar.c;
                String str3 = p5aVar.b;
                if (hm2Var.f && p5aVar.a == 0) {
                    q5a q5aVar = this.z;
                    if ((p5aVar != null && q5aVar.a.contains(p5aVar)) || (((i5 = hm2Var.b) != -1 && a.a(i5)) || hm2.i(str3))) {
                        if (!bundle2.isEmpty()) {
                            bundle3 = new Bundle(bundle3);
                        }
                        if (!bundle2.isEmpty()) {
                            bundle3.putAll(bundle2);
                        }
                        if (TextUtils.isEmpty(str3)) {
                            w26.j("You must specify an action to build a CustomAction");
                            return dc8Var;
                        }
                        w26.j("You must specify a name to build a CustomAction");
                        return dc8Var;
                    }
                }
            }
        }
        if (U != null) {
            int i10 = j06.a;
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
            str = dc8Var;
            i3 = 0;
        }
        return new dc8(i2, j2, j6, f2, j5, i3, str, elapsedRealtime, arrayList, j, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    @Override // yu6
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
        p5a p5aVar = new p5a(str, bundle);
        boolean i = hm2.i(str);
        lv6 lv6Var = this.p;
        Object[] objArr = 0;
        if (!i) {
            h0(p5aVar, 0, new xv6(this, p5aVar, bundle), ((bv6) lv6Var.b).c());
            return;
        }
        try {
            hm2 c = hm2.c(p5aVar);
            int i2 = c.b;
            Object obj = c.g;
            if (!c.a()) {
                lad.f("MediaSessionLegacyStub", "Can't execute predefined custom command: ".concat(str));
                return;
            }
            p5a p5aVar2 = c.a;
            if (p5aVar2 != null) {
                gre.p(p5aVar2.a == 40010);
                obj.getClass();
                h0(null, 40010, new xv6(this, (fz8) obj), ((bv6) lv6Var.b).c());
                return;
            }
            tv6 tv6Var = this.j;
            tv6Var.t();
            ad8 ad8Var = tv6Var.t;
            if (i2 == 1) {
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                } else if (!ad8Var.s()) {
                    z = true;
                }
                if (!z) {
                    g0(1, new xv6(this, (byte) 6), ((bv6) lv6Var.b).c(), false);
                    return;
                } else if (i2 != 31) {
                    g0(i2, new cw6(this, c, objArr == true ? 1 : 0), ((bv6) lv6Var.b).c(), true);
                    return;
                } else {
                    obj.getClass();
                    k0((br6) obj, false, false);
                    return;
                }
            }
            z = false;
            if (!z) {
            }
        } catch (RuntimeException e) {
            lad.g("MediaSessionLegacyStub", "Failed to convert predefined custom command: ".concat(p5aVar.b), e);
        }
    }

    public final void g0(int i, kw6 kw6Var, mw6 mw6Var, boolean z) {
        if (this.j.i()) {
            return;
        }
        if (mw6Var != null) {
            m0(new pj3(this, mw6Var, i, kw6Var, z));
            return;
        }
        lad.b("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i);
    }

    @Override // yu6
    public final void h() {
        g0(12, new xv6(this, (byte) 5), ((bv6) this.p.b).c(), true);
    }

    public final void h0(final p5a p5aVar, final int i, final kw6 kw6Var, final mw6 mw6Var) {
        if (mw6Var != null) {
            m0(new Runnable() { // from class: bw6
                @Override // java.lang.Runnable
                public final void run() {
                    final lw6 lw6Var = lw6.this;
                    final p5a p5aVar2 = p5aVar;
                    final char c = i;
                    final kw6 kw6Var2 = kw6Var;
                    lw6Var.j0(mw6Var, new kw6() { // from class: ew6
                        @Override // kw6
                        public final void a(su6 su6Var) {
                            kw6 kw6Var3 = kw6Var2;
                            mv6 mv6Var = lw6.this.g;
                            p5a p5aVar3 = p5aVar2;
                            if (p5aVar3 != null) {
                                if (!mv6Var.Z(su6Var, p5aVar3)) {
                                    return;
                                }
                            } else if (!mv6Var.Y(su6Var, c)) {
                                return;
                            }
                            try {
                                kw6Var3.a(su6Var);
                            } catch (RemoteException e) {
                                lad.g("MediaSessionLegacyStub", "Exception in " + su6Var, e);
                            }
                        }
                    });
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        Object obj = p5aVar;
        if (p5aVar == null) {
            obj = Integer.valueOf(i);
        }
        sb.append(obj);
        lad.b("MediaSessionLegacyStub", sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    @Override // yu6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Intent intent) {
        boolean z;
        mw6 c = ((bv6) this.p.b).c();
        c.getClass();
        su6 su6Var = new su6(c, 0, 0, false, null, Bundle.EMPTY);
        tv6 tv6Var = this.j;
        lw6 lw6Var = tv6Var.h;
        Context context = tv6Var.f;
        qv6 qv6Var = tv6Var.d;
        KeyEvent a = ade.a(intent);
        ComponentName component = intent.getComponent();
        if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && ((component == null || Objects.equals(component.getPackageName(), context.getPackageName())) && a != null)) {
            tv6Var.t();
            tv6Var.e.getClass();
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
            lo6 lo6Var = null;
            if (keyCode2 != 79 && keyCode2 != 85) {
                lo6 lo6Var2 = qv6Var.a;
                if (lo6Var2 != null) {
                    qv6Var.removeCallbacks(lo6Var2);
                    lo6 lo6Var3 = qv6Var.a;
                    qv6Var.a = null;
                    lo6Var = lo6Var3;
                }
                if (lo6Var != null) {
                    g8c.X(qv6Var, lo6Var);
                }
            } else if (hasSystemFeature || a.getRepeatCount() != 0) {
                lo6 lo6Var4 = qv6Var.a;
                if (lo6Var4 != null) {
                    qv6Var.removeCallbacks(lo6Var4);
                    lo6 lo6Var5 = qv6Var.a;
                    qv6Var.a = null;
                    lo6Var = lo6Var5;
                }
                if (lo6Var != null) {
                    g8c.X(qv6Var, lo6Var);
                }
            } else {
                lo6 lo6Var6 = qv6Var.a;
                if (lo6Var6 == null) {
                    lo6 lo6Var7 = new lo6((Object) qv6Var, (Object) su6Var, (Object) a, (byte) 6);
                    qv6Var.a = lo6Var7;
                    qv6Var.postDelayed(lo6Var7, ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                if (lo6Var6 != null) {
                    qv6Var.removeCallbacks(lo6Var6);
                    qv6Var.a = null;
                }
                z = true;
                if (!tv6Var.x) {
                    boolean booleanExtra = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                    if (a.getRepeatCount() > 0 || tv6Var.a(a, z, booleanExtra)) {
                        return true;
                    }
                } else if ((keyCode2 == 85 || keyCode2 == 79) && z) {
                    lw6Var.S();
                    return true;
                }
            }
            z = false;
            if (!tv6Var.x) {
            }
        }
        return false;
    }

    public final void j0(mw6 mw6Var, kw6 kw6Var) {
        if (this.j.i()) {
            return;
        }
        if (!((bv6) this.p.b).a.isActive()) {
            lad.f("MediaSessionLegacyStub", "Ignore incoming command before initialization. pid=" + mw6Var.a.b);
            return;
        }
        su6 L = this.g.L(mw6Var);
        if (L != null) {
            c1 c1Var = this.m;
            long j = this.t;
            c1Var.removeMessages(1001, L);
            c1Var.sendMessageDelayed(c1Var.obtainMessage(1001, L), j);
            try {
                kw6Var.a(L);
                return;
            } catch (RemoteException e) {
                lad.g("MediaSessionLegacyStub", "Exception in " + L, e);
                return;
            }
        }
        if (this.h.containsKey(mw6Var)) {
            List list = (List) this.i.get(mw6Var);
            list.getClass();
            list.add(kw6Var);
            return;
        }
        iw6 iw6Var = new iw6(mw6Var);
        su6 su6Var = new su6(mw6Var, 0, 0, this.k.E(mw6Var), iw6Var, Bundle.EMPTY);
        t56 l = this.j.l(su6Var);
        ArrayList arrayList = new ArrayList();
        arrayList.add(kw6Var);
        this.i.put(mw6Var, arrayList);
        l.b(new tq4((Object) l, (Object) new xl3(this, mw6Var, iw6Var, su6Var), (byte) 0), new ge2(this, (byte) 4));
    }

    @Override // yu6
    public final void k() {
        g0(1, new xv6(this, (byte) 12), ((bv6) this.p.b).c(), true);
    }

    public final void k0(final br6 br6Var, final boolean z, final boolean z2) {
        g0(31, new kw6() { // from class: vv6
            @Override // kw6
            public final void a(su6 su6Var) {
                lw6 lw6Var = lw6.this;
                p7a o = lw6Var.j.o(su6Var, mm5.u(br6Var), -1, -9223372036854775807L);
                h24 h24Var = new h24();
                h24Var.d = lw6Var;
                h24Var.c = su6Var;
                h24Var.a = z;
                h24Var.b = z2;
                o.b(new tq4(o, h24Var, (byte) 0), new ge2(lw6Var, (byte) 4));
            }
        }, ((bv6) this.p.b).c(), false);
    }

    public final boolean l0() {
        tv6 tv6Var = this.j;
        tv6Var.t();
        return this.A.a(17) && tv6Var.t.q().a(17);
    }

    public final void m0(Runnable runnable) {
        g8c.X(this.j.l, runnable);
    }

    @Override // yu6
    public final void n() {
        g0(1, new xv6(this, (byte) 6), ((bv6) this.p.b).c(), false);
    }

    public final void n0() {
        int i = Build.VERSION.SDK_INT;
        tv6 tv6Var = this.j;
        lv6 lv6Var = this.p;
        if (i < 31) {
            ComponentName componentName = this.r;
            if (componentName == null) {
                ((bv6) lv6Var.b).a.setMediaButtonReceiver(null);
            } else {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", tv6Var.b);
                intent.setComponent(componentName);
                ((bv6) lv6Var.b).a.setMediaButtonReceiver(PendingIntent.getBroadcast(tv6Var.f, 0, intent, B));
            }
        }
        zj zjVar = this.q;
        if (zjVar != null) {
            tv6Var.f.unregisterReceiver(zjVar);
        }
        ak akVar = this.o;
        if (akVar != null && !akVar.f.getAndSet(true)) {
            akVar.c.execute(new yj(akVar, (byte) 0));
        }
        bv6 bv6Var = (bv6) lv6Var.b;
        MediaSession mediaSession = bv6Var.a;
        bv6Var.f.kill();
        if (i == 27) {
            try {
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e) {
                lad.g("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
            }
        }
        mediaSession.setCallback(null);
        bv6Var.b.a.clear();
        mediaSession.release();
        ((WeakReference) this.g.d).clear();
    }

    public final void o0() {
        ak akVar;
        int i;
        mm5 mm5Var = this.y;
        q5a q5aVar = this.z;
        kc8 kc8Var = this.A;
        String str = hm2.h;
        jm5 jm5Var = new jm5(4);
        for (int i2 = 0; i2 < mm5Var.size(); i2++) {
            hm2 hm2Var = (hm2) mm5Var.get(i2);
            p5a p5aVar = hm2Var.a;
            if ((p5aVar == null || !q5aVar.a.contains(p5aVar)) && ((i = hm2Var.b) == -1 || !kc8Var.a(i))) {
                if (hm2Var.f) {
                    hm2Var = new hm2(hm2Var.a, hm2Var.b, hm2Var.c, new Bundle(hm2Var.d), false, hm2Var.e, hm2Var.g);
                }
                jm5Var.c(hm2Var);
            } else {
                jm5Var.c(hm2Var);
            }
        }
        this.x = hm2.f(jm5Var.f());
        boolean z = this.n;
        Bundle bundle = this.w;
        if (!z || ((akVar = this.o) != null && akVar.e.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !hm2.b(2, this.x));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !hm2.b(3, this.x));
        } else {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.x.isEmpty() || hm2.b(2, this.x)) ? false : true);
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
        ((bv6) this.p.b).a.setExtras(bundle);
    }

    @Override // yu6
    public final void q(String str, Bundle bundle) {
        k0(e0(str, null, null, bundle), true, true);
    }

    public final void q0(ad8 ad8Var) {
        m0(new fw6(this, ad8Var, (byte) 1));
    }

    @Override // yu6
    public final void u(String str, Bundle bundle) {
        k0(e0(null, null, str, bundle), true, true);
    }

    @Override // yu6
    public final void v(Uri uri, Bundle bundle) {
        k0(e0(null, uri, null, bundle), true, true);
    }

    @Override // yu6
    public final void w() {
        g0(2, new xv6(this, (byte) 7), ((bv6) this.p.b).c(), true);
    }

    @Override // yu6
    public final void x(String str, Bundle bundle) {
        k0(e0(str, null, null, bundle), true, false);
    }
}
