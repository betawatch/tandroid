package org.telegram.ui.Components;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class tq extends Path {
    public static ArrayList g;
    public int e;
    public int f;
    public boolean b = false;
    public boolean c = true;
    public float d = 0.0f;
    public final ArrayList a = new ArrayList(1);

    public tq() {
    }

    public final void a() {
        if (Build.VERSION.SDK_INT < 34 || !this.c || this.b) {
            return;
        }
        b(this.a);
        this.b = true;
    }

    @Override // android.graphics.Path
    public final void addRect(RectF rectF, Path.Direction direction) {
        if (Build.VERSION.SDK_INT < 34 || !this.c) {
            float f7 = rectF.left;
            int i10 = this.e;
            float f10 = f7 - i10;
            float f11 = rectF.top;
            int i11 = this.f;
            super.addRect(f10, f11 - i11, rectF.right + i10, rectF.bottom + i11, direction);
            return;
        }
        ArrayList arrayList = this.a;
        if (arrayList.size() <= 0 || !((RectF) i2.g.h(1, arrayList)).contains(rectF)) {
            if (arrayList.size() <= 0 || Math.abs(rectF.top - ((RectF) i2.g.h(1, arrayList)).top) > this.d || Math.abs(rectF.bottom - ((RectF) i2.g.h(1, arrayList)).bottom) > this.d) {
                ArrayList arrayList2 = g;
                RectF rectF2 = (arrayList2 == null || arrayList2.size() <= 0) ? new RectF() : (RectF) g.remove(0);
                rectF2.set(rectF);
                arrayList.add(rectF2);
            } else {
                ((RectF) i2.g.h(1, arrayList)).union(rectF);
            }
            this.b = false;
        }
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        boolean z10 = false;
        if (list.size() == 1) {
            super.addRect(((RectF) list.get(0)).left - this.e, ((RectF) list.get(0)).top - this.f, ((RectF) list.get(0)).right + this.e, ((RectF) list.get(0)).bottom + this.f, Path.Direction.CW);
            return;
        }
        RectF rectF = (RectF) list.get(0);
        int size = list.size() - 1;
        super.moveTo(rectF.left - this.e, rectF.top - this.f);
        for (int i10 = 1; i10 < list.size(); i10++) {
            RectF rectF2 = (RectF) list.get(i10);
            if (rectF2.width() != 0.0f) {
                float f7 = rectF.bottom;
                int i11 = this.f;
                float f10 = f7 + i11;
                float f11 = rectF2.top;
                if (f10 >= f11 - i11) {
                    float f12 = rectF.left;
                    if (f12 <= rectF2.right) {
                        float f13 = rectF.right;
                        float f14 = rectF2.left;
                        if (f13 >= f14) {
                            if (f12 != f14) {
                                super.lineTo(f12 - this.e, f11);
                                super.lineTo(rectF2.left - this.e, rectF2.top);
                            }
                            rectF = rectF2;
                        }
                    }
                }
                size = i10;
                z10 = true;
                break;
            }
        }
        super.lineTo(rectF.left - this.e, rectF.bottom + this.f);
        super.lineTo(rectF.right + this.e, rectF.bottom + this.f);
        for (int i12 = size - 1; i12 >= 0; i12--) {
            RectF rectF3 = (RectF) list.get(i12);
            if (rectF3.width() != 0.0f) {
                float f15 = rectF.right;
                if (f15 != rectF3.right) {
                    super.lineTo(f15 + this.e, rectF.top);
                    super.lineTo(rectF3.right + this.e, rectF.top);
                }
                rectF = rectF3;
            }
        }
        super.lineTo(rectF.right + this.e, rectF.top - this.f);
        super.close();
        if (z10) {
            b(list.subList(size, list.size()));
        }
    }

    @Override // android.graphics.Path
    public void reset() {
        super.reset();
        if (Build.VERSION.SDK_INT < 34 || !this.c) {
            return;
        }
        ArrayList arrayList = g;
        ArrayList arrayList2 = this.a;
        if (arrayList == null) {
            g = new ArrayList(arrayList2.size());
        }
        g.addAll(arrayList2);
        arrayList2.clear();
        this.b = false;
    }

    @Override // android.graphics.Path
    public final void rewind() {
        super.rewind();
        if (Build.VERSION.SDK_INT < 34 || !this.c) {
            return;
        }
        ArrayList arrayList = g;
        ArrayList arrayList2 = this.a;
        if (arrayList == null) {
            g = new ArrayList(arrayList2.size());
        }
        g.addAll(arrayList2);
        arrayList2.clear();
        this.b = false;
    }

    public tq(int i10) {
    }

    @Override // android.graphics.Path
    public void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        RectF rectF;
        if (Build.VERSION.SDK_INT >= 34 && this.c) {
            ArrayList arrayList = this.a;
            if (arrayList.size() <= 0 || !((RectF) i2.g.h(1, arrayList)).contains(f7, f10, f11, f12)) {
                if (arrayList.size() > 0 && Math.abs(f10 - ((RectF) i2.g.h(1, arrayList)).top) <= this.d && Math.abs(f12 - ((RectF) i2.g.h(1, arrayList)).bottom) <= this.d) {
                    ((RectF) i2.g.h(1, arrayList)).union(f7, f10, f11, f12);
                } else {
                    ArrayList arrayList2 = g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        rectF = (RectF) g.remove(0);
                    } else {
                        rectF = new RectF();
                    }
                    rectF.set(f7, f10, f11, f12);
                    arrayList.add(rectF);
                }
                this.b = false;
                return;
            }
            return;
        }
        int i10 = this.e;
        float f13 = f7 - i10;
        int i11 = this.f;
        super.addRect(f13, f10 - i11, f11 + i10, f12 + i11, direction);
    }
}
