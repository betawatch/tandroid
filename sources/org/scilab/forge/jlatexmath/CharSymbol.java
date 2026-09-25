package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
