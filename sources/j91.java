// default package

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class j91 implements yu5, Serializable {
    public static final Object NO_RECEIVER = i91.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient yu5 reflected;
    private final String signature;

    public j91(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // yu5
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // yu5
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public yu5 compute() {
        yu5 yu5Var = this.reflected;
        if (yu5Var != null) {
            return yu5Var;
        }
        yu5 computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public yu5 computeReflected() {
        f59.a.getClass();
        return this;
    }

    @Override // xu5
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public zu5 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return f59.a(cls);
        }
        f59.a.getClass();
        return new jr7(cls);
    }

    @Override // yu5
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract yu5 getReflected();

    @Override // yu5
    public dv5 getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // yu5
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // yu5
    public ev5 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // yu5
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // yu5
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // yu5
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
