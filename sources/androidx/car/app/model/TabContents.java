package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public class TabContents {
    public static final String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";
    private final x0 mTemplate;

    public TabContents(u0 u0Var) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TabContents) {
            return Objects.equals(this.mTemplate, ((TabContents) obj).mTemplate);
        }
        return false;
    }

    public String getContentId() {
        return CONTENT_ID;
    }

    public x0 getTemplate() {
        x0 x0Var = this.mTemplate;
        Objects.requireNonNull(x0Var);
        return x0Var;
    }

    public int hashCode() {
        return Objects.hash(this.mTemplate);
    }

    public String toString() {
        return "[template: " + this.mTemplate + "]";
    }

    private TabContents() {
        this.mTemplate = null;
    }
}
