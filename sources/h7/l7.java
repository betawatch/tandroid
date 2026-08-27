package h7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class l7 {
    public static Context a;
    public static t7.e b;

    public static t7.e a(Context context) {
        t7.e eVar;
        y5.l.h(context);
        Log.d("l7", "preferredRenderer: ".concat(BuildConfig.BETA_URL));
        t7.e eVar2 = b;
        if (eVar2 != null) {
            return eVar2;
        }
        AtomicBoolean atomicBoolean = v5.g.a;
        int b10 = v5.g.b(context, 13400000);
        if (b10 != 0) {
            throw new v5.f(b10);
        }
        Log.i("l7", "Making Creator dynamically");
        ClassLoader classLoader = b(context).getClassLoader();
        try {
            y5.l.h(classLoader);
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                IBinder iBinder = (IBinder) loadClass.newInstance();
                if (iBinder == null) {
                    eVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                    eVar = queryLocalInterface instanceof t7.e ? (t7.e) queryLocalInterface : new t7.e(iBinder, "com.google.android.gms.maps.internal.ICreator", 4);
                }
                b = eVar;
                try {
                    Context b11 = b(context);
                    b11.getClass();
                    i6.b bVar = new i6.b(b11.getResources());
                    Parcel M0 = eVar.M0();
                    d7.b.c(M0, bVar);
                    M0.writeInt(12451000);
                    eVar.Q0(M0, 6);
                    return b;
                } catch (RemoteException e9) {
                    throw new a7.c(e9);
                }
            } catch (IllegalAccessException unused) {
                throw new IllegalStateException("Unable to call the default constructor of ".concat(loadClass.getName()));
            } catch (InstantiationException unused2) {
                throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(loadClass.getName()));
            }
        } catch (ClassNotFoundException unused3) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
        }
    }

    public static Context b(Context context) {
        Context context2;
        Context context3 = a;
        if (context3 != null) {
            return context3;
        }
        context.getApplicationContext();
        try {
            context2 = j6.e.c(context, j6.e.b, "com.google.android.gms.maps_dynamite").a;
        } catch (Exception e9) {
            try {
                if ("com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                    Log.e("l7", "Failed to load maps module, use pre-Chimera", e9);
                    AtomicBoolean atomicBoolean = v5.g.a;
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        Log.d("l7", "Attempting to load maps_dynamite again.");
                        context2 = j6.e.c(context, j6.e.b, "com.google.android.gms.maps_dynamite").a;
                    } catch (Exception e10) {
                        Log.e("l7", "Failed to load maps module, use pre-Chimera", e10);
                        AtomicBoolean atomicBoolean2 = v5.g.a;
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
        }
        a = context2;
        return context2;
    }
}
