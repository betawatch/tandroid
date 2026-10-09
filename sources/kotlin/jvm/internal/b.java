package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class b implements wd.b, Serializable {
    public static final Object NO_RECEIVER = a.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient wd.b reflected;
    private final String signature;

    public b(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // wd.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // wd.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public wd.b compute() {
        wd.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        wd.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract wd.b computeReflected();

    @Override // wd.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public wd.d getOwner() {
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

    @Override // wd.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract wd.b getReflected();

    @Override // wd.b
    public wd.h getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // wd.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // wd.b
    public wd.i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // wd.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // wd.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // wd.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
