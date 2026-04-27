package io.noties.markwon.ext.latex;

import org.commonmark.node.CustomNode;

/* loaded from: classes3.dex */
public class JLatexMathNode extends CustomNode {
    private String latex;

    public String latex() {
        return this.latex;
    }

    public void latex(String str) {
        this.latex = str;
    }
}
