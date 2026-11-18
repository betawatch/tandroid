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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class g9 extends Drawable {
    public final View a;
    public final int b;
    public boolean d;
    public final int e;
    public final int f;
    public final float g;
    public final te.h c = new te.h(new hi.w4(this, 29), lr.h, 380);
    public final ArrayList h = new ArrayList();
    public int i = org.telegram.messenger.ks.e4;

    public g9(int i7, View view, int i10, int i11, float f10) {
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
            f9 f9Var = (f9) obj;
            if (f9Var.c != 0 && !f9Var.d) {
                f9Var.d = true;
                f9Var.a.P();
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
                f9 f9Var = (f9) obj;
                if (f9Var.d) {
                    f9Var.d = false;
                    f9Var.a.R();
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
            canvas.drawCircle(f16, f17, f15 + this.g, org.telegram.ui.ActionBar.n6.Fm);
            f9 f9Var = (f9) obj;
            f9Var.a.y0(f14, f11, width, width);
            f9Var.a.setAlpha((this.i / 255.0f) * i7.c());
            f9Var.a.h(canvas, null);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void d(List list, boolean z10) {
        f9 f9Var;
        te.h hVar = this.c;
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
            long o4 = org.telegram.messenger.n5.o((TLRPC.Peer) it.next());
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    f9Var = null;
                    break;
                }
                Object obj = arrayList2.get(i7);
                i7++;
                f9Var = (f9) obj;
                if (f9Var.c == o4) {
                    break;
                }
            }
            if (f9Var == null) {
                int size2 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        f9Var = null;
                        break;
                    }
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    f9Var = (f9) obj2;
                    if (f9Var.c == 0) {
                        break;
                    }
                }
            }
            if (f9Var == null) {
                f9Var = new f9(this, this.a);
                arrayList2.add(f9Var);
            }
            f9 f9Var2 = f9Var;
            ImageReceiver imageReceiver = f9Var2.a;
            b9 b9Var = f9Var2.b;
            if (f9Var2.c != o4) {
                f9Var2.c = o4;
                TLObject g22 = org.telegram.messenger.mp.u1(this.b).g2(o4);
                if (g22 != null) {
                    b9Var.p(g22);
                    imageReceiver.i0(g22, b9Var, null);
                } else {
                    b9Var.k(o4, "", "", null);
                    imageReceiver.f();
                }
            }
            arrayList.add(f9Var2);
            if (this.d && !f9Var2.d) {
                f9Var2.d = true;
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
    public final void setAlpha(int i7) {
        this.i = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
