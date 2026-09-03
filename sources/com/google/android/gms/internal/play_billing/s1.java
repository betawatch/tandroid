package com.google.android.gms.internal.play_billing;

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
public abstract class s1 {
    public static o1 d() {
        String str;
        ClassLoader classLoader = s1.class.getClassLoader();
        if (o1.class.equals(o1.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!o1.class.getPackage().equals(s1.class.getPackage())) {
                throw new IllegalArgumentException(o1.class.getName());
            }
            str = o1.class.getPackage().getName() + ".BlazeGenerated" + o1.class.getSimpleName() + "Loader";
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
                Iterator it = Arrays.asList(new s1[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e12) {
                        Logger.getLogger(m1.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(o1.class.getSimpleName()), (Throwable) e12);
                    }
                }
                if (arrayList.size() == 1) {
                    return (o1) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (o1) o1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
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

    public void b() {
    }

    public void c(androidx.biometric.u uVar) {
    }

    public void a(int i10, CharSequence charSequence) {
    }
}
