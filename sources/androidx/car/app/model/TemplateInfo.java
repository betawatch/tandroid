package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class TemplateInfo {
    private final Class<? extends x0> mTemplateClass;
    private final String mTemplateId;

    public TemplateInfo(Class<? extends x0> cls, String str) {
        this.mTemplateClass = cls;
        this.mTemplateId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateInfo)) {
            return false;
        }
        TemplateInfo templateInfo = (TemplateInfo) obj;
        return Objects.equals(this.mTemplateClass, templateInfo.mTemplateClass) && Objects.equals(this.mTemplateId, templateInfo.mTemplateId);
    }

    public Class<? extends x0> getTemplateClass() {
        Class<? extends x0> cls = this.mTemplateClass;
        Objects.requireNonNull(cls);
        return cls;
    }

    public String getTemplateId() {
        String str = this.mTemplateId;
        Objects.requireNonNull(str);
        return str;
    }

    public int hashCode() {
        return Objects.hash(this.mTemplateClass, this.mTemplateId);
    }

    private TemplateInfo() {
        this.mTemplateClass = null;
        this.mTemplateId = null;
    }
}
