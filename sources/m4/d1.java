package m4;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;
import v7.u6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class d1 implements u {
    public final l a;
    public final int b;

    public d1(l lVar, int i10) {
        this.a = lVar;
        this.b = i10;
    }

    @Override // m4.u
    public final void a(int i10, o oVar) {
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
            obtain.writeInt(i10);
            w7.t.a(obtain, bundle);
            kVar.a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // m4.u
    public final void b(int i10) {
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            kVar.a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // m4.u
    public final void c(int i10, b2.b1 b1Var) {
        Bundle b10 = b1Var.b();
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.t.a(obtain, b10);
            kVar.a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // m4.u
    public final void d(int i10, int i11, int i12) {
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            obtain.writeInt(i11);
            obtain.writeInt(i12);
            kVar.a.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // m4.u
    public final void e(int i10, o1 o1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle a2 = o1Var.a();
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.t.a(obtain, a2);
            w7.t.a(obtain, bundle);
            kVar.a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != d1.class) {
            return false;
        }
        return Objects.equals(this.a.asBinder(), ((d1) obj).a.asBinder());
    }

    @Override // m4.u
    public final void f(int i10, r1 r1Var, boolean z10, boolean z11, int i11) {
        Bundle b10 = r1Var.a(z10, z11).b(i11);
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.t.a(obtain, b10);
            kVar.a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // m4.u
    public final void g() {
        w7.w.a(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // m4.u
    public final void h(int i10, k1 k1Var, b2.b1 b1Var, boolean z10, boolean z11) {
        Parcel obtain;
        int i11 = this.b;
        u6.p(i11 != 0);
        ?? r32 = (z10 || !b1Var.a(17)) ? 1 : 0;
        boolean z12 = z11 || !b1Var.a(30);
        l lVar = this.a;
        if (i11 < 2) {
            Bundle f7 = k1Var.e(b1Var, z10, true).f(i11);
            k kVar = (k) lVar;
            kVar.getClass();
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i10);
                w7.t.a(obtain, f7);
                obtain.writeInt(r32);
                kVar.a.transact(3007, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f10 = k1Var.e(b1Var, z10, z11).f(i11);
        Bundle bundle = new Bundle();
        bundle.putBoolean(j1.a, r32);
        bundle.putBoolean(j1.b, z12);
        k kVar2 = (k) lVar;
        kVar2.getClass();
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.t.a(obtain, f10);
            w7.t.a(obtain, bundle);
            kVar2.a.transact(3013, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a.asBinder());
    }

    @Override // m4.u
    public final void j(int i10, s1 s1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(s1.e, s1Var.a);
        bundle.putBundle(s1.f, s1Var.b);
        bundle.putLong(s1.g, s1Var.c);
        q1 q1Var = s1Var.d;
        if (q1Var != null) {
            bundle.putBundle(s1.h, q1Var.a());
        }
        k kVar = (k) this.a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.t.a(obtain, bundle);
            kVar.a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
