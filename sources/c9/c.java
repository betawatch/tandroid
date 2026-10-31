package c9;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c implements ServiceConnection {
    public b9.c a;
    public final /* synthetic */ d b;

    public c(d dVar) {
        this.b = dVar;
    }

    public static boolean a(c cVar) {
        return cVar.a != null;
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
            Parcel H0 = aVar.H0(obtain, 1);
            boolean z10 = H0.readInt() != 0;
            H0.recycle();
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b9.c aVar;
        if (this.b.a) {
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
        this.a = null;
        if (this.b.a) {
            Log.d("SAVerificationClientS", "onServiceDisconnected");
        }
    }
}
