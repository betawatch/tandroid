// default package

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hz6 implements rw6 {
    public final dk5 a;
    public final int b;

    public hz6(dk5 dk5Var, int i) {
        this.a = dk5Var;
        this.b = i;
    }

    @Override // rw6
    public final void a(int i, r7a r7aVar) {
        Bundle bundle = Bundle.EMPTY;
        Bundle a = r7aVar.a();
        ck5 ck5Var = (ck5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            yle.a(obtain, a);
            yle.a(obtain, bundle);
            ck5Var.a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // rw6
    public final void b(int i) {
        ck5 ck5Var = (ck5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            ck5Var.a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // rw6
    public final void c(int i, int i2, int i3) {
        ck5 ck5Var = (ck5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            ck5Var.a.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // rw6
    public final void d(int i, q26 q26Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(q26.d, q26Var.a);
        bundle.putLong(q26.e, q26Var.b);
        bundle.putBundle(q26.g, q26Var.c.a());
        bundle.putInt(q26.f, 4);
        ck5 ck5Var = (ck5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            yle.a(obtain, bundle);
            ck5Var.a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // rw6
    public final void e() {
        zve.a(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != hz6.class) {
            return false;
        }
        return Objects.equals(this.a.asBinder(), ((hz6) obj).a.asBinder());
    }

    @Override // rw6
    public final void f(int i, ne8 ne8Var) {
        Bundle b = ne8Var.b();
        ck5 ck5Var = (ck5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            yle.a(obtain, b);
            ck5Var.a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // rw6
    public final void g(int i, q8a q8aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(q8a.e, q8aVar.a);
        bundle.putBundle(q8a.f, q8aVar.b);
        bundle.putLong(q8a.g, q8aVar.c);
        d8a d8aVar = q8aVar.d;
        if (d8aVar != null) {
            bundle.putBundle(q8a.h, d8aVar.a());
        }
        ck5 ck5Var = (ck5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            yle.a(obtain, bundle);
            ck5Var.a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // rw6
    public final void h(int i, ye8 ye8Var, ne8 ne8Var, boolean z, boolean z2) {
        Parcel obtain;
        int i2 = this.b;
        jte.p(i2 != 0);
        ?? r3 = (z || !ne8Var.a(17)) ? 1 : 0;
        boolean z3 = z2 || !ne8Var.a(30);
        dk5 dk5Var = this.a;
        if (i2 < 2) {
            Bundle f = ye8Var.e(ne8Var, z, true).f(i2);
            ck5 ck5Var = (ck5) dk5Var;
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i);
                yle.a(obtain, f);
                obtain.writeInt(r3);
                ck5Var.a.transact(3007, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f2 = ye8Var.e(ne8Var, z, z2).f(i2);
        Bundle bundle = new Bundle();
        bundle.putBoolean(xe8.a, r3);
        bundle.putBoolean(xe8.b, z3);
        ck5 ck5Var2 = (ck5) dk5Var;
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            yle.a(obtain, f2);
            yle.a(obtain, bundle);
            ck5Var2.a.transact(3013, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a.asBinder());
    }

    @Override // rw6
    public final void i(int i, n8a n8aVar, boolean z, boolean z2, int i2) {
        Bundle b = n8aVar.a(z, z2).b(i2);
        ck5 ck5Var = (ck5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            yle.a(obtain, b);
            ck5Var.a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
