package f6;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.internal.cast.z5;
import d6.j;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class b extends AsyncTask {
    public static final g6.b c = new g6.b("FetchBitmapTask", null);
    public final e a;
    public final z5 b;

    public b(Context context, int i10, int i11, z5 z5Var) {
        e eVar;
        this.b = z5Var;
        Context applicationContext = context.getApplicationContext();
        j jVar = new j(this);
        g6.b bVar = com.google.android.gms.internal.cast.e.a;
        try {
            com.google.android.gms.internal.cast.g b10 = com.google.android.gms.internal.cast.e.b(applicationContext.getApplicationContext());
            x6.b bVar2 = new x6.b(applicationContext.getApplicationContext());
            Parcel P0 = b10.P0(b10.N0(), 8);
            int readInt = P0.readInt();
            P0.recycle();
            eVar = readInt >= 233700000 ? b10.Z0(bVar2, new x6.b(this), jVar, i10, i11) : b10.Y0(new x6.b(this), jVar, i10, i11);
        } catch (RemoteException e) {
            e = e;
            com.google.android.gms.internal.cast.e.a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            eVar = null;
            this.a = eVar;
        } catch (d6.d e7) {
            e = e7;
            com.google.android.gms.internal.cast.e.a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
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
                Parcel N0 = cVar.N0();
                v.c(N0, uri);
                Parcel P0 = cVar.P0(N0, 1);
                Bitmap bitmap = (Bitmap) v.a(P0, Bitmap.CREATOR);
                P0.recycle();
                return bitmap;
            } catch (RemoteException e) {
                c.a(e, "Unable to call %s on %s.", "doFetch", e.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        z5 z5Var = this.b;
        if (z5Var != null) {
            a aVar = (a) z5Var.e;
            if (aVar != null) {
                aVar.k(bitmap);
            }
            z5Var.d = null;
        }
    }
}
