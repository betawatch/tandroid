package bc;

import a8.df;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import o6.l;
import sb.j;
import y7.i1;
import y7.j2;
import y7.k3;
import y7.l0;
import y7.l4;
import y7.m6;
import y7.x;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c implements b {
    public final Context a;
    public final m6 b;
    public final String c;
    public boolean d;
    public l0 e;

    public c(Context context, ac.b bVar) {
        this.a = context;
        Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
        this.b = new m6(1, -1, bVar.a, 1);
        l6.e.b.getClass();
        this.c = l6.e.a(context) >= 200400000 ? "com.google.android.gms.vision.ica" : "com.google.android.gms.vision.dynamite";
    }

    @Override // bc.b
    public final ArrayList a(xb.a aVar) {
        Bitmap createBitmap;
        if (this.e == null) {
            zzb();
        }
        if (this.e == null) {
            throw new ob.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
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
                throw new ob.a("Unsupported image format", 13);
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
            l0 l0Var = this.e;
            l.h(l0Var);
            y6.b bVar = new y6.b(createBitmap);
            Parcel N0 = l0Var.N0();
            int i14 = x.a;
            N0.writeStrongBinder(bVar);
            N0.writeInt(1);
            int q5 = df.q(N0, 20293);
            df.s(N0, 2, 4);
            N0.writeInt(-1);
            df.r(N0, q5);
            Parcel P0 = l0Var.P0(N0, 1);
            l4[] l4VarArr = (l4[]) P0.createTypedArray(l4.CREATOR);
            P0.recycle();
            ArrayList arrayList = new ArrayList();
            for (l4 l4Var : l4VarArr) {
                arrayList.add(new zb.a(l4Var.c, l4Var.d, l4Var.b, l4Var.a));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new ob.a("Failed to run legacy image labeler.", e);
        }
    }

    @Override // bc.b
    public final void zzb() {
        k3 i1Var;
        String str = this.c;
        Context context = this.a;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (this.e != null) {
            return;
        }
        try {
            IBinder b10 = z6.e.c(context, z6.e.b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
            int i10 = j2.b;
            if (b10 == null) {
                i1Var = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                i1Var = queryLocalInterface instanceof k3 ? (k3) queryLocalInterface : new i1(b10, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 11);
            }
            l0 V0 = ((i1) i1Var).V0(new y6.b(context), this.b);
            this.e = V0;
            if (V0 != null || this.d) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            j.b(context);
            this.d = true;
        } catch (RemoteException e) {
            throw new ob.a("Failed to create legacy image labeler.", e);
        } catch (z6.b e10) {
            if (str.equals("com.google.android.gms.vision.dynamite")) {
                throw new ob.a("Failed to load deprecated vision dynamite module.", e10);
            }
            if (this.d) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            j.b(context);
            this.d = true;
        }
    }

    @Override // bc.b
    public final void zzc() {
        l0 l0Var = this.e;
        if (l0Var != null) {
            try {
                l0Var.R0(l0Var.N0(), 2);
            } catch (RemoteException e) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e);
            }
            this.e = null;
        }
    }
}
