// default package

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class hv9 implements ServiceConnection {
    public fl5 a;
    public final /* synthetic */ iv9 b;

    public hv9(iv9 iv9Var) {
        this.b = iv9Var;
    }

    public final boolean a() {
        return this.a != null;
    }

    public final boolean b(Intent intent, Bundle bundle) {
        fl5 fl5Var = this.a;
        if (fl5Var != null) {
            dl5 dl5Var = (dl5) fl5Var;
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
            int i = sk2.a;
            if (intent == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            }
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            Parcel a = dl5Var.a(obtain, 1);
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
        fl5 dl5Var;
        if (this.b.a) {
            Log.d("SAVerificationClientS", "onServiceConnected");
        }
        int i = el5.a;
        if (iBinder == null) {
            dl5Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            dl5Var = queryLocalInterface instanceof fl5 ? (fl5) queryLocalInterface : new dl5(iBinder);
        }
        this.a = dl5Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a = null;
        if (this.b.a) {
            Log.d("SAVerificationClientS", "onServiceDisconnected");
        }
    }
}
