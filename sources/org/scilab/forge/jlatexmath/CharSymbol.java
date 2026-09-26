package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class CharSymbol extends Atom {
    private boolean textSymbol = false;

    public abstract CharFont getCharFont(TeXFont teXFont);

    public boolean isMarkedAsTextSymbol() {
        return this.textSymbol;
    }

    public void markAsTextSymbol() {
        this.textSymbol = true;
    }

    public void removeMark() {
        this.textSymbol = false;
    }
}
