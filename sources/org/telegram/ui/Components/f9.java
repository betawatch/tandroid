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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f9 extends Drawable {
    public final View a;
    public final int b;
    public boolean d;
    public final int e;
    public final int f;
    public final float g;
    public final te.h c = new te.h(new org.telegram.ui.Cells.aa(this, 1), kr.h, 380);
    public final ArrayList h = new ArrayList();
    public int i = org.telegram.messenger.ks.e4;

    public f9(int i7, View view, int i10, int i11, float f10) {
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
            e9 e9Var = (e9) obj;
            if (e9Var.c != 0 && !e9Var.d) {
                e9Var.d = true;
                e9Var.a.Q();
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
                e9 e9Var = (e9) obj;
                if (e9Var.d) {
                    e9Var.d = false;
                    e9Var.a.S();
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
            e9 e9Var = (e9) obj;
            e9Var.a.z0(f14, f11, width, width);
            e9Var.a.setAlpha((this.i / 255.0f) * i7.c());
            e9Var.a.h(canvas, null);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void d(List list, boolean z10) {
        e9 e9Var;
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
                    e9Var = null;
                    break;
                }
                Object obj = arrayList2.get(i7);
                i7++;
                e9Var = (e9) obj;
                if (e9Var.c == o4) {
                    break;
                }
            }
            if (e9Var == null) {
                int size2 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        e9Var = null;
                        break;
                    }
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    e9Var = (e9) obj2;
                    if (e9Var.c == 0) {
                        break;
                    }
                }
            }
            if (e9Var == null) {
                e9Var = new e9(this, this.a);
                arrayList2.add(e9Var);
            }
            e9 e9Var2 = e9Var;
            ImageReceiver imageReceiver = e9Var2.a;
            a9 a9Var = e9Var2.b;
            if (e9Var2.c != o4) {
                e9Var2.c = o4;
                TLObject g22 = org.telegram.messenger.mp.u1(this.b).g2(o4);
                if (g22 != null) {
                    a9Var.p(g22);
                    imageReceiver.j0(g22, a9Var, null);
                } else {
                    a9Var.k(o4, "", "", null);
                    imageReceiver.f();
                }
            }
            arrayList.add(e9Var2);
            if (this.d && !e9Var2.d) {
                e9Var2.d = true;
                imageReceiver.Q();
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
