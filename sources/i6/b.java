package i6;

import a8.r7;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.t;
import g6.j;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class b extends AsyncTask {
    public static final j6.b c = new j6.b("FetchBitmapTask", null);
    public final e a;
    public final r7 b;

    public b(Context context, int i7, int i10, r7 r7Var) {
        e eVar;
        this.b = r7Var;
        Context applicationContext = context.getApplicationContext();
        j jVar = new j(this);
        j6.b bVar = com.google.android.gms.internal.cast.d.a;
        try {
            com.google.android.gms.internal.cast.f b10 = com.google.android.gms.internal.cast.d.b(applicationContext.getApplicationContext());
            a7.b bVar2 = new a7.b(applicationContext.getApplicationContext());
            Parcel r12 = b10.r1(b10.p1(), 8);
            int readInt = r12.readInt();
            r12.recycle();
            eVar = readInt >= 233700000 ? b10.B1(bVar2, new a7.b(this), jVar, i7, i10) : b10.A1(new a7.b(this), jVar, i7, i10);
        } catch (RemoteException e10) {
            e = e10;
            com.google.android.gms.internal.cast.d.a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            eVar = null;
            this.a = eVar;
        } catch (g6.d e11) {
            e = e11;
            com.google.android.gms.internal.cast.d.a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            eVar = null;
            this.a = eVar;
        }
        this.a = eVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        e eVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (eVar = this.a) != null) {
            try {
                c cVar = (c) eVar;
                Parcel p12 = cVar.p1();
                t.c(p12, uri);
                Parcel r12 = cVar.r1(p12, 1);
                Bitmap bitmap = (Bitmap) t.a(r12, Bitmap.CREATOR);
                r12.recycle();
                return bitmap;
            } catch (RemoteException e10) {
                c.a(e10, "Unable to call %s on %s.", "doFetch", e.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        r7 r7Var = this.b;
        if (r7Var != null) {
            a aVar = (a) r7Var.f;
            if (aVar != null) {
                aVar.p(bitmap);
            }
            r7Var.e = null;
        }
    }
}
