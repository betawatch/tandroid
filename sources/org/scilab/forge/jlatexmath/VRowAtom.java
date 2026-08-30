package org.scilab.forge.jlatexmath;

import java.util.LinkedList;
import java.util.ListIterator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class VRowAtom extends Atom {
    protected LinkedList<Atom> elements = new LinkedList<>();
    private SpaceAtom raise = new SpaceAtom(1, 0.0f, 0.0f, 0.0f);
    protected boolean addInterline = false;
    protected boolean vtop = false;
    protected int halign = 5;

    public VRowAtom() {
    }

    public final void add(Atom atom) {
        if (atom != null) {
            this.elements.add(0, atom);
        }
    }

    public final void append(Atom atom) {
        if (atom != null) {
            this.elements.add(atom);
        }
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        float depth;
        VerticalBox verticalBox = new VerticalBox();
        if (this.halign != 5) {
            LinkedList linkedList = new LinkedList();
            ListIterator<Atom> listIterator = this.elements.listIterator();
            float f10 = Float.NEGATIVE_INFINITY;
            while (listIterator.hasNext()) {
                Box createBox = listIterator.next().createBox(teXEnvironment);
                linkedList.add(createBox);
                if (f10 < createBox.getWidth()) {
                    f10 = createBox.getWidth();
                }
            }
            StrutBox strutBox = new StrutBox(0.0f, teXEnvironment.getInterline(), 0.0f, 0.0f);
            ListIterator listIterator2 = linkedList.listIterator();
            while (listIterator2.hasNext()) {
                verticalBox.add(new HorizontalBox((Box) listIterator2.next(), f10, this.halign));
                if (this.addInterline && listIterator2.hasNext()) {
                    verticalBox.add(strutBox);
                }
            }
        } else {
            StrutBox strutBox2 = new StrutBox(0.0f, teXEnvironment.getInterline(), 0.0f, 0.0f);
            ListIterator<Atom> listIterator3 = this.elements.listIterator();
            while (listIterator3.hasNext()) {
                verticalBox.add(listIterator3.next().createBox(teXEnvironment));
                if (this.addInterline && listIterator3.hasNext()) {
                    verticalBox.add(strutBox2);
                }
            }
        }
        verticalBox.setShift(-this.raise.createBox(teXEnvironment).getWidth());
        if (this.vtop) {
            depth = verticalBox.getSize() != 0 ? verticalBox.children.getFirst().getHeight() : 0.0f;
            verticalBox.setHeight(depth);
            verticalBox.setDepth((verticalBox.getHeight() + verticalBox.getDepth()) - depth);
            return verticalBox;
        }
        depth = verticalBox.getSize() != 0 ? verticalBox.children.getLast().getDepth() : 0.0f;
        verticalBox.setHeight((verticalBox.getHeight() + verticalBox.getDepth()) - depth);
        verticalBox.setDepth(depth);
        return verticalBox;
    }

    public boolean getAddInterline() {
        return this.addInterline;
    }

    public int getHalign() {
        return this.halign;
    }

    public Atom getLastAtom() {
        return this.elements.removeLast();
    }

    public boolean getVtop() {
        return this.vtop;
    }

    public void setAddInterline(boolean z4) {
        this.addInterline = z4;
    }

    public void setHalign(int i10) {
        this.halign = i10;
    }

    public void setRaise(int i10, float f10) {
        this.raise = new SpaceAtom(i10, f10, 0.0f, 0.0f);
    }

    public void setVtop(boolean z4) {
        this.vtop = z4;
    }

    public VRowAtom(Atom atom) {
        if (atom != null) {
            if (atom instanceof VRowAtom) {
                this.elements.addAll(((VRowAtom) atom).elements);
            } else {
                this.elements.add(atom);
            }
        }
    }
}
