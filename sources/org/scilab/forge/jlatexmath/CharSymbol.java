package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
