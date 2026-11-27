// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
