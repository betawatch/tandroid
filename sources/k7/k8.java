package k7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class k8 {
    public static Context a;
    public static w7.e b;

    public static w7.e a(Context context) {
        w7.e eVar;
        b6.m.h(context);
        Log.d("k8", "preferredRenderer: ".concat(BuildConfig.BETA_URL));
        w7.e eVar2 = b;
        if (eVar2 != null) {
            return eVar2;
        }
        AtomicBoolean atomicBoolean = y5.g.a;
        int b10 = y5.g.b(context, 13400000);
        if (b10 != 0) {
            throw new y5.f(b10);
        }
        Log.i("k8", "Making Creator dynamically");
        ClassLoader classLoader = b(context).getClassLoader();
        try {
            b6.m.h(classLoader);
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                try {
                    IBinder iBinder = (IBinder) loadClass.newInstance();
                    if (iBinder == null) {
                        eVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                        eVar = queryLocalInterface instanceof w7.e ? (w7.e) queryLocalInterface : new w7.e(iBinder, "com.google.android.gms.maps.internal.ICreator", 5);
                    }
                    b = eVar;
                    try {
                        Context b11 = b(context);
                        b11.getClass();
                        l6.b bVar = new l6.b(b11.getResources());
                        Parcel M0 = eVar.M0();
                        g7.b.c(M0, bVar);
                        M0.writeInt(12451000);
                        eVar.Q0(M0, 6);
                        return b;
                    } catch (RemoteException e6) {
                        throw new a7.b(e6);
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
            context2 = m6.e.c(context, m6.e.b, "com.google.android.gms.maps_dynamite").a;
        } catch (Exception e6) {
            try {
                if ("com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                    Log.e("k8", "Failed to load maps module, use pre-Chimera", e6);
                    AtomicBoolean atomicBoolean = y5.g.a;
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        Log.d("k8", "Attempting to load maps_dynamite again.");
                        context2 = m6.e.c(context, m6.e.b, "com.google.android.gms.maps_dynamite").a;
                    } catch (Exception e10) {
                        Log.e("k8", "Failed to load maps module, use pre-Chimera", e10);
                        AtomicBoolean atomicBoolean2 = y5.g.a;
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
