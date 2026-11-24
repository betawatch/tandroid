// default package

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class or9 implements ServiceConnection {
    public dj5 a;
    public final /* synthetic */ pr9 b;

    public or9(pr9 pr9Var) {
        this.b = pr9Var;
    }

    public final boolean a() {
        return this.a != null;
    }

    public final boolean b(Intent intent, Bundle bundle) {
        dj5 dj5Var = this.a;
        if (dj5Var != null) {
            bj5 bj5Var = (bj5) dj5Var;
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
            int i = xj2.a;
            if (intent == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            }
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            Parcel a = bj5Var.a(obtain, 1);
            boolean z = a.readInt() != 0;
            a.recycle();
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        dj5 bj5Var;
        if (this.b.a) {
            Log.d("SAVerificationClientS", "onServiceConnected");
        }
        int i = cj5.a;
        if (iBinder == null) {
            bj5Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            bj5Var = queryLocalInterface instanceof dj5 ? (dj5) queryLocalInterface : new bj5(iBinder);
        }
        this.a = bj5Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a = null;
        if (this.b.a) {
            Log.d("SAVerificationClientS", "onServiceDisconnected");
        }
    }
}
