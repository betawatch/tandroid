package f6;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import ci.u5;
import com.google.android.gms.internal.cast.v;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class b extends AsyncTask {
    public static final g6.b c = new g6.b("FetchBitmapTask", null);
    public final e a;
    public final u5 b;

    public b(Context context, int i10, int i11, u5 u5Var) {
        e eVar;
        this.b = u5Var;
        Context applicationContext = context.getApplicationContext();
        d6.j jVar = new d6.j(this);
        g6.b bVar = com.google.android.gms.internal.cast.e.a;
        try {
            com.google.android.gms.internal.cast.g b10 = com.google.android.gms.internal.cast.e.b(applicationContext.getApplicationContext());
            x6.b bVar2 = new x6.b(applicationContext.getApplicationContext());
            Parcel P0 = b10.P0(b10.N0(), 8);
            int readInt = P0.readInt();
            P0.recycle();
            eVar = readInt >= 233700000 ? b10.Z0(bVar2, new x6.b(this), jVar, i10, i11) : b10.Y0(new x6.b(this), jVar, i10, i11);
        } catch (RemoteException e7) {
            e = e7;
            com.google.android.gms.internal.cast.e.a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            eVar = null;
            this.a = eVar;
        } catch (d6.d e10) {
            e = e10;
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
            } catch (RemoteException e7) {
                c.a(e7, "Unable to call %s on %s.", "doFetch", e.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        u5 u5Var = this.b;
        if (u5Var != null) {
            a aVar = (a) u5Var.e;
            if (aVar != null) {
                aVar.s(bitmap);
            }
            u5Var.d = null;
        }
    }
}
