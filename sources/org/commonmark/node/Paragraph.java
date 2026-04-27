package org.commonmark.node;

/* loaded from: classes3.dex */
public class Paragraph extends Block {
    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
