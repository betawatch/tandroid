package g2;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.p1;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import z7.ha;
import z7.ia;
import z7.ja;
import z7.ka;
import z7.la;
import z7.ma;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q0 implements vb.a {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public Object f;

    public q0(Context context, ub.a aVar) {
        this.d = context;
        this.e = aVar;
    }

    @Override // vb.a
    public ArrayList a(rb.a aVar) {
        z6.b bVar;
        if (((ha) this.f) == null) {
            zzb();
        }
        ha haVar = (ha) this.f;
        p6.m.g(haVar);
        if (!this.b) {
            try {
                haVar.T0(haVar.P0(), 1);
                this.b = true;
            } catch (RemoteException e10) {
                throw new ib.a("Failed to init thin image labeler.", e10);
            }
        }
        int i3 = aVar.e;
        int i10 = aVar.b;
        int i11 = aVar.c;
        int a10 = x7.s.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i12 = aVar.e;
        if (i12 != -1) {
            if (i12 != 17) {
                if (i12 == 35) {
                    bVar = new z6.b(null);
                } else if (i12 != 842094169) {
                    throw new ib.a(p1.i(aVar.e, "Unsupported image format: "), 3);
                }
            }
            p6.m.g(null);
            throw null;
        }
        Bitmap bitmap = aVar.a;
        p6.m.g(bitmap);
        bVar = new z6.b(bitmap);
        try {
            Parcel P0 = haVar.P0();
            int i13 = z7.x.a;
            P0.writeStrongBinder(bVar);
            P0.writeInt(1);
            int s6 = j8.a.s(P0, 20293);
            j8.a.r(P0, 1, 4);
            P0.writeInt(i3);
            j8.a.r(P0, 2, 4);
            P0.writeInt(i10);
            j8.a.r(P0, 3, 4);
            P0.writeInt(i11);
            j8.a.r(P0, 4, 4);
            P0.writeInt(a10);
            j8.a.r(P0, 5, 8);
            P0.writeLong(elapsedRealtime);
            j8.a.t(P0, s6);
            Parcel R0 = haVar.R0(P0, 3);
            ArrayList createTypedArrayList = R0.createTypedArrayList(la.CREATOR);
            R0.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = createTypedArrayList.get(i14);
                i14++;
                la laVar = (la) obj;
                arrayList.add(new tb.a(laVar.b, laVar.d, laVar.a, laVar.c));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new ib.a("Failed to run thin image labeler.", e11);
        }
    }

    public void b(boolean z10, boolean z11) {
        j0 j0Var = (j0) this.e;
        if (z10 && z11) {
            j0Var.d(new o0(this, z10, z11, 0));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        j0 j0Var2 = (j0) this.f;
        j0Var2.a.postDelayed(new c(4, this, atomicBoolean), 1000L);
        j0Var.d(new p0(this, atomicBoolean, z10, z11, 0));
    }

    public void c(boolean z10) {
        if (this.c == z10) {
            return;
        }
        this.c = z10;
        if (this.b) {
            b(true, z10);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.b + ", prettyPrintIndent='" + ((String) this.d) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.e) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.c + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((me.a) this.f) + ')';
            default:
                return super.toString();
        }
    }

    @Override // vb.a
    public void zzb() {
        ka iaVar;
        Context context = (Context) this.d;
        if (((ha) this.f) != null) {
            return;
        }
        try {
            IBinder b10 = a7.f.c(context, a7.f.b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i3 = ja.b;
            if (b10 == null) {
                iaVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                iaVar = queryLocalInterface instanceof ka ? (ka) queryLocalInterface : new ia(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 11);
            }
            this.f = ((ia) iaVar).X0(new z6.b(context), new ma(((ub.a) this.e).a, -1));
        } catch (a7.b unused) {
            if (!this.c) {
                mb.j.b(context);
                this.c = true;
            }
            throw new ib.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        } catch (RemoteException e10) {
            throw new ib.a("Failed to create thin image labeler.", e10);
        }
    }

    @Override // vb.a
    public void zzc() {
        ha haVar = (ha) this.f;
        if (haVar != null) {
            try {
                haVar.T0(haVar.P0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.f = null;
            this.b = false;
        }
    }

    public q0() {
        me.a aVar = me.a.a;
        this.b = true;
        this.d = "    ";
        this.e = TeXSymbolParser.TYPE_ATTR;
        this.c = true;
        this.f = aVar;
    }

    public q0(Context context, Looper looper, h0 h0Var) {
        this.d = new p4.q(context.getApplicationContext());
        this.e = h0Var.a(looper, null);
        this.f = h0Var.a(Looper.getMainLooper(), null);
    }
}
