package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z8 extends Drawable {
    public final View a;
    public final int b;
    public boolean d;
    public final int e;
    public final int f;
    public final float g;
    public final qe.h c = new qe.h(new hi.d(this, 29), xq.h, 380);
    public final ArrayList h = new ArrayList();
    public int i = org.telegram.messenger.hs.e4;

    public z8(int i3, View view, int i10, int i11, float f10) {
        this.b = i3;
        this.a = view;
        this.e = i10;
        this.f = i11;
        this.g = f10;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            y8 y8Var = (y8) obj;
            if (y8Var.c != 0 && !y8Var.d) {
                y8Var.d = true;
                y8Var.a.P();
            }
        }
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                y8 y8Var = (y8) obj;
                if (y8Var.d) {
                    y8Var.d = false;
                    y8Var.a.R();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.i == 0) {
            return;
        }
        float f10 = bounds.left;
        float f11 = bounds.top;
        qe.h hVar = this.c;
        canvas.saveLayer(f10, f11, f10 + hVar.d.f.a, f11 + this.e, null);
        for (int size = hVar.b.size() - 1; size >= 0; size--) {
            qe.e i3 = hVar.i(size);
            RectF b10 = i3.b();
            Object obj = i3.a;
            float f12 = i3.f.a;
            float c2 = i3.c();
            float f13 = b10.left + f12;
            float width = b10.width() - f12;
            float f14 = f10 + f13;
            float f15 = width / 2.0f;
            float f16 = f14 + f15;
            float f17 = f11 + f15;
            canvas.save();
            canvas.scale(c2, c2, f16, f17);
            canvas.drawCircle(f16, f17, f15 + this.g, org.telegram.ui.ActionBar.k6.Cm);
            y8 y8Var = (y8) obj;
            y8Var.a.y0(f14, f11, width, width);
            y8Var.a.setAlpha((this.i / 255.0f) * i3.c());
            y8Var.a.h(canvas, null);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void d(List list, boolean z10) {
        y8 y8Var;
        qe.h hVar = this.c;
        if (list == null || list.isEmpty()) {
            hVar.m(null, z10);
            return;
        }
        if (!z10) {
            hVar.m(null, false);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long o10 = org.telegram.messenger.m5.o((TLRPC.Peer) it.next());
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    y8Var = null;
                    break;
                }
                Object obj = arrayList2.get(i3);
                i3++;
                y8Var = (y8) obj;
                if (y8Var.c == o10) {
                    break;
                }
            }
            if (y8Var == null) {
                int size2 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        y8Var = null;
                        break;
                    }
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    y8Var = (y8) obj2;
                    if (y8Var.c == 0) {
                        break;
                    }
                }
            }
            if (y8Var == null) {
                y8Var = new y8(this, this.a);
                arrayList2.add(y8Var);
            }
            y8 y8Var2 = y8Var;
            ImageReceiver imageReceiver = y8Var2.a;
            u8 u8Var = y8Var2.b;
            if (y8Var2.c != o10) {
                y8Var2.c = o10;
                TLObject e22 = org.telegram.messenger.hp.s1(this.b).e2(o10);
                if (e22 != null) {
                    u8Var.p(e22);
                    imageReceiver.i0(e22, u8Var, null);
                } else {
                    u8Var.k(o10, "", "", null);
                    imageReceiver.f();
                }
            }
            arrayList.add(y8Var2);
            if (this.d && !y8Var2.d) {
                y8Var2.d = true;
                imageReceiver.P();
            }
        }
        hVar.m(arrayList, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.i = i3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
