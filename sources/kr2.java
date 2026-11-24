// default package

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class kr2 implements nv8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kr2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // nv8
    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new zr5("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new zr5(kt6.o("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new zr5(kt6.o("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new zr5(b10.h("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new zr5(b10.h("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new am5((li4) obj);
        }
    }
}
