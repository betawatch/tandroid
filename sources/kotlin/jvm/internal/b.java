package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class b implements dd.b, Serializable {
    public static final Object NO_RECEIVER = a.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient dd.b reflected;
    private final String signature;

    public b(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // dd.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // dd.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public dd.b compute() {
        dd.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        dd.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract dd.b computeReflected();

    @Override // dd.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public dd.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return q.a(cls);
        }
        q.a.getClass();
        return new k(cls);
    }

    @Override // dd.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract dd.b getReflected();

    @Override // dd.b
    public dd.h getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // dd.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // dd.b
    public dd.i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // dd.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // dd.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // dd.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
