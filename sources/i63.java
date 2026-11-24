// default package

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class i63 extends Binder implements IInterface {
    public final /* synthetic */ byte a = 1;
    public final Object b;

    public i63(k1f k1fVar) {
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        this.b = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        byte b = this.a;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        byte b = 4;
        switch (this.a) {
            case 0:
                Handler handler = (Handler) this.b;
                if (i == 2) {
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    handler.post(new sw(this, parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null));
                    parcel2.writeNoException();
                    break;
                } else {
                    byte b2 = 3;
                    if (i == 3) {
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        handler.post(new sw(this, parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, b2));
                        parcel2.writeNoException();
                        break;
                    } else if (i == 4) {
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        handler.post(new sw(this, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, b));
                        parcel2.writeNoException();
                        break;
                    } else {
                        byte b3 = 5;
                        if (i == 5) {
                            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                            handler.post(new sw(this, parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, b3));
                            parcel2.writeNoException();
                            break;
                        } else if (i == 1598968902) {
                            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                            break;
                        } else {
                            break;
                        }
                    }
                }
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                }
                if (i == 1) {
                    ((jbf) this.b).a((Status) qid.a(parcel, Status.CREATOR));
                    break;
                } else if (i == 2) {
                    break;
                } else if (i == 4) {
                    break;
                }
                break;
        }
        return true;
    }

    public i63(jbf jbfVar) {
        attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        this.b = jbfVar;
    }
}
