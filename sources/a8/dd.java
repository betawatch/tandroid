package a8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class dd {
    public static Context a;
    public static j8.e b;

    public static j8.e a(Context context) {
        j8.e eVar;
        o6.l.h(context);
        Log.d("dd", "preferredRenderer: ".concat(BuildConfig.BETA_URL));
        j8.e eVar2 = b;
        if (eVar2 != null) {
            return eVar2;
        }
        int i10 = l6.g.e;
        int b10 = l6.g.b(context, 13400000);
        if (b10 != 0) {
            throw new l6.f(b10);
        }
        Log.i("dd", "Making Creator dynamically");
        ClassLoader classLoader = b(context).getClassLoader();
        try {
            o6.l.h(classLoader);
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                IBinder iBinder = (IBinder) loadClass.newInstance();
                if (iBinder == null) {
                    eVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                    eVar = queryLocalInterface instanceof j8.e ? (j8.e) queryLocalInterface : new j8.e(iBinder, "com.google.android.gms.maps.internal.ICreator", 10);
                }
                b = eVar;
                try {
                    Context b11 = b(context);
                    b11.getClass();
                    y6.b bVar = new y6.b(b11.getResources());
                    Parcel N0 = eVar.N0();
                    t7.b.c(N0, bVar);
                    N0.writeInt(12451000);
                    eVar.R0(N0, 6);
                    return b;
                } catch (RemoteException e) {
                    throw new androidx.car.app.j(e);
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
            context2 = z6.e.c(context, z6.e.b, "com.google.android.gms.maps_dynamite").a;
        } catch (Exception e) {
            try {
                if ("com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                    Log.e("dd", "Failed to load maps module, use pre-Chimera", e);
                    int i10 = l6.g.e;
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        Log.d("dd", "Attempting to load maps_dynamite again.");
                        context2 = z6.e.c(context, z6.e.b, "com.google.android.gms.maps_dynamite").a;
                    } catch (Exception e10) {
                        Log.e("dd", "Failed to load maps module, use pre-Chimera", e10);
                        int i11 = l6.g.e;
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
