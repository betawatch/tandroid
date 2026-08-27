package com.google.android.gms.internal.play_billing;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class r1 {
    public static boolean a(int i10) {
        return (i10 & 32768) != 0;
    }

    public static boolean b(int i10) {
        if (i10 == 15 || i10 == 255) {
            return true;
        }
        if (i10 == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i10 != 32783) {
            return i10 == 33023 || i10 == 0;
        }
        int i11 = Build.VERSION.SDK_INT;
        return i11 < 28 || i11 > 29;
    }

    public static n1 c() {
        String str;
        ClassLoader classLoader = r1.class.getClassLoader();
        if (n1.class.equals(n1.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!n1.class.getPackage().equals(r1.class.getPackage())) {
                throw new IllegalArgumentException(n1.class.getName());
            }
            str = n1.class.getPackage().getName() + ".BlazeGenerated" + n1.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    a9.p.t(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e9) {
                    throw new IllegalStateException(e9);
                } catch (InvocationTargetException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (InstantiationException e11) {
                throw new IllegalStateException(e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException(e12);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new r1[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e13) {
                        Logger.getLogger(l1.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(n1.class.getSimpleName()), (Throwable) e13);
                    }
                }
                if (arrayList.size() == 1) {
                    return (n1) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (n1) n1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(e14);
                } catch (NoSuchMethodException e15) {
                    throw new IllegalStateException(e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(e16);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }
}
