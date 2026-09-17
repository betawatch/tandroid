package gb;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class s {
    public final String a;
    public final Field b;
    public final String c;
    public final /* synthetic */ Method d;
    public final /* synthetic */ db.u e;
    public final /* synthetic */ db.u f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    public s(String str, Field field, Method method, db.u uVar, db.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.e = uVar;
        this.f = uVar2;
        this.g = z10;
        this.h = z11;
        this.a = str;
        this.b = field;
        this.c = field.getName();
    }

    public final void a(lb.b bVar, Object obj) {
        Object obj2;
        Method method = this.d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e7) {
                throw new db.j(a4.a.p("Accessor ", ib.c.d(method, false), " threw exception"), e7.getCause());
            }
        } else {
            obj2 = this.b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.a);
        this.e.write(bVar, obj2);
    }
}
