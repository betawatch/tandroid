// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
