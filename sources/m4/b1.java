package m4;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b1 implements q {
    public final i a;
    public final int b;

    public b1(i iVar, int i10) {
        this.a = iVar;
        this.b = i10;
    }

    @Override // m4.q
    public final void a(int i10, l lVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(l.d, lVar.a);
        bundle.putLong(l.e, lVar.b);
        bundle.putBundle(l.g, lVar.c.a());
        bundle.putInt(l.f, 4);
        h hVar = (h) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, bundle);
            hVar.a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // m4.q
    public final void b(int i10) {
        h hVar = (h) this.a;
        hVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            hVar.a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // m4.q
    public final void c(int i10, b2.x0 x0Var) {
        Bundle b10 = x0Var.b();
        h hVar = (h) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, b10);
            hVar.a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // m4.q
    public final void d(int i10, l1 l1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle bundle2 = new Bundle();
        bundle2.putInt(l1.f, l1Var.a);
        bundle2.putString(l1.g, l1Var.b);
        bundle2.putBundle(l1.h, l1Var.c);
        h hVar = (h) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, bundle2);
            w7.r.a(obtain, bundle);
            hVar.a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // m4.q
    public final void e(int i10, o1 o1Var, boolean z10, boolean z11, int i11) {
        Bundle b10 = o1Var.a(z10, z11).b(i11);
        h hVar = (h) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, b10);
            hVar.a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != b1.class) {
            return false;
        }
        return Objects.equals(this.a.asBinder(), ((b1) obj).a.asBinder());
    }

    @Override // m4.q
    public final void f() {
        w7.u.a(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // m4.q
    public final void g(int i10, h1 h1Var, b2.x0 x0Var, boolean z10, boolean z11) {
        Parcel obtain;
        int i11 = this.b;
        e2.d.g(i11 != 0);
        ?? r32 = (z10 || !x0Var.a(17)) ? 1 : 0;
        boolean z12 = z11 || !x0Var.a(30);
        i iVar = this.a;
        if (i11 < 2) {
            Bundle f7 = h1Var.e(x0Var, z10, true).f(i11);
            h hVar = (h) iVar;
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i10);
                w7.r.a(obtain, f7);
                obtain.writeInt(r32);
                hVar.a.transact(3007, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f10 = h1Var.e(x0Var, z10, z11).f(i11);
        Bundle bundle = new Bundle();
        bundle.putBoolean(g1.a, r32);
        bundle.putBoolean(g1.b, z12);
        h hVar2 = (h) iVar;
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, f10);
            w7.r.a(obtain, bundle);
            hVar2.a.transact(3013, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a.asBinder());
    }

    @Override // m4.q
    public final void i(int i10, p1 p1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(p1.e, p1Var.a);
        bundle.putBundle(p1.f, p1Var.b);
        bundle.putLong(p1.g, p1Var.c);
        n1 n1Var = p1Var.d;
        if (n1Var != null) {
            bundle.putBundle(p1.h, n1Var.a());
        }
        h hVar = (h) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, bundle);
            hVar.a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
