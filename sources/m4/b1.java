package m4;

import ai.i5;
import ai.z1;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import b2.p1;
import b2.q1;
import b2.r1;
import b2.s1;
import e9.o1;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class b1 extends Binder implements j {
    public final WeakReference a;
    public final oi.f b;
    public final Set c;
    public e9.z0 d;
    public int e;

    public b1(b0 b0Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.a = new WeakReference(b0Var);
        this.b = new oi.f(b0Var);
        this.c = DesugarCollections.synchronizedSet(new HashSet());
        this.d = e9.z0.r;
    }

    public static i9.w H0(b0 b0Var, r rVar, int i10, a1 a1Var, e2.h hVar) {
        if (b0Var.j()) {
            return i9.u.b;
        }
        i9.w wVar = (i9.w) a1Var.h(b0Var, rVar, i10);
        i9.c0 c0Var = new i9.c0();
        wVar.a(new i5(b0Var, c0Var, hVar, wVar, 24), i9.q.a);
        return c0Var;
    }

    public static void N0(b0 b0Var, r rVar, int i10, l1 l1Var) {
        try {
            q qVar = rVar.d;
            e2.d.h(qVar);
            qVar.i(i10, l1Var);
            b0Var.c.a(true, true);
        } catch (RemoteException e7) {
            e2.a.o("MediaSessionStub", "Failed to send result to controller " + rVar, e7);
        }
    }

    public static w O0(e2.h hVar) {
        return new w(new w(hVar, 5), 4);
    }

    public final void F0(i iVar, int i10, h1 h1Var, int i11, a1 a1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            b0 b0Var = (b0) this.a.get();
            if (b0Var != null && !b0Var.j()) {
                r t10 = this.b.t(iVar.asBinder());
                if (t10 == null) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                } else {
                    e2.d0.T(b0Var.l, new t0(this, t10, h1Var, b0Var, i10, i11, a1Var));
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final d1 G0(d1 d1Var) {
        e9.i0 i0Var = d1Var.D.a;
        e9.f0 u10 = e9.i0.u();
        e9.b0 b0Var = new e9.b0(4, 5);
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            r1 r1Var = (r1) i0Var.get(i10);
            b2.l1 l1Var = r1Var.b;
            String str = (String) this.d.get(l1Var);
            if (str == null) {
                StringBuilder sb2 = new StringBuilder();
                int i11 = this.e;
                this.e = i11 + 1;
                String str2 = e2.d0.a;
                sb2.append(Integer.toString(i11, 36));
                sb2.append("-");
                sb2.append(l1Var.b);
                str = sb2.toString();
            }
            b0Var.H(l1Var, str);
            u10.b(new r1(new b2.l1(str, r1Var.b.d), r1Var.c, r1Var.d, r1Var.e));
        }
        this.d = b0Var.f();
        d1 a2 = d1Var.a(new s1(u10.i()));
        q1 q1Var = a2.E;
        if (q1Var.D.isEmpty()) {
            return a2;
        }
        p1 c10 = q1Var.a().c();
        o1 it = q1Var.D.values().iterator();
        while (it.hasNext()) {
            b2.m1 m1Var = (b2.m1) it.next();
            b2.l1 l1Var2 = m1Var.a;
            String str3 = (String) this.d.get(l1Var2);
            if (str3 != null) {
                c10.a(new b2.m1(new b2.l1(str3, l1Var2.d), m1Var.b));
            } else {
                c10.a(m1Var);
            }
        }
        return a2.d(c10.b());
    }

    public final void I0(i iVar, int i10) {
        if (iVar == null) {
            return;
        }
        L0(iVar, i10, 26, O0(new j2.e(24)));
    }

    public final int J0(r rVar, f1 f1Var, int i10) {
        if (f1Var.m0(17)) {
            oi.f fVar = this.b;
            if (!fVar.B(rVar, 17) && fVar.B(rVar, 16)) {
                return f1Var.l0() + i10;
            }
        }
        return i10;
    }

    public final void K0(i iVar, int i10, Bundle bundle) {
        e eVar;
        if (iVar == null || bundle == null) {
            return;
        }
        try {
            l1 a2 = l1.a(bundle);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                oi.f fVar = this.b;
                IBinder asBinder = iVar.asBinder();
                synchronized (fVar.a) {
                    try {
                        r t10 = fVar.t(asBinder);
                        eVar = t10 != null ? (e) ((a0.f) fVar.c).get(t10) : null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                com.google.android.gms.common.api.internal.v vVar = eVar != null ? eVar.b : null;
                if (vVar == null) {
                    return;
                }
                vVar.i(i10, a2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } catch (RuntimeException e7) {
            e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e7);
        }
    }

    public final void L0(i iVar, int i10, int i11, a1 a1Var) {
        r t10 = this.b.t(iVar.asBinder());
        if (t10 != null) {
            M0(t10, i10, i11, a1Var);
        }
    }

    public final void M0(r rVar, int i10, int i11, a1 a1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            b0 b0Var = (b0) this.a.get();
            if (b0Var != null && !b0Var.j()) {
                e2.d0.T(b0Var.l, new ii.i0(this, rVar, i11, b0Var, i10, a1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void P0(i iVar, int i10, int i11) {
        if (iVar == null || i11 < 0) {
            return;
        }
        L0(iVar, i10, 25, O0(new i2.w(i11, 6)));
    }

    public final void Q0(i iVar, int i10, Bundle bundle, boolean z10) {
        if (iVar == null || bundle == null) {
            return;
        }
        try {
            L0(iVar, i10, 31, new u0(new ah.b(28, new ai.k(2, b2.k0.a(bundle), z10), new q0(14)), 1));
        } catch (RuntimeException e7) {
            e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e7);
        }
    }

    public final void R0(i iVar, int i10, Bundle bundle, long j3) {
        if (iVar == null || bundle == null) {
            return;
        }
        try {
            L0(iVar, i10, 31, new u0(new ah.b(28, new z1(b2.k0.a(bundle), j3, 2), new q0(14)), 1));
        } catch (RuntimeException e7) {
            e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e7);
        }
    }

    public final void S0(i iVar, int i10, IBinder iBinder, boolean z10) {
        if (iVar == null || iBinder == null) {
            return;
        }
        try {
            e9.i0 a2 = b2.h.a(iBinder);
            e9.f0 u10 = e9.i0.u();
            for (int i11 = 0; i11 < a2.size(); i11++) {
                Bundle bundle = (Bundle) a2.get(i11);
                bundle.getClass();
                u10.b(b2.k0.a(bundle));
            }
            L0(iVar, i10, 20, new u0(new ah.b(28, new ai.k(4, u10.i(), z10), new q0(14)), 1));
        } catch (RuntimeException e7) {
            e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e7);
        }
    }

    public final void T0(i iVar, int i10, IBinder iBinder, int i11, long j3) {
        if (iVar == null || iBinder == null) {
            return;
        }
        if (i11 == -1 || i11 >= 0) {
            try {
                e9.i0 a2 = b2.h.a(iBinder);
                e9.f0 u10 = e9.i0.u();
                for (int i12 = 0; i12 < a2.size(); i12++) {
                    Bundle bundle = (Bundle) a2.get(i12);
                    bundle.getClass();
                    u10.b(b2.k0.a(bundle));
                }
                L0(iVar, i10, 20, new u0(new ah.b(28, new j2.d(u10.i(), i11, j3, 2), new q0(14)), 1));
            } catch (RuntimeException e7) {
                e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e7);
            }
        }
    }

    public final void U0(i iVar, int i10, float f7) {
        if (iVar == null || f7 < 0.0f || f7 > 1.0f) {
            return;
        }
        L0(iVar, i10, 24, O0(new i2.v(f7, 2)));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        h1 h1Var;
        b1 b1Var;
        r t10;
        r t11;
        r t12;
        r t13;
        r t14;
        r t15;
        r t16;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        switch (i10) {
            case 3002:
                U0(m.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                P0(m.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                I0(m.F0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                i F0 = m.F0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                if (F0 != null) {
                    L0(F0, readInt, 26, O0(new q0(4)));
                    return true;
                }
                return true;
            case 3006:
                i F02 = m.F0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                boolean z10 = parcel.readInt() != 0;
                if (F02 != null) {
                    L0(F02, readInt2, 26, O0(new i2.y(3, z10)));
                    return true;
                }
                return true;
            case 3007:
                Q0(m.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.r.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                R0(m.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.r.a(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                Q0(m.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.r.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                S0(m.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                S0(m.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                T0(m.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                i F03 = m.F0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                boolean z11 = parcel.readInt() != 0;
                if (F03 != null) {
                    L0(F03, readInt3, 1, O0(new i2.y(2, z11)));
                    return true;
                }
                return true;
            case 3014:
                K0(m.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.r.a(parcel, Bundle.CREATOR));
                return true;
            case 3015:
                i F04 = m.F0(parcel.readStrongBinder());
                parcel.readInt();
                Bundle bundle = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                WeakReference weakReference = this.a;
                if (F04 != null && bundle != null) {
                    try {
                        f a2 = f.a(bundle);
                        int callingUid = Binder.getCallingUid();
                        int callingPid = Binder.getCallingPid();
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        if (callingPid == 0) {
                            callingPid = a2.d;
                        }
                        try {
                            n4.z zVar = new n4.z(a2.c, callingPid, callingUid);
                            b0 b0Var = (b0) weakReference.get();
                            boolean z12 = b0Var != null && n4.c0.a(b0Var.f).b(zVar);
                            int i12 = a2.a;
                            int i13 = a2.b;
                            r rVar = new r(zVar, i12, i13, z12, new x0(F04, i13), a2.e);
                            b0 b0Var2 = (b0) weakReference.get();
                            if (b0Var2 != null && !b0Var2.j()) {
                                this.c.add(rVar);
                                try {
                                    try {
                                        e2.d0.T(b0Var2.l, new i5(this, rVar, b0Var2, F04, 23));
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            w7.t.a(F04);
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (RuntimeException e7) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e7);
                    }
                }
                return true;
            case 3016:
                i F05 = m.F0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) w7.r.a(parcel, creator);
                Bundle bundle3 = (Bundle) w7.r.a(parcel, creator);
                if (F05 != null && bundle2 != null && bundle3 != null) {
                    try {
                        int i14 = bundle2.getInt(h1.f, 0);
                        if (i14 != 0) {
                            h1Var = new h1(i14);
                        } else {
                            String string = bundle2.getString(h1.g);
                            string.getClass();
                            Bundle bundle4 = bundle2.getBundle(h1.h);
                            if (bundle4 == null) {
                                bundle4 = Bundle.EMPTY;
                            }
                            h1Var = new h1(string, bundle4);
                        }
                        b1Var = this;
                        b1Var.F0(F05, readInt4, h1Var, 0, new u0(new j2.e(26, h1Var, bundle3), 1));
                    } catch (RuntimeException e10) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e10);
                    }
                    return true;
                }
                return true;
            case 3017:
                i F06 = m.F0(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                if (F06 != null && (readInt6 == 2 || readInt6 == 0 || readInt6 == 1)) {
                    L0(F06, readInt5, 15, O0(new i2.w(readInt6, 5)));
                    return true;
                }
                return true;
            case 3018:
                i F07 = m.F0(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                boolean z13 = parcel.readInt() != 0;
                if (F07 != null) {
                    L0(F07, readInt7, 14, O0(new i2.y(4, z13)));
                    return true;
                }
                return true;
            case 3019:
                i F08 = m.F0(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                int readInt9 = parcel.readInt();
                if (F08 != null && readInt9 >= 0) {
                    L0(F08, readInt8, 20, new w(new n0(this, readInt9, 4), 4));
                    return true;
                }
                return true;
            case 3020:
                i F09 = m.F0(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                int readInt11 = parcel.readInt();
                int readInt12 = parcel.readInt();
                if (F09 != null && readInt11 >= 0 && readInt12 >= readInt11) {
                    L0(F09, readInt10, 20, new w(new m0(this, readInt11, readInt12), 4));
                    return true;
                }
                return true;
            case 3021:
                i F010 = m.F0(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                if (F010 != null) {
                    L0(F010, readInt13, 20, O0(new q0(12)));
                    return true;
                }
                return true;
            case 3022:
                i F011 = m.F0(parcel.readStrongBinder());
                int readInt14 = parcel.readInt();
                int readInt15 = parcel.readInt();
                int readInt16 = parcel.readInt();
                if (F011 != null && readInt15 >= 0 && readInt16 >= 0) {
                    L0(F011, readInt14, 20, O0(new dh.c(readInt15, readInt16, 4)));
                    return true;
                }
                return true;
            case 3023:
                i F012 = m.F0(parcel.readStrongBinder());
                int readInt17 = parcel.readInt();
                final int readInt18 = parcel.readInt();
                final int readInt19 = parcel.readInt();
                final int readInt20 = parcel.readInt();
                if (F012 != null && readInt18 >= 0 && readInt19 >= readInt18 && readInt20 >= 0) {
                    L0(F012, readInt17, 20, O0(new e2.h() { // from class: m4.p0
                        @Override // e2.h
                        public final void accept(Object obj) {
                            ((f1) obj).r0(readInt18, readInt19, readInt20);
                        }
                    }));
                    return true;
                }
                return true;
            case 3024:
                i F013 = m.F0(parcel.readStrongBinder());
                int readInt21 = parcel.readInt();
                if (F013 != null && (t10 = this.b.t(F013.asBinder())) != null) {
                    M0(t10, readInt21, 1, O0(new ah.b(27, this, t10)));
                    return true;
                }
                return true;
            case 3025:
                i F014 = m.F0(parcel.readStrongBinder());
                int readInt22 = parcel.readInt();
                if (F014 != null && (t11 = this.b.t(F014.asBinder())) != null) {
                    M0(t11, readInt22, 1, O0(new j2.e(22)));
                    return true;
                }
                return true;
            case 3026:
                i F015 = m.F0(parcel.readStrongBinder());
                int readInt23 = parcel.readInt();
                if (F015 != null) {
                    L0(F015, readInt23, 2, O0(new q0(9)));
                    return true;
                }
                return true;
            case 3027:
                i F016 = m.F0(parcel.readStrongBinder());
                int readInt24 = parcel.readInt();
                Bundle bundle5 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                if (F016 != null && bundle5 != null) {
                    try {
                        L0(F016, readInt24, 13, O0(new w(new b2.v0(bundle5.getFloat(b2.v0.e, 1.0f), bundle5.getFloat(b2.v0.f, 1.0f)), 2)));
                    } catch (RuntimeException e11) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e11);
                    }
                }
                return true;
            case 3028:
                i F017 = m.F0(parcel.readStrongBinder());
                int readInt25 = parcel.readInt();
                float readFloat = parcel.readFloat();
                if (F017 != null && readFloat > 0.0f) {
                    L0(F017, readInt25, 13, O0(new i2.v(readFloat, 1)));
                    return true;
                }
                return true;
            case 3029:
                i F018 = m.F0(parcel.readStrongBinder());
                int readInt26 = parcel.readInt();
                Bundle bundle6 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                if (F018 != null && bundle6 != null) {
                    try {
                        final b2.k0 a10 = b2.k0.a(bundle6);
                        final int i15 = 2;
                        L0(F018, readInt26, 20, new u0(new ah.b(29, new a1() { // from class: m4.o0
                            @Override // m4.a1
                            public final Object h(b0 b0Var3, r rVar2, int i16) {
                                switch (i15) {
                                }
                                return b0Var3.l(rVar2, e9.i0.z(a10));
                            }
                        }, new q0(5)), 1));
                    } catch (RuntimeException e12) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e12);
                    }
                }
                return true;
            case 3030:
                i F019 = m.F0(parcel.readStrongBinder());
                int readInt27 = parcel.readInt();
                int readInt28 = parcel.readInt();
                Bundle bundle7 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                if (F019 != null && bundle7 != null && readInt28 >= 0) {
                    try {
                        final b2.k0 a11 = b2.k0.a(bundle7);
                        final int i16 = 0;
                        L0(F019, readInt27, 20, new u0(new ah.b(29, new a1() { // from class: m4.o0
                            @Override // m4.a1
                            public final Object h(b0 b0Var3, r rVar2, int i162) {
                                switch (i16) {
                                }
                                return b0Var3.l(rVar2, e9.i0.z(a11));
                            }
                        }, new n0(this, readInt28, 1)), 1));
                    } catch (RuntimeException e13) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e13);
                    }
                }
                return true;
            case 3031:
                i F020 = m.F0(parcel.readStrongBinder());
                int readInt29 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (F020 != null && readStrongBinder != null) {
                    try {
                        e9.i0 a12 = b2.h.a(readStrongBinder);
                        e9.f0 u10 = e9.i0.u();
                        for (int i17 = 0; i17 < a12.size(); i17++) {
                            Bundle bundle8 = (Bundle) a12.get(i17);
                            bundle8.getClass();
                            u10.b(b2.k0.a(bundle8));
                        }
                        int i18 = 3;
                        L0(F020, readInt29, 20, new u0(new ah.b(29, new i2.z(i18, u10.i()), new q0(i18)), 1));
                    } catch (RuntimeException e14) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e14);
                    }
                }
                return true;
            case 3032:
                i F021 = m.F0(parcel.readStrongBinder());
                int readInt30 = parcel.readInt();
                int readInt31 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (F021 != null && readStrongBinder2 != null && readInt31 >= 0) {
                    try {
                        e9.i0 a13 = b2.h.a(readStrongBinder2);
                        e9.f0 u11 = e9.i0.u();
                        for (int i19 = 0; i19 < a13.size(); i19++) {
                            Bundle bundle9 = (Bundle) a13.get(i19);
                            bundle9.getClass();
                            u11.b(b2.k0.a(bundle9));
                        }
                        L0(F021, readInt30, 20, new u0(new ah.b(29, new i2.z(2, u11.i()), new n0(this, readInt31, 3)), 1));
                    } catch (RuntimeException e15) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e15);
                    }
                }
                return true;
            case 3033:
                i F022 = m.F0(parcel.readStrongBinder());
                int readInt32 = parcel.readInt();
                Bundle bundle10 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                if (F022 != null && bundle10 != null) {
                    try {
                        L0(F022, readInt32, 19, O0(new i2.t(b2.n0.b(bundle10))));
                    } catch (RuntimeException e16) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e16);
                    }
                }
                return true;
            case 3034:
                i F023 = m.F0(parcel.readStrongBinder());
                int readInt33 = parcel.readInt();
                if (F023 != null && (t12 = this.b.t(F023.asBinder())) != null) {
                    M0(t12, readInt33, 3, O0(new q0(7)));
                    return true;
                }
                return true;
            case 3035:
                i F024 = m.F0(parcel.readStrongBinder());
                parcel.readInt();
                if (F024 != null) {
                    long clearCallingIdentity2 = Binder.clearCallingIdentity();
                    try {
                        b0 b0Var3 = (b0) this.a.get();
                        if (b0Var3 != null && !b0Var3.j()) {
                            e2.d0.T(b0Var3.l, new ki.i0(6, this, F024));
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                return true;
            case 3036:
                i F025 = m.F0(parcel.readStrongBinder());
                int readInt34 = parcel.readInt();
                if (F025 != null) {
                    L0(F025, readInt34, 4, O0(new q0(10)));
                    return true;
                }
                return true;
            case 3037:
                i F026 = m.F0(parcel.readStrongBinder());
                int readInt35 = parcel.readInt();
                int readInt36 = parcel.readInt();
                if (F026 != null && readInt36 >= 0) {
                    L0(F026, readInt35, 10, new w(new n0(this, readInt36, 0), 4));
                    return true;
                }
                return true;
            case 3038:
                i F027 = m.F0(parcel.readStrongBinder());
                int readInt37 = parcel.readInt();
                final long readLong = parcel.readLong();
                if (F027 != null) {
                    L0(F027, readInt37, 5, O0(new e2.h() { // from class: m4.s0
                        @Override // e2.h
                        public final void accept(Object obj) {
                            ((f1) obj).g(readLong);
                        }
                    }));
                    return true;
                }
                return true;
            case 3039:
                i F028 = m.F0(parcel.readStrongBinder());
                int readInt38 = parcel.readInt();
                int readInt39 = parcel.readInt();
                long readLong2 = parcel.readLong();
                if (F028 != null && readInt39 >= 0) {
                    L0(F028, readInt38, 10, new w(new j2.d(this, readInt39, readLong2, 1), 4));
                    return true;
                }
                return true;
            case 3040:
                i F029 = m.F0(parcel.readStrongBinder());
                int readInt40 = parcel.readInt();
                if (F029 != null && (t13 = this.b.t(F029.asBinder())) != null) {
                    M0(t13, readInt40, 11, O0(new j2.e(25)));
                    return true;
                }
                return true;
            case 3041:
                i F030 = m.F0(parcel.readStrongBinder());
                int readInt41 = parcel.readInt();
                if (F030 != null && (t14 = this.b.t(F030.asBinder())) != null) {
                    M0(t14, readInt41, 12, O0(new q0(0)));
                    return true;
                }
                return true;
            case 3042:
                i F031 = m.F0(parcel.readStrongBinder());
                int readInt42 = parcel.readInt();
                if (F031 != null) {
                    L0(F031, readInt42, 6, O0(new j2.e(28)));
                    return true;
                }
                return true;
            case 3043:
                i F032 = m.F0(parcel.readStrongBinder());
                int readInt43 = parcel.readInt();
                if (F032 != null) {
                    L0(F032, readInt43, 8, O0(new j2.e(23)));
                    return true;
                }
                return true;
            case 3044:
                i F033 = m.F0(parcel.readStrongBinder());
                int readInt44 = parcel.readInt();
                Surface surface = (Surface) w7.r.a(parcel, Surface.CREATOR);
                if (F033 != null) {
                    L0(F033, readInt44, 27, O0(new w(surface, 3)));
                    return true;
                }
                return true;
            case 3045:
                i F034 = m.F0(parcel.readStrongBinder());
                if (F034 != null) {
                    long clearCallingIdentity3 = Binder.clearCallingIdentity();
                    try {
                        b0 b0Var4 = (b0) this.a.get();
                        if (b0Var4 != null && !b0Var4.j()) {
                            r t17 = this.b.t(F034.asBinder());
                            if (t17 != null) {
                                e2.d0.T(b0Var4.l, new ki.i0(7, this, t17));
                            }
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                return true;
            case 3046:
                i F035 = m.F0(parcel.readStrongBinder());
                int readInt45 = parcel.readInt();
                if (F035 != null && (t15 = this.b.t(F035.asBinder())) != null) {
                    M0(t15, readInt45, 7, O0(new j2.e(27)));
                    return true;
                }
                return true;
            case 3047:
                i F036 = m.F0(parcel.readStrongBinder());
                int readInt46 = parcel.readInt();
                if (F036 != null && (t16 = this.b.t(F036.asBinder())) != null) {
                    M0(t16, readInt46, 9, O0(new q0(1)));
                    return true;
                }
                return true;
            case 3048:
                i F037 = m.F0(parcel.readStrongBinder());
                int readInt47 = parcel.readInt();
                Bundle bundle11 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                if (F037 != null && bundle11 != null) {
                    try {
                        L0(F037, readInt47, 29, O0(new ah.b(26, this, q1.b(bundle11))));
                    } catch (RuntimeException e17) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e17);
                    }
                }
                return true;
            case 3049:
                i F038 = m.F0(parcel.readStrongBinder());
                int readInt48 = parcel.readInt();
                String readString = parcel.readString();
                Bundle bundle12 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                if (F038 != null && readString != null && bundle12 != null) {
                    if (!TextUtils.isEmpty(readString)) {
                        try {
                            u0 u0Var = new u0(new q0(readString, 2, b2.c1.a(bundle12)), 1);
                            b1Var = this;
                            b1Var.F0(F038, readInt48, null, 40010, u0Var);
                        } catch (RuntimeException e18) {
                            e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for Rating", e18);
                        }
                        return true;
                    }
                    e2.a.n("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                }
                return true;
            case 3050:
                i F039 = m.F0(parcel.readStrongBinder());
                int readInt49 = parcel.readInt();
                Bundle bundle13 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                if (F039 != null && bundle13 != null) {
                    try {
                        F0(F039, readInt49, null, 40010, new u0(new q0(b2.c1.a(bundle13), 15), 1));
                    } catch (RuntimeException e19) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for Rating", e19);
                    }
                }
                return true;
            case 3051:
                i F040 = m.F0(parcel.readStrongBinder());
                int readInt50 = parcel.readInt();
                int readInt51 = parcel.readInt();
                int readInt52 = parcel.readInt();
                if (F040 != null && readInt51 >= 0) {
                    L0(F040, readInt50, 33, O0(new dh.c(readInt51, readInt52, 3)));
                    return true;
                }
                return true;
            case 3052:
                i F041 = m.F0(parcel.readStrongBinder());
                int readInt53 = parcel.readInt();
                int readInt54 = parcel.readInt();
                if (F041 != null) {
                    L0(F041, readInt53, 34, O0(new i2.w(readInt54, 4)));
                    return true;
                }
                return true;
            case 3053:
                i F042 = m.F0(parcel.readStrongBinder());
                int readInt55 = parcel.readInt();
                int readInt56 = parcel.readInt();
                if (F042 != null) {
                    L0(F042, readInt55, 34, O0(new i2.w(readInt56, 3)));
                    return true;
                }
                return true;
            case 3054:
                i F043 = m.F0(parcel.readStrongBinder());
                int readInt57 = parcel.readInt();
                final boolean z14 = parcel.readInt() != 0;
                final int readInt58 = parcel.readInt();
                if (F043 != null) {
                    L0(F043, readInt57, 34, O0(new e2.h() { // from class: m4.r0
                        @Override // e2.h
                        public final void accept(Object obj) {
                            ((f1) obj).J(readInt58, z14);
                        }
                    }));
                    return true;
                }
                return true;
            case 3055:
                i F044 = m.F0(parcel.readStrongBinder());
                int readInt59 = parcel.readInt();
                int readInt60 = parcel.readInt();
                Bundle bundle14 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                if (F044 != null && bundle14 != null && readInt60 >= 0) {
                    try {
                        final b2.k0 a14 = b2.k0.a(bundle14);
                        final int i20 = 1;
                        L0(F044, readInt59, 20, new u0(new ah.b(29, new a1() { // from class: m4.o0
                            @Override // m4.a1
                            public final Object h(b0 b0Var32, r rVar2, int i162) {
                                switch (i20) {
                                }
                                return b0Var32.l(rVar2, e9.i0.z(a14));
                            }
                        }, new n0(this, readInt60, 2)), 1));
                    } catch (RuntimeException e20) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e20);
                    }
                }
                return true;
            case 3056:
                i F045 = m.F0(parcel.readStrongBinder());
                int readInt61 = parcel.readInt();
                int readInt62 = parcel.readInt();
                int readInt63 = parcel.readInt();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (F045 != null && readStrongBinder3 != null && readInt62 >= 0 && readInt63 >= readInt62) {
                    try {
                        e9.i0 a15 = b2.h.a(readStrongBinder3);
                        e9.f0 u12 = e9.i0.u();
                        for (int i21 = 0; i21 < a15.size(); i21++) {
                            Bundle bundle15 = (Bundle) a15.get(i21);
                            bundle15.getClass();
                            u12.b(b2.k0.a(bundle15));
                        }
                        L0(F045, readInt61, 20, new u0(new ah.b(29, new w(u12.i(), 1), new m0(this, readInt62, readInt63)), 1));
                    } catch (RuntimeException e21) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e21);
                    }
                }
                return true;
            case 3057:
                i F046 = m.F0(parcel.readStrongBinder());
                int readInt64 = parcel.readInt();
                Bundle bundle16 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                boolean z15 = parcel.readInt() != 0;
                if (F046 != null && bundle16 != null) {
                    try {
                        L0(F046, readInt64, 35, O0(new ai.k(3, b2.e.a(bundle16), z15)));
                    } catch (RuntimeException e22) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e22);
                    }
                }
                return true;
            default:
                n nVar = null;
                switch (i10) {
                    case 4001:
                        i F047 = m.F0(parcel.readStrongBinder());
                        int readInt65 = parcel.readInt();
                        Bundle bundle17 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                        if (F047 != null) {
                            if (bundle17 != null) {
                                try {
                                    nVar = n.a(bundle17);
                                } catch (RuntimeException e23) {
                                    e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e23);
                                }
                            }
                            b1Var = this;
                            b1Var.F0(F047, readInt65, null, 50000, new u0(new q0(nVar, 8), 0));
                            return true;
                        }
                        return true;
                    case 4002:
                        i F048 = m.F0(parcel.readStrongBinder());
                        int readInt66 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (F048 != null) {
                            if (TextUtils.isEmpty(readString2)) {
                                e2.a.n("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            F0(F048, readInt66, null, 50004, new u0(new j2.e(readString2, 29), 0));
                            return true;
                        }
                        return true;
                    case 4003:
                        i F049 = m.F0(parcel.readStrongBinder());
                        int readInt67 = parcel.readInt();
                        String readString3 = parcel.readString();
                        int readInt68 = parcel.readInt();
                        int readInt69 = parcel.readInt();
                        Bundle bundle18 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                        if (F049 != null) {
                            if (TextUtils.isEmpty(readString3)) {
                                e2.a.n("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                            } else if (readInt68 < 0) {
                                e2.a.n("MediaSessionStub", "getChildren(): Ignoring negative page");
                            } else if (readInt69 < 1) {
                                e2.a.n("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle18 != null) {
                                    try {
                                        nVar = n.a(bundle18);
                                    } catch (RuntimeException e24) {
                                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e24);
                                    }
                                }
                                F0(F049, readInt67, null, 50003, new u0(new j2.e(readString3, readInt68, readInt69, nVar), 0));
                            }
                        }
                        return true;
                    case 4004:
                        i F050 = m.F0(parcel.readStrongBinder());
                        int readInt70 = parcel.readInt();
                        String readString4 = parcel.readString();
                        Bundle bundle19 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                        if (F050 != null) {
                            if (TextUtils.isEmpty(readString4)) {
                                e2.a.n("MediaSessionStub", "search(): Ignoring empty query");
                            } else {
                                if (bundle19 != null) {
                                    try {
                                        nVar = n.a(bundle19);
                                    } catch (RuntimeException e25) {
                                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e25);
                                    }
                                }
                                F0(F050, readInt70, null, 50005, new u0(new q0(readString4, 13, nVar), 0));
                            }
                        }
                        return true;
                    case 4005:
                        i F051 = m.F0(parcel.readStrongBinder());
                        int readInt71 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt72 = parcel.readInt();
                        int readInt73 = parcel.readInt();
                        Bundle bundle20 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                        if (F051 != null) {
                            if (TextUtils.isEmpty(readString5)) {
                                e2.a.n("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                            } else if (readInt72 < 0) {
                                e2.a.n("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                            } else if (readInt73 < 1) {
                                e2.a.n("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle20 != null) {
                                    try {
                                        nVar = n.a(bundle20);
                                    } catch (RuntimeException e26) {
                                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e26);
                                    }
                                }
                                F0(F051, readInt71, null, 50006, new u0(new q0(readString5, readInt72, readInt73, nVar), 0));
                            }
                        }
                        return true;
                    case 4006:
                        i F052 = m.F0(parcel.readStrongBinder());
                        int readInt74 = parcel.readInt();
                        String readString6 = parcel.readString();
                        Bundle bundle21 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                        if (F052 != null) {
                            if (TextUtils.isEmpty(readString6)) {
                                e2.a.n("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                            } else {
                                if (bundle21 != null) {
                                    try {
                                        nVar = n.a(bundle21);
                                    } catch (RuntimeException e27) {
                                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e27);
                                    }
                                }
                                F0(F052, readInt74, null, 50001, new u0(new q0(readString6, 11, nVar), 0));
                            }
                        }
                        return true;
                    case 4007:
                        i F053 = m.F0(parcel.readStrongBinder());
                        int readInt75 = parcel.readInt();
                        String readString7 = parcel.readString();
                        if (F053 != null) {
                            if (TextUtils.isEmpty(readString7)) {
                                e2.a.n("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            F0(F053, readInt75, null, 50002, new u0(new j2.e(readString7, 20), 0));
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
