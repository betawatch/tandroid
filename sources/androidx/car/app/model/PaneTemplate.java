package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class PaneTemplate implements kkb {
    private final ActionStrip mActionStrip;
    private final Action mHeaderAction;
    private final Pane mPane;
    private final CarText mTitle;

    private PaneTemplate() {
        this.mTitle = null;
        this.mPane = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaneTemplate)) {
            return false;
        }
        PaneTemplate paneTemplate = (PaneTemplate) obj;
        return Objects.equals(this.mTitle, paneTemplate.mTitle) && Objects.equals(this.mPane, paneTemplate.mPane) && Objects.equals(this.mHeaderAction, paneTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, paneTemplate.mActionStrip);
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public Pane getPane() {
        Pane pane = this.mPane;
        Objects.requireNonNull(pane);
        return pane;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mPane, this.mHeaderAction, this.mActionStrip);
    }

    public String toString() {
        return "PaneTemplate";
    }

    public PaneTemplate(zx7 zx7Var) {
        throw null;
    }
}
