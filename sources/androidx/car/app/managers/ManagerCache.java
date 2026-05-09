package androidx.car.app.managers;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ManagerCache {
    private final Map mValues = new HashMap();
    private final Map mExceptions = new HashMap();
    private final Map mFactories = new HashMap();
    private final Map mClassByName = new HashMap();
    private final Map mNameByClass = new HashMap();

    public void addFactory(Class cls, String str, ManagerFactory managerFactory) {
        this.mFactories.put(cls, managerFactory);
        if (str != null) {
            this.mClassByName.put(str, cls);
            this.mNameByClass.put(cls, str);
        }
    }

    public Object getOrCreate(Class cls) {
        RuntimeException runtimeException = (RuntimeException) this.mExceptions.get(cls);
        if (runtimeException != null) {
            throw runtimeException;
        }
        Manager manager = (Manager) this.mValues.get(cls);
        if (manager != null) {
            return manager;
        }
        ManagerFactory managerFactory = (ManagerFactory) this.mFactories.get(cls);
        if (managerFactory == null) {
            throw new IllegalArgumentException("The class '" + cls + "' does not correspond to a car service");
        }
        try {
            Manager create = managerFactory.create();
            this.mValues.put(cls, create);
            return create;
        } catch (RuntimeException e) {
            this.mExceptions.put(cls, e);
            throw e;
        }
    }
}
