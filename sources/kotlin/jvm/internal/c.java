package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class c implements ed.b, Serializable {
    public static final Object NO_RECEIVER = b.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient ed.b reflected;
    private final String signature;

    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // ed.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // ed.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public ed.b compute() {
        ed.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        ed.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract ed.b computeReflected();

    @Override // ed.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public ed.d getOwner() {
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

    @Override // ed.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract ed.b getReflected();

    @Override // ed.b
    public ed.h getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // ed.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // ed.b
    public ed.i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // ed.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // ed.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // ed.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
