package o4;

import android.os.Bundle;
import android.os.Parcel;
import b8.ve;
import b8.ye;
import b8.zb;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c1 implements u {
    public final l a;
    public final int b;

    public c1(l lVar, int i3) {
        this.a = lVar;
        this.b = i3;
    }

    @Override // o4.u
    public final void a(int i3, d2.a1 a1Var) {
        Bundle b10 = a1Var.b();
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i3);
            ve.a(obtain, b10);
            kVar.a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // o4.u
    public final void b(int i3) {
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i3);
            kVar.a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // o4.u
    public final void c(int i3, int i10, int i11) {
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i3);
            obtain.writeInt(i10);
            obtain.writeInt(i11);
            kVar.a.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // o4.u
    public final void d(int i3, n1 n1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle a10 = n1Var.a();
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i3);
            ve.a(obtain, a10);
            ve.a(obtain, bundle);
            kVar.a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // o4.u
    public final void e(int i3, r1 r1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(r1.e, r1Var.a);
        bundle.putBundle(r1.f, r1Var.b);
        bundle.putLong(r1.g, r1Var.c);
        p1 p1Var = r1Var.d;
        if (p1Var != null) {
            bundle.putBundle(r1.h, p1Var.a());
        }
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i3);
            ve.a(obtain, bundle);
            kVar.a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != c1.class) {
            return false;
        }
        return Objects.equals(this.a.asBinder(), ((c1) obj).a.asBinder());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // o4.u
    public final void f(int i3, j1 j1Var, d2.a1 a1Var, boolean z10, boolean z11) {
        Parcel obtain;
        int i10 = this.b;
        zb.p(i10 != 0);
        ?? r32 = (z10 || !a1Var.a(17)) ? 1 : 0;
        boolean z12 = z11 || !a1Var.a(30);
        l lVar = this.a;
        if (i10 < 2) {
            Bundle f10 = j1Var.e(a1Var, z10, true).f(i10);
            k kVar = (k) lVar;
            kVar.getClass();
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i3);
                ve.a(obtain, f10);
                obtain.writeInt(r32);
                kVar.a.transact(3007, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f11 = j1Var.e(a1Var, z10, z11).f(i10);
        Bundle bundle = new Bundle();
        bundle.putBoolean(i1.a, r32);
        bundle.putBoolean(i1.b, z12);
        k kVar2 = (k) lVar;
        kVar2.getClass();
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i3);
            ve.a(obtain, f11);
            ve.a(obtain, bundle);
            kVar2.a.transact(3013, obtain, null, 1);
        } finally {
        }
    }

    @Override // o4.u
    public final void g() {
        ye.a(this.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a.asBinder());
    }

    @Override // o4.u
    public final void i(int i3, q1 q1Var, boolean z10, boolean z11, int i10) {
        Bundle b10 = q1Var.a(z10, z11).b(i10);
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i3);
            ve.a(obtain, b10);
            kVar.a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // o4.u
    public final void j(int i3, o oVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(o.d, oVar.a);
        bundle.putLong(o.e, oVar.b);
        bundle.putBundle(o.g, oVar.c.a());
        bundle.putInt(o.f, 4);
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i3);
            ve.a(obtain, bundle);
            kVar.a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
