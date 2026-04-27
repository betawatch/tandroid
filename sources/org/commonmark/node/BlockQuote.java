package org.commonmark.node;

/* loaded from: classes3.dex */
public class BlockQuote extends Block {
    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
