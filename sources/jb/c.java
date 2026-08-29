package jb;

import ab.k;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.cast.o;
import j7.c0;
import j7.p1;
import j7.q2;
import j7.r0;
import j7.r3;
import j7.s4;
import j7.t6;
import java.util.ArrayList;
import java.util.Locale;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements b {
    public final Context a;
    public final t6 b;
    public final String c;
    public boolean d;
    public r0 e;

    public c(Context context, ib.b bVar) {
        this.a = context;
        Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
        this.b = new t6(1, -1, bVar.a, 1);
        w5.e.b.getClass();
        this.c = w5.e.a(context) >= 200400000 ? "com.google.android.gms.vision.ica" : "com.google.android.gms.vision.dynamite";
    }

    @Override // jb.b
    public final ArrayList a(fb.a aVar) {
        Bitmap createBitmap;
        if (this.e == null) {
            zzb();
        }
        if (this.e == null) {
            throw new wa.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
        }
        int i10 = aVar.e;
        if (i10 != -1) {
            if (i10 == 17) {
                l.h(null);
                throw null;
            }
            if (i10 == 35) {
                l.h(null);
                throw null;
            }
            if (i10 != 842094169) {
                throw new wa.a("Unsupported image format", 13);
            }
            l.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.a;
        l.h(bitmap);
        int i11 = aVar.d;
        int i12 = aVar.b;
        int i13 = aVar.c;
        if (i11 == 0) {
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i12, i13);
        } else {
            Matrix matrix = new Matrix();
            matrix.postRotate(i11);
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i12, i13, matrix, true);
        }
        try {
            r0 r0Var = this.e;
            l.h(r0Var);
            j6.b bVar = new j6.b(createBitmap);
            Parcel M0 = r0Var.M0();
            int i14 = c0.a;
            M0.writeStrongBinder(bVar);
            M0.writeInt(1);
            int q6 = o.q(M0, 20293);
            o.s(M0, 2, 4);
            M0.writeInt(-1);
            o.r(M0, q6);
            Parcel O0 = r0Var.O0(M0, 1);
            s4[] s4VarArr = (s4[]) O0.createTypedArray(s4.CREATOR);
            O0.recycle();
            ArrayList arrayList = new ArrayList();
            for (s4 s4Var : s4VarArr) {
                arrayList.add(new hb.a(s4Var.c, s4Var.d, s4Var.b, s4Var.a));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new wa.a("Failed to run legacy image labeler.", e10);
        }
    }

    @Override // jb.b
    public final void zzb() {
        r3 p1Var;
        String str = this.c;
        Context context = this.a;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (this.e != null) {
            return;
        }
        try {
            IBinder b10 = k6.e.c(context, k6.e.b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
            int i10 = q2.b;
            if (b10 == null) {
                p1Var = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                p1Var = queryLocalInterface instanceof r3 ? (r3) queryLocalInterface : new p1(b10, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 5);
            }
            r0 U0 = ((p1) p1Var).U0(new j6.b(context), this.b);
            this.e = U0;
            if (U0 != null || this.d) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            k.b(context);
            this.d = true;
        } catch (RemoteException e10) {
            throw new wa.a("Failed to create legacy image labeler.", e10);
        } catch (k6.b e11) {
            if (str.equals("com.google.android.gms.vision.dynamite")) {
                throw new wa.a("Failed to load deprecated vision dynamite module.", e11);
            }
            if (this.d) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            k.b(context);
            this.d = true;
        }
    }

    @Override // jb.b
    public final void zzc() {
        r0 r0Var = this.e;
        if (r0Var != null) {
            try {
                r0Var.Q0(r0Var.M0(), 2);
            } catch (RemoteException e10) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e10);
            }
            this.e = null;
        }
    }
}
