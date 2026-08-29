package jb;

import ab.k;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.cast.o;
import h7.q7;
import j7.c0;
import j7.l1;
import j7.pa;
import j7.qa;
import j7.ra;
import j7.sa;
import j7.ta;
import j7.ua;
import java.util.ArrayList;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a implements b {
    public final Context a;
    public final ib.b b;
    public boolean c;
    public boolean d;
    public pa e;

    public a(Context context, ib.b bVar) {
        this.a = context;
        this.b = bVar;
    }

    @Override // jb.b
    public final ArrayList a(fb.a aVar) {
        j6.b bVar;
        if (this.e == null) {
            zzb();
        }
        pa paVar = this.e;
        l.h(paVar);
        if (!this.c) {
            try {
                paVar.Q0(paVar.M0(), 1);
                this.c = true;
            } catch (RemoteException e10) {
                throw new wa.a("Failed to init thin image labeler.", e10);
            }
        }
        int i10 = aVar.e;
        int i11 = aVar.b;
        int i12 = aVar.c;
        int a2 = q7.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = aVar.e;
        if (i13 != -1) {
            if (i13 != 17) {
                if (i13 == 35) {
                    bVar = new j6.b(null);
                } else if (i13 != 842094169) {
                    throw new wa.a(l1.k(aVar.e, "Unsupported image format: "), 3);
                }
            }
            l.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.a;
        l.h(bitmap);
        bVar = new j6.b(bitmap);
        try {
            Parcel M0 = paVar.M0();
            int i14 = c0.a;
            M0.writeStrongBinder(bVar);
            M0.writeInt(1);
            int q6 = o.q(M0, 20293);
            o.s(M0, 1, 4);
            M0.writeInt(i10);
            o.s(M0, 2, 4);
            M0.writeInt(i11);
            o.s(M0, 3, 4);
            M0.writeInt(i12);
            o.s(M0, 4, 4);
            M0.writeInt(a2);
            o.s(M0, 5, 8);
            M0.writeLong(elapsedRealtime);
            o.r(M0, q6);
            Parcel O0 = paVar.O0(M0, 3);
            ArrayList createTypedArrayList = O0.createTypedArrayList(ta.CREATOR);
            O0.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = createTypedArrayList.get(i15);
                i15++;
                ta taVar = (ta) obj;
                arrayList.add(new hb.a(taVar.b, taVar.d, taVar.a, taVar.c));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new wa.a("Failed to run thin image labeler.", e11);
        }
    }

    @Override // jb.b
    public final void zzb() {
        sa qaVar;
        Context context = this.a;
        if (this.e != null) {
            return;
        }
        try {
            IBinder b10 = k6.e.c(context, k6.e.b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i10 = ra.b;
            if (b10 == null) {
                qaVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                qaVar = queryLocalInterface instanceof sa ? (sa) queryLocalInterface : new qa(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 5);
            }
            this.e = ((qa) qaVar).U0(new j6.b(context), new ua(this.b.a, -1));
        } catch (RemoteException e10) {
            throw new wa.a("Failed to create thin image labeler.", e10);
        } catch (k6.b unused) {
            if (!this.d) {
                k.b(context);
                this.d = true;
            }
            throw new wa.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override // jb.b
    public final void zzc() {
        pa paVar = this.e;
        if (paVar != null) {
            try {
                paVar.Q0(paVar.M0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.e = null;
            this.c = false;
        }
    }
}
