package a9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements z9.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // z9.b
    public final Object get() {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new p("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e10) {
                    throw new p(a4.w.n("Could not instantiate ", str, "."), e10);
                } catch (InstantiationException e11) {
                    throw new p(a4.w.n("Could not instantiate ", str, "."), e11);
                } catch (NoSuchMethodException e12) {
                    throw new p(u3.c.e("Could not instantiate ", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new p(u3.c.e("Could not instantiate ", str), e13);
                }
            case 1:
                return (ComponentRegistrar) this.b;
            default:
                return new ba.c((u8.g) this.b);
        }
    }
}
