package nd;

import a8.jd;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m.w2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class a implements ld.c, d, Serializable {
    private final ld.c completion;

    public a(ld.c cVar) {
        this.completion = cVar;
    }

    public ld.c create(ld.c completion) {
        kotlin.jvm.internal.i.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        ld.c cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final ld.c getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i10;
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
            i10 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i10 = -1;
        }
        int i11 = i10 >= 0 ? eVar.l()[i10] : -1;
        w2 w2Var = f.b;
        w2 w2Var2 = f.a;
        if (w2Var == null) {
            try {
                w2 w2Var3 = new w2(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.b = w2Var3;
                w2Var = w2Var3;
            } catch (Exception unused2) {
                f.b = w2Var2;
                w2Var = w2Var2;
            }
        }
        if (w2Var != w2Var2 && (method = w2Var.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = w2Var.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = w2Var.c;
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
        return new StackTraceElement(str, eVar.m(), eVar.f(), i11);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // ld.c
    public final void resumeWith(Object obj) {
        ld.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            ld.c cVar2 = aVar.completion;
            kotlin.jvm.internal.i.b(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == md.a.a) {
                    return;
                }
            } catch (Throwable th2) {
                obj = jd.a(th2);
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

    public ld.c create(Object obj, ld.c completion) {
        kotlin.jvm.internal.i.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
