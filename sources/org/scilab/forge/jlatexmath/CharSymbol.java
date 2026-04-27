package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
public abstract class CharSymbol extends Atom {
    private boolean textSymbol = false;

    public abstract CharFont getCharFont(TeXFont teXFont);

    public void markAsTextSymbol() {
        this.textSymbol = true;
    }

    public void removeMark() {
        this.textSymbol = false;
    }

    public boolean isMarkedAsTextSymbol() {
        return this.textSymbol;
    }
}
