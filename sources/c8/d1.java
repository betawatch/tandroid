package c8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class d1 {
    public static Context a;
    public static l8.d b;

    public static l8.d a(Context context) {
        l8.d dVar;
        q6.m.g(context);
        Log.d("d1", "preferredRenderer: ".concat("null"));
        l8.d dVar2 = b;
        if (dVar2 != null) {
            return dVar2;
        }
        AtomicBoolean atomicBoolean = n6.g.a;
        int b10 = n6.g.b(context, 13400000);
        if (b10 != 0) {
            throw new n6.f(b10);
        }
        Log.i("d1", "Making Creator dynamically");
        ClassLoader classLoader = b(context).getClassLoader();
        try {
            q6.m.g(classLoader);
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                try {
                    IBinder iBinder = (IBinder) loadClass.newInstance();
                    if (iBinder == null) {
                        dVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                        dVar = queryLocalInterface instanceof l8.d ? (l8.d) queryLocalInterface : new l8.d(iBinder, "com.google.android.gms.maps.internal.ICreator", 11);
                    }
                    b = dVar;
                    try {
                        Context b11 = b(context);
                        b11.getClass();
                        a7.b bVar = new a7.b(b11.getResources());
                        Parcel p12 = dVar.p1();
                        v7.b.c(p12, bVar);
                        p12.writeInt(12451000);
                        dVar.t1(p12, 6);
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
            context2 = b7.f.c(context, b7.f.b, "com.google.android.gms.maps_dynamite").a;
        } catch (Exception e10) {
            try {
                if ("com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                    Log.e("d1", "Failed to load maps module, use pre-Chimera", e10);
                    AtomicBoolean atomicBoolean = n6.g.a;
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        Log.d("d1", "Attempting to load maps_dynamite again.");
                        context2 = b7.f.c(context, b7.f.b, "com.google.android.gms.maps_dynamite").a;
                    } catch (Exception e11) {
                        Log.e("d1", "Failed to load maps module, use pre-Chimera", e11);
                        AtomicBoolean atomicBoolean2 = n6.g.a;
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
