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
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import fi.l3;
import hg.c2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k0 extends n4.p {
    public static final int w;
    public final fg.f f;
    public final a0 g;
    public final n4.d0 h;
    public final i0 i;
    public final androidx.mediarouter.app.c j;
    public final n4.y k;
    public final androidx.mediarouter.app.g l;
    public final ComponentName m;
    public final boolean n = true;
    public volatile long o;
    public i0 p;
    public int q;
    public final Bundle r;
    public e9.i0 s;
    public e9.i0 t;
    public m1 u;
    public b2.x0 v;

    static {
        w = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
    
        if (r7.equals(r2) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(a0 a0Var, Uri uri, Handler handler, Bundle bundle, e9.i0 i0Var, e9.i0 i0Var2, m1 m1Var, b2.x0 x0Var, Bundle bundle2) {
        ComponentName componentName;
        ComponentName J;
        PendingIntent foregroundService;
        PendingIntent pendingIntent;
        ComponentName componentName2;
        this.g = a0Var;
        boolean z10 = true;
        this.s = i0Var;
        this.t = i0Var2;
        this.u = m1Var;
        this.v = x0Var;
        this.r = new Bundle(bundle2);
        Context context = a0Var.f;
        this.h = n4.d0.a(context);
        this.i = new i0(this);
        fg.f fVar = new fg.f(a0Var);
        this.f = fVar;
        this.o = 300000L;
        this.j = new androidx.mediarouter.app.c(a0Var.l.getLooper(), fVar);
        if (!i0Var2.isEmpty()) {
            M();
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else {
            if (queryBroadcastReceivers.size() > 1) {
                e2.a.n("MediaSessionLegacyStub", "Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found " + queryBroadcastReceivers.size() + ". Using runtime media button receiver instead.");
            }
            componentName = null;
        }
        this.m = componentName;
        if (componentName == null || Build.VERSION.SDK_INT < 31) {
            J = J(context, "androidx.media3.session.MediaLibraryService");
            J = J == null ? J(context, "androidx.media3.session.MediaSessionService") : J;
            if (J != null) {
            }
        } else {
            J = componentName;
        }
        z10 = false;
        Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
        if (J == null) {
            androidx.mediarouter.app.g gVar = new androidx.mediarouter.app.g(this, 6);
            this.l = gVar;
            IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
            String scheme = uri.getScheme();
            String str = e2.d0.a;
            intentFilter.addDataScheme(scheme);
            if (Build.VERSION.SDK_INT < 33) {
                context.registerReceiver(gVar, intentFilter);
            } else {
                context.registerReceiver(gVar, intentFilter, 4);
            }
            intent2.setPackage(context.getPackageName());
            foregroundService = PendingIntent.getBroadcast(context, 0, intent2, w);
            J = new ComponentName(context, context.getClass());
        } else {
            intent2.setComponent(J);
            foregroundService = z10 ? Build.VERSION.SDK_INT >= 26 ? PendingIntent.getForegroundService(context, 0, intent2, w) : PendingIntent.getService(context, 0, intent2, w) : PendingIntent.getBroadcast(context, 0, intent2, w);
            this.l = null;
        }
        String join = TextUtils.join(".", new String[]{"androidx.media3.session.id", a0Var.i});
        int i10 = Build.VERSION.SDK_INT;
        J = i10 >= 31 ? null : J;
        if (i10 < 31) {
            componentName2 = J;
            pendingIntent = foregroundService;
        } else {
            ComponentName componentName3 = J;
            pendingIntent = null;
            componentName2 = componentName3;
        }
        n4.y yVar = new n4.y(context, join, componentName2, pendingIntent, bundle);
        this.k = yVar;
        if (i10 >= 31 && componentName != null) {
            e0.h0.g(yVar, componentName);
        }
        yVar.K(this, handler);
    }

    public static void D(n4.y yVar, ArrayList arrayList) {
        int i10 = 0;
        if (arrayList != null) {
            yVar.getClass();
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                long j3 = ((n4.v) obj).b;
                if (hashSet.contains(Long.valueOf(j3))) {
                    Log.e("MediaSessionCompat", a4.a.o(j3, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j3));
            }
        }
        n4.r rVar = (n4.r) yVar.b;
        MediaSession mediaSession = rVar.a;
        rVar.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            n4.v vVar = (n4.v) obj2;
            MediaSession.QueueItem queueItem = vVar.c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(vVar.a.a(), vVar.b);
                vVar.c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static void E(n4.y yVar, n4.m mVar) {
        n4.r rVar = (n4.r) yVar.b;
        rVar.i = mVar;
        MediaSession mediaSession = rVar.a;
        Bundle bundle = mVar.a;
        if (mVar.b == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) n4.m.c.get(str);
                if (num == null) {
                    num = -1;
                }
                int intValue = num.intValue();
                if (intValue == 0) {
                    builder.putLong(str, bundle.getLong(str));
                } else if (intValue == 1) {
                    builder.putText(str, bundle.getString(str));
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
            mVar.b = builder.build();
        }
        mediaSession.setMetadata(mVar.b);
    }

    public static b2.k0 F(String str, Uri uri, String str2, Bundle bundle) {
        b2.y yVar = new b2.y();
        e9.g0 g0Var = e9.i0.b;
        e9.a1 a1Var = e9.a1.e;
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var2 = e9.a1.e;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var2 = b2.g0.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        aa.a aVar = new aa.a(4);
        aVar.c = uri;
        aVar.b = str2;
        aVar.d = bundle;
        return new b2.k0(str3, new b2.a0(yVar), null, new b2.e0(d0Var), b2.n0.K, new b2.g0(aVar));
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

    @Override // n4.p
    public final void A(long j3) {
        if (j3 < 0) {
            return;
        }
        H(10, new c0(this, j3, 0), ((n4.r) this.k.b).c(), true);
    }

    @Override // n4.p
    public final void B() {
        H(3, new b0(this, 6), ((n4.r) this.k.b).c(), true);
    }

    public final n4.h0 G(j1 j1Var) {
        int i10;
        int i11;
        long j3;
        String str;
        int i12;
        long j10;
        b2.u0 W = j1Var.W();
        int i13 = 1;
        boolean z10 = j1Var.m0(16) && !j1Var.M0();
        boolean z11 = W != null || e2.d0.a0(j1Var, this.n);
        if (W != null) {
            i11 = 7;
        } else {
            int i14 = k.a;
            if (j1Var.W() != null) {
                i10 = 7;
            } else {
                int d = j1Var.d();
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
                        throw new IllegalArgumentException(i2.g.i(d, "Unrecognized State: "));
                    }
                    i10 = 1;
                }
            }
            i11 = i10;
        }
        b2.x0 a2 = w7.t.a(this.v, j1Var.t());
        long j11 = 128;
        for (int i15 = 0; i15 < a2.a.a.size(); i15++) {
            int a10 = a2.a.a(i15);
            if (a10 == 1) {
                j10 = z11 ? 516L : 514L;
            } else if (a10 == 2) {
                j10 = 16384;
            } else if (a10 == 3) {
                j10 = 1;
            } else if (a10 != 31) {
                switch (a10) {
                    case 5:
                        j10 = 256;
                        break;
                    case 6:
                    case 7:
                        j10 = 16;
                        break;
                    case 8:
                    case 9:
                        j10 = 32;
                        break;
                    case 10:
                        j10 = 4096;
                        break;
                    case 11:
                        j10 = 8;
                        break;
                    case 12:
                        j10 = 64;
                        break;
                    case 13:
                        j10 = 4194304;
                        break;
                    case 14:
                        j10 = 2621440;
                        break;
                    case 15:
                        j10 = 262144;
                        break;
                    default:
                        j10 = 0;
                        break;
                }
            } else {
                j10 = 240640;
            }
            j11 |= j10;
        }
        boolean isEmpty = this.t.isEmpty();
        Bundle bundle = this.r;
        if (!isEmpty && !bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS")) {
            j11 &= -17;
        }
        if (!this.t.isEmpty() && !bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            j11 &= -33;
        }
        if (!z10) {
            j11 &= -257;
        }
        long j12 = j11;
        if (j1Var.m0(17)) {
            int l02 = j1Var.l0();
            int i16 = k.a;
            j3 = l02 == -1 ? -1L : l02;
        } else {
            j3 = -1;
        }
        float f7 = j1Var.h().a;
        float f10 = (j1Var.i0() && z10) ? f7 : 0.0f;
        Bundle bundle2 = W != null ? new Bundle(W.c) : new Bundle();
        bundle2.putAll(bundle);
        bundle2.putFloat("EXO_SPEED", f7);
        b2.k0 P0 = j1Var.P0();
        if (P0 != null) {
            String str2 = P0.a;
            if (!"".equals(str2)) {
                bundle2.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        long J0 = z10 ? j1Var.J0() : -1L;
        long c02 = z10 ? j1Var.c0() : -1L;
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.s.size() > 0) {
            this.s.get(0).getClass();
            throw new ClassCastException();
        }
        if (W != null) {
            int i17 = k.a;
            int i18 = W.a;
            if (i18 == -110) {
                i13 = 8;
            } else if (i18 == -109) {
                i13 = 11;
            } else if (i18 == -6) {
                i13 = 2;
            } else if (i18 != -2) {
                if (i18 != 1) {
                    switch (i18) {
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
            }
            str = W.getMessage();
            i12 = i13;
        } else {
            str = null;
            i12 = 0;
        }
        return new n4.h0(i11, J0, c02, f10, j12, i12, str, elapsedRealtime, arrayList, j3, bundle2);
    }

    public final void H(int i10, j0 j0Var, n4.a0 a0Var, boolean z10) {
        a0 a0Var2 = this.g;
        if (a0Var2.j()) {
            return;
        }
        if (a0Var != null) {
            e2.d0.U(a0Var2.l, new e0(this, i10, a0Var, j0Var, z10));
            return;
        }
        e2.a.d("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i10);
    }

    public final void I(l1 l1Var, int i10, j0 j0Var, n4.a0 a0Var) {
        if (a0Var != null) {
            e2.d0.U(this.g.l, new l3(this, l1Var, i10, a0Var, j0Var, 5));
            return;
        }
        StringBuilder sb2 = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        Object obj = l1Var;
        if (l1Var == null) {
            obj = Integer.valueOf(i10);
        }
        sb2.append(obj);
        e2.a.d("MediaSessionLegacyStub", sb2.toString());
    }

    public final void K(b2.k0 k0Var, boolean z10) {
        H(31, new com.google.firebase.messaging.i(this, k0Var, z10, 2), ((n4.r) this.k.b).c(), false);
    }

    public final r L(n4.a0 a0Var) {
        r u10 = this.f.u(a0Var);
        if (u10 == null) {
            r rVar = new r(a0Var, 0, 0, this.h.b(a0Var), new h0(a0Var), Bundle.EMPTY);
            p m10 = this.g.m(rVar);
            this.f.b(a0Var, rVar, m10.a, m10.b);
            a0 a0Var2 = this.g;
            if (!a0Var2.x || !a0.k(rVar)) {
                a0Var2.e.getClass();
            }
            u10 = rVar;
        }
        androidx.mediarouter.app.c cVar = this.j;
        long j3 = this.o;
        cVar.removeMessages(1001, u10);
        cVar.sendMessageDelayed(cVar.obtainMessage(1001, u10), j3);
        return u10;
    }

    public final void M() {
        e9.i0 i0Var = this.t;
        int i10 = a.a;
        e9.q.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        if (i0Var.size() > 0) {
            i0Var.get(0).getClass();
            throw new ClassCastException();
        }
        e9.a1 a2 = a.a(e9.i0.t(0, objArr));
        this.s = a2;
        if (a2.size() > 0) {
            a2.get(0);
            throw new ClassCastException();
        }
        Bundle bundle = this.r;
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        e9.i0 i0Var2 = this.s;
        if (i0Var2.size() <= 0) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        } else {
            i0Var2.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void N(j1 j1Var) {
        e2.d0.U(this.g.l, new f0(this, j1Var, 1));
    }

    @Override // n4.p
    public final void b(n4.l lVar) {
        if (lVar != null) {
            H(20, new c2(this, lVar, -1, 3), ((n4.r) this.k.b).c(), false);
        }
    }

    @Override // n4.p
    public final void c(n4.l lVar, int i10) {
        if (lVar != null) {
            if (i10 == -1 || i10 >= 0) {
                H(20, new c2(this, lVar, i10, 3), ((n4.r) this.k.b).c(), false);
            }
        }
    }

    @Override // n4.p
    public final void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (!str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") || resultReceiver == null) {
            l1 l1Var = new l1(str, Bundle.EMPTY);
            I(l1Var, 0, new androidx.car.app.utils.a(this, l1Var, bundle, resultReceiver), ((n4.r) this.k.b).c());
            return;
        }
        q1 q1Var = this.g.j;
        q1Var.getClass();
        String str2 = q1.b;
        Bundle bundle2 = new Bundle();
        r1 r1Var = q1Var.a;
        if (r1Var != null) {
            bundle2.putInt(str2, 0);
        } else {
            bundle2.putInt(str2, 1);
        }
        String str3 = q1.c;
        r1Var.getClass();
        Bundle bundle3 = new Bundle();
        bundle3.putInt(r1.i, r1Var.a);
        bundle3.putInt(r1.j, 0);
        bundle3.putInt(r1.k, r1Var.b);
        bundle3.putString(r1.l, r1Var.d);
        bundle3.putString(r1.m, r1Var.e);
        bundle3.putBinder(r1.o, r1Var.f);
        bundle3.putParcelable(r1.n, null);
        bundle3.putBundle(r1.p, r1Var.g);
        bundle3.putInt(r1.q, r1Var.c);
        MediaSession.Token token = r1Var.h;
        if (token != null) {
            bundle3.putParcelable(r1.r, token);
        }
        bundle2.putBundle(str3, bundle3);
        resultReceiver.send(0, bundle2);
    }

    @Override // n4.p
    public final void e(String str, Bundle bundle) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        l1 l1Var = new l1(str, Bundle.EMPTY);
        I(l1Var, 0, new ah.i0(this, l1Var, bundle), ((n4.r) this.k.b).c());
    }

    @Override // n4.p
    public final void f() {
        H(12, new b0(this, 0), ((n4.r) this.k.b).c(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    @Override // n4.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(Intent intent) {
        boolean z10;
        n4.a0 c10 = ((n4.r) this.k.b).c();
        c10.getClass();
        r rVar = new r(c10, 0, 0, false, null, Bundle.EMPTY);
        a0 a0Var = this.g;
        k0 k0Var = a0Var.h;
        Context context = a0Var.f;
        w wVar = a0Var.d;
        Bundle extras = intent.getExtras();
        hg.t tVar = null;
        KeyEvent keyEvent = (extras == null || !extras.containsKey("android.intent.extra.KEY_EVENT")) ? null : (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
        ComponentName component = intent.getComponent();
        if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && ((component == null || Objects.equals(component.getPackageName(), context.getPackageName())) && keyEvent != null && keyEvent.getAction() == 0)) {
            a0Var.v();
            a0Var.e.getClass();
            int keyCode = keyEvent.getKeyCode();
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.software.leanback");
            if (keyCode != 79 && keyCode != 85) {
                hg.t tVar2 = wVar.a;
                if (tVar2 != null) {
                    wVar.removeCallbacks(tVar2);
                    hg.t tVar3 = wVar.a;
                    wVar.a = null;
                    tVar = tVar3;
                }
                if (tVar != null) {
                    e2.d0.U(wVar, tVar);
                }
            } else if (hasSystemFeature || keyEvent.getRepeatCount() != 0) {
                hg.t tVar4 = wVar.a;
                if (tVar4 != null) {
                    wVar.removeCallbacks(tVar4);
                    hg.t tVar5 = wVar.a;
                    wVar.a = null;
                    tVar = tVar5;
                }
                if (tVar != null) {
                    e2.d0.U(wVar, tVar);
                }
            } else {
                hg.t tVar6 = wVar.a;
                if (tVar6 == null) {
                    hg.t tVar7 = new hg.t(wVar, rVar, keyEvent, 22);
                    wVar.a = tVar7;
                    wVar.postDelayed(tVar7, ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                if (tVar6 != null) {
                    wVar.removeCallbacks(tVar6);
                    wVar.a = null;
                }
                z10 = true;
                if (!a0Var.x) {
                    return a0Var.b(keyEvent, z10, intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false));
                }
                if ((keyCode == 85 || keyCode == 79) && z10) {
                    k0Var.y();
                    return true;
                }
            }
            z10 = false;
            if (!a0Var.x) {
            }
        }
        return false;
    }

    @Override // n4.p
    public final void h() {
        H(1, new b0(this, 11), ((n4.r) this.k.b).c(), true);
    }

    @Override // n4.p
    public final void i() {
        H(1, new b0(this, 10), ((n4.r) this.k.b).c(), false);
    }

    @Override // n4.p
    public final void j(String str, Bundle bundle) {
        K(F(str, null, null, bundle), true);
    }

    @Override // n4.p
    public final void k(String str, Bundle bundle) {
        K(F(null, null, str, bundle), true);
    }

    @Override // n4.p
    public final void l(Uri uri, Bundle bundle) {
        K(F(null, uri, null, bundle), true);
    }

    @Override // n4.p
    public final void m() {
        H(2, new b0(this, 5), ((n4.r) this.k.b).c(), true);
    }

    @Override // n4.p
    public final void n(String str, Bundle bundle) {
        K(F(str, null, null, bundle), false);
    }

    @Override // n4.p
    public final void o(String str, Bundle bundle) {
        K(F(null, null, str, bundle), false);
    }

    @Override // n4.p
    public final void p(Uri uri, Bundle bundle) {
        K(F(null, uri, null, bundle), false);
    }

    @Override // n4.p
    public final void q(n4.l lVar) {
        if (lVar == null) {
            return;
        }
        H(20, new ah.i0(25, this, lVar), ((n4.r) this.k.b).c(), true);
    }

    @Override // n4.p
    public final void r() {
        H(11, new b0(this, 4), ((n4.r) this.k.b).c(), true);
    }

    @Override // n4.p
    public final void s(long j3) {
        H(5, new c0(this, j3, 1), ((n4.r) this.k.b).c(), true);
    }

    @Override // n4.p
    public final void t(float f7) {
        if (f7 <= 0.0f) {
            return;
        }
        H(13, new g0(this, f7), ((n4.r) this.k.b).c(), true);
    }

    @Override // n4.p
    public final void u(n4.i0 i0Var) {
        v(i0Var);
    }

    @Override // n4.p
    public final void v(n4.i0 i0Var) {
        b2.c1 c10 = k.c(i0Var);
        if (c10 != null) {
            I(null, 40010, new b0(this, c10), ((n4.r) this.k.b).c());
            return;
        }
        e2.a.n("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + i0Var);
    }

    @Override // n4.p
    public final void w(int i10) {
        H(15, new d0(this, i10, 0), ((n4.r) this.k.b).c(), true);
    }

    @Override // n4.p
    public final void x(int i10) {
        H(14, new d0(this, i10, 1), ((n4.r) this.k.b).c(), true);
    }

    @Override // n4.p
    public final void y() {
        boolean m0 = this.g.t.m0(9);
        n4.y yVar = this.k;
        if (m0) {
            H(9, new b0(this, 8), ((n4.r) yVar.b).c(), true);
        } else {
            H(8, new b0(this, 9), ((n4.r) yVar.b).c(), true);
        }
    }

    @Override // n4.p
    public final void z() {
        boolean m0 = this.g.t.m0(7);
        n4.y yVar = this.k;
        if (m0) {
            H(7, new b0(this, 2), ((n4.r) yVar.b).c(), true);
        } else {
            H(6, new b0(this, 3), ((n4.r) yVar.b).c(), true);
        }
    }
}
