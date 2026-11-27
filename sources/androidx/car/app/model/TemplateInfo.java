package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class TemplateInfo {
    private final Class<? extends kkb> mTemplateClass;
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

    public Class<? extends kkb> getTemplateClass() {
        Class<? extends kkb> cls = this.mTemplateClass;
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

    public TemplateInfo(Class<? extends kkb> cls, String str) {
        this.mTemplateClass = cls;
        this.mTemplateId = str;
    }
}
