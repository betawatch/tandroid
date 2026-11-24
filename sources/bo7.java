// default package

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class bo7 extends dzc implements yi5 {
    public final Object b;

    public bo7(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", (byte) 6);
        this.b = obj;
    }

    public static yi5 T(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof yi5 ? (yi5) queryLocalInterface : new qbd(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", (byte) 4);
    }

    public static Object U(yi5 yi5Var) {
        if (yi5Var instanceof bo7) {
            return ((bo7) yi5Var).b;
        }
        IBinder asBinder = yi5Var.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            haf.c(String.valueOf(length).length() + 53, length, "Unexpected number of IObjectWrapper declared fields: ");
            return null;
        }
        fre.h(field);
        if (field.isAccessible()) {
            w26.j("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
