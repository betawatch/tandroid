package org.scilab.forge.jlatexmath;

import java.util.Map;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class RotateAtom extends Atom {
    private double angle;
    private Atom base;
    private int option;
    private float x;
    private int xunit;
    private float y;
    private int yunit;

    public RotateAtom(Atom atom, String str, String str2) {
        this.option = -1;
        this.type = atom.type;
        this.base = atom;
        this.angle = Double.parseDouble(str);
        this.option = RotateBox.getOrigin(str2);
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        if (this.option != -1) {
            return new RotateBox(this.base.createBox(teXEnvironment), this.angle, this.option);
        }
        return new RotateBox(this.base.createBox(teXEnvironment), this.angle, SpaceAtom.getFactor(this.xunit, teXEnvironment) * this.x, SpaceAtom.getFactor(this.yunit, teXEnvironment) * this.y);
    }

    public RotateAtom(Atom atom, double d, String str) {
        this.option = -1;
        this.type = atom.type;
        this.base = atom;
        this.angle = d;
        Map<String, String> parseMap = ParseOption.parseMap(str);
        if (parseMap.containsKey("origin")) {
            this.option = RotateBox.getOrigin(parseMap.get("origin"));
            return;
        }
        if (parseMap.containsKey("x")) {
            float[] length = SpaceAtom.getLength(parseMap.get("x"));
            this.xunit = (int) length[0];
            this.x = length[1];
        } else {
            this.xunit = 3;
            this.x = 0.0f;
        }
        if (parseMap.containsKey("y")) {
            float[] length2 = SpaceAtom.getLength(parseMap.get("y"));
            this.yunit = (int) length2[0];
            this.y = length2[1];
        } else {
            this.yunit = 3;
            this.y = 0.0f;
        }
    }
}
