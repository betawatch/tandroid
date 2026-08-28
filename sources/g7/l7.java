package g7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class l7 {
    public static Context a;
    public static s7.e b;

    public static s7.e a(Context context) {
        s7.e eVar;
        x5.l.h(context);
        Log.d("l7", "preferredRenderer: ".concat(BuildConfig.BETA_URL));
        s7.e eVar2 = b;
        if (eVar2 != null) {
            return eVar2;
        }
        AtomicBoolean atomicBoolean = u5.g.a;
        int b10 = u5.g.b(context, 13400000);
        if (b10 != 0) {
            throw new u5.f(b10);
        }
        Log.i("l7", "Making Creator dynamically");
        ClassLoader classLoader = b(context).getClassLoader();
        try {
            x5.l.h(classLoader);
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                IBinder iBinder = (IBinder) loadClass.newInstance();
                if (iBinder == null) {
                    eVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                    eVar = queryLocalInterface instanceof s7.e ? (s7.e) queryLocalInterface : new s7.e(iBinder, "com.google.android.gms.maps.internal.ICreator", 1);
                }
                b = eVar;
                try {
                    Context b11 = b(context);
                    b11.getClass();
                    h6.b bVar = new h6.b(b11.getResources());
                    Parcel M0 = eVar.M0();
                    c7.b.c(M0, bVar);
                    M0.writeInt(12451000);
                    eVar.Q0(M0, 6);
                    return b;
                } catch (RemoteException e10) {
                    throw new androidx.car.app.j(e10);
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
            context2 = i6.e.c(context, i6.e.b, "com.google.android.gms.maps_dynamite").a;
        } catch (Exception e10) {
            try {
                if ("com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                    Log.e("l7", "Failed to load maps module, use pre-Chimera", e10);
                    AtomicBoolean atomicBoolean = u5.g.a;
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        Log.d("l7", "Attempting to load maps_dynamite again.");
                        context2 = i6.e.c(context, i6.e.b, "com.google.android.gms.maps_dynamite").a;
                    } catch (Exception e11) {
                        Log.e("l7", "Failed to load maps module, use pre-Chimera", e11);
                        AtomicBoolean atomicBoolean2 = u5.g.a;
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
