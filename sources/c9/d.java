package c9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ba.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ba.b
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
                } catch (IllegalAccessException e) {
                    throw new p(android.support.v4.media.a.o("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e6) {
                    throw new p(android.support.v4.media.a.o("Could not instantiate ", str, "."), e6);
                } catch (NoSuchMethodException e10) {
                    throw new p(w2.e("Could not instantiate ", str), e10);
                } catch (InvocationTargetException e11) {
                    throw new p(w2.e("Could not instantiate ", str), e11);
                }
            case 1:
                return (ComponentRegistrar) this.b;
            default:
                return new da.c((w8.g) this.b);
        }
    }
}
