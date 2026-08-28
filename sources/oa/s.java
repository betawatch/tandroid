package oa;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s {
    public final String a;
    public final Field b;
    public final String c;
    public final /* synthetic */ Method d;
    public final /* synthetic */ la.u e;
    public final /* synthetic */ la.u f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    public s(String str, Field field, Method method, la.u uVar, la.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.e = uVar;
        this.f = uVar2;
        this.g = z10;
        this.h = z11;
        this.a = str;
        this.b = field;
        this.c = field.getName();
    }

    public final void a(ta.c cVar, Object obj) {
        Object obj2;
        Method method = this.d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e10) {
                throw new la.j(aa.d.o("Accessor ", qa.c.d(method, false), " threw exception"), e10.getCause());
            }
        } else {
            obj2 = this.b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        cVar.g(this.a);
        this.e.write(cVar, obj2);
    }
}
