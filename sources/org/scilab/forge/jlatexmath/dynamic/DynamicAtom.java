package org.scilab.forge.jlatexmath.dynamic;

import org.scilab.forge.jlatexmath.Atom;
import org.scilab.forge.jlatexmath.Box;
import org.scilab.forge.jlatexmath.EmptyAtom;
import org.scilab.forge.jlatexmath.StrutBox;
import org.scilab.forge.jlatexmath.TeXEnvironment;
import org.scilab.forge.jlatexmath.TeXFormula;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public class DynamicAtom extends Atom {
    private static ExternalConverterFactory ecFactory;
    private ExternalConverter converter;
    private String externalCode;
    private TeXFormula formula = new TeXFormula();
    private boolean insert;
    private boolean refreshed;

    public DynamicAtom(String str, String str2) {
        this.externalCode = str;
        ExternalConverterFactory externalConverterFactory = ecFactory;
        if (externalConverterFactory != null) {
            this.converter = externalConverterFactory.getExternalConverter();
        }
        if (str2 == null || !str2.equals("i")) {
            return;
        }
        this.insert = true;
    }

    public static boolean hasAnExternalConverterFactory() {
        return ecFactory != null;
    }

    public static void setExternalConverterFactory(ExternalConverterFactory externalConverterFactory) {
        ecFactory = externalConverterFactory;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        ExternalConverter externalConverter = this.converter;
        if (externalConverter != null) {
            if (this.refreshed) {
                this.refreshed = false;
            } else {
                this.formula.setLaTeX(externalConverter.getLaTeXString(this.externalCode));
            }
            Atom atom = this.formula.root;
            if (atom != null) {
                return atom.createBox(teXEnvironment);
            }
        }
        return new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Atom getAtom() {
        if (!this.refreshed) {
            this.formula.setLaTeX(this.converter.getLaTeXString(this.externalCode));
            this.refreshed = true;
        }
        Atom atom = this.formula.root;
        return atom == null ? new EmptyAtom() : atom;
    }

    public boolean getInsertMode() {
        return this.insert;
    }
}
