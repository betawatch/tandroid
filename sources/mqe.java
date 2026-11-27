// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class mqe {
    public static nhc a(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            newInstance.getClass();
            return (nhc) newInstance;
        } catch (IllegalAccessException e) {
            vr9.k("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            vr9.k("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            vr9.k("Cannot create an instance of ", cls, e3);
            return null;
        }
    }
}
