package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gw0 extends Drawable {
    public final int a;
    public final int b;
    public final f5[] c;
    public final boolean e;
    public int d = org.telegram.messenger.zs.e4;
    public final RectF f = new RectF();
    public boolean g = false;

    public gw0(int i10, ArrayList arrayList, boolean z10) {
        this.e = z10;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.a = max;
        int min = Math.min(max * max, arrayList.size());
        this.b = min;
        this.c = new f5[min];
        if (!arrayList.isEmpty()) {
            org.telegram.messenger.jj.H2((TLRPC.Document) arrayList.get(0));
        }
        int i11 = max < 2 ? 1 : 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            this.c[i12] = f5.l(i10, i11, (TLRPC.Document) arrayList.get(i12));
        }
    }

    public final void a(org.telegram.ui.Cells.q1 q1Var) {
        for (int i10 = 0; i10 < this.b; i10++) {
            this.c[i10].n(q1Var);
        }
    }

    public final boolean b() {
        return this.g;
    }

    public final boolean c(ArrayList arrayList) {
        f5[] f5VarArr = this.c;
        if (f5VarArr.length == arrayList.size()) {
            for (int i10 = 0; i10 < f5VarArr.length; i10++) {
                TLRPC.Document document = f5VarArr[i10].e;
                if ((document == null ? 0L : document.id) == ((TLRPC.Document) arrayList.get(i10)).id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.g = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        f5 f5Var;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (org.telegram.messenger.i0.L(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (org.telegram.messenger.i0.L(48.0f) / 2.0f);
        int L = org.telegram.messenger.i0.L(48.0f);
        int i10 = this.a;
        float f7 = L / i10;
        float L2 = org.telegram.messenger.i0.L(48.0f) / i10;
        canvas.save();
        canvas.clipRect(centerX, centerY, org.telegram.messenger.i0.L(48.0f) + centerX, org.telegram.messenger.i0.L(48.0f) + centerY);
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = (i11 * i10) + i12;
                if (i13 >= 0) {
                    f5[] f5VarArr = this.c;
                    if (i13 < f5VarArr.length && (f5Var = f5VarArr[i13]) != null) {
                        f5Var.setBounds((int) ((i12 * f7) + centerX), (int) ((i11 * L2) + centerY), (int) (((i12 + 1) * f7) + centerX), (int) (((i11 + 1) * L2) + centerY));
                        f5VarArr[i13].setAlpha(this.d);
                        f5VarArr[i13].setColorFilter(this.e ? org.telegram.ui.ActionBar.t6.w3 : org.telegram.ui.ActionBar.t6.v3);
                        f5VarArr[i13].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void e() {
        this.g = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
