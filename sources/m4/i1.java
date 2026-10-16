package m4;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import b2.v1;
import bi.ma;
import e9.c2;
import e9.m2;
import e9.w1;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import ji.m5;
import ji.v2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class i1 extends Binder implements m {
    public final WeakReference a;
    public final pi.e b;
    public final Set c;
    public w1 d;
    public c2 e;
    public int f;
    public h1 i;

    public i1(e0 e0Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.a = new WeakReference(e0Var);
        this.b = new pi.e(e0Var);
        this.c = DesugarCollections.synchronizedSet(new HashSet());
        this.d = w1.r;
        this.e = c2.h;
    }

    public static j9.y I0(e0 e0Var, v vVar, int i10, g1 g1Var, e2.j jVar) {
        if (e0Var.j()) {
            return j9.w.b;
        }
        j9.y yVar = (j9.y) g1Var.c(e0Var, vVar, i10);
        j9.e0 e0Var2 = new j9.e0();
        yVar.a(new androidx.car.app.utils.b(e0Var, e0Var2, jVar, yVar, 22), j9.r.a);
        return e0Var2;
    }

    public static void P0(e0 e0Var, v vVar, int i10, s1 s1Var) {
        try {
            u uVar = vVar.d;
            uVar.getClass();
            uVar.j(i10, s1Var);
            e0Var.c.a(true, true);
        } catch (RemoteException e) {
            e2.a.m("MediaSessionStub", "Failed to send result to controller " + vVar, e);
        }
    }

    public static m5 Q0(e2.j jVar) {
        return new m5(new m5(jVar, 7), 6);
    }

    public final void F0(l lVar, Bundle bundle) {
        WeakReference weakReference = this.a;
        e0 e0Var = (e0) weakReference.get();
        if (lVar == null || bundle == null || e0Var == null) {
            w7.w.a(lVar);
            return;
        }
        try {
            Context context = e0Var.f;
            i a2 = i.a(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            String str = a2.c;
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
            if (packagesForUid != null && packagesForUid.length != 0) {
                for (String str2 : packagesForUid) {
                    if (!str2.equals(str)) {
                    }
                }
                e2.a.l("MediaSessionStub", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                w7.w.a(lVar);
                return;
            }
            long clearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = a2.d;
            }
            try {
                n4.t tVar = new n4.t(str, callingPid, callingUid);
                boolean b10 = n4.w.a(context).b(tVar);
                int i10 = a2.a;
                int i11 = a2.b;
                v vVar = new v(tVar, i10, i11, b10, new d1(lVar, i11), a2.e);
                e0 e0Var2 = (e0) weakReference.get();
                if (e0Var2 != null && !e0Var2.j()) {
                    this.c.add(vVar);
                    e2.m0.W(e0Var2.l, new androidx.car.app.utils.b(this, vVar, e0Var2, lVar, 21));
                }
                w7.w.a(lVar);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } catch (RuntimeException e) {
            e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e);
        }
    }

    public final void G0(l lVar, int i10) {
        if (lVar == null) {
            return;
        }
        N0(lVar, i10, 26, Q0(new k2.y0(26)));
    }

    public final void H0(l lVar, int i10, o1 o1Var, int i11, g1 g1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            e0 e0Var = (e0) this.a.get();
            if (e0Var != null && !e0Var.j()) {
                v n10 = this.b.n(lVar.asBinder());
                if (n10 == null) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                } else {
                    e2.m0.W(e0Var.l, new x0(this, n10, o1Var, e0Var, i10, i11, g1Var));
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void J0(l lVar, int i10) {
        if (lVar == null) {
            return;
        }
        N0(lVar, i10, 26, Q0(new k2.y0(18)));
    }

    public final int K0(v vVar, m1 m1Var, int i10) {
        if (m1Var.o0(17)) {
            pi.e eVar = this.b;
            if (!eVar.u(vVar, 17) && eVar.u(vVar, 16)) {
                return m1Var.n0() + i10;
            }
        }
        return i10;
    }

    public final void L0(l lVar, int i10, Bundle bundle, Bundle bundle2, boolean z10) {
        o1 o1Var;
        Bundle o10 = e2.m0.o(bundle2);
        if (lVar == null || bundle == null || o10 == null) {
            return;
        }
        try {
            int i11 = bundle.getInt(o1.f, 0);
            if (i11 != 0) {
                o1Var = new o1(i11);
            } else {
                String string = bundle.getString(o1.g);
                string.getClass();
                Bundle o11 = e2.m0.o(bundle.getBundle(o1.h));
                if (o11 == null) {
                    o11 = Bundle.EMPTY;
                }
                o1Var = new o1(string, o11);
            }
            if (!d.j(o1Var.b)) {
                H0(lVar, i10, o1Var, 0, new z0(new k2.y0(z10, o1Var, o10), 1));
                return;
            }
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                e0 e0Var = (e0) this.a.get();
                if (e0Var != null && !e0Var.j()) {
                    v n10 = this.b.n(lVar.asBinder());
                    if (n10 == null) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    } else {
                        e2.m0.W(e0Var.l, new ma(this, n10, o1Var, e0Var, i10, lVar, 1));
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } catch (RuntimeException e) {
            e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    public final void M0(v vVar, int i10) {
        O0(vVar, i10, 1, Q0(new ah.h0(28, this, vVar)));
    }

    public final void N0(l lVar, int i10, int i11, m5 m5Var) {
        v n10 = this.b.n(lVar.asBinder());
        if (n10 != null) {
            O0(n10, i10, i11, m5Var);
        }
    }

    public final void O0(v vVar, int i10, int i11, g1 g1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            e0 e0Var = (e0) this.a.get();
            if (e0Var != null && !e0Var.j()) {
                e2.m0.W(e0Var.l, new ji.h0(this, vVar, i11, e0Var, i10, g1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void R0(l lVar, int i10, boolean z10) {
        if (lVar == null) {
            return;
        }
        N0(lVar, i10, 26, Q0(new i2.x(3, z10)));
    }

    public final void S0(l lVar, int i10, int i11) {
        if (lVar == null || i11 < 0) {
            return;
        }
        N0(lVar, i10, 25, Q0(new i2.v(i11, 6)));
    }

    public final void T0(l lVar, int i10, Bundle bundle, boolean z10) {
        v n10;
        if (lVar == null || bundle == null || (n10 = this.b.n(lVar.asBinder())) == null) {
            return;
        }
        try {
            O0(n10, i10, 31, new z0(new y0(0, new bi.h(2, b2.p0.a(n10.c, bundle), z10), new v0(8)), 1));
        } catch (RuntimeException e) {
            e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void U0(l lVar, int i10, Bundle bundle, long j10) {
        v n10;
        if (lVar == null || bundle == null || (n10 = this.b.n(lVar.asBinder())) == null) {
            return;
        }
        try {
            O0(n10, i10, 31, new z0(new y0(0, new bi.p1(b2.p0.a(n10.c, bundle), j10, 2), new v0(8)), 1));
        } catch (RuntimeException e) {
            e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void V0(l lVar, int i10, IBinder iBinder, boolean z10) {
        v n10;
        if (lVar == null || iBinder == null || (n10 = this.b.n(lVar.asBinder())) == null) {
            return;
        }
        try {
            e9.n0 a2 = b2.i.a(iBinder);
            e9.k0 t10 = e9.n0.t();
            for (int i11 = 0; i11 < a2.size(); i11++) {
                Bundle bundle = (Bundle) a2.get(i11);
                bundle.getClass();
                t10.c(b2.p0.a(n10.c, bundle));
            }
            O0(n10, i10, 20, new z0(new y0(0, new bi.h(4, t10.f(), z10), new v0(8)), 1));
        } catch (RuntimeException e) {
            e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void W0(l lVar, int i10, IBinder iBinder, int i11, long j10) {
        v n10;
        if (lVar == null || iBinder == null) {
            return;
        }
        if ((i11 == -1 || i11 >= 0) && (n10 = this.b.n(lVar.asBinder())) != null) {
            try {
                e9.n0 a2 = b2.i.a(iBinder);
                e9.k0 t10 = e9.n0.t();
                for (int i12 = 0; i12 < a2.size(); i12++) {
                    Bundle bundle = (Bundle) a2.get(i12);
                    bundle.getClass();
                    t10.c(b2.p0.a(n10.c, bundle));
                }
                O0(n10, i10, 20, new z0(new y0(0, new j2.d(t10.f(), i11, j10, 2), new v0(8)), 1));
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    public final void X0(l lVar, int i10, float f7) {
        if (lVar == null || f7 < 0.0f || f7 > 1.0f) {
            return;
        }
        N0(lVar, i10, 24, Q0(new i2.u(f7, 2)));
    }

    public final k1 Y0(k1 k1Var) {
        e9.n0 n0Var = k1Var.F.a;
        e9.e0 e0Var = new e9.e0(4, 5);
        a5.a aVar = new a5.a(4, 5);
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            b2.q1 q1Var = ((v1) n0Var.get(i10)).b;
            String str = (String) this.d.get(q1Var);
            if (str == null) {
                StringBuilder sb2 = new StringBuilder();
                int i11 = this.f;
                this.f = i11 + 1;
                String str2 = e2.m0.a;
                sb2.append(Integer.toString(i11, 36));
                sb2.append("-");
                sb2.append(q1Var.b);
                str = sb2.toString();
            }
            e0Var.I(q1Var, str);
            aVar.x(q1Var.b, str);
        }
        this.d = e0Var.b == 0 ? w1.r : new w1(e0Var.b, (Object[]) e0Var.c);
        this.e = aVar.e(false);
        e9.k0 t10 = e9.n0.t();
        for (int i12 = 0; i12 < n0Var.size(); i12++) {
            v1 v1Var = (v1) n0Var.get(i12);
            t10.c(new v1(Z0(v1Var.b), v1Var.c, v1Var.d, v1Var.e));
        }
        k1 a2 = k1Var.a(new b2.w1(t10.f()));
        b2.u1 u1Var = a2.G;
        if (u1Var.H.isEmpty()) {
            return a2;
        }
        b2.t1 c10 = u1Var.a().c();
        m2 it = u1Var.H.values().iterator();
        while (it.hasNext()) {
            b2.r1 r1Var = (b2.r1) it.next();
            c10.a(new b2.r1(Z0(r1Var.a), r1Var.b));
        }
        return a2.d(c10.b());
    }

    public final b2.q1 Z0(b2.q1 q1Var) {
        String str = (String) this.d.get(q1Var);
        if (str == null) {
            str = q1Var.b;
        }
        int i10 = 0;
        while (true) {
            int i11 = q1Var.a;
            b2.x[] xVarArr = q1Var.d;
            if (i10 >= i11) {
                return new b2.q1(str, xVarArr);
            }
            if (xVarArr[i10].m != null) {
                b2.x[] xVarArr2 = new b2.x[i11];
                for (int i12 = 0; i12 < q1Var.a; i12++) {
                    b2.x xVar = xVarArr[i12];
                    String str2 = xVar.m;
                    String str3 = str2 != null ? (String) this.e.get(str2) : null;
                    if (str3 != null) {
                        b2.w a2 = xVar.a();
                        a2.l = str3;
                        xVarArr2[i12] = new b2.x(a2);
                    } else {
                        xVarArr2[i12] = xVar;
                    }
                }
                return new b2.q1(str, xVarArr2);
            }
            i10++;
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        h hVar;
        i1 i1Var;
        v n10;
        v n11;
        v n12;
        v n13;
        v n14;
        v n15;
        v n16;
        v n17;
        v n18;
        v n19;
        v n20;
        v n21;
        i1 i1Var2;
        v n22;
        v n23;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        q a2 = null;
        q a10 = null;
        q a11 = null;
        q a12 = null;
        q a13 = null;
        switch (i10) {
            case 3002:
                X0(p.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                S0(p.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                J0(p.F0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                G0(p.F0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3006:
                R0(p.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3007:
                T0(p.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.u.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                U0(p.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.u.a(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                T0(p.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.u.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                V0(p.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                V0(p.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                W0(p.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                l F0 = p.F0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                boolean z10 = parcel.readInt() != 0;
                if (F0 != null) {
                    N0(F0, readInt, 1, Q0(new i2.x(2, z10)));
                    return true;
                }
                return true;
            case 3014:
                l F02 = p.F0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                Bundle bundle = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                if (F02 != null && bundle != null) {
                    try {
                        s1 a14 = s1.a(bundle);
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            pi.e eVar = this.b;
                            IBinder asBinder = F02.asBinder();
                            synchronized (eVar.a) {
                                try {
                                    v n24 = eVar.n(asBinder);
                                    hVar = n24 != null ? (h) ((a0.f) eVar.c).get(n24) : null;
                                } finally {
                                }
                            }
                            com.google.android.gms.common.api.internal.v vVar = hVar != null ? hVar.b : null;
                            if (vVar != null) {
                                vVar.i(readInt2, a14);
                            }
                        } finally {
                        }
                    } catch (RuntimeException e) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e);
                    }
                }
                return true;
            case 3015:
                l F03 = p.F0(parcel.readStrongBinder());
                parcel.readInt();
                F0(F03, (Bundle) w7.u.a(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                l F04 = p.F0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                L0(F04, readInt3, (Bundle) w7.u.a(parcel, creator), (Bundle) w7.u.a(parcel, creator), false);
                return true;
            case 3017:
                i1Var = this;
                l F05 = p.F0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                int readInt5 = parcel.readInt();
                if (F05 != null && (readInt5 == 2 || readInt5 == 0 || readInt5 == 1)) {
                    i1Var.N0(F05, readInt4, 15, Q0(new i2.v(readInt5, 5)));
                    return true;
                }
                return true;
            case 3018:
                i1Var = this;
                l F06 = p.F0(parcel.readStrongBinder());
                int readInt6 = parcel.readInt();
                boolean z11 = parcel.readInt() != 0;
                if (F06 != null) {
                    i1Var.N0(F06, readInt6, 14, Q0(new i2.x(4, z11)));
                    return true;
                }
                return true;
            case 3019:
                i1Var = this;
                l F07 = p.F0(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                if (F07 != null && readInt8 >= 0) {
                    i1Var.N0(F07, readInt7, 20, new m5(new r0(i1Var, readInt8, 4), 6));
                    return true;
                }
                return true;
            case 3020:
                i1Var = this;
                l F08 = p.F0(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                int readInt10 = parcel.readInt();
                int readInt11 = parcel.readInt();
                if (F08 != null && readInt10 >= 0 && readInt11 >= readInt10) {
                    i1Var.N0(F08, readInt9, 20, new m5(new q0(i1Var, readInt10, readInt11), 6));
                    return true;
                }
                return true;
            case 3021:
                i1Var = this;
                l F09 = p.F0(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                if (F09 != null) {
                    i1Var.N0(F09, readInt12, 20, Q0(new v0(6)));
                    return true;
                }
                return true;
            case 3022:
                i1Var = this;
                l F010 = p.F0(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                int readInt14 = parcel.readInt();
                int readInt15 = parcel.readInt();
                if (F010 != null && readInt14 >= 0 && readInt15 >= 0) {
                    i1Var.N0(F010, readInt13, 20, Q0(new eh.c(readInt14, readInt15, 5)));
                    return true;
                }
                return true;
            case 3023:
                i1Var = this;
                l F011 = p.F0(parcel.readStrongBinder());
                int readInt16 = parcel.readInt();
                final int readInt17 = parcel.readInt();
                final int readInt18 = parcel.readInt();
                final int readInt19 = parcel.readInt();
                if (F011 != null && readInt17 >= 0 && readInt18 >= readInt17 && readInt19 >= 0) {
                    i1Var.N0(F011, readInt16, 20, Q0(new e2.j() { // from class: m4.u0
                        @Override // e2.j
                        public final void accept(Object obj) {
                            ((m1) obj).t0(readInt17, readInt18, readInt19);
                        }
                    }));
                    return true;
                }
                return true;
            case 3024:
                i1Var = this;
                l F012 = p.F0(parcel.readStrongBinder());
                int readInt20 = parcel.readInt();
                if (F012 != null && (n10 = i1Var.b.n(F012.asBinder())) != null) {
                    i1Var.M0(n10, readInt20);
                    return true;
                }
                return true;
            case 3025:
                i1Var = this;
                l F013 = p.F0(parcel.readStrongBinder());
                int readInt21 = parcel.readInt();
                if (F013 != null && (n11 = i1Var.b.n(F013.asBinder())) != null) {
                    i1Var.O0(n11, readInt21, 1, Q0(new k2.y0(15)));
                    return true;
                }
                return true;
            case 3026:
                i1Var = this;
                l F014 = p.F0(parcel.readStrongBinder());
                int readInt22 = parcel.readInt();
                if (F014 != null) {
                    i1Var.N0(F014, readInt22, 2, Q0(new v0(4)));
                    return true;
                }
                return true;
            case 3027:
                i1Var = this;
                l F015 = p.F0(parcel.readStrongBinder());
                int readInt23 = parcel.readInt();
                Bundle bundle2 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                if (F015 != null && bundle2 != null) {
                    try {
                        i1Var.N0(F015, readInt23, 13, Q0(new m5(new b2.a1(bundle2.getFloat(b2.a1.e, 1.0f), bundle2.getFloat(b2.a1.f, 1.0f)), 5)));
                    } catch (RuntimeException e7) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e7);
                    }
                }
                return true;
            case 3028:
                i1Var = this;
                l F016 = p.F0(parcel.readStrongBinder());
                int readInt24 = parcel.readInt();
                float readFloat = parcel.readFloat();
                if (F016 != null && readFloat > 0.0f) {
                    i1Var.N0(F016, readInt24, 13, Q0(new i2.u(readFloat, 1)));
                    return true;
                }
                return true;
            case 3029:
                i1Var = this;
                l F017 = p.F0(parcel.readStrongBinder());
                int readInt25 = parcel.readInt();
                Bundle bundle3 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                if (F017 != null && bundle3 != null && (n12 = i1Var.b.n(F017.asBinder())) != null) {
                    try {
                        final b2.p0 a15 = b2.p0.a(n12.c, bundle3);
                        final int i12 = 2;
                        i1Var.O0(n12, readInt25, 20, new z0(new y0(1, new g1() { // from class: m4.t0
                            @Override // m4.g1
                            public final Object c(e0 e0Var, v vVar2, int i13) {
                                switch (i12) {
                                }
                                return e0Var.l(vVar2, e9.n0.y(a15));
                            }
                        }, new k2.y0(28)), 1));
                    } catch (RuntimeException e10) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
                    }
                }
                return true;
            case 3030:
                i1Var = this;
                l F018 = p.F0(parcel.readStrongBinder());
                int readInt26 = parcel.readInt();
                int readInt27 = parcel.readInt();
                Bundle bundle4 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                if (F018 != null && bundle4 != null && readInt27 >= 0 && (n13 = i1Var.b.n(F018.asBinder())) != null) {
                    try {
                        final b2.p0 a16 = b2.p0.a(n13.c, bundle4);
                        final int i13 = 0;
                        i1Var.O0(n13, readInt26, 20, new z0(new y0(1, new g1() { // from class: m4.t0
                            @Override // m4.g1
                            public final Object c(e0 e0Var, v vVar2, int i132) {
                                switch (i13) {
                                }
                                return e0Var.l(vVar2, e9.n0.y(a16));
                            }
                        }, new r0(i1Var, readInt27, 1)), 1));
                    } catch (RuntimeException e11) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e11);
                    }
                }
                return true;
            case 3031:
                i1Var = this;
                l F019 = p.F0(parcel.readStrongBinder());
                int readInt28 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (F019 != null && readStrongBinder != null && (n14 = i1Var.b.n(F019.asBinder())) != null) {
                    try {
                        e9.n0 a17 = b2.i.a(readStrongBinder);
                        e9.k0 t10 = e9.n0.t();
                        for (int i14 = 0; i14 < a17.size(); i14++) {
                            Bundle bundle5 = (Bundle) a17.get(i14);
                            bundle5.getClass();
                            t10.c(b2.p0.a(n14.c, bundle5));
                        }
                        i1Var.O0(n14, readInt28, 20, new z0(new y0(1, new i2.y(3, t10.f()), new k2.y0(27)), 1));
                    } catch (RuntimeException e12) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e12);
                    }
                }
                return true;
            case 3032:
                i1Var = this;
                l F020 = p.F0(parcel.readStrongBinder());
                int readInt29 = parcel.readInt();
                int readInt30 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (F020 != null && readStrongBinder2 != null && readInt30 >= 0 && (n15 = i1Var.b.n(F020.asBinder())) != null) {
                    try {
                        e9.n0 a18 = b2.i.a(readStrongBinder2);
                        e9.k0 t11 = e9.n0.t();
                        for (int i15 = 0; i15 < a18.size(); i15++) {
                            Bundle bundle6 = (Bundle) a18.get(i15);
                            bundle6.getClass();
                            t11.c(b2.p0.a(n15.c, bundle6));
                        }
                        i1Var.O0(n15, readInt29, 20, new z0(new y0(1, new i2.y(2, t11.f()), new r0(i1Var, readInt30, 3)), 1));
                    } catch (RuntimeException e13) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e13);
                    }
                }
                return true;
            case 3033:
                i1Var = this;
                l F021 = p.F0(parcel.readStrongBinder());
                int readInt31 = parcel.readInt();
                Bundle bundle7 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                if (F021 != null && bundle7 != null && (n16 = i1Var.b.n(F021.asBinder())) != null) {
                    try {
                        i1Var.O0(n16, readInt31, 19, Q0(new i2.s(b2.s0.b(n16.c, bundle7))));
                    } catch (RuntimeException e14) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e14);
                    }
                }
                return true;
            case 3034:
                i1Var = this;
                l F022 = p.F0(parcel.readStrongBinder());
                int readInt32 = parcel.readInt();
                if (F022 != null && (n17 = i1Var.b.n(F022.asBinder())) != null) {
                    i1Var.O0(n17, readInt32, 3, Q0(new v0(0)));
                    return true;
                }
                return true;
            case 3035:
                i1Var = this;
                l F023 = p.F0(parcel.readStrongBinder());
                parcel.readInt();
                if (F023 != null) {
                    long clearCallingIdentity2 = Binder.clearCallingIdentity();
                    try {
                        e0 e0Var = (e0) i1Var.a.get();
                        if (e0Var != null && !e0Var.j()) {
                            e2.m0.W(e0Var.l, new v2(15, i1Var, F023));
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                return true;
            case 3036:
                i1Var = this;
                l F024 = p.F0(parcel.readStrongBinder());
                int readInt33 = parcel.readInt();
                if (F024 != null) {
                    i1Var.N0(F024, readInt33, 4, Q0(new v0(2)));
                    return true;
                }
                return true;
            case 3037:
                i1Var = this;
                l F025 = p.F0(parcel.readStrongBinder());
                int readInt34 = parcel.readInt();
                int readInt35 = parcel.readInt();
                if (F025 != null && readInt35 >= 0) {
                    i1Var.N0(F025, readInt34, 10, new m5(new r0(i1Var, readInt35, 0), 6));
                    return true;
                }
                return true;
            case 3038:
                i1Var = this;
                l F026 = p.F0(parcel.readStrongBinder());
                int readInt36 = parcel.readInt();
                long readLong = parcel.readLong();
                if (F026 != null) {
                    i1Var.N0(F026, readInt36, 5, Q0(new k2.e0(readLong)));
                    return true;
                }
                return true;
            case 3039:
                l F027 = p.F0(parcel.readStrongBinder());
                int readInt37 = parcel.readInt();
                int readInt38 = parcel.readInt();
                long readLong2 = parcel.readLong();
                if (F027 != null && readInt38 >= 0) {
                    N0(F027, readInt37, 10, new m5(new j2.d(this, readInt38, readLong2, 1), 6));
                    return true;
                }
                return true;
            case 3040:
                l F028 = p.F0(parcel.readStrongBinder());
                int readInt39 = parcel.readInt();
                if (F028 != null && (n18 = this.b.n(F028.asBinder())) != null) {
                    O0(n18, readInt39, 11, Q0(new k2.y0(19)));
                    return true;
                }
                return true;
            case 3041:
                l F029 = p.F0(parcel.readStrongBinder());
                int readInt40 = parcel.readInt();
                if (F029 != null && (n19 = this.b.n(F029.asBinder())) != null) {
                    O0(n19, readInt40, 12, Q0(new k2.y0(23)));
                    return true;
                }
                return true;
            case 3042:
                l F030 = p.F0(parcel.readStrongBinder());
                int readInt41 = parcel.readInt();
                if (F030 != null) {
                    N0(F030, readInt41, 6, Q0(new k2.y0(21)));
                    return true;
                }
                return true;
            case 3043:
                l F031 = p.F0(parcel.readStrongBinder());
                int readInt42 = parcel.readInt();
                if (F031 != null) {
                    N0(F031, readInt42, 8, Q0(new k2.y0(16)));
                    return true;
                }
                return true;
            case 3044:
                l F032 = p.F0(parcel.readStrongBinder());
                int readInt43 = parcel.readInt();
                Surface surface = (Surface) w7.u.a(parcel, Surface.CREATOR);
                if (F032 != null) {
                    N0(F032, readInt43, 27, Q0(new ah.h0(29, this, surface)));
                    return true;
                }
                return true;
            case 3045:
                l F033 = p.F0(parcel.readStrongBinder());
                if (F033 != null) {
                    long clearCallingIdentity3 = Binder.clearCallingIdentity();
                    try {
                        e0 e0Var2 = (e0) this.a.get();
                        if (e0Var2 != null && !e0Var2.j()) {
                            v n25 = this.b.n(F033.asBinder());
                            if (n25 != null) {
                                e2.m0.W(e0Var2.l, new v2(16, this, n25));
                            }
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                return true;
            case 3046:
                l F034 = p.F0(parcel.readStrongBinder());
                int readInt44 = parcel.readInt();
                if (F034 != null && (n20 = this.b.n(F034.asBinder())) != null) {
                    O0(n20, readInt44, 7, Q0(new k2.y0(20)));
                    return true;
                }
                return true;
            case 3047:
                l F035 = p.F0(parcel.readStrongBinder());
                int readInt45 = parcel.readInt();
                if (F035 != null && (n21 = this.b.n(F035.asBinder())) != null) {
                    O0(n21, readInt45, 9, Q0(new k2.y0(24)));
                    return true;
                }
                return true;
            case 3048:
                l F036 = p.F0(parcel.readStrongBinder());
                int readInt46 = parcel.readInt();
                Bundle bundle8 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                if (F036 != null && bundle8 != null) {
                    try {
                        N0(F036, readInt46, 29, Q0(new ah.h0(27, this, b2.u1.b(bundle8))));
                    } catch (RuntimeException e15) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e15);
                    }
                }
                return true;
            case 3049:
                l F037 = p.F0(parcel.readStrongBinder());
                int readInt47 = parcel.readInt();
                String readString = parcel.readString();
                Bundle bundle9 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                if (F037 != null && readString != null && bundle9 != null) {
                    if (!TextUtils.isEmpty(readString)) {
                        try {
                            z0 z0Var = new z0(new k2.y0(readString, b2.h1.a(bundle9)), 1);
                            i1Var2 = this;
                            i1Var2.H0(F037, readInt47, null, 40010, z0Var);
                        } catch (RuntimeException e16) {
                            e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for Rating", e16);
                        }
                        return true;
                    }
                    e2.a.l("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                }
                return true;
            case 3050:
                l F038 = p.F0(parcel.readStrongBinder());
                int readInt48 = parcel.readInt();
                Bundle bundle10 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                if (F038 != null && bundle10 != null) {
                    try {
                        H0(F038, readInt48, null, 40010, new z0(new v0(b2.h1.a(bundle10), 9), 1));
                    } catch (RuntimeException e17) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for Rating", e17);
                    }
                }
                return true;
            case 3051:
                l F039 = p.F0(parcel.readStrongBinder());
                int readInt49 = parcel.readInt();
                int readInt50 = parcel.readInt();
                int readInt51 = parcel.readInt();
                if (F039 != null && readInt50 >= 0) {
                    N0(F039, readInt49, 33, Q0(new eh.c(readInt50, readInt51, 4)));
                    return true;
                }
                return true;
            case 3052:
                l F040 = p.F0(parcel.readStrongBinder());
                int readInt52 = parcel.readInt();
                int readInt53 = parcel.readInt();
                if (F040 != null) {
                    N0(F040, readInt52, 34, Q0(new i2.v(readInt53, 4)));
                    return true;
                }
                return true;
            case 3053:
                l F041 = p.F0(parcel.readStrongBinder());
                int readInt54 = parcel.readInt();
                int readInt55 = parcel.readInt();
                if (F041 != null) {
                    N0(F041, readInt54, 34, Q0(new i2.v(readInt55, 3)));
                    return true;
                }
                return true;
            case 3054:
                l F042 = p.F0(parcel.readStrongBinder());
                int readInt56 = parcel.readInt();
                final boolean z12 = parcel.readInt() != 0;
                final int readInt57 = parcel.readInt();
                if (F042 != null) {
                    N0(F042, readInt56, 34, Q0(new e2.j() { // from class: m4.w0
                        @Override // e2.j
                        public final void accept(Object obj) {
                            ((m1) obj).I(readInt57, z12);
                        }
                    }));
                    return true;
                }
                return true;
            case 3055:
                l F043 = p.F0(parcel.readStrongBinder());
                int readInt58 = parcel.readInt();
                int readInt59 = parcel.readInt();
                Bundle bundle11 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                if (F043 != null && bundle11 != null && readInt59 >= 0 && (n22 = this.b.n(F043.asBinder())) != null) {
                    try {
                        final b2.p0 a19 = b2.p0.a(n22.c, bundle11);
                        final int i16 = 1;
                        O0(n22, readInt58, 20, new z0(new y0(1, new g1() { // from class: m4.t0
                            @Override // m4.g1
                            public final Object c(e0 e0Var3, v vVar2, int i132) {
                                switch (i16) {
                                }
                                return e0Var3.l(vVar2, e9.n0.y(a19));
                            }
                        }, new r0(this, readInt59, 2)), 1));
                    } catch (RuntimeException e18) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e18);
                    }
                }
                return true;
            case 3056:
                l F044 = p.F0(parcel.readStrongBinder());
                int readInt60 = parcel.readInt();
                int readInt61 = parcel.readInt();
                int readInt62 = parcel.readInt();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (F044 != null && readStrongBinder3 != null && readInt61 >= 0 && readInt62 >= readInt61 && (n23 = this.b.n(F044.asBinder())) != null) {
                    try {
                        e9.n0 a20 = b2.i.a(readStrongBinder3);
                        e9.k0 t12 = e9.n0.t();
                        for (int i17 = 0; i17 < a20.size(); i17++) {
                            Bundle bundle12 = (Bundle) a20.get(i17);
                            bundle12.getClass();
                            t12.c(b2.p0.a(n23.c, bundle12));
                        }
                        m5 m5Var = new m5(t12.f(), 4);
                        q0 q0Var = new q0(this, readInt61, readInt62);
                        int i18 = 1;
                        O0(n23, readInt60, 20, new z0(new y0(i18, m5Var, q0Var), i18));
                    } catch (RuntimeException e19) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e19);
                    }
                }
                return true;
            case 3057:
                l F045 = p.F0(parcel.readStrongBinder());
                int readInt63 = parcel.readInt();
                Bundle bundle13 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                boolean z13 = parcel.readInt() != 0;
                if (F045 != null && bundle13 != null) {
                    try {
                        N0(F045, readInt63, 35, Q0(new bi.h(3, b2.f.a(bundle13), z13)));
                    } catch (RuntimeException e20) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e20);
                    }
                }
                return true;
            case 3058:
                l F046 = p.F0(parcel.readStrongBinder());
                int readInt64 = parcel.readInt();
                if (F046 != null) {
                    N0(F046, readInt64, 24, Q0(new k2.y0(14)));
                    return true;
                }
                return true;
            case 3059:
                l F047 = p.F0(parcel.readStrongBinder());
                int readInt65 = parcel.readInt();
                if (F047 != null) {
                    N0(F047, readInt65, 24, Q0(new v0(1)));
                    return true;
                }
                return true;
            case 3060:
                l F048 = p.F0(parcel.readStrongBinder());
                int readInt66 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                L0(F048, readInt66, (Bundle) w7.u.a(parcel, creator2), (Bundle) w7.u.a(parcel, creator2), parcel.readInt() != 0);
                return true;
            case 3061:
                l F049 = p.F0(parcel.readStrongBinder());
                int readInt67 = parcel.readInt();
                Surface surface2 = (Surface) w7.u.a(parcel, Surface.CREATOR);
                int readInt68 = parcel.readInt();
                int readInt69 = parcel.readInt();
                if (F049 != null) {
                    N0(F049, readInt67, 27, Q0(new s0(this, surface2, readInt68, readInt69)));
                    return true;
                }
                return true;
            case 3062:
                l F050 = p.F0(parcel.readStrongBinder());
                int readInt70 = parcel.readInt();
                int readInt71 = parcel.readInt();
                int readInt72 = parcel.readInt();
                if (F050 != null) {
                    N0(F050, readInt70, 27, Q0(new q0(this, readInt71, readInt72)));
                    return true;
                }
                return true;
            default:
                switch (i10) {
                    case 4001:
                        l F051 = p.F0(parcel.readStrongBinder());
                        int readInt73 = parcel.readInt();
                        Bundle bundle14 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                        if (F051 != null) {
                            if (bundle14 != null) {
                                try {
                                    a13 = q.a(bundle14);
                                } catch (RuntimeException e21) {
                                    e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e21);
                                }
                            }
                            i1Var2 = this;
                            i1Var2.H0(F051, readInt73, null, 50000, new z0(new v0(a13, 3), 0));
                            return true;
                        }
                        return true;
                    case 4002:
                        l F052 = p.F0(parcel.readStrongBinder());
                        int readInt74 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (F052 != null) {
                            if (TextUtils.isEmpty(readString2)) {
                                e2.a.l("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            H0(F052, readInt74, null, 50004, new z0(new k2.y0(readString2, 22), 0));
                            return true;
                        }
                        return true;
                    case 4003:
                        l F053 = p.F0(parcel.readStrongBinder());
                        int readInt75 = parcel.readInt();
                        String readString3 = parcel.readString();
                        int readInt76 = parcel.readInt();
                        int readInt77 = parcel.readInt();
                        Bundle bundle15 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                        if (F053 != null) {
                            if (TextUtils.isEmpty(readString3)) {
                                e2.a.l("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                            } else if (readInt76 < 0) {
                                e2.a.l("MediaSessionStub", "getChildren(): Ignoring negative page");
                            } else if (readInt77 < 1) {
                                e2.a.l("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle15 != null) {
                                    try {
                                        a12 = q.a(bundle15);
                                    } catch (RuntimeException e22) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e22);
                                    }
                                }
                                H0(F053, readInt75, null, 50003, new z0(new k2.y0(readString3, readInt76, readInt77, a12, 13), 0));
                            }
                        }
                        return true;
                    case 4004:
                        l F054 = p.F0(parcel.readStrongBinder());
                        int readInt78 = parcel.readInt();
                        String readString4 = parcel.readString();
                        Bundle bundle16 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                        if (F054 != null) {
                            if (TextUtils.isEmpty(readString4)) {
                                e2.a.l("MediaSessionStub", "search(): Ignoring empty query");
                            } else {
                                if (bundle16 != null) {
                                    try {
                                        a11 = q.a(bundle16);
                                    } catch (RuntimeException e23) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e23);
                                    }
                                }
                                H0(F054, readInt78, null, 50005, new z0(new v0(readString4, a11, 7), 0));
                            }
                        }
                        return true;
                    case 4005:
                        l F055 = p.F0(parcel.readStrongBinder());
                        int readInt79 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt80 = parcel.readInt();
                        int readInt81 = parcel.readInt();
                        Bundle bundle17 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                        if (F055 != null) {
                            if (TextUtils.isEmpty(readString5)) {
                                e2.a.l("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                            } else if (readInt80 < 0) {
                                e2.a.l("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                            } else if (readInt81 < 1) {
                                e2.a.l("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle17 != null) {
                                    try {
                                        a10 = q.a(bundle17);
                                    } catch (RuntimeException e24) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e24);
                                    }
                                }
                                H0(F055, readInt79, null, 50006, new z0(new k2.y0(readString5, readInt80, readInt81, a10, 29), 0));
                            }
                        }
                        return true;
                    case 4006:
                        l F056 = p.F0(parcel.readStrongBinder());
                        int readInt82 = parcel.readInt();
                        String readString6 = parcel.readString();
                        Bundle bundle18 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                        if (F056 != null) {
                            if (TextUtils.isEmpty(readString6)) {
                                e2.a.l("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                            } else {
                                if (bundle18 != null) {
                                    try {
                                        a2 = q.a(bundle18);
                                    } catch (RuntimeException e25) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e25);
                                    }
                                }
                                H0(F056, readInt82, null, 50001, new z0(new v0(readString6, a2, 5), 0));
                            }
                        }
                        return true;
                    case 4007:
                        l F057 = p.F0(parcel.readStrongBinder());
                        int readInt83 = parcel.readInt();
                        String readString7 = parcel.readString();
                        if (F057 != null) {
                            if (TextUtils.isEmpty(readString7)) {
                                e2.a.l("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            H0(F057, readInt83, null, 50002, new z0(new k2.y0(readString7, 12), 0));
                            return true;
                        }
                        return true;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
