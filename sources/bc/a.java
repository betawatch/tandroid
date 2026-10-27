package bc;

import a8.df;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import di.b4;
import e2.g0;
import e2.i0;
import e2.o0;
import e2.p0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import n4.s;
import o6.l;
import sb.j;
import w7.k5;
import y7.ga;
import y7.ha;
import y7.ia;
import y7.ja;
import y7.ka;
import y7.la;
import y7.x;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a implements b {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;

    public a(Context context, ac.b bVar) {
        this.c = context;
        this.d = bVar;
    }

    @Override // bc.b
    public ArrayList a(xb.a aVar) {
        y6.b bVar;
        if (((ga) this.e) == null) {
            zzb();
        }
        ga gaVar = (ga) this.e;
        l.h(gaVar);
        if (!this.a) {
            try {
                gaVar.R0(gaVar.N0(), 1);
                this.a = true;
            } catch (RemoteException e) {
                throw new ob.a("Failed to init thin image labeler.", e);
            }
        }
        int i10 = aVar.e;
        int i11 = aVar.b;
        int i12 = aVar.c;
        int a2 = k5.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = aVar.e;
        if (i13 != -1) {
            if (i13 != 17) {
                if (i13 == 35) {
                    bVar = new y6.b(null);
                } else if (i13 != 842094169) {
                    throw new ob.a(ic.a.i(aVar.e, "Unsupported image format: "), 3);
                }
            }
            l.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.a;
        l.h(bitmap);
        bVar = new y6.b(bitmap);
        try {
            Parcel N0 = gaVar.N0();
            int i14 = x.a;
            N0.writeStrongBinder(bVar);
            N0.writeInt(1);
            int q5 = df.q(N0, 20293);
            df.s(N0, 1, 4);
            N0.writeInt(i10);
            df.s(N0, 2, 4);
            N0.writeInt(i11);
            df.s(N0, 3, 4);
            N0.writeInt(i12);
            df.s(N0, 4, 4);
            N0.writeInt(a2);
            df.s(N0, 5, 8);
            N0.writeLong(elapsedRealtime);
            df.r(N0, q5);
            Parcel P0 = gaVar.P0(N0, 3);
            ArrayList createTypedArrayList = P0.createTypedArrayList(ka.CREATOR);
            P0.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = createTypedArrayList.get(i15);
                i15++;
                ka kaVar = (ka) obj;
                arrayList.add(new zb.a(kaVar.b, kaVar.d, kaVar.a, kaVar.c));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new ob.a("Failed to run thin image labeler.", e10);
        }
    }

    public void b(boolean z10, boolean z11) {
        i0 i0Var = (i0) this.d;
        if (z10 && z11) {
            i0Var.d(new o0(this, z10, z11, 0));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        i0 i0Var2 = (i0) this.e;
        i0Var2.a.postDelayed(new b4(29, this, atomicBoolean), 1000L);
        i0Var.d(new p0(this, atomicBoolean, z10, z11, 0));
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

    @Override // bc.b
    public void zzb() {
        ja haVar;
        Context context = (Context) this.c;
        if (((ga) this.e) != null) {
            return;
        }
        try {
            IBinder b10 = z6.e.c(context, z6.e.b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i10 = ia.b;
            if (b10 == null) {
                haVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                haVar = queryLocalInterface instanceof ja ? (ja) queryLocalInterface : new ha(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 11);
            }
            this.e = ((ha) haVar).V0(new y6.b(context), new la(((ac.b) this.d).a, -1));
        } catch (RemoteException e) {
            throw new ob.a("Failed to create thin image labeler.", e);
        } catch (z6.b unused) {
            if (!this.b) {
                j.b(context);
                this.b = true;
            }
            throw new ob.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override // bc.b
    public void zzc() {
        ga gaVar = (ga) this.e;
        if (gaVar != null) {
            try {
                gaVar.R0(gaVar.N0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.e = null;
            this.a = false;
        }
    }

    public a(Context context, Looper looper, g0 g0Var) {
        this.c = new s(context.getApplicationContext(), 14);
        this.d = g0Var.a(looper, null);
        this.e = g0Var.a(Looper.getMainLooper(), null);
    }
}
