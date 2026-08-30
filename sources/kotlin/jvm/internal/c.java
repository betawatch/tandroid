package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class c implements hd.b, Serializable {
    public static final Object NO_RECEIVER = b.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient hd.b reflected;
    private final String signature;

    public c(Object obj, Class cls, String str, String str2, boolean z4) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z4;
    }

    @Override // hd.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // hd.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public hd.b compute() {
        hd.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        hd.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract hd.b computeReflected();

    @Override // hd.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public hd.d getOwner() {
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

    @Override // hd.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract hd.b getReflected();

    @Override // hd.b
    public hd.h getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // hd.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // hd.b
    public hd.i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // hd.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // hd.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // hd.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
