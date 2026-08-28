package hb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import f7.z6;
import g7.p8;
import h7.c0;
import h7.oa;
import h7.pa;
import h7.qa;
import h7.ra;
import h7.sa;
import h7.ta;
import j3.r0;
import java.util.ArrayList;
import x5.l;
import ya.j;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements b {
    public final Context a;
    public final gb.b b;
    public boolean c;
    public boolean d;
    public oa e;

    public a(Context context, gb.b bVar) {
        this.a = context;
        this.b = bVar;
    }

    @Override // hb.b
    public final ArrayList a(db.a aVar) {
        h6.b bVar;
        if (this.e == null) {
            zzb();
        }
        oa oaVar = this.e;
        l.h(oaVar);
        if (!this.c) {
            try {
                oaVar.Q0(oaVar.M0(), 1);
                this.c = true;
            } catch (RemoteException e10) {
                throw new ua.a("Failed to init thin image labeler.", e10);
            }
        }
        int i9 = aVar.e;
        int i10 = aVar.b;
        int i11 = aVar.c;
        int a2 = z6.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i12 = aVar.e;
        if (i12 != -1) {
            if (i12 != 17) {
                if (i12 == 35) {
                    bVar = new h6.b(null);
                } else if (i12 != 842094169) {
                    throw new ua.a(r0.l(aVar.e, "Unsupported image format: "), 3);
                }
            }
            l.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.a;
        l.h(bitmap);
        bVar = new h6.b(bitmap);
        try {
            Parcel M0 = oaVar.M0();
            int i13 = c0.a;
            M0.writeStrongBinder(bVar);
            M0.writeInt(1);
            int q10 = p8.q(M0, 20293);
            p8.s(M0, 1, 4);
            M0.writeInt(i9);
            p8.s(M0, 2, 4);
            M0.writeInt(i10);
            p8.s(M0, 3, 4);
            M0.writeInt(i11);
            p8.s(M0, 4, 4);
            M0.writeInt(a2);
            p8.s(M0, 5, 8);
            M0.writeLong(elapsedRealtime);
            p8.r(M0, q10);
            Parcel O0 = oaVar.O0(M0, 3);
            ArrayList createTypedArrayList = O0.createTypedArrayList(sa.CREATOR);
            O0.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = createTypedArrayList.get(i14);
                i14++;
                sa saVar = (sa) obj;
                arrayList.add(new fb.a(saVar.b, saVar.d, saVar.a, saVar.c));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new ua.a("Failed to run thin image labeler.", e11);
        }
    }

    @Override // hb.b
    public final void zzb() {
        ra paVar;
        Context context = this.a;
        if (this.e != null) {
            return;
        }
        try {
            IBinder b10 = i6.e.c(context, i6.e.b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i9 = qa.b;
            if (b10 == null) {
                paVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                paVar = queryLocalInterface instanceof ra ? (ra) queryLocalInterface : new pa(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 5);
            }
            this.e = ((pa) paVar).U0(new h6.b(context), new ta(this.b.a, -1));
        } catch (RemoteException e10) {
            throw new ua.a("Failed to create thin image labeler.", e10);
        } catch (i6.b unused) {
            if (!this.d) {
                j.b(context);
                this.d = true;
            }
            throw new ua.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override // hb.b
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
