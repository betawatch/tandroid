package com.google.android.gms.internal.play_billing;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import f7.c9;
import f7.i7;
import f7.l6;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class s1 {
    public static LanguageIdentifierImpl a() {
        cb.a aVar = (cb.a) ya.g.c().a(cb.a.class);
        cb.e eVar = aVar.b;
        eVar.getClass();
        c9 c9Var = aVar.a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, c9Var, (Executor) aVar.c.a.get());
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(7, false);
        tVar.d = languageIdentifierImpl.f;
        a5.m mVar = new a5.m(16, false);
        mVar.c = LanguageIdentifierImpl.k();
        tVar.e = new i7(mVar);
        a6.a aVar2 = new a6.a(tVar, 1);
        Task task = c9Var.e;
        String a2 = task.isSuccessful() ? (String) task.getResult() : x5.i.c.a(c9Var.g);
        ya.m.a.execute(new af.f(c9Var, aVar2, l6.c, a2, false, 4));
        ((cb.e) languageIdentifierImpl.d.get()).b.incrementAndGet();
        return languageIdentifierImpl;
    }

    public static o1 b() {
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
                Iterator it = Arrays.asList(new s1[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e14) {
                        Logger.getLogger(m1.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(o1.class.getSimpleName()), (Throwable) e14);
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
