// default package

import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class nue {
    public static int a(String str) {
        try {
            Map map = ResourceProvider.a;
            Integer num = (Integer) ResourceProvider.class.getMethod("findResourceByName", String.class).invoke(null, str);
            if (num != null) {
                return num.intValue();
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return 0;
    }
}
