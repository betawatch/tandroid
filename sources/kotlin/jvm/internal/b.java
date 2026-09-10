package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class b implements vd.b, Serializable {
    public static final Object NO_RECEIVER = a.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient vd.b reflected;
    private final String signature;

    public b(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // vd.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // vd.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public vd.b compute() {
        vd.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        vd.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract vd.b computeReflected();

    @Override // vd.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public vd.d getOwner() {
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

    @Override // vd.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract vd.b getReflected();

    @Override // vd.b
    public vd.h getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // vd.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // vd.b
    public vd.i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // vd.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // vd.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // vd.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
