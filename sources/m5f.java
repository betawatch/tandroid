// default package

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class m5f {
    public static Context a;
    public static yxd b;

    public static yxd a(Context context) {
        yxd yxdVar;
        xve.h(context);
        Log.d("m5f", "preferredRenderer: null");
        yxd yxdVar2 = b;
        if (yxdVar2 != null) {
            return yxdVar2;
        }
        int i = c15.e;
        int c = c15.c(context, 13400000);
        if (c != 0) {
            throw new b15(c);
        }
        Log.i("m5f", "Making Creator dynamically");
        ClassLoader classLoader = b(context).getClassLoader();
        try {
            xve.h(classLoader);
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                try {
                    IBinder iBinder = (IBinder) loadClass.newInstance();
                    if (iBinder == null) {
                        yxdVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                        yxdVar = queryLocalInterface instanceof yxd ? (yxd) queryLocalInterface : new yxd(iBinder, "com.google.android.gms.maps.internal.ICreator", (byte) 6);
                    }
                    b = yxdVar;
                    try {
                        Context b2 = b(context);
                        b2.getClass();
                        br7 br7Var = new br7(b2.getResources());
                        Parcel R = yxdVar.R();
                        jld.c(R, br7Var);
                        R.writeInt(12451000);
                        yxdVar.V(R, 6);
                        return b;
                    } catch (RemoteException e) {
                        p3d.i(e);
                        return null;
                    }
                } catch (InstantiationException unused) {
                    throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(loadClass.getName()));
                }
            } catch (IllegalAccessException unused2) {
                throw new IllegalStateException("Unable to call the default constructor of ".concat(loadClass.getName()));
            }
        } catch (ClassNotFoundException unused3) {
            grb.i("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
            return null;
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
            context2 = vs3.c(context, vs3.b, "com.google.android.gms.maps_dynamite").a;
        } catch (Exception e) {
            try {
                if ("com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                    Log.e("m5f", "Failed to load maps module, use pre-Chimera", e);
                    int i = c15.e;
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        Log.d("m5f", "Attempting to load maps_dynamite again.");
                        context2 = vs3.c(context, vs3.b, "com.google.android.gms.maps_dynamite").a;
                    } catch (Exception e2) {
                        Log.e("m5f", "Failed to load maps module, use pre-Chimera", e2);
                        int i2 = c15.e;
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
