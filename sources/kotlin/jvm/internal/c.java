package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class c implements fd.b, Serializable {
    public static final Object NO_RECEIVER = b.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient fd.b reflected;
    private final String signature;

    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // fd.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // fd.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public fd.b compute() {
        fd.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        fd.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract fd.b computeReflected();

    @Override // fd.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public fd.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return r.a(cls);
        }
        r.a.getClass();
        return new l(cls);
    }

    @Override // fd.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract fd.b getReflected();

    @Override // fd.b
    public fd.h getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // fd.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // fd.b
    public fd.i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // fd.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // fd.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // fd.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
