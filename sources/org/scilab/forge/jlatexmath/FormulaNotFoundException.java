package org.scilab.forge.jlatexmath;

import a4.a;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public class FormulaNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 7660105446051204466L;

    public FormulaNotFoundException(String str) {
        super(a.q("There's no predefined TeXFormula with the name '", str, "' defined in 'PredefinedTeXFormulas.xml'!"));
    }
}
