package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class c implements sd.b, Serializable {
    public static final Object NO_RECEIVER = b.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient sd.b reflected;
    private final String signature;

    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // sd.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // sd.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public sd.b compute() {
        sd.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        sd.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract sd.b computeReflected();

    @Override // sd.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public sd.d getOwner() {
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

    @Override // sd.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract sd.b getReflected();

    @Override // sd.b
    public sd.h getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // sd.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // sd.b
    public sd.i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // sd.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // sd.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // sd.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
