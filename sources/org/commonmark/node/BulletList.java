package org.commonmark.node;

/* loaded from: classes3.dex */
public class BulletList extends ListBlock {
    private char bulletMarker;

    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public char getBulletMarker() {
        return this.bulletMarker;
    }

    public void setBulletMarker(char c) {
        this.bulletMarker = c;
    }
}
