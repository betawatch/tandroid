package org.scilab.forge.jlatexmath;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import ru.noties.jlatexmath.awt.Graphics2D;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
class VerticalBox extends Box {
    private float leftMostPos;
    private float rightMostPos;

    public VerticalBox() {
        this.leftMostPos = Float.MAX_VALUE;
        this.rightMostPos = -3.4028235E38f;
    }

    private void recalculateWidth(Box box) {
        this.leftMostPos = Math.min(this.leftMostPos, box.shift);
        float f10 = this.rightMostPos;
        float f11 = box.shift;
        float f12 = box.width;
        if (f12 <= 0.0f) {
            f12 = 0.0f;
        }
        float max = Math.max(f10, f11 + f12);
        this.rightMostPos = max;
        this.width = max - this.leftMostPos;
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public final void add(Box box) {
        super.add(box);
        if (this.children.size() == 1) {
            this.height = box.height;
            this.depth = box.depth;
        } else {
            this.depth = box.height + box.depth + this.depth;
        }
        recalculateWidth(box);
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public void draw(Graphics2D graphics2D, float f10, float f11) {
        float f12 = f11 - this.height;
        Iterator<Box> it = this.children.iterator();
        while (it.hasNext()) {
            Box next = it.next();
            float height = next.getHeight() + f12;
            next.draw(graphics2D, (next.getShift() + f10) - this.leftMostPos, height);
            f12 = next.getDepth() + height;
        }
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public int getLastFontId() {
        LinkedList<Box> linkedList = this.children;
        ListIterator<Box> listIterator = linkedList.listIterator(linkedList.size());
        int i10 = -1;
        while (i10 == -1 && listIterator.hasPrevious()) {
            i10 = listIterator.previous().getLastFontId();
        }
        return i10;
    }

    public int getSize() {
        return this.children.size();
    }

    public VerticalBox(Box box, float f10, int i10) {
        this();
        add(box);
        if (i10 == 2) {
            float f11 = f10 / 2.0f;
            StrutBox strutBox = new StrutBox(0.0f, f11, 0.0f, 0.0f);
            super.add(0, strutBox);
            this.height += f11;
            this.depth += f11;
            super.add(strutBox);
            return;
        }
        if (i10 == 3) {
            this.depth += f10;
            super.add(new StrutBox(0.0f, f10, 0.0f, 0.0f));
        } else if (i10 == 4) {
            this.height += f10;
            super.add(0, new StrutBox(0.0f, f10, 0.0f, 0.0f));
        }
    }

    public final void add(Box box, float f10) {
        if (this.children.size() >= 1) {
            add(new StrutBox(0.0f, f10, 0.0f, 0.0f));
        }
        add(box);
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public void add(int i10, Box box) {
        super.add(i10, box);
        if (i10 == 0) {
            this.depth = box.depth + this.height + this.depth;
            this.height = box.height;
        } else {
            this.depth = box.height + box.depth + this.depth;
        }
        recalculateWidth(box);
    }
}
