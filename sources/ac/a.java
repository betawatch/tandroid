package ac;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import ci.u7;
import e2.g0;
import e2.i0;
import e2.n0;
import e2.o0;
import i2.o1;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import n6.l;
import rb.j;
import w7.f0;
import w7.p8;
import x7.ja;
import x7.ka;
import x7.la;
import x7.ma;
import x7.na;
import x7.oa;
import x7.y;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class a implements b {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;

    public a(Context context, zb.a aVar) {
        this.c = context;
        this.d = aVar;
    }

    @Override // ac.b
    public ArrayList a(wb.a aVar) {
        x6.b bVar;
        if (((ja) this.e) == null) {
            zzb();
        }
        ja jaVar = (ja) this.e;
        l.h(jaVar);
        if (!this.a) {
            try {
                jaVar.R0(jaVar.N0(), 1);
                this.a = true;
            } catch (RemoteException e) {
                throw new nb.a("Failed to init thin image labeler.", e);
            }
        }
        int i10 = aVar.e;
        int i11 = aVar.b;
        int i12 = aVar.c;
        int a2 = p8.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = aVar.e;
        if (i13 != -1) {
            if (i13 != 17) {
                if (i13 == 35) {
                    bVar = new x6.b(null);
                } else if (i13 != 842094169) {
                    throw new nb.a(o1.k(aVar.e, "Unsupported image format: "), 3);
                }
            }
            l.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.a;
        l.h(bitmap);
        bVar = new x6.b(bitmap);
        try {
            Parcel N0 = jaVar.N0();
            int i14 = y.a;
            N0.writeStrongBinder(bVar);
            N0.writeInt(1);
            int q6 = f0.q(N0, 20293);
            f0.s(N0, 1, 4);
            N0.writeInt(i10);
            f0.s(N0, 2, 4);
            N0.writeInt(i11);
            f0.s(N0, 3, 4);
            N0.writeInt(i12);
            f0.s(N0, 4, 4);
            N0.writeInt(a2);
            f0.s(N0, 5, 8);
            N0.writeLong(elapsedRealtime);
            f0.r(N0, q6);
            Parcel P0 = jaVar.P0(N0, 3);
            ArrayList createTypedArrayList = P0.createTypedArrayList(na.CREATOR);
            P0.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = createTypedArrayList.get(i15);
                i15++;
                na naVar = (na) obj;
                arrayList.add(new yb.a(naVar.b, naVar.d, naVar.a, naVar.c));
            }
            return arrayList;
        } catch (RemoteException e7) {
            throw new nb.a("Failed to run thin image labeler.", e7);
        }
    }

    public void b(boolean z10, boolean z11) {
        i0 i0Var = (i0) this.d;
        if (z10 && z11) {
            i0Var.d(new n0(this, z10, z11, 0));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        i0 i0Var2 = (i0) this.e;
        i0Var2.a.postDelayed(new u7(20, this, atomicBoolean), 1000L);
        i0Var.d(new o0(this, atomicBoolean, z10, z11, 0));
    }

    public void c(boolean z10) {
        if (this.b == z10) {
            return;
        }
        this.b = z10;
        if (this.a) {
            b(true, z10);
        }
    }

    @Override // ac.b
    public void zzb() {
        ma kaVar;
        Context context = (Context) this.c;
        if (((ja) this.e) != null) {
            return;
        }
        try {
            IBinder b10 = y6.e.c(context, y6.e.b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i10 = la.b;
            if (b10 == null) {
                kaVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                kaVar = queryLocalInterface instanceof ma ? (ma) queryLocalInterface : new ka(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 10);
            }
            this.e = ((ka) kaVar).V0(new x6.b(context), new oa(((zb.a) this.d).a, -1));
        } catch (RemoteException e) {
            throw new nb.a("Failed to create thin image labeler.", e);
        } catch (y6.b unused) {
            if (!this.b) {
                j.b(context);
                this.b = true;
            }
            throw new nb.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override // ac.b
    public void zzc() {
        ja jaVar = (ja) this.e;
        if (jaVar != null) {
            try {
                jaVar.R0(jaVar.N0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.e = null;
            this.a = false;
        }
    }

    public a(Context context, Looper looper, g0 g0Var) {
        this.c = new qf.b((Object) context.getApplicationContext(), 13);
        this.d = g0Var.a(looper, null);
        this.e = g0Var.a(Looper.getMainLooper(), null);
    }
}
