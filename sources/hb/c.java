package hb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import g7.p8;
import h7.c0;
import h7.o1;
import h7.p2;
import h7.q3;
import h7.r0;
import h7.r4;
import h7.s6;
import java.util.ArrayList;
import java.util.Locale;
import x5.l;
import ya.j;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements b {
    public final Context a;
    public final s6 b;
    public final String c;
    public boolean d;
    public r0 e;

    public c(Context context, gb.b bVar) {
        this.a = context;
        Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
        this.b = new s6(1, -1, bVar.a, 1);
        u5.e.b.getClass();
        this.c = u5.e.a(context) >= 200400000 ? "com.google.android.gms.vision.ica" : "com.google.android.gms.vision.dynamite";
    }

    @Override // hb.b
    public final ArrayList a(db.a aVar) {
        Bitmap createBitmap;
        if (this.e == null) {
            zzb();
        }
        if (this.e == null) {
            throw new ua.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
        }
        int i9 = aVar.e;
        if (i9 != -1) {
            if (i9 == 17) {
                l.h(null);
                throw null;
            }
            if (i9 == 35) {
                l.h(null);
                throw null;
            }
            if (i9 != 842094169) {
                throw new ua.a("Unsupported image format", 13);
            }
            l.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.a;
        l.h(bitmap);
        int i10 = aVar.d;
        int i11 = aVar.b;
        int i12 = aVar.c;
        if (i10 == 0) {
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i11, i12);
        } else {
            Matrix matrix = new Matrix();
            matrix.postRotate(i10);
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i11, i12, matrix, true);
        }
        try {
            r0 r0Var = this.e;
            l.h(r0Var);
            h6.b bVar = new h6.b(createBitmap);
            Parcel M0 = r0Var.M0();
            int i13 = c0.a;
            M0.writeStrongBinder(bVar);
            M0.writeInt(1);
            int q10 = p8.q(M0, 20293);
            p8.s(M0, 2, 4);
            M0.writeInt(-1);
            p8.r(M0, q10);
            Parcel O0 = r0Var.O0(M0, 1);
            r4[] r4VarArr = (r4[]) O0.createTypedArray(r4.CREATOR);
            O0.recycle();
            ArrayList arrayList = new ArrayList();
            for (r4 r4Var : r4VarArr) {
                arrayList.add(new fb.a(r4Var.c, r4Var.d, r4Var.b, r4Var.a));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new ua.a("Failed to run legacy image labeler.", e10);
        }
    }

    @Override // hb.b
    public final void zzb() {
        q3 o1Var;
        String str = this.c;
        Context context = this.a;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (this.e != null) {
            return;
        }
        try {
            IBinder b10 = i6.e.c(context, i6.e.b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
            int i9 = p2.b;
            if (b10 == null) {
                o1Var = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                o1Var = queryLocalInterface instanceof q3 ? (q3) queryLocalInterface : new o1(b10, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 5);
            }
            r0 U0 = ((o1) o1Var).U0(new h6.b(context), this.b);
            this.e = U0;
            if (U0 != null || this.d) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            j.b(context);
            this.d = true;
        } catch (RemoteException e10) {
            throw new ua.a("Failed to create legacy image labeler.", e10);
        } catch (i6.b e11) {
            if (str.equals("com.google.android.gms.vision.dynamite")) {
                throw new ua.a("Failed to load deprecated vision dynamite module.", e11);
            }
            if (this.d) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            j.b(context);
            this.d = true;
        }
    }

    @Override // hb.b
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
