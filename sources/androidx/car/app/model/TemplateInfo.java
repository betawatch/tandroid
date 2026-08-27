package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
