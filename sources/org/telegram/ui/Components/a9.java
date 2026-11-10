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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a9 extends Drawable {
    public final View a;
    public final int b;
    public boolean d;
    public final int e;
    public final int f;
    public final float g;
    public final te.h c = new te.h(new h9.f1(this, 28), wq.h, 380);
    public final ArrayList h = new ArrayList();
    public int i = org.telegram.messenger.qs.e4;

    public a9(int i7, View view, int i10, int i11, float f10) {
        this.b = i7;
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
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            z8 z8Var = (z8) obj;
            if (z8Var.c != 0 && !z8Var.d) {
                z8Var.d = true;
                z8Var.a.P();
            }
        }
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                z8 z8Var = (z8) obj;
                if (z8Var.d) {
                    z8Var.d = false;
                    z8Var.a.R();
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
        te.h hVar = this.c;
        canvas.saveLayer(f10, f11, f10 + hVar.d.f.a, f11 + this.e, null);
        for (int size = hVar.b.size() - 1; size >= 0; size--) {
            te.e i7 = hVar.i(size);
            RectF b10 = i7.b();
            Object obj = i7.a;
            float f12 = i7.f.a;
            float c10 = i7.c();
            float f13 = b10.left + f12;
            float width = b10.width() - f12;
            float f14 = f10 + f13;
            float f15 = width / 2.0f;
            float f16 = f14 + f15;
            float f17 = f11 + f15;
            canvas.save();
            canvas.scale(c10, c10, f16, f17);
            canvas.drawCircle(f16, f17, f15 + this.g, org.telegram.ui.ActionBar.m6.Cm);
            z8 z8Var = (z8) obj;
            z8Var.a.y0(f14, f11, width, width);
            z8Var.a.setAlpha((this.i / 255.0f) * i7.c());
            z8Var.a.h(canvas, null);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void d(List list, boolean z9) {
        z8 z8Var;
        te.h hVar = this.c;
        if (list == null || list.isEmpty()) {
            hVar.m(null, z9);
            return;
        }
        if (!z9) {
            hVar.m(null, false);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long o4 = org.telegram.messenger.m5.o((TLRPC.Peer) it.next());
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    z8Var = null;
                    break;
                }
                Object obj = arrayList2.get(i7);
                i7++;
                z8Var = (z8) obj;
                if (z8Var.c == o4) {
                    break;
                }
            }
            if (z8Var == null) {
                int size2 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        z8Var = null;
                        break;
                    }
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    z8Var = (z8) obj2;
                    if (z8Var.c == 0) {
                        break;
                    }
                }
            }
            if (z8Var == null) {
                z8Var = new z8(this, this.a);
                arrayList2.add(z8Var);
            }
            z8 z8Var2 = z8Var;
            ImageReceiver imageReceiver = z8Var2.a;
            v8 v8Var = z8Var2.b;
            if (z8Var2.c != o4) {
                z8Var2.c = o4;
                TLObject e22 = org.telegram.messenger.qp.s1(this.b).e2(o4);
                if (e22 != null) {
                    v8Var.p(e22);
                    imageReceiver.i0(e22, v8Var, null);
                } else {
                    v8Var.k(o4, "", "", null);
                    imageReceiver.f();
                }
            }
            arrayList.add(z8Var2);
            if (this.d && !z8Var2.d) {
                z8Var2.d = true;
                imageReceiver.P();
            }
        }
        hVar.m(arrayList, z9);
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
    public final void setAlpha(int i7) {
        this.i = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
