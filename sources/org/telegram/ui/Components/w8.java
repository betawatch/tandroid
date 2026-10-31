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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w8 extends Drawable {
    public final View a;
    public final int b;
    public boolean d;
    public final int e;
    public final int f;
    public final float g;
    public final fe.k c = new fe.k(new n2.u(this, 9), gr.h, 380);
    public final ArrayList h = new ArrayList();
    public int i = org.telegram.messenger.zs.e4;

    public w8(int i10, View view, int i11, int i12, float f7) {
        this.b = i10;
        this.a = view;
        this.e = i11;
        this.f = i12;
        this.g = f7;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v8 v8Var = (v8) obj;
            if (v8Var.c != 0 && !v8Var.d) {
                v8Var.d = true;
                v8Var.a.P();
            }
        }
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                v8 v8Var = (v8) obj;
                if (v8Var.d) {
                    v8Var.d = false;
                    v8Var.a.R();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.i == 0) {
            return;
        }
        float f7 = bounds.left;
        float f10 = bounds.top;
        fe.k kVar = this.c;
        canvas.saveLayer(f7, f10, f7 + kVar.d.f.a, f10 + this.e, null);
        for (int size = kVar.b.size() - 1; size >= 0; size--) {
            fe.h m10 = kVar.m(size);
            RectF b10 = m10.b();
            Object obj = m10.a;
            float f11 = m10.f.a;
            float c10 = m10.c();
            float f12 = b10.left + f11;
            float width = b10.width() - f11;
            float f13 = f7 + f12;
            float f14 = width / 2.0f;
            float f15 = f13 + f14;
            float f16 = f10 + f14;
            canvas.save();
            canvas.scale(c10, c10, f15, f16);
            canvas.drawCircle(f15, f16, f14 + this.g, org.telegram.ui.ActionBar.t6.Cm);
            v8 v8Var = (v8) obj;
            v8Var.a.y0(f13, f10, width, width);
            v8Var.a.setAlpha((this.i / 255.0f) * m10.c());
            v8Var.a.h(canvas, null);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void d(List list, boolean z10) {
        v8 v8Var;
        fe.k kVar = this.c;
        if (list == null || list.isEmpty()) {
            kVar.q(null, z10);
            return;
        }
        if (!z10) {
            kVar.q(null, false);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long o10 = org.telegram.messenger.o5.o((TLRPC.Peer) it.next());
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    v8Var = null;
                    break;
                }
                Object obj = arrayList2.get(i10);
                i10++;
                v8Var = (v8) obj;
                if (v8Var.c == o10) {
                    break;
                }
            }
            if (v8Var == null) {
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        v8Var = null;
                        break;
                    }
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    v8Var = (v8) obj2;
                    if (v8Var.c == 0) {
                        break;
                    }
                }
            }
            if (v8Var == null) {
                v8Var = new v8(this, this.a);
                arrayList2.add(v8Var);
            }
            v8 v8Var2 = v8Var;
            ImageReceiver imageReceiver = v8Var2.a;
            r8 r8Var = v8Var2.b;
            if (v8Var2.c != o10) {
                v8Var2.c = o10;
                TLObject d22 = org.telegram.messenger.vp.r1(this.b).d2(o10);
                if (d22 != null) {
                    r8Var.p(d22);
                    imageReceiver.i0(d22, r8Var, null);
                } else {
                    r8Var.k(o10, "", "", null);
                    imageReceiver.f();
                }
            }
            arrayList.add(v8Var2);
            if (this.d && !v8Var2.d) {
                v8Var2.d = true;
                imageReceiver.P();
            }
        }
        kVar.q(arrayList, z10);
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
    public final void setAlpha(int i10) {
        this.i = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
