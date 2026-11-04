package b8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class nd {
    public static Context a;
    public static k8.d b;

    public static k8.d a(Context context) {
        k8.d dVar;
        p6.m.g(context);
        Log.d("nd", "preferredRenderer: ".concat("null"));
        k8.d dVar2 = b;
        if (dVar2 != null) {
            return dVar2;
        }
        int i3 = m6.g.e;
        int b10 = m6.g.b(context, 13400000);
        if (b10 != 0) {
            throw new m6.f(b10);
        }
        Log.i("nd", "Making Creator dynamically");
        ClassLoader classLoader = b(context).getClassLoader();
        try {
            p6.m.g(classLoader);
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                try {
                    IBinder iBinder = (IBinder) loadClass.newInstance();
                    if (iBinder == null) {
                        dVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                        dVar = queryLocalInterface instanceof k8.d ? (k8.d) queryLocalInterface : new k8.d(iBinder, "com.google.android.gms.maps.internal.ICreator", 10);
                    }
                    b = dVar;
                    try {
                        Context b11 = b(context);
                        b11.getClass();
                        z6.b bVar = new z6.b(b11.getResources());
                        Parcel P0 = dVar.P0();
                        u7.b.c(P0, bVar);
                        P0.writeInt(12451000);
                        dVar.T0(P0, 6);
                        return b;
                    } catch (RemoteException e10) {
                        throw new androidx.car.app.j(e10);
                    }
                } catch (InstantiationException unused) {
                    throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(loadClass.getName()));
                }
            } catch (IllegalAccessException unused2) {
                throw new IllegalStateException("Unable to call the default constructor of ".concat(loadClass.getName()));
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
            context2 = a7.f.c(context, a7.f.b, "com.google.android.gms.maps_dynamite").a;
        } catch (Exception e10) {
            try {
                if ("com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                    Log.e("nd", "Failed to load maps module, use pre-Chimera", e10);
                    int i3 = m6.g.e;
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        Log.d("nd", "Attempting to load maps_dynamite again.");
                        context2 = a7.f.c(context, a7.f.b, "com.google.android.gms.maps_dynamite").a;
                    } catch (Exception e11) {
                        Log.e("nd", "Failed to load maps module, use pre-Chimera", e11);
                        int i10 = m6.g.e;
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
