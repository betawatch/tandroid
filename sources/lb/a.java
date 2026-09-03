package lb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import b6.m;
import cb.k;
import j7.f8;
import j7.g5;
import java.util.ArrayList;
import l7.c0;
import l7.pa;
import l7.qa;
import l7.ra;
import l7.sa;
import l7.ta;
import l7.ua;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a implements b {
    public final Context a;
    public final kb.b b;
    public boolean c;
    public boolean d;
    public pa e;

    public a(Context context, kb.b bVar) {
        this.a = context;
        this.b = bVar;
    }

    @Override // lb.b
    public final ArrayList a(hb.a aVar) {
        l6.b bVar;
        if (this.e == null) {
            zzb();
        }
        pa paVar = this.e;
        m.h(paVar);
        if (!this.c) {
            try {
                paVar.Q0(paVar.M0(), 1);
                this.c = true;
            } catch (RemoteException e6) {
                throw new ya.a("Failed to init thin image labeler.", e6);
            }
        }
        int i10 = aVar.e;
        int i11 = aVar.b;
        int i12 = aVar.c;
        int a2 = f8.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = aVar.e;
        if (i13 != -1) {
            if (i13 != 17) {
                if (i13 == 35) {
                    bVar = new l6.b(null);
                } else if (i13 != 842094169) {
                    throw new ya.a(l.d.j(aVar.e, "Unsupported image format: "), 3);
                }
            }
            m.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.a;
        m.h(bitmap);
        bVar = new l6.b(bitmap);
        try {
            Parcel M0 = paVar.M0();
            int i14 = c0.a;
            M0.writeStrongBinder(bVar);
            M0.writeInt(1);
            int q10 = g5.q(M0, 20293);
            g5.s(M0, 1, 4);
            M0.writeInt(i10);
            g5.s(M0, 2, 4);
            M0.writeInt(i11);
            g5.s(M0, 3, 4);
            M0.writeInt(i12);
            g5.s(M0, 4, 4);
            M0.writeInt(a2);
            g5.s(M0, 5, 8);
            M0.writeLong(elapsedRealtime);
            g5.r(M0, q10);
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
                arrayList.add(new jb.a(taVar.b, taVar.d, taVar.a, taVar.c));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new ya.a("Failed to run thin image labeler.", e10);
        }
    }

    @Override // lb.b
    public final void zzb() {
        sa qaVar;
        Context context = this.a;
        if (this.e != null) {
            return;
        }
        try {
            IBinder b10 = m6.e.c(context, m6.e.b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i10 = ra.b;
            if (b10 == null) {
                qaVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                qaVar = queryLocalInterface instanceof sa ? (sa) queryLocalInterface : new qa(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 6);
            }
            this.e = ((qa) qaVar).U0(new l6.b(context), new ua(this.b.a, -1));
        } catch (RemoteException e6) {
            throw new ya.a("Failed to create thin image labeler.", e6);
        } catch (m6.b unused) {
            if (!this.d) {
                k.b(context);
                this.d = true;
            }
            throw new ya.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override // lb.b
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
