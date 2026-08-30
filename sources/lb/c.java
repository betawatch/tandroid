package lb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import b6.m;
import cb.k;
import j7.f5;
import java.util.ArrayList;
import java.util.Locale;
import l7.c0;
import l7.p1;
import l7.q2;
import l7.r0;
import l7.r3;
import l7.s4;
import l7.t6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c implements b {
    public final Context a;
    public final t6 b;
    public final String c;
    public boolean d;
    public r0 e;

    public c(Context context, kb.b bVar) {
        this.a = context;
        Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
        this.b = new t6(1, -1, bVar.a, 1);
        y5.e.b.getClass();
        this.c = y5.e.a(context) >= 200400000 ? "com.google.android.gms.vision.ica" : "com.google.android.gms.vision.dynamite";
    }

    @Override // lb.b
    public final ArrayList a(hb.a aVar) {
        Bitmap createBitmap;
        if (this.e == null) {
            zzb();
        }
        if (this.e == null) {
            throw new ya.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
        }
        int i10 = aVar.e;
        if (i10 != -1) {
            if (i10 == 17) {
                m.h(null);
                throw null;
            }
            if (i10 == 35) {
                m.h(null);
                throw null;
            }
            if (i10 != 842094169) {
                throw new ya.a("Unsupported image format", 13);
            }
            m.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.a;
        m.h(bitmap);
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
            m.h(r0Var);
            l6.b bVar = new l6.b(createBitmap);
            Parcel M0 = r0Var.M0();
            int i14 = c0.a;
            M0.writeStrongBinder(bVar);
            M0.writeInt(1);
            int q10 = f5.q(M0, 20293);
            f5.s(M0, 2, 4);
            M0.writeInt(-1);
            f5.r(M0, q10);
            Parcel O0 = r0Var.O0(M0, 1);
            s4[] s4VarArr = (s4[]) O0.createTypedArray(s4.CREATOR);
            O0.recycle();
            ArrayList arrayList = new ArrayList();
            for (s4 s4Var : s4VarArr) {
                arrayList.add(new jb.a(s4Var.c, s4Var.d, s4Var.b, s4Var.a));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new ya.a("Failed to run legacy image labeler.", e);
        }
    }

    @Override // lb.b
    public final void zzb() {
        r3 p1Var;
        String str = this.c;
        Context context = this.a;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (this.e != null) {
            return;
        }
        try {
            IBinder b10 = m6.e.c(context, m6.e.b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
            int i10 = q2.b;
            if (b10 == null) {
                p1Var = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                p1Var = queryLocalInterface instanceof r3 ? (r3) queryLocalInterface : new p1(b10, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 6);
            }
            r0 U0 = ((p1) p1Var).U0(new l6.b(context), this.b);
            this.e = U0;
            if (U0 != null || this.d) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            k.b(context);
            this.d = true;
        } catch (RemoteException e) {
            throw new ya.a("Failed to create legacy image labeler.", e);
        } catch (m6.b e6) {
            if (str.equals("com.google.android.gms.vision.dynamite")) {
                throw new ya.a("Failed to load deprecated vision dynamite module.", e6);
            }
            if (this.d) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            k.b(context);
            this.d = true;
        }
    }

    @Override // lb.b
    public final void zzc() {
        r0 r0Var = this.e;
        if (r0Var != null) {
            try {
                r0Var.Q0(r0Var.M0(), 2);
            } catch (RemoteException e) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e);
            }
            this.e = null;
        }
    }
}
