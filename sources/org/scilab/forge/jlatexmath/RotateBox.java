package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.geom.Point2D;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class RotateBox extends Box {
    public static final int BBC = 8;
    public static final int BBL = 6;
    public static final int BBR = 7;
    public static final int BC = 1;
    public static final int BL = 0;
    public static final int BR = 2;
    public static final int CC = 10;
    public static final int CL = 9;
    public static final int CR = 11;
    public static final int TC = 4;
    public static final int TL = 3;
    public static final int TR = 5;
    protected double angle;
    private Box box;
    private float shiftX;
    private float shiftY;
    private float xmax;
    private float xmin;
    private float ymax;
    private float ymin;

    public RotateBox(Box box, double d, float f10, float f11) {
        this.box = box;
        double d10 = (3.141592653589793d * d) / 180.0d;
        this.angle = d10;
        this.height = box.height;
        this.depth = box.depth;
        this.width = box.width;
        double sin = Math.sin(d10);
        double cos = Math.cos(this.angle);
        double d11 = f10;
        double d12 = 1.0d - cos;
        double d13 = f11;
        this.shiftX = (float) ((d13 * sin) + (d11 * d12));
        this.shiftY = (float) ((d13 * d12) - (d11 * sin));
        float f12 = this.height;
        float f13 = this.depth;
        float f14 = this.width;
        this.xmax = ((float) Math.max((-f12) * sin, Math.max(f13 * sin, Math.max((f13 * sin) + (f14 * cos), (f14 * cos) - (f12 * sin))))) + this.shiftX;
        float f15 = this.height;
        float f16 = this.depth;
        float f17 = this.width;
        this.xmin = ((float) Math.min((-f15) * sin, Math.min(f16 * sin, Math.min((f16 * sin) + (f17 * cos), (f17 * cos) - (f15 * sin))))) + this.shiftX;
        float f18 = this.height;
        float f19 = this.depth;
        float f20 = this.width;
        this.ymax = (float) Math.max(f18 * cos, Math.max((-f19) * cos, Math.max((f20 * sin) - (f19 * cos), (f18 * cos) + (f20 * sin))));
        float f21 = this.height;
        float f22 = this.depth;
        float f23 = this.width;
        float min = (float) Math.min(f21 * cos, Math.min((-f22) * cos, Math.min((f23 * sin) - (f22 * cos), (f21 * cos) + (f23 * sin))));
        this.ymin = min;
        this.width = this.xmax - this.xmin;
        float f24 = this.ymax;
        float f25 = this.shiftY;
        this.height = f24 + f25;
        this.depth = (-min) - f25;
    }

    private static Point2D.Float calculateShift(Box box, int i10) {
        Point2D.Float r02 = new Point2D.Float(0.0f, -box.depth);
        switch (i10) {
            case 0:
                r02.x = 0.0f;
                r02.y = -box.depth;
                break;
            case 1:
                r02.x = box.width / 2.0f;
                r02.y = -box.depth;
                break;
            case 2:
                r02.x = box.width;
                r02.y = -box.depth;
                break;
            case 3:
                r02.x = 0.0f;
                r02.y = box.height;
                break;
            case 4:
                r02.x = box.width / 2.0f;
                r02.y = box.height;
                break;
            case 5:
                r02.x = box.width;
                r02.y = box.height;
                break;
            case 6:
                r02.x = 0.0f;
                r02.y = 0.0f;
                break;
            case 7:
                r02.x = box.width;
                r02.y = 0.0f;
                break;
            case 8:
                r02.x = box.width / 2.0f;
                r02.y = 0.0f;
                break;
            case 9:
                r02.x = 0.0f;
                r02.y = (box.height - box.depth) / 2.0f;
                break;
            case 10:
                r02.x = box.width / 2.0f;
                r02.y = (box.height - box.depth) / 2.0f;
                break;
            case 11:
                r02.x = box.width;
                r02.y = (box.height - box.depth) / 2.0f;
                break;
        }
        return r02;
    }

    public static int getOrigin(String str) {
        if (str == null || str.length() == 0) {
            return 6;
        }
        if (str.length() == 1) {
            str = str.concat("c");
        }
        if (str.equals("bl") || str.equals("lb")) {
            return 0;
        }
        if (str.equals("bc") || str.equals("cb")) {
            return 1;
        }
        if (str.equals("br") || str.equals("rb")) {
            return 2;
        }
        if (str.equals("cl") || str.equals("lc")) {
            return 9;
        }
        if (str.equals("cc")) {
            return 10;
        }
        if (str.equals("cr") || str.equals("cr")) {
            return 11;
        }
        if (str.equals("tl") || str.equals("lt")) {
            return 3;
        }
        if (str.equals("tc") || str.equals("ct")) {
            return 4;
        }
        if (str.equals("tr") || str.equals("rt")) {
            return 5;
        }
        if (str.equals("Bl") || str.equals("lB")) {
            return 6;
        }
        if (str.equals("Bc") || str.equals("cB")) {
            return 8;
        }
        return (str.equals("Br") || str.equals("rB")) ? 7 : 6;
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public void draw(Graphics2D graphics2D, float f10, float f11) {
        drawDebug(graphics2D, f10, f11);
        this.box.drawDebug(graphics2D, f10, f11, true);
        float f12 = f11 - this.shiftY;
        float f13 = (this.shiftX - this.xmin) + f10;
        double d = f13;
        double d10 = f12;
        graphics2D.rotate(-this.angle, d, d10);
        this.box.draw(graphics2D, f13, f12);
        this.box.drawDebug(graphics2D, f13, f12, true);
        graphics2D.rotate(this.angle, d, d10);
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public int getLastFontId() {
        return this.box.getLastFontId();
    }

    public RotateBox(Box box, double d, Point2D.Float r10) {
        this(box, d, r10.x, r10.y);
    }

    public RotateBox(Box box, double d, int i10) {
        this(box, d, calculateShift(box, i10));
    }
}
