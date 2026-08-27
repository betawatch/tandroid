package ib;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import g7.z6;
import h7.r8;
import i7.c0;
import i7.oa;
import i7.pa;
import i7.qa;
import i7.ra;
import i7.sa;
import i7.ta;
import java.util.ArrayList;
import y5.l;
import za.j;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a implements b {
    public final Context a;
    public final hb.b b;
    public boolean c;
    public boolean d;
    public oa e;

    public a(Context context, hb.b bVar) {
        this.a = context;
        this.b = bVar;
    }

    @Override // ib.b
    public final ArrayList a(eb.a aVar) {
        i6.b bVar;
        if (this.e == null) {
            zzb();
        }
        oa oaVar = this.e;
        l.h(oaVar);
        if (!this.c) {
            try {
                oaVar.Q0(oaVar.M0(), 1);
                this.c = true;
            } catch (RemoteException e9) {
                throw new va.a("Failed to init thin image labeler.", e9);
            }
        }
        int i10 = aVar.e;
        int i11 = aVar.b;
        int i12 = aVar.c;
        int a2 = z6.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = aVar.e;
        if (i13 != -1) {
            if (i13 != 17) {
                if (i13 == 35) {
                    bVar = new i6.b(null);
                } else if (i13 != 842094169) {
                    throw new va.a(i0.a.k(aVar.e, "Unsupported image format: "), 3);
                }
            }
            l.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.a;
        l.h(bitmap);
        bVar = new i6.b(bitmap);
        try {
            Parcel M0 = oaVar.M0();
            int i14 = c0.a;
            M0.writeStrongBinder(bVar);
            M0.writeInt(1);
            int q6 = r8.q(M0, 20293);
            r8.s(M0, 1, 4);
            M0.writeInt(i10);
            r8.s(M0, 2, 4);
            M0.writeInt(i11);
            r8.s(M0, 3, 4);
            M0.writeInt(i12);
            r8.s(M0, 4, 4);
            M0.writeInt(a2);
            r8.s(M0, 5, 8);
            M0.writeLong(elapsedRealtime);
            r8.r(M0, q6);
            Parcel O0 = oaVar.O0(M0, 3);
            ArrayList createTypedArrayList = O0.createTypedArrayList(sa.CREATOR);
            O0.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = createTypedArrayList.get(i15);
                i15++;
                sa saVar = (sa) obj;
                arrayList.add(new gb.a(saVar.b, saVar.d, saVar.a, saVar.c));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new va.a("Failed to run thin image labeler.", e10);
        }
    }

    @Override // ib.b
    public final void zzb() {
        ra paVar;
        Context context = this.a;
        if (this.e != null) {
            return;
        }
        try {
            IBinder b10 = j6.e.c(context, j6.e.b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i10 = qa.b;
            if (b10 == null) {
                paVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                paVar = queryLocalInterface instanceof ra ? (ra) queryLocalInterface : new pa(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 5);
            }
            this.e = ((pa) paVar).U0(new i6.b(context), new ta(this.b.a, -1));
        } catch (RemoteException e9) {
            throw new va.a("Failed to create thin image labeler.", e9);
        } catch (j6.b unused) {
            if (!this.d) {
                j.b(context);
                this.d = true;
            }
            throw new va.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override // ib.b
    public final void zzc() {
        oa oaVar = this.e;
        if (oaVar != null) {
            try {
                oaVar.Q0(oaVar.M0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.e = null;
            this.c = false;
        }
    }
}
