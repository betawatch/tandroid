package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class b implements pd.b, Serializable {
    public static final Object NO_RECEIVER = a.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient pd.b reflected;
    private final String signature;

    public b(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // pd.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // pd.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public pd.b compute() {
        pd.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        pd.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract pd.b computeReflected();

    @Override // pd.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public pd.d getOwner() {
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

    @Override // pd.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract pd.b getReflected();

    @Override // pd.b
    public pd.h getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // pd.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // pd.b
    public pd.i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // pd.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // pd.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // pd.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
