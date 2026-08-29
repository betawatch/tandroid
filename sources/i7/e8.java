package i7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class e8 {
    public static Context a;
    public static u7.e b;

    public static u7.e a(Context context) {
        u7.e eVar;
        z5.l.h(context);
        Log.d("e8", "preferredRenderer: ".concat(BuildConfig.BETA_URL));
        u7.e eVar2 = b;
        if (eVar2 != null) {
            return eVar2;
        }
        int i10 = w5.g.e;
        int b10 = w5.g.b(context, 13400000);
        if (b10 != 0) {
            throw new w5.f(b10);
        }
        Log.i("e8", "Making Creator dynamically");
        ClassLoader classLoader = b(context).getClassLoader();
        try {
            z5.l.h(classLoader);
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                try {
                    IBinder iBinder = (IBinder) loadClass.newInstance();
                    if (iBinder == null) {
                        eVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                        eVar = queryLocalInterface instanceof u7.e ? (u7.e) queryLocalInterface : new u7.e(iBinder, "com.google.android.gms.maps.internal.ICreator", 4);
                    }
                    b = eVar;
                    try {
                        Context b11 = b(context);
                        b11.getClass();
                        j6.b bVar = new j6.b(b11.getResources());
                        Parcel M0 = eVar.M0();
                        e7.b.c(M0, bVar);
                        M0.writeInt(12451000);
                        eVar.Q0(M0, 6);
                        return b;
                    } catch (RemoteException e10) {
                        throw new a6.b(e10);
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
            context2 = k6.e.c(context, k6.e.b, "com.google.android.gms.maps_dynamite").a;
        } catch (Exception e10) {
            try {
                if ("com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                    Log.e("e8", "Failed to load maps module, use pre-Chimera", e10);
                    int i10 = w5.g.e;
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        Log.d("e8", "Attempting to load maps_dynamite again.");
                        context2 = k6.e.c(context, k6.e.b, "com.google.android.gms.maps_dynamite").a;
                    } catch (Exception e11) {
                        Log.e("e8", "Failed to load maps module, use pre-Chimera", e11);
                        int i11 = w5.g.e;
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
