package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r0 extends q0 {
    public static r0 e;
    public final Application d;

    public r0(Application application) {
        this.d = application;
    }

    public final p0 a(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return super.e(cls);
        }
        try {
            p0 p0Var = (p0) cls.getConstructor(Application.class).newInstance(application);
            kotlin.jvm.internal.j.d(p0Var, "{\n                try {\n…          }\n            }");
            return p0Var;
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }

    @Override // androidx.lifecycle.q0, androidx.lifecycle.s0
    public final p0 e(Class cls) {
        Application application = this.d;
        if (application != null) {
            return a(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.q0, androidx.lifecycle.s0
    public final p0 r(Class cls, v1.b bVar) {
        if (this.d != null) {
            return e(cls);
        }
        Application application = (Application) ((LinkedHashMap) bVar.a).get(q0.a);
        if (application != null) {
            return a(cls, application);
        }
        if (a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.e(cls);
    }
}
