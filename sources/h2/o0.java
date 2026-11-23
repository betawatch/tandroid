package h2;

import a8.db;
import a8.eb;
import a8.fb;
import a8.gb;
import a8.hb;
import a8.ib;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import c8.bd;
import c8.cc;
import fi.l4;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class o0 implements yb.a {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public Object f;

    public o0(Context context, xb.a aVar) {
        this.d = context;
        this.e = aVar;
    }

    public void a(boolean z10, boolean z11) {
        i0 i0Var = (i0) this.e;
        if (z10 && z11) {
            i0Var.d(new m0(this, z10, z11, 0));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        i0 i0Var2 = (i0) this.f;
        i0Var2.a.postDelayed(new l4(27, this, atomicBoolean), 1000L);
        i0Var.d(new n0(this, atomicBoolean, z10, z11, 0));
    }

    public void b(boolean z10) {
        if (this.c == z10) {
            return;
        }
        this.c = z10;
        if (this.b) {
            a(true, z10);
        }
    }

    @Override // yb.a
    public ArrayList c(ub.a aVar) {
        a7.b bVar;
        if (((db) this.f) == null) {
            zzb();
        }
        db dbVar = (db) this.f;
        q6.m.h(dbVar);
        if (!this.b) {
            try {
                dbVar.t1(dbVar.p1(), 1);
                this.b = true;
            } catch (RemoteException e10) {
                throw new lb.a("Failed to init thin image labeler.", e10);
            }
        }
        int i7 = aVar.e;
        int i10 = aVar.b;
        int i11 = aVar.c;
        int a10 = bd.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i12 = aVar.e;
        if (i12 != -1) {
            if (i12 != 17) {
                if (i12 == 35) {
                    bVar = new a7.b(null);
                } else if (i12 != 842094169) {
                    throw new lb.a(i5.c.i(aVar.e, "Unsupported image format: "), 3);
                }
            }
            q6.m.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.a;
        q6.m.h(bitmap);
        bVar = new a7.b(bitmap);
        try {
            Parcel p12 = dbVar.p1();
            int i13 = a8.g0.a;
            p12.writeStrongBinder(bVar);
            p12.writeInt(1);
            int r10 = cc.r(p12, 20293);
            cc.q(p12, 1, 4);
            p12.writeInt(i7);
            cc.q(p12, 2, 4);
            p12.writeInt(i10);
            cc.q(p12, 3, 4);
            p12.writeInt(i11);
            cc.q(p12, 4, 4);
            p12.writeInt(a10);
            cc.q(p12, 5, 8);
            p12.writeLong(elapsedRealtime);
            cc.s(p12, r10);
            Parcel r12 = dbVar.r1(p12, 3);
            ArrayList createTypedArrayList = r12.createTypedArrayList(hb.CREATOR);
            r12.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = createTypedArrayList.get(i14);
                i14++;
                hb hbVar = (hb) obj;
                arrayList.add(new wb.a(hbVar.b, hbVar.d, hbVar.a, hbVar.c));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new lb.a("Failed to run thin image labeler.", e11);
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
        gb ebVar;
        Context context = (Context) this.d;
        if (((db) this.f) != null) {
            return;
        }
        try {
            IBinder b10 = b7.f.c(context, b7.f.b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i7 = fb.b;
            if (b10 == null) {
                ebVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                ebVar = queryLocalInterface instanceof gb ? (gb) queryLocalInterface : new eb(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 0);
            }
            this.f = ((eb) ebVar).x1(new a7.b(context), new ib(((xb.a) this.e).a, -1));
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
        db dbVar = (db) this.f;
        if (dbVar != null) {
            try {
                dbVar.t1(dbVar.p1(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.f = null;
            this.b = false;
        }
    }

    public o0() {
        pe.a aVar = pe.a.a;
        this.b = true;
        this.d = "    ";
        this.e = TeXSymbolParser.TYPE_ATTR;
        this.c = true;
        this.f = aVar;
    }

    public o0(Context context, Looper looper, g0 g0Var) {
        this.d = new wf.b(context.getApplicationContext(), 24);
        this.e = g0Var.a(looper, null);
        this.f = g0Var.a(Looper.getMainLooper(), null);
    }
}
