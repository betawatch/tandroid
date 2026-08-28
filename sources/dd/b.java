package dd;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public interface b extends a {
    Object call(Object... objArr);

    Object callBy(Map map);

    List getParameters();

    h getReturnType();

    List getTypeParameters();

    i getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();
}
