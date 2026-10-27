package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class b implements yd.b, Serializable {
    public static final Object NO_RECEIVER = a.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient yd.b reflected;
    private final String signature;

    public b(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // yd.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // yd.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public yd.b compute() {
        yd.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        yd.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract yd.b computeReflected();

    @Override // yd.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public yd.d getOwner() {
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

    @Override // yd.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract yd.b getReflected();

    @Override // yd.b
    public yd.h getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // yd.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // yd.b
    public yd.i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // yd.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // yd.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // yd.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
