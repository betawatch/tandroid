package org.scilab.forge.jlatexmath;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Graphics2D;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class HorizontalBox extends Box {
    protected List<Integer> breakPositions;
    private float curPos;

    public HorizontalBox(Box box, float f10, int i9) {
        this.curPos = 0.0f;
        if (f10 == Float.POSITIVE_INFINITY) {
            add(box);
            return;
        }
        float width = f10 - box.getWidth();
        if (width <= 0.0f) {
            add(box);
            return;
        }
        if (i9 == 2 || i9 == 5) {
            StrutBox strutBox = new StrutBox(width / 2.0f, 0.0f, 0.0f, 0.0f);
            add(strutBox);
            add(box);
            add(strutBox);
            return;
        }
        if (i9 == 0) {
            add(box);
            add(new StrutBox(width, 0.0f, 0.0f, 0.0f));
        } else if (i9 != 1) {
            add(box);
        } else {
            add(new StrutBox(width, 0.0f, 0.0f, 0.0f));
            add(box);
        }
    }

    private void recalculate(Box box) {
        this.width = box.getWidth() + this.width;
        this.height = Math.max(this.children.size() == 0 ? Float.NEGATIVE_INFINITY : this.height, box.height - box.shift);
        this.depth = Math.max(this.children.size() != 0 ? this.depth : Float.NEGATIVE_INFINITY, box.depth + box.shift);
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public final void add(Box box) {
        recalculate(box);
        super.add(box);
    }

    public void addBreakPosition(int i9) {
        if (this.breakPositions == null) {
            this.breakPositions = new ArrayList();
        }
        this.breakPositions.add(Integer.valueOf(i9));
    }

    public HorizontalBox cloneBox() {
        HorizontalBox horizontalBox = new HorizontalBox(this.foreground, this.background);
        horizontalBox.shift = this.shift;
        return horizontalBox;
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public void draw(Graphics2D graphics2D, float f10, float f11) {
        startDraw(graphics2D, f10, f11);
        Iterator<Box> it = this.children.iterator();
        while (it.hasNext()) {
            Box next = it.next();
            next.draw(graphics2D, f10, next.shift + f11);
            f10 += next.getWidth();
        }
        endDraw(graphics2D);
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public int getLastFontId() {
        LinkedList<Box> linkedList = this.children;
        ListIterator<Box> listIterator = linkedList.listIterator(linkedList.size());
        int i9 = -1;
        while (i9 == -1 && listIterator.hasPrevious()) {
            i9 = listIterator.previous().getLastFontId();
        }
        return i9;
    }

    public HorizontalBox[] split(int i9) {
        return split(i9, 1);
    }

    public HorizontalBox[] splitRemove(int i9) {
        return split(i9, 2);
    }

    private HorizontalBox[] split(int i9, int i10) {
        HorizontalBox cloneBox = cloneBox();
        HorizontalBox cloneBox2 = cloneBox();
        for (int i11 = 0; i11 <= i9; i11++) {
            cloneBox.add(this.children.get(i11));
        }
        for (int i12 = i10 + i9; i12 < this.children.size(); i12++) {
            cloneBox2.add(this.children.get(i12));
        }
        if (this.breakPositions != null) {
            for (int i13 = 0; i13 < this.breakPositions.size(); i13++) {
                if (this.breakPositions.get(i13).intValue() > i9 + 1) {
                    cloneBox2.addBreakPosition((this.breakPositions.get(i13).intValue() - i9) - 1);
                }
            }
        }
        return new HorizontalBox[]{cloneBox, cloneBox2};
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public final void add(int i9, Box box) {
        recalculate(box);
        super.add(i9, box);
    }

    public HorizontalBox(Box box) {
        this.curPos = 0.0f;
        add(box);
    }

    public HorizontalBox() {
        this.curPos = 0.0f;
    }

    public HorizontalBox(Color color, Color color2) {
        super(color, color2);
        this.curPos = 0.0f;
    }
}
