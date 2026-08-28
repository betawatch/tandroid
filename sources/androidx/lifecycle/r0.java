package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r0 extends q0 {
    public static r0 e;
    public final Application d;

    public r0(Application application) {
        this.d = application;
    }

    @Override // androidx.lifecycle.q0, androidx.lifecycle.s0
    public final p0 a(Class cls) {
        Application application = this.d;
        if (application != null) {
            return b(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public final p0 b(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            p0 p0Var = (p0) cls.getConstructor(Application.class).newInstance(application);
            kotlin.jvm.internal.i.d(p0Var, "{\n                try {\n…          }\n            }");
            return p0Var;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Cannot create an instance of " + cls, e13);
        }
    }

    @Override // androidx.lifecycle.q0, androidx.lifecycle.s0
    public final p0 o(Class cls, v1.b bVar) {
        if (this.d != null) {
            return a(cls);
        }
        Application application = (Application) ((LinkedHashMap) bVar.a).get(q0.a);
        if (application != null) {
            return b(cls, application);
        }
        if (a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.a(cls);
    }
}
