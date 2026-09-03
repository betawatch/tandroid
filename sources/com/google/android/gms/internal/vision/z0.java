package com.google.android.gms.internal.vision;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                    android.support.v4.media.a.v(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException(e);
                } catch (InvocationTargetException e6) {
                    throw new IllegalStateException(e6);
                }
            } catch (InstantiationException e10) {
                throw new IllegalStateException(e10);
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException(e11);
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
                    } catch (ServiceConfigurationError e12) {
                        Level level = Level.SEVERE;
                        String simpleName = u0.class.getSimpleName();
                        a.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e12);
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
                } catch (IllegalAccessException e13) {
                    throw new IllegalStateException(e13);
                } catch (NoSuchMethodException e14) {
                    throw new IllegalStateException(e14);
                } catch (InvocationTargetException e15) {
                    throw new IllegalStateException(e15);
                }
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }
}
