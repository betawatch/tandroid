package org.commonmark.node;

/* loaded from: classes3.dex */
public abstract class CustomBlock extends Block {
    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
