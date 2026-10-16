package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class b implements xd.b, Serializable {
    public static final Object NO_RECEIVER = a.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient xd.b reflected;
    private final String signature;

    public b(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // xd.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // xd.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public xd.b compute() {
        xd.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        xd.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract xd.b computeReflected();

    @Override // xd.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public xd.d getOwner() {
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

    @Override // xd.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract xd.b getReflected();

    @Override // xd.b
    public xd.h getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // xd.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // xd.b
    public xd.i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // xd.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // xd.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // xd.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
