package l2;

import a0.f;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class b {
    public final f a;
    public final f b;
    public final f c;

    public b(f fVar, f fVar2, f fVar3) {
        this.a = fVar;
        this.b = fVar2;
        this.c = fVar3;
    }

    public abstract c a();

    public final Class b(Class cls) {
        String name = cls.getName();
        f fVar = this.c;
        Class cls2 = (Class) fVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        fVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        f fVar = this.a;
        Method method = (Method) fVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
        fVar.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) {
        String name = cls.getName();
        f fVar = this.b;
        Method method = (Method) fVar.get(name);
        if (method != null) {
            return method;
        }
        Class b10 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b10.getDeclaredMethod("write", cls, b.class);
        fVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i9);

    public final int f(int i9, int i10) {
        return !e(i10) ? i9 : ((c) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i9) {
        if (!e(i9)) {
            return parcelable;
        }
        return ((c) this).e.readParcelable(c.class.getClassLoader());
    }

    public final d h() {
        String readString = ((c) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (d) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public abstract void i(int i9);

    public final void j(int i9, int i10) {
        i(i10);
        ((c) this).e.writeInt(i9);
    }

    public final void k(Parcelable parcelable, int i9) {
        i(i9);
        ((c) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(d dVar) {
        if (dVar == null) {
            ((c) this).e.writeString(null);
            return;
        }
        try {
            ((c) this).e.writeString(b(dVar.getClass()).getName());
            c a2 = a();
            try {
                d(dVar.getClass()).invoke(null, dVar, a2);
                Parcel parcel = a2.e;
                int i9 = a2.i;
                if (i9 >= 0) {
                    int i10 = a2.d.get(i9);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i10);
                    parcel.writeInt(dataPosition - i10);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (InvocationTargetException e13) {
                if (!(e13.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
                }
                throw ((RuntimeException) e13.getCause());
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(dVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e14);
        }
    }
}
