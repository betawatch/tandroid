package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
