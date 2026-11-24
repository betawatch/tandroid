// default package

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class hx6 implements ru6 {
    public final ei5 a;
    public final int b;

    public hx6(ei5 ei5Var, int i) {
        this.a = ei5Var;
        this.b = i;
    }

    @Override // ru6
    public final void a(int i, p5a p5aVar) {
        Bundle bundle = Bundle.EMPTY;
        Bundle a = p5aVar.a();
        di5 di5Var = (di5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            wje.a(obtain, a);
            wje.a(obtain, bundle);
            di5Var.a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // ru6
    public final void b(int i) {
        di5 di5Var = (di5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            di5Var.a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // ru6
    public final void c(int i, int i2, int i3) {
        di5 di5Var = (di5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            di5Var.a.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // ru6
    public final void d(int i, q06 q06Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(q06.d, q06Var.a);
        bundle.putLong(q06.e, q06Var.b);
        bundle.putBundle(q06.g, q06Var.c.a());
        bundle.putInt(q06.f, 4);
        di5 di5Var = (di5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            wje.a(obtain, bundle);
            di5Var.a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // ru6
    public final void e() {
        wte.a(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != hx6.class) {
            return false;
        }
        return Objects.equals(this.a.asBinder(), ((hx6) obj).a.asBinder());
    }

    @Override // ru6
    public final void f(int i, kc8 kc8Var) {
        Bundle b = kc8Var.b();
        di5 di5Var = (di5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            wje.a(obtain, b);
            di5Var.a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // ru6
    public final void g(int i, o6a o6aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(o6a.e, o6aVar.a);
        bundle.putBundle(o6a.f, o6aVar.b);
        bundle.putLong(o6a.g, o6aVar.c);
        b6a b6aVar = o6aVar.d;
        if (b6aVar != null) {
            bundle.putBundle(o6a.h, b6aVar.a());
        }
        di5 di5Var = (di5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            wje.a(obtain, bundle);
            di5Var.a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // ru6
    public final void h(int i, wc8 wc8Var, kc8 kc8Var, boolean z, boolean z2) {
        Parcel obtain;
        int i2 = this.b;
        gre.p(i2 != 0);
        ?? r3 = (z || !kc8Var.a(17)) ? 1 : 0;
        boolean z3 = z2 || !kc8Var.a(30);
        ei5 ei5Var = this.a;
        if (i2 < 2) {
            Bundle f = wc8Var.e(kc8Var, z, true).f(i2);
            di5 di5Var = (di5) ei5Var;
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i);
                wje.a(obtain, f);
                obtain.writeInt(r3);
                di5Var.a.transact(3007, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f2 = wc8Var.e(kc8Var, z, z2).f(i2);
        Bundle bundle = new Bundle();
        bundle.putBoolean(vc8.a, r3);
        bundle.putBoolean(vc8.b, z3);
        di5 di5Var2 = (di5) ei5Var;
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            wje.a(obtain, f2);
            wje.a(obtain, bundle);
            di5Var2.a.transact(3013, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a.asBinder());
    }

    @Override // ru6
    public final void i(int i, l6a l6aVar, boolean z, boolean z2, int i2) {
        Bundle b = l6aVar.a(z, z2).b(i2);
        di5 di5Var = (di5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            wje.a(obtain, b);
            di5Var.a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
