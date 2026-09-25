package org.scilab.forge.jlatexmath;

import a4.a;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public class FormulaNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 7660105446051204466L;

    public FormulaNotFoundException(String str) {
        super(a.q("There's no predefined TeXFormula with the name '", str, "' defined in 'PredefinedTeXFormulas.xml'!"));
    }
}
