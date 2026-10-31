package m4;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e1 implements v {
    public final m a;
    public final int b;

    public e1(m mVar, int i10) {
        this.a = mVar;
        this.b = i10;
    }

    @Override // m4.v
    public final void a(int i10, p pVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(p.d, pVar.a);
        bundle.putLong(p.e, pVar.b);
        bundle.putBundle(p.g, pVar.c.a());
        bundle.putInt(p.f, 4);
        l lVar = (l) this.a;
        lVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.w.a(obtain, bundle);
            lVar.a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // m4.v
    public final void b(int i10) {
        l lVar = (l) this.a;
        lVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            lVar.a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // m4.v
    public final void c(int i10, b2.b1 b1Var) {
        Bundle b10 = b1Var.b();
        l lVar = (l) this.a;
        lVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.w.a(obtain, b10);
            lVar.a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // m4.v
    public final void d(int i10, int i11, int i12) {
        l lVar = (l) this.a;
        lVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            obtain.writeInt(i11);
            obtain.writeInt(i12);
            lVar.a.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // m4.v
    public final void e(int i10, p1 p1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle a2 = p1Var.a();
        l lVar = (l) this.a;
        lVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.w.a(obtain, a2);
            w7.w.a(obtain, bundle);
            lVar.a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != e1.class) {
            return false;
        }
        return Objects.equals(this.a.asBinder(), ((e1) obj).a.asBinder());
    }

    @Override // m4.v
    public final void f(int i10, s1 s1Var, boolean z10, boolean z11, int i11) {
        Bundle b10 = s1Var.a(z10, z11).b(i11);
        l lVar = (l) this.a;
        lVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.w.a(obtain, b10);
            lVar.a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // m4.v
    public final void g() {
        w7.z.a(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // m4.v
    public final void h(int i10, l1 l1Var, b2.b1 b1Var, boolean z10, boolean z11) {
        Parcel obtain;
        int i11 = this.b;
        t6.p(i11 != 0);
        ?? r32 = (z10 || !b1Var.a(17)) ? 1 : 0;
        boolean z12 = z11 || !b1Var.a(30);
        m mVar = this.a;
        if (i11 < 2) {
            Bundle f7 = l1Var.e(b1Var, z10, true).f(i11);
            l lVar = (l) mVar;
            lVar.getClass();
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i10);
                w7.w.a(obtain, f7);
                obtain.writeInt(r32);
                lVar.a.transact(3007, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f10 = l1Var.e(b1Var, z10, z11).f(i11);
        Bundle bundle = new Bundle();
        bundle.putBoolean(k1.a, r32);
        bundle.putBoolean(k1.b, z12);
        l lVar2 = (l) mVar;
        lVar2.getClass();
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.w.a(obtain, f10);
            w7.w.a(obtain, bundle);
            lVar2.a.transact(3013, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a.asBinder());
    }

    @Override // m4.v
    public final void j(int i10, t1 t1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(t1.e, t1Var.a);
        bundle.putBundle(t1.f, t1Var.b);
        bundle.putLong(t1.g, t1Var.c);
        r1 r1Var = t1Var.d;
        if (r1Var != null) {
            bundle.putBundle(t1.h, r1Var.a());
        }
        l lVar = (l) this.a;
        lVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.w.a(obtain, bundle);
            lVar.a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
