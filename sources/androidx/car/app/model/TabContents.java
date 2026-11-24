package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class TabContents {
    public static final String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";
    private final ogb mTemplate;

    private TabContents() {
        this.mTemplate = null;
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

    public ogb getTemplate() {
        ogb ogbVar = this.mTemplate;
        Objects.requireNonNull(ogbVar);
        return ogbVar;
    }

    public int hashCode() {
        return Objects.hash(this.mTemplate);
    }

    public String toString() {
        return "[template: " + this.mTemplate + "]";
    }

    public TabContents(beb bebVar) {
        throw null;
    }
}
