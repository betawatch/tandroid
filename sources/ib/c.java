package ib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import h7.r8;
import i7.c0;
import i7.o1;
import i7.p2;
import i7.q3;
import i7.r0;
import i7.r4;
import i7.s6;
import java.util.ArrayList;
import java.util.Locale;
import y5.l;
import za.j;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c implements b {
    public final Context a;
    public final s6 b;
    public final String c;
    public boolean d;
    public r0 e;

    public c(Context context, hb.b bVar) {
        this.a = context;
        Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
        this.b = new s6(1, -1, bVar.a, 1);
        v5.e.b.getClass();
        this.c = v5.e.a(context) >= 200400000 ? "com.google.android.gms.vision.ica" : "com.google.android.gms.vision.dynamite";
    }

    @Override // ib.b
    public final ArrayList a(eb.a aVar) {
        Bitmap createBitmap;
        if (this.e == null) {
            zzb();
        }
        if (this.e == null) {
            throw new va.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
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
                throw new va.a("Unsupported image format", 13);
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
            i6.b bVar = new i6.b(createBitmap);
            Parcel M0 = r0Var.M0();
            int i14 = c0.a;
            M0.writeStrongBinder(bVar);
            M0.writeInt(1);
            int q6 = r8.q(M0, 20293);
            r8.s(M0, 2, 4);
            M0.writeInt(-1);
            r8.r(M0, q6);
            Parcel O0 = r0Var.O0(M0, 1);
            r4[] r4VarArr = (r4[]) O0.createTypedArray(r4.CREATOR);
            O0.recycle();
            ArrayList arrayList = new ArrayList();
            for (r4 r4Var : r4VarArr) {
                arrayList.add(new gb.a(r4Var.c, r4Var.d, r4Var.b, r4Var.a));
            }
            return arrayList;
        } catch (RemoteException e9) {
            throw new va.a("Failed to run legacy image labeler.", e9);
        }
    }

    @Override // ib.b
    public final void zzb() {
        q3 o1Var;
        String str = this.c;
        Context context = this.a;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (this.e != null) {
            return;
        }
        try {
            IBinder b10 = j6.e.c(context, j6.e.b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
            int i10 = p2.b;
            if (b10 == null) {
                o1Var = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                o1Var = queryLocalInterface instanceof q3 ? (q3) queryLocalInterface : new o1(b10, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 5);
            }
            r0 U0 = ((o1) o1Var).U0(new i6.b(context), this.b);
            this.e = U0;
            if (U0 != null || this.d) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            j.b(context);
            this.d = true;
        } catch (RemoteException e9) {
            throw new va.a("Failed to create legacy image labeler.", e9);
        } catch (j6.b e10) {
            if (str.equals("com.google.android.gms.vision.dynamite")) {
                throw new va.a("Failed to load deprecated vision dynamite module.", e10);
            }
            if (this.d) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            j.b(context);
            this.d = true;
        }
    }

    @Override // ib.b
    public final void zzc() {
        r0 r0Var = this.e;
        if (r0Var != null) {
            try {
                r0Var.Q0(r0Var.M0(), 2);
            } catch (RemoteException e9) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e9);
            }
            this.e = null;
        }
    }
}
