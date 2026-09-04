package c9;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b implements ServiceConnection {
    public b9.c a;
    public final /* synthetic */ c b;

    public b(c cVar) {
        this.b = cVar;
    }

    public static boolean a(b bVar) {
        return bVar.a != null;
    }

    public final boolean b(Intent intent, Bundle bundle) {
        b9.c cVar = this.a;
        if (cVar != null) {
            b9.a aVar = (b9.a) cVar;
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
            int i10 = h5.a.a;
            if (intent == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            }
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            Parcel G0 = aVar.G0(obtain, 1);
            boolean z10 = G0.readInt() != 0;
            G0.recycle();
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z10;
        b9.c aVar;
        z10 = this.b.dbg;
        if (z10) {
            Log.d("SAVerificationClientS", "onServiceConnected");
        }
        int i10 = b9.b.a;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            aVar = queryLocalInterface instanceof b9.c ? (b9.c) queryLocalInterface : new b9.a(iBinder);
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
