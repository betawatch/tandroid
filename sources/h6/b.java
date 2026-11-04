package h6;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import b8.ke;
import com.google.android.gms.internal.cast.u;
import f6.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends AsyncTask {
    public static final i6.b c = new i6.b("FetchBitmapTask", null);
    public final e a;
    public final ke b;

    public b(Context context, int i3, int i10, ke keVar) {
        e eVar;
        this.b = keVar;
        Context applicationContext = context.getApplicationContext();
        j jVar = new j(this);
        i6.b bVar = com.google.android.gms.internal.cast.d.a;
        try {
            com.google.android.gms.internal.cast.f b10 = com.google.android.gms.internal.cast.d.b(applicationContext.getApplicationContext());
            z6.b bVar2 = new z6.b(applicationContext.getApplicationContext());
            Parcel R0 = b10.R0(b10.P0(), 8);
            int readInt = R0.readInt();
            R0.recycle();
            eVar = readInt >= 233700000 ? b10.b1(bVar2, new z6.b(this), jVar, i3, i10) : b10.a1(new z6.b(this), jVar, i3, i10);
        } catch (RemoteException e10) {
            e = e10;
            com.google.android.gms.internal.cast.d.a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            eVar = null;
            this.a = eVar;
        } catch (f6.d e11) {
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
                Parcel P0 = cVar.P0();
                u.c(P0, uri);
                Parcel R0 = cVar.R0(P0, 1);
                Bitmap bitmap = (Bitmap) u.a(R0, Bitmap.CREATOR);
                R0.recycle();
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
        ke keVar = this.b;
        if (keVar != null) {
            a aVar = (a) keVar.f;
            if (aVar != null) {
                aVar.z(bitmap);
            }
            keVar.e = null;
        }
    }
}
