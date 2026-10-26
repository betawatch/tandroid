package d9;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b implements ServiceConnection {
    public c9.c a;
    public final /* synthetic */ c b;

    public b(c cVar) {
        this.b = cVar;
    }

    public static boolean a(b bVar) {
        return bVar.a != null;
    }

    public final boolean b(Intent intent, Bundle bundle) {
        c9.c cVar = this.a;
        if (cVar != null) {
            c9.a aVar = (c9.a) cVar;
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
            int i10 = i5.a.a;
            if (intent == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            }
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            Parcel F0 = aVar.F0(obtain, 1);
            boolean z10 = F0.readInt() != 0;
            F0.recycle();
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z10;
        c9.c aVar;
        z10 = this.b.dbg;
        if (z10) {
            Log.d("SAVerificationClientS", "onServiceConnected");
        }
        int i10 = c9.b.a;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            aVar = queryLocalInterface instanceof c9.c ? (c9.c) queryLocalInterface : new c9.a(iBinder);
        }
        this.a = aVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z10;
        this.a = null;
        z10 = this.b.dbg;
        if (z10) {
            Log.d("SAVerificationClientS", "onServiceDisconnected");
        }
    }
}
