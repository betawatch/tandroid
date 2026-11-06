package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class r0 extends q0 {
    public static r0 e;
    public final Application d;

    public r0(Application application) {
        this.d = application;
    }

    public final p0 a(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return super.i(cls);
        }
        try {
            p0 p0Var = (p0) cls.getConstructor(Application.class).newInstance(application);
            kotlin.jvm.internal.j.d(p0Var, "{\n                try {\n…          }\n            }");
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
    public final p0 i(Class cls) {
        Application application = this.d;
        if (application != null) {
            return a(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.q0, androidx.lifecycle.s0
    public final p0 t(Class cls, y1.b bVar) {
        if (this.d != null) {
            return i(cls);
        }
        Application application = (Application) ((LinkedHashMap) bVar.a).get(q0.a);
        if (application != null) {
            return a(cls, application);
        }
        if (a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.i(cls);
    }
}
