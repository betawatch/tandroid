// default package

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class a05 {
    public static final /* synthetic */ int F = 0;
    public gv6 A;
    public int B;
    public pm3 C;
    public rx6 D;
    public final v34 E;
    public final ye3 c;
    public jw6 d;
    public aw6 e;
    public ogd f;
    public hw6 g;
    public final Context h;
    public final vh6 n;
    public final xh4 o;
    public final boolean p;
    public final boolean q;
    public ku6 r;
    public final kf8 s;
    public final ze2 t;
    public nw6 u;
    public jw6 v;
    public jw6 w;
    public jw6 x;
    public zv6 y;
    public gv6 z;
    public final xz4 a = new xz4(this);
    public final HashMap b = new HashMap();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a05(Context context) {
        boolean z;
        bw6 bw6Var;
        ye3 ye3Var;
        vh6 vh6Var = new vh6();
        vh6Var.c = 0;
        vh6Var.d = 3;
        this.n = vh6Var;
        byte b = 4;
        this.o = new xh4(this, b);
        this.E = new v34(this, (byte) 5);
        this.h = context;
        this.p = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            int i2 = n07.b;
            Intent intent = new Intent(context, (Class<?>) n07.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z = true;
                this.q = z;
                int i3 = dhb.b;
                Intent intent2 = new Intent(context, (Class<?>) dhb.class);
                intent2.setPackage(context.getPackageName());
                context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
                this.r = (i >= 30 || !z) ? null : new ku6(context, new kj4(this, b));
                kf8 gf8Var = i < 24 ? new gf8(context, this) : new kf8(context, this);
                this.s = gf8Var;
                rj4 rj4Var = new rj4(this, (byte) 19);
                ze2 ze2Var = new ze2();
                ze2Var.d = new Handler(Looper.getMainLooper());
                ze2Var.e = rj4Var;
                this.t = ze2Var;
                a(gf8Var, true);
                bw6Var = this.r;
                if (bw6Var != null) {
                    a(bw6Var, true);
                }
                ye3Var = new ye3(context, this);
                this.c = ye3Var;
                Handler handler = (Handler) ye3Var.d;
                if (ye3Var.a) {
                    ye3Var.a = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                    intentFilter.addDataScheme("package");
                    ((Context) ye3Var.b).registerReceiver((ak) ye3Var.g, intentFilter, null, handler);
                    handler.post((ki7) ye3Var.h);
                    return;
                }
                return;
            }
        }
        z = false;
        this.q = z;
        int i32 = dhb.b;
        Intent intent22 = new Intent(context, (Class<?>) dhb.class);
        intent22.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent22, 0).size();
        this.r = (i >= 30 || !z) ? null : new ku6(context, new kj4(this, b));
        if (i < 24) {
        }
        this.s = gf8Var;
        rj4 rj4Var2 = new rj4(this, (byte) 19);
        ze2 ze2Var2 = new ze2();
        ze2Var2.d = new Handler(Looper.getMainLooper());
        ze2Var2.e = rj4Var2;
        this.t = ze2Var2;
        a(gf8Var, true);
        bw6Var = this.r;
        if (bw6Var != null) {
        }
        ye3Var = new ye3(context, this);
        this.c = ye3Var;
        Handler handler2 = (Handler) ye3Var.d;
        if (ye3Var.a) {
        }
    }

    public final void a(bw6 bw6Var, boolean z) {
        if (d(bw6Var) == null) {
            iw6 iw6Var = new iw6(bw6Var, z);
            this.l.add(iw6Var);
            this.a.b(513, iw6Var);
            m(iw6Var, (fo4) bw6Var.n);
            lw6.b();
            bw6Var.f = this.o;
            bw6Var.h(this.z);
        }
    }

    public final String b(iw6 iw6Var, String str) {
        String flattenToShortString = ((ComponentName) iw6Var.d.b).flattenToShortString();
        boolean z = iw6Var.c;
        String p = z ? str : qd4.p(flattenToShortString, ":", str);
        HashMap hashMap = this.k;
        if (!z) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                if (((jw6) arrayList.get(i)).c.equals(p)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                Log.w("GlobalMediaRouter", c00.j("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i2 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = p + "_" + i2;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            i3 = -1;
                            break;
                        }
                        if (((jw6) arrayList.get(i3)).c.equals(str2)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 < 0) {
                        hashMap.put(new sx7(flattenToShortString, str), str2);
                        return str2;
                    }
                    i2++;
                }
            }
        }
        hashMap.put(new sx7(flattenToShortString, str), p);
        return p;
    }

    public final jw6 c() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jw6 jw6Var = (jw6) obj;
            if (jw6Var != this.v && jw6Var.c() == this.s && jw6Var.m("android.media.intent.category.LIVE_AUDIO") && !jw6Var.m("android.media.intent.category.LIVE_VIDEO") && jw6Var.f()) {
                return jw6Var;
            }
        }
        return this.v;
    }

    public final iw6 d(bw6 bw6Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            iw6 iw6Var = (iw6) obj;
            if (iw6Var.a == bw6Var) {
                return iw6Var;
            }
        }
        return null;
    }

    public final jw6 e() {
        jw6 jw6Var = this.d;
        if (jw6Var != null) {
            return jw6Var;
        }
        grb.i("There is no currently selected route.  The media router has not yet been fully initialized.");
        return null;
    }

    public final boolean f() {
        if (!this.q) {
            return false;
        }
        nw6 nw6Var = this.u;
        return nw6Var == null || nw6Var.b;
    }

    public final void g() {
        if (this.d.e()) {
            List<jw6> unmodifiableList = DesugarCollections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((jw6) it.next()).c);
            }
            HashMap hashMap = this.b;
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    aw6 aw6Var = (aw6) entry.getValue();
                    aw6Var.h(0);
                    aw6Var.d();
                    it2.remove();
                }
            }
            for (jw6 jw6Var : unmodifiableList) {
                if (!hashMap.containsKey(jw6Var.c)) {
                    aw6 e = jw6Var.c().e(jw6Var.b, this.d.b);
                    e.e();
                    hashMap.put(jw6Var.c, e);
                }
            }
        }
    }

    public final void h(a05 a05Var, jw6 jw6Var, aw6 aw6Var, int i, jw6 jw6Var2, ArrayList arrayList) {
        ogd ogdVar;
        hw6 hw6Var = this.g;
        if (hw6Var != null) {
            hw6Var.e();
            this.g = null;
        }
        hw6 hw6Var2 = new hw6(a05Var, jw6Var, aw6Var, i, jw6Var2, arrayList);
        this.g = hw6Var2;
        if (hw6Var2.b != 3 || (ogdVar = this.f) == null) {
            hw6Var2.j();
            return;
        }
        jw6 jw6Var3 = this.d;
        jw6 jw6Var4 = (jw6) hw6Var2.h;
        byte b = 2;
        ogd.c.b("Prepare transfer from Route(%s) to Route(%s)", jw6Var3, jw6Var4);
        t91 t91Var = new t91();
        t91Var.c = new sd9();
        v91 v91Var = new v91(t91Var);
        u91 u91Var = v91Var.b;
        t91Var.b = v91Var;
        t91Var.a = pfd.class;
        try {
            t91Var.a = Boolean.valueOf(ogdVar.b.post(new dd1(ogdVar, jw6Var3, jw6Var4, t91Var, (byte) 1)));
        } catch (Exception e) {
            u91Var.l(e);
        }
        hw6 hw6Var3 = this.g;
        a05 a05Var2 = (a05) ((WeakReference) hw6Var3.s).get();
        if (a05Var2 == null || a05Var2.g != hw6Var3) {
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            hw6Var3.e();
        } else {
            if (((v91) hw6Var3.w) != null) {
                grb.i("future is already set");
                return;
            }
            hw6Var3.w = v91Var;
            gw6 gw6Var = new gw6(hw6Var3, (byte) 0);
            xz4 xz4Var = a05Var2.a;
            Objects.requireNonNull(xz4Var);
            u91Var.b(gw6Var, new pe2(xz4Var, b));
        }
    }

    public final void i(jw6 jw6Var, int i) {
        if (!this.j.contains(jw6Var)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + jw6Var);
        } else {
            if (!jw6Var.g) {
                Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + jw6Var);
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                bw6 c = jw6Var.c();
                ku6 ku6Var = this.r;
                if (c == ku6Var && this.d != jw6Var) {
                    ku6Var.s(jw6Var.b);
                    return;
                }
            }
            j(jw6Var, i);
        }
    }

    public final void j(jw6 jw6Var, int i) {
        fo4 fo4Var;
        if (this.d == jw6Var) {
            return;
        }
        if (this.x != null) {
            this.x = null;
            zv6 zv6Var = this.y;
            if (zv6Var != null) {
                zv6Var.h(3);
                this.y.d();
                this.y = null;
            }
        }
        if (f() && (fo4Var = jw6Var.a.e) != null && fo4Var.c) {
            zv6 c = jw6Var.c().c(jw6Var.b);
            if (c != null) {
                Executor g = sr.g(this.h);
                v34 v34Var = this.E;
                synchronized (c.a) {
                    if (g == null) {
                        throw new NullPointerException("Executor shouldn't be null");
                    }
                    if (v34Var == null) {
                        throw new NullPointerException("Listener shouldn't be null");
                    }
                    c.b = g;
                    c.c = v34Var;
                    ArrayList arrayList = c.e;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        ev6 ev6Var = c.d;
                        ArrayList arrayList2 = c.e;
                        c.d = null;
                        c.e = null;
                        c.b.execute(new xv6(c, v34Var, ev6Var, arrayList2, (byte) 0));
                    }
                }
                this.x = jw6Var;
                this.y = c;
                c.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + jw6Var);
        }
        aw6 d = jw6Var.c().d(jw6Var.b);
        if (d != null) {
            d.e();
        }
        if (this.d != null) {
            h(this, jw6Var, d, i, null, null);
            return;
        }
        this.d = jw6Var;
        this.e = d;
        Message obtainMessage = this.a.obtainMessage(jn7.k4, new sx7(null, jw6Var));
        obtainMessage.arg1 = i;
        obtainMessage.sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
    
        if (r24.A.b() == r2) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        gv6 gv6Var;
        int i;
        boolean z;
        int i2;
        cw6 cw6Var = new cw6();
        ze2 ze2Var = this.t;
        long j = 0;
        ze2Var.a = 0L;
        int i3 = 0;
        ze2Var.c = false;
        ze2Var.b = SystemClock.elapsedRealtime();
        ((Handler) ze2Var.d).removeCallbacks((rj4) ze2Var.e);
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            size--;
            boolean z3 = this.p;
            if (size < 0) {
                long j2 = j;
                if (ze2Var.c) {
                    long j3 = ze2Var.a;
                    if (j3 > j2) {
                        ((Handler) ze2Var.d).postDelayed((rj4) ze2Var.e, j3);
                    }
                }
                boolean z4 = ze2Var.c;
                this.B = i4;
                dw6 b = z2 ? cw6Var.b() : dw6.c;
                dw6 b2 = cw6Var.b();
                if (f()) {
                    gv6 gv6Var2 = this.A;
                    if (gv6Var2 != null) {
                        gv6Var2.a();
                        if (gv6Var2.b.equals(b2)) {
                        }
                    }
                    if (!b2.d() || z4) {
                        gv6Var = new gv6(b2, z4);
                        this.A = gv6Var;
                    } else if (this.A != null) {
                        this.A = null;
                        gv6Var = null;
                    }
                    this.r.h(gv6Var);
                }
                gv6 gv6Var3 = this.z;
                if (gv6Var3 != null) {
                    gv6Var3.a();
                    if (gv6Var3.b.equals(b) && this.z.b() == z4) {
                        return;
                    }
                }
                if (!b.d() || z4) {
                    this.z = new gv6(b, z4);
                } else if (this.z == null) {
                    return;
                } else {
                    this.z = null;
                }
                if (z2 && !z4 && z3) {
                    Log.i("GlobalMediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                }
                ArrayList arrayList2 = this.l;
                int size2 = arrayList2.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj = arrayList2.get(i5);
                    i5++;
                    bw6 bw6Var = ((iw6) obj).a;
                    if (bw6Var != this.r) {
                        bw6Var.h(this.z);
                    }
                }
                return;
            }
            lw6 lw6Var = (lw6) ((WeakReference) arrayList.get(size)).get();
            if (lw6Var == null) {
                arrayList.remove(size);
            } else {
                ArrayList arrayList3 = lw6Var.b;
                int size3 = arrayList3.size();
                i4 += size3;
                int i6 = i3;
                while (i6 < size3) {
                    fw6 fw6Var = (fw6) arrayList3.get(i6);
                    dw6 dw6Var = fw6Var.c;
                    if (dw6Var == null) {
                        lq5.j("selector must not be null");
                        return;
                    }
                    cw6Var.a(dw6Var.c());
                    long j4 = j;
                    int i7 = (fw6Var.d & 1) != 0 ? 1 : i3;
                    ArrayList arrayList4 = arrayList;
                    long j5 = fw6Var.e;
                    if (i7 == 0) {
                        ze2Var.getClass();
                        i = i7;
                    } else {
                        i = i7;
                        long j6 = ze2Var.b;
                        if (j6 - j5 < 30000) {
                            ze2Var.a = Math.max(ze2Var.a, (j5 + 30000) - j6);
                            z = true;
                            ze2Var.c = true;
                            if (i != 0) {
                                z2 = z;
                            }
                            i2 = fw6Var.d;
                            if ((i2 & 4) != 0 && !z3) {
                                z2 = z;
                            }
                            if ((i2 & 8) == 0) {
                                z2 = z;
                            }
                            i6++;
                            j = j4;
                            arrayList = arrayList4;
                            i3 = 0;
                        }
                    }
                    z = true;
                    if (i != 0) {
                    }
                    i2 = fw6Var.d;
                    if ((i2 & 4) != 0) {
                        z2 = z;
                    }
                    if ((i2 & 8) == 0) {
                    }
                    i6++;
                    j = j4;
                    arrayList = arrayList4;
                    i3 = 0;
                }
            }
            j = j;
            arrayList = arrayList;
            i3 = 0;
        }
    }

    public final void l() {
        jw6 jw6Var = this.d;
        if (jw6Var == null) {
            pm3 pm3Var = this.C;
            if (pm3Var != null) {
                pm3Var.o();
                return;
            }
            return;
        }
        int i = jw6Var.p;
        vh6 vh6Var = this.n;
        vh6Var.a = i;
        vh6Var.b = jw6Var.q;
        vh6Var.c = (!jw6Var.e() || lw6.g()) ? jw6Var.o : 0;
        vh6Var.d = this.d.m;
        if (f() && this.d.c() == this.r) {
            vh6Var.e = ku6.p(this.e);
        } else {
            vh6Var.e = null;
        }
        ArrayList arrayList = this.m;
        if (arrayList.size() > 0) {
            ((zz4) arrayList.get(0)).getClass();
            throw null;
        }
        pm3 pm3Var2 = this.C;
        if (pm3Var2 != null) {
            jw6 jw6Var2 = this.d;
            jw6 jw6Var3 = this.v;
            if (jw6Var3 == null) {
                grb.i("There is no default route.  The media router has not yet been fully initialized.");
                return;
            }
            if (jw6Var2 == jw6Var3 || jw6Var2 == this.w) {
                pm3Var2.o();
                return;
            }
            int i2 = vh6Var.c == 1 ? 2 : 0;
            int i3 = vh6Var.b;
            int i4 = vh6Var.a;
            String str = (String) vh6Var.e;
            rx6 rx6Var = (rx6) pm3Var2.b;
            if (rx6Var != null) {
                oy3 oy3Var = (oy3) pm3Var2.c;
                if (oy3Var != null && i2 == 0 && i3 == 0) {
                    oy3Var.c = i4;
                    ioc.a(oy3Var.b(), i4);
                } else {
                    oy3 oy3Var2 = new oy3(pm3Var2, i2, i3, i4, str);
                    pm3Var2.c = oy3Var2;
                    ((ex6) rx6Var.b).a.setPlaybackToRemote(oy3Var2.b());
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r21 == ((fo4) r19.s.n)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0185 A[LOOP:5: B:76:0x0183->B:77:0x0185, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a0 A[LOOP:6: B:80:0x019e->B:81:0x01a0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(iw6 iw6Var, fo4 fo4Var) {
        boolean z;
        int i;
        int size;
        int size2;
        Iterator it;
        boolean z2;
        fo4 fo4Var2 = iw6Var.e;
        ArrayList arrayList = iw6Var.b;
        if (fo4Var2 != fo4Var) {
            iw6Var.e = fo4Var;
            ArrayList arrayList2 = this.j;
            xz4 xz4Var = this.a;
            if (fo4Var != null) {
                List list = fo4Var.b;
                int size3 = list.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    ev6 ev6Var = (ev6) list.get(i2);
                    if (ev6Var != null && ev6Var.e()) {
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = list.iterator();
                int i3 = 0;
                boolean z3 = false;
                while (it2.hasNext()) {
                    ev6 ev6Var2 = (ev6) it2.next();
                    if (ev6Var2 == null || !ev6Var2.e()) {
                        it = it2;
                        z2 = z3;
                        Log.w("GlobalMediaRouter", "Ignoring invalid route descriptor: " + ev6Var2);
                    } else {
                        String d = ev6Var2.d();
                        int size4 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size4) {
                                i4 = -1;
                                break;
                            } else if (((jw6) arrayList.get(i4)).b.equals(d)) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (i4 < 0) {
                            it = it2;
                            z2 = z3;
                            jw6 jw6Var = new jw6(iw6Var, d, b(iw6Var, d), ev6Var2.a.getBoolean("isSystemRoute", false));
                            int i5 = i3 + 1;
                            arrayList.add(i3, jw6Var);
                            arrayList2.add(jw6Var);
                            if (ev6Var2.c().isEmpty()) {
                                jw6Var.i(ev6Var2);
                                xz4Var.b(jn7.f4, jw6Var);
                            } else {
                                arrayList3.add(new sx7(jw6Var, ev6Var2));
                            }
                            i3 = i5;
                        } else {
                            it = it2;
                            z2 = z3;
                            if (i4 < i3) {
                                Log.w("GlobalMediaRouter", "Ignoring route descriptor with duplicate id: " + ev6Var2);
                            } else {
                                jw6 jw6Var2 = (jw6) arrayList.get(i4);
                                int i6 = i3 + 1;
                                Collections.swap(arrayList, i4, i3);
                                if (!ev6Var2.c().isEmpty()) {
                                    arrayList4.add(new sx7(jw6Var2, ev6Var2));
                                } else if (n(jw6Var2, ev6Var2) != 0 && jw6Var2 == this.d) {
                                    i3 = i6;
                                    z2 = true;
                                }
                                i3 = i6;
                            }
                        }
                    }
                    it2 = it;
                    z3 = z2;
                }
                boolean z4 = z3;
                int i7 = 0;
                int size5 = arrayList3.size();
                int i8 = 0;
                while (i8 < size5) {
                    Object obj = arrayList3.get(i8);
                    i8++;
                    sx7 sx7Var = (sx7) obj;
                    jw6 jw6Var3 = (jw6) sx7Var.a;
                    jw6Var3.i((ev6) sx7Var.b);
                    xz4Var.b(jn7.f4, jw6Var3);
                }
                int size6 = arrayList4.size();
                boolean z5 = z4;
                while (i7 < size6) {
                    Object obj2 = arrayList4.get(i7);
                    i7++;
                    sx7 sx7Var2 = (sx7) obj2;
                    jw6 jw6Var4 = (jw6) sx7Var2.a;
                    if (n(jw6Var4, (ev6) sx7Var2.b) != 0 && jw6Var4 == this.d) {
                        z5 = true;
                    }
                }
                z = z5;
                i = i3;
                for (size = arrayList.size() - 1; size >= i; size--) {
                    jw6 jw6Var5 = (jw6) arrayList.get(size);
                    jw6Var5.i(null);
                    arrayList2.remove(jw6Var5);
                }
                o(z);
                for (size2 = arrayList.size() - 1; size2 >= i; size2--) {
                    xz4Var.b(jn7.g4, (jw6) arrayList.remove(size2));
                }
                xz4Var.b(515, iw6Var);
            }
            z = false;
            Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + fo4Var);
            i = 0;
            while (size >= i) {
            }
            o(z);
            while (size2 >= i) {
            }
            xz4Var.b(515, iw6Var);
        }
    }

    public final int n(jw6 jw6Var, ev6 ev6Var) {
        int i = jw6Var.i(ev6Var);
        if (i != 0) {
            int i2 = i & 1;
            xz4 xz4Var = this.a;
            if (i2 != 0) {
                xz4Var.b(jn7.h4, jw6Var);
            }
            if ((i & 2) != 0) {
                xz4Var.b(jn7.i4, jw6Var);
            }
            if ((i & 4) != 0) {
                xz4Var.b(jn7.j4, jw6Var);
            }
        }
        return i;
    }

    public final void o(boolean z) {
        jw6 jw6Var = this.v;
        if (jw6Var != null && !jw6Var.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        jw6 jw6Var2 = this.v;
        kf8 kf8Var = this.s;
        ArrayList arrayList = this.j;
        if (jw6Var2 == null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                jw6 jw6Var3 = (jw6) obj;
                if (jw6Var3.c() == kf8Var && jw6Var3.b.equals("DEFAULT_ROUTE") && jw6Var3.f()) {
                    this.v = jw6Var3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        jw6 jw6Var4 = this.w;
        if (jw6Var4 != null && !jw6Var4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.w);
            this.w = null;
        }
        if (this.w == null) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i2);
                i2++;
                jw6 jw6Var5 = (jw6) obj2;
                if (jw6Var5.c() == kf8Var && jw6Var5.m("android.media.intent.category.LIVE_AUDIO") && !jw6Var5.m("android.media.intent.category.LIVE_VIDEO") && jw6Var5.f()) {
                    this.w = jw6Var5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.w);
                    break;
                }
            }
        }
        jw6 jw6Var6 = this.d;
        if (jw6Var6 == null || !jw6Var6.g) {
            Log.i("GlobalMediaRouter", "Unselecting the current route because it is no longer selectable: " + this.d);
            j(c(), 0);
            return;
        }
        if (z) {
            g();
            l();
        }
    }
}
