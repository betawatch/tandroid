package h2;

import a8.cb;
import a8.db;
import a8.eb;
import a8.fb;
import a8.gb;
import a8.hb;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import c8.xb;
import c8.xc;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class p0 implements yb.a {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public Object f;

    public p0(Context context, xb.a aVar) {
        this.d = context;
        this.e = aVar;
    }

    @Override // yb.a
    public ArrayList a(ub.a aVar) {
        a7.b bVar;
        if (((cb) this.f) == null) {
            zzb();
        }
        cb cbVar = (cb) this.f;
        q6.m.g(cbVar);
        if (!this.b) {
            try {
                cbVar.T0(cbVar.P0(), 1);
                this.b = true;
            } catch (RemoteException e10) {
                throw new lb.a("Failed to init thin image labeler.", e10);
            }
        }
        int i7 = aVar.e;
        int i10 = aVar.b;
        int i11 = aVar.c;
        int a10 = xc.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i12 = aVar.e;
        if (i12 != -1) {
            if (i12 != 17) {
                if (i12 == 35) {
                    bVar = new a7.b(null);
                } else if (i12 != 842094169) {
                    throw new lb.a(jg.g.j(aVar.e, "Unsupported image format: "), 3);
                }
            }
            q6.m.g(null);
            throw null;
        }
        Bitmap bitmap = aVar.a;
        q6.m.g(bitmap);
        bVar = new a7.b(bitmap);
        try {
            Parcel P0 = cbVar.P0();
            int i13 = a8.g0.a;
            P0.writeStrongBinder(bVar);
            P0.writeInt(1);
            int r10 = xb.r(P0, 20293);
            xb.q(P0, 1, 4);
            P0.writeInt(i7);
            xb.q(P0, 2, 4);
            P0.writeInt(i10);
            xb.q(P0, 3, 4);
            P0.writeInt(i11);
            xb.q(P0, 4, 4);
            P0.writeInt(a10);
            xb.q(P0, 5, 8);
            P0.writeLong(elapsedRealtime);
            xb.s(P0, r10);
            Parcel R0 = cbVar.R0(P0, 3);
            ArrayList createTypedArrayList = R0.createTypedArrayList(gb.CREATOR);
            R0.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = createTypedArrayList.get(i14);
                i14++;
                gb gbVar = (gb) obj;
                arrayList.add(new wb.a(gbVar.b, gbVar.d, gbVar.a, gbVar.c));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new lb.a("Failed to run thin image labeler.", e11);
        }
    }

    public void b(boolean z9, boolean z10) {
        i0 i0Var = (i0) this.e;
        if (z9 && z10) {
            i0Var.d(new n0(this, z9, z10, 0));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        i0 i0Var2 = (i0) this.f;
        i0Var2.a.postDelayed(new f2.h(28, this, atomicBoolean), 1000L);
        i0Var.d(new o0(this, atomicBoolean, z9, z10, 0));
    }

    public void c(boolean z9) {
        if (this.c == z9) {
            return;
        }
        this.c = z9;
        if (this.b) {
            b(true, z9);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.b + ", prettyPrintIndent='" + ((String) this.d) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.e) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.c + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((pe.a) this.f) + ')';
            default:
                return super.toString();
        }
    }

    @Override // yb.a
    public void zzb() {
        fb dbVar;
        Context context = (Context) this.d;
        if (((cb) this.f) != null) {
            return;
        }
        try {
            IBinder b10 = b7.f.c(context, b7.f.b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i7 = eb.b;
            if (b10 == null) {
                dbVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                dbVar = queryLocalInterface instanceof fb ? (fb) queryLocalInterface : new db(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 0);
            }
            this.f = ((db) dbVar).X0(new a7.b(context), new hb(((xb.a) this.e).a, -1));
        } catch (RemoteException e10) {
            throw new lb.a("Failed to create thin image labeler.", e10);
        } catch (b7.b unused) {
            if (!this.c) {
                pb.j.b(context);
                this.c = true;
            }
            throw new lb.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override // yb.a
    public void zzc() {
        cb cbVar = (cb) this.f;
        if (cbVar != null) {
            try {
                cbVar.T0(cbVar.P0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.f = null;
            this.b = false;
        }
    }

    public p0() {
        pe.a aVar = pe.a.a;
        this.b = true;
        this.d = "    ";
        this.e = TeXSymbolParser.TYPE_ATTR;
        this.c = true;
        this.f = aVar;
    }

    public p0(Context context, Looper looper, g0 g0Var) {
        this.d = new wf.b(context.getApplicationContext(), 21);
        this.e = g0Var.a(looper, null);
        this.f = g0Var.a(Looper.getMainLooper(), null);
    }
}
