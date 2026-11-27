package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class TabContents {
    public static final String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";
    private final kkb mTemplate;

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

    public kkb getTemplate() {
        kkb kkbVar = this.mTemplate;
        Objects.requireNonNull(kkbVar);
        return kkbVar;
    }

    public int hashCode() {
        return Objects.hash(this.mTemplate);
    }

    public String toString() {
        return "[template: " + this.mTemplate + "]";
    }

    public TabContents(whb whbVar) {
        throw null;
    }
}
