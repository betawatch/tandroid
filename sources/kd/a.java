package kd;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class a implements id.c, d, Serializable {
    private final id.c completion;

    public a(id.c cVar) {
        this.completion = cVar;
    }

    public id.c create(id.c completion) {
        kotlin.jvm.internal.j.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        id.c cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final id.c getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i7;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v = eVar.v();
        if (v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i7 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i7 = -1;
        }
        int i10 = i7 >= 0 ? eVar.l()[i7] : -1;
        f fVar = g.b;
        f fVar2 = g.a;
        if (fVar == null) {
            try {
                f fVar3 = new f(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                g.b = fVar3;
                fVar = fVar3;
            } catch (Exception unused2) {
                g.b = fVar2;
                fVar = fVar2;
            }
        }
        if (fVar != fVar2 && (method = fVar.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = fVar.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = fVar.c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i10);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // id.c
    public final void resumeWith(Object obj) {
        id.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            id.c cVar2 = aVar.completion;
            kotlin.jvm.internal.j.b(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == jd.a.a) {
                    return;
                }
            } catch (Throwable th2) {
                obj = af.b.b(th2);
            }
            aVar.releaseIntercepted();
            if (!(cVar2 instanceof a)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public id.c create(Object obj, id.c completion) {
        kotlin.jvm.internal.j.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
