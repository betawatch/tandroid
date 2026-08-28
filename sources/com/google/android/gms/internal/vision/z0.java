package com.google.android.gms.internal.vision;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class z0 {
    public static final Logger a = Logger.getLogger(r0.class.getName());
    public static final String b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static u0 a() {
        String str;
        ClassLoader classLoader = z0.class.getClassLoader();
        if (u0.class.equals(u0.class)) {
            str = b;
        } else {
            if (!u0.class.getPackage().equals(z0.class.getPackage())) {
                throw new IllegalArgumentException(u0.class.getName());
            }
            str = u0.class.getPackage().getName() + ".BlazeGenerated" + u0.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    aa.d.v(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e10) {
                    throw new IllegalStateException(e10);
                } catch (InvocationTargetException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (InstantiationException e12) {
                throw new IllegalStateException(e12);
            } catch (NoSuchMethodException e13) {
                throw new IllegalStateException(e13);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new z0[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e14) {
                        Level level = Level.SEVERE;
                        String simpleName = u0.class.getSimpleName();
                        a.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e14);
                    }
                }
                if (arrayList.size() == 1) {
                    return (u0) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (u0) u0.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(e15);
                } catch (NoSuchMethodException e16) {
                    throw new IllegalStateException(e16);
                } catch (InvocationTargetException e17) {
                    throw new IllegalStateException(e17);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }
}
