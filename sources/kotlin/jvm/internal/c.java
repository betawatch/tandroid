package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class c implements vd.b, Serializable {
    public static final Object NO_RECEIVER = b.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient vd.b reflected;
    private final String signature;

    public c(Object obj, Class cls, String str, String str2, boolean z9) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z9;
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
            return s.a(cls);
        }
        s.a.getClass();
        return new l(cls);
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
