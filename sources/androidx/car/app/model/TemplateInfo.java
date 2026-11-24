package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class TemplateInfo {
    private final Class<? extends pib> mTemplateClass;
    private final String mTemplateId;

    private TemplateInfo() {
        this.mTemplateClass = null;
        this.mTemplateId = null;
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

    public Class<? extends pib> getTemplateClass() {
        Class<? extends pib> cls = this.mTemplateClass;
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

    public TemplateInfo(Class<? extends pib> cls, String str) {
        this.mTemplateClass = cls;
        this.mTemplateId = str;
    }
}
