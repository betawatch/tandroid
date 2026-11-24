// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jd0 extends Drawable {
    public final View a;
    public final int b;
    public boolean d;
    public final int e;
    public final int f;
    public final float g;
    public final x66 c = new x66(new sz4(this), d53.h, 380);
    public final ArrayList h = new ArrayList();
    public int i = nm7.d4;

    public jd0(int i, View view, int i2, int i3, float f) {
        this.b = i;
        this.a = view;
        this.e = i2;
        this.f = i3;
        this.g = f;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            id0 id0Var = (id0) obj;
            if (id0Var.c != 0 && !id0Var.d) {
                id0Var.d = true;
                id0Var.a.I();
            }
        }
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                id0 id0Var = (id0) obj;
                if (id0Var.d) {
                    id0Var.d = false;
                    id0Var.a.K();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.i == 0) {
            return;
        }
        float f = bounds.left;
        float f2 = bounds.top;
        x66 x66Var = this.c;
        canvas.saveLayer(f, f2, f + x66Var.d.f.a, f2 + this.e, null);
        for (int size = x66Var.b.size() - 1; size >= 0; size--) {
            u66 i = x66Var.i(size);
            RectF b = i.b();
            Object obj = i.a;
            float f3 = i.f.a;
            float c = i.c();
            float f4 = b.left + f3;
            float width = b.width() - f3;
            float f5 = f + f4;
            float f6 = width / 2.0f;
            float f7 = f5 + f6;
            float f8 = f2 + f6;
            canvas.save();
            canvas.scale(c, c, f7, f8);
            canvas.drawCircle(f7, f8, f6 + this.g, cmb.Fm);
            id0 id0Var = (id0) obj;
            id0Var.a.i0(f5, f2, width, width);
            id0Var.a.setAlpha((this.i / 255.0f) * i.c());
            id0Var.a.h(canvas, null);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void d(List list, boolean z) {
        id0 id0Var;
        x66 x66Var = this.c;
        if (list == null || list.isEmpty()) {
            x66Var.m(null, z);
            return;
        }
        if (!z) {
            x66Var.m(null, false);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long n = pg3.n((TLRPC.Peer) it.next());
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    id0Var = null;
                    break;
                }
                Object obj = arrayList2.get(i);
                i++;
                id0Var = (id0) obj;
                if (id0Var.c == n) {
                    break;
                }
            }
            if (id0Var == null) {
                int size2 = arrayList2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        id0Var = null;
                        break;
                    }
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    id0Var = (id0) obj2;
                    if (id0Var.c == 0) {
                        break;
                    }
                }
            }
            if (id0Var == null) {
                id0Var = new id0(this, this.a);
                arrayList2.add(id0Var);
            }
            id0 id0Var2 = id0Var;
            ImageReceiver imageReceiver = id0Var2.a;
            pc0 pc0Var = id0Var2.b;
            if (id0Var2.c != n) {
                id0Var2.c = n;
                TLObject a2 = oc7.r1(this.b).a2(n);
                if (a2 != null) {
                    pc0Var.o(a2);
                    imageReceiver.U(a2, pc0Var, null);
                } else {
                    pc0Var.j(n, "", "", null);
                    imageReceiver.f();
                }
            }
            arrayList.add(id0Var2);
            if (this.d && !id0Var2.d) {
                id0Var2.d = true;
                imageReceiver.I();
            }
        }
        x66Var.m(arrayList, z);
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
    public final void setAlpha(int i) {
        this.i = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
