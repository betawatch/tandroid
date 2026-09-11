package m4;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import b2.s1;
import bi.t2;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import ji.b5;
import ji.k5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class f1 extends Binder implements j {
    public final WeakReference a;
    public final fg.f b;
    public final Set c;
    public e9.z0 d;
    public int e;

    public f1(a0 a0Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.a = new WeakReference(a0Var);
        this.b = new fg.f(a0Var);
        this.c = DesugarCollections.synchronizedSet(new HashSet());
        this.d = e9.z0.r;
    }

    public static i9.w I0(a0 a0Var, r rVar, int i10, e1 e1Var, e2.h hVar) {
        if (a0Var.j()) {
            return i9.u.b;
        }
        i9.w wVar = (i9.w) e1Var.h(a0Var, rVar, i10);
        i9.c0 c0Var = new i9.c0();
        wVar.a(new androidx.car.app.utils.b(a0Var, c0Var, hVar, wVar, 24), i9.q.a);
        return c0Var;
    }

    public static void O0(a0 a0Var, r rVar, int i10, p1 p1Var) {
        try {
            q qVar = rVar.d;
            e2.d.h(qVar);
            qVar.i(i10, p1Var);
            a0Var.c.a(true, true);
        } catch (RemoteException e7) {
            e2.a.o("MediaSessionStub", "Failed to send result to controller " + rVar, e7);
        }
    }

    public static k5 P0(e2.h hVar) {
        return new k5(new k5(hVar, 6), 5);
    }

    public final void G0(i iVar, int i10, l1 l1Var, int i11, e1 e1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            a0 a0Var = (a0) this.a.get();
            if (a0Var != null && !a0Var.j()) {
                r u10 = this.b.u(iVar.asBinder());
                if (u10 == null) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                } else {
                    e2.d0.U(a0Var.l, new w0(this, u10, l1Var, a0Var, i10, i11, e1Var));
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final h1 H0(h1 h1Var) {
        e9.i0 i0Var = h1Var.D.a;
        e9.f0 u10 = e9.i0.u();
        e9.b0 b0Var = new e9.b0(4, 5);
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            b2.r1 r1Var = (b2.r1) i0Var.get(i10);
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
            b0Var.F(l1Var, str);
            u10.b(new b2.r1(new b2.l1(str, r1Var.b.d), r1Var.c, r1Var.d, r1Var.e));
        }
        this.d = b0Var.c();
        h1 a2 = h1Var.a(new s1(u10.i()));
        b2.q1 q1Var = a2.E;
        if (q1Var.D.isEmpty()) {
            return a2;
        }
        b2.p1 c10 = q1Var.a().c();
        e9.o1 it = q1Var.D.values().iterator();
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

    public final void J0(i iVar, int i10) {
        if (iVar == null) {
            return;
        }
        M0(iVar, i10, 26, P0(new bi.f(7)));
    }

    public final int K0(r rVar, j1 j1Var, int i10) {
        if (j1Var.m0(17)) {
            fg.f fVar = this.b;
            if (!fVar.C(rVar, 17) && fVar.C(rVar, 16)) {
                return j1Var.l0() + i10;
            }
        }
        return i10;
    }

    public final void L0(i iVar, int i10, Bundle bundle) {
        e eVar;
        if (iVar == null || bundle == null) {
            return;
        }
        try {
            p1 a2 = p1.a(bundle);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                fg.f fVar = this.b;
                IBinder asBinder = iVar.asBinder();
                synchronized (fVar.a) {
                    try {
                        r u10 = fVar.u(asBinder);
                        eVar = u10 != null ? (e) ((a0.f) fVar.c).get(u10) : null;
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

    public final void M0(i iVar, int i10, int i11, e1 e1Var) {
        r u10 = this.b.u(iVar.asBinder());
        if (u10 != null) {
            N0(u10, i10, i11, e1Var);
        }
    }

    public final void N0(r rVar, int i10, int i11, e1 e1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            a0 a0Var = (a0) this.a.get();
            if (a0Var != null && !a0Var.j()) {
                e2.d0.U(a0Var.l, new ji.h0(this, rVar, i11, a0Var, i10, e1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void Q0(i iVar, int i10, int i11) {
        if (iVar == null || i11 < 0) {
            return;
        }
        M0(iVar, i10, 25, P0(new bi.j(i11, 4)));
    }

    public final void R0(i iVar, int i10, Bundle bundle, boolean z10) {
        if (iVar == null || bundle == null) {
            return;
        }
        try {
            M0(iVar, i10, 31, new x0(new ah.i0(26, new bi.h(2, b2.k0.a(bundle), z10), new t0(4)), 1));
        } catch (RuntimeException e7) {
            e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e7);
        }
    }

    public final void S0(i iVar, int i10, Bundle bundle, long j3) {
        if (iVar == null || bundle == null) {
            return;
        }
        try {
            M0(iVar, i10, 31, new x0(new ah.i0(26, new bi.p1(b2.k0.a(bundle), j3, 2), new t0(4)), 1));
        } catch (RuntimeException e7) {
            e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e7);
        }
    }

    public final void T0(i iVar, int i10, IBinder iBinder, boolean z10) {
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
            M0(iVar, i10, 20, new x0(new ah.i0(26, new bi.h(3, u10.i(), z10), new t0(4)), 1));
        } catch (RuntimeException e7) {
            e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e7);
        }
    }

    public final void U0(i iVar, int i10, IBinder iBinder, int i11, long j3) {
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
                M0(iVar, i10, 20, new x0(new ah.i0(26, new j2.d(u10.i(), i11, j3, 2), new t0(4)), 1));
            } catch (RuntimeException e7) {
                e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e7);
            }
        }
    }

    public final void V0(i iVar, int i10, float f7) {
        if (iVar == null || f7 < 0.0f || f7 > 1.0f) {
            return;
        }
        M0(iVar, i10, 24, P0(new o0(f7, 1)));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        l1 l1Var;
        f1 f1Var;
        r u10;
        r u11;
        r u12;
        r u13;
        r u14;
        r u15;
        r u16;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        switch (i10) {
            case 3002:
                V0(m.G0(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                Q0(m.G0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                J0(m.G0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                i G0 = m.G0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                if (G0 != null) {
                    M0(G0, readInt, 26, P0(new bi.f(13)));
                    return true;
                }
                return true;
            case 3006:
                i G02 = m.G0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                boolean z10 = parcel.readInt() != 0;
                if (G02 != null) {
                    M0(G02, readInt2, 26, P0(new n0(1, z10)));
                    return true;
                }
                return true;
            case 3007:
                R0(m.G0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.s.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                S0(m.G0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.s.a(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                R0(m.G0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.s.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                T0(m.G0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                T0(m.G0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                U0(m.G0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                i G03 = m.G0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                boolean z11 = parcel.readInt() != 0;
                if (G03 != null) {
                    M0(G03, readInt3, 1, P0(new n0(0, z11)));
                    return true;
                }
                return true;
            case 3014:
                L0(m.G0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.s.a(parcel, Bundle.CREATOR));
                return true;
            case 3015:
                i G04 = m.G0(parcel.readStrongBinder());
                parcel.readInt();
                Bundle bundle = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                WeakReference weakReference = this.a;
                if (G04 != null && bundle != null) {
                    try {
                        f a2 = f.a(bundle);
                        int callingUid = Binder.getCallingUid();
                        int callingPid = Binder.getCallingPid();
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        if (callingPid == 0) {
                            callingPid = a2.d;
                        }
                        try {
                            n4.a0 a0Var = new n4.a0(a2.c, callingPid, callingUid);
                            a0 a0Var2 = (a0) weakReference.get();
                            boolean z12 = a0Var2 != null && n4.d0.a(a0Var2.f).b(a0Var);
                            int i12 = a2.a;
                            int i13 = a2.b;
                            r rVar = new r(a0Var, i12, i13, z12, new b1(G04, i13), a2.e);
                            a0 a0Var3 = (a0) weakReference.get();
                            if (a0Var3 != null && !a0Var3.j()) {
                                this.c.add(rVar);
                                try {
                                    try {
                                        e2.d0.U(a0Var3.l, new androidx.car.app.utils.b(this, rVar, a0Var3, G04, 23));
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            w7.u.a(G04);
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (RuntimeException e7) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e7);
                    }
                }
                return true;
            case 3016:
                i G05 = m.G0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) w7.s.a(parcel, creator);
                Bundle bundle3 = (Bundle) w7.s.a(parcel, creator);
                if (G05 != null && bundle2 != null && bundle3 != null) {
                    try {
                        int i14 = bundle2.getInt(l1.f, 0);
                        if (i14 != 0) {
                            l1Var = new l1(i14);
                        } else {
                            String string = bundle2.getString(l1.g);
                            string.getClass();
                            Bundle bundle4 = bundle2.getBundle(l1.h);
                            if (bundle4 == null) {
                                bundle4 = Bundle.EMPTY;
                            }
                            l1Var = new l1(string, bundle4);
                        }
                        f1Var = this;
                        f1Var.G0(G05, readInt4, l1Var, 0, new x0(new j2.e(25, l1Var, bundle3), 1));
                    } catch (RuntimeException e10) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e10);
                    }
                    return true;
                }
                return true;
            case 3017:
                i G06 = m.G0(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                if (G06 != null && (readInt6 == 2 || readInt6 == 0 || readInt6 == 1)) {
                    M0(G06, readInt5, 15, P0(new bi.j(readInt6, 3)));
                    return true;
                }
                return true;
            case 3018:
                i G07 = m.G0(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                boolean z13 = parcel.readInt() != 0;
                if (G07 != null) {
                    M0(G07, readInt7, 14, P0(new n0(2, z13)));
                    return true;
                }
                return true;
            case 3019:
                i G08 = m.G0(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                int readInt9 = parcel.readInt();
                if (G08 != null && readInt9 >= 0) {
                    M0(G08, readInt8, 20, new k5(new m0(this, readInt9, 4), 5));
                    return true;
                }
                return true;
            case 3020:
                i G09 = m.G0(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                int readInt11 = parcel.readInt();
                int readInt12 = parcel.readInt();
                if (G09 != null && readInt11 >= 0 && readInt12 >= readInt11) {
                    M0(G09, readInt10, 20, new k5(new l0(this, readInt11, readInt12), 5));
                    return true;
                }
                return true;
            case 3021:
                i G010 = m.G0(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                if (G010 != null) {
                    M0(G010, readInt13, 20, P0(new bi.f(17)));
                    return true;
                }
                return true;
            case 3022:
                i G011 = m.G0(parcel.readStrongBinder());
                int readInt14 = parcel.readInt();
                final int readInt15 = parcel.readInt();
                final int readInt16 = parcel.readInt();
                if (G011 != null && readInt15 >= 0 && readInt16 >= 0) {
                    final int i15 = 1;
                    M0(G011, readInt14, 20, P0(new e2.h() { // from class: m4.r0
                        @Override // e2.h
                        public final void accept(Object obj) {
                            switch (i15) {
                                case 0:
                                    ((j1) obj).M(readInt15, readInt16);
                                    break;
                                default:
                                    ((j1) obj).q0(readInt15, readInt16);
                                    break;
                            }
                        }
                    }));
                    return true;
                }
                return true;
            case 3023:
                i G012 = m.G0(parcel.readStrongBinder());
                int readInt17 = parcel.readInt();
                final int readInt18 = parcel.readInt();
                final int readInt19 = parcel.readInt();
                final int readInt20 = parcel.readInt();
                if (G012 != null && readInt18 >= 0 && readInt19 >= readInt18 && readInt20 >= 0) {
                    M0(G012, readInt17, 20, P0(new e2.h() { // from class: m4.q0
                        @Override // e2.h
                        public final void accept(Object obj) {
                            ((j1) obj).r0(readInt18, readInt19, readInt20);
                        }
                    }));
                    return true;
                }
                return true;
            case 3024:
                i G013 = m.G0(parcel.readStrongBinder());
                int readInt21 = parcel.readInt();
                if (G013 != null && (u10 = this.b.u(G013.asBinder())) != null) {
                    N0(u10, readInt21, 1, P0(new t2(2, this, u10)));
                    return true;
                }
                return true;
            case 3025:
                i G014 = m.G0(parcel.readStrongBinder());
                int readInt22 = parcel.readInt();
                if (G014 != null && (u11 = this.b.u(G014.asBinder())) != null) {
                    N0(u11, readInt22, 1, P0(new bi.f(5)));
                    return true;
                }
                return true;
            case 3026:
                i G015 = m.G0(parcel.readStrongBinder());
                int readInt23 = parcel.readInt();
                if (G015 != null) {
                    M0(G015, readInt23, 2, P0(new bi.f(15)));
                    return true;
                }
                return true;
            case 3027:
                i G016 = m.G0(parcel.readStrongBinder());
                int readInt24 = parcel.readInt();
                Bundle bundle5 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                if (G016 != null && bundle5 != null) {
                    try {
                        M0(G016, readInt24, 13, P0(new ah.m(new b2.v0(bundle5.getFloat(b2.v0.e, 1.0f), bundle5.getFloat(b2.v0.f, 1.0f)), 7)));
                    } catch (RuntimeException e11) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e11);
                    }
                }
                return true;
            case 3028:
                i G017 = m.G0(parcel.readStrongBinder());
                int readInt25 = parcel.readInt();
                float readFloat = parcel.readFloat();
                if (G017 != null && readFloat > 0.0f) {
                    M0(G017, readInt25, 13, P0(new o0(readFloat, 0)));
                    return true;
                }
                return true;
            case 3029:
                i G018 = m.G0(parcel.readStrongBinder());
                int readInt26 = parcel.readInt();
                Bundle bundle6 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                if (G018 != null && bundle6 != null) {
                    try {
                        final b2.k0 a10 = b2.k0.a(bundle6);
                        final int i16 = 2;
                        M0(G018, readInt26, 20, new x0(new ah.i0(27, new e1() { // from class: m4.p0
                            @Override // m4.e1
                            public final Object h(a0 a0Var4, r rVar2, int i17) {
                                switch (i16) {
                                }
                                return a0Var4.l(rVar2, e9.i0.z(a10));
                            }
                        }, new j2.e(29)), 1));
                    } catch (RuntimeException e12) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e12);
                    }
                }
                return true;
            case 3030:
                i G019 = m.G0(parcel.readStrongBinder());
                int readInt27 = parcel.readInt();
                int readInt28 = parcel.readInt();
                Bundle bundle7 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                if (G019 != null && bundle7 != null && readInt28 >= 0) {
                    try {
                        final b2.k0 a11 = b2.k0.a(bundle7);
                        final int i17 = 0;
                        M0(G019, readInt27, 20, new x0(new ah.i0(27, new e1() { // from class: m4.p0
                            @Override // m4.e1
                            public final Object h(a0 a0Var4, r rVar2, int i172) {
                                switch (i17) {
                                }
                                return a0Var4.l(rVar2, e9.i0.z(a11));
                            }
                        }, new m0(this, readInt28, 1)), 1));
                    } catch (RuntimeException e13) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e13);
                    }
                }
                return true;
            case 3031:
                i G020 = m.G0(parcel.readStrongBinder());
                int readInt29 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (G020 != null && readStrongBinder != null) {
                    try {
                        e9.i0 a12 = b2.h.a(readStrongBinder);
                        e9.f0 u17 = e9.i0.u();
                        for (int i18 = 0; i18 < a12.size(); i18++) {
                            Bundle bundle8 = (Bundle) a12.get(i18);
                            bundle8.getClass();
                            u17.b(b2.k0.a(bundle8));
                        }
                        M0(G020, readInt29, 20, new x0(new ah.i0(27, new i2.z(3, u17.i()), new j2.e(28)), 1));
                    } catch (RuntimeException e14) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e14);
                    }
                }
                return true;
            case 3032:
                i G021 = m.G0(parcel.readStrongBinder());
                int readInt30 = parcel.readInt();
                int readInt31 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (G021 != null && readStrongBinder2 != null && readInt31 >= 0) {
                    try {
                        e9.i0 a13 = b2.h.a(readStrongBinder2);
                        e9.f0 u18 = e9.i0.u();
                        for (int i19 = 0; i19 < a13.size(); i19++) {
                            Bundle bundle9 = (Bundle) a13.get(i19);
                            bundle9.getClass();
                            u18.b(b2.k0.a(bundle9));
                        }
                        M0(G021, readInt30, 20, new x0(new ah.i0(27, new i2.z(2, u18.i()), new m0(this, readInt31, 3)), 1));
                    } catch (RuntimeException e15) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e15);
                    }
                }
                return true;
            case 3033:
                i G022 = m.G0(parcel.readStrongBinder());
                int readInt32 = parcel.readInt();
                Bundle bundle10 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                if (G022 != null && bundle10 != null) {
                    try {
                        M0(G022, readInt32, 19, P0(new ah.m(b2.n0.b(bundle10), 9)));
                    } catch (RuntimeException e16) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e16);
                    }
                }
                return true;
            case 3034:
                i G023 = m.G0(parcel.readStrongBinder());
                int readInt33 = parcel.readInt();
                if (G023 != null && (u12 = this.b.u(G023.asBinder())) != null) {
                    N0(u12, readInt33, 3, P0(new bi.f(14)));
                    return true;
                }
                return true;
            case 3035:
                i G024 = m.G0(parcel.readStrongBinder());
                parcel.readInt();
                if (G024 != null) {
                    long clearCallingIdentity2 = Binder.clearCallingIdentity();
                    try {
                        a0 a0Var4 = (a0) this.a.get();
                        if (a0Var4 != null && !a0Var4.j()) {
                            e2.d0.U(a0Var4.l, new b5(9, this, G024));
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                return true;
            case 3036:
                i G025 = m.G0(parcel.readStrongBinder());
                int readInt34 = parcel.readInt();
                if (G025 != null) {
                    M0(G025, readInt34, 4, P0(new bi.f(16)));
                    return true;
                }
                return true;
            case 3037:
                i G026 = m.G0(parcel.readStrongBinder());
                int readInt35 = parcel.readInt();
                int readInt36 = parcel.readInt();
                if (G026 != null && readInt36 >= 0) {
                    M0(G026, readInt35, 10, new k5(new m0(this, readInt36, 0), 5));
                    return true;
                }
                return true;
            case 3038:
                i G027 = m.G0(parcel.readStrongBinder());
                int readInt37 = parcel.readInt();
                final long readLong = parcel.readLong();
                if (G027 != null) {
                    M0(G027, readInt37, 5, P0(new e2.h() { // from class: m4.v0
                        @Override // e2.h
                        public final void accept(Object obj) {
                            ((j1) obj).g(readLong);
                        }
                    }));
                    return true;
                }
                return true;
            case 3039:
                i G028 = m.G0(parcel.readStrongBinder());
                int readInt38 = parcel.readInt();
                int readInt39 = parcel.readInt();
                long readLong2 = parcel.readLong();
                if (G028 != null && readInt39 >= 0) {
                    M0(G028, readInt38, 10, new k5(new j2.d(this, readInt39, readLong2, 1), 5));
                    return true;
                }
                return true;
            case 3040:
                i G029 = m.G0(parcel.readStrongBinder());
                int readInt40 = parcel.readInt();
                if (G029 != null && (u13 = this.b.u(G029.asBinder())) != null) {
                    N0(u13, readInt40, 11, P0(new bi.f(8)));
                    return true;
                }
                return true;
            case 3041:
                i G030 = m.G0(parcel.readStrongBinder());
                int readInt41 = parcel.readInt();
                if (G030 != null && (u14 = this.b.u(G030.asBinder())) != null) {
                    N0(u14, readInt41, 12, P0(new bi.f(11)));
                    return true;
                }
                return true;
            case 3042:
                i G031 = m.G0(parcel.readStrongBinder());
                int readInt42 = parcel.readInt();
                if (G031 != null) {
                    M0(G031, readInt42, 6, P0(new bi.f(10)));
                    return true;
                }
                return true;
            case 3043:
                i G032 = m.G0(parcel.readStrongBinder());
                int readInt43 = parcel.readInt();
                if (G032 != null) {
                    M0(G032, readInt43, 8, P0(new bi.f(6)));
                    return true;
                }
                return true;
            case 3044:
                i G033 = m.G0(parcel.readStrongBinder());
                int readInt44 = parcel.readInt();
                Surface surface = (Surface) w7.s.a(parcel, Surface.CREATOR);
                if (G033 != null) {
                    M0(G033, readInt44, 27, P0(new ah.m(surface, 8)));
                    return true;
                }
                return true;
            case 3045:
                i G034 = m.G0(parcel.readStrongBinder());
                if (G034 != null) {
                    long clearCallingIdentity3 = Binder.clearCallingIdentity();
                    try {
                        a0 a0Var5 = (a0) this.a.get();
                        if (a0Var5 != null && !a0Var5.j()) {
                            r u19 = this.b.u(G034.asBinder());
                            if (u19 != null) {
                                e2.d0.U(a0Var5.l, new b5(10, this, u19));
                            }
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                return true;
            case 3046:
                i G035 = m.G0(parcel.readStrongBinder());
                int readInt45 = parcel.readInt();
                if (G035 != null && (u15 = this.b.u(G035.asBinder())) != null) {
                    N0(u15, readInt45, 7, P0(new bi.f(9)));
                    return true;
                }
                return true;
            case 3047:
                i G036 = m.G0(parcel.readStrongBinder());
                int readInt46 = parcel.readInt();
                if (G036 != null && (u16 = this.b.u(G036.asBinder())) != null) {
                    N0(u16, readInt46, 9, P0(new bi.f(12)));
                    return true;
                }
                return true;
            case 3048:
                i G037 = m.G0(parcel.readStrongBinder());
                int readInt47 = parcel.readInt();
                Bundle bundle11 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                if (G037 != null && bundle11 != null) {
                    try {
                        M0(G037, readInt47, 29, P0(new t2(1, this, b2.q1.b(bundle11))));
                    } catch (RuntimeException e17) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e17);
                    }
                }
                return true;
            case 3049:
                i G038 = m.G0(parcel.readStrongBinder());
                int readInt48 = parcel.readInt();
                String readString = parcel.readString();
                Bundle bundle12 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                if (G038 != null && readString != null && bundle12 != null) {
                    if (!TextUtils.isEmpty(readString)) {
                        try {
                            x0 x0Var = new x0(new j2.e(27, readString, b2.c1.a(bundle12)), 1);
                            f1Var = this;
                            f1Var.G0(G038, readInt48, null, 40010, x0Var);
                        } catch (RuntimeException e18) {
                            e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for Rating", e18);
                        }
                        return true;
                    }
                    e2.a.n("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                }
                return true;
            case 3050:
                i G039 = m.G0(parcel.readStrongBinder());
                int readInt49 = parcel.readInt();
                Bundle bundle13 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                if (G039 != null && bundle13 != null) {
                    try {
                        G0(G039, readInt49, null, 40010, new x0(new t0(b2.c1.a(bundle13), 5), 1));
                    } catch (RuntimeException e19) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for Rating", e19);
                    }
                }
                return true;
            case 3051:
                i G040 = m.G0(parcel.readStrongBinder());
                int readInt50 = parcel.readInt();
                final int readInt51 = parcel.readInt();
                final int readInt52 = parcel.readInt();
                if (G040 != null && readInt51 >= 0) {
                    final int i20 = 0;
                    M0(G040, readInt50, 33, P0(new e2.h() { // from class: m4.r0
                        @Override // e2.h
                        public final void accept(Object obj) {
                            switch (i20) {
                                case 0:
                                    ((j1) obj).M(readInt51, readInt52);
                                    break;
                                default:
                                    ((j1) obj).q0(readInt51, readInt52);
                                    break;
                            }
                        }
                    }));
                    return true;
                }
                return true;
            case 3052:
                i G041 = m.G0(parcel.readStrongBinder());
                int readInt53 = parcel.readInt();
                int readInt54 = parcel.readInt();
                if (G041 != null) {
                    M0(G041, readInt53, 34, P0(new bi.j(readInt54, 2)));
                    return true;
                }
                return true;
            case 3053:
                i G042 = m.G0(parcel.readStrongBinder());
                int readInt55 = parcel.readInt();
                int readInt56 = parcel.readInt();
                if (G042 != null) {
                    M0(G042, readInt55, 34, P0(new bi.j(readInt56, 1)));
                    return true;
                }
                return true;
            case 3054:
                i G043 = m.G0(parcel.readStrongBinder());
                int readInt57 = parcel.readInt();
                final boolean z14 = parcel.readInt() != 0;
                final int readInt58 = parcel.readInt();
                if (G043 != null) {
                    M0(G043, readInt57, 34, P0(new e2.h() { // from class: m4.u0
                        @Override // e2.h
                        public final void accept(Object obj) {
                            ((j1) obj).J(readInt58, z14);
                        }
                    }));
                    return true;
                }
                return true;
            case 3055:
                i G044 = m.G0(parcel.readStrongBinder());
                int readInt59 = parcel.readInt();
                int readInt60 = parcel.readInt();
                Bundle bundle14 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                if (G044 != null && bundle14 != null && readInt60 >= 0) {
                    try {
                        final b2.k0 a14 = b2.k0.a(bundle14);
                        final int i21 = 1;
                        M0(G044, readInt59, 20, new x0(new ah.i0(27, new e1() { // from class: m4.p0
                            @Override // m4.e1
                            public final Object h(a0 a0Var42, r rVar2, int i172) {
                                switch (i21) {
                                }
                                return a0Var42.l(rVar2, e9.i0.z(a14));
                            }
                        }, new m0(this, readInt60, 2)), 1));
                    } catch (RuntimeException e20) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e20);
                    }
                }
                return true;
            case 3056:
                i G045 = m.G0(parcel.readStrongBinder());
                int readInt61 = parcel.readInt();
                int readInt62 = parcel.readInt();
                int readInt63 = parcel.readInt();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (G045 != null && readStrongBinder3 != null && readInt62 >= 0 && readInt63 >= readInt62) {
                    try {
                        e9.i0 a15 = b2.h.a(readStrongBinder3);
                        e9.f0 u20 = e9.i0.u();
                        for (int i22 = 0; i22 < a15.size(); i22++) {
                            Bundle bundle15 = (Bundle) a15.get(i22);
                            bundle15.getClass();
                            u20.b(b2.k0.a(bundle15));
                        }
                        M0(G045, readInt61, 20, new x0(new ah.i0(27, new k5(u20.i(), 4), new l0(this, readInt62, readInt63)), 1));
                    } catch (RuntimeException e21) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e21);
                    }
                }
                return true;
            case 3057:
                i G046 = m.G0(parcel.readStrongBinder());
                int readInt64 = parcel.readInt();
                Bundle bundle16 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                boolean z15 = parcel.readInt() != 0;
                if (G046 != null && bundle16 != null) {
                    try {
                        M0(G046, readInt64, 35, P0(new s0(0, b2.e.a(bundle16), z15)));
                    } catch (RuntimeException e22) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e22);
                    }
                }
                return true;
            default:
                n nVar = null;
                switch (i10) {
                    case 4001:
                        i G047 = m.G0(parcel.readStrongBinder());
                        int readInt65 = parcel.readInt();
                        Bundle bundle17 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                        if (G047 != null) {
                            if (bundle17 != null) {
                                try {
                                    nVar = n.a(bundle17);
                                } catch (RuntimeException e23) {
                                    e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e23);
                                }
                            }
                            f1Var = this;
                            f1Var.G0(G047, readInt65, null, 50000, new x0(new t0(nVar, 1), 0));
                            return true;
                        }
                        return true;
                    case 4002:
                        i G048 = m.G0(parcel.readStrongBinder());
                        int readInt66 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (G048 != null) {
                            if (TextUtils.isEmpty(readString2)) {
                                e2.a.n("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            G0(G048, readInt66, null, 50004, new x0(new j2.e(readString2, 26), 0));
                            return true;
                        }
                        return true;
                    case 4003:
                        i G049 = m.G0(parcel.readStrongBinder());
                        int readInt67 = parcel.readInt();
                        String readString3 = parcel.readString();
                        int readInt68 = parcel.readInt();
                        int readInt69 = parcel.readInt();
                        Bundle bundle18 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                        if (G049 != null) {
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
                                G0(G049, readInt67, null, 50003, new x0(new j2.e(readString3, readInt68, readInt69, nVar), 0));
                            }
                        }
                        return true;
                    case 4004:
                        i G050 = m.G0(parcel.readStrongBinder());
                        int readInt70 = parcel.readInt();
                        String readString4 = parcel.readString();
                        Bundle bundle19 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                        if (G050 != null) {
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
                                G0(G050, readInt70, null, 50005, new x0(new t0(readString4, nVar, 3), 0));
                            }
                        }
                        return true;
                    case 4005:
                        i G051 = m.G0(parcel.readStrongBinder());
                        int readInt71 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt72 = parcel.readInt();
                        int readInt73 = parcel.readInt();
                        Bundle bundle20 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                        if (G051 != null) {
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
                                G0(G051, readInt71, null, 50006, new x0(new t0(readString5, readInt72, readInt73, nVar), 0));
                            }
                        }
                        return true;
                    case 4006:
                        i G052 = m.G0(parcel.readStrongBinder());
                        int readInt74 = parcel.readInt();
                        String readString6 = parcel.readString();
                        Bundle bundle21 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                        if (G052 != null) {
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
                                G0(G052, readInt74, null, 50001, new x0(new t0(readString6, nVar, 2), 0));
                            }
                        }
                        return true;
                    case 4007:
                        i G053 = m.G0(parcel.readStrongBinder());
                        int readInt75 = parcel.readInt();
                        String readString7 = parcel.readString();
                        if (G053 != null) {
                            if (TextUtils.isEmpty(readString7)) {
                                e2.a.n("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            G0(G053, readInt75, null, 50002, new x0(new j2.e(readString7, 23), 0));
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
